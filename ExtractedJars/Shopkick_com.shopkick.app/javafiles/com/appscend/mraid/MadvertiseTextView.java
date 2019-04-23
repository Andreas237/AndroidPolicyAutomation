// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;

class MadvertiseTextView extends RelativeLayout
{

	public MadvertiseTextView(final Context adTextView, String s, final int textSize, final int bannerWidth, MadvertiseView.AnimationEndListener animationendlistener)
	{
		super(adTextView);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void RelativeLayout(Context)>
		mAnimationListener = animationendlistener;
	//    3    5:aload_0         
	//    4    6:aload           5
	//    5    8:putfield        #20  <Field MadvertiseView$AnimationEndListener mAnimationListener>
		mDp = getContext().getApplicationContext().getApplicationContext().getResources().getDisplayMetrics().density;
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #24  <Method Context getContext()>
	//    9   16:invokevirtual   #29  <Method Context Context.getApplicationContext()>
	//   10   19:invokevirtual   #29  <Method Context Context.getApplicationContext()>
	//   11   22:invokevirtual   #33  <Method Resources Context.getResources()>
	//   12   25:invokevirtual   #39  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   13   28:getfield        #44  <Field float DisplayMetrics.density>
	//   14   31:putfield        #46  <Field float mDp>
		animationendlistener = ((MadvertiseView.AnimationEndListener) (new android.widget.RelativeLayout.LayoutParams(-2, -2)));
	//   15   34:new             #48  <Class android.widget.RelativeLayout$LayoutParams>
	//   16   37:dup             
	//   17   38:bipush          -2
	//   18   40:bipush          -2
	//   19   42:invokespecial   #51  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   20   45:astore          5
		adTextView = ((Context) (new TextView(getContext().getApplicationContext())));
	//   21   47:new             #53  <Class TextView>
	//   22   50:dup             
	//   23   51:aload_0         
	//   24   52:invokevirtual   #24  <Method Context getContext()>
	//   25   55:invokevirtual   #29  <Method Context Context.getApplicationContext()>
	//   26   58:invokespecial   #54  <Method void TextView(Context)>
	//   27   61:astore_1        
		((TextView) (adTextView)).setGravity(17);
	//   28   62:aload_1         
	//   29   63:bipush          17
	//   30   65:invokevirtual   #58  <Method void TextView.setGravity(int)>
		((TextView) (adTextView)).setText(((CharSequence) (s)));
	//   31   68:aload_1         
	//   32   69:aload_2         
	//   33   70:invokevirtual   #62  <Method void TextView.setText(CharSequence)>
		float f = textSize;
	//   34   73:iload_3         
	//   35   74:i2f             
	//   36   75:fstore          6
		((TextView) (adTextView)).setTextSize(f);
	//   37   77:aload_1         
	//   38   78:fload           6
	//   39   80:invokevirtual   #66  <Method void TextView.setTextSize(float)>
		((TextView) (adTextView)).setTextColor(bannerWidth);
	//   40   83:aload_1         
	//   41   84:iload           4
	//   42   86:invokevirtual   #69  <Method void TextView.setTextColor(int)>
		((TextView) (adTextView)).setTypeface(Typeface.DEFAULT_BOLD);
	//   43   89:aload_1         
	//   44   90:getstatic       #75  <Field Typeface Typeface.DEFAULT_BOLD>
	//   45   93:invokevirtual   #79  <Method void TextView.setTypeface(Typeface)>
		((TextView) (adTextView)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (animationendlistener)));
	//   46   96:aload_1         
	//   47   97:aload           5
	//   48   99:invokevirtual   #83  <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((TextView) (adTextView)).setId(12345);
	//   49  102:aload_1         
	//   50  103:sipush          12345
	//   51  106:invokevirtual   #86  <Method void TextView.setId(int)>
		((TextView) (adTextView)).setMaxLines(2);
	//   52  109:aload_1         
	//   53  110:iconst_2        
	//   54  111:invokevirtual   #89  <Method void TextView.setMaxLines(int)>
		addView(((android.view.View) (adTextView)));
	//   55  114:aload_0         
	//   56  115:aload_1         
	//   57  116:invokevirtual   #93  <Method void addView(android.view.View)>
		float f1 = mDp;
	//   58  119:aload_0         
	//   59  120:getfield        #46  <Field float mDp>
	//   60  123:fstore          7
		bannerWidth = (int)(320F * f1);
	//   61  125:ldc1            #94  <Float 320F>
	//   62  127:fload           7
	//   63  129:fmul            
	//   64  130:f2i             
	//   65  131:istore          4
		final int bannerHeight = (int)(f1 * 53F);
	//   66  133:fload           7
	//   67  135:ldc1            #95  <Float 53F>
	//   68  137:fmul            
	//   69  138:f2i             
	//   70  139:istore          8
		animationendlistener = ((MadvertiseView.AnimationEndListener) (new Paint()));
	//   71  141:new             #97  <Class Paint>
	//   72  144:dup             
	//   73  145:invokespecial   #100 <Method void Paint()>
	//   74  148:astore          5
		((Paint) (animationendlistener)).setTextSize(f);
	//   75  150:aload           5
	//   76  152:fload           6
	//   77  154:invokevirtual   #101 <Method void Paint.setTextSize(float)>
		mLineCount = 1;
	//   78  157:aload_0         
	//   79  158:iconst_1        
	//   80  159:putfield        #103 <Field int mLineCount>
		if(((Paint) (animationendlistener)).measureText(s) * mDp > (float)bannerWidth)
	//*  81  162:aload           5
	//*  82  164:aload_2         
	//*  83  165:invokevirtual   #107 <Method float Paint.measureText(String)>
	//*  84  168:aload_0         
	//*  85  169:getfield        #46  <Field float mDp>
	//*  86  172:fmul            
	//*  87  173:iload           4
	//*  88  175:i2f             
	//*  89  176:fcmpl           
	//*  90  177:ifle            190
			mLineCount = mLineCount + 1;
	//   91  180:aload_0         
	//   92  181:aload_0         
	//   93  182:getfield        #103 <Field int mLineCount>
	//   94  185:iconst_1        
	//   95  186:iadd            
	//   96  187:putfield        #103 <Field int mLineCount>
		getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				mTextWidth = adTextView.getWidth();
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field MadvertiseTextView this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field TextView val$adTextView>
			//    4    8:invokevirtual   #41  <Method int TextView.getWidth()>
			//    5   11:invokestatic    #45  <Method int MadvertiseTextView.access$002(MadvertiseTextView, int)>
			//    6   14:pop             
				android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
			//    7   15:new             #47  <Class android.widget.RelativeLayout$LayoutParams>
			//    8   18:dup             
			//    9   19:bipush          -2
			//   10   21:bipush          -2
			//   11   23:invokespecial   #50  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
			//   12   26:astore_1        
				layoutparams.topMargin = bannerHeight / 2 - mLineCount * textSize;
			//   13   27:aload_1         
			//   14   28:aload_0         
			//   15   29:getfield        #26  <Field int val$bannerHeight>
			//   16   32:iconst_2        
			//   17   33:idiv            
			//   18   34:aload_0         
			//   19   35:getfield        #22  <Field MadvertiseTextView this$0>
			//   20   38:invokestatic    #54  <Method int MadvertiseTextView.access$100(MadvertiseTextView)>
			//   21   41:aload_0         
			//   22   42:getfield        #28  <Field int val$textSize>
			//   23   45:imul            
			//   24   46:isub            
			//   25   47:putfield        #57  <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
				layoutparams.leftMargin = bannerWidth / 2 - mTextWidth / 2;
			//   26   50:aload_1         
			//   27   51:aload_0         
			//   28   52:getfield        #30  <Field int val$bannerWidth>
			//   29   55:iconst_2        
			//   30   56:idiv            
			//   31   57:aload_0         
			//   32   58:getfield        #22  <Field MadvertiseTextView this$0>
			//   33   61:invokestatic    #60  <Method int MadvertiseTextView.access$000(MadvertiseTextView)>
			//   34   64:iconst_2        
			//   35   65:idiv            
			//   36   66:isub            
			//   37   67:putfield        #63  <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
				adTextView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
			//   38   70:aload_0         
			//   39   71:getfield        #24  <Field TextView val$adTextView>
			//   40   74:aload_1         
			//   41   75:invokevirtual   #67  <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			//   42   78:return          
			}

			final MadvertiseTextView this$0;
			final TextView val$adTextView;
			final int val$bannerHeight;
			final int val$bannerWidth;
			final int val$textSize;

			
			{
				this$0 = MadvertiseTextView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MadvertiseTextView this$0>
				adTextView = textview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field TextView val$adTextView>
				bannerHeight = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field int val$bannerHeight>
				textSize = j;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #28  <Field int val$textSize>
				bannerWidth = k;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #30  <Field int val$bannerWidth>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #33  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//   97  190:aload_0         
	//   98  191:invokevirtual   #111 <Method ViewTreeObserver getViewTreeObserver()>
	//   99  194:new             #6   <Class MadvertiseTextView$1>
	//  100  197:dup             
	//  101  198:aload_0         
	//  102  199:aload_1         
	//  103  200:iload           8
	//  104  202:iload_3         
	//  105  203:iload           4
	//  106  205:invokespecial   #114 <Method void MadvertiseTextView$1(MadvertiseTextView, TextView, int, int, int)>
	//  107  208:invokevirtual   #120 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		adTextView = ((Context) (new android.widget.RelativeLayout.LayoutParams(-2, -2)));
	//  108  211:new             #48  <Class android.widget.RelativeLayout$LayoutParams>
	//  109  214:dup             
	//  110  215:bipush          -2
	//  111  217:bipush          -2
	//  112  219:invokespecial   #51  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  113  222:astore_1        
		f = mDp;
	//  114  223:aload_0         
	//  115  224:getfield        #46  <Field float mDp>
	//  116  227:fstore          6
		adTextView.leftMargin = (int)(235F * f);
	//  117  229:aload_1         
	//  118  230:ldc1            #121 <Float 235F>
	//  119  232:fload           6
	//  120  234:fmul            
	//  121  235:f2i             
	//  122  236:putfield        #124 <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
		adTextView.topMargin = (int)(f * 39F);
	//  123  239:aload_1         
	//  124  240:fload           6
	//  125  242:ldc1            #125 <Float 39F>
	//  126  244:fmul            
	//  127  245:f2i             
	//  128  246:putfield        #128 <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
		s = ((String) (new TextView(getContext().getApplicationContext())));
	//  129  249:new             #53  <Class TextView>
	//  130  252:dup             
	//  131  253:aload_0         
	//  132  254:invokevirtual   #24  <Method Context getContext()>
	//  133  257:invokevirtual   #29  <Method Context Context.getApplicationContext()>
	//  134  260:invokespecial   #54  <Method void TextView(Context)>
	//  135  263:astore_2        
		((TextView) (s)).setText("ad by madvertise");
	//  136  264:aload_2         
	//  137  265:ldc1            #130 <String "ad by madvertise">
	//  138  267:invokevirtual   #62  <Method void TextView.setText(CharSequence)>
		((TextView) (s)).setTextSize(10F);
	//  139  270:aload_2         
	//  140  271:ldc1            #131 <Float 10F>
	//  141  273:invokevirtual   #66  <Method void TextView.setTextSize(float)>
		((TextView) (s)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (adTextView)));
	//  142  276:aload_2         
	//  143  277:aload_1         
	//  144  278:invokevirtual   #83  <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		addView(((android.view.View) (s)));
	//  145  281:aload_0         
	//  146  282:aload_2         
	//  147  283:invokevirtual   #93  <Method void addView(android.view.View)>
	//  148  286:return          
	}

	protected void onAnimationEnd()
	{
		super.onAnimationEnd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method void RelativeLayout.onAnimationEnd()>
		MadvertiseView.AnimationEndListener animationendlistener = mAnimationListener;
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field MadvertiseView$AnimationEndListener mAnimationListener>
	//    4    8:astore_1        
		if(animationendlistener != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			animationendlistener.onAnimationEnd();
	//    7   13:aload_1         
	//    8   14:invokeinterface #145 <Method void MadvertiseView$AnimationEndListener.onAnimationEnd()>
	//    9   19:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #148 <Method void RelativeLayout.onMeasure(int, int)>
		float f = mDp;
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field float mDp>
	//    6   10:fstore_3        
		setMeasuredDimension((int)(f * 320F), (int)(f * 320F));
	//    7   11:aload_0         
	//    8   12:fload_3         
	//    9   13:ldc1            #94  <Float 320F>
	//   10   15:fmul            
	//   11   16:f2i             
	//   12   17:fload_3         
	//   13   18:ldc1            #94  <Float 320F>
	//   14   20:fmul            
	//   15   21:f2i             
	//   16   22:invokevirtual   #151 <Method void setMeasuredDimension(int, int)>
	//   17   25:return          
	}

	private MadvertiseView.AnimationEndListener mAnimationListener;
	private float mDp;
	private int mLineCount;
	private int mTextWidth;


/*
	static int access$000(MadvertiseTextView madvertisetextview)
	{
		return madvertisetextview.mTextWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int mTextWidth>
	//    2    4:ireturn         
	}

*/


/*
	static int access$002(MadvertiseTextView madvertisetextview, int i)
	{
		madvertisetextview.mTextWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #136 <Field int mTextWidth>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$100(MadvertiseTextView madvertisetextview)
	{
		return madvertisetextview.mLineCount;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int mLineCount>
	//    2    4:ireturn         
	}

*/
}
