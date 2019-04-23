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
import android.support.v4.widget.TextViewCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
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
	//    3    3:invokespecial   #45  <Method void BottomNavigationItemView(Context, AttributeSet)>
	//    4    6:return          
	}

	public BottomNavigationItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #49  <Method void BottomNavigationItemView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public BottomNavigationItemView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #50  <Method void FrameLayout(Context, AttributeSet, int)>
		itemPosition = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #52  <Field int itemPosition>
		attributeset = ((AttributeSet) (getResources()));
	//    8   12:aload_0         
	//    9   13:invokevirtual   #56  <Method Resources getResources()>
	//   10   16:astore_2        
		LayoutInflater.from(context).inflate(android.support.design.R.layout.design_bottom_navigation_item, ((android.view.ViewGroup) (this)), true);
	//   11   17:aload_1         
	//   12   18:invokestatic    #62  <Method LayoutInflater LayoutInflater.from(Context)>
	//   13   21:getstatic       #67  <Field int android.support.design.R$layout.design_bottom_navigation_item>
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:invokevirtual   #71  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   17   29:pop             
		setBackgroundResource(android.support.design.R.drawable.design_bottom_navigation_item_background);
	//   18   30:aload_0         
	//   19   31:getstatic       #76  <Field int android.support.design.R$drawable.design_bottom_navigation_item_background>
	//   20   34:invokevirtual   #80  <Method void setBackgroundResource(int)>
		defaultMargin = ((Resources) (attributeset)).getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_margin);
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:getstatic       #85  <Field int android.support.design.R$dimen.design_bottom_navigation_margin>
	//   24   42:invokevirtual   #91  <Method int Resources.getDimensionPixelSize(int)>
	//   25   45:putfield        #93  <Field int defaultMargin>
		icon = (ImageView)findViewById(android.support.design.R.id.icon);
	//   26   48:aload_0         
	//   27   49:aload_0         
	//   28   50:getstatic       #97  <Field int android.support.design.R$id.icon>
	//   29   53:invokevirtual   #101 <Method View findViewById(int)>
	//   30   56:checkcast       #103 <Class ImageView>
	//   31   59:putfield        #105 <Field ImageView icon>
		smallLabel = (TextView)findViewById(android.support.design.R.id.smallLabel);
	//   32   62:aload_0         
	//   33   63:aload_0         
	//   34   64:getstatic       #107 <Field int android.support.design.R$id.smallLabel>
	//   35   67:invokevirtual   #101 <Method View findViewById(int)>
	//   36   70:checkcast       #109 <Class TextView>
	//   37   73:putfield        #111 <Field TextView smallLabel>
		largeLabel = (TextView)findViewById(android.support.design.R.id.largeLabel);
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:getstatic       #113 <Field int android.support.design.R$id.largeLabel>
	//   41   81:invokevirtual   #101 <Method View findViewById(int)>
	//   42   84:checkcast       #109 <Class TextView>
	//   43   87:putfield        #115 <Field TextView largeLabel>
		ViewCompat.setImportantForAccessibility(((View) (smallLabel)), 2);
	//   44   90:aload_0         
	//   45   91:getfield        #111 <Field TextView smallLabel>
	//   46   94:iconst_2        
	//   47   95:invokestatic    #121 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		ViewCompat.setImportantForAccessibility(((View) (largeLabel)), 2);
	//   48   98:aload_0         
	//   49   99:getfield        #115 <Field TextView largeLabel>
	//   50  102:iconst_2        
	//   51  103:invokestatic    #121 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		setFocusable(true);
	//   52  106:aload_0         
	//   53  107:iconst_1        
	//   54  108:invokevirtual   #125 <Method void setFocusable(boolean)>
		calculateTextScaleFactors(smallLabel.getTextSize(), largeLabel.getTextSize());
	//   55  111:aload_0         
	//   56  112:aload_0         
	//   57  113:getfield        #111 <Field TextView smallLabel>
	//   58  116:invokevirtual   #129 <Method float TextView.getTextSize()>
	//   59  119:aload_0         
	//   60  120:getfield        #115 <Field TextView largeLabel>
	//   61  123:invokevirtual   #129 <Method float TextView.getTextSize()>
	//   62  126:invokespecial   #133 <Method void calculateTextScaleFactors(float, float)>
	//   63  129:return          
	}

	private void calculateTextScaleFactors(float f, float f1)
	{
		shiftAmount = f - f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fsub            
	//    4    4:putfield        #135 <Field float shiftAmount>
		scaleUpFactor = (f1 * 1.0F) / f;
	//    5    7:aload_0         
	//    6    8:fload_2         
	//    7    9:fconst_1        
	//    8   10:fmul            
	//    9   11:fload_1         
	//   10   12:fdiv            
	//   11   13:putfield        #137 <Field float scaleUpFactor>
		scaleDownFactor = (f * 1.0F) / f1;
	//   12   16:aload_0         
	//   13   17:fload_1         
	//   14   18:fconst_1        
	//   15   19:fmul            
	//   16   20:fload_2         
	//   17   21:fdiv            
	//   18   22:putfield        #139 <Field float scaleDownFactor>
	//   19   25:return          
	}

	private void setViewLayoutParams(View view, int i, int j)
	{
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #147 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #149 <Class android.widget.FrameLayout$LayoutParams>
	//    3    7:astore          4
		layoutparams.topMargin = i;
	//    4    9:aload           4
	//    5   11:iload_2         
	//    6   12:putfield        #152 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
		layoutparams.gravity = j;
	//    7   15:aload           4
	//    8   17:iload_3         
	//    9   18:putfield        #155 <Field int android.widget.FrameLayout$LayoutParams.gravity>
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   10   21:aload_1         
	//   11   22:aload           4
	//   12   24:invokevirtual   #159 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:return          
	}

	private void setViewValues(View view, float f, float f1, int i)
	{
		view.setScaleX(f);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:invokevirtual   #165 <Method void View.setScaleX(float)>
		view.setScaleY(f1);
	//    3    5:aload_1         
	//    4    6:fload_3         
	//    5    7:invokevirtual   #168 <Method void View.setScaleY(float)>
		view.setVisibility(i);
	//    6   10:aload_1         
	//    7   11:iload           4
	//    8   13:invokevirtual   #171 <Method void View.setVisibility(int)>
	//    9   16:return          
	}

	public MenuItemImpl getItemData()
	{
		return itemData;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field MenuItemImpl itemData>
	//    2    4:areturn         
	}

	public int getItemPosition()
	{
		return itemPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int itemPosition>
	//    2    4:ireturn         
	}

	public void initialize(MenuItemImpl menuitemimpl, int i)
	{
		itemData = menuitemimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #175 <Field MenuItemImpl itemData>
		setCheckable(menuitemimpl.isCheckable());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #185 <Method boolean MenuItemImpl.isCheckable()>
	//    6   10:invokevirtual   #188 <Method void setCheckable(boolean)>
		setChecked(menuitemimpl.isChecked());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #191 <Method boolean MenuItemImpl.isChecked()>
	//   10   18:invokevirtual   #194 <Method void setChecked(boolean)>
		setEnabled(menuitemimpl.isEnabled());
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #197 <Method boolean MenuItemImpl.isEnabled()>
	//   14   26:invokevirtual   #200 <Method void setEnabled(boolean)>
		setIcon(menuitemimpl.getIcon());
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #204 <Method Drawable MenuItemImpl.getIcon()>
	//   18   34:invokevirtual   #208 <Method void setIcon(Drawable)>
		setTitle(menuitemimpl.getTitle());
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #212 <Method CharSequence MenuItemImpl.getTitle()>
	//   22   42:invokevirtual   #216 <Method void setTitle(CharSequence)>
		setId(menuitemimpl.getItemId());
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #219 <Method int MenuItemImpl.getItemId()>
	//   26   50:invokevirtual   #222 <Method void setId(int)>
		if(!TextUtils.isEmpty(menuitemimpl.getContentDescription()))
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #225 <Method CharSequence MenuItemImpl.getContentDescription()>
	//*  29   57:invokestatic    #231 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   60:ifne            71
			setContentDescription(menuitemimpl.getContentDescription());
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokevirtual   #225 <Method CharSequence MenuItemImpl.getContentDescription()>
	//   34   68:invokevirtual   #234 <Method void setContentDescription(CharSequence)>
		TooltipCompat.setTooltipText(((View) (this)), menuitemimpl.getTooltipText());
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #237 <Method CharSequence MenuItemImpl.getTooltipText()>
	//   38   76:invokestatic    #243 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		if(menuitemimpl.isVisible())
	//*  39   79:aload_1         
	//*  40   80:invokevirtual   #246 <Method boolean MenuItemImpl.isVisible()>
	//*  41   83:ifeq            91
			i = 0;
	//   42   86:iconst_0        
	//   43   87:istore_2        
		else
	//*  44   88:goto            94
			i = 8;
	//   45   91:bipush          8
	//   46   93:istore_2        
		setVisibility(i);
	//   47   94:aload_0         
	//   48   95:iload_2         
	//   49   96:invokevirtual   #247 <Method void setVisibility(int)>
	//   50   99:return          
	}

	public int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #251 <Method int[] FrameLayout.onCreateDrawableState(int)>
	//    5    7:astore_2        
		MenuItemImpl menuitemimpl = itemData;
	//    6    8:aload_0         
	//    7    9:getfield        #175 <Field MenuItemImpl itemData>
	//    8   12:astore_3        
		if(menuitemimpl != null && menuitemimpl.isCheckable() && itemData.isChecked())
	//*   9   13:aload_3         
	//*  10   14:ifnull          42
	//*  11   17:aload_3         
	//*  12   18:invokevirtual   #185 <Method boolean MenuItemImpl.isCheckable()>
	//*  13   21:ifeq            42
	//*  14   24:aload_0         
	//*  15   25:getfield        #175 <Field MenuItemImpl itemData>
	//*  16   28:invokevirtual   #191 <Method boolean MenuItemImpl.isChecked()>
	//*  17   31:ifeq            42
			mergeDrawableStates(ai, CHECKED_STATE_SET);
	//   18   34:aload_2         
	//   19   35:getstatic       #38  <Field int[] CHECKED_STATE_SET>
	//   20   38:invokestatic    #255 <Method int[] mergeDrawableStates(int[], int[])>
	//   21   41:pop             
		return ai;
	//   22   42:aload_2         
	//   23   43:areturn         
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
	//    1    1:invokevirtual   #259 <Method void refreshDrawableState()>
	//    2    4:return          
	}

	public void setChecked(boolean flag)
	{
		TextView textview = largeLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field TextView largeLabel>
	//    2    4:astore_3        
		textview.setPivotX(textview.getWidth() / 2);
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #262 <Method int TextView.getWidth()>
	//    6   10:iconst_2        
	//    7   11:idiv            
	//    8   12:i2f             
	//    9   13:invokevirtual   #265 <Method void TextView.setPivotX(float)>
		textview = largeLabel;
	//   10   16:aload_0         
	//   11   17:getfield        #115 <Field TextView largeLabel>
	//   12   20:astore_3        
		textview.setPivotY(textview.getBaseline());
	//   13   21:aload_3         
	//   14   22:aload_3         
	//   15   23:invokevirtual   #268 <Method int TextView.getBaseline()>
	//   16   26:i2f             
	//   17   27:invokevirtual   #271 <Method void TextView.setPivotY(float)>
		textview = smallLabel;
	//   18   30:aload_0         
	//   19   31:getfield        #111 <Field TextView smallLabel>
	//   20   34:astore_3        
		textview.setPivotX(textview.getWidth() / 2);
	//   21   35:aload_3         
	//   22   36:aload_3         
	//   23   37:invokevirtual   #262 <Method int TextView.getWidth()>
	//   24   40:iconst_2        
	//   25   41:idiv            
	//   26   42:i2f             
	//   27   43:invokevirtual   #265 <Method void TextView.setPivotX(float)>
		textview = smallLabel;
	//   28   46:aload_0         
	//   29   47:getfield        #111 <Field TextView smallLabel>
	//   30   50:astore_3        
		textview.setPivotY(textview.getBaseline());
	//   31   51:aload_3         
	//   32   52:aload_3         
	//   33   53:invokevirtual   #268 <Method int TextView.getBaseline()>
	//   34   56:i2f             
	//   35   57:invokevirtual   #271 <Method void TextView.setPivotY(float)>
		switch(labelVisibilityMode)
	//*  36   60:aload_0         
	//*  37   61:getfield        #273 <Field int labelVisibilityMode>
		{
		default:
			break;

	//*  38   64:tableswitch     -1 2: default 96
	//	               -1 309
	//	               0 237
	//	               1 134
	//	               2 99
	//*  39   96:goto            488
		case 2: // '\002'
			setViewLayoutParams(((View) (icon)), defaultMargin, 17);
	//   40   99:aload_0         
	//   41  100:aload_0         
	//   42  101:getfield        #105 <Field ImageView icon>
	//   43  104:aload_0         
	//   44  105:getfield        #93  <Field int defaultMargin>
	//   45  108:bipush          17
	//   46  110:invokespecial   #275 <Method void setViewLayoutParams(View, int, int)>
			largeLabel.setVisibility(8);
	//   47  113:aload_0         
	//   48  114:getfield        #115 <Field TextView largeLabel>
	//   49  117:bipush          8
	//   50  119:invokevirtual   #276 <Method void TextView.setVisibility(int)>
			smallLabel.setVisibility(8);
	//   51  122:aload_0         
	//   52  123:getfield        #111 <Field TextView smallLabel>
	//   53  126:bipush          8
	//   54  128:invokevirtual   #276 <Method void TextView.setVisibility(int)>
			break;
	//   55  131:goto            488

		case 1: // '\001'
			if(flag)
	//*  56  134:iload_1         
	//*  57  135:ifeq            191
			{
				setViewLayoutParams(((View) (icon)), (int)((float)defaultMargin + shiftAmount), 49);
	//   58  138:aload_0         
	//   59  139:aload_0         
	//   60  140:getfield        #105 <Field ImageView icon>
	//   61  143:aload_0         
	//   62  144:getfield        #93  <Field int defaultMargin>
	//   63  147:i2f             
	//   64  148:aload_0         
	//   65  149:getfield        #135 <Field float shiftAmount>
	//   66  152:fadd            
	//   67  153:f2i             
	//   68  154:bipush          49
	//   69  156:invokespecial   #275 <Method void setViewLayoutParams(View, int, int)>
				setViewValues(((View) (largeLabel)), 1.0F, 1.0F, 0);
	//   70  159:aload_0         
	//   71  160:aload_0         
	//   72  161:getfield        #115 <Field TextView largeLabel>
	//   73  164:fconst_1        
	//   74  165:fconst_1        
	//   75  166:iconst_0        
	//   76  167:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
				TextView textview1 = smallLabel;
	//   77  170:aload_0         
	//   78  171:getfield        #111 <Field TextView smallLabel>
	//   79  174:astore_3        
				float f = scaleUpFactor;
	//   80  175:aload_0         
	//   81  176:getfield        #137 <Field float scaleUpFactor>
	//   82  179:fstore_2        
				setViewValues(((View) (textview1)), f, f, 4);
	//   83  180:aload_0         
	//   84  181:aload_3         
	//   85  182:fload_2         
	//   86  183:fload_2         
	//   87  184:iconst_4        
	//   88  185:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
			} else
	//*  89  188:goto            488
			{
				setViewLayoutParams(((View) (icon)), defaultMargin, 49);
	//   90  191:aload_0         
	//   91  192:aload_0         
	//   92  193:getfield        #105 <Field ImageView icon>
	//   93  196:aload_0         
	//   94  197:getfield        #93  <Field int defaultMargin>
	//   95  200:bipush          49
	//   96  202:invokespecial   #275 <Method void setViewLayoutParams(View, int, int)>
				TextView textview2 = largeLabel;
	//   97  205:aload_0         
	//   98  206:getfield        #115 <Field TextView largeLabel>
	//   99  209:astore_3        
				float f1 = scaleDownFactor;
	//  100  210:aload_0         
	//  101  211:getfield        #139 <Field float scaleDownFactor>
	//  102  214:fstore_2        
				setViewValues(((View) (textview2)), f1, f1, 4);
	//  103  215:aload_0         
	//  104  216:aload_3         
	//  105  217:fload_2         
	//  106  218:fload_2         
	//  107  219:iconst_4        
	//  108  220:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
				setViewValues(((View) (smallLabel)), 1.0F, 1.0F, 0);
	//  109  223:aload_0         
	//  110  224:aload_0         
	//  111  225:getfield        #111 <Field TextView smallLabel>
	//  112  228:fconst_1        
	//  113  229:fconst_1        
	//  114  230:iconst_0        
	//  115  231:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
			}
			break;
	//  116  234:goto            488

		case 0: // '\0'
			if(flag)
	//* 117  237:iload_1         
	//* 118  238:ifeq            269
			{
				setViewLayoutParams(((View) (icon)), defaultMargin, 49);
	//  119  241:aload_0         
	//  120  242:aload_0         
	//  121  243:getfield        #105 <Field ImageView icon>
	//  122  246:aload_0         
	//  123  247:getfield        #93  <Field int defaultMargin>
	//  124  250:bipush          49
	//  125  252:invokespecial   #275 <Method void setViewLayoutParams(View, int, int)>
				setViewValues(((View) (largeLabel)), 1.0F, 1.0F, 0);
	//  126  255:aload_0         
	//  127  256:aload_0         
	//  128  257:getfield        #115 <Field TextView largeLabel>
	//  129  260:fconst_1        
	//  130  261:fconst_1        
	//  131  262:iconst_0        
	//  132  263:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
			} else
	//* 133  266:goto            298
			{
				setViewLayoutParams(((View) (icon)), defaultMargin, 17);
	//  134  269:aload_0         
	//  135  270:aload_0         
	//  136  271:getfield        #105 <Field ImageView icon>
	//  137  274:aload_0         
	//  138  275:getfield        #93  <Field int defaultMargin>
	//  139  278:bipush          17
	//  140  280:invokespecial   #275 <Method void setViewLayoutParams(View, int, int)>
				setViewValues(((View) (largeLabel)), 0.5F, 0.5F, 4);
	//  141  283:aload_0         
	//  142  284:aload_0         
	//  143  285:getfield        #115 <Field TextView largeLabel>
	//  144  288:ldc2            #279 <Float 0.5F>
	//  145  291:ldc2            #279 <Float 0.5F>
	//  146  294:iconst_4        
	//  147  295:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
			}
			smallLabel.setVisibility(4);
	//  148  298:aload_0         
	//  149  299:getfield        #111 <Field TextView smallLabel>
	//  150  302:iconst_4        
	//  151  303:invokevirtual   #276 <Method void TextView.setVisibility(int)>
			break;
	//  152  306:goto            488

		case -1: 
			if(isShifting)
	//* 153  309:aload_0         
	//* 154  310:getfield        #281 <Field boolean isShifting>
	//* 155  313:ifeq            388
			{
				if(flag)
	//* 156  316:iload_1         
	//* 157  317:ifeq            348
				{
					setViewLayoutParams(((View) (icon)), defaultMargin, 49);
	//  158  320:aload_0         
	//  159  321:aload_0         
	//  160  322:getfield        #105 <Field ImageView icon>
	//  161  325:aload_0         
	//  162  326:getfield        #93  <Field int defaultMargin>
	//  163  329:bipush          49
	//  164  331:invokespecial   #275 <Method void setViewLayoutParams(View, int, int)>
					setViewValues(((View) (largeLabel)), 1.0F, 1.0F, 0);
	//  165  334:aload_0         
	//  166  335:aload_0         
	//  167  336:getfield        #115 <Field TextView largeLabel>
	//  168  339:fconst_1        
	//  169  340:fconst_1        
	//  170  341:iconst_0        
	//  171  342:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
				} else
	//* 172  345:goto            377
				{
					setViewLayoutParams(((View) (icon)), defaultMargin, 17);
	//  173  348:aload_0         
	//  174  349:aload_0         
	//  175  350:getfield        #105 <Field ImageView icon>
	//  176  353:aload_0         
	//  177  354:getfield        #93  <Field int defaultMargin>
	//  178  357:bipush          17
	//  179  359:invokespecial   #275 <Method void setViewLayoutParams(View, int, int)>
					setViewValues(((View) (largeLabel)), 0.5F, 0.5F, 4);
	//  180  362:aload_0         
	//  181  363:aload_0         
	//  182  364:getfield        #115 <Field TextView largeLabel>
	//  183  367:ldc2            #279 <Float 0.5F>
	//  184  370:ldc2            #279 <Float 0.5F>
	//  185  373:iconst_4        
	//  186  374:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
				}
				smallLabel.setVisibility(4);
	//  187  377:aload_0         
	//  188  378:getfield        #111 <Field TextView smallLabel>
	//  189  381:iconst_4        
	//  190  382:invokevirtual   #276 <Method void TextView.setVisibility(int)>
				break;
	//  191  385:goto            488
			}
			if(flag)
	//* 192  388:iload_1         
	//* 193  389:ifeq            445
			{
				setViewLayoutParams(((View) (icon)), (int)((float)defaultMargin + shiftAmount), 49);
	//  194  392:aload_0         
	//  195  393:aload_0         
	//  196  394:getfield        #105 <Field ImageView icon>
	//  197  397:aload_0         
	//  198  398:getfield        #93  <Field int defaultMargin>
	//  199  401:i2f             
	//  200  402:aload_0         
	//  201  403:getfield        #135 <Field float shiftAmount>
	//  202  406:fadd            
	//  203  407:f2i             
	//  204  408:bipush          49
	//  205  410:invokespecial   #275 <Method void setViewLayoutParams(View, int, int)>
				setViewValues(((View) (largeLabel)), 1.0F, 1.0F, 0);
	//  206  413:aload_0         
	//  207  414:aload_0         
	//  208  415:getfield        #115 <Field TextView largeLabel>
	//  209  418:fconst_1        
	//  210  419:fconst_1        
	//  211  420:iconst_0        
	//  212  421:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
				TextView textview3 = smallLabel;
	//  213  424:aload_0         
	//  214  425:getfield        #111 <Field TextView smallLabel>
	//  215  428:astore_3        
				float f2 = scaleUpFactor;
	//  216  429:aload_0         
	//  217  430:getfield        #137 <Field float scaleUpFactor>
	//  218  433:fstore_2        
				setViewValues(((View) (textview3)), f2, f2, 4);
	//  219  434:aload_0         
	//  220  435:aload_3         
	//  221  436:fload_2         
	//  222  437:fload_2         
	//  223  438:iconst_4        
	//  224  439:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
			} else
	//* 225  442:goto            488
			{
				setViewLayoutParams(((View) (icon)), defaultMargin, 49);
	//  226  445:aload_0         
	//  227  446:aload_0         
	//  228  447:getfield        #105 <Field ImageView icon>
	//  229  450:aload_0         
	//  230  451:getfield        #93  <Field int defaultMargin>
	//  231  454:bipush          49
	//  232  456:invokespecial   #275 <Method void setViewLayoutParams(View, int, int)>
				TextView textview4 = largeLabel;
	//  233  459:aload_0         
	//  234  460:getfield        #115 <Field TextView largeLabel>
	//  235  463:astore_3        
				float f3 = scaleDownFactor;
	//  236  464:aload_0         
	//  237  465:getfield        #139 <Field float scaleDownFactor>
	//  238  468:fstore_2        
				setViewValues(((View) (textview4)), f3, f3, 4);
	//  239  469:aload_0         
	//  240  470:aload_3         
	//  241  471:fload_2         
	//  242  472:fload_2         
	//  243  473:iconst_4        
	//  244  474:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
				setViewValues(((View) (smallLabel)), 1.0F, 1.0F, 0);
	//  245  477:aload_0         
	//  246  478:aload_0         
	//  247  479:getfield        #111 <Field TextView smallLabel>
	//  248  482:fconst_1        
	//  249  483:fconst_1        
	//  250  484:iconst_0        
	//  251  485:invokespecial   #278 <Method void setViewValues(View, float, float, int)>
			}
			break;
		}
		refreshDrawableState();
	//  252  488:aload_0         
	//  253  489:invokevirtual   #259 <Method void refreshDrawableState()>
		setSelected(flag);
	//  254  492:aload_0         
	//  255  493:iload_1         
	//  256  494:invokevirtual   #284 <Method void setSelected(boolean)>
	//  257  497:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #285 <Method void FrameLayout.setEnabled(boolean)>
		smallLabel.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #111 <Field TextView smallLabel>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #286 <Method void TextView.setEnabled(boolean)>
		largeLabel.setEnabled(flag);
	//    7   13:aload_0         
	//    8   14:getfield        #115 <Field TextView largeLabel>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #286 <Method void TextView.setEnabled(boolean)>
		icon.setEnabled(flag);
	//   11   21:aload_0         
	//   12   22:getfield        #105 <Field ImageView icon>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #287 <Method void ImageView.setEnabled(boolean)>
		if(flag)
	//*  15   29:iload_1         
	//*  16   30:ifeq            48
		{
			ViewCompat.setPointerIcon(((View) (this)), PointerIconCompat.getSystemIcon(getContext(), 1002));
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:invokevirtual   #291 <Method Context getContext()>
	//   20   38:sipush          1002
	//   21   41:invokestatic    #297 <Method PointerIconCompat PointerIconCompat.getSystemIcon(Context, int)>
	//   22   44:invokestatic    #301 <Method void ViewCompat.setPointerIcon(View, PointerIconCompat)>
			return;
	//   23   47:return          
		} else
		{
			ViewCompat.setPointerIcon(((View) (this)), ((PointerIconCompat) (null)));
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:invokestatic    #301 <Method void ViewCompat.setPointerIcon(View, PointerIconCompat)>
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
	//    5    7:invokevirtual   #307 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    6   10:astore_2        
			if(obj != null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       18
	//*   9   15:goto            23
				drawable = ((android.graphics.drawable.Drawable.ConstantState) (obj)).newDrawable();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #312 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   12   22:astore_1        
			obj = ((Object) (DrawableCompat.wrap(drawable).mutate()));
	//   13   23:aload_1         
	//   14   24:invokestatic    #318 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   15   27:invokevirtual   #321 <Method Drawable Drawable.mutate()>
	//   16   30:astore_2        
			DrawableCompat.setTintList(((Drawable) (obj)), iconTint);
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #323 <Field ColorStateList iconTint>
	//   20   36:invokestatic    #327 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		}
		icon.setImageDrawable(((Drawable) (obj)));
	//   21   39:aload_0         
	//   22   40:getfield        #105 <Field ImageView icon>
	//   23   43:aload_2         
	//   24   44:invokevirtual   #330 <Method void ImageView.setImageDrawable(Drawable)>
	//   25   47:return          
	}

	public void setIconSize(int i)
	{
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)icon.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ImageView icon>
	//    2    4:invokevirtual   #332 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//    3    7:checkcast       #149 <Class android.widget.FrameLayout$LayoutParams>
	//    4   10:astore_2        
		layoutparams.width = i;
	//    5   11:aload_2         
	//    6   12:iload_1         
	//    7   13:putfield        #335 <Field int android.widget.FrameLayout$LayoutParams.width>
		layoutparams.height = i;
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:putfield        #338 <Field int android.widget.FrameLayout$LayoutParams.height>
		icon.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   11   21:aload_0         
	//   12   22:getfield        #105 <Field ImageView icon>
	//   13   25:aload_2         
	//   14   26:invokevirtual   #339 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   15   29:return          
	}

	public void setIconTintList(ColorStateList colorstatelist)
	{
		iconTint = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #323 <Field ColorStateList iconTint>
		colorstatelist = ((ColorStateList) (itemData));
	//    3    5:aload_0         
	//    4    6:getfield        #175 <Field MenuItemImpl itemData>
	//    5    9:astore_1        
		if(colorstatelist != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          22
			setIcon(((MenuItemImpl) (colorstatelist)).getIcon());
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #204 <Method Drawable MenuItemImpl.getIcon()>
	//   11   19:invokevirtual   #208 <Method void setIcon(Drawable)>
	//   12   22:return          
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
	//    6   10:invokevirtual   #291 <Method Context getContext()>
	//    7   13:iload_1         
	//    8   14:invokestatic    #348 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    9   17:astore_2        
		setItemBackground(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #350 <Method void setItemBackground(Drawable)>
	//   13   23:return          
	}

	public void setItemBackground(Drawable drawable)
	{
		ViewCompat.setBackground(((View) (this)), drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #355 <Method void ViewCompat.setBackground(View, Drawable)>
	//    3    5:return          
	}

	public void setItemPosition(int i)
	{
		itemPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field int itemPosition>
	//    3    5:return          
	}

	public void setLabelVisibilityMode(int i)
	{
		if(labelVisibilityMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #273 <Field int labelVisibilityMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          42
		{
			labelVisibilityMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #273 <Field int labelVisibilityMode>
			if(itemData != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #175 <Field MenuItemImpl itemData>
	//*   9   17:ifnull          25
				i = 1;
	//   10   20:iconst_1        
	//   11   21:istore_1        
			else
	//*  12   22:goto            27
				i = 0;
	//   13   25:iconst_0        
	//   14   26:istore_1        
			if(i != 0)
	//*  15   27:iload_1         
	//*  16   28:ifeq            42
				setChecked(itemData.isChecked());
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #175 <Field MenuItemImpl itemData>
	//   20   36:invokevirtual   #191 <Method boolean MenuItemImpl.isChecked()>
	//   21   39:invokevirtual   #194 <Method void setChecked(boolean)>
		}
	//   22   42:return          
	}

	public void setShifting(boolean flag)
	{
		if(isShifting != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #281 <Field boolean isShifting>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          42
		{
			isShifting = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #281 <Field boolean isShifting>
			boolean flag1;
			if(itemData != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #175 <Field MenuItemImpl itemData>
	//*   9   17:ifnull          25
				flag1 = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
			else
	//*  12   22:goto            27
				flag1 = false;
	//   13   25:iconst_0        
	//   14   26:istore_2        
			if(flag1)
	//*  15   27:iload_2         
	//*  16   28:ifeq            42
				setChecked(itemData.isChecked());
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #175 <Field MenuItemImpl itemData>
	//   20   36:invokevirtual   #191 <Method boolean MenuItemImpl.isChecked()>
	//   21   39:invokevirtual   #194 <Method void setChecked(boolean)>
		}
	//   22   42:return          
	}

	public void setShortcut(boolean flag, char c)
	{
	//    0    0:return          
	}

	public void setTextAppearanceActive(int i)
	{
		TextViewCompat.setTextAppearance(largeLabel, i);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field TextView largeLabel>
	//    2    4:iload_1         
	//    3    5:invokestatic    #368 <Method void TextViewCompat.setTextAppearance(TextView, int)>
		calculateTextScaleFactors(smallLabel.getTextSize(), largeLabel.getTextSize());
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #111 <Field TextView smallLabel>
	//    7   13:invokevirtual   #129 <Method float TextView.getTextSize()>
	//    8   16:aload_0         
	//    9   17:getfield        #115 <Field TextView largeLabel>
	//   10   20:invokevirtual   #129 <Method float TextView.getTextSize()>
	//   11   23:invokespecial   #133 <Method void calculateTextScaleFactors(float, float)>
	//   12   26:return          
	}

	public void setTextAppearanceInactive(int i)
	{
		TextViewCompat.setTextAppearance(smallLabel, i);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field TextView smallLabel>
	//    2    4:iload_1         
	//    3    5:invokestatic    #368 <Method void TextViewCompat.setTextAppearance(TextView, int)>
		calculateTextScaleFactors(smallLabel.getTextSize(), largeLabel.getTextSize());
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #111 <Field TextView smallLabel>
	//    7   13:invokevirtual   #129 <Method float TextView.getTextSize()>
	//    8   16:aload_0         
	//    9   17:getfield        #115 <Field TextView largeLabel>
	//   10   20:invokevirtual   #129 <Method float TextView.getTextSize()>
	//   11   23:invokespecial   #133 <Method void calculateTextScaleFactors(float, float)>
	//   12   26:return          
	}

	public void setTextColor(ColorStateList colorstatelist)
	{
		if(colorstatelist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			smallLabel.setTextColor(colorstatelist);
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field TextView smallLabel>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #372 <Method void TextView.setTextColor(ColorStateList)>
			largeLabel.setTextColor(colorstatelist);
	//    6   12:aload_0         
	//    7   13:getfield        #115 <Field TextView largeLabel>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #372 <Method void TextView.setTextColor(ColorStateList)>
		}
	//   10   20:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		smallLabel.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field TextView smallLabel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #375 <Method void TextView.setText(CharSequence)>
		largeLabel.setText(charsequence);
	//    4    8:aload_0         
	//    5    9:getfield        #115 <Field TextView largeLabel>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #375 <Method void TextView.setText(CharSequence)>
		MenuItemImpl menuitemimpl = itemData;
	//    8   16:aload_0         
	//    9   17:getfield        #175 <Field MenuItemImpl itemData>
	//   10   20:astore_2        
		if(menuitemimpl == null || TextUtils.isEmpty(menuitemimpl.getContentDescription()))
	//*  11   21:aload_2         
	//*  12   22:ifnull          35
	//*  13   25:aload_2         
	//*  14   26:invokevirtual   #225 <Method CharSequence MenuItemImpl.getContentDescription()>
	//*  15   29:invokestatic    #231 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   32:ifeq            40
			setContentDescription(charsequence);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #234 <Method void setContentDescription(CharSequence)>
	//   20   40:return          
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
	private final int defaultMargin;
	private ImageView icon;
	private ColorStateList iconTint;
	private boolean isShifting;
	private MenuItemImpl itemData;
	private int itemPosition;
	private int labelVisibilityMode;
	private final TextView largeLabel;
	private float scaleDownFactor;
	private float scaleUpFactor;
	private float shiftAmount;
	private final TextView smallLabel;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #36  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #38  <Field int[] CHECKED_STATE_SET>
	//*   7   11:return          
	}
}
