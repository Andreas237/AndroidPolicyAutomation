// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.TextView;

// Referenced classes of package android.support.v4.view:
//			PagerTitleStrip, ViewPager

public class PagerTabStrip extends PagerTitleStrip
{

	public PagerTabStrip(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #52  <Method void PagerTabStrip(Context, AttributeSet)>
	//    4    6:return          
	}

	public PagerTabStrip(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #56  <Method void PagerTitleStrip(Context, AttributeSet)>
		mTabPaint = new Paint();
	//    4    6:aload_0         
	//    5    7:new             #58  <Class Paint>
	//    6   10:dup             
	//    7   11:invokespecial   #61  <Method void Paint()>
	//    8   14:putfield        #63  <Field Paint mTabPaint>
		mTempRect = new Rect();
	//    9   17:aload_0         
	//   10   18:new             #65  <Class Rect>
	//   11   21:dup             
	//   12   22:invokespecial   #66  <Method void Rect()>
	//   13   25:putfield        #68  <Field Rect mTempRect>
		mTabAlpha = 255;
	//   14   28:aload_0         
	//   15   29:sipush          255
	//   16   32:putfield        #70  <Field int mTabAlpha>
		mDrawFullUnderline = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #72  <Field boolean mDrawFullUnderline>
		mDrawFullUnderlineSet = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #74  <Field boolean mDrawFullUnderlineSet>
		mIndicatorColor = mTextColor;
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #77  <Field int mTextColor>
	//   26   50:putfield        #79  <Field int mIndicatorColor>
		mTabPaint.setColor(mIndicatorColor);
	//   27   53:aload_0         
	//   28   54:getfield        #63  <Field Paint mTabPaint>
	//   29   57:aload_0         
	//   30   58:getfield        #79  <Field int mIndicatorColor>
	//   31   61:invokevirtual   #83  <Method void Paint.setColor(int)>
		float f = context.getResources().getDisplayMetrics().density;
	//   32   64:aload_1         
	//   33   65:invokevirtual   #89  <Method Resources Context.getResources()>
	//   34   68:invokevirtual   #95  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   35   71:getfield        #100 <Field float DisplayMetrics.density>
	//   36   74:fstore_3        
		mIndicatorHeight = (int)(3F * f + 0.5F);
	//   37   75:aload_0         
	//   38   76:ldc1            #101 <Float 3F>
	//   39   78:fload_3         
	//   40   79:fmul            
	//   41   80:ldc1            #102 <Float 0.5F>
	//   42   82:fadd            
	//   43   83:f2i             
	//   44   84:putfield        #104 <Field int mIndicatorHeight>
		mMinPaddingBottom = (int)(6F * f + 0.5F);
	//   45   87:aload_0         
	//   46   88:ldc1            #105 <Float 6F>
	//   47   90:fload_3         
	//   48   91:fmul            
	//   49   92:ldc1            #102 <Float 0.5F>
	//   50   94:fadd            
	//   51   95:f2i             
	//   52   96:putfield        #107 <Field int mMinPaddingBottom>
		mMinTextSpacing = (int)(64F * f);
	//   53   99:aload_0         
	//   54  100:ldc1            #108 <Float 64F>
	//   55  102:fload_3         
	//   56  103:fmul            
	//   57  104:f2i             
	//   58  105:putfield        #110 <Field int mMinTextSpacing>
		mTabPadding = (int)(16F * f + 0.5F);
	//   59  108:aload_0         
	//   60  109:ldc1            #111 <Float 16F>
	//   61  111:fload_3         
	//   62  112:fmul            
	//   63  113:ldc1            #102 <Float 0.5F>
	//   64  115:fadd            
	//   65  116:f2i             
	//   66  117:putfield        #113 <Field int mTabPadding>
		mFullUnderlineHeight = (int)(1.0F * f + 0.5F);
	//   67  120:aload_0         
	//   68  121:fconst_1        
	//   69  122:fload_3         
	//   70  123:fmul            
	//   71  124:ldc1            #102 <Float 0.5F>
	//   72  126:fadd            
	//   73  127:f2i             
	//   74  128:putfield        #115 <Field int mFullUnderlineHeight>
		mMinStripHeight = (int)(f * 32F + 0.5F);
	//   75  131:aload_0         
	//   76  132:fload_3         
	//   77  133:ldc1            #116 <Float 32F>
	//   78  135:fmul            
	//   79  136:ldc1            #102 <Float 0.5F>
	//   80  138:fadd            
	//   81  139:f2i             
	//   82  140:putfield        #118 <Field int mMinStripHeight>
		mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
	//   83  143:aload_0         
	//   84  144:aload_1         
	//   85  145:invokestatic    #124 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   86  148:invokevirtual   #128 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   87  151:putfield        #130 <Field int mTouchSlop>
		setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
	//   88  154:aload_0         
	//   89  155:aload_0         
	//   90  156:invokevirtual   #133 <Method int getPaddingLeft()>
	//   91  159:aload_0         
	//   92  160:invokevirtual   #136 <Method int getPaddingTop()>
	//   93  163:aload_0         
	//   94  164:invokevirtual   #139 <Method int getPaddingRight()>
	//   95  167:aload_0         
	//   96  168:invokevirtual   #142 <Method int getPaddingBottom()>
	//   97  171:invokevirtual   #146 <Method void setPadding(int, int, int, int)>
		setTextSpacing(getTextSpacing());
	//   98  174:aload_0         
	//   99  175:aload_0         
	//  100  176:invokevirtual   #149 <Method int getTextSpacing()>
	//  101  179:invokevirtual   #152 <Method void setTextSpacing(int)>
		setWillNotDraw(false);
	//  102  182:aload_0         
	//  103  183:iconst_0        
	//  104  184:invokevirtual   #156 <Method void setWillNotDraw(boolean)>
		mPrevText.setFocusable(true);
	//  105  187:aload_0         
	//  106  188:getfield        #160 <Field TextView mPrevText>
	//  107  191:iconst_1        
	//  108  192:invokevirtual   #165 <Method void TextView.setFocusable(boolean)>
		mPrevText.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				mPager.setCurrentItem(mPager.getCurrentItem() - 1);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field PagerTabStrip this$0>
			//    2    4:getfield        #26  <Field ViewPager PagerTabStrip.mPager>
			//    3    7:aload_0         
			//    4    8:getfield        #16  <Field PagerTabStrip this$0>
			//    5   11:getfield        #26  <Field ViewPager PagerTabStrip.mPager>
			//    6   14:invokevirtual   #32  <Method int ViewPager.getCurrentItem()>
			//    7   17:iconst_1        
			//    8   18:isub            
			//    9   19:invokevirtual   #36  <Method void ViewPager.setCurrentItem(int)>
			//   10   22:return          
			}

			final PagerTabStrip this$0;

			
			{
				this$0 = PagerTabStrip.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PagerTabStrip this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  109  195:aload_0         
	//  110  196:getfield        #160 <Field TextView mPrevText>
	//  111  199:new             #6   <Class PagerTabStrip$1>
	//  112  202:dup             
	//  113  203:aload_0         
	//  114  204:invokespecial   #168 <Method void PagerTabStrip$1(PagerTabStrip)>
	//  115  207:invokevirtual   #172 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		mNextText.setFocusable(true);
	//  116  210:aload_0         
	//  117  211:getfield        #175 <Field TextView mNextText>
	//  118  214:iconst_1        
	//  119  215:invokevirtual   #165 <Method void TextView.setFocusable(boolean)>
		mNextText.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				mPager.setCurrentItem(mPager.getCurrentItem() + 1);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field PagerTabStrip this$0>
			//    2    4:getfield        #26  <Field ViewPager PagerTabStrip.mPager>
			//    3    7:aload_0         
			//    4    8:getfield        #16  <Field PagerTabStrip this$0>
			//    5   11:getfield        #26  <Field ViewPager PagerTabStrip.mPager>
			//    6   14:invokevirtual   #32  <Method int ViewPager.getCurrentItem()>
			//    7   17:iconst_1        
			//    8   18:iadd            
			//    9   19:invokevirtual   #36  <Method void ViewPager.setCurrentItem(int)>
			//   10   22:return          
			}

			final PagerTabStrip this$0;

			
			{
				this$0 = PagerTabStrip.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PagerTabStrip this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  120  218:aload_0         
	//  121  219:getfield        #175 <Field TextView mNextText>
	//  122  222:new             #8   <Class PagerTabStrip$2>
	//  123  225:dup             
	//  124  226:aload_0         
	//  125  227:invokespecial   #176 <Method void PagerTabStrip$2(PagerTabStrip)>
	//  126  230:invokevirtual   #172 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(getBackground() == null)
	//* 127  233:aload_0         
	//* 128  234:invokevirtual   #180 <Method Drawable getBackground()>
	//* 129  237:ifnonnull       245
			mDrawFullUnderline = true;
	//  130  240:aload_0         
	//  131  241:iconst_1        
	//  132  242:putfield        #72  <Field boolean mDrawFullUnderline>
	//  133  245:return          
	}

	public boolean getDrawFullUnderline()
	{
		return mDrawFullUnderline;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean mDrawFullUnderline>
	//    2    4:ireturn         
	}

	int getMinHeight()
	{
		return Math.max(super.getMinHeight(), mMinStripHeight);
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method int PagerTitleStrip.getMinHeight()>
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field int mMinStripHeight>
	//    4    8:invokestatic    #191 <Method int Math.max(int, int)>
	//    5   11:ireturn         
	}

	public int getTabIndicatorColor()
	{
		return mIndicatorColor;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int mIndicatorColor>
	//    2    4:ireturn         
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #198 <Method void PagerTitleStrip.onDraw(Canvas)>
		int i = getHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #201 <Method int getHeight()>
	//    5    9:istore          6
		int j = mCurrText.getLeft();
	//    6   11:aload_0         
	//    7   12:getfield        #204 <Field TextView mCurrText>
	//    8   15:invokevirtual   #207 <Method int TextView.getLeft()>
	//    9   18:istore          7
		int k = mTabPadding;
	//   10   20:aload_0         
	//   11   21:getfield        #113 <Field int mTabPadding>
	//   12   24:istore          8
		int l = mCurrText.getRight();
	//   13   26:aload_0         
	//   14   27:getfield        #204 <Field TextView mCurrText>
	//   15   30:invokevirtual   #210 <Method int TextView.getRight()>
	//   16   33:istore          9
		int i1 = mTabPadding;
	//   17   35:aload_0         
	//   18   36:getfield        #113 <Field int mTabPadding>
	//   19   39:istore          10
		int j1 = mIndicatorHeight;
	//   20   41:aload_0         
	//   21   42:getfield        #104 <Field int mIndicatorHeight>
	//   22   45:istore          11
		mTabPaint.setColor(mTabAlpha << 24 | mIndicatorColor & 0xffffff);
	//   23   47:aload_0         
	//   24   48:getfield        #63  <Field Paint mTabPaint>
	//   25   51:aload_0         
	//   26   52:getfield        #70  <Field int mTabAlpha>
	//   27   55:bipush          24
	//   28   57:ishl            
	//   29   58:aload_0         
	//   30   59:getfield        #79  <Field int mIndicatorColor>
	//   31   62:ldc1            #211 <Int 0xffffff>
	//   32   64:iand            
	//   33   65:ior             
	//   34   66:invokevirtual   #83  <Method void Paint.setColor(int)>
		float f = j - k;
	//   35   69:iload           7
	//   36   71:iload           8
	//   37   73:isub            
	//   38   74:i2f             
	//   39   75:fstore_2        
		float f1 = i - j1;
	//   40   76:iload           6
	//   41   78:iload           11
	//   42   80:isub            
	//   43   81:i2f             
	//   44   82:fstore_3        
		float f2 = l + i1;
	//   45   83:iload           9
	//   46   85:iload           10
	//   47   87:iadd            
	//   48   88:i2f             
	//   49   89:fstore          4
		float f3 = i;
	//   50   91:iload           6
	//   51   93:i2f             
	//   52   94:fstore          5
		canvas.drawRect(f, f1, f2, f3, mTabPaint);
	//   53   96:aload_1         
	//   54   97:fload_2         
	//   55   98:fload_3         
	//   56   99:fload           4
	//   57  101:fload           5
	//   58  103:aload_0         
	//   59  104:getfield        #63  <Field Paint mTabPaint>
	//   60  107:invokevirtual   #217 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		if(mDrawFullUnderline)
	//*  61  110:aload_0         
	//*  62  111:getfield        #72  <Field boolean mDrawFullUnderline>
	//*  63  114:ifeq            167
		{
			mTabPaint.setColor(0xff000000 | mIndicatorColor & 0xffffff);
	//   64  117:aload_0         
	//   65  118:getfield        #63  <Field Paint mTabPaint>
	//   66  121:ldc1            #218 <Int 0xff000000>
	//   67  123:aload_0         
	//   68  124:getfield        #79  <Field int mIndicatorColor>
	//   69  127:ldc1            #211 <Int 0xffffff>
	//   70  129:iand            
	//   71  130:ior             
	//   72  131:invokevirtual   #83  <Method void Paint.setColor(int)>
			canvas.drawRect(getPaddingLeft(), i - mFullUnderlineHeight, getWidth() - getPaddingRight(), f3, mTabPaint);
	//   73  134:aload_1         
	//   74  135:aload_0         
	//   75  136:invokevirtual   #133 <Method int getPaddingLeft()>
	//   76  139:i2f             
	//   77  140:iload           6
	//   78  142:aload_0         
	//   79  143:getfield        #115 <Field int mFullUnderlineHeight>
	//   80  146:isub            
	//   81  147:i2f             
	//   82  148:aload_0         
	//   83  149:invokevirtual   #221 <Method int getWidth()>
	//   84  152:aload_0         
	//   85  153:invokevirtual   #139 <Method int getPaddingRight()>
	//   86  156:isub            
	//   87  157:i2f             
	//   88  158:fload           5
	//   89  160:aload_0         
	//   90  161:getfield        #63  <Field Paint mTabPaint>
	//   91  164:invokevirtual   #217 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
	//   92  167:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #228 <Method int MotionEvent.getAction()>
	//    2    4:istore          4
		if(i != 0 && mIgnoreTap)
	//*   3    6:iload           4
	//*   4    8:ifeq            20
	//*   5   11:aload_0         
	//*   6   12:getfield        #230 <Field boolean mIgnoreTap>
	//*   7   15:ifeq            20
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
		float f = motionevent.getX();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #234 <Method float MotionEvent.getX()>
	//   12   24:fstore_2        
		float f1 = motionevent.getY();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #237 <Method float MotionEvent.getY()>
	//   15   29:fstore_3        
		switch(i)
	//*  16   30:iload           4
		{
	//*  17   32:tableswitch     0 2: default 60
	//	               0 177
	//	               1 105
	//	               2 62
		default:
			return true;
	//   18   60:iconst_1        
	//   19   61:ireturn         

		case 2: // '\002'
			if(Math.abs(f - mInitialMotionX) > (float)mTouchSlop || Math.abs(f1 - mInitialMotionY) > (float)mTouchSlop)
	//*  20   62:fload_2         
	//*  21   63:aload_0         
	//*  22   64:getfield        #239 <Field float mInitialMotionX>
	//*  23   67:fsub            
	//*  24   68:invokestatic    #243 <Method float Math.abs(float)>
	//*  25   71:aload_0         
	//*  26   72:getfield        #130 <Field int mTouchSlop>
	//*  27   75:i2f             
	//*  28   76:fcmpl           
	//*  29   77:ifgt            98
	//*  30   80:fload_3         
	//*  31   81:aload_0         
	//*  32   82:getfield        #245 <Field float mInitialMotionY>
	//*  33   85:fsub            
	//*  34   86:invokestatic    #243 <Method float Math.abs(float)>
	//*  35   89:aload_0         
	//*  36   90:getfield        #130 <Field int mTouchSlop>
	//*  37   93:i2f             
	//*  38   94:fcmpl           
	//*  39   95:ifle            192
			{
				mIgnoreTap = true;
	//   40   98:aload_0         
	//   41   99:iconst_1        
	//   42  100:putfield        #230 <Field boolean mIgnoreTap>
				return true;
	//   43  103:iconst_1        
	//   44  104:ireturn         
			}
			break;

		case 1: // '\001'
			if(f < (float)(mCurrText.getLeft() - mTabPadding))
	//*  45  105:fload_2         
	//*  46  106:aload_0         
	//*  47  107:getfield        #204 <Field TextView mCurrText>
	//*  48  110:invokevirtual   #207 <Method int TextView.getLeft()>
	//*  49  113:aload_0         
	//*  50  114:getfield        #113 <Field int mTabPadding>
	//*  51  117:isub            
	//*  52  118:i2f             
	//*  53  119:fcmpg           
	//*  54  120:ifge            141
			{
				mPager.setCurrentItem(mPager.getCurrentItem() - 1);
	//   55  123:aload_0         
	//   56  124:getfield        #249 <Field ViewPager mPager>
	//   57  127:aload_0         
	//   58  128:getfield        #249 <Field ViewPager mPager>
	//   59  131:invokevirtual   #254 <Method int ViewPager.getCurrentItem()>
	//   60  134:iconst_1        
	//   61  135:isub            
	//   62  136:invokevirtual   #257 <Method void ViewPager.setCurrentItem(int)>
				return true;
	//   63  139:iconst_1        
	//   64  140:ireturn         
			}
			if(f > (float)(mCurrText.getRight() + mTabPadding))
	//*  65  141:fload_2         
	//*  66  142:aload_0         
	//*  67  143:getfield        #204 <Field TextView mCurrText>
	//*  68  146:invokevirtual   #210 <Method int TextView.getRight()>
	//*  69  149:aload_0         
	//*  70  150:getfield        #113 <Field int mTabPadding>
	//*  71  153:iadd            
	//*  72  154:i2f             
	//*  73  155:fcmpl           
	//*  74  156:ifle            192
			{
				mPager.setCurrentItem(mPager.getCurrentItem() + 1);
	//   75  159:aload_0         
	//   76  160:getfield        #249 <Field ViewPager mPager>
	//   77  163:aload_0         
	//   78  164:getfield        #249 <Field ViewPager mPager>
	//   79  167:invokevirtual   #254 <Method int ViewPager.getCurrentItem()>
	//   80  170:iconst_1        
	//   81  171:iadd            
	//   82  172:invokevirtual   #257 <Method void ViewPager.setCurrentItem(int)>
				return true;
	//   83  175:iconst_1        
	//   84  176:ireturn         
			}
			break;

		case 0: // '\0'
			mInitialMotionX = f;
	//   85  177:aload_0         
	//   86  178:fload_2         
	//   87  179:putfield        #239 <Field float mInitialMotionX>
			mInitialMotionY = f1;
	//   88  182:aload_0         
	//   89  183:fload_3         
	//   90  184:putfield        #245 <Field float mInitialMotionY>
			mIgnoreTap = false;
	//   91  187:aload_0         
	//   92  188:iconst_0        
	//   93  189:putfield        #230 <Field boolean mIgnoreTap>
			break;
		}
		return true;
	//   94  192:iconst_1        
	//   95  193:ireturn         
	}

	public void setBackgroundColor(int i)
	{
		super.setBackgroundColor(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #260 <Method void PagerTitleStrip.setBackgroundColor(int)>
		if(!mDrawFullUnderlineSet)
	//*   3    5:aload_0         
	//*   4    6:getfield        #74  <Field boolean mDrawFullUnderlineSet>
	//*   5    9:ifne            31
		{
			boolean flag;
			if((i & 0xff000000) == 0)
	//*   6   12:iload_1         
	//*   7   13:ldc1            #218 <Int 0xff000000>
	//*   8   15:iand            
	//*   9   16:ifne            24
				flag = true;
	//   10   19:iconst_1        
	//   11   20:istore_2        
			else
	//*  12   21:goto            26
				flag = false;
	//   13   24:iconst_0        
	//   14   25:istore_2        
			mDrawFullUnderline = flag;
	//   15   26:aload_0         
	//   16   27:iload_2         
	//   17   28:putfield        #72  <Field boolean mDrawFullUnderline>
		}
	//   18   31:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #264 <Method void PagerTitleStrip.setBackgroundDrawable(Drawable)>
		if(!mDrawFullUnderlineSet)
	//*   3    5:aload_0         
	//*   4    6:getfield        #74  <Field boolean mDrawFullUnderlineSet>
	//*   5    9:ifne            28
		{
			boolean flag;
			if(drawable == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       21
				flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
			else
	//*  10   18:goto            23
				flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_2        
			mDrawFullUnderline = flag;
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:putfield        #72  <Field boolean mDrawFullUnderline>
		}
	//   16   28:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #268 <Method void PagerTitleStrip.setBackgroundResource(int)>
		if(!mDrawFullUnderlineSet)
	//*   3    5:aload_0         
	//*   4    6:getfield        #74  <Field boolean mDrawFullUnderlineSet>
	//*   5    9:ifne            28
		{
			boolean flag;
			if(i == 0)
	//*   6   12:iload_1         
	//*   7   13:ifne            21
				flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
			else
	//*  10   18:goto            23
				flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_2        
			mDrawFullUnderline = flag;
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:putfield        #72  <Field boolean mDrawFullUnderline>
		}
	//   16   28:return          
	}

	public void setDrawFullUnderline(boolean flag)
	{
		mDrawFullUnderline = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field boolean mDrawFullUnderline>
		mDrawFullUnderlineSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #74  <Field boolean mDrawFullUnderlineSet>
		invalidate();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #272 <Method void invalidate()>
	//    8   14:return          
	}

	public void setPadding(int i, int j, int k, int l)
	{
		int j1 = mMinPaddingBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field int mMinPaddingBottom>
	//    2    4:istore          6
		int i1 = l;
	//    3    6:iload           4
	//    4    8:istore          5
		if(l < j1)
	//*   5   10:iload           4
	//*   6   12:iload           6
	//*   7   14:icmpge          21
			i1 = j1;
	//    8   17:iload           6
	//    9   19:istore          5
		super.setPadding(i, j, k, i1);
	//   10   21:aload_0         
	//   11   22:iload_1         
	//   12   23:iload_2         
	//   13   24:iload_3         
	//   14   25:iload           5
	//   15   27:invokespecial   #273 <Method void PagerTitleStrip.setPadding(int, int, int, int)>
	//   16   30:return          
	}

	public void setTabIndicatorColor(int i)
	{
		mIndicatorColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field int mIndicatorColor>
		mTabPaint.setColor(mIndicatorColor);
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field Paint mTabPaint>
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field int mIndicatorColor>
	//    7   13:invokevirtual   #83  <Method void Paint.setColor(int)>
		invalidate();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #272 <Method void invalidate()>
	//   10   20:return          
	}

	public void setTabIndicatorColorResource(int i)
	{
		setTabIndicatorColor(ContextCompat.getColor(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #280 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #286 <Method int ContextCompat.getColor(Context, int)>
	//    5    9:invokevirtual   #288 <Method void setTabIndicatorColor(int)>
	//    6   12:return          
	}

	public void setTextSpacing(int i)
	{
		int k = mMinTextSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field int mMinTextSpacing>
	//    2    4:istore_3        
		int j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
		if(i < k)
	//*   5    7:iload_1         
	//*   6    8:iload_3         
	//*   7    9:icmpge          14
			j = k;
	//    8   12:iload_3         
	//    9   13:istore_2        
		super.setTextSpacing(j);
	//   10   14:aload_0         
	//   11   15:iload_2         
	//   12   16:invokespecial   #289 <Method void PagerTitleStrip.setTextSpacing(int)>
	//   13   19:return          
	}

	void updateTextPositions(int i, float f, boolean flag)
	{
		Rect rect = mTempRect;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Rect mTempRect>
	//    2    4:astore          10
		int j = getHeight();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #201 <Method int getHeight()>
	//    5   10:istore          4
		int k = mCurrText.getLeft();
	//    6   12:aload_0         
	//    7   13:getfield        #204 <Field TextView mCurrText>
	//    8   16:invokevirtual   #207 <Method int TextView.getLeft()>
	//    9   19:istore          5
		int l = mTabPadding;
	//   10   21:aload_0         
	//   11   22:getfield        #113 <Field int mTabPadding>
	//   12   25:istore          6
		int i1 = mCurrText.getRight();
	//   13   27:aload_0         
	//   14   28:getfield        #204 <Field TextView mCurrText>
	//   15   31:invokevirtual   #210 <Method int TextView.getRight()>
	//   16   34:istore          7
		int j1 = mTabPadding;
	//   17   36:aload_0         
	//   18   37:getfield        #113 <Field int mTabPadding>
	//   19   40:istore          8
		int k1 = j - mIndicatorHeight;
	//   20   42:iload           4
	//   21   44:aload_0         
	//   22   45:getfield        #104 <Field int mIndicatorHeight>
	//   23   48:isub            
	//   24   49:istore          9
		rect.set(k - l, k1, i1 + j1, j);
	//   25   51:aload           10
	//   26   53:iload           5
	//   27   55:iload           6
	//   28   57:isub            
	//   29   58:iload           9
	//   30   60:iload           7
	//   31   62:iload           8
	//   32   64:iadd            
	//   33   65:iload           4
	//   34   67:invokevirtual   #294 <Method void Rect.set(int, int, int, int)>
		super.updateTextPositions(i, f, flag);
	//   35   70:aload_0         
	//   36   71:iload_1         
	//   37   72:fload_2         
	//   38   73:iload_3         
	//   39   74:invokespecial   #296 <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
		mTabAlpha = (int)(Math.abs(f - 0.5F) * 2.0F * 255F);
	//   40   77:aload_0         
	//   41   78:fload_2         
	//   42   79:ldc1            #102 <Float 0.5F>
	//   43   81:fsub            
	//   44   82:invokestatic    #243 <Method float Math.abs(float)>
	//   45   85:fconst_2        
	//   46   86:fmul            
	//   47   87:ldc2            #297 <Float 255F>
	//   48   90:fmul            
	//   49   91:f2i             
	//   50   92:putfield        #70  <Field int mTabAlpha>
		rect.union(mCurrText.getLeft() - mTabPadding, k1, mCurrText.getRight() + mTabPadding, j);
	//   51   95:aload           10
	//   52   97:aload_0         
	//   53   98:getfield        #204 <Field TextView mCurrText>
	//   54  101:invokevirtual   #207 <Method int TextView.getLeft()>
	//   55  104:aload_0         
	//   56  105:getfield        #113 <Field int mTabPadding>
	//   57  108:isub            
	//   58  109:iload           9
	//   59  111:aload_0         
	//   60  112:getfield        #204 <Field TextView mCurrText>
	//   61  115:invokevirtual   #210 <Method int TextView.getRight()>
	//   62  118:aload_0         
	//   63  119:getfield        #113 <Field int mTabPadding>
	//   64  122:iadd            
	//   65  123:iload           4
	//   66  125:invokevirtual   #300 <Method void Rect.union(int, int, int, int)>
		invalidate(rect);
	//   67  128:aload_0         
	//   68  129:aload           10
	//   69  131:invokevirtual   #303 <Method void invalidate(Rect)>
	//   70  134:return          
	}

	private static final int FULL_UNDERLINE_HEIGHT = 1;
	private static final int INDICATOR_HEIGHT = 3;
	private static final int MIN_PADDING_BOTTOM = 6;
	private static final int MIN_STRIP_HEIGHT = 32;
	private static final int MIN_TEXT_SPACING = 64;
	private static final int TAB_PADDING = 16;
	private static final int TAB_SPACING = 32;
	private static final String TAG = "PagerTabStrip";
	private boolean mDrawFullUnderline;
	private boolean mDrawFullUnderlineSet;
	private int mFullUnderlineHeight;
	private boolean mIgnoreTap;
	private int mIndicatorColor;
	private int mIndicatorHeight;
	private float mInitialMotionX;
	private float mInitialMotionY;
	private int mMinPaddingBottom;
	private int mMinStripHeight;
	private int mMinTextSpacing;
	private int mTabAlpha;
	private int mTabPadding;
	private final Paint mTabPaint;
	private final Rect mTempRect;
	private int mTouchSlop;
}
