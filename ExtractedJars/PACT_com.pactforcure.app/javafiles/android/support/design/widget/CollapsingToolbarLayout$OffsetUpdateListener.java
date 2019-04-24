// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.math.MathUtils;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			CollapsingToolbarLayout, ViewOffsetHelper, CollapsingTextHelper, AppBarLayout

private class CollapsingToolbarLayout$OffsetUpdateListener
	implements AppBarLayout.OnOffsetChangedListener
{

	public void onOffsetChanged(AppBarLayout appbarlayout, int i)
	{
		int j;
		CollapsingToolbarLayout.LayoutParams layoutparams;
		ViewOffsetHelper viewoffsethelper;
		mCurrentOffset = i;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//    2    4:iload_2         
	//    3    5:putfield        #25  <Field int CollapsingToolbarLayout.mCurrentOffset>
		int k;
		int i1;
		if(mLastInsets != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//*   6   12:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
	//*   7   15:ifnull          109
			j = mLastInsets.getSystemWindowInsetTop();
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   10   22:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
	//   11   25:invokevirtual   #35  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   12   28:istore_3        
		else
	//*  13   29:iconst_0        
	//*  14   30:istore          4
	//*  15   32:aload_0         
	//*  16   33:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//*  17   36:invokevirtual   #38  <Method int CollapsingToolbarLayout.getChildCount()>
	//*  18   39:istore          5
	//*  19   41:iload           4
	//*  20   43:iload           5
	//*  21   45:icmpge          158
	//*  22   48:aload_0         
	//*  23   49:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//*  24   52:iload           4
	//*  25   54:invokevirtual   #42  <Method View CollapsingToolbarLayout.getChildAt(int)>
	//*  26   57:astore_1        
	//*  27   58:aload_1         
	//*  28   59:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  29   62:checkcast       #50  <Class CollapsingToolbarLayout$LayoutParams>
	//*  30   65:astore          6
	//*  31   67:aload_1         
	//*  32   68:invokestatic    #54  <Method ViewOffsetHelper CollapsingToolbarLayout.getViewOffsetHelper(View)>
	//*  33   71:astore          7
	//*  34   73:aload           6
	//*  35   75:getfield        #57  <Field int CollapsingToolbarLayout$LayoutParams.mCollapseMode>
	//*  36   78:tableswitch     1 2: default 100
	//	               1 114
	//	               2 137
	//*  37  100:iload           4
	//*  38  102:iconst_1        
	//*  39  103:iadd            
	//*  40  104:istore          4
	//*  41  106:goto            41
			j = 0;
	//   42  109:iconst_0        
	//   43  110:istore_3        
		k = 0;
		i1 = getChildCount();
		if(k >= i1)
			break MISSING_BLOCK_LABEL_158;
		appbarlayout = ((AppBarLayout) (getChildAt(k)));
		layoutparams = (CollapsingToolbarLayout.LayoutParams)((View) (appbarlayout)).getLayoutParams();
		viewoffsethelper = CollapsingToolbarLayout.getViewOffsetHelper(((View) (appbarlayout)));
		switch(layoutparams.mCollapseMode)
		{
		default:
			break;

		case 1: // '\001'
			break; /* Loop/switch isn't completed */

		case 2: // '\002'
			break;
		}
		break MISSING_BLOCK_LABEL_137;
_L4:
		k++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_41;
	//*  44  111:goto            29
_L1:
		viewoffsethelper.setTopAndBottomOffset(MathUtils.clamp(-i, 0, getMaxOffsetForPinChild(((View) (appbarlayout)))));
	//   45  114:aload           7
	//   46  116:iload_2         
	//   47  117:ineg            
	//   48  118:iconst_0        
	//   49  119:aload_0         
	//   50  120:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   51  123:aload_1         
	//   52  124:invokevirtual   #61  <Method int CollapsingToolbarLayout.getMaxOffsetForPinChild(View)>
	//   53  127:invokestatic    #67  <Method int MathUtils.clamp(int, int, int)>
	//   54  130:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//   55  133:pop             
		continue; /* Loop/switch isn't completed */
	//   56  134:goto            100
		viewoffsethelper.setTopAndBottomOffset(Math.round((float)(-i) * layoutparams.mParallaxMult));
	//   57  137:aload           7
	//   58  139:iload_2         
	//   59  140:ineg            
	//   60  141:i2f             
	//   61  142:aload           6
	//   62  144:getfield        #77  <Field float CollapsingToolbarLayout$LayoutParams.mParallaxMult>
	//   63  147:fmul            
	//   64  148:invokestatic    #83  <Method int Math.round(float)>
	//   65  151:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//   66  154:pop             
		if(true) goto _L4; else goto _L3
	//   67  155:goto            100
_L3:
		updateScrimVisibility();
	//   68  158:aload_0         
	//   69  159:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   70  162:invokevirtual   #86  <Method void CollapsingToolbarLayout.updateScrimVisibility()>
		if(mStatusBarScrim != null && j > 0)
	//*  71  165:aload_0         
	//*  72  166:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//*  73  169:getfield        #90  <Field android.graphics.drawable.Drawable CollapsingToolbarLayout.mStatusBarScrim>
	//*  74  172:ifnull          186
	//*  75  175:iload_3         
	//*  76  176:ifle            186
			ViewCompat.postInvalidateOnAnimation(((View) (CollapsingToolbarLayout.this)));
	//   77  179:aload_0         
	//   78  180:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   79  183:invokestatic    #96  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		int l = getHeight();
	//   80  186:aload_0         
	//   81  187:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   82  190:invokevirtual   #99  <Method int CollapsingToolbarLayout.getHeight()>
	//   83  193:istore          4
		int j1 = ViewCompat.getMinimumHeight(((View) (CollapsingToolbarLayout.this)));
	//   84  195:aload_0         
	//   85  196:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   86  199:invokestatic    #102 <Method int ViewCompat.getMinimumHeight(View)>
	//   87  202:istore          5
		mCollapsingTextHelper.setExpansionFraction((float)Math.abs(i) / (float)(l - j1 - j));
	//   88  204:aload_0         
	//   89  205:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   90  208:getfield        #106 <Field CollapsingTextHelper CollapsingToolbarLayout.mCollapsingTextHelper>
	//   91  211:iload_2         
	//   92  212:invokestatic    #110 <Method int Math.abs(int)>
	//   93  215:i2f             
	//   94  216:iload           4
	//   95  218:iload           5
	//   96  220:isub            
	//   97  221:iload_3         
	//   98  222:isub            
	//   99  223:i2f             
	//  100  224:fdiv            
	//  101  225:invokevirtual   #116 <Method void CollapsingTextHelper.setExpansionFraction(float)>
		return;
	//  102  228:return          
	}

	final CollapsingToolbarLayout this$0;

	CollapsingToolbarLayout$OffsetUpdateListener()
	{
		this$0 = CollapsingToolbarLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CollapsingToolbarLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
