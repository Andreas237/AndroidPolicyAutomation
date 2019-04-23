// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.Window;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.a.k;
import com.crashlytics.android.a;

// Referenced classes of package biz.bookdesign.librivox:
//			bi, el, ek, ei

public class ReviewViewActivity extends bi
{

	public ReviewViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void bi()>
		b = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #14  <Field boolean b>
	//    5    9:return          
	}

	static el a(ReviewViewActivity reviewviewactivity)
	{
		return reviewviewactivity.a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field el a>
	//    2    4:areturn         
	}

	static boolean a(ReviewViewActivity reviewviewactivity, boolean flag)
	{
		reviewviewactivity.b = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #14  <Field boolean b>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static boolean b(ReviewViewActivity reviewviewactivity)
	{
		return reviewviewactivity.b;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field boolean b>
	//    2    4:ireturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void bi.onCreate(Bundle)>
		int j = getIntent().getIntExtra("lvid", 0);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #28  <Method Intent getIntent()>
	//    5    9:ldc1            #30  <String "lvid">
	//    6   11:iconst_0        
	//    7   12:invokevirtual   #36  <Method int Intent.getIntExtra(String, int)>
	//    8   15:istore_2        
		if(j == 0)
	//*   9   16:iload_2         
	//*  10   17:ifne            109
		{
			if(android.os.Build.VERSION.SDK_INT >= 22)
	//*  11   20:getstatic       #42  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   23:bipush          22
	//*  13   25:icmplt          65
			{
				bundle = ((Bundle) (new StringBuilder()));
	//   14   28:new             #44  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #45  <Method void StringBuilder()>
	//   17   35:astore_1        
				((StringBuilder) (bundle)).append("failed intent origin ");
	//   18   36:aload_1         
	//   19   37:ldc1            #47  <String "failed intent origin ">
	//   20   39:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
				((StringBuilder) (bundle)).append(((Object) (getReferrer())));
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:invokevirtual   #55  <Method android.net.Uri getReferrer()>
	//   25   48:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   26   51:pop             
				com.crashlytics.android.a.a(4, "LibriVox", ((StringBuilder) (bundle)).toString());
	//   27   52:iconst_4        
	//   28   53:ldc1            #60  <String "LibriVox">
	//   29   55:aload_1         
	//   30   56:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   31   59:invokestatic    #69  <Method void a.a(int, String, String)>
			} else
	//*  32   62:goto            99
			{
				bundle = ((Bundle) (new StringBuilder()));
	//   33   65:new             #44  <Class StringBuilder>
	//   34   68:dup             
	//   35   69:invokespecial   #45  <Method void StringBuilder()>
	//   36   72:astore_1        
				((StringBuilder) (bundle)).append("failed intent origin ");
	//   37   73:aload_1         
	//   38   74:ldc1            #47  <String "failed intent origin ">
	//   39   76:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   40   79:pop             
				((StringBuilder) (bundle)).append(((Object) (getCallingActivity())));
	//   41   80:aload_1         
	//   42   81:aload_0         
	//   43   82:invokevirtual   #73  <Method android.content.ComponentName getCallingActivity()>
	//   44   85:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   45   88:pop             
				com.crashlytics.android.a.a(4, "LibriVox", ((StringBuilder) (bundle)).toString());
	//   46   89:iconst_4        
	//   47   90:ldc1            #60  <String "LibriVox">
	//   48   92:aload_1         
	//   49   93:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   50   96:invokestatic    #69  <Method void a.a(int, String, String)>
			}
			throw new IllegalStateException("ReviewViewActivity launched without book ID in intent");
	//   51   99:new             #75  <Class IllegalStateException>
	//   52  102:dup             
	//   53  103:ldc1            #77  <String "ReviewViewActivity launched without book ID in intent">
	//   54  105:invokespecial   #80  <Method void IllegalStateException(String)>
	//   55  108:athrow          
		}
		bundle = ((Bundle) (biz.bookdesign.librivox.b.a.a(j, getApplicationContext())));
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:invokevirtual   #84  <Method android.content.Context getApplicationContext()>
	//   59  114:invokestatic    #89  <Method biz.bookdesign.librivox.b.a biz.bookdesign.librivox.b.a.a(int, android.content.Context)>
	//   60  117:astore_1        
		a = new el(((android.content.Context) (this)), ((biz.bookdesign.librivox.b.a) (bundle)));
	//   61  118:aload_0         
	//   62  119:new             #91  <Class el>
	//   63  122:dup             
	//   64  123:aload_0         
	//   65  124:aload_1         
	//   66  125:invokespecial   #94  <Method void el(android.content.Context, biz.bookdesign.librivox.b.a)>
	//   67  128:putfield        #18  <Field el a>
		Object obj = ((Object) (getSupportActionBar()));
	//   68  131:aload_0         
	//   69  132:invokevirtual   #98  <Method ActionBar getSupportActionBar()>
	//   70  135:astore_3        
		if(obj != null)
	//*  71  136:aload_3         
	//*  72  137:ifnull          299
		{
			int l = getIntent().getIntExtra("color", 0);
	//   73  140:aload_0         
	//   74  141:invokevirtual   #28  <Method Intent getIntent()>
	//   75  144:ldc1            #100 <String "color">
	//   76  146:iconst_0        
	//   77  147:invokevirtual   #36  <Method int Intent.getIntExtra(String, int)>
	//   78  150:istore_2        
			if(l != 0)
	//*  79  151:iload_2         
	//*  80  152:ifeq            183
			{
				((ActionBar) (obj)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (new ColorDrawable(l))));
	//   81  155:aload_3         
	//   82  156:new             #102 <Class ColorDrawable>
	//   83  159:dup             
	//   84  160:iload_2         
	//   85  161:invokespecial   #105 <Method void ColorDrawable(int)>
	//   86  164:invokevirtual   #111 <Method void ActionBar.setBackgroundDrawable(android.graphics.drawable.Drawable)>
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  87  167:getstatic       #42  <Field int android.os.Build$VERSION.SDK_INT>
	//*  88  170:bipush          21
	//*  89  172:icmplt          183
					getWindow().setStatusBarColor(l);
	//   90  175:aload_0         
	//   91  176:invokevirtual   #115 <Method Window getWindow()>
	//   92  179:iload_2         
	//   93  180:invokevirtual   #120 <Method void Window.setStatusBarColor(int)>
			}
			StringBuilder stringbuilder = new StringBuilder();
	//   94  183:new             #44  <Class StringBuilder>
	//   95  186:dup             
	//   96  187:invokespecial   #45  <Method void StringBuilder()>
	//   97  190:astore          4
			stringbuilder.append(((biz.bookdesign.librivox.b.a) (bundle)).b());
	//   98  192:aload           4
	//   99  194:aload_1         
	//  100  195:invokevirtual   #122 <Method String biz.bookdesign.librivox.b.a.b()>
	//  101  198:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  102  201:pop             
			stringbuilder.append(" \u2014 ");
	//  103  202:aload           4
	//  104  204:ldc1            #124 <String " \u2014 ">
	//  105  206:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  106  209:pop             
			stringbuilder.append(getString(k.reviews));
	//  107  210:aload           4
	//  108  212:aload_0         
	//  109  213:getstatic       #129 <Field int k.reviews>
	//  110  216:invokevirtual   #133 <Method String getString(int)>
	//  111  219:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  112  222:pop             
			((ActionBar) (obj)).setTitle(((CharSequence) (stringbuilder.toString())));
	//  113  223:aload_3         
	//  114  224:aload           4
	//  115  226:invokevirtual   #64  <Method String StringBuilder.toString()>
	//  116  229:invokevirtual   #137 <Method void ActionBar.setTitle(CharSequence)>
			setContentView(i.review_view);
	//  117  232:aload_0         
	//  118  233:getstatic       #142 <Field int i.review_view>
	//  119  236:invokevirtual   #145 <Method void setContentView(int)>
			bundle = ((Bundle) ((RecyclerView)findViewById(h.list)));
	//  120  239:aload_0         
	//  121  240:getstatic       #150 <Field int h.list>
	//  122  243:invokevirtual   #154 <Method android.view.View findViewById(int)>
	//  123  246:checkcast       #156 <Class RecyclerView>
	//  124  249:astore_1        
			((RecyclerView) (bundle)).setHasFixedSize(true);
	//  125  250:aload_1         
	//  126  251:iconst_1        
	//  127  252:invokevirtual   #160 <Method void RecyclerView.setHasFixedSize(boolean)>
			((RecyclerView) (bundle)).setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (new LinearLayoutManager(((android.content.Context) (this))))));
	//  128  255:aload_1         
	//  129  256:new             #162 <Class LinearLayoutManager>
	//  130  259:dup             
	//  131  260:aload_0         
	//  132  261:invokespecial   #165 <Method void LinearLayoutManager(android.content.Context)>
	//  133  264:invokevirtual   #169 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
			obj = ((Object) (new ek(this, ((ei) (null)))));
	//  134  267:new             #171 <Class ek>
	//  135  270:dup             
	//  136  271:aload_0         
	//  137  272:aconst_null     
	//  138  273:invokespecial   #174 <Method void ek(ReviewViewActivity, ei)>
	//  139  276:astore_3        
			((RecyclerView) (bundle)).setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (obj)));
	//  140  277:aload_1         
	//  141  278:aload_3         
	//  142  279:invokevirtual   #178 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
			a.a(((Runnable) (new ei(this, ((android.support.v7.widget.RecyclerView.Adapter) (obj))))));
	//  143  282:aload_0         
	//  144  283:getfield        #18  <Field el a>
	//  145  286:new             #180 <Class ei>
	//  146  289:dup             
	//  147  290:aload_0         
	//  148  291:aload_3         
	//  149  292:invokespecial   #183 <Method void ei(ReviewViewActivity, android.support.v7.widget.RecyclerView$Adapter)>
	//  150  295:invokevirtual   #186 <Method void biz.bookdesign.librivox.el.a(Runnable)>
			return;
	//  151  298:return          
		} else
		{
			throw new IllegalStateException("Action bar expected.");
	//  152  299:new             #75  <Class IllegalStateException>
	//  153  302:dup             
	//  154  303:ldc1            #188 <String "Action bar expected.">
	//  155  305:invokespecial   #80  <Method void IllegalStateException(String)>
	//  156  308:athrow          
		}
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #196 <Method int MenuItem.getItemId()>
	//*   2    6:ldc1            #197 <Int 0x102002c>
	//*   3    8:icmpne          17
		{
			finish();
	//    4   11:aload_0         
	//    5   12:invokevirtual   #200 <Method void finish()>
			return true;
	//    6   15:iconst_1        
	//    7   16:ireturn         
		} else
		{
			return super.onOptionsItemSelected(menuitem);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #202 <Method boolean bi.onOptionsItemSelected(MenuItem)>
	//   11   22:ireturn         
		}
	}

	private el a;
	private boolean b;
}
