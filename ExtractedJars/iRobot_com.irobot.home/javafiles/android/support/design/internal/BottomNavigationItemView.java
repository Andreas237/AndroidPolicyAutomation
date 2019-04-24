// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.support.v4.view.q;
import android.support.v4.view.s;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ax;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class BottomNavigationItemView extends FrameLayout
	implements android.support.v7.view.menu.p.a
{

	public BottomNavigationItemView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #37  <Method void BottomNavigationItemView(Context, AttributeSet)>
	//    4    6:return          
	}

	public BottomNavigationItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #40  <Method void BottomNavigationItemView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public BottomNavigationItemView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #41  <Method void FrameLayout(Context, AttributeSet, int)>
		j = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #43  <Field int j>
		attributeset = ((AttributeSet) (getResources()));
	//    8   12:aload_0         
	//    9   13:invokevirtual   #47  <Method Resources getResources()>
	//   10   16:astore_2        
		i1 = ((Resources) (attributeset)).getDimensionPixelSize(android.support.design.a.d.design_bottom_navigation_text_size);
	//   11   17:aload_2         
	//   12   18:getstatic       #52  <Field int android.support.design.a$d.design_bottom_navigation_text_size>
	//   13   21:invokevirtual   #58  <Method int Resources.getDimensionPixelSize(int)>
	//   14   24:istore_3        
		int j1 = ((Resources) (attributeset)).getDimensionPixelSize(android.support.design.a.d.design_bottom_navigation_active_text_size);
	//   15   25:aload_2         
	//   16   26:getstatic       #61  <Field int android.support.design.a$d.design_bottom_navigation_active_text_size>
	//   17   29:invokevirtual   #58  <Method int Resources.getDimensionPixelSize(int)>
	//   18   32:istore          6
		b = ((Resources) (attributeset)).getDimensionPixelSize(android.support.design.a.d.design_bottom_navigation_margin);
	//   19   34:aload_0         
	//   20   35:aload_2         
	//   21   36:getstatic       #64  <Field int android.support.design.a$d.design_bottom_navigation_margin>
	//   22   39:invokevirtual   #58  <Method int Resources.getDimensionPixelSize(int)>
	//   23   42:putfield        #66  <Field int b>
		c = i1 - j1;
	//   24   45:aload_0         
	//   25   46:iload_3         
	//   26   47:iload           6
	//   27   49:isub            
	//   28   50:putfield        #68  <Field int c>
		float f1 = j1;
	//   29   53:iload           6
	//   30   55:i2f             
	//   31   56:fstore          4
		float f2 = i1;
	//   32   58:iload_3         
	//   33   59:i2f             
	//   34   60:fstore          5
		d = (f1 * 1.0F) / f2;
	//   35   62:aload_0         
	//   36   63:fload           4
	//   37   65:fconst_1        
	//   38   66:fmul            
	//   39   67:fload           5
	//   40   69:fdiv            
	//   41   70:putfield        #70  <Field float d>
		e = (f2 * 1.0F) / f1;
	//   42   73:aload_0         
	//   43   74:fload           5
	//   44   76:fconst_1        
	//   45   77:fmul            
	//   46   78:fload           4
	//   47   80:fdiv            
	//   48   81:putfield        #72  <Field float e>
		LayoutInflater.from(context).inflate(android.support.design.a.h.design_bottom_navigation_item, ((android.view.ViewGroup) (this)), true);
	//   49   84:aload_1         
	//   50   85:invokestatic    #78  <Method LayoutInflater LayoutInflater.from(Context)>
	//   51   88:getstatic       #83  <Field int android.support.design.a$h.design_bottom_navigation_item>
	//   52   91:aload_0         
	//   53   92:iconst_1        
	//   54   93:invokevirtual   #87  <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   55   96:pop             
		setBackgroundResource(android.support.design.a.e.design_bottom_navigation_item_background);
	//   56   97:aload_0         
	//   57   98:getstatic       #92  <Field int android.support.design.a$e.design_bottom_navigation_item_background>
	//   58  101:invokevirtual   #96  <Method void setBackgroundResource(int)>
		g = (ImageView)findViewById(android.support.design.a.f.icon);
	//   59  104:aload_0         
	//   60  105:aload_0         
	//   61  106:getstatic       #101 <Field int android.support.design.a$f.icon>
	//   62  109:invokevirtual   #105 <Method android.view.View findViewById(int)>
	//   63  112:checkcast       #107 <Class ImageView>
	//   64  115:putfield        #109 <Field ImageView g>
		h = (TextView)findViewById(android.support.design.a.f.smallLabel);
	//   65  118:aload_0         
	//   66  119:aload_0         
	//   67  120:getstatic       #112 <Field int android.support.design.a$f.smallLabel>
	//   68  123:invokevirtual   #105 <Method android.view.View findViewById(int)>
	//   69  126:checkcast       #114 <Class TextView>
	//   70  129:putfield        #116 <Field TextView h>
		i = (TextView)findViewById(android.support.design.a.f.largeLabel);
	//   71  132:aload_0         
	//   72  133:aload_0         
	//   73  134:getstatic       #119 <Field int android.support.design.a$f.largeLabel>
	//   74  137:invokevirtual   #105 <Method android.view.View findViewById(int)>
	//   75  140:checkcast       #114 <Class TextView>
	//   76  143:putfield        #121 <Field TextView i>
	//   77  146:return          
	}

	public void a(j j1, int i1)
	{
		k = j1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field j k>
		setCheckable(j1.isCheckable());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #130 <Method boolean j.isCheckable()>
	//    6   10:invokevirtual   #134 <Method void setCheckable(boolean)>
		setChecked(j1.isChecked());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #137 <Method boolean j.isChecked()>
	//   10   18:invokevirtual   #140 <Method void setChecked(boolean)>
		setEnabled(j1.isEnabled());
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #143 <Method boolean j.isEnabled()>
	//   14   26:invokevirtual   #146 <Method void setEnabled(boolean)>
		setIcon(j1.getIcon());
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #150 <Method Drawable j.getIcon()>
	//   18   34:invokevirtual   #154 <Method void setIcon(Drawable)>
		setTitle(j1.getTitle());
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #158 <Method CharSequence j.getTitle()>
	//   22   42:invokevirtual   #162 <Method void setTitle(CharSequence)>
		setId(j1.getItemId());
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #166 <Method int j.getItemId()>
	//   26   50:invokevirtual   #169 <Method void setId(int)>
		setContentDescription(j1.getContentDescription());
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #172 <Method CharSequence j.getContentDescription()>
	//   30   58:invokevirtual   #175 <Method void setContentDescription(CharSequence)>
		ax.a(((android.view.View) (this)), j1.getTooltipText());
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #178 <Method CharSequence j.getTooltipText()>
	//   34   66:invokestatic    #183 <Method void ax.a(android.view.View, CharSequence)>
	//   35   69:return          
	}

	public boolean a()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public j getItemData()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field j k>
	//    2    4:areturn         
	}

	public int getItemPosition()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int j>
	//    2    4:ireturn         
	}

	public int[] onCreateDrawableState(int i1)
	{
		int ai[] = super.onCreateDrawableState(i1 + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #190 <Method int[] FrameLayout.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(k != null && k.isCheckable() && k.isChecked())
	//*   6    8:aload_0         
	//*   7    9:getfield        #124 <Field j k>
	//*   8   12:ifnull          43
	//*   9   15:aload_0         
	//*  10   16:getfield        #124 <Field j k>
	//*  11   19:invokevirtual   #130 <Method boolean j.isCheckable()>
	//*  12   22:ifeq            43
	//*  13   25:aload_0         
	//*  14   26:getfield        #124 <Field j k>
	//*  15   29:invokevirtual   #137 <Method boolean j.isChecked()>
	//*  16   32:ifeq            43
			mergeDrawableStates(ai, a);
	//   17   35:aload_2         
	//   18   36:getstatic       #31  <Field int[] a>
	//   19   39:invokestatic    #194 <Method int[] mergeDrawableStates(int[], int[])>
	//   20   42:pop             
		return ai;
	//   21   43:aload_2         
	//   22   44:areturn         
	}

	public void setCheckable(boolean flag)
	{
		refreshDrawableState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #197 <Method void refreshDrawableState()>
	//    2    4:return          
	}

	public void setChecked(boolean flag)
	{
		i.setPivotX(i.getWidth() / 2);
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field TextView i>
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field TextView i>
	//    4    8:invokevirtual   #200 <Method int TextView.getWidth()>
	//    5   11:iconst_2        
	//    6   12:idiv            
	//    7   13:i2f             
	//    8   14:invokevirtual   #204 <Method void TextView.setPivotX(float)>
		i.setPivotY(i.getBaseline());
	//    9   17:aload_0         
	//   10   18:getfield        #121 <Field TextView i>
	//   11   21:aload_0         
	//   12   22:getfield        #121 <Field TextView i>
	//   13   25:invokevirtual   #207 <Method int TextView.getBaseline()>
	//   14   28:i2f             
	//   15   29:invokevirtual   #210 <Method void TextView.setPivotY(float)>
		h.setPivotX(h.getWidth() / 2);
	//   16   32:aload_0         
	//   17   33:getfield        #116 <Field TextView h>
	//   18   36:aload_0         
	//   19   37:getfield        #116 <Field TextView h>
	//   20   40:invokevirtual   #200 <Method int TextView.getWidth()>
	//   21   43:iconst_2        
	//   22   44:idiv            
	//   23   45:i2f             
	//   24   46:invokevirtual   #204 <Method void TextView.setPivotX(float)>
		h.setPivotY(h.getBaseline());
	//   25   49:aload_0         
	//   26   50:getfield        #116 <Field TextView h>
	//   27   53:aload_0         
	//   28   54:getfield        #116 <Field TextView h>
	//   29   57:invokevirtual   #207 <Method int TextView.getBaseline()>
	//   30   60:i2f             
	//   31   61:invokevirtual   #210 <Method void TextView.setPivotY(float)>
		if(f)
	//*  32   64:aload_0         
	//*  33   65:getfield        #212 <Field boolean f>
	//*  34   68:ifeq            205
		{
			if(flag)
	//*  35   71:iload_1         
	//*  36   72:ifeq            135
			{
				android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)g.getLayoutParams();
	//   37   75:aload_0         
	//   38   76:getfield        #109 <Field ImageView g>
	//   39   79:invokevirtual   #216 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   40   82:checkcast       #218 <Class android.widget.FrameLayout$LayoutParams>
	//   41   85:astore_2        
				layoutparams.gravity = 49;
	//   42   86:aload_2         
	//   43   87:bipush          49
	//   44   89:putfield        #221 <Field int android.widget.FrameLayout$LayoutParams.gravity>
				layoutparams.topMargin = b;
	//   45   92:aload_2         
	//   46   93:aload_0         
	//   47   94:getfield        #66  <Field int b>
	//   48   97:putfield        #224 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
				g.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   49  100:aload_0         
	//   50  101:getfield        #109 <Field ImageView g>
	//   51  104:aload_2         
	//   52  105:invokevirtual   #228 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				i.setVisibility(0);
	//   53  108:aload_0         
	//   54  109:getfield        #121 <Field TextView i>
	//   55  112:iconst_0        
	//   56  113:invokevirtual   #231 <Method void TextView.setVisibility(int)>
				i.setScaleX(1.0F);
	//   57  116:aload_0         
	//   58  117:getfield        #121 <Field TextView i>
	//   59  120:fconst_1        
	//   60  121:invokevirtual   #234 <Method void TextView.setScaleX(float)>
				i.setScaleY(1.0F);
	//   61  124:aload_0         
	//   62  125:getfield        #121 <Field TextView i>
	//   63  128:fconst_1        
	//   64  129:invokevirtual   #237 <Method void TextView.setScaleY(float)>
			} else
	//*  65  132:goto            194
			{
				android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)g.getLayoutParams();
	//   66  135:aload_0         
	//   67  136:getfield        #109 <Field ImageView g>
	//   68  139:invokevirtual   #216 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   69  142:checkcast       #218 <Class android.widget.FrameLayout$LayoutParams>
	//   70  145:astore_2        
				layoutparams1.gravity = 17;
	//   71  146:aload_2         
	//   72  147:bipush          17
	//   73  149:putfield        #221 <Field int android.widget.FrameLayout$LayoutParams.gravity>
				layoutparams1.topMargin = b;
	//   74  152:aload_2         
	//   75  153:aload_0         
	//   76  154:getfield        #66  <Field int b>
	//   77  157:putfield        #224 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
				g.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   78  160:aload_0         
	//   79  161:getfield        #109 <Field ImageView g>
	//   80  164:aload_2         
	//   81  165:invokevirtual   #228 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				i.setVisibility(4);
	//   82  168:aload_0         
	//   83  169:getfield        #121 <Field TextView i>
	//   84  172:iconst_4        
	//   85  173:invokevirtual   #231 <Method void TextView.setVisibility(int)>
				i.setScaleX(0.5F);
	//   86  176:aload_0         
	//   87  177:getfield        #121 <Field TextView i>
	//   88  180:ldc1            #238 <Float 0.5F>
	//   89  182:invokevirtual   #234 <Method void TextView.setScaleX(float)>
				i.setScaleY(0.5F);
	//   90  185:aload_0         
	//   91  186:getfield        #121 <Field TextView i>
	//   92  189:ldc1            #238 <Float 0.5F>
	//   93  191:invokevirtual   #237 <Method void TextView.setScaleY(float)>
			}
			h.setVisibility(4);
	//   94  194:aload_0         
	//   95  195:getfield        #116 <Field TextView h>
	//   96  198:iconst_4        
	//   97  199:invokevirtual   #231 <Method void TextView.setVisibility(int)>
		} else
	//*  98  202:goto            391
		if(flag)
	//*  99  205:iload_1         
	//* 100  206:ifeq            304
		{
			android.widget.FrameLayout.LayoutParams layoutparams2 = (android.widget.FrameLayout.LayoutParams)g.getLayoutParams();
	//  101  209:aload_0         
	//  102  210:getfield        #109 <Field ImageView g>
	//  103  213:invokevirtual   #216 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//  104  216:checkcast       #218 <Class android.widget.FrameLayout$LayoutParams>
	//  105  219:astore_2        
			layoutparams2.gravity = 49;
	//  106  220:aload_2         
	//  107  221:bipush          49
	//  108  223:putfield        #221 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			layoutparams2.topMargin = b + c;
	//  109  226:aload_2         
	//  110  227:aload_0         
	//  111  228:getfield        #66  <Field int b>
	//  112  231:aload_0         
	//  113  232:getfield        #68  <Field int c>
	//  114  235:iadd            
	//  115  236:putfield        #224 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
			g.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams2)));
	//  116  239:aload_0         
	//  117  240:getfield        #109 <Field ImageView g>
	//  118  243:aload_2         
	//  119  244:invokevirtual   #228 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			i.setVisibility(0);
	//  120  247:aload_0         
	//  121  248:getfield        #121 <Field TextView i>
	//  122  251:iconst_0        
	//  123  252:invokevirtual   #231 <Method void TextView.setVisibility(int)>
			h.setVisibility(4);
	//  124  255:aload_0         
	//  125  256:getfield        #116 <Field TextView h>
	//  126  259:iconst_4        
	//  127  260:invokevirtual   #231 <Method void TextView.setVisibility(int)>
			i.setScaleX(1.0F);
	//  128  263:aload_0         
	//  129  264:getfield        #121 <Field TextView i>
	//  130  267:fconst_1        
	//  131  268:invokevirtual   #234 <Method void TextView.setScaleX(float)>
			i.setScaleY(1.0F);
	//  132  271:aload_0         
	//  133  272:getfield        #121 <Field TextView i>
	//  134  275:fconst_1        
	//  135  276:invokevirtual   #237 <Method void TextView.setScaleY(float)>
			h.setScaleX(d);
	//  136  279:aload_0         
	//  137  280:getfield        #116 <Field TextView h>
	//  138  283:aload_0         
	//  139  284:getfield        #70  <Field float d>
	//  140  287:invokevirtual   #234 <Method void TextView.setScaleX(float)>
			h.setScaleY(d);
	//  141  290:aload_0         
	//  142  291:getfield        #116 <Field TextView h>
	//  143  294:aload_0         
	//  144  295:getfield        #70  <Field float d>
	//  145  298:invokevirtual   #237 <Method void TextView.setScaleY(float)>
		} else
	//* 146  301:goto            391
		{
			android.widget.FrameLayout.LayoutParams layoutparams3 = (android.widget.FrameLayout.LayoutParams)g.getLayoutParams();
	//  147  304:aload_0         
	//  148  305:getfield        #109 <Field ImageView g>
	//  149  308:invokevirtual   #216 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//  150  311:checkcast       #218 <Class android.widget.FrameLayout$LayoutParams>
	//  151  314:astore_2        
			layoutparams3.gravity = 49;
	//  152  315:aload_2         
	//  153  316:bipush          49
	//  154  318:putfield        #221 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			layoutparams3.topMargin = b;
	//  155  321:aload_2         
	//  156  322:aload_0         
	//  157  323:getfield        #66  <Field int b>
	//  158  326:putfield        #224 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
			g.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams3)));
	//  159  329:aload_0         
	//  160  330:getfield        #109 <Field ImageView g>
	//  161  333:aload_2         
	//  162  334:invokevirtual   #228 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			i.setVisibility(4);
	//  163  337:aload_0         
	//  164  338:getfield        #121 <Field TextView i>
	//  165  341:iconst_4        
	//  166  342:invokevirtual   #231 <Method void TextView.setVisibility(int)>
			h.setVisibility(0);
	//  167  345:aload_0         
	//  168  346:getfield        #116 <Field TextView h>
	//  169  349:iconst_0        
	//  170  350:invokevirtual   #231 <Method void TextView.setVisibility(int)>
			i.setScaleX(e);
	//  171  353:aload_0         
	//  172  354:getfield        #121 <Field TextView i>
	//  173  357:aload_0         
	//  174  358:getfield        #72  <Field float e>
	//  175  361:invokevirtual   #234 <Method void TextView.setScaleX(float)>
			i.setScaleY(e);
	//  176  364:aload_0         
	//  177  365:getfield        #121 <Field TextView i>
	//  178  368:aload_0         
	//  179  369:getfield        #72  <Field float e>
	//  180  372:invokevirtual   #237 <Method void TextView.setScaleY(float)>
			h.setScaleX(1.0F);
	//  181  375:aload_0         
	//  182  376:getfield        #116 <Field TextView h>
	//  183  379:fconst_1        
	//  184  380:invokevirtual   #234 <Method void TextView.setScaleX(float)>
			h.setScaleY(1.0F);
	//  185  383:aload_0         
	//  186  384:getfield        #116 <Field TextView h>
	//  187  387:fconst_1        
	//  188  388:invokevirtual   #237 <Method void TextView.setScaleY(float)>
		}
		refreshDrawableState();
	//  189  391:aload_0         
	//  190  392:invokevirtual   #197 <Method void refreshDrawableState()>
	//  191  395:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #239 <Method void FrameLayout.setEnabled(boolean)>
		h.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #116 <Field TextView h>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #240 <Method void TextView.setEnabled(boolean)>
		i.setEnabled(flag);
	//    7   13:aload_0         
	//    8   14:getfield        #121 <Field TextView i>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #240 <Method void TextView.setEnabled(boolean)>
		g.setEnabled(flag);
	//   11   21:aload_0         
	//   12   22:getfield        #109 <Field ImageView g>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #241 <Method void ImageView.setEnabled(boolean)>
		q q1;
		if(flag)
	//*  15   29:iload_1         
	//*  16   30:ifeq            50
			q1 = q.a(getContext(), 1002);
	//   17   33:aload_0         
	//   18   34:invokevirtual   #245 <Method Context getContext()>
	//   19   37:sipush          1002
	//   20   40:invokestatic    #250 <Method q q.a(Context, int)>
	//   21   43:astore_2        
		else
	//*  22   44:aload_0         
	//*  23   45:aload_2         
	//*  24   46:invokestatic    #255 <Method void s.a(android.view.View, q)>
	//*  25   49:return          
			q1 = null;
	//   26   50:aconst_null     
	//   27   51:astore_2        
		s.a(((android.view.View) (this)), q1);
	//*  28   52:goto            44
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
	//    5    7:invokevirtual   #261 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    6   10:astore_2        
			if(obj != null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       18
	//*   9   15:goto            23
				drawable = ((android.graphics.drawable.Drawable.ConstantState) (obj)).newDrawable();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #266 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   12   22:astore_1        
			obj = ((Object) (android.support.v4.a.a.a.g(drawable).mutate()));
	//   13   23:aload_1         
	//   14   24:invokestatic    #271 <Method Drawable a.g(Drawable)>
	//   15   27:invokevirtual   #274 <Method Drawable Drawable.mutate()>
	//   16   30:astore_2        
			android.support.v4.a.a.a.a(((Drawable) (obj)), l);
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #276 <Field ColorStateList l>
	//   20   36:invokestatic    #279 <Method void a.a(Drawable, ColorStateList)>
		}
		g.setImageDrawable(((Drawable) (obj)));
	//   21   39:aload_0         
	//   22   40:getfield        #109 <Field ImageView g>
	//   23   43:aload_2         
	//   24   44:invokevirtual   #282 <Method void ImageView.setImageDrawable(Drawable)>
	//   25   47:return          
	}

	public void setIconTintList(ColorStateList colorstatelist)
	{
		l = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #276 <Field ColorStateList l>
		if(k != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #124 <Field j k>
	//*   5    9:ifnull          23
			setIcon(k.getIcon());
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #124 <Field j k>
	//    9   17:invokevirtual   #150 <Method Drawable j.getIcon()>
	//   10   20:invokevirtual   #154 <Method void setIcon(Drawable)>
	//   11   23:return          
	}

	public void setItemBackground(int i1)
	{
		Drawable drawable;
		if(i1 == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			drawable = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            18
			drawable = android.support.v4.content.a.getDrawable(getContext(), i1);
	//    5    9:aload_0         
	//    6   10:invokevirtual   #245 <Method Context getContext()>
	//    7   13:iload_1         
	//    8   14:invokestatic    #291 <Method Drawable android.support.v4.content.a.getDrawable(Context, int)>
	//    9   17:astore_2        
		s.a(((android.view.View) (this)), drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokestatic    #294 <Method void s.a(android.view.View, Drawable)>
	//   13   23:return          
	}

	public void setItemPosition(int i1)
	{
		j = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int j>
	//    3    5:return          
	}

	public void setShiftingMode(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #212 <Field boolean f>
	//    3    5:return          
	}

	public void setTextColor(ColorStateList colorstatelist)
	{
		h.setTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field TextView h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #299 <Method void TextView.setTextColor(ColorStateList)>
		i.setTextColor(colorstatelist);
	//    4    8:aload_0         
	//    5    9:getfield        #121 <Field TextView i>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #299 <Method void TextView.setTextColor(ColorStateList)>
	//    8   16:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		h.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field TextView h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #302 <Method void TextView.setText(CharSequence)>
		i.setText(charsequence);
	//    4    8:aload_0         
	//    5    9:getfield        #121 <Field TextView i>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #302 <Method void TextView.setText(CharSequence)>
	//    8   16:return          
	}

	private static final int a[] = {
		0x10100a0
	};
	private final int b;
	private final int c;
	private final float d;
	private final float e;
	private boolean f;
	private ImageView g;
	private final TextView h;
	private final TextView i;
	private int j;
	private j k;
	private ColorStateList l;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #29  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #31  <Field int[] a>
	//*   7   11:return          
	}
}
