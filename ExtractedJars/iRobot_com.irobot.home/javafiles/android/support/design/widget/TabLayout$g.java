// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.q;
import android.support.v4.view.s;
import android.support.v4.widget.m;
import android.support.v7.c.a.b;
import android.support.v7.widget.ax;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$g extends LinearLayout
{

	private float a(Layout layout, int i, float f1)
	{
		return layout.getLineWidth(i) * (f1 / layout.getPaint().getTextSize());
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #84  <Method float Layout.getLineWidth(int)>
	//    3    5:fload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #88  <Method TextPaint Layout.getPaint()>
	//    6   10:invokevirtual   #94  <Method float TextPaint.getTextSize()>
	//    7   13:fdiv            
	//    8   14:fmul            
	//    9   15:freturn         
	}

	private void a(TextView textview, ImageView imageview)
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field TabLayout$e b>
	//    2    4:astore          6
		Object obj1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          9
		android.graphics.drawable.Drawable drawable;
		if(obj != null)
	//*   5    9:aload           6
	//*   6   11:ifnull          26
			drawable = b.b();
	//    7   14:aload_0         
	//    8   15:getfield        #97  <Field TabLayout$e b>
	//    9   18:invokevirtual   #102 <Method android.graphics.drawable.Drawable android.support.design.widget.TabLayout$e.b()>
	//   10   21:astore          7
		else
	//*  11   23:goto            29
			drawable = null;
	//   12   26:aconst_null     
	//   13   27:astore          7
		CharSequence charsequence;
		if(b != null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #97  <Field TabLayout$e b>
	//*  16   33:ifnull          48
			charsequence = b.d();
	//   17   36:aload_0         
	//   18   37:getfield        #97  <Field TabLayout$e b>
	//   19   40:invokevirtual   #105 <Method CharSequence TabLayout$e.d()>
	//   20   43:astore          8
		else
	//*  21   45:goto            51
			charsequence = null;
	//   22   48:aconst_null     
	//   23   49:astore          8
		if(b != null)
	//*  24   51:aload_0         
	//*  25   52:getfield        #97  <Field TabLayout$e b>
	//*  26   55:ifnull          70
			obj = ((Object) (b.g()));
	//   27   58:aload_0         
	//   28   59:getfield        #97  <Field TabLayout$e b>
	//   29   62:invokevirtual   #107 <Method CharSequence TabLayout$e.g()>
	//   30   65:astore          6
		else
	//*  31   67:goto            73
			obj = null;
	//   32   70:aconst_null     
	//   33   71:astore          6
		boolean flag = false;
	//   34   73:iconst_0        
	//   35   74:istore          4
		if(imageview != null)
	//*  36   76:aload_2         
	//*  37   77:ifnull          121
		{
			if(drawable != null)
	//*  38   80:aload           7
	//*  39   82:ifnull          104
			{
				imageview.setImageDrawable(drawable);
	//   40   85:aload_2         
	//   41   86:aload           7
	//   42   88:invokevirtual   #113 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
				imageview.setVisibility(0);
	//   43   91:aload_2         
	//   44   92:iconst_0        
	//   45   93:invokevirtual   #116 <Method void ImageView.setVisibility(int)>
				setVisibility(0);
	//   46   96:aload_0         
	//   47   97:iconst_0        
	//   48   98:invokevirtual   #117 <Method void setVisibility(int)>
			} else
	//*  49  101:goto            115
			{
				imageview.setVisibility(8);
	//   50  104:aload_2         
	//   51  105:bipush          8
	//   52  107:invokevirtual   #116 <Method void ImageView.setVisibility(int)>
				imageview.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   53  110:aload_2         
	//   54  111:aconst_null     
	//   55  112:invokevirtual   #113 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
			}
			imageview.setContentDescription(((CharSequence) (obj)));
	//   56  115:aload_2         
	//   57  116:aload           6
	//   58  118:invokevirtual   #121 <Method void ImageView.setContentDescription(CharSequence)>
		}
		boolean flag1 = TextUtils.isEmpty(charsequence) ^ true;
	//   59  121:aload           8
	//   60  123:invokestatic    #127 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   61  126:iconst_1        
	//   62  127:ixor            
	//   63  128:istore          5
		if(textview != null)
	//*  64  130:aload_1         
	//*  65  131:ifnull          175
		{
			if(flag1)
	//*  66  134:iload           5
	//*  67  136:ifeq            158
			{
				textview.setText(charsequence);
	//   68  139:aload_1         
	//   69  140:aload           8
	//   70  142:invokevirtual   #132 <Method void TextView.setText(CharSequence)>
				textview.setVisibility(0);
	//   71  145:aload_1         
	//   72  146:iconst_0        
	//   73  147:invokevirtual   #133 <Method void TextView.setVisibility(int)>
				setVisibility(0);
	//   74  150:aload_0         
	//   75  151:iconst_0        
	//   76  152:invokevirtual   #117 <Method void setVisibility(int)>
			} else
	//*  77  155:goto            169
			{
				textview.setVisibility(8);
	//   78  158:aload_1         
	//   79  159:bipush          8
	//   80  161:invokevirtual   #133 <Method void TextView.setVisibility(int)>
				textview.setText(((CharSequence) (null)));
	//   81  164:aload_1         
	//   82  165:aconst_null     
	//   83  166:invokevirtual   #132 <Method void TextView.setText(CharSequence)>
			}
			textview.setContentDescription(((CharSequence) (obj)));
	//   84  169:aload_1         
	//   85  170:aload           6
	//   86  172:invokevirtual   #134 <Method void TextView.setContentDescription(CharSequence)>
		}
		if(imageview != null)
	//*  87  175:aload_2         
	//*  88  176:ifnull          232
		{
			textview = ((TextView) ((android.view.rginLayoutParams)imageview.getLayoutParams()));
	//   89  179:aload_2         
	//   90  180:invokevirtual   #138 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   91  183:checkcast       #140 <Class android.view.ViewGroup$MarginLayoutParams>
	//   92  186:astore_1        
			int i = ((int) (flag));
	//   93  187:iload           4
	//   94  189:istore_3        
			if(flag1)
	//*  95  190:iload           5
	//*  96  192:ifeq            215
			{
				i = ((int) (flag));
	//   97  195:iload           4
	//   98  197:istore_3        
				if(imageview.getVisibility() == 0)
	//*  99  198:aload_2         
	//* 100  199:invokevirtual   #144 <Method int ImageView.getVisibility()>
	//* 101  202:ifne            215
					i = a.b(8);
	//  102  205:aload_0         
	//  103  206:getfield        #24  <Field TabLayout a>
	//  104  209:bipush          8
	//  105  211:invokevirtual   #147 <Method int android.support.design.widget.TabLayout.b(int)>
	//  106  214:istore_3        
			}
			if(i != ((android.view.rginLayoutParams) (textview)).bottomMargin)
	//* 107  215:iload_3         
	//* 108  216:aload_1         
	//* 109  217:getfield        #150 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//* 110  220:icmpeq          232
			{
				textview.bottomMargin = i;
	//  111  223:aload_1         
	//  112  224:iload_3         
	//  113  225:putfield        #150 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
				imageview.requestLayout();
	//  114  228:aload_2         
	//  115  229:invokevirtual   #154 <Method void ImageView.requestLayout()>
			}
		}
		if(flag1)
	//* 116  232:iload           5
	//* 117  234:ifeq            244
			obj = ((Object) (obj1));
	//  118  237:aload           9
	//  119  239:astore          6
	//* 120  241:goto            244
		ax.a(((View) (this)), ((CharSequence) (obj)));
	//  121  244:aload_0         
	//  122  245:aload           6
	//  123  247:invokestatic    #159 <Method void ax.a(View, CharSequence)>
	//  124  250:return          
	}

	void a()
	{
		a(((TabLayout$e) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #162 <Method void a(TabLayout$e)>
		setSelected(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #165 <Method void setSelected(boolean)>
	//    6   10:return          
	}

	void a(TabLayout$e tablayout$e)
	{
		if(tablayout$e != b)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #97  <Field TabLayout$e b>
	//*   3    5:if_acmpeq       17
		{
			b = tablayout$e;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #97  <Field TabLayout$e b>
			b();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #167 <Method void b()>
		}
	//    9   17:return          
	}

	final void b()
	{
		boolean flag1;
		TabLayout$e tablayout$e;
label0:
		{
			tablayout$e = b;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field TabLayout$e b>
	//    2    4:astore          5
			Object obj1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          4
			Object obj;
			if(tablayout$e != null)
	//*   5    9:aload           5
	//*   6   11:ifnull          23
				obj = ((Object) (tablayout$e.a()));
	//    7   14:aload           5
	//    8   16:invokevirtual   #170 <Method View TabLayout$e.a()>
	//    9   19:astore_3        
			else
	//*  10   20:goto            25
				obj = null;
	//   11   23:aconst_null     
	//   12   24:astore_3        
			if(obj != null)
	//*  13   25:aload_3         
	//*  14   26:ifnull          149
			{
				obj1 = ((Object) (((View) (obj)).getParent()));
	//   15   29:aload_3         
	//   16   30:invokevirtual   #176 <Method android.view.ViewParent View.getParent()>
	//   17   33:astore          4
				if(obj1 != this)
	//*  18   35:aload           4
	//*  19   37:aload_0         
	//*  20   38:if_acmpeq       60
				{
					if(obj1 != null)
	//*  21   41:aload           4
	//*  22   43:ifnull          55
						((ViewGroup)obj1).removeView(((View) (obj)));
	//   23   46:aload           4
	//   24   48:checkcast       #178 <Class ViewGroup>
	//   25   51:aload_3         
	//   26   52:invokevirtual   #182 <Method void ViewGroup.removeView(View)>
					addView(((View) (obj)));
	//   27   55:aload_0         
	//   28   56:aload_3         
	//   29   57:invokevirtual   #185 <Method void addView(View)>
				}
				e = ((View) (obj));
	//   30   60:aload_0         
	//   31   61:aload_3         
	//   32   62:putfield        #187 <Field View e>
				if(c != null)
	//*  33   65:aload_0         
	//*  34   66:getfield        #189 <Field TextView c>
	//*  35   69:ifnull          81
					c.setVisibility(8);
	//   36   72:aload_0         
	//   37   73:getfield        #189 <Field TextView c>
	//   38   76:bipush          8
	//   39   78:invokevirtual   #133 <Method void TextView.setVisibility(int)>
				if(d != null)
	//*  40   81:aload_0         
	//*  41   82:getfield        #191 <Field ImageView d>
	//*  42   85:ifnull          105
				{
					d.setVisibility(8);
	//   43   88:aload_0         
	//   44   89:getfield        #191 <Field ImageView d>
	//   45   92:bipush          8
	//   46   94:invokevirtual   #116 <Method void ImageView.setVisibility(int)>
					d.setImageDrawable(((android.graphics.drawable.Drawable) (null)));
	//   47   97:aload_0         
	//   48   98:getfield        #191 <Field ImageView d>
	//   49  101:aconst_null     
	//   50  102:invokevirtual   #113 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
				}
				f = (TextView)((View) (obj)).findViewById(0x1020014);
	//   51  105:aload_0         
	//   52  106:aload_3         
	//   53  107:ldc1            #192 <Int 0x1020014>
	//   54  109:invokevirtual   #196 <Method View View.findViewById(int)>
	//   55  112:checkcast       #129 <Class TextView>
	//   56  115:putfield        #198 <Field TextView f>
				if(f != null)
	//*  57  118:aload_0         
	//*  58  119:getfield        #198 <Field TextView f>
	//*  59  122:ifnull          136
					h = m.a(f);
	//   60  125:aload_0         
	//   61  126:aload_0         
	//   62  127:getfield        #198 <Field TextView f>
	//   63  130:invokestatic    #203 <Method int m.a(TextView)>
	//   64  133:putfield        #29  <Field int h>
				obj = ((Object) ((ImageView)((View) (obj)).findViewById(0x1020006)));
	//   65  136:aload_3         
	//   66  137:ldc1            #204 <Int 0x1020006>
	//   67  139:invokevirtual   #196 <Method View View.findViewById(int)>
	//   68  142:checkcast       #109 <Class ImageView>
	//   69  145:astore_3        
			} else
	//*  70  146:goto            177
			{
				if(e != null)
	//*  71  149:aload_0         
	//*  72  150:getfield        #187 <Field View e>
	//*  73  153:ifnull          169
				{
					removeView(e);
	//   74  156:aload_0         
	//   75  157:aload_0         
	//   76  158:getfield        #187 <Field View e>
	//   77  161:invokevirtual   #205 <Method void removeView(View)>
					e = null;
	//   78  164:aload_0         
	//   79  165:aconst_null     
	//   80  166:putfield        #187 <Field View e>
				}
				f = null;
	//   81  169:aload_0         
	//   82  170:aconst_null     
	//   83  171:putfield        #198 <Field TextView f>
				obj = obj1;
	//   84  174:aload           4
	//   85  176:astore_3        
			}
			g = ((ImageView) (obj));
	//   86  177:aload_0         
	//   87  178:aload_3         
	//   88  179:putfield        #207 <Field ImageView g>
			obj = ((Object) (e));
	//   89  182:aload_0         
	//   90  183:getfield        #187 <Field View e>
	//   91  186:astore_3        
			flag1 = false;
	//   92  187:iconst_0        
	//   93  188:istore_2        
			if(obj == null)
	//*  94  189:aload_3         
	//*  95  190:ifnonnull       329
			{
				if(d == null)
	//*  96  193:aload_0         
	//*  97  194:getfield        #191 <Field ImageView d>
	//*  98  197:ifnonnull       230
				{
					obj = ((Object) ((ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.a.h.design_layout_tab_icon, ((ViewGroup) (this)), false)));
	//   99  200:aload_0         
	//  100  201:invokevirtual   #68  <Method Context getContext()>
	//  101  204:invokestatic    #213 <Method LayoutInflater LayoutInflater.from(Context)>
	//  102  207:getstatic       #218 <Field int android.support.design.a$h.design_layout_tab_icon>
	//  103  210:aload_0         
	//  104  211:iconst_0        
	//  105  212:invokevirtual   #222 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//  106  215:checkcast       #109 <Class ImageView>
	//  107  218:astore_3        
					addView(((View) (obj)), 0);
	//  108  219:aload_0         
	//  109  220:aload_3         
	//  110  221:iconst_0        
	//  111  222:invokevirtual   #225 <Method void addView(View, int)>
					d = ((ImageView) (obj));
	//  112  225:aload_0         
	//  113  226:aload_3         
	//  114  227:putfield        #191 <Field ImageView d>
				}
				if(c == null)
	//* 115  230:aload_0         
	//* 116  231:getfield        #189 <Field TextView c>
	//* 117  234:ifnonnull       277
				{
					obj = ((Object) ((TextView)LayoutInflater.from(getContext()).inflate(android.support.design.a.h.design_layout_tab_text, ((ViewGroup) (this)), false)));
	//  118  237:aload_0         
	//  119  238:invokevirtual   #68  <Method Context getContext()>
	//  120  241:invokestatic    #213 <Method LayoutInflater LayoutInflater.from(Context)>
	//  121  244:getstatic       #228 <Field int android.support.design.a$h.design_layout_tab_text>
	//  122  247:aload_0         
	//  123  248:iconst_0        
	//  124  249:invokevirtual   #222 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//  125  252:checkcast       #129 <Class TextView>
	//  126  255:astore_3        
					addView(((View) (obj)));
	//  127  256:aload_0         
	//  128  257:aload_3         
	//  129  258:invokevirtual   #185 <Method void addView(View)>
					c = ((TextView) (obj));
	//  130  261:aload_0         
	//  131  262:aload_3         
	//  132  263:putfield        #189 <Field TextView c>
					h = m.a(c);
	//  133  266:aload_0         
	//  134  267:aload_0         
	//  135  268:getfield        #189 <Field TextView c>
	//  136  271:invokestatic    #203 <Method int m.a(TextView)>
	//  137  274:putfield        #29  <Field int h>
				}
				m.a(c, a.e);
	//  138  277:aload_0         
	//  139  278:getfield        #189 <Field TextView c>
	//  140  281:aload_0         
	//  141  282:getfield        #24  <Field TabLayout a>
	//  142  285:getfield        #230 <Field int TabLayout.e>
	//  143  288:invokestatic    #233 <Method void m.a(TextView, int)>
				if(a.f != null)
	//* 144  291:aload_0         
	//* 145  292:getfield        #24  <Field TabLayout a>
	//* 146  295:getfield        #236 <Field android.content.res.ColorStateList TabLayout.f>
	//* 147  298:ifnull          315
					c.setTextColor(a.f);
	//  148  301:aload_0         
	//  149  302:getfield        #189 <Field TextView c>
	//  150  305:aload_0         
	//  151  306:getfield        #24  <Field TabLayout a>
	//  152  309:getfield        #236 <Field android.content.res.ColorStateList TabLayout.f>
	//  153  312:invokevirtual   #240 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
				obj = ((Object) (c));
	//  154  315:aload_0         
	//  155  316:getfield        #189 <Field TextView c>
	//  156  319:astore_3        
				obj1 = ((Object) (d));
	//  157  320:aload_0         
	//  158  321:getfield        #191 <Field ImageView d>
	//  159  324:astore          4
			} else
	//* 160  326:goto            354
			{
				if(f == null && g == null)
					break label0;
	//  161  329:aload_0         
	//  162  330:getfield        #198 <Field TextView f>
	//  163  333:ifnonnull       343
	//  164  336:aload_0         
	//  165  337:getfield        #207 <Field ImageView g>
	//  166  340:ifnull          361
				obj = ((Object) (f));
	//  167  343:aload_0         
	//  168  344:getfield        #198 <Field TextView f>
	//  169  347:astore_3        
				obj1 = ((Object) (g));
	//  170  348:aload_0         
	//  171  349:getfield        #207 <Field ImageView g>
	//  172  352:astore          4
			}
			a(((TextView) (obj)), ((ImageView) (obj1)));
	//  173  354:aload_0         
	//  174  355:aload_3         
	//  175  356:aload           4
	//  176  358:invokespecial   #242 <Method void a(TextView, ImageView)>
		}
		boolean flag = flag1;
	//  177  361:iload_2         
	//  178  362:istore_1        
		if(tablayout$e != null)
	//* 179  363:aload           5
	//* 180  365:ifnull          380
		{
			flag = flag1;
	//  181  368:iload_2         
	//  182  369:istore_1        
			if(tablayout$e.f())
	//* 183  370:aload           5
	//* 184  372:invokevirtual   #245 <Method boolean TabLayout$e.f()>
	//* 185  375:ifeq            380
				flag = true;
	//  186  378:iconst_1        
	//  187  379:istore_1        
		}
		setSelected(flag);
	//  188  380:aload_0         
	//  189  381:iload_1         
	//  190  382:invokevirtual   #165 <Method void setSelected(boolean)>
	//  191  385:return          
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #249 <Method void LinearLayout.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$b)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #251 <Class android.support.v7.app.ActionBar$b>
	//    5    8:invokevirtual   #257 <Method String Class.getName()>
	//    6   11:invokevirtual   #262 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    7   14:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #266 <Method void LinearLayout.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$b)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #251 <Class android.support.v7.app.ActionBar$b>
	//    5    8:invokevirtual   #257 <Method String Class.getName()>
	//    6   11:invokevirtual   #269 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    7   14:return          
	}

	public void onMeasure(int i, int j)
	{
		int k;
label0:
		{
			int l = android.view.Spec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #276 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          6
			int j1 = android.view.Spec.getMode(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #279 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          7
			int k1 = a.getTabMaxWidth();
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field TabLayout a>
	//    8   16:invokevirtual   #282 <Method int TabLayout.getTabMaxWidth()>
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
			k = android.view.Spec.makeMeasureSpec(a.j, 0x80000000);
	//   21   44:aload_0         
	//   22   45:getfield        #24  <Field TabLayout a>
	//   23   48:getfield        #285 <Field int TabLayout.j>
	//   24   51:ldc2            #286 <Int 0x80000000>
	//   25   54:invokestatic    #290 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   26   57:istore          5
		}
label1:
		{
			float f1;
			boolean flag;
label2:
			{
				super.onMeasure(k, j);
	//   27   59:aload_0         
	//   28   60:iload           5
	//   29   62:iload_2         
	//   30   63:invokespecial   #292 <Method void LinearLayout.onMeasure(int, int)>
				if(c == null)
					break label1;
	//   31   66:aload_0         
	//   32   67:getfield        #189 <Field TextView c>
	//   33   70:ifnull          326
				getResources();
	//   34   73:aload_0         
	//   35   74:invokevirtual   #296 <Method android.content.res.Resources getResources()>
	//   36   77:pop             
				float f2 = a.g;
	//   37   78:aload_0         
	//   38   79:getfield        #24  <Field TabLayout a>
	//   39   82:getfield        #299 <Field float TabLayout.g>
	//   40   85:fstore          4
				int i1 = h;
	//   41   87:aload_0         
	//   42   88:getfield        #29  <Field int h>
	//   43   91:istore          6
				Object obj = ((Object) (d));
	//   44   93:aload_0         
	//   45   94:getfield        #191 <Field ImageView d>
	//   46   97:astore          10
				boolean flag1 = true;
	//   47   99:iconst_1        
	//   48  100:istore          7
				if(obj != null && d.getVisibility() == 0)
	//*  49  102:aload           10
	//*  50  104:ifnull          125
	//*  51  107:aload_0         
	//*  52  108:getfield        #191 <Field ImageView d>
	//*  53  111:invokevirtual   #144 <Method int ImageView.getVisibility()>
	//*  54  114:ifne            125
				{
					i = 1;
	//   55  117:iconst_1        
	//   56  118:istore_1        
					f1 = f2;
	//   57  119:fload           4
	//   58  121:fstore_3        
				} else
	//*  59  122:goto            166
				{
					f1 = f2;
	//   60  125:fload           4
	//   61  127:fstore_3        
					i = i1;
	//   62  128:iload           6
	//   63  130:istore_1        
					if(c != null)
	//*  64  131:aload_0         
	//*  65  132:getfield        #189 <Field TextView c>
	//*  66  135:ifnull          166
					{
						f1 = f2;
	//   67  138:fload           4
	//   68  140:fstore_3        
						i = i1;
	//   69  141:iload           6
	//   70  143:istore_1        
						if(c.getLineCount() > 1)
	//*  71  144:aload_0         
	//*  72  145:getfield        #189 <Field TextView c>
	//*  73  148:invokevirtual   #302 <Method int TextView.getLineCount()>
	//*  74  151:iconst_1        
	//*  75  152:icmple          166
						{
							f1 = a.h;
	//   76  155:aload_0         
	//   77  156:getfield        #24  <Field TabLayout a>
	//   78  159:getfield        #304 <Field float TabLayout.h>
	//   79  162:fstore_3        
							i = i1;
	//   80  163:iload           6
	//   81  165:istore_1        
						}
					}
				}
				f2 = c.getTextSize();
	//   82  166:aload_0         
	//   83  167:getfield        #189 <Field TextView c>
	//   84  170:invokevirtual   #305 <Method float TextView.getTextSize()>
	//   85  173:fstore          4
				int l1 = c.getLineCount();
	//   86  175:aload_0         
	//   87  176:getfield        #189 <Field TextView c>
	//   88  179:invokevirtual   #302 <Method int TextView.getLineCount()>
	//   89  182:istore          8
				i1 = m.a(c);
	//   90  184:aload_0         
	//   91  185:getfield        #189 <Field TextView c>
	//   92  188:invokestatic    #203 <Method int m.a(TextView)>
	//   93  191:istore          6
				int i2 = f1 != f2;
	//   94  193:fload_3         
	//   95  194:fload           4
	//   96  196:fcmpl           
	//   97  197:istore          9
				if(i2 == 0 && (i1 < 0 || i == i1))
					break label1;
	//   98  199:iload           9
	//   99  201:ifne            215
	//  100  204:iload           6
	//  101  206:iflt            326
	//  102  209:iload_1         
	//  103  210:iload           6
	//  104  212:icmpeq          326
				flag = flag1;
	//  105  215:iload           7
	//  106  217:istore          6
				if(a.l != 1)
					break label2;
	//  107  219:aload_0         
	//  108  220:getfield        #24  <Field TabLayout a>
	//  109  223:getfield        #308 <Field int TabLayout.l>
	//  110  226:iconst_1        
	//  111  227:icmpne          297
				flag = flag1;
	//  112  230:iload           7
	//  113  232:istore          6
				if(i2 <= 0)
					break label2;
	//  114  234:iload           9
	//  115  236:ifle            297
				flag = flag1;
	//  116  239:iload           7
	//  117  241:istore          6
				if(l1 != 1)
					break label2;
	//  118  243:iload           8
	//  119  245:iconst_1        
	//  120  246:icmpne          297
				obj = ((Object) (c.getLayout()));
	//  121  249:aload_0         
	//  122  250:getfield        #189 <Field TextView c>
	//  123  253:invokevirtual   #312 <Method Layout TextView.getLayout()>
	//  124  256:astore          10
				if(obj != null)
	//* 125  258:aload           10
	//* 126  260:ifnull          294
				{
					flag = flag1;
	//  127  263:iload           7
	//  128  265:istore          6
					if(a(((Layout) (obj)), 0, f1) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
						break label2;
	//  129  267:aload_0         
	//  130  268:aload           10
	//  131  270:iconst_0        
	//  132  271:fload_3         
	//  133  272:invokespecial   #314 <Method float a(Layout, int, float)>
	//  134  275:aload_0         
	//  135  276:invokevirtual   #317 <Method int getMeasuredWidth()>
	//  136  279:aload_0         
	//  137  280:invokevirtual   #320 <Method int getPaddingLeft()>
	//  138  283:isub            
	//  139  284:aload_0         
	//  140  285:invokevirtual   #323 <Method int getPaddingRight()>
	//  141  288:isub            
	//  142  289:i2f             
	//  143  290:fcmpl           
	//  144  291:ifle            297
				}
				flag = false;
	//  145  294:iconst_0        
	//  146  295:istore          6
			}
			if(flag)
	//* 147  297:iload           6
	//* 148  299:ifeq            326
			{
				c.setTextSize(0, f1);
	//  149  302:aload_0         
	//  150  303:getfield        #189 <Field TextView c>
	//  151  306:iconst_0        
	//  152  307:fload_3         
	//  153  308:invokevirtual   #327 <Method void TextView.setTextSize(int, float)>
				c.setMaxLines(i);
	//  154  311:aload_0         
	//  155  312:getfield        #189 <Field TextView c>
	//  156  315:iload_1         
	//  157  316:invokevirtual   #330 <Method void TextView.setMaxLines(int)>
				super.onMeasure(k, j);
	//  158  319:aload_0         
	//  159  320:iload           5
	//  160  322:iload_2         
	//  161  323:invokespecial   #292 <Method void LinearLayout.onMeasure(int, int)>
			}
		}
	//  162  326:return          
	}

	public boolean performClick()
	{
		boolean flag1 = super.performClick();
	//    0    0:aload_0         
	//    1    1:invokespecial   #333 <Method boolean LinearLayout.performClick()>
	//    2    4:istore_2        
		boolean flag = flag1;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(b != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #97  <Field TabLayout$e b>
	//*   7   11:ifnull          32
		{
			if(!flag1)
	//*   8   14:iload_2         
	//*   9   15:ifne            23
				playSoundEffect(0);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #336 <Method void playSoundEffect(int)>
			b.e();
	//   13   23:aload_0         
	//   14   24:getfield        #97  <Field TabLayout$e b>
	//   15   27:invokevirtual   #338 <Method void TabLayout$e.e()>
			flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_1        
		}
		return flag;
	//   18   32:iload_1         
	//   19   33:ireturn         
	}

	public void setSelected(boolean flag)
	{
		boolean flag1;
		if(isSelected() != flag)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #341 <Method boolean isSelected()>
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
	//   11   17:invokespecial   #342 <Method void LinearLayout.setSelected(boolean)>
		if(flag1 && flag && android.os.N.SDK_INT < 16)
	//*  12   20:iload_2         
	//*  13   21:ifeq            41
	//*  14   24:iload_1         
	//*  15   25:ifeq            41
	//*  16   28:getstatic       #347 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   31:bipush          16
	//*  18   33:icmpge          41
			sendAccessibilityEvent(4);
	//   19   36:aload_0         
	//   20   37:iconst_4        
	//   21   38:invokevirtual   #350 <Method void sendAccessibilityEvent(int)>
		if(c != null)
	//*  22   41:aload_0         
	//*  23   42:getfield        #189 <Field TextView c>
	//*  24   45:ifnull          56
			c.setSelected(flag);
	//   25   48:aload_0         
	//   26   49:getfield        #189 <Field TextView c>
	//   27   52:iload_1         
	//   28   53:invokevirtual   #351 <Method void TextView.setSelected(boolean)>
		if(d != null)
	//*  29   56:aload_0         
	//*  30   57:getfield        #191 <Field ImageView d>
	//*  31   60:ifnull          71
			d.setSelected(flag);
	//   32   63:aload_0         
	//   33   64:getfield        #191 <Field ImageView d>
	//   34   67:iload_1         
	//   35   68:invokevirtual   #352 <Method void ImageView.setSelected(boolean)>
		if(e != null)
	//*  36   71:aload_0         
	//*  37   72:getfield        #187 <Field View e>
	//*  38   75:ifnull          86
			e.setSelected(flag);
	//   39   78:aload_0         
	//   40   79:getfield        #187 <Field View e>
	//   41   82:iload_1         
	//   42   83:invokevirtual   #353 <Method void View.setSelected(boolean)>
	//   43   86:return          
	}

	final TabLayout a;
	private TabLayout$e b;
	private TextView c;
	private ImageView d;
	private View e;
	private TextView f;
	private ImageView g;
	private int h;

	public TabLayout$g(TabLayout tablayout, Context context)
	{
		a = tablayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field TabLayout a>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #27  <Method void LinearLayout(Context)>
		h = 2;
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:putfield        #29  <Field int h>
		if(tablayout.i != 0)
	//*   9   15:aload_1         
	//*  10   16:getfield        #32  <Field int TabLayout.i>
	//*  11   19:ifeq            34
			s.a(((View) (this)), android.support.v7.c.a.b.b(context, tablayout.i));
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:getfield        #32  <Field int TabLayout.i>
	//   16   28:invokestatic    #37  <Method android.graphics.drawable.Drawable b.b(Context, int)>
	//   17   31:invokestatic    #42  <Method void s.a(View, android.graphics.drawable.Drawable)>
		s.b(((View) (this)), tablayout.a, tablayout.b, tablayout.c, tablayout.d);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #44  <Field int TabLayout.a>
	//   21   39:aload_1         
	//   22   40:getfield        #46  <Field int android.support.design.widget.TabLayout.b>
	//   23   43:aload_1         
	//   24   44:getfield        #48  <Field int TabLayout.c>
	//   25   47:aload_1         
	//   26   48:getfield        #50  <Field int TabLayout.d>
	//   27   51:invokestatic    #53  <Method void s.b(View, int, int, int, int)>
		setGravity(17);
	//   28   54:aload_0         
	//   29   55:bipush          17
	//   30   57:invokevirtual   #57  <Method void setGravity(int)>
		setOrientation(1);
	//   31   60:aload_0         
	//   32   61:iconst_1        
	//   33   62:invokevirtual   #60  <Method void setOrientation(int)>
		setClickable(true);
	//   34   65:aload_0         
	//   35   66:iconst_1        
	//   36   67:invokevirtual   #64  <Method void setClickable(boolean)>
		s.a(((View) (this)), q.a(getContext(), 1002));
	//   37   70:aload_0         
	//   38   71:aload_0         
	//   39   72:invokevirtual   #68  <Method Context getContext()>
	//   40   75:sipush          1002
	//   41   78:invokestatic    #73  <Method q q.a(Context, int)>
	//   42   81:invokestatic    #76  <Method void s.a(View, q)>
	//   43   84:return          
	}
}
