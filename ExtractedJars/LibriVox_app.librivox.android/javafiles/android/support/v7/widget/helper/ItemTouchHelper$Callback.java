// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.v4.view.ac;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.List;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchUIUtilImpl, ItemTouchUIUtil

public abstract class ItemTouchHelper$Callback
{

	public static int convertToRelativeDirection(int i, int j)
	{
		int k = i & 0xc0c0c;
	//    0    0:iload_0         
	//    1    1:ldc1            #7   <Int 0xc0c0c>
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
	//   27   32:ldc1            #42  <Int 0xfff3f3f3>
	//   28   34:iload_1         
	//   29   35:iand            
	//   30   36:ior             
	//   31   37:iload_1         
	//   32   38:ldc1            #7   <Int 0xc0c0c>
	//   33   40:iand            
	//   34   41:iconst_2        
	//   35   42:ishl            
	//   36   43:ior             
	//   37   44:ireturn         
		}
	}

	public static ItemTouchUIUtil getDefaultUIUtil()
	{
		return ItemTouchUIUtilImpl.INSTANCE;
	//    0    0:getstatic       #50  <Field ItemTouchUIUtil ItemTouchUIUtilImpl.INSTANCE>
	//    1    3:areturn         
	}

	private int getMaxDragScroll(RecyclerView recyclerview)
	{
		if(mCachedMaxScrollSpeed == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field int mCachedMaxScrollSpeed>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          22
			mCachedMaxScrollSpeed = recyclerview.getResources().getDimensionPixelSize(android.support.v7.recyclerview.R.dimen.item_touch_helper_max_drag_scroll_per_frame);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #58  <Method Resources RecyclerView.getResources()>
	//    7   13:getstatic       #63  <Field int android.support.v7.recyclerview.R$dimen.item_touch_helper_max_drag_scroll_per_frame>
	//    8   16:invokevirtual   #69  <Method int Resources.getDimensionPixelSize(int)>
	//    9   19:putfield        #39  <Field int mCachedMaxScrollSpeed>
		return mCachedMaxScrollSpeed;
	//   10   22:aload_0         
	//   11   23:getfield        #39  <Field int mCachedMaxScrollSpeed>
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
	//    4    4:invokestatic    #73  <Method int makeFlag(int, int)>
	//    5    7:istore_2        
		j = makeFlag(1, j);
	//    6    8:iconst_1        
	//    7    9:iload_1         
	//    8   10:invokestatic    #73  <Method int makeFlag(int, int)>
	//    9   13:istore_1        
		return makeFlag(2, i) | (j | k);
	//   10   14:iconst_2        
	//   11   15:iload_0         
	//   12   16:invokestatic    #73  <Method int makeFlag(int, int)>
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
		int l1 = viewholder.itemView.getWidth();
	//    0    0:aload_1         
	//    1    1:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//    2    4:invokevirtual   #89  <Method int View.getWidth()>
	//    3    7:istore          9
		int i2 = viewholder.itemView.getHeight();
	//    4    9:aload_1         
	//    5   10:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//    6   13:invokevirtual   #92  <Method int View.getHeight()>
	//    7   16:istore          10
		int j2 = i - viewholder.itemView.getLeft();
	//    8   18:iload_3         
	//    9   19:aload_1         
	//   10   20:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   11   23:invokevirtual   #95  <Method int View.getLeft()>
	//   12   26:isub            
	//   13   27:istore          11
		int k2 = j - viewholder.itemView.getTop();
	//   14   29:iload           4
	//   15   31:aload_1         
	//   16   32:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   17   35:invokevirtual   #98  <Method int View.getTop()>
	//   18   38:isub            
	//   19   39:istore          12
		int l2 = list.size();
	//   20   41:aload_2         
	//   21   42:invokeinterface #103 <Method int List.size()>
	//   22   47:istore          13
		android.support.v7.widget.RecyclerView.ViewHolder viewholder3 = null;
	//   23   49:aconst_null     
	//   24   50:astore          16
		int k = -1;
	//   25   52:iconst_m1       
	//   26   53:istore          5
		for(int i1 = 0; i1 < l2; i1++)
	//*  27   55:iconst_0        
	//*  28   56:istore          7
	//*  29   58:iload           7
	//*  30   60:iload           13
	//*  31   62:icmpge          413
		{
			int l;
			android.support.v7.widget.RecyclerView.ViewHolder viewholder1;
label0:
			{
				viewholder1 = (android.support.v7.widget.RecyclerView.ViewHolder)list.get(i1);
	//   32   65:aload_2         
	//   33   66:iload           7
	//   34   68:invokeinterface #107 <Method Object List.get(int)>
	//   35   73:checkcast       #79  <Class android.support.v7.widget.RecyclerView$ViewHolder>
	//   36   76:astore          14
				if(j2 > 0)
	//*  37   78:iload           11
	//*  38   80:ifle            142
				{
					l = viewholder1.itemView.getRight() - (i + l1);
	//   39   83:aload           14
	//   40   85:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   41   88:invokevirtual   #110 <Method int View.getRight()>
	//   42   91:iload_3         
	//   43   92:iload           9
	//   44   94:iadd            
	//   45   95:isub            
	//   46   96:istore          6
					if(l < 0 && viewholder1.itemView.getRight() > viewholder.itemView.getRight())
	//*  47   98:iload           6
	//*  48  100:ifge            142
	//*  49  103:aload           14
	//*  50  105:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  51  108:invokevirtual   #110 <Method int View.getRight()>
	//*  52  111:aload_1         
	//*  53  112:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  54  115:invokevirtual   #110 <Method int View.getRight()>
	//*  55  118:icmple          142
					{
						l = Math.abs(l);
	//   56  121:iload           6
	//   57  123:invokestatic    #115 <Method int Math.abs(int)>
	//   58  126:istore          6
						if(l > k)
	//*  59  128:iload           6
	//*  60  130:iload           5
	//*  61  132:icmple          142
						{
							viewholder3 = viewholder1;
	//   62  135:aload           14
	//   63  137:astore          16
							break label0;
	//   64  139:goto            146
						}
					}
				}
				l = k;
	//   65  142:iload           5
	//   66  144:istore          6
			}
			android.support.v7.widget.RecyclerView.ViewHolder viewholder2 = viewholder3;
	//   67  146:aload           16
	//   68  148:astore          15
			k = l;
	//   69  150:iload           6
	//   70  152:istore          5
			if(j2 < 0)
	//*  71  154:iload           11
	//*  72  156:ifge            240
			{
				int j1 = viewholder1.itemView.getLeft() - i;
	//   73  159:aload           14
	//   74  161:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   75  164:invokevirtual   #95  <Method int View.getLeft()>
	//   76  167:iload_3         
	//   77  168:isub            
	//   78  169:istore          8
				viewholder2 = viewholder3;
	//   79  171:aload           16
	//   80  173:astore          15
				k = l;
	//   81  175:iload           6
	//   82  177:istore          5
				if(j1 > 0)
	//*  83  179:iload           8
	//*  84  181:ifle            240
				{
					viewholder2 = viewholder3;
	//   85  184:aload           16
	//   86  186:astore          15
					k = l;
	//   87  188:iload           6
	//   88  190:istore          5
					if(viewholder1.itemView.getLeft() < viewholder.itemView.getLeft())
	//*  89  192:aload           14
	//*  90  194:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  91  197:invokevirtual   #95  <Method int View.getLeft()>
	//*  92  200:aload_1         
	//*  93  201:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  94  204:invokevirtual   #95  <Method int View.getLeft()>
	//*  95  207:icmpge          240
					{
						j1 = Math.abs(j1);
	//   96  210:iload           8
	//   97  212:invokestatic    #115 <Method int Math.abs(int)>
	//   98  215:istore          8
						viewholder2 = viewholder3;
	//   99  217:aload           16
	//  100  219:astore          15
						k = l;
	//  101  221:iload           6
	//  102  223:istore          5
						if(j1 > l)
	//* 103  225:iload           8
	//* 104  227:iload           6
	//* 105  229:icmple          240
						{
							k = j1;
	//  106  232:iload           8
	//  107  234:istore          5
							viewholder2 = viewholder1;
	//  108  236:aload           14
	//  109  238:astore          15
						}
					}
				}
			}
			viewholder3 = viewholder2;
	//  110  240:aload           15
	//  111  242:astore          16
			l = k;
	//  112  244:iload           5
	//  113  246:istore          6
			if(k2 < 0)
	//* 114  248:iload           12
	//* 115  250:ifge            335
			{
				int k1 = viewholder1.itemView.getTop() - j;
	//  116  253:aload           14
	//  117  255:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  118  258:invokevirtual   #98  <Method int View.getTop()>
	//  119  261:iload           4
	//  120  263:isub            
	//  121  264:istore          8
				viewholder3 = viewholder2;
	//  122  266:aload           15
	//  123  268:astore          16
				l = k;
	//  124  270:iload           5
	//  125  272:istore          6
				if(k1 > 0)
	//* 126  274:iload           8
	//* 127  276:ifle            335
				{
					viewholder3 = viewholder2;
	//  128  279:aload           15
	//  129  281:astore          16
					l = k;
	//  130  283:iload           5
	//  131  285:istore          6
					if(viewholder1.itemView.getTop() < viewholder.itemView.getTop())
	//* 132  287:aload           14
	//* 133  289:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 134  292:invokevirtual   #98  <Method int View.getTop()>
	//* 135  295:aload_1         
	//* 136  296:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 137  299:invokevirtual   #98  <Method int View.getTop()>
	//* 138  302:icmpge          335
					{
						k1 = Math.abs(k1);
	//  139  305:iload           8
	//  140  307:invokestatic    #115 <Method int Math.abs(int)>
	//  141  310:istore          8
						viewholder3 = viewholder2;
	//  142  312:aload           15
	//  143  314:astore          16
						l = k;
	//  144  316:iload           5
	//  145  318:istore          6
						if(k1 > k)
	//* 146  320:iload           8
	//* 147  322:iload           5
	//* 148  324:icmple          335
						{
							l = k1;
	//  149  327:iload           8
	//  150  329:istore          6
							viewholder3 = viewholder1;
	//  151  331:aload           14
	//  152  333:astore          16
						}
					}
				}
			}
			if(k2 > 0)
	//* 153  335:iload           12
	//* 154  337:ifle            400
			{
				k = viewholder1.itemView.getBottom() - (j + i2);
	//  155  340:aload           14
	//  156  342:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  157  345:invokevirtual   #118 <Method int View.getBottom()>
	//  158  348:iload           4
	//  159  350:iload           10
	//  160  352:iadd            
	//  161  353:isub            
	//  162  354:istore          5
				if(k < 0 && viewholder1.itemView.getBottom() > viewholder.itemView.getBottom())
	//* 163  356:iload           5
	//* 164  358:ifge            400
	//* 165  361:aload           14
	//* 166  363:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 167  366:invokevirtual   #118 <Method int View.getBottom()>
	//* 168  369:aload_1         
	//* 169  370:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//* 170  373:invokevirtual   #118 <Method int View.getBottom()>
	//* 171  376:icmple          400
				{
					k = Math.abs(k);
	//  172  379:iload           5
	//  173  381:invokestatic    #115 <Method int Math.abs(int)>
	//  174  384:istore          5
					if(k > l)
	//* 175  386:iload           5
	//* 176  388:iload           6
	//* 177  390:icmple          400
					{
						viewholder3 = viewholder1;
	//  178  393:aload           14
	//  179  395:astore          16
						continue;
	//  180  397:goto            404
					}
				}
			}
			k = l;
	//  181  400:iload           6
	//  182  402:istore          5
		}

	//  183  404:iload           7
	//  184  406:iconst_1        
	//  185  407:iadd            
	//  186  408:istore          7
	//* 187  410:goto            58
		return viewholder3;
	//  188  413:aload           16
	//  189  415:areturn         
	}

	public void clearView(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		ItemTouchUIUtilImpl.INSTANCE.clearView(viewholder.itemView);
	//    0    0:getstatic       #50  <Field ItemTouchUIUtil ItemTouchUIUtilImpl.INSTANCE>
	//    1    3:aload_2         
	//    2    4:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//    3    7:invokeinterface #125 <Method void ItemTouchUIUtil.clearView(View)>
	//    4   12:return          
	}

	public int convertToAbsoluteDirection(int i, int j)
	{
		int k = i & 0x303030;
	//    0    0:iload_1         
	//    1    1:ldc1            #17  <Int 0x303030>
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
	//   27   32:ldc1            #127 <Int 0xffcfcfcf>
	//   28   34:iload_2         
	//   29   35:iand            
	//   30   36:ior             
	//   31   37:iload_2         
	//   32   38:ldc1            #17  <Int 0x303030>
	//   33   40:iand            
	//   34   41:iconst_2        
	//   35   42:ishr            
	//   36   43:ior             
	//   37   44:ireturn         
		}
	}

	final int getAbsoluteMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		return convertToAbsoluteDirection(getMovementFlags(recyclerview, viewholder), ac.f(((View) (recyclerview))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #132 <Method int getMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//    5    7:aload_1         
	//    6    8:invokestatic    #138 <Method int ac.f(View)>
	//    7   11:invokevirtual   #140 <Method int convertToAbsoluteDirection(int, int)>
	//    8   14:ireturn         
	}

	public long getAnimationDuration(RecyclerView recyclerview, int i, float f, float f1)
	{
		recyclerview = ((RecyclerView) (recyclerview.getItemAnimator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #146 <Method android.support.v7.widget.RecyclerView$ItemAnimator RecyclerView.getItemAnimator()>
	//    2    4:astore_1        
		if(recyclerview == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       23
			return i != 8 ? 250L : 200L;
	//    5    9:iload_2         
	//    6   10:bipush          8
	//    7   12:icmpne          19
	//    8   15:ldc2w           #147 <Long 200L>
	//    9   18:lreturn         
	//   10   19:ldc2w           #149 <Long 250L>
	//   11   22:lreturn         
		if(i == 8)
	//*  12   23:iload_2         
	//*  13   24:bipush          8
	//*  14   26:icmpne          34
			return ((android.support.v7.widget.) (recyclerview)).getMoveDuration();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #156 <Method long android.support.v7.widget.RecyclerView$ItemAnimator.getMoveDuration()>
	//   17   33:lreturn         
		else
			return ((android.support.v7.widget.) (recyclerview)).getRemoveDuration();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #159 <Method long android.support.v7.widget.RecyclerView$ItemAnimator.getRemoveDuration()>
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
	//    0    0:ldc1            #163 <Float 0.5F>
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
	//    0    0:ldc1            #163 <Float 0.5F>
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
	//    3    3:invokevirtual   #171 <Method int getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//    4    6:ldc1            #172 <Int 0xff0000>
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
	//    3    3:invokevirtual   #171 <Method int getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//    4    6:ldc1            #174 <Int 65280>
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
	//    2    2:invokespecial   #178 <Method int getMaxDragScroll(RecyclerView)>
	//    3    5:istore          4
		int i1 = Math.abs(j);
	//    4    7:iload_3         
	//    5    8:invokestatic    #115 <Method int Math.abs(int)>
	//    6   11:istore          9
		int j1 = (int)Math.signum(j);
	//    7   13:iload_3         
	//    8   14:i2f             
	//    9   15:invokestatic    #181 <Method float Math.signum(float)>
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
	//   24   37:invokestatic    #185 <Method float Math.min(float, float)>
	//   25   40:fstore          8
		i = (int)((float)(j1 * k) * sDragViewScrollCapInterpolator.getInterpolation(f1));
	//   26   42:iload           10
	//   27   44:iload           4
	//   28   46:imul            
	//   29   47:i2f             
	//   30   48:getstatic       #35  <Field Interpolator sDragViewScrollCapInterpolator>
	//   31   51:fload           8
	//   32   53:invokeinterface #190 <Method float Interpolator.getInterpolation(float)>
	//   33   58:fmul            
	//   34   59:f2i             
	//   35   60:istore_2        
		if(l <= 2000L)
	//*  36   61:lload           5
	//*  37   63:ldc2w           #14  <Long 2000L>
	//*  38   66:lcmp            
	//*  39   67:ifle            73
	//*  40   70:goto            81
			f = (float)l / 2000F;
	//   41   73:lload           5
	//   42   75:l2f             
	//   43   76:ldc1            #191 <Float 2000F>
	//   44   78:fdiv            
	//   45   79:fstore          7
		i = (int)((float)i * sDragScrollInterpolator.getInterpolation(f));
	//   46   81:iload_2         
	//   47   82:i2f             
	//   48   83:getstatic       #30  <Field Interpolator sDragScrollInterpolator>
	//   49   86:fload           7
	//   50   88:invokeinterface #190 <Method float Interpolator.getInterpolation(float)>
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
		ItemTouchUIUtilImpl.INSTANCE.onDraw(canvas, recyclerview, viewholder.itemView, f, f1, i, flag);
	//    0    0:getstatic       #50  <Field ItemTouchUIUtil ItemTouchUIUtilImpl.INSTANCE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//    5    9:fload           4
	//    6   11:fload           5
	//    7   13:iload           6
	//    8   15:iload           7
	//    9   17:invokeinterface #200 <Method void ItemTouchUIUtil.onDraw(Canvas, RecyclerView, View, float, float, int, boolean)>
	//   10   22:return          
	}

	public void onChildDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, float f, float f1, int i, boolean flag)
	{
		ItemTouchUIUtilImpl.INSTANCE.onDrawOver(canvas, recyclerview, viewholder.itemView, f, f1, i, flag);
	//    0    0:getstatic       #50  <Field ItemTouchUIUtil ItemTouchUIUtilImpl.INSTANCE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//    5    9:fload           4
	//    6   11:fload           5
	//    7   13:iload           6
	//    8   15:iload           7
	//    9   17:invokeinterface #204 <Method void ItemTouchUIUtil.onDrawOver(Canvas, RecyclerView, View, float, float, int, boolean)>
	//   10   22:return          
	}

	void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, float f, float f1)
	{
		int l = list.size();
	//    0    0:aload           4
	//    1    2:invokeinterface #103 <Method int List.size()>
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
	//   10   23:invokeinterface #107 <Method Object List.get(int)>
	//   11   28:checkcast       #207 <Class ItemTouchHelper$RecoverAnimation>
	//   12   31:astore          11
			imation.update();
	//   13   33:aload           11
	//   14   35:invokevirtual   #210 <Method void ItemTouchHelper$RecoverAnimation.update()>
			int i1 = canvas.save();
	//   15   38:aload_1         
	//   16   39:invokevirtual   #215 <Method int Canvas.save()>
	//   17   42:istore          10
			onChildDraw(canvas, recyclerview, imation.mViewHolder, imation.mX, imation.mY, imation.mActionState, false);
	//   18   44:aload_0         
	//   19   45:aload_1         
	//   20   46:aload_2         
	//   21   47:aload           11
	//   22   49:getfield        #219 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   23   52:aload           11
	//   24   54:getfield        #223 <Field float ItemTouchHelper$RecoverAnimation.mX>
	//   25   57:aload           11
	//   26   59:getfield        #226 <Field float ItemTouchHelper$RecoverAnimation.mY>
	//   27   62:aload           11
	//   28   64:getfield        #229 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
	//   29   67:iconst_0        
	//   30   68:invokevirtual   #231 <Method void onChildDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
			canvas.restoreToCount(i1);
	//   31   71:aload_1         
	//   32   72:iload           10
	//   33   74:invokevirtual   #235 <Method void Canvas.restoreToCount(int)>
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
	//   42   91:invokevirtual   #215 <Method int Canvas.save()>
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
	//   52  107:invokevirtual   #231 <Method void onChildDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
			canvas.restoreToCount(k);
	//   53  110:aload_1         
	//   54  111:iload           8
	//   55  113:invokevirtual   #235 <Method void Canvas.restoreToCount(int)>
		}
	//   56  116:return          
	}

	void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, float f, float f1)
	{
		int l = list.size();
	//    0    0:aload           4
	//    1    2:invokeinterface #103 <Method int List.size()>
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
			imation imation = (imation)list.get(j);
	//   10   22:aload           4
	//   11   24:iload           8
	//   12   26:invokeinterface #107 <Method Object List.get(int)>
	//   13   31:checkcast       #207 <Class ItemTouchHelper$RecoverAnimation>
	//   14   34:astore          12
			int i1 = canvas.save();
	//   15   36:aload_1         
	//   16   37:invokevirtual   #215 <Method int Canvas.save()>
	//   17   40:istore          11
			onChildDrawOver(canvas, recyclerview, imation.mViewHolder, imation.mX, imation.mY, imation.mActionState, false);
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:aload_2         
	//   21   45:aload           12
	//   22   47:getfield        #219 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   23   50:aload           12
	//   24   52:getfield        #223 <Field float ItemTouchHelper$RecoverAnimation.mX>
	//   25   55:aload           12
	//   26   57:getfield        #226 <Field float ItemTouchHelper$RecoverAnimation.mY>
	//   27   60:aload           12
	//   28   62:getfield        #229 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
	//   29   65:iconst_0        
	//   30   66:invokevirtual   #237 <Method void onChildDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
			canvas.restoreToCount(i1);
	//   31   69:aload_1         
	//   32   70:iload           11
	//   33   72:invokevirtual   #235 <Method void Canvas.restoreToCount(int)>
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
	//   42   89:invokevirtual   #215 <Method int Canvas.save()>
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
	//   52  105:invokevirtual   #237 <Method void onChildDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
			canvas.restoreToCount(k);
	//   53  108:aload_1         
	//   54  109:iload           8
	//   55  111:invokevirtual   #235 <Method void Canvas.restoreToCount(int)>
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
			canvas = ((Canvas) ((imation)list.get(i)));
	//   64  129:aload           4
	//   65  131:iload           5
	//   66  133:invokeinterface #107 <Method Object List.get(int)>
	//   67  138:checkcast       #207 <Class ItemTouchHelper$RecoverAnimation>
	//   68  141:astore_1        
			if(((imation) (canvas)).mEnded && !((imation) (canvas)).mIsPendingCleanup)
	//*  69  142:aload_1         
	//*  70  143:getfield        #241 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
	//*  71  146:ifeq            169
	//*  72  149:aload_1         
	//*  73  150:getfield        #244 <Field boolean ItemTouchHelper$RecoverAnimation.mIsPendingCleanup>
	//*  74  153:ifne            169
			{
				list.remove(i);
	//   75  156:aload           4
	//   76  158:iload           5
	//   77  160:invokeinterface #247 <Method Object List.remove(int)>
	//   78  165:pop             
				continue;
	//   79  166:goto            179
			}
			if(!((imation) (canvas)).mEnded)
	//*  80  169:aload_1         
	//*  81  170:getfield        #241 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
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
	//   93  194:invokevirtual   #250 <Method void RecyclerView.invalidate()>
	//   94  197:return          
	}

	public abstract boolean onMove(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1);

	public void onMoved(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, android.support.v7.widget.RecyclerView.ViewHolder viewholder1, int j, int k, int l)
	{
		android.support.v7.widget.r r = recyclerview.getLayoutManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #257 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    2    4:astore          8
		if(r instanceof andler)
	//*   3    6:aload           8
	//*   4    8:instanceof      #259 <Class ItemTouchHelper$ViewDropHandler>
	//*   5   11:ifeq            38
		{
			((andler)r).prepareForDrop(viewholder.itemView, viewholder1.itemView, k, l);
	//    6   14:aload           8
	//    7   16:checkcast       #259 <Class ItemTouchHelper$ViewDropHandler>
	//    8   19:aload_2         
	//    9   20:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   10   23:aload           4
	//   11   25:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   12   28:iload           6
	//   13   30:iload           7
	//   14   32:invokeinterface #263 <Method void ItemTouchHelper$ViewDropHandler.prepareForDrop(View, View, int, int)>
			return;
	//   15   37:return          
		}
		if(r.canScrollHorizontally())
	//*  16   38:aload           8
	//*  17   40:invokevirtual   #268 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  18   43:ifeq            97
		{
			if(r.getDecoratedLeft(viewholder1.itemView) <= recyclerview.getPaddingLeft())
	//*  19   46:aload           8
	//*  20   48:aload           4
	//*  21   50:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  22   53:invokevirtual   #271 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedLeft(View)>
	//*  23   56:aload_1         
	//*  24   57:invokevirtual   #274 <Method int RecyclerView.getPaddingLeft()>
	//*  25   60:icmpgt          69
				recyclerview.scrollToPosition(j);
	//   26   63:aload_1         
	//   27   64:iload           5
	//   28   66:invokevirtual   #277 <Method void RecyclerView.scrollToPosition(int)>
			if(r.getDecoratedRight(viewholder1.itemView) >= recyclerview.getWidth() - recyclerview.getPaddingRight())
	//*  29   69:aload           8
	//*  30   71:aload           4
	//*  31   73:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  32   76:invokevirtual   #280 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedRight(View)>
	//*  33   79:aload_1         
	//*  34   80:invokevirtual   #281 <Method int RecyclerView.getWidth()>
	//*  35   83:aload_1         
	//*  36   84:invokevirtual   #284 <Method int RecyclerView.getPaddingRight()>
	//*  37   87:isub            
	//*  38   88:icmplt          97
				recyclerview.scrollToPosition(j);
	//   39   91:aload_1         
	//   40   92:iload           5
	//   41   94:invokevirtual   #277 <Method void RecyclerView.scrollToPosition(int)>
		}
		if(r.canScrollVertically())
	//*  42   97:aload           8
	//*  43   99:invokevirtual   #287 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//*  44  102:ifeq            156
		{
			if(r.getDecoratedTop(viewholder1.itemView) <= recyclerview.getPaddingTop())
	//*  45  105:aload           8
	//*  46  107:aload           4
	//*  47  109:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  48  112:invokevirtual   #290 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedTop(View)>
	//*  49  115:aload_1         
	//*  50  116:invokevirtual   #293 <Method int RecyclerView.getPaddingTop()>
	//*  51  119:icmpgt          128
				recyclerview.scrollToPosition(j);
	//   52  122:aload_1         
	//   53  123:iload           5
	//   54  125:invokevirtual   #277 <Method void RecyclerView.scrollToPosition(int)>
			if(r.getDecoratedBottom(viewholder1.itemView) >= recyclerview.getHeight() - recyclerview.getPaddingBottom())
	//*  55  128:aload           8
	//*  56  130:aload           4
	//*  57  132:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  58  135:invokevirtual   #296 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedBottom(View)>
	//*  59  138:aload_1         
	//*  60  139:invokevirtual   #297 <Method int RecyclerView.getHeight()>
	//*  61  142:aload_1         
	//*  62  143:invokevirtual   #300 <Method int RecyclerView.getPaddingBottom()>
	//*  63  146:isub            
	//*  64  147:icmplt          156
				recyclerview.scrollToPosition(j);
	//   65  150:aload_1         
	//   66  151:iload           5
	//   67  153:invokevirtual   #277 <Method void RecyclerView.scrollToPosition(int)>
		}
	//   68  156:return          
	}

	public void onSelectedChanged(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		if(viewholder != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
			ItemTouchUIUtilImpl.INSTANCE.onSelected(viewholder.itemView);
	//    2    4:getstatic       #50  <Field ItemTouchUIUtil ItemTouchUIUtilImpl.INSTANCE>
	//    3    7:aload_1         
	//    4    8:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//    5   11:invokeinterface #305 <Method void ItemTouchUIUtil.onSelected(View)>
	//    6   16:return          
	}

	public abstract void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i);

	private static final int ABS_HORIZONTAL_DIR_FLAGS = 0xc0c0c;
	public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
	public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
	private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
	static final int RELATIVE_DIR_FLAGS = 0x303030;
	private static final Interpolator sDragScrollInterpolator = new _cls1();
	private static final Interpolator sDragViewScrollCapInterpolator = new _cls2();
	private int mCachedMaxScrollSpeed;

	static 
	{
		class _cls1
			implements Interpolator
		{

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

			_cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #10  <Method void Object()>
			//    2    4:return          
			}
		}

	//    0    0:new             #25  <Class ItemTouchHelper$Callback$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void ItemTouchHelper$Callback$1()>
	//    3    7:putstatic       #30  <Field Interpolator sDragScrollInterpolator>
		class _cls2
			implements Interpolator
		{

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

			_cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #10  <Method void Object()>
			//    2    4:return          
			}
		}

	//    4   10:new             #32  <Class ItemTouchHelper$Callback$2>
	//    5   13:dup             
	//    6   14:invokespecial   #33  <Method void ItemTouchHelper$Callback$2()>
	//    7   17:putstatic       #35  <Field Interpolator sDragViewScrollCapInterpolator>
	//*   8   20:return          
	}

	public ItemTouchHelper$Callback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mCachedMaxScrollSpeed = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #39  <Field int mCachedMaxScrollSpeed>
	//    5    9:return          
	}
}
