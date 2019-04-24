// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.PersistenceHandler;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, e, MapCustomizationEditInfoActivity_

public class NameFloorPlanActivity extends BaseFragmentActivity
{

	public NameFloorPlanActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BaseFragmentActivity()>
		e = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #21  <String "">
	//    4    7:putfield        #23  <Field String e>
		a = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #21  <String "">
	//    7   13:putfield        #25  <Field String a>
		b = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #27  <Field boolean b>
	//   11   21:return          
	}

	private void g()
	{
		e = d.c();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field e d>
	//    3    5:invokevirtual   #36  <Method String e.c()>
	//    4    8:putfield        #23  <Field String e>
		Intent intent = new Intent();
	//    5   11:new             #38  <Class Intent>
	//    6   14:dup             
	//    7   15:invokespecial   #39  <Method void Intent()>
	//    8   18:astore_1        
		intent.putExtra("validFloorPlanName", e);
	//    9   19:aload_1         
	//   10   20:ldc1            #41  <String "validFloorPlanName">
	//   11   22:aload_0         
	//   12   23:getfield        #23  <Field String e>
	//   13   26:invokevirtual   #45  <Method Intent Intent.putExtra(String, String)>
	//   14   29:pop             
		intent.putExtra("isRenamingMap", b);
	//   15   30:aload_1         
	//   16   31:ldc1            #47  <String "isRenamingMap">
	//   17   33:aload_0         
	//   18   34:getfield        #27  <Field boolean b>
	//   19   37:invokevirtual   #50  <Method Intent Intent.putExtra(String, boolean)>
	//   20   40:pop             
		setResult(-1, intent);
	//   21   41:aload_0         
	//   22   42:iconst_m1       
	//   23   43:aload_1         
	//   24   44:invokevirtual   #54  <Method void setResult(int, Intent)>
		w();
	//   25   47:aload_0         
	//   26   48:invokevirtual   #57  <Method void w()>
		finish();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #60  <Method void finish()>
	//   29   55:return          
	}

	public void a(boolean flag)
	{
		c.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field CustomTextView c>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #68  <Method void CustomTextView.setEnabled(boolean)>
	//    4    8:return          
	}

	public void e()
	{
		f = j.j().a().getAssetId();
	//    0    0:aload_0         
	//    1    1:invokestatic    #74  <Method a j.j()>
	//    2    4:invokevirtual   #79  <Method AssetInfo a.a()>
	//    3    7:invokevirtual   #85  <Method AssetId AssetInfo.getAssetId()>
	//    4   10:putfield        #87  <Field AssetId f>
		b(0x7f0f032d);
	//    5   13:aload_0         
	//    6   14:ldc1            #88  <Int 0x7f0f032d>
	//    7   16:invokevirtual   #91  <Method void b(int)>
		c.setText(((CharSequence) (a)));
	//    8   19:aload_0         
	//    9   20:getfield        #63  <Field CustomTextView c>
	//   10   23:aload_0         
	//   11   24:getfield        #25  <Field String a>
	//   12   27:invokevirtual   #95  <Method void CustomTextView.setText(CharSequence)>
		c.setVisibility(0);
	//   13   30:aload_0         
	//   14   31:getfield        #63  <Field CustomTextView c>
	//   15   34:iconst_0        
	//   16   35:invokevirtual   #98  <Method void CustomTextView.setVisibility(int)>
		c.setEnabled(false);
	//   17   38:aload_0         
	//   18   39:getfield        #63  <Field CustomTextView c>
	//   19   42:iconst_0        
	//   20   43:invokevirtual   #68  <Method void CustomTextView.setEnabled(boolean)>
		d = com.irobot.home.e.a();
	//   21   46:aload_0         
	//   22   47:invokestatic    #101 <Method e com.irobot.home.e.a()>
	//   23   50:putfield        #31  <Field e d>
		FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
	//   24   53:aload_0         
	//   25   54:invokevirtual   #105 <Method FragmentManager getSupportFragmentManager()>
	//   26   57:invokevirtual   #111 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   27   60:astore_1        
		fragmenttransaction.replace(0x7f090278, ((android.support.v4.app.Fragment) (d)));
	//   28   61:aload_1         
	//   29   62:ldc1            #112 <Int 0x7f090278>
	//   30   64:aload_0         
	//   31   65:getfield        #31  <Field e d>
	//   32   68:invokevirtual   #118 <Method FragmentTransaction FragmentTransaction.replace(int, android.support.v4.app.Fragment)>
	//   33   71:pop             
		fragmenttransaction.commit();
	//   34   72:aload_1         
	//   35   73:invokevirtual   #122 <Method int FragmentTransaction.commit()>
	//   36   76:pop             
		getFragmentManager().executePendingTransactions();
	//   37   77:aload_0         
	//   38   78:invokevirtual   #126 <Method android.app.FragmentManager getFragmentManager()>
	//   39   81:invokevirtual   #132 <Method boolean android.app.FragmentManager.executePendingTransactions()>
	//   40   84:pop             
	//   41   85:return          
	}

	public void f()
	{
		if(!Assembler.getInstance().getPersistenceHandler().readBool("mapCustomizationEditHintsSeen", false))
	//*   0    0:invokestatic    #138 <Method Assembler Assembler.getInstance()>
	//*   1    3:invokevirtual   #142 <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//*   2    6:ldc1            #144 <String "mapCustomizationEditHintsSeen">
	//*   3    8:iconst_0        
	//*   4    9:invokevirtual   #150 <Method boolean PersistenceHandler.readBool(String, boolean)>
	//*   5   12:ifne            108
		{
			ArrayList arraylist = new ArrayList();
	//    6   15:new             #152 <Class ArrayList>
	//    7   18:dup             
	//    8   19:invokespecial   #153 <Method void ArrayList()>
	//    9   22:astore_1        
			arraylist.add(((Object) (getString(0x7f0f063b, new Object[] {
				j.a(f.getId()).a().getName()
			}))));
	//   10   23:aload_1         
	//   11   24:aload_0         
	//   12   25:ldc1            #154 <Int 0x7f0f063b>
	//   13   27:iconst_1        
	//   14   28:anewarray       Object[]
	//   15   31:dup             
	//   16   32:iconst_0        
	//   17   33:aload_0         
	//   18   34:getfield        #87  <Field AssetId f>
	//   19   37:invokevirtual   #161 <Method String AssetId.getId()>
	//   20   40:invokestatic    #164 <Method a j.a(String)>
	//   21   43:invokevirtual   #79  <Method AssetInfo a.a()>
	//   22   46:invokevirtual   #167 <Method String AssetInfo.getName()>
	//   23   49:aastore         
	//   24   50:invokevirtual   #171 <Method String getString(int, Object[])>
	//   25   53:invokevirtual   #175 <Method boolean ArrayList.add(Object)>
	//   26   56:pop             
			com.irobot.home.MapCustomizationEditInfoActivity_.a(((android.content.Context) (this))).a(f.getId()).b(0x7f0f063c).c(0x7f0e01f7).b(true).a(false).a(arraylist).d(0x7f0f0687).c(true).a(1);
	//   27   57:aload_0         
	//   28   58:invokestatic    #180 <Method MapCustomizationEditInfoActivity_$a com.irobot.home.MapCustomizationEditInfoActivity_.a(android.content.Context)>
	//   29   61:aload_0         
	//   30   62:getfield        #87  <Field AssetId f>
	//   31   65:invokevirtual   #161 <Method String AssetId.getId()>
	//   32   68:invokevirtual   #185 <Method MapCustomizationEditInfoActivity_$a com.irobot.home.MapCustomizationEditInfoActivity_$a.a(String)>
	//   33   71:ldc1            #186 <Int 0x7f0f063c>
	//   34   73:invokevirtual   #189 <Method MapCustomizationEditInfoActivity_$a MapCustomizationEditInfoActivity_$a.b(int)>
	//   35   76:ldc1            #190 <Int 0x7f0e01f7>
	//   36   78:invokevirtual   #192 <Method MapCustomizationEditInfoActivity_$a MapCustomizationEditInfoActivity_$a.c(int)>
	//   37   81:iconst_1        
	//   38   82:invokevirtual   #195 <Method MapCustomizationEditInfoActivity_$a MapCustomizationEditInfoActivity_$a.b(boolean)>
	//   39   85:iconst_0        
	//   40   86:invokevirtual   #197 <Method MapCustomizationEditInfoActivity_$a com.irobot.home.MapCustomizationEditInfoActivity_$a.a(boolean)>
	//   41   89:aload_1         
	//   42   90:invokevirtual   #200 <Method MapCustomizationEditInfoActivity_$a com.irobot.home.MapCustomizationEditInfoActivity_$a.a(ArrayList)>
	//   43   93:ldc1            #201 <Int 0x7f0f0687>
	//   44   95:invokevirtual   #203 <Method MapCustomizationEditInfoActivity_$a MapCustomizationEditInfoActivity_$a.d(int)>
	//   45   98:iconst_1        
	//   46   99:invokevirtual   #205 <Method MapCustomizationEditInfoActivity_$a MapCustomizationEditInfoActivity_$a.c(boolean)>
	//   47  102:iconst_1        
	//   48  103:invokevirtual   #208 <Method org.androidannotations.api.a.e com.irobot.home.MapCustomizationEditInfoActivity_$a.a(int)>
	//   49  106:pop             
			return;
	//   50  107:return          
		} else
		{
			g();
	//   51  108:aload_0         
	//   52  109:invokespecial   #210 <Method void g()>
			return;
	//   53  112:return          
		}
	}

	protected void onActivityResult(int i, int k, Intent intent)
	{
		if(i == 1 && k == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          14
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          14
			g();
	//    6   10:aload_0         
	//    7   11:invokespecial   #210 <Method void g()>
	//    8   14:return          
	}

	public void onBackPressed()
	{
		Intent intent = new Intent();
	//    0    0:new             #38  <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void Intent()>
	//    3    7:astore_1        
		intent.putExtra("isRenamingMap", b);
	//    4    8:aload_1         
	//    5    9:ldc1            #47  <String "isRenamingMap">
	//    6   11:aload_0         
	//    7   12:getfield        #27  <Field boolean b>
	//    8   15:invokevirtual   #50  <Method Intent Intent.putExtra(String, boolean)>
	//    9   18:pop             
		setResult(0, intent);
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:aload_1         
	//   13   22:invokevirtual   #54  <Method void setResult(int, Intent)>
		w();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #57  <Method void w()>
		finish();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #60  <Method void finish()>
		super.onBackPressed();
	//   18   33:aload_0         
	//   19   34:invokespecial   #215 <Method void BaseFragmentActivity.onBackPressed()>
	//   20   37:return          
	}

	String a;
	boolean b;
	protected CustomTextView c;
	private e d;
	private String e;
	private AssetId f;
}
