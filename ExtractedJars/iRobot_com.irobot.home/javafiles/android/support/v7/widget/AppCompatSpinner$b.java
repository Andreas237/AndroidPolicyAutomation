// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.*;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow, AppCompatSpinner, bd

private class AppCompatSpinner$b extends ListPopupWindow
{

	static void a(AppCompatSpinner$b appcompatspinner$b)
	{
		((ListPopupWindow) (appcompatspinner$b)).super.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void ListPopupWindow.d()>
	//    2    4:return          
	}

	public CharSequence a()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field CharSequence h>
	//    2    4:areturn         
	}

	public void a(ListAdapter listadapter)
	{
		super.a(listadapter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void ListPopupWindow.a(ListAdapter)>
		a = listadapter;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #62  <Field ListAdapter a>
	//    6   10:return          
	}

	public void a(CharSequence charsequence)
	{
		h = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field CharSequence h>
	//    3    5:return          
	}

	boolean a(View view)
	{
		return s.A(view) && view.getGlobalVisibleRect(i);
	//    0    0:aload_1         
	//    1    1:invokestatic    #69  <Method boolean s.A(View)>
	//    2    4:ifeq            20
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field Rect i>
	//    6   12:invokevirtual   #75  <Method boolean View.getGlobalVisibleRect(Rect)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	void b()
	{
		Drawable drawable = h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method Drawable h()>
	//    2    4:astore          8
		int l = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		if(drawable != null)
	//*   5    8:aload           8
	//*   6   10:ifnull          67
		{
			drawable.getPadding(AppCompatSpinner.b(b));
	//    7   13:aload           8
	//    8   15:aload_0         
	//    9   16:getfield        #24  <Field AppCompatSpinner b>
	//   10   19:invokestatic    #81  <Method Rect AppCompatSpinner.b(AppCompatSpinner)>
	//   11   22:invokevirtual   #86  <Method boolean Drawable.getPadding(Rect)>
	//   12   25:pop             
			int j;
			if(bd.a(((View) (b))))
	//*  13   26:aload_0         
	//*  14   27:getfield        #24  <Field AppCompatSpinner b>
	//*  15   30:invokestatic    #90  <Method boolean bd.a(View)>
	//*  16   33:ifeq            52
				j = AppCompatSpinner.b(b).right;
	//   17   36:aload_0         
	//   18   37:getfield        #24  <Field AppCompatSpinner b>
	//   19   40:invokestatic    #81  <Method Rect AppCompatSpinner.b(AppCompatSpinner)>
	//   20   43:getfield        #94  <Field int Rect.right>
	//   21   46:istore_1        
			else
	//*  22   47:iload_1         
	//*  23   48:istore_2        
	//*  24   49:goto            93
				j = -AppCompatSpinner.b(b).left;
	//   25   52:aload_0         
	//   26   53:getfield        #24  <Field AppCompatSpinner b>
	//   27   56:invokestatic    #81  <Method Rect AppCompatSpinner.b(AppCompatSpinner)>
	//   28   59:getfield        #97  <Field int Rect.left>
	//   29   62:ineg            
	//   30   63:istore_1        
			l = j;
		} else
	//*  31   64:goto            47
		{
			Rect rect = AppCompatSpinner.b(b);
	//   32   67:aload_0         
	//   33   68:getfield        #24  <Field AppCompatSpinner b>
	//   34   71:invokestatic    #81  <Method Rect AppCompatSpinner.b(AppCompatSpinner)>
	//   35   74:astore          8
			AppCompatSpinner.b(b).right = 0;
	//   36   76:aload_0         
	//   37   77:getfield        #24  <Field AppCompatSpinner b>
	//   38   80:invokestatic    #81  <Method Rect AppCompatSpinner.b(AppCompatSpinner)>
	//   39   83:iconst_0        
	//   40   84:putfield        #94  <Field int Rect.right>
			rect.left = 0;
	//   41   87:aload           8
	//   42   89:iconst_0        
	//   43   90:putfield        #97  <Field int Rect.left>
		}
		int k1 = b.getPaddingLeft();
	//   44   93:aload_0         
	//   45   94:getfield        #24  <Field AppCompatSpinner b>
	//   46   97:invokevirtual   #101 <Method int AppCompatSpinner.getPaddingLeft()>
	//   47  100:istore          5
		int l1 = b.getPaddingRight();
	//   48  102:aload_0         
	//   49  103:getfield        #24  <Field AppCompatSpinner b>
	//   50  106:invokevirtual   #104 <Method int AppCompatSpinner.getPaddingRight()>
	//   51  109:istore          6
		int i2 = b.getWidth();
	//   52  111:aload_0         
	//   53  112:getfield        #24  <Field AppCompatSpinner b>
	//   54  115:invokevirtual   #107 <Method int AppCompatSpinner.getWidth()>
	//   55  118:istore          7
		int k;
		if(AppCompatSpinner.c(b) == -2)
	//*  56  120:aload_0         
	//*  57  121:getfield        #24  <Field AppCompatSpinner b>
	//*  58  124:invokestatic    #111 <Method int AppCompatSpinner.c(AppCompatSpinner)>
	//*  59  127:bipush          -2
	//*  60  129:icmpne          223
		{
			int i1 = b.a((SpinnerAdapter)a, h());
	//   61  132:aload_0         
	//   62  133:getfield        #24  <Field AppCompatSpinner b>
	//   63  136:aload_0         
	//   64  137:getfield        #62  <Field ListAdapter a>
	//   65  140:checkcast       #113 <Class SpinnerAdapter>
	//   66  143:aload_0         
	//   67  144:invokevirtual   #78  <Method Drawable h()>
	//   68  147:invokevirtual   #116 <Method int AppCompatSpinner.a(SpinnerAdapter, Drawable)>
	//   69  150:istore_3        
			int j1 = b.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.b(b).left - AppCompatSpinner.b(b).right;
	//   70  151:aload_0         
	//   71  152:getfield        #24  <Field AppCompatSpinner b>
	//   72  155:invokevirtual   #120 <Method Context AppCompatSpinner.getContext()>
	//   73  158:invokevirtual   #126 <Method Resources Context.getResources()>
	//   74  161:invokevirtual   #132 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   75  164:getfield        #137 <Field int DisplayMetrics.widthPixels>
	//   76  167:aload_0         
	//   77  168:getfield        #24  <Field AppCompatSpinner b>
	//   78  171:invokestatic    #81  <Method Rect AppCompatSpinner.b(AppCompatSpinner)>
	//   79  174:getfield        #97  <Field int Rect.left>
	//   80  177:isub            
	//   81  178:aload_0         
	//   82  179:getfield        #24  <Field AppCompatSpinner b>
	//   83  182:invokestatic    #81  <Method Rect AppCompatSpinner.b(AppCompatSpinner)>
	//   84  185:getfield        #94  <Field int Rect.right>
	//   85  188:isub            
	//   86  189:istore          4
			k = i1;
	//   87  191:iload_3         
	//   88  192:istore_1        
			if(i1 > j1)
	//*  89  193:iload_3         
	//*  90  194:iload           4
	//*  91  196:icmple          202
				k = j1;
	//   92  199:iload           4
	//   93  201:istore_1        
			k = Math.max(k, i2 - k1 - l1);
	//   94  202:iload_1         
	//   95  203:iload           7
	//   96  205:iload           5
	//   97  207:isub            
	//   98  208:iload           6
	//   99  210:isub            
	//  100  211:invokestatic    #143 <Method int Math.max(int, int)>
	//  101  214:istore_1        
		} else
	//* 102  215:aload_0         
	//* 103  216:iload_1         
	//* 104  217:invokevirtual   #146 <Method void g(int)>
	//* 105  220:goto            257
		if(AppCompatSpinner.c(b) == -1)
	//* 106  223:aload_0         
	//* 107  224:getfield        #24  <Field AppCompatSpinner b>
	//* 108  227:invokestatic    #111 <Method int AppCompatSpinner.c(AppCompatSpinner)>
	//* 109  230:iconst_m1       
	//* 110  231:icmpne          246
			k = i2 - k1 - l1;
	//  111  234:iload           7
	//  112  236:iload           5
	//  113  238:isub            
	//  114  239:iload           6
	//  115  241:isub            
	//  116  242:istore_1        
		else
	//* 117  243:goto            215
			k = AppCompatSpinner.c(b);
	//  118  246:aload_0         
	//  119  247:getfield        #24  <Field AppCompatSpinner b>
	//  120  250:invokestatic    #111 <Method int AppCompatSpinner.c(AppCompatSpinner)>
	//  121  253:istore_1        
		g(k);
	//* 122  254:goto            215
		if(bd.a(((View) (b))))
	//* 123  257:aload_0         
	//* 124  258:getfield        #24  <Field AppCompatSpinner b>
	//* 125  261:invokestatic    #90  <Method boolean bd.a(View)>
	//* 126  264:ifeq            283
			k = l + (i2 - l1 - l());
	//  127  267:iload_2         
	//  128  268:iload           7
	//  129  270:iload           6
	//  130  272:isub            
	//  131  273:aload_0         
	//  132  274:invokevirtual   #149 <Method int l()>
	//  133  277:isub            
	//  134  278:iadd            
	//  135  279:istore_1        
		else
	//* 136  280:goto            288
			k = l + k1;
	//  137  283:iload_2         
	//  138  284:iload           5
	//  139  286:iadd            
	//  140  287:istore_1        
		c(k);
	//  141  288:aload_0         
	//  142  289:iload_1         
	//  143  290:invokevirtual   #151 <Method void c(int)>
	//  144  293:return          
	}

	public void d()
	{
		boolean flag = f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #155 <Method boolean f()>
	//    2    4:istore_1        
		b();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #157 <Method void b()>
		h(2);
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:invokevirtual   #159 <Method void h(int)>
		super.d();
	//    8   14:aload_0         
	//    9   15:invokespecial   #54  <Method void ListPopupWindow.d()>
		g().setChoiceMode(1);
	//   10   18:aload_0         
	//   11   19:invokevirtual   #162 <Method ListView g()>
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #167 <Method void ListView.setChoiceMode(int)>
		i(b.getSelectedItemPosition());
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #24  <Field AppCompatSpinner b>
	//   17   31:invokevirtual   #170 <Method int AppCompatSpinner.getSelectedItemPosition()>
	//   18   34:invokevirtual   #172 <Method void i(int)>
		if(flag)
	//*  19   37:iload_1         
	//*  20   38:ifeq            42
			return;
	//   21   41:return          
		ViewTreeObserver viewtreeobserver = b.getViewTreeObserver();
	//   22   42:aload_0         
	//   23   43:getfield        #24  <Field AppCompatSpinner b>
	//   24   46:invokevirtual   #176 <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
	//   25   49:astore_2        
		if(viewtreeobserver != null)
	//*  26   50:aload_2         
	//*  27   51:ifnull          81
		{
			android.view.GlobalLayoutListener globallayoutlistener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

				public void onGlobalLayout()
				{
					if(!a.a(((View) (a.b))))
				//*   0    0:aload_0         
				//*   1    1:getfield        #20  <Field AppCompatSpinner$b a>
				//*   2    4:aload_0         
				//*   3    5:getfield        #20  <Field AppCompatSpinner$b a>
				//*   4    8:getfield        #27  <Field AppCompatSpinner AppCompatSpinner$b.b>
				//*   5   11:invokevirtual   #30  <Method boolean AppCompatSpinner$b.a(View)>
				//*   6   14:ifne            25
					{
						a.e();
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field AppCompatSpinner$b a>
				//    9   21:invokevirtual   #33  <Method void AppCompatSpinner$b.e()>
						return;
				//   10   24:return          
					} else
					{
						a.b();
				//   11   25:aload_0         
				//   12   26:getfield        #20  <Field AppCompatSpinner$b a>
				//   13   29:invokevirtual   #35  <Method void AppCompatSpinner$b.b()>
						AppCompatSpinner.b.a(a);
				//   14   32:aload_0         
				//   15   33:getfield        #20  <Field AppCompatSpinner$b a>
				//   16   36:invokestatic    #37  <Method void AppCompatSpinner$b.a(AppCompatSpinner$b)>
						return;
				//   17   39:return          
					}
				}

				final AppCompatSpinner.b a;

			
			{
				a = AppCompatSpinner.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AppCompatSpinner$b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   28   54:new             #11  <Class AppCompatSpinner$b$2>
	//   29   57:dup             
	//   30   58:aload_0         
	//   31   59:invokespecial   #178 <Method void AppCompatSpinner$b$2(AppCompatSpinner$b)>
	//   32   62:astore_3        
			viewtreeobserver.addOnGlobalLayoutListener(globallayoutlistener);
	//   33   63:aload_2         
	//   34   64:aload_3         
	//   35   65:invokevirtual   #184 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			a(new android.widget.PopupWindow.OnDismissListener(globallayoutlistener) {

				public void onDismiss()
				{
					ViewTreeObserver viewtreeobserver1 = b.b.getViewTreeObserver();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field AppCompatSpinner$b b>
				//    2    4:getfield        #30  <Field AppCompatSpinner AppCompatSpinner$b.b>
				//    3    7:invokevirtual   #34  <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
				//    4   10:astore_1        
					if(viewtreeobserver1 != null)
				//*   5   11:aload_1         
				//*   6   12:ifnull          23
						viewtreeobserver1.removeGlobalOnLayoutListener(a);
				//    7   15:aload_1         
				//    8   16:aload_0         
				//    9   17:getfield        #23  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener a>
				//   10   20:invokevirtual   #40  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				//   11   23:return          
				}

				final android.view.ViewTreeObserver.OnGlobalLayoutListener a;
				final AppCompatSpinner.b b;

			
			{
				b = AppCompatSpinner.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AppCompatSpinner$b b>
				a = ongloballayoutlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   36   68:aload_0         
	//   37   69:new             #13  <Class AppCompatSpinner$b$3>
	//   38   72:dup             
	//   39   73:aload_0         
	//   40   74:aload_3         
	//   41   75:invokespecial   #187 <Method void AppCompatSpinner$b$3(AppCompatSpinner$b, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   42   78:invokevirtual   #190 <Method void a(android.widget.PopupWindow$OnDismissListener)>
		}
	//   43   81:return          
	}

	ListAdapter a;
	final AppCompatSpinner b;
	private CharSequence h;
	private final Rect i = new Rect();

	public AppCompatSpinner$b(AppCompatSpinner appcompatspinner, Context context, AttributeSet attributeset, int j)
	{
		b = appcompatspinner;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field AppCompatSpinner b>
		super(context, attributeset, j);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #27  <Method void ListPopupWindow(Context, AttributeSet, int)>
	//    8   13:aload_0         
	//    9   14:new             #29  <Class Rect>
	//   10   17:dup             
	//   11   18:invokespecial   #32  <Method void Rect()>
	//   12   21:putfield        #34  <Field Rect i>
		b(((View) (appcompatspinner)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #37  <Method void b(View)>
		a(true);
	//   16   29:aload_0         
	//   17   30:iconst_1        
	//   18   31:invokevirtual   #40  <Method void a(boolean)>
		a(0);
	//   19   34:aload_0         
	//   20   35:iconst_0        
	//   21   36:invokevirtual   #43  <Method void a(int)>
		a(new android.widget.AdapterView.OnItemClickListener(appcompatspinner) {

			public void onItemClick(AdapterView adapterview, View view, int k, long l)
			{
				b.b.setSelection(k);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field AppCompatSpinner$b b>
			//    2    4:getfield        #30  <Field AppCompatSpinner AppCompatSpinner$b.b>
			//    3    7:iload_3         
			//    4    8:invokevirtual   #34  <Method void AppCompatSpinner.setSelection(int)>
				if(b.b.getOnItemClickListener() != null)
			//*   5   11:aload_0         
			//*   6   12:getfield        #20  <Field AppCompatSpinner$b b>
			//*   7   15:getfield        #30  <Field AppCompatSpinner AppCompatSpinner$b.b>
			//*   8   18:invokevirtual   #38  <Method android.widget.AdapterView$OnItemClickListener AppCompatSpinner.getOnItemClickListener()>
			//*   9   21:ifnull          50
					b.b.performItemClick(view, k, b.a.getItemId(k));
			//   10   24:aload_0         
			//   11   25:getfield        #20  <Field AppCompatSpinner$b b>
			//   12   28:getfield        #30  <Field AppCompatSpinner AppCompatSpinner$b.b>
			//   13   31:aload_2         
			//   14   32:iload_3         
			//   15   33:aload_0         
			//   16   34:getfield        #20  <Field AppCompatSpinner$b b>
			//   17   37:getfield        #41  <Field ListAdapter AppCompatSpinner$b.a>
			//   18   40:iload_3         
			//   19   41:invokeinterface #47  <Method long ListAdapter.getItemId(int)>
			//   20   46:invokevirtual   #51  <Method boolean AppCompatSpinner.performItemClick(View, int, long)>
			//   21   49:pop             
				b.e();
			//   22   50:aload_0         
			//   23   51:getfield        #20  <Field AppCompatSpinner$b b>
			//   24   54:invokevirtual   #54  <Method void AppCompatSpinner$b.e()>
			//   25   57:return          
			}

			final AppCompatSpinner a;
			final AppCompatSpinner.b b;

			
			{
				b = AppCompatSpinner.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AppCompatSpinner$b b>
				a = appcompatspinner;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field AppCompatSpinner a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   22   39:aload_0         
	//   23   40:new             #9   <Class AppCompatSpinner$b$1>
	//   24   43:dup             
	//   25   44:aload_0         
	//   26   45:aload_1         
	//   27   46:invokespecial   #46  <Method void AppCompatSpinner$b$1(AppCompatSpinner$b, AppCompatSpinner)>
	//   28   49:invokevirtual   #49  <Method void a(android.widget.AdapterView$OnItemClickListener)>
	//   29   52:return          
	}
}
