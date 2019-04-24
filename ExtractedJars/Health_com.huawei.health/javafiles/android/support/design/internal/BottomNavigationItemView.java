// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.*;

public class BottomNavigationItemView extends FrameLayout
	implements android.support.v7.view.menu.MenuView.ItemView
{

	public BottomNavigationItemView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #44  <Method void BottomNavigationItemView(Context, AttributeSet)>
	//    4    6:return          
	}

	public BottomNavigationItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #48  <Method void BottomNavigationItemView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public BottomNavigationItemView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #49  <Method void FrameLayout(Context, AttributeSet, int)>
		mItemPosition = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #51  <Field int mItemPosition>
		attributeset = ((AttributeSet) (getResources()));
	//    8   12:aload_0         
	//    9   13:invokevirtual   #55  <Method Resources getResources()>
	//   10   16:astore_2        
		i = ((Resources) (attributeset)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_text_size);
	//   11   17:aload_2         
	//   12   18:getstatic       #60  <Field int android.support.design.R$dimen.design_bottom_navigation_text_size>
	//   13   21:invokevirtual   #66  <Method int Resources.getDimensionPixelSize(int)>
	//   14   24:istore_3        
		int j = ((Resources) (attributeset)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_active_text_size);
	//   15   25:aload_2         
	//   16   26:getstatic       #69  <Field int android.support.design.R$dimen.design_bottom_navigation_active_text_size>
	//   17   29:invokevirtual   #66  <Method int Resources.getDimensionPixelSize(int)>
	//   18   32:istore          4
		mDefaultMargin = ((Resources) (attributeset)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_margin);
	//   19   34:aload_0         
	//   20   35:aload_2         
	//   21   36:getstatic       #72  <Field int android.support.design.R$dimen.design_bottom_navigation_margin>
	//   22   39:invokevirtual   #66  <Method int Resources.getDimensionPixelSize(int)>
	//   23   42:putfield        #74  <Field int mDefaultMargin>
		mShiftAmount = i - j;
	//   24   45:aload_0         
	//   25   46:iload_3         
	//   26   47:iload           4
	//   27   49:isub            
	//   28   50:putfield        #76  <Field int mShiftAmount>
		mScaleUpFactor = ((float)j * 1.0F) / (float)i;
	//   29   53:aload_0         
	//   30   54:iload           4
	//   31   56:i2f             
	//   32   57:fconst_1        
	//   33   58:fmul            
	//   34   59:iload_3         
	//   35   60:i2f             
	//   36   61:fdiv            
	//   37   62:putfield        #78  <Field float mScaleUpFactor>
		mScaleDownFactor = ((float)i * 1.0F) / (float)j;
	//   38   65:aload_0         
	//   39   66:iload_3         
	//   40   67:i2f             
	//   41   68:fconst_1        
	//   42   69:fmul            
	//   43   70:iload           4
	//   44   72:i2f             
	//   45   73:fdiv            
	//   46   74:putfield        #80  <Field float mScaleDownFactor>
		LayoutInflater.from(context).inflate(android.support.design.R.layout.design_bottom_navigation_item, ((android.view.ViewGroup) (this)), true);
	//   47   77:aload_1         
	//   48   78:invokestatic    #86  <Method LayoutInflater LayoutInflater.from(Context)>
	//   49   81:getstatic       #91  <Field int android.support.design.R$layout.design_bottom_navigation_item>
	//   50   84:aload_0         
	//   51   85:iconst_1        
	//   52   86:invokevirtual   #95  <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   53   89:pop             
		setBackgroundResource(android.support.design.R.drawable.design_bottom_navigation_item_background);
	//   54   90:aload_0         
	//   55   91:getstatic       #100 <Field int android.support.design.R$drawable.design_bottom_navigation_item_background>
	//   56   94:invokevirtual   #104 <Method void setBackgroundResource(int)>
		mIcon = (ImageView)findViewById(android.support.design.R.id.icon);
	//   57   97:aload_0         
	//   58   98:aload_0         
	//   59   99:getstatic       #109 <Field int android.support.design.R$id.icon>
	//   60  102:invokevirtual   #113 <Method android.view.View findViewById(int)>
	//   61  105:checkcast       #115 <Class ImageView>
	//   62  108:putfield        #117 <Field ImageView mIcon>
		mSmallLabel = (TextView)findViewById(android.support.design.R.id.smallLabel);
	//   63  111:aload_0         
	//   64  112:aload_0         
	//   65  113:getstatic       #120 <Field int android.support.design.R$id.smallLabel>
	//   66  116:invokevirtual   #113 <Method android.view.View findViewById(int)>
	//   67  119:checkcast       #122 <Class TextView>
	//   68  122:putfield        #124 <Field TextView mSmallLabel>
		mLargeLabel = (TextView)findViewById(android.support.design.R.id.largeLabel);
	//   69  125:aload_0         
	//   70  126:aload_0         
	//   71  127:getstatic       #127 <Field int android.support.design.R$id.largeLabel>
	//   72  130:invokevirtual   #113 <Method android.view.View findViewById(int)>
	//   73  133:checkcast       #122 <Class TextView>
	//   74  136:putfield        #129 <Field TextView mLargeLabel>
	//   75  139:return          
	}

	public MenuItemImpl getItemData()
	{
		return mItemData;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field MenuItemImpl mItemData>
	//    2    4:areturn         
	}

	public int getItemPosition()
	{
		return mItemPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int mItemPosition>
	//    2    4:ireturn         
	}

	public void initialize(MenuItemImpl menuitemimpl, int i)
	{
		mItemData = menuitemimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #133 <Field MenuItemImpl mItemData>
		setCheckable(menuitemimpl.isCheckable());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #143 <Method boolean MenuItemImpl.isCheckable()>
	//    6   10:invokevirtual   #147 <Method void setCheckable(boolean)>
		setChecked(menuitemimpl.isChecked());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #150 <Method boolean MenuItemImpl.isChecked()>
	//   10   18:invokevirtual   #153 <Method void setChecked(boolean)>
		setEnabled(menuitemimpl.isEnabled());
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #156 <Method boolean MenuItemImpl.isEnabled()>
	//   14   26:invokevirtual   #159 <Method void setEnabled(boolean)>
		setIcon(menuitemimpl.getIcon());
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #163 <Method Drawable MenuItemImpl.getIcon()>
	//   18   34:invokevirtual   #167 <Method void setIcon(Drawable)>
		setTitle(menuitemimpl.getTitle());
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #171 <Method CharSequence MenuItemImpl.getTitle()>
	//   22   42:invokevirtual   #175 <Method void setTitle(CharSequence)>
		setId(menuitemimpl.getItemId());
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #178 <Method int MenuItemImpl.getItemId()>
	//   26   50:invokevirtual   #181 <Method void setId(int)>
		setContentDescription(menuitemimpl.getContentDescription());
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #184 <Method CharSequence MenuItemImpl.getContentDescription()>
	//   30   58:invokevirtual   #187 <Method void setContentDescription(CharSequence)>
		ViewCompat.setTooltipText(((android.view.View) (this)), menuitemimpl.getTooltipText());
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #190 <Method CharSequence MenuItemImpl.getTooltipText()>
	//   34   66:invokestatic    #196 <Method void ViewCompat.setTooltipText(android.view.View, CharSequence)>
	//   35   69:return          
	}

	public int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #200 <Method int[] FrameLayout.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(mItemData != null && mItemData.isCheckable() && mItemData.isChecked())
	//*   6    8:aload_0         
	//*   7    9:getfield        #133 <Field MenuItemImpl mItemData>
	//*   8   12:ifnull          43
	//*   9   15:aload_0         
	//*  10   16:getfield        #133 <Field MenuItemImpl mItemData>
	//*  11   19:invokevirtual   #143 <Method boolean MenuItemImpl.isCheckable()>
	//*  12   22:ifeq            43
	//*  13   25:aload_0         
	//*  14   26:getfield        #133 <Field MenuItemImpl mItemData>
	//*  15   29:invokevirtual   #150 <Method boolean MenuItemImpl.isChecked()>
	//*  16   32:ifeq            43
			mergeDrawableStates(ai, CHECKED_STATE_SET);
	//   17   35:aload_2         
	//   18   36:getstatic       #37  <Field int[] CHECKED_STATE_SET>
	//   19   39:invokestatic    #204 <Method int[] mergeDrawableStates(int[], int[])>
	//   20   42:pop             
		return ai;
	//   21   43:aload_2         
	//   22   44:areturn         
	}

	public boolean prefersCondensedTitle()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setCheckable(boolean flag)
	{
		refreshDrawableState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #208 <Method void refreshDrawableState()>
	//    2    4:return          
	}

	public void setChecked(boolean flag)
	{
		mLargeLabel.setPivotX(mLargeLabel.getWidth() / 2);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field TextView mLargeLabel>
	//    2    4:aload_0         
	//    3    5:getfield        #129 <Field TextView mLargeLabel>
	//    4    8:invokevirtual   #211 <Method int TextView.getWidth()>
	//    5   11:iconst_2        
	//    6   12:idiv            
	//    7   13:i2f             
	//    8   14:invokevirtual   #215 <Method void TextView.setPivotX(float)>
		mLargeLabel.setPivotY(mLargeLabel.getBaseline());
	//    9   17:aload_0         
	//   10   18:getfield        #129 <Field TextView mLargeLabel>
	//   11   21:aload_0         
	//   12   22:getfield        #129 <Field TextView mLargeLabel>
	//   13   25:invokevirtual   #218 <Method int TextView.getBaseline()>
	//   14   28:i2f             
	//   15   29:invokevirtual   #221 <Method void TextView.setPivotY(float)>
		mSmallLabel.setPivotX(mSmallLabel.getWidth() / 2);
	//   16   32:aload_0         
	//   17   33:getfield        #124 <Field TextView mSmallLabel>
	//   18   36:aload_0         
	//   19   37:getfield        #124 <Field TextView mSmallLabel>
	//   20   40:invokevirtual   #211 <Method int TextView.getWidth()>
	//   21   43:iconst_2        
	//   22   44:idiv            
	//   23   45:i2f             
	//   24   46:invokevirtual   #215 <Method void TextView.setPivotX(float)>
		mSmallLabel.setPivotY(mSmallLabel.getBaseline());
	//   25   49:aload_0         
	//   26   50:getfield        #124 <Field TextView mSmallLabel>
	//   27   53:aload_0         
	//   28   54:getfield        #124 <Field TextView mSmallLabel>
	//   29   57:invokevirtual   #218 <Method int TextView.getBaseline()>
	//   30   60:i2f             
	//   31   61:invokevirtual   #221 <Method void TextView.setPivotY(float)>
		if(mShiftingMode)
	//*  32   64:aload_0         
	//*  33   65:getfield        #223 <Field boolean mShiftingMode>
	//*  34   68:ifeq            205
		{
			if(flag)
	//*  35   71:iload_1         
	//*  36   72:ifeq            135
			{
				android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)mIcon.getLayoutParams();
	//   37   75:aload_0         
	//   38   76:getfield        #117 <Field ImageView mIcon>
	//   39   79:invokevirtual   #227 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   40   82:checkcast       #229 <Class android.widget.FrameLayout$LayoutParams>
	//   41   85:astore_2        
				layoutparams.gravity = 49;
	//   42   86:aload_2         
	//   43   87:bipush          49
	//   44   89:putfield        #232 <Field int android.widget.FrameLayout$LayoutParams.gravity>
				layoutparams.topMargin = mDefaultMargin;
	//   45   92:aload_2         
	//   46   93:aload_0         
	//   47   94:getfield        #74  <Field int mDefaultMargin>
	//   48   97:putfield        #235 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
				mIcon.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   49  100:aload_0         
	//   50  101:getfield        #117 <Field ImageView mIcon>
	//   51  104:aload_2         
	//   52  105:invokevirtual   #239 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				mLargeLabel.setVisibility(0);
	//   53  108:aload_0         
	//   54  109:getfield        #129 <Field TextView mLargeLabel>
	//   55  112:iconst_0        
	//   56  113:invokevirtual   #242 <Method void TextView.setVisibility(int)>
				mLargeLabel.setScaleX(1.0F);
	//   57  116:aload_0         
	//   58  117:getfield        #129 <Field TextView mLargeLabel>
	//   59  120:fconst_1        
	//   60  121:invokevirtual   #245 <Method void TextView.setScaleX(float)>
				mLargeLabel.setScaleY(1.0F);
	//   61  124:aload_0         
	//   62  125:getfield        #129 <Field TextView mLargeLabel>
	//   63  128:fconst_1        
	//   64  129:invokevirtual   #248 <Method void TextView.setScaleY(float)>
			} else
	//*  65  132:goto            194
			{
				android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)mIcon.getLayoutParams();
	//   66  135:aload_0         
	//   67  136:getfield        #117 <Field ImageView mIcon>
	//   68  139:invokevirtual   #227 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   69  142:checkcast       #229 <Class android.widget.FrameLayout$LayoutParams>
	//   70  145:astore_2        
				layoutparams1.gravity = 17;
	//   71  146:aload_2         
	//   72  147:bipush          17
	//   73  149:putfield        #232 <Field int android.widget.FrameLayout$LayoutParams.gravity>
				layoutparams1.topMargin = mDefaultMargin;
	//   74  152:aload_2         
	//   75  153:aload_0         
	//   76  154:getfield        #74  <Field int mDefaultMargin>
	//   77  157:putfield        #235 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
				mIcon.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   78  160:aload_0         
	//   79  161:getfield        #117 <Field ImageView mIcon>
	//   80  164:aload_2         
	//   81  165:invokevirtual   #239 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				mLargeLabel.setVisibility(4);
	//   82  168:aload_0         
	//   83  169:getfield        #129 <Field TextView mLargeLabel>
	//   84  172:iconst_4        
	//   85  173:invokevirtual   #242 <Method void TextView.setVisibility(int)>
				mLargeLabel.setScaleX(0.5F);
	//   86  176:aload_0         
	//   87  177:getfield        #129 <Field TextView mLargeLabel>
	//   88  180:ldc1            #249 <Float 0.5F>
	//   89  182:invokevirtual   #245 <Method void TextView.setScaleX(float)>
				mLargeLabel.setScaleY(0.5F);
	//   90  185:aload_0         
	//   91  186:getfield        #129 <Field TextView mLargeLabel>
	//   92  189:ldc1            #249 <Float 0.5F>
	//   93  191:invokevirtual   #248 <Method void TextView.setScaleY(float)>
			}
			mSmallLabel.setVisibility(4);
	//   94  194:aload_0         
	//   95  195:getfield        #124 <Field TextView mSmallLabel>
	//   96  198:iconst_4        
	//   97  199:invokevirtual   #242 <Method void TextView.setVisibility(int)>
		} else
	//*  98  202:goto            391
		if(flag)
	//*  99  205:iload_1         
	//* 100  206:ifeq            304
		{
			android.widget.FrameLayout.LayoutParams layoutparams2 = (android.widget.FrameLayout.LayoutParams)mIcon.getLayoutParams();
	//  101  209:aload_0         
	//  102  210:getfield        #117 <Field ImageView mIcon>
	//  103  213:invokevirtual   #227 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//  104  216:checkcast       #229 <Class android.widget.FrameLayout$LayoutParams>
	//  105  219:astore_2        
			layoutparams2.gravity = 49;
	//  106  220:aload_2         
	//  107  221:bipush          49
	//  108  223:putfield        #232 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			layoutparams2.topMargin = mDefaultMargin + mShiftAmount;
	//  109  226:aload_2         
	//  110  227:aload_0         
	//  111  228:getfield        #74  <Field int mDefaultMargin>
	//  112  231:aload_0         
	//  113  232:getfield        #76  <Field int mShiftAmount>
	//  114  235:iadd            
	//  115  236:putfield        #235 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
			mIcon.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams2)));
	//  116  239:aload_0         
	//  117  240:getfield        #117 <Field ImageView mIcon>
	//  118  243:aload_2         
	//  119  244:invokevirtual   #239 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			mLargeLabel.setVisibility(0);
	//  120  247:aload_0         
	//  121  248:getfield        #129 <Field TextView mLargeLabel>
	//  122  251:iconst_0        
	//  123  252:invokevirtual   #242 <Method void TextView.setVisibility(int)>
			mSmallLabel.setVisibility(4);
	//  124  255:aload_0         
	//  125  256:getfield        #124 <Field TextView mSmallLabel>
	//  126  259:iconst_4        
	//  127  260:invokevirtual   #242 <Method void TextView.setVisibility(int)>
			mLargeLabel.setScaleX(1.0F);
	//  128  263:aload_0         
	//  129  264:getfield        #129 <Field TextView mLargeLabel>
	//  130  267:fconst_1        
	//  131  268:invokevirtual   #245 <Method void TextView.setScaleX(float)>
			mLargeLabel.setScaleY(1.0F);
	//  132  271:aload_0         
	//  133  272:getfield        #129 <Field TextView mLargeLabel>
	//  134  275:fconst_1        
	//  135  276:invokevirtual   #248 <Method void TextView.setScaleY(float)>
			mSmallLabel.setScaleX(mScaleUpFactor);
	//  136  279:aload_0         
	//  137  280:getfield        #124 <Field TextView mSmallLabel>
	//  138  283:aload_0         
	//  139  284:getfield        #78  <Field float mScaleUpFactor>
	//  140  287:invokevirtual   #245 <Method void TextView.setScaleX(float)>
			mSmallLabel.setScaleY(mScaleUpFactor);
	//  141  290:aload_0         
	//  142  291:getfield        #124 <Field TextView mSmallLabel>
	//  143  294:aload_0         
	//  144  295:getfield        #78  <Field float mScaleUpFactor>
	//  145  298:invokevirtual   #248 <Method void TextView.setScaleY(float)>
		} else
	//* 146  301:goto            391
		{
			android.widget.FrameLayout.LayoutParams layoutparams3 = (android.widget.FrameLayout.LayoutParams)mIcon.getLayoutParams();
	//  147  304:aload_0         
	//  148  305:getfield        #117 <Field ImageView mIcon>
	//  149  308:invokevirtual   #227 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//  150  311:checkcast       #229 <Class android.widget.FrameLayout$LayoutParams>
	//  151  314:astore_2        
			layoutparams3.gravity = 49;
	//  152  315:aload_2         
	//  153  316:bipush          49
	//  154  318:putfield        #232 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			layoutparams3.topMargin = mDefaultMargin;
	//  155  321:aload_2         
	//  156  322:aload_0         
	//  157  323:getfield        #74  <Field int mDefaultMargin>
	//  158  326:putfield        #235 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
			mIcon.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams3)));
	//  159  329:aload_0         
	//  160  330:getfield        #117 <Field ImageView mIcon>
	//  161  333:aload_2         
	//  162  334:invokevirtual   #239 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			mLargeLabel.setVisibility(4);
	//  163  337:aload_0         
	//  164  338:getfield        #129 <Field TextView mLargeLabel>
	//  165  341:iconst_4        
	//  166  342:invokevirtual   #242 <Method void TextView.setVisibility(int)>
			mSmallLabel.setVisibility(0);
	//  167  345:aload_0         
	//  168  346:getfield        #124 <Field TextView mSmallLabel>
	//  169  349:iconst_0        
	//  170  350:invokevirtual   #242 <Method void TextView.setVisibility(int)>
			mLargeLabel.setScaleX(mScaleDownFactor);
	//  171  353:aload_0         
	//  172  354:getfield        #129 <Field TextView mLargeLabel>
	//  173  357:aload_0         
	//  174  358:getfield        #80  <Field float mScaleDownFactor>
	//  175  361:invokevirtual   #245 <Method void TextView.setScaleX(float)>
			mLargeLabel.setScaleY(mScaleDownFactor);
	//  176  364:aload_0         
	//  177  365:getfield        #129 <Field TextView mLargeLabel>
	//  178  368:aload_0         
	//  179  369:getfield        #80  <Field float mScaleDownFactor>
	//  180  372:invokevirtual   #248 <Method void TextView.setScaleY(float)>
			mSmallLabel.setScaleX(1.0F);
	//  181  375:aload_0         
	//  182  376:getfield        #124 <Field TextView mSmallLabel>
	//  183  379:fconst_1        
	//  184  380:invokevirtual   #245 <Method void TextView.setScaleX(float)>
			mSmallLabel.setScaleY(1.0F);
	//  185  383:aload_0         
	//  186  384:getfield        #124 <Field TextView mSmallLabel>
	//  187  387:fconst_1        
	//  188  388:invokevirtual   #248 <Method void TextView.setScaleY(float)>
		}
		refreshDrawableState();
	//  189  391:aload_0         
	//  190  392:invokevirtual   #208 <Method void refreshDrawableState()>
	//  191  395:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #250 <Method void FrameLayout.setEnabled(boolean)>
		mSmallLabel.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #124 <Field TextView mSmallLabel>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #251 <Method void TextView.setEnabled(boolean)>
		mLargeLabel.setEnabled(flag);
	//    7   13:aload_0         
	//    8   14:getfield        #129 <Field TextView mLargeLabel>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #251 <Method void TextView.setEnabled(boolean)>
		mIcon.setEnabled(flag);
	//   11   21:aload_0         
	//   12   22:getfield        #117 <Field ImageView mIcon>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #252 <Method void ImageView.setEnabled(boolean)>
		if(flag)
	//*  15   29:iload_1         
	//*  16   30:ifeq            48
		{
			ViewCompat.setPointerIcon(((android.view.View) (this)), PointerIconCompat.getSystemIcon(getContext(), 1002));
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:invokevirtual   #256 <Method Context getContext()>
	//   20   38:sipush          1002
	//   21   41:invokestatic    #262 <Method PointerIconCompat PointerIconCompat.getSystemIcon(Context, int)>
	//   22   44:invokestatic    #266 <Method void ViewCompat.setPointerIcon(android.view.View, PointerIconCompat)>
			return;
	//   23   47:return          
		} else
		{
			ViewCompat.setPointerIcon(((android.view.View) (this)), ((PointerIconCompat) (null)));
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:invokestatic    #266 <Method void ViewCompat.setPointerIcon(android.view.View, PointerIconCompat)>
			return;
	//   27   53:return          
		}
	}

	public void setIcon(Drawable drawable)
	{
		Object obj = ((Object) (drawable));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(drawable != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          39
		{
			obj = ((Object) (drawable.getConstantState()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #272 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    6   10:astore_2        
			if(obj != null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       18
	//*   9   15:goto            23
				drawable = ((android.graphics.drawable.Drawable.ConstantState) (obj)).newDrawable();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #277 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   12   22:astore_1        
			obj = ((Object) (DrawableCompat.wrap(drawable).mutate()));
	//   13   23:aload_1         
	//   14   24:invokestatic    #283 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   15   27:invokevirtual   #286 <Method Drawable Drawable.mutate()>
	//   16   30:astore_2        
			DrawableCompat.setTintList(((Drawable) (obj)), mIconTint);
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #288 <Field ColorStateList mIconTint>
	//   20   36:invokestatic    #292 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		}
		mIcon.setImageDrawable(((Drawable) (obj)));
	//   21   39:aload_0         
	//   22   40:getfield        #117 <Field ImageView mIcon>
	//   23   43:aload_2         
	//   24   44:invokevirtual   #295 <Method void ImageView.setImageDrawable(Drawable)>
	//   25   47:return          
	}

	public void setIconTintList(ColorStateList colorstatelist)
	{
		mIconTint = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #288 <Field ColorStateList mIconTint>
		if(mItemData != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #133 <Field MenuItemImpl mItemData>
	//*   5    9:ifnull          23
			setIcon(mItemData.getIcon());
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #133 <Field MenuItemImpl mItemData>
	//    9   17:invokevirtual   #163 <Method Drawable MenuItemImpl.getIcon()>
	//   10   20:invokevirtual   #167 <Method void setIcon(Drawable)>
	//   11   23:return          
	}

	public void setItemBackground(int i)
	{
		Drawable drawable;
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			drawable = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            18
			drawable = ContextCompat.getDrawable(getContext(), i);
	//    5    9:aload_0         
	//    6   10:invokevirtual   #256 <Method Context getContext()>
	//    7   13:iload_1         
	//    8   14:invokestatic    #304 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    9   17:astore_2        
		ViewCompat.setBackground(((android.view.View) (this)), drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokestatic    #308 <Method void ViewCompat.setBackground(android.view.View, Drawable)>
	//   13   23:return          
	}

	public void setItemPosition(int i)
	{
		mItemPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field int mItemPosition>
	//    3    5:return          
	}

	public void setShiftingMode(boolean flag)
	{
		mShiftingMode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #223 <Field boolean mShiftingMode>
	//    3    5:return          
	}

	public void setShortcut(boolean flag, char c)
	{
	//    0    0:return          
	}

	public void setTextColor(ColorStateList colorstatelist)
	{
		mSmallLabel.setTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field TextView mSmallLabel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #315 <Method void TextView.setTextColor(ColorStateList)>
		mLargeLabel.setTextColor(colorstatelist);
	//    4    8:aload_0         
	//    5    9:getfield        #129 <Field TextView mLargeLabel>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #315 <Method void TextView.setTextColor(ColorStateList)>
	//    8   16:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mSmallLabel.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field TextView mSmallLabel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #318 <Method void TextView.setText(CharSequence)>
		mLargeLabel.setText(charsequence);
	//    4    8:aload_0         
	//    5    9:getfield        #129 <Field TextView mLargeLabel>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #318 <Method void TextView.setText(CharSequence)>
		setContentDescription(charsequence);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #187 <Method void setContentDescription(CharSequence)>
	//   11   21:return          
	}

	public boolean showsIcon()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	public static final int INVALID_ITEM_POSITION = -1;
	private final int mDefaultMargin;
	private ImageView mIcon;
	private ColorStateList mIconTint;
	private MenuItemImpl mItemData;
	private int mItemPosition;
	private final TextView mLargeLabel;
	private final float mScaleDownFactor;
	private final float mScaleUpFactor;
	private final int mShiftAmount;
	private boolean mShiftingMode;
	private final TextView mSmallLabel;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #35  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #37  <Field int[] CHECKED_STATE_SET>
	//*   7   11:return          
	}
}
