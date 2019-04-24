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
			i &= ~k;
		//    8   11:iload_0         
		//    9   12:iload_2         
		//   10   13:iconst_m1       
		//   11   14:ixor            
		//   12   15:iand            
		//   13   16:istore_0        
			if(j == 0)
		//*  14   17:iload_1         
		//*  15   18:ifne            27
			{
				return i | k << 2;
		//   16   21:iload_0         
		//   17   22:iload_2         
		//   18   23:iconst_2        
		//   19   24:ishl            
		//   20   25:ior             
		//   21   26:ireturn         
			} else
			{
				j = k << 1;
		//   22   27:iload_2         
		//   23   28:iconst_1        
		//   24   29:ishl            
		//   25   30:istore_1        
				return i | 0xfff3f3f3 & j | (j & 0xc0c0c) << 2;
		//   26   31:iload_0         
		//   27   32:ldc1            #60  <Int 0xfff3f3f3>
		//   28   34:iload_1         
		//   29   35:iand            
		//   30   36:ior             
		//   31   37:iload_1         
		//   32   38:ldc1            #14  <Int 0xc0c0c>
		//   33   40:iand            
		//   34   41:iconst_2        
		//   35   42:ishl            
		//   36   43:ior             
		//   37   44:ireturn         
			}
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
			int k = makeFlag(0, j | i);
		//    0    0:iconst_0        
		//    1    1:iload_1         
		//    2    2:iload_0         
		//    3    3:ior             
		//    4    4:invokestatic    #85  <Method int makeFlag(int, int)>
		//    5    7:istore_2        
			j = makeFlag(1, j);
		//    6    8:iconst_1        
		//    7    9:iload_1         
		//    8   10:invokestatic    #85  <Method int makeFlag(int, int)>
		//    9   13:istore_1        
			return makeFlag(2, i) | (j | k);
		//   10   14:iconst_2        
		//   11   15:iload_0         
		//   12   16:invokestatic    #85  <Method int makeFlag(int, int)>
		//   13   19:iload_1         
		//   14   20:iload_2         
		//   15   21:ior             
		//   16   22:ior             
		//   17   23:ireturn         
		}

		public boolean canDropOver(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public android.support.v7.widget.RecyclerView.ViewHolder chooseDropTarget(android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, int j)
		{
			int j2 = viewholder.itemView.getWidth();
		//    0    0:aload_1         
		//    1    1:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    2    4:invokevirtual   #101 <Method int View.getWidth()>
		//    3    7:istore          9
			int k2 = viewholder.itemView.getHeight();
		//    4    9:aload_1         
		//    5   10:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    6   13:invokevirtual   #104 <Method int View.getHeight()>
		//    7   16:istore          10
			int l2 = i - viewholder.itemView.getLeft();
		//    8   18:iload_3         
		//    9   19:aload_1         
		//   10   20:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   11   23:invokevirtual   #107 <Method int View.getLeft()>
		//   12   26:isub            
		//   13   27:istore          11
			int i3 = j - viewholder.itemView.getTop();
		//   14   29:iload           4
		//   15   31:aload_1         
		//   16   32:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   17   35:invokevirtual   #110 <Method int View.getTop()>
		//   18   38:isub            
		//   19   39:istore          12
			int j3 = list.size();
		//   20   41:aload_2         
		//   21   42:invokeinterface #115 <Method int List.size()>
		//   22   47:istore          13
			android.support.v7.widget.RecyclerView.ViewHolder viewholder3 = null;
		//   23   49:aconst_null     
		//   24   50:astore          16
			int l = -1;
		//   25   52:iconst_m1       
		//   26   53:istore          6
			for(int i1 = 0; i1 < j3; i1++)
		//*  27   55:iconst_0        
		//*  28   56:istore          7
		//*  29   58:iload           7
		//*  30   60:iload           13
		//*  31   62:icmpge          471
			{
				android.support.v7.widget.RecyclerView.ViewHolder viewholder1 = (android.support.v7.widget.RecyclerView.ViewHolder)list.get(i1);
		//   32   65:aload_2         
		//   33   66:iload           7
		//   34   68:invokeinterface #119 <Method Object List.get(int)>
		//   35   73:checkcast       #91  <Class android.support.v7.widget.RecyclerView$ViewHolder>
		//   36   76:astore          14
				android.support.v7.widget.RecyclerView.ViewHolder viewholder2 = viewholder3;
		//   37   78:aload           16
		//   38   80:astore          15
				int k = l;
		//   39   82:iload           6
		//   40   84:istore          5
				if(l2 > 0)
		//*  41   86:iload           11
		//*  42   88:ifle            175
				{
					int j1 = viewholder1.itemView.getRight() - (i + j2);
		//   43   91:aload           14
		//   44   93:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   45   96:invokevirtual   #122 <Method int View.getRight()>
		//   46   99:iload_3         
		//   47  100:iload           9
		//   48  102:iadd            
		//   49  103:isub            
		//   50  104:istore          8
					viewholder2 = viewholder3;
		//   51  106:aload           16
		//   52  108:astore          15
					k = l;
		//   53  110:iload           6
		//   54  112:istore          5
					if(j1 < 0)
		//*  55  114:iload           8
		//*  56  116:ifge            175
					{
						viewholder2 = viewholder3;
		//   57  119:aload           16
		//   58  121:astore          15
						k = l;
		//   59  123:iload           6
		//   60  125:istore          5
						if(viewholder1.itemView.getRight() > viewholder.itemView.getRight())
		//*  61  127:aload           14
		//*  62  129:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  63  132:invokevirtual   #122 <Method int View.getRight()>
		//*  64  135:aload_1         
		//*  65  136:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  66  139:invokevirtual   #122 <Method int View.getRight()>
		//*  67  142:icmple          175
						{
							j1 = Math.abs(j1);
		//   68  145:iload           8
		//   69  147:invokestatic    #127 <Method int Math.abs(int)>
		//   70  150:istore          8
							viewholder2 = viewholder3;
		//   71  152:aload           16
		//   72  154:astore          15
							k = l;
		//   73  156:iload           6
		//   74  158:istore          5
							if(j1 > l)
		//*  75  160:iload           8
		//*  76  162:iload           6
		//*  77  164:icmple          175
							{
								viewholder2 = viewholder1;
		//   78  167:aload           14
		//   79  169:astore          15
								k = j1;
		//   80  171:iload           8
		//   81  173:istore          5
							}
						}
					}
				}
				viewholder3 = viewholder2;
		//   82  175:aload           15
		//   83  177:astore          16
				l = k;
		//   84  179:iload           5
		//   85  181:istore          6
				if(l2 < 0)
		//*  86  183:iload           11
		//*  87  185:ifge            269
				{
					int k1 = viewholder1.itemView.getLeft() - i;
		//   88  188:aload           14
		//   89  190:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   90  193:invokevirtual   #107 <Method int View.getLeft()>
		//   91  196:iload_3         
		//   92  197:isub            
		//   93  198:istore          8
					viewholder3 = viewholder2;
		//   94  200:aload           15
		//   95  202:astore          16
					l = k;
		//   96  204:iload           5
		//   97  206:istore          6
					if(k1 > 0)
		//*  98  208:iload           8
		//*  99  210:ifle            269
					{
						viewholder3 = viewholder2;
		//  100  213:aload           15
		//  101  215:astore          16
						l = k;
		//  102  217:iload           5
		//  103  219:istore          6
						if(viewholder1.itemView.getLeft() < viewholder.itemView.getLeft())
		//* 104  221:aload           14
		//* 105  223:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 106  226:invokevirtual   #107 <Method int View.getLeft()>
		//* 107  229:aload_1         
		//* 108  230:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 109  233:invokevirtual   #107 <Method int View.getLeft()>
		//* 110  236:icmpge          269
						{
							k1 = Math.abs(k1);
		//  111  239:iload           8
		//  112  241:invokestatic    #127 <Method int Math.abs(int)>
		//  113  244:istore          8
							viewholder3 = viewholder2;
		//  114  246:aload           15
		//  115  248:astore          16
							l = k;
		//  116  250:iload           5
		//  117  252:istore          6
							if(k1 > k)
		//* 118  254:iload           8
		//* 119  256:iload           5
		//* 120  258:icmple          269
							{
								viewholder3 = viewholder1;
		//  121  261:aload           14
		//  122  263:astore          16
								l = k1;
		//  123  265:iload           8
		//  124  267:istore          6
							}
						}
					}
				}
				viewholder2 = viewholder3;
		//  125  269:aload           16
		//  126  271:astore          15
				k = l;
		//  127  273:iload           6
		//  128  275:istore          5
				if(i3 < 0)
		//* 129  277:iload           12
		//* 130  279:ifge            364
				{
					int l1 = viewholder1.itemView.getTop() - j;
		//  131  282:aload           14
		//  132  284:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  133  287:invokevirtual   #110 <Method int View.getTop()>
		//  134  290:iload           4
		//  135  292:isub            
		//  136  293:istore          8
					viewholder2 = viewholder3;
		//  137  295:aload           16
		//  138  297:astore          15
					k = l;
		//  139  299:iload           6
		//  140  301:istore          5
					if(l1 > 0)
		//* 141  303:iload           8
		//* 142  305:ifle            364
					{
						viewholder2 = viewholder3;
		//  143  308:aload           16
		//  144  310:astore          15
						k = l;
		//  145  312:iload           6
		//  146  314:istore          5
						if(viewholder1.itemView.getTop() < viewholder.itemView.getTop())
		//* 147  316:aload           14
		//* 148  318:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 149  321:invokevirtual   #110 <Method int View.getTop()>
		//* 150  324:aload_1         
		//* 151  325:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 152  328:invokevirtual   #110 <Method int View.getTop()>
		//* 153  331:icmpge          364
						{
							l1 = Math.abs(l1);
		//  154  334:iload           8
		//  155  336:invokestatic    #127 <Method int Math.abs(int)>
		//  156  339:istore          8
							viewholder2 = viewholder3;
		//  157  341:aload           16
		//  158  343:astore          15
							k = l;
		//  159  345:iload           6
		//  160  347:istore          5
							if(l1 > l)
		//* 161  349:iload           8
		//* 162  351:iload           6
		//* 163  353:icmple          364
							{
								viewholder2 = viewholder1;
		//  164  356:aload           14
		//  165  358:astore          15
								k = l1;
		//  166  360:iload           8
		//  167  362:istore          5
							}
						}
					}
				}
				viewholder3 = viewholder2;
		//  168  364:aload           15
		//  169  366:astore          16
				l = k;
		//  170  368:iload           5
		//  171  370:istore          6
				if(i3 <= 0)
					continue;
		//  172  372:iload           12
		//  173  374:ifle            462
				int i2 = viewholder1.itemView.getBottom() - (j + k2);
		//  174  377:aload           14
		//  175  379:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  176  382:invokevirtual   #130 <Method int View.getBottom()>
		//  177  385:iload           4
		//  178  387:iload           10
		//  179  389:iadd            
		//  180  390:isub            
		//  181  391:istore          8
				viewholder3 = viewholder2;
		//  182  393:aload           15
		//  183  395:astore          16
				l = k;
		//  184  397:iload           5
		//  185  399:istore          6
				if(i2 >= 0)
					continue;
		//  186  401:iload           8
		//  187  403:ifge            462
				viewholder3 = viewholder2;
		//  188  406:aload           15
		//  189  408:astore          16
				l = k;
		//  190  410:iload           5
		//  191  412:istore          6
				if(viewholder1.itemView.getBottom() <= viewholder.itemView.getBottom())
					continue;
		//  192  414:aload           14
		//  193  416:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  194  419:invokevirtual   #130 <Method int View.getBottom()>
		//  195  422:aload_1         
		//  196  423:getfield        #95  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  197  426:invokevirtual   #130 <Method int View.getBottom()>
		//  198  429:icmple          462
				i2 = Math.abs(i2);
		//  199  432:iload           8
		//  200  434:invokestatic    #127 <Method int Math.abs(int)>
		//  201  437:istore          8
				viewholder3 = viewholder2;
		//  202  439:aload           15
		//  203  441:astore          16
				l = k;
		//  204  443:iload           5
		//  205  445:istore          6
				if(i2 > k)
		//* 206  447:iload           8
		//* 207  449:iload           5
		//* 208  451:icmple          462
				{
					l = i2;
		//  209  454:iload           8
		//  210  456:istore          6
					viewholder3 = viewholder1;
		//  211  458:aload           14
		//  212  460:astore          16
				}
			}

		//  213  462:iload           7
		//  214  464:iconst_1        
		//  215  465:iadd            
		//  216  466:istore          7
		//* 217  468:goto            58
			return viewholder3;
		//  218  471:aload           16
		//  219  473:areturn         
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
			i &= ~k;
		//    8   11:iload_1         
		//    9   12:iload_3         
		//   10   13:iconst_m1       
		//   11   14:ixor            
		//   12   15:iand            
		//   13   16:istore_1        
			if(j == 0)
		//*  14   17:iload_2         
		//*  15   18:ifne            27
			{
				return i | k >> 2;
		//   16   21:iload_1         
		//   17   22:iload_3         
		//   18   23:iconst_2        
		//   19   24:ishr            
		//   20   25:ior             
		//   21   26:ireturn         
			} else
			{
				j = k >> 1;
		//   22   27:iload_3         
		//   23   28:iconst_1        
		//   24   29:ishr            
		//   25   30:istore_2        
				return i | 0xffcfcfcf & j | (j & 0x303030) >> 2;
		//   26   31:iload_1         
		//   27   32:ldc1            #141 <Int 0xffcfcfcf>
		//   28   34:iload_2         
		//   29   35:iand            
		//   30   36:ior             
		//   31   37:iload_2         
		//   32   38:ldc1            #24  <Int 0x303030>
		//   33   40:iand            
		//   34   41:iconst_2        
		//   35   42:ishr            
		//   36   43:ior             
		//   37   44:ireturn         
			}
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
			k = getMaxDragScroll(recyclerview);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #192 <Method int getMaxDragScroll(RecyclerView)>
		//    3    5:istore          4
			int i1 = Math.abs(j);
		//    4    7:iload_3         
		//    5    8:invokestatic    #127 <Method int Math.abs(int)>
		//    6   11:istore          9
			int j1 = (int)Math.signum(j);
		//    7   13:iload_3         
		//    8   14:i2f             
		//    9   15:invokestatic    #195 <Method float Math.signum(float)>
		//   10   18:f2i             
		//   11   19:istore          10
			float f1 = i1;
		//   12   21:iload           9
		//   13   23:i2f             
		//   14   24:fstore          8
			float f = 1.0F;
		//   15   26:fconst_1        
		//   16   27:fstore          7
			f1 = Math.min(1.0F, (f1 * 1.0F) / (float)i);
		//   17   29:fconst_1        
		//   18   30:fload           8
		//   19   32:fconst_1        
		//   20   33:fmul            
		//   21   34:iload_2         
		//   22   35:i2f             
		//   23   36:fdiv            
		//   24   37:invokestatic    #199 <Method float Math.min(float, float)>
		//   25   40:fstore          8
			i = (int)((float)(j1 * k) * sDragViewScrollCapInterpolator.getInterpolation(f1));
		//   26   42:iload           10
		//   27   44:iload           4
		//   28   46:imul            
		//   29   47:i2f             
		//   30   48:getstatic       #40  <Field Interpolator sDragViewScrollCapInterpolator>
		//   31   51:fload           8
		//   32   53:invokeinterface #204 <Method float Interpolator.getInterpolation(float)>
		//   33   58:fmul            
		//   34   59:f2i             
		//   35   60:istore_2        
			if(l <= 2000L)
		//*  36   61:lload           5
		//*  37   63:ldc2w           #21  <Long 2000L>
		//*  38   66:lcmp            
		//*  39   67:ifle            73
		//*  40   70:goto            81
				f = (float)l / 2000F;
		//   41   73:lload           5
		//   42   75:l2f             
		//   43   76:ldc1            #205 <Float 2000F>
		//   44   78:fdiv            
		//   45   79:fstore          7
			i = (int)((float)i * sDragScrollInterpolator.getInterpolation(f));
		//   46   81:iload_2         
		//   47   82:i2f             
		//   48   83:getstatic       #37  <Field Interpolator sDragScrollInterpolator>
		//   49   86:fload           7
		//   50   88:invokeinterface #204 <Method float Interpolator.getInterpolation(float)>
		//   51   93:fmul            
		//   52   94:f2i             
		//   53   95:istore_2        
			if(i == 0)
		//*  54   96:iload_2         
		//*  55   97:ifne            108
				return j <= 0 ? -1 : 1;
		//   56  100:iload_3         
		//   57  101:ifle            106
		//   58  104:iconst_1        
		//   59  105:ireturn         
		//   60  106:iconst_m1       
		//   61  107:ireturn         
			else
				return i;
		//   62  108:iload_2         
		//   63  109:ireturn         
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
			int l = list.size();
		//    0    0:aload           4
		//    1    2:invokeinterface #115 <Method int List.size()>
		//    2    7:istore          10
			boolean flag1 = false;
		//    3    9:iconst_0        
		//    4   10:istore          9
			for(int j = 0; j < l; j++)
		//*   5   12:iconst_0        
		//*   6   13:istore          8
		//*   7   15:iload           8
		//*   8   17:iload           10
		//*   9   19:icmpge          84
			{
				RecoverAnimation recoveranimation = (RecoverAnimation)list.get(j);
		//   10   22:aload           4
		//   11   24:iload           8
		//   12   26:invokeinterface #119 <Method Object List.get(int)>
		//   13   31:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
		//   14   34:astore          12
				int i1 = canvas.save();
		//   15   36:aload_1         
		//   16   37:invokevirtual   #229 <Method int Canvas.save()>
		//   17   40:istore          11
				onChildDrawOver(canvas, recyclerview, recoveranimation.mViewHolder, recoveranimation.mX, recoveranimation.mY, recoveranimation.mActionState, false);
		//   18   42:aload_0         
		//   19   43:aload_1         
		//   20   44:aload_2         
		//   21   45:aload           12
		//   22   47:getfield        #233 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   23   50:aload           12
		//   24   52:getfield        #237 <Field float ItemTouchHelper$RecoverAnimation.mX>
		//   25   55:aload           12
		//   26   57:getfield        #240 <Field float ItemTouchHelper$RecoverAnimation.mY>
		//   27   60:aload           12
		//   28   62:getfield        #243 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
		//   29   65:iconst_0        
		//   30   66:invokevirtual   #252 <Method void onChildDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(i1);
		//   31   69:aload_1         
		//   32   70:iload           11
		//   33   72:invokevirtual   #249 <Method void Canvas.restoreToCount(int)>
			}

		//   34   75:iload           8
		//   35   77:iconst_1        
		//   36   78:iadd            
		//   37   79:istore          8
		//*  38   81:goto            15
			if(viewholder != null)
		//*  39   84:aload_3         
		//*  40   85:ifnull          114
			{
				int k = canvas.save();
		//   41   88:aload_1         
		//   42   89:invokevirtual   #229 <Method int Canvas.save()>
		//   43   92:istore          8
				onChildDrawOver(canvas, recyclerview, viewholder, f, f1, i, true);
		//   44   94:aload_0         
		//   45   95:aload_1         
		//   46   96:aload_2         
		//   47   97:aload_3         
		//   48   98:fload           6
		//   49  100:fload           7
		//   50  102:iload           5
		//   51  104:iconst_1        
		//   52  105:invokevirtual   #252 <Method void onChildDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(k);
		//   53  108:aload_1         
		//   54  109:iload           8
		//   55  111:invokevirtual   #249 <Method void Canvas.restoreToCount(int)>
			}
			i = l - 1;
		//   56  114:iload           10
		//   57  116:iconst_1        
		//   58  117:isub            
		//   59  118:istore          5
			boolean flag = flag1;
		//   60  120:iload           9
		//   61  122:istore          8
			for(; i >= 0; i--)
		//*  62  124:iload           5
		//*  63  126:iflt            188
			{
				canvas = ((Canvas) ((RecoverAnimation)list.get(i)));
		//   64  129:aload           4
		//   65  131:iload           5
		//   66  133:invokeinterface #119 <Method Object List.get(int)>
		//   67  138:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
		//   68  141:astore_1        
				if(((RecoverAnimation) (canvas)).mEnded && !((RecoverAnimation) (canvas)).mIsPendingCleanup)
		//*  69  142:aload_1         
		//*  70  143:getfield        #256 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
		//*  71  146:ifeq            169
		//*  72  149:aload_1         
		//*  73  150:getfield        #259 <Field boolean ItemTouchHelper$RecoverAnimation.mIsPendingCleanup>
		//*  74  153:ifne            169
				{
					list.remove(i);
		//   75  156:aload           4
		//   76  158:iload           5
		//   77  160:invokeinterface #262 <Method Object List.remove(int)>
		//   78  165:pop             
					continue;
		//   79  166:goto            179
				}
				if(!((RecoverAnimation) (canvas)).mEnded)
		//*  80  169:aload_1         
		//*  81  170:getfield        #256 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
		//*  82  173:ifne            179
					flag = true;
		//   83  176:iconst_1        
		//   84  177:istore          8
			}

		//   85  179:iload           5
		//   86  181:iconst_1        
		//   87  182:isub            
		//   88  183:istore          5
		//*  89  185:goto            124
			if(flag)
		//*  90  188:iload           8
		//*  91  190:ifeq            197
				recyclerview.invalidate();
		//   92  193:aload_2         
		//   93  194:invokevirtual   #265 <Method void RecyclerView.invalidate()>
		//   94  197:return          
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
				return;
		//   15   37:return          
			}
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
		//*  44  102:ifeq            156
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
		//*  64  147:icmplt          156
					recyclerview.scrollToPosition(j);
		//   65  150:aload_1         
		//   66  151:iload           5
		//   67  153:invokevirtual   #292 <Method void RecyclerView.scrollToPosition(int)>
			}
		//   68  156:return          
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
				return f * f * f * f * f + 1.0F;
			//    4    4:fload_1         
			//    5    5:fload_1         
			//    6    6:fmul            
			//    7    7:fload_1         
			//    8    8:fmul            
			//    9    9:fload_1         
			//   10   10:fmul            
			//   11   11:fload_1         
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

		void doNotReactToLongPress()
		{
			mShouldReactToLongPress = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #20  <Field boolean mShouldReactToLongPress>
		//    3    5:return          
		}

		public boolean onDown(MotionEvent motionevent)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void onLongPress(MotionEvent motionevent)
		{
			if(!mShouldReactToLongPress)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field boolean mShouldReactToLongPress>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			Object obj = ((Object) (findChildView(motionevent)));
		//    4    8:aload_0         
		//    5    9:getfield        #15  <Field ItemTouchHelper this$0>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #30  <Method View ItemTouchHelper.findChildView(MotionEvent)>
		//    8   16:astore          5
			if(obj != null)
		//*   9   18:aload           5
		//*  10   20:ifnull          164
			{
				obj = ((Object) (mRecyclerView.getChildViewHolder(((View) (obj)))));
		//   11   23:aload_0         
		//   12   24:getfield        #15  <Field ItemTouchHelper this$0>
		//   13   27:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   14   30:aload           5
		//   15   32:invokevirtual   #40  <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
		//   16   35:astore          5
				if(obj != null)
		//*  17   37:aload           5
		//*  18   39:ifnull          164
				{
					if(!mCallback.hasDragFlag(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
		//*  19   42:aload_0         
		//*  20   43:getfield        #15  <Field ItemTouchHelper this$0>
		//*  21   46:getfield        #44  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//*  22   49:aload_0         
		//*  23   50:getfield        #15  <Field ItemTouchHelper this$0>
		//*  24   53:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//*  25   56:aload           5
		//*  26   58:invokevirtual   #50  <Method boolean ItemTouchHelper$Callback.hasDragFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//*  27   61:ifne            65
						return;
		//   28   64:return          
					if(motionevent.getPointerId(0) == mActivePointerId)
		//*  29   65:aload_1         
		//*  30   66:iconst_0        
		//*  31   67:invokevirtual   #56  <Method int MotionEvent.getPointerId(int)>
		//*  32   70:aload_0         
		//*  33   71:getfield        #15  <Field ItemTouchHelper this$0>
		//*  34   74:getfield        #60  <Field int ItemTouchHelper.mActivePointerId>
		//*  35   77:icmpne          164
					{
						int i = motionevent.findPointerIndex(mActivePointerId);
		//   36   80:aload_1         
		//   37   81:aload_0         
		//   38   82:getfield        #15  <Field ItemTouchHelper this$0>
		//   39   85:getfield        #60  <Field int ItemTouchHelper.mActivePointerId>
		//   40   88:invokevirtual   #63  <Method int MotionEvent.findPointerIndex(int)>
		//   41   91:istore          4
						float f = motionevent.getX(i);
		//   42   93:aload_1         
		//   43   94:iload           4
		//   44   96:invokevirtual   #67  <Method float MotionEvent.getX(int)>
		//   45   99:fstore_2        
						float f1 = motionevent.getY(i);
		//   46  100:aload_1         
		//   47  101:iload           4
		//   48  103:invokevirtual   #70  <Method float MotionEvent.getY(int)>
		//   49  106:fstore_3        
						mInitialTouchX = f;
		//   50  107:aload_0         
		//   51  108:getfield        #15  <Field ItemTouchHelper this$0>
		//   52  111:fload_2         
		//   53  112:putfield        #74  <Field float ItemTouchHelper.mInitialTouchX>
						mInitialTouchY = f1;
		//   54  115:aload_0         
		//   55  116:getfield        #15  <Field ItemTouchHelper this$0>
		//   56  119:fload_3         
		//   57  120:putfield        #77  <Field float ItemTouchHelper.mInitialTouchY>
						motionevent = ((MotionEvent) (ItemTouchHelper.this));
		//   58  123:aload_0         
		//   59  124:getfield        #15  <Field ItemTouchHelper this$0>
		//   60  127:astore_1        
						mDy = 0.0F;
		//   61  128:aload_0         
		//   62  129:getfield        #15  <Field ItemTouchHelper this$0>
		//   63  132:fconst_0        
		//   64  133:putfield        #80  <Field float ItemTouchHelper.mDy>
						motionevent.mDx = 0.0F;
		//   65  136:aload_1         
		//   66  137:fconst_0        
		//   67  138:putfield        #83  <Field float ItemTouchHelper.mDx>
						if(mCallback.isLongPressDragEnabled())
		//*  68  141:aload_0         
		//*  69  142:getfield        #15  <Field ItemTouchHelper this$0>
		//*  70  145:getfield        #44  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//*  71  148:invokevirtual   #87  <Method boolean ItemTouchHelper$Callback.isLongPressDragEnabled()>
		//*  72  151:ifeq            164
							select(((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), 2);
		//   73  154:aload_0         
		//   74  155:getfield        #15  <Field ItemTouchHelper this$0>
		//   75  158:aload           5
		//   76  160:iconst_2        
		//   77  161:invokevirtual   #91  <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
					}
				}
			}
		//   78  164:return          
		}

		private boolean mShouldReactToLongPress;
		final ItemTouchHelper this$0;

		ItemTouchHelperGestureListener()
		{
			this$0 = ItemTouchHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ItemTouchHelper this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
			mShouldReactToLongPress = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #20  <Field boolean mShouldReactToLongPress>
		//    8   14:return          
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
		//*   5    9:ifne            29
				mX = mViewHolder.itemView.getTranslationX();
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//    9   17:getfield        #74  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   10   20:invokevirtual   #116 <Method float View.getTranslationX()>
		//   11   23:putfield        #118 <Field float mX>
			else
		//*  12   26:goto            52
				mX = mStartDx + mFraction * (mTargetX - mStartDx);
		//   13   29:aload_0         
		//   14   30:aload_0         
		//   15   31:getfield        #47  <Field float mStartDx>
		//   16   34:aload_0         
		//   17   35:getfield        #106 <Field float mFraction>
		//   18   38:aload_0         
		//   19   39:getfield        #51  <Field float mTargetX>
		//   20   42:aload_0         
		//   21   43:getfield        #47  <Field float mStartDx>
		//   22   46:fsub            
		//   23   47:fmul            
		//   24   48:fadd            
		//   25   49:putfield        #118 <Field float mX>
			if(mStartDy == mTargetY)
		//*  26   52:aload_0         
		//*  27   53:getfield        #49  <Field float mStartDy>
		//*  28   56:aload_0         
		//*  29   57:getfield        #53  <Field float mTargetY>
		//*  30   60:fcmpl           
		//*  31   61:ifne            79
			{
				mY = mViewHolder.itemView.getTranslationY();
		//   32   64:aload_0         
		//   33   65:aload_0         
		//   34   66:getfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//   35   69:getfield        #74  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   36   72:invokevirtual   #121 <Method float View.getTranslationY()>
		//   37   75:putfield        #123 <Field float mY>
				return;
		//   38   78:return          
			} else
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
	//    1    1:invokespecial   #128 <Method void android.support.v7.widget.RecyclerView$ItemDecoration()>
	//    2    4:aload_0         
	//    3    5:new             #130 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #131 <Method void ArrayList()>
	//    6   12:putfield        #133 <Field List mPendingCleanup>
	//    7   15:aload_0         
	//    8   16:iconst_2        
	//    9   17:newarray        float[]
	//   10   19:putfield        #135 <Field float[] mTmpPosition>
		mSelected = null;
	//   11   22:aload_0         
	//   12   23:aconst_null     
	//   13   24:putfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
		mActivePointerId = -1;
	//   14   27:aload_0         
	//   15   28:iconst_m1       
	//   16   29:putfield        #139 <Field int mActivePointerId>
		mActionState = 0;
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:putfield        #141 <Field int mActionState>
		mRecoverAnimations = ((List) (new ArrayList()));
	//   20   37:aload_0         
	//   21   38:new             #130 <Class ArrayList>
	//   22   41:dup             
	//   23   42:invokespecial   #131 <Method void ArrayList()>
	//   24   45:putfield        #143 <Field List mRecoverAnimations>
	//   25   48:aload_0         
	//   26   49:new             #8   <Class ItemTouchHelper$1>
	//   27   52:dup             
	//   28   53:aload_0         
	//   29   54:invokespecial   #146 <Method void ItemTouchHelper$1(ItemTouchHelper)>
	//   30   57:putfield        #148 <Field Runnable mScrollRunnable>
		mChildDrawingOrderCallback = null;
	//   31   60:aload_0         
	//   32   61:aconst_null     
	//   33   62:putfield        #150 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
		mOverdrawChild = null;
	//   34   65:aload_0         
	//   35   66:aconst_null     
	//   36   67:putfield        #152 <Field View mOverdrawChild>
		mOverdrawChildPosition = -1;
	//   37   70:aload_0         
	//   38   71:iconst_m1       
	//   39   72:putfield        #154 <Field int mOverdrawChildPosition>
	//   40   75:aload_0         
	//   41   76:new             #10  <Class ItemTouchHelper$2>
	//   42   79:dup             
	//   43   80:aload_0         
	//   44   81:invokespecial   #155 <Method void ItemTouchHelper$2(ItemTouchHelper)>
	//   45   84:putfield        #157 <Field android.support.v7.widget.RecyclerView$OnItemTouchListener mOnItemTouchListener>
		mCallback = callback;
	//   46   87:aload_0         
	//   47   88:aload_1         
	//   48   89:putfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   49   92:return          
	}

	private void addChildDrawingOrderCallback()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          9
			return;
	//    3    8:return          
		if(mChildDrawingOrderCallback == null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #150 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
	//*   6   13:ifnonnull       28
			mChildDrawingOrderCallback = new android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback() {

				public int onGetChildDrawingOrder(int i, int j)
				{
					if(mOverdrawChild == null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field ItemTouchHelper this$0>
				//*   2    4:getfield        #26  <Field View ItemTouchHelper.mOverdrawChild>
				//*   3    7:ifnonnull       12
						return j;
				//    4   10:iload_2         
				//    5   11:ireturn         
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
					if(j < k)
				//*  34   65:iload_2         
				//*  35   66:iload_3         
				//*  36   67:icmpge          72
						return j;
				//   37   70:iload_2         
				//   38   71:ireturn         
					else
						return j + 1;
				//   39   72:iload_2         
				//   40   73:iconst_1        
				//   41   74:iadd            
				//   42   75:ireturn         
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
	//   11   22:invokespecial   #167 <Method void ItemTouchHelper$5(ItemTouchHelper)>
	//   12   25:putfield        #150 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
		mRecyclerView.setChildDrawingOrderCallback(mChildDrawingOrderCallback);
	//   13   28:aload_0         
	//   14   29:getfield        #169 <Field RecyclerView mRecyclerView>
	//   15   32:aload_0         
	//   16   33:getfield        #150 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
	//   17   36:invokevirtual   #175 <Method void RecyclerView.setChildDrawingOrderCallback(android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback)>
	//   18   39:return          
	}

	private int checkHorizontalSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		if((i & 0xc) != 0)
	//*   0    0:iload_2         
	//*   1    1:bipush          12
	//*   2    3:iand            
	//*   3    4:ifeq            198
		{
			float f = mDx;
	//    4    7:aload_0         
	//    5    8:getfield        #179 <Field float mDx>
	//    6   11:fstore_3        
			byte byte1 = 4;
	//    7   12:iconst_4        
	//    8   13:istore          6
			byte byte0;
			if(f > 0.0F)
	//*   9   15:fload_3         
	//*  10   16:fconst_0        
	//*  11   17:fcmpl           
	//*  12   18:ifle            28
				byte0 = 8;
	//   13   21:bipush          8
	//   14   23:istore          5
			else
	//*  15   25:goto            31
				byte0 = 4;
	//   16   28:iconst_4        
	//   17   29:istore          5
			if(mVelocityTracker != null && mActivePointerId > -1)
	//*  18   31:aload_0         
	//*  19   32:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*  20   35:ifnull          154
	//*  21   38:aload_0         
	//*  22   39:getfield        #139 <Field int mActivePointerId>
	//*  23   42:iconst_m1       
	//*  24   43:icmple          154
			{
				mVelocityTracker.computeCurrentVelocity(1000, mCallback.getSwipeVelocityThreshold(mMaxSwipeVelocity));
	//   25   46:aload_0         
	//   26   47:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   27   50:sipush          1000
	//   28   53:aload_0         
	//   29   54:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   30   57:aload_0         
	//   31   58:getfield        #183 <Field float mMaxSwipeVelocity>
	//   32   61:invokevirtual   #187 <Method float ItemTouchHelper$Callback.getSwipeVelocityThreshold(float)>
	//   33   64:invokevirtual   #193 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				float f1 = mVelocityTracker.getXVelocity(mActivePointerId);
	//   34   67:aload_0         
	//   35   68:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   36   71:aload_0         
	//   37   72:getfield        #139 <Field int mActivePointerId>
	//   38   75:invokevirtual   #197 <Method float VelocityTracker.getXVelocity(int)>
	//   39   78:fstore          4
				f = mVelocityTracker.getYVelocity(mActivePointerId);
	//   40   80:aload_0         
	//   41   81:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   42   84:aload_0         
	//   43   85:getfield        #139 <Field int mActivePointerId>
	//   44   88:invokevirtual   #200 <Method float VelocityTracker.getYVelocity(int)>
	//   45   91:fstore_3        
				if(f1 > 0.0F)
	//*  46   92:fload           4
	//*  47   94:fconst_0        
	//*  48   95:fcmpl           
	//*  49   96:ifle            103
					byte1 = 8;
	//   50   99:bipush          8
	//   51  101:istore          6
				f1 = Math.abs(f1);
	//   52  103:fload           4
	//   53  105:invokestatic    #205 <Method float Math.abs(float)>
	//   54  108:fstore          4
				if((byte1 & i) != 0 && byte0 == byte1 && f1 >= mCallback.getSwipeEscapeVelocity(mSwipeEscapeVelocity) && f1 > Math.abs(f))
	//*  55  110:iload           6
	//*  56  112:iload_2         
	//*  57  113:iand            
	//*  58  114:ifeq            154
	//*  59  117:iload           5
	//*  60  119:iload           6
	//*  61  121:icmpne          154
	//*  62  124:fload           4
	//*  63  126:aload_0         
	//*  64  127:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//*  65  130:aload_0         
	//*  66  131:getfield        #207 <Field float mSwipeEscapeVelocity>
	//*  67  134:invokevirtual   #210 <Method float ItemTouchHelper$Callback.getSwipeEscapeVelocity(float)>
	//*  68  137:fcmpl           
	//*  69  138:iflt            154
	//*  70  141:fload           4
	//*  71  143:fload_3         
	//*  72  144:invokestatic    #205 <Method float Math.abs(float)>
	//*  73  147:fcmpl           
	//*  74  148:ifle            154
					return ((int) (byte1));
	//   75  151:iload           6
	//   76  153:ireturn         
			}
			f = mRecyclerView.getWidth();
	//   77  154:aload_0         
	//   78  155:getfield        #169 <Field RecyclerView mRecyclerView>
	//   79  158:invokevirtual   #214 <Method int RecyclerView.getWidth()>
	//   80  161:i2f             
	//   81  162:fstore_3        
			float f2 = mCallback.getSwipeThreshold(viewholder);
	//   82  163:aload_0         
	//   83  164:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   84  167:aload_1         
	//   85  168:invokevirtual   #218 <Method float ItemTouchHelper$Callback.getSwipeThreshold(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   86  171:fstore          4
			if((i & byte0) != 0 && Math.abs(mDx) > f * f2)
	//*  87  173:iload_2         
	//*  88  174:iload           5
	//*  89  176:iand            
	//*  90  177:ifeq            198
	//*  91  180:aload_0         
	//*  92  181:getfield        #179 <Field float mDx>
	//*  93  184:invokestatic    #205 <Method float Math.abs(float)>
	//*  94  187:fload_3         
	//*  95  188:fload           4
	//*  96  190:fmul            
	//*  97  191:fcmpl           
	//*  98  192:ifle            198
				return ((int) (byte0));
	//   99  195:iload           5
	//  100  197:ireturn         
		}
		return 0;
	//  101  198:iconst_0        
	//  102  199:ireturn         
	}

	private int checkVerticalSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		if((i & 3) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_3        
	//*   2    2:iand            
	//*   3    3:ifeq            195
		{
			float f = mDy;
	//    4    6:aload_0         
	//    5    7:getfield        #221 <Field float mDy>
	//    6   10:fstore_3        
			byte byte1 = 1;
	//    7   11:iconst_1        
	//    8   12:istore          6
			byte byte0;
			if(f > 0.0F)
	//*   9   14:fload_3         
	//*  10   15:fconst_0        
	//*  11   16:fcmpl           
	//*  12   17:ifle            26
				byte0 = 2;
	//   13   20:iconst_2        
	//   14   21:istore          5
			else
	//*  15   23:goto            29
				byte0 = 1;
	//   16   26:iconst_1        
	//   17   27:istore          5
			if(mVelocityTracker != null && mActivePointerId > -1)
	//*  18   29:aload_0         
	//*  19   30:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*  20   33:ifnull          151
	//*  21   36:aload_0         
	//*  22   37:getfield        #139 <Field int mActivePointerId>
	//*  23   40:iconst_m1       
	//*  24   41:icmple          151
			{
				mVelocityTracker.computeCurrentVelocity(1000, mCallback.getSwipeVelocityThreshold(mMaxSwipeVelocity));
	//   25   44:aload_0         
	//   26   45:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   27   48:sipush          1000
	//   28   51:aload_0         
	//   29   52:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   30   55:aload_0         
	//   31   56:getfield        #183 <Field float mMaxSwipeVelocity>
	//   32   59:invokevirtual   #187 <Method float ItemTouchHelper$Callback.getSwipeVelocityThreshold(float)>
	//   33   62:invokevirtual   #193 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				f = mVelocityTracker.getXVelocity(mActivePointerId);
	//   34   65:aload_0         
	//   35   66:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   36   69:aload_0         
	//   37   70:getfield        #139 <Field int mActivePointerId>
	//   38   73:invokevirtual   #197 <Method float VelocityTracker.getXVelocity(int)>
	//   39   76:fstore_3        
				float f1 = mVelocityTracker.getYVelocity(mActivePointerId);
	//   40   77:aload_0         
	//   41   78:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//   42   81:aload_0         
	//   43   82:getfield        #139 <Field int mActivePointerId>
	//   44   85:invokevirtual   #200 <Method float VelocityTracker.getYVelocity(int)>
	//   45   88:fstore          4
				if(f1 > 0.0F)
	//*  46   90:fload           4
	//*  47   92:fconst_0        
	//*  48   93:fcmpl           
	//*  49   94:ifle            100
					byte1 = 2;
	//   50   97:iconst_2        
	//   51   98:istore          6
				f1 = Math.abs(f1);
	//   52  100:fload           4
	//   53  102:invokestatic    #205 <Method float Math.abs(float)>
	//   54  105:fstore          4
				if((byte1 & i) != 0 && byte1 == byte0 && f1 >= mCallback.getSwipeEscapeVelocity(mSwipeEscapeVelocity) && f1 > Math.abs(f))
	//*  55  107:iload           6
	//*  56  109:iload_2         
	//*  57  110:iand            
	//*  58  111:ifeq            151
	//*  59  114:iload           6
	//*  60  116:iload           5
	//*  61  118:icmpne          151
	//*  62  121:fload           4
	//*  63  123:aload_0         
	//*  64  124:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//*  65  127:aload_0         
	//*  66  128:getfield        #207 <Field float mSwipeEscapeVelocity>
	//*  67  131:invokevirtual   #210 <Method float ItemTouchHelper$Callback.getSwipeEscapeVelocity(float)>
	//*  68  134:fcmpl           
	//*  69  135:iflt            151
	//*  70  138:fload           4
	//*  71  140:fload_3         
	//*  72  141:invokestatic    #205 <Method float Math.abs(float)>
	//*  73  144:fcmpl           
	//*  74  145:ifle            151
					return ((int) (byte1));
	//   75  148:iload           6
	//   76  150:ireturn         
			}
			f = mRecyclerView.getHeight();
	//   77  151:aload_0         
	//   78  152:getfield        #169 <Field RecyclerView mRecyclerView>
	//   79  155:invokevirtual   #224 <Method int RecyclerView.getHeight()>
	//   80  158:i2f             
	//   81  159:fstore_3        
			float f2 = mCallback.getSwipeThreshold(viewholder);
	//   82  160:aload_0         
	//   83  161:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   84  164:aload_1         
	//   85  165:invokevirtual   #218 <Method float ItemTouchHelper$Callback.getSwipeThreshold(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   86  168:fstore          4
			if((i & byte0) != 0 && Math.abs(mDy) > f * f2)
	//*  87  170:iload_2         
	//*  88  171:iload           5
	//*  89  173:iand            
	//*  90  174:ifeq            195
	//*  91  177:aload_0         
	//*  92  178:getfield        #221 <Field float mDy>
	//*  93  181:invokestatic    #205 <Method float Math.abs(float)>
	//*  94  184:fload_3         
	//*  95  185:fload           4
	//*  96  187:fmul            
	//*  97  188:fcmpl           
	//*  98  189:ifle            195
				return ((int) (byte0));
	//   99  192:iload           5
	//  100  194:ireturn         
		}
		return 0;
	//  101  195:iconst_0        
	//  102  196:ireturn         
	}

	private void destroyCallbacks()
	{
		mRecyclerView.removeItemDecoration(((android.support.v7.widget.RecyclerView.ItemDecoration) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #229 <Method void RecyclerView.removeItemDecoration(android.support.v7.widget.RecyclerView$ItemDecoration)>
		mRecyclerView.removeOnItemTouchListener(mOnItemTouchListener);
	//    4    8:aload_0         
	//    5    9:getfield        #169 <Field RecyclerView mRecyclerView>
	//    6   12:aload_0         
	//    7   13:getfield        #157 <Field android.support.v7.widget.RecyclerView$OnItemTouchListener mOnItemTouchListener>
	//    8   16:invokevirtual   #233 <Method void RecyclerView.removeOnItemTouchListener(android.support.v7.widget.RecyclerView$OnItemTouchListener)>
		mRecyclerView.removeOnChildAttachStateChangeListener(((android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener) (this)));
	//    9   19:aload_0         
	//   10   20:getfield        #169 <Field RecyclerView mRecyclerView>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #237 <Method void RecyclerView.removeOnChildAttachStateChangeListener(android.support.v7.widget.RecyclerView$OnChildAttachStateChangeListener)>
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*  13   27:aload_0         
	//*  14   28:getfield        #143 <Field List mRecoverAnimations>
	//*  15   31:invokeinterface #242 <Method int List.size()>
	//*  16   36:iconst_1        
	//*  17   37:isub            
	//*  18   38:istore_1        
	//*  19   39:iload_1         
	//*  20   40:iflt            79
		{
			RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(0);
	//   21   43:aload_0         
	//   22   44:getfield        #143 <Field List mRecoverAnimations>
	//   23   47:iconst_0        
	//   24   48:invokeinterface #246 <Method Object List.get(int)>
	//   25   53:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//   26   56:astore_2        
			mCallback.clearView(mRecyclerView, recoveranimation.mViewHolder);
	//   27   57:aload_0         
	//   28   58:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   29   61:aload_0         
	//   30   62:getfield        #169 <Field RecyclerView mRecyclerView>
	//   31   65:aload_2         
	//   32   66:getfield        #249 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   33   69:invokevirtual   #253 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		}

	//   34   72:iload_1         
	//   35   73:iconst_1        
	//   36   74:isub            
	//   37   75:istore_1        
	//*  38   76:goto            39
		mRecoverAnimations.clear();
	//   39   79:aload_0         
	//   40   80:getfield        #143 <Field List mRecoverAnimations>
	//   41   83:invokeinterface #256 <Method void List.clear()>
		mOverdrawChild = null;
	//   42   88:aload_0         
	//   43   89:aconst_null     
	//   44   90:putfield        #152 <Field View mOverdrawChild>
		mOverdrawChildPosition = -1;
	//   45   93:aload_0         
	//   46   94:iconst_m1       
	//   47   95:putfield        #154 <Field int mOverdrawChildPosition>
		releaseVelocityTracker();
	//   48   98:aload_0         
	//   49   99:invokespecial   #259 <Method void releaseVelocityTracker()>
		stopGestureDetection();
	//   50  102:aload_0         
	//   51  103:invokespecial   #262 <Method void stopGestureDetection()>
	//   52  106:return          
	}

	private List findSwapTargets(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		Object obj = ((Object) (viewholder));
	//    0    0:aload_1         
	//    1    1:astore          14
		if(mSwapTargets == null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #266 <Field List mSwapTargets>
	//*   4    7:ifnonnull       35
		{
			mSwapTargets = ((List) (new ArrayList()));
	//    5   10:aload_0         
	//    6   11:new             #130 <Class ArrayList>
	//    7   14:dup             
	//    8   15:invokespecial   #131 <Method void ArrayList()>
	//    9   18:putfield        #266 <Field List mSwapTargets>
			mDistances = ((List) (new ArrayList()));
	//   10   21:aload_0         
	//   11   22:new             #130 <Class ArrayList>
	//   12   25:dup             
	//   13   26:invokespecial   #131 <Method void ArrayList()>
	//   14   29:putfield        #268 <Field List mDistances>
		} else
	//*  15   32:goto            53
		{
			mSwapTargets.clear();
	//   16   35:aload_0         
	//   17   36:getfield        #266 <Field List mSwapTargets>
	//   18   39:invokeinterface #256 <Method void List.clear()>
			mDistances.clear();
	//   19   44:aload_0         
	//   20   45:getfield        #268 <Field List mDistances>
	//   21   48:invokeinterface #256 <Method void List.clear()>
		}
		int k = mCallback.getBoundingBoxMargin();
	//   22   53:aload_0         
	//   23   54:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   24   57:invokevirtual   #271 <Method int ItemTouchHelper$Callback.getBoundingBoxMargin()>
	//   25   60:istore_3        
		int k1 = Math.round(mSelectedStartX + mDx) - k;
	//   26   61:aload_0         
	//   27   62:getfield        #273 <Field float mSelectedStartX>
	//   28   65:aload_0         
	//   29   66:getfield        #179 <Field float mDx>
	//   30   69:fadd            
	//   31   70:invokestatic    #277 <Method int Math.round(float)>
	//   32   73:iload_3         
	//   33   74:isub            
	//   34   75:istore          5
		int l1 = Math.round(mSelectedStartY + mDy) - k;
	//   35   77:aload_0         
	//   36   78:getfield        #279 <Field float mSelectedStartY>
	//   37   81:aload_0         
	//   38   82:getfield        #221 <Field float mDy>
	//   39   85:fadd            
	//   40   86:invokestatic    #277 <Method int Math.round(float)>
	//   41   89:iload_3         
	//   42   90:isub            
	//   43   91:istore          6
		int i = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)).itemView.getWidth();
	//   44   93:aload           14
	//   45   95:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   46   98:invokevirtual   #287 <Method int View.getWidth()>
	//   47  101:istore_2        
		k *= 2;
	//   48  102:iload_3         
	//   49  103:iconst_2        
	//   50  104:imul            
	//   51  105:istore_3        
		int i2 = i + k1 + k;
	//   52  106:iload_2         
	//   53  107:iload           5
	//   54  109:iadd            
	//   55  110:iload_3         
	//   56  111:iadd            
	//   57  112:istore          7
		int j2 = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)).itemView.getHeight() + l1 + k;
	//   58  114:aload           14
	//   59  116:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   60  119:invokevirtual   #288 <Method int View.getHeight()>
	//   61  122:iload           6
	//   62  124:iadd            
	//   63  125:iload_3         
	//   64  126:iadd            
	//   65  127:istore          8
		int k2 = (k1 + i2) / 2;
	//   66  129:iload           5
	//   67  131:iload           7
	//   68  133:iadd            
	//   69  134:iconst_2        
	//   70  135:idiv            
	//   71  136:istore          9
		int l2 = (l1 + j2) / 2;
	//   72  138:iload           6
	//   73  140:iload           8
	//   74  142:iadd            
	//   75  143:iconst_2        
	//   76  144:idiv            
	//   77  145:istore          10
		obj = ((Object) (mRecyclerView.getLayoutManager()));
	//   78  147:aload_0         
	//   79  148:getfield        #169 <Field RecyclerView mRecyclerView>
	//   80  151:invokevirtual   #292 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   81  154:astore          14
		int i3 = ((android.support.v7.widget.RecyclerView.LayoutManager) (obj)).getChildCount();
	//   82  156:aload           14
	//   83  158:invokevirtual   #297 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getChildCount()>
	//   84  161:istore          11
		for(int j = 0; j < i3; j++)
	//*  85  163:iconst_0        
	//*  86  164:istore_2        
	//*  87  165:iload_2         
	//*  88  166:iload           11
	//*  89  168:icmpge          409
		{
			View view = ((android.support.v7.widget.RecyclerView.LayoutManager) (obj)).getChildAt(j);
	//   90  171:aload           14
	//   91  173:iload_2         
	//   92  174:invokevirtual   #301 <Method View android.support.v7.widget.RecyclerView$LayoutManager.getChildAt(int)>
	//   93  177:astore          15
			if(view == viewholder.itemView || view.getBottom() < l1 || view.getTop() > j2 || view.getRight() < k1 || view.getLeft() > i2)
	//*  94  179:aload           15
	//*  95  181:aload_1         
	//*  96  182:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  97  185:if_acmpne       191
	//*  98  188:goto            402
	//*  99  191:aload           15
	//* 100  193:invokevirtual   #304 <Method int View.getBottom()>
	//* 101  196:iload           6
	//* 102  198:icmplt          402
	//* 103  201:aload           15
	//* 104  203:invokevirtual   #307 <Method int View.getTop()>
	//* 105  206:iload           8
	//* 106  208:icmpgt          402
	//* 107  211:aload           15
	//* 108  213:invokevirtual   #310 <Method int View.getRight()>
	//* 109  216:iload           5
	//* 110  218:icmplt          402
	//* 111  221:aload           15
	//* 112  223:invokevirtual   #313 <Method int View.getLeft()>
	//* 113  226:iload           7
	//* 114  228:icmple          234
				continue;
	//  115  231:goto            402
			android.support.v7.widget.RecyclerView.ViewHolder viewholder1 = mRecyclerView.getChildViewHolder(view);
	//  116  234:aload_0         
	//  117  235:getfield        #169 <Field RecyclerView mRecyclerView>
	//  118  238:aload           15
	//  119  240:invokevirtual   #317 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//  120  243:astore          16
			if(!mCallback.canDropOver(mRecyclerView, mSelected, viewholder1))
				continue;
	//  121  245:aload_0         
	//  122  246:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//  123  249:aload_0         
	//  124  250:getfield        #169 <Field RecyclerView mRecyclerView>
	//  125  253:aload_0         
	//  126  254:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  127  257:aload           16
	//  128  259:invokevirtual   #321 <Method boolean ItemTouchHelper$Callback.canDropOver(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, android.support.v7.widget.RecyclerView$ViewHolder)>
	//  129  262:ifeq            402
			int l = Math.abs(k2 - (view.getLeft() + view.getRight()) / 2);
	//  130  265:iload           9
	//  131  267:aload           15
	//  132  269:invokevirtual   #313 <Method int View.getLeft()>
	//  133  272:aload           15
	//  134  274:invokevirtual   #310 <Method int View.getRight()>
	//  135  277:iadd            
	//  136  278:iconst_2        
	//  137  279:idiv            
	//  138  280:isub            
	//  139  281:invokestatic    #324 <Method int Math.abs(int)>
	//  140  284:istore_3        
			int j1 = Math.abs(l2 - (view.getTop() + view.getBottom()) / 2);
	//  141  285:iload           10
	//  142  287:aload           15
	//  143  289:invokevirtual   #307 <Method int View.getTop()>
	//  144  292:aload           15
	//  145  294:invokevirtual   #304 <Method int View.getBottom()>
	//  146  297:iadd            
	//  147  298:iconst_2        
	//  148  299:idiv            
	//  149  300:isub            
	//  150  301:invokestatic    #324 <Method int Math.abs(int)>
	//  151  304:istore          4
			int j3 = l * l + j1 * j1;
	//  152  306:iload_3         
	//  153  307:iload_3         
	//  154  308:imul            
	//  155  309:iload           4
	//  156  311:iload           4
	//  157  313:imul            
	//  158  314:iadd            
	//  159  315:istore          12
			int k3 = mSwapTargets.size();
	//  160  317:aload_0         
	//  161  318:getfield        #266 <Field List mSwapTargets>
	//  162  321:invokeinterface #242 <Method int List.size()>
	//  163  326:istore          13
			j1 = 0;
	//  164  328:iconst_0        
	//  165  329:istore          4
			for(int i1 = 0; i1 < k3 && j3 > ((Integer)mDistances.get(i1)).intValue(); i1++)
	//* 166  331:iconst_0        
	//* 167  332:istore_3        
	//* 168  333:iload_3         
	//* 169  334:iload           13
	//* 170  336:icmpge          373
	//* 171  339:iload           12
	//* 172  341:aload_0         
	//* 173  342:getfield        #268 <Field List mDistances>
	//* 174  345:iload_3         
	//* 175  346:invokeinterface #246 <Method Object List.get(int)>
	//* 176  351:checkcast       #326 <Class Integer>
	//* 177  354:invokevirtual   #329 <Method int Integer.intValue()>
	//* 178  357:icmple          373
				j1++;
	//  179  360:iload           4
	//  180  362:iconst_1        
	//  181  363:iadd            
	//  182  364:istore          4

	//  183  366:iload_3         
	//  184  367:iconst_1        
	//  185  368:iadd            
	//  186  369:istore_3        
	//* 187  370:goto            333
			mSwapTargets.add(j1, ((Object) (viewholder1)));
	//  188  373:aload_0         
	//  189  374:getfield        #266 <Field List mSwapTargets>
	//  190  377:iload           4
	//  191  379:aload           16
	//  192  381:invokeinterface #333 <Method void List.add(int, Object)>
			mDistances.add(j1, ((Object) (Integer.valueOf(j3))));
	//  193  386:aload_0         
	//  194  387:getfield        #268 <Field List mDistances>
	//  195  390:iload           4
	//  196  392:iload           12
	//  197  394:invokestatic    #337 <Method Integer Integer.valueOf(int)>
	//  198  397:invokeinterface #333 <Method void List.add(int, Object)>
		}

	//  199  402:iload_2         
	//  200  403:iconst_1        
	//  201  404:iadd            
	//  202  405:istore_2        
	//* 203  406:goto            165
		return mSwapTargets;
	//  204  409:aload_0         
	//  205  410:getfield        #266 <Field List mSwapTargets>
	//  206  413:areturn         
	}

	private android.support.v7.widget.RecyclerView.ViewHolder findSwipedView(MotionEvent motionevent)
	{
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = mRecyclerView.getLayoutManager();
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #292 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    3    7:astore          7
		if(mActivePointerId == -1)
	//*   4    9:aload_0         
	//*   5   10:getfield        #139 <Field int mActivePointerId>
	//*   6   13:iconst_m1       
	//*   7   14:icmpne          19
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
		int i = motionevent.findPointerIndex(mActivePointerId);
	//   10   19:aload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #139 <Field int mActivePointerId>
	//   13   24:invokevirtual   #346 <Method int MotionEvent.findPointerIndex(int)>
	//   14   27:istore          6
		float f2 = motionevent.getX(i);
	//   15   29:aload_1         
	//   16   30:iload           6
	//   17   32:invokevirtual   #349 <Method float MotionEvent.getX(int)>
	//   18   35:fstore          4
		float f3 = mInitialTouchX;
	//   19   37:aload_0         
	//   20   38:getfield        #351 <Field float mInitialTouchX>
	//   21   41:fstore          5
		float f = motionevent.getY(i);
	//   22   43:aload_1         
	//   23   44:iload           6
	//   24   46:invokevirtual   #354 <Method float MotionEvent.getY(int)>
	//   25   49:fstore_2        
		float f1 = mInitialTouchY;
	//   26   50:aload_0         
	//   27   51:getfield        #356 <Field float mInitialTouchY>
	//   28   54:fstore_3        
		f2 = Math.abs(f2 - f3);
	//   29   55:fload           4
	//   30   57:fload           5
	//   31   59:fsub            
	//   32   60:invokestatic    #205 <Method float Math.abs(float)>
	//   33   63:fstore          4
		f = Math.abs(f - f1);
	//   34   65:fload_2         
	//   35   66:fload_3         
	//   36   67:fsub            
	//   37   68:invokestatic    #205 <Method float Math.abs(float)>
	//   38   71:fstore_2        
		if(f2 < (float)mSlop && f < (float)mSlop)
	//*  39   72:fload           4
	//*  40   74:aload_0         
	//*  41   75:getfield        #358 <Field int mSlop>
	//*  42   78:i2f             
	//*  43   79:fcmpg           
	//*  44   80:ifge            95
	//*  45   83:fload_2         
	//*  46   84:aload_0         
	//*  47   85:getfield        #358 <Field int mSlop>
	//*  48   88:i2f             
	//*  49   89:fcmpg           
	//*  50   90:ifge            95
			return null;
	//   51   93:aconst_null     
	//   52   94:areturn         
		if(f2 > f && layoutmanager.canScrollHorizontally())
	//*  53   95:fload           4
	//*  54   97:fload_2         
	//*  55   98:fcmpl           
	//*  56   99:ifle            112
	//*  57  102:aload           7
	//*  58  104:invokevirtual   #362 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  59  107:ifeq            112
			return null;
	//   60  110:aconst_null     
	//   61  111:areturn         
		if(f > f2 && layoutmanager.canScrollVertically())
	//*  62  112:fload_2         
	//*  63  113:fload           4
	//*  64  115:fcmpl           
	//*  65  116:ifle            129
	//*  66  119:aload           7
	//*  67  121:invokevirtual   #365 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//*  68  124:ifeq            129
			return null;
	//   69  127:aconst_null     
	//   70  128:areturn         
		motionevent = ((MotionEvent) (findChildView(motionevent)));
	//   71  129:aload_0         
	//   72  130:aload_1         
	//   73  131:invokevirtual   #369 <Method View findChildView(MotionEvent)>
	//   74  134:astore_1        
		if(motionevent == null)
	//*  75  135:aload_1         
	//*  76  136:ifnonnull       141
			return null;
	//   77  139:aconst_null     
	//   78  140:areturn         
		else
			return mRecyclerView.getChildViewHolder(((View) (motionevent)));
	//   79  141:aload_0         
	//   80  142:getfield        #169 <Field RecyclerView mRecyclerView>
	//   81  145:aload_1         
	//   82  146:invokevirtual   #317 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//   83  149:areturn         
	}

	private void getSelectedDxDy(float af[])
	{
		if((mSelectedFlags & 0xc) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #373 <Field int mSelectedFlags>
	//*   2    4:bipush          12
	//*   3    6:iand            
	//*   4    7:ifeq            37
			af[0] = (mSelectedStartX + mDx) - (float)mSelected.itemView.getLeft();
	//    5   10:aload_1         
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:getfield        #273 <Field float mSelectedStartX>
	//    9   16:aload_0         
	//   10   17:getfield        #179 <Field float mDx>
	//   11   20:fadd            
	//   12   21:aload_0         
	//   13   22:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   14   25:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   15   28:invokevirtual   #313 <Method int View.getLeft()>
	//   16   31:i2f             
	//   17   32:fsub            
	//   18   33:fastore         
		else
	//*  19   34:goto            50
			af[0] = mSelected.itemView.getTranslationX();
	//   20   37:aload_1         
	//   21   38:iconst_0        
	//   22   39:aload_0         
	//   23   40:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   24   43:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   25   46:invokevirtual   #377 <Method float View.getTranslationX()>
	//   26   49:fastore         
		if((mSelectedFlags & 3) != 0)
	//*  27   50:aload_0         
	//*  28   51:getfield        #373 <Field int mSelectedFlags>
	//*  29   54:iconst_3        
	//*  30   55:iand            
	//*  31   56:ifeq            84
		{
			af[1] = (mSelectedStartY + mDy) - (float)mSelected.itemView.getTop();
	//   32   59:aload_1         
	//   33   60:iconst_1        
	//   34   61:aload_0         
	//   35   62:getfield        #279 <Field float mSelectedStartY>
	//   36   65:aload_0         
	//   37   66:getfield        #221 <Field float mDy>
	//   38   69:fadd            
	//   39   70:aload_0         
	//   40   71:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   41   74:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   42   77:invokevirtual   #307 <Method int View.getTop()>
	//   43   80:i2f             
	//   44   81:fsub            
	//   45   82:fastore         
			return;
	//   46   83:return          
		} else
		{
			af[1] = mSelected.itemView.getTranslationY();
	//   47   84:aload_1         
	//   48   85:iconst_1        
	//   49   86:aload_0         
	//   50   87:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   51   90:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   52   93:invokevirtual   #380 <Method float View.getTranslationY()>
	//   53   96:fastore         
			return;
	//   54   97:return          
		}
	}

	private static boolean hitTest(View view, float f, float f1, float f2, float f3)
	{
		return f >= f2 && f <= f2 + (float)view.getWidth() && f1 >= f3 && f1 <= f3 + (float)view.getHeight();
	//    0    0:fload_1         
	//    1    1:fload_3         
	//    2    2:fcmpl           
	//    3    3:iflt            40
	//    4    6:fload_1         
	//    5    7:fload_3         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #287 <Method int View.getWidth()>
	//    8   12:i2f             
	//    9   13:fadd            
	//   10   14:fcmpg           
	//   11   15:ifgt            40
	//   12   18:fload_2         
	//   13   19:fload           4
	//   14   21:fcmpl           
	//   15   22:iflt            40
	//   16   25:fload_2         
	//   17   26:fload           4
	//   18   28:aload_0         
	//   19   29:invokevirtual   #288 <Method int View.getHeight()>
	//   20   32:i2f             
	//   21   33:fadd            
	//   22   34:fcmpg           
	//   23   35:ifgt            40
	//   24   38:iconst_1        
	//   25   39:ireturn         
	//   26   40:iconst_0        
	//   27   41:ireturn         
	}

	private void releaseVelocityTracker()
	{
		if(mVelocityTracker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnull          19
		{
			mVelocityTracker.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//    5   11:invokevirtual   #385 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #181 <Field VelocityTracker mVelocityTracker>
		}
	//    9   19:return          
	}

	private void setupCallbacks()
	{
		mSlop = ViewConfiguration.get(mRecyclerView.getContext()).getScaledTouchSlop();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #169 <Field RecyclerView mRecyclerView>
	//    3    5:invokevirtual   #390 <Method android.content.Context RecyclerView.getContext()>
	//    4    8:invokestatic    #395 <Method ViewConfiguration ViewConfiguration.get(android.content.Context)>
	//    5   11:invokevirtual   #398 <Method int ViewConfiguration.getScaledTouchSlop()>
	//    6   14:putfield        #358 <Field int mSlop>
		mRecyclerView.addItemDecoration(((android.support.v7.widget.RecyclerView.ItemDecoration) (this)));
	//    7   17:aload_0         
	//    8   18:getfield        #169 <Field RecyclerView mRecyclerView>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #401 <Method void RecyclerView.addItemDecoration(android.support.v7.widget.RecyclerView$ItemDecoration)>
		mRecyclerView.addOnItemTouchListener(mOnItemTouchListener);
	//   11   25:aload_0         
	//   12   26:getfield        #169 <Field RecyclerView mRecyclerView>
	//   13   29:aload_0         
	//   14   30:getfield        #157 <Field android.support.v7.widget.RecyclerView$OnItemTouchListener mOnItemTouchListener>
	//   15   33:invokevirtual   #404 <Method void RecyclerView.addOnItemTouchListener(android.support.v7.widget.RecyclerView$OnItemTouchListener)>
		mRecyclerView.addOnChildAttachStateChangeListener(((android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener) (this)));
	//   16   36:aload_0         
	//   17   37:getfield        #169 <Field RecyclerView mRecyclerView>
	//   18   40:aload_0         
	//   19   41:invokevirtual   #407 <Method void RecyclerView.addOnChildAttachStateChangeListener(android.support.v7.widget.RecyclerView$OnChildAttachStateChangeListener)>
		startGestureDetection();
	//   20   44:aload_0         
	//   21   45:invokespecial   #410 <Method void startGestureDetection()>
	//   22   48:return          
	}

	private void startGestureDetection()
	{
		mItemTouchHelperGestureListener = new ItemTouchHelperGestureListener();
	//    0    0:aload_0         
	//    1    1:new             #25  <Class ItemTouchHelper$ItemTouchHelperGestureListener>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #411 <Method void ItemTouchHelper$ItemTouchHelperGestureListener(ItemTouchHelper)>
	//    5    9:putfield        #413 <Field ItemTouchHelper$ItemTouchHelperGestureListener mItemTouchHelperGestureListener>
		mGestureDetector = new GestureDetectorCompat(mRecyclerView.getContext(), ((android.view.GestureDetector.OnGestureListener) (mItemTouchHelperGestureListener)));
	//    6   12:aload_0         
	//    7   13:new             #415 <Class GestureDetectorCompat>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #169 <Field RecyclerView mRecyclerView>
	//   11   21:invokevirtual   #390 <Method android.content.Context RecyclerView.getContext()>
	//   12   24:aload_0         
	//   13   25:getfield        #413 <Field ItemTouchHelper$ItemTouchHelperGestureListener mItemTouchHelperGestureListener>
	//   14   28:invokespecial   #418 <Method void GestureDetectorCompat(android.content.Context, android.view.GestureDetector$OnGestureListener)>
	//   15   31:putfield        #420 <Field GestureDetectorCompat mGestureDetector>
	//   16   34:return          
	}

	private void stopGestureDetection()
	{
		if(mItemTouchHelperGestureListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #413 <Field ItemTouchHelper$ItemTouchHelperGestureListener mItemTouchHelperGestureListener>
	//*   2    4:ifnull          19
		{
			mItemTouchHelperGestureListener.doNotReactToLongPress();
	//    3    7:aload_0         
	//    4    8:getfield        #413 <Field ItemTouchHelper$ItemTouchHelperGestureListener mItemTouchHelperGestureListener>
	//    5   11:invokevirtual   #423 <Method void ItemTouchHelper$ItemTouchHelperGestureListener.doNotReactToLongPress()>
			mItemTouchHelperGestureListener = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #413 <Field ItemTouchHelper$ItemTouchHelperGestureListener mItemTouchHelperGestureListener>
		}
		if(mGestureDetector != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #420 <Field GestureDetectorCompat mGestureDetector>
	//*  11   23:ifnull          31
			mGestureDetector = null;
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:putfield        #420 <Field GestureDetectorCompat mGestureDetector>
	//   15   31:return          
	}

	private int swipeIfNecessary(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(mActionState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field int mActionState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          10
			return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		int j = mCallback.getMovementFlags(mRecyclerView, viewholder);
	//    6   10:aload_0         
	//    7   11:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//    8   14:aload_0         
	//    9   15:getfield        #169 <Field RecyclerView mRecyclerView>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #429 <Method int ItemTouchHelper$Callback.getMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//   12   22:istore_3        
		int i = (mCallback.convertToAbsoluteDirection(j, ViewCompat.getLayoutDirection(((View) (mRecyclerView)))) & 0xff00) >> 8;
	//   13   23:aload_0         
	//   14   24:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   15   27:iload_3         
	//   16   28:aload_0         
	//   17   29:getfield        #169 <Field RecyclerView mRecyclerView>
	//   18   32:invokestatic    #435 <Method int ViewCompat.getLayoutDirection(View)>
	//   19   35:invokevirtual   #439 <Method int ItemTouchHelper$Callback.convertToAbsoluteDirection(int, int)>
	//   20   38:ldc1            #44  <Int 65280>
	//   21   40:iand            
	//   22   41:bipush          8
	//   23   43:ishr            
	//   24   44:istore_2        
		if(i == 0)
	//*  25   45:iload_2         
	//*  26   46:ifne            51
			return 0;
	//   27   49:iconst_0        
	//   28   50:ireturn         
		j = (j & 0xff00) >> 8;
	//   29   51:iload_3         
	//   30   52:ldc1            #44  <Int 65280>
	//   31   54:iand            
	//   32   55:bipush          8
	//   33   57:ishr            
	//   34   58:istore_3        
		if(Math.abs(mDx) > Math.abs(mDy))
	//*  35   59:aload_0         
	//*  36   60:getfield        #179 <Field float mDx>
	//*  37   63:invokestatic    #205 <Method float Math.abs(float)>
	//*  38   66:aload_0         
	//*  39   67:getfield        #221 <Field float mDy>
	//*  40   70:invokestatic    #205 <Method float Math.abs(float)>
	//*  41   73:fcmpl           
	//*  42   74:ifle            126
		{
			int k = checkHorizontalSwipe(viewholder, i);
	//   43   77:aload_0         
	//   44   78:aload_1         
	//   45   79:iload_2         
	//   46   80:invokespecial   #441 <Method int checkHorizontalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   47   83:istore          4
			if(k > 0)
	//*  48   85:iload           4
	//*  49   87:ifle            113
				if((j & k) == 0)
	//*  50   90:iload_3         
	//*  51   91:iload           4
	//*  52   93:iand            
	//*  53   94:ifne            110
					return Callback.convertToRelativeDirection(k, ViewCompat.getLayoutDirection(((View) (mRecyclerView))));
	//   54   97:iload           4
	//   55   99:aload_0         
	//   56  100:getfield        #169 <Field RecyclerView mRecyclerView>
	//   57  103:invokestatic    #435 <Method int ViewCompat.getLayoutDirection(View)>
	//   58  106:invokestatic    #444 <Method int ItemTouchHelper$Callback.convertToRelativeDirection(int, int)>
	//   59  109:ireturn         
				else
					return k;
	//   60  110:iload           4
	//   61  112:ireturn         
			i = checkVerticalSwipe(viewholder, i);
	//   62  113:aload_0         
	//   63  114:aload_1         
	//   64  115:iload_2         
	//   65  116:invokespecial   #446 <Method int checkVerticalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   66  119:istore_2        
			if(i > 0)
	//*  67  120:iload_2         
	//*  68  121:ifle            173
				return i;
	//   69  124:iload_2         
	//   70  125:ireturn         
		} else
		{
			int l = checkVerticalSwipe(viewholder, i);
	//   71  126:aload_0         
	//   72  127:aload_1         
	//   73  128:iload_2         
	//   74  129:invokespecial   #446 <Method int checkVerticalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   75  132:istore          4
			if(l > 0)
	//*  76  134:iload           4
	//*  77  136:ifle            142
				return l;
	//   78  139:iload           4
	//   79  141:ireturn         
			i = checkHorizontalSwipe(viewholder, i);
	//   80  142:aload_0         
	//   81  143:aload_1         
	//   82  144:iload_2         
	//   83  145:invokespecial   #441 <Method int checkHorizontalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   84  148:istore_2        
			if(i > 0)
	//*  85  149:iload_2         
	//*  86  150:ifle            173
				if((j & i) == 0)
	//*  87  153:iload_3         
	//*  88  154:iload_2         
	//*  89  155:iand            
	//*  90  156:ifne            171
					return Callback.convertToRelativeDirection(i, ViewCompat.getLayoutDirection(((View) (mRecyclerView))));
	//   91  159:iload_2         
	//   92  160:aload_0         
	//   93  161:getfield        #169 <Field RecyclerView mRecyclerView>
	//   94  164:invokestatic    #435 <Method int ViewCompat.getLayoutDirection(View)>
	//   95  167:invokestatic    #444 <Method int ItemTouchHelper$Callback.convertToRelativeDirection(int, int)>
	//   96  170:ireturn         
				else
					return i;
	//   97  171:iload_2         
	//   98  172:ireturn         
		}
		return 0;
	//   99  173:iconst_0        
	//  100  174:ireturn         
	}

	public void attachToRecyclerView(RecyclerView recyclerview)
	{
		if(mRecyclerView == recyclerview)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field RecyclerView mRecyclerView>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		if(mRecyclerView != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #169 <Field RecyclerView mRecyclerView>
	//*   7   13:ifnull          20
			destroyCallbacks();
	//    8   16:aload_0         
	//    9   17:invokespecial   #451 <Method void destroyCallbacks()>
		mRecyclerView = recyclerview;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #169 <Field RecyclerView mRecyclerView>
		if(recyclerview != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          60
		{
			recyclerview = ((RecyclerView) (recyclerview.getResources()));
	//   15   29:aload_1         
	//   16   30:invokevirtual   #455 <Method Resources RecyclerView.getResources()>
	//   17   33:astore_1        
			mSwipeEscapeVelocity = ((Resources) (recyclerview)).getDimension(android.support.v7.recyclerview.R.dimen.item_touch_helper_swipe_escape_velocity);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getstatic       #460 <Field int android.support.v7.recyclerview.R$dimen.item_touch_helper_swipe_escape_velocity>
	//   21   39:invokevirtual   #465 <Method float Resources.getDimension(int)>
	//   22   42:putfield        #207 <Field float mSwipeEscapeVelocity>
			mMaxSwipeVelocity = ((Resources) (recyclerview)).getDimension(android.support.v7.recyclerview.R.dimen.item_touch_helper_swipe_escape_max_velocity);
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:getstatic       #468 <Field int android.support.v7.recyclerview.R$dimen.item_touch_helper_swipe_escape_max_velocity>
	//   26   50:invokevirtual   #465 <Method float Resources.getDimension(int)>
	//   27   53:putfield        #183 <Field float mMaxSwipeVelocity>
			setupCallbacks();
	//   28   56:aload_0         
	//   29   57:invokespecial   #470 <Method void setupCallbacks()>
		}
	//   30   60:return          
	}

	boolean checkSelectForSwipe(int i, MotionEvent motionevent, int j)
	{
		if(mSelected == null && i == 2 && mActionState != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   2    4:ifnonnull       252
	//*   3    7:iload_1         
	//*   4    8:iconst_2        
	//*   5    9:icmpne          252
	//*   6   12:aload_0         
	//*   7   13:getfield        #141 <Field int mActionState>
	//*   8   16:iconst_2        
	//*   9   17:icmpeq          252
		{
			if(!mCallback.isItemViewSwipeEnabled())
	//*  10   20:aload_0         
	//*  11   21:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//*  12   24:invokevirtual   #476 <Method boolean ItemTouchHelper$Callback.isItemViewSwipeEnabled()>
	//*  13   27:ifne            32
				return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
			if(mRecyclerView.getScrollState() == 1)
	//*  16   32:aload_0         
	//*  17   33:getfield        #169 <Field RecyclerView mRecyclerView>
	//*  18   36:invokevirtual   #479 <Method int RecyclerView.getScrollState()>
	//*  19   39:iconst_1        
	//*  20   40:icmpne          45
				return false;
	//   21   43:iconst_0        
	//   22   44:ireturn         
			android.support.v7.widget.RecyclerView.ViewHolder viewholder = findSwipedView(motionevent);
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:invokespecial   #481 <Method android.support.v7.widget.RecyclerView$ViewHolder findSwipedView(MotionEvent)>
	//   26   50:astore          8
			if(viewholder == null)
	//*  27   52:aload           8
	//*  28   54:ifnonnull       59
				return false;
	//   29   57:iconst_0        
	//   30   58:ireturn         
			i = (mCallback.getAbsoluteMovementFlags(mRecyclerView, viewholder) & 0xff00) >> 8;
	//   31   59:aload_0         
	//   32   60:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   33   63:aload_0         
	//   34   64:getfield        #169 <Field RecyclerView mRecyclerView>
	//   35   67:aload           8
	//   36   69:invokevirtual   #484 <Method int ItemTouchHelper$Callback.getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//   37   72:ldc1            #44  <Int 65280>
	//   38   74:iand            
	//   39   75:bipush          8
	//   40   77:ishr            
	//   41   78:istore_1        
			if(i == 0)
	//*  42   79:iload_1         
	//*  43   80:ifne            85
				return false;
	//   44   83:iconst_0        
	//   45   84:ireturn         
			float f = motionevent.getX(j);
	//   46   85:aload_2         
	//   47   86:iload_3         
	//   48   87:invokevirtual   #349 <Method float MotionEvent.getX(int)>
	//   49   90:fstore          4
			float f1 = motionevent.getY(j);
	//   50   92:aload_2         
	//   51   93:iload_3         
	//   52   94:invokevirtual   #354 <Method float MotionEvent.getY(int)>
	//   53   97:fstore          5
			f -= mInitialTouchX;
	//   54   99:fload           4
	//   55  101:aload_0         
	//   56  102:getfield        #351 <Field float mInitialTouchX>
	//   57  105:fsub            
	//   58  106:fstore          4
			f1 -= mInitialTouchY;
	//   59  108:fload           5
	//   60  110:aload_0         
	//   61  111:getfield        #356 <Field float mInitialTouchY>
	//   62  114:fsub            
	//   63  115:fstore          5
			float f2 = Math.abs(f);
	//   64  117:fload           4
	//   65  119:invokestatic    #205 <Method float Math.abs(float)>
	//   66  122:fstore          6
			float f3 = Math.abs(f1);
	//   67  124:fload           5
	//   68  126:invokestatic    #205 <Method float Math.abs(float)>
	//   69  129:fstore          7
			if(f2 < (float)mSlop && f3 < (float)mSlop)
	//*  70  131:fload           6
	//*  71  133:aload_0         
	//*  72  134:getfield        #358 <Field int mSlop>
	//*  73  137:i2f             
	//*  74  138:fcmpg           
	//*  75  139:ifge            155
	//*  76  142:fload           7
	//*  77  144:aload_0         
	//*  78  145:getfield        #358 <Field int mSlop>
	//*  79  148:i2f             
	//*  80  149:fcmpg           
	//*  81  150:ifge            155
				return false;
	//   82  153:iconst_0        
	//   83  154:ireturn         
			if(f2 > f3)
	//*  84  155:fload           6
	//*  85  157:fload           7
	//*  86  159:fcmpl           
	//*  87  160:ifle            194
			{
				if(f < 0.0F && (i & 4) == 0)
	//*  88  163:fload           4
	//*  89  165:fconst_0        
	//*  90  166:fcmpg           
	//*  91  167:ifge            178
	//*  92  170:iload_1         
	//*  93  171:iconst_4        
	//*  94  172:iand            
	//*  95  173:ifne            178
					return false;
	//   96  176:iconst_0        
	//   97  177:ireturn         
				if(f > 0.0F && (i & 8) == 0)
	//*  98  178:fload           4
	//*  99  180:fconst_0        
	//* 100  181:fcmpl           
	//* 101  182:ifle            224
	//* 102  185:iload_1         
	//* 103  186:bipush          8
	//* 104  188:iand            
	//* 105  189:ifne            224
					return false;
	//  106  192:iconst_0        
	//  107  193:ireturn         
			} else
			{
				if(f1 < 0.0F && (i & 1) == 0)
	//* 108  194:fload           5
	//* 109  196:fconst_0        
	//* 110  197:fcmpg           
	//* 111  198:ifge            209
	//* 112  201:iload_1         
	//* 113  202:iconst_1        
	//* 114  203:iand            
	//* 115  204:ifne            209
					return false;
	//  116  207:iconst_0        
	//  117  208:ireturn         
				if(f1 > 0.0F && (i & 2) == 0)
	//* 118  209:fload           5
	//* 119  211:fconst_0        
	//* 120  212:fcmpl           
	//* 121  213:ifle            224
	//* 122  216:iload_1         
	//* 123  217:iconst_2        
	//* 124  218:iand            
	//* 125  219:ifne            224
					return false;
	//  126  222:iconst_0        
	//  127  223:ireturn         
			}
			mDy = 0.0F;
	//  128  224:aload_0         
	//  129  225:fconst_0        
	//  130  226:putfield        #221 <Field float mDy>
			mDx = 0.0F;
	//  131  229:aload_0         
	//  132  230:fconst_0        
	//  133  231:putfield        #179 <Field float mDx>
			mActivePointerId = motionevent.getPointerId(0);
	//  134  234:aload_0         
	//  135  235:aload_2         
	//  136  236:iconst_0        
	//  137  237:invokevirtual   #487 <Method int MotionEvent.getPointerId(int)>
	//  138  240:putfield        #139 <Field int mActivePointerId>
			select(viewholder, 1);
	//  139  243:aload_0         
	//  140  244:aload           8
	//  141  246:iconst_1        
	//  142  247:invokevirtual   #491 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return true;
	//  143  250:iconst_1        
	//  144  251:ireturn         
		} else
		{
			return false;
	//  145  252:iconst_0        
	//  146  253:ireturn         
		}
	}

	int endRecoverAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder, boolean flag)
	{
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field List mRecoverAnimations>
	//*   2    4:invokeinterface #242 <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_3        
	//*   6   12:iload_3         
	//*   7   13:iflt            89
		{
			RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(i);
	//    8   16:aload_0         
	//    9   17:getfield        #143 <Field List mRecoverAnimations>
	//   10   20:iload_3         
	//   11   21:invokeinterface #246 <Method Object List.get(int)>
	//   12   26:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//   13   29:astore          4
			if(recoveranimation.mViewHolder == viewholder)
	//*  14   31:aload           4
	//*  15   33:getfield        #249 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//*  16   36:aload_1         
	//*  17   37:if_acmpne       82
			{
				recoveranimation.mOverridden = recoveranimation.mOverridden | flag;
	//   18   40:aload           4
	//   19   42:aload           4
	//   20   44:getfield        #496 <Field boolean ItemTouchHelper$RecoverAnimation.mOverridden>
	//   21   47:iload_2         
	//   22   48:ior             
	//   23   49:putfield        #496 <Field boolean ItemTouchHelper$RecoverAnimation.mOverridden>
				if(!recoveranimation.mEnded)
	//*  24   52:aload           4
	//*  25   54:getfield        #499 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
	//*  26   57:ifne            65
					recoveranimation.cancel();
	//   27   60:aload           4
	//   28   62:invokevirtual   #502 <Method void ItemTouchHelper$RecoverAnimation.cancel()>
				mRecoverAnimations.remove(i);
	//   29   65:aload_0         
	//   30   66:getfield        #143 <Field List mRecoverAnimations>
	//   31   69:iload_3         
	//   32   70:invokeinterface #505 <Method Object List.remove(int)>
	//   33   75:pop             
				return recoveranimation.mAnimationType;
	//   34   76:aload           4
	//   35   78:getfield        #508 <Field int ItemTouchHelper$RecoverAnimation.mAnimationType>
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
		if(mRecoverAnimations.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field List mRecoverAnimations>
	//*   2    4:invokeinterface #513 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		motionevent = ((MotionEvent) (findChildView(motionevent)));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #369 <Method View findChildView(MotionEvent)>
	//    9   19:astore_1        
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*  10   20:aload_0         
	//*  11   21:getfield        #143 <Field List mRecoverAnimations>
	//*  12   24:invokeinterface #242 <Method int List.size()>
	//*  13   29:iconst_1        
	//*  14   30:isub            
	//*  15   31:istore_2        
	//*  16   32:iload_2         
	//*  17   33:iflt            70
		{
			RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(i);
	//   18   36:aload_0         
	//   19   37:getfield        #143 <Field List mRecoverAnimations>
	//   20   40:iload_2         
	//   21   41:invokeinterface #246 <Method Object List.get(int)>
	//   22   46:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//   23   49:astore_3        
			if(recoveranimation.mViewHolder.itemView == motionevent)
	//*  24   50:aload_3         
	//*  25   51:getfield        #249 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//*  26   54:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  27   57:aload_1         
	//*  28   58:if_acmpne       63
				return recoveranimation;
	//   29   61:aload_3         
	//   30   62:areturn         
		}

	//   31   63:iload_2         
	//   32   64:iconst_1        
	//   33   65:isub            
	//   34   66:istore_2        
	//*  35   67:goto            32
		return null;
	//   36   70:aconst_null     
	//   37   71:areturn         
	}

	View findChildView(MotionEvent motionevent)
	{
		float f = motionevent.getX();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #515 <Method float MotionEvent.getX()>
	//    2    4:fstore_2        
		float f1 = motionevent.getY();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #517 <Method float MotionEvent.getY()>
	//    5    9:fstore_3        
		if(mSelected != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   8   14:ifnull          54
		{
			motionevent = ((MotionEvent) (mSelected.itemView));
	//    9   17:aload_0         
	//   10   18:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   11   21:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   12   24:astore_1        
			if(hitTest(((View) (motionevent)), f, f1, mSelectedStartX + mDx, mSelectedStartY + mDy))
	//*  13   25:aload_1         
	//*  14   26:fload_2         
	//*  15   27:fload_3         
	//*  16   28:aload_0         
	//*  17   29:getfield        #273 <Field float mSelectedStartX>
	//*  18   32:aload_0         
	//*  19   33:getfield        #179 <Field float mDx>
	//*  20   36:fadd            
	//*  21   37:aload_0         
	//*  22   38:getfield        #279 <Field float mSelectedStartY>
	//*  23   41:aload_0         
	//*  24   42:getfield        #221 <Field float mDy>
	//*  25   45:fadd            
	//*  26   46:invokestatic    #519 <Method boolean hitTest(View, float, float, float, float)>
	//*  27   49:ifeq            54
				return ((View) (motionevent));
	//   28   52:aload_1         
	//   29   53:areturn         
		}
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*  30   54:aload_0         
	//*  31   55:getfield        #143 <Field List mRecoverAnimations>
	//*  32   58:invokeinterface #242 <Method int List.size()>
	//*  33   63:iconst_1        
	//*  34   64:isub            
	//*  35   65:istore          4
	//*  36   67:iload           4
	//*  37   69:iflt            126
		{
			motionevent = ((MotionEvent) ((RecoverAnimation)mRecoverAnimations.get(i)));
	//   38   72:aload_0         
	//   39   73:getfield        #143 <Field List mRecoverAnimations>
	//   40   76:iload           4
	//   41   78:invokeinterface #246 <Method Object List.get(int)>
	//   42   83:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//   43   86:astore_1        
			View view = ((RecoverAnimation) (motionevent)).mViewHolder.itemView;
	//   44   87:aload_1         
	//   45   88:getfield        #249 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   46   91:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   47   94:astore          5
			if(hitTest(view, f, f1, ((RecoverAnimation) (motionevent)).mX, ((RecoverAnimation) (motionevent)).mY))
	//*  48   96:aload           5
	//*  49   98:fload_2         
	//*  50   99:fload_3         
	//*  51  100:aload_1         
	//*  52  101:getfield        #522 <Field float ItemTouchHelper$RecoverAnimation.mX>
	//*  53  104:aload_1         
	//*  54  105:getfield        #525 <Field float ItemTouchHelper$RecoverAnimation.mY>
	//*  55  108:invokestatic    #519 <Method boolean hitTest(View, float, float, float, float)>
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
	//   65  127:getfield        #169 <Field RecyclerView mRecyclerView>
	//   66  130:fload_2         
	//   67  131:fload_3         
	//   68  132:invokevirtual   #529 <Method View RecyclerView.findChildViewUnder(float, float)>
	//   69  135:areturn         
	}

	public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		rect.setEmpty();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #536 <Method void Rect.setEmpty()>
	//    2    4:return          
	}

	boolean hasRunningRecoverAnim()
	{
		int j = mRecoverAnimations.size();
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field List mRecoverAnimations>
	//    2    4:invokeinterface #242 <Method int List.size()>
	//    3    9:istore_2        
		for(int i = 0; i < j; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iload_2         
	//*   8   14:icmpge          45
			if(!((RecoverAnimation)mRecoverAnimations.get(i)).mEnded)
	//*   9   17:aload_0         
	//*  10   18:getfield        #143 <Field List mRecoverAnimations>
	//*  11   21:iload_1         
	//*  12   22:invokeinterface #246 <Method Object List.get(int)>
	//*  13   27:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//*  14   30:getfield        #499 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
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
		if(mRecyclerView.isLayoutRequested())
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field RecyclerView mRecyclerView>
	//*   2    4:invokevirtual   #542 <Method boolean RecyclerView.isLayoutRequested()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		if(mActionState != 2)
	//*   5   11:aload_0         
	//*   6   12:getfield        #141 <Field int mActionState>
	//*   7   15:iconst_2        
	//*   8   16:icmpeq          20
			return;
	//    9   19:return          
		float f = mCallback.getMoveThreshold(viewholder);
	//   10   20:aload_0         
	//   11   21:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #545 <Method float ItemTouchHelper$Callback.getMoveThreshold(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   14   28:fstore_2        
		int i = (int)(mSelectedStartX + mDx);
	//   15   29:aload_0         
	//   16   30:getfield        #273 <Field float mSelectedStartX>
	//   17   33:aload_0         
	//   18   34:getfield        #179 <Field float mDx>
	//   19   37:fadd            
	//   20   38:f2i             
	//   21   39:istore_3        
		int j = (int)(mSelectedStartY + mDy);
	//   22   40:aload_0         
	//   23   41:getfield        #279 <Field float mSelectedStartY>
	//   24   44:aload_0         
	//   25   45:getfield        #221 <Field float mDy>
	//   26   48:fadd            
	//   27   49:f2i             
	//   28   50:istore          4
		if((float)Math.abs(j - viewholder.itemView.getTop()) < (float)viewholder.itemView.getHeight() * f && (float)Math.abs(i - viewholder.itemView.getLeft()) < (float)viewholder.itemView.getWidth() * f)
	//*  29   52:iload           4
	//*  30   54:aload_1         
	//*  31   55:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  32   58:invokevirtual   #307 <Method int View.getTop()>
	//*  33   61:isub            
	//*  34   62:invokestatic    #324 <Method int Math.abs(int)>
	//*  35   65:i2f             
	//*  36   66:aload_1         
	//*  37   67:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  38   70:invokevirtual   #288 <Method int View.getHeight()>
	//*  39   73:i2f             
	//*  40   74:fload_2         
	//*  41   75:fmul            
	//*  42   76:fcmpg           
	//*  43   77:ifge            108
	//*  44   80:iload_3         
	//*  45   81:aload_1         
	//*  46   82:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  47   85:invokevirtual   #313 <Method int View.getLeft()>
	//*  48   88:isub            
	//*  49   89:invokestatic    #324 <Method int Math.abs(int)>
	//*  50   92:i2f             
	//*  51   93:aload_1         
	//*  52   94:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  53   97:invokevirtual   #287 <Method int View.getWidth()>
	//*  54  100:i2f             
	//*  55  101:fload_2         
	//*  56  102:fmul            
	//*  57  103:fcmpg           
	//*  58  104:ifge            108
			return;
	//   59  107:return          
		Object obj = ((Object) (findSwapTargets(viewholder)));
	//   60  108:aload_0         
	//   61  109:aload_1         
	//   62  110:invokespecial   #547 <Method List findSwapTargets(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   63  113:astore          7
		if(((List) (obj)).size() == 0)
	//*  64  115:aload           7
	//*  65  117:invokeinterface #242 <Method int List.size()>
	//*  66  122:ifne            126
			return;
	//   67  125:return          
		obj = ((Object) (mCallback.chooseDropTarget(viewholder, ((List) (obj)), i, j)));
	//   68  126:aload_0         
	//   69  127:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   70  130:aload_1         
	//   71  131:aload           7
	//   72  133:iload_3         
	//   73  134:iload           4
	//   74  136:invokevirtual   #551 <Method android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$Callback.chooseDropTarget(android.support.v7.widget.RecyclerView$ViewHolder, List, int, int)>
	//   75  139:astore          7
		if(obj == null)
	//*  76  141:aload           7
	//*  77  143:ifnonnull       165
		{
			mSwapTargets.clear();
	//   78  146:aload_0         
	//   79  147:getfield        #266 <Field List mSwapTargets>
	//   80  150:invokeinterface #256 <Method void List.clear()>
			mDistances.clear();
	//   81  155:aload_0         
	//   82  156:getfield        #268 <Field List mDistances>
	//   83  159:invokeinterface #256 <Method void List.clear()>
			return;
	//   84  164:return          
		}
		int k = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)).getAdapterPosition();
	//   85  165:aload           7
	//   86  167:invokevirtual   #554 <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//   87  170:istore          5
		int l = viewholder.getAdapterPosition();
	//   88  172:aload_1         
	//   89  173:invokevirtual   #554 <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//   90  176:istore          6
		if(mCallback.onMove(mRecyclerView, viewholder, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
	//*  91  178:aload_0         
	//*  92  179:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//*  93  182:aload_0         
	//*  94  183:getfield        #169 <Field RecyclerView mRecyclerView>
	//*  95  186:aload_1         
	//*  96  187:aload           7
	//*  97  189:invokevirtual   #557 <Method boolean ItemTouchHelper$Callback.onMove(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*  98  192:ifeq            216
			mCallback.onMoved(mRecyclerView, viewholder, l, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), k, i, j);
	//   99  195:aload_0         
	//  100  196:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//  101  199:aload_0         
	//  102  200:getfield        #169 <Field RecyclerView mRecyclerView>
	//  103  203:aload_1         
	//  104  204:iload           6
	//  105  206:aload           7
	//  106  208:iload           5
	//  107  210:iload_3         
	//  108  211:iload           4
	//  109  213:invokevirtual   #561 <Method void ItemTouchHelper$Callback.onMoved(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, int, android.support.v7.widget.RecyclerView$ViewHolder, int, int, int)>
	//  110  216:return          
	}

	void obtainVelocityTracker()
	{
		if(mVelocityTracker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnull          14
			mVelocityTracker.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #181 <Field VelocityTracker mVelocityTracker>
	//    5   11:invokevirtual   #385 <Method void VelocityTracker.recycle()>
		mVelocityTracker = VelocityTracker.obtain();
	//    6   14:aload_0         
	//    7   15:invokestatic    #566 <Method VelocityTracker VelocityTracker.obtain()>
	//    8   18:putfield        #181 <Field VelocityTracker mVelocityTracker>
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
	//    2    2:invokevirtual   #572 <Method void removeChildDrawingOrderCallbackIfNecessary(View)>
		view = ((View) (mRecyclerView.getChildViewHolder(view)));
	//    3    5:aload_0         
	//    4    6:getfield        #169 <Field RecyclerView mRecyclerView>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #317 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//    7   13:astore_1        
		if(view == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       19
			return;
	//   10   18:return          
		if(mSelected != null && view == mSelected)
	//*  11   19:aload_0         
	//*  12   20:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  13   23:ifnull          41
	//*  14   26:aload_1         
	//*  15   27:aload_0         
	//*  16   28:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  17   31:if_acmpne       41
		{
			select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
	//   18   34:aload_0         
	//   19   35:aconst_null     
	//   20   36:iconst_0        
	//   21   37:invokevirtual   #491 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return;
	//   22   40:return          
		}
		endRecoverAnimation(((android.support.v7.widget.RecyclerView.ViewHolder) (view)), false);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:iconst_0        
	//   26   44:invokevirtual   #574 <Method int endRecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, boolean)>
	//   27   47:pop             
		if(mPendingCleanup.remove(((Object) (((android.support.v7.widget.RecyclerView.ViewHolder) (view)).itemView))))
	//*  28   48:aload_0         
	//*  29   49:getfield        #133 <Field List mPendingCleanup>
	//*  30   52:aload_1         
	//*  31   53:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  32   56:invokeinterface #577 <Method boolean List.remove(Object)>
	//*  33   61:ifeq            76
			mCallback.clearView(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (view)));
	//   34   64:aload_0         
	//   35   65:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   36   68:aload_0         
	//   37   69:getfield        #169 <Field RecyclerView mRecyclerView>
	//   38   72:aload_1         
	//   39   73:invokevirtual   #253 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//   40   76:return          
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		mOverdrawChildPosition = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #154 <Field int mOverdrawChildPosition>
		float f;
		float f1;
		if(mSelected != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   5    9:ifnull          39
		{
			getSelectedDxDy(mTmpPosition);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #135 <Field float[] mTmpPosition>
	//    9   17:invokespecial   #581 <Method void getSelectedDxDy(float[])>
			f = mTmpPosition[0];
	//   10   20:aload_0         
	//   11   21:getfield        #135 <Field float[] mTmpPosition>
	//   12   24:iconst_0        
	//   13   25:faload          
	//   14   26:fstore          4
			f1 = mTmpPosition[1];
	//   15   28:aload_0         
	//   16   29:getfield        #135 <Field float[] mTmpPosition>
	//   17   32:iconst_1        
	//   18   33:faload          
	//   19   34:fstore          5
		} else
	//*  20   36:goto            46
		{
			f = 0.0F;
	//   21   39:fconst_0        
	//   22   40:fstore          4
			f1 = f;
	//   23   42:fload           4
	//   24   44:fstore          5
		}
		mCallback.onDraw(canvas, recyclerview, mSelected, mRecoverAnimations, mActionState, f, f1);
	//   25   46:aload_0         
	//   26   47:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   27   50:aload_1         
	//   28   51:aload_2         
	//   29   52:aload_0         
	//   30   53:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   31   56:aload_0         
	//   32   57:getfield        #143 <Field List mRecoverAnimations>
	//   33   60:aload_0         
	//   34   61:getfield        #141 <Field int mActionState>
	//   35   64:fload           4
	//   36   66:fload           5
	//   37   68:invokevirtual   #584 <Method void ItemTouchHelper$Callback.onDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, List, int, float, float)>
	//   38   71:return          
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		float f;
		float f1;
		if(mSelected != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   2    4:ifnull          34
		{
			getSelectedDxDy(mTmpPosition);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #135 <Field float[] mTmpPosition>
	//    6   12:invokespecial   #581 <Method void getSelectedDxDy(float[])>
			f = mTmpPosition[0];
	//    7   15:aload_0         
	//    8   16:getfield        #135 <Field float[] mTmpPosition>
	//    9   19:iconst_0        
	//   10   20:faload          
	//   11   21:fstore          4
			f1 = mTmpPosition[1];
	//   12   23:aload_0         
	//   13   24:getfield        #135 <Field float[] mTmpPosition>
	//   14   27:iconst_1        
	//   15   28:faload          
	//   16   29:fstore          5
		} else
	//*  17   31:goto            41
		{
			f = 0.0F;
	//   18   34:fconst_0        
	//   19   35:fstore          4
			f1 = f;
	//   20   37:fload           4
	//   21   39:fstore          5
		}
		mCallback.onDrawOver(canvas, recyclerview, mSelected, mRecoverAnimations, mActionState, f, f1);
	//   22   41:aload_0         
	//   23   42:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//   24   45:aload_1         
	//   25   46:aload_2         
	//   26   47:aload_0         
	//   27   48:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   28   51:aload_0         
	//   29   52:getfield        #143 <Field List mRecoverAnimations>
	//   30   55:aload_0         
	//   31   56:getfield        #141 <Field int mActionState>
	//   32   59:fload           4
	//   33   61:fload           5
	//   34   63:invokevirtual   #587 <Method void ItemTouchHelper$Callback.onDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, List, int, float, float)>
	//   35   66:return          
	}

	void postDispatchSwipe(final RecoverAnimation anim, final int swipeDir)
	{
		mRecyclerView.post(new Runnable() {

			public void run()
			{
				if(mRecyclerView != null && mRecyclerView.isAttachedToWindow() && !anim.mOverridden && anim.mViewHolder.getAdapterPosition() != -1)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field ItemTouchHelper this$0>
			//*   2    4:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
			//*   3    7:ifnull          114
			//*   4   10:aload_0         
			//*   5   11:getfield        #21  <Field ItemTouchHelper this$0>
			//*   6   14:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
			//*   7   17:invokevirtual   #40  <Method boolean RecyclerView.isAttachedToWindow()>
			//*   8   20:ifeq            114
			//*   9   23:aload_0         
			//*  10   24:getfield        #23  <Field ItemTouchHelper$RecoverAnimation val$anim>
			//*  11   27:getfield        #46  <Field boolean ItemTouchHelper$RecoverAnimation.mOverridden>
			//*  12   30:ifne            114
			//*  13   33:aload_0         
			//*  14   34:getfield        #23  <Field ItemTouchHelper$RecoverAnimation val$anim>
			//*  15   37:getfield        #50  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
			//*  16   40:invokevirtual   #56  <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
			//*  17   43:iconst_m1       
			//*  18   44:icmpeq          114
				{
					android.support.v7.widget.RecyclerView.ItemAnimator itemanimator = mRecyclerView.getItemAnimator();
			//   19   47:aload_0         
			//   20   48:getfield        #21  <Field ItemTouchHelper this$0>
			//   21   51:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
			//   22   54:invokevirtual   #60  <Method android.support.v7.widget.RecyclerView$ItemAnimator RecyclerView.getItemAnimator()>
			//   23   57:astore_1        
					if((itemanimator == null || !itemanimator.isRunning(((android.support.v7.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) (null)))) && !hasRunningRecoverAnim())
			//*  24   58:aload_1         
			//*  25   59:ifnull          70
			//*  26   62:aload_1         
			//*  27   63:aconst_null     
			//*  28   64:invokevirtual   #66  <Method boolean android.support.v7.widget.RecyclerView$ItemAnimator.isRunning(android.support.v7.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener)>
			//*  29   67:ifne            102
			//*  30   70:aload_0         
			//*  31   71:getfield        #21  <Field ItemTouchHelper this$0>
			//*  32   74:invokevirtual   #69  <Method boolean ItemTouchHelper.hasRunningRecoverAnim()>
			//*  33   77:ifne            102
					{
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
				}
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
	//    1    1:getfield        #169 <Field RecyclerView mRecyclerView>
	//    2    4:new             #14  <Class ItemTouchHelper$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #592 <Method void ItemTouchHelper$4(ItemTouchHelper, ItemTouchHelper$RecoverAnimation, int)>
	//    8   14:invokevirtual   #596 <Method boolean RecyclerView.post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	void removeChildDrawingOrderCallbackIfNecessary(View view)
	{
		if(view == mOverdrawChild)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #152 <Field View mOverdrawChild>
	//*   3    5:if_acmpne       28
		{
			mOverdrawChild = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #152 <Field View mOverdrawChild>
			if(mChildDrawingOrderCallback != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #150 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
	//*   9   17:ifnull          28
				mRecyclerView.setChildDrawingOrderCallback(((android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback) (null)));
	//   10   20:aload_0         
	//   11   21:getfield        #169 <Field RecyclerView mRecyclerView>
	//   12   24:aconst_null     
	//   13   25:invokevirtual   #175 <Method void RecyclerView.setChildDrawingOrderCallback(android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback)>
		}
	//   14   28:return          
	}

	boolean scrollIfNecessary()
	{
		int i;
		long l1;
		long l2;
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager;
label0:
		{
			if(mSelected == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   2    4:ifnonnull       16
			{
				mDragScrollStartTimeInMs = 0x0L;
	//    3    7:aload_0         
	//    4    8:ldc2w           #598 <Long 0x0L>
	//    5   11:putfield        #601 <Field long mDragScrollStartTimeInMs>
				return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
			}
			l2 = System.currentTimeMillis();
	//    8   16:invokestatic    #607 <Method long System.currentTimeMillis()>
	//    9   19:lstore          6
			if(mDragScrollStartTimeInMs == 0x0L)
	//*  10   21:aload_0         
	//*  11   22:getfield        #601 <Field long mDragScrollStartTimeInMs>
	//*  12   25:ldc2w           #598 <Long 0x0L>
	//*  13   28:lcmp            
	//*  14   29:ifne            38
				l1 = 0L;
	//   15   32:lconst_0        
	//   16   33:lstore          4
			else
	//*  17   35:goto            47
				l1 = l2 - mDragScrollStartTimeInMs;
	//   18   38:lload           6
	//   19   40:aload_0         
	//   20   41:getfield        #601 <Field long mDragScrollStartTimeInMs>
	//   21   44:lsub            
	//   22   45:lstore          4
			layoutmanager = mRecyclerView.getLayoutManager();
	//   23   47:aload_0         
	//   24   48:getfield        #169 <Field RecyclerView mRecyclerView>
	//   25   51:invokevirtual   #292 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   26   54:astore          8
			if(mTmpRect == null)
	//*  27   56:aload_0         
	//*  28   57:getfield        #609 <Field Rect mTmpRect>
	//*  29   60:ifnonnull       74
				mTmpRect = new Rect();
	//   30   63:aload_0         
	//   31   64:new             #533 <Class Rect>
	//   32   67:dup             
	//   33   68:invokespecial   #610 <Method void Rect()>
	//   34   71:putfield        #609 <Field Rect mTmpRect>
			layoutmanager.calculateItemDecorationsForChild(mSelected.itemView, mTmpRect);
	//   35   74:aload           8
	//   36   76:aload_0         
	//   37   77:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   38   80:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   39   83:aload_0         
	//   40   84:getfield        #609 <Field Rect mTmpRect>
	//   41   87:invokevirtual   #614 <Method void android.support.v7.widget.RecyclerView$LayoutManager.calculateItemDecorationsForChild(View, Rect)>
			if(layoutmanager.canScrollHorizontally())
	//*  42   90:aload           8
	//*  43   92:invokevirtual   #362 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  44   95:ifeq            196
			{
				int j = (int)(mSelectedStartX + mDx);
	//   45   98:aload_0         
	//   46   99:getfield        #273 <Field float mSelectedStartX>
	//   47  102:aload_0         
	//   48  103:getfield        #179 <Field float mDx>
	//   49  106:fadd            
	//   50  107:f2i             
	//   51  108:istore_2        
				i = j - mTmpRect.left - mRecyclerView.getPaddingLeft();
	//   52  109:iload_2         
	//   53  110:aload_0         
	//   54  111:getfield        #609 <Field Rect mTmpRect>
	//   55  114:getfield        #617 <Field int Rect.left>
	//   56  117:isub            
	//   57  118:aload_0         
	//   58  119:getfield        #169 <Field RecyclerView mRecyclerView>
	//   59  122:invokevirtual   #620 <Method int RecyclerView.getPaddingLeft()>
	//   60  125:isub            
	//   61  126:istore_1        
				if(mDx < 0.0F && i < 0)
	//*  62  127:aload_0         
	//*  63  128:getfield        #179 <Field float mDx>
	//*  64  131:fconst_0        
	//*  65  132:fcmpg           
	//*  66  133:ifge            143
	//*  67  136:iload_1         
	//*  68  137:ifge            143
					break label0;
	//   69  140:goto            198
				if(mDx > 0.0F)
	//*  70  143:aload_0         
	//*  71  144:getfield        #179 <Field float mDx>
	//*  72  147:fconst_0        
	//*  73  148:fcmpl           
	//*  74  149:ifle            196
				{
					i = (j + mSelected.itemView.getWidth() + mTmpRect.right) - (mRecyclerView.getWidth() - mRecyclerView.getPaddingRight());
	//   75  152:iload_2         
	//   76  153:aload_0         
	//   77  154:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   78  157:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   79  160:invokevirtual   #287 <Method int View.getWidth()>
	//   80  163:iadd            
	//   81  164:aload_0         
	//   82  165:getfield        #609 <Field Rect mTmpRect>
	//   83  168:getfield        #623 <Field int Rect.right>
	//   84  171:iadd            
	//   85  172:aload_0         
	//   86  173:getfield        #169 <Field RecyclerView mRecyclerView>
	//   87  176:invokevirtual   #214 <Method int RecyclerView.getWidth()>
	//   88  179:aload_0         
	//   89  180:getfield        #169 <Field RecyclerView mRecyclerView>
	//   90  183:invokevirtual   #626 <Method int RecyclerView.getPaddingRight()>
	//   91  186:isub            
	//   92  187:isub            
	//   93  188:istore_1        
					if(i > 0)
	//*  94  189:iload_1         
	//*  95  190:ifle            196
						break label0;
	//   96  193:goto            198
				}
			}
			i = 0;
	//   97  196:iconst_0        
	//   98  197:istore_1        
		}
		int k;
label1:
		{
			if(layoutmanager.canScrollVertically())
	//*  99  198:aload           8
	//* 100  200:invokevirtual   #365 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//* 101  203:ifeq            304
			{
				int l = (int)(mSelectedStartY + mDy);
	//  102  206:aload_0         
	//  103  207:getfield        #279 <Field float mSelectedStartY>
	//  104  210:aload_0         
	//  105  211:getfield        #221 <Field float mDy>
	//  106  214:fadd            
	//  107  215:f2i             
	//  108  216:istore_3        
				k = l - mTmpRect.top - mRecyclerView.getPaddingTop();
	//  109  217:iload_3         
	//  110  218:aload_0         
	//  111  219:getfield        #609 <Field Rect mTmpRect>
	//  112  222:getfield        #629 <Field int Rect.top>
	//  113  225:isub            
	//  114  226:aload_0         
	//  115  227:getfield        #169 <Field RecyclerView mRecyclerView>
	//  116  230:invokevirtual   #632 <Method int RecyclerView.getPaddingTop()>
	//  117  233:isub            
	//  118  234:istore_2        
				if(mDy < 0.0F && k < 0)
	//* 119  235:aload_0         
	//* 120  236:getfield        #221 <Field float mDy>
	//* 121  239:fconst_0        
	//* 122  240:fcmpg           
	//* 123  241:ifge            251
	//* 124  244:iload_2         
	//* 125  245:ifge            251
					break label1;
	//  126  248:goto            306
				if(mDy > 0.0F)
	//* 127  251:aload_0         
	//* 128  252:getfield        #221 <Field float mDy>
	//* 129  255:fconst_0        
	//* 130  256:fcmpl           
	//* 131  257:ifle            304
				{
					k = (l + mSelected.itemView.getHeight() + mTmpRect.bottom) - (mRecyclerView.getHeight() - mRecyclerView.getPaddingBottom());
	//  132  260:iload_3         
	//  133  261:aload_0         
	//  134  262:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  135  265:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  136  268:invokevirtual   #288 <Method int View.getHeight()>
	//  137  271:iadd            
	//  138  272:aload_0         
	//  139  273:getfield        #609 <Field Rect mTmpRect>
	//  140  276:getfield        #635 <Field int Rect.bottom>
	//  141  279:iadd            
	//  142  280:aload_0         
	//  143  281:getfield        #169 <Field RecyclerView mRecyclerView>
	//  144  284:invokevirtual   #224 <Method int RecyclerView.getHeight()>
	//  145  287:aload_0         
	//  146  288:getfield        #169 <Field RecyclerView mRecyclerView>
	//  147  291:invokevirtual   #638 <Method int RecyclerView.getPaddingBottom()>
	//  148  294:isub            
	//  149  295:isub            
	//  150  296:istore_2        
					if(k > 0)
	//* 151  297:iload_2         
	//* 152  298:ifle            304
						break label1;
	//  153  301:goto            306
				}
			}
			k = 0;
	//  154  304:iconst_0        
	//  155  305:istore_2        
		}
		int i1 = i;
	//  156  306:iload_1         
	//  157  307:istore_3        
		if(i != 0)
	//* 158  308:iload_1         
	//* 159  309:ifeq            344
			i1 = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getWidth(), i, mRecyclerView.getWidth(), l1);
	//  160  312:aload_0         
	//  161  313:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//  162  316:aload_0         
	//  163  317:getfield        #169 <Field RecyclerView mRecyclerView>
	//  164  320:aload_0         
	//  165  321:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  166  324:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  167  327:invokevirtual   #287 <Method int View.getWidth()>
	//  168  330:iload_1         
	//  169  331:aload_0         
	//  170  332:getfield        #169 <Field RecyclerView mRecyclerView>
	//  171  335:invokevirtual   #214 <Method int RecyclerView.getWidth()>
	//  172  338:lload           4
	//  173  340:invokevirtual   #642 <Method int ItemTouchHelper$Callback.interpolateOutOfBoundsScroll(RecyclerView, int, int, int, long)>
	//  174  343:istore_3        
		i = k;
	//  175  344:iload_2         
	//  176  345:istore_1        
		if(k != 0)
	//* 177  346:iload_2         
	//* 178  347:ifeq            382
			i = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getHeight(), k, mRecyclerView.getHeight(), l1);
	//  179  350:aload_0         
	//  180  351:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//  181  354:aload_0         
	//  182  355:getfield        #169 <Field RecyclerView mRecyclerView>
	//  183  358:aload_0         
	//  184  359:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  185  362:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  186  365:invokevirtual   #288 <Method int View.getHeight()>
	//  187  368:iload_2         
	//  188  369:aload_0         
	//  189  370:getfield        #169 <Field RecyclerView mRecyclerView>
	//  190  373:invokevirtual   #224 <Method int RecyclerView.getHeight()>
	//  191  376:lload           4
	//  192  378:invokevirtual   #642 <Method int ItemTouchHelper$Callback.interpolateOutOfBoundsScroll(RecyclerView, int, int, int, long)>
	//  193  381:istore_1        
		if(i1 == 0 && i == 0)
	//* 194  382:iload_3         
	//* 195  383:ifne            402
	//* 196  386:iload_1         
	//* 197  387:ifeq            393
	//* 198  390:goto            402
		{
			mDragScrollStartTimeInMs = 0x0L;
	//  199  393:aload_0         
	//  200  394:ldc2w           #598 <Long 0x0L>
	//  201  397:putfield        #601 <Field long mDragScrollStartTimeInMs>
			return false;
	//  202  400:iconst_0        
	//  203  401:ireturn         
		}
		if(mDragScrollStartTimeInMs == 0x0L)
	//* 204  402:aload_0         
	//* 205  403:getfield        #601 <Field long mDragScrollStartTimeInMs>
	//* 206  406:ldc2w           #598 <Long 0x0L>
	//* 207  409:lcmp            
	//* 208  410:ifne            419
			mDragScrollStartTimeInMs = l2;
	//  209  413:aload_0         
	//  210  414:lload           6
	//  211  416:putfield        #601 <Field long mDragScrollStartTimeInMs>
		mRecyclerView.scrollBy(i1, i);
	//  212  419:aload_0         
	//  213  420:getfield        #169 <Field RecyclerView mRecyclerView>
	//  214  423:iload_3         
	//  215  424:iload_1         
	//  216  425:invokevirtual   #646 <Method void RecyclerView.scrollBy(int, int)>
		return true;
	//  217  428:iconst_1        
	//  218  429:ireturn         
	}

	void select(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		if(viewholder == mSelected && i == mActionState)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   3    5:if_acmpne       17
	//*   4    8:iload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #141 <Field int mActionState>
	//*   7   13:icmpne          17
			return;
	//    8   16:return          
		mDragScrollStartTimeInMs = 0x0L;
	//    9   17:aload_0         
	//   10   18:ldc2w           #598 <Long 0x0L>
	//   11   21:putfield        #601 <Field long mDragScrollStartTimeInMs>
		int k = mActionState;
	//   12   24:aload_0         
	//   13   25:getfield        #141 <Field int mActionState>
	//   14   28:istore          9
		endRecoverAnimation(viewholder, true);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #574 <Method int endRecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, boolean)>
	//   19   36:pop             
		mActionState = i;
	//   20   37:aload_0         
	//   21   38:iload_2         
	//   22   39:putfield        #141 <Field int mActionState>
		if(i == 2)
	//*  23   42:iload_2         
	//*  24   43:iconst_2        
	//*  25   44:icmpne          59
		{
			mOverdrawChild = viewholder.itemView;
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   29   52:putfield        #152 <Field View mOverdrawChild>
			addChildDrawingOrderCallback();
	//   30   55:aload_0         
	//   31   56:invokespecial   #648 <Method void addChildDrawingOrderCallback()>
		}
		boolean flag;
		if(mSelected != null)
	//*  32   59:aload_0         
	//*  33   60:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  34   63:ifnull          386
		{
			final Object final_viewholder = ((Object) (mSelected));
	//   35   66:aload_0         
	//   36   67:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   37   70:astore          11
			if(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)).itemView.getParent() != null)
	//*  38   72:aload           11
	//*  39   74:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  40   77:invokevirtual   #652 <Method ViewParent View.getParent()>
	//*  41   80:ifnull          353
			{
				int j;
				if(k == 2)
	//*  42   83:iload           9
	//*  43   85:iconst_2        
	//*  44   86:icmpne          95
					j = 0;
	//   45   89:iconst_0        
	//   46   90:istore          8
				else
	//*  47   92:goto            103
					j = swipeIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)));
	//   48   95:aload_0         
	//   49   96:aload           11
	//   50   98:invokespecial   #654 <Method int swipeIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   51  101:istore          8
				releaseVelocityTracker();
	//   52  103:aload_0         
	//   53  104:invokespecial   #259 <Method void releaseVelocityTracker()>
				float f;
				float f1;
				if(j != 4 && j != 8 && j != 16 && j != 32)
	//*  54  107:iload           8
	//*  55  109:iconst_4        
	//*  56  110:icmpeq          199
	//*  57  113:iload           8
	//*  58  115:bipush          8
	//*  59  117:icmpeq          199
	//*  60  120:iload           8
	//*  61  122:bipush          16
	//*  62  124:icmpeq          199
	//*  63  127:iload           8
	//*  64  129:bipush          32
	//*  65  131:icmpeq          199
				{
					switch(j)
	//*  66  134:iload           8
					{
	//*  67  136:tableswitch     1 2: default 160
	//	               1 168
	//	               2 168
					default:
						f = 0.0F;
	//   68  160:fconst_0        
	//   69  161:fstore_3        
						f1 = f;
	//   70  162:fload_3         
	//   71  163:fstore          4
						break;

	//*  72  165:goto            225
					case 1: // '\001'
					case 2: // '\002'
						f1 = Math.signum(mDy);
	//   73  168:aload_0         
	//   74  169:getfield        #221 <Field float mDy>
	//   75  172:invokestatic    #657 <Method float Math.signum(float)>
	//   76  175:fstore          4
						float f2 = mRecyclerView.getHeight();
	//   77  177:aload_0         
	//   78  178:getfield        #169 <Field RecyclerView mRecyclerView>
	//   79  181:invokevirtual   #224 <Method int RecyclerView.getHeight()>
	//   80  184:i2f             
	//   81  185:fstore          5
						f = 0.0F;
	//   82  187:fconst_0        
	//   83  188:fstore_3        
						f1 *= f2;
	//   84  189:fload           4
	//   85  191:fload           5
	//   86  193:fmul            
	//   87  194:fstore          4
						break;
					}
				} else
	//*  88  196:goto            225
				{
					f = Math.signum(mDx);
	//   89  199:aload_0         
	//   90  200:getfield        #179 <Field float mDx>
	//   91  203:invokestatic    #657 <Method float Math.signum(float)>
	//   92  206:fstore_3        
					float f3 = mRecyclerView.getWidth();
	//   93  207:aload_0         
	//   94  208:getfield        #169 <Field RecyclerView mRecyclerView>
	//   95  211:invokevirtual   #214 <Method int RecyclerView.getWidth()>
	//   96  214:i2f             
	//   97  215:fstore          5
					f1 = 0.0F;
	//   98  217:fconst_0        
	//   99  218:fstore          4
					f *= f3;
	//  100  220:fload_3         
	//  101  221:fload           5
	//  102  223:fmul            
	//  103  224:fstore_3        
				}
				final byte final_i;
				if(k == 2)
	//* 104  225:iload           9
	//* 105  227:iconst_2        
	//* 106  228:icmpne          238
					final_i = 8;
	//  107  231:bipush          8
	//  108  233:istore          7
				else
	//* 109  235:goto            252
				if(j > 0)
	//* 110  238:iload           8
	//* 111  240:ifle            249
					final_i = 2;
	//  112  243:iconst_2        
	//  113  244:istore          7
				else
	//* 114  246:goto            252
					final_i = 4;
	//  115  249:iconst_4        
	//  116  250:istore          7
				getSelectedDxDy(mTmpPosition);
	//  117  252:aload_0         
	//  118  253:aload_0         
	//  119  254:getfield        #135 <Field float[] mTmpPosition>
	//  120  257:invokespecial   #581 <Method void getSelectedDxDy(float[])>
				float f4 = mTmpPosition[0];
	//  121  260:aload_0         
	//  122  261:getfield        #135 <Field float[] mTmpPosition>
	//  123  264:iconst_0        
	//  124  265:faload          
	//  125  266:fstore          5
				float f5 = mTmpPosition[1];
	//  126  268:aload_0         
	//  127  269:getfield        #135 <Field float[] mTmpPosition>
	//  128  272:iconst_1        
	//  129  273:faload          
	//  130  274:fstore          6
				final_viewholder = ((Object) (new RecoverAnimation(k, f4, f5, f, f1, j, ((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder))) {

					public void onAnimationEnd(Animator animator)
					{
						super.onAnimationEnd(animator);
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:invokespecial   #31  <Method void ItemTouchHelper$RecoverAnimation.onAnimationEnd(Animator)>
						if(mOverridden)
					//*   3    5:aload_0         
					//*   4    6:getfield        #35  <Field boolean mOverridden>
					//*   5    9:ifeq            13
							return;
					//    6   12:return          
						if(swipeDir <= 0)
					//*   7   13:aload_0         
					//*   8   14:getfield        #21  <Field int val$swipeDir>
					//*   9   17:ifgt            44
						{
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
						} else
					//*  19   41:goto            88
						{
							mPendingCleanup.add(((Object) (prevSelected.itemView)));
					//   20   44:aload_0         
					//   21   45:getfield        #19  <Field ItemTouchHelper this$0>
					//   22   48:getfield        #53  <Field List ItemTouchHelper.mPendingCleanup>
					//   23   51:aload_0         
					//   24   52:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
					//   25   55:getfield        #59  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
					//   26   58:invokeinterface #65  <Method boolean List.add(Object)>
					//   27   63:pop             
							mIsPendingCleanup = true;
					//   28   64:aload_0         
					//   29   65:iconst_1        
					//   30   66:putfield        #68  <Field boolean mIsPendingCleanup>
							if(swipeDir > 0)
					//*  31   69:aload_0         
					//*  32   70:getfield        #21  <Field int val$swipeDir>
					//*  33   73:ifle            88
								postDispatchSwipe(((RecoverAnimation) (this)), swipeDir);
					//   34   76:aload_0         
					//   35   77:getfield        #19  <Field ItemTouchHelper this$0>
					//   36   80:aload_0         
					//   37   81:aload_0         
					//   38   82:getfield        #21  <Field int val$swipeDir>
					//   39   85:invokevirtual   #72  <Method void ItemTouchHelper.postDispatchSwipe(ItemTouchHelper$RecoverAnimation, int)>
						}
						if(mOverdrawChild == prevSelected.itemView)
					//*  40   88:aload_0         
					//*  41   89:getfield        #19  <Field ItemTouchHelper this$0>
					//*  42   92:getfield        #75  <Field View ItemTouchHelper.mOverdrawChild>
					//*  43   95:aload_0         
					//*  44   96:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
					//*  45   99:getfield        #59  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
					//*  46  102:if_acmpne       119
							removeChildDrawingOrderCallbackIfNecessary(prevSelected.itemView);
					//   47  105:aload_0         
					//   48  106:getfield        #19  <Field ItemTouchHelper this$0>
					//   49  109:aload_0         
					//   50  110:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
					//   51  113:getfield        #59  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
					//   52  116:invokevirtual   #79  <Method void ItemTouchHelper.removeChildDrawingOrderCallbackIfNecessary(View)>
					//   53  119:return          
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
	//  131  276:new             #12  <Class ItemTouchHelper$3>
	//  132  279:dup             
	//  133  280:aload_0         
	//  134  281:aload           11
	//  135  283:iload           7
	//  136  285:iload           9
	//  137  287:fload           5
	//  138  289:fload           6
	//  139  291:fload_3         
	//  140  292:fload           4
	//  141  294:iload           8
	//  142  296:aload           11
	//  143  298:invokespecial   #660 <Method void ItemTouchHelper$3(ItemTouchHelper, android.support.v7.widget.RecyclerView$ViewHolder, int, int, float, float, float, float, int, android.support.v7.widget.RecyclerView$ViewHolder)>
	//  144  301:astore          11
				((RecoverAnimation) (final_viewholder)).setDuration(mCallback.getAnimationDuration(mRecyclerView, ((int) (final_i)), f - f4, f1 - f5));
	//  145  303:aload           11
	//  146  305:aload_0         
	//  147  306:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//  148  309:aload_0         
	//  149  310:getfield        #169 <Field RecyclerView mRecyclerView>
	//  150  313:iload           7
	//  151  315:fload_3         
	//  152  316:fload           5
	//  153  318:fsub            
	//  154  319:fload           4
	//  155  321:fload           6
	//  156  323:fsub            
	//  157  324:invokevirtual   #664 <Method long ItemTouchHelper$Callback.getAnimationDuration(RecyclerView, int, float, float)>
	//  158  327:invokevirtual   #668 <Method void ItemTouchHelper$RecoverAnimation.setDuration(long)>
				mRecoverAnimations.add(final_viewholder);
	//  159  330:aload_0         
	//  160  331:getfield        #143 <Field List mRecoverAnimations>
	//  161  334:aload           11
	//  162  336:invokeinterface #670 <Method boolean List.add(Object)>
	//  163  341:pop             
				((RecoverAnimation) (final_viewholder)).start();
	//  164  342:aload           11
	//  165  344:invokevirtual   #673 <Method void ItemTouchHelper$RecoverAnimation.start()>
				flag = true;
	//  166  347:iconst_1        
	//  167  348:istore          7
			} else
	//* 168  350:goto            378
			{
				removeChildDrawingOrderCallbackIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)).itemView);
	//  169  353:aload_0         
	//  170  354:aload           11
	//  171  356:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  172  359:invokevirtual   #572 <Method void removeChildDrawingOrderCallbackIfNecessary(View)>
				mCallback.clearView(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)));
	//  173  362:aload_0         
	//  174  363:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//  175  366:aload_0         
	//  176  367:getfield        #169 <Field RecyclerView mRecyclerView>
	//  177  370:aload           11
	//  178  372:invokevirtual   #253 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
				flag = false;
	//  179  375:iconst_0        
	//  180  376:istore          7
			}
			mSelected = null;
	//  181  378:aload_0         
	//  182  379:aconst_null     
	//  183  380:putfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
		} else
	//* 184  383:goto            389
		{
			flag = false;
	//  185  386:iconst_0        
	//  186  387:istore          7
		}
		if(viewholder != null)
	//* 187  389:aload_1         
	//* 188  390:ifnull          478
		{
			mSelectedFlags = (mCallback.getAbsoluteMovementFlags(mRecyclerView, viewholder) & (1 << 8 * i + 8) - 1) >> mActionState * 8;
	//  189  393:aload_0         
	//  190  394:aload_0         
	//  191  395:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//  192  398:aload_0         
	//  193  399:getfield        #169 <Field RecyclerView mRecyclerView>
	//  194  402:aload_1         
	//  195  403:invokevirtual   #484 <Method int ItemTouchHelper$Callback.getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//  196  406:iconst_1        
	//  197  407:bipush          8
	//  198  409:iload_2         
	//  199  410:imul            
	//  200  411:bipush          8
	//  201  413:iadd            
	//  202  414:ishl            
	//  203  415:iconst_1        
	//  204  416:isub            
	//  205  417:iand            
	//  206  418:aload_0         
	//  207  419:getfield        #141 <Field int mActionState>
	//  208  422:bipush          8
	//  209  424:imul            
	//  210  425:ishr            
	//  211  426:putfield        #373 <Field int mSelectedFlags>
			mSelectedStartX = viewholder.itemView.getLeft();
	//  212  429:aload_0         
	//  213  430:aload_1         
	//  214  431:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  215  434:invokevirtual   #313 <Method int View.getLeft()>
	//  216  437:i2f             
	//  217  438:putfield        #273 <Field float mSelectedStartX>
			mSelectedStartY = viewholder.itemView.getTop();
	//  218  441:aload_0         
	//  219  442:aload_1         
	//  220  443:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  221  446:invokevirtual   #307 <Method int View.getTop()>
	//  222  449:i2f             
	//  223  450:putfield        #279 <Field float mSelectedStartY>
			mSelected = viewholder;
	//  224  453:aload_0         
	//  225  454:aload_1         
	//  226  455:putfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
			if(i == 2)
	//* 227  458:iload_2         
	//* 228  459:iconst_2        
	//* 229  460:icmpne          478
				mSelected.itemView.performHapticFeedback(0);
	//  230  463:aload_0         
	//  231  464:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  232  467:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  233  470:iconst_0        
	//  234  471:invokevirtual   #677 <Method boolean View.performHapticFeedback(int)>
	//  235  474:pop             
		}
	//* 236  475:goto            478
		boolean flag1 = false;
	//  237  478:iconst_0        
	//  238  479:istore          10
		viewholder = ((android.support.v7.widget.RecyclerView.ViewHolder) (mRecyclerView.getParent()));
	//  239  481:aload_0         
	//  240  482:getfield        #169 <Field RecyclerView mRecyclerView>
	//  241  485:invokevirtual   #678 <Method ViewParent RecyclerView.getParent()>
	//  242  488:astore_1        
		if(viewholder != null)
	//* 243  489:aload_1         
	//* 244  490:ifnull          511
		{
			if(mSelected != null)
	//* 245  493:aload_0         
	//* 246  494:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 247  497:ifnull          503
				flag1 = true;
	//  248  500:iconst_1        
	//  249  501:istore          10
			((ViewParent) (viewholder)).requestDisallowInterceptTouchEvent(flag1);
	//  250  503:aload_1         
	//  251  504:iload           10
	//  252  506:invokeinterface #684 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		}
		if(!flag)
	//* 253  511:iload           7
	//* 254  513:ifne            526
			mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
	//  255  516:aload_0         
	//  256  517:getfield        #169 <Field RecyclerView mRecyclerView>
	//  257  520:invokevirtual   #292 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//  258  523:invokevirtual   #687 <Method void android.support.v7.widget.RecyclerView$LayoutManager.requestSimpleAnimationsInNextLayout()>
		mCallback.onSelectedChanged(mSelected, mActionState);
	//  259  526:aload_0         
	//  260  527:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//  261  530:aload_0         
	//  262  531:getfield        #137 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  263  534:aload_0         
	//  264  535:getfield        #141 <Field int mActionState>
	//  265  538:invokevirtual   #690 <Method void ItemTouchHelper$Callback.onSelectedChanged(android.support.v7.widget.RecyclerView$ViewHolder, int)>
		mRecyclerView.invalidate();
	//  266  541:aload_0         
	//  267  542:getfield        #169 <Field RecyclerView mRecyclerView>
	//  268  545:invokevirtual   #693 <Method void RecyclerView.invalidate()>
	//  269  548:return          
	}

	public void startDrag(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(!mCallback.hasDragFlag(mRecyclerView, viewholder))
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//*   2    4:aload_0         
	//*   3    5:getfield        #169 <Field RecyclerView mRecyclerView>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #698 <Method boolean ItemTouchHelper$Callback.hasDragFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*   6   12:ifne            25
		{
			Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
	//    7   15:ldc1            #73  <String "ItemTouchHelper">
	//    8   17:ldc2            #700 <String "Start drag has been called but dragging is not enabled">
	//    9   20:invokestatic    #706 <Method int Log.e(String, String)>
	//   10   23:pop             
			return;
	//   11   24:return          
		}
		if(viewholder.itemView.getParent() != mRecyclerView)
	//*  12   25:aload_1         
	//*  13   26:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  14   29:invokevirtual   #652 <Method ViewParent View.getParent()>
	//*  15   32:aload_0         
	//*  16   33:getfield        #169 <Field RecyclerView mRecyclerView>
	//*  17   36:if_acmpeq       49
		{
			Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
	//   18   39:ldc1            #73  <String "ItemTouchHelper">
	//   19   41:ldc2            #708 <String "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.">
	//   20   44:invokestatic    #706 <Method int Log.e(String, String)>
	//   21   47:pop             
			return;
	//   22   48:return          
		} else
		{
			obtainVelocityTracker();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #710 <Method void obtainVelocityTracker()>
			mDy = 0.0F;
	//   25   53:aload_0         
	//   26   54:fconst_0        
	//   27   55:putfield        #221 <Field float mDy>
			mDx = 0.0F;
	//   28   58:aload_0         
	//   29   59:fconst_0        
	//   30   60:putfield        #179 <Field float mDx>
			select(viewholder, 2);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:iconst_2        
	//   34   66:invokevirtual   #491 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return;
	//   35   69:return          
		}
	}

	public void startSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(!mCallback.hasSwipeFlag(mRecyclerView, viewholder))
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field ItemTouchHelper$Callback mCallback>
	//*   2    4:aload_0         
	//*   3    5:getfield        #169 <Field RecyclerView mRecyclerView>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #714 <Method boolean ItemTouchHelper$Callback.hasSwipeFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*   6   12:ifne            25
		{
			Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
	//    7   15:ldc1            #73  <String "ItemTouchHelper">
	//    8   17:ldc2            #716 <String "Start swipe has been called but swiping is not enabled">
	//    9   20:invokestatic    #706 <Method int Log.e(String, String)>
	//   10   23:pop             
			return;
	//   11   24:return          
		}
		if(viewholder.itemView.getParent() != mRecyclerView)
	//*  12   25:aload_1         
	//*  13   26:getfield        #284 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  14   29:invokevirtual   #652 <Method ViewParent View.getParent()>
	//*  15   32:aload_0         
	//*  16   33:getfield        #169 <Field RecyclerView mRecyclerView>
	//*  17   36:if_acmpeq       49
		{
			Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
	//   18   39:ldc1            #73  <String "ItemTouchHelper">
	//   19   41:ldc2            #718 <String "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.">
	//   20   44:invokestatic    #706 <Method int Log.e(String, String)>
	//   21   47:pop             
			return;
	//   22   48:return          
		} else
		{
			obtainVelocityTracker();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #710 <Method void obtainVelocityTracker()>
			mDy = 0.0F;
	//   25   53:aload_0         
	//   26   54:fconst_0        
	//   27   55:putfield        #221 <Field float mDy>
			mDx = 0.0F;
	//   28   58:aload_0         
	//   29   59:fconst_0        
	//   30   60:putfield        #179 <Field float mDx>
			select(viewholder, 1);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:iconst_1        
	//   34   66:invokevirtual   #491 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return;
	//   35   69:return          
		}
	}

	void updateDxDy(MotionEvent motionevent, int i, int j)
	{
		float f = motionevent.getX(j);
	//    0    0:aload_1         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #349 <Method float MotionEvent.getX(int)>
	//    3    5:fstore          4
		float f1 = motionevent.getY(j);
	//    4    7:aload_1         
	//    5    8:iload_3         
	//    6    9:invokevirtual   #354 <Method float MotionEvent.getY(int)>
	//    7   12:fstore          5
		mDx = f - mInitialTouchX;
	//    8   14:aload_0         
	//    9   15:fload           4
	//   10   17:aload_0         
	//   11   18:getfield        #351 <Field float mInitialTouchX>
	//   12   21:fsub            
	//   13   22:putfield        #179 <Field float mDx>
		mDy = f1 - mInitialTouchY;
	//   14   25:aload_0         
	//   15   26:fload           5
	//   16   28:aload_0         
	//   17   29:getfield        #356 <Field float mInitialTouchY>
	//   18   32:fsub            
	//   19   33:putfield        #221 <Field float mDy>
		if((i & 4) == 0)
	//*  20   36:iload_2         
	//*  21   37:iconst_4        
	//*  22   38:iand            
	//*  23   39:ifne            54
			mDx = Math.max(0.0F, mDx);
	//   24   42:aload_0         
	//   25   43:fconst_0        
	//   26   44:aload_0         
	//   27   45:getfield        #179 <Field float mDx>
	//   28   48:invokestatic    #724 <Method float Math.max(float, float)>
	//   29   51:putfield        #179 <Field float mDx>
		if((i & 8) == 0)
	//*  30   54:iload_2         
	//*  31   55:bipush          8
	//*  32   57:iand            
	//*  33   58:ifne            73
			mDx = Math.min(0.0F, mDx);
	//   34   61:aload_0         
	//   35   62:fconst_0        
	//   36   63:aload_0         
	//   37   64:getfield        #179 <Field float mDx>
	//   38   67:invokestatic    #727 <Method float Math.min(float, float)>
	//   39   70:putfield        #179 <Field float mDx>
		if((i & 1) == 0)
	//*  40   73:iload_2         
	//*  41   74:iconst_1        
	//*  42   75:iand            
	//*  43   76:ifne            91
			mDy = Math.max(0.0F, mDy);
	//   44   79:aload_0         
	//   45   80:fconst_0        
	//   46   81:aload_0         
	//   47   82:getfield        #221 <Field float mDy>
	//   48   85:invokestatic    #724 <Method float Math.max(float, float)>
	//   49   88:putfield        #221 <Field float mDy>
		if((i & 2) == 0)
	//*  50   91:iload_2         
	//*  51   92:iconst_2        
	//*  52   93:iand            
	//*  53   94:ifne            109
			mDy = Math.min(0.0F, mDy);
	//   54   97:aload_0         
	//   55   98:fconst_0        
	//   56   99:aload_0         
	//   57  100:getfield        #221 <Field float mDy>
	//   58  103:invokestatic    #727 <Method float Math.min(float, float)>
	//   59  106:putfield        #221 <Field float mDy>
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
	private ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
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
		//*  10   18:ifne            217
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
		//*  33   69:ifnonnull       291
				{
					recyclerview = ((RecyclerView) (findAnimation(motionevent)));
		//   34   72:aload_0         
		//   35   73:getfield        #14  <Field ItemTouchHelper this$0>
		//   36   76:aload_2         
		//   37   77:invokevirtual   #69  <Method ItemTouchHelper$RecoverAnimation ItemTouchHelper.findAnimation(MotionEvent)>
		//   38   80:astore_1        
					if(recyclerview != null)
		//*  39   81:aload_1         
		//*  40   82:ifnull          291
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
		//* 100  214:goto            291
			if(i != 3 && i != 1)
		//* 101  217:iload_3         
		//* 102  218:iconst_3        
		//* 103  219:icmpeq          274
		//* 104  222:iload_3         
		//* 105  223:iconst_1        
		//* 106  224:icmpne          230
		//* 107  227:goto            274
			{
				if(mActivePointerId != -1)
		//* 108  230:aload_0         
		//* 109  231:getfield        #14  <Field ItemTouchHelper this$0>
		//* 110  234:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//* 111  237:iconst_m1       
		//* 112  238:icmpeq          291
				{
					int j = motionevent.findPointerIndex(mActivePointerId);
		//  113  241:aload_2         
		//  114  242:aload_0         
		//  115  243:getfield        #14  <Field ItemTouchHelper this$0>
		//  116  246:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//  117  249:invokevirtual   #131 <Method int MotionEvent.findPointerIndex(int)>
		//  118  252:istore          4
					if(j >= 0)
		//* 119  254:iload           4
		//* 120  256:iflt            291
						checkSelectForSwipe(i, motionevent, j);
		//  121  259:aload_0         
		//  122  260:getfield        #14  <Field ItemTouchHelper this$0>
		//  123  263:iload_3         
		//  124  264:aload_2         
		//  125  265:iload           4
		//  126  267:invokevirtual   #135 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
		//  127  270:pop             
				}
			} else
		//* 128  271:goto            291
			{
				mActivePointerId = -1;
		//  129  274:aload_0         
		//  130  275:getfield        #14  <Field ItemTouchHelper this$0>
		//  131  278:iconst_m1       
		//  132  279:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
				select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
		//  133  282:aload_0         
		//  134  283:getfield        #14  <Field ItemTouchHelper this$0>
		//  135  286:aconst_null     
		//  136  287:iconst_0        
		//  137  288:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			}
			if(mVelocityTracker != null)
		//* 138  291:aload_0         
		//* 139  292:getfield        #14  <Field ItemTouchHelper this$0>
		//* 140  295:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//* 141  298:ifnull          312
				mVelocityTracker.addMovement(motionevent);
		//  142  301:aload_0         
		//  143  302:getfield        #14  <Field ItemTouchHelper this$0>
		//  144  305:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//  145  308:aload_2         
		//  146  309:invokevirtual   #145 <Method void VelocityTracker.addMovement(MotionEvent)>
			return mSelected != null;
		//  147  312:aload_0         
		//  148  313:getfield        #14  <Field ItemTouchHelper this$0>
		//  149  316:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//  150  319:ifnull          324
		//  151  322:iconst_1        
		//  152  323:ireturn         
		//  153  324:iconst_0        
		//  154  325:ireturn         
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
label0:
			{
				mGestureDetector.onTouchEvent(motionevent);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ItemTouchHelper this$0>
		//    2    4:getfield        #24  <Field GestureDetectorCompat ItemTouchHelper.mGestureDetector>
		//    3    7:aload_2         
		//    4    8:invokevirtual   #30  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
		//    5   11:pop             
				if(mVelocityTracker != null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #14  <Field ItemTouchHelper this$0>
		//*   8   16:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//*   9   19:ifnull          33
					mVelocityTracker.addMovement(motionevent);
		//   10   22:aload_0         
		//   11   23:getfield        #14  <Field ItemTouchHelper this$0>
		//   12   26:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//   13   29:aload_2         
		//   14   30:invokevirtual   #145 <Method void VelocityTracker.addMovement(MotionEvent)>
				if(mActivePointerId == -1)
		//*  15   33:aload_0         
		//*  16   34:getfield        #14  <Field ItemTouchHelper this$0>
		//*  17   37:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//*  18   40:iconst_m1       
		//*  19   41:icmpne          45
					return;
		//   20   44:return          
				int j = motionevent.getActionMasked();
		//   21   45:aload_2         
		//   22   46:invokevirtual   #36  <Method int MotionEvent.getActionMasked()>
		//   23   49:istore          4
				int k = motionevent.findPointerIndex(mActivePointerId);
		//   24   51:aload_2         
		//   25   52:aload_0         
		//   26   53:getfield        #14  <Field ItemTouchHelper this$0>
		//   27   56:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//   28   59:invokevirtual   #131 <Method int MotionEvent.findPointerIndex(int)>
		//   29   62:istore          5
				if(k >= 0)
		//*  30   64:iload           5
		//*  31   66:iflt            82
					checkSelectForSwipe(j, motionevent, k);
		//   32   69:aload_0         
		//   33   70:getfield        #14  <Field ItemTouchHelper this$0>
		//   34   73:iload           4
		//   35   75:aload_2         
		//   36   76:iload           5
		//   37   78:invokevirtual   #135 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
		//   38   81:pop             
				recyclerview = ((RecyclerView) (mSelected));
		//   39   82:aload_0         
		//   40   83:getfield        #14  <Field ItemTouchHelper this$0>
		//   41   86:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//   42   89:astore_1        
				if(recyclerview == null)
		//*  43   90:aload_1         
		//*  44   91:ifnonnull       95
					return;
		//   45   94:return          
				int i = 0;
		//   46   95:iconst_0        
		//   47   96:istore_3        
				if(j != 6)
		//*  48   97:iload           4
		//*  49   99:bipush          6
		//*  50  101:icmpeq          245
				{
					switch(j)
		//*  51  104:iload           4
					{
		//*  52  106:tableswitch     1 3: default 132
		//		               1 227
		//		               2 156
		//		               3 133
					default:
						return;
		//   53  132:return          

					case 1: // '\001'
						break;

					case 3: // '\003'
						if(mVelocityTracker != null)
		//*  54  133:aload_0         
		//*  55  134:getfield        #14  <Field ItemTouchHelper this$0>
		//*  56  137:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//*  57  140:ifnull          227
							mVelocityTracker.clear();
		//   58  143:aload_0         
		//   59  144:getfield        #14  <Field ItemTouchHelper this$0>
		//   60  147:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//   61  150:invokevirtual   #151 <Method void VelocityTracker.clear()>
						break;
		//   62  153:goto            227

					case 2: // '\002'
						if(k >= 0)
		//*  63  156:iload           5
		//*  64  158:iflt            303
						{
							updateDxDy(motionevent, mSelectedFlags, k);
		//   65  161:aload_0         
		//   66  162:getfield        #14  <Field ItemTouchHelper this$0>
		//   67  165:aload_2         
		//   68  166:aload_0         
		//   69  167:getfield        #14  <Field ItemTouchHelper this$0>
		//   70  170:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
		//   71  173:iload           5
		//   72  175:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
							moveIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (recyclerview)));
		//   73  178:aload_0         
		//   74  179:getfield        #14  <Field ItemTouchHelper this$0>
		//   75  182:aload_1         
		//   76  183:invokevirtual   #155 <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
							mRecyclerView.removeCallbacks(mScrollRunnable);
		//   77  186:aload_0         
		//   78  187:getfield        #14  <Field ItemTouchHelper this$0>
		//   79  190:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   80  193:aload_0         
		//   81  194:getfield        #14  <Field ItemTouchHelper this$0>
		//   82  197:getfield        #159 <Field Runnable ItemTouchHelper.mScrollRunnable>
		//   83  200:invokevirtual   #165 <Method boolean RecyclerView.removeCallbacks(Runnable)>
		//   84  203:pop             
							mScrollRunnable.run();
		//   85  204:aload_0         
		//   86  205:getfield        #14  <Field ItemTouchHelper this$0>
		//   87  208:getfield        #159 <Field Runnable ItemTouchHelper.mScrollRunnable>
		//   88  211:invokeinterface #170 <Method void Runnable.run()>
							mRecyclerView.invalidate();
		//   89  216:aload_0         
		//   90  217:getfield        #14  <Field ItemTouchHelper this$0>
		//   91  220:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   92  223:invokevirtual   #173 <Method void RecyclerView.invalidate()>
							return;
		//   93  226:return          
						}
						break label0;
					}
					select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
		//   94  227:aload_0         
		//   95  228:getfield        #14  <Field ItemTouchHelper this$0>
		//   96  231:aconst_null     
		//   97  232:iconst_0        
		//   98  233:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
					mActivePointerId = -1;
		//   99  236:aload_0         
		//  100  237:getfield        #14  <Field ItemTouchHelper this$0>
		//  101  240:iconst_m1       
		//  102  241:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
					return;
		//  103  244:return          
				}
				j = motionevent.getActionIndex();
		//  104  245:aload_2         
		//  105  246:invokevirtual   #176 <Method int MotionEvent.getActionIndex()>
		//  106  249:istore          4
				if(motionevent.getPointerId(j) == mActivePointerId)
		//* 107  251:aload_2         
		//* 108  252:iload           4
		//* 109  254:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
		//* 110  257:aload_0         
		//* 111  258:getfield        #14  <Field ItemTouchHelper this$0>
		//* 112  261:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//* 113  264:icmpne          303
				{
					if(j == 0)
		//* 114  267:iload           4
		//* 115  269:ifne            274
						i = 1;
		//  116  272:iconst_1        
		//  117  273:istore_3        
					mActivePointerId = motionevent.getPointerId(i);
		//  118  274:aload_0         
		//  119  275:getfield        #14  <Field ItemTouchHelper this$0>
		//  120  278:aload_2         
		//  121  279:iload_3         
		//  122  280:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
		//  123  283:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
					updateDxDy(motionevent, mSelectedFlags, j);
		//  124  286:aload_0         
		//  125  287:getfield        #14  <Field ItemTouchHelper this$0>
		//  126  290:aload_2         
		//  127  291:aload_0         
		//  128  292:getfield        #14  <Field ItemTouchHelper this$0>
		//  129  295:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
		//  130  298:iload           4
		//  131  300:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
				}
			}
		//  132  303:return          
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
