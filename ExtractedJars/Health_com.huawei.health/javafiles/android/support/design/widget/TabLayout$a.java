// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.text.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.*;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$a extends LinearLayout
{

	private void b(TextView textview, ImageView imageview)
	{
		android.graphics.drawable.Drawable drawable;
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field TabLayout$Tab a>
	//*   2    4:ifnull          19
			drawable = a.getIcon();
	//    3    7:aload_0         
	//    4    8:getfield        #90  <Field TabLayout$Tab a>
	//    5   11:invokevirtual   #96  <Method android.graphics.drawable.Drawable TabLayout$Tab.getIcon()>
	//    6   14:astore          7
		else
	//*   7   16:goto            22
			drawable = null;
	//    8   19:aconst_null     
	//    9   20:astore          7
		CharSequence charsequence1;
		if(a != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #90  <Field TabLayout$Tab a>
	//*  12   26:ifnull          41
			charsequence1 = a.getText();
	//   13   29:aload_0         
	//   14   30:getfield        #90  <Field TabLayout$Tab a>
	//   15   33:invokevirtual   #100 <Method CharSequence TabLayout$Tab.getText()>
	//   16   36:astore          8
		else
	//*  17   38:goto            44
			charsequence1 = null;
	//   18   41:aconst_null     
	//   19   42:astore          8
		CharSequence charsequence;
		if(a != null)
	//*  20   44:aload_0         
	//*  21   45:getfield        #90  <Field TabLayout$Tab a>
	//*  22   48:ifnull          63
			charsequence = a.getContentDescription();
	//   23   51:aload_0         
	//   24   52:getfield        #90  <Field TabLayout$Tab a>
	//   25   55:invokevirtual   #103 <Method CharSequence TabLayout$Tab.getContentDescription()>
	//   26   58:astore          6
		else
	//*  27   60:goto            66
			charsequence = null;
	//   28   63:aconst_null     
	//   29   64:astore          6
		if(imageview != null)
	//*  30   66:aload_2         
	//*  31   67:ifnull          111
		{
			if(drawable != null)
	//*  32   70:aload           7
	//*  33   72:ifnull          94
			{
				imageview.setImageDrawable(drawable);
	//   34   75:aload_2         
	//   35   76:aload           7
	//   36   78:invokevirtual   #109 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
				imageview.setVisibility(0);
	//   37   81:aload_2         
	//   38   82:iconst_0        
	//   39   83:invokevirtual   #112 <Method void ImageView.setVisibility(int)>
				setVisibility(0);
	//   40   86:aload_0         
	//   41   87:iconst_0        
	//   42   88:invokevirtual   #113 <Method void setVisibility(int)>
			} else
	//*  43   91:goto            105
			{
				imageview.setVisibility(8);
	//   44   94:aload_2         
	//   45   95:bipush          8
	//   46   97:invokevirtual   #112 <Method void ImageView.setVisibility(int)>
				imageview.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   47  100:aload_2         
	//   48  101:aconst_null     
	//   49  102:invokevirtual   #109 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			imageview.setContentDescription(charsequence);
	//   50  105:aload_2         
	//   51  106:aload           6
	//   52  108:invokevirtual   #117 <Method void ImageView.setContentDescription(CharSequence)>
		}
		boolean flag;
		if(!TextUtils.isEmpty(charsequence1))
	//*  53  111:aload           8
	//*  54  113:invokestatic    #123 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  55  116:ifne            124
			flag = true;
	//   56  119:iconst_1        
	//   57  120:istore_3        
		else
	//*  58  121:goto            126
			flag = false;
	//   59  124:iconst_0        
	//   60  125:istore_3        
		if(textview != null)
	//*  61  126:aload_1         
	//*  62  127:ifnull          170
		{
			if(flag)
	//*  63  130:iload_3         
	//*  64  131:ifeq            153
			{
				textview.setText(charsequence1);
	//   65  134:aload_1         
	//   66  135:aload           8
	//   67  137:invokevirtual   #128 <Method void TextView.setText(CharSequence)>
				textview.setVisibility(0);
	//   68  140:aload_1         
	//   69  141:iconst_0        
	//   70  142:invokevirtual   #129 <Method void TextView.setVisibility(int)>
				setVisibility(0);
	//   71  145:aload_0         
	//   72  146:iconst_0        
	//   73  147:invokevirtual   #113 <Method void setVisibility(int)>
			} else
	//*  74  150:goto            164
			{
				textview.setVisibility(8);
	//   75  153:aload_1         
	//   76  154:bipush          8
	//   77  156:invokevirtual   #129 <Method void TextView.setVisibility(int)>
				textview.setText(((CharSequence) (null)));
	//   78  159:aload_1         
	//   79  160:aconst_null     
	//   80  161:invokevirtual   #128 <Method void TextView.setText(CharSequence)>
			}
			textview.setContentDescription(charsequence);
	//   81  164:aload_1         
	//   82  165:aload           6
	//   83  167:invokevirtual   #130 <Method void TextView.setContentDescription(CharSequence)>
		}
		if(imageview != null)
	//*  84  170:aload_2         
	//*  85  171:ifnull          234
		{
			textview = ((TextView) ((android.view.rginLayoutParams)imageview.getLayoutParams()));
	//   86  174:aload_2         
	//   87  175:invokevirtual   #134 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   88  178:checkcast       #136 <Class android.view.ViewGroup$MarginLayoutParams>
	//   89  181:astore_1        
			boolean flag1 = false;
	//   90  182:iconst_0        
	//   91  183:istore          5
			int j = ((int) (flag1));
	//   92  185:iload           5
	//   93  187:istore          4
			if(flag)
	//*  94  189:iload_3         
	//*  95  190:ifeq            215
			{
				j = ((int) (flag1));
	//   96  193:iload           5
	//   97  195:istore          4
				if(imageview.getVisibility() == 0)
	//*  98  197:aload_2         
	//*  99  198:invokevirtual   #140 <Method int ImageView.getVisibility()>
	//* 100  201:ifne            215
					j = d.dpToPx(8);
	//  101  204:aload_0         
	//  102  205:getfield        #24  <Field TabLayout d>
	//  103  208:bipush          8
	//  104  210:invokevirtual   #144 <Method int TabLayout.dpToPx(int)>
	//  105  213:istore          4
			}
			if(j != ((android.view.rginLayoutParams) (textview)).bottomMargin)
	//* 106  215:iload           4
	//* 107  217:aload_1         
	//* 108  218:getfield        #147 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//* 109  221:icmpeq          234
			{
				textview.bottomMargin = j;
	//  110  224:aload_1         
	//  111  225:iload           4
	//  112  227:putfield        #147 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
				imageview.requestLayout();
	//  113  230:aload_2         
	//  114  231:invokevirtual   #151 <Method void ImageView.requestLayout()>
			}
		}
		if(flag)
	//* 115  234:iload_3         
	//* 116  235:ifeq            244
			charsequence = null;
	//  117  238:aconst_null     
	//  118  239:astore          6
	//* 119  241:goto            244
		ViewCompat.setTooltipText(((View) (this)), charsequence);
	//  120  244:aload_0         
	//  121  245:aload           6
	//  122  247:invokestatic    #155 <Method void ViewCompat.setTooltipText(View, CharSequence)>
	//  123  250:return          
	}

	private float d(Layout layout, int j, float f1)
	{
		return layout.getLineWidth(j) * (f1 / layout.getPaint().getTextSize());
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #163 <Method float Layout.getLineWidth(int)>
	//    3    5:fload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #167 <Method TextPaint Layout.getPaint()>
	//    6   10:invokevirtual   #173 <Method float TextPaint.getTextSize()>
	//    7   13:fdiv            
	//    8   14:fmul            
	//    9   15:freturn         
	}

	void b()
	{
		c(((b) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #176 <Method void c(TabLayout$Tab)>
		setSelected(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #179 <Method void setSelected(boolean)>
	//    6   10:return          
	}

	void c(b b1)
	{
		if(b1 != a)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #90  <Field TabLayout$Tab a>
	//*   3    5:if_acmpeq       17
		{
			a = b1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #90  <Field TabLayout$Tab a>
			d();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #181 <Method void d()>
		}
	//    9   17:return          
	}

	final void d()
	{
		b b1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field TabLayout$Tab a>
	//    2    4:astore_3        
		View view;
		if(b1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			view = b1.getCustomView();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #185 <Method View TabLayout$Tab.getCustomView()>
	//    7   13:astore_2        
		else
	//*   8   14:goto            19
			view = null;
	//    9   17:aconst_null     
	//   10   18:astore_2        
		if(view != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          146
		{
			android.view.ViewParent viewparent = view.getParent();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #191 <Method android.view.ViewParent View.getParent()>
	//   15   27:astore          4
			if(viewparent != this)
	//*  16   29:aload           4
	//*  17   31:aload_0         
	//*  18   32:if_acmpeq       54
			{
				if(viewparent != null)
	//*  19   35:aload           4
	//*  20   37:ifnull          49
					((ViewGroup)viewparent).removeView(view);
	//   21   40:aload           4
	//   22   42:checkcast       #193 <Class ViewGroup>
	//   23   45:aload_2         
	//   24   46:invokevirtual   #197 <Method void ViewGroup.removeView(View)>
				addView(view);
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #200 <Method void addView(View)>
			}
			e = view;
	//   28   54:aload_0         
	//   29   55:aload_2         
	//   30   56:putfield        #202 <Field View e>
			if(c != null)
	//*  31   59:aload_0         
	//*  32   60:getfield        #204 <Field TextView c>
	//*  33   63:ifnull          75
				c.setVisibility(8);
	//   34   66:aload_0         
	//   35   67:getfield        #204 <Field TextView c>
	//   36   70:bipush          8
	//   37   72:invokevirtual   #129 <Method void TextView.setVisibility(int)>
			if(b != null)
	//*  38   75:aload_0         
	//*  39   76:getfield        #206 <Field ImageView b>
	//*  40   79:ifnull          99
			{
				b.setVisibility(8);
	//   41   82:aload_0         
	//   42   83:getfield        #206 <Field ImageView b>
	//   43   86:bipush          8
	//   44   88:invokevirtual   #112 <Method void ImageView.setVisibility(int)>
				b.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   45   91:aload_0         
	//   46   92:getfield        #206 <Field ImageView b>
	//   47   95:aconst_null     
	//   48   96:invokevirtual   #109 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			f = (TextView)view.findViewById(0x1020014);
	//   49   99:aload_0         
	//   50  100:aload_2         
	//   51  101:ldc1            #207 <Int 0x1020014>
	//   52  103:invokevirtual   #211 <Method View View.findViewById(int)>
	//   53  106:checkcast       #125 <Class TextView>
	//   54  109:putfield        #213 <Field TextView f>
			if(f != null)
	//*  55  112:aload_0         
	//*  56  113:getfield        #213 <Field TextView f>
	//*  57  116:ifnull          130
				h = TextViewCompat.getMaxLines(f);
	//   58  119:aload_0         
	//   59  120:aload_0         
	//   60  121:getfield        #213 <Field TextView f>
	//   61  124:invokestatic    #219 <Method int TextViewCompat.getMaxLines(TextView)>
	//   62  127:putfield        #29  <Field int h>
			i = (ImageView)view.findViewById(0x1020006);
	//   63  130:aload_0         
	//   64  131:aload_2         
	//   65  132:ldc1            #220 <Int 0x1020006>
	//   66  134:invokevirtual   #211 <Method View View.findViewById(int)>
	//   67  137:checkcast       #105 <Class ImageView>
	//   68  140:putfield        #222 <Field ImageView i>
		} else
	//*  69  143:goto            176
		{
			if(e != null)
	//*  70  146:aload_0         
	//*  71  147:getfield        #202 <Field View e>
	//*  72  150:ifnull          166
			{
				removeView(e);
	//   73  153:aload_0         
	//   74  154:aload_0         
	//   75  155:getfield        #202 <Field View e>
	//   76  158:invokevirtual   #223 <Method void removeView(View)>
				e = null;
	//   77  161:aload_0         
	//   78  162:aconst_null     
	//   79  163:putfield        #202 <Field View e>
			}
			f = null;
	//   80  166:aload_0         
	//   81  167:aconst_null     
	//   82  168:putfield        #213 <Field TextView f>
			i = null;
	//   83  171:aload_0         
	//   84  172:aconst_null     
	//   85  173:putfield        #222 <Field ImageView i>
		}
		if(e == null)
	//*  86  176:aload_0         
	//*  87  177:getfield        #202 <Field View e>
	//*  88  180:ifnonnull       320
		{
			if(b == null)
	//*  89  183:aload_0         
	//*  90  184:getfield        #206 <Field ImageView b>
	//*  91  187:ifnonnull       220
			{
				ImageView imageview = (ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_icon, ((ViewGroup) (this)), false);
	//   92  190:aload_0         
	//   93  191:invokevirtual   #75  <Method Context getContext()>
	//   94  194:invokestatic    #229 <Method LayoutInflater LayoutInflater.from(Context)>
	//   95  197:getstatic       #234 <Field int android.support.design.R$layout.design_layout_tab_icon>
	//   96  200:aload_0         
	//   97  201:iconst_0        
	//   98  202:invokevirtual   #238 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   99  205:checkcast       #105 <Class ImageView>
	//  100  208:astore_2        
				addView(((View) (imageview)), 0);
	//  101  209:aload_0         
	//  102  210:aload_2         
	//  103  211:iconst_0        
	//  104  212:invokevirtual   #241 <Method void addView(View, int)>
				b = imageview;
	//  105  215:aload_0         
	//  106  216:aload_2         
	//  107  217:putfield        #206 <Field ImageView b>
			}
			if(c == null)
	//* 108  220:aload_0         
	//* 109  221:getfield        #204 <Field TextView c>
	//* 110  224:ifnonnull       267
			{
				TextView textview = (TextView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_text, ((ViewGroup) (this)), false);
	//  111  227:aload_0         
	//  112  228:invokevirtual   #75  <Method Context getContext()>
	//  113  231:invokestatic    #229 <Method LayoutInflater LayoutInflater.from(Context)>
	//  114  234:getstatic       #244 <Field int android.support.design.R$layout.design_layout_tab_text>
	//  115  237:aload_0         
	//  116  238:iconst_0        
	//  117  239:invokevirtual   #238 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//  118  242:checkcast       #125 <Class TextView>
	//  119  245:astore_2        
				addView(((View) (textview)));
	//  120  246:aload_0         
	//  121  247:aload_2         
	//  122  248:invokevirtual   #200 <Method void addView(View)>
				c = textview;
	//  123  251:aload_0         
	//  124  252:aload_2         
	//  125  253:putfield        #204 <Field TextView c>
				h = TextViewCompat.getMaxLines(c);
	//  126  256:aload_0         
	//  127  257:aload_0         
	//  128  258:getfield        #204 <Field TextView c>
	//  129  261:invokestatic    #219 <Method int TextViewCompat.getMaxLines(TextView)>
	//  130  264:putfield        #29  <Field int h>
			}
			TextViewCompat.setTextAppearance(c, d.mTabTextAppearance);
	//  131  267:aload_0         
	//  132  268:getfield        #204 <Field TextView c>
	//  133  271:aload_0         
	//  134  272:getfield        #24  <Field TabLayout d>
	//  135  275:getfield        #247 <Field int TabLayout.mTabTextAppearance>
	//  136  278:invokestatic    #251 <Method void TextViewCompat.setTextAppearance(TextView, int)>
			if(d.mTabTextColors != null)
	//* 137  281:aload_0         
	//* 138  282:getfield        #24  <Field TabLayout d>
	//* 139  285:getfield        #255 <Field android.content.res.ColorStateList TabLayout.mTabTextColors>
	//* 140  288:ifnull          305
				c.setTextColor(d.mTabTextColors);
	//  141  291:aload_0         
	//  142  292:getfield        #204 <Field TextView c>
	//  143  295:aload_0         
	//  144  296:getfield        #24  <Field TabLayout d>
	//  145  299:getfield        #255 <Field android.content.res.ColorStateList TabLayout.mTabTextColors>
	//  146  302:invokevirtual   #259 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
			b(c, b);
	//  147  305:aload_0         
	//  148  306:aload_0         
	//  149  307:getfield        #204 <Field TextView c>
	//  150  310:aload_0         
	//  151  311:getfield        #206 <Field ImageView b>
	//  152  314:invokespecial   #261 <Method void b(TextView, ImageView)>
		} else
	//* 153  317:goto            346
		if(f != null || i != null)
	//* 154  320:aload_0         
	//* 155  321:getfield        #213 <Field TextView f>
	//* 156  324:ifnonnull       334
	//* 157  327:aload_0         
	//* 158  328:getfield        #222 <Field ImageView i>
	//* 159  331:ifnull          346
			b(f, i);
	//  160  334:aload_0         
	//  161  335:aload_0         
	//  162  336:getfield        #213 <Field TextView f>
	//  163  339:aload_0         
	//  164  340:getfield        #222 <Field ImageView i>
	//  165  343:invokespecial   #261 <Method void b(TextView, ImageView)>
		boolean flag;
		if(b1 != null && b1.isSelected())
	//* 166  346:aload_3         
	//* 167  347:ifnull          362
	//* 168  350:aload_3         
	//* 169  351:invokevirtual   #265 <Method boolean TabLayout$Tab.isSelected()>
	//* 170  354:ifeq            362
			flag = true;
	//  171  357:iconst_1        
	//  172  358:istore_1        
		else
	//* 173  359:goto            364
			flag = false;
	//  174  362:iconst_0        
	//  175  363:istore_1        
		setSelected(flag);
	//  176  364:aload_0         
	//  177  365:iload_1         
	//  178  366:invokevirtual   #179 <Method void setSelected(boolean)>
	//  179  369:return          
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #269 <Method void LinearLayout.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc2            #271 <Class android.support.v7.app.ActionBar$Tab>
	//    5    9:invokevirtual   #277 <Method String Class.getName()>
	//    6   12:invokevirtual   #282 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    7   15:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #286 <Method void LinearLayout.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc2            #271 <Class android.support.v7.app.ActionBar$Tab>
	//    5    9:invokevirtual   #277 <Method String Class.getName()>
	//    6   12:invokevirtual   #289 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    7   15:return          
	}

	public void onMeasure(int j, int k)
	{
label0:
		{
			float f1;
			int l;
			boolean flag;
label1:
			{
				l = android.view.Spec.getSize(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #296 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          5
				int i1 = android.view.Spec.getMode(j);
	//    3    6:iload_1         
	//    4    7:invokestatic    #299 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          6
				int j1 = d.getTabMaxWidth();
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field TabLayout d>
	//    8   16:invokevirtual   #302 <Method int TabLayout.getTabMaxWidth()>
	//    9   19:istore          7
				if(j1 > 0 && (i1 == 0 || l > j1))
	//*  10   21:iload           7
	//*  11   23:ifle            55
	//*  12   26:iload           6
	//*  13   28:ifeq            38
	//*  14   31:iload           5
	//*  15   33:iload           7
	//*  16   35:icmple          55
					j = android.view.Spec.makeMeasureSpec(d.mTabMaxWidth, 0x80000000);
	//   17   38:aload_0         
	//   18   39:getfield        #24  <Field TabLayout d>
	//   19   42:getfield        #305 <Field int TabLayout.mTabMaxWidth>
	//   20   45:ldc2            #306 <Int 0x80000000>
	//   21   48:invokestatic    #310 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   22   51:istore_1        
	//*  23   52:goto            55
				super.onMeasure(j, k);
	//   24   55:aload_0         
	//   25   56:iload_1         
	//   26   57:iload_2         
	//   27   58:invokespecial   #312 <Method void LinearLayout.onMeasure(int, int)>
				if(c == null)
					break label0;
	//   28   61:aload_0         
	//   29   62:getfield        #204 <Field TextView c>
	//   30   65:ifnull          320
				getResources();
	//   31   68:aload_0         
	//   32   69:invokevirtual   #316 <Method android.content.res.Resources getResources()>
	//   33   72:pop             
				float f2 = d.mTabTextSize;
	//   34   73:aload_0         
	//   35   74:getfield        #24  <Field TabLayout d>
	//   36   77:getfield        #320 <Field float TabLayout.mTabTextSize>
	//   37   80:fstore          4
				i1 = h;
	//   38   82:aload_0         
	//   39   83:getfield        #29  <Field int h>
	//   40   86:istore          6
				if(b != null && b.getVisibility() == 0)
	//*  41   88:aload_0         
	//*  42   89:getfield        #206 <Field ImageView b>
	//*  43   92:ifnull          114
	//*  44   95:aload_0         
	//*  45   96:getfield        #206 <Field ImageView b>
	//*  46   99:invokevirtual   #140 <Method int ImageView.getVisibility()>
	//*  47  102:ifne            114
				{
					l = 1;
	//   48  105:iconst_1        
	//   49  106:istore          5
					f1 = f2;
	//   50  108:fload           4
	//   51  110:fstore_3        
				} else
	//*  52  111:goto            158
				{
					f1 = f2;
	//   53  114:fload           4
	//   54  116:fstore_3        
					l = i1;
	//   55  117:iload           6
	//   56  119:istore          5
					if(c != null)
	//*  57  121:aload_0         
	//*  58  122:getfield        #204 <Field TextView c>
	//*  59  125:ifnull          158
					{
						f1 = f2;
	//   60  128:fload           4
	//   61  130:fstore_3        
						l = i1;
	//   62  131:iload           6
	//   63  133:istore          5
						if(c.getLineCount() > 1)
	//*  64  135:aload_0         
	//*  65  136:getfield        #204 <Field TextView c>
	//*  66  139:invokevirtual   #323 <Method int TextView.getLineCount()>
	//*  67  142:iconst_1        
	//*  68  143:icmple          158
						{
							f1 = d.mTabTextMultiLineSize;
	//   69  146:aload_0         
	//   70  147:getfield        #24  <Field TabLayout d>
	//   71  150:getfield        #326 <Field float TabLayout.mTabTextMultiLineSize>
	//   72  153:fstore_3        
							l = i1;
	//   73  154:iload           6
	//   74  156:istore          5
						}
					}
				}
				f2 = c.getTextSize();
	//   75  158:aload_0         
	//   76  159:getfield        #204 <Field TextView c>
	//   77  162:invokevirtual   #327 <Method float TextView.getTextSize()>
	//   78  165:fstore          4
				int k1 = c.getLineCount();
	//   79  167:aload_0         
	//   80  168:getfield        #204 <Field TextView c>
	//   81  171:invokevirtual   #323 <Method int TextView.getLineCount()>
	//   82  174:istore          8
				i1 = TextViewCompat.getMaxLines(c);
	//   83  176:aload_0         
	//   84  177:getfield        #204 <Field TextView c>
	//   85  180:invokestatic    #219 <Method int TextViewCompat.getMaxLines(TextView)>
	//   86  183:istore          6
				if(f1 == f2 && (i1 < 0 || l == i1))
					break label0;
	//   87  185:fload_3         
	//   88  186:fload           4
	//   89  188:fcmpl           
	//   90  189:ifne            204
	//   91  192:iload           6
	//   92  194:iflt            320
	//   93  197:iload           5
	//   94  199:iload           6
	//   95  201:icmpeq          320
				j1 = 1;
	//   96  204:iconst_1        
	//   97  205:istore          7
				flag = ((boolean) (j1));
	//   98  207:iload           7
	//   99  209:istore          6
				if(d.mMode != 1)
					break label1;
	//  100  211:aload_0         
	//  101  212:getfield        #24  <Field TabLayout d>
	//  102  215:getfield        #330 <Field int TabLayout.mMode>
	//  103  218:iconst_1        
	//  104  219:icmpne          291
				flag = ((boolean) (j1));
	//  105  222:iload           7
	//  106  224:istore          6
				if(f1 <= f2)
					break label1;
	//  107  226:fload_3         
	//  108  227:fload           4
	//  109  229:fcmpl           
	//  110  230:ifle            291
				flag = ((boolean) (j1));
	//  111  233:iload           7
	//  112  235:istore          6
				if(k1 != 1)
					break label1;
	//  113  237:iload           8
	//  114  239:iconst_1        
	//  115  240:icmpne          291
				Layout layout = c.getLayout();
	//  116  243:aload_0         
	//  117  244:getfield        #204 <Field TextView c>
	//  118  247:invokevirtual   #334 <Method Layout TextView.getLayout()>
	//  119  250:astore          9
				if(layout != null)
	//* 120  252:aload           9
	//* 121  254:ifnull          288
				{
					flag = ((boolean) (j1));
	//  122  257:iload           7
	//  123  259:istore          6
					if(d(layout, 0, f1) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
						break label1;
	//  124  261:aload_0         
	//  125  262:aload           9
	//  126  264:iconst_0        
	//  127  265:fload_3         
	//  128  266:invokespecial   #336 <Method float d(Layout, int, float)>
	//  129  269:aload_0         
	//  130  270:invokevirtual   #339 <Method int getMeasuredWidth()>
	//  131  273:aload_0         
	//  132  274:invokevirtual   #342 <Method int getPaddingLeft()>
	//  133  277:isub            
	//  134  278:aload_0         
	//  135  279:invokevirtual   #345 <Method int getPaddingRight()>
	//  136  282:isub            
	//  137  283:i2f             
	//  138  284:fcmpl           
	//  139  285:ifle            291
				}
				flag = false;
	//  140  288:iconst_0        
	//  141  289:istore          6
			}
			if(flag)
	//* 142  291:iload           6
	//* 143  293:ifeq            320
			{
				c.setTextSize(0, f1);
	//  144  296:aload_0         
	//  145  297:getfield        #204 <Field TextView c>
	//  146  300:iconst_0        
	//  147  301:fload_3         
	//  148  302:invokevirtual   #349 <Method void TextView.setTextSize(int, float)>
				c.setMaxLines(l);
	//  149  305:aload_0         
	//  150  306:getfield        #204 <Field TextView c>
	//  151  309:iload           5
	//  152  311:invokevirtual   #352 <Method void TextView.setMaxLines(int)>
				super.onMeasure(j, k);
	//  153  314:aload_0         
	//  154  315:iload_1         
	//  155  316:iload_2         
	//  156  317:invokespecial   #312 <Method void LinearLayout.onMeasure(int, int)>
			}
		}
	//  157  320:return          
	}

	public boolean performClick()
	{
		boolean flag = super.performClick();
	//    0    0:aload_0         
	//    1    1:invokespecial   #355 <Method boolean LinearLayout.performClick()>
	//    2    4:istore_1        
		if(a != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #90  <Field TabLayout$Tab a>
	//*   5    9:ifnull          30
		{
			if(!flag)
	//*   6   12:iload_1         
	//*   7   13:ifne            21
				playSoundEffect(0);
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #358 <Method void playSoundEffect(int)>
			a.select();
	//   11   21:aload_0         
	//   12   22:getfield        #90  <Field TabLayout$Tab a>
	//   13   25:invokevirtual   #361 <Method void TabLayout$Tab.select()>
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

	public void setSelected(boolean flag)
	{
		boolean flag1;
		if(isSelected() != flag)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #362 <Method boolean isSelected()>
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
	//   11   17:invokespecial   #363 <Method void LinearLayout.setSelected(boolean)>
		if(flag1 && flag && android.os.N.SDK_INT < 16)
	//*  12   20:iload_2         
	//*  13   21:ifeq            41
	//*  14   24:iload_1         
	//*  15   25:ifeq            41
	//*  16   28:getstatic       #368 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   31:bipush          16
	//*  18   33:icmpge          41
			sendAccessibilityEvent(4);
	//   19   36:aload_0         
	//   20   37:iconst_4        
	//   21   38:invokevirtual   #371 <Method void sendAccessibilityEvent(int)>
		if(c != null)
	//*  22   41:aload_0         
	//*  23   42:getfield        #204 <Field TextView c>
	//*  24   45:ifnull          56
			c.setSelected(flag);
	//   25   48:aload_0         
	//   26   49:getfield        #204 <Field TextView c>
	//   27   52:iload_1         
	//   28   53:invokevirtual   #372 <Method void TextView.setSelected(boolean)>
		if(b != null)
	//*  29   56:aload_0         
	//*  30   57:getfield        #206 <Field ImageView b>
	//*  31   60:ifnull          71
			b.setSelected(flag);
	//   32   63:aload_0         
	//   33   64:getfield        #206 <Field ImageView b>
	//   34   67:iload_1         
	//   35   68:invokevirtual   #373 <Method void ImageView.setSelected(boolean)>
		if(e != null)
	//*  36   71:aload_0         
	//*  37   72:getfield        #202 <Field View e>
	//*  38   75:ifnull          86
			e.setSelected(flag);
	//   39   78:aload_0         
	//   40   79:getfield        #202 <Field View e>
	//   41   82:iload_1         
	//   42   83:invokevirtual   #374 <Method void View.setSelected(boolean)>
	//   43   86:return          
	}

	private b a;
	private ImageView b;
	private TextView c;
	final TabLayout d;
	private View e;
	private TextView f;
	private int h;
	private ImageView i;

	public TabLayout$a(TabLayout tablayout, Context context)
	{
		d = tablayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field TabLayout d>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #27  <Method void LinearLayout(Context)>
		h = 2;
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:putfield        #29  <Field int h>
		if(tablayout.mTabBackgroundResId != 0)
	//*   9   15:aload_1         
	//*  10   16:getfield        #32  <Field int TabLayout.mTabBackgroundResId>
	//*  11   19:ifeq            34
			ViewCompat.setBackground(((View) (this)), AppCompatResources.getDrawable(context, tablayout.mTabBackgroundResId));
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:getfield        #32  <Field int TabLayout.mTabBackgroundResId>
	//   16   28:invokestatic    #38  <Method android.graphics.drawable.Drawable AppCompatResources.getDrawable(Context, int)>
	//   17   31:invokestatic    #44  <Method void ViewCompat.setBackground(View, android.graphics.drawable.Drawable)>
		ViewCompat.setPaddingRelative(((View) (this)), tablayout.mTabPaddingStart, tablayout.mTabPaddingTop, tablayout.mTabPaddingEnd, tablayout.mTabPaddingBottom);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #47  <Field int TabLayout.mTabPaddingStart>
	//   21   39:aload_1         
	//   22   40:getfield        #50  <Field int TabLayout.mTabPaddingTop>
	//   23   43:aload_1         
	//   24   44:getfield        #53  <Field int TabLayout.mTabPaddingEnd>
	//   25   47:aload_1         
	//   26   48:getfield        #56  <Field int TabLayout.mTabPaddingBottom>
	//   27   51:invokestatic    #60  <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
		setGravity(17);
	//   28   54:aload_0         
	//   29   55:bipush          17
	//   30   57:invokevirtual   #64  <Method void setGravity(int)>
		setOrientation(1);
	//   31   60:aload_0         
	//   32   61:iconst_1        
	//   33   62:invokevirtual   #67  <Method void setOrientation(int)>
		setClickable(true);
	//   34   65:aload_0         
	//   35   66:iconst_1        
	//   36   67:invokevirtual   #71  <Method void setClickable(boolean)>
		ViewCompat.setPointerIcon(((View) (this)), PointerIconCompat.getSystemIcon(getContext(), 1002));
	//   37   70:aload_0         
	//   38   71:aload_0         
	//   39   72:invokevirtual   #75  <Method Context getContext()>
	//   40   75:sipush          1002
	//   41   78:invokestatic    #81  <Method PointerIconCompat PointerIconCompat.getSystemIcon(Context, int)>
	//   42   81:invokestatic    #85  <Method void ViewCompat.setPointerIcon(View, PointerIconCompat)>
	//   43   84:return          
	}
}
