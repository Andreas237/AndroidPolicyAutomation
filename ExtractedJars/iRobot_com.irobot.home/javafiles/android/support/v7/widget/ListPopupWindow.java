// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.widget.k;
import android.support.v7.view.menu.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//			AppCompatPopupWindow, z

public class ListPopupWindow
	implements s
{
	private class a
		implements Runnable
	{

		public void run()
		{
			a.m();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ListPopupWindow a>
		//    2    4:invokevirtual   #22  <Method void ListPopupWindow.m()>
		//    3    7:return          
		}

		final ListPopupWindow a;

		a()
		{
			a = ListPopupWindow.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field ListPopupWindow a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}
	}

	private class b extends DataSetObserver
	{

		public void onChanged()
		{
			if(a.f())
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field ListPopupWindow a>
		//*   2    4:invokevirtual   #22  <Method boolean ListPopupWindow.f()>
		//*   3    7:ifeq            17
				a.d();
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field ListPopupWindow a>
		//    6   14:invokevirtual   #25  <Method void ListPopupWindow.d()>
		//    7   17:return          
		}

		public void onInvalidated()
		{
			a.e();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ListPopupWindow a>
		//    2    4:invokevirtual   #29  <Method void ListPopupWindow.e()>
		//    3    7:return          
		}

		final ListPopupWindow a;

		b()
		{
			a = ListPopupWindow.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ListPopupWindow a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}

	private class c
		implements android.widget.AbsListView.OnScrollListener
	{

		public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
		{
		//    0    0:return          
		}

		public void onScrollStateChanged(AbsListView abslistview, int i1)
		{
			if(i1 == 1 && !a.n() && a.g.getContentView() != null)
		//*   0    0:iload_2         
		//*   1    1:iconst_1        
		//*   2    2:icmpne          55
		//*   3    5:aload_0         
		//*   4    6:getfield        #15  <Field ListPopupWindow a>
		//*   5    9:invokevirtual   #27  <Method boolean ListPopupWindow.n()>
		//*   6   12:ifne            55
		//*   7   15:aload_0         
		//*   8   16:getfield        #15  <Field ListPopupWindow a>
		//*   9   19:getfield        #31  <Field PopupWindow ListPopupWindow.g>
		//*  10   22:invokevirtual   #37  <Method View PopupWindow.getContentView()>
		//*  11   25:ifnull          55
			{
				a.f.removeCallbacks(((Runnable) (a.e)));
		//   12   28:aload_0         
		//   13   29:getfield        #15  <Field ListPopupWindow a>
		//   14   32:getfield        #41  <Field Handler ListPopupWindow.f>
		//   15   35:aload_0         
		//   16   36:getfield        #15  <Field ListPopupWindow a>
		//   17   39:getfield        #45  <Field ListPopupWindow$e ListPopupWindow.e>
		//   18   42:invokevirtual   #51  <Method void Handler.removeCallbacks(Runnable)>
				a.e.run();
		//   19   45:aload_0         
		//   20   46:getfield        #15  <Field ListPopupWindow a>
		//   21   49:getfield        #45  <Field ListPopupWindow$e ListPopupWindow.e>
		//   22   52:invokevirtual   #56  <Method void ListPopupWindow$e.run()>
			}
		//   23   55:return          
		}

		final ListPopupWindow a;

		c()
		{
			a = ListPopupWindow.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ListPopupWindow a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private class d
		implements android.view.View.OnTouchListener
	{

		public boolean onTouch(View view, MotionEvent motionevent)
		{
			int i1 = motionevent.getAction();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #27  <Method int MotionEvent.getAction()>
		//    2    4:istore_3        
			int j1 = (int)motionevent.getX();
		//    3    5:aload_2         
		//    4    6:invokevirtual   #31  <Method float MotionEvent.getX()>
		//    5    9:f2i             
		//    6   10:istore          4
			int k1 = (int)motionevent.getY();
		//    7   12:aload_2         
		//    8   13:invokevirtual   #34  <Method float MotionEvent.getY()>
		//    9   16:f2i             
		//   10   17:istore          5
			if(i1 == 0 && a.g != null && a.g.isShowing() && j1 >= 0 && j1 < a.g.getWidth() && k1 >= 0 && k1 < a.g.getHeight())
		//*  11   19:iload_3         
		//*  12   20:ifne            110
		//*  13   23:aload_0         
		//*  14   24:getfield        #15  <Field ListPopupWindow a>
		//*  15   27:getfield        #38  <Field PopupWindow ListPopupWindow.g>
		//*  16   30:ifnull          110
		//*  17   33:aload_0         
		//*  18   34:getfield        #15  <Field ListPopupWindow a>
		//*  19   37:getfield        #38  <Field PopupWindow ListPopupWindow.g>
		//*  20   40:invokevirtual   #44  <Method boolean PopupWindow.isShowing()>
		//*  21   43:ifeq            110
		//*  22   46:iload           4
		//*  23   48:iflt            110
		//*  24   51:iload           4
		//*  25   53:aload_0         
		//*  26   54:getfield        #15  <Field ListPopupWindow a>
		//*  27   57:getfield        #38  <Field PopupWindow ListPopupWindow.g>
		//*  28   60:invokevirtual   #47  <Method int PopupWindow.getWidth()>
		//*  29   63:icmpge          110
		//*  30   66:iload           5
		//*  31   68:iflt            110
		//*  32   71:iload           5
		//*  33   73:aload_0         
		//*  34   74:getfield        #15  <Field ListPopupWindow a>
		//*  35   77:getfield        #38  <Field PopupWindow ListPopupWindow.g>
		//*  36   80:invokevirtual   #50  <Method int PopupWindow.getHeight()>
		//*  37   83:icmpge          110
				a.f.postDelayed(((Runnable) (a.e)), 250L);
		//   38   86:aload_0         
		//   39   87:getfield        #15  <Field ListPopupWindow a>
		//   40   90:getfield        #54  <Field Handler ListPopupWindow.f>
		//   41   93:aload_0         
		//   42   94:getfield        #15  <Field ListPopupWindow a>
		//   43   97:getfield        #58  <Field ListPopupWindow$e ListPopupWindow.e>
		//   44  100:ldc2w           #59  <Long 250L>
		//   45  103:invokevirtual   #66  <Method boolean Handler.postDelayed(Runnable, long)>
		//   46  106:pop             
			else
		//*  47  107:goto            132
			if(i1 == 1)
		//*  48  110:iload_3         
		//*  49  111:iconst_1        
		//*  50  112:icmpne          132
				a.f.removeCallbacks(((Runnable) (a.e)));
		//   51  115:aload_0         
		//   52  116:getfield        #15  <Field ListPopupWindow a>
		//   53  119:getfield        #54  <Field Handler ListPopupWindow.f>
		//   54  122:aload_0         
		//   55  123:getfield        #15  <Field ListPopupWindow a>
		//   56  126:getfield        #58  <Field ListPopupWindow$e ListPopupWindow.e>
		//   57  129:invokevirtual   #70  <Method void Handler.removeCallbacks(Runnable)>
			return false;
		//   58  132:iconst_0        
		//   59  133:ireturn         
		}

		final ListPopupWindow a;

		d()
		{
			a = ListPopupWindow.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ListPopupWindow a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private class e
		implements Runnable
	{

		public void run()
		{
			if(a.c != null && android.support.v4.view.s.A(((View) (a.c))) && a.c.getCount() > a.c.getChildCount() && a.c.getChildCount() <= a.d)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field ListPopupWindow a>
		//*   2    4:getfield        #24  <Field z ListPopupWindow.c>
		//*   3    7:ifnull          84
		//*   4   10:aload_0         
		//*   5   11:getfield        #15  <Field ListPopupWindow a>
		//*   6   14:getfield        #24  <Field z ListPopupWindow.c>
		//*   7   17:invokestatic    #30  <Method boolean android.support.v4.view.s.A(View)>
		//*   8   20:ifeq            84
		//*   9   23:aload_0         
		//*  10   24:getfield        #15  <Field ListPopupWindow a>
		//*  11   27:getfield        #24  <Field z ListPopupWindow.c>
		//*  12   30:invokevirtual   #36  <Method int z.getCount()>
		//*  13   33:aload_0         
		//*  14   34:getfield        #15  <Field ListPopupWindow a>
		//*  15   37:getfield        #24  <Field z ListPopupWindow.c>
		//*  16   40:invokevirtual   #39  <Method int z.getChildCount()>
		//*  17   43:icmple          84
		//*  18   46:aload_0         
		//*  19   47:getfield        #15  <Field ListPopupWindow a>
		//*  20   50:getfield        #24  <Field z ListPopupWindow.c>
		//*  21   53:invokevirtual   #39  <Method int z.getChildCount()>
		//*  22   56:aload_0         
		//*  23   57:getfield        #15  <Field ListPopupWindow a>
		//*  24   60:getfield        #43  <Field int ListPopupWindow.d>
		//*  25   63:icmpgt          84
			{
				a.g.setInputMethodMode(2);
		//   26   66:aload_0         
		//   27   67:getfield        #15  <Field ListPopupWindow a>
		//   28   70:getfield        #47  <Field PopupWindow ListPopupWindow.g>
		//   29   73:iconst_2        
		//   30   74:invokevirtual   #53  <Method void PopupWindow.setInputMethodMode(int)>
				a.d();
		//   31   77:aload_0         
		//   32   78:getfield        #15  <Field ListPopupWindow a>
		//   33   81:invokevirtual   #55  <Method void ListPopupWindow.d()>
			}
		//   34   84:return          
		}

		final ListPopupWindow a;

		e()
		{
			a = ListPopupWindow.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ListPopupWindow a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public ListPopupWindow(Context context)
	{
		this(context, ((AttributeSet) (null)), android.support.v7.a.a.a.listPopupWindowStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:getstatic       #132 <Field int android.support.v7.a.a$a.listPopupWindowStyle>
	//    4    6:invokespecial   #135 <Method void ListPopupWindow(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ListPopupWindow(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.listPopupWindowStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #132 <Field int android.support.v7.a.a$a.listPopupWindowStyle>
	//    4    6:invokespecial   #135 <Method void ListPopupWindow(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ListPopupWindow(Context context, AttributeSet attributeset, int i1)
	{
		this(context, attributeset, i1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #139 <Method void ListPopupWindow(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public ListPopupWindow(Context context, AttributeSet attributeset, int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method void Object()>
		k = -2;
	//    2    4:aload_0         
	//    3    5:bipush          -2
	//    4    7:putfield        #143 <Field int k>
		l = -2;
	//    5   10:aload_0         
	//    6   11:bipush          -2
	//    7   13:putfield        #145 <Field int l>
		o = 1002;
	//    8   16:aload_0         
	//    9   17:sipush          1002
	//   10   20:putfield        #147 <Field int o>
		q = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #149 <Field boolean q>
		t = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #151 <Field int t>
		u = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #153 <Field boolean u>
		v = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #155 <Field boolean v>
		d = 0x7fffffff;
	//   23   43:aload_0         
	//   24   44:ldc1            #156 <Int 0x7fffffff>
	//   25   46:putfield        #158 <Field int d>
		x = 0;
	//   26   49:aload_0         
	//   27   50:iconst_0        
	//   28   51:putfield        #160 <Field int x>
		e = new e();
	//   29   54:aload_0         
	//   30   55:new             #24  <Class ListPopupWindow$e>
	//   31   58:dup             
	//   32   59:aload_0         
	//   33   60:invokespecial   #163 <Method void ListPopupWindow$e(ListPopupWindow)>
	//   34   63:putfield        #165 <Field ListPopupWindow$e e>
		D = new d();
	//   35   66:aload_0         
	//   36   67:new             #21  <Class ListPopupWindow$d>
	//   37   70:dup             
	//   38   71:aload_0         
	//   39   72:invokespecial   #166 <Method void ListPopupWindow$d(ListPopupWindow)>
	//   40   75:putfield        #168 <Field ListPopupWindow$d D>
		E = new c();
	//   41   78:aload_0         
	//   42   79:new             #18  <Class ListPopupWindow$c>
	//   43   82:dup             
	//   44   83:aload_0         
	//   45   84:invokespecial   #169 <Method void ListPopupWindow$c(ListPopupWindow)>
	//   46   87:putfield        #171 <Field ListPopupWindow$c E>
		F = new a();
	//   47   90:aload_0         
	//   48   91:new             #12  <Class ListPopupWindow$a>
	//   49   94:dup             
	//   50   95:aload_0         
	//   51   96:invokespecial   #172 <Method void ListPopupWindow$a(ListPopupWindow)>
	//   52   99:putfield        #174 <Field ListPopupWindow$a F>
		H = new Rect();
	//   53  102:aload_0         
	//   54  103:new             #120 <Class Rect>
	//   55  106:dup             
	//   56  107:invokespecial   #175 <Method void Rect()>
	//   57  110:putfield        #177 <Field Rect H>
		i = context;
	//   58  113:aload_0         
	//   59  114:aload_1         
	//   60  115:putfield        #179 <Field Context i>
		f = new Handler(context.getMainLooper());
	//   61  118:aload_0         
	//   62  119:new             #181 <Class Handler>
	//   63  122:dup             
	//   64  123:aload_1         
	//   65  124:invokevirtual   #187 <Method android.os.Looper Context.getMainLooper()>
	//   66  127:invokespecial   #190 <Method void Handler(android.os.Looper)>
	//   67  130:putfield        #192 <Field Handler f>
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.ListPopupWindow, i1, j1);
	//   68  133:aload_1         
	//   69  134:aload_2         
	//   70  135:getstatic       #197 <Field int[] android.support.v7.a.a$j.ListPopupWindow>
	//   71  138:iload_3         
	//   72  139:iload           4
	//   73  141:invokevirtual   #201 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   74  144:astore          5
		m = typedarray.getDimensionPixelOffset(android.support.v7.a.a.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
	//   75  146:aload_0         
	//   76  147:aload           5
	//   77  149:getstatic       #204 <Field int android.support.v7.a.a$j.ListPopupWindow_android_dropDownHorizontalOffset>
	//   78  152:iconst_0        
	//   79  153:invokevirtual   #210 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   80  156:putfield        #212 <Field int m>
		n = typedarray.getDimensionPixelOffset(android.support.v7.a.a.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
	//   81  159:aload_0         
	//   82  160:aload           5
	//   83  162:getstatic       #215 <Field int android.support.v7.a.a$j.ListPopupWindow_android_dropDownVerticalOffset>
	//   84  165:iconst_0        
	//   85  166:invokevirtual   #210 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   86  169:putfield        #217 <Field int n>
		if(n != 0)
	//*  87  172:aload_0         
	//*  88  173:getfield        #217 <Field int n>
	//*  89  176:ifeq            184
			p = true;
	//   90  179:aload_0         
	//   91  180:iconst_1        
	//   92  181:putfield        #219 <Field boolean p>
		typedarray.recycle();
	//   93  184:aload           5
	//   94  186:invokevirtual   #222 <Method void TypedArray.recycle()>
		g = ((PopupWindow) (new AppCompatPopupWindow(context, attributeset, i1, j1)));
	//   95  189:aload_0         
	//   96  190:new             #224 <Class AppCompatPopupWindow>
	//   97  193:dup             
	//   98  194:aload_1         
	//   99  195:aload_2         
	//  100  196:iload_3         
	//  101  197:iload           4
	//  102  199:invokespecial   #225 <Method void AppCompatPopupWindow(Context, AttributeSet, int, int)>
	//  103  202:putfield        #227 <Field PopupWindow g>
		g.setInputMethodMode(1);
	//  104  205:aload_0         
	//  105  206:getfield        #227 <Field PopupWindow g>
	//  106  209:iconst_1        
	//  107  210:invokevirtual   #231 <Method void PopupWindow.setInputMethodMode(int)>
	//  108  213:return          
	}

	private int a(View view, int i1, boolean flag)
	{
		if(b == null) goto _L2; else goto _L1
	//    0    0:getstatic       #114 <Field Method b>
	//    1    3:ifnull          57
_L1:
		int j1 = ((Integer)b.invoke(((Object) (g)), new Object[] {
			view, Integer.valueOf(i1), Boolean.valueOf(flag)
		})).intValue();
	//    2    6:getstatic       #114 <Field Method b>
	//    3    9:aload_0         
	//    4   10:getfield        #227 <Field PopupWindow g>
	//    5   13:iconst_3        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:aload_1         
	//   10   20:aastore         
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:iload_2         
	//   14   24:invokestatic    #238 <Method Integer Integer.valueOf(int)>
	//   15   27:aastore         
	//   16   28:dup             
	//   17   29:iconst_2        
	//   18   30:iload_3         
	//   19   31:invokestatic    #241 <Method Boolean Boolean.valueOf(boolean)>
	//   20   34:aastore         
	//   21   35:invokevirtual   #247 <Method Object Method.invoke(Object, Object[])>
	//   22   38:checkcast       #111 <Class Integer>
	//   23   41:invokevirtual   #251 <Method int Integer.intValue()>
	//   24   44:istore          4
		return j1;
	//   25   46:iload           4
	//   26   48:ireturn         
_L4:
		Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
	//   27   49:ldc1            #98  <String "ListPopupWindow">
	//   28   51:ldc1            #253 <String "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.">
	//   29   53:invokestatic    #105 <Method int Log.i(String, String)>
	//   30   56:pop             
_L2:
		return g.getMaxAvailableHeight(view, i1);
	//   31   57:aload_0         
	//   32   58:getfield        #227 <Field PopupWindow g>
	//   33   61:aload_1         
	//   34   62:iload_2         
	//   35   63:invokevirtual   #256 <Method int PopupWindow.getMaxAvailableHeight(View, int)>
	//   36   66:ireturn         
		Exception exception;
		exception;
	//   37   67:astore          5
		if(true) goto _L4; else goto _L3
	//   38   69:goto            49
_L3:
	}

	private void a()
	{
		if(w != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #258 <Field View w>
	//*   2    4:ifnull          33
		{
			android.view.ViewParent viewparent = w.getParent();
	//    3    7:aload_0         
	//    4    8:getfield        #258 <Field View w>
	//    5   11:invokevirtual   #262 <Method android.view.ViewParent View.getParent()>
	//    6   14:astore_1        
			if(viewparent instanceof ViewGroup)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #264 <Class ViewGroup>
	//*   9   19:ifeq            33
				((ViewGroup)viewparent).removeView(w);
	//   10   22:aload_1         
	//   11   23:checkcast       #264 <Class ViewGroup>
	//   12   26:aload_0         
	//   13   27:getfield        #258 <Field View w>
	//   14   30:invokevirtual   #268 <Method void ViewGroup.removeView(View)>
		}
	//   15   33:return          
	}

	private int b()
	{
		int i1;
		int k1;
		int j2;
		Object obj = ((Object) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field z c>
	//    2    4:astore          6
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          5
		if(obj == null)
	//*   5    9:aload           6
	//*   6   11:ifnonnull       380
		{
			obj = ((Object) (i));
	//    7   14:aload_0         
	//    8   15:getfield        #179 <Field Context i>
	//    9   18:astore          6
			G = new Runnable() {

				public void run()
				{
					View view1 = a.i();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ListPopupWindow a>
				//    2    4:invokevirtual   #26  <Method View ListPopupWindow.i()>
				//    3    7:astore_1        
					if(view1 != null && view1.getWindowToken() != null)
				//*   4    8:aload_1         
				//*   5    9:ifnull          26
				//*   6   12:aload_1         
				//*   7   13:invokevirtual   #32  <Method android.os.IBinder View.getWindowToken()>
				//*   8   16:ifnull          26
						a.d();
				//    9   19:aload_0         
				//   10   20:getfield        #17  <Field ListPopupWindow a>
				//   11   23:invokevirtual   #35  <Method void ListPopupWindow.d()>
				//   12   26:return          
				}

				final ListPopupWindow a;

			
			{
				a = ListPopupWindow.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ListPopupWindow a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   10   20:aload_0         
	//   11   21:new             #8   <Class ListPopupWindow$1>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #271 <Method void ListPopupWindow$1(ListPopupWindow)>
	//   15   29:putfield        #273 <Field Runnable G>
			c = a(((Context) (obj)), J ^ true);
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:aload           6
	//   19   36:aload_0         
	//   20   37:getfield        #275 <Field boolean J>
	//   21   40:iconst_1        
	//   22   41:ixor            
	//   23   42:invokevirtual   #278 <Method z a(Context, boolean)>
	//   24   45:putfield        #270 <Field z c>
			if(A != null)
	//*  25   48:aload_0         
	//*  26   49:getfield        #280 <Field Drawable A>
	//*  27   52:ifnull          66
				c.setSelector(A);
	//   28   55:aload_0         
	//   29   56:getfield        #270 <Field z c>
	//   30   59:aload_0         
	//   31   60:getfield        #280 <Field Drawable A>
	//   32   63:invokevirtual   #286 <Method void z.setSelector(Drawable)>
			c.setAdapter(j);
	//   33   66:aload_0         
	//   34   67:getfield        #270 <Field z c>
	//   35   70:aload_0         
	//   36   71:getfield        #288 <Field ListAdapter j>
	//   37   74:invokevirtual   #292 <Method void z.setAdapter(ListAdapter)>
			c.setOnItemClickListener(B);
	//   38   77:aload_0         
	//   39   78:getfield        #270 <Field z c>
	//   40   81:aload_0         
	//   41   82:getfield        #294 <Field android.widget.AdapterView$OnItemClickListener B>
	//   42   85:invokevirtual   #298 <Method void z.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			c.setFocusable(true);
	//   43   88:aload_0         
	//   44   89:getfield        #270 <Field z c>
	//   45   92:iconst_1        
	//   46   93:invokevirtual   #302 <Method void z.setFocusable(boolean)>
			c.setFocusableInTouchMode(true);
	//   47   96:aload_0         
	//   48   97:getfield        #270 <Field z c>
	//   49  100:iconst_1        
	//   50  101:invokevirtual   #305 <Method void z.setFocusableInTouchMode(boolean)>
			c.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

				public void onItemSelected(AdapterView adapterview, View view1, int k2, long l2)
				{
					if(k2 != -1)
				//*   0    0:iload_3         
				//*   1    1:iconst_m1       
				//*   2    2:icmpeq          22
					{
						adapterview = ((AdapterView) (a.c));
				//    3    5:aload_0         
				//    4    6:getfield        #17  <Field ListPopupWindow a>
				//    5    9:getfield        #27  <Field z ListPopupWindow.c>
				//    6   12:astore_1        
						if(adapterview != null)
				//*   7   13:aload_1         
				//*   8   14:ifnull          22
							((z) (adapterview)).setListSelectionHidden(false);
				//    9   17:aload_1         
				//   10   18:iconst_0        
				//   11   19:invokevirtual   #33  <Method void z.setListSelectionHidden(boolean)>
					}
				//   12   22:return          
				}

				public void onNothingSelected(AdapterView adapterview)
				{
				//    0    0:return          
				}

				final ListPopupWindow a;

			
			{
				a = ListPopupWindow.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ListPopupWindow a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   51  104:aload_0         
	//   52  105:getfield        #270 <Field z c>
	//   53  108:new             #10  <Class ListPopupWindow$2>
	//   54  111:dup             
	//   55  112:aload_0         
	//   56  113:invokespecial   #306 <Method void ListPopupWindow$2(ListPopupWindow)>
	//   57  116:invokevirtual   #310 <Method void z.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			c.setOnScrollListener(((android.widget.AbsListView.OnScrollListener) (E)));
	//   58  119:aload_0         
	//   59  120:getfield        #270 <Field z c>
	//   60  123:aload_0         
	//   61  124:getfield        #171 <Field ListPopupWindow$c E>
	//   62  127:invokevirtual   #314 <Method void z.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
			if(C != null)
	//*  63  130:aload_0         
	//*  64  131:getfield        #316 <Field android.widget.AdapterView$OnItemSelectedListener C>
	//*  65  134:ifnull          148
				c.setOnItemSelectedListener(C);
	//   66  137:aload_0         
	//   67  138:getfield        #270 <Field z c>
	//   68  141:aload_0         
	//   69  142:getfield        #316 <Field android.widget.AdapterView$OnItemSelectedListener C>
	//   70  145:invokevirtual   #310 <Method void z.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			Object obj1 = ((Object) (c));
	//   71  148:aload_0         
	//   72  149:getfield        #270 <Field z c>
	//   73  152:astore          7
			View view = w;
	//   74  154:aload_0         
	//   75  155:getfield        #258 <Field View w>
	//   76  158:astore          8
			if(view != null)
	//*  77  160:aload           8
	//*  78  162:ifnull          362
			{
				obj = ((Object) (new LinearLayout(((Context) (obj)))));
	//   79  165:new             #318 <Class LinearLayout>
	//   80  168:dup             
	//   81  169:aload           6
	//   82  171:invokespecial   #320 <Method void LinearLayout(Context)>
	//   83  174:astore          6
				((LinearLayout) (obj)).setOrientation(1);
	//   84  176:aload           6
	//   85  178:iconst_1        
	//   86  179:invokevirtual   #323 <Method void LinearLayout.setOrientation(int)>
				android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
	//   87  182:new             #325 <Class android.widget.LinearLayout$LayoutParams>
	//   88  185:dup             
	//   89  186:iconst_m1       
	//   90  187:iconst_0        
	//   91  188:fconst_1        
	//   92  189:invokespecial   #328 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   93  192:astore          9
				switch(x)
	//*  94  194:aload_0         
	//*  95  195:getfield        #160 <Field int x>
				{
	//*  96  198:tableswitch     0 1: default 220
	//	               0 281
	//	               1 262
				default:
					obj1 = ((Object) (new StringBuilder()));
	//   97  220:new             #330 <Class StringBuilder>
	//   98  223:dup             
	//   99  224:invokespecial   #331 <Method void StringBuilder()>
	//  100  227:astore          7
					((StringBuilder) (obj1)).append("Invalid hint position ");
	//  101  229:aload           7
	//  102  231:ldc2            #333 <String "Invalid hint position ">
	//  103  234:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//  104  237:pop             
					((StringBuilder) (obj1)).append(x);
	//  105  238:aload           7
	//  106  240:aload_0         
	//  107  241:getfield        #160 <Field int x>
	//  108  244:invokevirtual   #340 <Method StringBuilder StringBuilder.append(int)>
	//  109  247:pop             
					Log.e("ListPopupWindow", ((StringBuilder) (obj1)).toString());
	//  110  248:ldc1            #98  <String "ListPopupWindow">
	//  111  250:aload           7
	//  112  252:invokevirtual   #344 <Method String StringBuilder.toString()>
	//  113  255:invokestatic    #346 <Method int Log.e(String, String)>
	//  114  258:pop             
					break;

	//* 115  259:goto            297
				case 1: // '\001'
					((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//  116  262:aload           6
	//  117  264:aload           7
	//  118  266:aload           9
	//  119  268:invokevirtual   #350 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
					((LinearLayout) (obj)).addView(view);
	//  120  271:aload           6
	//  121  273:aload           8
	//  122  275:invokevirtual   #352 <Method void LinearLayout.addView(View)>
					break;

	//* 123  278:goto            297
				case 0: // '\0'
					((LinearLayout) (obj)).addView(view);
	//  124  281:aload           6
	//  125  283:aload           8
	//  126  285:invokevirtual   #352 <Method void LinearLayout.addView(View)>
					((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//  127  288:aload           6
	//  128  290:aload           7
	//  129  292:aload           9
	//  130  294:invokevirtual   #350 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
					break;
				}
				int j1;
				if(l >= 0)
	//* 131  297:aload_0         
	//* 132  298:getfield        #145 <Field int l>
	//* 133  301:iflt            316
				{
					i1 = l;
	//  134  304:aload_0         
	//  135  305:getfield        #145 <Field int l>
	//  136  308:istore_1        
					j1 = 0x80000000;
	//  137  309:ldc2            #353 <Int 0x80000000>
	//  138  312:istore_2        
				} else
	//* 139  313:goto            320
				{
					i1 = 0;
	//  140  316:iconst_0        
	//  141  317:istore_1        
					j1 = 0;
	//  142  318:iconst_0        
	//  143  319:istore_2        
				}
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, j1), 0);
	//  144  320:aload           8
	//  145  322:iload_1         
	//  146  323:iload_2         
	//  147  324:invokestatic    #358 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  148  327:iconst_0        
	//  149  328:invokevirtual   #362 <Method void View.measure(int, int)>
				obj1 = ((Object) ((android.widget.LinearLayout.LayoutParams)view.getLayoutParams()));
	//  150  331:aload           8
	//  151  333:invokevirtual   #366 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  152  336:checkcast       #325 <Class android.widget.LinearLayout$LayoutParams>
	//  153  339:astore          7
				i1 = view.getMeasuredHeight() + ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin + ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin;
	//  154  341:aload           8
	//  155  343:invokevirtual   #369 <Method int View.getMeasuredHeight()>
	//  156  346:aload           7
	//  157  348:getfield        #372 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//  158  351:iadd            
	//  159  352:aload           7
	//  160  354:getfield        #375 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//  161  357:iadd            
	//  162  358:istore_1        
			} else
	//* 163  359:goto            368
			{
				i1 = 0;
	//  164  362:iconst_0        
	//  165  363:istore_1        
				obj = obj1;
	//  166  364:aload           7
	//  167  366:astore          6
			}
			g.setContentView(((View) (obj)));
	//  168  368:aload_0         
	//  169  369:getfield        #227 <Field PopupWindow g>
	//  170  372:aload           6
	//  171  374:invokevirtual   #378 <Method void PopupWindow.setContentView(View)>
		} else
	//* 172  377:goto            436
		{
			obj = ((Object) ((ViewGroup)g.getContentView()));
	//  173  380:aload_0         
	//  174  381:getfield        #227 <Field PopupWindow g>
	//  175  384:invokevirtual   #382 <Method View PopupWindow.getContentView()>
	//  176  387:checkcast       #264 <Class ViewGroup>
	//  177  390:astore          6
			obj = ((Object) (w));
	//  178  392:aload_0         
	//  179  393:getfield        #258 <Field View w>
	//  180  396:astore          6
			if(obj != null)
	//* 181  398:aload           6
	//* 182  400:ifnull          434
			{
				android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
	//  183  403:aload           6
	//  184  405:invokevirtual   #366 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  185  408:checkcast       #325 <Class android.widget.LinearLayout$LayoutParams>
	//  186  411:astore          7
				i1 = ((View) (obj)).getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
	//  187  413:aload           6
	//  188  415:invokevirtual   #369 <Method int View.getMeasuredHeight()>
	//  189  418:aload           7
	//  190  420:getfield        #372 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//  191  423:iadd            
	//  192  424:aload           7
	//  193  426:getfield        #375 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//  194  429:iadd            
	//  195  430:istore_1        
			} else
	//* 196  431:goto            436
			{
				i1 = 0;
	//  197  434:iconst_0        
	//  198  435:istore_1        
			}
		}
		obj = ((Object) (g.getBackground()));
	//  199  436:aload_0         
	//  200  437:getfield        #227 <Field PopupWindow g>
	//  201  440:invokevirtual   #386 <Method Drawable PopupWindow.getBackground()>
	//  202  443:astore          6
		if(obj != null)
	//* 203  445:aload           6
	//* 204  447:ifnull          502
		{
			((Drawable) (obj)).getPadding(H);
	//  205  450:aload           6
	//  206  452:aload_0         
	//  207  453:getfield        #177 <Field Rect H>
	//  208  456:invokevirtual   #392 <Method boolean Drawable.getPadding(Rect)>
	//  209  459:pop             
			int l1 = H.top + H.bottom;
	//  210  460:aload_0         
	//  211  461:getfield        #177 <Field Rect H>
	//  212  464:getfield        #395 <Field int Rect.top>
	//  213  467:aload_0         
	//  214  468:getfield        #177 <Field Rect H>
	//  215  471:getfield        #398 <Field int Rect.bottom>
	//  216  474:iadd            
	//  217  475:istore_3        
			k1 = l1;
	//  218  476:iload_3         
	//  219  477:istore_2        
			if(!p)
	//* 220  478:aload_0         
	//* 221  479:getfield        #219 <Field boolean p>
	//* 222  482:ifne            511
			{
				n = -H.top;
	//  223  485:aload_0         
	//  224  486:aload_0         
	//  225  487:getfield        #177 <Field Rect H>
	//  226  490:getfield        #395 <Field int Rect.top>
	//  227  493:ineg            
	//  228  494:putfield        #217 <Field int n>
				k1 = l1;
	//  229  497:iload_3         
	//  230  498:istore_2        
			}
		} else
	//* 231  499:goto            511
		{
			H.setEmpty();
	//  232  502:aload_0         
	//  233  503:getfield        #177 <Field Rect H>
	//  234  506:invokevirtual   #401 <Method void Rect.setEmpty()>
			k1 = 0;
	//  235  509:iconst_0        
	//  236  510:istore_2        
		}
		if(g.getInputMethodMode() != 2)
	//* 237  511:aload_0         
	//* 238  512:getfield        #227 <Field PopupWindow g>
	//* 239  515:invokevirtual   #404 <Method int PopupWindow.getInputMethodMode()>
	//* 240  518:iconst_2        
	//* 241  519:icmpne          525
	//* 242  522:goto            528
			flag = false;
	//  243  525:iconst_0        
	//  244  526:istore          5
		j2 = a(i(), n, flag);
	//  245  528:aload_0         
	//  246  529:aload_0         
	//  247  530:invokevirtual   #406 <Method View i()>
	//  248  533:aload_0         
	//  249  534:getfield        #217 <Field int n>
	//  250  537:iload           5
	//  251  539:invokespecial   #408 <Method int a(View, int, boolean)>
	//  252  542:istore          4
		if(u || k == -1)
	//* 253  544:aload_0         
	//* 254  545:getfield        #153 <Field boolean u>
	//* 255  548:ifne            725
	//* 256  551:aload_0         
	//* 257  552:getfield        #143 <Field int k>
	//* 258  555:iconst_m1       
	//* 259  556:icmpne          562
			break MISSING_BLOCK_LABEL_725;
	//  260  559:goto            725
		l;
	//  261  562:aload_0         
	//  262  563:getfield        #145 <Field int l>
		JVM INSTR tableswitch -2 -1: default 588
	//	               -2 637
	//	               -1 604;
	//  263  566:tableswitch     -2 -1: default 588
	//	               -2 637
	//	               -1 604
		   goto _L1 _L2 _L3
_L1:
		int i2 = l;
	//  264  588:aload_0         
	//  265  589:getfield        #145 <Field int l>
	//  266  592:istore_3        
_L5:
		i2 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
	//  267  593:iload_3         
	//  268  594:ldc2            #409 <Int 0x40000000>
	//  269  597:invokestatic    #358 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  270  600:istore_3        
		break; /* Loop/switch isn't completed */
	//  271  601:goto            676
_L3:
		i2 = i.getResources().getDisplayMetrics().widthPixels - (H.left + H.right);
	//  272  604:aload_0         
	//  273  605:getfield        #179 <Field Context i>
	//  274  608:invokevirtual   #413 <Method Resources Context.getResources()>
	//  275  611:invokevirtual   #419 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  276  614:getfield        #424 <Field int DisplayMetrics.widthPixels>
	//  277  617:aload_0         
	//  278  618:getfield        #177 <Field Rect H>
	//  279  621:getfield        #427 <Field int Rect.left>
	//  280  624:aload_0         
	//  281  625:getfield        #177 <Field Rect H>
	//  282  628:getfield        #430 <Field int Rect.right>
	//  283  631:iadd            
	//  284  632:isub            
	//  285  633:istore_3        
		if(true) goto _L5; else goto _L4
	//  286  634:goto            593
_L2:
		i2 = android.view.View.MeasureSpec.makeMeasureSpec(i.getResources().getDisplayMetrics().widthPixels - (H.left + H.right), 0x80000000);
	//  287  637:aload_0         
	//  288  638:getfield        #179 <Field Context i>
	//  289  641:invokevirtual   #413 <Method Resources Context.getResources()>
	//  290  644:invokevirtual   #419 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  291  647:getfield        #424 <Field int DisplayMetrics.widthPixels>
	//  292  650:aload_0         
	//  293  651:getfield        #177 <Field Rect H>
	//  294  654:getfield        #427 <Field int Rect.left>
	//  295  657:aload_0         
	//  296  658:getfield        #177 <Field Rect H>
	//  297  661:getfield        #430 <Field int Rect.right>
	//  298  664:iadd            
	//  299  665:isub            
	//  300  666:ldc2            #353 <Int 0x80000000>
	//  301  669:invokestatic    #358 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  302  672:istore_3        
	//* 303  673:goto            601
_L4:
		j2 = c.a(i2, 0, -1, j2 - i1, -1);
	//  304  676:aload_0         
	//  305  677:getfield        #270 <Field z c>
	//  306  680:iload_3         
	//  307  681:iconst_0        
	//  308  682:iconst_m1       
	//  309  683:iload           4
	//  310  685:iload_1         
	//  311  686:isub            
	//  312  687:iconst_m1       
	//  313  688:invokevirtual   #433 <Method int z.a(int, int, int, int, int)>
	//  314  691:istore          4
		i2 = i1;
	//  315  693:iload_1         
	//  316  694:istore_3        
		if(j2 > 0)
	//* 317  695:iload           4
	//* 318  697:ifle            720
			i2 = i1 + (k1 + (c.getPaddingTop() + c.getPaddingBottom()));
	//  319  700:iload_1         
	//  320  701:iload_2         
	//  321  702:aload_0         
	//  322  703:getfield        #270 <Field z c>
	//  323  706:invokevirtual   #436 <Method int z.getPaddingTop()>
	//  324  709:aload_0         
	//  325  710:getfield        #270 <Field z c>
	//  326  713:invokevirtual   #439 <Method int z.getPaddingBottom()>
	//  327  716:iadd            
	//  328  717:iadd            
	//  329  718:iadd            
	//  330  719:istore_3        
		return j2 + i2;
	//  331  720:iload           4
	//  332  722:iload_3         
	//  333  723:iadd            
	//  334  724:ireturn         
		return j2 + k1;
	//  335  725:iload           4
	//  336  727:iload_2         
	//  337  728:iadd            
	//  338  729:ireturn         
	}

	private void c(boolean flag)
	{
		Exception exception;
		if(a != null)
	//*   0    0:getstatic       #96  <Field Method a>
	//*   1    3:ifnull          38
			try
			{
				a.invoke(((Object) (g)), new Object[] {
					Boolean.valueOf(flag)
				});
	//    2    6:getstatic       #96  <Field Method a>
	//    3    9:aload_0         
	//    4   10:getfield        #227 <Field PopupWindow g>
	//    5   13:iconst_1        
	//    6   14:anewarray       Object[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:iload_1         
	//   10   20:invokestatic    #241 <Method Boolean Boolean.valueOf(boolean)>
	//   11   23:aastore         
	//   12   24:invokevirtual   #247 <Method Object Method.invoke(Object, Object[])>
	//   13   27:pop             
				return;
	//   14   28:return          
			}
	//*  15   29:ldc1            #98  <String "ListPopupWindow">
	//*  16   31:ldc2            #441 <String "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.">
	//*  17   34:invokestatic    #105 <Method int Log.i(String, String)>
	//*  18   37:pop             
	//*  19   38:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
			}
	//*  20   39:astore_2        
	//*  21   40:goto            29
	}

	z a(Context context, boolean flag)
	{
		return new z(context, flag);
	//    0    0:new             #282 <Class z>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #444 <Method void z(Context, boolean)>
	//    5    9:areturn         
	}

	public void a(int i1)
	{
		x = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #160 <Field int x>
	//    3    5:return          
	}

	public void a(Rect rect)
	{
		I = rect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #447 <Field Rect I>
	//    3    5:return          
	}

	public void a(Drawable drawable)
	{
		g.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field PopupWindow g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #450 <Method void PopupWindow.setBackgroundDrawable(Drawable)>
	//    4    8:return          
	}

	public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
	{
		B = onitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #294 <Field android.widget.AdapterView$OnItemClickListener B>
	//    3    5:return          
	}

	public void a(ListAdapter listadapter)
	{
		if(y == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #452 <Field DataSetObserver y>
	//*   2    4:ifnonnull       22
			y = ((DataSetObserver) (new b()));
	//    3    7:aload_0         
	//    4    8:new             #15  <Class ListPopupWindow$b>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #453 <Method void ListPopupWindow$b(ListPopupWindow)>
	//    8   16:putfield        #452 <Field DataSetObserver y>
		else
	//*   9   19:goto            42
		if(j != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #288 <Field ListAdapter j>
	//*  12   26:ifnull          42
			j.unregisterDataSetObserver(y);
	//   13   29:aload_0         
	//   14   30:getfield        #288 <Field ListAdapter j>
	//   15   33:aload_0         
	//   16   34:getfield        #452 <Field DataSetObserver y>
	//   17   37:invokeinterface #459 <Method void ListAdapter.unregisterDataSetObserver(DataSetObserver)>
		j = listadapter;
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:putfield        #288 <Field ListAdapter j>
		if(j != null)
	//*  21   47:aload_0         
	//*  22   48:getfield        #288 <Field ListAdapter j>
	//*  23   51:ifnull          64
			listadapter.registerDataSetObserver(y);
	//   24   54:aload_1         
	//   25   55:aload_0         
	//   26   56:getfield        #452 <Field DataSetObserver y>
	//   27   59:invokeinterface #462 <Method void ListAdapter.registerDataSetObserver(DataSetObserver)>
		if(c != null)
	//*  28   64:aload_0         
	//*  29   65:getfield        #270 <Field z c>
	//*  30   68:ifnull          82
			c.setAdapter(j);
	//   31   71:aload_0         
	//   32   72:getfield        #270 <Field z c>
	//   33   75:aload_0         
	//   34   76:getfield        #288 <Field ListAdapter j>
	//   35   79:invokevirtual   #292 <Method void z.setAdapter(ListAdapter)>
	//   36   82:return          
	}

	public void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		g.setOnDismissListener(ondismisslistener);
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field PopupWindow g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #466 <Method void PopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
	//    4    8:return          
	}

	public void a(boolean flag)
	{
		J = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #275 <Field boolean J>
		g.setFocusable(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #227 <Field PopupWindow g>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #467 <Method void PopupWindow.setFocusable(boolean)>
	//    7   13:return          
	}

	public void b(int i1)
	{
		g.setAnimationStyle(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field PopupWindow g>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #470 <Method void PopupWindow.setAnimationStyle(int)>
	//    4    8:return          
	}

	public void b(View view)
	{
		z = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #472 <Field View z>
	//    3    5:return          
	}

	public void b(boolean flag)
	{
		s = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #474 <Field boolean s>
		r = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #476 <Field boolean r>
	//    6   10:return          
	}

	public void c(int i1)
	{
		m = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #212 <Field int m>
	//    3    5:return          
	}

	public boolean c()
	{
		return J;
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field boolean J>
	//    2    4:ireturn         
	}

	public void d()
	{
		int k1 = b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #479 <Method int b()>
	//    2    4:istore_2        
		boolean flag1 = n();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #481 <Method boolean n()>
	//    5    9:istore          6
		android.support.v4.widget.k.a(g, o);
	//    6   11:aload_0         
	//    7   12:getfield        #227 <Field PopupWindow g>
	//    8   15:aload_0         
	//    9   16:getfield        #147 <Field int o>
	//   10   19:invokestatic    #486 <Method void k.a(PopupWindow, int)>
		boolean flag2 = g.isShowing();
	//   11   22:aload_0         
	//   12   23:getfield        #227 <Field PopupWindow g>
	//   13   26:invokevirtual   #489 <Method boolean PopupWindow.isShowing()>
	//   14   29:istore          7
		boolean flag = true;
	//   15   31:iconst_1        
	//   16   32:istore          5
		if(flag2)
	//*  17   34:iload           7
	//*  18   36:ifeq            291
		{
			if(!android.support.v4.view.s.A(i()))
	//*  19   39:aload_0         
	//*  20   40:invokevirtual   #406 <Method View i()>
	//*  21   43:invokestatic    #494 <Method boolean android.support.v4.view.s.A(View)>
	//*  22   46:ifne            50
				return;
	//   23   49:return          
			int i1;
			if(l == -1)
	//*  24   50:aload_0         
	//*  25   51:getfield        #145 <Field int l>
	//*  26   54:iconst_m1       
	//*  27   55:icmpne          63
				i1 = -1;
	//   28   58:iconst_m1       
	//   29   59:istore_1        
			else
	//*  30   60:goto            88
			if(l == -2)
	//*  31   63:aload_0         
	//*  32   64:getfield        #145 <Field int l>
	//*  33   67:bipush          -2
	//*  34   69:icmpne          83
				i1 = i().getWidth();
	//   35   72:aload_0         
	//   36   73:invokevirtual   #406 <Method View i()>
	//   37   76:invokevirtual   #497 <Method int View.getWidth()>
	//   38   79:istore_1        
			else
	//*  39   80:goto            88
				i1 = l;
	//   40   83:aload_0         
	//   41   84:getfield        #145 <Field int l>
	//   42   87:istore_1        
			if(k == -1)
	//*  43   88:aload_0         
	//*  44   89:getfield        #143 <Field int k>
	//*  45   92:iconst_m1       
	//*  46   93:icmpne          187
			{
				if(!flag1)
	//*  47   96:iload           6
	//*  48   98:ifeq            104
	//*  49  101:goto            106
					k1 = -1;
	//   50  104:iconst_m1       
	//   51  105:istore_2        
				if(flag1)
	//*  52  106:iload           6
	//*  53  108:ifeq            149
				{
					PopupWindow popupwindow = g;
	//   54  111:aload_0         
	//   55  112:getfield        #227 <Field PopupWindow g>
	//   56  115:astore          8
					byte byte0;
					if(l == -1)
	//*  57  117:aload_0         
	//*  58  118:getfield        #145 <Field int l>
	//*  59  121:iconst_m1       
	//*  60  122:icmpne          130
						byte0 = -1;
	//   61  125:iconst_m1       
	//   62  126:istore_3        
					else
	//*  63  127:goto            132
						byte0 = 0;
	//   64  130:iconst_0        
	//   65  131:istore_3        
					popupwindow.setWidth(((int) (byte0)));
	//   66  132:aload           8
	//   67  134:iload_3         
	//   68  135:invokevirtual   #500 <Method void PopupWindow.setWidth(int)>
					g.setHeight(0);
	//   69  138:aload_0         
	//   70  139:getfield        #227 <Field PopupWindow g>
	//   71  142:iconst_0        
	//   72  143:invokevirtual   #503 <Method void PopupWindow.setHeight(int)>
				} else
	//*  73  146:goto            204
				{
					PopupWindow popupwindow1 = g;
	//   74  149:aload_0         
	//   75  150:getfield        #227 <Field PopupWindow g>
	//   76  153:astore          8
					byte byte1;
					if(l == -1)
	//*  77  155:aload_0         
	//*  78  156:getfield        #145 <Field int l>
	//*  79  159:iconst_m1       
	//*  80  160:icmpne          168
						byte1 = -1;
	//   81  163:iconst_m1       
	//   82  164:istore_3        
					else
	//*  83  165:goto            170
						byte1 = 0;
	//   84  168:iconst_0        
	//   85  169:istore_3        
					popupwindow1.setWidth(((int) (byte1)));
	//   86  170:aload           8
	//   87  172:iload_3         
	//   88  173:invokevirtual   #500 <Method void PopupWindow.setWidth(int)>
					g.setHeight(-1);
	//   89  176:aload_0         
	//   90  177:getfield        #227 <Field PopupWindow g>
	//   91  180:iconst_m1       
	//   92  181:invokevirtual   #503 <Method void PopupWindow.setHeight(int)>
				}
			} else
	//*  93  184:goto            204
			if(k != -2)
	//*  94  187:aload_0         
	//*  95  188:getfield        #143 <Field int k>
	//*  96  191:bipush          -2
	//*  97  193:icmpne          199
	//*  98  196:goto            204
				k1 = k;
	//   99  199:aload_0         
	//  100  200:getfield        #143 <Field int k>
	//  101  203:istore_2        
			PopupWindow popupwindow2 = g;
	//  102  204:aload_0         
	//  103  205:getfield        #227 <Field PopupWindow g>
	//  104  208:astore          8
			if(v || u)
	//* 105  210:aload_0         
	//* 106  211:getfield        #155 <Field boolean v>
	//* 107  214:ifne            227
	//* 108  217:aload_0         
	//* 109  218:getfield        #153 <Field boolean u>
	//* 110  221:ifne            227
	//* 111  224:goto            230
				flag = false;
	//  112  227:iconst_0        
	//  113  228:istore          5
			popupwindow2.setOutsideTouchable(flag);
	//  114  230:aload           8
	//  115  232:iload           5
	//  116  234:invokevirtual   #506 <Method void PopupWindow.setOutsideTouchable(boolean)>
			popupwindow2 = g;
	//  117  237:aload_0         
	//  118  238:getfield        #227 <Field PopupWindow g>
	//  119  241:astore          8
			View view = i();
	//  120  243:aload_0         
	//  121  244:invokevirtual   #406 <Method View i()>
	//  122  247:astore          9
			int l1 = m;
	//  123  249:aload_0         
	//  124  250:getfield        #212 <Field int m>
	//  125  253:istore_3        
			int i2 = n;
	//  126  254:aload_0         
	//  127  255:getfield        #217 <Field int n>
	//  128  258:istore          4
			if(i1 < 0)
	//* 129  260:iload_1         
	//* 130  261:ifge            269
				i1 = -1;
	//  131  264:iconst_m1       
	//  132  265:istore_1        
	//* 133  266:goto            269
			if(k1 < 0)
	//* 134  269:iload_2         
	//* 135  270:ifge            278
				k1 = -1;
	//  136  273:iconst_m1       
	//  137  274:istore_2        
	//* 138  275:goto            278
			popupwindow2.update(view, l1, i2, i1, k1);
	//  139  278:aload           8
	//  140  280:aload           9
	//  141  282:iload_3         
	//  142  283:iload           4
	//  143  285:iload_1         
	//  144  286:iload_2         
	//  145  287:invokevirtual   #510 <Method void PopupWindow.update(View, int, int, int, int)>
			return;
	//  146  290:return          
		}
		int j1;
		if(l == -1)
	//* 147  291:aload_0         
	//* 148  292:getfield        #145 <Field int l>
	//* 149  295:iconst_m1       
	//* 150  296:icmpne          304
			j1 = -1;
	//  151  299:iconst_m1       
	//  152  300:istore_1        
		else
	//* 153  301:goto            329
		if(l == -2)
	//* 154  304:aload_0         
	//* 155  305:getfield        #145 <Field int l>
	//* 156  308:bipush          -2
	//* 157  310:icmpne          324
			j1 = i().getWidth();
	//  158  313:aload_0         
	//  159  314:invokevirtual   #406 <Method View i()>
	//  160  317:invokevirtual   #497 <Method int View.getWidth()>
	//  161  320:istore_1        
		else
	//* 162  321:goto            329
			j1 = l;
	//  163  324:aload_0         
	//  164  325:getfield        #145 <Field int l>
	//  165  328:istore_1        
		if(k == -1)
	//* 166  329:aload_0         
	//* 167  330:getfield        #143 <Field int k>
	//* 168  333:iconst_m1       
	//* 169  334:icmpne          342
			k1 = -1;
	//  170  337:iconst_m1       
	//  171  338:istore_2        
		else
	//* 172  339:goto            359
		if(k != -2)
	//* 173  342:aload_0         
	//* 174  343:getfield        #143 <Field int k>
	//* 175  346:bipush          -2
	//* 176  348:icmpne          354
	//* 177  351:goto            359
			k1 = k;
	//  178  354:aload_0         
	//  179  355:getfield        #143 <Field int k>
	//  180  358:istore_2        
		g.setWidth(j1);
	//  181  359:aload_0         
	//  182  360:getfield        #227 <Field PopupWindow g>
	//  183  363:iload_1         
	//  184  364:invokevirtual   #500 <Method void PopupWindow.setWidth(int)>
		g.setHeight(k1);
	//  185  367:aload_0         
	//  186  368:getfield        #227 <Field PopupWindow g>
	//  187  371:iload_2         
	//  188  372:invokevirtual   #503 <Method void PopupWindow.setHeight(int)>
		c(true);
	//  189  375:aload_0         
	//  190  376:iconst_1        
	//  191  377:invokespecial   #512 <Method void c(boolean)>
		PopupWindow popupwindow3 = g;
	//  192  380:aload_0         
	//  193  381:getfield        #227 <Field PopupWindow g>
	//  194  384:astore          8
		if(!v && !u)
	//* 195  386:aload_0         
	//* 196  387:getfield        #155 <Field boolean v>
	//* 197  390:ifne            406
	//* 198  393:aload_0         
	//* 199  394:getfield        #153 <Field boolean u>
	//* 200  397:ifne            406
			flag = true;
	//  201  400:iconst_1        
	//  202  401:istore          5
		else
	//* 203  403:goto            409
			flag = false;
	//  204  406:iconst_0        
	//  205  407:istore          5
		popupwindow3.setOutsideTouchable(flag);
	//  206  409:aload           8
	//  207  411:iload           5
	//  208  413:invokevirtual   #506 <Method void PopupWindow.setOutsideTouchable(boolean)>
		g.setTouchInterceptor(((android.view.View.OnTouchListener) (D)));
	//  209  416:aload_0         
	//  210  417:getfield        #227 <Field PopupWindow g>
	//  211  420:aload_0         
	//  212  421:getfield        #168 <Field ListPopupWindow$d D>
	//  213  424:invokevirtual   #516 <Method void PopupWindow.setTouchInterceptor(android.view.View$OnTouchListener)>
		if(s)
	//* 214  427:aload_0         
	//* 215  428:getfield        #474 <Field boolean s>
	//* 216  431:ifeq            445
			android.support.v4.widget.k.a(g, r);
	//  217  434:aload_0         
	//  218  435:getfield        #227 <Field PopupWindow g>
	//  219  438:aload_0         
	//  220  439:getfield        #476 <Field boolean r>
	//  221  442:invokestatic    #519 <Method void k.a(PopupWindow, boolean)>
		if(h != null)
	//* 222  445:getstatic       #122 <Field Method h>
	//* 223  448:ifnull          489
			try
			{
				h.invoke(((Object) (g)), new Object[] {
					I
				});
	//  224  451:getstatic       #122 <Field Method h>
	//  225  454:aload_0         
	//  226  455:getfield        #227 <Field PopupWindow g>
	//  227  458:iconst_1        
	//  228  459:anewarray       Object[]
	//  229  462:dup             
	//  230  463:iconst_0        
	//  231  464:aload_0         
	//  232  465:getfield        #447 <Field Rect I>
	//  233  468:aastore         
	//  234  469:invokevirtual   #247 <Method Object Method.invoke(Object, Object[])>
	//  235  472:pop             
			}
	//* 236  473:goto            489
			catch(Exception exception)
	//* 237  476:astore          8
			{
				Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", ((Throwable) (exception)));
	//  238  478:ldc1            #98  <String "ListPopupWindow">
	//  239  480:ldc2            #521 <String "Could not invoke setEpicenterBounds on PopupWindow">
	//  240  483:aload           8
	//  241  485:invokestatic    #524 <Method int Log.e(String, String, Throwable)>
	//  242  488:pop             
			}
		android.support.v4.widget.k.a(g, i(), m, n, t);
	//  243  489:aload_0         
	//  244  490:getfield        #227 <Field PopupWindow g>
	//  245  493:aload_0         
	//  246  494:invokevirtual   #406 <Method View i()>
	//  247  497:aload_0         
	//  248  498:getfield        #212 <Field int m>
	//  249  501:aload_0         
	//  250  502:getfield        #217 <Field int n>
	//  251  505:aload_0         
	//  252  506:getfield        #151 <Field int t>
	//  253  509:invokestatic    #527 <Method void k.a(PopupWindow, View, int, int, int)>
		c.setSelection(-1);
	//  254  512:aload_0         
	//  255  513:getfield        #270 <Field z c>
	//  256  516:iconst_m1       
	//  257  517:invokevirtual   #530 <Method void z.setSelection(int)>
		if(!J || c.isInTouchMode())
	//* 258  520:aload_0         
	//* 259  521:getfield        #275 <Field boolean J>
	//* 260  524:ifeq            537
	//* 261  527:aload_0         
	//* 262  528:getfield        #270 <Field z c>
	//* 263  531:invokevirtual   #533 <Method boolean z.isInTouchMode()>
	//* 264  534:ifeq            541
			m();
	//  265  537:aload_0         
	//  266  538:invokevirtual   #535 <Method void m()>
		if(!J)
	//* 267  541:aload_0         
	//* 268  542:getfield        #275 <Field boolean J>
	//* 269  545:ifne            560
			f.post(((Runnable) (F)));
	//  270  548:aload_0         
	//  271  549:getfield        #192 <Field Handler f>
	//  272  552:aload_0         
	//  273  553:getfield        #174 <Field ListPopupWindow$a F>
	//  274  556:invokevirtual   #539 <Method boolean Handler.post(Runnable)>
	//  275  559:pop             
	//  276  560:return          
	}

	public void d(int i1)
	{
		n = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #217 <Field int n>
		p = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #219 <Field boolean p>
	//    6   10:return          
	}

	public void e()
	{
		g.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field PopupWindow g>
	//    2    4:invokevirtual   #542 <Method void PopupWindow.dismiss()>
		a();
	//    3    7:aload_0         
	//    4    8:invokespecial   #544 <Method void a()>
		g.setContentView(((View) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #227 <Field PopupWindow g>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #378 <Method void PopupWindow.setContentView(View)>
		c = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #270 <Field z c>
		f.removeCallbacks(((Runnable) (e)));
	//   12   24:aload_0         
	//   13   25:getfield        #192 <Field Handler f>
	//   14   28:aload_0         
	//   15   29:getfield        #165 <Field ListPopupWindow$e e>
	//   16   32:invokevirtual   #548 <Method void Handler.removeCallbacks(Runnable)>
	//   17   35:return          
	}

	public void e(int i1)
	{
		t = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #151 <Field int t>
	//    3    5:return          
	}

	public void f(int i1)
	{
		l = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #145 <Field int l>
	//    3    5:return          
	}

	public boolean f()
	{
		return g.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field PopupWindow g>
	//    2    4:invokevirtual   #489 <Method boolean PopupWindow.isShowing()>
	//    3    7:ireturn         
	}

	public ListView g()
	{
		return ((ListView) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field z c>
	//    2    4:areturn         
	}

	public void g(int i1)
	{
		Drawable drawable = g.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field PopupWindow g>
	//    2    4:invokevirtual   #386 <Method Drawable PopupWindow.getBackground()>
	//    3    7:astore_2        
		if(drawable != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          43
		{
			drawable.getPadding(H);
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #177 <Field Rect H>
	//    9   17:invokevirtual   #392 <Method boolean Drawable.getPadding(Rect)>
	//   10   20:pop             
			l = H.left + H.right + i1;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #177 <Field Rect H>
	//   14   26:getfield        #427 <Field int Rect.left>
	//   15   29:aload_0         
	//   16   30:getfield        #177 <Field Rect H>
	//   17   33:getfield        #430 <Field int Rect.right>
	//   18   36:iadd            
	//   19   37:iload_1         
	//   20   38:iadd            
	//   21   39:putfield        #145 <Field int l>
			return;
	//   22   42:return          
		} else
		{
			f(i1);
	//   23   43:aload_0         
	//   24   44:iload_1         
	//   25   45:invokevirtual   #551 <Method void f(int)>
			return;
	//   26   48:return          
		}
	}

	public Drawable h()
	{
		return g.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field PopupWindow g>
	//    2    4:invokevirtual   #386 <Method Drawable PopupWindow.getBackground()>
	//    3    7:areturn         
	}

	public void h(int i1)
	{
		g.setInputMethodMode(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field PopupWindow g>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #231 <Method void PopupWindow.setInputMethodMode(int)>
	//    4    8:return          
	}

	public View i()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #472 <Field View z>
	//    2    4:areturn         
	}

	public void i(int i1)
	{
		z z1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field z c>
	//    2    4:astore_2        
		if(f() && z1 != null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #553 <Method boolean f()>
	//*   5    9:ifeq            39
	//*   6   12:aload_2         
	//*   7   13:ifnull          39
		{
			z1.setListSelectionHidden(false);
	//    8   16:aload_2         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #556 <Method void z.setListSelectionHidden(boolean)>
			z1.setSelection(i1);
	//   11   21:aload_2         
	//   12   22:iload_1         
	//   13   23:invokevirtual   #530 <Method void z.setSelection(int)>
			if(z1.getChoiceMode() != 0)
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #559 <Method int z.getChoiceMode()>
	//*  16   30:ifeq            39
				z1.setItemChecked(i1, true);
	//   17   33:aload_2         
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #563 <Method void z.setItemChecked(int, boolean)>
		}
	//   21   39:return          
	}

	public int j()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field int m>
	//    2    4:ireturn         
	}

	public int k()
	{
		if(!p)
	//*   0    0:aload_0         
	//*   1    1:getfield        #219 <Field boolean p>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return n;
	//    5    9:aload_0         
	//    6   10:getfield        #217 <Field int n>
	//    7   13:ireturn         
	}

	public int l()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field int l>
	//    2    4:ireturn         
	}

	public void m()
	{
		z z1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field z c>
	//    2    4:astore_1        
		if(z1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			z1.setListSelectionHidden(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #556 <Method void z.setListSelectionHidden(boolean)>
			z1.requestLayout();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #566 <Method void z.requestLayout()>
		}
	//   10   18:return          
	}

	public boolean n()
	{
		return g.getInputMethodMode() == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field PopupWindow g>
	//    2    4:invokevirtual   #404 <Method int PopupWindow.getInputMethodMode()>
	//    3    7:iconst_2        
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private static Method a;
	private static Method b;
	private static Method h;
	private Drawable A;
	private android.widget.AdapterView.OnItemClickListener B;
	private android.widget.AdapterView.OnItemSelectedListener C;
	private final d D;
	private final c E;
	private final a F;
	private Runnable G;
	private final Rect H;
	private Rect I;
	private boolean J;
	z c;
	int d;
	final e e;
	final Handler f;
	PopupWindow g;
	private Context i;
	private ListAdapter j;
	private int k;
	private int l;
	private int m;
	private int n;
	private int o;
	private boolean p;
	private boolean q;
	private boolean r;
	private boolean s;
	private int t;
	private boolean u;
	private boolean v;
	private View w;
	private int x;
	private DataSetObserver y;
	private View z;

	static 
	{
		NoSuchMethodException nosuchmethodexception;
		try
		{
			a = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setClipToScreenEnabled", new Class[] {
				Boolean.TYPE
			});
	//    0    0:ldc1            #80  <Class PopupWindow>
	//    1    2:ldc1            #82  <String "setClipToScreenEnabled">
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #90  <Field Class Boolean.TYPE>
	//    7   13:aastore         
	//    8   14:invokevirtual   #94  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    9   17:putstatic       #96  <Field Method a>
		}
	//*  10   20:goto            31
	//*  11   23:ldc1            #98  <String "ListPopupWindow">
	//*  12   25:ldc1            #100 <String "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.">
	//*  13   27:invokestatic    #105 <Method int Log.i(String, String)>
	//*  14   30:pop             
	//*  15   31:ldc1            #80  <Class PopupWindow>
	//*  16   33:ldc1            #107 <String "getMaxAvailableHeight">
	//*  17   35:iconst_3        
	//*  18   36:anewarray       Class[]
	//*  19   39:dup             
	//*  20   40:iconst_0        
	//*  21   41:ldc1            #109 <Class View>
	//*  22   43:aastore         
	//*  23   44:dup             
	//*  24   45:iconst_1        
	//*  25   46:getstatic       #112 <Field Class Integer.TYPE>
	//*  26   49:aastore         
	//*  27   50:dup             
	//*  28   51:iconst_2        
	//*  29   52:getstatic       #90  <Field Class Boolean.TYPE>
	//*  30   55:aastore         
	//*  31   56:invokevirtual   #94  <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  32   59:putstatic       #114 <Field Method b>
	//*  33   62:goto            73
	//*  34   65:ldc1            #98  <String "ListPopupWindow">
	//*  35   67:ldc1            #116 <String "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.">
	//*  36   69:invokestatic    #105 <Method int Log.i(String, String)>
	//*  37   72:pop             
	//*  38   73:ldc1            #80  <Class PopupWindow>
	//*  39   75:ldc1            #118 <String "setEpicenterBounds">
	//*  40   77:iconst_1        
	//*  41   78:anewarray       Class[]
	//*  42   81:dup             
	//*  43   82:iconst_0        
	//*  44   83:ldc1            #120 <Class Rect>
	//*  45   85:aastore         
	//*  46   86:invokevirtual   #94  <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  47   89:putstatic       #122 <Field Method h>
	//*  48   92:return          
	//*  49   93:ldc1            #98  <String "ListPopupWindow">
	//*  50   95:ldc1            #124 <String "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.">
	//*  51   97:invokestatic    #105 <Method int Log.i(String, String)>
	//*  52  100:pop             
	//*  53  101:return          
		// Misplaced declaration of an exception variable
		catch(NoSuchMethodException nosuchmethodexception)
		{
			Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
		}
		try
		{
			b = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("getMaxAvailableHeight", new Class[] {
				android/view/View, Integer.TYPE, Boolean.TYPE
			});
		}
	//*  54  102:astore_0        
	//*  55  103:goto            23
		// Misplaced declaration of an exception variable
		catch(NoSuchMethodException nosuchmethodexception)
		{
			Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
		}
		try
		{
			h = ((Class) (android/widget/PopupWindow)).getDeclaredMethod("setEpicenterBounds", new Class[] {
				android/graphics/Rect
			});
			return;
		}
	//*  56  106:astore_0        
	//*  57  107:goto            65
		// Misplaced declaration of an exception variable
		catch(NoSuchMethodException nosuchmethodexception)
		{
			Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
		}
	//*  58  110:astore_0        
	//*  59  111:goto            93
	}
}
