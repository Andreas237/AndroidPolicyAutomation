// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.github.amlcurran.showcaseview.targets.Target;

// Referenced classes of package com.github.amlcurran.showcaseview:
//			OnShowcaseEventListener, ApiUtils, AnimatorAnimationFactory, ShowcaseAreaCalculator, 
//			ShotStateStore, NewShowcaseDrawer, StandardShowcaseDrawer, TextDrawer, 
//			AnimationFactory, ShowcaseDrawer

public class ShowcaseView extends RelativeLayout
	implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnPreDrawListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
{
	public static class Builder
	{

		public ShowcaseView build()
		{
			ShowcaseView.insertShowcaseView(showcaseView, activity);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field Activity activity>
		//    4    8:invokestatic    #43  <Method void ShowcaseView.access$500(ShowcaseView, Activity)>
			return showcaseView;
		//    5   11:aload_0         
		//    6   12:getfield        #27  <Field ShowcaseView showcaseView>
		//    7   15:areturn         
		}

		public Builder doNotBlockTouches()
		{
			showcaseView.setBlocksTouches(false);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #49  <Method void ShowcaseView.setBlocksTouches(boolean)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder hideOnTouchOutside()
		{
			showcaseView.setBlocksTouches(true);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #49  <Method void ShowcaseView.setBlocksTouches(boolean)>
			showcaseView.setHideOnTouchOutside(true);
		//    4    8:aload_0         
		//    5    9:getfield        #27  <Field ShowcaseView showcaseView>
		//    6   12:iconst_1        
		//    7   13:invokevirtual   #53  <Method void ShowcaseView.setHideOnTouchOutside(boolean)>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setContentText(int i)
		{
			return setContentText(((CharSequence) (activity.getString(i))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #22  <Field Activity activity>
		//    3    5:iload_1         
		//    4    6:invokevirtual   #61  <Method String Activity.getString(int)>
		//    5    9:invokevirtual   #64  <Method ShowcaseView$Builder setContentText(CharSequence)>
		//    6   12:areturn         
		}

		public Builder setContentText(CharSequence charsequence)
		{
			showcaseView.setContentText(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #67  <Method void ShowcaseView.setContentText(CharSequence)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setContentTitle(int i)
		{
			return setContentTitle(((CharSequence) (activity.getString(i))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #22  <Field Activity activity>
		//    3    5:iload_1         
		//    4    6:invokevirtual   #61  <Method String Activity.getString(int)>
		//    5    9:invokevirtual   #70  <Method ShowcaseView$Builder setContentTitle(CharSequence)>
		//    6   12:areturn         
		}

		public Builder setContentTitle(CharSequence charsequence)
		{
			showcaseView.setContentTitle(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #72  <Method void ShowcaseView.setContentTitle(CharSequence)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setOnClickListener(android.view.View.OnClickListener onclicklistener)
		{
			showcaseView.overrideButtonClick(onclicklistener);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #78  <Method void ShowcaseView.overrideButtonClick(android.view.View$OnClickListener)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setShowcaseEventListener(OnShowcaseEventListener onshowcaseeventlistener)
		{
			showcaseView.setOnShowcaseEventListener(onshowcaseeventlistener);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #84  <Method void ShowcaseView.setOnShowcaseEventListener(OnShowcaseEventListener)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setStyle(int i)
		{
			showcaseView.setStyle(i);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #88  <Method void ShowcaseView.setStyle(int)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setTarget(Target target)
		{
			showcaseView.setTarget(target);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #37  <Method void ShowcaseView.setTarget(Target)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder singleShot(long l)
		{
			showcaseView.setSingleShot(l);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ShowcaseView showcaseView>
		//    2    4:lload_1         
		//    3    5:invokestatic    #95  <Method void ShowcaseView.access$600(ShowcaseView, long)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private final Activity activity;
		final ShowcaseView showcaseView;

		public Builder(Activity activity1)
		{
			this(activity1, false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:invokespecial   #16  <Method void ShowcaseView$Builder(Activity, boolean)>
		//    4    6:return          
		}

		public Builder(Activity activity1, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			activity = activity1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Activity activity>
			showcaseView = new ShowcaseView(((Context) (activity1)), flag);
		//    5    9:aload_0         
		//    6   10:new             #6   <Class ShowcaseView>
		//    7   13:dup             
		//    8   14:aload_1         
		//    9   15:iload_2         
		//   10   16:invokespecial   #25  <Method void ShowcaseView(Context, boolean)>
		//   11   19:putfield        #27  <Field ShowcaseView showcaseView>
			showcaseView.setTarget(Target.NONE);
		//   12   22:aload_0         
		//   13   23:getfield        #27  <Field ShowcaseView showcaseView>
		//   14   26:getstatic       #33  <Field Target Target.NONE>
		//   15   29:invokevirtual   #37  <Method void ShowcaseView.setTarget(Target)>
		//   16   32:return          
		}
	}


	protected ShowcaseView(Context context, AttributeSet attributeset, int i, boolean flag)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #71  <Method void RelativeLayout(Context, AttributeSet, int)>
		showcaseX = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #73  <Field int showcaseX>
		showcaseY = -1;
	//    8   12:aload_0         
	//    9   13:iconst_m1       
	//   10   14:putfield        #75  <Field int showcaseY>
		scaleMultiplier = 1.0F;
	//   11   17:aload_0         
	//   12   18:fconst_1        
	//   13   19:putfield        #77  <Field float scaleMultiplier>
		hasCustomClickListener = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #79  <Field boolean hasCustomClickListener>
		blockTouches = true;
	//   17   27:aload_0         
	//   18   28:iconst_1        
	//   19   29:putfield        #81  <Field boolean blockTouches>
		hideOnTouch = false;
	//   20   32:aload_0         
	//   21   33:iconst_0        
	//   22   34:putfield        #83  <Field boolean hideOnTouch>
		mEventListener = OnShowcaseEventListener.NONE;
	//   23   37:aload_0         
	//   24   38:getstatic       #88  <Field OnShowcaseEventListener OnShowcaseEventListener.NONE>
	//   25   41:putfield        #90  <Field OnShowcaseEventListener mEventListener>
		hasAlteredText = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #92  <Field boolean hasAlteredText>
		hasNoTarget = false;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #94  <Field boolean hasNoTarget>
		ApiUtils apiutils = new ApiUtils();
	//   32   54:new             #96  <Class ApiUtils>
	//   33   57:dup             
	//   34   58:invokespecial   #98  <Method void ApiUtils()>
	//   35   61:astore          5
		animationFactory = ((AnimationFactory) (new AnimatorAnimationFactory()));
	//   36   63:aload_0         
	//   37   64:new             #100 <Class AnimatorAnimationFactory>
	//   38   67:dup             
	//   39   68:invokespecial   #101 <Method void AnimatorAnimationFactory()>
	//   40   71:putfield        #103 <Field AnimationFactory animationFactory>
		showcaseAreaCalculator = new ShowcaseAreaCalculator();
	//   41   74:aload_0         
	//   42   75:new             #105 <Class ShowcaseAreaCalculator>
	//   43   78:dup             
	//   44   79:invokespecial   #106 <Method void ShowcaseAreaCalculator()>
	//   45   82:putfield        #108 <Field ShowcaseAreaCalculator showcaseAreaCalculator>
		shotStateStore = new ShotStateStore(context);
	//   46   85:aload_0         
	//   47   86:new             #110 <Class ShotStateStore>
	//   48   89:dup             
	//   49   90:aload_1         
	//   50   91:invokespecial   #113 <Method void ShotStateStore(Context)>
	//   51   94:putfield        #115 <Field ShotStateStore shotStateStore>
		apiutils.setFitsSystemWindowsCompat(((View) (this)));
	//   52   97:aload           5
	//   53   99:aload_0         
	//   54  100:invokevirtual   #119 <Method void ApiUtils.setFitsSystemWindowsCompat(View)>
		getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (this)));
	//   55  103:aload_0         
	//   56  104:invokevirtual   #123 <Method ViewTreeObserver getViewTreeObserver()>
	//   57  107:aload_0         
	//   58  108:invokevirtual   #129 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		getViewTreeObserver().addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   59  111:aload_0         
	//   60  112:invokevirtual   #123 <Method ViewTreeObserver getViewTreeObserver()>
	//   61  115:aload_0         
	//   62  116:invokevirtual   #133 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		attributeset = ((AttributeSet) (context.getTheme().obtainStyledAttributes(attributeset, R.styleable.ShowcaseView, R.attr.showcaseViewStyle, R.style.ShowcaseView)));
	//   63  119:aload_1         
	//   64  120:invokevirtual   #139 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   65  123:aload_2         
	//   66  124:getstatic       #145 <Field int[] R$styleable.ShowcaseView>
	//   67  127:getstatic       #150 <Field int R$attr.showcaseViewStyle>
	//   68  130:getstatic       #154 <Field int R$style.ShowcaseView>
	//   69  133:invokevirtual   #160 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   70  136:astore_2        
		fadeInMillis = getResources().getInteger(0x10e0001);
	//   71  137:aload_0         
	//   72  138:aload_0         
	//   73  139:invokevirtual   #164 <Method Resources getResources()>
	//   74  142:ldc1            #165 <Int 0x10e0001>
	//   75  144:invokevirtual   #171 <Method int Resources.getInteger(int)>
	//   76  147:i2l             
	//   77  148:putfield        #173 <Field long fadeInMillis>
		fadeOutMillis = getResources().getInteger(0x10e0001);
	//   78  151:aload_0         
	//   79  152:aload_0         
	//   80  153:invokevirtual   #164 <Method Resources getResources()>
	//   81  156:ldc1            #165 <Int 0x10e0001>
	//   82  158:invokevirtual   #171 <Method int Resources.getInteger(int)>
	//   83  161:i2l             
	//   84  162:putfield        #175 <Field long fadeOutMillis>
		mEndButton = (Button)LayoutInflater.from(context).inflate(R.layout.showcase_button, ((ViewGroup) (null)));
	//   85  165:aload_0         
	//   86  166:aload_1         
	//   87  167:invokestatic    #181 <Method LayoutInflater LayoutInflater.from(Context)>
	//   88  170:getstatic       #186 <Field int R$layout.showcase_button>
	//   89  173:aconst_null     
	//   90  174:invokevirtual   #190 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   91  177:checkcast       #192 <Class Button>
	//   92  180:putfield        #194 <Field Button mEndButton>
		if(flag)
	//*  93  183:iload           4
	//*  94  185:ifeq            206
			showcaseDrawer = ((ShowcaseDrawer) (new NewShowcaseDrawer(getResources())));
	//   95  188:aload_0         
	//   96  189:new             #196 <Class NewShowcaseDrawer>
	//   97  192:dup             
	//   98  193:aload_0         
	//   99  194:invokevirtual   #164 <Method Resources getResources()>
	//  100  197:invokespecial   #199 <Method void NewShowcaseDrawer(Resources)>
	//  101  200:putfield        #201 <Field ShowcaseDrawer showcaseDrawer>
		else
	//* 102  203:goto            221
			showcaseDrawer = ((ShowcaseDrawer) (new StandardShowcaseDrawer(getResources())));
	//  103  206:aload_0         
	//  104  207:new             #203 <Class StandardShowcaseDrawer>
	//  105  210:dup             
	//  106  211:aload_0         
	//  107  212:invokevirtual   #164 <Method Resources getResources()>
	//  108  215:invokespecial   #204 <Method void StandardShowcaseDrawer(Resources)>
	//  109  218:putfield        #201 <Field ShowcaseDrawer showcaseDrawer>
		textDrawer = new TextDrawer(getResources(), showcaseAreaCalculator, getContext());
	//  110  221:aload_0         
	//  111  222:new             #206 <Class TextDrawer>
	//  112  225:dup             
	//  113  226:aload_0         
	//  114  227:invokevirtual   #164 <Method Resources getResources()>
	//  115  230:aload_0         
	//  116  231:getfield        #108 <Field ShowcaseAreaCalculator showcaseAreaCalculator>
	//  117  234:aload_0         
	//  118  235:invokevirtual   #210 <Method Context getContext()>
	//  119  238:invokespecial   #213 <Method void TextDrawer(Resources, ShowcaseAreaCalculator, Context)>
	//  120  241:putfield        #215 <Field TextDrawer textDrawer>
		updateStyle(((TypedArray) (attributeset)), false);
	//  121  244:aload_0         
	//  122  245:aload_2         
	//  123  246:iconst_0        
	//  124  247:invokespecial   #219 <Method void updateStyle(TypedArray, boolean)>
		init();
	//  125  250:aload_0         
	//  126  251:invokespecial   #222 <Method void init()>
	//  127  254:return          
	}

	protected ShowcaseView(Context context, boolean flag)
	{
		this(context, ((AttributeSet) (null)), 0, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:iload_2         
	//    5    5:invokespecial   #225 <Method void ShowcaseView(Context, AttributeSet, int, boolean)>
	//    6    8:return          
	}

	private void clearBitmap()
	{
		if(bitmapBuffer != null && !bitmapBuffer.isRecycled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #252 <Field Bitmap bitmapBuffer>
	//*   2    4:ifnull          29
	//*   3    7:aload_0         
	//*   4    8:getfield        #252 <Field Bitmap bitmapBuffer>
	//*   5   11:invokevirtual   #258 <Method boolean Bitmap.isRecycled()>
	//*   6   14:ifne            29
		{
			bitmapBuffer.recycle();
	//    7   17:aload_0         
	//    8   18:getfield        #252 <Field Bitmap bitmapBuffer>
	//    9   21:invokevirtual   #261 <Method void Bitmap.recycle()>
			bitmapBuffer = null;
	//   10   24:aload_0         
	//   11   25:aconst_null     
	//   12   26:putfield        #252 <Field Bitmap bitmapBuffer>
		}
	//   13   29:return          
	}

	private void fadeInShowcase()
	{
		animationFactory.fadeInView(((View) (this)), fadeInMillis, new AnimationFactory.AnimationStartListener() {

			public void onAnimationStart()
			{
				setVisibility(0);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ShowcaseView this$0>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #25  <Method void ShowcaseView.setVisibility(int)>
			//    4    8:return          
			}

			final ShowcaseView this$0;

			
			{
				this$0 = ShowcaseView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ShowcaseView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field AnimationFactory animationFactory>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #173 <Field long fadeInMillis>
	//    5    9:new             #18  <Class ShowcaseView$3>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #264 <Method void ShowcaseView$3(ShowcaseView)>
	//    9   17:invokeinterface #270 <Method void AnimationFactory.fadeInView(View, long, AnimationFactory$AnimationStartListener)>
	//   10   22:return          
	}

	private void fadeOutShowcase()
	{
		animationFactory.fadeOutView(((View) (this)), fadeOutMillis, new AnimationFactory.AnimationEndListener() {

			public void onAnimationEnd()
			{
				setVisibility(8);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ShowcaseView this$0>
			//    2    4:bipush          8
			//    3    6:invokevirtual   #25  <Method void ShowcaseView.setVisibility(int)>
				mEventListener.onShowcaseViewDidHide(ShowcaseView.this);
			//    4    9:aload_0         
			//    5   10:getfield        #17  <Field ShowcaseView this$0>
			//    6   13:invokestatic    #29  <Method OnShowcaseEventListener ShowcaseView.access$400(ShowcaseView)>
			//    7   16:aload_0         
			//    8   17:getfield        #17  <Field ShowcaseView this$0>
			//    9   20:invokeinterface #34  <Method void OnShowcaseEventListener.onShowcaseViewDidHide(ShowcaseView)>
			//   10   25:return          
			}

			final ShowcaseView this$0;

			
			{
				this$0 = ShowcaseView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ShowcaseView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field AnimationFactory animationFactory>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #175 <Field long fadeOutMillis>
	//    5    9:new             #16  <Class ShowcaseView$2>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #272 <Method void ShowcaseView$2(ShowcaseView)>
	//    9   17:invokeinterface #276 <Method void AnimationFactory.fadeOutView(View, long, AnimationFactory$AnimationEndListener)>
	//   10   22:return          
	}

	private boolean hasShot()
	{
		return shotStateStore.hasShot();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ShotStateStore shotStateStore>
	//    2    4:invokevirtual   #279 <Method boolean ShotStateStore.hasShot()>
	//    3    7:ireturn         
	}

	private boolean haveBoundsChanged()
	{
		return getMeasuredWidth() != bitmapBuffer.getWidth() || getMeasuredHeight() != bitmapBuffer.getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #284 <Method int getMeasuredWidth()>
	//    2    4:aload_0         
	//    3    5:getfield        #252 <Field Bitmap bitmapBuffer>
	//    4    8:invokevirtual   #287 <Method int Bitmap.getWidth()>
	//    5   11:icmpne          33
	//    6   14:aload_0         
	//    7   15:invokevirtual   #290 <Method int getMeasuredHeight()>
	//    8   18:aload_0         
	//    9   19:getfield        #252 <Field Bitmap bitmapBuffer>
	//   10   22:invokevirtual   #293 <Method int Bitmap.getHeight()>
	//   11   25:icmpeq          31
	//   12   28:goto            33
	//   13   31:iconst_0        
	//   14   32:ireturn         
	//   15   33:iconst_1        
	//   16   34:ireturn         
	}

	private void hideImmediate()
	{
		setVisibility(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #298 <Method void setVisibility(int)>
	//    3    6:return          
	}

	private void init()
	{
		setOnTouchListener(((android.view.View.OnTouchListener) (this)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #302 <Method void setOnTouchListener(android.view.View$OnTouchListener)>
		if(mEndButton.getParent() == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #194 <Field Button mEndButton>
	//*   5    9:invokevirtual   #306 <Method android.view.ViewParent Button.getParent()>
	//*   6   12:ifnonnull       96
		{
			int i = (int)getResources().getDimension(R.dimen.button_margin);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #164 <Method Resources getResources()>
	//    9   19:getstatic       #311 <Field int R$dimen.button_margin>
	//   10   22:invokevirtual   #315 <Method float Resources.getDimension(int)>
	//   11   25:f2i             
	//   12   26:istore_1        
			android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)generateDefaultLayoutParams();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #319 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//   15   31:checkcast       #321 <Class android.widget.RelativeLayout$LayoutParams>
	//   16   34:astore_2        
			layoutparams.addRule(12);
	//   17   35:aload_2         
	//   18   36:bipush          12
	//   19   38:invokevirtual   #324 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			layoutparams.addRule(11);
	//   20   41:aload_2         
	//   21   42:bipush          11
	//   22   44:invokevirtual   #324 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			layoutparams.setMargins(i, i, i, i);
	//   23   47:aload_2         
	//   24   48:iload_1         
	//   25   49:iload_1         
	//   26   50:iload_1         
	//   27   51:iload_1         
	//   28   52:invokevirtual   #328 <Method void android.widget.RelativeLayout$LayoutParams.setMargins(int, int, int, int)>
			mEndButton.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   29   55:aload_0         
	//   30   56:getfield        #194 <Field Button mEndButton>
	//   31   59:aload_2         
	//   32   60:invokevirtual   #332 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			mEndButton.setText(R.string.ok);
	//   33   63:aload_0         
	//   34   64:getfield        #194 <Field Button mEndButton>
	//   35   67:getstatic       #337 <Field int R$string.ok>
	//   36   70:invokevirtual   #340 <Method void Button.setText(int)>
			if(!hasCustomClickListener)
	//*  37   73:aload_0         
	//*  38   74:getfield        #79  <Field boolean hasCustomClickListener>
	//*  39   77:ifne            88
				mEndButton.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   40   80:aload_0         
	//   41   81:getfield        #194 <Field Button mEndButton>
	//   42   84:aload_0         
	//   43   85:invokevirtual   #344 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			addView(((View) (mEndButton)));
	//   44   88:aload_0         
	//   45   89:aload_0         
	//   46   90:getfield        #194 <Field Button mEndButton>
	//   47   93:invokevirtual   #347 <Method void addView(View)>
		}
	//   48   96:return          
	}

	private static void insertShowcaseView(ShowcaseView showcaseview, Activity activity)
	{
		((ViewGroup)activity.getWindow().getDecorView()).addView(((View) (showcaseview)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #353 <Method Window Activity.getWindow()>
	//    2    4:invokevirtual   #359 <Method View Window.getDecorView()>
	//    3    7:checkcast       #361 <Class ViewGroup>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #362 <Method void ViewGroup.addView(View)>
		if(!showcaseview.hasShot())
	//*   6   14:aload_0         
	//*   7   15:invokespecial   #363 <Method boolean hasShot()>
	//*   8   18:ifne            26
		{
			showcaseview.show();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #366 <Method void show()>
			return;
	//   11   25:return          
		} else
		{
			showcaseview.hideImmediate();
	//   12   26:aload_0         
	//   13   27:invokespecial   #368 <Method void hideImmediate()>
			return;
	//   14   30:return          
		}
	}

	private void setFadeDurations(long l, long l1)
	{
		fadeInMillis = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #173 <Field long fadeInMillis>
		fadeOutMillis = l1;
	//    3    5:aload_0         
	//    4    6:lload_3         
	//    5    7:putfield        #175 <Field long fadeOutMillis>
	//    6   10:return          
	}

	private void setScaleMultiplier(float f)
	{
		scaleMultiplier = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #77  <Field float scaleMultiplier>
	//    3    5:return          
	}

	private void setSingleShot(long l)
	{
		shotStateStore.setSingleShot(l);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ShotStateStore shotStateStore>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #373 <Method void ShotStateStore.setSingleShot(long)>
	//    4    8:return          
	}

	private void tintButton(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            19
		{
			mEndButton.getBackground().setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
	//    2    4:aload_0         
	//    3    5:getfield        #194 <Field Button mEndButton>
	//    4    8:invokevirtual   #379 <Method Drawable Button.getBackground()>
	//    5   11:iload_1         
	//    6   12:getstatic       #385 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//    7   15:invokevirtual   #391 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			return;
	//    8   18:return          
		} else
		{
			mEndButton.getBackground().setColorFilter(HOLO_BLUE, android.graphics.PorterDuff.Mode.MULTIPLY);
	//    9   19:aload_0         
	//   10   20:getfield        #194 <Field Button mEndButton>
	//   11   23:invokevirtual   #379 <Method Drawable Button.getBackground()>
	//   12   26:getstatic       #65  <Field int HOLO_BLUE>
	//   13   29:getstatic       #385 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   14   32:invokevirtual   #391 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			return;
	//   15   35:return          
		}
	}

	private void updateBitmap()
	{
		if(bitmapBuffer == null || haveBoundsChanged())
	//*   0    0:aload_0         
	//*   1    1:getfield        #252 <Field Bitmap bitmapBuffer>
	//*   2    4:ifnull          14
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #393 <Method boolean haveBoundsChanged()>
	//*   5   11:ifeq            32
			bitmapBuffer = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:invokevirtual   #284 <Method int getMeasuredWidth()>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #290 <Method int getMeasuredHeight()>
	//   11   23:getstatic       #399 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   12   26:invokestatic    #403 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   13   29:putfield        #252 <Field Bitmap bitmapBuffer>
	//   14   32:return          
	}

	private void updateStyle(TypedArray typedarray, boolean flag)
	{
		int i = typedarray.getColor(0, Color.argb(128, 80, 80, 80));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:sipush          128
	//    3    5:bipush          80
	//    4    7:bipush          80
	//    5    9:bipush          80
	//    6   11:invokestatic    #407 <Method int Color.argb(int, int, int, int)>
	//    7   14:invokevirtual   #413 <Method int TypedArray.getColor(int, int)>
	//    8   17:istore_3        
		int j = typedarray.getColor(8, HOLO_BLUE);
	//    9   18:aload_1         
	//   10   19:bipush          8
	//   11   21:getstatic       #65  <Field int HOLO_BLUE>
	//   12   24:invokevirtual   #413 <Method int TypedArray.getColor(int, int)>
	//   13   27:istore          4
		String s1 = typedarray.getString(5);
	//   14   29:aload_1         
	//   15   30:iconst_5        
	//   16   31:invokevirtual   #417 <Method String TypedArray.getString(int)>
	//   17   34:astore          9
		String s = s1;
	//   18   36:aload           9
	//   19   38:astore          8
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  20   40:aload           9
	//*  21   42:invokestatic    #423 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  22   45:ifeq            60
			s = getResources().getString(R.string.ok);
	//   23   48:aload_0         
	//   24   49:invokevirtual   #164 <Method Resources getResources()>
	//   25   52:getstatic       #337 <Field int R$string.ok>
	//   26   55:invokevirtual   #424 <Method String Resources.getString(int)>
	//   27   58:astore          8
		boolean flag1 = typedarray.getBoolean(9, true);
	//   28   60:aload_1         
	//   29   61:bipush          9
	//   30   63:iconst_1        
	//   31   64:invokevirtual   #428 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   32   67:istore          7
		int k = typedarray.getResourceId(7, R.style.TextAppearance_ShowcaseView_Title);
	//   33   69:aload_1         
	//   34   70:bipush          7
	//   35   72:getstatic       #431 <Field int R$style.TextAppearance_ShowcaseView_Title>
	//   36   75:invokevirtual   #434 <Method int TypedArray.getResourceId(int, int)>
	//   37   78:istore          5
		int l = typedarray.getResourceId(6, R.style.TextAppearance_ShowcaseView_Detail);
	//   38   80:aload_1         
	//   39   81:bipush          6
	//   40   83:getstatic       #437 <Field int R$style.TextAppearance_ShowcaseView_Detail>
	//   41   86:invokevirtual   #434 <Method int TypedArray.getResourceId(int, int)>
	//   42   89:istore          6
		typedarray.recycle();
	//   43   91:aload_1         
	//   44   92:invokevirtual   #438 <Method void TypedArray.recycle()>
		showcaseDrawer.setShowcaseColour(j);
	//   45   95:aload_0         
	//   46   96:getfield        #201 <Field ShowcaseDrawer showcaseDrawer>
	//   47   99:iload           4
	//   48  101:invokeinterface #443 <Method void ShowcaseDrawer.setShowcaseColour(int)>
		showcaseDrawer.setBackgroundColour(i);
	//   49  106:aload_0         
	//   50  107:getfield        #201 <Field ShowcaseDrawer showcaseDrawer>
	//   51  110:iload_3         
	//   52  111:invokeinterface #446 <Method void ShowcaseDrawer.setBackgroundColour(int)>
		tintButton(j, flag1);
	//   53  116:aload_0         
	//   54  117:iload           4
	//   55  119:iload           7
	//   56  121:invokespecial   #448 <Method void tintButton(int, boolean)>
		mEndButton.setText(((CharSequence) (s)));
	//   57  124:aload_0         
	//   58  125:getfield        #194 <Field Button mEndButton>
	//   59  128:aload           8
	//   60  130:invokevirtual   #451 <Method void Button.setText(CharSequence)>
		textDrawer.setTitleStyling(k);
	//   61  133:aload_0         
	//   62  134:getfield        #215 <Field TextDrawer textDrawer>
	//   63  137:iload           5
	//   64  139:invokevirtual   #454 <Method void TextDrawer.setTitleStyling(int)>
		textDrawer.setDetailStyling(l);
	//   65  142:aload_0         
	//   66  143:getfield        #215 <Field TextDrawer textDrawer>
	//   67  146:iload           6
	//   68  148:invokevirtual   #457 <Method void TextDrawer.setDetailStyling(int)>
		hasAlteredText = true;
	//   69  151:aload_0         
	//   70  152:iconst_1        
	//   71  153:putfield        #92  <Field boolean hasAlteredText>
		if(flag)
	//*  72  156:iload_2         
	//*  73  157:ifeq            164
			invalidate();
	//   74  160:aload_0         
	//   75  161:invokevirtual   #460 <Method void invalidate()>
	//   76  164:return          
	}

	protected void dispatchDraw(Canvas canvas)
	{
		if(showcaseX >= 0 && showcaseY >= 0 && !shotStateStore.hasShot())
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int showcaseX>
	//*   2    4:iflt            102
	//*   3    7:aload_0         
	//*   4    8:getfield        #75  <Field int showcaseY>
	//*   5   11:iflt            102
	//*   6   14:aload_0         
	//*   7   15:getfield        #115 <Field ShotStateStore shotStateStore>
	//*   8   18:invokevirtual   #279 <Method boolean ShotStateStore.hasShot()>
	//*   9   21:ifeq            27
	//*  10   24:goto            102
		{
			showcaseDrawer.erase(bitmapBuffer);
	//   11   27:aload_0         
	//   12   28:getfield        #201 <Field ShowcaseDrawer showcaseDrawer>
	//   13   31:aload_0         
	//   14   32:getfield        #252 <Field Bitmap bitmapBuffer>
	//   15   35:invokeinterface #466 <Method void ShowcaseDrawer.erase(Bitmap)>
			if(!hasNoTarget)
	//*  16   40:aload_0         
	//*  17   41:getfield        #94  <Field boolean hasNoTarget>
	//*  18   44:ifne            88
			{
				showcaseDrawer.drawShowcase(bitmapBuffer, showcaseX, showcaseY, scaleMultiplier);
	//   19   47:aload_0         
	//   20   48:getfield        #201 <Field ShowcaseDrawer showcaseDrawer>
	//   21   51:aload_0         
	//   22   52:getfield        #252 <Field Bitmap bitmapBuffer>
	//   23   55:aload_0         
	//   24   56:getfield        #73  <Field int showcaseX>
	//   25   59:i2f             
	//   26   60:aload_0         
	//   27   61:getfield        #75  <Field int showcaseY>
	//   28   64:i2f             
	//   29   65:aload_0         
	//   30   66:getfield        #77  <Field float scaleMultiplier>
	//   31   69:invokeinterface #470 <Method void ShowcaseDrawer.drawShowcase(Bitmap, float, float, float)>
				showcaseDrawer.drawToCanvas(canvas, bitmapBuffer);
	//   32   74:aload_0         
	//   33   75:getfield        #201 <Field ShowcaseDrawer showcaseDrawer>
	//   34   78:aload_1         
	//   35   79:aload_0         
	//   36   80:getfield        #252 <Field Bitmap bitmapBuffer>
	//   37   83:invokeinterface #474 <Method void ShowcaseDrawer.drawToCanvas(Canvas, Bitmap)>
			}
			textDrawer.draw(canvas);
	//   38   88:aload_0         
	//   39   89:getfield        #215 <Field TextDrawer textDrawer>
	//   40   92:aload_1         
	//   41   93:invokevirtual   #477 <Method void TextDrawer.draw(Canvas)>
			super.dispatchDraw(canvas);
	//   42   96:aload_0         
	//   43   97:aload_1         
	//   44   98:invokespecial   #479 <Method void RelativeLayout.dispatchDraw(Canvas)>
			return;
	//   45  101:return          
		} else
		{
			super.dispatchDraw(canvas);
	//   46  102:aload_0         
	//   47  103:aload_1         
	//   48  104:invokespecial   #479 <Method void RelativeLayout.dispatchDraw(Canvas)>
			return;
	//   49  107:return          
		}
	}

	public int getShowcaseX()
	{
		return showcaseX;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int showcaseX>
	//    2    4:ireturn         
	}

	public int getShowcaseY()
	{
		return showcaseY;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int showcaseY>
	//    2    4:ireturn         
	}

	public boolean hasShowcaseView()
	{
		return showcaseX != 0xf4240 && showcaseY != 0xf4240 || !hasNoTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int showcaseX>
	//    2    4:ldc2            #483 <Int 0xf4240>
	//    3    7:icmpeq          20
	//    4   10:aload_0         
	//    5   11:getfield        #75  <Field int showcaseY>
	//    6   14:ldc2            #483 <Int 0xf4240>
	//    7   17:icmpne          27
	//    8   20:aload_0         
	//    9   21:getfield        #94  <Field boolean hasNoTarget>
	//   10   24:ifne            29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	public void hide()
	{
		clearBitmap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #486 <Method void clearBitmap()>
		shotStateStore.storeShot();
	//    2    4:aload_0         
	//    3    5:getfield        #115 <Field ShotStateStore shotStateStore>
	//    4    8:invokevirtual   #489 <Method void ShotStateStore.storeShot()>
		mEventListener.onShowcaseViewHide(this);
	//    5   11:aload_0         
	//    6   12:getfield        #90  <Field OnShowcaseEventListener mEventListener>
	//    7   15:aload_0         
	//    8   16:invokeinterface #492 <Method void OnShowcaseEventListener.onShowcaseViewHide(ShowcaseView)>
		fadeOutShowcase();
	//    9   21:aload_0         
	//   10   22:invokespecial   #494 <Method void fadeOutShowcase()>
	//   11   25:return          
	}

	public void hideButton()
	{
		mEndButton.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field Button mEndButton>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #496 <Method void Button.setVisibility(int)>
	//    4    9:return          
	}

	public void onClick(View view)
	{
		hide();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #499 <Method void hide()>
	//    2    4:return          
	}

	public void onGlobalLayout()
	{
		if(!shotStateStore.hasShot())
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field ShotStateStore shotStateStore>
	//*   2    4:invokevirtual   #279 <Method boolean ShotStateStore.hasShot()>
	//*   3    7:ifne            14
			updateBitmap();
	//    4   10:aload_0         
	//    5   11:invokespecial   #232 <Method void updateBitmap()>
	//    6   14:return          
	}

	public boolean onPreDraw()
	{
		boolean flag;
		if(!showcaseAreaCalculator.calculateShowcaseRect(showcaseX, showcaseY, showcaseDrawer) && !hasAlteredText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field ShowcaseAreaCalculator showcaseAreaCalculator>
	//*   2    4:aload_0         
	//*   3    5:getfield        #73  <Field int showcaseX>
	//*   4    8:i2f             
	//*   5    9:aload_0         
	//*   6   10:getfield        #75  <Field int showcaseY>
	//*   7   13:i2f             
	//*   8   14:aload_0         
	//*   9   15:getfield        #201 <Field ShowcaseDrawer showcaseDrawer>
	//*  10   18:invokevirtual   #505 <Method boolean ShowcaseAreaCalculator.calculateShowcaseRect(float, float, ShowcaseDrawer)>
	//*  11   21:ifne            39
	//*  12   24:aload_0         
	//*  13   25:getfield        #92  <Field boolean hasAlteredText>
	//*  14   28:ifeq            34
	//*  15   31:goto            39
			flag = false;
	//   16   34:iconst_0        
	//   17   35:istore_1        
		else
	//*  18   36:goto            41
			flag = true;
	//   19   39:iconst_1        
	//   20   40:istore_1        
		if(flag)
	//*  21   41:iload_1         
	//*  22   42:ifeq            65
			textDrawer.calculateTextPosition(getMeasuredWidth(), getMeasuredHeight(), this, shouldCentreText);
	//   23   45:aload_0         
	//   24   46:getfield        #215 <Field TextDrawer textDrawer>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #284 <Method int getMeasuredWidth()>
	//   27   53:aload_0         
	//   28   54:invokevirtual   #290 <Method int getMeasuredHeight()>
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #507 <Field boolean shouldCentreText>
	//   32   62:invokevirtual   #511 <Method void TextDrawer.calculateTextPosition(int, int, ShowcaseView, boolean)>
		hasAlteredText = false;
	//   33   65:aload_0         
	//   34   66:iconst_0        
	//   35   67:putfield        #92  <Field boolean hasAlteredText>
		return true;
	//   36   70:iconst_1        
	//   37   71:ireturn         
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		float f = Math.abs(motionevent.getRawX() - (float)showcaseX);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #519 <Method float MotionEvent.getRawX()>
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field int showcaseX>
	//    4    8:i2f             
	//    5    9:fsub            
	//    6   10:invokestatic    #525 <Method float Math.abs(float)>
	//    7   13:fstore          5
		float f1 = Math.abs(motionevent.getRawY() - (float)showcaseY);
	//    8   15:aload_2         
	//    9   16:invokevirtual   #528 <Method float MotionEvent.getRawY()>
	//   10   19:aload_0         
	//   11   20:getfield        #75  <Field int showcaseY>
	//   12   23:i2f             
	//   13   24:fsub            
	//   14   25:invokestatic    #525 <Method float Math.abs(float)>
	//   15   28:fstore          6
		double d = Math.sqrt(Math.pow(f, 2D) + Math.pow(f1, 2D));
	//   16   30:fload           5
	//   17   32:f2d             
	//   18   33:ldc2w           #529 <Double 2D>
	//   19   36:invokestatic    #534 <Method double Math.pow(double, double)>
	//   20   39:fload           6
	//   21   41:f2d             
	//   22   42:ldc2w           #529 <Double 2D>
	//   23   45:invokestatic    #534 <Method double Math.pow(double, double)>
	//   24   48:dadd            
	//   25   49:invokestatic    #538 <Method double Math.sqrt(double)>
	//   26   52:dstore_3        
		if(1 == motionevent.getAction() && hideOnTouch && d > (double)showcaseDrawer.getBlockedRadius())
	//*  27   53:iconst_1        
	//*  28   54:aload_2         
	//*  29   55:invokevirtual   #541 <Method int MotionEvent.getAction()>
	//*  30   58:icmpne          89
	//*  31   61:aload_0         
	//*  32   62:getfield        #83  <Field boolean hideOnTouch>
	//*  33   65:ifeq            89
	//*  34   68:dload_3         
	//*  35   69:aload_0         
	//*  36   70:getfield        #201 <Field ShowcaseDrawer showcaseDrawer>
	//*  37   73:invokeinterface #544 <Method float ShowcaseDrawer.getBlockedRadius()>
	//*  38   78:f2d             
	//*  39   79:dcmpl           
	//*  40   80:ifle            89
		{
			hide();
	//   41   83:aload_0         
	//   42   84:invokevirtual   #499 <Method void hide()>
			return true;
	//   43   87:iconst_1        
	//   44   88:ireturn         
		}
		return blockTouches && d > (double)showcaseDrawer.getBlockedRadius();
	//   45   89:aload_0         
	//   46   90:getfield        #81  <Field boolean blockTouches>
	//   47   93:ifeq            113
	//   48   96:dload_3         
	//   49   97:aload_0         
	//   50   98:getfield        #201 <Field ShowcaseDrawer showcaseDrawer>
	//   51  101:invokeinterface #544 <Method float ShowcaseDrawer.getBlockedRadius()>
	//   52  106:f2d             
	//   53  107:dcmpl           
	//   54  108:ifle            113
	//   55  111:iconst_1        
	//   56  112:ireturn         
	//   57  113:iconst_0        
	//   58  114:ireturn         
	}

	public void overrideButtonClick(android.view.View.OnClickListener onclicklistener)
	{
		if(shotStateStore.hasShot())
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field ShotStateStore shotStateStore>
	//*   2    4:invokevirtual   #279 <Method boolean ShotStateStore.hasShot()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		if(mEndButton != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #194 <Field Button mEndButton>
	//*   7   15:ifnull          37
		{
			Button button = mEndButton;
	//    8   18:aload_0         
	//    9   19:getfield        #194 <Field Button mEndButton>
	//   10   22:astore_2        
			if(onclicklistener == null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          30
	//*  13   27:goto            32
				onclicklistener = ((android.view.View.OnClickListener) (this));
	//   14   30:aload_0         
	//   15   31:astore_1        
			button.setOnClickListener(onclicklistener);
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #344 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		}
		hasCustomClickListener = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #79  <Field boolean hasCustomClickListener>
	//   22   42:return          
	}

	public void setBlocksTouches(boolean flag)
	{
		blockTouches = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field boolean blockTouches>
	//    3    5:return          
	}

	public void setButtonPosition(android.widget.RelativeLayout.LayoutParams layoutparams)
	{
		mEndButton.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field Button mEndButton>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #332 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:return          
	}

	public void setButtonText(CharSequence charsequence)
	{
		if(mEndButton != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field Button mEndButton>
	//*   2    4:ifnull          15
			mEndButton.setText(charsequence);
	//    3    7:aload_0         
	//    4    8:getfield        #194 <Field Button mEndButton>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #451 <Method void Button.setText(CharSequence)>
	//    7   15:return          
	}

	public void setContentText(CharSequence charsequence)
	{
		textDrawer.setContentText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field TextDrawer textDrawer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #553 <Method void TextDrawer.setContentText(CharSequence)>
	//    4    8:return          
	}

	public void setContentTitle(CharSequence charsequence)
	{
		textDrawer.setContentTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field TextDrawer textDrawer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #556 <Method void TextDrawer.setContentTitle(CharSequence)>
	//    4    8:return          
	}

	public void setHideOnTouchOutside(boolean flag)
	{
		hideOnTouch = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #83  <Field boolean hideOnTouch>
	//    3    5:return          
	}

	public void setOnShowcaseEventListener(OnShowcaseEventListener onshowcaseeventlistener)
	{
		if(onshowcaseeventlistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			mEventListener = onshowcaseeventlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #90  <Field OnShowcaseEventListener mEventListener>
			return;
	//    5    9:return          
		} else
		{
			mEventListener = OnShowcaseEventListener.NONE;
	//    6   10:aload_0         
	//    7   11:getstatic       #88  <Field OnShowcaseEventListener OnShowcaseEventListener.NONE>
	//    8   14:putfield        #90  <Field OnShowcaseEventListener mEventListener>
			return;
	//    9   17:return          
		}
	}

	public void setShouldCentreText(boolean flag)
	{
		shouldCentreText = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #507 <Field boolean shouldCentreText>
		hasAlteredText = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #92  <Field boolean hasAlteredText>
		invalidate();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #460 <Method void invalidate()>
	//    8   14:return          
	}

	public void setShowcase(final Target target, final boolean animate)
	{
		postDelayed(new Runnable() {

			public void run()
			{
				if(!shotStateStore.hasShot())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field ShowcaseView this$0>
			//*   2    4:invokestatic    #34  <Method ShotStateStore ShowcaseView.access$000(ShowcaseView)>
			//*   3    7:invokevirtual   #40  <Method boolean ShotStateStore.hasShot()>
			//*   4   10:ifne            93
				{
					updateBitmap();
			//    5   13:aload_0         
			//    6   14:getfield        #21  <Field ShowcaseView this$0>
			//    7   17:invokestatic    #44  <Method void ShowcaseView.access$100(ShowcaseView)>
					Point point = target.getPoint();
			//    8   20:aload_0         
			//    9   21:getfield        #23  <Field Target val$target>
			//   10   24:invokeinterface #50  <Method Point Target.getPoint()>
			//   11   29:astore_1        
					if(point != null)
			//*  12   30:aload_1         
			//*  13   31:ifnull          77
					{
						hasNoTarget = false;
			//   14   34:aload_0         
			//   15   35:getfield        #21  <Field ShowcaseView this$0>
			//   16   38:iconst_0        
			//   17   39:invokestatic    #54  <Method boolean ShowcaseView.access$202(ShowcaseView, boolean)>
			//   18   42:pop             
						if(animate)
			//*  19   43:aload_0         
			//*  20   44:getfield        #25  <Field boolean val$animate>
			//*  21   47:ifeq            68
						{
							animationFactory.animateTargetToPoint(ShowcaseView.this, point);
			//   22   50:aload_0         
			//   23   51:getfield        #21  <Field ShowcaseView this$0>
			//   24   54:invokestatic    #58  <Method AnimationFactory ShowcaseView.access$300(ShowcaseView)>
			//   25   57:aload_0         
			//   26   58:getfield        #21  <Field ShowcaseView this$0>
			//   27   61:aload_1         
			//   28   62:invokeinterface #64  <Method void AnimationFactory.animateTargetToPoint(ShowcaseView, Point)>
							return;
			//   29   67:return          
						} else
						{
							setShowcasePosition(point);
			//   30   68:aload_0         
			//   31   69:getfield        #21  <Field ShowcaseView this$0>
			//   32   72:aload_1         
			//   33   73:invokevirtual   #68  <Method void ShowcaseView.setShowcasePosition(Point)>
							return;
			//   34   76:return          
						}
					}
					hasNoTarget = true;
			//   35   77:aload_0         
			//   36   78:getfield        #21  <Field ShowcaseView this$0>
			//   37   81:iconst_1        
			//   38   82:invokestatic    #54  <Method boolean ShowcaseView.access$202(ShowcaseView, boolean)>
			//   39   85:pop             
					invalidate();
			//   40   86:aload_0         
			//   41   87:getfield        #21  <Field ShowcaseView this$0>
			//   42   90:invokevirtual   #71  <Method void ShowcaseView.invalidate()>
				}
			//   43   93:return          
			}

			final ShowcaseView this$0;
			final boolean val$animate;
			final Target val$target;

			
			{
				this$0 = ShowcaseView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ShowcaseView this$0>
				target = target1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Target val$target>
				animate = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field boolean val$animate>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
, 100L);
	//    0    0:aload_0         
	//    1    1:new             #14  <Class ShowcaseView$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #565 <Method void ShowcaseView$1(ShowcaseView, Target, boolean)>
	//    7   11:ldc2w           #566 <Long 100L>
	//    8   14:invokevirtual   #571 <Method boolean postDelayed(Runnable, long)>
	//    9   17:pop             
	//   10   18:return          
	}

	void setShowcasePosition(int i, int j)
	{
		if(shotStateStore.hasShot())
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field ShotStateStore shotStateStore>
	//*   2    4:invokevirtual   #279 <Method boolean ShotStateStore.hasShot()>
	//*   3    7:ifeq            11
		{
			return;
	//    4   10:return          
		} else
		{
			showcaseX = i;
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:putfield        #73  <Field int showcaseX>
			showcaseY = j;
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:putfield        #75  <Field int showcaseY>
			invalidate();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #460 <Method void invalidate()>
			return;
	//   13   25:return          
		}
	}

	void setShowcasePosition(Point point)
	{
		setShowcasePosition(point.x, point.y);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #579 <Field int Point.x>
	//    3    5:aload_1         
	//    4    6:getfield        #582 <Field int Point.y>
	//    5    9:invokevirtual   #584 <Method void setShowcasePosition(int, int)>
	//    6   12:return          
	}

	public void setShowcaseX(int i)
	{
		setShowcasePosition(i, showcaseY);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #75  <Field int showcaseY>
	//    4    6:invokevirtual   #584 <Method void setShowcasePosition(int, int)>
	//    5    9:return          
	}

	public void setShowcaseY(int i)
	{
		setShowcasePosition(showcaseX, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field int showcaseX>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #584 <Method void setShowcasePosition(int, int)>
	//    5    9:return          
	}

	public void setStyle(int i)
	{
		updateStyle(getContext().obtainStyledAttributes(i, R.styleable.ShowcaseView), true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #210 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:getstatic       #145 <Field int[] R$styleable.ShowcaseView>
	//    5    9:invokevirtual   #590 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//    6   12:iconst_1        
	//    7   13:invokespecial   #219 <Method void updateStyle(TypedArray, boolean)>
	//    8   16:return          
	}

	public void setTarget(Target target)
	{
		setShowcase(target, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #594 <Method void setShowcase(Target, boolean)>
	//    4    6:return          
	}

	public void show()
	{
		mEventListener.onShowcaseViewShow(this);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field OnShowcaseEventListener mEventListener>
	//    2    4:aload_0         
	//    3    5:invokeinterface #597 <Method void OnShowcaseEventListener.onShowcaseViewShow(ShowcaseView)>
		fadeInShowcase();
	//    4   10:aload_0         
	//    5   11:invokespecial   #599 <Method void fadeInShowcase()>
	//    6   14:return          
	}

	public void showButton()
	{
		mEndButton.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field Button mEndButton>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #496 <Method void Button.setVisibility(int)>
	//    4    8:return          
	}

	private static final int HOLO_BLUE = Color.parseColor("#33B5E5");
	private final AnimationFactory animationFactory;
	private Bitmap bitmapBuffer;
	private boolean blockTouches;
	private long fadeInMillis;
	private long fadeOutMillis;
	private boolean hasAlteredText;
	private boolean hasCustomClickListener;
	private boolean hasNoTarget;
	private boolean hideOnTouch;
	private final Button mEndButton;
	private OnShowcaseEventListener mEventListener;
	private float scaleMultiplier;
	private final ShotStateStore shotStateStore;
	private boolean shouldCentreText;
	private final ShowcaseAreaCalculator showcaseAreaCalculator;
	private final ShowcaseDrawer showcaseDrawer;
	private int showcaseX;
	private int showcaseY;
	private final TextDrawer textDrawer;

	static 
	{
	//    0    0:ldc1            #57  <String "#33B5E5">
	//    1    2:invokestatic    #63  <Method int Color.parseColor(String)>
	//    2    5:putstatic       #65  <Field int HOLO_BLUE>
	//*   3    8:return          
	}


/*
	static ShotStateStore access$000(ShowcaseView showcaseview)
	{
		return showcaseview.shotStateStore;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ShotStateStore shotStateStore>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(ShowcaseView showcaseview)
	{
		showcaseview.updateBitmap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #232 <Method void updateBitmap()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$202(ShowcaseView showcaseview, boolean flag)
	{
		showcaseview.hasNoTarget = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #94  <Field boolean hasNoTarget>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static AnimationFactory access$300(ShowcaseView showcaseview)
	{
		return showcaseview.animationFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field AnimationFactory animationFactory>
	//    2    4:areturn         
	}

*/


/*
	static OnShowcaseEventListener access$400(ShowcaseView showcaseview)
	{
		return showcaseview.mEventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field OnShowcaseEventListener mEventListener>
	//    2    4:areturn         
	}

*/


/*
	static void access$500(ShowcaseView showcaseview, Activity activity)
	{
		insertShowcaseView(showcaseview, activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #243 <Method void insertShowcaseView(ShowcaseView, Activity)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$600(ShowcaseView showcaseview, long l)
	{
		showcaseview.setSingleShot(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #249 <Method void setSingleShot(long)>
		return;
	//    3    5:return          
	}

*/
}
