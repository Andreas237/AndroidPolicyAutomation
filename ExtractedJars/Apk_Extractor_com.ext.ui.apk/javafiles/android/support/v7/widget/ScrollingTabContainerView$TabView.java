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
		Object obj = ((Object) (mTab));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field android.support.v7.app.ActionBar$Tab mTab>
	//    2    4:astore_2        
		Object obj1 = ((Object) (((android.support.v7.app.ActionBar.Tab) (obj)).getCustomView()));
	//    3    5:aload_2         
	//    4    6:invokevirtual   #130 <Method View android.support.v7.app.ActionBar$Tab.getCustomView()>
	//    5    9:astore_3        
		if(obj1 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          87
		{
			obj = ((Object) (((View) (obj1)).getParent()));
	//    8   14:aload_3         
	//    9   15:invokevirtual   #136 <Method android.view.ViewParent View.getParent()>
	//   10   18:astore_2        
			if(obj != this)
	//*  11   19:aload_2         
	//*  12   20:aload_0         
	//*  13   21:if_acmpeq       41
			{
				if(obj != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          36
					((ViewGroup)obj).removeView(((View) (obj1)));
	//   16   28:aload_2         
	//   17   29:checkcast       #138 <Class ViewGroup>
	//   18   32:aload_3         
	//   19   33:invokevirtual   #142 <Method void ViewGroup.removeView(View)>
				addView(((View) (obj1)));
	//   20   36:aload_0         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #145 <Method void addView(View)>
			}
			mCustomView = ((View) (obj1));
	//   23   41:aload_0         
	//   24   42:aload_3         
	//   25   43:putfield        #147 <Field View mCustomView>
			if(mTextView != null)
	//*  26   46:aload_0         
	//*  27   47:getfield        #149 <Field TextView mTextView>
	//*  28   50:ifnull          62
				mTextView.setVisibility(8);
	//   29   53:aload_0         
	//   30   54:getfield        #149 <Field TextView mTextView>
	//   31   57:bipush          8
	//   32   59:invokevirtual   #154 <Method void TextView.setVisibility(int)>
			if(mIconView != null)
	//*  33   62:aload_0         
	//*  34   63:getfield        #156 <Field ImageView mIconView>
	//*  35   66:ifnull          86
			{
				mIconView.setVisibility(8);
	//   36   69:aload_0         
	//   37   70:getfield        #156 <Field ImageView mIconView>
	//   38   73:bipush          8
	//   39   75:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
				mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   40   78:aload_0         
	//   41   79:getfield        #156 <Field ImageView mIconView>
	//   42   82:aconst_null     
	//   43   83:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			return;
	//   44   86:return          
		}
		if(mCustomView != null)
	//*  45   87:aload_0         
	//*  46   88:getfield        #147 <Field View mCustomView>
	//*  47   91:ifnull          107
		{
			removeView(mCustomView);
	//   48   94:aload_0         
	//   49   95:aload_0         
	//   50   96:getfield        #147 <Field View mCustomView>
	//   51   99:invokevirtual   #163 <Method void removeView(View)>
			mCustomView = null;
	//   52  102:aload_0         
	//   53  103:aconst_null     
	//   54  104:putfield        #147 <Field View mCustomView>
		}
		android.graphics.drawable.Drawable drawable = ((android.support.v7.app.ActionBar.Tab) (obj)).getIcon();
	//   55  107:aload_2         
	//   56  108:invokevirtual   #167 <Method android.graphics.drawable.Drawable android.support.v7.app.ActionBar$Tab.getIcon()>
	//   57  111:astore          4
		obj1 = ((Object) (((android.support.v7.app.ActionBar.Tab) (obj)).getText()));
	//   58  113:aload_2         
	//   59  114:invokevirtual   #171 <Method CharSequence android.support.v7.app.ActionBar$Tab.getText()>
	//   60  117:astore_3        
		boolean flag;
		if(drawable != null)
	//*  61  118:aload           4
	//*  62  120:ifnull          330
		{
			if(mIconView == null)
	//*  63  123:aload_0         
	//*  64  124:getfield        #156 <Field ImageView mIconView>
	//*  65  127:ifnonnull       183
			{
				AppCompatImageView appcompatimageview = new AppCompatImageView(getContext());
	//   66  130:new             #173 <Class AppCompatImageView>
	//   67  133:dup             
	//   68  134:aload_0         
	//   69  135:invokevirtual   #177 <Method Context getContext()>
	//   70  138:invokespecial   #180 <Method void AppCompatImageView(Context)>
	//   71  141:astore          5
				LinearLayoutCompat.LayoutParams layoutparams1 = new LinearLayoutCompat.LayoutParams(-2, -2);
	//   72  143:new             #182 <Class LinearLayoutCompat$LayoutParams>
	//   73  146:dup             
	//   74  147:bipush          -2
	//   75  149:bipush          -2
	//   76  151:invokespecial   #184 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//   77  154:astore          6
				layoutparams1.gravity = 16;
	//   78  156:aload           6
	//   79  158:bipush          16
	//   80  160:putfield        #187 <Field int LinearLayoutCompat$LayoutParams.gravity>
				((ImageView) (appcompatimageview)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   81  163:aload           5
	//   82  165:aload           6
	//   83  167:invokevirtual   #191 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				addView(((View) (appcompatimageview)), 0);
	//   84  170:aload_0         
	//   85  171:aload           5
	//   86  173:iconst_0        
	//   87  174:invokevirtual   #194 <Method void addView(View, int)>
				mIconView = ((ImageView) (appcompatimageview));
	//   88  177:aload_0         
	//   89  178:aload           5
	//   90  180:putfield        #156 <Field ImageView mIconView>
			}
			mIconView.setImageDrawable(drawable);
	//   91  183:aload_0         
	//   92  184:getfield        #156 <Field ImageView mIconView>
	//   93  187:aload           4
	//   94  189:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			mIconView.setVisibility(0);
	//   95  192:aload_0         
	//   96  193:getfield        #156 <Field ImageView mIconView>
	//   97  196:iconst_0        
	//   98  197:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
		} else
	//*  99  200:aload_3         
	//* 100  201:invokestatic    #200 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 101  204:ifne            357
	//* 102  207:iconst_1        
	//* 103  208:istore_1        
	//* 104  209:iload_1         
	//* 105  210:ifeq            362
	//* 106  213:aload_0         
	//* 107  214:getfield        #149 <Field TextView mTextView>
	//* 108  217:ifnonnull       284
	//* 109  220:new             #202 <Class AppCompatTextView>
	//* 110  223:dup             
	//* 111  224:aload_0         
	//* 112  225:invokevirtual   #177 <Method Context getContext()>
	//* 113  228:aconst_null     
	//* 114  229:getstatic       #205 <Field int android.support.v7.appcompat.R$attr.actionBarTabTextStyle>
	//* 115  232:invokespecial   #206 <Method void AppCompatTextView(Context, android.util.AttributeSet, int)>
	//* 116  235:astore          4
	//* 117  237:aload           4
	//* 118  239:getstatic       #212 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//* 119  242:invokevirtual   #216 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
	//* 120  245:new             #182 <Class LinearLayoutCompat$LayoutParams>
	//* 121  248:dup             
	//* 122  249:bipush          -2
	//* 123  251:bipush          -2
	//* 124  253:invokespecial   #184 <Method void LinearLayoutCompat$LayoutParams(int, int)>
	//* 125  256:astore          5
	//* 126  258:aload           5
	//* 127  260:bipush          16
	//* 128  262:putfield        #187 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//* 129  265:aload           4
	//* 130  267:aload           5
	//* 131  269:invokevirtual   #217 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 132  272:aload_0         
	//* 133  273:aload           4
	//* 134  275:invokevirtual   #145 <Method void addView(View)>
	//* 135  278:aload_0         
	//* 136  279:aload           4
	//* 137  281:putfield        #149 <Field TextView mTextView>
	//* 138  284:aload_0         
	//* 139  285:getfield        #149 <Field TextView mTextView>
	//* 140  288:aload_3         
	//* 141  289:invokevirtual   #220 <Method void TextView.setText(CharSequence)>
	//* 142  292:aload_0         
	//* 143  293:getfield        #149 <Field TextView mTextView>
	//* 144  296:iconst_0        
	//* 145  297:invokevirtual   #154 <Method void TextView.setVisibility(int)>
	//* 146  300:aload_0         
	//* 147  301:getfield        #156 <Field ImageView mIconView>
	//* 148  304:ifnull          318
	//* 149  307:aload_0         
	//* 150  308:getfield        #156 <Field ImageView mIconView>
	//* 151  311:aload_2         
	//* 152  312:invokevirtual   #223 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
	//* 153  315:invokevirtual   #226 <Method void ImageView.setContentDescription(CharSequence)>
	//* 154  318:iload_1         
	//* 155  319:ifeq            389
	//* 156  322:aconst_null     
	//* 157  323:astore_2        
	//* 158  324:aload_0         
	//* 159  325:aload_2         
	//* 160  326:invokestatic    #232 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
	//* 161  329:return          
		if(mIconView != null)
	//* 162  330:aload_0         
	//* 163  331:getfield        #156 <Field ImageView mIconView>
	//* 164  334:ifnull          200
		{
			mIconView.setVisibility(8);
	//  165  337:aload_0         
	//  166  338:getfield        #156 <Field ImageView mIconView>
	//  167  341:bipush          8
	//  168  343:invokevirtual   #159 <Method void ImageView.setVisibility(int)>
			mIconView.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//  169  346:aload_0         
	//  170  347:getfield        #156 <Field ImageView mIconView>
	//  171  350:aconst_null     
	//  172  351:invokevirtual   #162 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		}
		if(!TextUtils.isEmpty(((CharSequence) (obj1))))
			flag = true;
		else
	//* 173  354:goto            200
			flag = false;
	//  174  357:iconst_0        
	//  175  358:istore_1        
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
	//* 176  359:goto            209
		if(mTextView != null)
	//* 177  362:aload_0         
	//* 178  363:getfield        #149 <Field TextView mTextView>
	//* 179  366:ifnull          300
		{
			mTextView.setVisibility(8);
	//  180  369:aload_0         
	//  181  370:getfield        #149 <Field TextView mTextView>
	//  182  373:bipush          8
	//  183  375:invokevirtual   #154 <Method void TextView.setVisibility(int)>
			mTextView.setText(((CharSequence) (null)));
	//  184  378:aload_0         
	//  185  379:getfield        #149 <Field TextView mTextView>
	//  186  382:aconst_null     
	//  187  383:invokevirtual   #220 <Method void TextView.setText(CharSequence)>
		}
		if(mIconView != null)
			mIconView.setContentDescription(((android.support.v7.app.ActionBar.Tab) (obj)).getContentDescription());
		if(flag)
			obj = null;
		else
	//* 188  386:goto            300
			obj = ((Object) (((android.support.v7.app.ActionBar.Tab) (obj)).getContentDescription()));
	//  189  389:aload_2         
	//  190  390:invokevirtual   #223 <Method CharSequence android.support.v7.app.ActionBar$Tab.getContentDescription()>
	//  191  393:astore_2        
		TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (obj)));
	//* 192  394:goto            324
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
