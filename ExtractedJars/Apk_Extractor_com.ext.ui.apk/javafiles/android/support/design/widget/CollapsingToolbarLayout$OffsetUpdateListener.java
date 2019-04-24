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
	//   12   28:istore          4
		else
	//*  13   30:aload_0         
	//*  14   31:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//*  15   34:invokevirtual   #38  <Method int CollapsingToolbarLayout.getChildCount()>
	//*  16   37:istore          6
	//*  17   39:iconst_0        
	//*  18   40:istore          5
	//*  19   42:iload           5
	//*  20   44:iload           6
	//*  21   46:icmpge          161
	//*  22   49:aload_0         
	//*  23   50:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//*  24   53:iload           5
	//*  25   55:invokevirtual   #42  <Method View CollapsingToolbarLayout.getChildAt(int)>
	//*  26   58:astore_1        
	//*  27   59:aload_1         
	//*  28   60:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  29   63:checkcast       #50  <Class CollapsingToolbarLayout$LayoutParams>
	//*  30   66:astore          7
	//*  31   68:aload_1         
	//*  32   69:invokestatic    #54  <Method ViewOffsetHelper CollapsingToolbarLayout.getViewOffsetHelper(View)>
	//*  33   72:astore          8
	//*  34   74:aload           7
	//*  35   76:getfield        #57  <Field int CollapsingToolbarLayout$LayoutParams.mCollapseMode>
	//*  36   79:tableswitch     1 2: default 100
	//	               1 115
	//	               2 138
	//*  37  100:iload           5
	//*  38  102:iconst_1        
	//*  39  103:iadd            
	//*  40  104:istore          5
	//*  41  106:goto            42
			j = 0;
	//   42  109:iconst_0        
	//   43  110:istore          4
		i1 = getChildCount();
		k = 0;
		if(k >= i1)
			break MISSING_BLOCK_LABEL_161;
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
		break MISSING_BLOCK_LABEL_138;
_L4:
		k++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_42;
	//*  44  112:goto            30
_L1:
		viewoffsethelper.setTopAndBottomOffset(MathUtils.clamp(-i, 0, getMaxOffsetForPinChild(((View) (appbarlayout)))));
	//   45  115:aload           8
	//   46  117:iload_2         
	//   47  118:ineg            
	//   48  119:iconst_0        
	//   49  120:aload_0         
	//   50  121:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   51  124:aload_1         
	//   52  125:invokevirtual   #61  <Method int CollapsingToolbarLayout.getMaxOffsetForPinChild(View)>
	//   53  128:invokestatic    #67  <Method int MathUtils.clamp(int, int, int)>
	//   54  131:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//   55  134:pop             
		continue; /* Loop/switch isn't completed */
	//   56  135:goto            100
		float f = -i;
	//   57  138:iload_2         
	//   58  139:ineg            
	//   59  140:i2f             
	//   60  141:fstore_3        
		viewoffsethelper.setTopAndBottomOffset(Math.round(layoutparams.mParallaxMult * f));
	//   61  142:aload           8
	//   62  144:aload           7
	//   63  146:getfield        #77  <Field float CollapsingToolbarLayout$LayoutParams.mParallaxMult>
	//   64  149:fload_3         
	//   65  150:fmul            
	//   66  151:invokestatic    #83  <Method int Math.round(float)>
	//   67  154:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//   68  157:pop             
		if(true) goto _L4; else goto _L3
	//   69  158:goto            100
_L3:
		updateScrimVisibility();
	//   70  161:aload_0         
	//   71  162:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   72  165:invokevirtual   #86  <Method void CollapsingToolbarLayout.updateScrimVisibility()>
		if(mStatusBarScrim != null && j > 0)
	//*  73  168:aload_0         
	//*  74  169:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//*  75  172:getfield        #90  <Field android.graphics.drawable.Drawable CollapsingToolbarLayout.mStatusBarScrim>
	//*  76  175:ifnull          190
	//*  77  178:iload           4
	//*  78  180:ifle            190
			ViewCompat.postInvalidateOnAnimation(((View) (CollapsingToolbarLayout.this)));
	//   79  183:aload_0         
	//   80  184:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   81  187:invokestatic    #96  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		int l = getHeight();
	//   82  190:aload_0         
	//   83  191:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   84  194:invokevirtual   #99  <Method int CollapsingToolbarLayout.getHeight()>
	//   85  197:istore          5
		int j1 = ViewCompat.getMinimumHeight(((View) (CollapsingToolbarLayout.this)));
	//   86  199:aload_0         
	//   87  200:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   88  203:invokestatic    #102 <Method int ViewCompat.getMinimumHeight(View)>
	//   89  206:istore          6
		mCollapsingTextHelper.setExpansionFraction((float)Math.abs(i) / (float)(l - j1 - j));
	//   90  208:aload_0         
	//   91  209:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   92  212:getfield        #106 <Field CollapsingTextHelper CollapsingToolbarLayout.mCollapsingTextHelper>
	//   93  215:iload_2         
	//   94  216:invokestatic    #110 <Method int Math.abs(int)>
	//   95  219:i2f             
	//   96  220:iload           5
	//   97  222:iload           6
	//   98  224:isub            
	//   99  225:iload           4
	//  100  227:isub            
	//  101  228:i2f             
	//  102  229:fdiv            
	//  103  230:invokevirtual   #116 <Method void CollapsingTextHelper.setExpansionFraction(float)>
		return;
	//  104  233:return          
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
