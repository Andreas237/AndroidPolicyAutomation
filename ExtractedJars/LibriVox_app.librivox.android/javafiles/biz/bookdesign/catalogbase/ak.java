// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.catalogbase;

import android.app.Dialog;
import android.content.*;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.a.c;
import android.support.v4.app.p;
import android.support.v4.app.x;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.*;
import com.crashlytics.android.a;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package biz.bookdesign.catalogbase:
//			u, aa, h, z, 
//			c, ba, bk, am, 
//			az, bi, au, a, 
//			ay, as, at, i, 
//			bj, al, an, ao, 
//			ap, aq, ar, bf, 
//			bm

public class ak extends p
{

	public ak()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void p()>
		i = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #34  <Field boolean i>
	//    5    9:aload_0         
	//    6   10:new             #36  <Class android.support.v7.widget.RecyclerView$RecycledViewPool>
	//    7   13:dup             
	//    8   14:invokespecial   #37  <Method void android.support.v7.widget.RecyclerView$RecycledViewPool()>
	//    9   17:putfield        #39  <Field android.support.v7.widget.RecyclerView$RecycledViewPool l>
	//   10   20:return          
	}

	static ArrayAdapter a(ak ak1, ArrayAdapter arrayadapter)
	{
		ak1.d = arrayadapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field ArrayAdapter d>
		return arrayadapter;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static List a(ak ak1, List list)
	{
		ak1.a = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field List a>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Callable a(ak ak1)
	{
		return ak1.k;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Callable k>
	//    2    4:areturn         
	}

	public static void a(u u1, x x1, ay ay1, bm bm)
	{
		android.support.v4.app.ae ae = x1.getSupportFragmentManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #56  <Method android.support.v4.app.ae x.getSupportFragmentManager()>
	//    2    4:astore          4
		ak ak1 = new ak();
	//    3    6:new             #2   <Class ak>
	//    4    9:dup             
	//    5   10:invokespecial   #57  <Method void ak()>
	//    6   13:astore          5
		ak1.a(u1, ay1, bm);
	//    7   15:aload           5
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:aload_3         
	//   11   20:invokevirtual   #60  <Method void a(u, ay, bm)>
		if(u1.a() == 12)
	//*  12   23:aload_0         
	//*  13   24:invokevirtual   #65  <Method int biz.bookdesign.catalogbase.u.a()>
	//*  14   27:bipush          12
	//*  15   29:icmpne          43
			ak1.a(biz.bookdesign.catalogbase.aa.a(x1, ak1));
	//   16   32:aload           5
	//   17   34:aload_1         
	//   18   35:aload           5
	//   19   37:invokestatic    #70  <Method az biz.bookdesign.catalogbase.aa.a(x, ak)>
	//   20   40:invokevirtual   #73  <Method void a(az)>
		x1 = ((x) (new StringBuilder()));
	//   21   43:new             #75  <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #76  <Method void StringBuilder()>
	//   24   50:astore_1        
		((StringBuilder) (x1)).append("fragment_picker");
	//   25   51:aload_1         
	//   26   52:ldc1            #78  <String "fragment_picker">
	//   27   54:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
		((StringBuilder) (x1)).append(u1.a());
	//   29   58:aload_1         
	//   30   59:aload_0         
	//   31   60:invokevirtual   #65  <Method int biz.bookdesign.catalogbase.u.a()>
	//   32   63:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   33   66:pop             
		ak1.show(ae, ((StringBuilder) (x1)).toString());
	//   34   67:aload           5
	//   35   69:aload           4
	//   36   71:aload_1         
	//   37   72:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   38   75:invokevirtual   #93  <Method void show(android.support.v4.app.ae, String)>
	//   39   78:return          
	}

	static az b(ak ak1)
	{
		return ak1.j;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field az j>
	//    2    4:areturn         
	}

	private u b(Object obj)
	{
		int i1 = g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field u g>
	//    2    4:invokevirtual   #65  <Method int biz.bookdesign.catalogbase.u.a()>
	//    3    7:istore_2        
		if(i1 != 12)
	//*   4    8:iload_2         
	//*   5    9:bipush          12
	//*   6   11:icmpeq          140
			switch(i1)
	//*   7   14:iload_2         
			{
	//*   8   15:tableswitch     4 5: default 36
	//	               4 106
	//	               5 72
			default:
				obj = ((Object) (new StringBuilder()));
	//    9   36:new             #75  <Class StringBuilder>
	//   10   39:dup             
	//   11   40:invokespecial   #76  <Method void StringBuilder()>
	//   12   43:astore_1        
				((StringBuilder) (obj)).append("Unsupported type ");
	//   13   44:aload_1         
	//   14   45:ldc1            #101 <String "Unsupported type ">
	//   15   47:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   16   50:pop             
				((StringBuilder) (obj)).append(((Object) (g)));
	//   17   51:aload_1         
	//   18   52:aload_0         
	//   19   53:getfield        #99  <Field u g>
	//   20   56:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//   21   59:pop             
				throw new UnsupportedOperationException(((StringBuilder) (obj)).toString());
	//   22   60:new             #106 <Class UnsupportedOperationException>
	//   23   63:dup             
	//   24   64:aload_1         
	//   25   65:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   26   68:invokespecial   #109 <Method void UnsupportedOperationException(String)>
	//   27   71:athrow          

			case 5: // '\005'
				u u1 = new u(5);
	//   28   72:new             #62  <Class u>
	//   29   75:dup             
	//   30   76:iconst_5        
	//   31   77:invokespecial   #112 <Method void u(int)>
	//   32   80:astore_3        
				obj = ((Object) ((h)obj));
	//   33   81:aload_1         
	//   34   82:checkcast       #114 <Class h>
	//   35   85:astore_1        
				u1.a(((h) (obj)).a());
	//   36   86:aload_3         
	//   37   87:aload_1         
	//   38   88:invokevirtual   #116 <Method String biz.bookdesign.catalogbase.h.a()>
	//   39   91:invokevirtual   #119 <Method u biz.bookdesign.catalogbase.u.a(String)>
	//   40   94:pop             
				u1.b(((h) (obj)).b());
	//   41   95:aload_3         
	//   42   96:aload_1         
	//   43   97:invokevirtual   #121 <Method String h.b()>
	//   44  100:invokevirtual   #123 <Method u u.b(String)>
	//   45  103:pop             
				return u1;
	//   46  104:aload_3         
	//   47  105:areturn         

			case 4: // '\004'
				obj = ((Object) ((z)obj));
	//   48  106:aload_1         
	//   49  107:checkcast       #125 <Class z>
	//   50  110:astore_1        
				u u2 = new u(4);
	//   51  111:new             #62  <Class u>
	//   52  114:dup             
	//   53  115:iconst_4        
	//   54  116:invokespecial   #112 <Method void u(int)>
	//   55  119:astore_3        
				u2.a(((z) (obj)).a);
	//   56  120:aload_3         
	//   57  121:aload_1         
	//   58  122:getfield        #128 <Field String biz.bookdesign.catalogbase.z.a>
	//   59  125:invokevirtual   #119 <Method u biz.bookdesign.catalogbase.u.a(String)>
	//   60  128:pop             
				u2.b(((z) (obj)).b);
	//   61  129:aload_3         
	//   62  130:aload_1         
	//   63  131:getfield        #130 <Field String z.b>
	//   64  134:invokevirtual   #123 <Method u u.b(String)>
	//   65  137:pop             
				return u2;
	//   66  138:aload_3         
	//   67  139:areturn         
			}
		else
			return ((biz.bookdesign.catalogbase.c)obj).i();
	//   68  140:aload_1         
	//   69  141:checkcast       #132 <Class biz.bookdesign.catalogbase.c>
	//   70  144:invokevirtual   #135 <Method u c.i()>
	//   71  147:areturn         
	}

	static ArrayAdapter c(ak ak1)
	{
		return ak1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ArrayAdapter d>
	//    2    4:areturn         
	}

	static ba d(ak ak1)
	{
		return ak1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field ba e>
	//    2    4:areturn         
	}

	static List e(ak ak1)
	{
		return ak1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List a>
	//    2    4:areturn         
	}

	static u f(ak ak1)
	{
		return ak1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field u g>
	//    2    4:areturn         
	}

	static boolean g(ak ak1)
	{
		return ak1.i;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean i>
	//    2    4:ireturn         
	}

	static View h(ak ak1)
	{
		return ak1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field View c>
	//    2    4:areturn         
	}

	static ListView i(ak ak1)
	{
		return ak1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field ListView b>
	//    2    4:areturn         
	}

	static bm j(ak ak1)
	{
		return ak1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field bm h>
	//    2    4:areturn         
	}

	public void a()
	{
		e.b("");
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field ba e>
	//    2    4:ldc1            #153 <String "">
	//    3    6:invokevirtual   #157 <Method void ba.b(String)>
	//    4    9:return          
	}

	void a(ContextMenu contextmenu, biz.bookdesign.catalogbase.c c1)
	{
		if(c1.g())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #161 <Method boolean c.g()>
	//*   2    4:ifeq            36
		{
			contextmenu.add(1, 2, 1, bk.delete);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:iconst_2        
	//    6   10:iconst_1        
	//    7   11:getstatic       #167 <Field int bk.delete>
	//    8   14:invokeinterface #173 <Method MenuItem ContextMenu.add(int, int, int, int)>
	//    9   19:pop             
			contextmenu.add(1, 1, 2, bk.edit);
	//   10   20:aload_1         
	//   11   21:iconst_1        
	//   12   22:iconst_1        
	//   13   23:iconst_2        
	//   14   24:getstatic       #176 <Field int bk.edit>
	//   15   27:invokeinterface #173 <Method MenuItem ContextMenu.add(int, int, int, int)>
	//   16   32:pop             
		} else
	//*  17   33:goto            49
		{
			contextmenu.add(1, 3, 3, bk.copy);
	//   18   36:aload_1         
	//   19   37:iconst_1        
	//   20   38:iconst_3        
	//   21   39:iconst_3        
	//   22   40:getstatic       #179 <Field int bk.copy>
	//   23   43:invokeinterface #173 <Method MenuItem ContextMenu.add(int, int, int, int)>
	//   24   48:pop             
		}
		c1 = ((biz.bookdesign.catalogbase.c) (new am(this, c1)));
	//   25   49:new             #181 <Class am>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:aload_2         
	//   29   55:invokespecial   #184 <Method void am(ak, biz.bookdesign.catalogbase.c)>
	//   30   58:astore_2        
		int i1 = 0;
	//   31   59:iconst_0        
	//   32   60:istore_3        
		for(int j1 = contextmenu.size(); i1 < j1; i1++)
	//*  33   61:aload_1         
	//*  34   62:invokeinterface #187 <Method int ContextMenu.size()>
	//*  35   67:istore          4
	//*  36   69:iload_3         
	//*  37   70:iload           4
	//*  38   72:icmpge          96
			contextmenu.getItem(i1).setOnMenuItemClickListener(((android.view.MenuItem.OnMenuItemClickListener) (c1)));
	//   39   75:aload_1         
	//   40   76:iload_3         
	//   41   77:invokeinterface #191 <Method MenuItem ContextMenu.getItem(int)>
	//   42   82:aload_2         
	//   43   83:invokeinterface #197 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   44   88:pop             

	//   45   89:iload_3         
	//   46   90:iconst_1        
	//   47   91:iadd            
	//   48   92:istore_3        
	//*  49   93:goto            69
	//   50   96:return          
	}

	void a(MenuItem menuitem, biz.bookdesign.catalogbase.c c1)
	{
		switch(menuitem.getItemId())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #201 <Method int MenuItem.getItemId()>
		{
	//*   2    6:tableswitch     1 3: default 32
	//	               1 90
	//	               2 83
	//	               3 70
		default:
			c1 = ((biz.bookdesign.catalogbase.c) (new StringBuilder()));
	//    3   32:new             #75  <Class StringBuilder>
	//    4   35:dup             
	//    5   36:invokespecial   #76  <Method void StringBuilder()>
	//    6   39:astore_2        
			((StringBuilder) (c1)).append("Unexpected context menu item id ");
	//    7   40:aload_2         
	//    8   41:ldc1            #203 <String "Unexpected context menu item id ">
	//    9   43:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   10   46:pop             
			((StringBuilder) (c1)).append(menuitem.getItemId());
	//   11   47:aload_2         
	//   12   48:aload_1         
	//   13   49:invokeinterface #201 <Method int MenuItem.getItemId()>
	//   14   54:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   15   57:pop             
			throw new UnsupportedOperationException(((StringBuilder) (c1)).toString());
	//   16   58:new             #106 <Class UnsupportedOperationException>
	//   17   61:dup             
	//   18   62:aload_2         
	//   19   63:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   20   66:invokespecial   #109 <Method void UnsupportedOperationException(String)>
	//   21   69:athrow          

		case 3: // '\003'
			j.a(c1);
	//   22   70:aload_0         
	//   23   71:getfield        #96  <Field az j>
	//   24   74:aload_2         
	//   25   75:invokeinterface #208 <Method void biz.bookdesign.catalogbase.az.a(biz.bookdesign.catalogbase.c)>
			break;

	//*  26   80:goto            100
		case 2: // '\002'
			c1.e();
	//   27   83:aload_2         
	//   28   84:invokevirtual   #210 <Method void c.e()>
			break;

	//*  29   87:goto            100
		case 1: // '\001'
			j.a(c1);
	//   30   90:aload_0         
	//   31   91:getfield        #96  <Field az j>
	//   32   94:aload_2         
	//   33   95:invokeinterface #208 <Method void biz.bookdesign.catalogbase.az.a(biz.bookdesign.catalogbase.c)>
			break;
		}
		e.b("");
	//   34  100:aload_0         
	//   35  101:getfield        #139 <Field ba e>
	//   36  104:ldc1            #153 <String "">
	//   37  106:invokevirtual   #157 <Method void ba.b(String)>
	//   38  109:return          
	}

	void a(ViewGroup viewgroup)
	{
		Button button = (Button)viewgroup.findViewById(bi.open_button);
	//    0    0:aload_1         
	//    1    1:getstatic       #216 <Field int bi.open_button>
	//    2    4:invokevirtual   #222 <Method View ViewGroup.findViewById(int)>
	//    3    7:checkcast       #224 <Class Button>
	//    4   10:astore_2        
		RecyclerView recyclerview = (RecyclerView)viewgroup.findViewById(bi.listings);
	//    5   11:aload_1         
	//    6   12:getstatic       #227 <Field int bi.listings>
	//    7   15:invokevirtual   #222 <Method View ViewGroup.findViewById(int)>
	//    8   18:checkcast       #229 <Class RecyclerView>
	//    9   21:astore_3        
		viewgroup = ((ViewGroup) (viewgroup.findViewById(bi.books)));
	//   10   22:aload_1         
	//   11   23:getstatic       #232 <Field int bi.books>
	//   12   26:invokevirtual   #222 <Method View ViewGroup.findViewById(int)>
	//   13   29:astore_1        
		button.animate().scaleX(0.0F).setInterpolator(((android.animation.TimeInterpolator) (new AccelerateDecelerateInterpolator()))).setDuration(150L);
	//   14   30:aload_2         
	//   15   31:invokevirtual   #236 <Method ViewPropertyAnimator Button.animate()>
	//   16   34:fconst_0        
	//   17   35:invokevirtual   #242 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleX(float)>
	//   18   38:new             #244 <Class AccelerateDecelerateInterpolator>
	//   19   41:dup             
	//   20   42:invokespecial   #245 <Method void AccelerateDecelerateInterpolator()>
	//   21   45:invokevirtual   #249 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   22   48:ldc2w           #250 <Long 150L>
	//   23   51:invokevirtual   #255 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   24   54:pop             
		((View) (viewgroup)).animate().scaleY(0.0F).setInterpolator(((android.animation.TimeInterpolator) (new AccelerateDecelerateInterpolator()))).setDuration(150L).setListener(((android.animation.Animator.AnimatorListener) (new au(this, button, recyclerview, ((View) (viewgroup))))));
	//   25   55:aload_1         
	//   26   56:invokevirtual   #258 <Method ViewPropertyAnimator View.animate()>
	//   27   59:fconst_0        
	//   28   60:invokevirtual   #261 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleY(float)>
	//   29   63:new             #244 <Class AccelerateDecelerateInterpolator>
	//   30   66:dup             
	//   31   67:invokespecial   #245 <Method void AccelerateDecelerateInterpolator()>
	//   32   70:invokevirtual   #249 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   33   73:ldc2w           #250 <Long 150L>
	//   34   76:invokevirtual   #255 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   35   79:new             #263 <Class au>
	//   36   82:dup             
	//   37   83:aload_0         
	//   38   84:aload_2         
	//   39   85:aload_3         
	//   40   86:aload_1         
	//   41   87:invokespecial   #266 <Method void au(ak, Button, RecyclerView, View)>
	//   42   90:invokevirtual   #270 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   43   93:pop             
	//   44   94:return          
	}

	public void a(az az1)
	{
		j = az1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field az j>
	//    3    5:return          
	}

	public void a(u u1, ay ay1, bm bm)
	{
		f = ay1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #272 <Field ay f>
		g = u1;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #99  <Field u g>
		h = bm;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #151 <Field bm h>
		i = biz.bookdesign.catalogbase.a.g().b(u1);
	//    9   15:aload_0         
	//   10   16:invokestatic    #277 <Method biz.bookdesign.catalogbase.a a.g()>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #280 <Method boolean a.b(u)>
	//   13   23:putfield        #34  <Field boolean i>
		setRetainInstance(true);
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #284 <Method void setRetainInstance(boolean)>
	//   17   31:return          
	}

	void a(Object obj)
	{
		obj = ((Object) (b(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #289 <Method u b(Object)>
	//    3    5:astore_1        
		try
		{
			f.a(((u) (obj)));
	//    4    6:aload_0         
	//    5    7:getfield        #272 <Field ay f>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #294 <Method void biz.bookdesign.catalogbase.ay.a(u)>
		}
	//*   8   14:goto            22
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   9   17:astore_1        
		{
			com.crashlytics.android.a.a(((Throwable) (obj)));
	//   10   18:aload_1         
	//   11   19:invokestatic    #299 <Method void a.a(Throwable)>
		}
		dismiss();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #302 <Method void dismiss()>
	//   14   26:return          
	}

	void a(Object obj, ViewGroup viewgroup)
	{
		Button button = (Button)viewgroup.findViewById(bi.open_button);
	//    0    0:aload_2         
	//    1    1:getstatic       #216 <Field int bi.open_button>
	//    2    4:invokevirtual   #222 <Method View ViewGroup.findViewById(int)>
	//    3    7:checkcast       #224 <Class Button>
	//    4   10:astore          4
		RecyclerView recyclerview = (RecyclerView)viewgroup.findViewById(bi.listings);
	//    5   12:aload_2         
	//    6   13:getstatic       #227 <Field int bi.listings>
	//    7   16:invokevirtual   #222 <Method View ViewGroup.findViewById(int)>
	//    8   19:checkcast       #229 <Class RecyclerView>
	//    9   22:astore_3        
		View view = viewgroup.findViewById(bi.books);
	//   10   23:aload_2         
	//   11   24:getstatic       #232 <Field int bi.books>
	//   12   27:invokevirtual   #222 <Method View ViewGroup.findViewById(int)>
	//   13   30:astore          5
		button.setScaleX(0.0F);
	//   14   32:aload           4
	//   15   34:fconst_0        
	//   16   35:invokevirtual   #307 <Method void Button.setScaleX(float)>
		button.animate().scaleX(1.0F).setInterpolator(((android.animation.TimeInterpolator) (new AccelerateDecelerateInterpolator()))).setDuration(150L);
	//   17   38:aload           4
	//   18   40:invokevirtual   #236 <Method ViewPropertyAnimator Button.animate()>
	//   19   43:fconst_1        
	//   20   44:invokevirtual   #242 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleX(float)>
	//   21   47:new             #244 <Class AccelerateDecelerateInterpolator>
	//   22   50:dup             
	//   23   51:invokespecial   #245 <Method void AccelerateDecelerateInterpolator()>
	//   24   54:invokevirtual   #249 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   25   57:ldc2w           #250 <Long 150L>
	//   26   60:invokevirtual   #255 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   27   63:pop             
		view.setScaleY(0.0F);
	//   28   64:aload           5
	//   29   66:fconst_0        
	//   30   67:invokevirtual   #310 <Method void View.setScaleY(float)>
		view.animate().scaleY(1.0F).setInterpolator(((android.animation.TimeInterpolator) (new AccelerateDecelerateInterpolator()))).setDuration(150L).setListener(((android.animation.Animator.AnimatorListener) (new as(this, view, button))));
	//   31   70:aload           5
	//   32   72:invokevirtual   #258 <Method ViewPropertyAnimator View.animate()>
	//   33   75:fconst_1        
	//   34   76:invokevirtual   #261 <Method ViewPropertyAnimator ViewPropertyAnimator.scaleY(float)>
	//   35   79:new             #244 <Class AccelerateDecelerateInterpolator>
	//   36   82:dup             
	//   37   83:invokespecial   #245 <Method void AccelerateDecelerateInterpolator()>
	//   38   86:invokevirtual   #249 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   39   89:ldc2w           #250 <Long 150L>
	//   40   92:invokevirtual   #255 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   41   95:new             #312 <Class as>
	//   42   98:dup             
	//   43   99:aload_0         
	//   44  100:aload           5
	//   45  102:aload           4
	//   46  104:invokespecial   #315 <Method void as(ak, View, Button)>
	//   47  107:invokevirtual   #270 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   48  110:pop             
		view.setVisibility(0);
	//   49  111:aload           5
	//   50  113:iconst_0        
	//   51  114:invokevirtual   #318 <Method void View.setVisibility(int)>
		button.setVisibility(0);
	//   52  117:aload           4
	//   53  119:iconst_0        
	//   54  120:invokevirtual   #319 <Method void Button.setVisibility(int)>
		button.setOnClickListener(((android.view.View.OnClickListener) (new at(this, obj))));
	//   55  123:aload           4
	//   56  125:new             #321 <Class at>
	//   57  128:dup             
	//   58  129:aload_0         
	//   59  130:aload_1         
	//   60  131:invokespecial   #324 <Method void at(ak, Object)>
	//   61  134:invokevirtual   #328 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		obj = ((Object) (new i(h, b(obj), getActivity(), viewgroup, false, ((q) (null)))));
	//   62  137:new             #330 <Class i>
	//   63  140:dup             
	//   64  141:aload_0         
	//   65  142:getfield        #151 <Field bm h>
	//   66  145:aload_0         
	//   67  146:aload_1         
	//   68  147:invokespecial   #289 <Method u b(Object)>
	//   69  150:aload_0         
	//   70  151:invokevirtual   #334 <Method x getActivity()>
	//   71  154:aload_2         
	//   72  155:iconst_0        
	//   73  156:aconst_null     
	//   74  157:invokespecial   #337 <Method void i(bm, u, x, ViewGroup, boolean, q)>
	//   75  160:astore_1        
		recyclerview.setRecycledViewPool(l);
	//   76  161:aload_3         
	//   77  162:aload_0         
	//   78  163:getfield        #39  <Field android.support.v7.widget.RecyclerView$RecycledViewPool l>
	//   79  166:invokevirtual   #341 <Method void RecyclerView.setRecycledViewPool(android.support.v7.widget.RecyclerView$RecycledViewPool)>
		recyclerview.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (obj)));
	//   80  169:aload_3         
	//   81  170:aload_1         
	//   82  171:invokevirtual   #345 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
	//   83  174:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field u g>
	//*   2    4:ifnonnull       19
		{
			com.crashlytics.android.a.a(5, "BookDesign Catalog", "Unable to re-create PickerDialog");
	//    3    7:iconst_5        
	//    4    8:ldc2            #349 <String "BookDesign Catalog">
	//    5   11:ldc2            #351 <String "Unable to re-create PickerDialog">
	//    6   14:invokestatic    #354 <Method void a.a(int, String, String)>
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
		}
		c = layoutinflater.inflate(bj.picker_dialog, viewgroup);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:getstatic       #359 <Field int bj.picker_dialog>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #365 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   14   28:putfield        #145 <Field View c>
		b = (ListView)c.findViewById(bi.result_list);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #145 <Field View c>
	//   18   36:getstatic       #368 <Field int bi.result_list>
	//   19   39:invokevirtual   #369 <Method View View.findViewById(int)>
	//   20   42:checkcast       #371 <Class ListView>
	//   21   45:putfield        #148 <Field ListView b>
		e = new ba(this);
	//   22   48:aload_0         
	//   23   49:new             #155 <Class ba>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:invokespecial   #374 <Method void ba(ak)>
	//   27   57:putfield        #139 <Field ba e>
		layoutinflater = ((LayoutInflater) ((ImageButton)c.findViewById(bi.filter_button)));
	//   28   60:aload_0         
	//   29   61:getfield        #145 <Field View c>
	//   30   64:getstatic       #377 <Field int bi.filter_button>
	//   31   67:invokevirtual   #369 <Method View View.findViewById(int)>
	//   32   70:checkcast       #379 <Class ImageButton>
	//   33   73:astore_1        
		viewgroup = ((ViewGroup) ((ImageButton)c.findViewById(bi.add_button)));
	//   34   74:aload_0         
	//   35   75:getfield        #145 <Field View c>
	//   36   78:getstatic       #382 <Field int bi.add_button>
	//   37   81:invokevirtual   #369 <Method View View.findViewById(int)>
	//   38   84:checkcast       #379 <Class ImageButton>
	//   39   87:astore_2        
		if(k != null)
	//*  40   88:aload_0         
	//*  41   89:getfield        #49  <Field Callable k>
	//*  42   92:ifnull          112
		{
			((ImageButton) (layoutinflater)).setVisibility(0);
	//   43   95:aload_1         
	//   44   96:iconst_0        
	//   45   97:invokevirtual   #383 <Method void ImageButton.setVisibility(int)>
			((ImageButton) (layoutinflater)).setOnClickListener(((android.view.View.OnClickListener) (new al(this))));
	//   46  100:aload_1         
	//   47  101:new             #385 <Class al>
	//   48  104:dup             
	//   49  105:aload_0         
	//   50  106:invokespecial   #386 <Method void al(ak)>
	//   51  109:invokevirtual   #387 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		}
		if(j != null)
	//*  52  112:aload_0         
	//*  53  113:getfield        #96  <Field az j>
	//*  54  116:ifnull          136
		{
			((ImageButton) (viewgroup)).setVisibility(0);
	//   55  119:aload_2         
	//   56  120:iconst_0        
	//   57  121:invokevirtual   #383 <Method void ImageButton.setVisibility(int)>
			((ImageButton) (viewgroup)).setOnClickListener(((android.view.View.OnClickListener) (new an(this))));
	//   58  124:aload_2         
	//   59  125:new             #389 <Class an>
	//   60  128:dup             
	//   61  129:aload_0         
	//   62  130:invokespecial   #390 <Method void an(ak)>
	//   63  133:invokevirtual   #387 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		}
		b.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (new ao(this))));
	//   64  136:aload_0         
	//   65  137:getfield        #148 <Field ListView b>
	//   66  140:new             #392 <Class ao>
	//   67  143:dup             
	//   68  144:aload_0         
	//   69  145:invokespecial   #393 <Method void ao(ak)>
	//   70  148:invokevirtual   #397 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		b.setOnScrollListener(((android.widget.AbsListView.OnScrollListener) (new ap(this))));
	//   71  151:aload_0         
	//   72  152:getfield        #148 <Field ListView b>
	//   73  155:new             #399 <Class ap>
	//   74  158:dup             
	//   75  159:aload_0         
	//   76  160:invokespecial   #400 <Method void ap(ak)>
	//   77  163:invokevirtual   #404 <Method void ListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
		layoutinflater = ((LayoutInflater) ((EditText)c.findViewById(bi.search_box)));
	//   78  166:aload_0         
	//   79  167:getfield        #145 <Field View c>
	//   80  170:getstatic       #407 <Field int bi.search_box>
	//   81  173:invokevirtual   #369 <Method View View.findViewById(int)>
	//   82  176:checkcast       #409 <Class EditText>
	//   83  179:astore_1        
		bundle = ((Bundle) (PreferenceManager.getDefaultSharedPreferences(((Context) (getActivity())))));
	//   84  180:aload_0         
	//   85  181:invokevirtual   #334 <Method x getActivity()>
	//   86  184:invokestatic    #415 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//   87  187:astore_3        
		viewgroup = ((ViewGroup) (((SharedPreferences) (bundle)).edit()));
	//   88  188:aload_3         
	//   89  189:invokeinterface #420 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   90  194:astore_2        
		Object obj = ((Object) (new StringBuilder()));
	//   91  195:new             #75  <Class StringBuilder>
	//   92  198:dup             
	//   93  199:invokespecial   #76  <Method void StringBuilder()>
	//   94  202:astore          6
		((StringBuilder) (obj)).append("categorySearchString");
	//   95  204:aload           6
	//   96  206:ldc2            #422 <String "categorySearchString">
	//   97  209:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   98  212:pop             
		((StringBuilder) (obj)).append(g.a());
	//   99  213:aload           6
	//  100  215:aload_0         
	//  101  216:getfield        #99  <Field u g>
	//  102  219:invokevirtual   #65  <Method int biz.bookdesign.catalogbase.u.a()>
	//  103  222:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//  104  225:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  105  226:aload           6
	//  106  228:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  107  231:astore          6
		bundle = ((Bundle) (((SharedPreferences) (bundle)).getString(((String) (obj)), "")));
	//  108  233:aload_3         
	//  109  234:aload           6
	//  110  236:ldc1            #153 <String "">
	//  111  238:invokeinterface #426 <Method String SharedPreferences.getString(String, String)>
	//  112  243:astore_3        
		((EditText) (layoutinflater)).setText(((CharSequence) (bundle)));
	//  113  244:aload_1         
	//  114  245:aload_3         
	//  115  246:invokevirtual   #430 <Method void EditText.setText(CharSequence)>
		e.a(((String) (bundle)));
	//  116  249:aload_0         
	//  117  250:getfield        #139 <Field ba e>
	//  118  253:aload_3         
	//  119  254:invokevirtual   #432 <Method void biz.bookdesign.catalogbase.ba.a(String)>
		((EditText) (layoutinflater)).addTextChangedListener(((android.text.TextWatcher) (new aq(this, ((android.content.SharedPreferences.Editor) (viewgroup)), ((String) (obj))))));
	//  120  257:aload_1         
	//  121  258:new             #434 <Class aq>
	//  122  261:dup             
	//  123  262:aload_0         
	//  124  263:aload_2         
	//  125  264:aload           6
	//  126  266:invokespecial   #437 <Method void aq(ak, android.content.SharedPreferences$Editor, String)>
	//  127  269:invokevirtual   #441 <Method void EditText.addTextChangedListener(android.text.TextWatcher)>
		((EditText) (layoutinflater)).setImeActionLabel(((CharSequence) (getString(0x104000c))), 66);
	//  128  272:aload_1         
	//  129  273:aload_0         
	//  130  274:ldc2            #442 <Int 0x104000c>
	//  131  277:invokevirtual   #445 <Method String getString(int)>
	//  132  280:bipush          66
	//  133  282:invokevirtual   #449 <Method void EditText.setImeActionLabel(CharSequence, int)>
		((EditText) (layoutinflater)).setOnEditorActionListener(((android.widget.TextView.OnEditorActionListener) (new ar(this, ((EditText) (layoutinflater))))));
	//  134  285:aload_1         
	//  135  286:new             #451 <Class ar>
	//  136  289:dup             
	//  137  290:aload_0         
	//  138  291:aload_1         
	//  139  292:invokespecial   #454 <Method void ar(ak, EditText)>
	//  140  295:invokevirtual   #458 <Method void EditText.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
		int i1 = g.a();
	//  141  298:aload_0         
	//  142  299:getfield        #99  <Field u g>
	//  143  302:invokevirtual   #65  <Method int biz.bookdesign.catalogbase.u.a()>
	//  144  305:istore          4
		if(i1 != 12)
	//* 145  307:iload           4
	//* 146  309:bipush          12
	//* 147  311:icmpeq          398
			switch(i1)
	//* 148  314:iload           4
			{
	//* 149  316:tableswitch     4 5: default 340
	//	               4 387
	//	               5 376
			default:
				layoutinflater = ((LayoutInflater) (new StringBuilder()));
	//  150  340:new             #75  <Class StringBuilder>
	//  151  343:dup             
	//  152  344:invokespecial   #76  <Method void StringBuilder()>
	//  153  347:astore_1        
				((StringBuilder) (layoutinflater)).append("Unsupported type ");
	//  154  348:aload_1         
	//  155  349:ldc1            #101 <String "Unsupported type ">
	//  156  351:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  157  354:pop             
				((StringBuilder) (layoutinflater)).append(((Object) (g)));
	//  158  355:aload_1         
	//  159  356:aload_0         
	//  160  357:getfield        #99  <Field u g>
	//  161  360:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//  162  363:pop             
				throw new UnsupportedOperationException(((StringBuilder) (layoutinflater)).toString());
	//  163  364:new             #106 <Class UnsupportedOperationException>
	//  164  367:dup             
	//  165  368:aload_1         
	//  166  369:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  167  372:invokespecial   #109 <Method void UnsupportedOperationException(String)>
	//  168  375:athrow          

			case 5: // '\005'
				layoutinflater = ((LayoutInflater) (getString(bk.select_author)));
	//  169  376:aload_0         
	//  170  377:getstatic       #461 <Field int bk.select_author>
	//  171  380:invokevirtual   #445 <Method String getString(int)>
	//  172  383:astore_1        
				break;

	//* 173  384:goto            406
			case 4: // '\004'
				layoutinflater = ((LayoutInflater) (getString(bk.select_genre)));
	//  174  387:aload_0         
	//  175  388:getstatic       #464 <Field int bk.select_genre>
	//  176  391:invokevirtual   #445 <Method String getString(int)>
	//  177  394:astore_1        
				break;
			}
		else
	//* 178  395:goto            406
			layoutinflater = ((LayoutInflater) (getString(bk.select_list)));
	//  179  398:aload_0         
	//  180  399:getstatic       #467 <Field int bk.select_list>
	//  181  402:invokevirtual   #445 <Method String getString(int)>
	//  182  405:astore_1        
		viewgroup = ((ViewGroup) (getDialog().getContext()));
	//  183  406:aload_0         
	//  184  407:invokevirtual   #471 <Method Dialog getDialog()>
	//  185  410:invokevirtual   #477 <Method Context Dialog.getContext()>
	//  186  413:astore_2        
		i1 = android.support.v4.a.c.c(((Context) (viewgroup)), bf.lv_accent);
	//  187  414:aload_2         
	//  188  415:getstatic       #482 <Field int bf.lv_accent>
	//  189  418:invokestatic    #487 <Method int c.c(Context, int)>
	//  190  421:istore          4
		bundle = ((Bundle) (new SpannableString(((CharSequence) (layoutinflater)))));
	//  191  423:new             #489 <Class SpannableString>
	//  192  426:dup             
	//  193  427:aload_1         
	//  194  428:invokespecial   #491 <Method void SpannableString(CharSequence)>
	//  195  431:astore_3        
		((SpannableString) (bundle)).setSpan(((Object) (new ForegroundColorSpan(i1))), 0, ((String) (layoutinflater)).length(), 33);
	//  196  432:aload_3         
	//  197  433:new             #493 <Class ForegroundColorSpan>
	//  198  436:dup             
	//  199  437:iload           4
	//  200  439:invokespecial   #494 <Method void ForegroundColorSpan(int)>
	//  201  442:iconst_0        
	//  202  443:aload_1         
	//  203  444:invokevirtual   #499 <Method int String.length()>
	//  204  447:bipush          33
	//  205  449:invokevirtual   #503 <Method void SpannableString.setSpan(Object, int, int, int)>
		getDialog().setTitle(((CharSequence) (bundle)));
	//  206  452:aload_0         
	//  207  453:invokevirtual   #471 <Method Dialog getDialog()>
	//  208  456:aload_3         
	//  209  457:invokevirtual   #506 <Method void Dialog.setTitle(CharSequence)>
		int j1 = ((Context) (viewgroup)).getResources().getIdentifier("android:id/titleDivider", ((String) (null)), ((String) (null)));
	//  210  460:aload_2         
	//  211  461:invokevirtual   #512 <Method Resources Context.getResources()>
	//  212  464:ldc2            #514 <String "android:id/titleDivider">
	//  213  467:aconst_null     
	//  214  468:aconst_null     
	//  215  469:invokevirtual   #520 <Method int Resources.getIdentifier(String, String, String)>
	//  216  472:istore          5
		layoutinflater = ((LayoutInflater) (getDialog().findViewById(j1)));
	//  217  474:aload_0         
	//  218  475:invokevirtual   #471 <Method Dialog getDialog()>
	//  219  478:iload           5
	//  220  480:invokevirtual   #521 <Method View Dialog.findViewById(int)>
	//  221  483:astore_1        
		if(layoutinflater != null)
	//* 222  484:aload_1         
	//* 223  485:ifnull          494
			((View) (layoutinflater)).setBackgroundColor(i1);
	//  224  488:aload_1         
	//  225  489:iload           4
	//  226  491:invokevirtual   #524 <Method void View.setBackgroundColor(int)>
		return c;
	//  227  494:aload_0         
	//  228  495:getfield        #145 <Field View c>
	//  229  498:areturn         
	}

	public void onDismiss(DialogInterface dialoginterface)
	{
		super.onDismiss(dialoginterface);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #528 <Method void p.onDismiss(DialogInterface)>
		try
		{
			f.call();
	//    3    5:aload_0         
	//    4    6:getfield        #272 <Field ay f>
	//    5    9:invokevirtual   #532 <Method Object ay.call()>
	//    6   12:pop             
			return;
	//    7   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(DialogInterface dialoginterface)
	//*   8   14:astore_1        
		{
			return;
	//    9   15:return          
		}
	}

	private List a;
	private ListView b;
	private View c;
	private ArrayAdapter d;
	private ba e;
	private ay f;
	private u g;
	private bm h;
	private boolean i;
	private az j;
	private Callable k;
	private final android.support.v7.widget.RecyclerView.RecycledViewPool l = new android.support.v7.widget.RecyclerView.RecycledViewPool();
}
