// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;
import o.*;

// Referenced classes of package android.support.design.widget:
//			CollapsingToolbarLayout, AppBarLayout

class CollapsingToolbarLayout$d
	implements edListener
{

	public void onOffsetChanged(AppBarLayout appbarlayout, int i)
	{
		e.mCurrentOffset = i;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CollapsingToolbarLayout e>
	//    2    4:iload_2         
	//    3    5:putfield        #25  <Field int CollapsingToolbarLayout.mCurrentOffset>
		int j;
		if(e.mLastInsets != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field CollapsingToolbarLayout e>
	//*   6   12:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
	//*   7   15:ifnull          32
			j = e.mLastInsets.getSystemWindowInsetTop();
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field CollapsingToolbarLayout e>
	//   10   22:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
	//   11   25:invokevirtual   #35  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   12   28:istore_3        
		else
	//*  13   29:goto            34
			j = 0;
	//   14   32:iconst_0        
	//   15   33:istore_3        
		int k = 0;
	//   16   34:iconst_0        
	//   17   35:istore          4
		for(int l = e.getChildCount(); k < l; k++)
	//*  18   37:aload_0         
	//*  19   38:getfield        #15  <Field CollapsingToolbarLayout e>
	//*  20   41:invokevirtual   #38  <Method int CollapsingToolbarLayout.getChildCount()>
	//*  21   44:istore          5
	//*  22   46:iload           4
	//*  23   48:iload           5
	//*  24   50:icmpge          161
		{
			appbarlayout = ((AppBarLayout) (e.getChildAt(k)));
	//   25   53:aload_0         
	//   26   54:getfield        #15  <Field CollapsingToolbarLayout e>
	//   27   57:iload           4
	//   28   59:invokevirtual   #42  <Method View CollapsingToolbarLayout.getChildAt(int)>
	//   29   62:astore_1        
			youtParams youtparams = (youtParams)((View) (appbarlayout)).getLayoutParams();
	//   30   63:aload_1         
	//   31   64:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   32   67:checkcast       #50  <Class CollapsingToolbarLayout$LayoutParams>
	//   33   70:astore          6
			ab ab1 = CollapsingToolbarLayout.getViewOffsetHelper(((View) (appbarlayout)));
	//   34   72:aload_1         
	//   35   73:invokestatic    #54  <Method ab CollapsingToolbarLayout.getViewOffsetHelper(View)>
	//   36   76:astore          7
			switch(youtparams.mCollapseMode)
	//*  37   78:aload           6
	//*  38   80:getfield        #57  <Field int CollapsingToolbarLayout$LayoutParams.mCollapseMode>
			{
	//*  39   83:lookupswitch    2: default 108
	//	               1: 111
	//	               2: 134
	//*  40  108:goto            152
			case 1: // '\001'
				ab1.b(w.b(-i, 0, e.getMaxOffsetForPinChild(((View) (appbarlayout)))));
	//   41  111:aload           7
	//   42  113:iload_2         
	//   43  114:ineg            
	//   44  115:iconst_0        
	//   45  116:aload_0         
	//   46  117:getfield        #15  <Field CollapsingToolbarLayout e>
	//   47  120:aload_1         
	//   48  121:invokevirtual   #61  <Method int CollapsingToolbarLayout.getMaxOffsetForPinChild(View)>
	//   49  124:invokestatic    #67  <Method int w.b(int, int, int)>
	//   50  127:invokevirtual   #72  <Method boolean ab.b(int)>
	//   51  130:pop             
				break;

	//*  52  131:goto            152
			case 2: // '\002'
				ab1.b(Math.round((float)(-i) * youtparams.mParallaxMult));
	//   53  134:aload           7
	//   54  136:iload_2         
	//   55  137:ineg            
	//   56  138:i2f             
	//   57  139:aload           6
	//   58  141:getfield        #76  <Field float CollapsingToolbarLayout$LayoutParams.mParallaxMult>
	//   59  144:fmul            
	//   60  145:invokestatic    #82  <Method int Math.round(float)>
	//   61  148:invokevirtual   #72  <Method boolean ab.b(int)>
	//   62  151:pop             
				break;
			}
		}

	//   63  152:iload           4
	//   64  154:iconst_1        
	//   65  155:iadd            
	//   66  156:istore          4
	//*  67  158:goto            46
		e.updateScrimVisibility();
	//   68  161:aload_0         
	//   69  162:getfield        #15  <Field CollapsingToolbarLayout e>
	//   70  165:invokevirtual   #85  <Method void CollapsingToolbarLayout.updateScrimVisibility()>
		if(e.mStatusBarScrim != null && j > 0)
	//*  71  168:aload_0         
	//*  72  169:getfield        #15  <Field CollapsingToolbarLayout e>
	//*  73  172:getfield        #89  <Field android.graphics.drawable.Drawable CollapsingToolbarLayout.mStatusBarScrim>
	//*  74  175:ifnull          189
	//*  75  178:iload_3         
	//*  76  179:ifle            189
			ViewCompat.postInvalidateOnAnimation(((View) (e)));
	//   77  182:aload_0         
	//   78  183:getfield        #15  <Field CollapsingToolbarLayout e>
	//   79  186:invokestatic    #95  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		k = e.getHeight();
	//   80  189:aload_0         
	//   81  190:getfield        #15  <Field CollapsingToolbarLayout e>
	//   82  193:invokevirtual   #98  <Method int CollapsingToolbarLayout.getHeight()>
	//   83  196:istore          4
		int i1 = ViewCompat.getMinimumHeight(((View) (e)));
	//   84  198:aload_0         
	//   85  199:getfield        #15  <Field CollapsingToolbarLayout e>
	//   86  202:invokestatic    #101 <Method int ViewCompat.getMinimumHeight(View)>
	//   87  205:istore          5
		e.mCollapsingTextHelper.a((float)Math.abs(i) / (float)(k - i1 - j));
	//   88  207:aload_0         
	//   89  208:getfield        #15  <Field CollapsingToolbarLayout e>
	//   90  211:getfield        #105 <Field n CollapsingToolbarLayout.mCollapsingTextHelper>
	//   91  214:iload_2         
	//   92  215:invokestatic    #109 <Method int Math.abs(int)>
	//   93  218:i2f             
	//   94  219:iload           4
	//   95  221:iload           5
	//   96  223:isub            
	//   97  224:iload_3         
	//   98  225:isub            
	//   99  226:i2f             
	//  100  227:fdiv            
	//  101  228:invokevirtual   #115 <Method void n.a(float)>
	//  102  231:return          
	}

	final CollapsingToolbarLayout e;

	CollapsingToolbarLayout$d(CollapsingToolbarLayout collapsingtoolbarlayout)
	{
		e = collapsingtoolbarlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CollapsingToolbarLayout e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
