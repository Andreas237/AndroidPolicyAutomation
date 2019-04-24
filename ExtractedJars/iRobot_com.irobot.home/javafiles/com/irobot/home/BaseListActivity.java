// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;
import com.irobot.home.p.a;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.util.n;
import com.irobot.home.util.o;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			IRobotApplication

public class BaseListActivity extends ListActivity
	implements com.irobot.home.p.a.a
{

	public BaseListActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ListActivity()>
	//    2    4:return          
	}

	private void a()
	{
		c = (TextView)findViewById(0x7f0901b7);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #18  <Int 0x7f0901b7>
	//    3    4:invokevirtual   #22  <Method android.view.View findViewById(int)>
	//    4    7:checkcast       #24  <Class TextView>
	//    5   10:putfield        #26  <Field TextView c>
	//    6   13:return          
	}

	public void a(List list, List list1, List list2, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("User granted ");
	//    4    9:aload           5
	//    5   11:ldc1            #32  <String "User granted ">
	//    6   13:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(((Object) (list)).toString());
	//    8   17:aload           5
	//    9   19:aload_1         
	//   10   20:invokevirtual   #42  <Method String Object.toString()>
	//   11   23:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(" permission(s).");
	//   13   27:aload           5
	//   14   29:ldc1            #44  <String " permission(s).">
	//   15   31:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		o.b("BaseListActivity", stringbuilder.toString());
	//   17   35:ldc1            #46  <String "BaseListActivity">
	//   18   37:aload           5
	//   19   39:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   20   42:invokestatic    #52  <Method void o.b(String, String)>
		list = ((List) (new StringBuilder()));
	//   21   45:new             #29  <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #30  <Method void StringBuilder()>
	//   24   52:astore_1        
		((StringBuilder) (list)).append("User denied ");
	//   25   53:aload_1         
	//   26   54:ldc1            #54  <String "User denied ">
	//   27   56:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
		((StringBuilder) (list)).append(((Object) (list1)).toString());
	//   29   60:aload_1         
	//   30   61:aload_2         
	//   31   62:invokevirtual   #42  <Method String Object.toString()>
	//   32   65:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
		((StringBuilder) (list)).append(" permission(s).");
	//   34   69:aload_1         
	//   35   70:ldc1            #44  <String " permission(s).">
	//   36   72:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		o.b("BaseListActivity", ((StringBuilder) (list)).toString());
	//   38   76:ldc1            #46  <String "BaseListActivity">
	//   39   78:aload_1         
	//   40   79:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   41   82:invokestatic    #52  <Method void o.b(String, String)>
		list = ((List) (new StringBuilder()));
	//   42   85:new             #29  <Class StringBuilder>
	//   43   88:dup             
	//   44   89:invokespecial   #30  <Method void StringBuilder()>
	//   45   92:astore_1        
		((StringBuilder) (list)).append("User permanently denied ");
	//   46   93:aload_1         
	//   47   94:ldc1            #56  <String "User permanently denied ">
	//   48   96:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   49   99:pop             
		((StringBuilder) (list)).append(((Object) (list2)).toString());
	//   50  100:aload_1         
	//   51  101:aload_3         
	//   52  102:invokevirtual   #42  <Method String Object.toString()>
	//   53  105:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   54  108:pop             
		((StringBuilder) (list)).append(" permission(s).");
	//   55  109:aload_1         
	//   56  110:ldc1            #44  <String " permission(s).">
	//   57  112:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   58  115:pop             
		o.b("BaseListActivity", ((StringBuilder) (list)).toString());
	//   59  116:ldc1            #46  <String "BaseListActivity">
	//   60  118:aload_1         
	//   61  119:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   62  122:invokestatic    #52  <Method void o.b(String, String)>
		list = ((List) (new StringBuilder()));
	//   63  125:new             #29  <Class StringBuilder>
	//   64  128:dup             
	//   65  129:invokespecial   #30  <Method void StringBuilder()>
	//   66  132:astore_1        
		((StringBuilder) (list)).append("Request code ");
	//   67  133:aload_1         
	//   68  134:ldc1            #58  <String "Request code ">
	//   69  136:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   70  139:pop             
		((StringBuilder) (list)).append(i);
	//   71  140:aload_1         
	//   72  141:iload           4
	//   73  143:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   74  146:pop             
		o.b("BaseListActivity", ((StringBuilder) (list)).toString());
	//   75  147:ldc1            #46  <String "BaseListActivity">
	//   76  149:aload_1         
	//   77  150:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   78  153:invokestatic    #52  <Method void o.b(String, String)>
	//   79  156:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (n.a(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #70  <Method android.content.ContextWrapper n.a(Context)>
	//    3    5:invokespecial   #72  <Method void ListActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	public void b(int i)
	{
		c.setPadding(0, 0, 0, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field TextView c>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #77  <Method void TextView.setPadding(int, int, int, int)>
		j.a(((android.app.Activity) (this)), c, getString(i));
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #26  <Field TextView c>
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokevirtual   #81  <Method String getString(int)>
	//   13   21:invokestatic    #86  <Method void j.a(android.app.Activity, TextView, String)>
	//   14   24:return          
	}

	public void c(int i)
	{
		c.setPadding(0, 0, 0, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field TextView c>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #77  <Method void TextView.setPadding(int, int, int, int)>
		c.setText(((CharSequence) (getString(i))));
	//    7   11:aload_0         
	//    8   12:getfield        #26  <Field TextView c>
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokevirtual   #81  <Method String getString(int)>
	//   12   20:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
	//   13   23:return          
	}

	protected void onCreate(Bundle bundle)
	{
		a = ((IRobotApplication)getApplication()).i();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #96  <Method android.app.Application getApplication()>
	//    3    5:checkcast       #98  <Class IRobotApplication>
	//    4    8:invokevirtual   #102 <Method b IRobotApplication.i()>
	//    5   11:putfield        #104 <Field b a>
		b = new a(((android.app.Activity) (this)));
	//    6   14:aload_0         
	//    7   15:new             #106 <Class a>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #109 <Method void a(android.app.Activity)>
	//   11   23:putfield        #111 <Field a b>
		super.onCreate(bundle);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #113 <Method void ListActivity.onCreate(Bundle)>
	//   15   31:return          
	}

	public void onCreate(Bundle bundle, PersistableBundle persistablebundle)
	{
		a = ((IRobotApplication)getApplication()).i();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #96  <Method android.app.Application getApplication()>
	//    3    5:checkcast       #98  <Class IRobotApplication>
	//    4    8:invokevirtual   #102 <Method b IRobotApplication.i()>
	//    5   11:putfield        #104 <Field b a>
		b = new a(((android.app.Activity) (this)));
	//    6   14:aload_0         
	//    7   15:new             #106 <Class a>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #109 <Method void a(android.app.Activity)>
	//   11   23:putfield        #111 <Field a b>
		super.onCreate(bundle, persistablebundle);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokespecial   #116 <Method void ListActivity.onCreate(Bundle, PersistableBundle)>
	//   16   32:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void ListActivity.onPostResume()>
		a();
	//    2    4:aload_0         
	//    3    5:invokespecial   #121 <Method void a()>
	//    4    8:return          
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		b.a(i, as, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field a b>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #125 <Method void a.a(int, String[], int[])>
	//    6   10:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #128 <Method void ListActivity.setContentView(int)>
		a();
	//    3    5:aload_0         
	//    4    6:invokespecial   #121 <Method void a()>
	//    5    9:return          
	}

	protected b a;
	protected a b;
	private TextView c;
}
