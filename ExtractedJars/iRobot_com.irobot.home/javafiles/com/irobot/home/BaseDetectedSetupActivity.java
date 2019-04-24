// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Context;
import android.content.DialogInterface;
import android.net.wifi.WifiManager;
import android.widget.TextView;
import com.irobot.core.AssetInfo;
import com.irobot.home.util.j;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication

public abstract class BaseDetectedSetupActivity extends BaseFragmentActivity
{

	public BaseDetectedSetupActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	protected void a(int k, String s)
	{
		ArrayList arraylist = com.irobot.home.util.j.b(k, getResources());
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #32  <Method android.content.res.Resources getResources()>
	//    3    5:invokestatic    #37  <Method ArrayList j.b(int, android.content.res.Resources)>
	//    4    8:astore_3        
		if(arraylist.size() > 0)
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #43  <Method int ArrayList.size()>
	//*   7   13:ifle            63
		{
			arraylist.set(0, ((Object) (String.format((String)arraylist.get(0), new Object[] {
				com.irobot.home.util.j.a(s, getResources())
			}))));
	//    8   16:aload_3         
	//    9   17:iconst_0        
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #47  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #49  <Class String>
	//   14   26:iconst_1        
	//   15   27:anewarray       Object[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_2         
	//   19   33:aload_0         
	//   20   34:invokevirtual   #32  <Method android.content.res.Resources getResources()>
	//   21   37:invokestatic    #54  <Method String j.a(String, android.content.res.Resources)>
	//   22   40:aastore         
	//   23   41:invokestatic    #58  <Method String String.format(String, Object[])>
	//   24   44:invokevirtual   #62  <Method Object ArrayList.set(int, Object)>
	//   25   47:pop             
			com.irobot.home.util.j.a(arraylist, c, ((java.util.Map) (new HashMap())));
	//   26   48:aload_3         
	//   27   49:aload_0         
	//   28   50:getfield        #64  <Field TextView c>
	//   29   53:new             #66  <Class HashMap>
	//   30   56:dup             
	//   31   57:invokespecial   #67  <Method void HashMap()>
	//   32   60:invokestatic    #70  <Method void j.a(ArrayList, TextView, java.util.Map)>
		}
	//   33   63:return          
	}

	protected abstract void e();

	protected abstract void f();

	protected abstract void g();

	protected void h()
	{
		e = AssetInfo.createFromJson(a);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #74  <Field String a>
	//    3    5:invokestatic    #80  <Method AssetInfo AssetInfo.createFromJson(String)>
	//    4    8:putfield        #82  <Field AssetInfo e>
		String s;
		if(com.irobot.home.util.j.i(e.getName()))
	//*   5   11:aload_0         
	//*   6   12:getfield        #82  <Field AssetInfo e>
	//*   7   15:invokevirtual   #86  <Method String AssetInfo.getName()>
	//*   8   18:invokestatic    #90  <Method boolean j.i(String)>
	//*   9   21:ifeq            35
			s = e.getName();
	//   10   24:aload_0         
	//   11   25:getfield        #82  <Field AssetInfo e>
	//   12   28:invokevirtual   #86  <Method String AssetInfo.getName()>
	//   13   31:astore_1        
		else
	//*  14   32:goto            42
			s = getString(0x7f0f07ab);
	//   15   35:aload_0         
	//   16   36:ldc1            #91  <Int 0x7f0f07ab>
	//   17   38:invokevirtual   #95  <Method String getString(int)>
	//   18   41:astore_1        
		f = s;
	//   19   42:aload_0         
	//   20   43:aload_1         
	//   21   44:putfield        #97  <Field String f>
	//   22   47:return          
	}

	protected void i()
	{
		if(!com.irobot.home.util.j.c())
	//*   0    0:invokestatic    #100 <Method boolean j.c()>
	//*   1    3:ifne            54
			(new android.app.AlertDialog.Builder(((Context) (this)))).setTitle(0x7f0f0913).setMessage(0x7f0f0914).setNegativeButton(0x7f0f04d3, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int k)
				{
					a.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseDetectedSetupActivity a>
				//    2    4:invokevirtual   #25  <Method void BaseDetectedSetupActivity.finish()>
				//    3    7:return          
				}

				final BaseDetectedSetupActivity a;

			
			{
				a = BaseDetectedSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseDetectedSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int k)
				{
					((WifiManager)a.getApplicationContext().getSystemService("wifi")).setWifiEnabled(true);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseDetectedSetupActivity a>
				//    2    4:invokevirtual   #26  <Method Context BaseDetectedSetupActivity.getApplicationContext()>
				//    3    7:ldc1            #28  <String "wifi">
				//    4    9:invokevirtual   #34  <Method Object Context.getSystemService(String)>
				//    5   12:checkcast       #36  <Class WifiManager>
				//    6   15:iconst_1        
				//    7   16:invokevirtual   #40  <Method boolean WifiManager.setWifiEnabled(boolean)>
				//    8   19:pop             
					a.f();
				//    9   20:aload_0         
				//   10   21:getfield        #17  <Field BaseDetectedSetupActivity a>
				//   11   24:invokevirtual   #43  <Method void BaseDetectedSetupActivity.f()>
				//   12   27:return          
				}

				final BaseDetectedSetupActivity a;

			
			{
				a = BaseDetectedSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseDetectedSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//    2    6:new             #102 <Class android.app.AlertDialog$Builder>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #105 <Method void android.app.AlertDialog$Builder(Context)>
	//    6   14:ldc1            #106 <Int 0x7f0f0913>
	//    7   16:invokevirtual   #110 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    8   19:ldc1            #111 <Int 0x7f0f0914>
	//    9   21:invokevirtual   #114 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   10   24:ldc1            #115 <Int 0x7f0f04d3>
	//   11   26:new             #8   <Class BaseDetectedSetupActivity$2>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:invokespecial   #118 <Method void BaseDetectedSetupActivity$2(BaseDetectedSetupActivity)>
	//   15   34:invokevirtual   #122 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   16   37:ldc1            #123 <Int 0x7f0f0986>
	//   17   39:new             #6   <Class BaseDetectedSetupActivity$1>
	//   18   42:dup             
	//   19   43:aload_0         
	//   20   44:invokespecial   #124 <Method void BaseDetectedSetupActivity$1(BaseDetectedSetupActivity)>
	//   21   47:invokevirtual   #127 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   22   50:invokevirtual   #131 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   23   53:pop             
	//   24   54:return          
	}

	protected void j()
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #135 <Method boolean isFinishing()>
	//*   2    4:ifne            76
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #138 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			(new android.app.AlertDialog.Builder(((Context) (this)))).setTitle(0x7f0f02e7).setMessage(((CharSequence) (getString(0x7f0f0764, new Object[] {
				f
			})))).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

				public void onCancel(DialogInterface dialoginterface)
				{
					a.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseDetectedSetupActivity a>
				//    2    4:invokevirtual   #25  <Method void BaseDetectedSetupActivity.finish()>
				//    3    7:return          
				}

				final BaseDetectedSetupActivity a;

			
			{
				a = BaseDetectedSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseDetectedSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int k)
				{
					a.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseDetectedSetupActivity a>
				//    2    4:invokevirtual   #25  <Method void BaseDetectedSetupActivity.finish()>
				//    3    7:return          
				}

				final BaseDetectedSetupActivity a;

			
			{
				a = BaseDetectedSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseDetectedSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//    7   15:new             #102 <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #105 <Method void android.app.AlertDialog$Builder(Context)>
	//   11   23:ldc1            #139 <Int 0x7f0f02e7>
	//   12   25:invokevirtual   #110 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   13   28:aload_0         
	//   14   29:ldc1            #140 <Int 0x7f0f0764>
	//   15   31:iconst_1        
	//   16   32:anewarray       Object[]
	//   17   35:dup             
	//   18   36:iconst_0        
	//   19   37:aload_0         
	//   20   38:getfield        #97  <Field String f>
	//   21   41:aastore         
	//   22   42:invokevirtual   #143 <Method String getString(int, Object[])>
	//   23   45:invokevirtual   #146 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   24   48:new             #12  <Class BaseDetectedSetupActivity$4>
	//   25   51:dup             
	//   26   52:aload_0         
	//   27   53:invokespecial   #147 <Method void BaseDetectedSetupActivity$4(BaseDetectedSetupActivity)>
	//   28   56:invokevirtual   #151 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//   29   59:ldc1            #152 <Int 0x7f0f05bb>
	//   30   61:new             #10  <Class BaseDetectedSetupActivity$3>
	//   31   64:dup             
	//   32   65:aload_0         
	//   33   66:invokespecial   #153 <Method void BaseDetectedSetupActivity$3(BaseDetectedSetupActivity)>
	//   34   69:invokevirtual   #127 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   35   72:invokevirtual   #131 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   36   75:pop             
		}
	//   37   76:return          
	}

	public void onBackPressed()
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method void e()>
		super.onBackPressed();
	//    2    4:aload_0         
	//    3    5:invokespecial   #158 <Method void BaseFragmentActivity.onBackPressed()>
	//    4    8:return          
	}

	protected void onStop()
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method void e()>
		super.onStop();
	//    2    4:aload_0         
	//    3    5:invokespecial   #161 <Method void BaseFragmentActivity.onStop()>
	//    4    8:return          
	}

	String a;
	protected IRobotApplication b;
	TextView c;
	TextView d;
	protected AssetInfo e;
	protected String f;
}
