// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.content.a;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.util.n;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			IRobotApplication, DeveloperActivity_

public class BaseToolbarFragmentActivity extends AppCompatActivity
	implements com.irobot.home.p.a.a
{

	public BaseToolbarFragmentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void AppCompatActivity()>
		k = 0x7f06007a;
	//    2    4:aload_0         
	//    3    5:ldc1            #49  <Int 0x7f06007a>
	//    4    7:putfield        #51  <Field int k>
		l = 0x7f060076;
	//    5   10:aload_0         
	//    6   11:ldc1            #52  <Int 0x7f060076>
	//    7   13:putfield        #54  <Field int l>
		m = 0x7f060076;
	//    8   16:aload_0         
	//    9   17:ldc1            #52  <Int 0x7f060076>
	//   10   19:putfield        #56  <Field int m>
		n = 0x7f10020e;
	//   11   22:aload_0         
	//   12   23:ldc1            #57  <Int 0x7f10020e>
	//   13   25:putfield        #59  <Field int n>
		o = 0x7f10020d;
	//   14   28:aload_0         
	//   15   29:ldc1            #60  <Int 0x7f10020d>
	//   16   31:putfield        #62  <Field int o>
	//   17   34:return          
	}

	private void e()
	{
		b = (Toolbar)findViewById(0x7f09044f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #63  <Int 0x7f09044f>
	//    3    4:invokevirtual   #67  <Method android.view.View findViewById(int)>
	//    4    7:checkcast       #69  <Class Toolbar>
	//    5   10:putfield        #71  <Field Toolbar b>
	//    6   13:return          
	}

	private void f()
	{
		b.a(((Context) (this)), n);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Toolbar b>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field int n>
	//    5    9:invokevirtual   #74  <Method void Toolbar.a(Context, int)>
		b.setTitleTextColor(android.support.v4.content.a.getColor(((Context) (this)), l));
	//    6   12:aload_0         
	//    7   13:getfield        #71  <Field Toolbar b>
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #54  <Field int l>
	//   11   21:invokestatic    #80  <Method int a.getColor(Context, int)>
	//   12   24:invokevirtual   #84  <Method void Toolbar.setTitleTextColor(int)>
		b.b(((Context) (this)), o);
	//   13   27:aload_0         
	//   14   28:getfield        #71  <Field Toolbar b>
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #62  <Field int o>
	//   18   36:invokevirtual   #86  <Method void Toolbar.b(Context, int)>
		b.setSubtitleTextColor(android.support.v4.content.a.getColor(((Context) (this)), m));
	//   19   39:aload_0         
	//   20   40:getfield        #71  <Field Toolbar b>
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #56  <Field int m>
	//   24   48:invokestatic    #80  <Method int a.getColor(Context, int)>
	//   25   51:invokevirtual   #89  <Method void Toolbar.setSubtitleTextColor(int)>
		b.setBackgroundColor(android.support.v4.content.a.getColor(((Context) (this)), k));
	//   26   54:aload_0         
	//   27   55:getfield        #71  <Field Toolbar b>
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:getfield        #51  <Field int k>
	//   31   63:invokestatic    #80  <Method int a.getColor(Context, int)>
	//   32   66:invokevirtual   #92  <Method void Toolbar.setBackgroundColor(int)>
		ActionBar actionbar = a();
	//   33   69:aload_0         
	//   34   70:invokevirtual   #95  <Method ActionBar a()>
	//   35   73:astore_1        
		if(actionbar != null)
	//*  36   74:aload_1         
	//*  37   75:ifnull          191
		{
			if(f != null)
	//*  38   78:aload_0         
	//*  39   79:getfield        #97  <Field String f>
	//*  40   82:ifnull          96
				actionbar.a(((CharSequence) (f)));
	//   41   85:aload_1         
	//   42   86:aload_0         
	//   43   87:getfield        #97  <Field String f>
	//   44   90:invokevirtual   #102 <Method void ActionBar.a(CharSequence)>
			else
	//*  45   93:goto            120
			if(h != 0)
	//*  46   96:aload_0         
	//*  47   97:getfield        #104 <Field int h>
	//*  48  100:ifeq            114
				actionbar.a(h);
	//   49  103:aload_1         
	//   50  104:aload_0         
	//   51  105:getfield        #104 <Field int h>
	//   52  108:invokevirtual   #106 <Method void ActionBar.a(int)>
			else
	//*  53  111:goto            120
				junit.b.a.a("A title resource is required. The one supplied is unusable (or none supplied).", false);
	//   54  114:ldc1            #108 <String "A title resource is required. The one supplied is unusable (or none supplied).">
	//   55  116:iconst_0        
	//   56  117:invokestatic    #113 <Method void junit.b.a.a(String, boolean)>
			if(g != null)
	//*  57  120:aload_0         
	//*  58  121:getfield        #115 <Field String g>
	//*  59  124:ifnull          138
				actionbar.b(((CharSequence) (g)));
	//   60  127:aload_1         
	//   61  128:aload_0         
	//   62  129:getfield        #115 <Field String g>
	//   63  132:invokevirtual   #117 <Method void ActionBar.b(CharSequence)>
			else
	//*  64  135:goto            153
			if(i != 0)
	//*  65  138:aload_0         
	//*  66  139:getfield        #119 <Field int i>
	//*  67  142:ifeq            153
				actionbar.b(i);
	//   68  145:aload_1         
	//   69  146:aload_0         
	//   70  147:getfield        #119 <Field int i>
	//   71  150:invokevirtual   #121 <Method void ActionBar.b(int)>
			actionbar.b(e);
	//   72  153:aload_1         
	//   73  154:aload_0         
	//   74  155:getfield        #123 <Field boolean e>
	//   75  158:invokevirtual   #126 <Method void ActionBar.b(boolean)>
			if(e && p)
	//*  76  161:aload_0         
	//*  77  162:getfield        #123 <Field boolean e>
	//*  78  165:ifeq            191
	//*  79  168:aload_0         
	//*  80  169:getfield        #128 <Field boolean p>
	//*  81  172:ifeq            191
			{
				actionbar.a(p);
	//   82  175:aload_1         
	//   83  176:aload_0         
	//   84  177:getfield        #128 <Field boolean p>
	//   85  180:invokevirtual   #130 <Method void ActionBar.a(boolean)>
				actionbar.c(j);
	//   86  183:aload_1         
	//   87  184:aload_0         
	//   88  185:getfield        #132 <Field int j>
	//   89  188:invokevirtual   #134 <Method void ActionBar.c(int)>
			}
		}
	//   90  191:return          
	}

	protected void a(int i1, ArrayList arraylist)
	{
		a(i1, arraylist, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #138 <Method void a(int, ArrayList, int, int)>
	//    6    8:return          
	}

	protected void a(int i1, ArrayList arraylist, int j1, int k1)
	{
		if(arraylist == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
			h = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #104 <Field int h>
		else
	//*   5    9:goto            25
			f = getString(i1, arraylist.toArray());
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #146 <Method Object[] ArrayList.toArray()>
	//   11   19:invokevirtual   #150 <Method String getString(int, Object[])>
	//   12   22:putfield        #97  <Field String f>
		if(j1 != 0)
	//*  13   25:iload_3         
	//*  14   26:ifeq            34
			n = j1;
	//   15   29:aload_0         
	//   16   30:iload_3         
	//   17   31:putfield        #59  <Field int n>
		if(k1 != 0)
	//*  18   34:iload           4
	//*  19   36:ifeq            45
			l = k1;
	//   20   39:aload_0         
	//   21   40:iload           4
	//   22   42:putfield        #54  <Field int l>
	//   23   45:return          
	}

	public void a(List list, List list1, List list2, int i1)
	{
		Object obj = ((Object) (a));
	//    0    0:getstatic       #44  <Field String a>
	//    1    3:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #154 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #155 <Method void StringBuilder()>
	//    5   12:astore          6
		stringbuilder.append("User granted ");
	//    6   14:aload           6
	//    7   16:ldc1            #157 <String "User granted ">
	//    8   18:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(((Object) (list)).toString());
	//   10   22:aload           6
	//   11   24:aload_1         
	//   12   25:invokevirtual   #166 <Method String Object.toString()>
	//   13   28:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		stringbuilder.append(" permission(s).");
	//   15   32:aload           6
	//   16   34:ldc1            #168 <String " permission(s).">
	//   17   36:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
		com.irobot.home.util.o.b(((String) (obj)), stringbuilder.toString());
	//   19   40:aload           5
	//   20   42:aload           6
	//   21   44:invokevirtual   #169 <Method String StringBuilder.toString()>
	//   22   47:invokestatic    #174 <Method void o.b(String, String)>
		list = ((List) (a));
	//   23   50:getstatic       #44  <Field String a>
	//   24   53:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   25   54:new             #154 <Class StringBuilder>
	//   26   57:dup             
	//   27   58:invokespecial   #155 <Method void StringBuilder()>
	//   28   61:astore          5
		((StringBuilder) (obj)).append("User denied ");
	//   29   63:aload           5
	//   30   65:ldc1            #176 <String "User denied ">
	//   31   67:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:pop             
		((StringBuilder) (obj)).append(((Object) (list1)).toString());
	//   33   71:aload           5
	//   34   73:aload_2         
	//   35   74:invokevirtual   #166 <Method String Object.toString()>
	//   36   77:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   37   80:pop             
		((StringBuilder) (obj)).append(" permission(s).");
	//   38   81:aload           5
	//   39   83:ldc1            #168 <String " permission(s).">
	//   40   85:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   41   88:pop             
		com.irobot.home.util.o.b(((String) (list)), ((StringBuilder) (obj)).toString());
	//   42   89:aload_1         
	//   43   90:aload           5
	//   44   92:invokevirtual   #169 <Method String StringBuilder.toString()>
	//   45   95:invokestatic    #174 <Method void o.b(String, String)>
		list = ((List) (a));
	//   46   98:getstatic       #44  <Field String a>
	//   47  101:astore_1        
		list1 = ((List) (new StringBuilder()));
	//   48  102:new             #154 <Class StringBuilder>
	//   49  105:dup             
	//   50  106:invokespecial   #155 <Method void StringBuilder()>
	//   51  109:astore_2        
		((StringBuilder) (list1)).append("User permanently denied ");
	//   52  110:aload_2         
	//   53  111:ldc1            #178 <String "User permanently denied ">
	//   54  113:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   55  116:pop             
		((StringBuilder) (list1)).append(((Object) (list2)).toString());
	//   56  117:aload_2         
	//   57  118:aload_3         
	//   58  119:invokevirtual   #166 <Method String Object.toString()>
	//   59  122:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   60  125:pop             
		((StringBuilder) (list1)).append(" permission(s).");
	//   61  126:aload_2         
	//   62  127:ldc1            #168 <String " permission(s).">
	//   63  129:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   64  132:pop             
		com.irobot.home.util.o.b(((String) (list)), ((StringBuilder) (list1)).toString());
	//   65  133:aload_1         
	//   66  134:aload_2         
	//   67  135:invokevirtual   #169 <Method String StringBuilder.toString()>
	//   68  138:invokestatic    #174 <Method void o.b(String, String)>
		list = ((List) (a));
	//   69  141:getstatic       #44  <Field String a>
	//   70  144:astore_1        
		list1 = ((List) (new StringBuilder()));
	//   71  145:new             #154 <Class StringBuilder>
	//   72  148:dup             
	//   73  149:invokespecial   #155 <Method void StringBuilder()>
	//   74  152:astore_2        
		((StringBuilder) (list1)).append("Request code ");
	//   75  153:aload_2         
	//   76  154:ldc1            #180 <String "Request code ">
	//   77  156:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   78  159:pop             
		((StringBuilder) (list1)).append(i1);
	//   79  160:aload_2         
	//   80  161:iload           4
	//   81  163:invokevirtual   #183 <Method StringBuilder StringBuilder.append(int)>
	//   82  166:pop             
		com.irobot.home.util.o.b(((String) (list)), ((StringBuilder) (list1)).toString());
	//   83  167:aload_1         
	//   84  168:aload_2         
	//   85  169:invokevirtual   #169 <Method String StringBuilder.toString()>
	//   86  172:invokestatic    #174 <Method void o.b(String, String)>
	//   87  175:return          
	}

	protected void a(boolean flag)
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field boolean e>
	//    3    5:return          
	}

	protected void a(boolean flag, int i1)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #128 <Field boolean p>
		j = i1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #132 <Field int j>
	//    6   10:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (com.irobot.home.util.n.a(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #192 <Method android.content.ContextWrapper n.a(Context)>
	//    3    5:invokespecial   #194 <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected void b(int i1, ArrayList arraylist)
	{
		b(i1, arraylist, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #196 <Method void b(int, ArrayList, int, int)>
	//    6    8:return          
	}

	protected void b(int i1, ArrayList arraylist, int j1, int k1)
	{
		if(arraylist == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
			i = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #119 <Field int i>
		else
	//*   5    9:goto            25
			g = getString(i1, arraylist.toArray());
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #146 <Method Object[] ArrayList.toArray()>
	//   11   19:invokevirtual   #150 <Method String getString(int, Object[])>
	//   12   22:putfield        #115 <Field String g>
		if(j1 != 0)
	//*  13   25:iload_3         
	//*  14   26:ifeq            34
			o = j1;
	//   15   29:aload_0         
	//   16   30:iload_3         
	//   17   31:putfield        #62  <Field int o>
		if(k1 != 0)
	//*  18   34:iload           4
	//*  19   36:ifeq            45
			m = k1;
	//   20   39:aload_0         
	//   21   40:iload           4
	//   22   42:putfield        #56  <Field int m>
	//   23   45:return          
	}

	protected void onCreate(Bundle bundle)
	{
		c = ((IRobotApplication)getApplication()).i();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #202 <Method android.app.Application getApplication()>
	//    3    5:checkcast       #204 <Class IRobotApplication>
	//    4    8:invokevirtual   #207 <Method b IRobotApplication.i()>
	//    5   11:putfield        #209 <Field b c>
		d = new com.irobot.home.p.a(((android.app.Activity) (this)));
	//    6   14:aload_0         
	//    7   15:new             #211 <Class com.irobot.home.p.a>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #214 <Method void com.irobot.home.p.a(android.app.Activity)>
	//   11   23:putfield        #216 <Field com.irobot.home.p.a d>
		super.onCreate(bundle);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #218 <Method void AppCompatActivity.onCreate(Bundle)>
	//   15   31:return          
	}

	public void onCreate(Bundle bundle, PersistableBundle persistablebundle)
	{
		c = ((IRobotApplication)getApplication()).i();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #202 <Method android.app.Application getApplication()>
	//    3    5:checkcast       #204 <Class IRobotApplication>
	//    4    8:invokevirtual   #207 <Method b IRobotApplication.i()>
	//    5   11:putfield        #209 <Field b c>
		d = new com.irobot.home.p.a(((android.app.Activity) (this)));
	//    6   14:aload_0         
	//    7   15:new             #211 <Class com.irobot.home.p.a>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #214 <Method void com.irobot.home.p.a(android.app.Activity)>
	//   11   23:putfield        #216 <Field com.irobot.home.p.a d>
		super.onCreate(bundle, persistablebundle);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokespecial   #221 <Method void AppCompatActivity.onCreate(Bundle, PersistableBundle)>
	//   16   32:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == 0x7f09014b)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #229 <Method int MenuItem.getItemId()>
	//*   2    6:ldc1            #230 <Int 0x7f09014b>
	//*   3    8:icmpne          19
			com.irobot.home.DeveloperActivity_.a(((Context) (this))).a();
	//    4   11:aload_0         
	//    5   12:invokestatic    #235 <Method DeveloperActivity_$a com.irobot.home.DeveloperActivity_.a(Context)>
	//    6   15:invokevirtual   #240 <Method org.androidannotations.api.a.e com.irobot.home.DeveloperActivity_$a.a()>
	//    7   18:pop             
		return super.onOptionsItemSelected(menuitem);
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:invokespecial   #242 <Method boolean AppCompatActivity.onOptionsItemSelected(MenuItem)>
	//   11   24:ireturn         
	}

	protected void onPostCreate(Bundle bundle)
	{
		super.onPostCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #245 <Method void AppCompatActivity.onPostCreate(Bundle)>
		a(b);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #71  <Field Toolbar b>
	//    6   10:invokevirtual   #248 <Method void a(Toolbar)>
		f();
	//    7   13:aload_0         
	//    8   14:invokespecial   #250 <Method void f()>
	//    9   17:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #253 <Method void AppCompatActivity.onPostResume()>
		e();
	//    2    4:aload_0         
	//    3    5:invokespecial   #255 <Method void e()>
	//    4    8:return          
	}

	public boolean onPrepareOptionsMenu(Menu menu)
	{
		boolean flag = super.onPrepareOptionsMenu(menu);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #259 <Method boolean AppCompatActivity.onPrepareOptionsMenu(Menu)>
	//    3    5:istore_2        
		menu.findItem(0x7f09014b);
	//    4    6:aload_1         
	//    5    7:ldc1            #230 <Int 0x7f09014b>
	//    6    9:invokeinterface #265 <Method MenuItem Menu.findItem(int)>
	//    7   14:pop             
		return flag;
	//    8   15:iload_2         
	//    9   16:ireturn         
	}

	public void onRequestPermissionsResult(int i1, String as[], int ai[])
	{
		super.onRequestPermissionsResult(i1, as, ai);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #269 <Method void AppCompatActivity.onRequestPermissionsResult(int, String[], int[])>
		d.a(i1, as, ai);
	//    5    7:aload_0         
	//    6    8:getfield        #216 <Field com.irobot.home.p.a d>
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #271 <Method void com.irobot.home.p.a.a(int, String[], int[])>
	//   11   17:return          
	}

	public void setContentView(int i1)
	{
		super.setContentView(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #274 <Method void AppCompatActivity.setContentView(int)>
		e();
	//    3    5:aload_0         
	//    4    6:invokespecial   #255 <Method void e()>
	//    5    9:return          
	}

	private static final String a = com.irobot.home.util.j.r(((Class) (com/irobot/home/BaseToolbarFragmentActivity)).getSimpleName());
	private Toolbar b;
	protected b c;
	protected com.irobot.home.p.a d;
	protected boolean e;
	private String f;
	private String g;
	private int h;
	private int i;
	private int j;
	private int k;
	private int l;
	private int m;
	private int n;
	private int o;
	private boolean p;

	static 
	{
	//    0    0:ldc1            #2   <Class BaseToolbarFragmentActivity>
	//    1    2:invokevirtual   #36  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #42  <Method String j.r(String)>
	//    3    8:putstatic       #44  <Field String a>
	//*   4   11:return          
	}
}
