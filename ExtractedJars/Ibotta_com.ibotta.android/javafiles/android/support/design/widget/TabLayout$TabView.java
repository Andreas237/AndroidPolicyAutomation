// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.*;
import android.support.design.ripple.RippleUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.*;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.TooltipCompat;
import android.text.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.*;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$TabView extends LinearLayout
{

	private float approximateLineWidth(Layout layout, int i, float f)
	{
		return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #106 <Method float Layout.getLineWidth(int)>
	//    3    5:fload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #110 <Method TextPaint Layout.getPaint()>
	//    6   10:invokevirtual   #116 <Method float TextPaint.getTextSize()>
	//    7   13:fdiv            
	//    8   14:fmul            
	//    9   15:freturn         
	}

	private void drawBackground(Canvas canvas)
	{
		Drawable drawable = baseBackgroundDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Drawable baseBackgroundDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          37
		{
			drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #121 <Method int getLeft()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #124 <Method int getTop()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #127 <Method int getRight()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #130 <Method int getBottom()>
	//   14   26:invokevirtual   #136 <Method void Drawable.setBounds(int, int, int, int)>
			baseBackgroundDrawable.draw(canvas);
	//   15   29:aload_0         
	//   16   30:getfield        #118 <Field Drawable baseBackgroundDrawable>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #139 <Method void Drawable.draw(Canvas)>
		}
	//   19   37:return          
	}

	private int getContentWidth()
	{
		View aview[] = new View[3];
	//    0    0:iconst_3        
	//    1    1:anewarray       View[]
	//    2    4:astore          9
		TextView textview = textView;
	//    3    6:aload_0         
	//    4    7:getfield        #143 <Field TextView textView>
	//    5   10:astore          10
		int k = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		aview[0] = ((View) (textview));
	//    8   14:aload           9
	//    9   16:iconst_0        
	//   10   17:aload           10
	//   11   19:aastore         
		aview[1] = ((View) (iconView));
	//   12   20:aload           9
	//   13   22:iconst_1        
	//   14   23:aload_0         
	//   15   24:getfield        #145 <Field ImageView iconView>
	//   16   27:aastore         
		aview[2] = customView;
	//   17   28:aload           9
	//   18   30:iconst_2        
	//   19   31:aload_0         
	//   20   32:getfield        #147 <Field View customView>
	//   21   35:aastore         
		int k1 = aview.length;
	//   22   36:aload           9
	//   23   38:arraylength     
	//   24   39:istore          8
		int l = 0;
	//   25   41:iconst_0        
	//   26   42:istore          4
		int i = 0;
	//   27   44:iconst_0        
	//   28   45:istore_1        
		boolean flag;
		for(int j = 0; k < k1; j = ((int) (flag)))
	//*  29   46:iconst_0        
	//*  30   47:istore_2        
	//*  31   48:iload_3         
	//*  32   49:iload           8
	//*  33   51:icmpge          166
		{
			View view = aview[k];
	//   34   54:aload           9
	//   35   56:iload_3         
	//   36   57:aaload          
	//   37   58:astore          10
			int j1 = l;
	//   38   60:iload           4
	//   39   62:istore          7
			int i1 = i;
	//   40   64:iload_1         
	//   41   65:istore          6
			flag = ((boolean) (j));
	//   42   67:iload_2         
	//   43   68:istore          5
			if(view != null)
	//*  44   70:aload           10
	//*  45   72:ifnull          149
			{
				j1 = l;
	//   46   75:iload           4
	//   47   77:istore          7
				i1 = i;
	//   48   79:iload_1         
	//   49   80:istore          6
				flag = ((boolean) (j));
	//   50   82:iload_2         
	//   51   83:istore          5
				if(view.getVisibility() == 0)
	//*  52   85:aload           10
	//*  53   87:invokevirtual   #150 <Method int View.getVisibility()>
	//*  54   90:ifne            149
				{
					if(j != 0)
	//*  55   93:iload_2         
	//*  56   94:ifeq            110
						i = Math.min(i, view.getLeft());
	//   57   97:iload_1         
	//   58   98:aload           10
	//   59  100:invokevirtual   #151 <Method int View.getLeft()>
	//   60  103:invokestatic    #157 <Method int Math.min(int, int)>
	//   61  106:istore_1        
					else
	//*  62  107:goto            116
						i = view.getLeft();
	//   63  110:aload           10
	//   64  112:invokevirtual   #151 <Method int View.getLeft()>
	//   65  115:istore_1        
					if(j != 0)
	//*  66  116:iload_2         
	//*  67  117:ifeq            134
						j = Math.max(l, view.getRight());
	//   68  120:iload           4
	//   69  122:aload           10
	//   70  124:invokevirtual   #158 <Method int View.getRight()>
	//   71  127:invokestatic    #161 <Method int Math.max(int, int)>
	//   72  130:istore_2        
					else
	//*  73  131:goto            140
						j = view.getRight();
	//   74  134:aload           10
	//   75  136:invokevirtual   #158 <Method int View.getRight()>
	//   76  139:istore_2        
					flag = true;
	//   77  140:iconst_1        
	//   78  141:istore          5
					i1 = i;
	//   79  143:iload_1         
	//   80  144:istore          6
					j1 = j;
	//   81  146:iload_2         
	//   82  147:istore          7
				}
			}
			k++;
	//   83  149:iload_3         
	//   84  150:iconst_1        
	//   85  151:iadd            
	//   86  152:istore_3        
			l = j1;
	//   87  153:iload           7
	//   88  155:istore          4
			i = i1;
	//   89  157:iload           6
	//   90  159:istore_1        
		}

	//   91  160:iload           5
	//   92  162:istore_2        
	//*  93  163:goto            48
		return l - i;
	//   94  166:iload           4
	//   95  168:iload_1         
	//   96  169:isub            
	//   97  170:ireturn         
	}

	private void updateBackgroundDrawable(Context context)
	{
		if(tabBackgroundResId != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field TabLayout this$0>
	//*   2    4:getfield        #164 <Field int TabLayout.tabBackgroundResId>
	//*   3    7:ifeq            56
		{
			baseBackgroundDrawable = AppCompatResources.getDrawable(context, tabBackgroundResId);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field TabLayout this$0>
	//    8   16:getfield        #164 <Field int TabLayout.tabBackgroundResId>
	//    9   19:invokestatic    #170 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   10   22:putfield        #118 <Field Drawable baseBackgroundDrawable>
			context = ((Context) (baseBackgroundDrawable));
	//   11   25:aload_0         
	//   12   26:getfield        #118 <Field Drawable baseBackgroundDrawable>
	//   13   29:astore_1        
			if(context != null && ((Drawable) (context)).isStateful())
	//*  14   30:aload_1         
	//*  15   31:ifnull          61
	//*  16   34:aload_1         
	//*  17   35:invokevirtual   #174 <Method boolean Drawable.isStateful()>
	//*  18   38:ifeq            61
				baseBackgroundDrawable.setState(getDrawableState());
	//   19   41:aload_0         
	//   20   42:getfield        #118 <Field Drawable baseBackgroundDrawable>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #178 <Method int[] getDrawableState()>
	//   23   49:invokevirtual   #182 <Method boolean Drawable.setState(int[])>
	//   24   52:pop             
		} else
	//*  25   53:goto            61
		{
			baseBackgroundDrawable = null;
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:putfield        #118 <Field Drawable baseBackgroundDrawable>
		}
		GradientDrawable gradientdrawable = new GradientDrawable();
	//   29   61:new             #184 <Class GradientDrawable>
	//   30   64:dup             
	//   31   65:invokespecial   #187 <Method void GradientDrawable()>
	//   32   68:astore_2        
		((GradientDrawable)gradientdrawable).setColor(0);
	//   33   69:aload_2         
	//   34   70:checkcast       #184 <Class GradientDrawable>
	//   35   73:iconst_0        
	//   36   74:invokevirtual   #190 <Method void GradientDrawable.setColor(int)>
		context = ((Context) (gradientdrawable));
	//   37   77:aload_2         
	//   38   78:astore_1        
		if(tabRippleColorStateList != null)
	//*  39   79:aload_0         
	//*  40   80:getfield        #28  <Field TabLayout this$0>
	//*  41   83:getfield        #194 <Field android.content.res.ColorStateList TabLayout.tabRippleColorStateList>
	//*  42   86:ifnull          195
		{
			context = ((Context) (new GradientDrawable()));
	//   43   89:new             #184 <Class GradientDrawable>
	//   44   92:dup             
	//   45   93:invokespecial   #187 <Method void GradientDrawable()>
	//   46   96:astore_1        
			((GradientDrawable) (context)).setCornerRadius(1E-05F);
	//   47   97:aload_1         
	//   48   98:ldc1            #195 <Float 1E-05F>
	//   49  100:invokevirtual   #199 <Method void GradientDrawable.setCornerRadius(float)>
			((GradientDrawable) (context)).setColor(-1);
	//   50  103:aload_1         
	//   51  104:iconst_m1       
	//   52  105:invokevirtual   #190 <Method void GradientDrawable.setColor(int)>
			android.content.res.ColorStateList colorstatelist = RippleUtils.convertToRippleDrawableColor(tabRippleColorStateList);
	//   53  108:aload_0         
	//   54  109:getfield        #28  <Field TabLayout this$0>
	//   55  112:getfield        #194 <Field android.content.res.ColorStateList TabLayout.tabRippleColorStateList>
	//   56  115:invokestatic    #205 <Method android.content.res.ColorStateList RippleUtils.convertToRippleDrawableColor(android.content.res.ColorStateList)>
	//   57  118:astore_3        
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  58  119:getstatic       #210 <Field int android.os.Build$VERSION.SDK_INT>
	//*  59  122:bipush          21
	//*  60  124:icmplt          165
			{
				if(unboundedRipple)
	//*  61  127:aload_0         
	//*  62  128:getfield        #28  <Field TabLayout this$0>
	//*  63  131:getfield        #213 <Field boolean TabLayout.unboundedRipple>
	//*  64  134:ifeq            139
					gradientdrawable = null;
	//   65  137:aconst_null     
	//   66  138:astore_2        
				if(unboundedRipple)
	//*  67  139:aload_0         
	//*  68  140:getfield        #28  <Field TabLayout this$0>
	//*  69  143:getfield        #213 <Field boolean TabLayout.unboundedRipple>
	//*  70  146:ifeq            151
					context = null;
	//   71  149:aconst_null     
	//   72  150:astore_1        
				context = ((Context) (new RippleDrawable(colorstatelist, ((Drawable) (gradientdrawable)), ((Drawable) (context)))));
	//   73  151:new             #215 <Class RippleDrawable>
	//   74  154:dup             
	//   75  155:aload_3         
	//   76  156:aload_2         
	//   77  157:aload_1         
	//   78  158:invokespecial   #218 <Method void RippleDrawable(android.content.res.ColorStateList, Drawable, Drawable)>
	//   79  161:astore_1        
			} else
	//*  80  162:goto            195
			{
				context = ((Context) (DrawableCompat.wrap(((Drawable) (context)))));
	//   81  165:aload_1         
	//   82  166:invokestatic    #224 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   83  169:astore_1        
				DrawableCompat.setTintList(((Drawable) (context)), colorstatelist);
	//   84  170:aload_1         
	//   85  171:aload_3         
	//   86  172:invokestatic    #228 <Method void DrawableCompat.setTintList(Drawable, android.content.res.ColorStateList)>
				context = ((Context) (new LayerDrawable(new Drawable[] {
					gradientdrawable, context
				})));
	//   87  175:new             #230 <Class LayerDrawable>
	//   88  178:dup             
	//   89  179:iconst_2        
	//   90  180:anewarray       Drawable[]
	//   91  183:dup             
	//   92  184:iconst_0        
	//   93  185:aload_2         
	//   94  186:aastore         
	//   95  187:dup             
	//   96  188:iconst_1        
	//   97  189:aload_1         
	//   98  190:aastore         
	//   99  191:invokespecial   #233 <Method void LayerDrawable(Drawable[])>
	//  100  194:astore_1        
			}
		}
		ViewCompat.setBackground(((View) (this)), ((Drawable) (context)));
	//  101  195:aload_0         
	//  102  196:aload_1         
	//  103  197:invokestatic    #237 <Method void ViewCompat.setBackground(View, Drawable)>
		invalidate();
	//  104  200:aload_0         
	//  105  201:getfield        #28  <Field TabLayout this$0>
	//  106  204:invokevirtual   #240 <Method void TabLayout.invalidate()>
	//  107  207:return          
	}

	private void updateTextAndIcon(TextView textview, ImageView imageview)
	{
		Object obj = ((Object) (tab));
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field TabLayout$Tab tab>
	//    2    4:astore          5
		if(obj != null && ((TabLayout.Tab) (obj)).getIcon() != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          37
	//*   5   11:aload           5
	//*   6   13:invokevirtual   #250 <Method Drawable TabLayout$Tab.getIcon()>
	//*   7   16:ifnull          37
			obj = ((Object) (DrawableCompat.wrap(tab.getIcon()).mutate()));
	//    8   19:aload_0         
	//    9   20:getfield        #244 <Field TabLayout$Tab tab>
	//   10   23:invokevirtual   #250 <Method Drawable TabLayout$Tab.getIcon()>
	//   11   26:invokestatic    #224 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   12   29:invokevirtual   #253 <Method Drawable Drawable.mutate()>
	//   13   32:astore          5
		else
	//*  14   34:goto            40
			obj = null;
	//   15   37:aconst_null     
	//   16   38:astore          5
		Object obj1 = ((Object) (tab));
	//   17   40:aload_0         
	//   18   41:getfield        #244 <Field TabLayout$Tab tab>
	//   19   44:astore          6
		if(obj1 != null)
	//*  20   46:aload           6
	//*  21   48:ifnull          61
			obj1 = ((Object) (((TabLayout.Tab) (obj1)).getText()));
	//   22   51:aload           6
	//   23   53:invokevirtual   #257 <Method CharSequence TabLayout$Tab.getText()>
	//   24   56:astore          6
		else
	//*  25   58:goto            64
			obj1 = null;
	//   26   61:aconst_null     
	//   27   62:astore          6
		if(imageview != null)
	//*  28   64:aload_2         
	//*  29   65:ifnull          103
			if(obj != null)
	//*  30   68:aload           5
	//*  31   70:ifnull          92
			{
				imageview.setImageDrawable(((Drawable) (obj)));
	//   32   73:aload_2         
	//   33   74:aload           5
	//   34   76:invokevirtual   #263 <Method void ImageView.setImageDrawable(Drawable)>
				imageview.setVisibility(0);
	//   35   79:aload_2         
	//   36   80:iconst_0        
	//   37   81:invokevirtual   #266 <Method void ImageView.setVisibility(int)>
				setVisibility(0);
	//   38   84:aload_0         
	//   39   85:iconst_0        
	//   40   86:invokevirtual   #267 <Method void setVisibility(int)>
			} else
	//*  41   89:goto            103
			{
				imageview.setVisibility(8);
	//   42   92:aload_2         
	//   43   93:bipush          8
	//   44   95:invokevirtual   #266 <Method void ImageView.setVisibility(int)>
				imageview.setImageDrawable(((Drawable) (null)));
	//   45   98:aload_2         
	//   46   99:aconst_null     
	//   47  100:invokevirtual   #263 <Method void ImageView.setImageDrawable(Drawable)>
			}
		boolean flag = TextUtils.isEmpty(((CharSequence) (obj1))) ^ true;
	//   48  103:aload           6
	//   49  105:invokestatic    #273 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   50  108:iconst_1        
	//   51  109:ixor            
	//   52  110:istore          4
		if(textview != null)
	//*  53  112:aload_1         
	//*  54  113:ifnull          151
			if(flag)
	//*  55  116:iload           4
	//*  56  118:ifeq            140
			{
				textview.setText(((CharSequence) (obj1)));
	//   57  121:aload_1         
	//   58  122:aload           6
	//   59  124:invokevirtual   #279 <Method void TextView.setText(CharSequence)>
				textview.setVisibility(0);
	//   60  127:aload_1         
	//   61  128:iconst_0        
	//   62  129:invokevirtual   #280 <Method void TextView.setVisibility(int)>
				setVisibility(0);
	//   63  132:aload_0         
	//   64  133:iconst_0        
	//   65  134:invokevirtual   #267 <Method void setVisibility(int)>
			} else
	//*  66  137:goto            151
			{
				textview.setVisibility(8);
	//   67  140:aload_1         
	//   68  141:bipush          8
	//   69  143:invokevirtual   #280 <Method void TextView.setVisibility(int)>
				textview.setText(((CharSequence) (null)));
	//   70  146:aload_1         
	//   71  147:aconst_null     
	//   72  148:invokevirtual   #279 <Method void TextView.setText(CharSequence)>
			}
		if(imageview != null)
	//*  73  151:aload_2         
	//*  74  152:ifnull          257
		{
			textview = ((TextView) ((android.view.youtParams)imageview.getLayoutParams()));
	//   75  155:aload_2         
	//   76  156:invokevirtual   #284 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   77  159:checkcast       #286 <Class android.view.ViewGroup$MarginLayoutParams>
	//   78  162:astore_1        
			int i;
			if(flag && imageview.getVisibility() == 0)
	//*  79  163:iload           4
	//*  80  165:ifeq            188
	//*  81  168:aload_2         
	//*  82  169:invokevirtual   #287 <Method int ImageView.getVisibility()>
	//*  83  172:ifne            188
				i = dpToPx(8);
	//   84  175:aload_0         
	//   85  176:getfield        #28  <Field TabLayout this$0>
	//   86  179:bipush          8
	//   87  181:invokevirtual   #291 <Method int TabLayout.dpToPx(int)>
	//   88  184:istore_3        
			else
	//*  89  185:goto            190
				i = 0;
	//   90  188:iconst_0        
	//   91  189:istore_3        
			if(inlineLabel)
	//*  92  190:aload_0         
	//*  93  191:getfield        #28  <Field TabLayout this$0>
	//*  94  194:getfield        #62  <Field boolean TabLayout.inlineLabel>
	//*  95  197:ifeq            230
			{
				if(i != MarginLayoutParamsCompat.getMarginEnd(((android.view.youtParams) (textview))))
	//*  96  200:iload_3         
	//*  97  201:aload_1         
	//*  98  202:invokestatic    #297 <Method int MarginLayoutParamsCompat.getMarginEnd(android.view.ViewGroup$MarginLayoutParams)>
	//*  99  205:icmpeq          257
				{
					MarginLayoutParamsCompat.setMarginEnd(((android.view.youtParams) (textview)), i);
	//  100  208:aload_1         
	//  101  209:iload_3         
	//  102  210:invokestatic    #301 <Method void MarginLayoutParamsCompat.setMarginEnd(android.view.ViewGroup$MarginLayoutParams, int)>
					textview.bottomMargin = 0;
	//  103  213:aload_1         
	//  104  214:iconst_0        
	//  105  215:putfield        #304 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
					imageview.setLayoutParams(((android.view.rams) (textview)));
	//  106  218:aload_2         
	//  107  219:aload_1         
	//  108  220:invokevirtual   #308 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
					imageview.requestLayout();
	//  109  223:aload_2         
	//  110  224:invokevirtual   #311 <Method void ImageView.requestLayout()>
				}
			} else
	//* 111  227:goto            257
			if(i != ((android.view.youtParams) (textview)).bottomMargin)
	//* 112  230:iload_3         
	//* 113  231:aload_1         
	//* 114  232:getfield        #304 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//* 115  235:icmpeq          257
			{
				textview.bottomMargin = i;
	//  116  238:aload_1         
	//  117  239:iload_3         
	//  118  240:putfield        #304 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
				MarginLayoutParamsCompat.setMarginEnd(((android.view.youtParams) (textview)), 0);
	//  119  243:aload_1         
	//  120  244:iconst_0        
	//  121  245:invokestatic    #301 <Method void MarginLayoutParamsCompat.setMarginEnd(android.view.ViewGroup$MarginLayoutParams, int)>
				imageview.setLayoutParams(((android.view.rams) (textview)));
	//  122  248:aload_2         
	//  123  249:aload_1         
	//  124  250:invokevirtual   #308 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				imageview.requestLayout();
	//  125  253:aload_2         
	//  126  254:invokevirtual   #311 <Method void ImageView.requestLayout()>
			}
		}
		textview = ((TextView) (tab));
	//  127  257:aload_0         
	//  128  258:getfield        #244 <Field TabLayout$Tab tab>
	//  129  261:astore_1        
		if(textview != null)
	//* 130  262:aload_1         
	//* 131  263:ifnull          274
			textview = ((TextView) (TabLayout.Tab.access$100(((TabLayout.Tab) (textview)))));
	//  132  266:aload_1         
	//  133  267:invokestatic    #315 <Method CharSequence TabLayout$Tab.access$100(TabLayout$Tab)>
	//  134  270:astore_1        
		else
	//* 135  271:goto            276
			textview = null;
	//  136  274:aconst_null     
	//  137  275:astore_1        
		if(flag)
	//* 138  276:iload           4
	//* 139  278:ifeq            283
			textview = null;
	//  140  281:aconst_null     
	//  141  282:astore_1        
		TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (textview)));
	//  142  283:aload_0         
	//  143  284:aload_1         
	//  144  285:invokestatic    #321 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
	//  145  288:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #325 <Method void LinearLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #178 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		Drawable drawable = baseBackgroundDrawable;
	//    5    9:aload_0         
	//    6   10:getfield        #118 <Field Drawable baseBackgroundDrawable>
	//    7   13:astore          4
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(drawable != null)
	//*  12   19:aload           4
	//*  13   21:ifnull          45
		{
			flag = flag1;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if(drawable.isStateful())
	//*  16   26:aload           4
	//*  17   28:invokevirtual   #174 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            45
				flag = false | baseBackgroundDrawable.setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload_0         
	//   21   36:getfield        #118 <Field Drawable baseBackgroundDrawable>
	//   22   39:aload_3         
	//   23   40:invokevirtual   #182 <Method boolean Drawable.setState(int[])>
	//   24   43:ior             
	//   25   44:istore_1        
		}
		if(flag)
	//*  26   45:iload_1         
	//*  27   46:ifeq            60
		{
			invalidate();
	//   28   49:aload_0         
	//   29   50:invokevirtual   #326 <Method void invalidate()>
			invalidate();
	//   30   53:aload_0         
	//   31   54:getfield        #28  <Field TabLayout this$0>
	//   32   57:invokevirtual   #240 <Method void TabLayout.invalidate()>
		}
	//   33   60:return          
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #330 <Method void LinearLayout.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc2            #332 <Class android.support.v7.app.ActionBar$Tab>
	//    5    9:invokevirtual   #338 <Method String Class.getName()>
	//    6   12:invokevirtual   #343 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    7   15:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #350 <Method void LinearLayout.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc2            #332 <Class android.support.v7.app.ActionBar$Tab>
	//    5    9:invokevirtual   #338 <Method String Class.getName()>
	//    6   12:invokevirtual   #353 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    7   15:return          
	}

	public void onMeasure(int i, int j)
	{
		int k;
label0:
		{
			int l = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #361 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          6
			int j1 = android.view.View.MeasureSpec.getMode(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #364 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          7
			int k1 = getTabMaxWidth();
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field TabLayout this$0>
	//    8   16:invokevirtual   #367 <Method int TabLayout.getTabMaxWidth()>
	//    9   19:istore          8
			k = i;
	//   10   21:iload_1         
	//   11   22:istore          5
			if(k1 <= 0)
				break label0;
	//   12   24:iload           8
	//   13   26:ifle            59
			if(j1 != 0)
	//*  14   29:iload           7
	//*  15   31:ifeq            44
			{
				k = i;
	//   16   34:iload_1         
	//   17   35:istore          5
				if(l <= k1)
					break label0;
	//   18   37:iload           6
	//   19   39:iload           8
	//   20   41:icmple          59
			}
			k = android.view.View.MeasureSpec.makeMeasureSpec(tabMaxWidth, 0x80000000);
	//   21   44:aload_0         
	//   22   45:getfield        #28  <Field TabLayout this$0>
	//   23   48:getfield        #370 <Field int TabLayout.tabMaxWidth>
	//   24   51:ldc2            #371 <Int 0x80000000>
	//   25   54:invokestatic    #374 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   26   57:istore          5
		}
label1:
		{
			float f;
			boolean flag;
label2:
			{
				super.onMeasure(k, j);
	//   27   59:aload_0         
	//   28   60:iload           5
	//   29   62:iload_2         
	//   30   63:invokespecial   #376 <Method void LinearLayout.onMeasure(int, int)>
				if(textView == null)
					break label1;
	//   31   66:aload_0         
	//   32   67:getfield        #143 <Field TextView textView>
	//   33   70:ifnull          321
				float f1 = tabTextSize;
	//   34   73:aload_0         
	//   35   74:getfield        #28  <Field TabLayout this$0>
	//   36   77:getfield        #380 <Field float TabLayout.tabTextSize>
	//   37   80:fstore          4
				int i1 = defaultMaxLines;
	//   38   82:aload_0         
	//   39   83:getfield        #33  <Field int defaultMaxLines>
	//   40   86:istore          6
				Object obj = ((Object) (iconView));
	//   41   88:aload_0         
	//   42   89:getfield        #145 <Field ImageView iconView>
	//   43   92:astore          10
				boolean flag1 = true;
	//   44   94:iconst_1        
	//   45   95:istore          7
				if(obj != null && ((ImageView) (obj)).getVisibility() == 0)
	//*  46   97:aload           10
	//*  47   99:ifnull          118
	//*  48  102:aload           10
	//*  49  104:invokevirtual   #287 <Method int ImageView.getVisibility()>
	//*  50  107:ifne            118
				{
					i = 1;
	//   51  110:iconst_1        
	//   52  111:istore_1        
					f = f1;
	//   53  112:fload           4
	//   54  114:fstore_3        
				} else
	//*  55  115:goto            161
				{
					obj = ((Object) (textView));
	//   56  118:aload_0         
	//   57  119:getfield        #143 <Field TextView textView>
	//   58  122:astore          10
					f = f1;
	//   59  124:fload           4
	//   60  126:fstore_3        
					i = i1;
	//   61  127:iload           6
	//   62  129:istore_1        
					if(obj != null)
	//*  63  130:aload           10
	//*  64  132:ifnull          161
					{
						f = f1;
	//   65  135:fload           4
	//   66  137:fstore_3        
						i = i1;
	//   67  138:iload           6
	//   68  140:istore_1        
						if(((TextView) (obj)).getLineCount() > 1)
	//*  69  141:aload           10
	//*  70  143:invokevirtual   #383 <Method int TextView.getLineCount()>
	//*  71  146:iconst_1        
	//*  72  147:icmple          161
						{
							f = tabTextMultiLineSize;
	//   73  150:aload_0         
	//   74  151:getfield        #28  <Field TabLayout this$0>
	//   75  154:getfield        #386 <Field float TabLayout.tabTextMultiLineSize>
	//   76  157:fstore_3        
							i = i1;
	//   77  158:iload           6
	//   78  160:istore_1        
						}
					}
				}
				f1 = textView.getTextSize();
	//   79  161:aload_0         
	//   80  162:getfield        #143 <Field TextView textView>
	//   81  165:invokevirtual   #387 <Method float TextView.getTextSize()>
	//   82  168:fstore          4
				int l1 = textView.getLineCount();
	//   83  170:aload_0         
	//   84  171:getfield        #143 <Field TextView textView>
	//   85  174:invokevirtual   #383 <Method int TextView.getLineCount()>
	//   86  177:istore          8
				i1 = TextViewCompat.getMaxLines(textView);
	//   87  179:aload_0         
	//   88  180:getfield        #143 <Field TextView textView>
	//   89  183:invokestatic    #393 <Method int TextViewCompat.getMaxLines(TextView)>
	//   90  186:istore          6
				int i2 = f != f1;
	//   91  188:fload_3         
	//   92  189:fload           4
	//   93  191:fcmpl           
	//   94  192:istore          9
				if(i2 == 0 && (i1 < 0 || i == i1))
					break label1;
	//   95  194:iload           9
	//   96  196:ifne            210
	//   97  199:iload           6
	//   98  201:iflt            321
	//   99  204:iload_1         
	//  100  205:iload           6
	//  101  207:icmpeq          321
				flag = flag1;
	//  102  210:iload           7
	//  103  212:istore          6
				if(mode != 1)
					break label2;
	//  104  214:aload_0         
	//  105  215:getfield        #28  <Field TabLayout this$0>
	//  106  218:getfield        #396 <Field int TabLayout.mode>
	//  107  221:iconst_1        
	//  108  222:icmpne          292
				flag = flag1;
	//  109  225:iload           7
	//  110  227:istore          6
				if(i2 <= 0)
					break label2;
	//  111  229:iload           9
	//  112  231:ifle            292
				flag = flag1;
	//  113  234:iload           7
	//  114  236:istore          6
				if(l1 != 1)
					break label2;
	//  115  238:iload           8
	//  116  240:iconst_1        
	//  117  241:icmpne          292
				obj = ((Object) (textView.getLayout()));
	//  118  244:aload_0         
	//  119  245:getfield        #143 <Field TextView textView>
	//  120  248:invokevirtual   #400 <Method Layout TextView.getLayout()>
	//  121  251:astore          10
				if(obj != null)
	//* 122  253:aload           10
	//* 123  255:ifnull          289
				{
					flag = flag1;
	//  124  258:iload           7
	//  125  260:istore          6
					if(approximateLineWidth(((Layout) (obj)), 0, f) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
						break label2;
	//  126  262:aload_0         
	//  127  263:aload           10
	//  128  265:iconst_0        
	//  129  266:fload_3         
	//  130  267:invokespecial   #402 <Method float approximateLineWidth(Layout, int, float)>
	//  131  270:aload_0         
	//  132  271:invokevirtual   #405 <Method int getMeasuredWidth()>
	//  133  274:aload_0         
	//  134  275:invokevirtual   #408 <Method int getPaddingLeft()>
	//  135  278:isub            
	//  136  279:aload_0         
	//  137  280:invokevirtual   #411 <Method int getPaddingRight()>
	//  138  283:isub            
	//  139  284:i2f             
	//  140  285:fcmpl           
	//  141  286:ifle            292
				}
				flag = false;
	//  142  289:iconst_0        
	//  143  290:istore          6
			}
			if(flag)
	//* 144  292:iload           6
	//* 145  294:ifeq            321
			{
				textView.setTextSize(0, f);
	//  146  297:aload_0         
	//  147  298:getfield        #143 <Field TextView textView>
	//  148  301:iconst_0        
	//  149  302:fload_3         
	//  150  303:invokevirtual   #415 <Method void TextView.setTextSize(int, float)>
				textView.setMaxLines(i);
	//  151  306:aload_0         
	//  152  307:getfield        #143 <Field TextView textView>
	//  153  310:iload_1         
	//  154  311:invokevirtual   #418 <Method void TextView.setMaxLines(int)>
				super.onMeasure(k, j);
	//  155  314:aload_0         
	//  156  315:iload           5
	//  157  317:iload_2         
	//  158  318:invokespecial   #376 <Method void LinearLayout.onMeasure(int, int)>
			}
		}
	//  159  321:return          
	}

	public boolean performClick()
	{
		boolean flag = super.performClick();
	//    0    0:aload_0         
	//    1    1:invokespecial   #421 <Method boolean LinearLayout.performClick()>
	//    2    4:istore_1        
		if(tab != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #244 <Field TabLayout$Tab tab>
	//*   5    9:ifnull          30
		{
			if(!flag)
	//*   6   12:iload_1         
	//*   7   13:ifne            21
				playSoundEffect(0);
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #424 <Method void playSoundEffect(int)>
			tab.select();
	//   11   21:aload_0         
	//   12   22:getfield        #244 <Field TabLayout$Tab tab>
	//   13   25:invokevirtual   #427 <Method void TabLayout$Tab.select()>
			return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		} else
		{
			return flag;
	//   16   30:iload_1         
	//   17   31:ireturn         
		}
	}

	void reset()
	{
		setTab(((TabLayout.Tab) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #432 <Method void setTab(TabLayout$Tab)>
		setSelected(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #435 <Method void setSelected(boolean)>
	//    6   10:return          
	}

	public void setSelected(boolean flag)
	{
		boolean flag1;
		if(isSelected() != flag)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #438 <Method boolean isSelected()>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		super.setSelected(flag);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokespecial   #439 <Method void LinearLayout.setSelected(boolean)>
		if(flag1 && flag && android.os.Build.VERSION.SDK_INT < 16)
	//*  12   20:iload_2         
	//*  13   21:ifeq            41
	//*  14   24:iload_1         
	//*  15   25:ifeq            41
	//*  16   28:getstatic       #210 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   31:bipush          16
	//*  18   33:icmpge          41
			sendAccessibilityEvent(4);
	//   19   36:aload_0         
	//   20   37:iconst_4        
	//   21   38:invokevirtual   #442 <Method void sendAccessibilityEvent(int)>
		Object obj = ((Object) (textView));
	//   22   41:aload_0         
	//   23   42:getfield        #143 <Field TextView textView>
	//   24   45:astore_3        
		if(obj != null)
	//*  25   46:aload_3         
	//*  26   47:ifnull          55
			((TextView) (obj)).setSelected(flag);
	//   27   50:aload_3         
	//   28   51:iload_1         
	//   29   52:invokevirtual   #443 <Method void TextView.setSelected(boolean)>
		obj = ((Object) (iconView));
	//   30   55:aload_0         
	//   31   56:getfield        #145 <Field ImageView iconView>
	//   32   59:astore_3        
		if(obj != null)
	//*  33   60:aload_3         
	//*  34   61:ifnull          69
			((ImageView) (obj)).setSelected(flag);
	//   35   64:aload_3         
	//   36   65:iload_1         
	//   37   66:invokevirtual   #444 <Method void ImageView.setSelected(boolean)>
		obj = ((Object) (customView));
	//   38   69:aload_0         
	//   39   70:getfield        #147 <Field View customView>
	//   40   73:astore_3        
		if(obj != null)
	//*  41   74:aload_3         
	//*  42   75:ifnull          83
			((View) (obj)).setSelected(flag);
	//   43   78:aload_3         
	//   44   79:iload_1         
	//   45   80:invokevirtual   #445 <Method void View.setSelected(boolean)>
	//   46   83:return          
	}

	void setTab(TabLayout.Tab tab1)
	{
		if(tab1 != tab)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #244 <Field TabLayout$Tab tab>
	//*   3    5:if_acmpeq       17
		{
			tab = tab1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #244 <Field TabLayout$Tab tab>
			update();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #448 <Method void update()>
		}
	//    9   17:return          
	}

	final void update()
	{
		TabLayout.Tab tab1 = tab;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field TabLayout$Tab tab>
	//    2    4:astore          5
		Object obj = null;
	//    3    6:aconst_null     
	//    4    7:astore          4
		View view;
		if(tab1 != null)
	//*   5    9:aload           5
	//*   6   11:ifnull          23
			view = tab1.getCustomView();
	//    7   14:aload           5
	//    8   16:invokevirtual   #452 <Method View TabLayout$Tab.getCustomView()>
	//    9   19:astore_3        
		else
	//*  10   20:goto            25
			view = null;
	//   11   23:aconst_null     
	//   12   24:astore_3        
		if(view != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          160
		{
			Object obj1 = ((Object) (view.getParent()));
	//   15   29:aload_3         
	//   16   30:invokevirtual   #456 <Method android.view.ViewParent View.getParent()>
	//   17   33:astore          6
			if(obj1 != this)
	//*  18   35:aload           6
	//*  19   37:aload_0         
	//*  20   38:if_acmpeq       60
			{
				if(obj1 != null)
	//*  21   41:aload           6
	//*  22   43:ifnull          55
					((ViewGroup)obj1).removeView(view);
	//   23   46:aload           6
	//   24   48:checkcast       #458 <Class ViewGroup>
	//   25   51:aload_3         
	//   26   52:invokevirtual   #462 <Method void ViewGroup.removeView(View)>
				addView(view);
	//   27   55:aload_0         
	//   28   56:aload_3         
	//   29   57:invokevirtual   #465 <Method void addView(View)>
			}
			customView = view;
	//   30   60:aload_0         
	//   31   61:aload_3         
	//   32   62:putfield        #147 <Field View customView>
			obj1 = ((Object) (textView));
	//   33   65:aload_0         
	//   34   66:getfield        #143 <Field TextView textView>
	//   35   69:astore          6
			if(obj1 != null)
	//*  36   71:aload           6
	//*  37   73:ifnull          83
				((TextView) (obj1)).setVisibility(8);
	//   38   76:aload           6
	//   39   78:bipush          8
	//   40   80:invokevirtual   #280 <Method void TextView.setVisibility(int)>
			obj1 = ((Object) (iconView));
	//   41   83:aload_0         
	//   42   84:getfield        #145 <Field ImageView iconView>
	//   43   87:astore          6
			if(obj1 != null)
	//*  44   89:aload           6
	//*  45   91:ifnull          109
			{
				((ImageView) (obj1)).setVisibility(8);
	//   46   94:aload           6
	//   47   96:bipush          8
	//   48   98:invokevirtual   #266 <Method void ImageView.setVisibility(int)>
				iconView.setImageDrawable(((Drawable) (null)));
	//   49  101:aload_0         
	//   50  102:getfield        #145 <Field ImageView iconView>
	//   51  105:aconst_null     
	//   52  106:invokevirtual   #263 <Method void ImageView.setImageDrawable(Drawable)>
			}
			customTextView = (TextView)view.findViewById(0x1020014);
	//   53  109:aload_0         
	//   54  110:aload_3         
	//   55  111:ldc2            #466 <Int 0x1020014>
	//   56  114:invokevirtual   #470 <Method View View.findViewById(int)>
	//   57  117:checkcast       #275 <Class TextView>
	//   58  120:putfield        #472 <Field TextView customTextView>
			obj1 = ((Object) (customTextView));
	//   59  123:aload_0         
	//   60  124:getfield        #472 <Field TextView customTextView>
	//   61  127:astore          6
			if(obj1 != null)
	//*  62  129:aload           6
	//*  63  131:ifnull          143
				defaultMaxLines = TextViewCompat.getMaxLines(((TextView) (obj1)));
	//   64  134:aload_0         
	//   65  135:aload           6
	//   66  137:invokestatic    #393 <Method int TextViewCompat.getMaxLines(TextView)>
	//   67  140:putfield        #33  <Field int defaultMaxLines>
			customIconView = (ImageView)view.findViewById(0x1020006);
	//   68  143:aload_0         
	//   69  144:aload_3         
	//   70  145:ldc2            #473 <Int 0x1020006>
	//   71  148:invokevirtual   #470 <Method View View.findViewById(int)>
	//   72  151:checkcast       #259 <Class ImageView>
	//   73  154:putfield        #475 <Field ImageView customIconView>
		} else
	//*  74  157:goto            189
		{
			view = customView;
	//   75  160:aload_0         
	//   76  161:getfield        #147 <Field View customView>
	//   77  164:astore_3        
			if(view != null)
	//*  78  165:aload_3         
	//*  79  166:ifnull          179
			{
				removeView(view);
	//   80  169:aload_0         
	//   81  170:aload_3         
	//   82  171:invokevirtual   #476 <Method void removeView(View)>
				customView = null;
	//   83  174:aload_0         
	//   84  175:aconst_null     
	//   85  176:putfield        #147 <Field View customView>
			}
			customTextView = null;
	//   86  179:aload_0         
	//   87  180:aconst_null     
	//   88  181:putfield        #472 <Field TextView customTextView>
			customIconView = null;
	//   89  184:aload_0         
	//   90  185:aconst_null     
	//   91  186:putfield        #475 <Field ImageView customIconView>
		}
		view = customView;
	//   92  189:aload_0         
	//   93  190:getfield        #147 <Field View customView>
	//   94  193:astore_3        
		boolean flag1 = false;
	//   95  194:iconst_0        
	//   96  195:istore_2        
		if(view == null)
	//*  97  196:aload_3         
	//*  98  197:ifnonnull       404
		{
			if(iconView == null)
	//*  99  200:aload_0         
	//* 100  201:getfield        #145 <Field ImageView iconView>
	//* 101  204:ifnonnull       237
			{
				ImageView imageview = (ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_icon, ((ViewGroup) (this)), false);
	//  102  207:aload_0         
	//  103  208:invokevirtual   #73  <Method Context getContext()>
	//  104  211:invokestatic    #482 <Method LayoutInflater LayoutInflater.from(Context)>
	//  105  214:getstatic       #487 <Field int android.support.design.R$layout.design_layout_tab_icon>
	//  106  217:aload_0         
	//  107  218:iconst_0        
	//  108  219:invokevirtual   #491 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//  109  222:checkcast       #259 <Class ImageView>
	//  110  225:astore_3        
				addView(((View) (imageview)), 0);
	//  111  226:aload_0         
	//  112  227:aload_3         
	//  113  228:iconst_0        
	//  114  229:invokevirtual   #494 <Method void addView(View, int)>
				iconView = imageview;
	//  115  232:aload_0         
	//  116  233:aload_3         
	//  117  234:putfield        #145 <Field ImageView iconView>
			}
			Drawable drawable = ((Drawable) (obj));
	//  118  237:aload           4
	//  119  239:astore_3        
			if(tab1 != null)
	//* 120  240:aload           5
	//* 121  242:ifnull          268
			{
				drawable = ((Drawable) (obj));
	//  122  245:aload           4
	//  123  247:astore_3        
				if(tab1.getIcon() != null)
	//* 124  248:aload           5
	//* 125  250:invokevirtual   #250 <Method Drawable TabLayout$Tab.getIcon()>
	//* 126  253:ifnull          268
					drawable = DrawableCompat.wrap(tab1.getIcon()).mutate();
	//  127  256:aload           5
	//  128  258:invokevirtual   #250 <Method Drawable TabLayout$Tab.getIcon()>
	//  129  261:invokestatic    #224 <Method Drawable DrawableCompat.wrap(Drawable)>
	//  130  264:invokevirtual   #253 <Method Drawable Drawable.mutate()>
	//  131  267:astore_3        
			}
			if(drawable != null)
	//* 132  268:aload_3         
	//* 133  269:ifnull          304
			{
				DrawableCompat.setTintList(drawable, tabIconTint);
	//  134  272:aload_3         
	//  135  273:aload_0         
	//  136  274:getfield        #28  <Field TabLayout this$0>
	//  137  277:getfield        #497 <Field android.content.res.ColorStateList TabLayout.tabIconTint>
	//  138  280:invokestatic    #228 <Method void DrawableCompat.setTintList(Drawable, android.content.res.ColorStateList)>
				if(tabIconTintMode != null)
	//* 139  283:aload_0         
	//* 140  284:getfield        #28  <Field TabLayout this$0>
	//* 141  287:getfield        #501 <Field android.graphics.PorterDuff$Mode TabLayout.tabIconTintMode>
	//* 142  290:ifnull          304
					DrawableCompat.setTintMode(drawable, tabIconTintMode);
	//  143  293:aload_3         
	//  144  294:aload_0         
	//  145  295:getfield        #28  <Field TabLayout this$0>
	//  146  298:getfield        #501 <Field android.graphics.PorterDuff$Mode TabLayout.tabIconTintMode>
	//  147  301:invokestatic    #505 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			}
			if(textView == null)
	//* 148  304:aload_0         
	//* 149  305:getfield        #143 <Field TextView textView>
	//* 150  308:ifnonnull       351
			{
				TextView textview = (TextView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_text, ((ViewGroup) (this)), false);
	//  151  311:aload_0         
	//  152  312:invokevirtual   #73  <Method Context getContext()>
	//  153  315:invokestatic    #482 <Method LayoutInflater LayoutInflater.from(Context)>
	//  154  318:getstatic       #508 <Field int android.support.design.R$layout.design_layout_tab_text>
	//  155  321:aload_0         
	//  156  322:iconst_0        
	//  157  323:invokevirtual   #491 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//  158  326:checkcast       #275 <Class TextView>
	//  159  329:astore_3        
				addView(((View) (textview)));
	//  160  330:aload_0         
	//  161  331:aload_3         
	//  162  332:invokevirtual   #465 <Method void addView(View)>
				textView = textview;
	//  163  335:aload_0         
	//  164  336:aload_3         
	//  165  337:putfield        #143 <Field TextView textView>
				defaultMaxLines = TextViewCompat.getMaxLines(textView);
	//  166  340:aload_0         
	//  167  341:aload_0         
	//  168  342:getfield        #143 <Field TextView textView>
	//  169  345:invokestatic    #393 <Method int TextViewCompat.getMaxLines(TextView)>
	//  170  348:putfield        #33  <Field int defaultMaxLines>
			}
			TextViewCompat.setTextAppearance(textView, tabTextAppearance);
	//  171  351:aload_0         
	//  172  352:getfield        #143 <Field TextView textView>
	//  173  355:aload_0         
	//  174  356:getfield        #28  <Field TabLayout this$0>
	//  175  359:getfield        #511 <Field int TabLayout.tabTextAppearance>
	//  176  362:invokestatic    #515 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			if(tabTextColors != null)
	//* 177  365:aload_0         
	//* 178  366:getfield        #28  <Field TabLayout this$0>
	//* 179  369:getfield        #518 <Field android.content.res.ColorStateList TabLayout.tabTextColors>
	//* 180  372:ifnull          389
				textView.setTextColor(tabTextColors);
	//  181  375:aload_0         
	//  182  376:getfield        #143 <Field TextView textView>
	//  183  379:aload_0         
	//  184  380:getfield        #28  <Field TabLayout this$0>
	//  185  383:getfield        #518 <Field android.content.res.ColorStateList TabLayout.tabTextColors>
	//  186  386:invokevirtual   #522 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
			updateTextAndIcon(textView, iconView);
	//  187  389:aload_0         
	//  188  390:aload_0         
	//  189  391:getfield        #143 <Field TextView textView>
	//  190  394:aload_0         
	//  191  395:getfield        #145 <Field ImageView iconView>
	//  192  398:invokespecial   #524 <Method void updateTextAndIcon(TextView, ImageView)>
		} else
	//* 193  401:goto            430
		if(customTextView != null || customIconView != null)
	//* 194  404:aload_0         
	//* 195  405:getfield        #472 <Field TextView customTextView>
	//* 196  408:ifnonnull       418
	//* 197  411:aload_0         
	//* 198  412:getfield        #475 <Field ImageView customIconView>
	//* 199  415:ifnull          430
			updateTextAndIcon(customTextView, customIconView);
	//  200  418:aload_0         
	//  201  419:aload_0         
	//  202  420:getfield        #472 <Field TextView customTextView>
	//  203  423:aload_0         
	//  204  424:getfield        #475 <Field ImageView customIconView>
	//  205  427:invokespecial   #524 <Method void updateTextAndIcon(TextView, ImageView)>
		if(tab1 != null && !TextUtils.isEmpty(TabLayout.Tab.access$100(tab1)))
	//* 206  430:aload           5
	//* 207  432:ifnull          455
	//* 208  435:aload           5
	//* 209  437:invokestatic    #315 <Method CharSequence TabLayout$Tab.access$100(TabLayout$Tab)>
	//* 210  440:invokestatic    #273 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 211  443:ifne            455
			setContentDescription(TabLayout.Tab.access$100(tab1));
	//  212  446:aload_0         
	//  213  447:aload           5
	//  214  449:invokestatic    #315 <Method CharSequence TabLayout$Tab.access$100(TabLayout$Tab)>
	//  215  452:invokevirtual   #527 <Method void setContentDescription(CharSequence)>
		boolean flag = flag1;
	//  216  455:iload_2         
	//  217  456:istore_1        
		if(tab1 != null)
	//* 218  457:aload           5
	//* 219  459:ifnull          474
		{
			flag = flag1;
	//  220  462:iload_2         
	//  221  463:istore_1        
			if(tab1.isSelected())
	//* 222  464:aload           5
	//* 223  466:invokevirtual   #528 <Method boolean TabLayout$Tab.isSelected()>
	//* 224  469:ifeq            474
				flag = true;
	//  225  472:iconst_1        
	//  226  473:istore_1        
		}
		setSelected(flag);
	//  227  474:aload_0         
	//  228  475:iload_1         
	//  229  476:invokevirtual   #435 <Method void setSelected(boolean)>
	//  230  479:return          
	}

	final void updateOrientation()
	{
		setOrientation(((int) (inlineLabel ^ true)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field TabLayout this$0>
	//    3    5:getfield        #62  <Field boolean TabLayout.inlineLabel>
	//    4    8:iconst_1        
	//    5    9:ixor            
	//    6   10:invokevirtual   #65  <Method void setOrientation(int)>
		if(customTextView == null && customIconView == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #472 <Field TextView customTextView>
	//*   9   17:ifnonnull       43
	//*  10   20:aload_0         
	//*  11   21:getfield        #475 <Field ImageView customIconView>
	//*  12   24:ifnull          30
	//*  13   27:goto            43
		{
			updateTextAndIcon(textView, iconView);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #143 <Field TextView textView>
	//   17   35:aload_0         
	//   18   36:getfield        #145 <Field ImageView iconView>
	//   19   39:invokespecial   #524 <Method void updateTextAndIcon(TextView, ImageView)>
			return;
	//   20   42:return          
		} else
		{
			updateTextAndIcon(customTextView, customIconView);
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #472 <Field TextView customTextView>
	//   24   48:aload_0         
	//   25   49:getfield        #475 <Field ImageView customIconView>
	//   26   52:invokespecial   #524 <Method void updateTextAndIcon(TextView, ImageView)>
			return;
	//   27   55:return          
		}
	}

	private Drawable baseBackgroundDrawable;
	private ImageView customIconView;
	private TextView customTextView;
	private View customView;
	private int defaultMaxLines;
	private ImageView iconView;
	private TabLayout.Tab tab;
	private TextView textView;
	final TabLayout this$0;


/*
	static void access$000(TabLayout$TabView tablayout$tabview, Context context)
	{
		tablayout$tabview.updateBackgroundDrawable(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void updateBackgroundDrawable(Context)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$300(TabLayout$TabView tablayout$tabview, Canvas canvas)
	{
		tablayout$tabview.drawBackground(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void drawBackground(Canvas)>
		return;
	//    3    5:return          
	}

*/


/*
	static int access$500(TabLayout$TabView tablayout$tabview)
	{
		return tablayout$tabview.getContentWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method int getContentWidth()>
	//    2    4:ireturn         
	}

*/

	public TabLayout$TabView(Context context)
	{
		this$0 = TabLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field TabLayout this$0>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #31  <Method void LinearLayout(Context)>
		defaultMaxLines = 2;
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:putfield        #33  <Field int defaultMaxLines>
		updateBackgroundDrawable(context);
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:invokespecial   #36  <Method void updateBackgroundDrawable(Context)>
		ViewCompat.setPaddingRelative(((View) (this)), tabPaddingStart, tabPaddingTop, tabPaddingEnd, tabPaddingBottom);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:getfield        #39  <Field int TabLayout.tabPaddingStart>
	//   15   25:aload_1         
	//   16   26:getfield        #42  <Field int TabLayout.tabPaddingTop>
	//   17   29:aload_1         
	//   18   30:getfield        #45  <Field int TabLayout.tabPaddingEnd>
	//   19   33:aload_1         
	//   20   34:getfield        #48  <Field int TabLayout.tabPaddingBottom>
	//   21   37:invokestatic    #54  <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
		setGravity(17);
	//   22   40:aload_0         
	//   23   41:bipush          17
	//   24   43:invokevirtual   #58  <Method void setGravity(int)>
		setOrientation(((int) (inlineLabel ^ true)));
	//   25   46:aload_0         
	//   26   47:aload_1         
	//   27   48:getfield        #62  <Field boolean TabLayout.inlineLabel>
	//   28   51:iconst_1        
	//   29   52:ixor            
	//   30   53:invokevirtual   #65  <Method void setOrientation(int)>
		setClickable(true);
	//   31   56:aload_0         
	//   32   57:iconst_1        
	//   33   58:invokevirtual   #69  <Method void setClickable(boolean)>
		ViewCompat.setPointerIcon(((View) (this)), PointerIconCompat.getSystemIcon(getContext(), 1002));
	//   34   61:aload_0         
	//   35   62:aload_0         
	//   36   63:invokevirtual   #73  <Method Context getContext()>
	//   37   66:sipush          1002
	//   38   69:invokestatic    #79  <Method PointerIconCompat PointerIconCompat.getSystemIcon(Context, int)>
	//   39   72:invokestatic    #83  <Method void ViewCompat.setPointerIcon(View, PointerIconCompat)>
	//   40   75:return          
	}
}
