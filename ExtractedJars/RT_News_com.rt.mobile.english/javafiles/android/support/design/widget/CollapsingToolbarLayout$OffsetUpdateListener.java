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
		mCurrentOffset = i;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//    2    4:iload_2         
	//    3    5:putfield        #25  <Field int CollapsingToolbarLayout.mCurrentOffset>
		int j;
		if(mLastInsets != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//*   6   12:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
	//*   7   15:ifnull          32
			j = mLastInsets.getSystemWindowInsetTop();
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   10   22:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
	//   11   25:invokevirtual   #35  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   12   28:istore_3        
		else
	//*  13   29:goto            34
			j = 0;
	//   14   32:iconst_0        
	//   15   33:istore_3        
		int i1 = getChildCount();
	//   16   34:aload_0         
	//   17   35:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   18   38:invokevirtual   #38  <Method int CollapsingToolbarLayout.getChildCount()>
	//   19   41:istore          5
		for(int k = 0; k < i1; k++)
	//*  20   43:iconst_0        
	//*  21   44:istore          4
	//*  22   46:iload           4
	//*  23   48:iload           5
	//*  24   50:icmpge          157
		{
			appbarlayout = ((AppBarLayout) (getChildAt(k)));
	//   25   53:aload_0         
	//   26   54:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   27   57:iload           4
	//   28   59:invokevirtual   #42  <Method View CollapsingToolbarLayout.getChildAt(int)>
	//   29   62:astore_1        
			CollapsingToolbarLayout.LayoutParams layoutparams = (CollapsingToolbarLayout.LayoutParams)((View) (appbarlayout)).getLayoutParams();
	//   30   63:aload_1         
	//   31   64:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   32   67:checkcast       #50  <Class CollapsingToolbarLayout$LayoutParams>
	//   33   70:astore          6
			ViewOffsetHelper viewoffsethelper = CollapsingToolbarLayout.getViewOffsetHelper(((View) (appbarlayout)));
	//   34   72:aload_1         
	//   35   73:invokestatic    #54  <Method ViewOffsetHelper CollapsingToolbarLayout.getViewOffsetHelper(View)>
	//   36   76:astore          7
			switch(layoutparams.mCollapseMode)
	//*  37   78:aload           6
	//*  38   80:getfield        #57  <Field int CollapsingToolbarLayout$LayoutParams.mCollapseMode>
			{
	//*  39   83:tableswitch     1 2: default 104
	//	               1 128
	//	               2 107
	//*  40  104:goto            148
			case 2: // '\002'
				viewoffsethelper.setTopAndBottomOffset(Math.round((float)(-i) * layoutparams.mParallaxMult));
	//   41  107:aload           7
	//   42  109:iload_2         
	//   43  110:ineg            
	//   44  111:i2f             
	//   45  112:aload           6
	//   46  114:getfield        #61  <Field float CollapsingToolbarLayout$LayoutParams.mParallaxMult>
	//   47  117:fmul            
	//   48  118:invokestatic    #67  <Method int Math.round(float)>
	//   49  121:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//   50  124:pop             
				break;

	//*  51  125:goto            148
			case 1: // '\001'
				viewoffsethelper.setTopAndBottomOffset(MathUtils.clamp(-i, 0, getMaxOffsetForPinChild(((View) (appbarlayout)))));
	//   52  128:aload           7
	//   53  130:iload_2         
	//   54  131:ineg            
	//   55  132:iconst_0        
	//   56  133:aload_0         
	//   57  134:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   58  137:aload_1         
	//   59  138:invokevirtual   #77  <Method int CollapsingToolbarLayout.getMaxOffsetForPinChild(View)>
	//   60  141:invokestatic    #83  <Method int MathUtils.clamp(int, int, int)>
	//   61  144:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//   62  147:pop             
				break;
			}
		}

	//   63  148:iload           4
	//   64  150:iconst_1        
	//   65  151:iadd            
	//   66  152:istore          4
	//*  67  154:goto            46
		updateScrimVisibility();
	//   68  157:aload_0         
	//   69  158:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   70  161:invokevirtual   #86  <Method void CollapsingToolbarLayout.updateScrimVisibility()>
		if(mStatusBarScrim != null && j > 0)
	//*  71  164:aload_0         
	//*  72  165:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//*  73  168:getfield        #90  <Field android.graphics.drawable.Drawable CollapsingToolbarLayout.mStatusBarScrim>
	//*  74  171:ifnull          185
	//*  75  174:iload_3         
	//*  76  175:ifle            185
			ViewCompat.postInvalidateOnAnimation(((View) (CollapsingToolbarLayout.this)));
	//   77  178:aload_0         
	//   78  179:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   79  182:invokestatic    #96  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		int l = getHeight();
	//   80  185:aload_0         
	//   81  186:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   82  189:invokevirtual   #99  <Method int CollapsingToolbarLayout.getHeight()>
	//   83  192:istore          4
		i1 = ViewCompat.getMinimumHeight(((View) (CollapsingToolbarLayout.this)));
	//   84  194:aload_0         
	//   85  195:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   86  198:invokestatic    #102 <Method int ViewCompat.getMinimumHeight(View)>
	//   87  201:istore          5
		mCollapsingTextHelper.setExpansionFraction((float)Math.abs(i) / (float)(l - i1 - j));
	//   88  203:aload_0         
	//   89  204:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   90  207:getfield        #106 <Field CollapsingTextHelper CollapsingToolbarLayout.mCollapsingTextHelper>
	//   91  210:iload_2         
	//   92  211:invokestatic    #110 <Method int Math.abs(int)>
	//   93  214:i2f             
	//   94  215:iload           4
	//   95  217:iload           5
	//   96  219:isub            
	//   97  220:iload_3         
	//   98  221:isub            
	//   99  222:i2f             
	//  100  223:fdiv            
	//  101  224:invokevirtual   #116 <Method void CollapsingTextHelper.setExpansionFraction(float)>
	//  102  227:return          
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
