// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.math.MathUtils;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//			BottomSheetBehavior

class BottomSheetBehavior$2 extends android.support.v4.widget.k
{

	public int clampViewPositionHorizontal(View view, int i, int j)
	{
		return view.getLeft();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method int View.getLeft()>
	//    2    4:ireturn         
	}

	public int clampViewPositionVertical(View view, int i, int j)
	{
		int k = BottomSheetBehavior.access$100(BottomSheetBehavior.this);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field BottomSheetBehavior this$0>
	//    2    4:invokestatic    #31  <Method int BottomSheetBehavior.access$100(BottomSheetBehavior)>
	//    3    7:istore          4
		if(hideable)
	//*   4    9:aload_0         
	//*   5   10:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   6   13:getfield        #35  <Field boolean BottomSheetBehavior.hideable>
	//*   7   16:ifeq            30
			j = parentHeight;
	//    8   19:aload_0         
	//    9   20:getfield        #12  <Field BottomSheetBehavior this$0>
	//   10   23:getfield        #39  <Field int BottomSheetBehavior.parentHeight>
	//   11   26:istore_3        
		else
	//*  12   27:goto            38
			j = collapsedOffset;
	//   13   30:aload_0         
	//   14   31:getfield        #12  <Field BottomSheetBehavior this$0>
	//   15   34:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
	//   16   37:istore_3        
		return MathUtils.clamp(i, k, j);
	//   17   38:iload_2         
	//   18   39:iload           4
	//   19   41:iload_3         
	//   20   42:invokestatic    #48  <Method int MathUtils.clamp(int, int, int)>
	//   21   45:ireturn         
	}

	public int getViewVerticalDragRange(View view)
	{
		if(hideable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   2    4:getfield        #35  <Field boolean BottomSheetBehavior.hideable>
	//*   3    7:ifeq            18
			return parentHeight;
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field BottomSheetBehavior this$0>
	//    6   14:getfield        #39  <Field int BottomSheetBehavior.parentHeight>
	//    7   17:ireturn         
		else
			return collapsedOffset;
	//    8   18:aload_0         
	//    9   19:getfield        #12  <Field BottomSheetBehavior this$0>
	//   10   22:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
	//   11   25:ireturn         
	}

	public void onViewDragStateChanged(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          13
			setStateInternal(1);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field BottomSheetBehavior this$0>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #55  <Method void BottomSheetBehavior.setStateInternal(int)>
	//    7   13:return          
	}

	public void onViewPositionChanged(View view, int i, int j, int k, int l)
	{
		dispatchOnSlide(j);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field BottomSheetBehavior this$0>
	//    2    4:iload_3         
	//    3    5:invokevirtual   #60  <Method void BottomSheetBehavior.dispatchOnSlide(int)>
	//    4    8:return          
	}

	public void onViewReleased(View view, float f, float f1)
	{
		byte byte0 = 4;
	//    0    0:iconst_4        
	//    1    1:istore          5
		int i;
		if(f1 < 0.0F)
	//*   2    3:fload_3         
	//*   3    4:fconst_0        
	//*   4    5:fcmpg           
	//*   5    6:ifge            73
		{
			if(BottomSheetBehavior.access$000(BottomSheetBehavior.this))
	//*   6    9:aload_0         
	//*   7   10:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   8   13:invokestatic    #66  <Method boolean BottomSheetBehavior.access$000(BottomSheetBehavior)>
	//*   9   16:ifeq            34
			{
				i = fitToContentsOffset;
	//   10   19:aload_0         
	//   11   20:getfield        #12  <Field BottomSheetBehavior this$0>
	//   12   23:getfield        #69  <Field int BottomSheetBehavior.fitToContentsOffset>
	//   13   26:istore          4
				byte0 = 3;
	//   14   28:iconst_3        
	//   15   29:istore          5
			} else
	//*  16   31:goto            350
			if(view.getTop() > halfExpandedOffset)
	//*  17   34:aload_1         
	//*  18   35:invokevirtual   #72  <Method int View.getTop()>
	//*  19   38:aload_0         
	//*  20   39:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  21   42:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
	//*  22   45:icmple          64
			{
				i = halfExpandedOffset;
	//   23   48:aload_0         
	//   24   49:getfield        #12  <Field BottomSheetBehavior this$0>
	//   25   52:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
	//   26   55:istore          4
				byte0 = 6;
	//   27   57:bipush          6
	//   28   59:istore          5
			} else
	//*  29   61:goto            350
			{
				i = 0;
	//   30   64:iconst_0        
	//   31   65:istore          4
				byte0 = 3;
	//   32   67:iconst_3        
	//   33   68:istore          5
			}
		} else
	//*  34   70:goto            350
		if(hideable && shouldHide(view, f1) && (view.getTop() > collapsedOffset || Math.abs(f) < Math.abs(f1)))
	//*  35   73:aload_0         
	//*  36   74:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  37   77:getfield        #35  <Field boolean BottomSheetBehavior.hideable>
	//*  38   80:ifeq            136
	//*  39   83:aload_0         
	//*  40   84:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  41   87:aload_1         
	//*  42   88:fload_3         
	//*  43   89:invokevirtual   #79  <Method boolean BottomSheetBehavior.shouldHide(View, float)>
	//*  44   92:ifeq            136
	//*  45   95:aload_1         
	//*  46   96:invokevirtual   #72  <Method int View.getTop()>
	//*  47   99:aload_0         
	//*  48  100:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  49  103:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
	//*  50  106:icmpgt          121
	//*  51  109:fload_2         
	//*  52  110:invokestatic    #85  <Method float Math.abs(float)>
	//*  53  113:fload_3         
	//*  54  114:invokestatic    #85  <Method float Math.abs(float)>
	//*  55  117:fcmpg           
	//*  56  118:ifge            136
		{
			i = parentHeight;
	//   57  121:aload_0         
	//   58  122:getfield        #12  <Field BottomSheetBehavior this$0>
	//   59  125:getfield        #39  <Field int BottomSheetBehavior.parentHeight>
	//   60  128:istore          4
			byte0 = 5;
	//   61  130:iconst_5        
	//   62  131:istore          5
		} else
	//*  63  133:goto            350
		if(f1 != 0.0F && Math.abs(f) <= Math.abs(f1))
	//*  64  136:fload_3         
	//*  65  137:fconst_0        
	//*  66  138:fcmpl           
	//*  67  139:ifeq            169
	//*  68  142:fload_2         
	//*  69  143:invokestatic    #85  <Method float Math.abs(float)>
	//*  70  146:fload_3         
	//*  71  147:invokestatic    #85  <Method float Math.abs(float)>
	//*  72  150:fcmpl           
	//*  73  151:ifle            157
	//*  74  154:goto            169
		{
			i = collapsedOffset;
	//   75  157:aload_0         
	//   76  158:getfield        #12  <Field BottomSheetBehavior this$0>
	//   77  161:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
	//   78  164:istore          4
		} else
	//*  79  166:goto            350
		{
			i = view.getTop();
	//   80  169:aload_1         
	//   81  170:invokevirtual   #72  <Method int View.getTop()>
	//   82  173:istore          4
			if(BottomSheetBehavior.access$000(BottomSheetBehavior.this))
	//*  83  175:aload_0         
	//*  84  176:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  85  179:invokestatic    #66  <Method boolean BottomSheetBehavior.access$000(BottomSheetBehavior)>
	//*  86  182:ifeq            241
			{
				if(Math.abs(i - fitToContentsOffset) < Math.abs(i - collapsedOffset))
	//*  87  185:iload           4
	//*  88  187:aload_0         
	//*  89  188:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  90  191:getfield        #69  <Field int BottomSheetBehavior.fitToContentsOffset>
	//*  91  194:isub            
	//*  92  195:invokestatic    #88  <Method int Math.abs(int)>
	//*  93  198:iload           4
	//*  94  200:aload_0         
	//*  95  201:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  96  204:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
	//*  97  207:isub            
	//*  98  208:invokestatic    #88  <Method int Math.abs(int)>
	//*  99  211:icmpge          229
				{
					i = fitToContentsOffset;
	//  100  214:aload_0         
	//  101  215:getfield        #12  <Field BottomSheetBehavior this$0>
	//  102  218:getfield        #69  <Field int BottomSheetBehavior.fitToContentsOffset>
	//  103  221:istore          4
					byte0 = 3;
	//  104  223:iconst_3        
	//  105  224:istore          5
				} else
	//* 106  226:goto            350
				{
					i = collapsedOffset;
	//  107  229:aload_0         
	//  108  230:getfield        #12  <Field BottomSheetBehavior this$0>
	//  109  233:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
	//  110  236:istore          4
				}
			} else
	//* 111  238:goto            350
			if(i < halfExpandedOffset)
	//* 112  241:iload           4
	//* 113  243:aload_0         
	//* 114  244:getfield        #12  <Field BottomSheetBehavior this$0>
	//* 115  247:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
	//* 116  250:icmpge          296
			{
				if(i < Math.abs(i - collapsedOffset))
	//* 117  253:iload           4
	//* 118  255:iload           4
	//* 119  257:aload_0         
	//* 120  258:getfield        #12  <Field BottomSheetBehavior this$0>
	//* 121  261:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
	//* 122  264:isub            
	//* 123  265:invokestatic    #88  <Method int Math.abs(int)>
	//* 124  268:icmpge          280
				{
					i = 0;
	//  125  271:iconst_0        
	//  126  272:istore          4
					byte0 = 3;
	//  127  274:iconst_3        
	//  128  275:istore          5
				} else
	//* 129  277:goto            350
				{
					i = halfExpandedOffset;
	//  130  280:aload_0         
	//  131  281:getfield        #12  <Field BottomSheetBehavior this$0>
	//  132  284:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
	//  133  287:istore          4
					byte0 = 6;
	//  134  289:bipush          6
	//  135  291:istore          5
				}
			} else
	//* 136  293:goto            350
			if(Math.abs(i - halfExpandedOffset) < Math.abs(i - collapsedOffset))
	//* 137  296:iload           4
	//* 138  298:aload_0         
	//* 139  299:getfield        #12  <Field BottomSheetBehavior this$0>
	//* 140  302:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
	//* 141  305:isub            
	//* 142  306:invokestatic    #88  <Method int Math.abs(int)>
	//* 143  309:iload           4
	//* 144  311:aload_0         
	//* 145  312:getfield        #12  <Field BottomSheetBehavior this$0>
	//* 146  315:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
	//* 147  318:isub            
	//* 148  319:invokestatic    #88  <Method int Math.abs(int)>
	//* 149  322:icmpge          341
			{
				i = halfExpandedOffset;
	//  150  325:aload_0         
	//  151  326:getfield        #12  <Field BottomSheetBehavior this$0>
	//  152  329:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
	//  153  332:istore          4
				byte0 = 6;
	//  154  334:bipush          6
	//  155  336:istore          5
			} else
	//* 156  338:goto            350
			{
				i = collapsedOffset;
	//  157  341:aload_0         
	//  158  342:getfield        #12  <Field BottomSheetBehavior this$0>
	//  159  345:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
	//  160  348:istore          4
			}
		}
		if(viewDragHelper.settleCapturedViewAt(view.getLeft(), i))
	//* 161  350:aload_0         
	//* 162  351:getfield        #12  <Field BottomSheetBehavior this$0>
	//* 163  354:getfield        #92  <Field ViewDragHelper BottomSheetBehavior.viewDragHelper>
	//* 164  357:aload_1         
	//* 165  358:invokevirtual   #25  <Method int View.getLeft()>
	//* 166  361:iload           4
	//* 167  363:invokevirtual   #98  <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//* 168  366:ifeq            396
		{
			setStateInternal(2);
	//  169  369:aload_0         
	//  170  370:getfield        #12  <Field BottomSheetBehavior this$0>
	//  171  373:iconst_2        
	//  172  374:invokevirtual   #55  <Method void BottomSheetBehavior.setStateInternal(int)>
			ViewCompat.postOnAnimation(view, ((Runnable) (new ttleRunnable(BottomSheetBehavior.this, view, ((int) (byte0))))));
	//  173  377:aload_1         
	//  174  378:new             #100 <Class BottomSheetBehavior$SettleRunnable>
	//  175  381:dup             
	//  176  382:aload_0         
	//  177  383:getfield        #12  <Field BottomSheetBehavior this$0>
	//  178  386:aload_1         
	//  179  387:iload           5
	//  180  389:invokespecial   #103 <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
	//  181  392:invokestatic    #109 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//  182  395:return          
		} else
		{
			setStateInternal(((int) (byte0)));
	//  183  396:aload_0         
	//  184  397:getfield        #12  <Field BottomSheetBehavior this$0>
	//  185  400:iload           5
	//  186  402:invokevirtual   #55  <Method void BottomSheetBehavior.setStateInternal(int)>
			return;
	//  187  405:return          
		}
	}

	public boolean tryCaptureView(View view, int i)
	{
		if(state == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   2    4:getfield        #114 <Field int BottomSheetBehavior.state>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(touchingScrollingChild)
	//*   7   13:aload_0         
	//*   8   14:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   9   17:getfield        #117 <Field boolean BottomSheetBehavior.touchingScrollingChild>
	//*  10   20:ifeq            25
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		if(state == 3 && activePointerId == i)
	//*  13   25:aload_0         
	//*  14   26:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  15   29:getfield        #114 <Field int BottomSheetBehavior.state>
	//*  16   32:iconst_3        
	//*  17   33:icmpne          75
	//*  18   36:aload_0         
	//*  19   37:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  20   40:getfield        #120 <Field int BottomSheetBehavior.activePointerId>
	//*  21   43:iload_2         
	//*  22   44:icmpne          75
		{
			View view1 = (View)nestedScrollingChildRef.get();
	//   23   47:aload_0         
	//   24   48:getfield        #12  <Field BottomSheetBehavior this$0>
	//   25   51:getfield        #124 <Field WeakReference BottomSheetBehavior.nestedScrollingChildRef>
	//   26   54:invokevirtual   #130 <Method Object WeakReference.get()>
	//   27   57:checkcast       #21  <Class View>
	//   28   60:astore_3        
			if(view1 != null && view1.canScrollVertically(-1))
	//*  29   61:aload_3         
	//*  30   62:ifnull          75
	//*  31   65:aload_3         
	//*  32   66:iconst_m1       
	//*  33   67:invokevirtual   #134 <Method boolean View.canScrollVertically(int)>
	//*  34   70:ifeq            75
				return false;
	//   35   73:iconst_0        
	//   36   74:ireturn         
		}
		return viewRef != null && viewRef.get() == view;
	//   37   75:aload_0         
	//   38   76:getfield        #12  <Field BottomSheetBehavior this$0>
	//   39   79:getfield        #137 <Field WeakReference BottomSheetBehavior.viewRef>
	//   40   82:ifnull          101
	//   41   85:aload_0         
	//   42   86:getfield        #12  <Field BottomSheetBehavior this$0>
	//   43   89:getfield        #137 <Field WeakReference BottomSheetBehavior.viewRef>
	//   44   92:invokevirtual   #130 <Method Object WeakReference.get()>
	//   45   95:aload_1         
	//   46   96:if_acmpne       101
	//   47   99:iconst_1        
	//   48  100:ireturn         
	//   49  101:iconst_0        
	//   50  102:ireturn         
	}

	final BottomSheetBehavior this$0;

	BottomSheetBehavior$2()
	{
		this$0 = BottomSheetBehavior.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BottomSheetBehavior this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void android.support.v4.widget.ViewDragHelper$Callback()>
	//    5    9:return          
	}
}
