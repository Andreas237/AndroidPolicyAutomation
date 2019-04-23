// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.Dialog;
import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.SearchRecentSuggestions;
import android.support.v4.a.g;
import android.support.v4.app.ae;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import biz.bookdesign.catalogbase.a;
import biz.bookdesign.catalogbase.u;
import biz.bookdesign.librivox.a.c;
import biz.bookdesign.librivox.a.f;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.a.k;
import biz.bookdesign.librivox.a.l;
import biz.bookdesign.librivox.b.j;
import biz.bookdesign.librivox.b.n;
import biz.bookdesign.librivox.b.q;
import biz.bookdesign.librivox.support.b;
import java.util.List;

// Referenced classes of package biz.bookdesign.librivox:
//			ao, bt, bq, bw, 
//			bu, bv, LibriVoxDetailsActivity, bs, 
//			br, bp, CatalogFragment, ga, 
//			ge, SettingsActivity

public class LibriVoxActivity extends ao
{

	public LibriVoxActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ao()>
	//    2    4:return          
	}

	private void a(Intent intent)
	{
label0:
		{
			String s1;
			String s3;
label1:
			{
				String s5 = intent.getStringExtra("android.intent.extra.focus");
	//    0    0:aload_1         
	//    1    1:ldc1            #13  <String "android.intent.extra.focus">
	//    2    3:invokevirtual   #19  <Method String Intent.getStringExtra(String)>
	//    3    6:astore          7
				String s4 = intent.getStringExtra("query");
	//    4    8:aload_1         
	//    5    9:ldc1            #21  <String "query">
	//    6   11:invokevirtual   #19  <Method String Intent.getStringExtra(String)>
	//    7   14:astore          6
				String s = intent.getStringExtra("android.intent.extra.album");
	//    8   16:aload_1         
	//    9   17:ldc1            #23  <String "android.intent.extra.album">
	//   10   19:invokevirtual   #19  <Method String Intent.getStringExtra(String)>
	//   11   22:astore_2        
				s3 = intent.getStringExtra("android.intent.extra.artist");
	//   12   23:aload_1         
	//   13   24:ldc1            #25  <String "android.intent.extra.artist">
	//   14   26:invokevirtual   #19  <Method String Intent.getStringExtra(String)>
	//   15   29:astore          5
				s1 = intent.getStringExtra("android.intent.extra.genre");
	//   16   31:aload_1         
	//   17   32:ldc1            #27  <String "android.intent.extra.genre">
	//   18   34:invokevirtual   #19  <Method String Intent.getStringExtra(String)>
	//   19   37:astore_3        
				String s2 = intent.getStringExtra("android.intent.extra.title");
	//   20   38:aload_1         
	//   21   39:ldc1            #29  <String "android.intent.extra.title">
	//   22   41:invokevirtual   #19  <Method String Intent.getStringExtra(String)>
	//   23   44:astore          4
				if(s5 == null)
	//*  24   46:aload           7
	//*  25   48:ifnonnull       74
				{
					intent = ((Intent) (new u(8)));
	//   26   51:new             #31  <Class u>
	//   27   54:dup             
	//   28   55:bipush          8
	//   29   57:invokespecial   #34  <Method void u(int)>
	//   30   60:astore_1        
					((u) (intent)).a(s4);
	//   31   61:aload_1         
	//   32   62:aload           6
	//   33   64:invokevirtual   #37  <Method u u.a(String)>
	//   34   67:pop             
					a(((u) (intent)));
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:invokespecial   #40  <Method void a(u)>
					return;
	//   38   73:return          
				}
				if(s5.compareTo("vnd.android.cursor.item/*") == 0)
	//*  39   74:aload           7
	//*  40   76:ldc1            #42  <String "vnd.android.cursor.item/*">
	//*  41   78:invokevirtual   #48  <Method int String.compareTo(String)>
	//*  42   81:ifne            128
					if(s4.isEmpty())
	//*  43   84:aload           6
	//*  44   86:invokevirtual   #52  <Method boolean String.isEmpty()>
	//*  45   89:ifeq            105
					{
						a(new u(1));
	//   46   92:aload_0         
	//   47   93:new             #31  <Class u>
	//   48   96:dup             
	//   49   97:iconst_1        
	//   50   98:invokespecial   #34  <Method void u(int)>
	//   51  101:invokespecial   #40  <Method void a(u)>
						return;
	//   52  104:return          
					} else
					{
						intent = ((Intent) (new u(8)));
	//   53  105:new             #31  <Class u>
	//   54  108:dup             
	//   55  109:bipush          8
	//   56  111:invokespecial   #34  <Method void u(int)>
	//   57  114:astore_1        
						((u) (intent)).a(s4);
	//   58  115:aload_1         
	//   59  116:aload           6
	//   60  118:invokevirtual   #37  <Method u u.a(String)>
	//   61  121:pop             
						a(((u) (intent)));
	//   62  122:aload_0         
	//   63  123:aload_1         
	//   64  124:invokespecial   #40  <Method void a(u)>
						return;
	//   65  127:return          
					}
				if(s5.compareTo("vnd.android.cursor.item/genre") == 0)
	//*  66  128:aload           7
	//*  67  130:ldc1            #54  <String "vnd.android.cursor.item/genre">
	//*  68  132:invokevirtual   #48  <Method int String.compareTo(String)>
	//*  69  135:ifne            160
				{
					intent = ((Intent) (new u(4)));
	//   70  138:new             #31  <Class u>
	//   71  141:dup             
	//   72  142:iconst_4        
	//   73  143:invokespecial   #34  <Method void u(int)>
	//   74  146:astore_1        
					((u) (intent)).b(s4);
	//   75  147:aload_1         
	//   76  148:aload           6
	//   77  150:invokevirtual   #57  <Method u u.b(String)>
	//   78  153:pop             
					a(((u) (intent)));
	//   79  154:aload_0         
	//   80  155:aload_1         
	//   81  156:invokespecial   #40  <Method void a(u)>
					return;
	//   82  159:return          
				}
				if(s5.compareTo("vnd.android.cursor.item/artist") == 0)
	//*  83  160:aload           7
	//*  84  162:ldc1            #59  <String "vnd.android.cursor.item/artist">
	//*  85  164:invokevirtual   #48  <Method int String.compareTo(String)>
	//*  86  167:ifne            192
				{
					intent = ((Intent) (new u(5)));
	//   87  170:new             #31  <Class u>
	//   88  173:dup             
	//   89  174:iconst_5        
	//   90  175:invokespecial   #34  <Method void u(int)>
	//   91  178:astore_1        
					((u) (intent)).a(s4);
	//   92  179:aload_1         
	//   93  180:aload           6
	//   94  182:invokevirtual   #37  <Method u u.a(String)>
	//   95  185:pop             
					a(((u) (intent)));
	//   96  186:aload_0         
	//   97  187:aload_1         
	//   98  188:invokespecial   #40  <Method void a(u)>
					return;
	//   99  191:return          
				}
				if(s5.compareTo("vnd.android.cursor.item/album") == 0)
	//* 100  192:aload           7
	//* 101  194:ldc1            #61  <String "vnd.android.cursor.item/album">
	//* 102  196:invokevirtual   #48  <Method int String.compareTo(String)>
	//* 103  199:ifne            224
				{
					intent = ((Intent) (new u(8)));
	//  104  202:new             #31  <Class u>
	//  105  205:dup             
	//  106  206:bipush          8
	//  107  208:invokespecial   #34  <Method void u(int)>
	//  108  211:astore_1        
					((u) (intent)).a(s);
	//  109  212:aload_1         
	//  110  213:aload_2         
	//  111  214:invokevirtual   #37  <Method u u.a(String)>
	//  112  217:pop             
					a(((u) (intent)));
	//  113  218:aload_0         
	//  114  219:aload_1         
	//  115  220:invokespecial   #40  <Method void a(u)>
					return;
	//  116  223:return          
				}
				if(s5.compareTo("vnd.android.cursor.item/audio") != 0 && s5.compareTo("vnd.android.cursor.item/playlist") != 0)
					break label0;
	//  117  224:aload           7
	//  118  226:ldc1            #63  <String "vnd.android.cursor.item/audio">
	//  119  228:invokevirtual   #48  <Method int String.compareTo(String)>
	//  120  231:ifeq            244
	//  121  234:aload           7
	//  122  236:ldc1            #65  <String "vnd.android.cursor.item/playlist">
	//  123  238:invokevirtual   #48  <Method int String.compareTo(String)>
	//  124  241:ifne            355
				if(s2 != null)
	//* 125  244:aload           4
	//* 126  246:ifnull          260
				{
					intent = ((Intent) (s2));
	//  127  249:aload           4
	//  128  251:astore_1        
					if(!s2.isEmpty())
						break label1;
	//  129  252:aload           4
	//  130  254:invokevirtual   #52  <Method boolean String.isEmpty()>
	//  131  257:ifeq            262
				}
				intent = ((Intent) (s));
	//  132  260:aload_2         
	//  133  261:astore_1        
			}
			Object obj = ((Object) (intent));
	//  134  262:aload_1         
	//  135  263:astore_2        
			if(intent == null)
	//* 136  264:aload_1         
	//* 137  265:ifnonnull       271
				obj = "";
	//  138  268:ldc1            #67  <String "">
	//  139  270:astore_2        
			intent = ((Intent) (obj));
	//  140  271:aload_2         
	//  141  272:astore_1        
			if(s3 != null)
	//* 142  273:aload           5
	//* 143  275:ifnull          321
			{
				intent = ((Intent) (obj));
	//  144  278:aload_2         
	//  145  279:astore_1        
				if(!s3.isEmpty())
	//* 146  280:aload           5
	//* 147  282:invokevirtual   #52  <Method boolean String.isEmpty()>
	//* 148  285:ifne            321
				{
					intent = ((Intent) (new StringBuilder()));
	//  149  288:new             #69  <Class StringBuilder>
	//  150  291:dup             
	//  151  292:invokespecial   #70  <Method void StringBuilder()>
	//  152  295:astore_1        
					((StringBuilder) (intent)).append(((String) (obj)));
	//  153  296:aload_1         
	//  154  297:aload_2         
	//  155  298:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  156  301:pop             
					((StringBuilder) (intent)).append(" author:");
	//  157  302:aload_1         
	//  158  303:ldc1            #76  <String " author:">
	//  159  305:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  160  308:pop             
					((StringBuilder) (intent)).append(s3);
	//  161  309:aload_1         
	//  162  310:aload           5
	//  163  312:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//  164  315:pop             
					intent = ((Intent) (((StringBuilder) (intent)).toString()));
	//  165  316:aload_1         
	//  166  317:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  167  320:astore_1        
				}
			}
			obj = ((Object) (intent));
	//  168  321:aload_1         
	//  169  322:astore_2        
			if("".equals(((Object) (intent))))
	//* 170  323:ldc1            #67  <String "">
	//* 171  325:aload_1         
	//* 172  326:invokevirtual   #84  <Method boolean String.equals(Object)>
	//* 173  329:ifeq            334
				obj = ((Object) (s1));
	//  174  332:aload_3         
	//  175  333:astore_2        
			intent = ((Intent) (new u(8)));
	//  176  334:new             #31  <Class u>
	//  177  337:dup             
	//  178  338:bipush          8
	//  179  340:invokespecial   #34  <Method void u(int)>
	//  180  343:astore_1        
			((u) (intent)).a(((String) (obj)));
	//  181  344:aload_1         
	//  182  345:aload_2         
	//  183  346:invokevirtual   #37  <Method u u.a(String)>
	//  184  349:pop             
			a(((u) (intent)));
	//  185  350:aload_0         
	//  186  351:aload_1         
	//  187  352:invokespecial   #40  <Method void a(u)>
		}
	//  188  355:return          
	}

	private void a(u u1)
	{
		(new bt(this, u1)).execute(((Object []) (new Void[0])));
	//    0    0:new             #86  <Class bt>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #89  <Method void bt(LibriVoxActivity, u)>
	//    5    9:iconst_0        
	//    6   10:anewarray       Void[]
	//    7   13:invokevirtual   #95  <Method AsyncTask bt.execute(Object[])>
	//    8   16:pop             
	//    9   17:return          
	}

	public void a()
	{
		Object obj = ((Object) (new Dialog(((android.content.Context) (this)))));
	//    0    0:new             #97  <Class Dialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #100 <Method void Dialog(android.content.Context)>
	//    4    8:astore_2        
		((Dialog) (obj)).requestWindowFeature(1);
	//    5    9:aload_2         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #104 <Method boolean Dialog.requestWindowFeature(int)>
	//    8   14:pop             
		((Dialog) (obj)).getWindow().setBackgroundDrawable(((android.graphics.drawable.Drawable) (new ColorDrawable(0))));
	//    9   15:aload_2         
	//   10   16:invokevirtual   #108 <Method Window Dialog.getWindow()>
	//   11   19:new             #110 <Class ColorDrawable>
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:invokespecial   #111 <Method void ColorDrawable(int)>
	//   15   27:invokevirtual   #117 <Method void Window.setBackgroundDrawable(android.graphics.drawable.Drawable)>
		((Dialog) (obj)).setContentView(i.coach_mark);
	//   16   30:aload_2         
	//   17   31:getstatic       #123 <Field int i.coach_mark>
	//   18   34:invokevirtual   #126 <Method void Dialog.setContentView(int)>
		((Dialog) (obj)).setCanceledOnTouchOutside(true);
	//   19   37:aload_2         
	//   20   38:iconst_1        
	//   21   39:invokevirtual   #130 <Method void Dialog.setCanceledOnTouchOutside(boolean)>
		Object obj1 = ((Object) (new bq(this, ((Dialog) (obj)))));
	//   22   42:new             #132 <Class bq>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokespecial   #135 <Method void bq(LibriVoxActivity, Dialog)>
	//   27   51:astore_3        
		((Dialog) (obj)).findViewById(h.coach_mark_master_view).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
	//   28   52:aload_2         
	//   29   53:getstatic       #140 <Field int h.coach_mark_master_view>
	//   30   56:invokevirtual   #144 <Method View Dialog.findViewById(int)>
	//   31   59:aload_3         
	//   32   60:invokevirtual   #150 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		((Button)((Dialog) (obj)).findViewById(h.got_it)).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
	//   33   63:aload_2         
	//   34   64:getstatic       #153 <Field int h.got_it>
	//   35   67:invokevirtual   #144 <Method View Dialog.findViewById(int)>
	//   36   70:checkcast       #155 <Class Button>
	//   37   73:aload_3         
	//   38   74:invokevirtual   #156 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		obj1 = ((Object) (new android.view.WindowManager.LayoutParams()));
	//   39   77:new             #158 <Class android.view.WindowManager$LayoutParams>
	//   40   80:dup             
	//   41   81:invokespecial   #159 <Method void android.view.WindowManager$LayoutParams()>
	//   42   84:astore_3        
		((android.view.WindowManager.LayoutParams) (obj1)).copyFrom(((Dialog) (obj)).getWindow().getAttributes());
	//   43   85:aload_3         
	//   44   86:aload_2         
	//   45   87:invokevirtual   #108 <Method Window Dialog.getWindow()>
	//   46   90:invokevirtual   #163 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   47   93:invokevirtual   #167 <Method int android.view.WindowManager$LayoutParams.copyFrom(android.view.WindowManager$LayoutParams)>
	//   48   96:pop             
		obj1.width = -1;
	//   49   97:aload_3         
	//   50   98:iconst_m1       
	//   51   99:putfield        #170 <Field int android.view.WindowManager$LayoutParams.width>
		obj1.height = -1;
	//   52  102:aload_3         
	//   53  103:iconst_m1       
	//   54  104:putfield        #173 <Field int android.view.WindowManager$LayoutParams.height>
		((Dialog) (obj)).show();
	//   55  107:aload_2         
	//   56  108:invokevirtual   #176 <Method void Dialog.show()>
		((Dialog) (obj)).getWindow().setAttributes(((android.view.WindowManager.LayoutParams) (obj1)));
	//   57  111:aload_2         
	//   58  112:invokevirtual   #108 <Method Window Dialog.getWindow()>
	//   59  115:aload_3         
	//   60  116:invokevirtual   #180 <Method void Window.setAttributes(android.view.WindowManager$LayoutParams)>
		if(biz.bookdesign.librivox.bw.g().e() != null)
	//*  61  119:invokestatic    #186 <Method a biz.bookdesign.librivox.bw.g()>
	//*  62  122:invokevirtual   #191 <Method String a.e()>
	//*  63  125:ifnull          168
		{
			obj = ((Object) (((Dialog) (obj)).findViewById(h.padding_top)));
	//   64  128:aload_2         
	//   65  129:getstatic       #194 <Field int h.padding_top>
	//   66  132:invokevirtual   #144 <Method View Dialog.findViewById(int)>
	//   67  135:astore_2        
			android.view.ViewGroup.LayoutParams layoutparams = ((View) (obj)).getLayoutParams();
	//   68  136:aload_2         
	//   69  137:invokevirtual   #198 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   70  140:astore_3        
			int i1 = (int)getResources().getDimension(f.double_module);
	//   71  141:aload_0         
	//   72  142:invokevirtual   #202 <Method Resources getResources()>
	//   73  145:getstatic       #207 <Field int f.double_module>
	//   74  148:invokevirtual   #213 <Method float Resources.getDimension(int)>
	//   75  151:f2i             
	//   76  152:istore_1        
			layoutparams.height = layoutparams.height + i1;
	//   77  153:aload_3         
	//   78  154:aload_3         
	//   79  155:getfield        #216 <Field int android.view.ViewGroup$LayoutParams.height>
	//   80  158:iload_1         
	//   81  159:iadd            
	//   82  160:putfield        #216 <Field int android.view.ViewGroup$LayoutParams.height>
			((View) (obj)).setLayoutParams(layoutparams);
	//   83  163:aload_2         
	//   84  164:aload_3         
	//   85  165:invokevirtual   #220 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
	//   86  168:return          
	}

	void a(int i1, boolean flag)
	{
		if(c.b(i1) > -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field j c>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #230 <Method long j.b(int)>
	//*   4    8:ldc2w           #231 <Long -1L>
	//*   5   11:lcmp            
	//*   6   12:ifle            44
		{
			(new n(i1, getApplicationContext(), c)).b(((android.support.v4.app.x) (this)));
	//    7   15:new             #234 <Class n>
	//    8   18:dup             
	//    9   19:iload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #238 <Method android.content.Context getApplicationContext()>
	//   12   24:aload_0         
	//   13   25:getfield        #225 <Field j c>
	//   14   28:invokespecial   #241 <Method void n(int, android.content.Context, j)>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #244 <Method void n.b(android.support.v4.app.x)>
			if(flag)
	//*  17   35:iload_2         
	//*  18   36:ifeq            68
			{
				finish();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #247 <Method void finish()>
				return;
	//   21   43:return          
			}
		} else
		{
			((AsyncTask) (new bu(this, flag))).execute(((Object []) (new Integer[] {
				Integer.valueOf(i1)
			})));
	//   22   44:new             #249 <Class bu>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:iload_2         
	//   26   50:invokespecial   #252 <Method void bu(LibriVoxActivity, boolean)>
	//   27   53:iconst_1        
	//   28   54:anewarray       Integer[]
	//   29   57:dup             
	//   30   58:iconst_0        
	//   31   59:iload_1         
	//   32   60:invokestatic    #258 <Method Integer Integer.valueOf(int)>
	//   33   63:aastore         
	//   34   64:invokevirtual   #261 <Method AsyncTask AsyncTask.execute(Object[])>
	//   35   67:pop             
		}
	//   36   68:return          
	}

	void a(String s, boolean flag)
	{
		if(c.i(s) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field j c>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #266 <Method Integer j.i(String)>
	//*   4    8:ifnull          36
		{
			(new q(s, getApplicationContext())).b(((android.support.v4.app.x) (this)));
	//    5   11:new             #268 <Class q>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #238 <Method android.content.Context getApplicationContext()>
	//   10   20:invokespecial   #271 <Method void q(String, android.content.Context)>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #272 <Method void q.b(android.support.v4.app.x)>
			if(flag)
	//*  13   27:iload_2         
	//*  14   28:ifeq            57
			{
				finish();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #247 <Method void finish()>
				return;
	//   17   35:return          
			}
		} else
		{
			((AsyncTask) (new bv(this, flag))).execute(((Object []) (new String[] {
				s
			})));
	//   18   36:new             #274 <Class bv>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:iload_2         
	//   22   42:invokespecial   #275 <Method void bv(LibriVoxActivity, boolean)>
	//   23   45:iconst_1        
	//   24   46:anewarray       String[]
	//   25   49:dup             
	//   26   50:iconst_0        
	//   27   51:aload_1         
	//   28   52:aastore         
	//   29   53:invokevirtual   #261 <Method AsyncTask AsyncTask.execute(Object[])>
	//   30   56:pop             
		}
	//   31   57:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #279 <Method void ao.onCreate(Bundle)>
		setTitle(((CharSequence) (getString(k.app_name))));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getstatic       #284 <Field int k.app_name>
	//    6   10:invokevirtual   #288 <Method String getString(int)>
	//    7   13:invokevirtual   #292 <Method void setTitle(CharSequence)>
		setContentView(i.catalog_layout);
	//    8   16:aload_0         
	//    9   17:getstatic       #295 <Field int i.catalog_layout>
	//   10   20:invokevirtual   #296 <Method void setContentView(int)>
		onNewIntent(getIntent());
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #300 <Method Intent getIntent()>
	//   14   28:invokevirtual   #303 <Method void onNewIntent(Intent)>
		if(biz.bookdesign.librivox.bw.i() != 1)
	//*  15   31:invokestatic    #306 <Method int biz.bookdesign.librivox.bw.i()>
	//*  16   34:iconst_1        
	//*  17   35:icmpeq          63
		{
			bundle = ((Bundle) (new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/LibriVoxDetailsActivity)));
	//   18   38:new             #15  <Class Intent>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:ldc2            #308 <Class LibriVoxDetailsActivity>
	//   22   46:invokespecial   #311 <Method void Intent(android.content.Context, Class)>
	//   23   49:astore_1        
			((Intent) (bundle)).addFlags(0x4000000);
	//   24   50:aload_1         
	//   25   51:ldc2            #312 <Int 0x4000000>
	//   26   54:invokevirtual   #316 <Method Intent Intent.addFlags(int)>
	//   27   57:pop             
			startActivity(((Intent) (bundle)));
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:invokevirtual   #319 <Method void startActivity(Intent)>
		}
	//   31   63:return          
	}

	protected Dialog onCreateDialog(int i1)
	{
		android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (this)), l.LVDialogTheme);
	//    0    0:new             #323 <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #328 <Field int l.LVDialogTheme>
	//    4    8:invokespecial   #331 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context, int)>
	//    5   11:astore_2        
		switch(i1)
	//*   6   12:iload_1         
		{
	//*   7   13:tableswitch     3 5: default 40
	//	               3 121
	//	               4 96
	//	               5 46
		default:
			return super.onCreateDialog(i1);
	//    8   40:aload_0         
	//    9   41:iload_1         
	//   10   42:invokespecial   #333 <Method Dialog ao.onCreateDialog(int)>
	//   11   45:areturn         

		case 5: // '\005'
			String as[] = getResources().getStringArray(c.country_array);
	//   12   46:aload_0         
	//   13   47:invokevirtual   #202 <Method Resources getResources()>
	//   14   50:getstatic       #338 <Field int c.country_array>
	//   15   53:invokevirtual   #342 <Method String[] Resources.getStringArray(int)>
	//   16   56:astore_3        
			String as1[] = getResources().getStringArray(c.iso_3166_2);
	//   17   57:aload_0         
	//   18   58:invokevirtual   #202 <Method Resources getResources()>
	//   19   61:getstatic       #345 <Field int c.iso_3166_2>
	//   20   64:invokevirtual   #342 <Method String[] Resources.getStringArray(int)>
	//   21   67:astore          4
			builder.setTitle(k.select_country).setItems(((CharSequence []) (as)), ((android.content.DialogInterface.OnClickListener) (new bs(this, as1))));
	//   22   69:aload_2         
	//   23   70:getstatic       #348 <Field int k.select_country>
	//   24   73:invokevirtual   #351 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
	//   25   76:aload_3         
	//   26   77:new             #353 <Class bs>
	//   27   80:dup             
	//   28   81:aload_0         
	//   29   82:aload           4
	//   30   84:invokespecial   #356 <Method void bs(LibriVoxActivity, String[])>
	//   31   87:invokevirtual   #360 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setItems(CharSequence[], android.content.DialogInterface$OnClickListener)>
	//   32   90:pop             
			return ((Dialog) (builder.create()));
	//   33   91:aload_2         
	//   34   92:invokevirtual   #364 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   35   95:areturn         

		case 4: // '\004'
			br br1 = new br(this);
	//   36   96:new             #366 <Class br>
	//   37   99:dup             
	//   38  100:aload_0         
	//   39  101:invokespecial   #369 <Method void br(LibriVoxActivity)>
	//   40  104:astore_2        
			return b.a(((android.content.Context) (this)), k.rate_app_question, k.rate_app_summary, ((android.content.DialogInterface.OnClickListener) (br1)), ((android.content.DialogInterface.OnClickListener) (null)), "biz.bookdesign.librivox.RATE_ASK");
	//   41  105:aload_0         
	//   42  106:getstatic       #372 <Field int k.rate_app_question>
	//   43  109:getstatic       #375 <Field int k.rate_app_summary>
	//   44  112:aload_2         
	//   45  113:aconst_null     
	//   46  114:ldc2            #377 <String "biz.bookdesign.librivox.RATE_ASK">
	//   47  117:invokestatic    #382 <Method Dialog b.a(android.content.Context, int, int, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener, String)>
	//   48  120:areturn         

		case 3: // '\003'
			return (new bp()).a(((android.app.Activity) (this)));
	//   49  121:new             #384 <Class bp>
	//   50  124:dup             
	//   51  125:invokespecial   #385 <Method void bp()>
	//   52  128:aload_0         
	//   53  129:invokevirtual   #388 <Method Dialog biz.bookdesign.librivox.bp.a(android.app.Activity)>
	//   54  132:areturn         
		}
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(biz.bookdesign.librivox.a.j.library, menu);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #394 <Method MenuInflater getMenuInflater()>
	//    2    4:getstatic       #399 <Field int biz.bookdesign.librivox.a.j.library>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #405 <Method void MenuInflater.inflate(int, Menu)>
		SearchManager searchmanager = (SearchManager)getSystemService("search");
	//    5   11:aload_0         
	//    6   12:ldc2            #407 <String "search">
	//    7   15:invokevirtual   #411 <Method Object getSystemService(String)>
	//    8   18:checkcast       #413 <Class SearchManager>
	//    9   21:astore_2        
		((SearchView)menu.findItem(h.menu_search).getActionView()).setSearchableInfo(searchmanager.getSearchableInfo(getComponentName()));
	//   10   22:aload_1         
	//   11   23:getstatic       #416 <Field int h.menu_search>
	//   12   26:invokeinterface #422 <Method MenuItem Menu.findItem(int)>
	//   13   31:invokeinterface #428 <Method View MenuItem.getActionView()>
	//   14   36:checkcast       #430 <Class SearchView>
	//   15   39:aload_2         
	//   16   40:aload_0         
	//   17   41:invokevirtual   #434 <Method android.content.ComponentName getComponentName()>
	//   18   44:invokevirtual   #438 <Method android.app.SearchableInfo SearchManager.getSearchableInfo(android.content.ComponentName)>
	//   19   47:invokevirtual   #442 <Method void SearchView.setSearchableInfo(android.app.SearchableInfo)>
		return super.onCreateOptionsMenu(menu);
	//   20   50:aload_0         
	//   21   51:aload_1         
	//   22   52:invokespecial   #444 <Method boolean ao.onCreateOptionsMenu(Menu)>
	//   23   55:ireturn         
	}

	protected void onNewIntent(Intent intent)
	{
		int i1;
		boolean flag = "android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(((Object) (intent.getAction())));
	//    0    0:ldc2            #448 <String "android.media.action.MEDIA_PLAY_FROM_SEARCH">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #451 <Method String Intent.getAction()>
	//    3    7:invokevirtual   #84  <Method boolean String.equals(Object)>
	//    4   10:istore          4
		i1 = 0;
	//    5   12:iconst_0        
	//    6   13:istore_2        
		if(flag)
	//*   7   14:iload           4
	//*   8   16:ifeq            27
			a(intent);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #453 <Method void a(Intent)>
		else
	//*  12   24:goto            217
		if("android.intent.action.SEARCH".equals(((Object) (intent.getAction()))) || "biz.bookdesign.librivox.SEARCH".equals(((Object) (intent.getAction()))))
	//*  13   27:ldc2            #455 <String "android.intent.action.SEARCH">
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #451 <Method String Intent.getAction()>
	//*  16   34:invokevirtual   #84  <Method boolean String.equals(Object)>
	//*  17   37:ifne            53
	//*  18   40:ldc2            #457 <String "biz.bookdesign.librivox.SEARCH">
	//*  19   43:aload_1         
	//*  20   44:invokevirtual   #451 <Method String Intent.getAction()>
	//*  21   47:invokevirtual   #84  <Method boolean String.equals(Object)>
	//*  22   50:ifeq            217
		{
			String s = intent.getStringExtra("query");
	//   23   53:aload_1         
	//   24   54:ldc1            #21  <String "query">
	//   25   56:invokevirtual   #19  <Method String Intent.getStringExtra(String)>
	//   26   59:astore          5
			u u1 = new u(8);
	//   27   61:new             #31  <Class u>
	//   28   64:dup             
	//   29   65:bipush          8
	//   30   67:invokespecial   #34  <Method void u(int)>
	//   31   70:astore          6
			u1.a(s);
	//   32   72:aload           6
	//   33   74:aload           5
	//   34   76:invokevirtual   #37  <Method u u.a(String)>
	//   35   79:pop             
			CatalogFragment catalogfragment = (CatalogFragment)getSupportFragmentManager().a("catalog");
	//   36   80:aload_0         
	//   37   81:invokevirtual   #461 <Method ae getSupportFragmentManager()>
	//   38   84:ldc2            #463 <String "catalog">
	//   39   87:invokevirtual   #468 <Method android.support.v4.app.Fragment ae.a(String)>
	//   40   90:checkcast       #470 <Class CatalogFragment>
	//   41   93:astore          7
			if(catalogfragment != null && catalogfragment.isAdded())
	//*  42   95:aload           7
	//*  43   97:ifnull          131
	//*  44  100:aload           7
	//*  45  102:invokevirtual   #473 <Method boolean CatalogFragment.isAdded()>
	//*  46  105:ifeq            131
			{
				catalogfragment.a(u1);
	//   47  108:aload           7
	//   48  110:aload           6
	//   49  112:invokevirtual   #474 <Method void biz.bookdesign.librivox.CatalogFragment.a(u)>
				((ListView)findViewById(0x102000a)).setSelectionAfterHeaderView();
	//   50  115:aload_0         
	//   51  116:ldc2            #475 <Int 0x102000a>
	//   52  119:invokevirtual   #476 <Method View findViewById(int)>
	//   53  122:checkcast       #478 <Class ListView>
	//   54  125:invokevirtual   #481 <Method void ListView.setSelectionAfterHeaderView()>
			} else
	//*  55  128:goto            198
			{
				Intent intent1 = new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/LibriVoxDetailsActivity);
	//   56  131:new             #15  <Class Intent>
	//   57  134:dup             
	//   58  135:aload_0         
	//   59  136:ldc2            #308 <Class LibriVoxDetailsActivity>
	//   60  139:invokespecial   #311 <Method void Intent(android.content.Context, Class)>
	//   61  142:astore          7
				intent1.putExtra("type", 8);
	//   62  144:aload           7
	//   63  146:ldc2            #483 <String "type">
	//   64  149:bipush          8
	//   65  151:invokevirtual   #487 <Method Intent Intent.putExtra(String, int)>
	//   66  154:pop             
				intent1.putExtra("subtype", s);
	//   67  155:aload           7
	//   68  157:ldc2            #489 <String "subtype">
	//   69  160:aload           5
	//   70  162:invokevirtual   #492 <Method Intent Intent.putExtra(String, String)>
	//   71  165:pop             
				startActivity(intent1);
	//   72  166:aload_0         
	//   73  167:aload           7
	//   74  169:invokevirtual   #319 <Method void startActivity(Intent)>
				overridePendingTransition(0, 0);
	//   75  172:aload_0         
	//   76  173:iconst_0        
	//   77  174:iconst_0        
	//   78  175:invokevirtual   #496 <Method void overridePendingTransition(int, int)>
				(new ga(((android.content.Context) (this)))).a(biz.bookdesign.librivox.ge.a, u1);
	//   79  178:new             #498 <Class ga>
	//   80  181:dup             
	//   81  182:aload_0         
	//   82  183:invokespecial   #499 <Method void ga(android.content.Context)>
	//   83  186:getstatic       #504 <Field ge biz.bookdesign.librivox.ge.a>
	//   84  189:aload           6
	//   85  191:invokevirtual   #507 <Method void biz.bookdesign.librivox.ga.a(ge, u)>
				finish();
	//   86  194:aload_0         
	//   87  195:invokevirtual   #247 <Method void finish()>
			}
			(new SearchRecentSuggestions(((android.content.Context) (this)), biz.bookdesign.catalogbase.a.a(((android.content.Context) (this))), 1)).saveRecentQuery(s, ((String) (null)));
	//   88  198:new             #509 <Class SearchRecentSuggestions>
	//   89  201:dup             
	//   90  202:aload_0         
	//   91  203:aload_0         
	//   92  204:invokestatic    #512 <Method String a.a(android.content.Context)>
	//   93  207:iconst_1        
	//   94  208:invokespecial   #515 <Method void SearchRecentSuggestions(android.content.Context, String, int)>
	//   95  211:aload           5
	//   96  213:aconst_null     
	//   97  214:invokevirtual   #519 <Method void SearchRecentSuggestions.saveRecentQuery(String, String)>
		}
		intent = ((Intent) (intent.getData()));
	//   98  217:aload_1         
	//   99  218:invokevirtual   #523 <Method Uri Intent.getData()>
	//  100  221:astore_1        
		if(intent == null || !"librivox.bookdesign.biz".equals(((Object) (((Uri) (intent)).getHost()))) && !"librivox.app".equals(((Object) (((Uri) (intent)).getHost())))) goto _L2; else goto _L1
	//  101  222:aload_1         
	//  102  223:ifnull          341
	//  103  226:ldc2            #525 <String "librivox.bookdesign.biz">
	//  104  229:aload_1         
	//  105  230:invokevirtual   #530 <Method String Uri.getHost()>
	//  106  233:invokevirtual   #84  <Method boolean String.equals(Object)>
	//  107  236:ifne            252
	//  108  239:ldc2            #532 <String "librivox.app">
	//  109  242:aload_1         
	//  110  243:invokevirtual   #530 <Method String Uri.getHost()>
	//  111  246:invokevirtual   #84  <Method boolean String.equals(Object)>
	//  112  249:ifeq            341
_L1:
		intent = ((Intent) (((Uri) (intent)).getPathSegments()));
	//  113  252:aload_1         
	//  114  253:invokevirtual   #536 <Method List Uri.getPathSegments()>
	//  115  256:astore_1        
		if(((List) (intent)).size() <= 1) goto _L2; else goto _L3
	//  116  257:aload_1         
	//  117  258:invokeinterface #541 <Method int List.size()>
	//  118  263:iconst_1        
	//  119  264:icmple          341
_L3:
		if(!"book".equals(((List) (intent)).get(0))) goto _L5; else goto _L4
	//  120  267:ldc2            #543 <String "book">
	//  121  270:aload_1         
	//  122  271:iconst_0        
	//  123  272:invokeinterface #547 <Method Object List.get(int)>
	//  124  277:invokevirtual   #84  <Method boolean String.equals(Object)>
	//  125  280:ifeq            310
_L4:
		int j1 = Integer.parseInt((String)((List) (intent)).get(1));
	//  126  283:aload_1         
	//  127  284:iconst_1        
	//  128  285:invokeinterface #547 <Method Object List.get(int)>
	//  129  290:checkcast       #44  <Class String>
	//  130  293:invokestatic    #550 <Method int Integer.parseInt(String)>
	//  131  296:istore_3        
		i1 = j1;
	//  132  297:iload_3         
	//  133  298:istore_2        
_L7:
		if(i1 > 0)
	//* 134  299:iload_2         
	//* 135  300:ifle            341
		{
			a(i1, true);
	//  136  303:aload_0         
	//  137  304:iload_2         
	//  138  305:iconst_1        
	//  139  306:invokevirtual   #552 <Method void a(int, boolean)>
			return;
	//  140  309:return          
		}
		  goto _L2
_L5:
		if("retail".equals(((List) (intent)).get(0)))
	//* 141  310:ldc2            #554 <String "retail">
	//* 142  313:aload_1         
	//* 143  314:iconst_0        
	//* 144  315:invokeinterface #547 <Method Object List.get(int)>
	//* 145  320:invokevirtual   #84  <Method boolean String.equals(Object)>
	//* 146  323:ifeq            341
			a((String)((List) (intent)).get(1), true);
	//  147  326:aload_0         
	//  148  327:aload_1         
	//  149  328:iconst_1        
	//  150  329:invokeinterface #547 <Method Object List.get(int)>
	//  151  334:checkcast       #44  <Class String>
	//  152  337:iconst_1        
	//  153  338:invokevirtual   #556 <Method void a(String, boolean)>
_L2:
		return;
	//  154  341:return          
		intent;
	//  155  342:astore_1        
		if(true) goto _L7; else goto _L6
_L6:
	//* 156  343:goto            299
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == h.menu_search)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #561 <Method int MenuItem.getItemId()>
	//*   2    6:getstatic       #416 <Field int h.menu_search>
	//*   3    9:icmpne          19
		{
			onSearchRequested();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #564 <Method boolean onSearchRequested()>
	//    6   16:pop             
			return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
		}
		if(menuitem.getItemId() == h.menu_refresh)
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #561 <Method int MenuItem.getItemId()>
	//*  11   25:getstatic       #567 <Field int h.menu_refresh>
	//*  12   28:icmpne          53
		{
			menuitem = ((MenuItem) (new Intent("biz.bookdesign.librivox.REFRESH_NOTIFICATION")));
	//   13   31:new             #15  <Class Intent>
	//   14   34:dup             
	//   15   35:ldc2            #569 <String "biz.bookdesign.librivox.REFRESH_NOTIFICATION">
	//   16   38:invokespecial   #572 <Method void Intent(String)>
	//   17   41:astore_1        
			d.a(((Intent) (menuitem)));
	//   18   42:aload_0         
	//   19   43:getfield        #576 <Field g d>
	//   20   46:aload_1         
	//   21   47:invokevirtual   #581 <Method boolean g.a(Intent)>
	//   22   50:pop             
			return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
		}
		if(menuitem.getItemId() == h.menu_preferences)
	//*  25   53:aload_1         
	//*  26   54:invokeinterface #561 <Method int MenuItem.getItemId()>
	//*  27   59:getstatic       #584 <Field int h.menu_preferences>
	//*  28   62:icmpne          85
		{
			startActivity(new Intent(getApplicationContext(), biz/bookdesign/librivox/SettingsActivity));
	//   29   65:aload_0         
	//   30   66:new             #15  <Class Intent>
	//   31   69:dup             
	//   32   70:aload_0         
	//   33   71:invokevirtual   #238 <Method android.content.Context getApplicationContext()>
	//   34   74:ldc2            #586 <Class SettingsActivity>
	//   35   77:invokespecial   #311 <Method void Intent(android.content.Context, Class)>
	//   36   80:invokevirtual   #319 <Method void startActivity(Intent)>
			return true;
	//   37   83:iconst_1        
	//   38   84:ireturn         
		} else
		{
			return super.onOptionsItemSelected(menuitem);
	//   39   85:aload_0         
	//   40   86:aload_1         
	//   41   87:invokespecial   #588 <Method boolean ao.onOptionsItemSelected(MenuItem)>
	//   42   90:ireturn         
		}
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #591 <Method void ao.onResume()>
		biz.bookdesign.librivox.bw.a(1);
	//    2    4:iconst_1        
	//    3    5:invokestatic    #593 <Method void biz.bookdesign.librivox.bw.a(int)>
	//    4    8:return          
	}
}
