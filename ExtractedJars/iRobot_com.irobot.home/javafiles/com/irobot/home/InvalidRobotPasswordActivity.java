// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication, SelectRobotTypeActivity_

public class InvalidRobotPasswordActivity extends BaseFragmentActivity
{

	public InvalidRobotPasswordActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	private void c(Intent intent)
	{
		((IRobotApplication)getApplication()).j();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method android.app.Application getApplication()>
	//    2    4:checkcast       #23  <Class IRobotApplication>
	//    3    7:invokevirtual   #26  <Method void com.irobot.home.IRobotApplication.j()>
		intent.addFlags(0x10008000);
	//    4   10:aload_1         
	//    5   11:ldc1            #27  <Int 0x10008000>
	//    6   13:invokevirtual   #33  <Method Intent Intent.addFlags(int)>
	//    7   16:pop             
		startActivity(intent);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #36  <Method void startActivity(Intent)>
		finish();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #39  <Method void finish()>
	//   13   26:return          
	}

	private void h()
	{
		j.b(d);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String d>
	//    2    4:invokestatic    #47  <Method void j.b(String)>
		Assembler.getInstance().removeAsset(AssetId.assetIdForString(d));
	//    3    7:invokestatic    #53  <Method Assembler Assembler.getInstance()>
	//    4   10:aload_0         
	//    5   11:getfield        #42  <Field String d>
	//    6   14:invokestatic    #59  <Method AssetId AssetId.assetIdForString(String)>
	//    7   17:invokevirtual   #63  <Method void Assembler.removeAsset(AssetId)>
	//    8   20:return          
	}

	public void e()
	{
		String s = "";
	//    0    0:ldc1            #66  <String "">
	//    1    2:astore_1        
		a a1 = j.a(d);
	//    2    3:aload_0         
	//    3    4:getfield        #42  <Field String d>
	//    4    7:invokestatic    #69  <Method a j.a(String)>
	//    5   10:astore_2        
		if(a1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          23
			s = a1.a().getName();
	//    8   15:aload_2         
	//    9   16:invokevirtual   #74  <Method AssetInfo a.a()>
	//   10   19:invokevirtual   #80  <Method String AssetInfo.getName()>
	//   11   22:astore_1        
		c.setText(((CharSequence) (getString(0x7f0f076c, new Object[] {
			s
		}))));
	//   12   23:aload_0         
	//   13   24:getfield        #82  <Field TextView c>
	//   14   27:aload_0         
	//   15   28:ldc1            #83  <Int 0x7f0f076c>
	//   16   30:iconst_1        
	//   17   31:anewarray       Object[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:aload_1         
	//   21   37:aastore         
	//   22   38:invokevirtual   #89  <Method String getString(int, Object[])>
	//   23   41:invokevirtual   #95  <Method void TextView.setText(CharSequence)>
		setFinishOnTouchOutside(false);
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:invokevirtual   #99  <Method void setFinishOnTouchOutside(boolean)>
	//   27   49:return          
	}

	public void f()
	{
		h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void h()>
		((IRobotApplication)getApplication()).j();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #21  <Method android.app.Application getApplication()>
	//    4    8:checkcast       #23  <Class IRobotApplication>
	//    5   11:invokevirtual   #26  <Method void com.irobot.home.IRobotApplication.j()>
		j.a(((android.app.Activity) (this)));
	//    6   14:aload_0         
	//    7   15:invokestatic    #105 <Method void j.a(android.app.Activity)>
	//    8   18:return          
	}

	public void g()
	{
		h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void h()>
		if(j.j() == null)
	//*   2    4:invokestatic    #109 <Method a j.j()>
	//*   3    7:ifnonnull       28
		{
			c(new Intent(getApplicationContext(), com/irobot/home/SelectRobotTypeActivity_));
	//    4   10:aload_0         
	//    5   11:new             #29  <Class Intent>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokevirtual   #113 <Method android.content.Context getApplicationContext()>
	//    9   19:ldc1            #115 <Class SelectRobotTypeActivity_>
	//   10   21:invokespecial   #118 <Method void Intent(android.content.Context, Class)>
	//   11   24:invokespecial   #120 <Method void c(Intent)>
			return;
	//   12   27:return          
		} else
		{
			com.irobot.home.SelectRobotTypeActivity_.a(((android.content.Context) (this))).a(true).a();
	//   13   28:aload_0         
	//   14   29:invokestatic    #123 <Method SelectRobotTypeActivity_$a com.irobot.home.SelectRobotTypeActivity_.a(android.content.Context)>
	//   15   32:iconst_1        
	//   16   33:invokevirtual   #128 <Method SelectRobotTypeActivity_$a com.irobot.home.SelectRobotTypeActivity_$a.a(boolean)>
	//   17   36:invokevirtual   #131 <Method org.androidannotations.api.a.e com.irobot.home.SelectRobotTypeActivity_$a.a()>
	//   18   39:pop             
			return;
	//   19   40:return          
		}
	}

	public void onBackPressed()
	{
	//    0    0:return          
	}

	public void onCreate(Bundle bundle)
	{
		d = getIntent().getStringExtra("blid");
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #138 <Method Intent getIntent()>
	//    3    5:ldc1            #140 <String "blid">
	//    4    7:invokevirtual   #144 <Method String Intent.getStringExtra(String)>
	//    5   10:putfield        #42  <Field String d>
		setTitle(0x7f0f0409);
	//    6   13:aload_0         
	//    7   14:ldc1            #145 <Int 0x7f0f0409>
	//    8   16:invokevirtual   #149 <Method void setTitle(int)>
		super.onCreate(bundle);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #151 <Method void BaseFragmentActivity.onCreate(Bundle)>
	//   12   24:return          
	}

	protected void onRestoreInstanceState(Bundle bundle)
	{
		if(bundle != null && bundle.containsKey("blid"))
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
	//*   2    4:aload_1         
	//*   3    5:ldc1            #140 <String "blid">
	//*   4    7:invokevirtual   #158 <Method boolean Bundle.containsKey(String)>
	//*   5   10:ifeq            23
			d = bundle.getString("blid");
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:ldc1            #140 <String "blid">
	//    9   17:invokevirtual   #160 <Method String Bundle.getString(String)>
	//   10   20:putfield        #42  <Field String d>
		super.onRestoreInstanceState(bundle);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #162 <Method void BaseFragmentActivity.onRestoreInstanceState(Bundle)>
	//   14   28:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		bundle.putString("blid", d);
	//    0    0:aload_1         
	//    1    1:ldc1            #140 <String "blid">
	//    2    3:aload_0         
	//    3    4:getfield        #42  <Field String d>
	//    4    7:invokevirtual   #167 <Method void Bundle.putString(String, String)>
		super.onSaveInstanceState(bundle);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #169 <Method void BaseFragmentActivity.onSaveInstanceState(Bundle)>
	//    8   15:return          
	}

	protected Button a;
	protected Button b;
	protected TextView c;
	private String d;
}
