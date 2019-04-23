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
		appbarlayout = ((AppBarLayout) (CollapsingToolbarLayout.this));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//    2    4:astore_1        
		appbarlayout.currentOffset = i;
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field int CollapsingToolbarLayout.currentOffset>
		int j;
		if(((CollapsingToolbarLayout) (appbarlayout)).lastInsets != null)
	//*   6   10:aload_1         
	//*   7   11:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.lastInsets>
	//*   8   14:ifnull          31
			j = lastInsets.getSystemWindowInsetTop();
	//    9   17:aload_0         
	//   10   18:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   11   21:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.lastInsets>
	//   12   24:invokevirtual   #35  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   13   27:istore_3        
		else
	//*  14   28:goto            33
			j = 0;
	//   15   31:iconst_0        
	//   16   32:istore_3        
		int i1 = getChildCount();
	//   17   33:aload_0         
	//   18   34:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   19   37:invokevirtual   #38  <Method int CollapsingToolbarLayout.getChildCount()>
	//   20   40:istore          5
		for(int k = 0; k < i1; k++)
	//*  21   42:iconst_0        
	//*  22   43:istore          4
	//*  23   45:iload           4
	//*  24   47:iload           5
	//*  25   49:icmpge          157
		{
			appbarlayout = ((AppBarLayout) (getChildAt(k)));
	//   26   52:aload_0         
	//   27   53:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   28   56:iload           4
	//   29   58:invokevirtual   #42  <Method View CollapsingToolbarLayout.getChildAt(int)>
	//   30   61:astore_1        
			CollapsingToolbarLayout.LayoutParams layoutparams = (CollapsingToolbarLayout.LayoutParams)((View) (appbarlayout)).getLayoutParams();
	//   31   62:aload_1         
	//   32   63:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   33   66:checkcast       #50  <Class CollapsingToolbarLayout$LayoutParams>
	//   34   69:astore          6
			ViewOffsetHelper viewoffsethelper = CollapsingToolbarLayout.getViewOffsetHelper(((View) (appbarlayout)));
	//   35   71:aload_1         
	//   36   72:invokestatic    #54  <Method ViewOffsetHelper CollapsingToolbarLayout.getViewOffsetHelper(View)>
	//   37   75:astore          7
			switch(layoutparams.collapseMode)
	//*  38   77:aload           6
	//*  39   79:getfield        #57  <Field int CollapsingToolbarLayout$LayoutParams.collapseMode>
			{
	//*  40   82:tableswitch     1 2: default 104
	//	               1 128
	//	               2 107
	//*  41  104:goto            148
			case 2: // '\002'
				viewoffsethelper.setTopAndBottomOffset(Math.round((float)(-i) * layoutparams.parallaxMult));
	//   42  107:aload           7
	//   43  109:iload_2         
	//   44  110:ineg            
	//   45  111:i2f             
	//   46  112:aload           6
	//   47  114:getfield        #61  <Field float CollapsingToolbarLayout$LayoutParams.parallaxMult>
	//   48  117:fmul            
	//   49  118:invokestatic    #67  <Method int Math.round(float)>
	//   50  121:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//   51  124:pop             
				break;

	//*  52  125:goto            148
			case 1: // '\001'
				viewoffsethelper.setTopAndBottomOffset(MathUtils.clamp(-i, 0, getMaxOffsetForPinChild(((View) (appbarlayout)))));
	//   53  128:aload           7
	//   54  130:iload_2         
	//   55  131:ineg            
	//   56  132:iconst_0        
	//   57  133:aload_0         
	//   58  134:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   59  137:aload_1         
	//   60  138:invokevirtual   #77  <Method int CollapsingToolbarLayout.getMaxOffsetForPinChild(View)>
	//   61  141:invokestatic    #83  <Method int MathUtils.clamp(int, int, int)>
	//   62  144:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//   63  147:pop             
				break;
			}
		}

	//   64  148:iload           4
	//   65  150:iconst_1        
	//   66  151:iadd            
	//   67  152:istore          4
	//*  68  154:goto            45
		updateScrimVisibility();
	//   69  157:aload_0         
	//   70  158:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   71  161:invokevirtual   #86  <Method void CollapsingToolbarLayout.updateScrimVisibility()>
		if(statusBarScrim != null && j > 0)
	//*  72  164:aload_0         
	//*  73  165:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//*  74  168:getfield        #90  <Field android.graphics.drawable.Drawable CollapsingToolbarLayout.statusBarScrim>
	//*  75  171:ifnull          185
	//*  76  174:iload_3         
	//*  77  175:ifle            185
			ViewCompat.postInvalidateOnAnimation(((View) (CollapsingToolbarLayout.this)));
	//   78  178:aload_0         
	//   79  179:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   80  182:invokestatic    #96  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		int l = getHeight();
	//   81  185:aload_0         
	//   82  186:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   83  189:invokevirtual   #99  <Method int CollapsingToolbarLayout.getHeight()>
	//   84  192:istore          4
		i1 = ViewCompat.getMinimumHeight(((View) (CollapsingToolbarLayout.this)));
	//   85  194:aload_0         
	//   86  195:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   87  198:invokestatic    #102 <Method int ViewCompat.getMinimumHeight(View)>
	//   88  201:istore          5
		collapsingTextHelper.setExpansionFraction((float)Math.abs(i) / (float)(l - i1 - j));
	//   89  203:aload_0         
	//   90  204:getfield        #15  <Field CollapsingToolbarLayout this$0>
	//   91  207:getfield        #106 <Field CollapsingTextHelper CollapsingToolbarLayout.collapsingTextHelper>
	//   92  210:iload_2         
	//   93  211:invokestatic    #110 <Method int Math.abs(int)>
	//   94  214:i2f             
	//   95  215:iload           4
	//   96  217:iload           5
	//   97  219:isub            
	//   98  220:iload_3         
	//   99  221:isub            
	//  100  222:i2f             
	//  101  223:fdiv            
	//  102  224:invokevirtual   #116 <Method void CollapsingTextHelper.setExpansionFraction(float)>
	//  103  227:return          
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
