// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.*;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.TextViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//			ViewPager, PagerAdapter, PagerTitleStripIcs

public class PagerTitleStrip extends ViewGroup
{
	class PageListener extends DataSetObserver
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
			updateText(mPager.getCurrentItem(), mPager.getAdapter());
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field PagerTitleStrip this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field PagerTitleStrip this$0>
		//    4    8:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//    5   11:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//    6   14:aload_0         
		//    7   15:getfield        #19  <Field PagerTitleStrip this$0>
		//    8   18:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//    9   21:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
		//   10   24:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
			float f;
			if(mLastKnownPositionOffset >= 0.0F)
		//*  11   27:aload_0         
		//*  12   28:getfield        #19  <Field PagerTitleStrip this$0>
		//*  13   31:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//*  14   34:fconst_0        
		//*  15   35:fcmpl           
		//*  16   36:iflt            50
				f = mLastKnownPositionOffset;
		//   17   39:aload_0         
		//   18   40:getfield        #19  <Field PagerTitleStrip this$0>
		//   19   43:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//   20   46:fstore_1        
			else
		//*  21   47:goto            52
				f = 0.0F;
		//   22   50:fconst_0        
		//   23   51:fstore_1        
			updateTextPositions(mPager.getCurrentItem(), f, true);
		//   24   52:aload_0         
		//   25   53:getfield        #19  <Field PagerTitleStrip this$0>
		//   26   56:aload_0         
		//   27   57:getfield        #19  <Field PagerTitleStrip this$0>
		//   28   60:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   29   63:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//   30   66:fload_1         
		//   31   67:iconst_1        
		//   32   68:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
		//   33   71:return          
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
		//*   2    4:ifne            78
			{
				updateText(mPager.getCurrentItem(), mPager.getAdapter());
		//    3    7:aload_0         
		//    4    8:getfield        #19  <Field PagerTitleStrip this$0>
		//    5   11:aload_0         
		//    6   12:getfield        #19  <Field PagerTitleStrip this$0>
		//    7   15:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//    8   18:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//    9   21:aload_0         
		//   10   22:getfield        #19  <Field PagerTitleStrip this$0>
		//   11   25:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   12   28:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
		//   13   31:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
				float f;
				if(mLastKnownPositionOffset >= 0.0F)
		//*  14   34:aload_0         
		//*  15   35:getfield        #19  <Field PagerTitleStrip this$0>
		//*  16   38:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//*  17   41:fconst_0        
		//*  18   42:fcmpl           
		//*  19   43:iflt            57
					f = mLastKnownPositionOffset;
		//   20   46:aload_0         
		//   21   47:getfield        #19  <Field PagerTitleStrip this$0>
		//   22   50:getfield        #52  <Field float PagerTitleStrip.mLastKnownPositionOffset>
		//   23   53:fstore_2        
				else
		//*  24   54:goto            59
					f = 0.0F;
		//   25   57:fconst_0        
		//   26   58:fstore_2        
				updateTextPositions(mPager.getCurrentItem(), f, true);
		//   27   59:aload_0         
		//   28   60:getfield        #19  <Field PagerTitleStrip this$0>
		//   29   63:aload_0         
		//   30   64:getfield        #19  <Field PagerTitleStrip this$0>
		//   31   67:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
		//   32   70:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
		//   33   73:fload_2         
		//   34   74:iconst_1        
		//   35   75:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
			}
		//   36   78:return          
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

	static interface PagerTitleStripImpl
	{

		public abstract void setSingleLineAllCaps(TextView textview);
	}

	static class PagerTitleStripImplBase
		implements PagerTitleStripImpl
	{

		public void setSingleLineAllCaps(TextView textview)
		{
			textview.setSingleLine();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #21  <Method void TextView.setSingleLine()>
		//    2    4:return          
		}

		PagerTitleStripImplBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class PagerTitleStripImplIcs
		implements PagerTitleStripImpl
	{

		public void setSingleLineAllCaps(TextView textview)
		{
			PagerTitleStripIcs.setSingleLineAllCaps(textview);
		//    0    0:aload_1         
		//    1    1:invokestatic    #20  <Method void PagerTitleStripIcs.setSingleLineAllCaps(TextView)>
		//    2    4:return          
		}

		PagerTitleStripImplIcs()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	public PagerTitleStrip(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #79  <Method void PagerTitleStrip(Context, AttributeSet)>
	//    4    6:return          
	}

	public PagerTitleStrip(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #80  <Method void ViewGroup(Context, AttributeSet)>
		mLastKnownCurrentPage = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #82  <Field int mLastKnownCurrentPage>
		mLastKnownPositionOffset = -1F;
	//    7   11:aload_0         
	//    8   12:ldc1            #83  <Float -1F>
	//    9   14:putfield        #85  <Field float mLastKnownPositionOffset>
		mPageListener = new PageListener();
	//   10   17:aload_0         
	//   11   18:new             #6   <Class PagerTitleStrip$PageListener>
	//   12   21:dup             
	//   13   22:aload_0         
	//   14   23:invokespecial   #88  <Method void PagerTitleStrip$PageListener(PagerTitleStrip)>
	//   15   26:putfield        #90  <Field PagerTitleStrip$PageListener mPageListener>
		TextView textview = new TextView(context);
	//   16   29:new             #92  <Class TextView>
	//   17   32:dup             
	//   18   33:aload_1         
	//   19   34:invokespecial   #94  <Method void TextView(Context)>
	//   20   37:astore          6
		mPrevText = textview;
	//   21   39:aload_0         
	//   22   40:aload           6
	//   23   42:putfield        #96  <Field TextView mPrevText>
		addView(((View) (textview)));
	//   24   45:aload_0         
	//   25   46:aload           6
	//   26   48:invokevirtual   #100 <Method void addView(View)>
		textview = new TextView(context);
	//   27   51:new             #92  <Class TextView>
	//   28   54:dup             
	//   29   55:aload_1         
	//   30   56:invokespecial   #94  <Method void TextView(Context)>
	//   31   59:astore          6
		mCurrText = textview;
	//   32   61:aload_0         
	//   33   62:aload           6
	//   34   64:putfield        #102 <Field TextView mCurrText>
		addView(((View) (textview)));
	//   35   67:aload_0         
	//   36   68:aload           6
	//   37   70:invokevirtual   #100 <Method void addView(View)>
		textview = new TextView(context);
	//   38   73:new             #92  <Class TextView>
	//   39   76:dup             
	//   40   77:aload_1         
	//   41   78:invokespecial   #94  <Method void TextView(Context)>
	//   42   81:astore          6
		mNextText = textview;
	//   43   83:aload_0         
	//   44   84:aload           6
	//   45   86:putfield        #104 <Field TextView mNextText>
		addView(((View) (textview)));
	//   46   89:aload_0         
	//   47   90:aload           6
	//   48   92:invokevirtual   #100 <Method void addView(View)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, ATTRS)));
	//   49   95:aload_1         
	//   50   96:aload_2         
	//   51   97:getstatic       #60  <Field int[] ATTRS>
	//   52  100:invokevirtual   #110 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   53  103:astore_2        
		int i = ((TypedArray) (attributeset)).getResourceId(0, 0);
	//   54  104:aload_2         
	//   55  105:iconst_0        
	//   56  106:iconst_0        
	//   57  107:invokevirtual   #116 <Method int TypedArray.getResourceId(int, int)>
	//   58  110:istore_3        
		if(i != 0)
	//*  59  111:iload_3         
	//*  60  112:ifeq            139
		{
			TextViewCompat.setTextAppearance(mPrevText, i);
	//   61  115:aload_0         
	//   62  116:getfield        #96  <Field TextView mPrevText>
	//   63  119:iload_3         
	//   64  120:invokestatic    #122 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			TextViewCompat.setTextAppearance(mCurrText, i);
	//   65  123:aload_0         
	//   66  124:getfield        #102 <Field TextView mCurrText>
	//   67  127:iload_3         
	//   68  128:invokestatic    #122 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			TextViewCompat.setTextAppearance(mNextText, i);
	//   69  131:aload_0         
	//   70  132:getfield        #104 <Field TextView mNextText>
	//   71  135:iload_3         
	//   72  136:invokestatic    #122 <Method void TextViewCompat.setTextAppearance(TextView, int)>
		}
		int j = ((TypedArray) (attributeset)).getDimensionPixelSize(1, 0);
	//   73  139:aload_2         
	//   74  140:iconst_1        
	//   75  141:iconst_0        
	//   76  142:invokevirtual   #125 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   77  145:istore          4
		if(j != 0)
	//*  78  147:iload           4
	//*  79  149:ifeq            160
			setTextSize(0, j);
	//   80  152:aload_0         
	//   81  153:iconst_0        
	//   82  154:iload           4
	//   83  156:i2f             
	//   84  157:invokevirtual   #129 <Method void setTextSize(int, float)>
		if(((TypedArray) (attributeset)).hasValue(2))
	//*  85  160:aload_2         
	//*  86  161:iconst_2        
	//*  87  162:invokevirtual   #133 <Method boolean TypedArray.hasValue(int)>
	//*  88  165:ifeq            203
		{
			int k = ((TypedArray) (attributeset)).getColor(2, 0);
	//   89  168:aload_2         
	//   90  169:iconst_2        
	//   91  170:iconst_0        
	//   92  171:invokevirtual   #136 <Method int TypedArray.getColor(int, int)>
	//   93  174:istore          4
			mPrevText.setTextColor(k);
	//   94  176:aload_0         
	//   95  177:getfield        #96  <Field TextView mPrevText>
	//   96  180:iload           4
	//   97  182:invokevirtual   #140 <Method void TextView.setTextColor(int)>
			mCurrText.setTextColor(k);
	//   98  185:aload_0         
	//   99  186:getfield        #102 <Field TextView mCurrText>
	//  100  189:iload           4
	//  101  191:invokevirtual   #140 <Method void TextView.setTextColor(int)>
			mNextText.setTextColor(k);
	//  102  194:aload_0         
	//  103  195:getfield        #104 <Field TextView mNextText>
	//  104  198:iload           4
	//  105  200:invokevirtual   #140 <Method void TextView.setTextColor(int)>
		}
		mGravity = ((TypedArray) (attributeset)).getInteger(3, 80);
	//  106  203:aload_0         
	//  107  204:aload_2         
	//  108  205:iconst_3        
	//  109  206:bipush          80
	//  110  208:invokevirtual   #143 <Method int TypedArray.getInteger(int, int)>
	//  111  211:putfield        #145 <Field int mGravity>
		((TypedArray) (attributeset)).recycle();
	//  112  214:aload_2         
	//  113  215:invokevirtual   #148 <Method void TypedArray.recycle()>
		mTextColor = mCurrText.getTextColors().getDefaultColor();
	//  114  218:aload_0         
	//  115  219:aload_0         
	//  116  220:getfield        #102 <Field TextView mCurrText>
	//  117  223:invokevirtual   #152 <Method ColorStateList TextView.getTextColors()>
	//  118  226:invokevirtual   #158 <Method int ColorStateList.getDefaultColor()>
	//  119  229:putfield        #160 <Field int mTextColor>
		setNonPrimaryAlpha(0.6F);
	//  120  232:aload_0         
	//  121  233:ldc1            #24  <Float 0.6F>
	//  122  235:invokevirtual   #164 <Method void setNonPrimaryAlpha(float)>
		mPrevText.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  123  238:aload_0         
	//  124  239:getfield        #96  <Field TextView mPrevText>
	//  125  242:getstatic       #170 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  126  245:invokevirtual   #174 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		mCurrText.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  127  248:aload_0         
	//  128  249:getfield        #102 <Field TextView mCurrText>
	//  129  252:getstatic       #170 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  130  255:invokevirtual   #174 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
		mNextText.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//  131  258:aload_0         
	//  132  259:getfield        #104 <Field TextView mNextText>
	//  133  262:getstatic       #170 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  134  265:invokevirtual   #174 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
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
	//  141  277:getstatic       #63  <Field int[] TEXT_ATTRS>
	//  142  280:invokevirtual   #177 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//  143  283:astore_2        
			flag = ((TypedArray) (attributeset)).getBoolean(0, false);
	//  144  284:aload_2         
	//  145  285:iconst_0        
	//  146  286:iconst_0        
	//  147  287:invokevirtual   #181 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  148  290:istore          5
			((TypedArray) (attributeset)).recycle();
	//  149  292:aload_2         
	//  150  293:invokevirtual   #148 <Method void TypedArray.recycle()>
		}
		if(flag)
	//* 151  296:iload           5
	//* 152  298:ifeq            325
		{
			setSingleLineAllCaps(mPrevText);
	//  153  301:aload_0         
	//  154  302:getfield        #96  <Field TextView mPrevText>
	//  155  305:invokestatic    #185 <Method void setSingleLineAllCaps(TextView)>
			setSingleLineAllCaps(mCurrText);
	//  156  308:aload_0         
	//  157  309:getfield        #102 <Field TextView mCurrText>
	//  158  312:invokestatic    #185 <Method void setSingleLineAllCaps(TextView)>
			setSingleLineAllCaps(mNextText);
	//  159  315:aload_0         
	//  160  316:getfield        #104 <Field TextView mNextText>
	//  161  319:invokestatic    #185 <Method void setSingleLineAllCaps(TextView)>
		} else
	//* 162  322:goto            346
		{
			mPrevText.setSingleLine();
	//  163  325:aload_0         
	//  164  326:getfield        #96  <Field TextView mPrevText>
	//  165  329:invokevirtual   #188 <Method void TextView.setSingleLine()>
			mCurrText.setSingleLine();
	//  166  332:aload_0         
	//  167  333:getfield        #102 <Field TextView mCurrText>
	//  168  336:invokevirtual   #188 <Method void TextView.setSingleLine()>
			mNextText.setSingleLine();
	//  169  339:aload_0         
	//  170  340:getfield        #104 <Field TextView mNextText>
	//  171  343:invokevirtual   #188 <Method void TextView.setSingleLine()>
		}
		mScaledTextSpacing = (int)(16F * context.getResources().getDisplayMetrics().density);
	//  172  346:aload_0         
	//  173  347:ldc1            #189 <Float 16F>
	//  174  349:aload_1         
	//  175  350:invokevirtual   #193 <Method Resources Context.getResources()>
	//  176  353:invokevirtual   #199 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  177  356:getfield        #204 <Field float DisplayMetrics.density>
	//  178  359:fmul            
	//  179  360:f2i             
	//  180  361:putfield        #206 <Field int mScaledTextSpacing>
	//  181  364:return          
	}

	private static void setSingleLineAllCaps(TextView textview)
	{
		IMPL.setSingleLineAllCaps(textview);
	//    0    0:getstatic       #73  <Field PagerTitleStrip$PagerTitleStripImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #207 <Method void PagerTitleStrip$PagerTitleStripImpl.setSingleLineAllCaps(TextView)>
	//    3    9:return          
	}

	int getMinHeight()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		Drawable drawable = getBackground();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #212 <Method Drawable getBackground()>
	//    4    6:astore_2        
		if(drawable != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          16
			i = drawable.getIntrinsicHeight();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #217 <Method int Drawable.getIntrinsicHeight()>
	//    9   15:istore_1        
		return i;
	//   10   16:iload_1         
	//   11   17:ireturn         
	}

	public int getTextSpacing()
	{
		return mScaledTextSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field int mScaledTextSpacing>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #221 <Method void ViewGroup.onAttachedToWindow()>
		Object obj = ((Object) (getParent()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #225 <Method android.view.ViewParent getParent()>
	//    4    8:astore_1        
		if(!(obj instanceof ViewPager))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #227 <Class ViewPager>
	//*   7   13:ifne            26
			throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
	//    8   16:new             #229 <Class IllegalStateException>
	//    9   19:dup             
	//   10   20:ldc1            #231 <String "PagerTitleStrip must be a direct child of a ViewPager.">
	//   11   22:invokespecial   #234 <Method void IllegalStateException(String)>
	//   12   25:athrow          
		obj = ((Object) ((ViewPager)obj));
	//   13   26:aload_1         
	//   14   27:checkcast       #227 <Class ViewPager>
	//   15   30:astore_1        
		PagerAdapter pageradapter = ((ViewPager) (obj)).getAdapter();
	//   16   31:aload_1         
	//   17   32:invokevirtual   #238 <Method PagerAdapter ViewPager.getAdapter()>
	//   18   35:astore_2        
		((ViewPager) (obj)).setInternalPageChangeListener(((ViewPager.OnPageChangeListener) (mPageListener)));
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:getfield        #90  <Field PagerTitleStrip$PageListener mPageListener>
	//   22   41:invokevirtual   #242 <Method ViewPager$OnPageChangeListener ViewPager.setInternalPageChangeListener(ViewPager$OnPageChangeListener)>
	//   23   44:pop             
		((ViewPager) (obj)).addOnAdapterChangeListener(((ViewPager.OnAdapterChangeListener) (mPageListener)));
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:getfield        #90  <Field PagerTitleStrip$PageListener mPageListener>
	//   27   50:invokevirtual   #246 <Method void ViewPager.addOnAdapterChangeListener(ViewPager$OnAdapterChangeListener)>
		mPager = ((ViewPager) (obj));
	//   28   53:aload_0         
	//   29   54:aload_1         
	//   30   55:putfield        #248 <Field ViewPager mPager>
		if(mWatchingAdapter != null)
	//*  31   58:aload_0         
	//*  32   59:getfield        #250 <Field WeakReference mWatchingAdapter>
	//*  33   62:ifnull          79
			obj = ((Object) ((PagerAdapter)mWatchingAdapter.get()));
	//   34   65:aload_0         
	//   35   66:getfield        #250 <Field WeakReference mWatchingAdapter>
	//   36   69:invokevirtual   #256 <Method Object WeakReference.get()>
	//   37   72:checkcast       #258 <Class PagerAdapter>
	//   38   75:astore_1        
		else
	//*  39   76:goto            81
			obj = null;
	//   40   79:aconst_null     
	//   41   80:astore_1        
		updateAdapter(((PagerAdapter) (obj)), pageradapter);
	//   42   81:aload_0         
	//   43   82:aload_1         
	//   44   83:aload_2         
	//   45   84:invokevirtual   #262 <Method void updateAdapter(PagerAdapter, PagerAdapter)>
	//   46   87:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #265 <Method void ViewGroup.onDetachedFromWindow()>
		if(mPager != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #248 <Field ViewPager mPager>
	//*   4    8:ifnull          48
		{
			updateAdapter(mPager.getAdapter(), ((PagerAdapter) (null)));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #248 <Field ViewPager mPager>
	//    8   16:invokevirtual   #238 <Method PagerAdapter ViewPager.getAdapter()>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #262 <Method void updateAdapter(PagerAdapter, PagerAdapter)>
			mPager.setInternalPageChangeListener(((ViewPager.OnPageChangeListener) (null)));
	//   11   23:aload_0         
	//   12   24:getfield        #248 <Field ViewPager mPager>
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #242 <Method ViewPager$OnPageChangeListener ViewPager.setInternalPageChangeListener(ViewPager$OnPageChangeListener)>
	//   15   31:pop             
			mPager.removeOnAdapterChangeListener(((ViewPager.OnAdapterChangeListener) (mPageListener)));
	//   16   32:aload_0         
	//   17   33:getfield        #248 <Field ViewPager mPager>
	//   18   36:aload_0         
	//   19   37:getfield        #90  <Field PagerTitleStrip$PageListener mPageListener>
	//   20   40:invokevirtual   #268 <Method void ViewPager.removeOnAdapterChangeListener(ViewPager$OnAdapterChangeListener)>
			mPager = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #248 <Field ViewPager mPager>
		}
	//   24   48:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(mPager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #248 <Field ViewPager mPager>
	//*   2    4:ifnull          39
		{
			float f;
			if(mLastKnownPositionOffset >= 0.0F)
	//*   3    7:aload_0         
	//*   4    8:getfield        #85  <Field float mLastKnownPositionOffset>
	//*   5   11:fconst_0        
	//*   6   12:fcmpl           
	//*   7   13:iflt            25
				f = mLastKnownPositionOffset;
	//    8   16:aload_0         
	//    9   17:getfield        #85  <Field float mLastKnownPositionOffset>
	//   10   20:fstore          6
			else
	//*  11   22:goto            28
				f = 0.0F;
	//   12   25:fconst_0        
	//   13   26:fstore          6
			updateTextPositions(mLastKnownCurrentPage, f, true);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #82  <Field int mLastKnownCurrentPage>
	//   17   33:fload           6
	//   18   35:iconst_1        
	//   19   36:invokevirtual   #274 <Method void updateTextPositions(int, float, boolean)>
		}
	//   20   39:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(android.view.View.MeasureSpec.getMode(i) != 0x40000000)
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #282 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   2    4:ldc2            #283 <Int 0x40000000>
	//*   3    7:icmpeq          21
			throw new IllegalStateException("Must measure with an exact width");
	//    4   10:new             #229 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc2            #285 <String "Must measure with an exact width">
	//    7   17:invokespecial   #234 <Method void IllegalStateException(String)>
	//    8   20:athrow          
		int l = getPaddingTop() + getPaddingBottom();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #288 <Method int getPaddingTop()>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #291 <Method int getPaddingBottom()>
	//   13   29:iadd            
	//   14   30:istore          4
		int i1 = getChildMeasureSpec(j, l, -2);
	//   15   32:iload_2         
	//   16   33:iload           4
	//   17   35:bipush          -2
	//   18   37:invokestatic    #295 <Method int getChildMeasureSpec(int, int, int)>
	//   19   40:istore          5
		int k = android.view.View.MeasureSpec.getSize(i);
	//   20   42:iload_1         
	//   21   43:invokestatic    #298 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   22   46:istore_3        
		i = getChildMeasureSpec(i, (int)((float)k * 0.2F), -2);
	//   23   47:iload_1         
	//   24   48:iload_3         
	//   25   49:i2f             
	//   26   50:ldc2            #299 <Float 0.2F>
	//   27   53:fmul            
	//   28   54:f2i             
	//   29   55:bipush          -2
	//   30   57:invokestatic    #295 <Method int getChildMeasureSpec(int, int, int)>
	//   31   60:istore_1        
		mPrevText.measure(i, i1);
	//   32   61:aload_0         
	//   33   62:getfield        #96  <Field TextView mPrevText>
	//   34   65:iload_1         
	//   35   66:iload           5
	//   36   68:invokevirtual   #302 <Method void TextView.measure(int, int)>
		mCurrText.measure(i, i1);
	//   37   71:aload_0         
	//   38   72:getfield        #102 <Field TextView mCurrText>
	//   39   75:iload_1         
	//   40   76:iload           5
	//   41   78:invokevirtual   #302 <Method void TextView.measure(int, int)>
		mNextText.measure(i, i1);
	//   42   81:aload_0         
	//   43   82:getfield        #104 <Field TextView mNextText>
	//   44   85:iload_1         
	//   45   86:iload           5
	//   46   88:invokevirtual   #302 <Method void TextView.measure(int, int)>
		if(android.view.View.MeasureSpec.getMode(j) == 0x40000000)
	//*  47   91:iload_2         
	//*  48   92:invokestatic    #282 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  49   95:ldc2            #283 <Int 0x40000000>
	//*  50   98:icmpne          109
		{
			i = android.view.View.MeasureSpec.getSize(j);
	//   51  101:iload_2         
	//   52  102:invokestatic    #298 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   53  105:istore_1        
		} else
	//*  54  106:goto            129
		{
			i = mCurrText.getMeasuredHeight();
	//   55  109:aload_0         
	//   56  110:getfield        #102 <Field TextView mCurrText>
	//   57  113:invokevirtual   #305 <Method int TextView.getMeasuredHeight()>
	//   58  116:istore_1        
			i = Math.max(getMinHeight(), i + l);
	//   59  117:aload_0         
	//   60  118:invokevirtual   #307 <Method int getMinHeight()>
	//   61  121:iload_1         
	//   62  122:iload           4
	//   63  124:iadd            
	//   64  125:invokestatic    #312 <Method int Math.max(int, int)>
	//   65  128:istore_1        
		}
		setMeasuredDimension(k, View.resolveSizeAndState(i, j, mCurrText.getMeasuredState() << 16));
	//   66  129:aload_0         
	//   67  130:iload_3         
	//   68  131:iload_1         
	//   69  132:iload_2         
	//   70  133:aload_0         
	//   71  134:getfield        #102 <Field TextView mCurrText>
	//   72  137:invokevirtual   #315 <Method int TextView.getMeasuredState()>
	//   73  140:bipush          16
	//   74  142:ishl            
	//   75  143:invokestatic    #320 <Method int View.resolveSizeAndState(int, int, int)>
	//   76  146:invokevirtual   #323 <Method void setMeasuredDimension(int, int)>
	//   77  149:return          
	}

	public void requestLayout()
	{
		if(!mUpdatingText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #326 <Field boolean mUpdatingText>
	//*   2    4:ifne            11
			super.requestLayout();
	//    3    7:aload_0         
	//    4    8:invokespecial   #328 <Method void ViewGroup.requestLayout()>
	//    5   11:return          
	}

	public void setGravity(int i)
	{
		mGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #145 <Field int mGravity>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #330 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setNonPrimaryAlpha(float f)
	{
		mNonPrimaryAlpha = (int)(255F * f) & 0xff;
	//    0    0:aload_0         
	//    1    1:ldc2            #338 <Float 255F>
	//    2    4:fload_1         
	//    3    5:fmul            
	//    4    6:f2i             
	//    5    7:sipush          255
	//    6   10:iand            
	//    7   11:putfield        #340 <Field int mNonPrimaryAlpha>
		int i = mNonPrimaryAlpha << 24 | mTextColor & 0xffffff;
	//    8   14:aload_0         
	//    9   15:getfield        #340 <Field int mNonPrimaryAlpha>
	//   10   18:bipush          24
	//   11   20:ishl            
	//   12   21:aload_0         
	//   13   22:getfield        #160 <Field int mTextColor>
	//   14   25:ldc2            #341 <Int 0xffffff>
	//   15   28:iand            
	//   16   29:ior             
	//   17   30:istore_2        
		mPrevText.setTextColor(i);
	//   18   31:aload_0         
	//   19   32:getfield        #96  <Field TextView mPrevText>
	//   20   35:iload_2         
	//   21   36:invokevirtual   #140 <Method void TextView.setTextColor(int)>
		mNextText.setTextColor(i);
	//   22   39:aload_0         
	//   23   40:getfield        #104 <Field TextView mNextText>
	//   24   43:iload_2         
	//   25   44:invokevirtual   #140 <Method void TextView.setTextColor(int)>
	//   26   47:return          
	}

	public void setTextColor(int i)
	{
		mTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #160 <Field int mTextColor>
		mCurrText.setTextColor(i);
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field TextView mCurrText>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #140 <Method void TextView.setTextColor(int)>
		i = mNonPrimaryAlpha << 24 | mTextColor & 0xffffff;
	//    7   13:aload_0         
	//    8   14:getfield        #340 <Field int mNonPrimaryAlpha>
	//    9   17:bipush          24
	//   10   19:ishl            
	//   11   20:aload_0         
	//   12   21:getfield        #160 <Field int mTextColor>
	//   13   24:ldc2            #341 <Int 0xffffff>
	//   14   27:iand            
	//   15   28:ior             
	//   16   29:istore_1        
		mPrevText.setTextColor(i);
	//   17   30:aload_0         
	//   18   31:getfield        #96  <Field TextView mPrevText>
	//   19   34:iload_1         
	//   20   35:invokevirtual   #140 <Method void TextView.setTextColor(int)>
		mNextText.setTextColor(i);
	//   21   38:aload_0         
	//   22   39:getfield        #104 <Field TextView mNextText>
	//   23   42:iload_1         
	//   24   43:invokevirtual   #140 <Method void TextView.setTextColor(int)>
	//   25   46:return          
	}

	public void setTextSize(int i, float f)
	{
		mPrevText.setTextSize(i, f);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field TextView mPrevText>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #344 <Method void TextView.setTextSize(int, float)>
		mCurrText.setTextSize(i, f);
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field TextView mCurrText>
	//    7   13:iload_1         
	//    8   14:fload_2         
	//    9   15:invokevirtual   #344 <Method void TextView.setTextSize(int, float)>
		mNextText.setTextSize(i, f);
	//   10   18:aload_0         
	//   11   19:getfield        #104 <Field TextView mNextText>
	//   12   22:iload_1         
	//   13   23:fload_2         
	//   14   24:invokevirtual   #344 <Method void TextView.setTextSize(int, float)>
	//   15   27:return          
	}

	public void setTextSpacing(int i)
	{
		mScaledTextSpacing = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #206 <Field int mScaledTextSpacing>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #330 <Method void requestLayout()>
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
	//    4    6:getfield        #90  <Field PagerTitleStrip$PageListener mPageListener>
	//    5    9:invokevirtual   #349 <Method void PagerAdapter.unregisterDataSetObserver(DataSetObserver)>
			mWatchingAdapter = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #250 <Field WeakReference mWatchingAdapter>
		}
		if(pageradapter1 != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          41
		{
			pageradapter1.registerDataSetObserver(((DataSetObserver) (mPageListener)));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:getfield        #90  <Field PagerTitleStrip$PageListener mPageListener>
	//   14   26:invokevirtual   #352 <Method void PagerAdapter.registerDataSetObserver(DataSetObserver)>
			mWatchingAdapter = new WeakReference(((Object) (pageradapter1)));
	//   15   29:aload_0         
	//   16   30:new             #252 <Class WeakReference>
	//   17   33:dup             
	//   18   34:aload_2         
	//   19   35:invokespecial   #355 <Method void WeakReference(Object)>
	//   20   38:putfield        #250 <Field WeakReference mWatchingAdapter>
		}
		if(mPager != null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #248 <Field ViewPager mPager>
	//*  23   45:ifnull          75
		{
			mLastKnownCurrentPage = -1;
	//   24   48:aload_0         
	//   25   49:iconst_m1       
	//   26   50:putfield        #82  <Field int mLastKnownCurrentPage>
			mLastKnownPositionOffset = -1F;
	//   27   53:aload_0         
	//   28   54:ldc1            #83  <Float -1F>
	//   29   56:putfield        #85  <Field float mLastKnownPositionOffset>
			updateText(mPager.getCurrentItem(), pageradapter1);
	//   30   59:aload_0         
	//   31   60:aload_0         
	//   32   61:getfield        #248 <Field ViewPager mPager>
	//   33   64:invokevirtual   #358 <Method int ViewPager.getCurrentItem()>
	//   34   67:aload_2         
	//   35   68:invokevirtual   #362 <Method void updateText(int, PagerAdapter)>
			requestLayout();
	//   36   71:aload_0         
	//   37   72:invokevirtual   #330 <Method void requestLayout()>
		}
	//   38   75:return          
	}

	void updateText(int i, PagerAdapter pageradapter)
	{
		int j;
		if(pageradapter != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			j = pageradapter.getCount();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #365 <Method int PagerAdapter.getCount()>
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			j = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		mUpdatingText = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #326 <Field boolean mUpdatingText>
		TextView textview = null;
	//   11   19:aconst_null     
	//   12   20:astore          6
		CharSequence charsequence = ((CharSequence) (textview));
	//   13   22:aload           6
	//   14   24:astore          5
		if(i >= 1)
	//*  15   26:iload_1         
	//*  16   27:iconst_1        
	//*  17   28:icmplt          48
		{
			charsequence = ((CharSequence) (textview));
	//   18   31:aload           6
	//   19   33:astore          5
			if(pageradapter != null)
	//*  20   35:aload_2         
	//*  21   36:ifnull          48
				charsequence = pageradapter.getPageTitle(i - 1);
	//   22   39:aload_2         
	//   23   40:iload_1         
	//   24   41:iconst_1        
	//   25   42:isub            
	//   26   43:invokevirtual   #369 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//   27   46:astore          5
		}
		mPrevText.setText(charsequence);
	//   28   48:aload_0         
	//   29   49:getfield        #96  <Field TextView mPrevText>
	//   30   52:aload           5
	//   31   54:invokevirtual   #373 <Method void TextView.setText(CharSequence)>
		textview = mCurrText;
	//   32   57:aload_0         
	//   33   58:getfield        #102 <Field TextView mCurrText>
	//   34   61:astore          6
		if(pageradapter != null && i < j)
	//*  35   63:aload_2         
	//*  36   64:ifnull          82
	//*  37   67:iload_1         
	//*  38   68:iload_3         
	//*  39   69:icmpge          82
			charsequence = pageradapter.getPageTitle(i);
	//   40   72:aload_2         
	//   41   73:iload_1         
	//   42   74:invokevirtual   #369 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//   43   77:astore          5
		else
	//*  44   79:goto            85
			charsequence = null;
	//   45   82:aconst_null     
	//   46   83:astore          5
		textview.setText(charsequence);
	//   47   85:aload           6
	//   48   87:aload           5
	//   49   89:invokevirtual   #373 <Method void TextView.setText(CharSequence)>
		textview = null;
	//   50   92:aconst_null     
	//   51   93:astore          6
		charsequence = ((CharSequence) (textview));
	//   52   95:aload           6
	//   53   97:astore          5
		if(i + 1 < j)
	//*  54   99:iload_1         
	//*  55  100:iconst_1        
	//*  56  101:iadd            
	//*  57  102:iload_3         
	//*  58  103:icmpge          123
		{
			charsequence = ((CharSequence) (textview));
	//   59  106:aload           6
	//   60  108:astore          5
			if(pageradapter != null)
	//*  61  110:aload_2         
	//*  62  111:ifnull          123
				charsequence = pageradapter.getPageTitle(i + 1);
	//   63  114:aload_2         
	//   64  115:iload_1         
	//   65  116:iconst_1        
	//   66  117:iadd            
	//   67  118:invokevirtual   #369 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//   68  121:astore          5
		}
		mNextText.setText(charsequence);
	//   69  123:aload_0         
	//   70  124:getfield        #104 <Field TextView mNextText>
	//   71  127:aload           5
	//   72  129:invokevirtual   #373 <Method void TextView.setText(CharSequence)>
		j = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((float)(getWidth() - getPaddingLeft() - getPaddingRight()) * 0.8F)), 0x80000000);
	//   73  132:iconst_0        
	//   74  133:aload_0         
	//   75  134:invokevirtual   #376 <Method int getWidth()>
	//   76  137:aload_0         
	//   77  138:invokevirtual   #379 <Method int getPaddingLeft()>
	//   78  141:isub            
	//   79  142:aload_0         
	//   80  143:invokevirtual   #382 <Method int getPaddingRight()>
	//   81  146:isub            
	//   82  147:i2f             
	//   83  148:ldc2            #383 <Float 0.8F>
	//   84  151:fmul            
	//   85  152:f2i             
	//   86  153:invokestatic    #312 <Method int Math.max(int, int)>
	//   87  156:ldc2            #384 <Int 0x80000000>
	//   88  159:invokestatic    #387 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   89  162:istore_3        
		int k = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), 0x80000000);
	//   90  163:iconst_0        
	//   91  164:aload_0         
	//   92  165:invokevirtual   #390 <Method int getHeight()>
	//   93  168:aload_0         
	//   94  169:invokevirtual   #288 <Method int getPaddingTop()>
	//   95  172:isub            
	//   96  173:aload_0         
	//   97  174:invokevirtual   #291 <Method int getPaddingBottom()>
	//   98  177:isub            
	//   99  178:invokestatic    #312 <Method int Math.max(int, int)>
	//  100  181:ldc2            #384 <Int 0x80000000>
	//  101  184:invokestatic    #387 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  102  187:istore          4
		mPrevText.measure(j, k);
	//  103  189:aload_0         
	//  104  190:getfield        #96  <Field TextView mPrevText>
	//  105  193:iload_3         
	//  106  194:iload           4
	//  107  196:invokevirtual   #302 <Method void TextView.measure(int, int)>
		mCurrText.measure(j, k);
	//  108  199:aload_0         
	//  109  200:getfield        #102 <Field TextView mCurrText>
	//  110  203:iload_3         
	//  111  204:iload           4
	//  112  206:invokevirtual   #302 <Method void TextView.measure(int, int)>
		mNextText.measure(j, k);
	//  113  209:aload_0         
	//  114  210:getfield        #104 <Field TextView mNextText>
	//  115  213:iload_3         
	//  116  214:iload           4
	//  117  216:invokevirtual   #302 <Method void TextView.measure(int, int)>
		mLastKnownCurrentPage = i;
	//  118  219:aload_0         
	//  119  220:iload_1         
	//  120  221:putfield        #82  <Field int mLastKnownCurrentPage>
		if(!mUpdatingPositions)
	//* 121  224:aload_0         
	//* 122  225:getfield        #392 <Field boolean mUpdatingPositions>
	//* 123  228:ifne            241
			updateTextPositions(i, mLastKnownPositionOffset, false);
	//  124  231:aload_0         
	//  125  232:iload_1         
	//  126  233:aload_0         
	//  127  234:getfield        #85  <Field float mLastKnownPositionOffset>
	//  128  237:iconst_0        
	//  129  238:invokevirtual   #274 <Method void updateTextPositions(int, float, boolean)>
		mUpdatingText = false;
	//  130  241:aload_0         
	//  131  242:iconst_0        
	//  132  243:putfield        #326 <Field boolean mUpdatingText>
	//  133  246:return          
	}

	void updateTextPositions(int i, float f, boolean flag)
	{
		if(i != mLastKnownCurrentPage)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #82  <Field int mLastKnownCurrentPage>
	//*   3    5:icmpeq          23
			updateText(i, mPager.getAdapter());
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #248 <Field ViewPager mPager>
	//    8   14:invokevirtual   #238 <Method PagerAdapter ViewPager.getAdapter()>
	//    9   17:invokevirtual   #362 <Method void updateText(int, PagerAdapter)>
		else
	//*  10   20:goto            37
		if(!flag && f == mLastKnownPositionOffset)
	//*  11   23:iload_3         
	//*  12   24:ifne            37
	//*  13   27:fload_2         
	//*  14   28:aload_0         
	//*  15   29:getfield        #85  <Field float mLastKnownPositionOffset>
	//*  16   32:fcmpl           
	//*  17   33:ifne            37
			return;
	//   18   36:return          
		mUpdatingPositions = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #392 <Field boolean mUpdatingPositions>
		int i1 = mPrevText.getMeasuredWidth();
	//   22   42:aload_0         
	//   23   43:getfield        #96  <Field TextView mPrevText>
	//   24   46:invokevirtual   #395 <Method int TextView.getMeasuredWidth()>
	//   25   49:istore          9
		int j2 = mCurrText.getMeasuredWidth();
	//   26   51:aload_0         
	//   27   52:getfield        #102 <Field TextView mCurrText>
	//   28   55:invokevirtual   #395 <Method int TextView.getMeasuredWidth()>
	//   29   58:istore          14
		int l = mNextText.getMeasuredWidth();
	//   30   60:aload_0         
	//   31   61:getfield        #104 <Field TextView mNextText>
	//   32   64:invokevirtual   #395 <Method int TextView.getMeasuredWidth()>
	//   33   67:istore          8
		int i2 = j2 / 2;
	//   34   69:iload           14
	//   35   71:iconst_2        
	//   36   72:idiv            
	//   37   73:istore          13
		int j1 = getWidth();
	//   38   75:aload_0         
	//   39   76:invokevirtual   #376 <Method int getWidth()>
	//   40   79:istore          10
		i = getHeight();
	//   41   81:aload_0         
	//   42   82:invokevirtual   #390 <Method int getHeight()>
	//   43   85:istore_1        
		int l1 = getPaddingLeft();
	//   44   86:aload_0         
	//   45   87:invokevirtual   #379 <Method int getPaddingLeft()>
	//   46   90:istore          12
		int k1 = getPaddingRight();
	//   47   92:aload_0         
	//   48   93:invokevirtual   #382 <Method int getPaddingRight()>
	//   49   96:istore          11
		int j = getPaddingTop();
	//   50   98:aload_0         
	//   51   99:invokevirtual   #288 <Method int getPaddingTop()>
	//   52  102:istore          6
		int k = getPaddingBottom();
	//   53  104:aload_0         
	//   54  105:invokevirtual   #291 <Method int getPaddingBottom()>
	//   55  108:istore          7
		int k2 = k1 + i2;
	//   56  110:iload           11
	//   57  112:iload           13
	//   58  114:iadd            
	//   59  115:istore          15
		float f2 = f + 0.5F;
	//   60  117:fload_2         
	//   61  118:ldc2            #396 <Float 0.5F>
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
		i2 = j1 - k2 - (int)((float)(j1 - (l1 + i2) - k2) * f1) - j2 / 2;
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
	//   89  163:iload           14
	//   90  165:iconst_2        
	//   91  166:idiv            
	//   92  167:isub            
	//   93  168:istore          13
		j2 = i2 + j2;
	//   94  170:iload           13
	//   95  172:iload           14
	//   96  174:iadd            
	//   97  175:istore          14
		int i3 = mPrevText.getBaseline();
	//   98  177:aload_0         
	//   99  178:getfield        #96  <Field TextView mPrevText>
	//  100  181:invokevirtual   #399 <Method int TextView.getBaseline()>
	//  101  184:istore          17
		int l2 = mCurrText.getBaseline();
	//  102  186:aload_0         
	//  103  187:getfield        #102 <Field TextView mCurrText>
	//  104  190:invokevirtual   #399 <Method int TextView.getBaseline()>
	//  105  193:istore          16
		k2 = mNextText.getBaseline();
	//  106  195:aload_0         
	//  107  196:getfield        #104 <Field TextView mNextText>
	//  108  199:invokevirtual   #399 <Method int TextView.getBaseline()>
	//  109  202:istore          15
		int j3 = Math.max(Math.max(i3, l2), k2);
	//  110  204:iload           17
	//  111  206:iload           16
	//  112  208:invokestatic    #312 <Method int Math.max(int, int)>
	//  113  211:iload           15
	//  114  213:invokestatic    #312 <Method int Math.max(int, int)>
	//  115  216:istore          18
		i3 = j3 - i3;
	//  116  218:iload           18
	//  117  220:iload           17
	//  118  222:isub            
	//  119  223:istore          17
		l2 = j3 - l2;
	//  120  225:iload           18
	//  121  227:iload           16
	//  122  229:isub            
	//  123  230:istore          16
		k2 = j3 - k2;
	//  124  232:iload           18
	//  125  234:iload           15
	//  126  236:isub            
	//  127  237:istore          15
		j3 = mPrevText.getMeasuredHeight();
	//  128  239:aload_0         
	//  129  240:getfield        #96  <Field TextView mPrevText>
	//  130  243:invokevirtual   #305 <Method int TextView.getMeasuredHeight()>
	//  131  246:istore          18
		int k3 = mCurrText.getMeasuredHeight();
	//  132  248:aload_0         
	//  133  249:getfield        #102 <Field TextView mCurrText>
	//  134  252:invokevirtual   #305 <Method int TextView.getMeasuredHeight()>
	//  135  255:istore          19
		int l3 = mNextText.getMeasuredHeight();
	//  136  257:aload_0         
	//  137  258:getfield        #104 <Field TextView mNextText>
	//  138  261:invokevirtual   #305 <Method int TextView.getMeasuredHeight()>
	//  139  264:istore          20
		j3 = Math.max(Math.max(i3 + j3, l2 + k3), k2 + l3);
	//  140  266:iload           17
	//  141  268:iload           18
	//  142  270:iadd            
	//  143  271:iload           16
	//  144  273:iload           19
	//  145  275:iadd            
	//  146  276:invokestatic    #312 <Method int Math.max(int, int)>
	//  147  279:iload           15
	//  148  281:iload           20
	//  149  283:iadd            
	//  150  284:invokestatic    #312 <Method int Math.max(int, int)>
	//  151  287:istore          18
		switch(mGravity & 0x70)
	//* 152  289:aload_0         
	//* 153  290:getfield        #145 <Field int mGravity>
	//* 154  293:bipush          112
	//* 155  295:iand            
		{
	//* 156  296:lookupswitch    3: default 332
	//	               16: 355
	//	               48: 332
	//	               80: 392
		case 48: // '0'
		default:
			i = j + i3;
	//  157  332:iload           6
	//  158  334:iload           17
	//  159  336:iadd            
	//  160  337:istore_1        
			k = j + l2;
	//  161  338:iload           6
	//  162  340:iload           16
	//  163  342:iadd            
	//  164  343:istore          7
			j += k2;
	//  165  345:iload           6
	//  166  347:iload           15
	//  167  349:iadd            
	//  168  350:istore          6
			break;

	//* 169  352:goto            421
		case 16: // '\020'
			j = (i - j - k - j3) / 2;
	//  170  355:iload_1         
	//  171  356:iload           6
	//  172  358:isub            
	//  173  359:iload           7
	//  174  361:isub            
	//  175  362:iload           18
	//  176  364:isub            
	//  177  365:iconst_2        
	//  178  366:idiv            
	//  179  367:istore          6
			i = j + i3;
	//  180  369:iload           6
	//  181  371:iload           17
	//  182  373:iadd            
	//  183  374:istore_1        
			k = j + l2;
	//  184  375:iload           6
	//  185  377:iload           16
	//  186  379:iadd            
	//  187  380:istore          7
			j += k2;
	//  188  382:iload           6
	//  189  384:iload           15
	//  190  386:iadd            
	//  191  387:istore          6
			break;

	//* 192  389:goto            421
		case 80: // 'P'
			j = i - k - j3;
	//  193  392:iload_1         
	//  194  393:iload           7
	//  195  395:isub            
	//  196  396:iload           18
	//  197  398:isub            
	//  198  399:istore          6
			i = j + i3;
	//  199  401:iload           6
	//  200  403:iload           17
	//  201  405:iadd            
	//  202  406:istore_1        
			k = j + l2;
	//  203  407:iload           6
	//  204  409:iload           16
	//  205  411:iadd            
	//  206  412:istore          7
			j += k2;
	//  207  414:iload           6
	//  208  416:iload           15
	//  209  418:iadd            
	//  210  419:istore          6
			break;
		}
		mCurrText.layout(i2, k, j2, mCurrText.getMeasuredHeight() + k);
	//  211  421:aload_0         
	//  212  422:getfield        #102 <Field TextView mCurrText>
	//  213  425:iload           13
	//  214  427:iload           7
	//  215  429:iload           14
	//  216  431:aload_0         
	//  217  432:getfield        #102 <Field TextView mCurrText>
	//  218  435:invokevirtual   #305 <Method int TextView.getMeasuredHeight()>
	//  219  438:iload           7
	//  220  440:iadd            
	//  221  441:invokevirtual   #403 <Method void TextView.layout(int, int, int, int)>
		k = Math.min(l1, i2 - mScaledTextSpacing - i1);
	//  222  444:iload           12
	//  223  446:iload           13
	//  224  448:aload_0         
	//  225  449:getfield        #206 <Field int mScaledTextSpacing>
	//  226  452:isub            
	//  227  453:iload           9
	//  228  455:isub            
	//  229  456:invokestatic    #406 <Method int Math.min(int, int)>
	//  230  459:istore          7
		mPrevText.layout(k, i, k + i1, mPrevText.getMeasuredHeight() + i);
	//  231  461:aload_0         
	//  232  462:getfield        #96  <Field TextView mPrevText>
	//  233  465:iload           7
	//  234  467:iload_1         
	//  235  468:iload           7
	//  236  470:iload           9
	//  237  472:iadd            
	//  238  473:aload_0         
	//  239  474:getfield        #96  <Field TextView mPrevText>
	//  240  477:invokevirtual   #305 <Method int TextView.getMeasuredHeight()>
	//  241  480:iload_1         
	//  242  481:iadd            
	//  243  482:invokevirtual   #403 <Method void TextView.layout(int, int, int, int)>
		i = Math.max(j1 - k1 - l, mScaledTextSpacing + j2);
	//  244  485:iload           10
	//  245  487:iload           11
	//  246  489:isub            
	//  247  490:iload           8
	//  248  492:isub            
	//  249  493:aload_0         
	//  250  494:getfield        #206 <Field int mScaledTextSpacing>
	//  251  497:iload           14
	//  252  499:iadd            
	//  253  500:invokestatic    #312 <Method int Math.max(int, int)>
	//  254  503:istore_1        
		mNextText.layout(i, j, i + l, mNextText.getMeasuredHeight() + j);
	//  255  504:aload_0         
	//  256  505:getfield        #104 <Field TextView mNextText>
	//  257  508:iload_1         
	//  258  509:iload           6
	//  259  511:iload_1         
	//  260  512:iload           8
	//  261  514:iadd            
	//  262  515:aload_0         
	//  263  516:getfield        #104 <Field TextView mNextText>
	//  264  519:invokevirtual   #305 <Method int TextView.getMeasuredHeight()>
	//  265  522:iload           6
	//  266  524:iadd            
	//  267  525:invokevirtual   #403 <Method void TextView.layout(int, int, int, int)>
		mLastKnownPositionOffset = f;
	//  268  528:aload_0         
	//  269  529:fload_2         
	//  270  530:putfield        #85  <Field float mLastKnownPositionOffset>
		mUpdatingPositions = false;
	//  271  533:aload_0         
	//  272  534:iconst_0        
	//  273  535:putfield        #392 <Field boolean mUpdatingPositions>
	//  274  538:return          
	}

	private static final int ATTRS[] = {
		0x1010034, 0x1010095, 0x1010098, 0x10100af
	};
	private static final PagerTitleStripImpl IMPL;
	private static final float SIDE_ALPHA = 0.6F;
	private static final String TAG = "PagerTitleStrip";
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
	//    4    5:ldc1            #55  <Int 0x1010034>
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #56  <Int 0x1010095>
	//    9   12:iastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #57  <Int 0x1010098>
	//   13   17:iastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #58  <Int 0x10100af>
	//   17   22:iastore         
	//   18   23:putstatic       #60  <Field int[] ATTRS>
	//   19   26:iconst_1        
	//   20   27:newarray        int[]
	//   21   29:dup             
	//   22   30:iconst_0        
	//   23   31:ldc1            #61  <Int 0x101038c>
	//   24   33:iastore         
	//   25   34:putstatic       #63  <Field int[] TEXT_ATTRS>
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  26   37:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   40:bipush          14
	//*  28   42:icmplt          56
			IMPL = ((PagerTitleStripImpl) (new PagerTitleStripImplIcs()));
	//   29   45:new             #15  <Class PagerTitleStrip$PagerTitleStripImplIcs>
	//   30   48:dup             
	//   31   49:invokespecial   #71  <Method void PagerTitleStrip$PagerTitleStripImplIcs()>
	//   32   52:putstatic       #73  <Field PagerTitleStrip$PagerTitleStripImpl IMPL>
	//   33   55:return          
		else
			IMPL = ((PagerTitleStripImpl) (new PagerTitleStripImplBase()));
	//   34   56:new             #12  <Class PagerTitleStrip$PagerTitleStripImplBase>
	//   35   59:dup             
	//   36   60:invokespecial   #74  <Method void PagerTitleStrip$PagerTitleStripImplBase()>
	//   37   63:putstatic       #73  <Field PagerTitleStrip$PagerTitleStripImpl IMPL>
	//*  38   66:return          
	}
}
