// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, ScrollingTabContainerView, TintTypedArray, AppCompatImageView, 
//			AppCompatTextView, TooltipCompat

private class ScrollingTabContainerView$TabView extends LinearLayoutCompat
{

	public void bindTab(android.support.v7.app.ActionBar.Tab tab)
	{
		mTab = tab;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
		update();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #67  <Method void update()>
	//    5    9:return          
	}

	public android.support.v7.app.ActionBar.Tab getTab()
	{
		return mTab;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
	//    2    4:areturn         
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void LinearLayoutCompat.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #78  <Class android.support.v7.app.ActionBar$Tab>
	//    5    8:invokevirtual   #84  <Method String Class.getName()>
	//    6   11:invokevirtual   #90  <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    7   14:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #94  <Method void LinearLayoutCompat.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #78  <Class android.support.v7.app.ActionBar$Tab>
	//    5    8:invokevirtual   #84  <Method String Class.getName()>
	//    6   11:invokevirtual   #97  <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    7   14:return          
	}

	public void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #101 <Method void LinearLayoutCompat.onMeasure(int, int)>
		if(mMaxTabWidth > 0 && getMeasuredWidth() > mMaxTabWidth)
	//*   4    6:aload_0         
	//*   5    7:getfield        #23  <Field ScrollingTabContainerView this$0>
	//*   6   10:getfield        #104 <Field int ScrollingTabContainerView.mMaxTabWidth>
	//*   7   13:ifle            47
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #108 <Method int getMeasuredWidth()>
	//*  10   20:aload_0         
	//*  11   21:getfield        #23  <Field ScrollingTabContainerView this$0>
	//*  12   24:getfield        #104 <Field int ScrollingTabContainerView.mMaxTabWidth>
	//*  13   27:icmple          47
			super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(mMaxTabWidth, 0x40000000), j);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #23  <Field ScrollingTabContainerView this$0>
	//   17   35:getfield        #104 <Field int ScrollingTabContainerView.mMaxTabWidth>
	//   18   38:ldc1            #109 <Int 0x40000000>
	//   19   40:invokestatic    #115 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   20   43:iload_2         
	//   21   44:invokespecial   #101 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//   22   47:return          
	}

	public void setSelected(boolean flag)
	{
		boolean flag1;
		if(isSelected() != flag)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #121 <Method boolean isSelected()>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          29
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokespecial   #123 <Method void LinearLayoutCompat.setSelected(boolean)>
	//*   9   15:iload_2         
	//*  10   16:ifeq            28
	//*  11   19:iload_1         
	//*  12   20:ifeq            28
	//*  13   23:aload_0         
	//*  14   24:iconst_4        
	//*  15   25:invokevirtual   #126 <Method void sendAccessibilityEvent(int)>
	//*  16   28:return          
			flag1 = false;
	//   17   29:iconst_0        
	//   18   30:istore_2        
		super.setSelected(flag);
		if(flag1 && flag)
			sendAccessibilityEvent(4);
	//*  19   31:goto            10
	}

	public void update()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		android.support.v7.app.ActionBar.Tab tab = mTab;
	//    2    2:aload_0         
	//    3    3:getfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
	//    4    6:astore_3        
		Object obj1 = ((Object) (tab.getCustomView()));
	//    5    7:aload_3         
	//    6    8:invokevirtual   #130 <Method View android.support.v7.app.ActionBar$Tab.getCustomView()>
	//    7   11:astore          4
		if(obj1 != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          95
		{
			obj = ((Object) (((View) (obj1)).getParent()));
	//   10   18:aload           4
	//   11   20:invokevirtual   #136 <Method android.view.ViewParent View.getParent()>
	//   12   23:astore_2        
			if(obj != this)
	//*  13   24:aload_2         
	//*  14   25:aload_0         
	//*  15   26:if_acmpeq       48
			{
				if(obj != null)
	//*  16   29:aload_2         
	//*  17   30:ifnull          42
					((ViewGroup)obj).removeView(((View) (obj1)));
	//   18   33:aload_2         
	//   19   34:checkcast       #138 <Class ViewGroup>
	//   20   37:aload           4
	//   21   39:invokevirtual   #142 <Method void ViewGroup.removeView(View)>
				addView(((View) (obj1)));
	//   22   42:aload_0         
	//   23   43:aload           4
	//   24   45:invokevirtual   #145 <Method void addView(View)>
			}
			mCustomView = ((View) (obj1));
	//   25   48:aload_0         
	//   26   49:aload           4
	//   27   51:putfield        #147 <Field View mCustomView>
			if(mTextView != null)
	//*  28   54:aload_0         
	//*  29   55:getfield        #149 <Field TextView mTextView>
	//*  30   58:ifnull          70
				mTextView.setVisibility(8);
	//   31   61:aload_0         
	//   32   62:getfield        #149 <Field TextView mTextView>
	//   33   65:bipush          8
	//   34   67:invokevirtual   #154 <Method void TextView.setVisibility(int)>
			if(mIconView != null)
	//*  35   70:aload_0         
	//*  36   71:getfield        #156 <Field ImageView mIconView>
	//*  37   74:ifnull          94
			{
				mIconView.setVisibility(8);
	//   38   77:aload_0         
	//   39   78:getfield        #156 <Field ImageView mIconView>
	//   40   81:bipush          8
	//   41   83:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
				mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   42   86:aload_0         
	//   43   87:getfield        #156 <Field ImageView mIconView>
	//   44   90:aconst_null     
	//   45   91:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			return;
	//   46   94:return          
		}
		if(mCustomView != null)
	//*  47   95:aload_0         
	//*  48   96:getfield        #147 <Field View mCustomView>
	//*  49   99:ifnull          115
		{
			removeView(mCustomView);
	//   50  102:aload_0         
	//   51  103:aload_0         
	//   52  104:getfield        #147 <Field View mCustomView>
	//   53  107:invokevirtual   #163 <Method void removeView(View)>
			mCustomView = null;
	//   54  110:aload_0         
	//   55  111:aconst_null     
	//   56  112:putfield        #147 <Field View mCustomView>
		}
		android.graphics.drawable.Drawable drawable = tab.getIcon();
	//   57  115:aload_3         
	//   58  116:invokevirtual   #167 <Method android.graphics.drawable.Drawable android.support.v7.app.ActionBar$Tab.getIcon()>
	//   59  119:astore          5
		obj1 = ((Object) (tab.getText()));
	//   60  121:aload_3         
	//   61  122:invokevirtual   #171 <Method CharSequence android.support.v7.app.ActionBar$Tab.getText()>
	//   62  125:astore          4
		boolean flag;
		if(drawable != null)
	//*  63  127:aload           5
	//*  64  129:ifnull          339
		{
			if(mIconView == null)
	//*  65  132:aload_0         
	//*  66  133:getfield        #156 <Field ImageView mIconView>
	//*  67  136:ifnonnull       192
			{
				AppCompatImageView appcompatimageview = new AppCompatImageView(getContext());
	//   68  139:new             #173 <Class AppCompatImageView>
	//   69  142:dup             
	//   70  143:aload_0         
	//   71  144:invokevirtual   #177 <Method Context getContext()>
	//   72  147:invokespecial   #180 <Method void AppCompatImageView(Context)>
	//   73  150:astore          6
				LinearLayoutCompat.LayoutParams layoutparams1 = new LinearLayoutCompat.LayoutParams(-2, -2);
	//   74  152:new             #182 <Class LinearLayoutCompat$LayoutParams>
	//   75  155:dup             
	//   76  156:bipush          -2
	//   77  158:bipush          -2
	//   78  160:invokespecial   #184 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   79  163:astore          7
				layoutparams1.gravity = 16;
	//   80  165:aload           7
	//   81  167:bipush          16
	//   82  169:putfield        #187 <Field int LinearLayoutCompat$LayoutParams.gravity>
				((ImageView) (appcompatimageview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   83  172:aload           6
	//   84  174:aload           7
	//   85  176:invokevirtual   #191 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				addView(((View) (appcompatimageview)), 0);
	//   86  179:aload_0         
	//   87  180:aload           6
	//   88  182:iconst_0        
	//   89  183:invokevirtual   #194 <Method void addView(View, int)>
				mIconView = ((ImageView) (appcompatimageview));
	//   90  186:aload_0         
	//   91  187:aload           6
	//   92  189:putfield        #156 <Field ImageView mIconView>
			}
			mIconView.setImageDrawable(drawable);
	//   93  192:aload_0         
	//   94  193:getfield        #156 <Field ImageView mIconView>
	//   95  196:aload           5
	//   96  198:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			mIconView.setVisibility(0);
	//   97  201:aload_0         
	//   98  202:getfield        #156 <Field ImageView mIconView>
	//   99  205:iconst_0        
	//  100  206:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
		} else
	//* 101  209:aload           4
	//* 102  211:invokestatic    #200 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 103  214:ifne            366
	//* 104  217:iconst_1        
	//* 105  218:istore_1        
	//* 106  219:iload_1         
	//* 107  220:ifeq            371
	//* 108  223:aload_0         
	//* 109  224:getfield        #149 <Field TextView mTextView>
	//* 110  227:ifnonnull       294
	//* 111  230:new             #202 <Class AppCompatTextView>
	//* 112  233:dup             
	//* 113  234:aload_0         
	//* 114  235:invokevirtual   #177 <Method Context getContext()>
	//* 115  238:aconst_null     
	//* 116  239:getstatic       #205 <Field int android.support.v7.appcompat.R$attr.actionBarTabTextStyle>
	//* 117  242:invokespecial   #206 <Method void AppCompatTextView(Context, android.util.AttributeSet, int)>
	//* 118  245:astore          5
	//* 119  247:aload           5
	//* 120  249:getstatic       #212 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//* 121  252:invokevirtual   #216 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
	//* 122  255:new             #182 <Class LinearLayoutCompat$LayoutParams>
	//* 123  258:dup             
	//* 124  259:bipush          -2
	//* 125  261:bipush          -2
	//* 126  263:invokespecial   #184 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//* 127  266:astore          6
	//* 128  268:aload           6
	//* 129  270:bipush          16
	//* 130  272:putfield        #187 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 131  275:aload           5
	//* 132  277:aload           6
	//* 133  279:invokevirtual   #217 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 134  282:aload_0         
	//* 135  283:aload           5
	//* 136  285:invokevirtual   #145 <Method void addView(View)>
	//* 137  288:aload_0         
	//* 138  289:aload           5
	//* 139  291:putfield        #149 <Field TextView mTextView>
	//* 140  294:aload_0         
	//* 141  295:getfield        #149 <Field TextView mTextView>
	//* 142  298:aload           4
	//* 143  300:invokevirtual   #220 <Method void TextView.setText(CharSequence)>
	//* 144  303:aload_0         
	//* 145  304:getfield        #149 <Field TextView mTextView>
	//* 146  307:iconst_0        
	//* 147  308:invokevirtual   #154 <Method void TextView.setVisibility(int)>
	//* 148  311:aload_0         
	//* 149  312:getfield        #156 <Field ImageView mIconView>
	//* 150  315:ifnull          329
	//* 151  318:aload_0         
	//* 152  319:getfield        #156 <Field ImageView mIconView>
	//* 153  322:aload_3         
	//* 154  323:invokevirtual   #223 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
	//* 155  326:invokevirtual   #226 <Method void ImageView.setContentDescription(CharSequence)>
	//* 156  329:iload_1         
	//* 157  330:ifeq            398
	//* 158  333:aload_0         
	//* 159  334:aload_2         
	//* 160  335:invokestatic    #232 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
	//* 161  338:return          
		if(mIconView != null)
	//* 162  339:aload_0         
	//* 163  340:getfield        #156 <Field ImageView mIconView>
	//* 164  343:ifnull          209
		{
			mIconView.setVisibility(8);
	//  165  346:aload_0         
	//  166  347:getfield        #156 <Field ImageView mIconView>
	//  167  350:bipush          8
	//  168  352:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
			mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//  169  355:aload_0         
	//  170  356:getfield        #156 <Field ImageView mIconView>
	//  171  359:aconst_null     
	//  172  360:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		}
		if(!TextUtils.isEmpty(((CharSequence) (obj1))))
			flag = true;
		else
	//* 173  363:goto            209
			flag = false;
	//  174  366:iconst_0        
	//  175  367:istore_1        
		if(flag)
		{
			if(mTextView == null)
			{
				AppCompatTextView appcompattextview = new AppCompatTextView(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionBarTabTextStyle);
				((TextView) (appcompattextview)).setEllipsize(android.text.TextUtils.TruncateAt.END);
				LinearLayoutCompat.LayoutParams layoutparams = new LinearLayoutCompat.LayoutParams(-2, -2);
				layoutparams.gravity = 16;
				((TextView) (appcompattextview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
				addView(((View) (appcompattextview)));
				mTextView = ((TextView) (appcompattextview));
			}
			mTextView.setText(((CharSequence) (obj1)));
			mTextView.setVisibility(0);
		} else
	//* 176  368:goto            219
		if(mTextView != null)
	//* 177  371:aload_0         
	//* 178  372:getfield        #149 <Field TextView mTextView>
	//* 179  375:ifnull          311
		{
			mTextView.setVisibility(8);
	//  180  378:aload_0         
	//  181  379:getfield        #149 <Field TextView mTextView>
	//  182  382:bipush          8
	//  183  384:invokevirtual   #154 <Method void TextView.setVisibility(int)>
			mTextView.setText(((CharSequence) (null)));
	//  184  387:aload_0         
	//  185  388:getfield        #149 <Field TextView mTextView>
	//  186  391:aconst_null     
	//  187  392:invokevirtual   #220 <Method void TextView.setText(CharSequence)>
		}
		if(mIconView != null)
			mIconView.setContentDescription(tab.getContentDescription());
		if(!flag)
	//* 188  395:goto            311
			obj = ((Object) (tab.getContentDescription()));
	//  189  398:aload_3         
	//  190  399:invokevirtual   #223 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
	//  191  402:astore_2        
		TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (obj)));
	//* 192  403:goto            333
	}

	private final int BG_ATTRS[] = {
		0x10100d4
	};
	private View mCustomView;
	private ImageView mIconView;
	private android.support.v7.app.ActionBar.Tab mTab;
	private TextView mTextView;
	final ScrollingTabContainerView this$0;

	public ScrollingTabContainerView$TabView(Context context, android.support.v7.app.ActionBar.Tab tab, boolean flag)
	{
		this$0 = ScrollingTabContainerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ScrollingTabContainerView this$0>
		super(context, ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionBarTabStyle);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aconst_null     
	//    6    8:getstatic       #29  <Field int android.support.v7.appcompat.R$attr.actionBarTabStyle>
	//    7   11:invokespecial   #32  <Method void LinearLayoutCompat(Context, android.util.AttributeSet, int)>
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:newarray        int[]
	//   11   18:dup             
	//   12   19:iconst_0        
	//   13   20:ldc1            #33  <Int 0x10100d4>
	//   14   22:iastore         
	//   15   23:putfield        #35  <Field int[] BG_ATTRS>
		mTab = tab;
	//   16   26:aload_0         
	//   17   27:aload_3         
	//   18   28:putfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
		scrollingtabcontainerview = ((ScrollingTabContainerView) (TintTypedArray.obtainStyledAttributes(context, ((android.util.AttributeSet) (null)), BG_ATTRS, android.support.v7.appcompat.R.attr.actionBarTabStyle, 0)));
	//   19   31:aload_2         
	//   20   32:aconst_null     
	//   21   33:aload_0         
	//   22   34:getfield        #35  <Field int[] BG_ATTRS>
	//   23   37:getstatic       #29  <Field int android.support.v7.appcompat.R$attr.actionBarTabStyle>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #43  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[], int, int)>
	//   26   44:astore_1        
		if(hasValue(0))
	//*  27   45:aload_1         
	//*  28   46:iconst_0        
	//*  29   47:invokevirtual   #47  <Method boolean TintTypedArray.hasValue(int)>
	//*  30   50:ifeq            62
			setBackgroundDrawable(getDrawable(0));
	//   31   53:aload_0         
	//   32   54:aload_1         
	//   33   55:iconst_0        
	//   34   56:invokevirtual   #51  <Method android.graphics.drawable.Drawable TintTypedArray.getDrawable(int)>
	//   35   59:invokevirtual   #55  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		recycle();
	//   36   62:aload_1         
	//   37   63:invokevirtual   #59  <Method void TintTypedArray.recycle()>
		if(flag)
	//*  38   66:iload           4
	//*  39   68:ifeq            77
			setGravity(0x800013);
	//   40   71:aload_0         
	//   41   72:ldc1            #60  <Int 0x800013>
	//   42   74:invokevirtual   #64  <Method void setGravity(int)>
		update();
	//   43   77:aload_0         
	//   44   78:invokevirtual   #67  <Method void update()>
	//   45   81:return          
	}
}
