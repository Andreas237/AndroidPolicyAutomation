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
		//   26   31:ldc1            #63  <Int 0xfff3f3f3>
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
		//*   1    1:getfield        #60  <Field int mCachedMaxScrollSpeed>
		//*   2    4:iconst_m1       
		//*   3    5:icmpne          22
				mCachedMaxScrollSpeed = recyclerview.getResources().getDimensionPixelSize(android.support.v7.recyclerview.R.dimen.item_touch_helper_max_drag_scroll_per_frame);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #73  <Method Resources RecyclerView.getResources()>
		//    7   13:getstatic       #78  <Field int android.support.v7.recyclerview.R$dimen.item_touch_helper_max_drag_scroll_per_frame>
		//    8   16:invokevirtual   #84  <Method int Resources.getDimensionPixelSize(int)>
		//    9   19:putfield        #60  <Field int mCachedMaxScrollSpeed>
			return mCachedMaxScrollSpeed;
		//   10   22:aload_0         
		//   11   23:getfield        #60  <Field int mCachedMaxScrollSpeed>
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
		//    4    4:invokestatic    #88  <Method int makeFlag(int, int)>
		//    5    7:iconst_1        
		//    6    8:iload_1         
		//    7    9:invokestatic    #88  <Method int makeFlag(int, int)>
		//    8   12:ior             
		//    9   13:iconst_2        
		//   10   14:iload_0         
		//   11   15:invokestatic    #88  <Method int makeFlag(int, int)>
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
			int j2 = viewholder.itemView.getWidth();
		//    0    0:aload_1         
		//    1    1:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    2    4:invokevirtual   #104 <Method int View.getWidth()>
		//    3    7:istore          9
			int k2 = viewholder.itemView.getHeight();
		//    4    9:aload_1         
		//    5   10:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    6   13:invokevirtual   #107 <Method int View.getHeight()>
		//    7   16:istore          10
			android.support.v7.widget.RecyclerView.ViewHolder viewholder3 = null;
		//    8   18:aconst_null     
		//    9   19:astore          16
			int l = -1;
		//   10   21:iconst_m1       
		//   11   22:istore          6
			int l2 = i - viewholder.itemView.getLeft();
		//   12   24:iload_3         
		//   13   25:aload_1         
		//   14   26:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   15   29:invokevirtual   #110 <Method int View.getLeft()>
		//   16   32:isub            
		//   17   33:istore          11
			int i3 = j - viewholder.itemView.getTop();
		//   18   35:iload           4
		//   19   37:aload_1         
		//   20   38:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   21   41:invokevirtual   #113 <Method int View.getTop()>
		//   22   44:isub            
		//   23   45:istore          12
			int j3 = list.size();
		//   24   47:aload_2         
		//   25   48:invokeinterface #118 <Method int List.size()>
		//   26   53:istore          13
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
		//   34   68:invokeinterface #122 <Method Object List.get(int)>
		//   35   73:checkcast       #94  <Class android.support.v7.widget.RecyclerView$ViewHolder>
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
		//   44   93:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   45   96:invokevirtual   #125 <Method int View.getRight()>
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
		//*  62  129:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  63  132:invokevirtual   #125 <Method int View.getRight()>
		//*  64  135:aload_1         
		//*  65  136:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  66  139:invokevirtual   #125 <Method int View.getRight()>
		//*  67  142:icmple          175
						{
							j1 = Math.abs(j1);
		//   68  145:iload           8
		//   69  147:invokestatic    #130 <Method int Math.abs(int)>
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
								k = j1;
		//   78  167:iload           8
		//   79  169:istore          5
								viewholder2 = viewholder1;
		//   80  171:aload           14
		//   81  173:astore          15
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
		//   89  190:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   90  193:invokevirtual   #110 <Method int View.getLeft()>
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
		//* 105  223:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 106  226:invokevirtual   #110 <Method int View.getLeft()>
		//* 107  229:aload_1         
		//* 108  230:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 109  233:invokevirtual   #110 <Method int View.getLeft()>
		//* 110  236:icmpge          269
						{
							k1 = Math.abs(k1);
		//  111  239:iload           8
		//  112  241:invokestatic    #130 <Method int Math.abs(int)>
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
								l = k1;
		//  121  261:iload           8
		//  122  263:istore          6
								viewholder3 = viewholder1;
		//  123  265:aload           14
		//  124  267:astore          16
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
		//  132  284:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  133  287:invokevirtual   #113 <Method int View.getTop()>
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
		//* 148  318:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 149  321:invokevirtual   #113 <Method int View.getTop()>
		//* 150  324:aload_1         
		//* 151  325:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 152  328:invokevirtual   #113 <Method int View.getTop()>
		//* 153  331:icmpge          364
						{
							l1 = Math.abs(l1);
		//  154  334:iload           8
		//  155  336:invokestatic    #130 <Method int Math.abs(int)>
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
								k = l1;
		//  164  356:iload           8
		//  165  358:istore          5
								viewholder2 = viewholder1;
		//  166  360:aload           14
		//  167  362:astore          15
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
		//  175  379:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  176  382:invokevirtual   #133 <Method int View.getBottom()>
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
		//  193  416:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  194  419:invokevirtual   #133 <Method int View.getBottom()>
		//  195  422:aload_1         
		//  196  423:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  197  426:invokevirtual   #133 <Method int View.getBottom()>
		//  198  429:icmple          462
				i2 = Math.abs(i2);
		//  199  432:iload           8
		//  200  434:invokestatic    #130 <Method int Math.abs(int)>
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
		//    2    4:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    3    7:invokeinterface #142 <Method void ItemTouchUIUtil.clearView(View)>
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
		//   26   31:ldc1            #144 <Int 0xffcfcfcf>
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
		//    4    4:invokevirtual   #149 <Method int getMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//    5    7:aload_1         
		//    6    8:invokestatic    #155 <Method int ViewCompat.getLayoutDirection(View)>
		//    7   11:invokevirtual   #157 <Method int convertToAbsoluteDirection(int, int)>
		//    8   14:ireturn         
		}

		public long getAnimationDuration(RecyclerView recyclerview, int i, float f, float f1)
		{
			recyclerview = ((RecyclerView) (recyclerview.getItemAnimator()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #163 <Method android.support.v7.widget.RecyclerView$ItemAnimator RecyclerView.getItemAnimator()>
		//    2    4:astore_1        
			if(recyclerview == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       23
				return i != 8 ? 250L : 200L;
		//    5    9:iload_2         
		//    6   10:bipush          8
		//    7   12:icmpne          19
		//    8   15:ldc2w           #164 <Long 200L>
		//    9   18:lreturn         
		//   10   19:ldc2w           #166 <Long 250L>
		//   11   22:lreturn         
			if(i == 8)
		//*  12   23:iload_2         
		//*  13   24:bipush          8
		//*  14   26:icmpne          34
				return ((android.support.v7.widget.RecyclerView.ItemAnimator) (recyclerview)).getMoveDuration();
		//   15   29:aload_1         
		//   16   30:invokevirtual   #173 <Method long android.support.v7.widget.RecyclerView$ItemAnimator.getMoveDuration()>
		//   17   33:lreturn         
			else
				return ((android.support.v7.widget.RecyclerView.ItemAnimator) (recyclerview)).getRemoveDuration();
		//   18   34:aload_1         
		//   19   35:invokevirtual   #176 <Method long android.support.v7.widget.RecyclerView$ItemAnimator.getRemoveDuration()>
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
		//    0    0:ldc1            #180 <Float 0.5F>
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
		//    0    0:ldc1            #180 <Float 0.5F>
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
			return (0xff0000 & getAbsoluteMovementFlags(recyclerview, viewholder)) != 0;
		//    0    0:ldc1            #187 <Int 0xff0000>
		//    1    2:aload_0         
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #189 <Method int getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//    5    8:iand            
		//    6    9:ifeq            14
		//    7   12:iconst_1        
		//    8   13:ireturn         
		//    9   14:iconst_0        
		//   10   15:ireturn         
		}

		boolean hasSwipeFlag(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return (0xff00 & getAbsoluteMovementFlags(recyclerview, viewholder)) != 0;
		//    0    0:ldc1            #191 <Int 65280>
		//    1    2:aload_0         
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #189 <Method int getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
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
		//    2    2:invokespecial   #195 <Method int getMaxDragScroll(RecyclerView)>
		//    3    5:istore          4
			int i1 = Math.abs(j);
		//    4    7:iload_3         
		//    5    8:invokestatic    #130 <Method int Math.abs(int)>
		//    6   11:istore          8
			int j1 = (int)Math.signum(j);
		//    7   13:iload_3         
		//    8   14:i2f             
		//    9   15:invokestatic    #198 <Method float Math.signum(float)>
		//   10   18:f2i             
		//   11   19:istore          9
			float f = Math.min(1.0F, ((float)i1 * 1.0F) / (float)i);
		//   12   21:fconst_1        
		//   13   22:iload           8
		//   14   24:i2f             
		//   15   25:fconst_1        
		//   16   26:fmul            
		//   17   27:iload_2         
		//   18   28:i2f             
		//   19   29:fdiv            
		//   20   30:invokestatic    #202 <Method float Math.min(float, float)>
		//   21   33:fstore          7
			i = (int)((float)(j1 * k) * sDragViewScrollCapInterpolator.getInterpolation(f));
		//   22   35:iload           9
		//   23   37:iload           4
		//   24   39:imul            
		//   25   40:i2f             
		//   26   41:getstatic       #40  <Field Interpolator sDragViewScrollCapInterpolator>
		//   27   44:fload           7
		//   28   46:invokeinterface #207 <Method float Interpolator.getInterpolation(float)>
		//   29   51:fmul            
		//   30   52:f2i             
		//   31   53:istore_2        
			if(l > 2000L)
		//*  32   54:lload           5
		//*  33   56:ldc2w           #21  <Long 2000L>
		//*  34   59:lcmp            
		//*  35   60:ifle            69
				f = 1.0F;
		//   36   63:fconst_1        
		//   37   64:fstore          7
			else
		//*  38   66:goto            77
				f = (float)l / 2000F;
		//   39   69:lload           5
		//   40   71:l2f             
		//   41   72:ldc1            #208 <Float 2000F>
		//   42   74:fdiv            
		//   43   75:fstore          7
			i = (int)((float)i * sDragScrollInterpolator.getInterpolation(f));
		//   44   77:iload_2         
		//   45   78:i2f             
		//   46   79:getstatic       #37  <Field Interpolator sDragScrollInterpolator>
		//   47   82:fload           7
		//   48   84:invokeinterface #207 <Method float Interpolator.getInterpolation(float)>
		//   49   89:fmul            
		//   50   90:f2i             
		//   51   91:istore_2        
			if(i == 0)
		//*  52   92:iload_2         
		//*  53   93:ifne            104
				return j <= 0 ? -1 : 1;
		//   54   96:iload_3         
		//   55   97:ifle            102
		//   56  100:iconst_1        
		//   57  101:ireturn         
		//   58  102:iconst_m1       
		//   59  103:ireturn         
			else
				return i;
		//   60  104:iload_2         
		//   61  105:ireturn         
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
		//    4    6:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    5    9:fload           4
		//    6   11:fload           5
		//    7   13:iload           6
		//    8   15:iload           7
		//    9   17:invokeinterface #217 <Method void ItemTouchUIUtil.onDraw(Canvas, RecyclerView, View, float, float, int, boolean)>
		//   10   22:return          
		}

		public void onChildDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, float f, float f1, int i, boolean flag)
		{
			sUICallback.onDrawOver(canvas, recyclerview, viewholder.itemView, f, f1, i, flag);
		//    0    0:getstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//    1    3:aload_1         
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    5    9:fload           4
		//    6   11:fload           5
		//    7   13:iload           6
		//    8   15:iload           7
		//    9   17:invokeinterface #221 <Method void ItemTouchUIUtil.onDrawOver(Canvas, RecyclerView, View, float, float, int, boolean)>
		//   10   22:return          
		}

		void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, float f, float f1)
		{
			int l = list.size();
		//    0    0:aload           4
		//    1    2:invokeinterface #118 <Method int List.size()>
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
		//   10   23:invokeinterface #122 <Method Object List.get(int)>
		//   11   28:checkcast       #224 <Class ItemTouchHelper$RecoverAnimation>
		//   12   31:astore          11
				recoveranimation.update();
		//   13   33:aload           11
		//   14   35:invokevirtual   #227 <Method void ItemTouchHelper$RecoverAnimation.update()>
				int i1 = canvas.save();
		//   15   38:aload_1         
		//   16   39:invokevirtual   #232 <Method int Canvas.save()>
		//   17   42:istore          10
				onChildDraw(canvas, recyclerview, recoveranimation.mViewHolder, recoveranimation.mX, recoveranimation.mY, recoveranimation.mActionState, false);
		//   18   44:aload_0         
		//   19   45:aload_1         
		//   20   46:aload_2         
		//   21   47:aload           11
		//   22   49:getfield        #236 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   23   52:aload           11
		//   24   54:getfield        #240 <Field float ItemTouchHelper$RecoverAnimation.mX>
		//   25   57:aload           11
		//   26   59:getfield        #243 <Field float ItemTouchHelper$RecoverAnimation.mY>
		//   27   62:aload           11
		//   28   64:getfield        #246 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
		//   29   67:iconst_0        
		//   30   68:invokevirtual   #248 <Method void onChildDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(i1);
		//   31   71:aload_1         
		//   32   72:iload           10
		//   33   74:invokevirtual   #252 <Method void Canvas.restoreToCount(int)>
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
		//   42   91:invokevirtual   #232 <Method int Canvas.save()>
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
		//   52  107:invokevirtual   #248 <Method void onChildDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(k);
		//   53  110:aload_1         
		//   54  111:iload           8
		//   55  113:invokevirtual   #252 <Method void Canvas.restoreToCount(int)>
			}
		//   56  116:return          
		}

		void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, float f, float f1)
		{
			int l = list.size();
		//    0    0:aload           4
		//    1    2:invokeinterface #118 <Method int List.size()>
		//    2    7:istore          9
			for(int j = 0; j < l; j++)
		//*   3    9:iconst_0        
		//*   4   10:istore          8
		//*   5   12:iload           8
		//*   6   14:iload           9
		//*   7   16:icmpge          81
			{
				RecoverAnimation recoveranimation = (RecoverAnimation)list.get(j);
		//    8   19:aload           4
		//    9   21:iload           8
		//   10   23:invokeinterface #122 <Method Object List.get(int)>
		//   11   28:checkcast       #224 <Class ItemTouchHelper$RecoverAnimation>
		//   12   31:astore          11
				int i1 = canvas.save();
		//   13   33:aload_1         
		//   14   34:invokevirtual   #232 <Method int Canvas.save()>
		//   15   37:istore          10
				onChildDrawOver(canvas, recyclerview, recoveranimation.mViewHolder, recoveranimation.mX, recoveranimation.mY, recoveranimation.mActionState, false);
		//   16   39:aload_0         
		//   17   40:aload_1         
		//   18   41:aload_2         
		//   19   42:aload           11
		//   20   44:getfield        #236 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   21   47:aload           11
		//   22   49:getfield        #240 <Field float ItemTouchHelper$RecoverAnimation.mX>
		//   23   52:aload           11
		//   24   54:getfield        #243 <Field float ItemTouchHelper$RecoverAnimation.mY>
		//   25   57:aload           11
		//   26   59:getfield        #246 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
		//   27   62:iconst_0        
		//   28   63:invokevirtual   #255 <Method void onChildDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(i1);
		//   29   66:aload_1         
		//   30   67:iload           10
		//   31   69:invokevirtual   #252 <Method void Canvas.restoreToCount(int)>
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
		//   40   86:invokevirtual   #232 <Method int Canvas.save()>
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
		//   50  102:invokevirtual   #255 <Method void onChildDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(k);
		//   51  105:aload_1         
		//   52  106:iload           8
		//   53  108:invokevirtual   #252 <Method void Canvas.restoreToCount(int)>
			}
			boolean flag = false;
		//   54  111:iconst_0        
		//   55  112:istore          8
			for(i = l - 1; i >= 0; i--)
		//*  56  114:iload           9
		//*  57  116:iconst_1        
		//*  58  117:isub            
		//*  59  118:istore          5
		//*  60  120:iload           5
		//*  61  122:iflt            184
			{
				canvas = ((Canvas) ((RecoverAnimation)list.get(i)));
		//   62  125:aload           4
		//   63  127:iload           5
		//   64  129:invokeinterface #122 <Method Object List.get(int)>
		//   65  134:checkcast       #224 <Class ItemTouchHelper$RecoverAnimation>
		//   66  137:astore_1        
				if(((RecoverAnimation) (canvas)).mEnded && !((RecoverAnimation) (canvas)).mIsPendingCleanup)
		//*  67  138:aload_1         
		//*  68  139:getfield        #259 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
		//*  69  142:ifeq            165
		//*  70  145:aload_1         
		//*  71  146:getfield        #262 <Field boolean ItemTouchHelper$RecoverAnimation.mIsPendingCleanup>
		//*  72  149:ifne            165
				{
					list.remove(i);
		//   73  152:aload           4
		//   74  154:iload           5
		//   75  156:invokeinterface #265 <Method Object List.remove(int)>
		//   76  161:pop             
					continue;
		//   77  162:goto            175
				}
				if(!((RecoverAnimation) (canvas)).mEnded)
		//*  78  165:aload_1         
		//*  79  166:getfield        #259 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
		//*  80  169:ifne            175
					flag = true;
		//   81  172:iconst_1        
		//   82  173:istore          8
			}

		//   83  175:iload           5
		//   84  177:iconst_1        
		//   85  178:isub            
		//   86  179:istore          5
		//*  87  181:goto            120
			if(flag)
		//*  88  184:iload           8
		//*  89  186:ifeq            193
				recyclerview.invalidate();
		//   90  189:aload_2         
		//   91  190:invokevirtual   #268 <Method void RecyclerView.invalidate()>
		//   92  193:return          
		}

		public abstract boolean onMove(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1);

		public void onMoved(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, android.support.v7.widget.RecyclerView.ViewHolder viewholder1, int j, int k, int l)
		{
			android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = recyclerview.getLayoutManager();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #275 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
		//    2    4:astore          8
			if(layoutmanager instanceof ViewDropHandler)
		//*   3    6:aload           8
		//*   4    8:instanceof      #277 <Class ItemTouchHelper$ViewDropHandler>
		//*   5   11:ifeq            38
			{
				((ViewDropHandler)layoutmanager).prepareForDrop(viewholder.itemView, viewholder1.itemView, k, l);
		//    6   14:aload           8
		//    7   16:checkcast       #277 <Class ItemTouchHelper$ViewDropHandler>
		//    8   19:aload_2         
		//    9   20:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   10   23:aload           4
		//   11   25:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   12   28:iload           6
		//   13   30:iload           7
		//   14   32:invokeinterface #281 <Method void ItemTouchHelper$ViewDropHandler.prepareForDrop(View, View, int, int)>
				return;
		//   15   37:return          
			}
			if(layoutmanager.canScrollHorizontally())
		//*  16   38:aload           8
		//*  17   40:invokevirtual   #286 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
		//*  18   43:ifeq            97
			{
				if(layoutmanager.getDecoratedLeft(viewholder1.itemView) <= recyclerview.getPaddingLeft())
		//*  19   46:aload           8
		//*  20   48:aload           4
		//*  21   50:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  22   53:invokevirtual   #289 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedLeft(View)>
		//*  23   56:aload_1         
		//*  24   57:invokevirtual   #292 <Method int RecyclerView.getPaddingLeft()>
		//*  25   60:icmpgt          69
					recyclerview.scrollToPosition(j);
		//   26   63:aload_1         
		//   27   64:iload           5
		//   28   66:invokevirtual   #295 <Method void RecyclerView.scrollToPosition(int)>
				if(layoutmanager.getDecoratedRight(viewholder1.itemView) >= recyclerview.getWidth() - recyclerview.getPaddingRight())
		//*  29   69:aload           8
		//*  30   71:aload           4
		//*  31   73:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  32   76:invokevirtual   #298 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedRight(View)>
		//*  33   79:aload_1         
		//*  34   80:invokevirtual   #299 <Method int RecyclerView.getWidth()>
		//*  35   83:aload_1         
		//*  36   84:invokevirtual   #302 <Method int RecyclerView.getPaddingRight()>
		//*  37   87:isub            
		//*  38   88:icmplt          97
					recyclerview.scrollToPosition(j);
		//   39   91:aload_1         
		//   40   92:iload           5
		//   41   94:invokevirtual   #295 <Method void RecyclerView.scrollToPosition(int)>
			}
			if(layoutmanager.canScrollVertically())
		//*  42   97:aload           8
		//*  43   99:invokevirtual   #305 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
		//*  44  102:ifeq            156
			{
				if(layoutmanager.getDecoratedTop(viewholder1.itemView) <= recyclerview.getPaddingTop())
		//*  45  105:aload           8
		//*  46  107:aload           4
		//*  47  109:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  48  112:invokevirtual   #308 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedTop(View)>
		//*  49  115:aload_1         
		//*  50  116:invokevirtual   #311 <Method int RecyclerView.getPaddingTop()>
		//*  51  119:icmpgt          128
					recyclerview.scrollToPosition(j);
		//   52  122:aload_1         
		//   53  123:iload           5
		//   54  125:invokevirtual   #295 <Method void RecyclerView.scrollToPosition(int)>
				if(layoutmanager.getDecoratedBottom(viewholder1.itemView) >= recyclerview.getHeight() - recyclerview.getPaddingBottom())
		//*  55  128:aload           8
		//*  56  130:aload           4
		//*  57  132:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  58  135:invokevirtual   #314 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedBottom(View)>
		//*  59  138:aload_1         
		//*  60  139:invokevirtual   #315 <Method int RecyclerView.getHeight()>
		//*  61  142:aload_1         
		//*  62  143:invokevirtual   #318 <Method int RecyclerView.getPaddingBottom()>
		//*  63  146:isub            
		//*  64  147:icmplt          156
					recyclerview.scrollToPosition(j);
		//   65  150:aload_1         
		//   66  151:iload           5
		//   67  153:invokevirtual   #295 <Method void RecyclerView.scrollToPosition(int)>
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
		//    4    8:getfield        #98  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    5   11:invokeinterface #323 <Method void ItemTouchUIUtil.onSelected(View)>
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
				sUICallback = ((ItemTouchUIUtil) (new ItemTouchUIUtilImpl.Lollipop()));
		//   11   28:new             #47  <Class ItemTouchUIUtilImpl$Lollipop>
		//   12   31:dup             
		//   13   32:invokespecial   #48  <Method void ItemTouchUIUtilImpl$Lollipop()>
		//   14   35:putstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//   15   38:return          
			else
			if(android.os.Build.VERSION.SDK_INT >= 11)
		//*  16   39:getstatic       #45  <Field int android.os.Build$VERSION.SDK_INT>
		//*  17   42:bipush          11
		//*  18   44:icmplt          58
				sUICallback = ((ItemTouchUIUtil) (new ItemTouchUIUtilImpl.Honeycomb()));
		//   19   47:new             #52  <Class ItemTouchUIUtilImpl$Honeycomb>
		//   20   50:dup             
		//   21   51:invokespecial   #53  <Method void ItemTouchUIUtilImpl$Honeycomb()>
		//   22   54:putstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//   23   57:return          
			else
				sUICallback = ((ItemTouchUIUtil) (new ItemTouchUIUtilImpl.Gingerbread()));
		//   24   58:new             #55  <Class ItemTouchUIUtilImpl$Gingerbread>
		//   25   61:dup             
		//   26   62:invokespecial   #56  <Method void ItemTouchUIUtilImpl$Gingerbread()>
		//   27   65:putstatic       #50  <Field ItemTouchUIUtil sUICallback>
		//*  28   68:return          
		}

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #58  <Method void Object()>
			mCachedMaxScrollSpeed = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #60  <Field int mCachedMaxScrollSpeed>
		//    5    9:return          
		}
	}

	class ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
	{

		public boolean onDown(MotionEvent motionevent)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void onLongPress(MotionEvent motionevent)
		{
			Object obj = ((Object) (findChildView(motionevent)));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ItemTouchHelper this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #25  <Method View ItemTouchHelper.findChildView(MotionEvent)>
		//    4    8:astore          5
			if(obj != null)
		//*   5   10:aload           5
		//*   6   12:ifnull          156
			{
				obj = ((Object) (mRecyclerView.getChildViewHolder(((View) (obj)))));
		//    7   15:aload_0         
		//    8   16:getfield        #13  <Field ItemTouchHelper this$0>
		//    9   19:getfield        #29  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   10   22:aload           5
		//   11   24:invokevirtual   #35  <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
		//   12   27:astore          5
				if(obj != null)
		//*  13   29:aload           5
		//*  14   31:ifnull          156
				{
					if(!mCallback.hasDragFlag(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
		//*  15   34:aload_0         
		//*  16   35:getfield        #13  <Field ItemTouchHelper this$0>
		//*  17   38:getfield        #39  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//*  18   41:aload_0         
		//*  19   42:getfield        #13  <Field ItemTouchHelper this$0>
		//*  20   45:getfield        #29  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//*  21   48:aload           5
		//*  22   50:invokevirtual   #45  <Method boolean ItemTouchHelper$Callback.hasDragFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//*  23   53:ifne            57
						return;
		//   24   56:return          
					if(motionevent.getPointerId(0) == mActivePointerId)
		//*  25   57:aload_1         
		//*  26   58:iconst_0        
		//*  27   59:invokevirtual   #51  <Method int MotionEvent.getPointerId(int)>
		//*  28   62:aload_0         
		//*  29   63:getfield        #13  <Field ItemTouchHelper this$0>
		//*  30   66:getfield        #55  <Field int ItemTouchHelper.mActivePointerId>
		//*  31   69:icmpne          156
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
		//*  68  143:ifeq            156
							select(((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), 2);
		//   69  146:aload_0         
		//   70  147:getfield        #13  <Field ItemTouchHelper this$0>
		//   71  150:aload           5
		//   72  152:iconst_2        
		//   73  153:invokevirtual   #86  <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
					}
				}
			}
		//   74  156:return          
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

	class RecoverAnimation
		implements android.animation.Animator.AnimatorListener
	{

		public void cancel()
		{
			mValueAnimator.cancel();
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field ValueAnimator mValueAnimator>
		//    2    4:invokevirtual   #94  <Method void ValueAnimator.cancel()>
		//    3    7:return          
		}

		public void onAnimationCancel(Animator animator)
		{
			setFraction(1.0F);
		//    0    0:aload_0         
		//    1    1:fconst_1        
		//    2    2:invokevirtual   #90  <Method void setFraction(float)>
		//    3    5:return          
		}

		public void onAnimationEnd(Animator animator)
		{
			if(!mEnded)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field boolean mEnded>
		//*   2    4:ifne            15
				mViewHolder.setIsRecyclable(true);
		//    3    7:aload_0         
		//    4    8:getfield        #49  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//    5   11:iconst_1        
		//    6   12:invokevirtual   #101 <Method void android.support.v7.widget.RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			mEnded = true;
		//    7   15:aload_0         
		//    8   16:iconst_1        
		//    9   17:putfield        #43  <Field boolean mEnded>
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
		//    1    1:getfield        #65  <Field ValueAnimator mValueAnimator>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #108 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void setFraction(float f)
		{
			mFraction = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #110 <Field float mFraction>
		//    3    5:return          
		}

		public void start()
		{
			mViewHolder.setIsRecyclable(false);
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #101 <Method void android.support.v7.widget.RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			mValueAnimator.start();
		//    4    8:aload_0         
		//    5    9:getfield        #65  <Field ValueAnimator mValueAnimator>
		//    6   12:invokevirtual   #113 <Method void ValueAnimator.start()>
		//    7   15:return          
		}

		public void update()
		{
			if(mStartDx == mTargetX)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field float mStartDx>
		//*   2    4:aload_0         
		//*   3    5:getfield        #55  <Field float mTargetX>
		//*   4    8:fcmpl           
		//*   5    9:ifne            29
				mX = mViewHolder.itemView.getTranslationX();
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #49  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//    9   17:getfield        #78  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   10   20:invokevirtual   #120 <Method float View.getTranslationX()>
		//   11   23:putfield        #122 <Field float mX>
			else
		//*  12   26:goto            52
				mX = mStartDx + mFraction * (mTargetX - mStartDx);
		//   13   29:aload_0         
		//   14   30:aload_0         
		//   15   31:getfield        #51  <Field float mStartDx>
		//   16   34:aload_0         
		//   17   35:getfield        #110 <Field float mFraction>
		//   18   38:aload_0         
		//   19   39:getfield        #55  <Field float mTargetX>
		//   20   42:aload_0         
		//   21   43:getfield        #51  <Field float mStartDx>
		//   22   46:fsub            
		//   23   47:fmul            
		//   24   48:fadd            
		//   25   49:putfield        #122 <Field float mX>
			if(mStartDy == mTargetY)
		//*  26   52:aload_0         
		//*  27   53:getfield        #53  <Field float mStartDy>
		//*  28   56:aload_0         
		//*  29   57:getfield        #57  <Field float mTargetY>
		//*  30   60:fcmpl           
		//*  31   61:ifne            79
			{
				mY = mViewHolder.itemView.getTranslationY();
		//   32   64:aload_0         
		//   33   65:aload_0         
		//   34   66:getfield        #49  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//   35   69:getfield        #78  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   36   72:invokevirtual   #125 <Method float View.getTranslationY()>
		//   37   75:putfield        #127 <Field float mY>
				return;
		//   38   78:return          
			} else
			{
				mY = mStartDy + mFraction * (mTargetY - mStartDy);
		//   39   79:aload_0         
		//   40   80:aload_0         
		//   41   81:getfield        #53  <Field float mStartDy>
		//   42   84:aload_0         
		//   43   85:getfield        #110 <Field float mFraction>
		//   44   88:aload_0         
		//   45   89:getfield        #57  <Field float mTargetY>
		//   46   92:aload_0         
		//   47   93:getfield        #53  <Field float mStartDy>
		//   48   96:fsub            
		//   49   97:fmul            
		//   50   98:fadd            
		//   51   99:putfield        #127 <Field float mY>
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
		final ItemTouchHelper this$0;

		RecoverAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, int j, float f, float f1, float f2, 
				float f3)
		{
			this$0 = ItemTouchHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field ItemTouchHelper this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #39  <Method void Object()>
			mOverridden = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #41  <Field boolean mOverridden>
			mEnded = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #43  <Field boolean mEnded>
			mActionState = j;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #45  <Field int mActionState>
			mAnimationType = i;
		//   14   25:aload_0         
		//   15   26:iload_3         
		//   16   27:putfield        #47  <Field int mAnimationType>
			mViewHolder = viewholder;
		//   17   30:aload_0         
		//   18   31:aload_2         
		//   19   32:putfield        #49  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
			mStartDx = f;
		//   20   35:aload_0         
		//   21   36:fload           5
		//   22   38:putfield        #51  <Field float mStartDx>
			mStartDy = f1;
		//   23   41:aload_0         
		//   24   42:fload           6
		//   25   44:putfield        #53  <Field float mStartDy>
			mTargetX = f2;
		//   26   47:aload_0         
		//   27   48:fload           7
		//   28   50:putfield        #55  <Field float mTargetX>
			mTargetY = f3;
		//   29   53:aload_0         
		//   30   54:fload           8
		//   31   56:putfield        #57  <Field float mTargetY>
		//   32   59:aload_0         
		//   33   60:iconst_2        
		//   34   61:newarray        float[]
		//   35   63:dup             
		//   36   64:iconst_0        
		//   37   65:fconst_0        
		//   38   66:fastore         
		//   39   67:dup             
		//   40   68:iconst_1        
		//   41   69:fconst_1        
		//   42   70:fastore         
		//   43   71:invokestatic    #63  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
		//   44   74:putfield        #65  <Field ValueAnimator mValueAnimator>
			mValueAnimator.addUpdateListener(new _cls1());
		//   45   77:aload_0         
		//   46   78:getfield        #65  <Field ValueAnimator mValueAnimator>
		//   47   81:new             #11  <Class ItemTouchHelper$RecoverAnimation$1>
		//   48   84:dup             
		//   49   85:aload_0         
		//   50   86:aload_1         
		//   51   87:invokespecial   #68  <Method void ItemTouchHelper$RecoverAnimation$1(ItemTouchHelper$RecoverAnimation, ItemTouchHelper)>
		//   52   90:invokevirtual   #72  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			mValueAnimator.setTarget(((Object) (viewholder.itemView)));
		//   53   93:aload_0         
		//   54   94:getfield        #65  <Field ValueAnimator mValueAnimator>
		//   55   97:aload_2         
		//   56   98:getfield        #78  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   57  101:invokevirtual   #82  <Method void ValueAnimator.setTarget(Object)>
			mValueAnimator.addListener(((android.animation.Animator.AnimatorListener) (this)));
		//   58  104:aload_0         
		//   59  105:getfield        #65  <Field ValueAnimator mValueAnimator>
		//   60  108:aload_0         
		//   61  109:invokevirtual   #86  <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
			setFraction(0.0F);
		//   62  112:aload_0         
		//   63  113:fconst_0        
		//   64  114:invokevirtual   #90  <Method void setFraction(float)>
		//   65  117:return          
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
		if((i & 0xc) != 0)
	//*   0    0:iload_2         
	//*   1    1:bipush          12
	//*   2    3:iand            
	//*   3    4:ifeq            199
		{
			byte byte0;
			if(mDx > 0.0F)
	//*   4    7:aload_0         
	//*   5    8:getfield        #177 <Field float mDx>
	//*   6   11:fconst_0        
	//*   7   12:fcmpl           
	//*   8   13:ifle            23
				byte0 = 8;
	//    9   16:bipush          8
	//   10   18:istore          5
			else
	//*  11   20:goto            26
				byte0 = 4;
	//   12   23:iconst_4        
	//   13   24:istore          5
			if(mVelocityTracker != null && mActivePointerId > -1)
	//*  14   26:aload_0         
	//*  15   27:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*  16   30:ifnull          155
	//*  17   33:aload_0         
	//*  18   34:getfield        #137 <Field int mActivePointerId>
	//*  19   37:iconst_m1       
	//*  20   38:icmple          155
			{
				mVelocityTracker.computeCurrentVelocity(1000, mCallback.getSwipeVelocityThreshold(mMaxSwipeVelocity));
	//   21   41:aload_0         
	//   22   42:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//   23   45:sipush          1000
	//   24   48:aload_0         
	//   25   49:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   26   52:aload_0         
	//   27   53:getfield        #181 <Field float mMaxSwipeVelocity>
	//   28   56:invokevirtual   #185 <Method float ItemTouchHelper$Callback.getSwipeVelocityThreshold(float)>
	//   29   59:invokevirtual   #191 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				float f2 = mVelocityTracker.getXVelocity(mActivePointerId);
	//   30   62:aload_0         
	//   31   63:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//   32   66:aload_0         
	//   33   67:getfield        #137 <Field int mActivePointerId>
	//   34   70:invokevirtual   #195 <Method float VelocityTracker.getXVelocity(int)>
	//   35   73:fstore          4
				float f = mVelocityTracker.getYVelocity(mActivePointerId);
	//   36   75:aload_0         
	//   37   76:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//   38   79:aload_0         
	//   39   80:getfield        #137 <Field int mActivePointerId>
	//   40   83:invokevirtual   #198 <Method float VelocityTracker.getYVelocity(int)>
	//   41   86:fstore_3        
				byte byte1;
				if(f2 > 0.0F)
	//*  42   87:fload           4
	//*  43   89:fconst_0        
	//*  44   90:fcmpl           
	//*  45   91:ifle            101
					byte1 = 8;
	//   46   94:bipush          8
	//   47   96:istore          6
				else
	//*  48   98:goto            104
					byte1 = 4;
	//   49  101:iconst_4        
	//   50  102:istore          6
				f2 = Math.abs(f2);
	//   51  104:fload           4
	//   52  106:invokestatic    #203 <Method float Math.abs(float)>
	//   53  109:fstore          4
				if((byte1 & i) != 0 && byte0 == byte1 && f2 >= mCallback.getSwipeEscapeVelocity(mSwipeEscapeVelocity) && f2 > Math.abs(f))
	//*  54  111:iload           6
	//*  55  113:iload_2         
	//*  56  114:iand            
	//*  57  115:ifeq            155
	//*  58  118:iload           5
	//*  59  120:iload           6
	//*  60  122:icmpne          155
	//*  61  125:fload           4
	//*  62  127:aload_0         
	//*  63  128:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  64  131:aload_0         
	//*  65  132:getfield        #205 <Field float mSwipeEscapeVelocity>
	//*  66  135:invokevirtual   #208 <Method float ItemTouchHelper$Callback.getSwipeEscapeVelocity(float)>
	//*  67  138:fcmpl           
	//*  68  139:iflt            155
	//*  69  142:fload           4
	//*  70  144:fload_3         
	//*  71  145:invokestatic    #203 <Method float Math.abs(float)>
	//*  72  148:fcmpl           
	//*  73  149:ifle            155
					return ((int) (byte1));
	//   74  152:iload           6
	//   75  154:ireturn         
			}
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
		if((i & 3) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_3        
	//*   2    2:iand            
	//*   3    3:ifeq            196
		{
			byte byte0;
			if(mDy > 0.0F)
	//*   4    6:aload_0         
	//*   5    7:getfield        #219 <Field float mDy>
	//*   6   10:fconst_0        
	//*   7   11:fcmpl           
	//*   8   12:ifle            21
				byte0 = 2;
	//    9   15:iconst_2        
	//   10   16:istore          5
			else
	//*  11   18:goto            24
				byte0 = 1;
	//   12   21:iconst_1        
	//   13   22:istore          5
			if(mVelocityTracker != null && mActivePointerId > -1)
	//*  14   24:aload_0         
	//*  15   25:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//*  16   28:ifnull          152
	//*  17   31:aload_0         
	//*  18   32:getfield        #137 <Field int mActivePointerId>
	//*  19   35:iconst_m1       
	//*  20   36:icmple          152
			{
				mVelocityTracker.computeCurrentVelocity(1000, mCallback.getSwipeVelocityThreshold(mMaxSwipeVelocity));
	//   21   39:aload_0         
	//   22   40:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//   23   43:sipush          1000
	//   24   46:aload_0         
	//   25   47:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   26   50:aload_0         
	//   27   51:getfield        #181 <Field float mMaxSwipeVelocity>
	//   28   54:invokevirtual   #185 <Method float ItemTouchHelper$Callback.getSwipeVelocityThreshold(float)>
	//   29   57:invokevirtual   #191 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				float f = mVelocityTracker.getXVelocity(mActivePointerId);
	//   30   60:aload_0         
	//   31   61:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//   32   64:aload_0         
	//   33   65:getfield        #137 <Field int mActivePointerId>
	//   34   68:invokevirtual   #195 <Method float VelocityTracker.getXVelocity(int)>
	//   35   71:fstore_3        
				float f2 = mVelocityTracker.getYVelocity(mActivePointerId);
	//   36   72:aload_0         
	//   37   73:getfield        #179 <Field VelocityTracker mVelocityTracker>
	//   38   76:aload_0         
	//   39   77:getfield        #137 <Field int mActivePointerId>
	//   40   80:invokevirtual   #198 <Method float VelocityTracker.getYVelocity(int)>
	//   41   83:fstore          4
				byte byte1;
				if(f2 > 0.0F)
	//*  42   85:fload           4
	//*  43   87:fconst_0        
	//*  44   88:fcmpl           
	//*  45   89:ifle            98
					byte1 = 2;
	//   46   92:iconst_2        
	//   47   93:istore          6
				else
	//*  48   95:goto            101
					byte1 = 1;
	//   49   98:iconst_1        
	//   50   99:istore          6
				f2 = Math.abs(f2);
	//   51  101:fload           4
	//   52  103:invokestatic    #203 <Method float Math.abs(float)>
	//   53  106:fstore          4
				if((byte1 & i) != 0 && byte1 == byte0 && f2 >= mCallback.getSwipeEscapeVelocity(mSwipeEscapeVelocity) && f2 > Math.abs(f))
	//*  54  108:iload           6
	//*  55  110:iload_2         
	//*  56  111:iand            
	//*  57  112:ifeq            152
	//*  58  115:iload           6
	//*  59  117:iload           5
	//*  60  119:icmpne          152
	//*  61  122:fload           4
	//*  62  124:aload_0         
	//*  63  125:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  64  128:aload_0         
	//*  65  129:getfield        #205 <Field float mSwipeEscapeVelocity>
	//*  66  132:invokevirtual   #208 <Method float ItemTouchHelper$Callback.getSwipeEscapeVelocity(float)>
	//*  67  135:fcmpl           
	//*  68  136:iflt            152
	//*  69  139:fload           4
	//*  70  141:fload_3         
	//*  71  142:invokestatic    #203 <Method float Math.abs(float)>
	//*  72  145:fcmpl           
	//*  73  146:ifle            152
					return ((int) (byte1));
	//   74  149:iload           6
	//   75  151:ireturn         
			}
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
		if(mSwapTargets == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #261 <Field List mSwapTargets>
	//*   2    4:ifnonnull       32
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
	//*  13   29:goto            50
		{
			mSwapTargets.clear();
	//   14   32:aload_0         
	//   15   33:getfield        #261 <Field List mSwapTargets>
	//   16   36:invokeinterface #254 <Method void List.clear()>
			mDistances.clear();
	//   17   41:aload_0         
	//   18   42:getfield        #263 <Field List mDistances>
	//   19   45:invokeinterface #254 <Method void List.clear()>
		}
		int i = mCallback.getBoundingBoxMargin();
	//   20   50:aload_0         
	//   21   51:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   22   54:invokevirtual   #266 <Method int ItemTouchHelper$Callback.getBoundingBoxMargin()>
	//   23   57:istore_2        
		int j1 = Math.round(mSelectedStartX + mDx) - i;
	//   24   58:aload_0         
	//   25   59:getfield        #268 <Field float mSelectedStartX>
	//   26   62:aload_0         
	//   27   63:getfield        #177 <Field float mDx>
	//   28   66:fadd            
	//   29   67:invokestatic    #272 <Method int Math.round(float)>
	//   30   70:iload_2         
	//   31   71:isub            
	//   32   72:istore          5
		int k1 = Math.round(mSelectedStartY + mDy) - i;
	//   33   74:aload_0         
	//   34   75:getfield        #274 <Field float mSelectedStartY>
	//   35   78:aload_0         
	//   36   79:getfield        #219 <Field float mDy>
	//   37   82:fadd            
	//   38   83:invokestatic    #272 <Method int Math.round(float)>
	//   39   86:iload_2         
	//   40   87:isub            
	//   41   88:istore          6
		int l1 = viewholder.itemView.getWidth() + j1 + i * 2;
	//   42   90:aload_1         
	//   43   91:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   44   94:invokevirtual   #282 <Method int View.getWidth()>
	//   45   97:iload           5
	//   46   99:iadd            
	//   47  100:iload_2         
	//   48  101:iconst_2        
	//   49  102:imul            
	//   50  103:iadd            
	//   51  104:istore          7
		int i2 = viewholder.itemView.getHeight() + k1 + i * 2;
	//   52  106:aload_1         
	//   53  107:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   54  110:invokevirtual   #283 <Method int View.getHeight()>
	//   55  113:iload           6
	//   56  115:iadd            
	//   57  116:iload_2         
	//   58  117:iconst_2        
	//   59  118:imul            
	//   60  119:iadd            
	//   61  120:istore          8
		int j2 = (j1 + l1) / 2;
	//   62  122:iload           5
	//   63  124:iload           7
	//   64  126:iadd            
	//   65  127:iconst_2        
	//   66  128:idiv            
	//   67  129:istore          9
		int k2 = (k1 + i2) / 2;
	//   68  131:iload           6
	//   69  133:iload           8
	//   70  135:iadd            
	//   71  136:iconst_2        
	//   72  137:idiv            
	//   73  138:istore          10
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = mRecyclerView.getLayoutManager();
	//   74  140:aload_0         
	//   75  141:getfield        #167 <Field RecyclerView mRecyclerView>
	//   76  144:invokevirtual   #287 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   77  147:astore          14
		int l2 = layoutmanager.getChildCount();
	//   78  149:aload           14
	//   79  151:invokevirtual   #292 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getChildCount()>
	//   80  154:istore          11
		for(int j = 0; j < l2; j++)
	//*  81  156:iconst_0        
	//*  82  157:istore_2        
	//*  83  158:iload_2         
	//*  84  159:iload           11
	//*  85  161:icmpge          402
		{
			View view = layoutmanager.getChildAt(j);
	//   86  164:aload           14
	//   87  166:iload_2         
	//   88  167:invokevirtual   #296 <Method View android.support.v7.widget.RecyclerView$LayoutManager.getChildAt(int)>
	//   89  170:astore          15
			if(view == viewholder.itemView || view.getBottom() < k1 || view.getTop() > i2 || view.getRight() < j1 || view.getLeft() > l1)
	//*  90  172:aload           15
	//*  91  174:aload_1         
	//*  92  175:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  93  178:if_acmpne       184
	//*  94  181:goto            395
	//*  95  184:aload           15
	//*  96  186:invokevirtual   #299 <Method int View.getBottom()>
	//*  97  189:iload           6
	//*  98  191:icmplt          395
	//*  99  194:aload           15
	//* 100  196:invokevirtual   #302 <Method int View.getTop()>
	//* 101  199:iload           8
	//* 102  201:icmpgt          395
	//* 103  204:aload           15
	//* 104  206:invokevirtual   #305 <Method int View.getRight()>
	//* 105  209:iload           5
	//* 106  211:icmplt          395
	//* 107  214:aload           15
	//* 108  216:invokevirtual   #308 <Method int View.getLeft()>
	//* 109  219:iload           7
	//* 110  221:icmple          227
				continue;
	//  111  224:goto            395
			android.support.v7.widget.RecyclerView.ViewHolder viewholder1 = mRecyclerView.getChildViewHolder(view);
	//  112  227:aload_0         
	//  113  228:getfield        #167 <Field RecyclerView mRecyclerView>
	//  114  231:aload           15
	//  115  233:invokevirtual   #312 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//  116  236:astore          16
			if(!mCallback.canDropOver(mRecyclerView, mSelected, viewholder1))
				continue;
	//  117  238:aload_0         
	//  118  239:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//  119  242:aload_0         
	//  120  243:getfield        #167 <Field RecyclerView mRecyclerView>
	//  121  246:aload_0         
	//  122  247:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  123  250:aload           16
	//  124  252:invokevirtual   #316 <Method boolean ItemTouchHelper$Callback.canDropOver(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, android.support.v7.widget.RecyclerView$ViewHolder)>
	//  125  255:ifeq            395
			int k = Math.abs(j2 - (view.getLeft() + view.getRight()) / 2);
	//  126  258:iload           9
	//  127  260:aload           15
	//  128  262:invokevirtual   #308 <Method int View.getLeft()>
	//  129  265:aload           15
	//  130  267:invokevirtual   #305 <Method int View.getRight()>
	//  131  270:iadd            
	//  132  271:iconst_2        
	//  133  272:idiv            
	//  134  273:isub            
	//  135  274:invokestatic    #319 <Method int Math.abs(int)>
	//  136  277:istore_3        
			int i1 = Math.abs(k2 - (view.getTop() + view.getBottom()) / 2);
	//  137  278:iload           10
	//  138  280:aload           15
	//  139  282:invokevirtual   #302 <Method int View.getTop()>
	//  140  285:aload           15
	//  141  287:invokevirtual   #299 <Method int View.getBottom()>
	//  142  290:iadd            
	//  143  291:iconst_2        
	//  144  292:idiv            
	//  145  293:isub            
	//  146  294:invokestatic    #319 <Method int Math.abs(int)>
	//  147  297:istore          4
			int i3 = k * k + i1 * i1;
	//  148  299:iload_3         
	//  149  300:iload_3         
	//  150  301:imul            
	//  151  302:iload           4
	//  152  304:iload           4
	//  153  306:imul            
	//  154  307:iadd            
	//  155  308:istore          12
			i1 = 0;
	//  156  310:iconst_0        
	//  157  311:istore          4
			int j3 = mSwapTargets.size();
	//  158  313:aload_0         
	//  159  314:getfield        #261 <Field List mSwapTargets>
	//  160  317:invokeinterface #240 <Method int List.size()>
	//  161  322:istore          13
			for(int l = 0; l < j3 && i3 > ((Integer)mDistances.get(l)).intValue(); l++)
	//* 162  324:iconst_0        
	//* 163  325:istore_3        
	//* 164  326:iload_3         
	//* 165  327:iload           13
	//* 166  329:icmpge          366
	//* 167  332:iload           12
	//* 168  334:aload_0         
	//* 169  335:getfield        #263 <Field List mDistances>
	//* 170  338:iload_3         
	//* 171  339:invokeinterface #244 <Method Object List.get(int)>
	//* 172  344:checkcast       #321 <Class Integer>
	//* 173  347:invokevirtual   #324 <Method int Integer.intValue()>
	//* 174  350:icmple          366
				i1++;
	//  175  353:iload           4
	//  176  355:iconst_1        
	//  177  356:iadd            
	//  178  357:istore          4

	//  179  359:iload_3         
	//  180  360:iconst_1        
	//  181  361:iadd            
	//  182  362:istore_3        
	//* 183  363:goto            326
			mSwapTargets.add(i1, ((Object) (viewholder1)));
	//  184  366:aload_0         
	//  185  367:getfield        #261 <Field List mSwapTargets>
	//  186  370:iload           4
	//  187  372:aload           16
	//  188  374:invokeinterface #328 <Method void List.add(int, Object)>
			mDistances.add(i1, ((Object) (Integer.valueOf(i3))));
	//  189  379:aload_0         
	//  190  380:getfield        #263 <Field List mDistances>
	//  191  383:iload           4
	//  192  385:iload           12
	//  193  387:invokestatic    #332 <Method Integer Integer.valueOf(int)>
	//  194  390:invokeinterface #328 <Method void List.add(int, Object)>
		}

	//  195  395:iload_2         
	//  196  396:iconst_1        
	//  197  397:iadd            
	//  198  398:istore_2        
	//* 199  399:goto            158
		return mSwapTargets;
	//  200  402:aload_0         
	//  201  403:getfield        #261 <Field List mSwapTargets>
	//  202  406:areturn         
	}

	private android.support.v7.widget.RecyclerView.ViewHolder findSwipedView(MotionEvent motionevent)
	{
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = mRecyclerView.getLayoutManager();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #287 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    3    7:astore          7
		if(mActivePointerId == -1)
	//*   4    9:aload_0         
	//*   5   10:getfield        #137 <Field int mActivePointerId>
	//*   6   13:iconst_m1       
	//*   7   14:icmpne          19
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
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
		if(f2 < (float)mSlop && f < (float)mSlop)
	//*  39   72:fload           4
	//*  40   74:aload_0         
	//*  41   75:getfield        #353 <Field int mSlop>
	//*  42   78:i2f             
	//*  43   79:fcmpg           
	//*  44   80:ifge            95
	//*  45   83:fload_2         
	//*  46   84:aload_0         
	//*  47   85:getfield        #353 <Field int mSlop>
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
	//*  58  104:invokevirtual   #357 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
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
	//*  67  121:invokevirtual   #360 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//*  68  124:ifeq            129
			return null;
	//   69  127:aconst_null     
	//   70  128:areturn         
		motionevent = ((MotionEvent) (findChildView(motionevent)));
	//   71  129:aload_0         
	//   72  130:aload_1         
	//   73  131:invokevirtual   #364 <Method View findChildView(MotionEvent)>
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
	//   80  142:getfield        #167 <Field RecyclerView mRecyclerView>
	//   81  145:aload_1         
	//   82  146:invokevirtual   #312 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//   83  149:areturn         
	}

	private void getSelectedDxDy(float af[])
	{
		if((mSelectedFlags & 0xc) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #368 <Field int mSelectedFlags>
	//*   2    4:bipush          12
	//*   3    6:iand            
	//*   4    7:ifeq            37
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
	//*  19   34:goto            50
			af[0] = mSelected.itemView.getTranslationX();
	//   20   37:aload_1         
	//   21   38:iconst_0        
	//   22   39:aload_0         
	//   23   40:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   24   43:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   25   46:invokevirtual   #372 <Method float View.getTranslationX()>
	//   26   49:fastore         
		if((mSelectedFlags & 3) != 0)
	//*  27   50:aload_0         
	//*  28   51:getfield        #368 <Field int mSelectedFlags>
	//*  29   54:iconst_3        
	//*  30   55:iand            
	//*  31   56:ifeq            84
		{
			af[1] = (mSelectedStartY + mDy) - (float)mSelected.itemView.getTop();
	//   32   59:aload_1         
	//   33   60:iconst_1        
	//   34   61:aload_0         
	//   35   62:getfield        #274 <Field float mSelectedStartY>
	//   36   65:aload_0         
	//   37   66:getfield        #219 <Field float mDy>
	//   38   69:fadd            
	//   39   70:aload_0         
	//   40   71:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   41   74:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   42   77:invokevirtual   #302 <Method int View.getTop()>
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
		if(mActionState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field int mActionState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          10
			return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		int j = mCallback.getMovementFlags(mRecyclerView, viewholder);
	//    6   10:aload_0         
	//    7   11:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//    8   14:aload_0         
	//    9   15:getfield        #167 <Field RecyclerView mRecyclerView>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #419 <Method int ItemTouchHelper$Callback.getMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//   12   22:istore_3        
		int i = (0xff00 & mCallback.convertToAbsoluteDirection(j, ViewCompat.getLayoutDirection(((View) (mRecyclerView))))) >> 8;
	//   13   23:ldc1            #44  <Int 65280>
	//   14   25:aload_0         
	//   15   26:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   16   29:iload_3         
	//   17   30:aload_0         
	//   18   31:getfield        #167 <Field RecyclerView mRecyclerView>
	//   19   34:invokestatic    #425 <Method int ViewCompat.getLayoutDirection(View)>
	//   20   37:invokevirtual   #429 <Method int ItemTouchHelper$Callback.convertToAbsoluteDirection(int, int)>
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
		j = (0xff00 & j) >> 8;
	//   29   51:ldc1            #44  <Int 65280>
	//   30   53:iload_3         
	//   31   54:iand            
	//   32   55:bipush          8
	//   33   57:ishr            
	//   34   58:istore_3        
		if(Math.abs(mDx) > Math.abs(mDy))
	//*  35   59:aload_0         
	//*  36   60:getfield        #177 <Field float mDx>
	//*  37   63:invokestatic    #203 <Method float Math.abs(float)>
	//*  38   66:aload_0         
	//*  39   67:getfield        #219 <Field float mDy>
	//*  40   70:invokestatic    #203 <Method float Math.abs(float)>
	//*  41   73:fcmpl           
	//*  42   74:ifle            126
		{
			int k = checkHorizontalSwipe(viewholder, i);
	//   43   77:aload_0         
	//   44   78:aload_1         
	//   45   79:iload_2         
	//   46   80:invokespecial   #431 <Method int checkHorizontalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
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
	//   56  100:getfield        #167 <Field RecyclerView mRecyclerView>
	//   57  103:invokestatic    #425 <Method int ViewCompat.getLayoutDirection(View)>
	//   58  106:invokestatic    #434 <Method int ItemTouchHelper$Callback.convertToRelativeDirection(int, int)>
	//   59  109:ireturn         
				else
					return k;
	//   60  110:iload           4
	//   61  112:ireturn         
			i = checkVerticalSwipe(viewholder, i);
	//   62  113:aload_0         
	//   63  114:aload_1         
	//   64  115:iload_2         
	//   65  116:invokespecial   #436 <Method int checkVerticalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
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
	//   74  129:invokespecial   #436 <Method int checkVerticalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
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
	//   83  145:invokespecial   #431 <Method int checkHorizontalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
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
	//   93  161:getfield        #167 <Field RecyclerView mRecyclerView>
	//   94  164:invokestatic    #425 <Method int ViewCompat.getLayoutDirection(View)>
	//   95  167:invokestatic    #434 <Method int ItemTouchHelper$Callback.convertToRelativeDirection(int, int)>
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
	//*   1    1:getfield        #167 <Field RecyclerView mRecyclerView>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
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
	//*  15   29:ifnull          63
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
		}
	//   31   63:return          
	}

	boolean checkSelectForSwipe(int i, MotionEvent motionevent, int j)
	{
		if(mSelected != null || i != 2 || mActionState == 2 || !mCallback.isItemViewSwipeEnabled())
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
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		if(mRecyclerView.getScrollState() == 1)
	//*  16   32:aload_0         
	//*  17   33:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  18   36:invokevirtual   #469 <Method int RecyclerView.getScrollState()>
	//*  19   39:iconst_1        
	//*  20   40:icmpne          45
			return false;
	//   21   43:iconst_0        
	//   22   44:ireturn         
		android.support.v7.widget.RecyclerView.ViewHolder viewholder = findSwipedView(motionevent);
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:invokespecial   #471 <Method android.support.v7.widget.RecyclerView$ViewHolder findSwipedView(MotionEvent)>
	//   26   50:astore          8
		if(viewholder == null)
	//*  27   52:aload           8
	//*  28   54:ifnonnull       59
			return false;
	//   29   57:iconst_0        
	//   30   58:ireturn         
		i = (0xff00 & mCallback.getAbsoluteMovementFlags(mRecyclerView, viewholder)) >> 8;
	//   31   59:ldc1            #44  <Int 65280>
	//   32   61:aload_0         
	//   33   62:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   34   65:aload_0         
	//   35   66:getfield        #167 <Field RecyclerView mRecyclerView>
	//   36   69:aload           8
	//   37   71:invokevirtual   #474 <Method int ItemTouchHelper$Callback.getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
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
	//   48   87:invokevirtual   #344 <Method float MotionEvent.getX(int)>
	//   49   90:fstore          4
		float f1 = motionevent.getY(j);
	//   50   92:aload_2         
	//   51   93:iload_3         
	//   52   94:invokevirtual   #349 <Method float MotionEvent.getY(int)>
	//   53   97:fstore          5
		f -= mInitialTouchX;
	//   54   99:fload           4
	//   55  101:aload_0         
	//   56  102:getfield        #346 <Field float mInitialTouchX>
	//   57  105:fsub            
	//   58  106:fstore          4
		f1 -= mInitialTouchY;
	//   59  108:fload           5
	//   60  110:aload_0         
	//   61  111:getfield        #351 <Field float mInitialTouchY>
	//   62  114:fsub            
	//   63  115:fstore          5
		float f2 = Math.abs(f);
	//   64  117:fload           4
	//   65  119:invokestatic    #203 <Method float Math.abs(float)>
	//   66  122:fstore          6
		float f3 = Math.abs(f1);
	//   67  124:fload           5
	//   68  126:invokestatic    #203 <Method float Math.abs(float)>
	//   69  129:fstore          7
		if(f2 < (float)mSlop && f3 < (float)mSlop)
	//*  70  131:fload           6
	//*  71  133:aload_0         
	//*  72  134:getfield        #353 <Field int mSlop>
	//*  73  137:i2f             
	//*  74  138:fcmpg           
	//*  75  139:ifge            155
	//*  76  142:fload           7
	//*  77  144:aload_0         
	//*  78  145:getfield        #353 <Field int mSlop>
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
	//  130  226:putfield        #219 <Field float mDy>
		mDx = 0.0F;
	//  131  229:aload_0         
	//  132  230:fconst_0        
	//  133  231:putfield        #177 <Field float mDx>
		mActivePointerId = motionevent.getPointerId(0);
	//  134  234:aload_0         
	//  135  235:aload_2         
	//  136  236:iconst_0        
	//  137  237:invokevirtual   #477 <Method int MotionEvent.getPointerId(int)>
	//  138  240:putfield        #137 <Field int mActivePointerId>
		select(viewholder, 1);
	//  139  243:aload_0         
	//  140  244:aload           8
	//  141  246:iconst_1        
	//  142  247:invokevirtual   #481 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
		return true;
	//  143  250:iconst_1        
	//  144  251:ireturn         
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
		if(mRecoverAnimations.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field List mRecoverAnimations>
	//*   2    4:invokeinterface #503 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		motionevent = ((MotionEvent) (findChildView(motionevent)));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #364 <Method View findChildView(MotionEvent)>
	//    9   19:astore_1        
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*  10   20:aload_0         
	//*  11   21:getfield        #141 <Field List mRecoverAnimations>
	//*  12   24:invokeinterface #240 <Method int List.size()>
	//*  13   29:iconst_1        
	//*  14   30:isub            
	//*  15   31:istore_2        
	//*  16   32:iload_2         
	//*  17   33:iflt            70
		{
			RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(i);
	//   18   36:aload_0         
	//   19   37:getfield        #141 <Field List mRecoverAnimations>
	//   20   40:iload_2         
	//   21   41:invokeinterface #244 <Method Object List.get(int)>
	//   22   46:checkcast       #28  <Class ItemTouchHelper$RecoverAnimation>
	//   23   49:astore_3        
			if(recoveranimation.mViewHolder.itemView == motionevent)
	//*  24   50:aload_3         
	//*  25   51:getfield        #247 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//*  26   54:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
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
		if(mRecyclerView.isLayoutRequested())
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field RecyclerView mRecyclerView>
	//*   2    4:invokevirtual   #532 <Method boolean RecyclerView.isLayoutRequested()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		if(mActionState != 2)
	//*   5   11:aload_0         
	//*   6   12:getfield        #139 <Field int mActionState>
	//*   7   15:iconst_2        
	//*   8   16:icmpeq          20
			return;
	//    9   19:return          
		float f = mCallback.getMoveThreshold(viewholder);
	//   10   20:aload_0         
	//   11   21:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #535 <Method float ItemTouchHelper$Callback.getMoveThreshold(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   14   28:fstore_2        
		int i = (int)(mSelectedStartX + mDx);
	//   15   29:aload_0         
	//   16   30:getfield        #268 <Field float mSelectedStartX>
	//   17   33:aload_0         
	//   18   34:getfield        #177 <Field float mDx>
	//   19   37:fadd            
	//   20   38:f2i             
	//   21   39:istore_3        
		int j = (int)(mSelectedStartY + mDy);
	//   22   40:aload_0         
	//   23   41:getfield        #274 <Field float mSelectedStartY>
	//   24   44:aload_0         
	//   25   45:getfield        #219 <Field float mDy>
	//   26   48:fadd            
	//   27   49:f2i             
	//   28   50:istore          4
		if((float)Math.abs(j - viewholder.itemView.getTop()) < (float)viewholder.itemView.getHeight() * f && (float)Math.abs(i - viewholder.itemView.getLeft()) < (float)viewholder.itemView.getWidth() * f)
	//*  29   52:iload           4
	//*  30   54:aload_1         
	//*  31   55:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  32   58:invokevirtual   #302 <Method int View.getTop()>
	//*  33   61:isub            
	//*  34   62:invokestatic    #319 <Method int Math.abs(int)>
	//*  35   65:i2f             
	//*  36   66:aload_1         
	//*  37   67:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  38   70:invokevirtual   #283 <Method int View.getHeight()>
	//*  39   73:i2f             
	//*  40   74:fload_2         
	//*  41   75:fmul            
	//*  42   76:fcmpg           
	//*  43   77:ifge            108
	//*  44   80:iload_3         
	//*  45   81:aload_1         
	//*  46   82:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  47   85:invokevirtual   #308 <Method int View.getLeft()>
	//*  48   88:isub            
	//*  49   89:invokestatic    #319 <Method int Math.abs(int)>
	//*  50   92:i2f             
	//*  51   93:aload_1         
	//*  52   94:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  53   97:invokevirtual   #282 <Method int View.getWidth()>
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
	//   62  110:invokespecial   #537 <Method List findSwapTargets(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   63  113:astore          7
		if(((List) (obj)).size() == 0)
	//*  64  115:aload           7
	//*  65  117:invokeinterface #240 <Method int List.size()>
	//*  66  122:ifne            126
			return;
	//   67  125:return          
		obj = ((Object) (mCallback.chooseDropTarget(viewholder, ((List) (obj)), i, j)));
	//   68  126:aload_0         
	//   69  127:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   70  130:aload_1         
	//   71  131:aload           7
	//   72  133:iload_3         
	//   73  134:iload           4
	//   74  136:invokevirtual   #541 <Method android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$Callback.chooseDropTarget(android.support.v7.widget.RecyclerView$ViewHolder, List, int, int)>
	//   75  139:astore          7
		if(obj == null)
	//*  76  141:aload           7
	//*  77  143:ifnonnull       165
		{
			mSwapTargets.clear();
	//   78  146:aload_0         
	//   79  147:getfield        #261 <Field List mSwapTargets>
	//   80  150:invokeinterface #254 <Method void List.clear()>
			mDistances.clear();
	//   81  155:aload_0         
	//   82  156:getfield        #263 <Field List mDistances>
	//   83  159:invokeinterface #254 <Method void List.clear()>
			return;
	//   84  164:return          
		}
		int k = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)).getAdapterPosition();
	//   85  165:aload           7
	//   86  167:invokevirtual   #544 <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//   87  170:istore          5
		int l = viewholder.getAdapterPosition();
	//   88  172:aload_1         
	//   89  173:invokevirtual   #544 <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//   90  176:istore          6
		if(mCallback.onMove(mRecyclerView, viewholder, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
	//*  91  178:aload_0         
	//*  92  179:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//*  93  182:aload_0         
	//*  94  183:getfield        #167 <Field RecyclerView mRecyclerView>
	//*  95  186:aload_1         
	//*  96  187:aload           7
	//*  97  189:invokevirtual   #547 <Method boolean ItemTouchHelper$Callback.onMove(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*  98  192:ifeq            216
			mCallback.onMoved(mRecyclerView, viewholder, l, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), k, i, j);
	//   99  195:aload_0         
	//  100  196:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//  101  199:aload_0         
	//  102  200:getfield        #167 <Field RecyclerView mRecyclerView>
	//  103  203:aload_1         
	//  104  204:iload           6
	//  105  206:aload           7
	//  106  208:iload           5
	//  107  210:iload_3         
	//  108  211:iload           4
	//  109  213:invokevirtual   #551 <Method void ItemTouchHelper$Callback.onMoved(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, int, android.support.v7.widget.RecyclerView$ViewHolder, int, int, int)>
	//  110  216:return          
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
		if(view == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       19
			return;
	//   10   18:return          
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
	//*  33   61:ifeq            76
			mCallback.clearView(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (view)));
	//   34   64:aload_0         
	//   35   65:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   36   68:aload_0         
	//   37   69:getfield        #167 <Field RecyclerView mRecyclerView>
	//   38   72:aload_1         
	//   39   73:invokevirtual   #251 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//   40   76:return          
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		mOverdrawChildPosition = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #152 <Field int mOverdrawChildPosition>
		float f = 0.0F;
	//    3    5:fconst_0        
	//    4    6:fstore          4
		float f1 = 0.0F;
	//    5    8:fconst_0        
	//    6    9:fstore          5
		if(mSelected != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   9   15:ifnull          42
		{
			getSelectedDxDy(mTmpPosition);
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #133 <Field float[] mTmpPosition>
	//   13   23:invokespecial   #571 <Method void getSelectedDxDy(float[])>
			f = mTmpPosition[0];
	//   14   26:aload_0         
	//   15   27:getfield        #133 <Field float[] mTmpPosition>
	//   16   30:iconst_0        
	//   17   31:faload          
	//   18   32:fstore          4
			f1 = mTmpPosition[1];
	//   19   34:aload_0         
	//   20   35:getfield        #133 <Field float[] mTmpPosition>
	//   21   38:iconst_1        
	//   22   39:faload          
	//   23   40:fstore          5
		}
		mCallback.onDraw(canvas, recyclerview, mSelected, mRecoverAnimations, mActionState, f, f1);
	//   24   42:aload_0         
	//   25   43:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   26   46:aload_1         
	//   27   47:aload_2         
	//   28   48:aload_0         
	//   29   49:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   30   52:aload_0         
	//   31   53:getfield        #141 <Field List mRecoverAnimations>
	//   32   56:aload_0         
	//   33   57:getfield        #139 <Field int mActionState>
	//   34   60:fload           4
	//   35   62:fload           5
	//   36   64:invokevirtual   #574 <Method void ItemTouchHelper$Callback.onDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, List, int, float, float)>
	//   37   67:return          
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          4
		float f1 = 0.0F;
	//    2    3:fconst_0        
	//    3    4:fstore          5
		if(mSelected != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   6   10:ifnull          37
		{
			getSelectedDxDy(mTmpPosition);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #133 <Field float[] mTmpPosition>
	//   10   18:invokespecial   #571 <Method void getSelectedDxDy(float[])>
			f = mTmpPosition[0];
	//   11   21:aload_0         
	//   12   22:getfield        #133 <Field float[] mTmpPosition>
	//   13   25:iconst_0        
	//   14   26:faload          
	//   15   27:fstore          4
			f1 = mTmpPosition[1];
	//   16   29:aload_0         
	//   17   30:getfield        #133 <Field float[] mTmpPosition>
	//   18   33:iconst_1        
	//   19   34:faload          
	//   20   35:fstore          5
		}
		mCallback.onDrawOver(canvas, recyclerview, mSelected, mRecoverAnimations, mActionState, f, f1);
	//   21   37:aload_0         
	//   22   38:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:aload_0         
	//   26   44:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   27   47:aload_0         
	//   28   48:getfield        #141 <Field List mRecoverAnimations>
	//   29   51:aload_0         
	//   30   52:getfield        #139 <Field int mActionState>
	//   31   55:fload           4
	//   32   57:fload           5
	//   33   59:invokevirtual   #577 <Method void ItemTouchHelper$Callback.onDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, List, int, float, float)>
	//   34   62:return          
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
		long l2 = System.currentTimeMillis();
	//    8   16:invokestatic    #597 <Method long System.currentTimeMillis()>
	//    9   19:lstore          7
		long l1;
		if(mDragScrollStartTimeInMs == 0x0L)
	//*  10   21:aload_0         
	//*  11   22:getfield        #591 <Field long mDragScrollStartTimeInMs>
	//*  12   25:ldc2w           #588 <Long 0x0L>
	//*  13   28:lcmp            
	//*  14   29:ifne            38
			l1 = 0L;
	//   15   32:lconst_0        
	//   16   33:lstore          5
		else
	//*  17   35:goto            47
			l1 = l2 - mDragScrollStartTimeInMs;
	//   18   38:lload           7
	//   19   40:aload_0         
	//   20   41:getfield        #591 <Field long mDragScrollStartTimeInMs>
	//   21   44:lsub            
	//   22   45:lstore          5
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = mRecyclerView.getLayoutManager();
	//   23   47:aload_0         
	//   24   48:getfield        #167 <Field RecyclerView mRecyclerView>
	//   25   51:invokevirtual   #287 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   26   54:astore          9
		if(mTmpRect == null)
	//*  27   56:aload_0         
	//*  28   57:getfield        #599 <Field Rect mTmpRect>
	//*  29   60:ifnonnull       74
			mTmpRect = new Rect();
	//   30   63:aload_0         
	//   31   64:new             #523 <Class Rect>
	//   32   67:dup             
	//   33   68:invokespecial   #600 <Method void Rect()>
	//   34   71:putfield        #599 <Field Rect mTmpRect>
		int j = 0;
	//   35   74:iconst_0        
	//   36   75:istore_2        
		int k = 0;
	//   37   76:iconst_0        
	//   38   77:istore_3        
		layoutmanager.calculateItemDecorationsForChild(mSelected.itemView, mTmpRect);
	//   39   78:aload           9
	//   40   80:aload_0         
	//   41   81:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   42   84:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   43   87:aload_0         
	//   44   88:getfield        #599 <Field Rect mTmpRect>
	//   45   91:invokevirtual   #604 <Method void android.support.v7.widget.RecyclerView$LayoutManager.calculateItemDecorationsForChild(View, Rect)>
		int i = j;
	//   46   94:iload_2         
	//   47   95:istore_1        
		if(layoutmanager.canScrollHorizontally())
	//*  48   96:aload           9
	//*  49   98:invokevirtual   #357 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  50  101:ifeq            211
		{
			int l = (int)(mSelectedStartX + mDx);
	//   51  104:aload_0         
	//   52  105:getfield        #268 <Field float mSelectedStartX>
	//   53  108:aload_0         
	//   54  109:getfield        #177 <Field float mDx>
	//   55  112:fadd            
	//   56  113:f2i             
	//   57  114:istore          4
			i = l - mTmpRect.left - mRecyclerView.getPaddingLeft();
	//   58  116:iload           4
	//   59  118:aload_0         
	//   60  119:getfield        #599 <Field Rect mTmpRect>
	//   61  122:getfield        #607 <Field int Rect.left>
	//   62  125:isub            
	//   63  126:aload_0         
	//   64  127:getfield        #167 <Field RecyclerView mRecyclerView>
	//   65  130:invokevirtual   #610 <Method int RecyclerView.getPaddingLeft()>
	//   66  133:isub            
	//   67  134:istore_1        
			if(mDx >= 0.0F || i >= 0)
	//*  68  135:aload_0         
	//*  69  136:getfield        #177 <Field float mDx>
	//*  70  139:fconst_0        
	//*  71  140:fcmpg           
	//*  72  141:ifge            151
	//*  73  144:iload_1         
	//*  74  145:ifge            151
	//*  75  148:goto            211
			{
				i = j;
	//   76  151:iload_2         
	//   77  152:istore_1        
				if(mDx > 0.0F)
	//*  78  153:aload_0         
	//*  79  154:getfield        #177 <Field float mDx>
	//*  80  157:fconst_0        
	//*  81  158:fcmpl           
	//*  82  159:ifle            211
				{
					l = (mSelected.itemView.getWidth() + l + mTmpRect.right) - (mRecyclerView.getWidth() - mRecyclerView.getPaddingRight());
	//   83  162:aload_0         
	//   84  163:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   85  166:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   86  169:invokevirtual   #282 <Method int View.getWidth()>
	//   87  172:iload           4
	//   88  174:iadd            
	//   89  175:aload_0         
	//   90  176:getfield        #599 <Field Rect mTmpRect>
	//   91  179:getfield        #613 <Field int Rect.right>
	//   92  182:iadd            
	//   93  183:aload_0         
	//   94  184:getfield        #167 <Field RecyclerView mRecyclerView>
	//   95  187:invokevirtual   #212 <Method int RecyclerView.getWidth()>
	//   96  190:aload_0         
	//   97  191:getfield        #167 <Field RecyclerView mRecyclerView>
	//   98  194:invokevirtual   #616 <Method int RecyclerView.getPaddingRight()>
	//   99  197:isub            
	//  100  198:isub            
	//  101  199:istore          4
					i = j;
	//  102  201:iload_2         
	//  103  202:istore_1        
					if(l > 0)
	//* 104  203:iload           4
	//* 105  205:ifle            211
						i = l;
	//  106  208:iload           4
	//  107  210:istore_1        
				}
			}
		}
		j = k;
	//  108  211:iload_3         
	//  109  212:istore_2        
		if(layoutmanager.canScrollVertically())
	//* 110  213:aload           9
	//* 111  215:invokevirtual   #360 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//* 112  218:ifeq            328
		{
			int i1 = (int)(mSelectedStartY + mDy);
	//  113  221:aload_0         
	//  114  222:getfield        #274 <Field float mSelectedStartY>
	//  115  225:aload_0         
	//  116  226:getfield        #219 <Field float mDy>
	//  117  229:fadd            
	//  118  230:f2i             
	//  119  231:istore          4
			j = i1 - mTmpRect.top - mRecyclerView.getPaddingTop();
	//  120  233:iload           4
	//  121  235:aload_0         
	//  122  236:getfield        #599 <Field Rect mTmpRect>
	//  123  239:getfield        #619 <Field int Rect.top>
	//  124  242:isub            
	//  125  243:aload_0         
	//  126  244:getfield        #167 <Field RecyclerView mRecyclerView>
	//  127  247:invokevirtual   #622 <Method int RecyclerView.getPaddingTop()>
	//  128  250:isub            
	//  129  251:istore_2        
			if(mDy >= 0.0F || j >= 0)
	//* 130  252:aload_0         
	//* 131  253:getfield        #219 <Field float mDy>
	//* 132  256:fconst_0        
	//* 133  257:fcmpg           
	//* 134  258:ifge            268
	//* 135  261:iload_2         
	//* 136  262:ifge            268
	//* 137  265:goto            328
			{
				j = k;
	//  138  268:iload_3         
	//  139  269:istore_2        
				if(mDy > 0.0F)
	//* 140  270:aload_0         
	//* 141  271:getfield        #219 <Field float mDy>
	//* 142  274:fconst_0        
	//* 143  275:fcmpl           
	//* 144  276:ifle            328
				{
					i1 = (mSelected.itemView.getHeight() + i1 + mTmpRect.bottom) - (mRecyclerView.getHeight() - mRecyclerView.getPaddingBottom());
	//  145  279:aload_0         
	//  146  280:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  147  283:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  148  286:invokevirtual   #283 <Method int View.getHeight()>
	//  149  289:iload           4
	//  150  291:iadd            
	//  151  292:aload_0         
	//  152  293:getfield        #599 <Field Rect mTmpRect>
	//  153  296:getfield        #625 <Field int Rect.bottom>
	//  154  299:iadd            
	//  155  300:aload_0         
	//  156  301:getfield        #167 <Field RecyclerView mRecyclerView>
	//  157  304:invokevirtual   #222 <Method int RecyclerView.getHeight()>
	//  158  307:aload_0         
	//  159  308:getfield        #167 <Field RecyclerView mRecyclerView>
	//  160  311:invokevirtual   #628 <Method int RecyclerView.getPaddingBottom()>
	//  161  314:isub            
	//  162  315:isub            
	//  163  316:istore          4
					j = k;
	//  164  318:iload_3         
	//  165  319:istore_2        
					if(i1 > 0)
	//* 166  320:iload           4
	//* 167  322:ifle            328
						j = i1;
	//  168  325:iload           4
	//  169  327:istore_2        
				}
			}
		}
		k = i;
	//  170  328:iload_1         
	//  171  329:istore_3        
		if(i != 0)
	//* 172  330:iload_1         
	//* 173  331:ifeq            366
			k = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getWidth(), i, mRecyclerView.getWidth(), l1);
	//  174  334:aload_0         
	//  175  335:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//  176  338:aload_0         
	//  177  339:getfield        #167 <Field RecyclerView mRecyclerView>
	//  178  342:aload_0         
	//  179  343:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  180  346:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  181  349:invokevirtual   #282 <Method int View.getWidth()>
	//  182  352:iload_1         
	//  183  353:aload_0         
	//  184  354:getfield        #167 <Field RecyclerView mRecyclerView>
	//  185  357:invokevirtual   #212 <Method int RecyclerView.getWidth()>
	//  186  360:lload           5
	//  187  362:invokevirtual   #632 <Method int ItemTouchHelper$Callback.interpolateOutOfBoundsScroll(RecyclerView, int, int, int, long)>
	//  188  365:istore_3        
		i = j;
	//  189  366:iload_2         
	//  190  367:istore_1        
		if(j != 0)
	//* 191  368:iload_2         
	//* 192  369:ifeq            404
			i = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getHeight(), j, mRecyclerView.getHeight(), l1);
	//  193  372:aload_0         
	//  194  373:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//  195  376:aload_0         
	//  196  377:getfield        #167 <Field RecyclerView mRecyclerView>
	//  197  380:aload_0         
	//  198  381:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  199  384:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  200  387:invokevirtual   #283 <Method int View.getHeight()>
	//  201  390:iload_2         
	//  202  391:aload_0         
	//  203  392:getfield        #167 <Field RecyclerView mRecyclerView>
	//  204  395:invokevirtual   #222 <Method int RecyclerView.getHeight()>
	//  205  398:lload           5
	//  206  400:invokevirtual   #632 <Method int ItemTouchHelper$Callback.interpolateOutOfBoundsScroll(RecyclerView, int, int, int, long)>
	//  207  403:istore_1        
		if(k != 0 || i != 0)
	//* 208  404:iload_3         
	//* 209  405:ifne            412
	//* 210  408:iload_1         
	//* 211  409:ifeq            440
		{
			if(mDragScrollStartTimeInMs == 0x0L)
	//* 212  412:aload_0         
	//* 213  413:getfield        #591 <Field long mDragScrollStartTimeInMs>
	//* 214  416:ldc2w           #588 <Long 0x0L>
	//* 215  419:lcmp            
	//* 216  420:ifne            429
				mDragScrollStartTimeInMs = l2;
	//  217  423:aload_0         
	//  218  424:lload           7
	//  219  426:putfield        #591 <Field long mDragScrollStartTimeInMs>
			mRecyclerView.scrollBy(k, i);
	//  220  429:aload_0         
	//  221  430:getfield        #167 <Field RecyclerView mRecyclerView>
	//  222  433:iload_3         
	//  223  434:iload_1         
	//  224  435:invokevirtual   #636 <Method void RecyclerView.scrollBy(int, int)>
			return true;
	//  225  438:iconst_1        
	//  226  439:ireturn         
		} else
		{
			mDragScrollStartTimeInMs = 0x0L;
	//  227  440:aload_0         
	//  228  441:ldc2w           #588 <Long 0x0L>
	//  229  444:putfield        #591 <Field long mDragScrollStartTimeInMs>
			return false;
	//  230  447:iconst_0        
	//  231  448:ireturn         
		}
	}

	void select(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
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
		int k = mActionState;
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
		final int final_i = 0;
	//   32   59:iconst_0        
	//   33   60:istore          7
		int j = 0;
	//   34   62:iconst_0        
	//   35   63:istore          8
		if(mSelected != null)
	//*  36   65:aload_0         
	//*  37   66:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*  38   69:ifnull          385
		{
			final Object final_viewholder = ((Object) (mSelected));
	//   39   72:aload_0         
	//   40   73:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   41   76:astore          11
			if(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)).itemView.getParent() != null)
	//*  42   78:aload           11
	//*  43   80:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  44   83:invokevirtual   #642 <Method ViewParent View.getParent()>
	//*  45   86:ifnull          354
			{
				if(k == 2)
	//*  46   89:iload           9
	//*  47   91:iconst_2        
	//*  48   92:icmpne          101
					j = 0;
	//   49   95:iconst_0        
	//   50   96:istore          8
				else
	//*  51   98:goto            109
					j = swipeIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)));
	//   52  101:aload_0         
	//   53  102:aload           11
	//   54  104:invokespecial   #644 <Method int swipeIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   55  107:istore          8
				releaseVelocityTracker();
	//   56  109:aload_0         
	//   57  110:invokespecial   #257 <Method void releaseVelocityTracker()>
				float f;
				float f1;
				switch(j)
	//*  58  113:iload           8
				{
	//*  59  115:lookupswitch    6: default 172
	//	               1: 198
	//	               2: 198
	//	               4: 175
	//	               8: 175
	//	               16: 175
	//	               32: 175
	//*  60  172:goto            221
				case 4: // '\004'
				case 8: // '\b'
				case 16: // '\020'
				case 32: // ' '
					f1 = 0.0F;
	//   61  175:fconst_0        
	//   62  176:fstore          4
					f = Math.signum(mDx) * (float)mRecyclerView.getWidth();
	//   63  178:aload_0         
	//   64  179:getfield        #177 <Field float mDx>
	//   65  182:invokestatic    #647 <Method float Math.signum(float)>
	//   66  185:aload_0         
	//   67  186:getfield        #167 <Field RecyclerView mRecyclerView>
	//   68  189:invokevirtual   #212 <Method int RecyclerView.getWidth()>
	//   69  192:i2f             
	//   70  193:fmul            
	//   71  194:fstore_3        
					break;

	//*  72  195:goto            226
				case 1: // '\001'
				case 2: // '\002'
					f = 0.0F;
	//   73  198:fconst_0        
	//   74  199:fstore_3        
					f1 = Math.signum(mDy) * (float)mRecyclerView.getHeight();
	//   75  200:aload_0         
	//   76  201:getfield        #219 <Field float mDy>
	//   77  204:invokestatic    #647 <Method float Math.signum(float)>
	//   78  207:aload_0         
	//   79  208:getfield        #167 <Field RecyclerView mRecyclerView>
	//   80  211:invokevirtual   #222 <Method int RecyclerView.getHeight()>
	//   81  214:i2f             
	//   82  215:fmul            
	//   83  216:fstore          4
					break;

	//*  84  218:goto            226
				default:
					f = 0.0F;
	//   85  221:fconst_0        
	//   86  222:fstore_3        
					f1 = 0.0F;
	//   87  223:fconst_0        
	//   88  224:fstore          4
					break;
				}
				if(k == 2)
	//*  89  226:iload           9
	//*  90  228:iconst_2        
	//*  91  229:icmpne          239
					final_i = 8;
	//   92  232:bipush          8
	//   93  234:istore          7
				else
	//*  94  236:goto            253
				if(j > 0)
	//*  95  239:iload           8
	//*  96  241:ifle            250
					final_i = 2;
	//   97  244:iconst_2        
	//   98  245:istore          7
				else
	//*  99  247:goto            253
					final_i = 4;
	//  100  250:iconst_4        
	//  101  251:istore          7
				getSelectedDxDy(mTmpPosition);
	//  102  253:aload_0         
	//  103  254:aload_0         
	//  104  255:getfield        #133 <Field float[] mTmpPosition>
	//  105  258:invokespecial   #571 <Method void getSelectedDxDy(float[])>
				float f2 = mTmpPosition[0];
	//  106  261:aload_0         
	//  107  262:getfield        #133 <Field float[] mTmpPosition>
	//  108  265:iconst_0        
	//  109  266:faload          
	//  110  267:fstore          5
				float f3 = mTmpPosition[1];
	//  111  269:aload_0         
	//  112  270:getfield        #133 <Field float[] mTmpPosition>
	//  113  273:iconst_1        
	//  114  274:faload          
	//  115  275:fstore          6
				final_viewholder = ((Object) (new RecoverAnimation(k, f2, f3, f, f1, j, ((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder))) {

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
			//   10   18:aload_1         
			//   11   19:aload_2         
			//   12   20:iload_3         
			//   13   21:iload           4
			//   14   23:fload           5
			//   15   25:fload           6
			//   16   27:fload           7
			//   17   29:fload           8
			//   18   31:invokespecial   #26  <Method void ItemTouchHelper$RecoverAnimation(ItemTouchHelper, android.support.v7.widget.RecyclerView$ViewHolder, int, int, float, float, float, float)>
			//   19   34:return          
			}
				}
));
	//  116  277:new             #12  <Class ItemTouchHelper$3>
	//  117  280:dup             
	//  118  281:aload_0         
	//  119  282:aload           11
	//  120  284:iload           7
	//  121  286:iload           9
	//  122  288:fload           5
	//  123  290:fload           6
	//  124  292:fload_3         
	//  125  293:fload           4
	//  126  295:iload           8
	//  127  297:aload           11
	//  128  299:invokespecial   #650 <Method void ItemTouchHelper$3(ItemTouchHelper, android.support.v7.widget.RecyclerView$ViewHolder, int, int, float, float, float, float, int, android.support.v7.widget.RecyclerView$ViewHolder)>
	//  129  302:astore          11
				((RecoverAnimation) (final_viewholder)).setDuration(mCallback.getAnimationDuration(mRecyclerView, final_i, f - f2, f1 - f3));
	//  130  304:aload           11
	//  131  306:aload_0         
	//  132  307:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//  133  310:aload_0         
	//  134  311:getfield        #167 <Field RecyclerView mRecyclerView>
	//  135  314:iload           7
	//  136  316:fload_3         
	//  137  317:fload           5
	//  138  319:fsub            
	//  139  320:fload           4
	//  140  322:fload           6
	//  141  324:fsub            
	//  142  325:invokevirtual   #654 <Method long ItemTouchHelper$Callback.getAnimationDuration(RecyclerView, int, float, float)>
	//  143  328:invokevirtual   #658 <Method void ItemTouchHelper$RecoverAnimation.setDuration(long)>
				mRecoverAnimations.add(final_viewholder);
	//  144  331:aload_0         
	//  145  332:getfield        #141 <Field List mRecoverAnimations>
	//  146  335:aload           11
	//  147  337:invokeinterface #660 <Method boolean List.add(Object)>
	//  148  342:pop             
				((RecoverAnimation) (final_viewholder)).start();
	//  149  343:aload           11
	//  150  345:invokevirtual   #663 <Method void ItemTouchHelper$RecoverAnimation.start()>
				final_i = 1;
	//  151  348:iconst_1        
	//  152  349:istore          7
			} else
	//* 153  351:goto            380
			{
				removeChildDrawingOrderCallbackIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)).itemView);
	//  154  354:aload_0         
	//  155  355:aload           11
	//  156  357:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  157  360:invokevirtual   #562 <Method void removeChildDrawingOrderCallbackIfNecessary(View)>
				mCallback.clearView(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)));
	//  158  363:aload_0         
	//  159  364:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//  160  367:aload_0         
	//  161  368:getfield        #167 <Field RecyclerView mRecyclerView>
	//  162  371:aload           11
	//  163  373:invokevirtual   #251 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
				final_i = j;
	//  164  376:iload           8
	//  165  378:istore          7
			}
			mSelected = null;
	//  166  380:aload_0         
	//  167  381:aconst_null     
	//  168  382:putfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
		}
		if(viewholder != null)
	//* 169  385:aload_1         
	//* 170  386:ifnull          471
		{
			mSelectedFlags = (mCallback.getAbsoluteMovementFlags(mRecyclerView, viewholder) & (1 << i * 8 + 8) - 1) >> mActionState * 8;
	//  171  389:aload_0         
	//  172  390:aload_0         
	//  173  391:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//  174  394:aload_0         
	//  175  395:getfield        #167 <Field RecyclerView mRecyclerView>
	//  176  398:aload_1         
	//  177  399:invokevirtual   #474 <Method int ItemTouchHelper$Callback.getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//  178  402:iconst_1        
	//  179  403:iload_2         
	//  180  404:bipush          8
	//  181  406:imul            
	//  182  407:bipush          8
	//  183  409:iadd            
	//  184  410:ishl            
	//  185  411:iconst_1        
	//  186  412:isub            
	//  187  413:iand            
	//  188  414:aload_0         
	//  189  415:getfield        #139 <Field int mActionState>
	//  190  418:bipush          8
	//  191  420:imul            
	//  192  421:ishr            
	//  193  422:putfield        #368 <Field int mSelectedFlags>
			mSelectedStartX = viewholder.itemView.getLeft();
	//  194  425:aload_0         
	//  195  426:aload_1         
	//  196  427:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  197  430:invokevirtual   #308 <Method int View.getLeft()>
	//  198  433:i2f             
	//  199  434:putfield        #268 <Field float mSelectedStartX>
			mSelectedStartY = viewholder.itemView.getTop();
	//  200  437:aload_0         
	//  201  438:aload_1         
	//  202  439:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  203  442:invokevirtual   #302 <Method int View.getTop()>
	//  204  445:i2f             
	//  205  446:putfield        #274 <Field float mSelectedStartY>
			mSelected = viewholder;
	//  206  449:aload_0         
	//  207  450:aload_1         
	//  208  451:putfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
			if(i == 2)
	//* 209  454:iload_2         
	//* 210  455:iconst_2        
	//* 211  456:icmpne          471
				mSelected.itemView.performHapticFeedback(0);
	//  212  459:aload_0         
	//  213  460:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  214  463:getfield        #279 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  215  466:iconst_0        
	//  216  467:invokevirtual   #667 <Method boolean View.performHapticFeedback(int)>
	//  217  470:pop             
		}
		viewholder = ((android.support.v7.widget.RecyclerView.ViewHolder) (mRecyclerView.getParent()));
	//  218  471:aload_0         
	//  219  472:getfield        #167 <Field RecyclerView mRecyclerView>
	//  220  475:invokevirtual   #668 <Method ViewParent RecyclerView.getParent()>
	//  221  478:astore_1        
		if(viewholder != null)
	//* 222  479:aload_1         
	//* 223  480:ifnull          507
		{
			boolean flag;
			if(mSelected != null)
	//* 224  483:aload_0         
	//* 225  484:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 226  487:ifnull          496
				flag = true;
	//  227  490:iconst_1        
	//  228  491:istore          10
			else
	//* 229  493:goto            499
				flag = false;
	//  230  496:iconst_0        
	//  231  497:istore          10
			((ViewParent) (viewholder)).requestDisallowInterceptTouchEvent(flag);
	//  232  499:aload_1         
	//  233  500:iload           10
	//  234  502:invokeinterface #674 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		}
		if(final_i == 0)
	//* 235  507:iload           7
	//* 236  509:ifne            522
			mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
	//  237  512:aload_0         
	//  238  513:getfield        #167 <Field RecyclerView mRecyclerView>
	//  239  516:invokevirtual   #287 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//  240  519:invokevirtual   #677 <Method void android.support.v7.widget.RecyclerView$LayoutManager.requestSimpleAnimationsInNextLayout()>
		mCallback.onSelectedChanged(mSelected, mActionState);
	//  241  522:aload_0         
	//  242  523:getfield        #157 <Field ItemTouchHelper$Callback mCallback>
	//  243  526:aload_0         
	//  244  527:getfield        #135 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  245  530:aload_0         
	//  246  531:getfield        #139 <Field int mActionState>
	//  247  534:invokevirtual   #680 <Method void ItemTouchHelper$Callback.onSelectedChanged(android.support.v7.widget.RecyclerView$ViewHolder, int)>
		mRecyclerView.invalidate();
	//  248  537:aload_0         
	//  249  538:getfield        #167 <Field RecyclerView mRecyclerView>
	//  250  541:invokevirtual   #683 <Method void RecyclerView.invalidate()>
	//  251  544:return          
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
		//*  33   69:ifnonnull       288
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
		//* 100  214:goto            288
			if(i == 3 || i == 1)
		//* 101  217:iload_3         
		//* 102  218:iconst_3        
		//* 103  219:icmpeq          227
		//* 104  222:iload_3         
		//* 105  223:iconst_1        
		//* 106  224:icmpne          247
			{
				mActivePointerId = -1;
		//  107  227:aload_0         
		//  108  228:getfield        #14  <Field ItemTouchHelper this$0>
		//  109  231:iconst_m1       
		//  110  232:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
				select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
		//  111  235:aload_0         
		//  112  236:getfield        #14  <Field ItemTouchHelper this$0>
		//  113  239:aconst_null     
		//  114  240:iconst_0        
		//  115  241:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			} else
		//* 116  244:goto            288
			if(mActivePointerId != -1)
		//* 117  247:aload_0         
		//* 118  248:getfield        #14  <Field ItemTouchHelper this$0>
		//* 119  251:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//* 120  254:iconst_m1       
		//* 121  255:icmpeq          288
			{
				int j = motionevent.findPointerIndex(mActivePointerId);
		//  122  258:aload_2         
		//  123  259:aload_0         
		//  124  260:getfield        #14  <Field ItemTouchHelper this$0>
		//  125  263:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//  126  266:invokevirtual   #131 <Method int MotionEvent.findPointerIndex(int)>
		//  127  269:istore          4
				if(j >= 0)
		//* 128  271:iload           4
		//* 129  273:iflt            288
					checkSelectForSwipe(i, motionevent, j);
		//  130  276:aload_0         
		//  131  277:getfield        #14  <Field ItemTouchHelper this$0>
		//  132  280:iload_3         
		//  133  281:aload_2         
		//  134  282:iload           4
		//  135  284:invokevirtual   #135 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
		//  136  287:pop             
			}
			if(mVelocityTracker != null)
		//* 137  288:aload_0         
		//* 138  289:getfield        #14  <Field ItemTouchHelper this$0>
		//* 139  292:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//* 140  295:ifnull          309
				mVelocityTracker.addMovement(motionevent);
		//  141  298:aload_0         
		//  142  299:getfield        #14  <Field ItemTouchHelper this$0>
		//  143  302:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//  144  305:aload_2         
		//  145  306:invokevirtual   #145 <Method void VelocityTracker.addMovement(MotionEvent)>
			return mSelected != null;
		//  146  309:aload_0         
		//  147  310:getfield        #14  <Field ItemTouchHelper this$0>
		//  148  313:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//  149  316:ifnull          321
		//  150  319:iconst_1        
		//  151  320:ireturn         
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
			int i = motionevent.getActionMasked();
		//   21   45:aload_2         
		//   22   46:invokevirtual   #36  <Method int MotionEvent.getActionMasked()>
		//   23   49:istore_3        
			int k = motionevent.findPointerIndex(mActivePointerId);
		//   24   50:aload_2         
		//   25   51:aload_0         
		//   26   52:getfield        #14  <Field ItemTouchHelper this$0>
		//   27   55:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//   28   58:invokevirtual   #131 <Method int MotionEvent.findPointerIndex(int)>
		//   29   61:istore          4
			if(k >= 0)
		//*  30   63:iload           4
		//*  31   65:iflt            80
				checkSelectForSwipe(i, motionevent, k);
		//   32   68:aload_0         
		//   33   69:getfield        #14  <Field ItemTouchHelper this$0>
		//   34   72:iload_3         
		//   35   73:aload_2         
		//   36   74:iload           4
		//   37   76:invokevirtual   #135 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
		//   38   79:pop             
			recyclerview = ((RecyclerView) (mSelected));
		//   39   80:aload_0         
		//   40   81:getfield        #14  <Field ItemTouchHelper this$0>
		//   41   84:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//   42   87:astore_1        
			if(recyclerview == null)
		//*  43   88:aload_1         
		//*  44   89:ifnonnull       93
				return;
		//   45   92:return          
			switch(i)
		//*  46   93:iload_3         
			{
		//*  47   94:tableswitch     1 6: default 132
		//		               1 224
		//		               2 133
		//		               3 204
		//		               4 305
		//		               5 305
		//		               6 242
			default:
				return;
		//   48  132:return          

			case 4: // '\004'
			case 5: // '\005'
				break;

			case 2: // '\002'
				if(k >= 0)
		//*  49  133:iload           4
		//*  50  135:iflt            305
				{
					updateDxDy(motionevent, mSelectedFlags, k);
		//   51  138:aload_0         
		//   52  139:getfield        #14  <Field ItemTouchHelper this$0>
		//   53  142:aload_2         
		//   54  143:aload_0         
		//   55  144:getfield        #14  <Field ItemTouchHelper this$0>
		//   56  147:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
		//   57  150:iload           4
		//   58  152:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
					moveIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (recyclerview)));
		//   59  155:aload_0         
		//   60  156:getfield        #14  <Field ItemTouchHelper this$0>
		//   61  159:aload_1         
		//   62  160:invokevirtual   #152 <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
					mRecyclerView.removeCallbacks(mScrollRunnable);
		//   63  163:aload_0         
		//   64  164:getfield        #14  <Field ItemTouchHelper this$0>
		//   65  167:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   66  170:aload_0         
		//   67  171:getfield        #14  <Field ItemTouchHelper this$0>
		//   68  174:getfield        #156 <Field Runnable ItemTouchHelper.mScrollRunnable>
		//   69  177:invokevirtual   #162 <Method boolean RecyclerView.removeCallbacks(Runnable)>
		//   70  180:pop             
					mScrollRunnable.run();
		//   71  181:aload_0         
		//   72  182:getfield        #14  <Field ItemTouchHelper this$0>
		//   73  185:getfield        #156 <Field Runnable ItemTouchHelper.mScrollRunnable>
		//   74  188:invokeinterface #167 <Method void Runnable.run()>
					mRecyclerView.invalidate();
		//   75  193:aload_0         
		//   76  194:getfield        #14  <Field ItemTouchHelper this$0>
		//   77  197:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   78  200:invokevirtual   #170 <Method void RecyclerView.invalidate()>
					return;
		//   79  203:return          
				}
				break;

			case 3: // '\003'
				if(mVelocityTracker != null)
		//*  80  204:aload_0         
		//*  81  205:getfield        #14  <Field ItemTouchHelper this$0>
		//*  82  208:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//*  83  211:ifnull          224
					mVelocityTracker.clear();
		//   84  214:aload_0         
		//   85  215:getfield        #14  <Field ItemTouchHelper this$0>
		//   86  218:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
		//   87  221:invokevirtual   #173 <Method void VelocityTracker.clear()>
				// fall through

			case 1: // '\001'
				select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
		//   88  224:aload_0         
		//   89  225:getfield        #14  <Field ItemTouchHelper this$0>
		//   90  228:aconst_null     
		//   91  229:iconst_0        
		//   92  230:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
				mActivePointerId = -1;
		//   93  233:aload_0         
		//   94  234:getfield        #14  <Field ItemTouchHelper this$0>
		//   95  237:iconst_m1       
		//   96  238:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
				return;
		//   97  241:return          

			case 6: // '\006'
				int l = motionevent.getActionIndex();
		//   98  242:aload_2         
		//   99  243:invokevirtual   #176 <Method int MotionEvent.getActionIndex()>
		//  100  246:istore          4
				if(motionevent.getPointerId(l) != mActivePointerId)
					break;
		//  101  248:aload_2         
		//  102  249:iload           4
		//  103  251:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
		//  104  254:aload_0         
		//  105  255:getfield        #14  <Field ItemTouchHelper this$0>
		//  106  258:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		//  107  261:icmpne          305
				int j;
				if(l == 0)
		//* 108  264:iload           4
		//* 109  266:ifne            274
					j = 1;
		//  110  269:iconst_1        
		//  111  270:istore_3        
				else
		//* 112  271:goto            276
					j = 0;
		//  113  274:iconst_0        
		//  114  275:istore_3        
				mActivePointerId = motionevent.getPointerId(j);
		//  115  276:aload_0         
		//  116  277:getfield        #14  <Field ItemTouchHelper this$0>
		//  117  280:aload_2         
		//  118  281:iload_3         
		//  119  282:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
		//  120  285:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
				updateDxDy(motionevent, mSelectedFlags, l);
		//  121  288:aload_0         
		//  122  289:getfield        #14  <Field ItemTouchHelper this$0>
		//  123  292:aload_2         
		//  124  293:aload_0         
		//  125  294:getfield        #14  <Field ItemTouchHelper this$0>
		//  126  297:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
		//  127  300:iload           4
		//  128  302:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
				break;
			}
		//  129  305:return          
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
		//    1    1:getfield        #21  <Field ItemTouchHelper$RecoverAnimation this$1>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #35  <Method float ValueAnimator.getAnimatedFraction()>
		//    4    8:invokevirtual   #39  <Method void ItemTouchHelper$RecoverAnimation.setFraction(float)>
		//    5   11:return          
		}

		final RecoverAnimation this$1;
		final ItemTouchHelper val$this$0;

			
			{
				this$1 = final_recoveranimation;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ItemTouchHelper$RecoverAnimation this$1>
				this$0 = ItemTouchHelper.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ItemTouchHelper val$this$0>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}
