// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.a.g;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.a.j;
import biz.bookdesign.librivox.a.k;
import biz.bookdesign.librivox.a.l;
import biz.bookdesign.librivox.b.a;
import biz.bookdesign.librivox.b.q;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;
import com.google.android.gms.common.api.w;
import com.google.android.gms.common.api.x;

// Referenced classes of package biz.bookdesign.librivox:
//			a, v, m, l, 
//			u, t, s, r, 
//			q, p, o, n, 
//			k, bw, LibriVoxDetailsActivity, LibriVoxActivity

public class BookActivity extends biz.bookdesign.librivox.a
{

	public BookActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void biz.bookdesign.librivox.a()>
		i = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field Dialog i>
	//    5    9:aload_0         
	//    6   10:new             #20  <Class v>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:invokespecial   #23  <Method void v(BookActivity, biz.bookdesign.librivox.k)>
	//   11   19:putfield        #25  <Field BroadcastReceiver j>
	//   12   22:return          
	}

	protected void a(Intent intent, Bundle bundle)
	{
		super.a(intent, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #30  <Method void biz.bookdesign.librivox.a.a(Intent, Bundle)>
		if("biz.bookdesign.librivox.CANCEL_DOWNLOAD".equals(((Object) (intent.getAction()))))
	//*   4    6:ldc1            #32  <String "biz.bookdesign.librivox.CANCEL_DOWNLOAD">
	//*   5    8:aload_1         
	//*   6    9:invokevirtual   #38  <Method String Intent.getAction()>
	//*   7   12:invokevirtual   #44  <Method boolean String.equals(Object)>
	//*   8   15:ifeq            24
			showDialog(11);
	//    9   18:aload_0         
	//   10   19:bipush          11
	//   11   21:invokevirtual   #48  <Method void showDialog(int)>
		if(b instanceof q)
	//*  12   24:aload_0         
	//*  13   25:getfield        #52  <Field a b>
	//*  14   28:instanceof      #54  <Class q>
	//*  15   31:ifeq            63
		{
			intent = ((Intent) ((q)b));
	//   16   34:aload_0         
	//   17   35:getfield        #52  <Field a b>
	//   18   38:checkcast       #54  <Class q>
	//   19   41:astore_1        
			if(((q) (intent)).m() == 1 && ((q) (intent)).o() == 0)
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #58  <Method int q.m()>
	//*  22   46:iconst_1        
	//*  23   47:icmpne          63
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #61  <Method int q.o()>
	//*  26   54:ifne            63
				showDialog(13);
	//   27   57:aload_0         
	//   28   58:bipush          13
	//   29   60:invokevirtual   #48  <Method void showDialog(int)>
		}
	//   30   63:return          
	}

	public void onBackPressed()
	{
		if(!b.g() && b.o() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field a b>
	//*   2    4:invokevirtual   #67  <Method boolean a.g()>
	//*   3    7:ifne            27
	//*   4   10:aload_0         
	//*   5   11:getfield        #52  <Field a b>
	//*   6   14:invokevirtual   #68  <Method int a.o()>
	//*   7   17:ifeq            27
		{
			showDialog(9);
	//    8   20:aload_0         
	//    9   21:bipush          9
	//   10   23:invokevirtual   #48  <Method void showDialog(int)>
			return;
	//   11   26:return          
		} else
		{
			super.onBackPressed();
	//   12   27:aload_0         
	//   13   28:invokespecial   #70  <Method void a.onBackPressed()>
			return;
	//   14   31:return          
		}
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method void a.onCreate(Bundle)>
		setContentView(i.book_layout);
	//    3    5:aload_0         
	//    4    6:getstatic       #80  <Field int i.book_layout>
	//    5    9:invokevirtual   #83  <Method void setContentView(int)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   12:getstatic       #88  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          21
	//*   8   17:icmplt          24
			postponeEnterTransition();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #91  <Method void postponeEnterTransition()>
		a(getIntent(), bundle);
	//   11   24:aload_0         
	//   12   25:aload_0         
	//   13   26:invokevirtual   #95  <Method Intent getIntent()>
	//   14   29:aload_1         
	//   15   30:invokevirtual   #96  <Method void a(Intent, Bundle)>
		g = (new x(((android.content.Context) (this)))).a(c.a).b();
	//   16   33:aload_0         
	//   17   34:new             #98  <Class x>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:invokespecial   #101 <Method void x(android.content.Context)>
	//   21   42:getstatic       #106 <Field com.google.android.gms.common.api.a c.a>
	//   22   45:invokevirtual   #109 <Method x x.a(com.google.android.gms.common.api.a)>
	//   23   48:invokevirtual   #112 <Method w x.b()>
	//   24   51:putfield        #114 <Field w g>
		long l1 = System.currentTimeMillis() / 1000L;
	//   25   54:invokestatic    #120 <Method long System.currentTimeMillis()>
	//   26   57:ldc2w           #121 <Long 1000L>
	//   27   60:ldiv            
	//   28   61:lstore_2        
		bundle = ((Bundle) (PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (this))).edit()));
	//   29   62:aload_0         
	//   30   63:invokestatic    #128 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//   31   66:invokeinterface #134 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   32   71:astore_1        
		((android.content.SharedPreferences.Editor) (bundle)).putLong("playback_start", l1);
	//   33   72:aload_1         
	//   34   73:ldc1            #136 <String "playback_start">
	//   35   75:lload_2         
	//   36   76:invokeinterface #142 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   37   81:pop             
		((android.content.SharedPreferences.Editor) (bundle)).apply();
	//   38   82:aload_1         
	//   39   83:invokeinterface #145 <Method void android.content.SharedPreferences$Editor.apply()>
	//   40   88:return          
	}

	protected Dialog onCreateDialog(int i1, Bundle bundle)
	{
		android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (this)), l.LVDialogTheme);
	//    0    0:new             #149 <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #154 <Field int l.LVDialogTheme>
	//    4    8:invokespecial   #157 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context, int)>
	//    5   11:astore_3        
		switch(i1)
	//*   6   12:iload_1         
		{
	//*   7   13:tableswitch     8 13: default 52
	//	               8 304
	//	               9 230
	//	               10 52
	//	               11 173
	//	               12 116
	//	               13 59
		case 10: // '\n'
		default:
			return super.onCreateDialog(i1, bundle);
	//    8   52:aload_0         
	//    9   53:iload_1         
	//   10   54:aload_2         
	//   11   55:invokespecial   #159 <Method Dialog a.onCreateDialog(int, Bundle)>
	//   12   58:areturn         

		case 13: // '\r'
			builder.setMessage(((CharSequence) (getString(k.download_retail_prompt)))).setCancelable(false).setPositiveButton(((CharSequence) (getString(k.yes))), ((android.content.DialogInterface.OnClickListener) (new m(this)))).setNegativeButton(((CharSequence) (getString(k.no))), ((android.content.DialogInterface.OnClickListener) (new biz.bookdesign.librivox.l(this))));
	//   13   59:aload_3         
	//   14   60:aload_0         
	//   15   61:getstatic       #164 <Field int k.download_retail_prompt>
	//   16   64:invokevirtual   #168 <Method String getString(int)>
	//   17   67:invokevirtual   #172 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   18   70:iconst_0        
	//   19   71:invokevirtual   #176 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCancelable(boolean)>
	//   20   74:aload_0         
	//   21   75:getstatic       #179 <Field int k.yes>
	//   22   78:invokevirtual   #168 <Method String getString(int)>
	//   23   81:new             #181 <Class m>
	//   24   84:dup             
	//   25   85:aload_0         
	//   26   86:invokespecial   #184 <Method void m(BookActivity)>
	//   27   89:invokevirtual   #188 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   28   92:aload_0         
	//   29   93:getstatic       #191 <Field int k.no>
	//   30   96:invokevirtual   #168 <Method String getString(int)>
	//   31   99:new             #193 <Class biz.bookdesign.librivox.l>
	//   32  102:dup             
	//   33  103:aload_0         
	//   34  104:invokespecial   #194 <Method void biz.bookdesign.librivox.l(BookActivity)>
	//   35  107:invokevirtual   #197 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   36  110:pop             
			return ((Dialog) (builder.create()));
	//   37  111:aload_3         
	//   38  112:invokevirtual   #201 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   39  115:areturn         

		case 12: // '\f'
			builder.setMessage(((CharSequence) (getString(k.resume_download)))).setCancelable(false).setPositiveButton(((CharSequence) (getString(k.yes))), ((android.content.DialogInterface.OnClickListener) (new u(this)))).setNegativeButton(((CharSequence) (getString(k.no))), ((android.content.DialogInterface.OnClickListener) (new t(this))));
	//   40  116:aload_3         
	//   41  117:aload_0         
	//   42  118:getstatic       #204 <Field int k.resume_download>
	//   43  121:invokevirtual   #168 <Method String getString(int)>
	//   44  124:invokevirtual   #172 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   45  127:iconst_0        
	//   46  128:invokevirtual   #176 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCancelable(boolean)>
	//   47  131:aload_0         
	//   48  132:getstatic       #179 <Field int k.yes>
	//   49  135:invokevirtual   #168 <Method String getString(int)>
	//   50  138:new             #206 <Class u>
	//   51  141:dup             
	//   52  142:aload_0         
	//   53  143:invokespecial   #207 <Method void u(BookActivity)>
	//   54  146:invokevirtual   #188 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   55  149:aload_0         
	//   56  150:getstatic       #191 <Field int k.no>
	//   57  153:invokevirtual   #168 <Method String getString(int)>
	//   58  156:new             #209 <Class t>
	//   59  159:dup             
	//   60  160:aload_0         
	//   61  161:invokespecial   #210 <Method void t(BookActivity)>
	//   62  164:invokevirtual   #197 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   63  167:pop             
			return ((Dialog) (builder.create()));
	//   64  168:aload_3         
	//   65  169:invokevirtual   #201 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   66  172:areturn         

		case 11: // '\013'
			builder.setMessage(((CharSequence) (getString(k.cancel_download)))).setCancelable(false).setPositiveButton(((CharSequence) (getString(k.yes))), ((android.content.DialogInterface.OnClickListener) (new s(this)))).setNegativeButton(((CharSequence) (getString(k.no))), ((android.content.DialogInterface.OnClickListener) (new r(this))));
	//   67  173:aload_3         
	//   68  174:aload_0         
	//   69  175:getstatic       #213 <Field int k.cancel_download>
	//   70  178:invokevirtual   #168 <Method String getString(int)>
	//   71  181:invokevirtual   #172 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   72  184:iconst_0        
	//   73  185:invokevirtual   #176 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCancelable(boolean)>
	//   74  188:aload_0         
	//   75  189:getstatic       #179 <Field int k.yes>
	//   76  192:invokevirtual   #168 <Method String getString(int)>
	//   77  195:new             #215 <Class s>
	//   78  198:dup             
	//   79  199:aload_0         
	//   80  200:invokespecial   #216 <Method void s(BookActivity)>
	//   81  203:invokevirtual   #188 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   82  206:aload_0         
	//   83  207:getstatic       #191 <Field int k.no>
	//   84  210:invokevirtual   #168 <Method String getString(int)>
	//   85  213:new             #218 <Class r>
	//   86  216:dup             
	//   87  217:aload_0         
	//   88  218:invokespecial   #219 <Method void r(BookActivity)>
	//   89  221:invokevirtual   #197 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   90  224:pop             
			return ((Dialog) (builder.create()));
	//   91  225:aload_3         
	//   92  226:invokevirtual   #201 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   93  229:areturn         

		case 9: // '\t'
			builder.setMessage(((CharSequence) (getString(k.exit_download_no_star)))).setCancelable(false).setPositiveButton(((CharSequence) (getString(k.yes))), ((android.content.DialogInterface.OnClickListener) (new biz.bookdesign.librivox.q(this)))).setNegativeButton(((CharSequence) (getString(k.no))), ((android.content.DialogInterface.OnClickListener) (new p(this)))).setNeutralButton(((CharSequence) (getString(0x1040000))), ((android.content.DialogInterface.OnClickListener) (new o(this))));
	//   94  230:aload_3         
	//   95  231:aload_0         
	//   96  232:getstatic       #222 <Field int k.exit_download_no_star>
	//   97  235:invokevirtual   #168 <Method String getString(int)>
	//   98  238:invokevirtual   #172 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   99  241:iconst_0        
	//  100  242:invokevirtual   #176 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCancelable(boolean)>
	//  101  245:aload_0         
	//  102  246:getstatic       #179 <Field int k.yes>
	//  103  249:invokevirtual   #168 <Method String getString(int)>
	//  104  252:new             #224 <Class biz.bookdesign.librivox.q>
	//  105  255:dup             
	//  106  256:aload_0         
	//  107  257:invokespecial   #225 <Method void biz.bookdesign.librivox.q(BookActivity)>
	//  108  260:invokevirtual   #188 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  109  263:aload_0         
	//  110  264:getstatic       #191 <Field int k.no>
	//  111  267:invokevirtual   #168 <Method String getString(int)>
	//  112  270:new             #227 <Class p>
	//  113  273:dup             
	//  114  274:aload_0         
	//  115  275:invokespecial   #228 <Method void p(BookActivity)>
	//  116  278:invokevirtual   #197 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  117  281:aload_0         
	//  118  282:ldc1            #229 <Int 0x1040000>
	//  119  284:invokevirtual   #168 <Method String getString(int)>
	//  120  287:new             #231 <Class o>
	//  121  290:dup             
	//  122  291:aload_0         
	//  123  292:invokespecial   #232 <Method void o(BookActivity)>
	//  124  295:invokevirtual   #235 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNeutralButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  125  298:pop             
			return ((Dialog) (builder.create()));
	//  126  299:aload_3         
	//  127  300:invokevirtual   #201 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//  128  303:areturn         

		case 8: // '\b'
			builder.setMessage(((CharSequence) (getString(k.remove_download_prompt_book)))).setCancelable(false).setPositiveButton(((CharSequence) (getString(k.yes))), ((android.content.DialogInterface.OnClickListener) (new n(this)))).setNegativeButton(((CharSequence) (getString(k.no))), ((android.content.DialogInterface.OnClickListener) (new biz.bookdesign.librivox.k(this))));
	//  129  304:aload_3         
	//  130  305:aload_0         
	//  131  306:getstatic       #238 <Field int k.remove_download_prompt_book>
	//  132  309:invokevirtual   #168 <Method String getString(int)>
	//  133  312:invokevirtual   #172 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//  134  315:iconst_0        
	//  135  316:invokevirtual   #176 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCancelable(boolean)>
	//  136  319:aload_0         
	//  137  320:getstatic       #179 <Field int k.yes>
	//  138  323:invokevirtual   #168 <Method String getString(int)>
	//  139  326:new             #240 <Class n>
	//  140  329:dup             
	//  141  330:aload_0         
	//  142  331:invokespecial   #241 <Method void n(BookActivity)>
	//  143  334:invokevirtual   #188 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  144  337:aload_0         
	//  145  338:getstatic       #191 <Field int k.no>
	//  146  341:invokevirtual   #168 <Method String getString(int)>
	//  147  344:new             #243 <Class biz.bookdesign.librivox.k>
	//  148  347:dup             
	//  149  348:aload_0         
	//  150  349:invokespecial   #244 <Method void biz.bookdesign.librivox.k(BookActivity)>
	//  151  352:invokevirtual   #197 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  152  355:pop             
			return ((Dialog) (builder.create()));
	//  153  356:aload_3         
	//  154  357:invokevirtual   #201 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//  155  360:areturn         
		}
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(j.book_menu, menu);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method MenuInflater getMenuInflater()>
	//    2    4:getstatic       #255 <Field int j.book_menu>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #261 <Method void MenuInflater.inflate(int, Menu)>
		return super.onCreateOptionsMenu(menu);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #263 <Method boolean a.onCreateOptionsMenu(Menu)>
	//    8   16:ireturn         
	}

	protected void onNewIntent(Intent intent)
	{
		a(intent, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #96  <Method void a(Intent, Bundle)>
		super.onNewIntent(intent);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #267 <Method void a.onNewIntent(Intent)>
	//    7   11:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #274 <Method int MenuItem.getItemId()>
	//*   2    6:ldc2            #275 <Int 0x102002c>
	//*   3    9:icmpne          64
		{
			if(biz.bookdesign.librivox.bw.i() == 0)
	//*   4   12:invokestatic    #279 <Method int biz.bookdesign.librivox.bw.i()>
	//*   5   15:ifne            33
				menuitem = ((MenuItem) (new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/LibriVoxDetailsActivity)));
	//    6   18:new             #34  <Class Intent>
	//    7   21:dup             
	//    8   22:aload_0         
	//    9   23:ldc2            #281 <Class LibriVoxDetailsActivity>
	//   10   26:invokespecial   #284 <Method void Intent(android.content.Context, Class)>
	//   11   29:astore_1        
			else
	//*  12   30:goto            45
				menuitem = ((MenuItem) (new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/LibriVoxActivity)));
	//   13   33:new             #34  <Class Intent>
	//   14   36:dup             
	//   15   37:aload_0         
	//   16   38:ldc2            #286 <Class LibriVoxActivity>
	//   17   41:invokespecial   #284 <Method void Intent(android.content.Context, Class)>
	//   18   44:astore_1        
			((Intent) (menuitem)).addFlags(0x4000000);
	//   19   45:aload_1         
	//   20   46:ldc2            #287 <Int 0x4000000>
	//   21   49:invokevirtual   #291 <Method Intent Intent.addFlags(int)>
	//   22   52:pop             
			startActivity(((Intent) (menuitem)));
	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:invokevirtual   #294 <Method void startActivity(Intent)>
			finish();
	//   26   58:aload_0         
	//   27   59:invokevirtual   #297 <Method void finish()>
			return true;
	//   28   62:iconst_1        
	//   29   63:ireturn         
		} else
		{
			return super.onOptionsItemSelected(menuitem);
	//   30   64:aload_0         
	//   31   65:aload_1         
	//   32   66:invokespecial   #299 <Method boolean a.onOptionsItemSelected(MenuItem)>
	//   33   69:ireturn         
		}
	}

	protected void onPause()
	{
		d.a(j);
	//    0    0:aload_0         
	//    1    1:getfield        #307 <Field g d>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field BroadcastReceiver j>
	//    4    8:invokevirtual   #312 <Method void g.a(BroadcastReceiver)>
		super.onPause();
	//    5   11:aload_0         
	//    6   12:invokespecial   #314 <Method void a.onPause()>
	//    7   15:return          
	}

	protected void onResume()
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #318 <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #319 <Method void IntentFilter()>
	//    3    7:astore_1        
		intentfilter.addAction("biz.bookdesign.librivox.STAR_NOTIFICATION");
	//    4    8:aload_1         
	//    5    9:ldc2            #321 <String "biz.bookdesign.librivox.STAR_NOTIFICATION">
	//    6   12:invokevirtual   #325 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.dl.DOWNLOAD_NOTIFICATION");
	//    7   15:aload_1         
	//    8   16:ldc2            #327 <String "biz.bookdesign.librivox.dl.DOWNLOAD_NOTIFICATION">
	//    9   19:invokevirtual   #325 <Method void IntentFilter.addAction(String)>
		d.a(j, intentfilter);
	//   10   22:aload_0         
	//   11   23:getfield        #307 <Field g d>
	//   12   26:aload_0         
	//   13   27:getfield        #25  <Field BroadcastReceiver j>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #330 <Method void g.a(BroadcastReceiver, IntentFilter)>
		b.s();
	//   16   34:aload_0         
	//   17   35:getfield        #52  <Field a b>
	//   18   38:invokevirtual   #333 <Method void a.s()>
		super.onResume();
	//   19   41:aload_0         
	//   20   42:invokespecial   #335 <Method void a.onResume()>
	//   21   45:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #338 <Method void a.onStart()>
		g.e();
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field w g>
	//    4    8:invokevirtual   #343 <Method void w.e()>
		h = com.google.android.gms.a.a.a("http://schema.org/ViewAction", b.b(), b.H(), b.I());
	//    5   11:aload_0         
	//    6   12:ldc2            #345 <String "http://schema.org/ViewAction">
	//    7   15:aload_0         
	//    8   16:getfield        #52  <Field a b>
	//    9   19:invokevirtual   #347 <Method String a.b()>
	//   10   22:aload_0         
	//   11   23:getfield        #52  <Field a b>
	//   12   26:invokevirtual   #351 <Method android.net.Uri a.H()>
	//   13   29:aload_0         
	//   14   30:getfield        #52  <Field a b>
	//   15   33:invokevirtual   #353 <Method android.net.Uri a.I()>
	//   16   36:invokestatic    #358 <Method com.google.android.gms.a.a com.google.android.gms.a.a.a(String, String, android.net.Uri, android.net.Uri)>
	//   17   39:putfield        #360 <Field com.google.android.gms.a.a h>
		c.c.a(g, h);
	//   18   42:getstatic       #364 <Field d c.c>
	//   19   45:aload_0         
	//   20   46:getfield        #114 <Field w g>
	//   21   49:aload_0         
	//   22   50:getfield        #360 <Field com.google.android.gms.a.a h>
	//   23   53:invokeinterface #369 <Method com.google.android.gms.common.api.ab d.a(w, com.google.android.gms.a.a)>
	//   24   58:pop             
	//   25   59:return          
	}

	public void onStop()
	{
		Dialog dialog = i;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Dialog i>
	//    2    4:astore_1        
		if(dialog != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			dialog.dismiss();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #375 <Method void Dialog.dismiss()>
			i = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #18  <Field Dialog i>
		}
		c.c.b(g, h);
	//   10   18:getstatic       #364 <Field d c.c>
	//   11   21:aload_0         
	//   12   22:getfield        #114 <Field w g>
	//   13   25:aload_0         
	//   14   26:getfield        #360 <Field com.google.android.gms.a.a h>
	//   15   29:invokeinterface #377 <Method com.google.android.gms.common.api.ab d.b(w, com.google.android.gms.a.a)>
	//   16   34:pop             
		g.g();
	//   17   35:aload_0         
	//   18   36:getfield        #114 <Field w g>
	//   19   39:invokevirtual   #379 <Method void w.g()>
		super.onStop();
	//   20   42:aload_0         
	//   21   43:invokespecial   #381 <Method void a.onStop()>
	//   22   46:return          
	}

	private w g;
	private com.google.android.gms.a.a h;
	private Dialog i;
	private final BroadcastReceiver j = new v(this, ((biz.bookdesign.librivox.k) (null)));
}
