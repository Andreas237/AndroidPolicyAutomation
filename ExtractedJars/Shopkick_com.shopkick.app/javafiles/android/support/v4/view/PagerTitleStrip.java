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
			PagerTitleStrip pagertitlestrip = PagerTitleStrip.this;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field PagerTitleStrip this$0>
		//    2    4:astore_3        
			pagertitlestrip.updateText(pagertitlestrip.mPager.getCurrentItem(), mPager.getAdapter());
		//    3    5:aload_3         
		//    4    6:aload_3         
		//    5    7:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//    6   10:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//    7   13:aload_0         
		//    8   14:getfield        #19  <Field PagerTitleStrip this$0>
		//    9   17:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   10   20:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
		//   11   23:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
			float f1 = mLastKnownPositionOffset;
		//   12   26:aload_0         
		//   13   27:getfield        #19  <Field PagerTitleStrip this$0>
		//   14   30:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//   15   33:fstore_2        
			float f = 0.0F;
		//   16   34:fconst_0        
		//   17   35:fstore_1        
			if(f1 >= 0.0F)
		//*  18   36:fload_2         
		//*  19   37:fconst_0        
		//*  20   38:fcmpl           
		//*  21   39:iflt            50
				f = mLastKnownPositionOffset;
		//   22   42:aload_0         
		//   23   43:getfield        #19  <Field PagerTitleStrip this$0>
		//   24   46:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//   25   49:fstore_1        
			pagertitlestrip = PagerTitleStrip.this;
		//   26   50:aload_0         
		//   27   51:getfield        #19  <Field PagerTitleStrip this$0>
		//   28   54:astore_3        
			pagertitlestrip.updateTextPositions(pagertitlestrip.mPager.getCurrentItem(), f, true);
		//   29   55:aload_3         
		//   30   56:aload_3         
		//   31   57:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   32   60:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//   33   63:fload_1         
		//   34   64:iconst_1        
		//   35   65:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
		//   36   68:return          
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
			if(mScrollState == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #60  <Field int mScrollState>
		//*   2    4:ifne            81
			{
				PagerTitleStrip pagertitlestrip = PagerTitleStrip.this;
		//    3    7:aload_0         
		//    4    8:getfield        #19  <Field PagerTitleStrip this$0>
		//    5   11:astore          4
				pagertitlestrip.updateText(pagertitlestrip.mPager.getCurrentItem(), mPager.getAdapter());
		//    6   13:aload           4
		//    7   15:aload           4
		//    8   17:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//    9   20:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//   10   23:aload_0         
		//   11   24:getfield        #19  <Field PagerTitleStrip this$0>
		//   12   27:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   13   30:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
		//   14   33:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
				float f1 = mLastKnownPositionOffset;
		//   15   36:aload_0         
		//   16   37:getfield        #19  <Field PagerTitleStrip this$0>
		//   17   40:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//   18   43:fstore_3        
				float f = 0.0F;
		//   19   44:fconst_0        
		//   20   45:fstore_2        
				if(f1 >= 0.0F)
		//*  21   46:fload_3         
		//*  22   47:fconst_0        
		//*  23   48:fcmpl           
		//*  24   49:iflt            60
					f = mLastKnownPositionOffset;
		//   25   52:aload_0         
		//   26   53:getfield        #19  <Field PagerTitleStrip this$0>
		//   27   56:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//   28   59:fstore_2        
				pagertitlestrip = PagerTitleStrip.this;
		//   29   60:aload_0         
		//   30   61:getfield        #19  <Field PagerTitleStrip this$0>
		//   31   64:astore          4
				pagertitlestrip.updateTextPositions(pagertitlestrip.mPager.getCurrentItem(), f, true);
		//   32   66:aload           4
		//   33   68:aload           4
		//   34   70:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   35   73:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//   36   76:fload_2         
		//   37   77:iconst_1        
		//   38   78:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
			}
		//   39   81:return          
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
	//    3    3:invokespecial   #58  <Method void PagerTitleStrip(Context, AttributeSet)>
	//    4    6:return          
	}

	public PagerTitleStrip(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #61  <Method void ViewGroup(Context, AttributeSet)>
		mLastKnownCurrentPage = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #63  <Field int mLastKnownCurrentPage>
		mLastKnownPositionOffset = -1F;
	//    7   11:aload_0         
	//    8   12:ldc1            #64  <Float -1F>
	//    9   14:putfield        #66  <Field float mLastKnownPositionOffset>
		mPageListener = new PageListener();
	//   10   17:aload_0         
	//   11   18:new             #6   <Class PagerTitleStrip$PageListener>
	//   12   21:dup             
	//   13   22:aload_0         
	//   14   23:invokespecial   #69  <Method void PagerTitleStrip$PageListener(PagerTitleStrip)>
	//   15   26:putfield        #71  <Field PagerTitleStrip$PageListener mPageListener>
		TextView textview = new TextView(context);
	//   16   29:new             #73  <Class TextView>
	//   17   32:dup             
	//   18   33:aload_1         
	//   19   34:invokespecial   #75  <Method void TextView(Context)>
	//   20   37:astore          6
		mPrevText = textview;
	//   21   39:aload_0         
	//   22   40:aload           6
	//   23   42:putfield        #77  <Field TextView mPrevText>
		addView(((View) (textview)));
	//   24   45:aload_0         
	//   25   46:aload           6
	//   26   48:invokevirtual   #81  <Method void addView(View)>
		textview = new TextView(context);
	//   27   51:new             #73  <Class TextView>
	//   28   54:dup             
	//   29   55:aload_1         
	//   30   56:invokespecial   #75  <Method void TextView(Context)>
	//   31   59:astore          6
		mCurrText = textview;
	//   32   61:aload_0         
	//   33   62:aload           6
	//   34   64:putfield        #83  <Field TextView mCurrText>
		addView(((View) (textview)));
	//   35   67:aload_0         
	//   36   68:aload           6
	//   37   70:invokevirtual   #81  <Method void addView(View)>
		textview = new TextView(context);
	//   38   73:new             #73  <Class TextView>
	//   39   76:dup             
	//   40   77:aload_1         
	//   41   78:invokespecial   #75  <Method void TextView(Context)>
	//   42   81:astore          6
		mNextText = textview;
	//   43   83:aload_0         
	//   44   84:aload           6
	//   45   86:putfield        #85  <Field TextView mNextText>
		addView(((View) (textview)));
	//   46   89:aload_0         
	//   47   90:aload           6
	//   48   92:invokevirtual   #81  <Method void addView(View)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, ATTRS)));
	//   49   95:aload_1         
	//   50   96:aload_2         
	//   51   97:getstatic       #48  <Field int[] ATTRS>
	//   52  100:invokevirtual   #91  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   53  103:astore_2        
		boolean flag = false;
	//   54  104:iconst_0        
	//   55  105:istore          5
		int i = ((TypedArray) (attributeset)).getResourceId(0, 0);
	//   56  107:aload_2         
	//   57  108:iconst_0        
	//   58  109:iconst_0        
	//   59  110:invokevirtual   #97  <Method int TypedArray.getResourceId(int, int)>
	//   60  113:istore_3        
		if(i != 0)
	//*  61  114:iload_3         
	//*  62  115:ifeq            142
		{
			TextViewCompat.setTextAppearance(mPrevText, i);
	//   63  118:aload_0         
	//   64  119:getfield        #77  <Field TextView mPrevText>
	//   65  122:iload_3         
	//   66  123:invokestatic    #103 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			TextViewCompat.setTextAppearance(mCurrText, i);
	//   67  126:aload_0         
	//   68  127:getfield        #83  <Field TextView mCurrText>
	//   69  130:iload_3         
	//   70  131:invokestatic    #103 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			TextViewCompat.setTextAppearance(mNextText, i);
	//   71  134:aload_0         
	//   72  135:getfield        #85  <Field TextView mNextText>
	//   73  138:iload_3         
	//   74  139:invokestatic    #103 <Method void TextViewCompat.setTextAppearance(TextView, int)>
		}
		int j = ((TypedArray) (attributeset)).getDimensionPixelSize(1, 0);
	//   75  142:aload_2         
	//   76  143:iconst_1        
	//   77  144:iconst_0        
	//   78  145:invokevirtual   #106 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   79  148:istore          4
		if(j != 0)
	//*  80  150:iload           4
	//*  81  152:ifeq            163
			setTextSize(0, j);
	//   82  155:aload_0         
	//   83  156:iconst_0        
	//   84  157:iload           4
	//   85  159:i2f             
	//   86  160:invokevirtual   #110 <Method void setTextSize(int, float)>
		if(((TypedArray) (attributeset)).hasValue(2))
	//*  87  163:aload_2         
	//*  88  164:iconst_2        
	//*  89  165:invokevirtual   #114 <Method boolean TypedArray.hasValue(int)>
	//*  90  168:ifeq            206
		{
			int k = ((TypedArray) (attributeset)).getColor(2, 0);
	//   91  171:aload_2         
	//   92  172:iconst_2        
	//   93  173:iconst_0        
	//   94  174:invokevirtual   #117 <Method int TypedArray.getColor(int, int)>
	//   95  177:istore          4
			mPrevText.setTextColor(k);
	//   96  179:aload_0         
	//   97  180:getfield        #77  <Field TextView mPrevText>
	//   98  183:iload           4
	//   99  185:invokevirtual   #121 <Method void TextView.setTextColor(int)>
			mCurrText.setTextColor(k);
	//  100  188:aload_0         
	//  101  189:getfield        #83  <Field TextView mCurrText>
	//  102  192:iload           4
	//  103  194:invokevirtual   #121 <Method void TextView.setTextColor(int)>
			mNextText.setTextColor(k);
	//  104  197:aload_0         
	//  105  198:getfield        #85  <Field TextView mNextText>
	//  106  201:iload           4
	//  107  203:invokevirtual   #121 <Method void TextView.setTextColor(int)>
		}
		mGravity = ((TypedArray) (attributeset)).getInteger(3, 80);
	//  108  206:aload_0         
	//  109  207:aload_2         
	//  110  208:iconst_3        
	//  111  209:bipush          80
	//  112  211:invokevirtual   #124 <Method int TypedArray.getInteger(int, int)>
	//  113  214:putfield        #126 <Field int mGravity>
		((TypedArray) (attributeset)).recycle();
	//  114  217:aload_2         
	//  115  218:invokevirtual   #129 <Method void TypedArray.recycle()>
		mTextColor = mCurrText.getTextColors().getDefaultColor();
	//  116  221:aload_0         
	//  117  222:aload_0         
	//  118  223:getfield        #83  <Field TextView mCurrText>
	//  119  226:invokevirtual   #133 <Method ColorStateList TextView.getTextColors()>
	//  120  229:invokevirtual   #139 <Method int ColorStateList.getDefaultColor()>
	//  121  232:putfield        #141 <Field int mTextColor>
		setNonPrimaryAlpha(0.6F);
	//  122  235:aload_0         
	//  123  236:ldc1            #16  <Float 0.6F>
	//  124  238:invokevirtual   #145 <Method void setNonPrimaryAlpha(float)>
		mPrevText.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  125  241:aload_0         
	//  126  242:getfield        #77  <Field TextView mPrevText>
	//  127  245:getstatic       #151 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  128  248:invokevirtual   #155 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		mCurrText.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  129  251:aload_0         
	//  130  252:getfield        #83  <Field TextView mCurrText>
	//  131  255:getstatic       #151 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  132  258:invokevirtual   #155 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		mNextText.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  133  261:aload_0         
	//  134  262:getfield        #85  <Field TextView mNextText>
	//  135  265:getstatic       #151 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  136  268:invokevirtual   #155 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		if(i != 0)
	//* 137  271:iload_3         
	//* 138  272:ifeq            296
		{
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(i, TEXT_ATTRS)));
	//  139  275:aload_1         
	//  140  276:iload_3         
	//  141  277:getstatic       #51  <Field int[] TEXT_ATTRS>
	//  142  280:invokevirtual   #158 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//  143  283:astore_2        
			flag = ((TypedArray) (attributeset)).getBoolean(0, false);
	//  144  284:aload_2         
	//  145  285:iconst_0        
	//  146  286:iconst_0        
	//  147  287:invokevirtual   #162 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  148  290:istore          5
			((TypedArray) (attributeset)).recycle();
	//  149  292:aload_2         
	//  150  293:invokevirtual   #129 <Method void TypedArray.recycle()>
		}
		if(flag)
	//* 151  296:iload           5
	//* 152  298:ifeq            325
		{
			setSingleLineAllCaps(mPrevText);
	//  153  301:aload_0         
	//  154  302:getfield        #77  <Field TextView mPrevText>
	//  155  305:invokestatic    #166 <Method void setSingleLineAllCaps(TextView)>
			setSingleLineAllCaps(mCurrText);
	//  156  308:aload_0         
	//  157  309:getfield        #83  <Field TextView mCurrText>
	//  158  312:invokestatic    #166 <Method void setSingleLineAllCaps(TextView)>
			setSingleLineAllCaps(mNextText);
	//  159  315:aload_0         
	//  160  316:getfield        #85  <Field TextView mNextText>
	//  161  319:invokestatic    #166 <Method void setSingleLineAllCaps(TextView)>
		} else
	//* 162  322:goto            346
		{
			mPrevText.setSingleLine();
	//  163  325:aload_0         
	//  164  326:getfield        #77  <Field TextView mPrevText>
	//  165  329:invokevirtual   #169 <Method void TextView.setSingleLine()>
			mCurrText.setSingleLine();
	//  166  332:aload_0         
	//  167  333:getfield        #83  <Field TextView mCurrText>
	//  168  336:invokevirtual   #169 <Method void TextView.setSingleLine()>
			mNextText.setSingleLine();
	//  169  339:aload_0         
	//  170  340:getfield        #85  <Field TextView mNextText>
	//  171  343:invokevirtual   #169 <Method void TextView.setSingleLine()>
		}
		mScaledTextSpacing = (int)(context.getResources().getDisplayMetrics().density * 16F);
	//  172  346:aload_0         
	//  173  347:aload_1         
	//  174  348:invokevirtual   #173 <Method Resources Context.getResources()>
	//  175  351:invokevirtual   #179 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  176  354:getfield        #184 <Field float DisplayMetrics.density>
	//  177  357:ldc1            #185 <Float 16F>
	//  178  359:fmul            
	//  179  360:f2i             
	//  180  361:putfield        #187 <Field int mScaledTextSpacing>
	//  181  364:return          
	}

	private static void setSingleLineAllCaps(TextView textview)
	{
		textview.setTransformationMethod(((android.text.method.TransformationMethod) (new SingleLineAllCapsTransform(textview.getContext()))));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class PagerTitleStrip$SingleLineAllCapsTransform>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #191 <Method Context TextView.getContext()>
	//    5    9:invokespecial   #192 <Method void PagerTitleStrip$SingleLineAllCapsTransform(Context)>
	//    6   12:invokevirtual   #196 <Method void TextView.setTransformationMethod(android.text.method.TransformationMethod)>
	//    7   15:return          
	}

	int getMinHeight()
	{
		Drawable drawable = getBackground();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #201 <Method Drawable getBackground()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return drawable.getIntrinsicHeight();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #206 <Method int Drawable.getIntrinsicHeight()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getTextSpacing()
	{
		return mScaledTextSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field int mScaledTextSpacing>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #210 <Method void ViewGroup.onAttachedToWindow()>
		Object obj = ((Object) (getParent()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #214 <Method android.view.ViewParent getParent()>
	//    4    8:astore_1        
		if(obj instanceof ViewPager)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #216 <Class ViewPager>
	//*   7   13:ifeq            77
		{
			obj = ((Object) ((ViewPager)obj));
	//    8   16:aload_1         
	//    9   17:checkcast       #216 <Class ViewPager>
	//   10   20:astore_1        
			PagerAdapter pageradapter = ((ViewPager) (obj)).getAdapter();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #220 <Method PagerAdapter ViewPager.getAdapter()>
	//   13   25:astore_2        
			((ViewPager) (obj)).setInternalPageChangeListener(((ViewPager.OnPageChangeListener) (mPageListener)));
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #71  <Field PagerTitleStrip$PageListener mPageListener>
	//   17   31:invokevirtual   #224 <Method ViewPager$OnPageChangeListener ViewPager.setInternalPageChangeListener(ViewPager$OnPageChangeListener)>
	//   18   34:pop             
			((ViewPager) (obj)).addOnAdapterChangeListener(((ViewPager.OnAdapterChangeListener) (mPageListener)));
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #71  <Field PagerTitleStrip$PageListener mPageListener>
	//   22   40:invokevirtual   #228 <Method void ViewPager.addOnAdapterChangeListener(ViewPager$OnAdapterChangeListener)>
			mPager = ((ViewPager) (obj));
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:putfield        #230 <Field ViewPager mPager>
			obj = ((Object) (mWatchingAdapter));
	//   26   48:aload_0         
	//   27   49:getfield        #232 <Field WeakReference mWatchingAdapter>
	//   28   52:astore_1        
			if(obj != null)
	//*  29   53:aload_1         
	//*  30   54:ifnull          68
				obj = ((Object) ((PagerAdapter)((WeakReference) (obj)).get()));
	//   31   57:aload_1         
	//   32   58:invokevirtual   #238 <Method Object WeakReference.get()>
	//   33   61:checkcast       #240 <Class PagerAdapter>
	//   34   64:astore_1        
			else
	//*  35   65:goto            70
				obj = null;
	//   36   68:aconst_null     
	//   37   69:astore_1        
			updateAdapter(((PagerAdapter) (obj)), pageradapter);
	//   38   70:aload_0         
	//   39   71:aload_1         
	//   40   72:aload_2         
	//   41   73:invokevirtual   #244 <Method void updateAdapter(PagerAdapter, PagerAdapter)>
			return;
	//   42   76:return          
		} else
		{
			throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
	//   43   77:new             #246 <Class IllegalStateException>
	//   44   80:dup             
	//   45   81:ldc1            #248 <String "PagerTitleStrip must be a direct child of a ViewPager.">
	//   46   83:invokespecial   #251 <Method void IllegalStateException(String)>
	//   47   86:athrow          
		}
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #254 <Method void ViewGroup.onDetachedFromWindow()>
		ViewPager viewpager = mPager;
	//    2    4:aload_0         
	//    3    5:getfield        #230 <Field ViewPager mPager>
	//    4    8:astore_1        
		if(viewpager != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          47
		{
			updateAdapter(viewpager.getAdapter(), ((PagerAdapter) (null)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #220 <Method PagerAdapter ViewPager.getAdapter()>
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #244 <Method void updateAdapter(PagerAdapter, PagerAdapter)>
			mPager.setInternalPageChangeListener(((ViewPager.OnPageChangeListener) (null)));
	//   12   22:aload_0         
	//   13   23:getfield        #230 <Field ViewPager mPager>
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #224 <Method ViewPager$OnPageChangeListener ViewPager.setInternalPageChangeListener(ViewPager$OnPageChangeListener)>
	//   16   30:pop             
			mPager.removeOnAdapterChangeListener(((ViewPager.OnAdapterChangeListener) (mPageListener)));
	//   17   31:aload_0         
	//   18   32:getfield        #230 <Field ViewPager mPager>
	//   19   35:aload_0         
	//   20   36:getfield        #71  <Field PagerTitleStrip$PageListener mPageListener>
	//   21   39:invokevirtual   #257 <Method void ViewPager.removeOnAdapterChangeListener(ViewPager$OnAdapterChangeListener)>
			mPager = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #230 <Field ViewPager mPager>
		}
	//   25   47:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(mPager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field ViewPager mPager>
	//*   2    4:ifnull          37
		{
			float f = mLastKnownPositionOffset;
	//    3    7:aload_0         
	//    4    8:getfield        #66  <Field float mLastKnownPositionOffset>
	//    5   11:fstore          6
			if(f < 0.0F)
	//*   6   13:fload           6
	//*   7   15:fconst_0        
	//*   8   16:fcmpl           
	//*   9   17:iflt            23
	//*  10   20:goto            26
				f = 0.0F;
	//   11   23:fconst_0        
	//   12   24:fstore          6
			updateTextPositions(mLastKnownCurrentPage, f, true);
	//   13   26:aload_0         
	//   14   27:aload_0         
	//   15   28:getfield        #63  <Field int mLastKnownCurrentPage>
	//   16   31:fload           6
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #263 <Method void updateTextPositions(int, float, boolean)>
		}
	//   19   37:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(android.view.View.MeasureSpec.getMode(i) == 0x40000000)
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #271 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   2    4:ldc2            #272 <Int 0x40000000>
	//*   3    7:icmpne          139
		{
			int l = getPaddingTop() + getPaddingBottom();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #275 <Method int getPaddingTop()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #278 <Method int getPaddingBottom()>
	//    8   18:iadd            
	//    9   19:istore          4
			int i1 = getChildMeasureSpec(j, l, -2);
	//   10   21:iload_2         
	//   11   22:iload           4
	//   12   24:bipush          -2
	//   13   26:invokestatic    #282 <Method int getChildMeasureSpec(int, int, int)>
	//   14   29:istore          5
			int k = android.view.View.MeasureSpec.getSize(i);
	//   15   31:iload_1         
	//   16   32:invokestatic    #285 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   17   35:istore_3        
			i = getChildMeasureSpec(i, (int)((float)k * 0.2F), -2);
	//   18   36:iload_1         
	//   19   37:iload_3         
	//   20   38:i2f             
	//   21   39:ldc2            #286 <Float 0.2F>
	//   22   42:fmul            
	//   23   43:f2i             
	//   24   44:bipush          -2
	//   25   46:invokestatic    #282 <Method int getChildMeasureSpec(int, int, int)>
	//   26   49:istore_1        
			mPrevText.measure(i, i1);
	//   27   50:aload_0         
	//   28   51:getfield        #77  <Field TextView mPrevText>
	//   29   54:iload_1         
	//   30   55:iload           5
	//   31   57:invokevirtual   #289 <Method void TextView.measure(int, int)>
			mCurrText.measure(i, i1);
	//   32   60:aload_0         
	//   33   61:getfield        #83  <Field TextView mCurrText>
	//   34   64:iload_1         
	//   35   65:iload           5
	//   36   67:invokevirtual   #289 <Method void TextView.measure(int, int)>
			mNextText.measure(i, i1);
	//   37   70:aload_0         
	//   38   71:getfield        #85  <Field TextView mNextText>
	//   39   74:iload_1         
	//   40   75:iload           5
	//   41   77:invokevirtual   #289 <Method void TextView.measure(int, int)>
			if(android.view.View.MeasureSpec.getMode(j) == 0x40000000)
	//*  42   80:iload_2         
	//*  43   81:invokestatic    #271 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  44   84:ldc2            #272 <Int 0x40000000>
	//*  45   87:icmpne          98
			{
				i = android.view.View.MeasureSpec.getSize(j);
	//   46   90:iload_2         
	//   47   91:invokestatic    #285 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   48   94:istore_1        
			} else
	//*  49   95:goto            118
			{
				i = mCurrText.getMeasuredHeight();
	//   50   98:aload_0         
	//   51   99:getfield        #83  <Field TextView mCurrText>
	//   52  102:invokevirtual   #292 <Method int TextView.getMeasuredHeight()>
	//   53  105:istore_1        
				i = Math.max(getMinHeight(), i + l);
	//   54  106:aload_0         
	//   55  107:invokevirtual   #294 <Method int getMinHeight()>
	//   56  110:iload_1         
	//   57  111:iload           4
	//   58  113:iadd            
	//   59  114:invokestatic    #299 <Method int Math.max(int, int)>
	//   60  117:istore_1        
			}
			setMeasuredDimension(k, View.resolveSizeAndState(i, j, mCurrText.getMeasuredState() << 16));
	//   61  118:aload_0         
	//   62  119:iload_3         
	//   63  120:iload_1         
	//   64  121:iload_2         
	//   65  122:aload_0         
	//   66  123:getfield        #83  <Field TextView mCurrText>
	//   67  126:invokevirtual   #302 <Method int TextView.getMeasuredState()>
	//   68  129:bipush          16
	//   69  131:ishl            
	//   70  132:invokestatic    #307 <Method int View.resolveSizeAndState(int, int, int)>
	//   71  135:invokevirtual   #310 <Method void setMeasuredDimension(int, int)>
			return;
	//   72  138:return          
		} else
		{
			throw new IllegalStateException("Must measure with an exact width");
	//   73  139:new             #246 <Class IllegalStateException>
	//   74  142:dup             
	//   75  143:ldc2            #312 <String "Must measure with an exact width">
	//   76  146:invokespecial   #251 <Method void IllegalStateException(String)>
	//   77  149:athrow          
		}
	}

	public void requestLayout()
	{
		if(!mUpdatingText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean mUpdatingText>
	//*   2    4:ifne            11
			super.requestLayout();
	//    3    7:aload_0         
	//    4    8:invokespecial   #317 <Method void ViewGroup.requestLayout()>
	//    5   11:return          
	}

	public void setGravity(int i)
	{
		mGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #126 <Field int mGravity>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #319 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setNonPrimaryAlpha(float f)
	{
		mNonPrimaryAlpha = (int)(f * 255F) & 0xff;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc2            #327 <Float 255F>
	//    3    5:fmul            
	//    4    6:f2i             
	//    5    7:sipush          255
	//    6   10:iand            
	//    7   11:putfield        #329 <Field int mNonPrimaryAlpha>
		int i = mNonPrimaryAlpha << 24 | mTextColor & 0xffffff;
	//    8   14:aload_0         
	//    9   15:getfield        #329 <Field int mNonPrimaryAlpha>
	//   10   18:bipush          24
	//   11   20:ishl            
	//   12   21:aload_0         
	//   13   22:getfield        #141 <Field int mTextColor>
	//   14   25:ldc2            #330 <Int 0xffffff>
	//   15   28:iand            
	//   16   29:ior             
	//   17   30:istore_2        
		mPrevText.setTextColor(i);
	//   18   31:aload_0         
	//   19   32:getfield        #77  <Field TextView mPrevText>
	//   20   35:iload_2         
	//   21   36:invokevirtual   #121 <Method void TextView.setTextColor(int)>
		mNextText.setTextColor(i);
	//   22   39:aload_0         
	//   23   40:getfield        #85  <Field TextView mNextText>
	//   24   43:iload_2         
	//   25   44:invokevirtual   #121 <Method void TextView.setTextColor(int)>
	//   26   47:return          
	}

	public void setTextColor(int i)
	{
		mTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #141 <Field int mTextColor>
		mCurrText.setTextColor(i);
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field TextView mCurrText>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #121 <Method void TextView.setTextColor(int)>
		i = mNonPrimaryAlpha << 24 | mTextColor & 0xffffff;
	//    7   13:aload_0         
	//    8   14:getfield        #329 <Field int mNonPrimaryAlpha>
	//    9   17:bipush          24
	//   10   19:ishl            
	//   11   20:aload_0         
	//   12   21:getfield        #141 <Field int mTextColor>
	//   13   24:ldc2            #330 <Int 0xffffff>
	//   14   27:iand            
	//   15   28:ior             
	//   16   29:istore_1        
		mPrevText.setTextColor(i);
	//   17   30:aload_0         
	//   18   31:getfield        #77  <Field TextView mPrevText>
	//   19   34:iload_1         
	//   20   35:invokevirtual   #121 <Method void TextView.setTextColor(int)>
		mNextText.setTextColor(i);
	//   21   38:aload_0         
	//   22   39:getfield        #85  <Field TextView mNextText>
	//   23   42:iload_1         
	//   24   43:invokevirtual   #121 <Method void TextView.setTextColor(int)>
	//   25   46:return          
	}

	public void setTextSize(int i, float f)
	{
		mPrevText.setTextSize(i, f);
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field TextView mPrevText>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #332 <Method void TextView.setTextSize(int, float)>
		mCurrText.setTextSize(i, f);
	//    5    9:aload_0         
	//    6   10:getfield        #83  <Field TextView mCurrText>
	//    7   13:iload_1         
	//    8   14:fload_2         
	//    9   15:invokevirtual   #332 <Method void TextView.setTextSize(int, float)>
		mNextText.setTextSize(i, f);
	//   10   18:aload_0         
	//   11   19:getfield        #85  <Field TextView mNextText>
	//   12   22:iload_1         
	//   13   23:fload_2         
	//   14   24:invokevirtual   #332 <Method void TextView.setTextSize(int, float)>
	//   15   27:return          
	}

	public void setTextSpacing(int i)
	{
		mScaledTextSpacing = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #187 <Field int mScaledTextSpacing>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #319 <Method void requestLayout()>
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
	//    4    6:getfield        #71  <Field PagerTitleStrip$PageListener mPageListener>
	//    5    9:invokevirtual   #337 <Method void PagerAdapter.unregisterDataSetObserver(DataSetObserver)>
			mWatchingAdapter = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #232 <Field WeakReference mWatchingAdapter>
		}
		if(pageradapter1 != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          41
		{
			pageradapter1.registerDataSetObserver(((DataSetObserver) (mPageListener)));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:getfield        #71  <Field PagerTitleStrip$PageListener mPageListener>
	//   14   26:invokevirtual   #340 <Method void PagerAdapter.registerDataSetObserver(DataSetObserver)>
			mWatchingAdapter = new WeakReference(((Object) (pageradapter1)));
	//   15   29:aload_0         
	//   16   30:new             #234 <Class WeakReference>
	//   17   33:dup             
	//   18   34:aload_2         
	//   19   35:invokespecial   #343 <Method void WeakReference(Object)>
	//   20   38:putfield        #232 <Field WeakReference mWatchingAdapter>
		}
		pageradapter = ((PagerAdapter) (mPager));
	//   21   41:aload_0         
	//   22   42:getfield        #230 <Field ViewPager mPager>
	//   23   45:astore_1        
		if(pageradapter != null)
	//*  24   46:aload_1         
	//*  25   47:ifnull          74
		{
			mLastKnownCurrentPage = -1;
	//   26   50:aload_0         
	//   27   51:iconst_m1       
	//   28   52:putfield        #63  <Field int mLastKnownCurrentPage>
			mLastKnownPositionOffset = -1F;
	//   29   55:aload_0         
	//   30   56:ldc1            #64  <Float -1F>
	//   31   58:putfield        #66  <Field float mLastKnownPositionOffset>
			updateText(((ViewPager) (pageradapter)).getCurrentItem(), pageradapter1);
	//   32   61:aload_0         
	//   33   62:aload_1         
	//   34   63:invokevirtual   #346 <Method int ViewPager.getCurrentItem()>
	//   35   66:aload_2         
	//   36   67:invokevirtual   #350 <Method void updateText(int, PagerAdapter)>
			requestLayout();
	//   37   70:aload_0         
	//   38   71:invokevirtual   #319 <Method void requestLayout()>
		}
	//   39   74:return          
	}

	void updateText(int i, PagerAdapter pageradapter)
	{
		int j;
		if(pageradapter != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			j = pageradapter.getCount();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #353 <Method int PagerAdapter.getCount()>
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			j = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		mUpdatingText = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #315 <Field boolean mUpdatingText>
		Object obj = null;
	//   11   19:aconst_null     
	//   12   20:astore          6
		CharSequence charsequence;
		if(i >= 1 && pageradapter != null)
	//*  13   22:iload_1         
	//*  14   23:iconst_1        
	//*  15   24:icmplt          43
	//*  16   27:aload_2         
	//*  17   28:ifnull          43
			charsequence = pageradapter.getPageTitle(i - 1);
	//   18   31:aload_2         
	//   19   32:iload_1         
	//   20   33:iconst_1        
	//   21   34:isub            
	//   22   35:invokevirtual   #357 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//   23   38:astore          5
		else
	//*  24   40:goto            46
			charsequence = null;
	//   25   43:aconst_null     
	//   26   44:astore          5
		mPrevText.setText(charsequence);
	//   27   46:aload_0         
	//   28   47:getfield        #77  <Field TextView mPrevText>
	//   29   50:aload           5
	//   30   52:invokevirtual   #361 <Method void TextView.setText(CharSequence)>
		TextView textview = mCurrText;
	//   31   55:aload_0         
	//   32   56:getfield        #83  <Field TextView mCurrText>
	//   33   59:astore          7
		if(pageradapter != null && i < j)
	//*  34   61:aload_2         
	//*  35   62:ifnull          80
	//*  36   65:iload_1         
	//*  37   66:iload_3         
	//*  38   67:icmpge          80
			charsequence = pageradapter.getPageTitle(i);
	//   39   70:aload_2         
	//   40   71:iload_1         
	//   41   72:invokevirtual   #357 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//   42   75:astore          5
		else
	//*  43   77:goto            83
			charsequence = null;
	//   44   80:aconst_null     
	//   45   81:astore          5
		textview.setText(charsequence);
	//   46   83:aload           7
	//   47   85:aload           5
	//   48   87:invokevirtual   #361 <Method void TextView.setText(CharSequence)>
		int k = i + 1;
	//   49   90:iload_1         
	//   50   91:iconst_1        
	//   51   92:iadd            
	//   52   93:istore          4
		charsequence = ((CharSequence) (obj));
	//   53   95:aload           6
	//   54   97:astore          5
		if(k < j)
	//*  55   99:iload           4
	//*  56  101:iload_3         
	//*  57  102:icmpge          121
		{
			charsequence = ((CharSequence) (obj));
	//   58  105:aload           6
	//   59  107:astore          5
			if(pageradapter != null)
	//*  60  109:aload_2         
	//*  61  110:ifnull          121
				charsequence = pageradapter.getPageTitle(k);
	//   62  113:aload_2         
	//   63  114:iload           4
	//   64  116:invokevirtual   #357 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//   65  119:astore          5
		}
		mNextText.setText(charsequence);
	//   66  121:aload_0         
	//   67  122:getfield        #85  <Field TextView mNextText>
	//   68  125:aload           5
	//   69  127:invokevirtual   #361 <Method void TextView.setText(CharSequence)>
		j = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((float)(getWidth() - getPaddingLeft() - getPaddingRight()) * 0.8F)), 0x80000000);
	//   70  130:iconst_0        
	//   71  131:aload_0         
	//   72  132:invokevirtual   #364 <Method int getWidth()>
	//   73  135:aload_0         
	//   74  136:invokevirtual   #367 <Method int getPaddingLeft()>
	//   75  139:isub            
	//   76  140:aload_0         
	//   77  141:invokevirtual   #370 <Method int getPaddingRight()>
	//   78  144:isub            
	//   79  145:i2f             
	//   80  146:ldc2            #371 <Float 0.8F>
	//   81  149:fmul            
	//   82  150:f2i             
	//   83  151:invokestatic    #299 <Method int Math.max(int, int)>
	//   84  154:ldc2            #372 <Int 0x80000000>
	//   85  157:invokestatic    #375 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   86  160:istore_3        
		k = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), 0x80000000);
	//   87  161:iconst_0        
	//   88  162:aload_0         
	//   89  163:invokevirtual   #378 <Method int getHeight()>
	//   90  166:aload_0         
	//   91  167:invokevirtual   #275 <Method int getPaddingTop()>
	//   92  170:isub            
	//   93  171:aload_0         
	//   94  172:invokevirtual   #278 <Method int getPaddingBottom()>
	//   95  175:isub            
	//   96  176:invokestatic    #299 <Method int Math.max(int, int)>
	//   97  179:ldc2            #372 <Int 0x80000000>
	//   98  182:invokestatic    #375 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   99  185:istore          4
		mPrevText.measure(j, k);
	//  100  187:aload_0         
	//  101  188:getfield        #77  <Field TextView mPrevText>
	//  102  191:iload_3         
	//  103  192:iload           4
	//  104  194:invokevirtual   #289 <Method void TextView.measure(int, int)>
		mCurrText.measure(j, k);
	//  105  197:aload_0         
	//  106  198:getfield        #83  <Field TextView mCurrText>
	//  107  201:iload_3         
	//  108  202:iload           4
	//  109  204:invokevirtual   #289 <Method void TextView.measure(int, int)>
		mNextText.measure(j, k);
	//  110  207:aload_0         
	//  111  208:getfield        #85  <Field TextView mNextText>
	//  112  211:iload_3         
	//  113  212:iload           4
	//  114  214:invokevirtual   #289 <Method void TextView.measure(int, int)>
		mLastKnownCurrentPage = i;
	//  115  217:aload_0         
	//  116  218:iload_1         
	//  117  219:putfield        #63  <Field int mLastKnownCurrentPage>
		if(!mUpdatingPositions)
	//* 118  222:aload_0         
	//* 119  223:getfield        #380 <Field boolean mUpdatingPositions>
	//* 120  226:ifne            239
			updateTextPositions(i, mLastKnownPositionOffset, false);
	//  121  229:aload_0         
	//  122  230:iload_1         
	//  123  231:aload_0         
	//  124  232:getfield        #66  <Field float mLastKnownPositionOffset>
	//  125  235:iconst_0        
	//  126  236:invokevirtual   #263 <Method void updateTextPositions(int, float, boolean)>
		mUpdatingText = false;
	//  127  239:aload_0         
	//  128  240:iconst_0        
	//  129  241:putfield        #315 <Field boolean mUpdatingText>
	//  130  244:return          
	}

	void updateTextPositions(int i, float f, boolean flag)
	{
		if(i != mLastKnownCurrentPage)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #63  <Field int mLastKnownCurrentPage>
	//*   3    5:icmpeq          23
			updateText(i, mPager.getAdapter());
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #230 <Field ViewPager mPager>
	//    8   14:invokevirtual   #220 <Method PagerAdapter ViewPager.getAdapter()>
	//    9   17:invokevirtual   #350 <Method void updateText(int, PagerAdapter)>
		else
	//*  10   20:goto            37
		if(!flag && f == mLastKnownPositionOffset)
	//*  11   23:iload_3         
	//*  12   24:ifne            37
	//*  13   27:fload_2         
	//*  14   28:aload_0         
	//*  15   29:getfield        #66  <Field float mLastKnownPositionOffset>
	//*  16   32:fcmpl           
	//*  17   33:ifne            37
			return;
	//   18   36:return          
		mUpdatingPositions = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #380 <Field boolean mUpdatingPositions>
		int i1 = mPrevText.getMeasuredWidth();
	//   22   42:aload_0         
	//   23   43:getfield        #77  <Field TextView mPrevText>
	//   24   46:invokevirtual   #383 <Method int TextView.getMeasuredWidth()>
	//   25   49:istore          9
		int j2 = mCurrText.getMeasuredWidth();
	//   26   51:aload_0         
	//   27   52:getfield        #83  <Field TextView mCurrText>
	//   28   55:invokevirtual   #383 <Method int TextView.getMeasuredWidth()>
	//   29   58:istore          14
		int l = mNextText.getMeasuredWidth();
	//   30   60:aload_0         
	//   31   61:getfield        #85  <Field TextView mNextText>
	//   32   64:invokevirtual   #383 <Method int TextView.getMeasuredWidth()>
	//   33   67:istore          8
		int i2 = j2 / 2;
	//   34   69:iload           14
	//   35   71:iconst_2        
	//   36   72:idiv            
	//   37   73:istore          13
		int j1 = getWidth();
	//   38   75:aload_0         
	//   39   76:invokevirtual   #364 <Method int getWidth()>
	//   40   79:istore          10
		i = getHeight();
	//   41   81:aload_0         
	//   42   82:invokevirtual   #378 <Method int getHeight()>
	//   43   85:istore_1        
		int l1 = getPaddingLeft();
	//   44   86:aload_0         
	//   45   87:invokevirtual   #367 <Method int getPaddingLeft()>
	//   46   90:istore          12
		int k1 = getPaddingRight();
	//   47   92:aload_0         
	//   48   93:invokevirtual   #370 <Method int getPaddingRight()>
	//   49   96:istore          11
		int j = getPaddingTop();
	//   50   98:aload_0         
	//   51   99:invokevirtual   #275 <Method int getPaddingTop()>
	//   52  102:istore          6
		int k = getPaddingBottom();
	//   53  104:aload_0         
	//   54  105:invokevirtual   #278 <Method int getPaddingBottom()>
	//   55  108:istore          7
		int k2 = k1 + i2;
	//   56  110:iload           11
	//   57  112:iload           13
	//   58  114:iadd            
	//   59  115:istore          15
		float f2 = 0.5F + f;
	//   60  117:ldc2            #384 <Float 0.5F>
	//   61  120:fload_2         
	//   62  121:fadd            
	//   63  122:fstore          5
		float f1 = f2;
	//   64  124:fload           5
	//   65  126:fstore          4
		if(f2 > 1.0F)
	//*  66  128:fload           5
	//*  67  130:fconst_1        
	//*  68  131:fcmpl           
	//*  69  132:ifle            141
			f1 = f2 - 1.0F;
	//   70  135:fload           5
	//   71  137:fconst_1        
	//   72  138:fsub            
	//   73  139:fstore          4
		i2 = j1 - k2 - (int)((float)(j1 - (l1 + i2) - k2) * f1) - i2;
	//   74  141:iload           10
	//   75  143:iload           15
	//   76  145:isub            
	//   77  146:iload           10
	//   78  148:iload           12
	//   79  150:iload           13
	//   80  152:iadd            
	//   81  153:isub            
	//   82  154:iload           15
	//   83  156:isub            
	//   84  157:i2f             
	//   85  158:fload           4
	//   86  160:fmul            
	//   87  161:f2i             
	//   88  162:isub            
	//   89  163:iload           13
	//   90  165:isub            
	//   91  166:istore          13
		j2 += i2;
	//   92  168:iload           14
	//   93  170:iload           13
	//   94  172:iadd            
	//   95  173:istore          14
		int i3 = mPrevText.getBaseline();
	//   96  175:aload_0         
	//   97  176:getfield        #77  <Field TextView mPrevText>
	//   98  179:invokevirtual   #387 <Method int TextView.getBaseline()>
	//   99  182:istore          17
		int l2 = mCurrText.getBaseline();
	//  100  184:aload_0         
	//  101  185:getfield        #83  <Field TextView mCurrText>
	//  102  188:invokevirtual   #387 <Method int TextView.getBaseline()>
	//  103  191:istore          16
		k2 = mNextText.getBaseline();
	//  104  193:aload_0         
	//  105  194:getfield        #85  <Field TextView mNextText>
	//  106  197:invokevirtual   #387 <Method int TextView.getBaseline()>
	//  107  200:istore          15
		int j3 = Math.max(Math.max(i3, l2), k2);
	//  108  202:iload           17
	//  109  204:iload           16
	//  110  206:invokestatic    #299 <Method int Math.max(int, int)>
	//  111  209:iload           15
	//  112  211:invokestatic    #299 <Method int Math.max(int, int)>
	//  113  214:istore          18
		i3 = j3 - i3;
	//  114  216:iload           18
	//  115  218:iload           17
	//  116  220:isub            
	//  117  221:istore          17
		l2 = j3 - l2;
	//  118  223:iload           18
	//  119  225:iload           16
	//  120  227:isub            
	//  121  228:istore          16
		k2 = j3 - k2;
	//  122  230:iload           18
	//  123  232:iload           15
	//  124  234:isub            
	//  125  235:istore          15
		j3 = mPrevText.getMeasuredHeight();
	//  126  237:aload_0         
	//  127  238:getfield        #77  <Field TextView mPrevText>
	//  128  241:invokevirtual   #292 <Method int TextView.getMeasuredHeight()>
	//  129  244:istore          18
		int k3 = mCurrText.getMeasuredHeight();
	//  130  246:aload_0         
	//  131  247:getfield        #83  <Field TextView mCurrText>
	//  132  250:invokevirtual   #292 <Method int TextView.getMeasuredHeight()>
	//  133  253:istore          19
		int l3 = mNextText.getMeasuredHeight();
	//  134  255:aload_0         
	//  135  256:getfield        #85  <Field TextView mNextText>
	//  136  259:invokevirtual   #292 <Method int TextView.getMeasuredHeight()>
	//  137  262:istore          20
		j3 = Math.max(Math.max(j3 + i3, k3 + l2), l3 + k2);
	//  138  264:iload           18
	//  139  266:iload           17
	//  140  268:iadd            
	//  141  269:iload           19
	//  142  271:iload           16
	//  143  273:iadd            
	//  144  274:invokestatic    #299 <Method int Math.max(int, int)>
	//  145  277:iload           20
	//  146  279:iload           15
	//  147  281:iadd            
	//  148  282:invokestatic    #299 <Method int Math.max(int, int)>
	//  149  285:istore          18
		k3 = mGravity & 0x70;
	//  150  287:aload_0         
	//  151  288:getfield        #126 <Field int mGravity>
	//  152  291:bipush          112
	//  153  293:iand            
	//  154  294:istore          19
		if(k3 != 16)
	//* 155  296:iload           19
	//* 156  298:bipush          16
	//* 157  300:icmpeq          365
		{
			if(k3 != 80)
	//* 158  303:iload           19
	//* 159  305:bipush          80
	//* 160  307:icmpeq          333
			{
				i = i3 + j;
	//  161  310:iload           17
	//  162  312:iload           6
	//  163  314:iadd            
	//  164  315:istore_1        
				k = l2 + j;
	//  165  316:iload           16
	//  166  318:iload           6
	//  167  320:iadd            
	//  168  321:istore          7
				j += k2;
	//  169  323:iload           6
	//  170  325:iload           15
	//  171  327:iadd            
	//  172  328:istore          6
			} else
	//* 173  330:goto            399
			{
				j = i - k - j3;
	//  174  333:iload_1         
	//  175  334:iload           7
	//  176  336:isub            
	//  177  337:iload           18
	//  178  339:isub            
	//  179  340:istore          6
				i = i3 + j;
	//  180  342:iload           17
	//  181  344:iload           6
	//  182  346:iadd            
	//  183  347:istore_1        
				k = l2 + j;
	//  184  348:iload           16
	//  185  350:iload           6
	//  186  352:iadd            
	//  187  353:istore          7
				j += k2;
	//  188  355:iload           6
	//  189  357:iload           15
	//  190  359:iadd            
	//  191  360:istore          6
			}
		} else
	//* 192  362:goto            399
		{
			j = (i - j - k - j3) / 2;
	//  193  365:iload_1         
	//  194  366:iload           6
	//  195  368:isub            
	//  196  369:iload           7
	//  197  371:isub            
	//  198  372:iload           18
	//  199  374:isub            
	//  200  375:iconst_2        
	//  201  376:idiv            
	//  202  377:istore          6
			i = i3 + j;
	//  203  379:iload           17
	//  204  381:iload           6
	//  205  383:iadd            
	//  206  384:istore_1        
			k = l2 + j;
	//  207  385:iload           16
	//  208  387:iload           6
	//  209  389:iadd            
	//  210  390:istore          7
			j += k2;
	//  211  392:iload           6
	//  212  394:iload           15
	//  213  396:iadd            
	//  214  397:istore          6
		}
		TextView textview = mCurrText;
	//  215  399:aload_0         
	//  216  400:getfield        #83  <Field TextView mCurrText>
	//  217  403:astore          21
		textview.layout(i2, k, j2, textview.getMeasuredHeight() + k);
	//  218  405:aload           21
	//  219  407:iload           13
	//  220  409:iload           7
	//  221  411:iload           14
	//  222  413:aload           21
	//  223  415:invokevirtual   #292 <Method int TextView.getMeasuredHeight()>
	//  224  418:iload           7
	//  225  420:iadd            
	//  226  421:invokevirtual   #391 <Method void TextView.layout(int, int, int, int)>
		k = Math.min(l1, i2 - mScaledTextSpacing - i1);
	//  227  424:iload           12
	//  228  426:iload           13
	//  229  428:aload_0         
	//  230  429:getfield        #187 <Field int mScaledTextSpacing>
	//  231  432:isub            
	//  232  433:iload           9
	//  233  435:isub            
	//  234  436:invokestatic    #394 <Method int Math.min(int, int)>
	//  235  439:istore          7
		textview = mPrevText;
	//  236  441:aload_0         
	//  237  442:getfield        #77  <Field TextView mPrevText>
	//  238  445:astore          21
		textview.layout(k, i, i1 + k, textview.getMeasuredHeight() + i);
	//  239  447:aload           21
	//  240  449:iload           7
	//  241  451:iload_1         
	//  242  452:iload           9
	//  243  454:iload           7
	//  244  456:iadd            
	//  245  457:aload           21
	//  246  459:invokevirtual   #292 <Method int TextView.getMeasuredHeight()>
	//  247  462:iload_1         
	//  248  463:iadd            
	//  249  464:invokevirtual   #391 <Method void TextView.layout(int, int, int, int)>
		i = Math.max(j1 - k1 - l, j2 + mScaledTextSpacing);
	//  250  467:iload           10
	//  251  469:iload           11
	//  252  471:isub            
	//  253  472:iload           8
	//  254  474:isub            
	//  255  475:iload           14
	//  256  477:aload_0         
	//  257  478:getfield        #187 <Field int mScaledTextSpacing>
	//  258  481:iadd            
	//  259  482:invokestatic    #299 <Method int Math.max(int, int)>
	//  260  485:istore_1        
		textview = mNextText;
	//  261  486:aload_0         
	//  262  487:getfield        #85  <Field TextView mNextText>
	//  263  490:astore          21
		textview.layout(i, j, i + l, textview.getMeasuredHeight() + j);
	//  264  492:aload           21
	//  265  494:iload_1         
	//  266  495:iload           6
	//  267  497:iload_1         
	//  268  498:iload           8
	//  269  500:iadd            
	//  270  501:aload           21
	//  271  503:invokevirtual   #292 <Method int TextView.getMeasuredHeight()>
	//  272  506:iload           6
	//  273  508:iadd            
	//  274  509:invokevirtual   #391 <Method void TextView.layout(int, int, int, int)>
		mLastKnownPositionOffset = f;
	//  275  512:aload_0         
	//  276  513:fload_2         
	//  277  514:putfield        #66  <Field float mLastKnownPositionOffset>
		mUpdatingPositions = false;
	//  278  517:aload_0         
	//  279  518:iconst_0        
	//  280  519:putfield        #380 <Field boolean mUpdatingPositions>
	//  281  522:return          
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
