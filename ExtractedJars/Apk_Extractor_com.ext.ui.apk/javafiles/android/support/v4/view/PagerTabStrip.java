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
	//    3    3:invokespecial   #51  <Method void PagerTabStrip(Context, AttributeSet)>
	//    4    6:return          
	}

	public PagerTabStrip(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #53  <Method void PagerTitleStrip(Context, AttributeSet)>
		mTabPaint = new Paint();
	//    4    6:aload_0         
	//    5    7:new             #55  <Class Paint>
	//    6   10:dup             
	//    7   11:invokespecial   #58  <Method void Paint()>
	//    8   14:putfield        #60  <Field Paint mTabPaint>
		mTempRect = new Rect();
	//    9   17:aload_0         
	//   10   18:new             #62  <Class Rect>
	//   11   21:dup             
	//   12   22:invokespecial   #63  <Method void Rect()>
	//   13   25:putfield        #65  <Field Rect mTempRect>
		mTabAlpha = 255;
	//   14   28:aload_0         
	//   15   29:sipush          255
	//   16   32:putfield        #67  <Field int mTabAlpha>
		mDrawFullUnderline = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #69  <Field boolean mDrawFullUnderline>
		mDrawFullUnderlineSet = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #71  <Field boolean mDrawFullUnderlineSet>
		mIndicatorColor = mTextColor;
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #74  <Field int mTextColor>
	//   26   50:putfield        #76  <Field int mIndicatorColor>
		mTabPaint.setColor(mIndicatorColor);
	//   27   53:aload_0         
	//   28   54:getfield        #60  <Field Paint mTabPaint>
	//   29   57:aload_0         
	//   30   58:getfield        #76  <Field int mIndicatorColor>
	//   31   61:invokevirtual   #80  <Method void Paint.setColor(int)>
		float f = context.getResources().getDisplayMetrics().density;
	//   32   64:aload_1         
	//   33   65:invokevirtual   #86  <Method Resources Context.getResources()>
	//   34   68:invokevirtual   #92  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   35   71:getfield        #97  <Field float DisplayMetrics.density>
	//   36   74:fstore_3        
		mIndicatorHeight = (int)(3F * f + 0.5F);
	//   37   75:aload_0         
	//   38   76:ldc1            #98  <Float 3F>
	//   39   78:fload_3         
	//   40   79:fmul            
	//   41   80:ldc1            #99  <Float 0.5F>
	//   42   82:fadd            
	//   43   83:f2i             
	//   44   84:putfield        #101 <Field int mIndicatorHeight>
		mMinPaddingBottom = (int)(6F * f + 0.5F);
	//   45   87:aload_0         
	//   46   88:ldc1            #102 <Float 6F>
	//   47   90:fload_3         
	//   48   91:fmul            
	//   49   92:ldc1            #99  <Float 0.5F>
	//   50   94:fadd            
	//   51   95:f2i             
	//   52   96:putfield        #104 <Field int mMinPaddingBottom>
		mMinTextSpacing = (int)(64F * f);
	//   53   99:aload_0         
	//   54  100:ldc1            #105 <Float 64F>
	//   55  102:fload_3         
	//   56  103:fmul            
	//   57  104:f2i             
	//   58  105:putfield        #107 <Field int mMinTextSpacing>
		mTabPadding = (int)(16F * f + 0.5F);
	//   59  108:aload_0         
	//   60  109:ldc1            #108 <Float 16F>
	//   61  111:fload_3         
	//   62  112:fmul            
	//   63  113:ldc1            #99  <Float 0.5F>
	//   64  115:fadd            
	//   65  116:f2i             
	//   66  117:putfield        #110 <Field int mTabPadding>
		mFullUnderlineHeight = (int)(1.0F * f + 0.5F);
	//   67  120:aload_0         
	//   68  121:fconst_1        
	//   69  122:fload_3         
	//   70  123:fmul            
	//   71  124:ldc1            #99  <Float 0.5F>
	//   72  126:fadd            
	//   73  127:f2i             
	//   74  128:putfield        #112 <Field int mFullUnderlineHeight>
		mMinStripHeight = (int)(f * 32F + 0.5F);
	//   75  131:aload_0         
	//   76  132:fload_3         
	//   77  133:ldc1            #113 <Float 32F>
	//   78  135:fmul            
	//   79  136:ldc1            #99  <Float 0.5F>
	//   80  138:fadd            
	//   81  139:f2i             
	//   82  140:putfield        #115 <Field int mMinStripHeight>
		mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
	//   83  143:aload_0         
	//   84  144:aload_1         
	//   85  145:invokestatic    #121 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   86  148:invokevirtual   #125 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   87  151:putfield        #127 <Field int mTouchSlop>
		setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
	//   88  154:aload_0         
	//   89  155:aload_0         
	//   90  156:invokevirtual   #130 <Method int getPaddingLeft()>
	//   91  159:aload_0         
	//   92  160:invokevirtual   #133 <Method int getPaddingTop()>
	//   93  163:aload_0         
	//   94  164:invokevirtual   #136 <Method int getPaddingRight()>
	//   95  167:aload_0         
	//   96  168:invokevirtual   #139 <Method int getPaddingBottom()>
	//   97  171:invokevirtual   #143 <Method void setPadding(int, int, int, int)>
		setTextSpacing(getTextSpacing());
	//   98  174:aload_0         
	//   99  175:aload_0         
	//  100  176:invokevirtual   #146 <Method int getTextSpacing()>
	//  101  179:invokevirtual   #149 <Method void setTextSpacing(int)>
		setWillNotDraw(false);
	//  102  182:aload_0         
	//  103  183:iconst_0        
	//  104  184:invokevirtual   #153 <Method void setWillNotDraw(boolean)>
		mPrevText.setFocusable(true);
	//  105  187:aload_0         
	//  106  188:getfield        #157 <Field TextView mPrevText>
	//  107  191:iconst_1        
	//  108  192:invokevirtual   #162 <Method void TextView.setFocusable(boolean)>
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
	//  110  196:getfield        #157 <Field TextView mPrevText>
	//  111  199:new             #6   <Class PagerTabStrip$1>
	//  112  202:dup             
	//  113  203:aload_0         
	//  114  204:invokespecial   #165 <Method void PagerTabStrip$1(PagerTabStrip)>
	//  115  207:invokevirtual   #169 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		mNextText.setFocusable(true);
	//  116  210:aload_0         
	//  117  211:getfield        #172 <Field TextView mNextText>
	//  118  214:iconst_1        
	//  119  215:invokevirtual   #162 <Method void TextView.setFocusable(boolean)>
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
	//  121  219:getfield        #172 <Field TextView mNextText>
	//  122  222:new             #8   <Class PagerTabStrip$2>
	//  123  225:dup             
	//  124  226:aload_0         
	//  125  227:invokespecial   #173 <Method void PagerTabStrip$2(PagerTabStrip)>
	//  126  230:invokevirtual   #169 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		if(getBackground() == null)
	//* 127  233:aload_0         
	//* 128  234:invokevirtual   #177 <Method Drawable getBackground()>
	//* 129  237:ifnonnull       245
			mDrawFullUnderline = true;
	//  130  240:aload_0         
	//  131  241:iconst_1        
	//  132  242:putfield        #69  <Field boolean mDrawFullUnderline>
	//  133  245:return          
	}

	public boolean getDrawFullUnderline()
	{
		return mDrawFullUnderline;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean mDrawFullUnderline>
	//    2    4:ireturn         
	}

	int getMinHeight()
	{
		return Math.max(super.getMinHeight(), mMinStripHeight);
	//    0    0:aload_0         
	//    1    1:invokespecial   #182 <Method int PagerTitleStrip.getMinHeight()>
	//    2    4:aload_0         
	//    3    5:getfield        #115 <Field int mMinStripHeight>
	//    4    8:invokestatic    #188 <Method int Math.max(int, int)>
	//    5   11:ireturn         
	}

	public int getTabIndicatorColor()
	{
		return mIndicatorColor;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int mIndicatorColor>
	//    2    4:ireturn         
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #195 <Method void PagerTitleStrip.onDraw(Canvas)>
		int i = getHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #198 <Method int getHeight()>
	//    5    9:istore_2        
		int j = mCurrText.getLeft();
	//    6   10:aload_0         
	//    7   11:getfield        #201 <Field TextView mCurrText>
	//    8   14:invokevirtual   #204 <Method int TextView.getLeft()>
	//    9   17:istore_3        
		int k = mTabPadding;
	//   10   18:aload_0         
	//   11   19:getfield        #110 <Field int mTabPadding>
	//   12   22:istore          4
		int l = mCurrText.getRight();
	//   13   24:aload_0         
	//   14   25:getfield        #201 <Field TextView mCurrText>
	//   15   28:invokevirtual   #207 <Method int TextView.getRight()>
	//   16   31:istore          5
		int i1 = mTabPadding;
	//   17   33:aload_0         
	//   18   34:getfield        #110 <Field int mTabPadding>
	//   19   37:istore          6
		int j1 = mIndicatorHeight;
	//   20   39:aload_0         
	//   21   40:getfield        #101 <Field int mIndicatorHeight>
	//   22   43:istore          7
		mTabPaint.setColor(mTabAlpha << 24 | mIndicatorColor & 0xffffff);
	//   23   45:aload_0         
	//   24   46:getfield        #60  <Field Paint mTabPaint>
	//   25   49:aload_0         
	//   26   50:getfield        #67  <Field int mTabAlpha>
	//   27   53:bipush          24
	//   28   55:ishl            
	//   29   56:aload_0         
	//   30   57:getfield        #76  <Field int mIndicatorColor>
	//   31   60:ldc1            #208 <Int 0xffffff>
	//   32   62:iand            
	//   33   63:ior             
	//   34   64:invokevirtual   #80  <Method void Paint.setColor(int)>
		canvas.drawRect(j - k, i - j1, l + i1, i, mTabPaint);
	//   35   67:aload_1         
	//   36   68:iload_3         
	//   37   69:iload           4
	//   38   71:isub            
	//   39   72:i2f             
	//   40   73:iload_2         
	//   41   74:iload           7
	//   42   76:isub            
	//   43   77:i2f             
	//   44   78:iload           5
	//   45   80:iload           6
	//   46   82:iadd            
	//   47   83:i2f             
	//   48   84:iload_2         
	//   49   85:i2f             
	//   50   86:aload_0         
	//   51   87:getfield        #60  <Field Paint mTabPaint>
	//   52   90:invokevirtual   #214 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		if(mDrawFullUnderline)
	//*  53   93:aload_0         
	//*  54   94:getfield        #69  <Field boolean mDrawFullUnderline>
	//*  55   97:ifeq            149
		{
			mTabPaint.setColor(0xff000000 | mIndicatorColor & 0xffffff);
	//   56  100:aload_0         
	//   57  101:getfield        #60  <Field Paint mTabPaint>
	//   58  104:ldc1            #215 <Int 0xff000000>
	//   59  106:aload_0         
	//   60  107:getfield        #76  <Field int mIndicatorColor>
	//   61  110:ldc1            #208 <Int 0xffffff>
	//   62  112:iand            
	//   63  113:ior             
	//   64  114:invokevirtual   #80  <Method void Paint.setColor(int)>
			canvas.drawRect(getPaddingLeft(), i - mFullUnderlineHeight, getWidth() - getPaddingRight(), i, mTabPaint);
	//   65  117:aload_1         
	//   66  118:aload_0         
	//   67  119:invokevirtual   #130 <Method int getPaddingLeft()>
	//   68  122:i2f             
	//   69  123:iload_2         
	//   70  124:aload_0         
	//   71  125:getfield        #112 <Field int mFullUnderlineHeight>
	//   72  128:isub            
	//   73  129:i2f             
	//   74  130:aload_0         
	//   75  131:invokevirtual   #218 <Method int getWidth()>
	//   76  134:aload_0         
	//   77  135:invokevirtual   #136 <Method int getPaddingRight()>
	//   78  138:isub            
	//   79  139:i2f             
	//   80  140:iload_2         
	//   81  141:i2f             
	//   82  142:aload_0         
	//   83  143:getfield        #60  <Field Paint mTabPaint>
	//   84  146:invokevirtual   #214 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
	//   85  149:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		float f;
		float f1;
		int i;
		i = motionevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #225 <Method int MotionEvent.getAction()>
	//    2    4:istore          4
		if(i != 0 && mIgnoreTap)
	//*   3    6:iload           4
	//*   4    8:ifeq            20
	//*   5   11:aload_0         
	//*   6   12:getfield        #227 <Field boolean mIgnoreTap>
	//*   7   15:ifeq            20
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
		f = motionevent.getX();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #231 <Method float MotionEvent.getX()>
	//   12   24:fstore_2        
		f1 = motionevent.getY();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #234 <Method float MotionEvent.getY()>
	//   15   29:fstore_3        
		i;
	//   16   30:iload           4
		JVM INSTR tableswitch 0 2: default 60
	//	               0 62
	//	               1 124
	//	               2 80;
	//   17   32:tableswitch     0 2: default 60
	//	               0 62
	//	               1 124
	//	               2 80
		   goto _L1 _L2 _L3 _L4
_L1:
		return true;
	//   18   60:iconst_1        
	//   19   61:ireturn         
_L2:
		mInitialMotionX = f;
	//   20   62:aload_0         
	//   21   63:fload_2         
	//   22   64:putfield        #236 <Field float mInitialMotionX>
		mInitialMotionY = f1;
	//   23   67:aload_0         
	//   24   68:fload_3         
	//   25   69:putfield        #238 <Field float mInitialMotionY>
		mIgnoreTap = false;
	//   26   72:aload_0         
	//   27   73:iconst_0        
	//   28   74:putfield        #227 <Field boolean mIgnoreTap>
		continue; /* Loop/switch isn't completed */
	//   29   77:goto            60
_L4:
		if(Math.abs(f - mInitialMotionX) > (float)mTouchSlop || Math.abs(f1 - mInitialMotionY) > (float)mTouchSlop)
	//*  30   80:fload_2         
	//*  31   81:aload_0         
	//*  32   82:getfield        #236 <Field float mInitialMotionX>
	//*  33   85:fsub            
	//*  34   86:invokestatic    #242 <Method float Math.abs(float)>
	//*  35   89:aload_0         
	//*  36   90:getfield        #127 <Field int mTouchSlop>
	//*  37   93:i2f             
	//*  38   94:fcmpl           
	//*  39   95:ifgt            116
	//*  40   98:fload_3         
	//*  41   99:aload_0         
	//*  42  100:getfield        #238 <Field float mInitialMotionY>
	//*  43  103:fsub            
	//*  44  104:invokestatic    #242 <Method float Math.abs(float)>
	//*  45  107:aload_0         
	//*  46  108:getfield        #127 <Field int mTouchSlop>
	//*  47  111:i2f             
	//*  48  112:fcmpl           
	//*  49  113:ifle            60
			mIgnoreTap = true;
	//   50  116:aload_0         
	//   51  117:iconst_1        
	//   52  118:putfield        #227 <Field boolean mIgnoreTap>
		continue; /* Loop/switch isn't completed */
	//   53  121:goto            60
_L3:
		if(f < (float)(mCurrText.getLeft() - mTabPadding))
	//*  54  124:fload_2         
	//*  55  125:aload_0         
	//*  56  126:getfield        #201 <Field TextView mCurrText>
	//*  57  129:invokevirtual   #204 <Method int TextView.getLeft()>
	//*  58  132:aload_0         
	//*  59  133:getfield        #110 <Field int mTabPadding>
	//*  60  136:isub            
	//*  61  137:i2f             
	//*  62  138:fcmpg           
	//*  63  139:ifge            161
			mPager.setCurrentItem(mPager.getCurrentItem() - 1);
	//   64  142:aload_0         
	//   65  143:getfield        #246 <Field ViewPager mPager>
	//   66  146:aload_0         
	//   67  147:getfield        #246 <Field ViewPager mPager>
	//   68  150:invokevirtual   #251 <Method int ViewPager.getCurrentItem()>
	//   69  153:iconst_1        
	//   70  154:isub            
	//   71  155:invokevirtual   #254 <Method void ViewPager.setCurrentItem(int)>
		else
	//*  72  158:goto            60
		if(f > (float)(mCurrText.getRight() + mTabPadding))
	//*  73  161:fload_2         
	//*  74  162:aload_0         
	//*  75  163:getfield        #201 <Field TextView mCurrText>
	//*  76  166:invokevirtual   #207 <Method int TextView.getRight()>
	//*  77  169:aload_0         
	//*  78  170:getfield        #110 <Field int mTabPadding>
	//*  79  173:iadd            
	//*  80  174:i2f             
	//*  81  175:fcmpl           
	//*  82  176:ifle            60
			mPager.setCurrentItem(mPager.getCurrentItem() + 1);
	//   83  179:aload_0         
	//   84  180:getfield        #246 <Field ViewPager mPager>
	//   85  183:aload_0         
	//   86  184:getfield        #246 <Field ViewPager mPager>
	//   87  187:invokevirtual   #251 <Method int ViewPager.getCurrentItem()>
	//   88  190:iconst_1        
	//   89  191:iadd            
	//   90  192:invokevirtual   #254 <Method void ViewPager.setCurrentItem(int)>
		if(true) goto _L1; else goto _L5
	//   91  195:goto            60
_L5:
	}

	public void setBackgroundColor(int i)
	{
		super.setBackgroundColor(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #257 <Method void PagerTitleStrip.setBackgroundColor(int)>
		if(!mDrawFullUnderlineSet)
	//*   3    5:aload_0         
	//*   4    6:getfield        #71  <Field boolean mDrawFullUnderlineSet>
	//*   5    9:ifne            26
		{
			boolean flag;
			if((0xff000000 & i) == 0)
	//*   6   12:ldc1            #215 <Int 0xff000000>
	//*   7   14:iload_1         
	//*   8   15:iand            
	//*   9   16:ifne            27
				flag = true;
	//   10   19:iconst_1        
	//   11   20:istore_2        
			else
	//*  12   21:aload_0         
	//*  13   22:iload_2         
	//*  14   23:putfield        #69  <Field boolean mDrawFullUnderline>
	//*  15   26:return          
				flag = false;
	//   16   27:iconst_0        
	//   17   28:istore_2        
			mDrawFullUnderline = flag;
		}
	//*  18   29:goto            21
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #262 <Method void PagerTitleStrip.setBackgroundDrawable(Drawable)>
		if(!mDrawFullUnderlineSet)
	//*   3    5:aload_0         
	//*   4    6:getfield        #71  <Field boolean mDrawFullUnderlineSet>
	//*   5    9:ifne            23
		{
			boolean flag;
			if(drawable == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       24
				flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
			else
	//*  10   18:aload_0         
	//*  11   19:iload_2         
	//*  12   20:putfield        #69  <Field boolean mDrawFullUnderline>
	//*  13   23:return          
				flag = false;
	//   14   24:iconst_0        
	//   15   25:istore_2        
			mDrawFullUnderline = flag;
		}
	//*  16   26:goto            18
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #266 <Method void PagerTitleStrip.setBackgroundResource(int)>
		if(!mDrawFullUnderlineSet)
	//*   3    5:aload_0         
	//*   4    6:getfield        #71  <Field boolean mDrawFullUnderlineSet>
	//*   5    9:ifne            23
		{
			boolean flag;
			if(i == 0)
	//*   6   12:iload_1         
	//*   7   13:ifne            24
				flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
			else
	//*  10   18:aload_0         
	//*  11   19:iload_2         
	//*  12   20:putfield        #69  <Field boolean mDrawFullUnderline>
	//*  13   23:return          
				flag = false;
	//   14   24:iconst_0        
	//   15   25:istore_2        
			mDrawFullUnderline = flag;
		}
	//*  16   26:goto            18
	}

	public void setDrawFullUnderline(boolean flag)
	{
		mDrawFullUnderline = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean mDrawFullUnderline>
		mDrawFullUnderlineSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #71  <Field boolean mDrawFullUnderlineSet>
		invalidate();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #270 <Method void invalidate()>
	//    8   14:return          
	}

	public void setPadding(int i, int j, int k, int l)
	{
		int i1 = l;
	//    0    0:iload           4
	//    1    2:istore          5
		if(l < mMinPaddingBottom)
	//*   2    4:iload           4
	//*   3    6:aload_0         
	//*   4    7:getfield        #104 <Field int mMinPaddingBottom>
	//*   5   10:icmpge          19
			i1 = mMinPaddingBottom;
	//    6   13:aload_0         
	//    7   14:getfield        #104 <Field int mMinPaddingBottom>
	//    8   17:istore          5
		super.setPadding(i, j, k, i1);
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:iload_2         
	//   12   22:iload_3         
	//   13   23:iload           5
	//   14   25:invokespecial   #271 <Method void PagerTitleStrip.setPadding(int, int, int, int)>
	//   15   28:return          
	}

	public void setTabIndicatorColor(int i)
	{
		mIndicatorColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #76  <Field int mIndicatorColor>
		mTabPaint.setColor(mIndicatorColor);
	//    3    5:aload_0         
	//    4    6:getfield        #60  <Field Paint mTabPaint>
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field int mIndicatorColor>
	//    7   13:invokevirtual   #80  <Method void Paint.setColor(int)>
		invalidate();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #270 <Method void invalidate()>
	//   10   20:return          
	}

	public void setTabIndicatorColorResource(int i)
	{
		setTabIndicatorColor(ContextCompat.getColor(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #278 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #284 <Method int ContextCompat.getColor(Context, int)>
	//    5    9:invokevirtual   #286 <Method void setTabIndicatorColor(int)>
	//    6   12:return          
	}

	public void setTextSpacing(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < mMinTextSpacing)
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #107 <Field int mMinTextSpacing>
	//*   5    7:icmpge          15
			j = mMinTextSpacing;
	//    6   10:aload_0         
	//    7   11:getfield        #107 <Field int mMinTextSpacing>
	//    8   14:istore_2        
		super.setTextSpacing(j);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokespecial   #287 <Method void PagerTitleStrip.setTextSpacing(int)>
	//   12   20:return          
	}

	void updateTextPositions(int i, float f, boolean flag)
	{
		Rect rect = mTempRect;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Rect mTempRect>
	//    2    4:astore          10
		int j = getHeight();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #198 <Method int getHeight()>
	//    5   10:istore          4
		int k = mCurrText.getLeft();
	//    6   12:aload_0         
	//    7   13:getfield        #201 <Field TextView mCurrText>
	//    8   16:invokevirtual   #204 <Method int TextView.getLeft()>
	//    9   19:istore          5
		int l = mTabPadding;
	//   10   21:aload_0         
	//   11   22:getfield        #110 <Field int mTabPadding>
	//   12   25:istore          6
		int i1 = mCurrText.getRight();
	//   13   27:aload_0         
	//   14   28:getfield        #201 <Field TextView mCurrText>
	//   15   31:invokevirtual   #207 <Method int TextView.getRight()>
	//   16   34:istore          7
		int j1 = mTabPadding;
	//   17   36:aload_0         
	//   18   37:getfield        #110 <Field int mTabPadding>
	//   19   40:istore          8
		int k1 = j - mIndicatorHeight;
	//   20   42:iload           4
	//   21   44:aload_0         
	//   22   45:getfield        #101 <Field int mIndicatorHeight>
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
	//   34   67:invokevirtual   #292 <Method void Rect.set(int, int, int, int)>
		super.updateTextPositions(i, f, flag);
	//   35   70:aload_0         
	//   36   71:iload_1         
	//   37   72:fload_2         
	//   38   73:iload_3         
	//   39   74:invokespecial   #294 <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
		mTabAlpha = (int)(Math.abs(f - 0.5F) * 2.0F * 255F);
	//   40   77:aload_0         
	//   41   78:fload_2         
	//   42   79:ldc1            #99  <Float 0.5F>
	//   43   81:fsub            
	//   44   82:invokestatic    #242 <Method float Math.abs(float)>
	//   45   85:fconst_2        
	//   46   86:fmul            
	//   47   87:ldc2            #295 <Float 255F>
	//   48   90:fmul            
	//   49   91:f2i             
	//   50   92:putfield        #67  <Field int mTabAlpha>
		rect.union(mCurrText.getLeft() - mTabPadding, k1, mCurrText.getRight() + mTabPadding, j);
	//   51   95:aload           10
	//   52   97:aload_0         
	//   53   98:getfield        #201 <Field TextView mCurrText>
	//   54  101:invokevirtual   #204 <Method int TextView.getLeft()>
	//   55  104:aload_0         
	//   56  105:getfield        #110 <Field int mTabPadding>
	//   57  108:isub            
	//   58  109:iload           9
	//   59  111:aload_0         
	//   60  112:getfield        #201 <Field TextView mCurrText>
	//   61  115:invokevirtual   #207 <Method int TextView.getRight()>
	//   62  118:aload_0         
	//   63  119:getfield        #110 <Field int mTabPadding>
	//   64  122:iadd            
	//   65  123:iload           4
	//   66  125:invokevirtual   #298 <Method void Rect.union(int, int, int, int)>
		invalidate(rect);
	//   67  128:aload_0         
	//   68  129:aload           10
	//   69  131:invokevirtual   #301 <Method void invalidate(Rect)>
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
