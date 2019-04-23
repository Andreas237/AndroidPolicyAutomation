// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.view.Menu;
import android.view.MenuItem;
import biz.bookdesign.librivox.a.g;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.k;
import biz.bookdesign.librivox.a.l;
import biz.bookdesign.librivox.audio.LocalAudioService;
import biz.bookdesign.librivox.b.m;
import java.util.List;

// Referenced classes of package biz.bookdesign.librivox:
//			bi, c, d, dj, 
//			ae, SettingsActivity, b

public abstract class a extends bi
{

	public a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void bi()>
	//    2    4:return          
	}

	private void a()
	{
		Intent intent = new Intent();
	//    0    0:new             #15  <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Intent()>
	//    3    7:astore_3        
		intent.setAction("biz.bookdesign.gutebooks.SEARCH");
	//    4    8:aload_3         
	//    5    9:ldc1            #18  <String "biz.bookdesign.gutebooks.SEARCH">
	//    6   11:invokevirtual   #22  <Method Intent Intent.setAction(String)>
	//    7   14:pop             
		String s = b.b().replaceAll("\\(.*?\\)", "");
	//    8   15:aload_0         
	//    9   16:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//   10   19:invokevirtual   #29  <Method String biz.bookdesign.librivox.b.a.b()>
	//   11   22:ldc1            #31  <String "\\(.*?\\)">
	//   12   24:ldc1            #33  <String "">
	//   13   26:invokevirtual   #39  <Method String String.replaceAll(String, String)>
	//   14   29:astore_2        
		String s1 = b.d();
	//   15   30:aload_0         
	//   16   31:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//   17   34:invokevirtual   #42  <Method String biz.bookdesign.librivox.b.a.d()>
	//   18   37:astore          4
		Object obj = ((Object) (s));
	//   19   39:aload_2         
	//   20   40:astore_1        
		if(s1 != null)
	//*  21   41:aload           4
	//*  22   43:ifnull          101
		{
			obj = ((Object) (s));
	//   23   46:aload_2         
	//   24   47:astore_1        
			if(!s1.isEmpty())
	//*  25   48:aload           4
	//*  26   50:invokevirtual   #46  <Method boolean String.isEmpty()>
	//*  27   53:ifne            101
			{
				obj = ((Object) (s));
	//   28   56:aload_2         
	//   29   57:astore_1        
				if(!"Unknown".equals(((Object) (s1))))
	//*  30   58:ldc1            #48  <String "Unknown">
	//*  31   60:aload           4
	//*  32   62:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  33   65:ifne            101
				{
					obj = ((Object) (new StringBuilder()));
	//   34   68:new             #54  <Class StringBuilder>
	//   35   71:dup             
	//   36   72:invokespecial   #55  <Method void StringBuilder()>
	//   37   75:astore_1        
					((StringBuilder) (obj)).append(s);
	//   38   76:aload_1         
	//   39   77:aload_2         
	//   40   78:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
					((StringBuilder) (obj)).append(' ');
	//   42   82:aload_1         
	//   43   83:bipush          32
	//   44   85:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   45   88:pop             
					((StringBuilder) (obj)).append(s1);
	//   46   89:aload_1         
	//   47   90:aload           4
	//   48   92:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   49   95:pop             
					obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   50   96:aload_1         
	//   51   97:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   52  100:astore_1        
				}
			}
		}
		intent.putExtra("query", ((String) (obj)));
	//   53  101:aload_3         
	//   54  102:ldc1            #67  <String "query">
	//   55  104:aload_1         
	//   56  105:invokevirtual   #71  <Method Intent Intent.putExtra(String, String)>
	//   57  108:pop             
		if(getPackageManager().queryIntentActivities(intent, 0x10000).isEmpty())
	//*  58  109:aload_0         
	//*  59  110:invokevirtual   #75  <Method PackageManager getPackageManager()>
	//*  60  113:aload_3         
	//*  61  114:ldc1            #76  <Int 0x10000>
	//*  62  116:invokevirtual   #82  <Method List PackageManager.queryIntentActivities(Intent, int)>
	//*  63  119:invokeinterface #85  <Method boolean List.isEmpty()>
	//*  64  124:ifeq            132
		{
			g();
	//   65  127:aload_0         
	//   66  128:invokespecial   #88  <Method void g()>
			return;
	//   67  131:return          
		} else
		{
			startActivity(intent);
	//   68  132:aload_0         
	//   69  133:aload_3         
	//   70  134:invokevirtual   #92  <Method void startActivity(Intent)>
			return;
	//   71  137:return          
		}
	}

	private void g()
	{
		android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (this)), l.LVDialogTheme);
	//    0    0:new             #94  <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #100 <Field int l.LVDialogTheme>
	//    4    8:invokespecial   #103 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context, int)>
	//    5   11:astore_1        
		builder.setTitle(k.gutebooks_not_found);
	//    6   12:aload_1         
	//    7   13:getstatic       #108 <Field int k.gutebooks_not_found>
	//    8   16:invokevirtual   #112 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
	//    9   19:pop             
		builder.setMessage(k.gutebooks_not_found_details);
	//   10   20:aload_1         
	//   11   21:getstatic       #115 <Field int k.gutebooks_not_found_details>
	//   12   24:invokevirtual   #118 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(int)>
	//   13   27:pop             
		builder.setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (new c(this))));
	//   14   28:aload_1         
	//   15   29:ldc1            #119 <Int 0x104000a>
	//   16   31:new             #121 <Class c>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #124 <Method void c(a)>
	//   20   39:invokevirtual   #128 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   21   42:pop             
		builder.setNegativeButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (new d(this))));
	//   22   43:aload_1         
	//   23   44:ldc1            #129 <Int 0x1040000>
	//   24   46:new             #131 <Class d>
	//   25   49:dup             
	//   26   50:aload_0         
	//   27   51:invokespecial   #132 <Method void d(a)>
	//   28   54:invokevirtual   #135 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   29   57:pop             
		builder.create().show();
	//   30   58:aload_1         
	//   31   59:invokevirtual   #139 <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   32   62:invokevirtual   #144 <Method void AlertDialog.show()>
	//   33   65:return          
	}

	protected void a(Intent intent, Bundle bundle)
	{
		boolean flag = "biz.bookdesign.librivox.SHOW_PLAY".equals(((Object) (intent.getAction())));
	//    0    0:ldc1            #147 <String "biz.bookdesign.librivox.SHOW_PLAY">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #150 <Method String Intent.getAction()>
	//    3    6:invokevirtual   #52  <Method boolean String.equals(Object)>
	//    4    9:istore          4
		int i = intent.getIntExtra("lvid", 0);
	//    5   11:aload_1         
	//    6   12:ldc1            #152 <String "lvid">
	//    7   14:iconst_0        
	//    8   15:invokevirtual   #156 <Method int Intent.getIntExtra(String, int)>
	//    9   18:istore_3        
		if(i != 0)
	//*  10   19:iload_3         
	//*  11   20:ifeq            88
		{
			bundle = ((Bundle) (b));
	//   12   23:aload_0         
	//   13   24:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//   14   27:astore_2        
			if(bundle != null && i != ((biz.bookdesign.librivox.b.a) (bundle)).p())
	//*  15   28:aload_2         
	//*  16   29:ifnull          69
	//*  17   32:iload_3         
	//*  18   33:aload_2         
	//*  19   34:invokevirtual   #160 <Method int biz.bookdesign.librivox.b.a.p()>
	//*  20   37:icmpeq          69
			{
				overridePendingTransition(0, 0);
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:iconst_0        
	//   24   43:invokevirtual   #164 <Method void overridePendingTransition(int, int)>
				intent.addFlags(0x10000);
	//   25   46:aload_1         
	//   26   47:ldc1            #76  <Int 0x10000>
	//   27   49:invokevirtual   #168 <Method Intent Intent.addFlags(int)>
	//   28   52:pop             
				finish();
	//   29   53:aload_0         
	//   30   54:invokevirtual   #171 <Method void finish()>
				overridePendingTransition(0, 0);
	//   31   57:aload_0         
	//   32   58:iconst_0        
	//   33   59:iconst_0        
	//   34   60:invokevirtual   #164 <Method void overridePendingTransition(int, int)>
				startActivity(intent);
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:invokevirtual   #92  <Method void startActivity(Intent)>
				return;
	//   38   68:return          
			}
			b = biz.bookdesign.librivox.b.a.a(i, getApplicationContext(), c);
	//   39   69:aload_0         
	//   40   70:iload_3         
	//   41   71:aload_0         
	//   42   72:invokevirtual   #175 <Method android.content.Context getApplicationContext()>
	//   43   75:aload_0         
	//   44   76:getfield        #179 <Field biz.bookdesign.librivox.b.j c>
	//   45   79:invokestatic    #182 <Method biz.bookdesign.librivox.b.a biz.bookdesign.librivox.b.a.a(int, android.content.Context, biz.bookdesign.librivox.b.j)>
	//   46   82:putfield        #24  <Field biz.bookdesign.librivox.b.a b>
		} else
	//*  47   85:goto            91
		{
			flag = true;
	//   48   88:iconst_1        
	//   49   89:istore          4
		}
		if(flag && f != null)
	//*  50   91:iload           4
	//*  51   93:ifeq            123
	//*  52   96:aload_0         
	//*  53   97:getfield        #186 <Field LocalAudioService f>
	//*  54  100:ifnull          123
		{
			intent = ((Intent) (f.f()));
	//   55  103:aload_0         
	//   56  104:getfield        #186 <Field LocalAudioService f>
	//   57  107:invokevirtual   #191 <Method m LocalAudioService.f()>
	//   58  110:astore_1        
			if(intent != null)
	//*  59  111:aload_1         
	//*  60  112:ifnull          123
				b = ((m) (intent)).k();
	//   61  115:aload_0         
	//   62  116:aload_1         
	//   63  117:invokevirtual   #197 <Method biz.bookdesign.librivox.b.a m.k()>
	//   64  120:putfield        #24  <Field biz.bookdesign.librivox.b.a b>
		}
		if(b == null)
	//*  65  123:aload_0         
	//*  66  124:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//*  67  127:ifnonnull       219
		{
			if(android.os.Build.VERSION.SDK_INT >= 22)
	//*  68  130:getstatic       #202 <Field int android.os.Build$VERSION.SDK_INT>
	//*  69  133:bipush          22
	//*  70  135:icmplt          175
			{
				intent = ((Intent) (new StringBuilder()));
	//   71  138:new             #54  <Class StringBuilder>
	//   72  141:dup             
	//   73  142:invokespecial   #55  <Method void StringBuilder()>
	//   74  145:astore_1        
				((StringBuilder) (intent)).append("failed intent origin ");
	//   75  146:aload_1         
	//   76  147:ldc1            #204 <String "failed intent origin ">
	//   77  149:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   78  152:pop             
				((StringBuilder) (intent)).append(((Object) (getReferrer())));
	//   79  153:aload_1         
	//   80  154:aload_0         
	//   81  155:invokevirtual   #208 <Method android.net.Uri getReferrer()>
	//   82  158:invokevirtual   #211 <Method StringBuilder StringBuilder.append(Object)>
	//   83  161:pop             
				com.crashlytics.android.a.a(4, "LibriVox", ((StringBuilder) (intent)).toString());
	//   84  162:iconst_4        
	//   85  163:ldc1            #213 <String "LibriVox">
	//   86  165:aload_1         
	//   87  166:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   88  169:invokestatic    #218 <Method void com.crashlytics.android.a.a(int, String, String)>
			} else
	//*  89  172:goto            209
			{
				intent = ((Intent) (new StringBuilder()));
	//   90  175:new             #54  <Class StringBuilder>
	//   91  178:dup             
	//   92  179:invokespecial   #55  <Method void StringBuilder()>
	//   93  182:astore_1        
				((StringBuilder) (intent)).append("failed intent origin ");
	//   94  183:aload_1         
	//   95  184:ldc1            #204 <String "failed intent origin ">
	//   96  186:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   97  189:pop             
				((StringBuilder) (intent)).append(((Object) (getCallingActivity())));
	//   98  190:aload_1         
	//   99  191:aload_0         
	//  100  192:invokevirtual   #222 <Method android.content.ComponentName getCallingActivity()>
	//  101  195:invokevirtual   #211 <Method StringBuilder StringBuilder.append(Object)>
	//  102  198:pop             
				com.crashlytics.android.a.a(4, "LibriVox", ((StringBuilder) (intent)).toString());
	//  103  199:iconst_4        
	//  104  200:ldc1            #213 <String "LibriVox">
	//  105  202:aload_1         
	//  106  203:invokevirtual   #65  <Method String StringBuilder.toString()>
	//  107  206:invokestatic    #218 <Method void com.crashlytics.android.a.a(int, String, String)>
			}
			throw new UnsupportedOperationException("BookActivity launched without LVID in intent and null/empty audio service.");
	//  108  209:new             #224 <Class UnsupportedOperationException>
	//  109  212:dup             
	//  110  213:ldc1            #226 <String "BookActivity launched without LVID in intent and null/empty audio service.">
	//  111  215:invokespecial   #229 <Method void UnsupportedOperationException(String)>
	//  112  218:athrow          
		}
		intent = ((Intent) (new StringBuilder()));
	//  113  219:new             #54  <Class StringBuilder>
	//  114  222:dup             
	//  115  223:invokespecial   #55  <Method void StringBuilder()>
	//  116  226:astore_1        
		((StringBuilder) (intent)).append(((Object)this).getClass().getName());
	//  117  227:aload_1         
	//  118  228:aload_0         
	//  119  229:invokevirtual   #235 <Method Class Object.getClass()>
	//  120  232:invokevirtual   #240 <Method String Class.getName()>
	//  121  235:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  122  238:pop             
		((StringBuilder) (intent)).append(" displaying ");
	//  123  239:aload_1         
	//  124  240:ldc1            #242 <String " displaying ">
	//  125  242:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  126  245:pop             
		((StringBuilder) (intent)).append(((Object) (b)));
	//  127  246:aload_1         
	//  128  247:aload_0         
	//  129  248:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//  130  251:invokevirtual   #211 <Method StringBuilder StringBuilder.append(Object)>
	//  131  254:pop             
		com.crashlytics.android.a.a(4, "LibriVox", ((StringBuilder) (intent)).toString());
	//  132  255:iconst_4        
	//  133  256:ldc1            #213 <String "LibriVox">
	//  134  258:aload_1         
	//  135  259:invokevirtual   #65  <Method String StringBuilder.toString()>
	//  136  262:invokestatic    #218 <Method void com.crashlytics.android.a.a(int, String, String)>
		intent = ((Intent) (getSupportActionBar()));
	//  137  265:aload_0         
	//  138  266:invokevirtual   #246 <Method ActionBar getSupportActionBar()>
	//  139  269:astore_1        
		if(intent != null)
	//* 140  270:aload_1         
	//* 141  271:ifnull          302
		{
			((ActionBar) (intent)).setDisplayHomeAsUpEnabled(true);
	//  142  274:aload_1         
	//  143  275:iconst_1        
	//  144  276:invokevirtual   #252 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
			setTitle(((CharSequence) (b.b())));
	//  145  279:aload_0         
	//  146  280:aload_0         
	//  147  281:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//  148  284:invokevirtual   #29  <Method String biz.bookdesign.librivox.b.a.b()>
	//  149  287:invokevirtual   #255 <Method void setTitle(CharSequence)>
			((ActionBar) (intent)).setTitle(((CharSequence) (b.b())));
	//  150  290:aload_1         
	//  151  291:aload_0         
	//  152  292:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//  153  295:invokevirtual   #29  <Method String biz.bookdesign.librivox.b.a.b()>
	//  154  298:invokevirtual   #256 <Method void ActionBar.setTitle(CharSequence)>
			return;
	//  155  301:return          
		} else
		{
			throw new RuntimeException("Expected theme to contain action bar.");
	//  156  302:new             #258 <Class RuntimeException>
	//  157  305:dup             
	//  158  306:ldc2            #260 <String "Expected theme to contain action bar.">
	//  159  309:invokespecial   #261 <Method void RuntimeException(String)>
	//  160  312:athrow          
		}
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		if((i & 0xffff) == 2465)
	//*   0    0:iload_1         
	//*   1    1:ldc2            #264 <Int 65535>
	//*   2    4:iand            
	//*   3    5:sipush          2465
	//*   4    8:icmpne          25
			a.a(((android.support.v4.app.x) (this)), c, j, intent);
	//    5   11:aload_0         
	//    6   12:getfield        #266 <Field dj a>
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #179 <Field biz.bookdesign.librivox.b.j c>
	//   10   20:iload_2         
	//   11   21:aload_3         
	//   12   22:invokevirtual   #271 <Method void dj.a(android.support.v4.app.x, biz.bookdesign.librivox.b.j, int, Intent)>
	//   13   25:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuItem menuitem = menu.findItem(h.menu_star);
	//    0    0:aload_1         
	//    1    1:getstatic       #278 <Field int h.menu_star>
	//    2    4:invokeinterface #284 <Method MenuItem Menu.findItem(int)>
	//    3    9:astore_2        
		biz.bookdesign.librivox.b.a a1 = b;
	//    4   10:aload_0         
	//    5   11:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//    6   14:astore_3        
		if(a1 != null && a1.g())
	//*   7   15:aload_3         
	//*   8   16:ifnull          39
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #286 <Method boolean biz.bookdesign.librivox.b.a.g()>
	//*  11   23:ifeq            39
			menuitem.setIcon(g.ic_starred);
	//   12   26:aload_2         
	//   13   27:getstatic       #291 <Field int g.ic_starred>
	//   14   30:invokeinterface #296 <Method MenuItem MenuItem.setIcon(int)>
	//   15   35:pop             
		else
	//*  16   36:goto            49
			menuitem.setIcon(g.ic_not_starred);
	//   17   39:aload_2         
	//   18   40:getstatic       #299 <Field int g.ic_not_starred>
	//   19   43:invokeinterface #296 <Method MenuItem MenuItem.setIcon(int)>
	//   20   48:pop             
		ae.a(menu, c, b, ((android.content.Context) (this)), true);
	//   21   49:aload_1         
	//   22   50:aload_0         
	//   23   51:getfield        #179 <Field biz.bookdesign.librivox.b.j c>
	//   24   54:aload_0         
	//   25   55:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//   26   58:aload_0         
	//   27   59:iconst_1        
	//   28   60:invokestatic    #304 <Method void ae.a(Menu, biz.bookdesign.librivox.b.j, biz.bookdesign.librivox.b.a, android.content.Context, boolean)>
		return super.onCreateOptionsMenu(menu);
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:invokespecial   #306 <Method boolean bi.onCreateOptionsMenu(Menu)>
	//   32   68:ireturn         
	}

	public void onDestroy()
	{
		dj dj1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field dj a>
	//    2    4:astore_1        
		if(dj1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			dj1.a(((android.support.v4.app.x) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #310 <Method void dj.a(android.support.v4.app.x)>
		super.onDestroy();
	//    8   14:aload_0         
	//    9   15:invokespecial   #312 <Method void bi.onDestroy()>
	//   10   18:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		int i = menuitem.getItemId();
	//    0    0:aload_1         
	//    1    1:invokeinterface #317 <Method int MenuItem.getItemId()>
	//    2    6:istore_2        
		if(i == h.menu_star)
	//*   3    7:iload_2         
	//*   4    8:getstatic       #278 <Field int h.menu_star>
	//*   5   11:icmpne          63
			if(b.g())
	//*   6   14:aload_0         
	//*   7   15:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//*   8   18:invokevirtual   #286 <Method boolean biz.bookdesign.librivox.b.a.g()>
	//*   9   21:ifeq            43
			{
				b.v();
	//   10   24:aload_0         
	//   11   25:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//   12   28:invokevirtual   #320 <Method void biz.bookdesign.librivox.b.a.v()>
				menuitem.setIcon(g.ic_not_starred);
	//   13   31:aload_1         
	//   14   32:getstatic       #299 <Field int g.ic_not_starred>
	//   15   35:invokeinterface #296 <Method MenuItem MenuItem.setIcon(int)>
	//   16   40:pop             
				return true;
	//   17   41:iconst_1        
	//   18   42:ireturn         
			} else
			{
				b.a(((android.support.v4.app.x) (this)));
	//   19   43:aload_0         
	//   20   44:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//   21   47:aload_0         
	//   22   48:invokevirtual   #321 <Method void biz.bookdesign.librivox.b.a.a(android.support.v4.app.x)>
				menuitem.setIcon(g.ic_starred);
	//   23   51:aload_1         
	//   24   52:getstatic       #291 <Field int g.ic_starred>
	//   25   55:invokeinterface #296 <Method MenuItem MenuItem.setIcon(int)>
	//   26   60:pop             
				return true;
	//   27   61:iconst_1        
	//   28   62:ireturn         
			}
		if(i == h.menu_download)
	//*  29   63:iload_2         
	//*  30   64:getstatic       #324 <Field int h.menu_download>
	//*  31   67:icmpne          80
		{
			b.c(((android.support.v4.app.x) (this)));
	//   32   70:aload_0         
	//   33   71:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//   34   74:aload_0         
	//   35   75:invokevirtual   #326 <Method void biz.bookdesign.librivox.b.a.c(android.support.v4.app.x)>
			return true;
	//   36   78:iconst_1        
	//   37   79:ireturn         
		}
		if(i == h.menu_remove_downloads)
	//*  38   80:iload_2         
	//*  39   81:getstatic       #329 <Field int h.menu_remove_downloads>
	//*  40   84:icmpne          95
		{
			showDialog(8);
	//   41   87:aload_0         
	//   42   88:bipush          8
	//   43   90:invokevirtual   #333 <Method void showDialog(int)>
			return true;
	//   44   93:iconst_1        
	//   45   94:ireturn         
		}
		if(i == h.menu_ebook)
	//*  46   95:iload_2         
	//*  47   96:getstatic       #336 <Field int h.menu_ebook>
	//*  48   99:icmpne          108
		{
			a();
	//   49  102:aload_0         
	//   50  103:invokespecial   #338 <Method void a()>
			return true;
	//   51  106:iconst_1        
	//   52  107:ireturn         
		}
		if(i == h.menu_share)
	//*  53  108:iload_2         
	//*  54  109:getstatic       #341 <Field int h.menu_share>
	//*  55  112:icmpne          191
		{
			menuitem = ((MenuItem) (new Intent()));
	//   56  115:new             #15  <Class Intent>
	//   57  118:dup             
	//   58  119:invokespecial   #16  <Method void Intent()>
	//   59  122:astore_1        
			((Intent) (menuitem)).setAction("android.intent.action.SEND");
	//   60  123:aload_1         
	//   61  124:ldc2            #343 <String "android.intent.action.SEND">
	//   62  127:invokevirtual   #22  <Method Intent Intent.setAction(String)>
	//   63  130:pop             
			((Intent) (menuitem)).putExtra("android.intent.extra.TEXT", b.F());
	//   64  131:aload_1         
	//   65  132:ldc2            #345 <String "android.intent.extra.TEXT">
	//   66  135:aload_0         
	//   67  136:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//   68  139:invokevirtual   #348 <Method String biz.bookdesign.librivox.b.a.F()>
	//   69  142:invokevirtual   #71  <Method Intent Intent.putExtra(String, String)>
	//   70  145:pop             
			((Intent) (menuitem)).putExtra("android.intent.extra.HTML_TEXT", b.G());
	//   71  146:aload_1         
	//   72  147:ldc2            #350 <String "android.intent.extra.HTML_TEXT">
	//   73  150:aload_0         
	//   74  151:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//   75  154:invokevirtual   #353 <Method String biz.bookdesign.librivox.b.a.G()>
	//   76  157:invokevirtual   #71  <Method Intent Intent.putExtra(String, String)>
	//   77  160:pop             
			((Intent) (menuitem)).putExtra("android.intent.extra.SUBJECT", b.b());
	//   78  161:aload_1         
	//   79  162:ldc2            #355 <String "android.intent.extra.SUBJECT">
	//   80  165:aload_0         
	//   81  166:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//   82  169:invokevirtual   #29  <Method String biz.bookdesign.librivox.b.a.b()>
	//   83  172:invokevirtual   #71  <Method Intent Intent.putExtra(String, String)>
	//   84  175:pop             
			((Intent) (menuitem)).setType("text/plain");
	//   85  176:aload_1         
	//   86  177:ldc2            #357 <String "text/plain">
	//   87  180:invokevirtual   #360 <Method Intent Intent.setType(String)>
	//   88  183:pop             
			startActivity(((Intent) (menuitem)));
	//   89  184:aload_0         
	//   90  185:aload_1         
	//   91  186:invokevirtual   #92  <Method void startActivity(Intent)>
			return true;
	//   92  189:iconst_1        
	//   93  190:ireturn         
		}
		if(i == h.menu_preferences)
	//*  94  191:iload_2         
	//*  95  192:getstatic       #363 <Field int h.menu_preferences>
	//*  96  195:icmpne          218
		{
			startActivity(new Intent(getApplicationContext(), biz/bookdesign/librivox/SettingsActivity));
	//   97  198:aload_0         
	//   98  199:new             #15  <Class Intent>
	//   99  202:dup             
	//  100  203:aload_0         
	//  101  204:invokevirtual   #175 <Method android.content.Context getApplicationContext()>
	//  102  207:ldc2            #365 <Class SettingsActivity>
	//  103  210:invokespecial   #368 <Method void Intent(android.content.Context, Class)>
	//  104  213:invokevirtual   #92  <Method void startActivity(Intent)>
			return true;
	//  105  216:iconst_1        
	//  106  217:ireturn         
		} else
		{
			ae.a(((android.support.v4.app.x) (this)), c, b, menuitem, ((Runnable) (new b(this))));
	//  107  218:aload_0         
	//  108  219:aload_0         
	//  109  220:getfield        #179 <Field biz.bookdesign.librivox.b.j c>
	//  110  223:aload_0         
	//  111  224:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//  112  227:aload_1         
	//  113  228:new             #370 <Class b>
	//  114  231:dup             
	//  115  232:aload_0         
	//  116  233:invokespecial   #371 <Method void b(a)>
	//  117  236:invokestatic    #374 <Method void ae.a(android.support.v4.app.x, biz.bookdesign.librivox.b.j, biz.bookdesign.librivox.b.a, MenuItem, Runnable)>
			return true;
	//  118  239:iconst_1        
	//  119  240:ireturn         
		}
	}

	public boolean onPrepareOptionsMenu(Menu menu)
	{
		biz.bookdesign.librivox.b.a a1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//    2    4:astore_2        
		if(a1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       21
		{
			com.crashlytics.android.a.a(6, "LibriVox", "onPrepareOptionsMenu called before mBook initialized.");
	//    5    9:bipush          6
	//    6   11:ldc1            #213 <String "LibriVox">
	//    7   13:ldc2            #377 <String "onPrepareOptionsMenu called before mBook initialized.">
	//    8   16:invokestatic    #218 <Method void com.crashlytics.android.a.a(int, String, String)>
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		}
		if(a1.o() == 1)
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #380 <Method int biz.bookdesign.librivox.b.a.o()>
	//*  13   25:iconst_1        
	//*  14   26:icmpne          38
			menu.removeItem(h.menu_download);
	//   15   29:aload_1         
	//   16   30:getstatic       #324 <Field int h.menu_download>
	//   17   33:invokeinterface #383 <Method void Menu.removeItem(int)>
		if(b.o() == 0)
	//*  18   38:aload_0         
	//*  19   39:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//*  20   42:invokevirtual   #380 <Method int biz.bookdesign.librivox.b.a.o()>
	//*  21   45:ifne            57
			menu.removeItem(h.menu_remove_downloads);
	//   22   48:aload_1         
	//   23   49:getstatic       #329 <Field int h.menu_remove_downloads>
	//   24   52:invokeinterface #383 <Method void Menu.removeItem(int)>
		menu = ((Menu) (menu.findItem(h.menu_star)));
	//   25   57:aload_1         
	//   26   58:getstatic       #278 <Field int h.menu_star>
	//   27   61:invokeinterface #284 <Method MenuItem Menu.findItem(int)>
	//   28   66:astore_1        
		if(b.g())
	//*  29   67:aload_0         
	//*  30   68:getfield        #24  <Field biz.bookdesign.librivox.b.a b>
	//*  31   71:invokevirtual   #286 <Method boolean biz.bookdesign.librivox.b.a.g()>
	//*  32   74:ifeq            89
		{
			((MenuItem) (menu)).setIcon(g.ic_starred);
	//   33   77:aload_1         
	//   34   78:getstatic       #291 <Field int g.ic_starred>
	//   35   81:invokeinterface #296 <Method MenuItem MenuItem.setIcon(int)>
	//   36   86:pop             
			return true;
	//   37   87:iconst_1        
	//   38   88:ireturn         
		} else
		{
			((MenuItem) (menu)).setIcon(g.ic_not_starred);
	//   39   89:aload_1         
	//   40   90:getstatic       #299 <Field int g.ic_not_starred>
	//   41   93:invokeinterface #296 <Method MenuItem MenuItem.setIcon(int)>
	//   42   98:pop             
			return true;
	//   43   99:iconst_1        
	//   44  100:ireturn         
		}
	}

	dj a;
	biz.bookdesign.librivox.b.a b;
}
