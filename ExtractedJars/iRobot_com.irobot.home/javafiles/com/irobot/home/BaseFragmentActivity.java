// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.p.a;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.util.n;
import com.irobot.home.util.o;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			IRobotApplication

public class BaseFragmentActivity extends AppCompatActivity
	implements com.irobot.home.p.a.a
{

	public BaseFragmentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	private void e()
	{
		p = findViewById(0x7f0901b4);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #21  <Int 0x7f0901b4>
	//    3    4:invokevirtual   #25  <Method View findViewById(int)>
	//    4    7:putfield        #27  <Field View p>
		q = (TextView)findViewById(0x7f0901b7);
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:ldc1            #28  <Int 0x7f0901b7>
	//    8   14:invokevirtual   #25  <Method View findViewById(int)>
	//    9   17:checkcast       #30  <Class TextView>
	//   10   20:putfield        #32  <Field TextView q>
	//   11   23:return          
	}

	public void a(List list, List list1, List list2, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("User granted ");
	//    4    9:aload           5
	//    5   11:ldc1            #39  <String "User granted ">
	//    6   13:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(((Object) (list)).toString());
	//    8   17:aload           5
	//    9   19:aload_1         
	//   10   20:invokevirtual   #49  <Method String Object.toString()>
	//   11   23:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(" permission(s).");
	//   13   27:aload           5
	//   14   29:ldc1            #51  <String " permission(s).">
	//   15   31:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		o.b("BaseFragmentActivity", stringbuilder.toString());
	//   17   35:ldc1            #53  <String "BaseFragmentActivity">
	//   18   37:aload           5
	//   19   39:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   20   42:invokestatic    #60  <Method void o.b(String, String)>
		list = ((List) (new StringBuilder()));
	//   21   45:new             #36  <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #37  <Method void StringBuilder()>
	//   24   52:astore_1        
		((StringBuilder) (list)).append("User denied ");
	//   25   53:aload_1         
	//   26   54:ldc1            #62  <String "User denied ">
	//   27   56:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
		((StringBuilder) (list)).append(((Object) (list1)).toString());
	//   29   60:aload_1         
	//   30   61:aload_2         
	//   31   62:invokevirtual   #49  <Method String Object.toString()>
	//   32   65:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
		((StringBuilder) (list)).append(" permission(s).");
	//   34   69:aload_1         
	//   35   70:ldc1            #51  <String " permission(s).">
	//   36   72:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		o.b("BaseFragmentActivity", ((StringBuilder) (list)).toString());
	//   38   76:ldc1            #53  <String "BaseFragmentActivity">
	//   39   78:aload_1         
	//   40   79:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   41   82:invokestatic    #60  <Method void o.b(String, String)>
		list = ((List) (new StringBuilder()));
	//   42   85:new             #36  <Class StringBuilder>
	//   43   88:dup             
	//   44   89:invokespecial   #37  <Method void StringBuilder()>
	//   45   92:astore_1        
		((StringBuilder) (list)).append("User permanently denied ");
	//   46   93:aload_1         
	//   47   94:ldc1            #64  <String "User permanently denied ">
	//   48   96:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   49   99:pop             
		((StringBuilder) (list)).append(((Object) (list2)).toString());
	//   50  100:aload_1         
	//   51  101:aload_3         
	//   52  102:invokevirtual   #49  <Method String Object.toString()>
	//   53  105:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   54  108:pop             
		((StringBuilder) (list)).append(" permission(s).");
	//   55  109:aload_1         
	//   56  110:ldc1            #51  <String " permission(s).">
	//   57  112:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   58  115:pop             
		o.b("BaseFragmentActivity", ((StringBuilder) (list)).toString());
	//   59  116:ldc1            #53  <String "BaseFragmentActivity">
	//   60  118:aload_1         
	//   61  119:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   62  122:invokestatic    #60  <Method void o.b(String, String)>
		list = ((List) (new StringBuilder()));
	//   63  125:new             #36  <Class StringBuilder>
	//   64  128:dup             
	//   65  129:invokespecial   #37  <Method void StringBuilder()>
	//   66  132:astore_1        
		((StringBuilder) (list)).append("Request code ");
	//   67  133:aload_1         
	//   68  134:ldc1            #66  <String "Request code ">
	//   69  136:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   70  139:pop             
		((StringBuilder) (list)).append(i);
	//   71  140:aload_1         
	//   72  141:iload           4
	//   73  143:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   74  146:pop             
		o.b("BaseFragmentActivity", ((StringBuilder) (list)).toString());
	//   75  147:ldc1            #53  <String "BaseFragmentActivity">
	//   76  149:aload_1         
	//   77  150:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   78  153:invokestatic    #60  <Method void o.b(String, String)>
	//   79  156:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (n.a(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #78  <Method android.content.ContextWrapper n.a(Context)>
	//    3    5:invokespecial   #80  <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	public void b(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Updating title with resource id value: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #83  <String "Updating title with resource id value: ">
	//    6   11:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.valueOf(i));
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokestatic    #89  <Method String String.valueOf(int)>
	//   11   20:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		o.b("BaseFragmentActivity", stringbuilder.toString());
	//   13   24:ldc1            #53  <String "BaseFragmentActivity">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #60  <Method void o.b(String, String)>
		q.setPadding(0, 0, 0, 0);
	//   17   33:aload_0         
	//   18   34:getfield        #32  <Field TextView q>
	//   19   37:iconst_0        
	//   20   38:iconst_0        
	//   21   39:iconst_0        
	//   22   40:iconst_0        
	//   23   41:invokevirtual   #93  <Method void TextView.setPadding(int, int, int, int)>
		d(0);
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:invokevirtual   #96  <Method void d(int)>
		j.a(((android.app.Activity) (this)), q, getString(i));
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:getfield        #32  <Field TextView q>
	//   30   54:aload_0         
	//   31   55:iload_1         
	//   32   56:invokevirtual   #99  <Method String getString(int)>
	//   33   59:invokestatic    #104 <Method void j.a(android.app.Activity, TextView, String)>
	//   34   62:return          
	}

	public void c(int i)
	{
		q.setPadding(0, 0, 0, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field TextView q>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #93  <Method void TextView.setPadding(int, int, int, int)>
		d(0);
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #96  <Method void d(int)>
		q.setText(((CharSequence) (getString(i))));
	//   10   16:aload_0         
	//   11   17:getfield        #32  <Field TextView q>
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:invokevirtual   #99  <Method String getString(int)>
	//   15   25:invokevirtual   #109 <Method void TextView.setText(CharSequence)>
	//   16   28:return          
	}

	protected void d(int i)
	{
		q.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field TextView q>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method void TextView.setVisibility(int)>
	//    4    8:return          
	}

	protected void e(int i)
	{
		p.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field View p>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #115 <Method void View.setVisibility(int)>
	//    4    8:return          
	}

	public void e(String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Updating title with string value: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #118 <String "Updating title with string value: ">
	//    6   11:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s1);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		o.b("BaseFragmentActivity", stringbuilder.toString());
	//   12   21:ldc1            #53  <String "BaseFragmentActivity">
	//   13   23:aload_2         
	//   14   24:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   15   27:invokestatic    #60  <Method void o.b(String, String)>
		q.setPadding(0, 0, 0, 0);
	//   16   30:aload_0         
	//   17   31:getfield        #32  <Field TextView q>
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:iconst_0        
	//   21   37:iconst_0        
	//   22   38:invokevirtual   #93  <Method void TextView.setPadding(int, int, int, int)>
		d(0);
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #96  <Method void d(int)>
		j.a(((android.app.Activity) (this)), q, s1);
	//   26   46:aload_0         
	//   27   47:aload_0         
	//   28   48:getfield        #32  <Field TextView q>
	//   29   51:aload_1         
	//   30   52:invokestatic    #104 <Method void j.a(android.app.Activity, TextView, String)>
	//   31   55:return          
	}

	protected void onCreate(Bundle bundle)
	{
		r = ((IRobotApplication)getApplication()).i();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #124 <Method android.app.Application getApplication()>
	//    3    5:checkcast       #126 <Class IRobotApplication>
	//    4    8:invokevirtual   #130 <Method b IRobotApplication.i()>
	//    5   11:putfield        #132 <Field b r>
		s = new a(((android.app.Activity) (this)));
	//    6   14:aload_0         
	//    7   15:new             #134 <Class a>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #137 <Method void a(android.app.Activity)>
	//   11   23:putfield        #139 <Field a s>
		super.onCreate(bundle);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #141 <Method void AppCompatActivity.onCreate(Bundle)>
	//   15   31:return          
	}

	public void onCreate(Bundle bundle, PersistableBundle persistablebundle)
	{
		r = ((IRobotApplication)getApplication()).i();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #124 <Method android.app.Application getApplication()>
	//    3    5:checkcast       #126 <Class IRobotApplication>
	//    4    8:invokevirtual   #130 <Method b IRobotApplication.i()>
	//    5   11:putfield        #132 <Field b r>
		s = new a(((android.app.Activity) (this)));
	//    6   14:aload_0         
	//    7   15:new             #134 <Class a>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #137 <Method void a(android.app.Activity)>
	//   11   23:putfield        #139 <Field a s>
		super.onCreate(bundle, persistablebundle);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokespecial   #144 <Method void AppCompatActivity.onCreate(Bundle, PersistableBundle)>
	//   16   32:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void AppCompatActivity.onPostResume()>
		e();
	//    2    4:aload_0         
	//    3    5:invokespecial   #149 <Method void e()>
	//    4    8:return          
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		s.a(i, as, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field a s>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #153 <Method void a.a(int, String[], int[])>
	//    6   10:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #156 <Method void AppCompatActivity.setContentView(int)>
		e();
	//    3    5:aload_0         
	//    4    6:invokespecial   #149 <Method void e()>
	//    5    9:return          
	}

	protected void u()
	{
		String s1 = getIntent().getStringExtra("assetId");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #161 <Method Intent getIntent()>
	//    2    4:ldc1            #163 <String "assetId">
	//    3    6:invokevirtual   #169 <Method String Intent.getStringExtra(String)>
	//    4    9:astore_1        
		if(j.i(s1))
	//*   5   10:aload_1         
	//*   6   11:invokestatic    #172 <Method boolean j.i(String)>
	//*   7   14:ifeq            76
		{
			Object obj = ((Object) (((IRobotApplication)j.g()).h()));
	//    8   17:invokestatic    #175 <Method android.app.Application j.g()>
	//    9   20:checkcast       #126 <Class IRobotApplication>
	//   10   23:invokevirtual   #179 <Method IRobotModel IRobotApplication.h()>
	//   11   26:astore_2        
			if(!((IRobotModel) (obj)).b(s1))
	//*  12   27:aload_2         
	//*  13   28:aload_1         
	//*  14   29:invokevirtual   #183 <Method boolean IRobotModel.b(String)>
	//*  15   32:ifne            70
			{
				obj = ((Object) (new StringBuilder()));
	//   16   35:new             #36  <Class StringBuilder>
	//   17   38:dup             
	//   18   39:invokespecial   #37  <Method void StringBuilder()>
	//   19   42:astore_2        
				((StringBuilder) (obj)).append("Cannot start activity for unregistered asset: ");
	//   20   43:aload_2         
	//   21   44:ldc1            #185 <String "Cannot start activity for unregistered asset: ">
	//   22   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
				((StringBuilder) (obj)).append(s1);
	//   24   50:aload_2         
	//   25   51:aload_1         
	//   26   52:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
				o.e("BaseFragmentActivity", ((StringBuilder) (obj)).toString());
	//   28   56:ldc1            #53  <String "BaseFragmentActivity">
	//   29   58:aload_2         
	//   30   59:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   31   62:invokestatic    #187 <Method void o.e(String, String)>
				j.a(((android.app.Activity) (this)));
	//   32   65:aload_0         
	//   33   66:invokestatic    #189 <Method void j.a(android.app.Activity)>
				return;
	//   34   69:return          
			} else
			{
				((IRobotModel) (obj)).a(s1);
	//   35   70:aload_2         
	//   36   71:aload_1         
	//   37   72:invokevirtual   #191 <Method void IRobotModel.a(String)>
				return;
	//   38   75:return          
			}
		} else
		{
			o.d("BaseFragmentActivity", "Cannot update current asset: asset ID is invalid");
	//   39   76:ldc1            #53  <String "BaseFragmentActivity">
	//   40   78:ldc1            #193 <String "Cannot update current asset: asset ID is invalid">
	//   41   80:invokestatic    #195 <Method void o.d(String, String)>
			return;
	//   42   83:return          
		}
	}

	protected boolean v()
	{
		return getIntent().getBooleanExtra("fromPush", false);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #161 <Method Intent getIntent()>
	//    2    4:ldc1            #199 <String "fromPush">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #203 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//    5   10:ireturn         
	}

	protected void w()
	{
		((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
	//    0    0:aload_0         
	//    1    1:ldc1            #206 <String "input_method">
	//    2    3:invokevirtual   #210 <Method Object getSystemService(String)>
	//    3    6:checkcast       #212 <Class InputMethodManager>
	//    4    9:aload_0         
	//    5   10:invokevirtual   #216 <Method View getCurrentFocus()>
	//    6   13:invokevirtual   #220 <Method android.os.IBinder View.getWindowToken()>
	//    7   16:iconst_0        
	//    8   17:invokevirtual   #224 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//    9   20:pop             
	//   10   21:return          
	}

	protected View p;
	protected TextView q;
	protected b r;
	protected a s;
}
