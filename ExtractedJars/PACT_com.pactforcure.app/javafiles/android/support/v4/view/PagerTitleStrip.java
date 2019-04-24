// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.*;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.TextViewCompat;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

// Referenced classes of package android.support.v4.view:
//			ViewPager, PagerAdapter

public class PagerTitleStrip extends ViewGroup
{
	private class PageListener extends DataSetObserver
		implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener
	{

		public void onAdapterChanged(ViewPager viewpager, PagerAdapter pageradapter, PagerAdapter pageradapter1)
		{
			updateAdapter(pageradapter, pageradapter1);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field PagerTitleStrip this$0>
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:invokevirtual   #29  <Method void PagerTitleStrip.updateAdapter(PagerAdapter, PagerAdapter)>
		//    5    9:return          
		}

		public void onChanged()
		{
			float f = 0.0F;
		//    0    0:fconst_0        
		//    1    1:fstore_1        
			updateText(mPager.getCurrentItem(), mPager.getAdapter());
		//    2    2:aload_0         
		//    3    3:getfield        #19  <Field PagerTitleStrip this$0>
		//    4    6:aload_0         
		//    5    7:getfield        #19  <Field PagerTitleStrip this$0>
		//    6   10:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//    7   13:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//    8   16:aload_0         
		//    9   17:getfield        #19  <Field PagerTitleStrip this$0>
		//   10   20:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   11   23:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
		//   12   26:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
			if(mLastKnownPositionOffset >= 0.0F)
		//*  13   29:aload_0         
		//*  14   30:getfield        #19  <Field PagerTitleStrip this$0>
		//*  15   33:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//*  16   36:fconst_0        
		//*  17   37:fcmpl           
		//*  18   38:iflt            49
				f = mLastKnownPositionOffset;
		//   19   41:aload_0         
		//   20   42:getfield        #19  <Field PagerTitleStrip this$0>
		//   21   45:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//   22   48:fstore_1        
			updateTextPositions(mPager.getCurrentItem(), f, true);
		//   23   49:aload_0         
		//   24   50:getfield        #19  <Field PagerTitleStrip this$0>
		//   25   53:aload_0         
		//   26   54:getfield        #19  <Field PagerTitleStrip this$0>
		//   27   57:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   28   60:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//   29   63:fload_1         
		//   30   64:iconst_1        
		//   31   65:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
		//   32   68:return          
		}

		public void onPageScrollStateChanged(int i)
		{
			mScrollState = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #60  <Field int mScrollState>
		//    3    5:return          
		}

		public void onPageScrolled(int i, float f, int j)
		{
			j = i;
		//    0    0:iload_1         
		//    1    1:istore_3        
			if(f > 0.5F)
		//*   2    2:fload_2         
		//*   3    3:ldc1            #63  <Float 0.5F>
		//*   4    5:fcmpl           
		//*   5    6:ifle            13
				j = i + 1;
		//    6    9:iload_1         
		//    7   10:iconst_1        
		//    8   11:iadd            
		//    9   12:istore_3        
			updateTextPositions(j, f, false);
		//   10   13:aload_0         
		//   11   14:getfield        #19  <Field PagerTitleStrip this$0>
		//   12   17:iload_3         
		//   13   18:fload_2         
		//   14   19:iconst_0        
		//   15   20:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
		//   16   23:return          
		}

		public void onPageSelected(int i)
		{
			float f = 0.0F;
		//    0    0:fconst_0        
		//    1    1:fstore_2        
			if(mScrollState == 0)
		//*   2    2:aload_0         
		//*   3    3:getfield        #60  <Field int mScrollState>
		//*   4    6:ifne            75
			{
				updateText(mPager.getCurrentItem(), mPager.getAdapter());
		//    5    9:aload_0         
		//    6   10:getfield        #19  <Field PagerTitleStrip this$0>
		//    7   13:aload_0         
		//    8   14:getfield        #19  <Field PagerTitleStrip this$0>
		//    9   17:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   10   20:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//   11   23:aload_0         
		//   12   24:getfield        #19  <Field PagerTitleStrip this$0>
		//   13   27:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   14   30:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
		//   15   33:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
				if(mLastKnownPositionOffset >= 0.0F)
		//*  16   36:aload_0         
		//*  17   37:getfield        #19  <Field PagerTitleStrip this$0>
		//*  18   40:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//*  19   43:fconst_0        
		//*  20   44:fcmpl           
		//*  21   45:iflt            56
					f = mLastKnownPositionOffset;
		//   22   48:aload_0         
		//   23   49:getfield        #19  <Field PagerTitleStrip this$0>
		//   24   52:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//   25   55:fstore_2        
				updateTextPositions(mPager.getCurrentItem(), f, true);
		//   26   56:aload_0         
		//   27   57:getfield        #19  <Field PagerTitleStrip this$0>
		//   28   60:aload_0         
		//   29   61:getfield        #19  <Field PagerTitleStrip this$0>
		//   30   64:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   31   67:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//   32   70:fload_2         
		//   33   71:iconst_1        
		//   34   72:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
			}
		//   35   75:return          
		}

		private int mScrollState;
		final PagerTitleStrip this$0;

		PageListener()
		{
			this$0 = PagerTitleStrip.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field PagerTitleStrip this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}

	private static class SingleLineAllCapsTransform extends SingleLineTransformationMethod
	{

		public CharSequence getTransformation(CharSequence charsequence, View view)
		{
			charsequence = super.getTransformation(charsequence, view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #38  <Method CharSequence SingleLineTransformationMethod.getTransformation(CharSequence, View)>
		//    4    6:astore_1        
			if(charsequence != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          25
				return ((CharSequence) (charsequence.toString().toUpperCase(mLocale)));
		//    7   11:aload_1         
		//    8   12:invokeinterface #44  <Method String CharSequence.toString()>
		//    9   17:aload_0         
		//   10   18:getfield        #33  <Field Locale mLocale>
		//   11   21:invokevirtual   #50  <Method String String.toUpperCase(Locale)>
		//   12   24:areturn         
			else
				return null;
		//   13   25:aconst_null     
		//   14   26:areturn         
		}

		private Locale mLocale;

		SingleLineAllCapsTransform(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void SingleLineTransformationMethod()>
			mLocale = context.getResources().getConfiguration().locale;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #20  <Method Resources Context.getResources()>
		//    5    9:invokevirtual   #26  <Method Configuration Resources.getConfiguration()>
		//    6   12:getfield        #31  <Field Locale Configuration.locale>
		//    7   15:putfield        #33  <Field Locale mLocale>
		//    8   18:return          
		}
	}


	public PagerTitleStrip(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #57  <Method void PagerTitleStrip(Context, AttributeSet)>
	//    4    6:return          
	}

	public PagerTitleStrip(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #58  <Method void ViewGroup(Context, AttributeSet)>
		mLastKnownCurrentPage = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #60  <Field int mLastKnownCurrentPage>
		mLastKnownPositionOffset = -1F;
	//    7   11:aload_0         
	//    8   12:ldc1            #61  <Float -1F>
	//    9   14:putfield        #63  <Field float mLastKnownPositionOffset>
		mPageListener = new PageListener();
	//   10   17:aload_0         
	//   11   18:new             #6   <Class PagerTitleStrip$PageListener>
	//   12   21:dup             
	//   13   22:aload_0         
	//   14   23:invokespecial   #66  <Method void PagerTitleStrip$PageListener(PagerTitleStrip)>
	//   15   26:putfield        #68  <Field PagerTitleStrip$PageListener mPageListener>
		TextView textview = new TextView(context);
	//   16   29:new             #70  <Class TextView>
	//   17   32:dup             
	//   18   33:aload_1         
	//   19   34:invokespecial   #72  <Method void TextView(Context)>
	//   20   37:astore          6
		mPrevText = textview;
	//   21   39:aload_0         
	//   22   40:aload           6
	//   23   42:putfield        #74  <Field TextView mPrevText>
		addView(((View) (textview)));
	//   24   45:aload_0         
	//   25   46:aload           6
	//   26   48:invokevirtual   #78  <Method void addView(View)>
		textview = new TextView(context);
	//   27   51:new             #70  <Class TextView>
	//   28   54:dup             
	//   29   55:aload_1         
	//   30   56:invokespecial   #72  <Method void TextView(Context)>
	//   31   59:astore          6
		mCurrText = textview;
	//   32   61:aload_0         
	//   33   62:aload           6
	//   34   64:putfield        #80  <Field TextView mCurrText>
		addView(((View) (textview)));
	//   35   67:aload_0         
	//   36   68:aload           6
	//   37   70:invokevirtual   #78  <Method void addView(View)>
		textview = new TextView(context);
	//   38   73:new             #70  <Class TextView>
	//   39   76:dup             
	//   40   77:aload_1         
	//   41   78:invokespecial   #72  <Method void TextView(Context)>
	//   42   81:astore          6
		mNextText = textview;
	//   43   83:aload_0         
	//   44   84:aload           6
	//   45   86:putfield        #82  <Field TextView mNextText>
		addView(((View) (textview)));
	//   46   89:aload_0         
	//   47   90:aload           6
	//   48   92:invokevirtual   #78  <Method void addView(View)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, ATTRS)));
	//   49   95:aload_1         
	//   50   96:aload_2         
	//   51   97:getstatic       #48  <Field int[] ATTRS>
	//   52  100:invokevirtual   #88  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   53  103:astore_2        
		int i = ((TypedArray) (attributeset)).getResourceId(0, 0);
	//   54  104:aload_2         
	//   55  105:iconst_0        
	//   56  106:iconst_0        
	//   57  107:invokevirtual   #94  <Method int TypedArray.getResourceId(int, int)>
	//   58  110:istore_3        
		if(i != 0)
	//*  59  111:iload_3         
	//*  60  112:ifeq            139
		{
			TextViewCompat.setTextAppearance(mPrevText, i);
	//   61  115:aload_0         
	//   62  116:getfield        #74  <Field TextView mPrevText>
	//   63  119:iload_3         
	//   64  120:invokestatic    #100 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			TextViewCompat.setTextAppearance(mCurrText, i);
	//   65  123:aload_0         
	//   66  124:getfield        #80  <Field TextView mCurrText>
	//   67  127:iload_3         
	//   68  128:invokestatic    #100 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			TextViewCompat.setTextAppearance(mNextText, i);
	//   69  131:aload_0         
	//   70  132:getfield        #82  <Field TextView mNextText>
	//   71  135:iload_3         
	//   72  136:invokestatic    #100 <Method void TextViewCompat.setTextAppearance(TextView, int)>
		}
		int j = ((TypedArray) (attributeset)).getDimensionPixelSize(1, 0);
	//   73  139:aload_2         
	//   74  140:iconst_1        
	//   75  141:iconst_0        
	//   76  142:invokevirtual   #103 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   77  145:istore          4
		if(j != 0)
	//*  78  147:iload           4
	//*  79  149:ifeq            160
			setTextSize(0, j);
	//   80  152:aload_0         
	//   81  153:iconst_0        
	//   82  154:iload           4
	//   83  156:i2f             
	//   84  157:invokevirtual   #107 <Method void setTextSize(int, float)>
		if(((TypedArray) (attributeset)).hasValue(2))
	//*  85  160:aload_2         
	//*  86  161:iconst_2        
	//*  87  162:invokevirtual   #111 <Method boolean TypedArray.hasValue(int)>
	//*  88  165:ifeq            203
		{
			int k = ((TypedArray) (attributeset)).getColor(2, 0);
	//   89  168:aload_2         
	//   90  169:iconst_2        
	//   91  170:iconst_0        
	//   92  171:invokevirtual   #114 <Method int TypedArray.getColor(int, int)>
	//   93  174:istore          4
			mPrevText.setTextColor(k);
	//   94  176:aload_0         
	//   95  177:getfield        #74  <Field TextView mPrevText>
	//   96  180:iload           4
	//   97  182:invokevirtual   #118 <Method void TextView.setTextColor(int)>
			mCurrText.setTextColor(k);
	//   98  185:aload_0         
	//   99  186:getfield        #80  <Field TextView mCurrText>
	//  100  189:iload           4
	//  101  191:invokevirtual   #118 <Method void TextView.setTextColor(int)>
			mNextText.setTextColor(k);
	//  102  194:aload_0         
	//  103  195:getfield        #82  <Field TextView mNextText>
	//  104  198:iload           4
	//  105  200:invokevirtual   #118 <Method void TextView.setTextColor(int)>
		}
		mGravity = ((TypedArray) (attributeset)).getInteger(3, 80);
	//  106  203:aload_0         
	//  107  204:aload_2         
	//  108  205:iconst_3        
	//  109  206:bipush          80
	//  110  208:invokevirtual   #121 <Method int TypedArray.getInteger(int, int)>
	//  111  211:putfield        #123 <Field int mGravity>
		((TypedArray) (attributeset)).recycle();
	//  112  214:aload_2         
	//  113  215:invokevirtual   #126 <Method void TypedArray.recycle()>
		mTextColor = mCurrText.getTextColors().getDefaultColor();
	//  114  218:aload_0         
	//  115  219:aload_0         
	//  116  220:getfield        #80  <Field TextView mCurrText>
	//  117  223:invokevirtual   #130 <Method ColorStateList TextView.getTextColors()>
	//  118  226:invokevirtual   #136 <Method int ColorStateList.getDefaultColor()>
	//  119  229:putfield        #138 <Field int mTextColor>
		setNonPrimaryAlpha(0.6F);
	//  120  232:aload_0         
	//  121  233:ldc1            #16  <Float 0.6F>
	//  122  235:invokevirtual   #142 <Method void setNonPrimaryAlpha(float)>
		mPrevText.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  123  238:aload_0         
	//  124  239:getfield        #74  <Field TextView mPrevText>
	//  125  242:getstatic       #148 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  126  245:invokevirtual   #152 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		mCurrText.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  127  248:aload_0         
	//  128  249:getfield        #80  <Field TextView mCurrText>
	//  129  252:getstatic       #148 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  130  255:invokevirtual   #152 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		mNextText.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  131  258:aload_0         
	//  132  259:getfield        #82  <Field TextView mNextText>
	//  133  262:getstatic       #148 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  134  265:invokevirtual   #152 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		boolean flag = false;
	//  135  268:iconst_0        
	//  136  269:istore          5
		if(i != 0)
	//* 137  271:iload_3         
	//* 138  272:ifeq            296
		{
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(i, TEXT_ATTRS)));
	//  139  275:aload_1         
	//  140  276:iload_3         
	//  141  277:getstatic       #51  <Field int[] TEXT_ATTRS>
	//  142  280:invokevirtual   #155 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//  143  283:astore_2        
			flag = ((TypedArray) (attributeset)).getBoolean(0, false);
	//  144  284:aload_2         
	//  145  285:iconst_0        
	//  146  286:iconst_0        
	//  147  287:invokevirtual   #159 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  148  290:istore          5
			((TypedArray) (attributeset)).recycle();
	//  149  292:aload_2         
	//  150  293:invokevirtual   #126 <Method void TypedArray.recycle()>
		}
		if(flag)
	//* 151  296:iload           5
	//* 152  298:ifeq            341
		{
			setSingleLineAllCaps(mPrevText);
	//  153  301:aload_0         
	//  154  302:getfield        #74  <Field TextView mPrevText>
	//  155  305:invokestatic    #163 <Method void setSingleLineAllCaps(TextView)>
			setSingleLineAllCaps(mCurrText);
	//  156  308:aload_0         
	//  157  309:getfield        #80  <Field TextView mCurrText>
	//  158  312:invokestatic    #163 <Method void setSingleLineAllCaps(TextView)>
			setSingleLineAllCaps(mNextText);
	//  159  315:aload_0         
	//  160  316:getfield        #82  <Field TextView mNextText>
	//  161  319:invokestatic    #163 <Method void setSingleLineAllCaps(TextView)>
		} else
	//* 162  322:aload_0         
	//* 163  323:ldc1            #164 <Float 16F>
	//* 164  325:aload_1         
	//* 165  326:invokevirtual   #168 <Method Resources Context.getResources()>
	//* 166  329:invokevirtual   #174 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//* 167  332:getfield        #179 <Field float DisplayMetrics.density>
	//* 168  335:fmul            
	//* 169  336:f2i             
	//* 170  337:putfield        #181 <Field int mScaledTextSpacing>
	//* 171  340:return          
		{
			mPrevText.setSingleLine();
	//  172  341:aload_0         
	//  173  342:getfield        #74  <Field TextView mPrevText>
	//  174  345:invokevirtual   #184 <Method void TextView.setSingleLine()>
			mCurrText.setSingleLine();
	//  175  348:aload_0         
	//  176  349:getfield        #80  <Field TextView mCurrText>
	//  177  352:invokevirtual   #184 <Method void TextView.setSingleLine()>
			mNextText.setSingleLine();
	//  178  355:aload_0         
	//  179  356:getfield        #82  <Field TextView mNextText>
	//  180  359:invokevirtual   #184 <Method void TextView.setSingleLine()>
		}
		mScaledTextSpacing = (int)(16F * context.getResources().getDisplayMetrics().density);
	//* 181  362:goto            322
	}

	private static void setSingleLineAllCaps(TextView textview)
	{
		textview.setTransformationMethod(((android.text.method.TransformationMethod) (new SingleLineAllCapsTransform(textview.getContext()))));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class PagerTitleStrip$SingleLineAllCapsTransform>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #188 <Method Context TextView.getContext()>
	//    5    9:invokespecial   #189 <Method void PagerTitleStrip$SingleLineAllCapsTransform(Context)>
	//    6   12:invokevirtual   #193 <Method void TextView.setTransformationMethod(android.text.method.TransformationMethod)>
	//    7   15:return          
	}

	int getMinHeight()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		Drawable drawable = getBackground();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #198 <Method Drawable getBackground()>
	//    4    6:astore_2        
		if(drawable != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          16
			i = drawable.getIntrinsicHeight();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #203 <Method int Drawable.getIntrinsicHeight()>
	//    9   15:istore_1        
		return i;
	//   10   16:iload_1         
	//   11   17:ireturn         
	}

	public int getTextSpacing()
	{
		return mScaledTextSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field int mScaledTextSpacing>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method void ViewGroup.onAttachedToWindow()>
		Object obj = ((Object) (getParent()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #211 <Method android.view.ViewParent getParent()>
	//    4    8:astore_1        
		if(!(obj instanceof ViewPager))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #213 <Class ViewPager>
	//*   7   13:ifne            26
			throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
	//    8   16:new             #215 <Class IllegalStateException>
	//    9   19:dup             
	//   10   20:ldc1            #217 <String "PagerTitleStrip must be a direct child of a ViewPager.">
	//   11   22:invokespecial   #220 <Method void IllegalStateException(String)>
	//   12   25:athrow          
		obj = ((Object) ((ViewPager)obj));
	//   13   26:aload_1         
	//   14   27:checkcast       #213 <Class ViewPager>
	//   15   30:astore_1        
		PagerAdapter pageradapter = ((ViewPager) (obj)).getAdapter();
	//   16   31:aload_1         
	//   17   32:invokevirtual   #224 <Method PagerAdapter ViewPager.getAdapter()>
	//   18   35:astore_2        
		((ViewPager) (obj)).setInternalPageChangeListener(((ViewPager.OnPageChangeListener) (mPageListener)));
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:getfield        #68  <Field PagerTitleStrip$PageListener mPageListener>
	//   22   41:invokevirtual   #228 <Method ViewPager$OnPageChangeListener ViewPager.setInternalPageChangeListener(ViewPager$OnPageChangeListener)>
	//   23   44:pop             
		((ViewPager) (obj)).addOnAdapterChangeListener(((ViewPager.OnAdapterChangeListener) (mPageListener)));
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:getfield        #68  <Field PagerTitleStrip$PageListener mPageListener>
	//   27   50:invokevirtual   #232 <Method void ViewPager.addOnAdapterChangeListener(ViewPager$OnAdapterChangeListener)>
		mPager = ((ViewPager) (obj));
	//   28   53:aload_0         
	//   29   54:aload_1         
	//   30   55:putfield        #234 <Field ViewPager mPager>
		if(mWatchingAdapter != null)
	//*  31   58:aload_0         
	//*  32   59:getfield        #236 <Field WeakReference mWatchingAdapter>
	//*  33   62:ifnull          83
			obj = ((Object) ((PagerAdapter)mWatchingAdapter.get()));
	//   34   65:aload_0         
	//   35   66:getfield        #236 <Field WeakReference mWatchingAdapter>
	//   36   69:invokevirtual   #242 <Method Object WeakReference.get()>
	//   37   72:checkcast       #244 <Class PagerAdapter>
	//   38   75:astore_1        
		else
	//*  39   76:aload_0         
	//*  40   77:aload_1         
	//*  41   78:aload_2         
	//*  42   79:invokevirtual   #248 <Method void updateAdapter(PagerAdapter, PagerAdapter)>
	//*  43   82:return          
			obj = null;
	//   44   83:aconst_null     
	//   45   84:astore_1        
		updateAdapter(((PagerAdapter) (obj)), pageradapter);
	//*  46   85:goto            76
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #251 <Method void ViewGroup.onDetachedFromWindow()>
		if(mPager != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #234 <Field ViewPager mPager>
	//*   4    8:ifnull          48
		{
			updateAdapter(mPager.getAdapter(), ((PagerAdapter) (null)));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #234 <Field ViewPager mPager>
	//    8   16:invokevirtual   #224 <Method PagerAdapter ViewPager.getAdapter()>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #248 <Method void updateAdapter(PagerAdapter, PagerAdapter)>
			mPager.setInternalPageChangeListener(((ViewPager.OnPageChangeListener) (null)));
	//   11   23:aload_0         
	//   12   24:getfield        #234 <Field ViewPager mPager>
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #228 <Method ViewPager$OnPageChangeListener ViewPager.setInternalPageChangeListener(ViewPager$OnPageChangeListener)>
	//   15   31:pop             
			mPager.removeOnAdapterChangeListener(((ViewPager.OnAdapterChangeListener) (mPageListener)));
	//   16   32:aload_0         
	//   17   33:getfield        #234 <Field ViewPager mPager>
	//   18   36:aload_0         
	//   19   37:getfield        #68  <Field PagerTitleStrip$PageListener mPageListener>
	//   20   40:invokevirtual   #254 <Method void ViewPager.removeOnAdapterChangeListener(ViewPager$OnAdapterChangeListener)>
			mPager = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #234 <Field ViewPager mPager>
		}
	//   24   48:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          6
		if(mPager != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #234 <Field ViewPager mPager>
	//*   4    7:ifnull          36
		{
			if(mLastKnownPositionOffset >= 0.0F)
	//*   5   10:aload_0         
	//*   6   11:getfield        #63  <Field float mLastKnownPositionOffset>
	//*   7   14:fconst_0        
	//*   8   15:fcmpl           
	//*   9   16:iflt            25
				f = mLastKnownPositionOffset;
	//   10   19:aload_0         
	//   11   20:getfield        #63  <Field float mLastKnownPositionOffset>
	//   12   23:fstore          6
			updateTextPositions(mLastKnownCurrentPage, f, true);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field int mLastKnownCurrentPage>
	//   16   30:fload           6
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #260 <Method void updateTextPositions(int, float, boolean)>
		}
	//   19   36:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(android.view.View.MeasureSpec.getMode(i) != 0x40000000)
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #268 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   2    4:ldc2            #269 <Int 0x40000000>
	//*   3    7:icmpeq          21
			throw new IllegalStateException("Must measure with an exact width");
	//    4   10:new             #215 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc2            #271 <String "Must measure with an exact width">
	//    7   17:invokespecial   #220 <Method void IllegalStateException(String)>
	//    8   20:athrow          
		int l = getPaddingTop() + getPaddingBottom();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #274 <Method int getPaddingTop()>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #277 <Method int getPaddingBottom()>
	//   13   29:iadd            
	//   14   30:istore          4
		int i1 = getChildMeasureSpec(j, l, -2);
	//   15   32:iload_2         
	//   16   33:iload           4
	//   17   35:bipush          -2
	//   18   37:invokestatic    #281 <Method int getChildMeasureSpec(int, int, int)>
	//   19   40:istore          5
		int k = android.view.View.MeasureSpec.getSize(i);
	//   20   42:iload_1         
	//   21   43:invokestatic    #284 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   22   46:istore_3        
		i = getChildMeasureSpec(i, (int)((float)k * 0.2F), -2);
	//   23   47:iload_1         
	//   24   48:iload_3         
	//   25   49:i2f             
	//   26   50:ldc2            #285 <Float 0.2F>
	//   27   53:fmul            
	//   28   54:f2i             
	//   29   55:bipush          -2
	//   30   57:invokestatic    #281 <Method int getChildMeasureSpec(int, int, int)>
	//   31   60:istore_1        
		mPrevText.measure(i, i1);
	//   32   61:aload_0         
	//   33   62:getfield        #74  <Field TextView mPrevText>
	//   34   65:iload_1         
	//   35   66:iload           5
	//   36   68:invokevirtual   #288 <Method void TextView.measure(int, int)>
		mCurrText.measure(i, i1);
	//   37   71:aload_0         
	//   38   72:getfield        #80  <Field TextView mCurrText>
	//   39   75:iload_1         
	//   40   76:iload           5
	//   41   78:invokevirtual   #288 <Method void TextView.measure(int, int)>
		mNextText.measure(i, i1);
	//   42   81:aload_0         
	//   43   82:getfield        #82  <Field TextView mNextText>
	//   44   85:iload_1         
	//   45   86:iload           5
	//   46   88:invokevirtual   #288 <Method void TextView.measure(int, int)>
		if(android.view.View.MeasureSpec.getMode(j) == 0x40000000)
	//*  47   91:iload_2         
	//*  48   92:invokestatic    #268 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  49   95:ldc2            #269 <Int 0x40000000>
	//*  50   98:icmpne          127
		{
			i = android.view.View.MeasureSpec.getSize(j);
	//   51  101:iload_2         
	//   52  102:invokestatic    #284 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   53  105:istore_1        
		} else
	//*  54  106:aload_0         
	//*  55  107:iload_3         
	//*  56  108:iload_1         
	//*  57  109:iload_2         
	//*  58  110:aload_0         
	//*  59  111:getfield        #80  <Field TextView mCurrText>
	//*  60  114:invokevirtual   #291 <Method int TextView.getMeasuredState()>
	//*  61  117:bipush          16
	//*  62  119:ishl            
	//*  63  120:invokestatic    #296 <Method int View.resolveSizeAndState(int, int, int)>
	//*  64  123:invokevirtual   #299 <Method void setMeasuredDimension(int, int)>
	//*  65  126:return          
		{
			i = mCurrText.getMeasuredHeight();
	//   66  127:aload_0         
	//   67  128:getfield        #80  <Field TextView mCurrText>
	//   68  131:invokevirtual   #302 <Method int TextView.getMeasuredHeight()>
	//   69  134:istore_1        
			i = Math.max(getMinHeight(), i + l);
	//   70  135:aload_0         
	//   71  136:invokevirtual   #304 <Method int getMinHeight()>
	//   72  139:iload_1         
	//   73  140:iload           4
	//   74  142:iadd            
	//   75  143:invokestatic    #309 <Method int Math.max(int, int)>
	//   76  146:istore_1        
		}
		setMeasuredDimension(k, View.resolveSizeAndState(i, j, mCurrText.getMeasuredState() << 16));
	//*  77  147:goto            106
	}

	public void requestLayout()
	{
		if(!mUpdatingText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #312 <Field boolean mUpdatingText>
	//*   2    4:ifne            11
			super.requestLayout();
	//    3    7:aload_0         
	//    4    8:invokespecial   #314 <Method void ViewGroup.requestLayout()>
	//    5   11:return          
	}

	public void setGravity(int i)
	{
		mGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field int mGravity>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #316 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setNonPrimaryAlpha(float f)
	{
		mNonPrimaryAlpha = (int)(255F * f) & 0xff;
	//    0    0:aload_0         
	//    1    1:ldc2            #324 <Float 255F>
	//    2    4:fload_1         
	//    3    5:fmul            
	//    4    6:f2i             
	//    5    7:sipush          255
	//    6   10:iand            
	//    7   11:putfield        #326 <Field int mNonPrimaryAlpha>
		int i = mNonPrimaryAlpha << 24 | mTextColor & 0xffffff;
	//    8   14:aload_0         
	//    9   15:getfield        #326 <Field int mNonPrimaryAlpha>
	//   10   18:bipush          24
	//   11   20:ishl            
	//   12   21:aload_0         
	//   13   22:getfield        #138 <Field int mTextColor>
	//   14   25:ldc2            #327 <Int 0xffffff>
	//   15   28:iand            
	//   16   29:ior             
	//   17   30:istore_2        
		mPrevText.setTextColor(i);
	//   18   31:aload_0         
	//   19   32:getfield        #74  <Field TextView mPrevText>
	//   20   35:iload_2         
	//   21   36:invokevirtual   #118 <Method void TextView.setTextColor(int)>
		mNextText.setTextColor(i);
	//   22   39:aload_0         
	//   23   40:getfield        #82  <Field TextView mNextText>
	//   24   43:iload_2         
	//   25   44:invokevirtual   #118 <Method void TextView.setTextColor(int)>
	//   26   47:return          
	}

	public void setTextColor(int i)
	{
		mTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #138 <Field int mTextColor>
		mCurrText.setTextColor(i);
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field TextView mCurrText>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #118 <Method void TextView.setTextColor(int)>
		i = mNonPrimaryAlpha << 24 | mTextColor & 0xffffff;
	//    7   13:aload_0         
	//    8   14:getfield        #326 <Field int mNonPrimaryAlpha>
	//    9   17:bipush          24
	//   10   19:ishl            
	//   11   20:aload_0         
	//   12   21:getfield        #138 <Field int mTextColor>
	//   13   24:ldc2            #327 <Int 0xffffff>
	//   14   27:iand            
	//   15   28:ior             
	//   16   29:istore_1        
		mPrevText.setTextColor(i);
	//   17   30:aload_0         
	//   18   31:getfield        #74  <Field TextView mPrevText>
	//   19   34:iload_1         
	//   20   35:invokevirtual   #118 <Method void TextView.setTextColor(int)>
		mNextText.setTextColor(i);
	//   21   38:aload_0         
	//   22   39:getfield        #82  <Field TextView mNextText>
	//   23   42:iload_1         
	//   24   43:invokevirtual   #118 <Method void TextView.setTextColor(int)>
	//   25   46:return          
	}

	public void setTextSize(int i, float f)
	{
		mPrevText.setTextSize(i, f);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field TextView mPrevText>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #330 <Method void TextView.setTextSize(int, float)>
		mCurrText.setTextSize(i, f);
	//    5    9:aload_0         
	//    6   10:getfield        #80  <Field TextView mCurrText>
	//    7   13:iload_1         
	//    8   14:fload_2         
	//    9   15:invokevirtual   #330 <Method void TextView.setTextSize(int, float)>
		mNextText.setTextSize(i, f);
	//   10   18:aload_0         
	//   11   19:getfield        #82  <Field TextView mNextText>
	//   12   22:iload_1         
	//   13   23:fload_2         
	//   14   24:invokevirtual   #330 <Method void TextView.setTextSize(int, float)>
	//   15   27:return          
	}

	public void setTextSpacing(int i)
	{
		mScaledTextSpacing = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #181 <Field int mScaledTextSpacing>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #316 <Method void requestLayout()>
	//    5    9:return          
	}

	void updateAdapter(PagerAdapter pageradapter, PagerAdapter pageradapter1)
	{
		if(pageradapter != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
		{
			pageradapter.unregisterDataSetObserver(((DataSetObserver) (mPageListener)));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field PagerTitleStrip$PageListener mPageListener>
	//    5    9:invokevirtual   #335 <Method void PagerAdapter.unregisterDataSetObserver(DataSetObserver)>
			mWatchingAdapter = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #236 <Field WeakReference mWatchingAdapter>
		}
		if(pageradapter1 != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          41
		{
			pageradapter1.registerDataSetObserver(((DataSetObserver) (mPageListener)));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:getfield        #68  <Field PagerTitleStrip$PageListener mPageListener>
	//   14   26:invokevirtual   #338 <Method void PagerAdapter.registerDataSetObserver(DataSetObserver)>
			mWatchingAdapter = new WeakReference(((Object) (pageradapter1)));
	//   15   29:aload_0         
	//   16   30:new             #238 <Class WeakReference>
	//   17   33:dup             
	//   18   34:aload_2         
	//   19   35:invokespecial   #341 <Method void WeakReference(Object)>
	//   20   38:putfield        #236 <Field WeakReference mWatchingAdapter>
		}
		if(mPager != null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #234 <Field ViewPager mPager>
	//*  23   45:ifnull          75
		{
			mLastKnownCurrentPage = -1;
	//   24   48:aload_0         
	//   25   49:iconst_m1       
	//   26   50:putfield        #60  <Field int mLastKnownCurrentPage>
			mLastKnownPositionOffset = -1F;
	//   27   53:aload_0         
	//   28   54:ldc1            #61  <Float -1F>
	//   29   56:putfield        #63  <Field float mLastKnownPositionOffset>
			updateText(mPager.getCurrentItem(), pageradapter1);
	//   30   59:aload_0         
	//   31   60:aload_0         
	//   32   61:getfield        #234 <Field ViewPager mPager>
	//   33   64:invokevirtual   #344 <Method int ViewPager.getCurrentItem()>
	//   34   67:aload_2         
	//   35   68:invokevirtual   #348 <Method void updateText(int, PagerAdapter)>
			requestLayout();
	//   36   71:aload_0         
	//   37   72:invokevirtual   #316 <Method void requestLayout()>
		}
	//   38   75:return          
	}

	void updateText(int i, PagerAdapter pageradapter)
	{
		int j;
		int k;
		CharSequence charsequence;
		TextView textview;
		if(pageradapter != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          236
			j = pageradapter.getCount();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #351 <Method int PagerAdapter.getCount()>
	//    4    8:istore_3        
		else
	//*   5    9:aload_0         
	//*   6   10:iconst_1        
	//*   7   11:putfield        #312 <Field boolean mUpdatingText>
	//*   8   14:aconst_null     
	//*   9   15:astore          6
	//*  10   17:aload           6
	//*  11   19:astore          5
	//*  12   21:iload_1         
	//*  13   22:iconst_1        
	//*  14   23:icmplt          43
	//*  15   26:aload           6
	//*  16   28:astore          5
	//*  17   30:aload_2         
	//*  18   31:ifnull          43
	//*  19   34:aload_2         
	//*  20   35:iload_1         
	//*  21   36:iconst_1        
	//*  22   37:isub            
	//*  23   38:invokevirtual   #355 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//*  24   41:astore          5
	//*  25   43:aload_0         
	//*  26   44:getfield        #74  <Field TextView mPrevText>
	//*  27   47:aload           5
	//*  28   49:invokevirtual   #359 <Method void TextView.setText(CharSequence)>
	//*  29   52:aload_0         
	//*  30   53:getfield        #80  <Field TextView mCurrText>
	//*  31   56:astore          6
	//*  32   58:aload_2         
	//*  33   59:ifnull          241
	//*  34   62:iload_1         
	//*  35   63:iload_3         
	//*  36   64:icmpge          241
	//*  37   67:aload_2         
	//*  38   68:iload_1         
	//*  39   69:invokevirtual   #355 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//*  40   72:astore          5
	//*  41   74:aload           6
	//*  42   76:aload           5
	//*  43   78:invokevirtual   #359 <Method void TextView.setText(CharSequence)>
	//*  44   81:aconst_null     
	//*  45   82:astore          6
	//*  46   84:aload           6
	//*  47   86:astore          5
	//*  48   88:iload_1         
	//*  49   89:iconst_1        
	//*  50   90:iadd            
	//*  51   91:iload_3         
	//*  52   92:icmpge          112
	//*  53   95:aload           6
	//*  54   97:astore          5
	//*  55   99:aload_2         
	//*  56  100:ifnull          112
	//*  57  103:aload_2         
	//*  58  104:iload_1         
	//*  59  105:iconst_1        
	//*  60  106:iadd            
	//*  61  107:invokevirtual   #355 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//*  62  110:astore          5
	//*  63  112:aload_0         
	//*  64  113:getfield        #82  <Field TextView mNextText>
	//*  65  116:aload           5
	//*  66  118:invokevirtual   #359 <Method void TextView.setText(CharSequence)>
	//*  67  121:iconst_0        
	//*  68  122:aload_0         
	//*  69  123:invokevirtual   #362 <Method int getWidth()>
	//*  70  126:aload_0         
	//*  71  127:invokevirtual   #365 <Method int getPaddingLeft()>
	//*  72  130:isub            
	//*  73  131:aload_0         
	//*  74  132:invokevirtual   #368 <Method int getPaddingRight()>
	//*  75  135:isub            
	//*  76  136:i2f             
	//*  77  137:ldc2            #369 <Float 0.8F>
	//*  78  140:fmul            
	//*  79  141:f2i             
	//*  80  142:invokestatic    #309 <Method int Math.max(int, int)>
	//*  81  145:ldc2            #370 <Int 0x80000000>
	//*  82  148:invokestatic    #373 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  83  151:istore_3        
	//*  84  152:iconst_0        
	//*  85  153:aload_0         
	//*  86  154:invokevirtual   #376 <Method int getHeight()>
	//*  87  157:aload_0         
	//*  88  158:invokevirtual   #274 <Method int getPaddingTop()>
	//*  89  161:isub            
	//*  90  162:aload_0         
	//*  91  163:invokevirtual   #277 <Method int getPaddingBottom()>
	//*  92  166:isub            
	//*  93  167:invokestatic    #309 <Method int Math.max(int, int)>
	//*  94  170:ldc2            #370 <Int 0x80000000>
	//*  95  173:invokestatic    #373 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  96  176:istore          4
	//*  97  178:aload_0         
	//*  98  179:getfield        #74  <Field TextView mPrevText>
	//*  99  182:iload_3         
	//* 100  183:iload           4
	//* 101  185:invokevirtual   #288 <Method void TextView.measure(int, int)>
	//* 102  188:aload_0         
	//* 103  189:getfield        #80  <Field TextView mCurrText>
	//* 104  192:iload_3         
	//* 105  193:iload           4
	//* 106  195:invokevirtual   #288 <Method void TextView.measure(int, int)>
	//* 107  198:aload_0         
	//* 108  199:getfield        #82  <Field TextView mNextText>
	//* 109  202:iload_3         
	//* 110  203:iload           4
	//* 111  205:invokevirtual   #288 <Method void TextView.measure(int, int)>
	//* 112  208:aload_0         
	//* 113  209:iload_1         
	//* 114  210:putfield        #60  <Field int mLastKnownCurrentPage>
	//* 115  213:aload_0         
	//* 116  214:getfield        #378 <Field boolean mUpdatingPositions>
	//* 117  217:ifne            230
	//* 118  220:aload_0         
	//* 119  221:iload_1         
	//* 120  222:aload_0         
	//* 121  223:getfield        #63  <Field float mLastKnownPositionOffset>
	//* 122  226:iconst_0        
	//* 123  227:invokevirtual   #260 <Method void updateTextPositions(int, float, boolean)>
	//* 124  230:aload_0         
	//* 125  231:iconst_0        
	//* 126  232:putfield        #312 <Field boolean mUpdatingText>
	//* 127  235:return          
			j = 0;
	//  128  236:iconst_0        
	//  129  237:istore_3        
		mUpdatingText = true;
		textview = null;
		charsequence = ((CharSequence) (textview));
		if(i >= 1)
		{
			charsequence = ((CharSequence) (textview));
			if(pageradapter != null)
				charsequence = pageradapter.getPageTitle(i - 1);
		}
		mPrevText.setText(charsequence);
		textview = mCurrText;
		if(pageradapter != null && i < j)
			charsequence = pageradapter.getPageTitle(i);
		else
	//* 130  238:goto            9
			charsequence = null;
	//  131  241:aconst_null     
	//  132  242:astore          5
		textview.setText(charsequence);
		textview = null;
		charsequence = ((CharSequence) (textview));
		if(i + 1 < j)
		{
			charsequence = ((CharSequence) (textview));
			if(pageradapter != null)
				charsequence = pageradapter.getPageTitle(i + 1);
		}
		mNextText.setText(charsequence);
		j = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((float)(getWidth() - getPaddingLeft() - getPaddingRight()) * 0.8F)), 0x80000000);
		k = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), 0x80000000);
		mPrevText.measure(j, k);
		mCurrText.measure(j, k);
		mNextText.measure(j, k);
		mLastKnownCurrentPage = i;
		if(!mUpdatingPositions)
			updateTextPositions(i, mLastKnownPositionOffset, false);
		mUpdatingText = false;
	//* 133  244:goto            74
	}

	void updateTextPositions(int i, float f, boolean flag)
	{
		int j;
		int k;
		int k2;
		int l2;
		int i3;
		int j3;
		float f1;
		float f2;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k3;
		int l3;
		if(i != mLastKnownCurrentPage)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #60  <Field int mLastKnownCurrentPage>
	//*   3    5:icmpeq          442
			updateText(i, mPager.getAdapter());
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #234 <Field ViewPager mPager>
	//    8   14:invokevirtual   #224 <Method PagerAdapter ViewPager.getAdapter()>
	//    9   17:invokevirtual   #348 <Method void updateText(int, PagerAdapter)>
		else
	//*  10   20:aload_0         
	//*  11   21:iconst_1        
	//*  12   22:putfield        #378 <Field boolean mUpdatingPositions>
	//*  13   25:aload_0         
	//*  14   26:getfield        #74  <Field TextView mPrevText>
	//*  15   29:invokevirtual   #381 <Method int TextView.getMeasuredWidth()>
	//*  16   32:istore          9
	//*  17   34:aload_0         
	//*  18   35:getfield        #80  <Field TextView mCurrText>
	//*  19   38:invokevirtual   #381 <Method int TextView.getMeasuredWidth()>
	//*  20   41:istore          14
	//*  21   43:aload_0         
	//*  22   44:getfield        #82  <Field TextView mNextText>
	//*  23   47:invokevirtual   #381 <Method int TextView.getMeasuredWidth()>
	//*  24   50:istore          8
	//*  25   52:iload           14
	//*  26   54:iconst_2        
	//*  27   55:idiv            
	//*  28   56:istore          13
	//*  29   58:aload_0         
	//*  30   59:invokevirtual   #362 <Method int getWidth()>
	//*  31   62:istore          10
	//*  32   64:aload_0         
	//*  33   65:invokevirtual   #376 <Method int getHeight()>
	//*  34   68:istore          6
	//*  35   70:aload_0         
	//*  36   71:invokevirtual   #365 <Method int getPaddingLeft()>
	//*  37   74:istore          12
	//*  38   76:aload_0         
	//*  39   77:invokevirtual   #368 <Method int getPaddingRight()>
	//*  40   80:istore          11
	//*  41   82:aload_0         
	//*  42   83:invokevirtual   #274 <Method int getPaddingTop()>
	//*  43   86:istore_1        
	//*  44   87:aload_0         
	//*  45   88:invokevirtual   #277 <Method int getPaddingBottom()>
	//*  46   91:istore          7
	//*  47   93:iload           11
	//*  48   95:iload           13
	//*  49   97:iadd            
	//*  50   98:istore          15
	//*  51  100:fload_2         
	//*  52  101:ldc2            #382 <Float 0.5F>
	//*  53  104:fadd            
	//*  54  105:fstore          5
	//*  55  107:fload           5
	//*  56  109:fstore          4
	//*  57  111:fload           5
	//*  58  113:fconst_1        
	//*  59  114:fcmpl           
	//*  60  115:ifle            124
	//*  61  118:fload           5
	//*  62  120:fconst_1        
	//*  63  121:fsub            
	//*  64  122:fstore          4
	//*  65  124:iload           10
	//*  66  126:iload           15
	//*  67  128:isub            
	//*  68  129:iload           10
	//*  69  131:iload           12
	//*  70  133:iload           13
	//*  71  135:iadd            
	//*  72  136:isub            
	//*  73  137:iload           15
	//*  74  139:isub            
	//*  75  140:i2f             
	//*  76  141:fload           4
	//*  77  143:fmul            
	//*  78  144:f2i             
	//*  79  145:isub            
	//*  80  146:iload           14
	//*  81  148:iconst_2        
	//*  82  149:idiv            
	//*  83  150:isub            
	//*  84  151:istore          13
	//*  85  153:iload           13
	//*  86  155:iload           14
	//*  87  157:iadd            
	//*  88  158:istore          14
	//*  89  160:aload_0         
	//*  90  161:getfield        #74  <Field TextView mPrevText>
	//*  91  164:invokevirtual   #385 <Method int TextView.getBaseline()>
	//*  92  167:istore          17
	//*  93  169:aload_0         
	//*  94  170:getfield        #80  <Field TextView mCurrText>
	//*  95  173:invokevirtual   #385 <Method int TextView.getBaseline()>
	//*  96  176:istore          16
	//*  97  178:aload_0         
	//*  98  179:getfield        #82  <Field TextView mNextText>
	//*  99  182:invokevirtual   #385 <Method int TextView.getBaseline()>
	//* 100  185:istore          15
	//* 101  187:iload           17
	//* 102  189:iload           16
	//* 103  191:invokestatic    #309 <Method int Math.max(int, int)>
	//* 104  194:iload           15
	//* 105  196:invokestatic    #309 <Method int Math.max(int, int)>
	//* 106  199:istore          18
	//* 107  201:iload           18
	//* 108  203:iload           17
	//* 109  205:isub            
	//* 110  206:istore          17
	//* 111  208:iload           18
	//* 112  210:iload           16
	//* 113  212:isub            
	//* 114  213:istore          16
	//* 115  215:iload           18
	//* 116  217:iload           15
	//* 117  219:isub            
	//* 118  220:istore          15
	//* 119  222:aload_0         
	//* 120  223:getfield        #74  <Field TextView mPrevText>
	//* 121  226:invokevirtual   #302 <Method int TextView.getMeasuredHeight()>
	//* 122  229:istore          18
	//* 123  231:aload_0         
	//* 124  232:getfield        #80  <Field TextView mCurrText>
	//* 125  235:invokevirtual   #302 <Method int TextView.getMeasuredHeight()>
	//* 126  238:istore          19
	//* 127  240:aload_0         
	//* 128  241:getfield        #82  <Field TextView mNextText>
	//* 129  244:invokevirtual   #302 <Method int TextView.getMeasuredHeight()>
	//* 130  247:istore          20
	//* 131  249:iload           17
	//* 132  251:iload           18
	//* 133  253:iadd            
	//* 134  254:iload           16
	//* 135  256:iload           19
	//* 136  258:iadd            
	//* 137  259:invokestatic    #309 <Method int Math.max(int, int)>
	//* 138  262:iload           15
	//* 139  264:iload           20
	//* 140  266:iadd            
	//* 141  267:invokestatic    #309 <Method int Math.max(int, int)>
	//* 142  270:istore          18
	//* 143  272:aload_0         
	//* 144  273:getfield        #123 <Field int mGravity>
	//* 145  276:bipush          112
	//* 146  278:iand            
	//* 147  279:lookupswitch    2: default 304
	//	               16: 456
	//	               80: 489
	//* 148  304:iload_1         
	//* 149  305:iload           17
	//* 150  307:iadd            
	//* 151  308:istore          7
	//* 152  310:iload_1         
	//* 153  311:iload           16
	//* 154  313:iadd            
	//* 155  314:istore          6
	//* 156  316:iload_1         
	//* 157  317:iload           15
	//* 158  319:iadd            
	//* 159  320:istore_1        
	//* 160  321:aload_0         
	//* 161  322:getfield        #80  <Field TextView mCurrText>
	//* 162  325:iload           13
	//* 163  327:iload           6
	//* 164  329:iload           14
	//* 165  331:aload_0         
	//* 166  332:getfield        #80  <Field TextView mCurrText>
	//* 167  335:invokevirtual   #302 <Method int TextView.getMeasuredHeight()>
	//* 168  338:iload           6
	//* 169  340:iadd            
	//* 170  341:invokevirtual   #389 <Method void TextView.layout(int, int, int, int)>
	//* 171  344:iload           12
	//* 172  346:iload           13
	//* 173  348:aload_0         
	//* 174  349:getfield        #181 <Field int mScaledTextSpacing>
	//* 175  352:isub            
	//* 176  353:iload           9
	//* 177  355:isub            
	//* 178  356:invokestatic    #392 <Method int Math.min(int, int)>
	//* 179  359:istore          6
	//* 180  361:aload_0         
	//* 181  362:getfield        #74  <Field TextView mPrevText>
	//* 182  365:iload           6
	//* 183  367:iload           7
	//* 184  369:iload           6
	//* 185  371:iload           9
	//* 186  373:iadd            
	//* 187  374:aload_0         
	//* 188  375:getfield        #74  <Field TextView mPrevText>
	//* 189  378:invokevirtual   #302 <Method int TextView.getMeasuredHeight()>
	//* 190  381:iload           7
	//* 191  383:iadd            
	//* 192  384:invokevirtual   #389 <Method void TextView.layout(int, int, int, int)>
	//* 193  387:iload           10
	//* 194  389:iload           11
	//* 195  391:isub            
	//* 196  392:iload           8
	//* 197  394:isub            
	//* 198  395:aload_0         
	//* 199  396:getfield        #181 <Field int mScaledTextSpacing>
	//* 200  399:iload           14
	//* 201  401:iadd            
	//* 202  402:invokestatic    #309 <Method int Math.max(int, int)>
	//* 203  405:istore          6
	//* 204  407:aload_0         
	//* 205  408:getfield        #82  <Field TextView mNextText>
	//* 206  411:iload           6
	//* 207  413:iload_1         
	//* 208  414:iload           6
	//* 209  416:iload           8
	//* 210  418:iadd            
	//* 211  419:aload_0         
	//* 212  420:getfield        #82  <Field TextView mNextText>
	//* 213  423:invokevirtual   #302 <Method int TextView.getMeasuredHeight()>
	//* 214  426:iload_1         
	//* 215  427:iadd            
	//* 216  428:invokevirtual   #389 <Method void TextView.layout(int, int, int, int)>
	//* 217  431:aload_0         
	//* 218  432:fload_2         
	//* 219  433:putfield        #63  <Field float mLastKnownPositionOffset>
	//* 220  436:aload_0         
	//* 221  437:iconst_0        
	//* 222  438:putfield        #378 <Field boolean mUpdatingPositions>
	//* 223  441:return          
		if(!flag && f == mLastKnownPositionOffset)
	//* 224  442:iload_3         
	//* 225  443:ifne            20
	//* 226  446:fload_2         
	//* 227  447:aload_0         
	//* 228  448:getfield        #63  <Field float mLastKnownPositionOffset>
	//* 229  451:fcmpl           
	//* 230  452:ifne            20
			return;
	//  231  455:return          
		mUpdatingPositions = true;
		i1 = mPrevText.getMeasuredWidth();
		j2 = mCurrText.getMeasuredWidth();
		l = mNextText.getMeasuredWidth();
		i2 = j2 / 2;
		j1 = getWidth();
		j = getHeight();
		l1 = getPaddingLeft();
		k1 = getPaddingRight();
		i = getPaddingTop();
		k = getPaddingBottom();
		k2 = k1 + i2;
		f2 = f + 0.5F;
		f1 = f2;
		if(f2 > 1.0F)
			f1 = f2 - 1.0F;
		i2 = j1 - k2 - (int)((float)(j1 - (l1 + i2) - k2) * f1) - j2 / 2;
		j2 = i2 + j2;
		i3 = mPrevText.getBaseline();
		l2 = mCurrText.getBaseline();
		k2 = mNextText.getBaseline();
		j3 = Math.max(Math.max(i3, l2), k2);
		i3 = j3 - i3;
		l2 = j3 - l2;
		k2 = j3 - k2;
		j3 = mPrevText.getMeasuredHeight();
		k3 = mCurrText.getMeasuredHeight();
		l3 = mNextText.getMeasuredHeight();
		j3 = Math.max(Math.max(i3 + j3, l2 + k3), k2 + l3);
		mGravity & 0x70;
		JVM INSTR lookupswitch 2: default 304
	//	               16: 456
	//	               80: 489;
		   goto _L1 _L2 _L3
_L1:
		k = i + i3;
		j = i + l2;
		i += k2;
_L5:
		mCurrText.layout(i2, j, j2, mCurrText.getMeasuredHeight() + j);
		j = Math.min(l1, i2 - mScaledTextSpacing - i1);
		mPrevText.layout(j, k, j + i1, mPrevText.getMeasuredHeight() + k);
		j = Math.max(j1 - k1 - l, mScaledTextSpacing + j2);
		mNextText.layout(j, i, j + l, mNextText.getMeasuredHeight() + i);
		mLastKnownPositionOffset = f;
		mUpdatingPositions = false;
		return;
_L2:
		i = (j - i - k - j3) / 2;
	//  232  456:iload           6
	//  233  458:iload_1         
	//  234  459:isub            
	//  235  460:iload           7
	//  236  462:isub            
	//  237  463:iload           18
	//  238  465:isub            
	//  239  466:iconst_2        
	//  240  467:idiv            
	//  241  468:istore_1        
		k = i + i3;
	//  242  469:iload_1         
	//  243  470:iload           17
	//  244  472:iadd            
	//  245  473:istore          7
		j = i + l2;
	//  246  475:iload_1         
	//  247  476:iload           16
	//  248  478:iadd            
	//  249  479:istore          6
		i += k2;
	//  250  481:iload_1         
	//  251  482:iload           15
	//  252  484:iadd            
	//  253  485:istore_1        
		continue; /* Loop/switch isn't completed */
	//  254  486:goto            321
_L3:
		i = j - k - j3;
	//  255  489:iload           6
	//  256  491:iload           7
	//  257  493:isub            
	//  258  494:iload           18
	//  259  496:isub            
	//  260  497:istore_1        
		k = i + i3;
	//  261  498:iload_1         
	//  262  499:iload           17
	//  263  501:iadd            
	//  264  502:istore          7
		j = i + l2;
	//  265  504:iload_1         
	//  266  505:iload           16
	//  267  507:iadd            
	//  268  508:istore          6
		i += k2;
	//  269  510:iload_1         
	//  270  511:iload           15
	//  271  513:iadd            
	//  272  514:istore_1        
		if(true) goto _L5; else goto _L4
	//  273  515:goto            321
_L4:
	}

	private static final int ATTRS[] = {
		0x1010034, 0x1010095, 0x1010098, 0x10100af
	};
	private static final float SIDE_ALPHA = 0.6F;
	private static final int TEXT_ATTRS[] = {
		0x101038c
	};
	private static final int TEXT_SPACING = 16;
	TextView mCurrText;
	private int mGravity;
	private int mLastKnownCurrentPage;
	float mLastKnownPositionOffset;
	TextView mNextText;
	private int mNonPrimaryAlpha;
	private final PageListener mPageListener;
	ViewPager mPager;
	TextView mPrevText;
	private int mScaledTextSpacing;
	int mTextColor;
	private boolean mUpdatingPositions;
	private boolean mUpdatingText;
	private WeakReference mWatchingAdapter;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #43  <Int 0x1010034>
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #44  <Int 0x1010095>
	//    9   12:iastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #45  <Int 0x1010098>
	//   13   17:iastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #46  <Int 0x10100af>
	//   17   22:iastore         
	//   18   23:putstatic       #48  <Field int[] ATTRS>
	//   19   26:iconst_1        
	//   20   27:newarray        int[]
	//   21   29:dup             
	//   22   30:iconst_0        
	//   23   31:ldc1            #49  <Int 0x101038c>
	//   24   33:iastore         
	//   25   34:putstatic       #51  <Field int[] TEXT_ATTRS>
	//*  26   37:return          
	}
}
