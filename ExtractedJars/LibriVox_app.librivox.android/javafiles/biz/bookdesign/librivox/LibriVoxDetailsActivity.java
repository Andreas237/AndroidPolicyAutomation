// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.Dialog;
import android.app.SearchManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.SearchRecentSuggestions;
import android.support.v4.a.g;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.Button;
import biz.bookdesign.catalogbase.*;
import biz.bookdesign.catalogbase.support.GridAutofitLayoutManager;
import biz.bookdesign.catalogbase.u;
import biz.bookdesign.librivox.a.b;
import biz.bookdesign.librivox.a.f;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.a.j;
import java.util.List;

// Referenced classes of package biz.bookdesign.librivox:
//			ao, bz, ga, ck, 
//			ce, bw, cd, cj, 
//			ca, ch, cb, cc, 
//			ci

public class LibriVoxDetailsActivity extends ao
{

	public LibriVoxDetailsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void ao()>
		h = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #25  <Field boolean h>
		l = ((q) (new bz(this)));
	//    5    9:aload_0         
	//    6   10:new             #27  <Class bz>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #30  <Method void bz(LibriVoxDetailsActivity)>
	//   10   18:putfield        #32  <Field q l>
	//   11   21:return          
	}

	static int a(LibriVoxDetailsActivity librivoxdetailsactivity, int i1)
	{
		librivoxdetailsactivity.k = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field int k>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static r a(LibriVoxDetailsActivity librivoxdetailsactivity)
	{
		return librivoxdetailsactivity.i;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field r i>
	//    2    4:areturn         
	}

	static u a(LibriVoxDetailsActivity librivoxdetailsactivity, u u1)
	{
		librivoxdetailsactivity.a = u1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field u a>
		return u1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static ci a(LibriVoxDetailsActivity librivoxdetailsactivity, ci ci1)
	{
		librivoxdetailsactivity.g = ci1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field ci g>
		return ci1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(RecyclerView recyclerview)
	{
		ViewGroup viewgroup = (ViewGroup)recyclerview.getRootView();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method View RecyclerView.getRootView()>
	//    2    4:checkcast       #54  <Class ViewGroup>
	//    3    7:astore          4
		List list = biz.bookdesign.librivox.ga.b();
	//    4    9:invokestatic    #59  <Method List biz.bookdesign.librivox.ga.b()>
	//    5   12:astore_2        
		if(a.b() != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #42  <Field u a>
	//*   8   17:invokevirtual   #64  <Method String u.b()>
	//*   9   20:ifnull          34
			list.add(((Object) (a)));
	//   10   23:aload_2         
	//   11   24:aload_0         
	//   12   25:getfield        #42  <Field u a>
	//   13   28:invokeinterface #70  <Method boolean List.add(Object)>
	//   14   33:pop             
		ck ck1 = new ck(this, getSupportActionBar().getThemedContext(), i.spinner_row_base, list);
	//   15   34:new             #72  <Class ck>
	//   16   37:dup             
	//   17   38:aload_0         
	//   18   39:aload_0         
	//   19   40:invokevirtual   #76  <Method ActionBar getSupportActionBar()>
	//   20   43:invokevirtual   #82  <Method android.content.Context ActionBar.getThemedContext()>
	//   21   46:getstatic       #87  <Field int i.spinner_row_base>
	//   22   49:aload_2         
	//   23   50:invokespecial   #90  <Method void ck(LibriVoxDetailsActivity, android.content.Context, int, List)>
	//   24   53:astore_3        
		((ArrayAdapter) (ck1)).setDropDownViewResource(i.spinner_row);
	//   25   54:aload_3         
	//   26   55:getstatic       #93  <Field int i.spinner_row>
	//   27   58:invokevirtual   #99  <Method void ArrayAdapter.setDropDownViewResource(int)>
		recyclerview = ((RecyclerView) (new ce(this, recyclerview, viewgroup, list)));
	//   28   61:new             #101 <Class ce>
	//   29   64:dup             
	//   30   65:aload_0         
	//   31   66:aload_1         
	//   32   67:aload           4
	//   33   69:aload_2         
	//   34   70:invokespecial   #104 <Method void ce(LibriVoxDetailsActivity, RecyclerView, ViewGroup, List)>
	//   35   73:astore_1        
		getSupportActionBar().setListNavigationCallbacks(((android.widget.SpinnerAdapter) (ck1)), ((android.support.v7.app.ActionBar.OnNavigationListener) (recyclerview)));
	//   36   74:aload_0         
	//   37   75:invokevirtual   #76  <Method ActionBar getSupportActionBar()>
	//   38   78:aload_3         
	//   39   79:aload_1         
	//   40   80:invokevirtual   #108 <Method void ActionBar.setListNavigationCallbacks(android.widget.SpinnerAdapter, android.support.v7.app.ActionBar$OnNavigationListener)>
		getSupportActionBar().setSelectedNavigationItem(list.indexOf(((Object) (a))));
	//   41   83:aload_0         
	//   42   84:invokevirtual   #76  <Method ActionBar getSupportActionBar()>
	//   43   87:aload_2         
	//   44   88:aload_0         
	//   45   89:getfield        #42  <Field u a>
	//   46   92:invokeinterface #112 <Method int List.indexOf(Object)>
	//   47   97:invokevirtual   #115 <Method void ActionBar.setSelectedNavigationItem(int)>
	//   48  100:return          
	}

	static void a(LibriVoxDetailsActivity librivoxdetailsactivity, RecyclerView recyclerview)
	{
		librivoxdetailsactivity.a(recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #118 <Method void a(RecyclerView)>
	//    3    5:return          
	}

	private boolean a(int i1)
	{
		boolean flag1 = g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method boolean g()>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(flag1)
	//*   5    7:iload_3         
	//*   6    8:ifeq            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(i1 % j == 0)
	//*   9   13:iload_1         
	//*  10   14:aload_0         
	//*  11   15:getfield        #124 <Field int j>
	//*  12   18:irem            
	//*  13   19:ifne            24
			flag = true;
	//   14   22:iconst_1        
	//   15   23:istore_2        
		return flag;
	//   16   24:iload_2         
	//   17   25:ireturn         
	}

	private int b(int i1)
	{
		if(g())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #122 <Method boolean g()>
	//*   2    4:ifeq            9
			return i1;
	//    3    7:iload_1         
	//    4    8:ireturn         
		else
			return i1 - (i1 / j + 1);
	//    5    9:iload_1         
	//    6   10:iload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #124 <Field int j>
	//    9   15:idiv            
	//   10   16:iconst_1        
	//   11   17:iadd            
	//   12   18:isub            
	//   13   19:ireturn         
	}

	static int b(LibriVoxDetailsActivity librivoxdetailsactivity)
	{
		return librivoxdetailsactivity.k;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int k>
	//    2    4:ireturn         
	}

	static int b(LibriVoxDetailsActivity librivoxdetailsactivity, int i1)
	{
		librivoxdetailsactivity.j = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field int j>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static u c(LibriVoxDetailsActivity librivoxdetailsactivity)
	{
		return librivoxdetailsactivity.a;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field u a>
	//    2    4:areturn         
	}

	static boolean c(LibriVoxDetailsActivity librivoxdetailsactivity, int i1)
	{
		return librivoxdetailsactivity.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #131 <Method boolean a(int)>
	//    3    5:ireturn         
	}

	static int d(LibriVoxDetailsActivity librivoxdetailsactivity, int i1)
	{
		return librivoxdetailsactivity.b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #134 <Method int b(int)>
	//    3    5:ireturn         
	}

	static ci d(LibriVoxDetailsActivity librivoxdetailsactivity)
	{
		return librivoxdetailsactivity.g;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ci g>
	//    2    4:areturn         
	}

	static q e(LibriVoxDetailsActivity librivoxdetailsactivity)
	{
		return librivoxdetailsactivity.l;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field q l>
	//    2    4:areturn         
	}

	static boolean f(LibriVoxDetailsActivity librivoxdetailsactivity)
	{
		return librivoxdetailsactivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method boolean g()>
	//    2    4:ireturn         
	}

	static int g(LibriVoxDetailsActivity librivoxdetailsactivity)
	{
		return librivoxdetailsactivity.j;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int j>
	//    2    4:ireturn         
	}

	private boolean g()
	{
		return j == 0 || biz.bookdesign.librivox.bw.g().e() == null;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int j>
	//    2    4:ifeq            21
	//    3    7:invokestatic    #144 <Method a biz.bookdesign.librivox.bw.g()>
	//    4   10:invokevirtual   #148 <Method String a.e()>
	//    5   13:ifnonnull       19
	//    6   16:goto            21
	//    7   19:iconst_0        
	//    8   20:ireturn         
	//    9   21:iconst_1        
	//   10   22:ireturn         
	}

	void a()
	{
		Dialog dialog = new Dialog(((android.content.Context) (this)));
	//    0    0:new             #150 <Class Dialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #153 <Method void Dialog(android.content.Context)>
	//    4    8:astore_1        
		dialog.requestWindowFeature(1);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #156 <Method boolean Dialog.requestWindowFeature(int)>
	//    8   14:pop             
		dialog.getWindow().setBackgroundDrawable(((android.graphics.drawable.Drawable) (new ColorDrawable(0))));
	//    9   15:aload_1         
	//   10   16:invokevirtual   #160 <Method Window Dialog.getWindow()>
	//   11   19:new             #162 <Class ColorDrawable>
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:invokespecial   #164 <Method void ColorDrawable(int)>
	//   15   27:invokevirtual   #170 <Method void Window.setBackgroundDrawable(android.graphics.drawable.Drawable)>
		dialog.setContentView(i.coach_mark_catalog_details);
	//   16   30:aload_1         
	//   17   31:getstatic       #173 <Field int i.coach_mark_catalog_details>
	//   18   34:invokevirtual   #176 <Method void Dialog.setContentView(int)>
		dialog.setCanceledOnTouchOutside(true);
	//   19   37:aload_1         
	//   20   38:iconst_1        
	//   21   39:invokevirtual   #180 <Method void Dialog.setCanceledOnTouchOutside(boolean)>
		Object obj = ((Object) (new cd(this, dialog)));
	//   22   42:new             #182 <Class cd>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokespecial   #185 <Method void cd(LibriVoxDetailsActivity, Dialog)>
	//   27   51:astore_2        
		dialog.findViewById(h.coach_mark_master_view).setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//   28   52:aload_1         
	//   29   53:getstatic       #190 <Field int h.coach_mark_master_view>
	//   30   56:invokevirtual   #194 <Method View Dialog.findViewById(int)>
	//   31   59:aload_2         
	//   32   60:invokevirtual   #200 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		((Button)dialog.findViewById(h.got_it)).setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//   33   63:aload_1         
	//   34   64:getstatic       #203 <Field int h.got_it>
	//   35   67:invokevirtual   #194 <Method View Dialog.findViewById(int)>
	//   36   70:checkcast       #205 <Class Button>
	//   37   73:aload_2         
	//   38   74:invokevirtual   #206 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		obj = ((Object) (new android.view.WindowManager.LayoutParams()));
	//   39   77:new             #208 <Class android.view.WindowManager$LayoutParams>
	//   40   80:dup             
	//   41   81:invokespecial   #209 <Method void android.view.WindowManager$LayoutParams()>
	//   42   84:astore_2        
		((android.view.WindowManager.LayoutParams) (obj)).copyFrom(dialog.getWindow().getAttributes());
	//   43   85:aload_2         
	//   44   86:aload_1         
	//   45   87:invokevirtual   #160 <Method Window Dialog.getWindow()>
	//   46   90:invokevirtual   #213 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   47   93:invokevirtual   #217 <Method int android.view.WindowManager$LayoutParams.copyFrom(android.view.WindowManager$LayoutParams)>
	//   48   96:pop             
		obj.width = -1;
	//   49   97:aload_2         
	//   50   98:iconst_m1       
	//   51   99:putfield        #220 <Field int android.view.WindowManager$LayoutParams.width>
		obj.height = -1;
	//   52  102:aload_2         
	//   53  103:iconst_m1       
	//   54  104:putfield        #223 <Field int android.view.WindowManager$LayoutParams.height>
		dialog.show();
	//   55  107:aload_1         
	//   56  108:invokevirtual   #226 <Method void Dialog.show()>
		dialog.getWindow().setAttributes(((android.view.WindowManager.LayoutParams) (obj)));
	//   57  111:aload_1         
	//   58  112:invokevirtual   #160 <Method Window Dialog.getWindow()>
	//   59  115:aload_2         
	//   60  116:invokevirtual   #230 <Method void Window.setAttributes(android.view.WindowManager$LayoutParams)>
	//   61  119:return          
	}

	public boolean onContextItemSelected(MenuItem menuitem)
	{
		return i.a(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field r i>
	//    2    4:aload_1         
	//    3    5:invokeinterface #236 <Method boolean r.a(MenuItem)>
	//    4   10:ireturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #240 <Method void ao.onCreate(Bundle)>
		setContentView(i.librivox_details);
	//    3    5:aload_0         
	//    4    6:getstatic       #243 <Field int i.librivox_details>
	//    5    9:invokevirtual   #244 <Method void setContentView(int)>
		bundle = ((Bundle) (getSupportActionBar()));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #76  <Method ActionBar getSupportActionBar()>
	//    8   16:astore_1        
		if(bundle != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          51
		{
			((ActionBar) (bundle)).setDisplayShowTitleEnabled(false);
	//   11   21:aload_1         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #247 <Method void ActionBar.setDisplayShowTitleEnabled(boolean)>
			((ActionBar) (bundle)).setNavigationMode(1);
	//   14   26:aload_1         
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #250 <Method void ActionBar.setNavigationMode(int)>
			if(isTaskRoot())
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #253 <Method boolean isTaskRoot()>
	//*  19   35:ifeq            46
				((ActionBar) (bundle)).setDisplayHomeAsUpEnabled(false);
	//   20   38:aload_1         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #256 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
			else
	//*  23   43:goto            51
				((ActionBar) (bundle)).setDisplayHomeAsUpEnabled(true);
	//   24   46:aload_1         
	//   25   47:iconst_1        
	//   26   48:invokevirtual   #256 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
		}
		a = u.a(((android.content.Context) (this)), getIntent());
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:aload_0         
	//   30   54:invokevirtual   #260 <Method Intent getIntent()>
	//   31   57:invokestatic    #263 <Method u u.a(android.content.Context, Intent)>
	//   32   60:putfield        #42  <Field u a>
		bundle = ((Bundle) ((RecyclerView)findViewById(h.listings)));
	//   33   63:aload_0         
	//   34   64:getstatic       #266 <Field int h.listings>
	//   35   67:invokevirtual   #267 <Method View findViewById(int)>
	//   36   70:checkcast       #48  <Class RecyclerView>
	//   37   73:astore_1        
		GridAutofitLayoutManager gridautofitlayoutmanager = new GridAutofitLayoutManager(((android.content.Context) (this)), (int)getResources().getDimension(f.triple_module));
	//   38   74:new             #269 <Class GridAutofitLayoutManager>
	//   39   77:dup             
	//   40   78:aload_0         
	//   41   79:aload_0         
	//   42   80:invokevirtual   #273 <Method Resources getResources()>
	//   43   83:getstatic       #278 <Field int f.triple_module>
	//   44   86:invokevirtual   #284 <Method float Resources.getDimension(int)>
	//   45   89:f2i             
	//   46   90:invokespecial   #287 <Method void GridAutofitLayoutManager(android.content.Context, int)>
	//   47   93:astore_2        
		gridautofitlayoutmanager.setSpanSizeLookup(((android.support.v7.widget.GridLayoutManager.SpanSizeLookup) (new cj(this, ((bz) (null))))));
	//   48   94:aload_2         
	//   49   95:new             #289 <Class cj>
	//   50   98:dup             
	//   51   99:aload_0         
	//   52  100:aconst_null     
	//   53  101:invokespecial   #292 <Method void cj(LibriVoxDetailsActivity, bz)>
	//   54  104:invokevirtual   #296 <Method void GridAutofitLayoutManager.setSpanSizeLookup(android.support.v7.widget.GridLayoutManager$SpanSizeLookup)>
		((RecyclerView) (bundle)).setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (gridautofitlayoutmanager)));
	//   55  107:aload_1         
	//   56  108:aload_2         
	//   57  109:invokevirtual   #300 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
		gridautofitlayoutmanager.a(((Runnable) (new ca(this, gridautofitlayoutmanager))));
	//   58  112:aload_2         
	//   59  113:new             #302 <Class ca>
	//   60  116:dup             
	//   61  117:aload_0         
	//   62  118:aload_2         
	//   63  119:invokespecial   #305 <Method void ca(LibriVoxDetailsActivity, GridAutofitLayoutManager)>
	//   64  122:invokevirtual   #308 <Method void GridAutofitLayoutManager.a(Runnable)>
		registerForContextMenu(((View) (bundle)));
	//   65  125:aload_0         
	//   66  126:aload_1         
	//   67  127:invokevirtual   #312 <Method void registerForContextMenu(View)>
		a(((RecyclerView) (bundle)));
	//   68  130:aload_0         
	//   69  131:aload_1         
	//   70  132:invokespecial   #118 <Method void a(RecyclerView)>
		b = new ch(this, ((bz) (null)));
	//   71  135:aload_0         
	//   72  136:new             #314 <Class ch>
	//   73  139:dup             
	//   74  140:aload_0         
	//   75  141:aconst_null     
	//   76  142:invokespecial   #315 <Method void ch(LibriVoxDetailsActivity, bz)>
	//   77  145:putfield        #317 <Field ch b>
		d = android.support.v4.a.g.a(((android.content.Context) (this)));
	//   78  148:aload_0         
	//   79  149:aload_0         
	//   80  150:invokestatic    #322 <Method g g.a(android.content.Context)>
	//   81  153:putfield        #325 <Field g d>
		i = biz.bookdesign.catalogbase.a.g().a(((android.support.v4.app.x) (this)));
	//   82  156:aload_0         
	//   83  157:invokestatic    #326 <Method a a.g()>
	//   84  160:aload_0         
	//   85  161:invokevirtual   #329 <Method r a.a(android.support.v4.app.x)>
	//   86  164:putfield        #39  <Field r i>
		i.a(((Runnable) (new cb(this))));
	//   87  167:aload_0         
	//   88  168:getfield        #39  <Field r i>
	//   89  171:new             #331 <Class cb>
	//   90  174:dup             
	//   91  175:aload_0         
	//   92  176:invokespecial   #332 <Method void cb(LibriVoxDetailsActivity)>
	//   93  179:invokeinterface #333 <Method void r.a(Runnable)>
		i.a(((biz.bookdesign.catalogbase.t) (new cc(this))));
	//   94  184:aload_0         
	//   95  185:getfield        #39  <Field r i>
	//   96  188:new             #335 <Class cc>
	//   97  191:dup             
	//   98  192:aload_0         
	//   99  193:invokespecial   #336 <Method void cc(LibriVoxDetailsActivity)>
	//  100  196:invokeinterface #339 <Method void r.a(biz.bookdesign.catalogbase.t)>
	//  101  201:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(j.catalog_details, menu);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #345 <Method MenuInflater getMenuInflater()>
	//    2    4:getstatic       #350 <Field int j.catalog_details>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #356 <Method void MenuInflater.inflate(int, Menu)>
		SearchManager searchmanager = (SearchManager)getSystemService("search");
	//    5   11:aload_0         
	//    6   12:ldc2            #358 <String "search">
	//    7   15:invokevirtual   #362 <Method Object getSystemService(String)>
	//    8   18:checkcast       #364 <Class SearchManager>
	//    9   21:astore_2        
		((SearchView)menu.findItem(h.menu_search).getActionView()).setSearchableInfo(searchmanager.getSearchableInfo(getComponentName()));
	//   10   22:aload_1         
	//   11   23:getstatic       #367 <Field int h.menu_search>
	//   12   26:invokeinterface #373 <Method MenuItem Menu.findItem(int)>
	//   13   31:invokeinterface #378 <Method View MenuItem.getActionView()>
	//   14   36:checkcast       #380 <Class SearchView>
	//   15   39:aload_2         
	//   16   40:aload_0         
	//   17   41:invokevirtual   #384 <Method android.content.ComponentName getComponentName()>
	//   18   44:invokevirtual   #388 <Method android.app.SearchableInfo SearchManager.getSearchableInfo(android.content.ComponentName)>
	//   19   47:invokevirtual   #392 <Method void SearchView.setSearchableInfo(android.app.SearchableInfo)>
		return super.onCreateOptionsMenu(menu);
	//   20   50:aload_0         
	//   21   51:aload_1         
	//   22   52:invokespecial   #394 <Method boolean ao.onCreateOptionsMenu(Menu)>
	//   23   55:ireturn         
	}

	protected void onNewIntent(Intent intent)
	{
		if("android.intent.action.SEARCH".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc2            #398 <String "android.intent.action.SEARCH">
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #403 <Method String Intent.getAction()>
	//*   3    7:invokevirtual   #408 <Method boolean String.equals(Object)>
	//*   4   10:ifeq            106
		{
			intent = ((Intent) (intent.getStringExtra("query")));
	//    5   13:aload_1         
	//    6   14:ldc2            #410 <String "query">
	//    7   17:invokevirtual   #414 <Method String Intent.getStringExtra(String)>
	//    8   20:astore_1        
			Object obj = ((Object) (new u(8)));
	//    9   21:new             #61  <Class u>
	//   10   24:dup             
	//   11   25:bipush          8
	//   12   27:invokespecial   #415 <Method void u(int)>
	//   13   30:astore_2        
			((u) (obj)).a(((String) (intent)));
	//   14   31:aload_2         
	//   15   32:aload_1         
	//   16   33:invokevirtual   #418 <Method u u.a(String)>
	//   17   36:pop             
			a = ((u) (obj));
	//   18   37:aload_0         
	//   19   38:aload_2         
	//   20   39:putfield        #42  <Field u a>
			obj = ((Object) ((RecyclerView)findViewById(h.listings)));
	//   21   42:aload_0         
	//   22   43:getstatic       #266 <Field int h.listings>
	//   23   46:invokevirtual   #267 <Method View findViewById(int)>
	//   24   49:checkcast       #48  <Class RecyclerView>
	//   25   52:astore_2        
			g = new ci(this, (ViewGroup)((RecyclerView) (obj)).getRootView());
	//   26   53:aload_0         
	//   27   54:new             #420 <Class ci>
	//   28   57:dup             
	//   29   58:aload_0         
	//   30   59:aload_2         
	//   31   60:invokevirtual   #52  <Method View RecyclerView.getRootView()>
	//   32   63:checkcast       #54  <Class ViewGroup>
	//   33   66:invokespecial   #423 <Method void ci(LibriVoxDetailsActivity, ViewGroup)>
	//   34   69:putfield        #45  <Field ci g>
			g.a(false);
	//   35   72:aload_0         
	//   36   73:getfield        #45  <Field ci g>
	//   37   76:iconst_0        
	//   38   77:invokevirtual   #425 <Method void biz.bookdesign.librivox.ci.a(boolean)>
			((RecyclerView) (obj)).setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (g)));
	//   39   80:aload_2         
	//   40   81:aload_0         
	//   41   82:getfield        #45  <Field ci g>
	//   42   85:invokevirtual   #429 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
			(new SearchRecentSuggestions(((android.content.Context) (this)), biz.bookdesign.catalogbase.a.a(((android.content.Context) (this))), 1)).saveRecentQuery(((String) (intent)), ((String) (null)));
	//   43   88:new             #431 <Class SearchRecentSuggestions>
	//   44   91:dup             
	//   45   92:aload_0         
	//   46   93:aload_0         
	//   47   94:invokestatic    #434 <Method String a.a(android.content.Context)>
	//   48   97:iconst_1        
	//   49   98:invokespecial   #437 <Method void SearchRecentSuggestions(android.content.Context, String, int)>
	//   50  101:aload_1         
	//   51  102:aconst_null     
	//   52  103:invokevirtual   #441 <Method void SearchRecentSuggestions.saveRecentQuery(String, String)>
		}
	//   53  106:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #446 <Method int MenuItem.getItemId()>
	//*   2    6:ldc2            #447 <Int 0x102002c>
	//*   3    9:icmpne          66
		{
			menuitem = ((MenuItem) (biz.bookdesign.catalogbase.a.g().b()));
	//    4   12:invokestatic    #326 <Method a a.g()>
	//    5   15:invokevirtual   #450 <Method Class a.b()>
	//    6   18:astore_1        
			overridePendingTransition(b.anim_slide_in_right, bd.anim_slide_out_right);
	//    7   19:aload_0         
	//    8   20:getstatic       #455 <Field int b.anim_slide_in_right>
	//    9   23:getstatic       #460 <Field int bd.anim_slide_out_right>
	//   10   26:invokevirtual   #464 <Method void overridePendingTransition(int, int)>
			if(menuitem != null)
	//*  11   29:aload_1         
	//*  12   30:ifnull          60
			{
				biz.bookdesign.catalogbase.a.a(1);
	//   13   33:iconst_1        
	//   14   34:invokestatic    #466 <Method void a.a(int)>
				menuitem = ((MenuItem) (new Intent(((android.content.Context) (this)), ((Class) (menuitem)))));
	//   15   37:new             #400 <Class Intent>
	//   16   40:dup             
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:invokespecial   #469 <Method void Intent(android.content.Context, Class)>
	//   20   46:astore_1        
				((Intent) (menuitem)).addFlags(0x4000000);
	//   21   47:aload_1         
	//   22   48:ldc2            #470 <Int 0x4000000>
	//   23   51:invokevirtual   #474 <Method Intent Intent.addFlags(int)>
	//   24   54:pop             
				startActivity(((Intent) (menuitem)));
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:invokevirtual   #477 <Method void startActivity(Intent)>
			}
			finish();
	//   28   60:aload_0         
	//   29   61:invokevirtual   #480 <Method void finish()>
			return true;
	//   30   64:iconst_1        
	//   31   65:ireturn         
		}
		if(menuitem.getItemId() == h.menu_search)
	//*  32   66:aload_1         
	//*  33   67:invokeinterface #446 <Method int MenuItem.getItemId()>
	//*  34   72:getstatic       #367 <Field int h.menu_search>
	//*  35   75:icmpne          85
		{
			onSearchRequested();
	//   36   78:aload_0         
	//   37   79:invokevirtual   #483 <Method boolean onSearchRequested()>
	//   38   82:pop             
			return true;
	//   39   83:iconst_1        
	//   40   84:ireturn         
		}
		if(menuitem.getItemId() == h.menu_preferences)
	//*  41   85:aload_1         
	//*  42   86:invokeinterface #446 <Method int MenuItem.getItemId()>
	//*  43   91:getstatic       #486 <Field int h.menu_preferences>
	//*  44   94:icmpne          124
		{
			startActivity(new Intent(getApplicationContext(), ((a)getApplication()).a()));
	//   45   97:aload_0         
	//   46   98:new             #400 <Class Intent>
	//   47  101:dup             
	//   48  102:aload_0         
	//   49  103:invokevirtual   #489 <Method android.content.Context getApplicationContext()>
	//   50  106:aload_0         
	//   51  107:invokevirtual   #493 <Method android.app.Application getApplication()>
	//   52  110:checkcast       #146 <Class a>
	//   53  113:invokevirtual   #495 <Method Class a.a()>
	//   54  116:invokespecial   #469 <Method void Intent(android.content.Context, Class)>
	//   55  119:invokevirtual   #477 <Method void startActivity(Intent)>
			return true;
	//   56  122:iconst_1        
	//   57  123:ireturn         
		} else
		{
			return super.onOptionsItemSelected(menuitem);
	//   58  124:aload_0         
	//   59  125:aload_1         
	//   60  126:invokespecial   #497 <Method boolean ao.onOptionsItemSelected(MenuItem)>
	//   61  129:ireturn         
		}
	}

	protected void onPause()
	{
		h = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #25  <Field boolean h>
		d.a(((android.content.BroadcastReceiver) (b)));
	//    3    5:aload_0         
	//    4    6:getfield        #325 <Field g d>
	//    5    9:aload_0         
	//    6   10:getfield        #317 <Field ch b>
	//    7   13:invokevirtual   #501 <Method void g.a(android.content.BroadcastReceiver)>
		a.d();
	//    8   16:aload_0         
	//    9   17:getfield        #42  <Field u a>
	//   10   20:invokevirtual   #503 <Method void u.d()>
		super.onPause();
	//   11   23:aload_0         
	//   12   24:invokespecial   #505 <Method void ao.onPause()>
	//   13   27:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #508 <Method void ao.onResume()>
		IntentFilter intentfilter = new IntentFilter();
	//    2    4:new             #510 <Class IntentFilter>
	//    3    7:dup             
	//    4    8:invokespecial   #511 <Method void IntentFilter()>
	//    5   11:astore_2        
		intentfilter.addAction("biz.bookdesign.librivox.STAR_NOTIFICATION");
	//    6   12:aload_2         
	//    7   13:ldc2            #513 <String "biz.bookdesign.librivox.STAR_NOTIFICATION">
	//    8   16:invokevirtual   #517 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.REFRESH_NOTIFICATION");
	//    9   19:aload_2         
	//   10   20:ldc2            #519 <String "biz.bookdesign.librivox.REFRESH_NOTIFICATION">
	//   11   23:invokevirtual   #517 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.DOWNLOAD_NOTIFICATION");
	//   12   26:aload_2         
	//   13   27:ldc2            #521 <String "biz.bookdesign.librivox.DOWNLOAD_NOTIFICATION">
	//   14   30:invokevirtual   #517 <Method void IntentFilter.addAction(String)>
		d.a(((android.content.BroadcastReceiver) (b)), intentfilter);
	//   15   33:aload_0         
	//   16   34:getfield        #325 <Field g d>
	//   17   37:aload_0         
	//   18   38:getfield        #317 <Field ch b>
	//   19   41:aload_2         
	//   20   42:invokevirtual   #524 <Method void g.a(android.content.BroadcastReceiver, IntentFilter)>
		if(h && g != null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #25  <Field boolean h>
	//*  23   49:ifeq            113
	//*  24   52:aload_0         
	//*  25   53:getfield        #45  <Field ci g>
	//*  26   56:ifnull          113
		{
			h = false;
	//   27   59:aload_0         
	//   28   60:iconst_0        
	//   29   61:putfield        #25  <Field boolean h>
			int i1 = a.a();
	//   30   64:aload_0         
	//   31   65:getfield        #42  <Field u a>
	//   32   68:invokevirtual   #526 <Method int u.a()>
	//   33   71:istore_1        
			if(i1 != 1 && i1 != 0 && i1 != 7 && i1 != 11)
	//*  34   72:iload_1         
	//*  35   73:iconst_1        
	//*  36   74:icmpeq          106
	//*  37   77:iload_1         
	//*  38   78:ifeq            106
	//*  39   81:iload_1         
	//*  40   82:bipush          7
	//*  41   84:icmpeq          106
	//*  42   87:iload_1         
	//*  43   88:bipush          11
	//*  44   90:icmpne          96
	//*  45   93:goto            106
				g.notifyDataSetChanged();
	//   46   96:aload_0         
	//   47   97:getfield        #45  <Field ci g>
	//   48  100:invokevirtual   #529 <Method void ci.notifyDataSetChanged()>
			else
	//*  49  103:goto            113
				g.a();
	//   50  106:aload_0         
	//   51  107:getfield        #45  <Field ci g>
	//   52  110:invokevirtual   #531 <Method void biz.bookdesign.librivox.ci.a()>
		}
		biz.bookdesign.catalogbase.a.a(0);
	//   53  113:iconst_0        
	//   54  114:invokestatic    #466 <Method void a.a(int)>
	//   55  117:return          
	}

	private u a;
	private ch b;
	private ci g;
	private boolean h;
	private r i;
	private int j;
	private int k;
	private q l;
}
