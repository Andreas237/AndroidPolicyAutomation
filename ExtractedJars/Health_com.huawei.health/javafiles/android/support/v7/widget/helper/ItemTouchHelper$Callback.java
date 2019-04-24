// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.List;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper, ItemTouchUIUtil

public static abstract class ItemTouchHelper$Callback
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
			return ((android.support.v7.widget.) (recyclerview)).getMoveDuration();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #173 <Method long android.support.v7.widget.RecyclerView$ItemAnimator.getMoveDuration()>
	//   17   33:lreturn         
		else
			return ((android.support.v7.widget.) (recyclerview)).getRemoveDuration();
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
			imation imation = (imation)list.get(j);
	//    8   19:aload           4
	//    9   21:iload           8
	//   10   23:invokeinterface #122 <Method Object List.get(int)>
	//   11   28:checkcast       #224 <Class ItemTouchHelper$RecoverAnimation>
	//   12   31:astore          11
			imation.update();
	//   13   33:aload           11
	//   14   35:invokevirtual   #227 <Method void ItemTouchHelper$RecoverAnimation.update()>
			int i1 = canvas.save();
	//   15   38:aload_1         
	//   16   39:invokevirtual   #232 <Method int Canvas.save()>
	//   17   42:istore          10
			onChildDraw(canvas, recyclerview, imation.mViewHolder, imation.mX, imation.mY, imation.mActionState, false);
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
			imation imation = (imation)list.get(j);
	//    8   19:aload           4
	//    9   21:iload           8
	//   10   23:invokeinterface #122 <Method Object List.get(int)>
	//   11   28:checkcast       #224 <Class ItemTouchHelper$RecoverAnimation>
	//   12   31:astore          11
			int i1 = canvas.save();
	//   13   33:aload_1         
	//   14   34:invokevirtual   #232 <Method int Canvas.save()>
	//   15   37:istore          10
			onChildDrawOver(canvas, recyclerview, imation.mViewHolder, imation.mX, imation.mY, imation.mActionState, false);
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
			canvas = ((Canvas) ((imation)list.get(i)));
	//   62  125:aload           4
	//   63  127:iload           5
	//   64  129:invokeinterface #122 <Method Object List.get(int)>
	//   65  134:checkcast       #224 <Class ItemTouchHelper$RecoverAnimation>
	//   66  137:astore_1        
			if(((imation) (canvas)).mEnded && !((imation) (canvas)).mIsPendingCleanup)
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
			if(!((imation) (canvas)).mEnded)
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
		android.support.v7.widget.r r = recyclerview.getLayoutManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #275 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    2    4:astore          8
		if(r instanceof andler)
	//*   3    6:aload           8
	//*   4    8:instanceof      #277 <Class ItemTouchHelper$ViewDropHandler>
	//*   5   11:ifeq            38
		{
			((andler)r).prepareForDrop(viewholder.itemView, viewholder1.itemView, k, l);
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
		if(r.canScrollHorizontally())
	//*  16   38:aload           8
	//*  17   40:invokevirtual   #286 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  18   43:ifeq            97
		{
			if(r.getDecoratedLeft(viewholder1.itemView) <= recyclerview.getPaddingLeft())
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
			if(r.getDecoratedRight(viewholder1.itemView) >= recyclerview.getWidth() - recyclerview.getPaddingRight())
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
		if(r.canScrollVertically())
	//*  42   97:aload           8
	//*  43   99:invokevirtual   #305 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//*  44  102:ifeq            156
		{
			if(r.getDecoratedTop(viewholder1.itemView) <= recyclerview.getPaddingTop())
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
			if(r.getDecoratedBottom(viewholder1.itemView) >= recyclerview.getHeight() - recyclerview.getPaddingBottom())
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
			sUICallback = ((ItemTouchUIUtil) (new pop()));
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
			sUICallback = ((ItemTouchUIUtil) (new comb()));
	//   19   47:new             #52  <Class ItemTouchUIUtilImpl$Honeycomb>
	//   20   50:dup             
	//   21   51:invokespecial   #53  <Method void ItemTouchUIUtilImpl$Honeycomb()>
	//   22   54:putstatic       #50  <Field ItemTouchUIUtil sUICallback>
	//   23   57:return          
		else
			sUICallback = ((ItemTouchUIUtil) (new rbread()));
	//   24   58:new             #55  <Class ItemTouchUIUtilImpl$Gingerbread>
	//   25   61:dup             
	//   26   62:invokespecial   #56  <Method void ItemTouchUIUtilImpl$Gingerbread()>
	//   27   65:putstatic       #50  <Field ItemTouchUIUtil sUICallback>
	//*  28   68:return          
	}

	public ItemTouchHelper$Callback()
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
