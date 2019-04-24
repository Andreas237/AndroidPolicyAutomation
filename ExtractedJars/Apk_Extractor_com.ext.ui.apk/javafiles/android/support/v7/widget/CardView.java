// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.*;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.widget:
//			CardViewApi21Impl, CardViewImpl, CardViewApi17Impl, CardViewBaseImpl, 
//			CardViewDelegate

public class CardView extends FrameLayout
{

	public CardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void FrameLayout(Context)>
		mContentPadding = new Rect();
	//    3    5:aload_0         
	//    4    6:new             #55  <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #56  <Method void Rect()>
	//    7   13:putfield        #58  <Field Rect mContentPadding>
		mShadowBounds = new Rect();
	//    8   16:aload_0         
	//    9   17:new             #55  <Class Rect>
	//   10   20:dup             
	//   11   21:invokespecial   #56  <Method void Rect()>
	//   12   24:putfield        #60  <Field Rect mShadowBounds>
		mCardViewDelegate = new CardViewDelegate() {

			public Drawable getCardBackground()
			{
				return mCardBackground;
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field Drawable mCardBackground>
			//    2    4:areturn         
			}

			public View getCardView()
			{
				return ((View) (CardView.this));
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CardView this$0>
			//    2    4:areturn         
			}

			public boolean getPreventCornerOverlap()
			{
				return CardView.this.getPreventCornerOverlap();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CardView this$0>
			//    2    4:invokevirtual   #30  <Method boolean CardView.getPreventCornerOverlap()>
			//    3    7:ireturn         
			}

			public boolean getUseCompatPadding()
			{
				return CardView.this.getUseCompatPadding();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CardView this$0>
			//    2    4:invokevirtual   #33  <Method boolean CardView.getUseCompatPadding()>
			//    3    7:ireturn         
			}

			public void setCardBackground(Drawable drawable)
			{
				mCardBackground = drawable;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field Drawable mCardBackground>
				setBackgroundDrawable(drawable);
			//    3    5:aload_0         
			//    4    6:getfield        #16  <Field CardView this$0>
			//    5    9:aload_1         
			//    6   10:invokevirtual   #38  <Method void CardView.setBackgroundDrawable(Drawable)>
			//    7   13:return          
			}

			public void setMinWidthHeightInternal(int i, int j)
			{
				if(i > mUserSetMinWidth)
			//*   0    0:iload_1         
			//*   1    1:aload_0         
			//*   2    2:getfield        #16  <Field CardView this$0>
			//*   3    5:getfield        #44  <Field int CardView.mUserSetMinWidth>
			//*   4    8:icmple          19
					setMinimumWidth(i);
			//    5   11:aload_0         
			//    6   12:getfield        #16  <Field CardView this$0>
			//    7   15:iload_1         
			//    8   16:invokestatic    #48  <Method void CardView.access$101(CardView, int)>
				if(j > mUserSetMinHeight)
			//*   9   19:iload_2         
			//*  10   20:aload_0         
			//*  11   21:getfield        #16  <Field CardView this$0>
			//*  12   24:getfield        #51  <Field int CardView.mUserSetMinHeight>
			//*  13   27:icmple          38
					setMinimumHeight(j);
			//   14   30:aload_0         
			//   15   31:getfield        #16  <Field CardView this$0>
			//   16   34:iload_2         
			//   17   35:invokestatic    #54  <Method void CardView.access$201(CardView, int)>
			//   18   38:return          
			}

			public void setShadowPadding(int i, int j, int k, int l)
			{
				mShadowBounds.set(i, j, k, l);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CardView this$0>
			//    2    4:getfield        #60  <Field Rect CardView.mShadowBounds>
			//    3    7:iload_1         
			//    4    8:iload_2         
			//    5    9:iload_3         
			//    6   10:iload           4
			//    7   12:invokevirtual   #65  <Method void Rect.set(int, int, int, int)>
				setPadding(mContentPadding.left + i, mContentPadding.top + j, mContentPadding.right + k, mContentPadding.bottom + l);
			//    8   15:aload_0         
			//    9   16:getfield        #16  <Field CardView this$0>
			//   10   19:aload_0         
			//   11   20:getfield        #16  <Field CardView this$0>
			//   12   23:getfield        #68  <Field Rect CardView.mContentPadding>
			//   13   26:getfield        #71  <Field int Rect.left>
			//   14   29:iload_1         
			//   15   30:iadd            
			//   16   31:aload_0         
			//   17   32:getfield        #16  <Field CardView this$0>
			//   18   35:getfield        #68  <Field Rect CardView.mContentPadding>
			//   19   38:getfield        #74  <Field int Rect.top>
			//   20   41:iload_2         
			//   21   42:iadd            
			//   22   43:aload_0         
			//   23   44:getfield        #16  <Field CardView this$0>
			//   24   47:getfield        #68  <Field Rect CardView.mContentPadding>
			//   25   50:getfield        #77  <Field int Rect.right>
			//   26   53:iload_3         
			//   27   54:iadd            
			//   28   55:aload_0         
			//   29   56:getfield        #16  <Field CardView this$0>
			//   30   59:getfield        #68  <Field Rect CardView.mContentPadding>
			//   31   62:getfield        #80  <Field int Rect.bottom>
			//   32   65:iload           4
			//   33   67:iadd            
			//   34   68:invokestatic    #84  <Method void CardView.access$001(CardView, int, int, int, int)>
			//   35   71:return          
			}

			private Drawable mCardBackground;
			final CardView this$0;

			
			{
				this$0 = CardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CardView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   13   27:aload_0         
	//   14   28:new             #6   <Class CardView$1>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #63  <Method void CardView$1(CardView)>
	//   18   36:putfield        #65  <Field CardViewDelegate mCardViewDelegate>
		initialize(context, ((AttributeSet) (null)), 0);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:aconst_null     
	//   22   42:iconst_0        
	//   23   43:invokespecial   #69  <Method void initialize(Context, AttributeSet, int)>
	//   24   46:return          
	}

	public CardView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #72  <Method void FrameLayout(Context, AttributeSet)>
		mContentPadding = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #55  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #56  <Method void Rect()>
	//    8   14:putfield        #58  <Field Rect mContentPadding>
		mShadowBounds = new Rect();
	//    9   17:aload_0         
	//   10   18:new             #55  <Class Rect>
	//   11   21:dup             
	//   12   22:invokespecial   #56  <Method void Rect()>
	//   13   25:putfield        #60  <Field Rect mShadowBounds>
		mCardViewDelegate = new _cls1();
	//   14   28:aload_0         
	//   15   29:new             #6   <Class CardView$1>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #63  <Method void CardView$1(CardView)>
	//   19   37:putfield        #65  <Field CardViewDelegate mCardViewDelegate>
		initialize(context, attributeset, 0);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:iconst_0        
	//   24   44:invokespecial   #69  <Method void initialize(Context, AttributeSet, int)>
	//   25   47:return          
	}

	public CardView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #74  <Method void FrameLayout(Context, AttributeSet, int)>
		mContentPadding = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #55  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #56  <Method void Rect()>
	//    9   15:putfield        #58  <Field Rect mContentPadding>
		mShadowBounds = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #55  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #56  <Method void Rect()>
	//   14   26:putfield        #60  <Field Rect mShadowBounds>
		mCardViewDelegate = new _cls1();
	//   15   29:aload_0         
	//   16   30:new             #6   <Class CardView$1>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #63  <Method void CardView$1(CardView)>
	//   20   38:putfield        #65  <Field CardViewDelegate mCardViewDelegate>
		initialize(context, attributeset, i);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:iload_3         
	//   25   45:invokespecial   #69  <Method void initialize(Context, AttributeSet, int)>
	//   26   48:return          
	}

	private void initialize(Context context, AttributeSet attributeset, int i)
	{
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.cardview.R.styleable.CardView, i, android.support.v7.cardview.R.style.CardView);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getstatic       #95  <Field int[] android.support.v7.cardview.R$styleable.CardView>
	//    3    5:iload_3         
	//    4    6:getstatic       #99  <Field int android.support.v7.cardview.R$style.CardView>
	//    5    9:invokevirtual   #105 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    6   12:astore          8
		float f;
		float f1;
		float f2;
		float f3;
		if(typedarray.hasValue(android.support.v7.cardview.R.styleable.CardView_cardBackgroundColor))
	//*   7   14:aload           8
	//*   8   16:getstatic       #108 <Field int android.support.v7.cardview.R$styleable.CardView_cardBackgroundColor>
	//*   9   19:invokevirtual   #114 <Method boolean TypedArray.hasValue(int)>
	//*  10   22:ifeq            235
		{
			attributeset = ((AttributeSet) (typedarray.getColorStateList(android.support.v7.cardview.R.styleable.CardView_cardBackgroundColor)));
	//   11   25:aload           8
	//   12   27:getstatic       #108 <Field int android.support.v7.cardview.R$styleable.CardView_cardBackgroundColor>
	//   13   30:invokevirtual   #118 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   14   33:astore_2        
		} else
	//*  15   34:aload           8
	//*  16   36:getstatic       #121 <Field int android.support.v7.cardview.R$styleable.CardView_cardCornerRadius>
	//*  17   39:fconst_0        
	//*  18   40:invokevirtual   #125 <Method float TypedArray.getDimension(int, float)>
	//*  19   43:fstore          7
	//*  20   45:aload           8
	//*  21   47:getstatic       #128 <Field int android.support.v7.cardview.R$styleable.CardView_cardElevation>
	//*  22   50:fconst_0        
	//*  23   51:invokevirtual   #125 <Method float TypedArray.getDimension(int, float)>
	//*  24   54:fstore          5
	//*  25   56:aload           8
	//*  26   58:getstatic       #131 <Field int android.support.v7.cardview.R$styleable.CardView_cardMaxElevation>
	//*  27   61:fconst_0        
	//*  28   62:invokevirtual   #125 <Method float TypedArray.getDimension(int, float)>
	//*  29   65:fstore          6
	//*  30   67:aload_0         
	//*  31   68:aload           8
	//*  32   70:getstatic       #134 <Field int android.support.v7.cardview.R$styleable.CardView_cardUseCompatPadding>
	//*  33   73:iconst_0        
	//*  34   74:invokevirtual   #138 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  35   77:putfield        #140 <Field boolean mCompatPadding>
	//*  36   80:aload_0         
	//*  37   81:aload           8
	//*  38   83:getstatic       #143 <Field int android.support.v7.cardview.R$styleable.CardView_cardPreventCornerOverlap>
	//*  39   86:iconst_1        
	//*  40   87:invokevirtual   #138 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  41   90:putfield        #145 <Field boolean mPreventCornerOverlap>
	//*  42   93:aload           8
	//*  43   95:getstatic       #148 <Field int android.support.v7.cardview.R$styleable.CardView_contentPadding>
	//*  44   98:iconst_0        
	//*  45   99:invokevirtual   #152 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//*  46  102:istore_3        
	//*  47  103:aload_0         
	//*  48  104:getfield        #58  <Field Rect mContentPadding>
	//*  49  107:aload           8
	//*  50  109:getstatic       #155 <Field int android.support.v7.cardview.R$styleable.CardView_contentPaddingLeft>
	//*  51  112:iload_3         
	//*  52  113:invokevirtual   #152 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//*  53  116:putfield        #158 <Field int Rect.left>
	//*  54  119:aload_0         
	//*  55  120:getfield        #58  <Field Rect mContentPadding>
	//*  56  123:aload           8
	//*  57  125:getstatic       #161 <Field int android.support.v7.cardview.R$styleable.CardView_contentPaddingTop>
	//*  58  128:iload_3         
	//*  59  129:invokevirtual   #152 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//*  60  132:putfield        #164 <Field int Rect.top>
	//*  61  135:aload_0         
	//*  62  136:getfield        #58  <Field Rect mContentPadding>
	//*  63  139:aload           8
	//*  64  141:getstatic       #167 <Field int android.support.v7.cardview.R$styleable.CardView_contentPaddingRight>
	//*  65  144:iload_3         
	//*  66  145:invokevirtual   #152 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//*  67  148:putfield        #170 <Field int Rect.right>
	//*  68  151:aload_0         
	//*  69  152:getfield        #58  <Field Rect mContentPadding>
	//*  70  155:aload           8
	//*  71  157:getstatic       #173 <Field int android.support.v7.cardview.R$styleable.CardView_contentPaddingBottom>
	//*  72  160:iload_3         
	//*  73  161:invokevirtual   #152 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//*  74  164:putfield        #176 <Field int Rect.bottom>
	//*  75  167:fload           6
	//*  76  169:fstore          4
	//*  77  171:fload           5
	//*  78  173:fload           6
	//*  79  175:fcmpl           
	//*  80  176:ifle            183
	//*  81  179:fload           5
	//*  82  181:fstore          4
	//*  83  183:aload_0         
	//*  84  184:aload           8
	//*  85  186:getstatic       #179 <Field int android.support.v7.cardview.R$styleable.CardView_android_minWidth>
	//*  86  189:iconst_0        
	//*  87  190:invokevirtual   #152 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//*  88  193:putfield        #181 <Field int mUserSetMinWidth>
	//*  89  196:aload_0         
	//*  90  197:aload           8
	//*  91  199:getstatic       #184 <Field int android.support.v7.cardview.R$styleable.CardView_android_minHeight>
	//*  92  202:iconst_0        
	//*  93  203:invokevirtual   #152 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//*  94  206:putfield        #186 <Field int mUserSetMinHeight>
	//*  95  209:aload           8
	//*  96  211:invokevirtual   #189 <Method void TypedArray.recycle()>
	//*  97  214:getstatic       #38  <Field CardViewImpl IMPL>
	//*  98  217:aload_0         
	//*  99  218:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//* 100  221:aload_1         
	//* 101  222:aload_2         
	//* 102  223:fload           7
	//* 103  225:fload           5
	//* 104  227:fload           4
	//* 105  229:invokeinterface #192 <Method void CardViewImpl.initialize(CardViewDelegate, Context, ColorStateList, float, float, float)>
	//* 106  234:return          
		{
			attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR)));
	//  107  235:aload_0         
	//  108  236:invokevirtual   #196 <Method Context getContext()>
	//  109  239:getstatic       #26  <Field int[] COLOR_BACKGROUND_ATTR>
	//  110  242:invokevirtual   #199 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//  111  245:astore_2        
			i = ((TypedArray) (attributeset)).getColor(0, 0);
	//  112  246:aload_2         
	//  113  247:iconst_0        
	//  114  248:iconst_0        
	//  115  249:invokevirtual   #202 <Method int TypedArray.getColor(int, int)>
	//  116  252:istore_3        
			((TypedArray) (attributeset)).recycle();
	//  117  253:aload_2         
	//  118  254:invokevirtual   #189 <Method void TypedArray.recycle()>
			attributeset = ((AttributeSet) (new float[3]));
	//  119  257:iconst_3        
	//  120  258:newarray        float[]
	//  121  260:astore_2        
			Color.colorToHSV(i, ((float []) (attributeset)));
	//  122  261:iload_3         
	//  123  262:aload_2         
	//  124  263:invokestatic    #208 <Method void Color.colorToHSV(int, float[])>
			if(attributeset[2] > 0.5F)
	//* 125  266:aload_2         
	//* 126  267:iconst_2        
	//* 127  268:faload          
	//* 128  269:ldc1            #209 <Float 0.5F>
	//* 129  271:fcmpl           
	//* 130  272:ifle            294
				i = getResources().getColor(android.support.v7.cardview.R.color.cardview_light_background);
	//  131  275:aload_0         
	//  132  276:invokevirtual   #213 <Method Resources getResources()>
	//  133  279:getstatic       #218 <Field int android.support.v7.cardview.R$color.cardview_light_background>
	//  134  282:invokevirtual   #223 <Method int Resources.getColor(int)>
	//  135  285:istore_3        
			else
	//* 136  286:iload_3         
	//* 137  287:invokestatic    #228 <Method ColorStateList ColorStateList.valueOf(int)>
	//* 138  290:astore_2        
	//* 139  291:goto            34
				i = getResources().getColor(android.support.v7.cardview.R.color.cardview_dark_background);
	//  140  294:aload_0         
	//  141  295:invokevirtual   #213 <Method Resources getResources()>
	//  142  298:getstatic       #231 <Field int android.support.v7.cardview.R$color.cardview_dark_background>
	//  143  301:invokevirtual   #223 <Method int Resources.getColor(int)>
	//  144  304:istore_3        
			attributeset = ((AttributeSet) (ColorStateList.valueOf(i)));
		}
		f3 = typedarray.getDimension(android.support.v7.cardview.R.styleable.CardView_cardCornerRadius, 0.0F);
		f1 = typedarray.getDimension(android.support.v7.cardview.R.styleable.CardView_cardElevation, 0.0F);
		f2 = typedarray.getDimension(android.support.v7.cardview.R.styleable.CardView_cardMaxElevation, 0.0F);
		mCompatPadding = typedarray.getBoolean(android.support.v7.cardview.R.styleable.CardView_cardUseCompatPadding, false);
		mPreventCornerOverlap = typedarray.getBoolean(android.support.v7.cardview.R.styleable.CardView_cardPreventCornerOverlap, true);
		i = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPadding, 0);
		mContentPadding.left = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingLeft, i);
		mContentPadding.top = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingTop, i);
		mContentPadding.right = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingRight, i);
		mContentPadding.bottom = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingBottom, i);
		f = f2;
		if(f1 > f2)
			f = f1;
		mUserSetMinWidth = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_android_minWidth, 0);
		mUserSetMinHeight = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_android_minHeight, 0);
		typedarray.recycle();
		IMPL.initialize(mCardViewDelegate, context, ((ColorStateList) (attributeset)), f3, f1, f);
	//* 145  305:goto            286
	}

	public ColorStateList getCardBackgroundColor()
	{
		return IMPL.getBackgroundColor(mCardViewDelegate);
	//    0    0:getstatic       #38  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:invokeinterface #237 <Method ColorStateList CardViewImpl.getBackgroundColor(CardViewDelegate)>
	//    4   12:areturn         
	}

	public float getCardElevation()
	{
		return IMPL.getElevation(mCardViewDelegate);
	//    0    0:getstatic       #38  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:invokeinterface #243 <Method float CardViewImpl.getElevation(CardViewDelegate)>
	//    4   12:freturn         
	}

	public int getContentPaddingBottom()
	{
		return mContentPadding.bottom;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Rect mContentPadding>
	//    2    4:getfield        #176 <Field int Rect.bottom>
	//    3    7:ireturn         
	}

	public int getContentPaddingLeft()
	{
		return mContentPadding.left;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Rect mContentPadding>
	//    2    4:getfield        #158 <Field int Rect.left>
	//    3    7:ireturn         
	}

	public int getContentPaddingRight()
	{
		return mContentPadding.right;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Rect mContentPadding>
	//    2    4:getfield        #170 <Field int Rect.right>
	//    3    7:ireturn         
	}

	public int getContentPaddingTop()
	{
		return mContentPadding.top;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Rect mContentPadding>
	//    2    4:getfield        #164 <Field int Rect.top>
	//    3    7:ireturn         
	}

	public float getMaxCardElevation()
	{
		return IMPL.getMaxElevation(mCardViewDelegate);
	//    0    0:getstatic       #38  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:invokeinterface #252 <Method float CardViewImpl.getMaxElevation(CardViewDelegate)>
	//    4   12:freturn         
	}

	public boolean getPreventCornerOverlap()
	{
		return mPreventCornerOverlap;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field boolean mPreventCornerOverlap>
	//    2    4:ireturn         
	}

	public float getRadius()
	{
		return IMPL.getRadius(mCardViewDelegate);
	//    0    0:getstatic       #38  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:invokeinterface #257 <Method float CardViewImpl.getRadius(CardViewDelegate)>
	//    4   12:freturn         
	}

	public boolean getUseCompatPadding()
	{
		return mCompatPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field boolean mCompatPadding>
	//    2    4:ireturn         
	}

	protected void onMeasure(int i, int j)
	{
		if(IMPL instanceof CardViewApi21Impl) goto _L2; else goto _L1
	//    0    0:getstatic       #38  <Field CardViewImpl IMPL>
	//    1    3:instanceof      #33  <Class CardViewApi21Impl>
	//    2    6:ifne            143
_L1:
		int k = android.view.View.MeasureSpec.getMode(i);
	//    3    9:iload_1         
	//    4   10:invokestatic    #265 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   13:istore_3        
		k;
	//    6   14:iload_3         
		JVM INSTR lookupswitch 2: default 40
	//	               -2147483648: 79
	//	               1073741824: 79;
	//    7   15:lookupswitch    2: default 40
	//	               -2147483648: 79
	//	               1073741824: 79
		   goto _L3 _L4 _L4
_L3:
		k = android.view.View.MeasureSpec.getMode(j);
	//    8   40:iload_2         
	//    9   41:invokestatic    #265 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   44:istore_3        
		k;
	//   11   45:iload_3         
		JVM INSTR lookupswitch 2: default 72
	//	               -2147483648: 111
	//	               1073741824: 111;
	//   12   46:lookupswitch    2: default 72
	//	               -2147483648: 111
	//	               1073741824: 111
		   goto _L5 _L6 _L6
_L5:
		super.onMeasure(i, j);
	//   13   72:aload_0         
	//   14   73:iload_1         
	//   15   74:iload_2         
	//   16   75:invokespecial   #267 <Method void FrameLayout.onMeasure(int, int)>
		return;
	//   17   78:return          
_L4:
		i = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(IMPL.getMinWidth(mCardViewDelegate)), android.view.View.MeasureSpec.getSize(i)), k);
	//   18   79:getstatic       #38  <Field CardViewImpl IMPL>
	//   19   82:aload_0         
	//   20   83:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//   21   86:invokeinterface #270 <Method float CardViewImpl.getMinWidth(CardViewDelegate)>
	//   22   91:f2d             
	//   23   92:invokestatic    #276 <Method double Math.ceil(double)>
	//   24   95:d2i             
	//   25   96:iload_1         
	//   26   97:invokestatic    #279 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   27  100:invokestatic    #282 <Method int Math.max(int, int)>
	//   28  103:iload_3         
	//   29  104:invokestatic    #285 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   30  107:istore_1        
		continue; /* Loop/switch isn't completed */
	//   31  108:goto            40
_L6:
		j = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(IMPL.getMinHeight(mCardViewDelegate)), android.view.View.MeasureSpec.getSize(j)), k);
	//   32  111:getstatic       #38  <Field CardViewImpl IMPL>
	//   33  114:aload_0         
	//   34  115:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//   35  118:invokeinterface #288 <Method float CardViewImpl.getMinHeight(CardViewDelegate)>
	//   36  123:f2d             
	//   37  124:invokestatic    #276 <Method double Math.ceil(double)>
	//   38  127:d2i             
	//   39  128:iload_2         
	//   40  129:invokestatic    #279 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   41  132:invokestatic    #282 <Method int Math.max(int, int)>
	//   42  135:iload_3         
	//   43  136:invokestatic    #285 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   44  139:istore_2        
		if(true) goto _L5; else goto _L2
	//   45  140:goto            72
_L2:
		super.onMeasure(i, j);
	//   46  143:aload_0         
	//   47  144:iload_1         
	//   48  145:iload_2         
	//   49  146:invokespecial   #267 <Method void FrameLayout.onMeasure(int, int)>
		return;
	//   50  149:return          
		if(true) goto _L3; else goto _L7
_L7:
	}

	public void setCardBackgroundColor(int i)
	{
		IMPL.setBackgroundColor(mCardViewDelegate, ColorStateList.valueOf(i));
	//    0    0:getstatic       #38  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:iload_1         
	//    4    8:invokestatic    #228 <Method ColorStateList ColorStateList.valueOf(int)>
	//    5   11:invokeinterface #294 <Method void CardViewImpl.setBackgroundColor(CardViewDelegate, ColorStateList)>
	//    6   16:return          
	}

	public void setCardBackgroundColor(ColorStateList colorstatelist)
	{
		IMPL.setBackgroundColor(mCardViewDelegate, colorstatelist);
	//    0    0:getstatic       #38  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:aload_1         
	//    4    8:invokeinterface #294 <Method void CardViewImpl.setBackgroundColor(CardViewDelegate, ColorStateList)>
	//    5   13:return          
	}

	public void setCardElevation(float f)
	{
		IMPL.setElevation(mCardViewDelegate, f);
	//    0    0:getstatic       #38  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:fload_1         
	//    4    8:invokeinterface #303 <Method void CardViewImpl.setElevation(CardViewDelegate, float)>
	//    5   13:return          
	}

	public void setContentPadding(int i, int j, int k, int l)
	{
		mContentPadding.set(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Rect mContentPadding>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #307 <Method void Rect.set(int, int, int, int)>
		IMPL.updatePadding(mCardViewDelegate);
	//    7   12:getstatic       #38  <Field CardViewImpl IMPL>
	//    8   15:aload_0         
	//    9   16:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//   10   19:invokeinterface #311 <Method void CardViewImpl.updatePadding(CardViewDelegate)>
	//   11   24:return          
	}

	public void setMaxCardElevation(float f)
	{
		IMPL.setMaxElevation(mCardViewDelegate, f);
	//    0    0:getstatic       #38  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:fload_1         
	//    4    8:invokeinterface #315 <Method void CardViewImpl.setMaxElevation(CardViewDelegate, float)>
	//    5   13:return          
	}

	public void setMinimumHeight(int i)
	{
		mUserSetMinHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #186 <Field int mUserSetMinHeight>
		super.setMinimumHeight(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #90  <Method void FrameLayout.setMinimumHeight(int)>
	//    6   10:return          
	}

	public void setMinimumWidth(int i)
	{
		mUserSetMinWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #181 <Field int mUserSetMinWidth>
		super.setMinimumWidth(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #86  <Method void FrameLayout.setMinimumWidth(int)>
	//    6   10:return          
	}

	public void setPadding(int i, int j, int k, int l)
	{
	//    0    0:return          
	}

	public void setPaddingRelative(int i, int j, int k, int l)
	{
	//    0    0:return          
	}

	public void setPreventCornerOverlap(boolean flag)
	{
		if(flag != mPreventCornerOverlap)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #145 <Field boolean mPreventCornerOverlap>
	//*   3    5:icmpeq          25
		{
			mPreventCornerOverlap = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #145 <Field boolean mPreventCornerOverlap>
			IMPL.onPreventCornerOverlapChanged(mCardViewDelegate);
	//    7   13:getstatic       #38  <Field CardViewImpl IMPL>
	//    8   16:aload_0         
	//    9   17:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//   10   20:invokeinterface #321 <Method void CardViewImpl.onPreventCornerOverlapChanged(CardViewDelegate)>
		}
	//   11   25:return          
	}

	public void setRadius(float f)
	{
		IMPL.setRadius(mCardViewDelegate, f);
	//    0    0:getstatic       #38  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:fload_1         
	//    4    8:invokeinterface #324 <Method void CardViewImpl.setRadius(CardViewDelegate, float)>
	//    5   13:return          
	}

	public void setUseCompatPadding(boolean flag)
	{
		if(mCompatPadding != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field boolean mCompatPadding>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          25
		{
			mCompatPadding = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #140 <Field boolean mCompatPadding>
			IMPL.onCompatPaddingChanged(mCardViewDelegate);
	//    7   13:getstatic       #38  <Field CardViewImpl IMPL>
	//    8   16:aload_0         
	//    9   17:getfield        #65  <Field CardViewDelegate mCardViewDelegate>
	//   10   20:invokeinterface #328 <Method void CardViewImpl.onCompatPaddingChanged(CardViewDelegate)>
		}
	//   11   25:return          
	}

	private static final int COLOR_BACKGROUND_ATTR[] = {
		0x1010031
	};
	private static final CardViewImpl IMPL;
	private final CardViewDelegate mCardViewDelegate;
	private boolean mCompatPadding;
	final Rect mContentPadding;
	private boolean mPreventCornerOverlap;
	final Rect mShadowBounds;
	int mUserSetMinHeight;
	int mUserSetMinWidth;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #24  <Int 0x1010031>
	//    5    7:iastore         
	//    6    8:putstatic       #26  <Field int[] COLOR_BACKGROUND_ATTR>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   7   11:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   14:bipush          21
	//*   9   16:icmplt          38
			IMPL = ((CardViewImpl) (new CardViewApi21Impl()));
	//   10   19:new             #33  <Class CardViewApi21Impl>
	//   11   22:dup             
	//   12   23:invokespecial   #36  <Method void CardViewApi21Impl()>
	//   13   26:putstatic       #38  <Field CardViewImpl IMPL>
		else
	//*  14   29:getstatic       #38  <Field CardViewImpl IMPL>
	//*  15   32:invokeinterface #43  <Method void CardViewImpl.initStatic()>
	//*  16   37:return          
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  17   38:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   41:bipush          17
	//*  19   43:icmplt          59
			IMPL = ((CardViewImpl) (new CardViewApi17Impl()));
	//   20   46:new             #45  <Class CardViewApi17Impl>
	//   21   49:dup             
	//   22   50:invokespecial   #46  <Method void CardViewApi17Impl()>
	//   23   53:putstatic       #38  <Field CardViewImpl IMPL>
		else
	//*  24   56:goto            29
			IMPL = ((CardViewImpl) (new CardViewBaseImpl()));
	//   25   59:new             #48  <Class CardViewBaseImpl>
	//   26   62:dup             
	//   27   63:invokespecial   #49  <Method void CardViewBaseImpl()>
	//   28   66:putstatic       #38  <Field CardViewImpl IMPL>
		IMPL.initStatic();
	//*  29   69:goto            29
	}


/*
	static void access$001(CardView cardview, int i, int j, int k, int l)
	{
		((FrameLayout) (cardview)).FrameLayout.setPadding(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #80  <Method void FrameLayout.setPadding(int, int, int, int)>
		return;
	//    6    9:return          
	}

*/


/*
	static void access$101(CardView cardview, int i)
	{
		((FrameLayout) (cardview)).FrameLayout.setMinimumWidth(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #86  <Method void FrameLayout.setMinimumWidth(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$201(CardView cardview, int i)
	{
		((FrameLayout) (cardview)).FrameLayout.setMinimumHeight(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #90  <Method void FrameLayout.setMinimumHeight(int)>
		return;
	//    3    5:return          
	}

*/
}
