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
			return ((android.support.v7.widget.) (recyclerview)).getMoveDuration();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #170 <Method long android.support.v7.widget.RecyclerView$ItemAnimator.getMoveDuration()>
	//   17   33:lreturn         
		else
			return ((android.support.v7.widget.) (recyclerview)).getRemoveDuration();
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
			imation imation = (imation)list.get(j);
	//    8   19:aload           4
	//    9   21:iload           8
	//   10   23:invokeinterface #119 <Method Object List.get(int)>
	//   11   28:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
	//   12   31:astore          11
			imation.update();
	//   13   33:aload           11
	//   14   35:invokevirtual   #224 <Method void ItemTouchHelper$RecoverAnimation.update()>
			int i1 = canvas.save();
	//   15   38:aload_1         
	//   16   39:invokevirtual   #229 <Method int Canvas.save()>
	//   17   42:istore          10
			onChildDraw(canvas, recyclerview, imation.mViewHolder, imation.mX, imation.mY, imation.mActionState, false);
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
			imation imation = (imation)list.get(j);
	//    8   19:aload           4
	//    9   21:iload           8
	//   10   23:invokeinterface #119 <Method Object List.get(int)>
	//   11   28:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
	//   12   31:astore          11
			int j1 = canvas.save();
	//   13   33:aload_1         
	//   14   34:invokevirtual   #229 <Method int Canvas.save()>
	//   15   37:istore          10
			onChildDrawOver(canvas, recyclerview, imation.mViewHolder, imation.mX, imation.mY, imation.mActionState, false);
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
			canvas = ((Canvas) ((imation)list.get(l)));
	//   62  125:aload           4
	//   63  127:iload           8
	//   64  129:invokeinterface #119 <Method Object List.get(int)>
	//   65  134:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
	//   66  137:astore_1        
			if(((imation) (canvas)).mEnded && !((imation) (canvas)).mIsPendingCleanup)
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
			if(!((imation) (canvas)).mEnded)
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
		android.support.v7.widget.r r = recyclerview.getLayoutManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #272 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    2    4:astore          8
		if(r instanceof andler)
	//*   3    6:aload           8
	//*   4    8:instanceof      #274 <Class ItemTouchHelper$ViewDropHandler>
	//*   5   11:ifeq            38
		{
			((andler)r).prepareForDrop(viewholder.itemView, viewholder1.itemView, k, l);
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
			if(r.canScrollHorizontally())
	//*  16   38:aload           8
	//*  17   40:invokevirtual   #283 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  18   43:ifeq            97
			{
				if(r.getDecoratedLeft(viewholder1.itemView) <= recyclerview.getPaddingLeft())
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
				if(r.getDecoratedRight(viewholder1.itemView) >= recyclerview.getWidth() - recyclerview.getPaddingRight())
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
			if(r.canScrollVertically())
	//*  42   97:aload           8
	//*  43   99:invokevirtual   #302 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//*  44  102:ifeq            37
			{
				if(r.getDecoratedTop(viewholder1.itemView) <= recyclerview.getPaddingTop())
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
				if(r.getDecoratedBottom(viewholder1.itemView) >= recyclerview.getHeight() - recyclerview.getPaddingBottom())
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
			sUICallback = ((ItemTouchUIUtil) (new Impl()));
	//   11   28:new             #47  <Class ItemTouchUIUtilImpl$Api21Impl>
	//   12   31:dup             
	//   13   32:invokespecial   #48  <Method void ItemTouchUIUtilImpl$Api21Impl()>
	//   14   35:putstatic       #50  <Field ItemTouchUIUtil sUICallback>
	//   15   38:return          
		else
			sUICallback = ((ItemTouchUIUtil) (new mpl()));
	//   16   39:new             #52  <Class ItemTouchUIUtilImpl$BaseImpl>
	//   17   42:dup             
	//   18   43:invokespecial   #53  <Method void ItemTouchUIUtilImpl$BaseImpl()>
	//   19   46:putstatic       #50  <Field ItemTouchUIUtil sUICallback>
	//*  20   49:return          
	}

	public ItemTouchHelper$Callback()
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
