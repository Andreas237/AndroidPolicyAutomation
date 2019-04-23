// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.*;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.widget:
//			CardViewApi21Impl, CardViewApi17Impl, CardViewBaseImpl, CardViewImpl, 
//			CardViewDelegate

public class CardView extends FrameLayout
{

	public CardView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #52  <Method void CardView(Context, AttributeSet)>
	//    4    6:return          
	}

	public CardView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.cardview.R.attr.cardViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #57  <Field int android.support.v7.cardview.R$attr.cardViewStyle>
	//    4    6:invokespecial   #60  <Method void CardView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public CardView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #61  <Method void FrameLayout(Context, AttributeSet, int)>
		mContentPadding = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #63  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #64  <Method void Rect()>
	//    9   15:putfield        #66  <Field Rect mContentPadding>
		mShadowBounds = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #63  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #64  <Method void Rect()>
	//   14   26:putfield        #68  <Field Rect mShadowBounds>
		mCardViewDelegate = ((CardViewDelegate) (new _cls1()));
	//   15   29:aload_0         
	//   16   30:new             #70  <Class CardView$1>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #73  <Method void CardView$1(CardView)>
	//   20   38:putfield        #75  <Field CardViewDelegate mCardViewDelegate>
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.cardview.R.styleable.CardView, i, android.support.v7.cardview.R.style.CardView);
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:getstatic       #80  <Field int[] android.support.v7.cardview.R$styleable.CardView>
	//   24   46:iload_3         
	//   25   47:getstatic       #84  <Field int android.support.v7.cardview.R$style.CardView>
	//   26   50:invokevirtual   #90  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   27   53:astore          7
		if(typedarray.hasValue(android.support.v7.cardview.R.styleable.CardView_cardBackgroundColor))
	//*  28   55:aload           7
	//*  29   57:getstatic       #93  <Field int android.support.v7.cardview.R$styleable.CardView_cardBackgroundColor>
	//*  30   60:invokevirtual   #99  <Method boolean TypedArray.hasValue(int)>
	//*  31   63:ifeq            78
		{
			attributeset = ((AttributeSet) (typedarray.getColorStateList(android.support.v7.cardview.R.styleable.CardView_cardBackgroundColor)));
	//   32   66:aload           7
	//   33   68:getstatic       #93  <Field int android.support.v7.cardview.R$styleable.CardView_cardBackgroundColor>
	//   34   71:invokevirtual   #103 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   35   74:astore_2        
		} else
	//*  36   75:goto            148
		{
			attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR)));
	//   37   78:aload_0         
	//   38   79:invokevirtual   #107 <Method Context getContext()>
	//   39   82:getstatic       #24  <Field int[] COLOR_BACKGROUND_ATTR>
	//   40   85:invokevirtual   #110 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   41   88:astore_2        
			i = ((TypedArray) (attributeset)).getColor(0, 0);
	//   42   89:aload_2         
	//   43   90:iconst_0        
	//   44   91:iconst_0        
	//   45   92:invokevirtual   #114 <Method int TypedArray.getColor(int, int)>
	//   46   95:istore_3        
			((TypedArray) (attributeset)).recycle();
	//   47   96:aload_2         
	//   48   97:invokevirtual   #117 <Method void TypedArray.recycle()>
			attributeset = ((AttributeSet) (new float[3]));
	//   49  100:iconst_3        
	//   50  101:newarray        float[]
	//   51  103:astore_2        
			Color.colorToHSV(i, ((float []) (attributeset)));
	//   52  104:iload_3         
	//   53  105:aload_2         
	//   54  106:invokestatic    #123 <Method void Color.colorToHSV(int, float[])>
			if(attributeset[2] > 0.5F)
	//*  55  109:aload_2         
	//*  56  110:iconst_2        
	//*  57  111:faload          
	//*  58  112:ldc1            #124 <Float 0.5F>
	//*  59  114:fcmpl           
	//*  60  115:ifle            132
				i = getResources().getColor(android.support.v7.cardview.R.color.cardview_light_background);
	//   61  118:aload_0         
	//   62  119:invokevirtual   #128 <Method Resources getResources()>
	//   63  122:getstatic       #133 <Field int android.support.v7.cardview.R$color.cardview_light_background>
	//   64  125:invokevirtual   #138 <Method int Resources.getColor(int)>
	//   65  128:istore_3        
			else
	//*  66  129:goto            143
				i = getResources().getColor(android.support.v7.cardview.R.color.cardview_dark_background);
	//   67  132:aload_0         
	//   68  133:invokevirtual   #128 <Method Resources getResources()>
	//   69  136:getstatic       #141 <Field int android.support.v7.cardview.R$color.cardview_dark_background>
	//   70  139:invokevirtual   #138 <Method int Resources.getColor(int)>
	//   71  142:istore_3        
			attributeset = ((AttributeSet) (ColorStateList.valueOf(i)));
	//   72  143:iload_3         
	//   73  144:invokestatic    #146 <Method ColorStateList ColorStateList.valueOf(int)>
	//   74  147:astore_2        
		}
		float f2 = typedarray.getDimension(android.support.v7.cardview.R.styleable.CardView_cardCornerRadius, 0.0F);
	//   75  148:aload           7
	//   76  150:getstatic       #149 <Field int android.support.v7.cardview.R$styleable.CardView_cardCornerRadius>
	//   77  153:fconst_0        
	//   78  154:invokevirtual   #153 <Method float TypedArray.getDimension(int, float)>
	//   79  157:fstore          6
		float f1 = typedarray.getDimension(android.support.v7.cardview.R.styleable.CardView_cardElevation, 0.0F);
	//   80  159:aload           7
	//   81  161:getstatic       #156 <Field int android.support.v7.cardview.R$styleable.CardView_cardElevation>
	//   82  164:fconst_0        
	//   83  165:invokevirtual   #153 <Method float TypedArray.getDimension(int, float)>
	//   84  168:fstore          5
		float f = typedarray.getDimension(android.support.v7.cardview.R.styleable.CardView_cardMaxElevation, 0.0F);
	//   85  170:aload           7
	//   86  172:getstatic       #159 <Field int android.support.v7.cardview.R$styleable.CardView_cardMaxElevation>
	//   87  175:fconst_0        
	//   88  176:invokevirtual   #153 <Method float TypedArray.getDimension(int, float)>
	//   89  179:fstore          4
		mCompatPadding = typedarray.getBoolean(android.support.v7.cardview.R.styleable.CardView_cardUseCompatPadding, false);
	//   90  181:aload_0         
	//   91  182:aload           7
	//   92  184:getstatic       #162 <Field int android.support.v7.cardview.R$styleable.CardView_cardUseCompatPadding>
	//   93  187:iconst_0        
	//   94  188:invokevirtual   #166 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   95  191:putfield        #168 <Field boolean mCompatPadding>
		mPreventCornerOverlap = typedarray.getBoolean(android.support.v7.cardview.R.styleable.CardView_cardPreventCornerOverlap, true);
	//   96  194:aload_0         
	//   97  195:aload           7
	//   98  197:getstatic       #171 <Field int android.support.v7.cardview.R$styleable.CardView_cardPreventCornerOverlap>
	//   99  200:iconst_1        
	//  100  201:invokevirtual   #166 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  101  204:putfield        #173 <Field boolean mPreventCornerOverlap>
		i = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPadding, 0);
	//  102  207:aload           7
	//  103  209:getstatic       #176 <Field int android.support.v7.cardview.R$styleable.CardView_contentPadding>
	//  104  212:iconst_0        
	//  105  213:invokevirtual   #179 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  106  216:istore_3        
		mContentPadding.left = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingLeft, i);
	//  107  217:aload_0         
	//  108  218:getfield        #66  <Field Rect mContentPadding>
	//  109  221:aload           7
	//  110  223:getstatic       #182 <Field int android.support.v7.cardview.R$styleable.CardView_contentPaddingLeft>
	//  111  226:iload_3         
	//  112  227:invokevirtual   #179 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  113  230:putfield        #185 <Field int Rect.left>
		mContentPadding.top = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingTop, i);
	//  114  233:aload_0         
	//  115  234:getfield        #66  <Field Rect mContentPadding>
	//  116  237:aload           7
	//  117  239:getstatic       #188 <Field int android.support.v7.cardview.R$styleable.CardView_contentPaddingTop>
	//  118  242:iload_3         
	//  119  243:invokevirtual   #179 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  120  246:putfield        #191 <Field int Rect.top>
		mContentPadding.right = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingRight, i);
	//  121  249:aload_0         
	//  122  250:getfield        #66  <Field Rect mContentPadding>
	//  123  253:aload           7
	//  124  255:getstatic       #194 <Field int android.support.v7.cardview.R$styleable.CardView_contentPaddingRight>
	//  125  258:iload_3         
	//  126  259:invokevirtual   #179 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  127  262:putfield        #197 <Field int Rect.right>
		mContentPadding.bottom = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_contentPaddingBottom, i);
	//  128  265:aload_0         
	//  129  266:getfield        #66  <Field Rect mContentPadding>
	//  130  269:aload           7
	//  131  271:getstatic       #200 <Field int android.support.v7.cardview.R$styleable.CardView_contentPaddingBottom>
	//  132  274:iload_3         
	//  133  275:invokevirtual   #179 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  134  278:putfield        #203 <Field int Rect.bottom>
		if(f1 > f)
	//* 135  281:fload           5
	//* 136  283:fload           4
	//* 137  285:fcmpl           
	//* 138  286:ifle            296
			f = f1;
	//  139  289:fload           5
	//  140  291:fstore          4
	//* 141  293:goto            296
		mUserSetMinWidth = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_android_minWidth, 0);
	//  142  296:aload_0         
	//  143  297:aload           7
	//  144  299:getstatic       #206 <Field int android.support.v7.cardview.R$styleable.CardView_android_minWidth>
	//  145  302:iconst_0        
	//  146  303:invokevirtual   #179 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  147  306:putfield        #208 <Field int mUserSetMinWidth>
		mUserSetMinHeight = typedarray.getDimensionPixelSize(android.support.v7.cardview.R.styleable.CardView_android_minHeight, 0);
	//  148  309:aload_0         
	//  149  310:aload           7
	//  150  312:getstatic       #211 <Field int android.support.v7.cardview.R$styleable.CardView_android_minHeight>
	//  151  315:iconst_0        
	//  152  316:invokevirtual   #179 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  153  319:putfield        #213 <Field int mUserSetMinHeight>
		typedarray.recycle();
	//  154  322:aload           7
	//  155  324:invokevirtual   #117 <Method void TypedArray.recycle()>
		IMPL.initialize(mCardViewDelegate, context, ((ColorStateList) (attributeset)), f2, f1, f);
	//  156  327:getstatic       #36  <Field CardViewImpl IMPL>
	//  157  330:aload_0         
	//  158  331:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//  159  334:aload_1         
	//  160  335:aload_2         
	//  161  336:fload           6
	//  162  338:fload           5
	//  163  340:fload           4
	//  164  342:invokeinterface #217 <Method void CardViewImpl.initialize(CardViewDelegate, Context, ColorStateList, float, float, float)>
	//  165  347:return          
	}

	public ColorStateList getCardBackgroundColor()
	{
		return IMPL.getBackgroundColor(mCardViewDelegate);
	//    0    0:getstatic       #36  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:invokeinterface #239 <Method ColorStateList CardViewImpl.getBackgroundColor(CardViewDelegate)>
	//    4   12:areturn         
	}

	public float getCardElevation()
	{
		return IMPL.getElevation(mCardViewDelegate);
	//    0    0:getstatic       #36  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:invokeinterface #245 <Method float CardViewImpl.getElevation(CardViewDelegate)>
	//    4   12:freturn         
	}

	public int getContentPaddingBottom()
	{
		return mContentPadding.bottom;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Rect mContentPadding>
	//    2    4:getfield        #203 <Field int Rect.bottom>
	//    3    7:ireturn         
	}

	public int getContentPaddingLeft()
	{
		return mContentPadding.left;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Rect mContentPadding>
	//    2    4:getfield        #185 <Field int Rect.left>
	//    3    7:ireturn         
	}

	public int getContentPaddingRight()
	{
		return mContentPadding.right;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Rect mContentPadding>
	//    2    4:getfield        #197 <Field int Rect.right>
	//    3    7:ireturn         
	}

	public int getContentPaddingTop()
	{
		return mContentPadding.top;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Rect mContentPadding>
	//    2    4:getfield        #191 <Field int Rect.top>
	//    3    7:ireturn         
	}

	public float getMaxCardElevation()
	{
		return IMPL.getMaxElevation(mCardViewDelegate);
	//    0    0:getstatic       #36  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:invokeinterface #254 <Method float CardViewImpl.getMaxElevation(CardViewDelegate)>
	//    4   12:freturn         
	}

	public boolean getPreventCornerOverlap()
	{
		return mPreventCornerOverlap;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field boolean mPreventCornerOverlap>
	//    2    4:ireturn         
	}

	public float getRadius()
	{
		return IMPL.getRadius(mCardViewDelegate);
	//    0    0:getstatic       #36  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:invokeinterface #259 <Method float CardViewImpl.getRadius(CardViewDelegate)>
	//    4   12:freturn         
	}

	public boolean getUseCompatPadding()
	{
		return mCompatPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field boolean mCompatPadding>
	//    2    4:ireturn         
	}

	protected void onMeasure(int i, int j)
	{
		if(!(IMPL instanceof CardViewApi21Impl))
	//*   0    0:getstatic       #36  <Field CardViewImpl IMPL>
	//*   1    3:instanceof      #31  <Class CardViewApi21Impl>
	//*   2    6:ifne            118
		{
			int k = android.view.View.MeasureSpec.getMode(i);
	//    3    9:iload_1         
	//    4   10:invokestatic    #267 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   13:istore_3        
			if(k == 0x80000000 || k == 0x40000000)
	//*   6   14:iload_3         
	//*   7   15:ldc2            #268 <Int 0x80000000>
	//*   8   18:icmpeq          31
	//*   9   21:iload_3         
	//*  10   22:ldc2            #269 <Int 0x40000000>
	//*  11   25:icmpeq          31
	//*  12   28:goto            60
				i = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(IMPL.getMinWidth(mCardViewDelegate)), android.view.View.MeasureSpec.getSize(i)), k);
	//   13   31:getstatic       #36  <Field CardViewImpl IMPL>
	//   14   34:aload_0         
	//   15   35:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//   16   38:invokeinterface #272 <Method float CardViewImpl.getMinWidth(CardViewDelegate)>
	//   17   43:f2d             
	//   18   44:invokestatic    #278 <Method double Math.ceil(double)>
	//   19   47:d2i             
	//   20   48:iload_1         
	//   21   49:invokestatic    #281 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   22   52:invokestatic    #284 <Method int Math.max(int, int)>
	//   23   55:iload_3         
	//   24   56:invokestatic    #287 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   25   59:istore_1        
			k = android.view.View.MeasureSpec.getMode(j);
	//   26   60:iload_2         
	//   27   61:invokestatic    #267 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   28   64:istore_3        
			if(k == 0x80000000 || k == 0x40000000)
	//*  29   65:iload_3         
	//*  30   66:ldc2            #268 <Int 0x80000000>
	//*  31   69:icmpeq          82
	//*  32   72:iload_3         
	//*  33   73:ldc2            #269 <Int 0x40000000>
	//*  34   76:icmpeq          82
	//*  35   79:goto            111
				j = android.view.View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(IMPL.getMinHeight(mCardViewDelegate)), android.view.View.MeasureSpec.getSize(j)), k);
	//   36   82:getstatic       #36  <Field CardViewImpl IMPL>
	//   37   85:aload_0         
	//   38   86:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//   39   89:invokeinterface #290 <Method float CardViewImpl.getMinHeight(CardViewDelegate)>
	//   40   94:f2d             
	//   41   95:invokestatic    #278 <Method double Math.ceil(double)>
	//   42   98:d2i             
	//   43   99:iload_2         
	//   44  100:invokestatic    #281 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   45  103:invokestatic    #284 <Method int Math.max(int, int)>
	//   46  106:iload_3         
	//   47  107:invokestatic    #287 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   48  110:istore_2        
			super.onMeasure(i, j);
	//   49  111:aload_0         
	//   50  112:iload_1         
	//   51  113:iload_2         
	//   52  114:invokespecial   #292 <Method void FrameLayout.onMeasure(int, int)>
			return;
	//   53  117:return          
		} else
		{
			super.onMeasure(i, j);
	//   54  118:aload_0         
	//   55  119:iload_1         
	//   56  120:iload_2         
	//   57  121:invokespecial   #292 <Method void FrameLayout.onMeasure(int, int)>
			return;
	//   58  124:return          
		}
	}

	public void setCardBackgroundColor(int i)
	{
		IMPL.setBackgroundColor(mCardViewDelegate, ColorStateList.valueOf(i));
	//    0    0:getstatic       #36  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:iload_1         
	//    4    8:invokestatic    #146 <Method ColorStateList ColorStateList.valueOf(int)>
	//    5   11:invokeinterface #297 <Method void CardViewImpl.setBackgroundColor(CardViewDelegate, ColorStateList)>
	//    6   16:return          
	}

	public void setCardBackgroundColor(ColorStateList colorstatelist)
	{
		IMPL.setBackgroundColor(mCardViewDelegate, colorstatelist);
	//    0    0:getstatic       #36  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:aload_1         
	//    4    8:invokeinterface #297 <Method void CardViewImpl.setBackgroundColor(CardViewDelegate, ColorStateList)>
	//    5   13:return          
	}

	public void setCardElevation(float f)
	{
		IMPL.setElevation(mCardViewDelegate, f);
	//    0    0:getstatic       #36  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:fload_1         
	//    4    8:invokeinterface #304 <Method void CardViewImpl.setElevation(CardViewDelegate, float)>
	//    5   13:return          
	}

	public void setContentPadding(int i, int j, int k, int l)
	{
		mContentPadding.set(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Rect mContentPadding>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #308 <Method void Rect.set(int, int, int, int)>
		IMPL.updatePadding(mCardViewDelegate);
	//    7   12:getstatic       #36  <Field CardViewImpl IMPL>
	//    8   15:aload_0         
	//    9   16:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//   10   19:invokeinterface #312 <Method void CardViewImpl.updatePadding(CardViewDelegate)>
	//   11   24:return          
	}

	public void setMaxCardElevation(float f)
	{
		IMPL.setMaxElevation(mCardViewDelegate, f);
	//    0    0:getstatic       #36  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:fload_1         
	//    4    8:invokeinterface #316 <Method void CardViewImpl.setMaxElevation(CardViewDelegate, float)>
	//    5   13:return          
	}

	public void setMinimumHeight(int i)
	{
		mUserSetMinHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #213 <Field int mUserSetMinHeight>
		super.setMinimumHeight(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #233 <Method void FrameLayout.setMinimumHeight(int)>
	//    6   10:return          
	}

	public void setMinimumWidth(int i)
	{
		mUserSetMinWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #208 <Field int mUserSetMinWidth>
		super.setMinimumWidth(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #229 <Method void FrameLayout.setMinimumWidth(int)>
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
	//*   2    2:getfield        #173 <Field boolean mPreventCornerOverlap>
	//*   3    5:icmpeq          25
		{
			mPreventCornerOverlap = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #173 <Field boolean mPreventCornerOverlap>
			IMPL.onPreventCornerOverlapChanged(mCardViewDelegate);
	//    7   13:getstatic       #36  <Field CardViewImpl IMPL>
	//    8   16:aload_0         
	//    9   17:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//   10   20:invokeinterface #322 <Method void CardViewImpl.onPreventCornerOverlapChanged(CardViewDelegate)>
		}
	//   11   25:return          
	}

	public void setRadius(float f)
	{
		IMPL.setRadius(mCardViewDelegate, f);
	//    0    0:getstatic       #36  <Field CardViewImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//    3    7:fload_1         
	//    4    8:invokeinterface #325 <Method void CardViewImpl.setRadius(CardViewDelegate, float)>
	//    5   13:return          
	}

	public void setUseCompatPadding(boolean flag)
	{
		if(mCompatPadding != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #168 <Field boolean mCompatPadding>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          25
		{
			mCompatPadding = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #168 <Field boolean mCompatPadding>
			IMPL.onCompatPaddingChanged(mCardViewDelegate);
	//    7   13:getstatic       #36  <Field CardViewImpl IMPL>
	//    8   16:aload_0         
	//    9   17:getfield        #75  <Field CardViewDelegate mCardViewDelegate>
	//   10   20:invokeinterface #329 <Method void CardViewImpl.onCompatPaddingChanged(CardViewDelegate)>
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
	//    4    5:ldc1            #22  <Int 0x1010031>
	//    5    7:iastore         
	//    6    8:putstatic       #24  <Field int[] COLOR_BACKGROUND_ATTR>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   7   11:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   14:bipush          21
	//*   9   16:icmplt          32
			IMPL = ((CardViewImpl) (new CardViewApi21Impl()));
	//   10   19:new             #31  <Class CardViewApi21Impl>
	//   11   22:dup             
	//   12   23:invokespecial   #34  <Method void CardViewApi21Impl()>
	//   13   26:putstatic       #36  <Field CardViewImpl IMPL>
		else
	//*  14   29:goto            63
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  15   32:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   35:bipush          17
	//*  17   37:icmplt          53
			IMPL = ((CardViewImpl) (new CardViewApi17Impl()));
	//   18   40:new             #38  <Class CardViewApi17Impl>
	//   19   43:dup             
	//   20   44:invokespecial   #39  <Method void CardViewApi17Impl()>
	//   21   47:putstatic       #36  <Field CardViewImpl IMPL>
		else
	//*  22   50:goto            63
			IMPL = ((CardViewImpl) (new CardViewBaseImpl()));
	//   23   53:new             #41  <Class CardViewBaseImpl>
	//   24   56:dup             
	//   25   57:invokespecial   #42  <Method void CardViewBaseImpl()>
	//   26   60:putstatic       #36  <Field CardViewImpl IMPL>
		IMPL.initStatic();
	//   27   63:getstatic       #36  <Field CardViewImpl IMPL>
	//   28   66:invokeinterface #47  <Method void CardViewImpl.initStatic()>
	//*  29   71:return          
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
	//    5    6:invokespecial   #223 <Method void FrameLayout.setPadding(int, int, int, int)>
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
	//    2    2:invokespecial   #229 <Method void FrameLayout.setMinimumWidth(int)>
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
	//    2    2:invokespecial   #233 <Method void FrameLayout.setMinimumHeight(int)>
		return;
	//    3    5:return          
	}

*/

	private class _cls1
		implements CardViewDelegate
	{

		public Drawable getCardBackground()
		{
			return mCardBackground;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Drawable mCardBackground>
		//    2    4:areturn         
		}

		public View getCardView()
		{
			return ((View) (CardView.this));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CardView this$0>
		//    2    4:areturn         
		}

		public boolean getPreventCornerOverlap()
		{
			return CardView.this.getPreventCornerOverlap();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CardView this$0>
		//    2    4:invokevirtual   #30  <Method boolean CardView.getPreventCornerOverlap()>
		//    3    7:ireturn         
		}

		public boolean getUseCompatPadding()
		{
			return CardView.this.getUseCompatPadding();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CardView this$0>
		//    2    4:invokevirtual   #33  <Method boolean CardView.getUseCompatPadding()>
		//    3    7:ireturn         
		}

		public void setCardBackground(Drawable drawable)
		{
			mCardBackground = drawable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field Drawable mCardBackground>
			setBackgroundDrawable(drawable);
		//    3    5:aload_0         
		//    4    6:getfield        #14  <Field CardView this$0>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #38  <Method void CardView.setBackgroundDrawable(Drawable)>
		//    7   13:return          
		}

		public void setMinWidthHeightInternal(int i, int j)
		{
			if(i > mUserSetMinWidth)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #14  <Field CardView this$0>
		//*   3    5:getfield        #44  <Field int CardView.mUserSetMinWidth>
		//*   4    8:icmple          19
				setMinimumWidth(i);
		//    5   11:aload_0         
		//    6   12:getfield        #14  <Field CardView this$0>
		//    7   15:iload_1         
		//    8   16:invokestatic    #48  <Method void CardView.access$101(CardView, int)>
			if(j > mUserSetMinHeight)
		//*   9   19:iload_2         
		//*  10   20:aload_0         
		//*  11   21:getfield        #14  <Field CardView this$0>
		//*  12   24:getfield        #51  <Field int CardView.mUserSetMinHeight>
		//*  13   27:icmple          38
				setMinimumHeight(j);
		//   14   30:aload_0         
		//   15   31:getfield        #14  <Field CardView this$0>
		//   16   34:iload_2         
		//   17   35:invokestatic    #54  <Method void CardView.access$201(CardView, int)>
		//   18   38:return          
		}

		public void setShadowPadding(int i, int j, int k, int l)
		{
			mShadowBounds.set(i, j, k, l);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CardView this$0>
		//    2    4:getfield        #60  <Field Rect CardView.mShadowBounds>
		//    3    7:iload_1         
		//    4    8:iload_2         
		//    5    9:iload_3         
		//    6   10:iload           4
		//    7   12:invokevirtual   #65  <Method void Rect.set(int, int, int, int)>
			CardView cardview = CardView.this;
		//    8   15:aload_0         
		//    9   16:getfield        #14  <Field CardView this$0>
		//   10   19:astore          5
			((FrameLayout) (cardview)).setPadding(i + cardview.mContentPadding.left, j + mContentPadding.top, k + mContentPadding.right, l + mContentPadding.bottom);
		//   11   21:aload           5
		//   12   23:iload_1         
		//   13   24:aload           5
		//   14   26:getfield        #68  <Field Rect CardView.mContentPadding>
		//   15   29:getfield        #71  <Field int Rect.left>
		//   16   32:iadd            
		//   17   33:iload_2         
		//   18   34:aload_0         
		//   19   35:getfield        #14  <Field CardView this$0>
		//   20   38:getfield        #68  <Field Rect CardView.mContentPadding>
		//   21   41:getfield        #74  <Field int Rect.top>
		//   22   44:iadd            
		//   23   45:iload_3         
		//   24   46:aload_0         
		//   25   47:getfield        #14  <Field CardView this$0>
		//   26   50:getfield        #68  <Field Rect CardView.mContentPadding>
		//   27   53:getfield        #77  <Field int Rect.right>
		//   28   56:iadd            
		//   29   57:iload           4
		//   30   59:aload_0         
		//   31   60:getfield        #14  <Field CardView this$0>
		//   32   63:getfield        #68  <Field Rect CardView.mContentPadding>
		//   33   66:getfield        #80  <Field int Rect.bottom>
		//   34   69:iadd            
		//   35   70:invokestatic    #84  <Method void CardView.access$001(CardView, int, int, int, int)>
		//   36   73:return          
		}

		private Drawable mCardBackground;
		final CardView this$0;

		_cls1()
		{
			this$0 = CardView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field CardView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}
	}

}
