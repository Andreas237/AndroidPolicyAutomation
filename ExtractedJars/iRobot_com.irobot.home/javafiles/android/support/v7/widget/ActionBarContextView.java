// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v7.view.b;
import android.support.v7.view.menu.h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			a, av, ActionMenuPresenter, ActionMenuView, 
//			bd

public class ActionBarContextView extends a
{

	public ActionBarContextView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #28  <Method void ActionBarContextView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionBarContextView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.actionModeStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #34  <Field int android.support.v7.a.a$a.actionModeStyle>
	//    4    6:invokespecial   #37  <Method void ActionBarContextView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ActionBarContextView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #38  <Method void a(Context, AttributeSet, int)>
		context = ((Context) (av.a(context, attributeset, android.support.v7.a.a.j.ActionMode, i1, 0)));
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:getstatic       #44  <Field int[] android.support.v7.a.a$j.ActionMode>
	//    8   12:iload_3         
	//    9   13:iconst_0        
	//   10   14:invokestatic    #50  <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   11   17:astore_1        
		s.a(((View) (this)), ((av) (context)).a(android.support.v7.a.a.j.ActionMode_background));
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:getstatic       #53  <Field int android.support.v7.a.a$j.ActionMode_background>
	//   15   23:invokevirtual   #56  <Method android.graphics.drawable.Drawable av.a(int)>
	//   16   26:invokestatic    #61  <Method void s.a(View, android.graphics.drawable.Drawable)>
		n = ((av) (context)).g(android.support.v7.a.a.j.ActionMode_titleTextStyle, 0);
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:getstatic       #64  <Field int android.support.v7.a.a$j.ActionMode_titleTextStyle>
	//   20   34:iconst_0        
	//   21   35:invokevirtual   #67  <Method int av.g(int, int)>
	//   22   38:putfield        #69  <Field int n>
		o = ((av) (context)).g(android.support.v7.a.a.j.ActionMode_subtitleTextStyle, 0);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:getstatic       #72  <Field int android.support.v7.a.a$j.ActionMode_subtitleTextStyle>
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #67  <Method int av.g(int, int)>
	//   28   50:putfield        #74  <Field int o>
		e = ((av) (context)).f(android.support.v7.a.a.j.ActionMode_height, 0);
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:getstatic       #77  <Field int android.support.v7.a.a$j.ActionMode_height>
	//   32   58:iconst_0        
	//   33   59:invokevirtual   #80  <Method int av.f(int, int)>
	//   34   62:putfield        #83  <Field int e>
		q = ((av) (context)).g(android.support.v7.a.a.j.ActionMode_closeItemLayout, android.support.v7.a.a.g.abc_action_mode_close_item_material);
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:getstatic       #86  <Field int android.support.v7.a.a$j.ActionMode_closeItemLayout>
	//   38   70:getstatic       #91  <Field int android.support.v7.a.a$g.abc_action_mode_close_item_material>
	//   39   73:invokevirtual   #67  <Method int av.g(int, int)>
	//   40   76:putfield        #93  <Field int q>
		((av) (context)).a();
	//   41   79:aload_1         
	//   42   80:invokevirtual   #96  <Method void av.a()>
	//   43   83:return          
	}

	private void e()
	{
		byte byte0;
		Object obj;
label0:
		{
			if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field LinearLayout k>
	//*   2    4:ifnonnull       117
			{
				LayoutInflater.from(getContext()).inflate(android.support.v7.a.a.g.abc_action_bar_title_item, ((android.view.ViewGroup) (this)));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #102 <Method Context getContext()>
	//    5   11:invokestatic    #108 <Method LayoutInflater LayoutInflater.from(Context)>
	//    6   14:getstatic       #111 <Field int android.support.v7.a.a$g.abc_action_bar_title_item>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #115 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    9   21:pop             
				k = (LinearLayout)getChildAt(getChildCount() - 1);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #119 <Method int getChildCount()>
	//   14   28:iconst_1        
	//   15   29:isub            
	//   16   30:invokevirtual   #123 <Method View getChildAt(int)>
	//   17   33:checkcast       #125 <Class LinearLayout>
	//   18   36:putfield        #98  <Field LinearLayout k>
				l = (TextView)k.findViewById(android.support.v7.a.a.f.action_bar_title);
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:getfield        #98  <Field LinearLayout k>
	//   22   44:getstatic       #130 <Field int android.support.v7.a.a$f.action_bar_title>
	//   23   47:invokevirtual   #133 <Method View LinearLayout.findViewById(int)>
	//   24   50:checkcast       #135 <Class TextView>
	//   25   53:putfield        #137 <Field TextView l>
				m = (TextView)k.findViewById(android.support.v7.a.a.f.action_bar_subtitle);
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:getfield        #98  <Field LinearLayout k>
	//   29   61:getstatic       #140 <Field int android.support.v7.a.a$f.action_bar_subtitle>
	//   30   64:invokevirtual   #133 <Method View LinearLayout.findViewById(int)>
	//   31   67:checkcast       #135 <Class TextView>
	//   32   70:putfield        #142 <Field TextView m>
				if(n != 0)
	//*  33   73:aload_0         
	//*  34   74:getfield        #69  <Field int n>
	//*  35   77:ifeq            95
					l.setTextAppearance(getContext(), n);
	//   36   80:aload_0         
	//   37   81:getfield        #137 <Field TextView l>
	//   38   84:aload_0         
	//   39   85:invokevirtual   #102 <Method Context getContext()>
	//   40   88:aload_0         
	//   41   89:getfield        #69  <Field int n>
	//   42   92:invokevirtual   #146 <Method void TextView.setTextAppearance(Context, int)>
				if(o != 0)
	//*  43   95:aload_0         
	//*  44   96:getfield        #74  <Field int o>
	//*  45   99:ifeq            117
					m.setTextAppearance(getContext(), o);
	//   46  102:aload_0         
	//   47  103:getfield        #142 <Field TextView m>
	//   48  106:aload_0         
	//   49  107:invokevirtual   #102 <Method Context getContext()>
	//   50  110:aload_0         
	//   51  111:getfield        #74  <Field int o>
	//   52  114:invokevirtual   #146 <Method void TextView.setTextAppearance(Context, int)>
			}
			l.setText(g);
	//   53  117:aload_0         
	//   54  118:getfield        #137 <Field TextView l>
	//   55  121:aload_0         
	//   56  122:getfield        #148 <Field CharSequence g>
	//   57  125:invokevirtual   #152 <Method void TextView.setText(CharSequence)>
			m.setText(h);
	//   58  128:aload_0         
	//   59  129:getfield        #142 <Field TextView m>
	//   60  132:aload_0         
	//   61  133:getfield        #154 <Field CharSequence h>
	//   62  136:invokevirtual   #152 <Method void TextView.setText(CharSequence)>
			boolean flag1 = TextUtils.isEmpty(g);
	//   63  139:aload_0         
	//   64  140:getfield        #148 <Field CharSequence g>
	//   65  143:invokestatic    #160 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   66  146:istore          4
			boolean flag = TextUtils.isEmpty(h) ^ true;
	//   67  148:aload_0         
	//   68  149:getfield        #154 <Field CharSequence h>
	//   69  152:invokestatic    #160 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   70  155:iconst_1        
	//   71  156:ixor            
	//   72  157:istore_3        
			obj = ((Object) (m));
	//   73  158:aload_0         
	//   74  159:getfield        #142 <Field TextView m>
	//   75  162:astore          5
			byte byte1 = 8;
	//   76  164:bipush          8
	//   77  166:istore_2        
			if(flag)
	//*  78  167:iload_3         
	//*  79  168:ifeq            176
				byte0 = 0;
	//   80  171:iconst_0        
	//   81  172:istore_1        
			else
	//*  82  173:goto            179
				byte0 = 8;
	//   83  176:bipush          8
	//   84  178:istore_1        
			((TextView) (obj)).setVisibility(((int) (byte0)));
	//   85  179:aload           5
	//   86  181:iload_1         
	//   87  182:invokevirtual   #164 <Method void TextView.setVisibility(int)>
			obj = ((Object) (k));
	//   88  185:aload_0         
	//   89  186:getfield        #98  <Field LinearLayout k>
	//   90  189:astore          5
			if(!(flag1 ^ true))
	//*  91  191:iload           4
	//*  92  193:iconst_1        
	//*  93  194:ixor            
	//*  94  195:ifne            204
			{
				byte0 = byte1;
	//   95  198:iload_2         
	//   96  199:istore_1        
				if(!flag)
					break label0;
	//   97  200:iload_3         
	//   98  201:ifeq            206
			}
			byte0 = 0;
	//   99  204:iconst_0        
	//  100  205:istore_1        
		}
		((LinearLayout) (obj)).setVisibility(((int) (byte0)));
	//  101  206:aload           5
	//  102  208:iload_1         
	//  103  209:invokevirtual   #165 <Method void LinearLayout.setVisibility(int)>
		if(k.getParent() == null)
	//* 104  212:aload_0         
	//* 105  213:getfield        #98  <Field LinearLayout k>
	//* 106  216:invokevirtual   #169 <Method android.view.ViewParent LinearLayout.getParent()>
	//* 107  219:ifnonnull       230
			addView(((View) (k)));
	//  108  222:aload_0         
	//  109  223:aload_0         
	//  110  224:getfield        #98  <Field LinearLayout k>
	//  111  227:invokevirtual   #173 <Method void addView(View)>
	//  112  230:return          
	}

	public volatile w a(int i1, long l1)
	{
		return super.a(i1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #176 <Method w a.a(int, long)>
	//    4    6:areturn         
	}

	public void a(b b1)
	{
		if(i != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field View i>
	//    2    4:ifnonnull       38
_L1:
		i = LayoutInflater.from(getContext()).inflate(q, ((android.view.ViewGroup) (this)), false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #102 <Method Context getContext()>
	//    6   12:invokestatic    #108 <Method LayoutInflater LayoutInflater.from(Context)>
	//    7   15:aload_0         
	//    8   16:getfield        #93  <Field int q>
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #182 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   12   24:putfield        #179 <Field View i>
_L3:
		addView(i);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #179 <Field View i>
	//   16   32:invokevirtual   #173 <Method void addView(View)>
		break; /* Loop/switch isn't completed */
	//   17   35:goto            51
_L2:
		if(i.getParent() != null) goto _L4; else goto _L3
	//   18   38:aload_0         
	//   19   39:getfield        #179 <Field View i>
	//   20   42:invokevirtual   #185 <Method android.view.ViewParent View.getParent()>
	//   21   45:ifnonnull       51
	//*  22   48:goto            27
_L4:
		i.findViewById(android.support.v7.a.a.f.action_mode_close_button).setOnClickListener(new android.view.View.OnClickListener(b1) {

			public void onClick(View view)
			{
				a.c();
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field b a>
			//    2    4:invokevirtual   #31  <Method void b.c()>
			//    3    7:return          
			}

			final b a;
			final ActionBarContextView b;

			
			{
				b = ActionBarContextView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ActionBarContextView b>
				a = b1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field b a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   23   51:aload_0         
	//   24   52:getfield        #179 <Field View i>
	//   25   55:getstatic       #188 <Field int android.support.v7.a.a$f.action_mode_close_button>
	//   26   58:invokevirtual   #189 <Method View View.findViewById(int)>
	//   27   61:new             #6   <Class ActionBarContextView$1>
	//   28   64:dup             
	//   29   65:aload_0         
	//   30   66:aload_1         
	//   31   67:invokespecial   #192 <Method void ActionBarContextView$1(ActionBarContextView, b)>
	//   32   70:invokevirtual   #196 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		b1 = ((b) ((h)b1.b()));
	//   33   73:aload_1         
	//   34   74:invokevirtual   #202 <Method android.view.Menu b.b()>
	//   35   77:checkcast       #204 <Class h>
	//   36   80:astore_1        
		if(d != null)
	//*  37   81:aload_0         
	//*  38   82:getfield        #208 <Field ActionMenuPresenter d>
	//*  39   85:ifnull          96
			d.h();
	//   40   88:aload_0         
	//   41   89:getfield        #208 <Field ActionMenuPresenter d>
	//   42   92:invokevirtual   #213 <Method boolean android.support.v7.widget.ActionMenuPresenter.h()>
	//   43   95:pop             
		d = new ActionMenuPresenter(getContext());
	//   44   96:aload_0         
	//   45   97:new             #210 <Class ActionMenuPresenter>
	//   46  100:dup             
	//   47  101:aload_0         
	//   48  102:invokevirtual   #102 <Method Context getContext()>
	//   49  105:invokespecial   #215 <Method void ActionMenuPresenter(Context)>
	//   50  108:putfield        #208 <Field ActionMenuPresenter d>
		d.c(true);
	//   51  111:aload_0         
	//   52  112:getfield        #208 <Field ActionMenuPresenter d>
	//   53  115:iconst_1        
	//   54  116:invokevirtual   #219 <Method void ActionMenuPresenter.c(boolean)>
		android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
	//   55  119:new             #221 <Class android.view.ViewGroup$LayoutParams>
	//   56  122:dup             
	//   57  123:bipush          -2
	//   58  125:iconst_m1       
	//   59  126:invokespecial   #224 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   60  129:astore_2        
		((h) (b1)).a(((android.support.v7.view.menu.o) (d)), b);
	//   61  130:aload_1         
	//   62  131:aload_0         
	//   63  132:getfield        #208 <Field ActionMenuPresenter d>
	//   64  135:aload_0         
	//   65  136:getfield        #227 <Field Context b>
	//   66  139:invokevirtual   #230 <Method void h.a(android.support.v7.view.menu.o, Context)>
		c = (ActionMenuView)d.a(((android.view.ViewGroup) (this)));
	//   67  142:aload_0         
	//   68  143:aload_0         
	//   69  144:getfield        #208 <Field ActionMenuPresenter d>
	//   70  147:aload_0         
	//   71  148:invokevirtual   #233 <Method android.support.v7.view.menu.p ActionMenuPresenter.a(android.view.ViewGroup)>
	//   72  151:checkcast       #235 <Class ActionMenuView>
	//   73  154:putfield        #238 <Field ActionMenuView c>
		s.a(((View) (c)), ((android.graphics.drawable.Drawable) (null)));
	//   74  157:aload_0         
	//   75  158:getfield        #238 <Field ActionMenuView c>
	//   76  161:aconst_null     
	//   77  162:invokestatic    #61  <Method void s.a(View, android.graphics.drawable.Drawable)>
		addView(((View) (c)), layoutparams);
	//   78  165:aload_0         
	//   79  166:aload_0         
	//   80  167:getfield        #238 <Field ActionMenuView c>
	//   81  170:aload_2         
	//   82  171:invokevirtual   #241 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		return;
	//   83  174:return          
	}

	public boolean a()
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #208 <Field ActionMenuPresenter d>
	//*   2    4:ifnull          15
			return d.f();
	//    3    7:aload_0         
	//    4    8:getfield        #208 <Field ActionMenuPresenter d>
	//    5   11:invokevirtual   #243 <Method boolean ActionMenuPresenter.f()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void b()
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field View i>
	//*   2    4:ifnonnull       11
			c();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #245 <Method void c()>
	//    5   11:return          
	}

	public void c()
	{
		removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #248 <Method void removeAllViews()>
		j = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #250 <Field View j>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #238 <Field ActionMenuView c>
	//    8   14:return          
	}

	public boolean d()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field boolean p>
	//    2    4:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new android.view.ViewGroup.MarginLayoutParams(-1, -2)));
	//    0    0:new             #256 <Class android.view.ViewGroup$MarginLayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:bipush          -2
	//    4    7:invokespecial   #257 <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
	//    5   10:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset)));
	//    0    0:new             #256 <Class android.view.ViewGroup$MarginLayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #102 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #260 <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	public volatile int getAnimatedVisibility()
	{
		return super.getAnimatedVisibility();
	//    0    0:aload_0         
	//    1    1:invokespecial   #263 <Method int a.getAnimatedVisibility()>
	//    2    4:ireturn         
	}

	public volatile int getContentHeight()
	{
		return super.getContentHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method int a.getContentHeight()>
	//    2    4:ireturn         
	}

	public CharSequence getSubtitle()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field CharSequence h>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field CharSequence g>
	//    2    4:areturn         
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #272 <Method void a.onDetachedFromWindow()>
		if(d != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #208 <Field ActionMenuPresenter d>
	//*   4    8:ifnull          27
		{
			d.g();
	//    5   11:aload_0         
	//    6   12:getfield        #208 <Field ActionMenuPresenter d>
	//    7   15:invokevirtual   #274 <Method boolean ActionMenuPresenter.g()>
	//    8   18:pop             
			d.i();
	//    9   19:aload_0         
	//   10   20:getfield        #208 <Field ActionMenuPresenter d>
	//   11   23:invokevirtual   #276 <Method boolean ActionMenuPresenter.i()>
	//   12   26:pop             
		}
	//   13   27:return          
	}

	public volatile boolean onHoverEvent(MotionEvent motionevent)
	{
		return super.onHoverEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #280 <Method boolean a.onHoverEvent(MotionEvent)>
	//    3    5:ireturn         
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		if(accessibilityevent.getEventType() == 32)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #287 <Method int AccessibilityEvent.getEventType()>
	//*   2    4:bipush          32
	//*   3    6:icmpne          45
		{
			accessibilityevent.setSource(((View) (this)));
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:invokevirtual   #290 <Method void AccessibilityEvent.setSource(View)>
			accessibilityevent.setClassName(((CharSequence) (((Object)this).getClass().getName())));
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #296 <Method Class Object.getClass()>
	//   10   19:invokevirtual   #302 <Method String Class.getName()>
	//   11   22:invokevirtual   #305 <Method void AccessibilityEvent.setClassName(CharSequence)>
			accessibilityevent.setPackageName(((CharSequence) (getContext().getPackageName())));
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #102 <Method Context getContext()>
	//   15   30:invokevirtual   #310 <Method String Context.getPackageName()>
	//   16   33:invokevirtual   #313 <Method void AccessibilityEvent.setPackageName(CharSequence)>
			accessibilityevent.setContentDescription(g);
	//   17   36:aload_1         
	//   18   37:aload_0         
	//   19   38:getfield        #148 <Field CharSequence g>
	//   20   41:invokevirtual   #316 <Method void AccessibilityEvent.setContentDescription(CharSequence)>
			return;
	//   21   44:return          
		} else
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:invokespecial   #318 <Method void a.onInitializeAccessibilityEvent(AccessibilityEvent)>
			return;
	//   25   50:return          
		}
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		flag = bd.a(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #325 <Method boolean bd.a(View)>
	//    2    4:istore_1        
		int i2;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            23
			i2 = k1 - i1 - getPaddingRight();
	//    5    9:iload           4
	//    6   11:iload_2         
	//    7   12:isub            
	//    8   13:aload_0         
	//    9   14:invokevirtual   #328 <Method int getPaddingRight()>
	//   10   17:isub            
	//   11   18:istore          6
		else
	//*  12   20:goto            29
			i2 = getPaddingLeft();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #331 <Method int getPaddingLeft()>
	//   15   27:istore          6
		int j2 = getPaddingTop();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #334 <Method int getPaddingTop()>
	//   18   33:istore          7
		int k2 = l1 - j1 - getPaddingTop() - getPaddingBottom();
	//   19   35:iload           5
	//   20   37:iload_3         
	//   21   38:isub            
	//   22   39:aload_0         
	//   23   40:invokevirtual   #334 <Method int getPaddingTop()>
	//   24   43:isub            
	//   25   44:aload_0         
	//   26   45:invokevirtual   #337 <Method int getPaddingBottom()>
	//   27   48:isub            
	//   28   49:istore          8
		if(i != null && i.getVisibility() != 8)
	//*  29   51:aload_0         
	//*  30   52:getfield        #179 <Field View i>
	//*  31   55:ifnull          156
	//*  32   58:aload_0         
	//*  33   59:getfield        #179 <Field View i>
	//*  34   62:invokevirtual   #340 <Method int View.getVisibility()>
	//*  35   65:bipush          8
	//*  36   67:icmpeq          156
		{
			android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams();
	//   37   70:aload_0         
	//   38   71:getfield        #179 <Field View i>
	//   39   74:invokevirtual   #343 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   40   77:checkcast       #256 <Class android.view.ViewGroup$MarginLayoutParams>
	//   41   80:astore          9
			if(flag)
	//*  42   82:iload_1         
	//*  43   83:ifeq            95
				j1 = marginlayoutparams.rightMargin;
	//   44   86:aload           9
	//   45   88:getfield        #346 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   46   91:istore_3        
			else
	//*  47   92:goto            101
				j1 = marginlayoutparams.leftMargin;
	//   48   95:aload           9
	//   49   97:getfield        #349 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   50  100:istore_3        
			if(flag)
	//*  51  101:iload_1         
	//*  52  102:ifeq            115
				l1 = marginlayoutparams.leftMargin;
	//   53  105:aload           9
	//   54  107:getfield        #349 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   55  110:istore          5
			else
	//*  56  112:goto            122
				l1 = marginlayoutparams.rightMargin;
	//   57  115:aload           9
	//   58  117:getfield        #346 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   59  120:istore          5
			j1 = a(i2, j1, flag);
	//   60  122:iload           6
	//   61  124:iload_3         
	//   62  125:iload_1         
	//   63  126:invokestatic    #352 <Method int a(int, int, boolean)>
	//   64  129:istore_3        
			j1 = a(j1 + a(i, j1, j2, k2, flag), l1, flag);
	//   65  130:iload_3         
	//   66  131:aload_0         
	//   67  132:aload_0         
	//   68  133:getfield        #179 <Field View i>
	//   69  136:iload_3         
	//   70  137:iload           7
	//   71  139:iload           8
	//   72  141:iload_1         
	//   73  142:invokevirtual   #355 <Method int a(View, int, int, int, boolean)>
	//   74  145:iadd            
	//   75  146:iload           5
	//   76  148:iload_1         
	//   77  149:invokestatic    #352 <Method int a(int, int, boolean)>
	//   78  152:istore_3        
		} else
	//*  79  153:goto            159
		{
			j1 = i2;
	//   80  156:iload           6
	//   81  158:istore_3        
		}
		l1 = j1;
	//   82  159:iload_3         
	//   83  160:istore          5
		if(k != null)
	//*  84  162:aload_0         
	//*  85  163:getfield        #98  <Field LinearLayout k>
	//*  86  166:ifnull          212
		{
			l1 = j1;
	//   87  169:iload_3         
	//   88  170:istore          5
			if(j == null)
	//*  89  172:aload_0         
	//*  90  173:getfield        #250 <Field View j>
	//*  91  176:ifnonnull       212
			{
				l1 = j1;
	//   92  179:iload_3         
	//   93  180:istore          5
				if(k.getVisibility() != 8)
	//*  94  182:aload_0         
	//*  95  183:getfield        #98  <Field LinearLayout k>
	//*  96  186:invokevirtual   #356 <Method int LinearLayout.getVisibility()>
	//*  97  189:bipush          8
	//*  98  191:icmpeq          212
					l1 = j1 + a(((View) (k)), j1, j2, k2, flag);
	//   99  194:iload_3         
	//  100  195:aload_0         
	//  101  196:aload_0         
	//  102  197:getfield        #98  <Field LinearLayout k>
	//  103  200:iload_3         
	//  104  201:iload           7
	//  105  203:iload           8
	//  106  205:iload_1         
	//  107  206:invokevirtual   #355 <Method int a(View, int, int, int, boolean)>
	//  108  209:iadd            
	//  109  210:istore          5
			}
		}
		if(j != null)
	//* 110  212:aload_0         
	//* 111  213:getfield        #250 <Field View j>
	//* 112  216:ifnull          235
			a(j, l1, j2, k2, flag);
	//  113  219:aload_0         
	//  114  220:aload_0         
	//  115  221:getfield        #250 <Field View j>
	//  116  224:iload           5
	//  117  226:iload           7
	//  118  228:iload           8
	//  119  230:iload_1         
	//  120  231:invokevirtual   #355 <Method int a(View, int, int, int, boolean)>
	//  121  234:pop             
		if(flag)
	//* 122  235:iload_1         
	//* 123  236:ifeq            247
			i1 = getPaddingLeft();
	//  124  239:aload_0         
	//  125  240:invokevirtual   #331 <Method int getPaddingLeft()>
	//  126  243:istore_2        
		else
	//* 127  244:goto            257
			i1 = k1 - i1 - getPaddingRight();
	//  128  247:iload           4
	//  129  249:iload_2         
	//  130  250:isub            
	//  131  251:aload_0         
	//  132  252:invokevirtual   #328 <Method int getPaddingRight()>
	//  133  255:isub            
	//  134  256:istore_2        
		if(c != null)
	//* 135  257:aload_0         
	//* 136  258:getfield        #238 <Field ActionMenuView c>
	//* 137  261:ifnull          281
			a(((View) (c)), i1, j2, k2, flag ^ true);
	//  138  264:aload_0         
	//  139  265:aload_0         
	//  140  266:getfield        #238 <Field ActionMenuView c>
	//  141  269:iload_2         
	//  142  270:iload           7
	//  143  272:iload           8
	//  144  274:iload_1         
	//  145  275:iconst_1        
	//  146  276:ixor            
	//  147  277:invokevirtual   #355 <Method int a(View, int, int, int, boolean)>
	//  148  280:pop             
	//  149  281:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		int k1 = android.view.View.MeasureSpec.getMode(i1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #363 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		int k2 = 0x40000000;
	//    3    5:ldc2            #364 <Int 0x40000000>
	//    4    8:istore          5
		if(k1 != 0x40000000)
	//*   5   10:iload_3         
	//*   6   11:ldc2            #364 <Int 0x40000000>
	//*   7   14:icmpeq          70
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   17:new             #366 <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #368 <Method void StringBuilder()>
	//   11   24:astore          11
			stringbuilder.append(((Object)this).getClass().getSimpleName());
	//   12   26:aload           11
	//   13   28:aload_0         
	//   14   29:invokevirtual   #296 <Method Class Object.getClass()>
	//   15   32:invokevirtual   #371 <Method String Class.getSimpleName()>
	//   16   35:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
			stringbuilder.append(" can only be used ");
	//   18   39:aload           11
	//   19   41:ldc2            #377 <String " can only be used ">
	//   20   44:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
			stringbuilder.append("with android:layout_width=\"match_parent\" (or fill_parent)");
	//   22   48:aload           11
	//   23   50:ldc2            #379 <String "with android:layout_width=\"match_parent\" (or fill_parent)">
	//   24   53:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   26   57:new             #381 <Class IllegalStateException>
	//   27   60:dup             
	//   28   61:aload           11
	//   29   63:invokevirtual   #384 <Method String StringBuilder.toString()>
	//   30   66:invokespecial   #387 <Method void IllegalStateException(String)>
	//   31   69:athrow          
		}
		if(android.view.View.MeasureSpec.getMode(j1) == 0)
	//*  32   70:iload_2         
	//*  33   71:invokestatic    #363 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  34   74:ifne            130
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   35   77:new             #366 <Class StringBuilder>
	//   36   80:dup             
	//   37   81:invokespecial   #368 <Method void StringBuilder()>
	//   38   84:astore          11
			stringbuilder1.append(((Object)this).getClass().getSimpleName());
	//   39   86:aload           11
	//   40   88:aload_0         
	//   41   89:invokevirtual   #296 <Method Class Object.getClass()>
	//   42   92:invokevirtual   #371 <Method String Class.getSimpleName()>
	//   43   95:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//   44   98:pop             
			stringbuilder1.append(" can only be used ");
	//   45   99:aload           11
	//   46  101:ldc2            #377 <String " can only be used ">
	//   47  104:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//   48  107:pop             
			stringbuilder1.append("with android:layout_height=\"wrap_content\"");
	//   49  108:aload           11
	//   50  110:ldc2            #389 <String "with android:layout_height=\"wrap_content\"">
	//   51  113:invokevirtual   #375 <Method StringBuilder StringBuilder.append(String)>
	//   52  116:pop             
			throw new IllegalStateException(stringbuilder1.toString());
	//   53  117:new             #381 <Class IllegalStateException>
	//   54  120:dup             
	//   55  121:aload           11
	//   56  123:invokevirtual   #384 <Method String StringBuilder.toString()>
	//   57  126:invokespecial   #387 <Method void IllegalStateException(String)>
	//   58  129:athrow          
		}
		int j3 = android.view.View.MeasureSpec.getSize(i1);
	//   59  130:iload_1         
	//   60  131:invokestatic    #392 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   61  134:istore          8
		if(e > 0)
	//*  62  136:aload_0         
	//*  63  137:getfield        #83  <Field int e>
	//*  64  140:ifle            151
			k1 = e;
	//   65  143:aload_0         
	//   66  144:getfield        #83  <Field int e>
	//   67  147:istore_3        
		else
	//*  68  148:goto            156
			k1 = android.view.View.MeasureSpec.getSize(j1);
	//   69  151:iload_2         
	//   70  152:invokestatic    #392 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   71  155:istore_3        
		int k3 = getPaddingTop() + getPaddingBottom();
	//   72  156:aload_0         
	//   73  157:invokevirtual   #334 <Method int getPaddingTop()>
	//   74  160:aload_0         
	//   75  161:invokevirtual   #337 <Method int getPaddingBottom()>
	//   76  164:iadd            
	//   77  165:istore          9
		i1 = j3 - getPaddingLeft() - getPaddingRight();
	//   78  167:iload           8
	//   79  169:aload_0         
	//   80  170:invokevirtual   #331 <Method int getPaddingLeft()>
	//   81  173:isub            
	//   82  174:aload_0         
	//   83  175:invokevirtual   #328 <Method int getPaddingRight()>
	//   84  178:isub            
	//   85  179:istore_1        
		int i3 = k1 - k3;
	//   86  180:iload_3         
	//   87  181:iload           9
	//   88  183:isub            
	//   89  184:istore          7
		int l1 = android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x80000000);
	//   90  186:iload           7
	//   91  188:ldc2            #393 <Int 0x80000000>
	//   92  191:invokestatic    #396 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   93  194:istore          4
		View view = i;
	//   94  196:aload_0         
	//   95  197:getfield        #179 <Field View i>
	//   96  200:astore          11
		boolean flag = false;
	//   97  202:iconst_0        
	//   98  203:istore          6
		j1 = i1;
	//   99  205:iload_1         
	//  100  206:istore_2        
		if(view != null)
	//* 101  207:aload           11
	//* 102  209:ifnull          251
		{
			i1 = a(i, i1, l1, 0);
	//  103  212:aload_0         
	//  104  213:aload_0         
	//  105  214:getfield        #179 <Field View i>
	//  106  217:iload_1         
	//  107  218:iload           4
	//  108  220:iconst_0        
	//  109  221:invokevirtual   #399 <Method int a(View, int, int, int)>
	//  110  224:istore_1        
			android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams();
	//  111  225:aload_0         
	//  112  226:getfield        #179 <Field View i>
	//  113  229:invokevirtual   #343 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  114  232:checkcast       #256 <Class android.view.ViewGroup$MarginLayoutParams>
	//  115  235:astore          11
			j1 = i1 - (marginlayoutparams.leftMargin + marginlayoutparams.rightMargin);
	//  116  237:iload_1         
	//  117  238:aload           11
	//  118  240:getfield        #349 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//  119  243:aload           11
	//  120  245:getfield        #346 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//  121  248:iadd            
	//  122  249:isub            
	//  123  250:istore_2        
		}
		i1 = j1;
	//  124  251:iload_2         
	//  125  252:istore_1        
		if(c != null)
	//* 126  253:aload_0         
	//* 127  254:getfield        #238 <Field ActionMenuView c>
	//* 128  257:ifnull          286
		{
			i1 = j1;
	//  129  260:iload_2         
	//  130  261:istore_1        
			if(c.getParent() == this)
	//* 131  262:aload_0         
	//* 132  263:getfield        #238 <Field ActionMenuView c>
	//* 133  266:invokevirtual   #400 <Method android.view.ViewParent ActionMenuView.getParent()>
	//* 134  269:aload_0         
	//* 135  270:if_acmpne       286
				i1 = a(((View) (c)), j1, l1, 0);
	//  136  273:aload_0         
	//  137  274:aload_0         
	//  138  275:getfield        #238 <Field ActionMenuView c>
	//  139  278:iload_2         
	//  140  279:iload           4
	//  141  281:iconst_0        
	//  142  282:invokevirtual   #399 <Method int a(View, int, int, int)>
	//  143  285:istore_1        
		}
		j1 = i1;
	//  144  286:iload_1         
	//  145  287:istore_2        
		if(k != null)
	//* 146  288:aload_0         
	//* 147  289:getfield        #98  <Field LinearLayout k>
	//* 148  292:ifnull          404
		{
			j1 = i1;
	//  149  295:iload_1         
	//  150  296:istore_2        
			if(j == null)
	//* 151  297:aload_0         
	//* 152  298:getfield        #250 <Field View j>
	//* 153  301:ifnonnull       404
				if(p)
	//* 154  304:aload_0         
	//* 155  305:getfield        #252 <Field boolean p>
	//* 156  308:ifeq            391
				{
					j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  157  311:iconst_0        
	//  158  312:iconst_0        
	//  159  313:invokestatic    #396 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  160  316:istore_2        
					k.measure(j1, l1);
	//  161  317:aload_0         
	//  162  318:getfield        #98  <Field LinearLayout k>
	//  163  321:iload_2         
	//  164  322:iload           4
	//  165  324:invokevirtual   #403 <Method void LinearLayout.measure(int, int)>
					int l3 = k.getMeasuredWidth();
	//  166  327:aload_0         
	//  167  328:getfield        #98  <Field LinearLayout k>
	//  168  331:invokevirtual   #406 <Method int LinearLayout.getMeasuredWidth()>
	//  169  334:istore          10
					if(l3 <= i1)
	//* 170  336:iload           10
	//* 171  338:iload_1         
	//* 172  339:icmpgt          348
						l1 = 1;
	//  173  342:iconst_1        
	//  174  343:istore          4
					else
	//* 175  345:goto            351
						l1 = 0;
	//  176  348:iconst_0        
	//  177  349:istore          4
					j1 = i1;
	//  178  351:iload_1         
	//  179  352:istore_2        
					if(l1 != 0)
	//* 180  353:iload           4
	//* 181  355:ifeq            363
						j1 = i1 - l3;
	//  182  358:iload_1         
	//  183  359:iload           10
	//  184  361:isub            
	//  185  362:istore_2        
					LinearLayout linearlayout = k;
	//  186  363:aload_0         
	//  187  364:getfield        #98  <Field LinearLayout k>
	//  188  367:astore          11
					if(l1 != 0)
	//* 189  369:iload           4
	//* 190  371:ifeq            379
						i1 = 0;
	//  191  374:iconst_0        
	//  192  375:istore_1        
					else
	//* 193  376:goto            382
						i1 = 8;
	//  194  379:bipush          8
	//  195  381:istore_1        
					linearlayout.setVisibility(i1);
	//  196  382:aload           11
	//  197  384:iload_1         
	//  198  385:invokevirtual   #165 <Method void LinearLayout.setVisibility(int)>
				} else
	//* 199  388:goto            404
				{
					j1 = a(((View) (k)), i1, l1, 0);
	//  200  391:aload_0         
	//  201  392:aload_0         
	//  202  393:getfield        #98  <Field LinearLayout k>
	//  203  396:iload_1         
	//  204  397:iload           4
	//  205  399:iconst_0        
	//  206  400:invokevirtual   #399 <Method int a(View, int, int, int)>
	//  207  403:istore_2        
				}
		}
		if(j != null)
	//* 208  404:aload_0         
	//* 209  405:getfield        #250 <Field View j>
	//* 210  408:ifnull          526
		{
			android.view.ViewGroup.LayoutParams layoutparams = j.getLayoutParams();
	//  211  411:aload_0         
	//  212  412:getfield        #250 <Field View j>
	//  213  415:invokevirtual   #343 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  214  418:astore          11
			if(layoutparams.width != -2)
	//* 215  420:aload           11
	//* 216  422:getfield        #409 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 217  425:bipush          -2
	//* 218  427:icmpeq          437
				i1 = 0x40000000;
	//  219  430:ldc2            #364 <Int 0x40000000>
	//  220  433:istore_1        
			else
	//* 221  434:goto            441
				i1 = 0x80000000;
	//  222  437:ldc2            #393 <Int 0x80000000>
	//  223  440:istore_1        
			int i2 = j1;
	//  224  441:iload_2         
	//  225  442:istore          4
			if(layoutparams.width >= 0)
	//* 226  444:aload           11
	//* 227  446:getfield        #409 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 228  449:iflt            463
				i2 = Math.min(layoutparams.width, j1);
	//  229  452:aload           11
	//  230  454:getfield        #409 <Field int android.view.ViewGroup$LayoutParams.width>
	//  231  457:iload_2         
	//  232  458:invokestatic    #414 <Method int Math.min(int, int)>
	//  233  461:istore          4
			if(layoutparams.height != -2)
	//* 234  463:aload           11
	//* 235  465:getfield        #417 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 236  468:bipush          -2
	//* 237  470:icmpeq          479
				j1 = k2;
	//  238  473:iload           5
	//  239  475:istore_2        
			else
	//* 240  476:goto            483
				j1 = 0x80000000;
	//  241  479:ldc2            #393 <Int 0x80000000>
	//  242  482:istore_2        
			k2 = i3;
	//  243  483:iload           7
	//  244  485:istore          5
			if(layoutparams.height >= 0)
	//* 245  487:aload           11
	//* 246  489:getfield        #417 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 247  492:iflt            507
				k2 = Math.min(layoutparams.height, i3);
	//  248  495:aload           11
	//  249  497:getfield        #417 <Field int android.view.ViewGroup$LayoutParams.height>
	//  250  500:iload           7
	//  251  502:invokestatic    #414 <Method int Math.min(int, int)>
	//  252  505:istore          5
			j.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2, i1), android.view.View.MeasureSpec.makeMeasureSpec(k2, j1));
	//  253  507:aload_0         
	//  254  508:getfield        #250 <Field View j>
	//  255  511:iload           4
	//  256  513:iload_1         
	//  257  514:invokestatic    #396 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  258  517:iload           5
	//  259  519:iload_2         
	//  260  520:invokestatic    #396 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  261  523:invokevirtual   #418 <Method void View.measure(int, int)>
		}
		if(e <= 0)
	//* 262  526:aload_0         
	//* 263  527:getfield        #83  <Field int e>
	//* 264  530:ifgt            591
		{
			int l2 = getChildCount();
	//  265  533:aload_0         
	//  266  534:invokevirtual   #119 <Method int getChildCount()>
	//  267  537:istore          5
			j1 = 0;
	//  268  539:iconst_0        
	//  269  540:istore_2        
			for(i1 = ((int) (flag)); i1 < l2;)
	//* 270  541:iload           6
	//* 271  543:istore_1        
	//* 272  544:iload_1         
	//* 273  545:iload           5
	//* 274  547:icmpge          583
			{
				int j2 = getChildAt(i1).getMeasuredHeight() + k3;
	//  275  550:aload_0         
	//  276  551:iload_1         
	//  277  552:invokevirtual   #123 <Method View getChildAt(int)>
	//  278  555:invokevirtual   #421 <Method int View.getMeasuredHeight()>
	//  279  558:iload           9
	//  280  560:iadd            
	//  281  561:istore          4
				k1 = j1;
	//  282  563:iload_2         
	//  283  564:istore_3        
				if(j2 > j1)
	//* 284  565:iload           4
	//* 285  567:iload_2         
	//* 286  568:icmple          574
					k1 = j2;
	//  287  571:iload           4
	//  288  573:istore_3        
				i1++;
	//  289  574:iload_1         
	//  290  575:iconst_1        
	//  291  576:iadd            
	//  292  577:istore_1        
				j1 = k1;
	//  293  578:iload_3         
	//  294  579:istore_2        
			}

	//* 295  580:goto            544
			setMeasuredDimension(j3, j1);
	//  296  583:aload_0         
	//  297  584:iload           8
	//  298  586:iload_2         
	//  299  587:invokevirtual   #424 <Method void setMeasuredDimension(int, int)>
			return;
	//  300  590:return          
		} else
		{
			setMeasuredDimension(j3, k1);
	//  301  591:aload_0         
	//  302  592:iload           8
	//  303  594:iload_3         
	//  304  595:invokevirtual   #424 <Method void setMeasuredDimension(int, int)>
			return;
	//  305  598:return          
		}
	}

	public volatile boolean onTouchEvent(MotionEvent motionevent)
	{
		return super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #427 <Method boolean a.onTouchEvent(MotionEvent)>
	//    3    5:ireturn         
	}

	public void setContentHeight(int i1)
	{
		e = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #83  <Field int e>
	//    3    5:return          
	}

	public void setCustomView(View view)
	{
		if(j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #250 <Field View j>
	//*   2    4:ifnull          15
			removeView(j);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #250 <Field View j>
	//    6   12:invokevirtual   #432 <Method void removeView(View)>
		j = view;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #250 <Field View j>
		if(view != null && k != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          44
	//*  12   24:aload_0         
	//*  13   25:getfield        #98  <Field LinearLayout k>
	//*  14   28:ifnull          44
		{
			removeView(((View) (k)));
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #98  <Field LinearLayout k>
	//   18   36:invokevirtual   #432 <Method void removeView(View)>
			k = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #98  <Field LinearLayout k>
		}
		if(view != null)
	//*  22   44:aload_1         
	//*  23   45:ifnull          53
			addView(view);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #173 <Method void addView(View)>
		requestLayout();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #435 <Method void requestLayout()>
	//   29   57:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		h = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #154 <Field CharSequence h>
		e();
	//    3    5:aload_0         
	//    4    6:invokespecial   #438 <Method void e()>
	//    5    9:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		g = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field CharSequence g>
		e();
	//    3    5:aload_0         
	//    4    6:invokespecial   #438 <Method void e()>
	//    5    9:return          
	}

	public void setTitleOptional(boolean flag)
	{
		if(flag != p)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #252 <Field boolean p>
	//*   3    5:icmpeq          12
			requestLayout();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #435 <Method void requestLayout()>
		p = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #252 <Field boolean p>
	//    9   17:return          
	}

	public volatile void setVisibility(int i1)
	{
		super.setVisibility(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #441 <Method void a.setVisibility(int)>
	//    3    5:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private CharSequence g;
	private CharSequence h;
	private View i;
	private View j;
	private LinearLayout k;
	private TextView l;
	private TextView m;
	private int n;
	private int o;
	private boolean p;
	private int q;
}
