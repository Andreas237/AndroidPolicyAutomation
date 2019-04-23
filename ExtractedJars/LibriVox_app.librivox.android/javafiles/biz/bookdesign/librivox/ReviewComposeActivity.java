// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.x;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.a.k;
import biz.bookdesign.librivox.b.a;
import biz.bookdesign.librivox.b.s;
import java.util.Date;

// Referenced classes of package biz.bookdesign.librivox:
//			eh, ee, eg

public class ReviewComposeActivity extends x
{

	public ReviewComposeActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void x()>
	//    2    4:return          
	}

	static a a(ReviewComposeActivity reviewcomposeactivity)
	{
		return reviewcomposeactivity.a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field a a>
	//    2    4:areturn         
	}

	private s b()
	{
		s s1 = new s();
	//    0    0:new             #18  <Class s>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void s()>
	//    3    7:astore_1        
		EditText edittext = (EditText)findViewById(h.review_name);
	//    4    8:aload_0         
	//    5    9:getstatic       #25  <Field int h.review_name>
	//    6   12:invokevirtual   #29  <Method android.view.View findViewById(int)>
	//    7   15:checkcast       #31  <Class EditText>
	//    8   18:astore_2        
		EditText edittext1 = (EditText)findViewById(h.review_body);
	//    9   19:aload_0         
	//   10   20:getstatic       #34  <Field int h.review_body>
	//   11   23:invokevirtual   #29  <Method android.view.View findViewById(int)>
	//   12   26:checkcast       #31  <Class EditText>
	//   13   29:astore_3        
		RatingBar ratingbar = (RatingBar)findViewById(h.ratingbar);
	//   14   30:aload_0         
	//   15   31:getstatic       #37  <Field int h.ratingbar>
	//   16   34:invokevirtual   #29  <Method android.view.View findViewById(int)>
	//   17   37:checkcast       #39  <Class RatingBar>
	//   18   40:astore          4
		if(edittext.getText() != null)
	//*  19   42:aload_2         
	//*  20   43:invokevirtual   #43  <Method android.text.Editable EditText.getText()>
	//*  21   46:ifnull          60
			s1.d(((Object) (edittext.getText())).toString());
	//   22   49:aload_1         
	//   23   50:aload_2         
	//   24   51:invokevirtual   #43  <Method android.text.Editable EditText.getText()>
	//   25   54:invokevirtual   #49  <Method String Object.toString()>
	//   26   57:invokevirtual   #53  <Method void s.d(String)>
		if(edittext1.getText() != null)
	//*  27   60:aload_3         
	//*  28   61:invokevirtual   #43  <Method android.text.Editable EditText.getText()>
	//*  29   64:ifnull          78
			s1.c(((Object) (edittext1.getText())).toString());
	//   30   67:aload_1         
	//   31   68:aload_3         
	//   32   69:invokevirtual   #43  <Method android.text.Editable EditText.getText()>
	//   33   72:invokevirtual   #49  <Method String Object.toString()>
	//   34   75:invokevirtual   #56  <Method void s.c(String)>
		s1.a(ratingbar.getRating());
	//   35   78:aload_1         
	//   36   79:aload           4
	//   37   81:invokevirtual   #60  <Method float RatingBar.getRating()>
	//   38   84:invokevirtual   #63  <Method void s.a(float)>
		s1.a(a.p());
	//   39   87:aload_1         
	//   40   88:aload_0         
	//   41   89:getfield        #14  <Field a a>
	//   42   92:invokevirtual   #69  <Method int a.p()>
	//   43   95:i2l             
	//   44   96:invokevirtual   #72  <Method void s.a(long)>
		s1.a(new Date());
	//   45   99:aload_1         
	//   46  100:new             #74  <Class Date>
	//   47  103:dup             
	//   48  104:invokespecial   #75  <Method void Date()>
	//   49  107:invokevirtual   #78  <Method void s.a(Date)>
		s1.c(((android.content.Context) (this)));
	//   50  110:aload_1         
	//   51  111:aload_0         
	//   52  112:invokevirtual   #81  <Method void s.c(android.content.Context)>
		return s1;
	//   53  115:aload_1         
	//   54  116:areturn         
	}

	void a()
	{
		s s1 = b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method s b()>
	//    2    4:astore_3        
		boolean flag = isFinishing();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #87  <Method boolean isFinishing()>
	//    5    9:istore_1        
		ProgressDialog progressdialog = null;
	//    6   10:aconst_null     
	//    7   11:astore_2        
		if(!flag)
	//*   8   12:iload_1         
	//*   9   13:ifne            29
			progressdialog = ProgressDialog.show(((android.content.Context) (this)), ((CharSequence) (null)), ((CharSequence) (getString(k.sending_review))));
	//   10   16:aload_0         
	//   11   17:aconst_null     
	//   12   18:aload_0         
	//   13   19:getstatic       #92  <Field int k.sending_review>
	//   14   22:invokevirtual   #96  <Method String getString(int)>
	//   15   25:invokestatic    #102 <Method ProgressDialog ProgressDialog.show(android.content.Context, CharSequence, CharSequence)>
	//   16   28:astore_2        
		((AsyncTask) (new eh(this, progressdialog))).execute(((Object []) (new s[] {
			s1
		})));
	//   17   29:new             #104 <Class eh>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:invokespecial   #107 <Method void eh(ReviewComposeActivity, ProgressDialog)>
	//   22   38:iconst_1        
	//   23   39:anewarray       s[]
	//   24   42:dup             
	//   25   43:iconst_0        
	//   26   44:aload_3         
	//   27   45:aastore         
	//   28   46:invokevirtual   #113 <Method AsyncTask AsyncTask.execute(Object[])>
	//   29   49:pop             
	//   30   50:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #117 <Method void x.onCreate(Bundle)>
		setContentView(i.write_review);
	//    3    5:aload_0         
	//    4    6:getstatic       #122 <Field int i.write_review>
	//    5    9:invokevirtual   #126 <Method void setContentView(int)>
		int j = getIntent().getIntExtra("lvid", 0);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #130 <Method Intent getIntent()>
	//    8   16:ldc1            #132 <String "lvid">
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #138 <Method int Intent.getIntExtra(String, int)>
	//   11   22:istore_3        
		if(j == 0)
	//*  12   23:iload_3         
	//*  13   24:ifne            116
		{
			if(android.os.Build.VERSION.SDK_INT >= 22)
	//*  14   27:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   30:bipush          22
	//*  16   32:icmplt          72
			{
				bundle = ((Bundle) (new StringBuilder()));
	//   17   35:new             #145 <Class StringBuilder>
	//   18   38:dup             
	//   19   39:invokespecial   #146 <Method void StringBuilder()>
	//   20   42:astore_1        
				((StringBuilder) (bundle)).append("failed intent origin ");
	//   21   43:aload_1         
	//   22   44:ldc1            #148 <String "failed intent origin ">
	//   23   46:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
				((StringBuilder) (bundle)).append(((Object) (getReferrer())));
	//   25   50:aload_1         
	//   26   51:aload_0         
	//   27   52:invokevirtual   #156 <Method android.net.Uri getReferrer()>
	//   28   55:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//   29   58:pop             
				com.crashlytics.android.a.a(4, "LibriVox", ((StringBuilder) (bundle)).toString());
	//   30   59:iconst_4        
	//   31   60:ldc1            #161 <String "LibriVox">
	//   32   62:aload_1         
	//   33   63:invokevirtual   #162 <Method String StringBuilder.toString()>
	//   34   66:invokestatic    #167 <Method void com.crashlytics.android.a.a(int, String, String)>
			} else
	//*  35   69:goto            106
			{
				bundle = ((Bundle) (new StringBuilder()));
	//   36   72:new             #145 <Class StringBuilder>
	//   37   75:dup             
	//   38   76:invokespecial   #146 <Method void StringBuilder()>
	//   39   79:astore_1        
				((StringBuilder) (bundle)).append("failed intent origin ");
	//   40   80:aload_1         
	//   41   81:ldc1            #148 <String "failed intent origin ">
	//   42   83:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   43   86:pop             
				((StringBuilder) (bundle)).append(((Object) (getCallingActivity())));
	//   44   87:aload_1         
	//   45   88:aload_0         
	//   46   89:invokevirtual   #171 <Method android.content.ComponentName getCallingActivity()>
	//   47   92:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//   48   95:pop             
				com.crashlytics.android.a.a(4, "LibriVox", ((StringBuilder) (bundle)).toString());
	//   49   96:iconst_4        
	//   50   97:ldc1            #161 <String "LibriVox">
	//   51   99:aload_1         
	//   52  100:invokevirtual   #162 <Method String StringBuilder.toString()>
	//   53  103:invokestatic    #167 <Method void com.crashlytics.android.a.a(int, String, String)>
			}
			throw new IllegalStateException("Review activity launched without valid book ID");
	//   54  106:new             #173 <Class IllegalStateException>
	//   55  109:dup             
	//   56  110:ldc1            #175 <String "Review activity launched without valid book ID">
	//   57  112:invokespecial   #177 <Method void IllegalStateException(String)>
	//   58  115:athrow          
		}
		a = biz.bookdesign.librivox.b.a.a(j, getApplicationContext());
	//   59  116:aload_0         
	//   60  117:iload_3         
	//   61  118:aload_0         
	//   62  119:invokevirtual   #181 <Method android.content.Context getApplicationContext()>
	//   63  122:invokestatic    #184 <Method a a.a(int, android.content.Context)>
	//   64  125:putfield        #14  <Field a a>
		bundle = ((Bundle) (new StringBuilder()));
	//   65  128:new             #145 <Class StringBuilder>
	//   66  131:dup             
	//   67  132:invokespecial   #146 <Method void StringBuilder()>
	//   68  135:astore_1        
		((StringBuilder) (bundle)).append(getString(k.rate));
	//   69  136:aload_1         
	//   70  137:aload_0         
	//   71  138:getstatic       #187 <Field int k.rate>
	//   72  141:invokevirtual   #96  <Method String getString(int)>
	//   73  144:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   74  147:pop             
		((StringBuilder) (bundle)).append(": ");
	//   75  148:aload_1         
	//   76  149:ldc1            #189 <String ": ">
	//   77  151:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   78  154:pop             
		((StringBuilder) (bundle)).append(a.b());
	//   79  155:aload_1         
	//   80  156:aload_0         
	//   81  157:getfield        #14  <Field a a>
	//   82  160:invokevirtual   #191 <Method String a.b()>
	//   83  163:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   84  166:pop             
		setTitle(((CharSequence) (((StringBuilder) (bundle)).toString())));
	//   85  167:aload_0         
	//   86  168:aload_1         
	//   87  169:invokevirtual   #162 <Method String StringBuilder.toString()>
	//   88  172:invokevirtual   #195 <Method void setTitle(CharSequence)>
		((TextView)findViewById(h.book_title)).setText(((CharSequence) (a.b())));
	//   89  175:aload_0         
	//   90  176:getstatic       #198 <Field int h.book_title>
	//   91  179:invokevirtual   #29  <Method android.view.View findViewById(int)>
	//   92  182:checkcast       #200 <Class TextView>
	//   93  185:aload_0         
	//   94  186:getfield        #14  <Field a a>
	//   95  189:invokevirtual   #191 <Method String a.b()>
	//   96  192:invokevirtual   #203 <Method void TextView.setText(CharSequence)>
		bundle = ((Bundle) (s.a(((android.content.Context) (this)), a)));
	//   97  195:aload_0         
	//   98  196:aload_0         
	//   99  197:getfield        #14  <Field a a>
	//  100  200:invokestatic    #206 <Method s s.a(android.content.Context, a)>
	//  101  203:astore_1        
		((EditText)findViewById(h.review_name)).setText(((CharSequence) (((s) (bundle)).f())));
	//  102  204:aload_0         
	//  103  205:getstatic       #25  <Field int h.review_name>
	//  104  208:invokevirtual   #29  <Method android.view.View findViewById(int)>
	//  105  211:checkcast       #31  <Class EditText>
	//  106  214:aload_1         
	//  107  215:invokevirtual   #209 <Method String s.f()>
	//  108  218:invokevirtual   #210 <Method void EditText.setText(CharSequence)>
		((EditText)findViewById(h.review_body)).setText(((CharSequence) (((s) (bundle)).e())));
	//  109  221:aload_0         
	//  110  222:getstatic       #34  <Field int h.review_body>
	//  111  225:invokevirtual   #29  <Method android.view.View findViewById(int)>
	//  112  228:checkcast       #31  <Class EditText>
	//  113  231:aload_1         
	//  114  232:invokevirtual   #213 <Method String s.e()>
	//  115  235:invokevirtual   #210 <Method void EditText.setText(CharSequence)>
		Object obj = ((Object) ((RatingBar)findViewById(h.ratingbar)));
	//  116  238:aload_0         
	//  117  239:getstatic       #37  <Field int h.ratingbar>
	//  118  242:invokevirtual   #29  <Method android.view.View findViewById(int)>
	//  119  245:checkcast       #39  <Class RatingBar>
	//  120  248:astore          4
		((RatingBar) (obj)).setRating(((s) (bundle)).b());
	//  121  250:aload           4
	//  122  252:aload_1         
	//  123  253:invokevirtual   #215 <Method float s.b()>
	//  124  256:invokevirtual   #218 <Method void RatingBar.setRating(float)>
		float f = getIntent().getFloatExtra("rating", 0.0F);
	//  125  259:aload_0         
	//  126  260:invokevirtual   #130 <Method Intent getIntent()>
	//  127  263:ldc1            #220 <String "rating">
	//  128  265:fconst_0        
	//  129  266:invokevirtual   #224 <Method float Intent.getFloatExtra(String, float)>
	//  130  269:fstore_2        
		if(f > 0.0F)
	//* 131  270:fload_2         
	//* 132  271:fconst_0        
	//* 133  272:fcmpl           
	//* 134  273:ifle            282
			((RatingBar) (obj)).setRating(f);
	//  135  276:aload           4
	//  136  278:fload_2         
	//  137  279:invokevirtual   #218 <Method void RatingBar.setRating(float)>
		bundle = ((Bundle) ((Button)findViewById(h.ok)));
	//  138  282:aload_0         
	//  139  283:getstatic       #227 <Field int h.ok>
	//  140  286:invokevirtual   #29  <Method android.view.View findViewById(int)>
	//  141  289:checkcast       #229 <Class Button>
	//  142  292:astore_1        
		obj = ((Object) ((Button)findViewById(h.cancel)));
	//  143  293:aload_0         
	//  144  294:getstatic       #232 <Field int h.cancel>
	//  145  297:invokevirtual   #29  <Method android.view.View findViewById(int)>
	//  146  300:checkcast       #229 <Class Button>
	//  147  303:astore          4
		((Button) (bundle)).setOnClickListener(((android.view.View.OnClickListener) (new ee(this))));
	//  148  305:aload_1         
	//  149  306:new             #234 <Class ee>
	//  150  309:dup             
	//  151  310:aload_0         
	//  152  311:invokespecial   #237 <Method void ee(ReviewComposeActivity)>
	//  153  314:invokevirtual   #241 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		((Button) (obj)).setOnClickListener(((android.view.View.OnClickListener) (new eg(this))));
	//  154  317:aload           4
	//  155  319:new             #243 <Class eg>
	//  156  322:dup             
	//  157  323:aload_0         
	//  158  324:invokespecial   #244 <Method void eg(ReviewComposeActivity)>
	//  159  327:invokevirtual   #241 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//  160  330:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() != 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #251 <Method int MenuItem.getItemId()>
	//*   2    6:ldc1            #252 <Int 0x102002c>
	//*   3    8:icmpeq          17
		{
			return super.onOptionsItemSelected(menuitem);
	//    4   11:aload_0         
	//    5   12:aload_1         
	//    6   13:invokespecial   #254 <Method boolean x.onOptionsItemSelected(MenuItem)>
	//    7   16:ireturn         
		} else
		{
			b();
	//    8   17:aload_0         
	//    9   18:invokespecial   #83  <Method s b()>
	//   10   21:pop             
			setResult(0);
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:invokevirtual   #257 <Method void setResult(int)>
			finish();
	//   14   27:aload_0         
	//   15   28:invokevirtual   #260 <Method void finish()>
			return true;
	//   16   31:iconst_1        
	//   17   32:ireturn         
		}
	}

	private a a;
}
