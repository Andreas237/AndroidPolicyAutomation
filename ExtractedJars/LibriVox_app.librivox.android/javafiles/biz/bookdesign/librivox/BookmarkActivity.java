// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.Dialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.z;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.k;
import biz.bookdesign.librivox.a.l;
import biz.bookdesign.librivox.b.a;
import biz.bookdesign.librivox.b.i;
import biz.bookdesign.librivox.b.j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package biz.bookdesign.librivox:
//			an, ag, ah, ai, 
//			aj, ak, al, am

public class BookmarkActivity extends ListActivity
{

	public BookmarkActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ListActivity()>
	//    2    4:return          
	}

	static i a(BookmarkActivity bookmarkactivity, i i1)
	{
		bookmarkactivity.d = i1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field i d>
		return i1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private String a()
	{
		int i1 = b.size();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List b>
	//    2    4:invokeinterface #31  <Method int List.size()>
	//    3    9:istore_2        
		Object obj = "";
	//    4   10:ldc1            #33  <String "">
	//    5   12:astore          5
		boolean flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_1        
label0:
		do
		{
			if(!flag)
				break;
	//    8   16:iload_1         
	//    9   17:ifeq            133
			boolean flag1 = false;
	//   10   20:iconst_0        
	//   11   21:istore          4
			int j1 = i1 + 1;
	//   12   23:iload_2         
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:istore_3        
			obj = ((Object) (new StringBuilder()));
	//   16   27:new             #35  <Class StringBuilder>
	//   17   30:dup             
	//   18   31:invokespecial   #36  <Method void StringBuilder()>
	//   19   34:astore          5
			((StringBuilder) (obj)).append(getString(k.bookmark));
	//   20   36:aload           5
	//   21   38:aload_0         
	//   22   39:getstatic       #42  <Field int k.bookmark>
	//   23   42:invokevirtual   #46  <Method String getString(int)>
	//   24   45:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
			((StringBuilder) (obj)).append(' ');
	//   26   49:aload           5
	//   27   51:bipush          32
	//   28   53:invokevirtual   #53  <Method StringBuilder StringBuilder.append(char)>
	//   29   56:pop             
			((StringBuilder) (obj)).append(j1);
	//   30   57:aload           5
	//   31   59:iload_3         
	//   32   60:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//   33   63:pop             
			String s = ((StringBuilder) (obj)).toString();
	//   34   64:aload           5
	//   35   66:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   36   69:astore          6
			Iterator iterator = b.iterator();
	//   37   71:aload_0         
	//   38   72:getfield        #25  <Field List b>
	//   39   75:invokeinterface #63  <Method Iterator List.iterator()>
	//   40   80:astore          7
			do
			{
				flag = flag1;
	//   41   82:iload           4
	//   42   84:istore_1        
				obj = ((Object) (s));
	//   43   85:aload           6
	//   44   87:astore          5
				i1 = j1;
	//   45   89:iload_3         
	//   46   90:istore_2        
				if(!iterator.hasNext())
					continue label0;
	//   47   91:aload           7
	//   48   93:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   49   98:ifeq            16
			} while(!((i)iterator.next()).f().equals(((Object) (s))));
	//   50  101:aload           7
	//   51  103:invokeinterface #73  <Method Object Iterator.next()>
	//   52  108:checkcast       #75  <Class i>
	//   53  111:invokevirtual   #78  <Method String i.f()>
	//   54  114:aload           6
	//   55  116:invokevirtual   #84  <Method boolean String.equals(Object)>
	//   56  119:ifeq            82
			flag = true;
	//   57  122:iconst_1        
	//   58  123:istore_1        
			obj = ((Object) (s));
	//   59  124:aload           6
	//   60  126:astore          5
			i1 = j1;
	//   61  128:iload_3         
	//   62  129:istore_2        
		} while(true);
	//   63  130:goto            16
		return ((String) (obj));
	//   64  133:aload           5
	//   65  135:areturn         
	}

	static String a(BookmarkActivity bookmarkactivity, Date date)
	{
		return bookmarkactivity.a(date);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #88  <Method String a(Date)>
	//    3    5:areturn         
	}

	private String a(Date date)
	{
		SimpleDateFormat simpledateformat;
		if(date.getTime() > 0x36ee80L)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #97  <Method long Date.getTime()>
	//*   2    4:ldc2w           #98  <Long 0x36ee80L>
	//*   3    7:lcmp            
	//*   4    8:ifle            24
			simpledateformat = new SimpleDateFormat("h:mm:ss");
	//    5   11:new             #101 <Class SimpleDateFormat>
	//    6   14:dup             
	//    7   15:ldc1            #103 <String "h:mm:ss">
	//    8   17:invokespecial   #106 <Method void SimpleDateFormat(String)>
	//    9   20:astore_2        
		else
	//*  10   21:goto            34
			simpledateformat = new SimpleDateFormat("m:ss");
	//   11   24:new             #101 <Class SimpleDateFormat>
	//   12   27:dup             
	//   13   28:ldc1            #108 <String "m:ss">
	//   14   30:invokespecial   #106 <Method void SimpleDateFormat(String)>
	//   15   33:astore_2        
		simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
	//   16   34:aload_2         
	//   17   35:ldc1            #110 <String "GMT">
	//   18   37:invokestatic    #116 <Method TimeZone TimeZone.getTimeZone(String)>
	//   19   40:invokevirtual   #120 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		return simpledateformat.format(date);
	//   20   43:aload_2         
	//   21   44:aload_1         
	//   22   45:invokevirtual   #123 <Method String SimpleDateFormat.format(Date)>
	//   23   48:areturn         
	}

	static List a(BookmarkActivity bookmarkactivity)
	{
		return bookmarkactivity.b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List b>
	//    2    4:areturn         
	}

	static List a(BookmarkActivity bookmarkactivity, List list)
	{
		bookmarkactivity.b = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field List b>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static String b(BookmarkActivity bookmarkactivity)
	{
		return bookmarkactivity.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method String a()>
	//    2    4:areturn         
	}

	static i c(BookmarkActivity bookmarkactivity)
	{
		return bookmarkactivity.d;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field i d>
	//    2    4:areturn         
	}

	static a d(BookmarkActivity bookmarkactivity)
	{
		return bookmarkactivity.a;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field a a>
	//    2    4:areturn         
	}

	static an e(BookmarkActivity bookmarkactivity)
	{
		return bookmarkactivity.c;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field an c>
	//    2    4:areturn         
	}

	public void onBackPressed()
	{
		setResult(-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokevirtual   #141 <Method void setResult(int)>
		finish();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #144 <Method void finish()>
	//    5    9:return          
	}

	public boolean onContextItemSelected(MenuItem menuitem)
	{
		int i1 = (int)((android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo()).id;
	//    0    0:aload_1         
	//    1    1:invokeinterface #152 <Method android.view.ContextMenu$ContextMenuInfo MenuItem.getMenuInfo()>
	//    2    6:checkcast       #154 <Class android.widget.AdapterView$AdapterContextMenuInfo>
	//    3    9:getfield        #158 <Field long android.widget.AdapterView$AdapterContextMenuInfo.id>
	//    4   12:l2i             
	//    5   13:istore_2        
		if(menuitem.getItemId() == h.menu_edit)
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #161 <Method int MenuItem.getItemId()>
	//*   8   20:getstatic       #166 <Field int h.menu_edit>
	//*   9   23:icmpne          51
		{
			d = (i)b.get(i1);
	//   10   26:aload_0         
	//   11   27:aload_0         
	//   12   28:getfield        #25  <Field List b>
	//   13   31:iload_2         
	//   14   32:invokeinterface #170 <Method Object List.get(int)>
	//   15   37:checkcast       #75  <Class i>
	//   16   40:putfield        #22  <Field i d>
			showDialog(0);
	//   17   43:aload_0         
	//   18   44:iconst_0        
	//   19   45:invokevirtual   #173 <Method void showDialog(int)>
		} else
	//*  20   48:goto            142
		if(menuitem.getItemId() == h.menu_delete)
	//*  21   51:aload_1         
	//*  22   52:invokeinterface #161 <Method int MenuItem.getItemId()>
	//*  23   57:getstatic       #176 <Field int h.menu_delete>
	//*  24   60:icmpne          105
		{
			a.c((i)b.get(i1));
	//   25   63:aload_0         
	//   26   64:getfield        #133 <Field a a>
	//   27   67:aload_0         
	//   28   68:getfield        #25  <Field List b>
	//   29   71:iload_2         
	//   30   72:invokeinterface #170 <Method Object List.get(int)>
	//   31   77:checkcast       #75  <Class i>
	//   32   80:invokevirtual   #181 <Method boolean a.c(i)>
	//   33   83:pop             
			b = a.y();
	//   34   84:aload_0         
	//   35   85:aload_0         
	//   36   86:getfield        #133 <Field a a>
	//   37   89:invokevirtual   #185 <Method List a.y()>
	//   38   92:putfield        #25  <Field List b>
			c.notifyDataSetChanged();
	//   39   95:aload_0         
	//   40   96:getfield        #136 <Field an c>
	//   41   99:invokevirtual   #190 <Method void an.notifyDataSetChanged()>
		} else
	//*  42  102:goto            142
		if(menuitem.getItemId() == h.menu_load)
	//*  43  105:aload_1         
	//*  44  106:invokeinterface #161 <Method int MenuItem.getItemId()>
	//*  45  111:getstatic       #193 <Field int h.menu_load>
	//*  46  114:icmpne          142
		{
			setResult((int)((i)b.get(i1)).a());
	//   47  117:aload_0         
	//   48  118:aload_0         
	//   49  119:getfield        #25  <Field List b>
	//   50  122:iload_2         
	//   51  123:invokeinterface #170 <Method Object List.get(int)>
	//   52  128:checkcast       #75  <Class i>
	//   53  131:invokevirtual   #195 <Method long i.a()>
	//   54  134:l2i             
	//   55  135:invokevirtual   #141 <Method void setResult(int)>
			finish();
	//   56  138:aload_0         
	//   57  139:invokevirtual   #144 <Method void finish()>
		}
		return true;
	//   58  142:iconst_1        
	//   59  143:ireturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #199 <Method void ListActivity.onCreate(Bundle)>
		setContentView(biz.bookdesign.librivox.a.i.bookmarks);
	//    3    5:aload_0         
	//    4    6:getstatic       #204 <Field int biz.bookdesign.librivox.a.i.bookmarks>
	//    5    9:invokevirtual   #207 <Method void setContentView(int)>
		e = new j(((android.content.Context) (this)));
	//    6   12:aload_0         
	//    7   13:new             #209 <Class j>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #212 <Method void j(android.content.Context)>
	//   11   21:putfield        #214 <Field j e>
		e.a();
	//   12   24:aload_0         
	//   13   25:getfield        #214 <Field j e>
	//   14   28:invokevirtual   #217 <Method j j.a()>
	//   15   31:pop             
		a = biz.bookdesign.librivox.b.a.a(getIntent().getIntExtra("lvid", 0), getApplicationContext());
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #221 <Method Intent getIntent()>
	//   19   37:ldc1            #223 <String "lvid">
	//   20   39:iconst_0        
	//   21   40:invokevirtual   #229 <Method int Intent.getIntExtra(String, int)>
	//   22   43:aload_0         
	//   23   44:invokevirtual   #233 <Method android.content.Context getApplicationContext()>
	//   24   47:invokestatic    #236 <Method a a.a(int, android.content.Context)>
	//   25   50:putfield        #133 <Field a a>
		b = a.y();
	//   26   53:aload_0         
	//   27   54:aload_0         
	//   28   55:getfield        #133 <Field a a>
	//   29   58:invokevirtual   #185 <Method List a.y()>
	//   30   61:putfield        #25  <Field List b>
		bundle = ((Bundle) ((Button)findViewById(h.add)));
	//   31   64:aload_0         
	//   32   65:getstatic       #239 <Field int h.add>
	//   33   68:invokevirtual   #243 <Method View findViewById(int)>
	//   34   71:checkcast       #245 <Class Button>
	//   35   74:astore_1        
		Button button = (Button)findViewById(h.ok);
	//   36   75:aload_0         
	//   37   76:getstatic       #248 <Field int h.ok>
	//   38   79:invokevirtual   #243 <Method View findViewById(int)>
	//   39   82:checkcast       #245 <Class Button>
	//   40   85:astore_2        
		ListView listview = (ListView)findViewById(0x102000a);
	//   41   86:aload_0         
	//   42   87:ldc1            #249 <Int 0x102000a>
	//   43   89:invokevirtual   #243 <Method View findViewById(int)>
	//   44   92:checkcast       #251 <Class ListView>
	//   45   95:astore_3        
		registerForContextMenu(((View) (listview)));
	//   46   96:aload_0         
	//   47   97:aload_3         
	//   48   98:invokevirtual   #255 <Method void registerForContextMenu(View)>
		listview.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (new ag(this))));
	//   49  101:aload_3         
	//   50  102:new             #257 <Class ag>
	//   51  105:dup             
	//   52  106:aload_0         
	//   53  107:invokespecial   #260 <Method void ag(BookmarkActivity)>
	//   54  110:invokevirtual   #264 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		((Button) (bundle)).setOnClickListener(((android.view.View.OnClickListener) (new ah(this))));
	//   55  113:aload_1         
	//   56  114:new             #266 <Class ah>
	//   57  117:dup             
	//   58  118:aload_0         
	//   59  119:invokespecial   #267 <Method void ah(BookmarkActivity)>
	//   60  122:invokevirtual   #271 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		button.setOnClickListener(((android.view.View.OnClickListener) (new ai(this))));
	//   61  125:aload_2         
	//   62  126:new             #273 <Class ai>
	//   63  129:dup             
	//   64  130:aload_0         
	//   65  131:invokespecial   #274 <Method void ai(BookmarkActivity)>
	//   66  134:invokevirtual   #271 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		c = new an(this, ((ag) (null)));
	//   67  137:aload_0         
	//   68  138:new             #187 <Class an>
	//   69  141:dup             
	//   70  142:aload_0         
	//   71  143:aconst_null     
	//   72  144:invokespecial   #277 <Method void an(BookmarkActivity, ag)>
	//   73  147:putfield        #136 <Field an c>
		setListAdapter(((android.widget.ListAdapter) (c)));
	//   74  150:aload_0         
	//   75  151:aload_0         
	//   76  152:getfield        #136 <Field an c>
	//   77  155:invokevirtual   #281 <Method void setListAdapter(android.widget.ListAdapter)>
	//   78  158:return          
	}

	public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
	{
		getMenuInflater().inflate(biz.bookdesign.librivox.a.j.bookmark_menu, ((android.view.Menu) (contextmenu)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method MenuInflater getMenuInflater()>
	//    2    4:getstatic       #292 <Field int biz.bookdesign.librivox.a.j.bookmark_menu>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #298 <Method void MenuInflater.inflate(int, android.view.Menu)>
	//    5   11:return          
	}

	protected Dialog onCreateDialog(int i1, Bundle bundle)
	{
		bundle = ((Bundle) (new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (this)), l.LVDialogTheme)));
	//    0    0:new             #302 <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #307 <Field int l.LVDialogTheme>
	//    4    8:invokespecial   #310 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context, int)>
	//    5   11:astore_2        
		((android.support.v7.app.AlertDialog.Builder) (bundle)).setView(LayoutInflater.from(((android.content.Context) (this))).inflate(biz.bookdesign.librivox.a.i.bookmark_dialog, ((android.view.ViewGroup) (null))));
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:invokestatic    #316 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//    9   17:getstatic       #319 <Field int biz.bookdesign.librivox.a.i.bookmark_dialog>
	//   10   20:aconst_null     
	//   11   21:invokevirtual   #322 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   12   24:invokevirtual   #326 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setView(View)>
	//   13   27:pop             
		return ((Dialog) (((android.support.v7.app.AlertDialog.Builder) (bundle)).create()));
	//   14   28:aload_2         
	//   15   29:invokevirtual   #330 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   16   32:areturn         
	}

	protected void onDestroy()
	{
		e.b();
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field j e>
	//    2    4:invokevirtual   #333 <Method void j.b()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #335 <Method void ListActivity.onDestroy()>
	//    5   11:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() != 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #161 <Method int MenuItem.getItemId()>
	//*   2    6:ldc2            #337 <Int 0x102002c>
	//*   3    9:icmpeq          18
		{
			return super.onOptionsItemSelected(menuitem);
	//    4   12:aload_0         
	//    5   13:aload_1         
	//    6   14:invokespecial   #339 <Method boolean ListActivity.onOptionsItemSelected(MenuItem)>
	//    7   17:ireturn         
		} else
		{
			setResult(-1);
	//    8   18:aload_0         
	//    9   19:iconst_m1       
	//   10   20:invokevirtual   #141 <Method void setResult(int)>
			finish();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #144 <Method void finish()>
			return true;
	//   13   27:iconst_1        
	//   14   28:ireturn         
		}
	}

	protected void onPrepareDialog(int i1, Dialog dialog, Bundle bundle)
	{
		EditText edittext = (EditText)dialog.findViewById(h.bookmark_name);
	//    0    0:aload_2         
	//    1    1:getstatic       #344 <Field int h.bookmark_name>
	//    2    4:invokevirtual   #347 <Method View Dialog.findViewById(int)>
	//    3    7:checkcast       #349 <Class EditText>
	//    4   10:astore          4
		Button button = (Button)dialog.findViewById(h.positive_button);
	//    5   12:aload_2         
	//    6   13:getstatic       #352 <Field int h.positive_button>
	//    7   16:invokevirtual   #347 <Method View Dialog.findViewById(int)>
	//    8   19:checkcast       #245 <Class Button>
	//    9   22:astore          5
		Button button1 = (Button)dialog.findViewById(h.negative_button);
	//   10   24:aload_2         
	//   11   25:getstatic       #355 <Field int h.negative_button>
	//   12   28:invokevirtual   #347 <Method View Dialog.findViewById(int)>
	//   13   31:checkcast       #245 <Class Button>
	//   14   34:astore          6
		Spinner spinner = (Spinner)dialog.findViewById(h.chapter_spinner);
	//   15   36:aload_2         
	//   16   37:getstatic       #358 <Field int h.chapter_spinner>
	//   17   40:invokevirtual   #347 <Method View Dialog.findViewById(int)>
	//   18   43:checkcast       #360 <Class Spinner>
	//   19   46:astore          7
		SeekBar seekbar = (SeekBar)dialog.findViewById(h.seekBar);
	//   20   48:aload_2         
	//   21   49:getstatic       #363 <Field int h.seekBar>
	//   22   52:invokevirtual   #347 <Method View Dialog.findViewById(int)>
	//   23   55:checkcast       #365 <Class SeekBar>
	//   24   58:astore          8
		TextView textview = (TextView)dialog.findViewById(h.current_position);
	//   25   60:aload_2         
	//   26   61:getstatic       #368 <Field int h.current_position>
	//   27   64:invokevirtual   #347 <Method View Dialog.findViewById(int)>
	//   28   67:checkcast       #370 <Class TextView>
	//   29   70:astore          9
		TextView textview1 = (TextView)dialog.findViewById(h.duration);
	//   30   72:aload_2         
	//   31   73:getstatic       #373 <Field int h.duration>
	//   32   76:invokevirtual   #347 <Method View Dialog.findViewById(int)>
	//   33   79:checkcast       #370 <Class TextView>
	//   34   82:astore          10
		bundle = ((Bundle) (dialog.getWindow().getAttributes()));
	//   35   84:aload_2         
	//   36   85:invokevirtual   #377 <Method Window Dialog.getWindow()>
	//   37   88:invokevirtual   #383 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   38   91:astore_3        
		bundle.width = -1;
	//   39   92:aload_3         
	//   40   93:iconst_m1       
	//   41   94:putfield        #388 <Field int android.view.WindowManager$LayoutParams.width>
		dialog.getWindow().setAttributes(((android.view.WindowManager.LayoutParams) (bundle)));
	//   42   97:aload_2         
	//   43   98:invokevirtual   #377 <Method Window Dialog.getWindow()>
	//   44  101:aload_3         
	//   45  102:invokevirtual   #392 <Method void Window.setAttributes(android.view.WindowManager$LayoutParams)>
		bundle = ((Bundle) (d));
	//   46  105:aload_0         
	//   47  106:getfield        #22  <Field i d>
	//   48  109:astore_3        
		if(bundle == null)
	//*  49  110:aload_3         
	//*  50  111:ifnonnull       126
			edittext.setText(((CharSequence) (a())));
	//   51  114:aload           4
	//   52  116:aload_0         
	//   53  117:invokespecial   #129 <Method String a()>
	//   54  120:invokevirtual   #396 <Method void EditText.setText(CharSequence)>
		else
	//*  55  123:goto            135
			edittext.setText(((CharSequence) (((i) (bundle)).f())));
	//   56  126:aload           4
	//   57  128:aload_3         
	//   58  129:invokevirtual   #78  <Method String i.f()>
	//   59  132:invokevirtual   #396 <Method void EditText.setText(CharSequence)>
		android.database.Cursor cursor = e.a(a.p());
	//   60  135:aload_0         
	//   61  136:getfield        #214 <Field j e>
	//   62  139:aload_0         
	//   63  140:getfield        #133 <Field a a>
	//   64  143:invokevirtual   #399 <Method int a.p()>
	//   65  146:i2l             
	//   66  147:invokevirtual   #402 <Method android.database.Cursor j.a(long)>
	//   67  150:astore          11
		startManagingCursor(cursor);
	//   68  152:aload_0         
	//   69  153:aload           11
	//   70  155:invokevirtual   #406 <Method void startManagingCursor(android.database.Cursor)>
		bundle = ((Bundle) (new z(((android.content.Context) (this)), biz.bookdesign.librivox.a.i.spinner_row_base, cursor, new String[] {
			"title"
		}, new int[] {
			0x1020014
		}, 0)));
	//   71  158:new             #408 <Class z>
	//   72  161:dup             
	//   73  162:aload_0         
	//   74  163:getstatic       #411 <Field int biz.bookdesign.librivox.a.i.spinner_row_base>
	//   75  166:aload           11
	//   76  168:iconst_1        
	//   77  169:anewarray       String[]
	//   78  172:dup             
	//   79  173:iconst_0        
	//   80  174:ldc2            #413 <String "title">
	//   81  177:aastore         
	//   82  178:iconst_1        
	//   83  179:newarray        int[]
	//   84  181:dup             
	//   85  182:iconst_0        
	//   86  183:ldc2            #414 <Int 0x1020014>
	//   87  186:iastore         
	//   88  187:iconst_0        
	//   89  188:invokespecial   #417 <Method void z(android.content.Context, int, android.database.Cursor, String[], int[], int)>
	//   90  191:astore_3        
		((z) (bundle)).setDropDownViewResource(0x1090009);
	//   91  192:aload_3         
	//   92  193:ldc2            #418 <Int 0x1090009>
	//   93  196:invokevirtual   #421 <Method void z.setDropDownViewResource(int)>
		((z) (bundle)).setViewResource(0x1090008);
	//   94  199:aload_3         
	//   95  200:ldc2            #422 <Int 0x1090008>
	//   96  203:invokevirtual   #425 <Method void z.setViewResource(int)>
		spinner.setAdapter(((android.widget.SpinnerAdapter) (bundle)));
	//   97  206:aload           7
	//   98  208:aload_3         
	//   99  209:invokevirtual   #429 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
		bundle = ((Bundle) (d));
	//  100  212:aload_0         
	//  101  213:getfield        #22  <Field i d>
	//  102  216:astore_3        
		if(bundle == null)
	//* 103  217:aload_3         
	//* 104  218:ifnonnull       251
		{
			bundle = ((Bundle) (a.z()));
	//  105  221:aload_0         
	//  106  222:getfield        #133 <Field a a>
	//  107  225:invokevirtual   #433 <Method i a.z()>
	//  108  228:astore_3        
			if(bundle == null)
	//* 109  229:aload_3         
	//* 110  230:ifnonnull       248
				bundle = ((Bundle) (new i("", 1, 0L)));
	//  111  233:new             #75  <Class i>
	//  112  236:dup             
	//  113  237:ldc1            #33  <String "">
	//  114  239:iconst_1        
	//  115  240:lconst_0        
	//  116  241:invokespecial   #436 <Method void i(String, int, long)>
	//  117  244:astore_3        
		}
	//* 118  245:goto            248
	//* 119  248:goto            251
		spinner.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (new aj(this, cursor, textview1, seekbar, ((i) (bundle))))));
	//  120  251:aload           7
	//  121  253:new             #438 <Class aj>
	//  122  256:dup             
	//  123  257:aload_0         
	//  124  258:aload           11
	//  125  260:aload           10
	//  126  262:aload           8
	//  127  264:aload_3         
	//  128  265:invokespecial   #441 <Method void aj(BookmarkActivity, android.database.Cursor, TextView, SeekBar, i)>
	//  129  268:invokevirtual   #445 <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		spinner.setSelection(((i) (bundle)).c() - 1);
	//  130  271:aload           7
	//  131  273:aload_3         
	//  132  274:invokevirtual   #447 <Method int i.c()>
	//  133  277:iconst_1        
	//  134  278:isub            
	//  135  279:invokevirtual   #450 <Method void Spinner.setSelection(int)>
		seekbar.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (new ak(this, textview))));
	//  136  282:aload           8
	//  137  284:new             #452 <Class ak>
	//  138  287:dup             
	//  139  288:aload_0         
	//  140  289:aload           9
	//  141  291:invokespecial   #455 <Method void ak(BookmarkActivity, TextView)>
	//  142  294:invokevirtual   #459 <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
		button.setOnClickListener(((android.view.View.OnClickListener) (new al(this, edittext, spinner, seekbar, dialog))));
	//  143  297:aload           5
	//  144  299:new             #461 <Class al>
	//  145  302:dup             
	//  146  303:aload_0         
	//  147  304:aload           4
	//  148  306:aload           7
	//  149  308:aload           8
	//  150  310:aload_2         
	//  151  311:invokespecial   #464 <Method void al(BookmarkActivity, EditText, Spinner, SeekBar, Dialog)>
	//  152  314:invokevirtual   #271 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		button1.setOnClickListener(((android.view.View.OnClickListener) (new am(this, dialog))));
	//  153  317:aload           6
	//  154  319:new             #466 <Class am>
	//  155  322:dup             
	//  156  323:aload_0         
	//  157  324:aload_2         
	//  158  325:invokespecial   #469 <Method void am(BookmarkActivity, Dialog)>
	//  159  328:invokevirtual   #271 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//  160  331:return          
	}

	private a a;
	private List b;
	private an c;
	private i d;
	private j e;
}
