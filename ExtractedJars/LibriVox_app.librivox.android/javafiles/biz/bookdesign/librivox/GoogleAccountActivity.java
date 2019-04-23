// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.x;
import android.widget.Toast;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.a.k;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.b;
import com.google.android.gms.auth.api.signin.c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.aa;
import com.google.android.gms.common.api.w;
import com.google.android.gms.common.api.z;

// Referenced classes of package biz.bookdesign.librivox:
//			bo, bn

public class GoogleAccountActivity extends x
	implements z
{

	public GoogleAccountActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void x()>
	//    2    4:return          
	}

	static void a(GoogleAccountActivity googleaccountactivity, c c1)
	{
		googleaccountactivity.a(c1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void a(c)>
	//    3    5:return          
	}

	private void a(c c1)
	{
		if(c1 != null && c1.c())
	//*   0    0:aload_1         
	//*   1    1:ifnull          38
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #23  <Method boolean c.c()>
	//*   4    8:ifeq            38
		{
			c1 = ((c) (c1.a()));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #26  <Method GoogleSignInAccount c.a()>
	//    7   15:astore_1        
			(new bo(this, ((bn) (null)))).execute(((Object []) (new GoogleSignInAccount[] {
				c1
			})));
	//    8   16:new             #28  <Class bo>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:invokespecial   #31  <Method void bo(GoogleAccountActivity, bn)>
	//   13   25:iconst_1        
	//   14   26:anewarray       GoogleSignInAccount[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:aload_1         
	//   18   32:aastore         
	//   19   33:invokevirtual   #37  <Method android.os.AsyncTask bo.execute(Object[])>
	//   20   36:pop             
			return;
	//   21   37:return          
		}
		if(!b())
	//*  22   38:aload_0         
	//*  23   39:invokespecial   #40  <Method boolean b()>
	//*  24   42:ifne            63
			Toast.makeText(getApplicationContext(), ((CharSequence) (getString(k.login_fail))), 1).show();
	//   25   45:aload_0         
	//   26   46:invokevirtual   #44  <Method android.content.Context getApplicationContext()>
	//   27   49:aload_0         
	//   28   50:getstatic       #50  <Field int k.login_fail>
	//   29   53:invokevirtual   #54  <Method String getString(int)>
	//   30   56:iconst_1        
	//   31   57:invokestatic    #60  <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   32   60:invokevirtual   #63  <Method void Toast.show()>
		finish();
	//   33   63:aload_0         
	//   34   64:invokevirtual   #66  <Method void finish()>
	//   35   67:return          
	}

	private boolean b()
	{
		return getIntent().getBooleanExtra("silent", true);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method Intent getIntent()>
	//    2    4:ldc1            #72  <String "silent">
	//    3    6:iconst_1        
	//    4    7:invokevirtual   #78  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//    5   10:ireturn         
	}

	public void a()
	{
		aa aa1 = a.h.b(a);
	//    0    0:getstatic       #84  <Field com.google.android.gms.auth.api.signin.a a.h>
	//    1    3:aload_0         
	//    2    4:getfield        #86  <Field w a>
	//    3    7:invokeinterface #91  <Method aa com.google.android.gms.auth.api.signin.a.b(w)>
	//    4   12:astore_1        
		if(aa1.a())
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #95  <Method boolean aa.a()>
	//*   7   17:ifeq            32
		{
			a((c)aa1.b());
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokevirtual   #98  <Method com.google.android.gms.common.api.ah aa.b()>
	//   11   25:checkcast       #19  <Class c>
	//   12   28:invokespecial   #17  <Method void a(c)>
			return;
	//   13   31:return          
		} else
		{
			aa1.a(((com.google.android.gms.common.api.ai) (new bn(this))));
	//   14   32:aload_1         
	//   15   33:new             #100 <Class bn>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #103 <Method void bn(GoogleAccountActivity)>
	//   19   41:invokevirtual   #106 <Method void aa.a(com.google.android.gms.common.api.ai)>
			return;
	//   20   44:return          
		}
	}

	public void a(ConnectionResult connectionresult)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #109 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Failed to connect to Google API Client: Error ");
	//    4    8:aload_2         
	//    5    9:ldc1            #112 <String "Failed to connect to Google API Client: Error ">
	//    6   11:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(connectionresult.c());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #121 <Method int ConnectionResult.c()>
	//   11   20:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(": ");
	//   13   24:aload_2         
	//   14   25:ldc1            #126 <String ": ">
	//   15   27:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(connectionresult.e());
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #130 <Method String ConnectionResult.e()>
	//   20   36:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		com.crashlytics.android.a.a(6, "LibriVox", stringbuilder.toString());
	//   22   40:bipush          6
	//   23   42:ldc1            #132 <String "LibriVox">
	//   24   44:aload_2         
	//   25   45:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   26   48:invokestatic    #140 <Method void com.crashlytics.android.a.a(int, String, String)>
		if(!b())
	//*  27   51:aload_0         
	//*  28   52:invokespecial   #40  <Method boolean b()>
	//*  29   55:ifne            76
			Toast.makeText(getApplicationContext(), ((CharSequence) (getString(k.login_fail))), 1).show();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #44  <Method android.content.Context getApplicationContext()>
	//   32   62:aload_0         
	//   33   63:getstatic       #50  <Field int k.login_fail>
	//   34   66:invokevirtual   #54  <Method String getString(int)>
	//   35   69:iconst_1        
	//   36   70:invokestatic    #60  <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   37   73:invokevirtual   #63  <Method void Toast.show()>
		finish();
	//   38   76:aload_0         
	//   39   77:invokevirtual   #66  <Method void finish()>
	//   40   80:return          
	}

	protected void onActivityResult(int j, int l, Intent intent)
	{
		if(j == 4073)
	//*   0    0:iload_1         
	//*   1    1:sipush          4073
	//*   2    4:icmpne          20
			a(a.h.a(intent));
	//    3    7:aload_0         
	//    4    8:getstatic       #84  <Field com.google.android.gms.auth.api.signin.a a.h>
	//    5   11:aload_3         
	//    6   12:invokeinterface #145 <Method c com.google.android.gms.auth.api.signin.a.a(Intent)>
	//    7   17:invokespecial   #17  <Method void a(c)>
	//    8   20:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #149 <Method void x.onCreate(Bundle)>
		setContentView(i.google_activity);
	//    3    5:aload_0         
	//    4    6:getstatic       #154 <Field int i.google_activity>
	//    5    9:invokevirtual   #158 <Method void setContentView(int)>
		bundle = ((Bundle) ((new b(GoogleSignInOptions.f)).b().a("968730509739-o7o20rtj8n4ccqrm5r2pq5qp6o1thhp4.apps.googleusercontent.com").d()));
	//    6   12:new             #160 <Class b>
	//    7   15:dup             
	//    8   16:getstatic       #166 <Field GoogleSignInOptions GoogleSignInOptions.f>
	//    9   19:invokespecial   #169 <Method void b(GoogleSignInOptions)>
	//   10   22:invokevirtual   #172 <Method b b.b()>
	//   11   25:ldc1            #174 <String "968730509739-o7o20rtj8n4ccqrm5r2pq5qp6o1thhp4.apps.googleusercontent.com">
	//   12   27:invokevirtual   #177 <Method b b.a(String)>
	//   13   30:invokevirtual   #181 <Method GoogleSignInOptions b.d()>
	//   14   33:astore_1        
		a = (new com.google.android.gms.common.api.x(((android.content.Context) (this)))).a(((x) (this)), ((z) (this))).a(a.e, ((com.google.android.gms.common.api.h) (bundle))).b();
	//   15   34:aload_0         
	//   16   35:new             #183 <Class com.google.android.gms.common.api.x>
	//   17   38:dup             
	//   18   39:aload_0         
	//   19   40:invokespecial   #186 <Method void com.google.android.gms.common.api.x(android.content.Context)>
	//   20   43:aload_0         
	//   21   44:aload_0         
	//   22   45:invokevirtual   #189 <Method com.google.android.gms.common.api.x com.google.android.gms.common.api.x.a(x, z)>
	//   23   48:getstatic       #192 <Field com.google.android.gms.common.api.a a.e>
	//   24   51:aload_1         
	//   25   52:invokevirtual   #195 <Method com.google.android.gms.common.api.x com.google.android.gms.common.api.x.a(com.google.android.gms.common.api.a, com.google.android.gms.common.api.h)>
	//   26   55:invokevirtual   #198 <Method w com.google.android.gms.common.api.x.b()>
	//   27   58:putfield        #86  <Field w a>
		if(b())
	//*  28   61:aload_0         
	//*  29   62:invokespecial   #40  <Method boolean b()>
	//*  30   65:ifeq            73
		{
			a();
	//   31   68:aload_0         
	//   32   69:invokevirtual   #200 <Method void a()>
			return;
	//   33   72:return          
		} else
		{
			startActivityForResult(a.h.a(a), 4073);
	//   34   73:aload_0         
	//   35   74:getstatic       #84  <Field com.google.android.gms.auth.api.signin.a a.h>
	//   36   77:aload_0         
	//   37   78:getfield        #86  <Field w a>
	//   38   81:invokeinterface #203 <Method Intent com.google.android.gms.auth.api.signin.a.a(w)>
	//   39   86:sipush          4073
	//   40   89:invokevirtual   #207 <Method void startActivityForResult(Intent, int)>
			return;
	//   41   92:return          
		}
	}

	private w a;
}
