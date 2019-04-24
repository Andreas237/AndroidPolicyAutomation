// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetNetworkUIService;
import com.irobot.core.AssetNetworkUIServiceData;
import com.irobot.core.AssetNetworkUIServiceDataCallback;
import com.irobot.core.AssetNetworkUIServiceViewState;
import com.irobot.core.AssetStatusSubsystem;
import com.irobot.core.AssetStatusType;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import com.irobot.core.CurrentConnectionState;
import com.irobot.core.CurrentConnectionStateEvent;
import com.irobot.core.EventType;
import com.irobot.core.FirmwareUpdateItem;
import com.irobot.core.MissionSubsystem;
import com.irobot.core.ResolvedMissionStatusEvent;
import com.irobot.core.RobotBatteryLevelEvent;
import com.irobot.core.RobotPadCategory;
import com.irobot.core.RobotPadCategoryEvent;
import com.irobot.core.UpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.home.fragments.ac;
import com.irobot.home.fragments.ad;
import com.irobot.home.fragments.ag;
import com.irobot.home.fragments.ah;
import com.irobot.home.fragments.k;
import com.irobot.home.fragments.l;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.a;
import com.irobot.home.model.c;
import com.irobot.home.q.b;
import com.irobot.home.util.BluetoothStateReceiver;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseCleanActivity, IRobotApplication, RobotCleanActivity_

public class BraavaCleanActivity extends BaseCleanActivity
	implements com.irobot.home.fragments.ag.a, com.irobot.home.fragments.k.b, com.irobot.home.fragments.k.d, com.irobot.home.util.BluetoothStateReceiver.a
{

	public BraavaCleanActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void BaseCleanActivity()>
		x = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #48  <Field CurrentConnectionState x>
	//    5    9:aload_0         
	//    6   10:new             #20  <Class BraavaCleanActivity$4>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #51  <Method void BraavaCleanActivity$4(BraavaCleanActivity)>
	//   10   18:putfield        #53  <Field AssetNetworkUIServiceDataCallback C>
	//   11   21:return          
	}

	private void K()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f0814).setMessage(0x7f0f0145).setNegativeButton(0x7f0f04d3, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				com.irobot.home.BraavaCleanActivity.c(a).c(false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BraavaCleanActivity a>
			//    2    4:invokestatic    #26  <Method k com.irobot.home.BraavaCleanActivity.c(BraavaCleanActivity)>
			//    3    7:iconst_0        
			//    4    8:invokevirtual   #31  <Method void k.c(boolean)>
				com.irobot.home.BraavaCleanActivity.c(a).f(true);
			//    5   11:aload_0         
			//    6   12:getfield        #17  <Field BraavaCleanActivity a>
			//    7   15:invokestatic    #26  <Method k com.irobot.home.BraavaCleanActivity.c(BraavaCleanActivity)>
			//    8   18:iconst_1        
			//    9   19:invokevirtual   #34  <Method void k.f(boolean)>
				BraavaCleanActivity.d(a);
			//   10   22:aload_0         
			//   11   23:getfield        #17  <Field BraavaCleanActivity a>
			//   12   26:invokestatic    #37  <Method void BraavaCleanActivity.d(BraavaCleanActivity)>
			//   13   29:return          
			}

			final BraavaCleanActivity a;

			
			{
				a = BraavaCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				if(com.irobot.home.BraavaCleanActivity.a(a).enable())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field BraavaCleanActivity a>
			//*   2    4:invokestatic    #25  <Method BluetoothAdapter com.irobot.home.BraavaCleanActivity.a(BraavaCleanActivity)>
			//*   3    7:invokevirtual   #31  <Method boolean BluetoothAdapter.enable()>
			//*   4   10:ifeq            56
				{
					com.irobot.home.BraavaCleanActivity.a(a, new BluetoothStateReceiver(((com.irobot.home.util.BluetoothStateReceiver.a) (a))));
			//    5   13:aload_0         
			//    6   14:getfield        #17  <Field BraavaCleanActivity a>
			//    7   17:new             #33  <Class BluetoothStateReceiver>
			//    8   20:dup             
			//    9   21:aload_0         
			//   10   22:getfield        #17  <Field BraavaCleanActivity a>
			//   11   25:invokespecial   #36  <Method void BluetoothStateReceiver(com.irobot.home.util.BluetoothStateReceiver$a)>
			//   12   28:invokestatic    #39  <Method BluetoothStateReceiver com.irobot.home.BraavaCleanActivity.a(BraavaCleanActivity, BluetoothStateReceiver)>
			//   13   31:pop             
					a.registerReceiver(((android.content.BroadcastReceiver) (com.irobot.home.BraavaCleanActivity.b(a))), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
			//   14   32:aload_0         
			//   15   33:getfield        #17  <Field BraavaCleanActivity a>
			//   16   36:aload_0         
			//   17   37:getfield        #17  <Field BraavaCleanActivity a>
			//   18   40:invokestatic    #43  <Method BluetoothStateReceiver com.irobot.home.BraavaCleanActivity.b(BraavaCleanActivity)>
			//   19   43:new             #45  <Class IntentFilter>
			//   20   46:dup             
			//   21   47:ldc1            #47  <String "android.bluetooth.adapter.action.STATE_CHANGED">
			//   22   49:invokespecial   #50  <Method void IntentFilter(String)>
			//   23   52:invokevirtual   #54  <Method Intent BraavaCleanActivity.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
			//   24   55:pop             
				}
			//   25   56:return          
			}

			final BraavaCleanActivity a;

			
			{
				a = BraavaCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).show();
	//    0    0:new             #57  <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #60  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc1            #61  <Int 0x7f0f0814>
	//    5   10:invokevirtual   #65  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   13:ldc1            #66  <Int 0x7f0f0145>
	//    7   15:invokevirtual   #69  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   18:ldc1            #70  <Int 0x7f0f04d3>
	//    9   20:new             #16  <Class BraavaCleanActivity$2>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:invokespecial   #71  <Method void BraavaCleanActivity$2(BraavaCleanActivity)>
	//   13   28:invokevirtual   #75  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   14   31:ldc1            #76  <Int 0x7f0f0986>
	//   15   33:new             #14  <Class BraavaCleanActivity$1>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #77  <Method void BraavaCleanActivity$1(BraavaCleanActivity)>
	//   19   41:invokevirtual   #80  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   20   44:invokevirtual   #84  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   21   47:pop             
	//   22   48:return          
	}

	private void L()
	{
		FragmentManager fragmentmanager = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method FragmentManager getFragmentManager()>
	//    2    4:astore_1        
		FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #95  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    5    9:astore_2        
		h = ((ag) (new ah()));
	//    6   10:aload_0         
	//    7   11:new             #97  <Class ah>
	//    8   14:dup             
	//    9   15:invokespecial   #98  <Method void ah()>
	//   10   18:putfield        #102 <Field ag h>
		fragmenttransaction.add(0x7f090251, ((android.app.Fragment) (h)));
	//   11   21:aload_2         
	//   12   22:ldc1            #103 <Int 0x7f090251>
	//   13   24:aload_0         
	//   14   25:getfield        #102 <Field ag h>
	//   15   28:invokevirtual   #109 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   16   31:pop             
		h.a(((com.irobot.home.fragments.ag.a) (this)));
	//   17   32:aload_0         
	//   18   33:getfield        #102 <Field ag h>
	//   19   36:aload_0         
	//   20   37:invokevirtual   #115 <Method void ag.a(com.irobot.home.fragments.ag$a)>
		i = ad.g().a(j.j().b().getId()).a();
	//   21   40:aload_0         
	//   22   41:invokestatic    #121 <Method com.irobot.home.fragments.ad$a ad.g()>
	//   23   44:invokestatic    #127 <Method a j.j()>
	//   24   47:invokevirtual   #133 <Method AssetId a.b()>
	//   25   50:invokevirtual   #139 <Method String AssetId.getId()>
	//   26   53:invokevirtual   #144 <Method com.irobot.home.fragments.ad$a com.irobot.home.fragments.ad$a.a(String)>
	//   27   56:invokevirtual   #147 <Method ac com.irobot.home.fragments.ad$a.a()>
	//   28   59:putfield        #151 <Field ac i>
		fragmenttransaction.add(0x7f0901c6, ((android.app.Fragment) (i)));
	//   29   62:aload_2         
	//   30   63:ldc1            #152 <Int 0x7f0901c6>
	//   31   65:aload_0         
	//   32   66:getfield        #151 <Field ac i>
	//   33   69:invokevirtual   #109 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   34   72:pop             
		t = ((k) (new l()));
	//   35   73:aload_0         
	//   36   74:new             #154 <Class l>
	//   37   77:dup             
	//   38   78:invokespecial   #155 <Method void l()>
	//   39   81:putfield        #157 <Field k t>
		t.a(((com.irobot.home.fragments.k.d) (this)));
	//   40   84:aload_0         
	//   41   85:getfield        #157 <Field k t>
	//   42   88:aload_0         
	//   43   89:invokevirtual   #162 <Method void k.a(com.irobot.home.fragments.k$d)>
		fragmenttransaction.add(0x7f0900e4, ((android.app.Fragment) (t)));
	//   44   92:aload_2         
	//   45   93:ldc1            #163 <Int 0x7f0900e4>
	//   46   95:aload_0         
	//   47   96:getfield        #157 <Field k t>
	//   48   99:invokevirtual   #109 <Method FragmentTransaction FragmentTransaction.add(int, android.app.Fragment)>
	//   49  102:pop             
		fragmenttransaction.commit();
	//   50  103:aload_2         
	//   51  104:invokevirtual   #167 <Method int FragmentTransaction.commit()>
	//   52  107:pop             
		fragmentmanager.executePendingTransactions();
	//   53  108:aload_1         
	//   54  109:invokevirtual   #171 <Method boolean FragmentManager.executePendingTransactions()>
	//   55  112:pop             
	//   56  113:return          
	}

	private void M()
	{
		t.a(getString(0x7f0f0228));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field k t>
	//    2    4:aload_0         
	//    3    5:ldc1            #173 <Int 0x7f0f0228>
	//    4    7:invokevirtual   #177 <Method String getString(int)>
	//    5   10:invokevirtual   #180 <Method void k.a(String)>
		t.n();
	//    6   13:aload_0         
	//    7   14:getfield        #157 <Field k t>
	//    8   17:invokevirtual   #183 <Method void k.n()>
		t.b(false);
	//    9   20:aload_0         
	//   10   21:getfield        #157 <Field k t>
	//   11   24:iconst_0        
	//   12   25:invokevirtual   #186 <Method void k.b(boolean)>
		t.c(true);
	//   13   28:aload_0         
	//   14   29:getfield        #157 <Field k t>
	//   15   32:iconst_1        
	//   16   33:invokevirtual   #189 <Method void k.c(boolean)>
		t.g(false);
	//   17   36:aload_0         
	//   18   37:getfield        #157 <Field k t>
	//   19   40:iconst_0        
	//   20   41:invokevirtual   #191 <Method void k.g(boolean)>
	//   21   44:return          
	}

	private void N()
	{
		t.a(getString(0x7f0f088c));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field k t>
	//    2    4:aload_0         
	//    3    5:ldc1            #193 <Int 0x7f0f088c>
	//    4    7:invokevirtual   #177 <Method String getString(int)>
	//    5   10:invokevirtual   #180 <Method void k.a(String)>
		t.c(false);
	//    6   13:aload_0         
	//    7   14:getfield        #157 <Field k t>
	//    8   17:iconst_0        
	//    9   18:invokevirtual   #189 <Method void k.c(boolean)>
		t.a(c.UNKNOWN);
	//   10   21:aload_0         
	//   11   22:getfield        #157 <Field k t>
	//   12   25:getstatic       #199 <Field c c.UNKNOWN>
	//   13   28:invokevirtual   #202 <Method void k.a(c)>
		t.a(RobotPadCategory.NoPad);
	//   14   31:aload_0         
	//   15   32:getfield        #157 <Field k t>
	//   16   35:getstatic       #208 <Field RobotPadCategory RobotPadCategory.NoPad>
	//   17   38:invokevirtual   #211 <Method void k.a(RobotPadCategory)>
		t.g(false);
	//   18   41:aload_0         
	//   19   42:getfield        #157 <Field k t>
	//   20   45:iconst_0        
	//   21   46:invokevirtual   #191 <Method void k.g(boolean)>
		if(w)
	//*  22   49:aload_0         
	//*  23   50:getfield        #213 <Field boolean w>
	//*  24   53:ifeq            64
		{
			t.p();
	//   25   56:aload_0         
	//   26   57:getfield        #157 <Field k t>
	//   27   60:invokevirtual   #216 <Method void k.p()>
			return;
	//   28   63:return          
		} else
		{
			t.b(false);
	//   29   64:aload_0         
	//   30   65:getfield        #157 <Field k t>
	//   31   68:iconst_0        
	//   32   69:invokevirtual   #186 <Method void k.b(boolean)>
			t.d(true);
	//   33   72:aload_0         
	//   34   73:getfield        #157 <Field k t>
	//   35   76:iconst_1        
	//   36   77:invokevirtual   #219 <Method void k.d(boolean)>
			E();
	//   37   80:aload_0         
	//   38   81:invokevirtual   #222 <Method void E()>
			return;
	//   39   84:return          
		}
	}

	private void O()
	{
		AssetId assetid = j.j().b();
	//    0    0:invokestatic    #127 <Method a j.j()>
	//    1    3:invokevirtual   #133 <Method AssetId a.b()>
	//    2    6:astore_1        
		r.d(assetid.getId());
	//    3    7:aload_0         
	//    4    8:getfield        #227 <Field b r>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #139 <Method String AssetId.getId()>
	//    7   15:invokevirtual   #231 <Method void b.d(String)>
	//    8   18:return          
	}

	private void P()
	{
		if(u != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #234 <Field String u>
	//*   2    4:ifnull          195
		{
			if(v == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #236 <Field AssetInfo v>
	//*   5   11:ifnonnull       15
				return;
	//    6   14:return          
			AssetId assetid = j.k();
	//    7   15:invokestatic    #239 <Method AssetId j.k()>
	//    8   18:astore_1        
			if(assetid != null && assetid.getId().compareTo(u) == 0)
	//*   9   19:aload_1         
	//*  10   20:ifnull          80
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #139 <Method String AssetId.getId()>
	//*  13   27:aload_0         
	//*  14   28:getfield        #234 <Field String u>
	//*  15   31:invokevirtual   #245 <Method int String.compareTo(String)>
	//*  16   34:ifne            80
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #247 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #248 <Method void StringBuilder()>
	//   20   44:astore_1        
				stringbuilder.append("Ignoring request to connect ");
	//   21   45:aload_1         
	//   22   46:ldc1            #250 <String "Ignoring request to connect ">
	//   23   48:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
				stringbuilder.append(u);
	//   25   52:aload_1         
	//   26   53:aload_0         
	//   27   54:getfield        #234 <Field String u>
	//   28   57:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
				stringbuilder.append(" is already the current robot.");
	//   30   61:aload_1         
	//   31   62:ldc2            #256 <String " is already the current robot.">
	//   32   65:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
				o.c("BraavaCleanActivity", stringbuilder.toString());
	//   34   69:ldc2            #258 <String "BraavaCleanActivity">
	//   35   72:aload_1         
	//   36   73:invokevirtual   #261 <Method String StringBuilder.toString()>
	//   37   76:invokestatic    #266 <Method void o.c(String, String)>
				return;
	//   38   79:return          
			}
			if(AssetCapabilityUtils.isCloudCapable(v))
	//*  39   80:aload_0         
	//*  40   81:getfield        #236 <Field AssetInfo v>
	//*  41   84:invokestatic    #272 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  42   87:ifeq            136
			{
				a.h().a(u);
	//   43   90:aload_0         
	//   44   91:getfield        #275 <Field IRobotApplication a>
	//   45   94:invokevirtual   #280 <Method IRobotModel IRobotApplication.h()>
	//   46   97:aload_0         
	//   47   98:getfield        #234 <Field String u>
	//   48  101:invokevirtual   #283 <Method void IRobotModel.a(String)>
				a.a(j.j());
	//   49  104:aload_0         
	//   50  105:getfield        #275 <Field IRobotApplication a>
	//   51  108:invokestatic    #127 <Method a j.j()>
	//   52  111:invokevirtual   #286 <Method void com.irobot.home.IRobotApplication.a(a)>
				startActivity(new Intent(((android.content.Context) (this)), com/irobot/home/RobotCleanActivity_));
	//   53  114:aload_0         
	//   54  115:new             #288 <Class Intent>
	//   55  118:dup             
	//   56  119:aload_0         
	//   57  120:ldc2            #290 <Class RobotCleanActivity_>
	//   58  123:invokespecial   #293 <Method void Intent(android.content.Context, Class)>
	//   59  126:invokevirtual   #297 <Method void startActivity(Intent)>
				finish();
	//   60  129:aload_0         
	//   61  130:invokevirtual   #300 <Method void finish()>
			} else
	//*  62  133:goto            185
			if(AssetCapabilityUtils.isNonCloudCapableMoppingRobot(v))
	//*  63  136:aload_0         
	//*  64  137:getfield        #236 <Field AssetInfo v>
	//*  65  140:invokestatic    #303 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*  66  143:ifeq            185
			{
				a.h().a(u);
	//   67  146:aload_0         
	//   68  147:getfield        #275 <Field IRobotApplication a>
	//   69  150:invokevirtual   #280 <Method IRobotModel IRobotApplication.h()>
	//   70  153:aload_0         
	//   71  154:getfield        #234 <Field String u>
	//   72  157:invokevirtual   #283 <Method void IRobotModel.a(String)>
				a.a(j.j());
	//   73  160:aload_0         
	//   74  161:getfield        #275 <Field IRobotApplication a>
	//   75  164:invokestatic    #127 <Method a j.j()>
	//   76  167:invokevirtual   #286 <Method void com.irobot.home.IRobotApplication.a(a)>
				z();
	//   77  170:aload_0         
	//   78  171:invokevirtual   #305 <Method void z()>
				r.c(u);
	//   79  174:aload_0         
	//   80  175:getfield        #227 <Field b r>
	//   81  178:aload_0         
	//   82  179:getfield        #234 <Field String u>
	//   83  182:invokevirtual   #307 <Method void b.c(String)>
			}
			u = null;
	//   84  185:aload_0         
	//   85  186:aconst_null     
	//   86  187:putfield        #234 <Field String u>
			v = null;
	//   87  190:aload_0         
	//   88  191:aconst_null     
	//   89  192:putfield        #236 <Field AssetInfo v>
		}
	//   90  195:return          
	}

	static BluetoothAdapter a(BraavaCleanActivity braavacleanactivity)
	{
		return braavacleanactivity.A;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field BluetoothAdapter A>
	//    2    4:areturn         
	}

	static BluetoothStateReceiver a(BraavaCleanActivity braavacleanactivity, BluetoothStateReceiver bluetoothstatereceiver)
	{
		braavacleanactivity.z = bluetoothstatereceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #313 <Field BluetoothStateReceiver z>
		return bluetoothstatereceiver;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(AssetId assetid)
	{
		t.a(getString(0x7f0f0225));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field k t>
	//    2    4:aload_0         
	//    3    5:ldc2            #315 <Int 0x7f0f0225>
	//    4    8:invokevirtual   #177 <Method String getString(int)>
	//    5   11:invokevirtual   #180 <Method void k.a(String)>
		t.a(c.UNKNOWN);
	//    6   14:aload_0         
	//    7   15:getfield        #157 <Field k t>
	//    8   18:getstatic       #199 <Field c c.UNKNOWN>
	//    9   21:invokevirtual   #202 <Method void k.a(c)>
		t.g(true);
	//   10   24:aload_0         
	//   11   25:getfield        #157 <Field k t>
	//   12   28:iconst_1        
	//   13   29:invokevirtual   #191 <Method void k.g(boolean)>
		t.f(false);
	//   14   32:aload_0         
	//   15   33:getfield        #157 <Field k t>
	//   16   36:iconst_0        
	//   17   37:invokevirtual   #318 <Method void k.f(boolean)>
		t.o();
	//   18   40:aload_0         
	//   19   41:getfield        #157 <Field k t>
	//   20   44:invokevirtual   #321 <Method void k.o()>
		C();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #323 <Method void C()>
		F();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #326 <Method void F()>
	//   25   55:return          
	}

	private void a(CurrentConnectionStateEvent currentconnectionstateevent)
	{
		CurrentConnectionState currentconnectionstate = currentconnectionstateevent.currentConnection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #333 <Method CurrentConnectionState CurrentConnectionStateEvent.currentConnection()>
	//    2    4:astore_2        
		static class _cls5
		{

			static final int a[];
			static final int b[];

			static 
			{
				b = new int[AssetNetworkUIServiceViewState.values().length];
			//    0    0:invokestatic    #19  <Method AssetNetworkUIServiceViewState[] AssetNetworkUIServiceViewState.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] b>
				try
				{
					b[AssetNetworkUIServiceViewState.CurrentConnectionState.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] b>
			//    5   12:getstatic       #25  <Field AssetNetworkUIServiceViewState AssetNetworkUIServiceViewState.CurrentConnectionState>
			//    6   15:invokevirtual   #29  <Method int AssetNetworkUIServiceViewState.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:invokestatic    #34  <Method CurrentConnectionState[] CurrentConnectionState.values()>
			//*  10   23:arraylength     
			//*  11   24:newarray        int[]
			//*  12   26:putstatic       #36  <Field int[] a>
			//*  13   29:getstatic       #36  <Field int[] a>
			//*  14   32:getstatic       #40  <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
			//*  15   35:invokevirtual   #41  <Method int CurrentConnectionState.ordinal()>
			//*  16   38:iconst_1        
			//*  17   39:iastore         
			//*  18   40:getstatic       #36  <Field int[] a>
			//*  19   43:getstatic       #44  <Field CurrentConnectionState CurrentConnectionState.Connecting>
			//*  20   46:invokevirtual   #41  <Method int CurrentConnectionState.ordinal()>
			//*  21   49:iconst_2        
			//*  22   50:iastore         
			//*  23   51:getstatic       #36  <Field int[] a>
			//*  24   54:getstatic       #47  <Field CurrentConnectionState CurrentConnectionState.Error>
			//*  25   57:invokevirtual   #41  <Method int CurrentConnectionState.ordinal()>
			//*  26   60:iconst_3        
			//*  27   61:iastore         
			//*  28   62:getstatic       #36  <Field int[] a>
			//*  29   65:getstatic       #50  <Field CurrentConnectionState CurrentConnectionState.Disconnected>
			//*  30   68:invokevirtual   #41  <Method int CurrentConnectionState.ordinal()>
			//*  31   71:iconst_4        
			//*  32   72:iastore         
			//*  33   73:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   34   74:astore_0        
				a = new int[CurrentConnectionState.values().length];
				try
				{
					a[CurrentConnectionState.ConnectedLocally.ordinal()] = 1;
				}
			//*  35   75:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   36   78:astore_0        
				try
				{
					a[CurrentConnectionState.Connecting.ordinal()] = 2;
				}
			//*  37   79:goto            40
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   38   82:astore_0        
				try
				{
					a[CurrentConnectionState.Error.ordinal()] = 3;
				}
			//*  39   83:goto            51
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   40   86:astore_0        
				try
				{
					a[CurrentConnectionState.Disconnected.ordinal()] = 4;
				}
			//*  41   87:goto            62
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   42   90:astore_0        
			//*  43   91:return          
			}
		}

		switch(com.irobot.home._cls5.a[currentconnectionstate.ordinal()])
	//*   3    5:getstatic       #336 <Field int[] com.irobot.home.BraavaCleanActivity$5.a>
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #341 <Method int CurrentConnectionState.ordinal()>
	//*   6   12:iaload          
		{
	//*   7   13:tableswitch     1 3: default 40
	//	               1 69
	//	               2 62
	//	               3 43
	//*   8   40:goto            80
	//*   9   43:aload_0         
	//*  10   44:getfield        #157 <Field k t>
	//*  11   47:iconst_0        
	//*  12   48:invokevirtual   #189 <Method void k.c(boolean)>
	//*  13   51:aload_0         
	//*  14   52:getfield        #157 <Field k t>
	//*  15   55:iconst_1        
	//*  16   56:invokevirtual   #318 <Method void k.f(boolean)>
	//*  17   59:goto            80
		case 2: // '\002'
			M();
	//   18   62:aload_0         
	//   19   63:invokespecial   #343 <Method void M()>
			break;
	//   20   66:goto            134

		case 1: // '\001'
			a(currentconnectionstateevent.assetId());
	//   21   69:aload_0         
	//   22   70:aload_1         
	//   23   71:invokevirtual   #346 <Method AssetId CurrentConnectionStateEvent.assetId()>
	//   24   74:invokespecial   #348 <Method void a(AssetId)>
			break;
	//   25   77:goto            134

		case 3: // '\003'
			t.c(false);
			t.f(true);
			// fall through

		default:
			if(currentconnectionstate != x)
	//*  26   80:aload_2         
	//*  27   81:aload_0         
	//*  28   82:getfield        #48  <Field CurrentConnectionState x>
	//*  29   85:if_acmpeq       92
				N();
	//   30   88:aload_0         
	//   31   89:invokespecial   #350 <Method void N()>
			currentconnectionstateevent = ((CurrentConnectionStateEvent) (j.k()));
	//   32   92:invokestatic    #239 <Method AssetId j.k()>
	//   33   95:astore_1        
			if(currentconnectionstateevent == null || u != null && !u.equals(((Object) (((AssetId) (currentconnectionstateevent)).getId()))))
	//*  34   96:aload_1         
	//*  35   97:ifnull          121
	//*  36  100:aload_0         
	//*  37  101:getfield        #234 <Field String u>
	//*  38  104:ifnull          134
	//*  39  107:aload_0         
	//*  40  108:getfield        #234 <Field String u>
	//*  41  111:aload_1         
	//*  42  112:invokevirtual   #139 <Method String AssetId.getId()>
	//*  43  115:invokevirtual   #354 <Method boolean String.equals(Object)>
	//*  44  118:ifne            134
				((com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus()).a(((Object) (this)));
	//   45  121:invokestatic    #360 <Method Assembler Assembler.getInstance()>
	//   46  124:invokevirtual   #364 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   47  127:checkcast       #366 <Class com.irobot.home.i.a>
	//   48  130:aload_0         
	//   49  131:invokevirtual   #369 <Method void com.irobot.home.i.a.a(Object)>
			break;
		}
		x = currentconnectionstate;
	//   50  134:aload_0         
	//   51  135:aload_2         
	//   52  136:putfield        #48  <Field CurrentConnectionState x>
	//   53  139:return          
	}

	static void a(BraavaCleanActivity braavacleanactivity, CurrentConnectionStateEvent currentconnectionstateevent)
	{
		braavacleanactivity.a(currentconnectionstateevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #372 <Method void a(CurrentConnectionStateEvent)>
	//    3    5:return          
	}

	static BluetoothStateReceiver b(BraavaCleanActivity braavacleanactivity)
	{
		return braavacleanactivity.z;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field BluetoothStateReceiver z>
	//    2    4:areturn         
	}

	static k c(BraavaCleanActivity braavacleanactivity)
	{
		return braavacleanactivity.t;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field k t>
	//    2    4:areturn         
	}

	static void d(BraavaCleanActivity braavacleanactivity)
	{
		braavacleanactivity.N();
	//    0    0:aload_0         
	//    1    1:invokespecial   #350 <Method void N()>
	//    2    4:return          
	}

	protected void A()
	{
		AssetId assetid = j.j().b();
	//    0    0:invokestatic    #127 <Method a j.j()>
	//    1    3:invokevirtual   #133 <Method AssetId a.b()>
	//    2    6:astore_1        
		if(y == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #376 <Field com.irobot.home.i.a y>
	//*   5   11:ifnonnull       24
		{
			o.e("BraavaCleanActivity", "subscribeToEvents: EventBusHandler is null");
	//    6   14:ldc2            #258 <String "BraavaCleanActivity">
	//    7   17:ldc2            #378 <String "subscribeToEvents: EventBusHandler is null">
	//    8   20:invokestatic    #381 <Method void o.e(String, String)>
			return;
	//    9   23:return          
		} else
		{
			y.a(((Object) (this)), EventType.RobotBatteryLevelEvent);
	//   10   24:aload_0         
	//   11   25:getfield        #376 <Field com.irobot.home.i.a y>
	//   12   28:aload_0         
	//   13   29:getstatic       #387 <Field EventType EventType.RobotBatteryLevelEvent>
	//   14   32:invokevirtual   #390 <Method void com.irobot.home.i.a.a(Object, EventType)>
			y.a(((Object) (this)), EventType.ResolvedMissionStatusEvent);
	//   15   35:aload_0         
	//   16   36:getfield        #376 <Field com.irobot.home.i.a y>
	//   17   39:aload_0         
	//   18   40:getstatic       #393 <Field EventType EventType.ResolvedMissionStatusEvent>
	//   19   43:invokevirtual   #390 <Method void com.irobot.home.i.a.a(Object, EventType)>
			y.a(((Object) (this)), EventType.RobotPadCategoryEvent);
	//   20   46:aload_0         
	//   21   47:getfield        #376 <Field com.irobot.home.i.a y>
	//   22   50:aload_0         
	//   23   51:getstatic       #396 <Field EventType EventType.RobotPadCategoryEvent>
	//   24   54:invokevirtual   #390 <Method void com.irobot.home.i.a.a(Object, EventType)>
			y.a(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//   25   57:aload_0         
	//   26   58:getfield        #376 <Field com.irobot.home.i.a y>
	//   27   61:aload_0         
	//   28   62:getstatic       #399 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//   29   65:invokevirtual   #390 <Method void com.irobot.home.i.a.a(Object, EventType)>
			B = Assembler.getInstance().getNetworkUIService(assetid);
	//   30   68:aload_0         
	//   31   69:invokestatic    #360 <Method Assembler Assembler.getInstance()>
	//   32   72:aload_1         
	//   33   73:invokevirtual   #403 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   34   76:putfield        #405 <Field AssetNetworkUIService B>
			B.registerUISubscriber(C);
	//   35   79:aload_0         
	//   36   80:getfield        #405 <Field AssetNetworkUIService B>
	//   37   83:aload_0         
	//   38   84:getfield        #53  <Field AssetNetworkUIServiceDataCallback C>
	//   39   87:invokevirtual   #411 <Method boolean AssetNetworkUIService.registerUISubscriber(AssetNetworkUIServiceDataCallback)>
	//   40   90:pop             
			return;
	//   41   91:return          
		}
	}

	protected void B()
	{
		if(y == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #376 <Field com.irobot.home.i.a y>
	//*   2    4:ifnonnull       17
		{
			o.e("BraavaCleanActivity", "unsubscribeToEvents: EventBusHandler is null");
	//    3    7:ldc2            #258 <String "BraavaCleanActivity">
	//    4   10:ldc2            #413 <String "unsubscribeToEvents: EventBusHandler is null">
	//    5   13:invokestatic    #381 <Method void o.e(String, String)>
			return;
	//    6   16:return          
		} else
		{
			y.b(((Object) (this)), EventType.RobotBatteryLevelEvent);
	//    7   17:aload_0         
	//    8   18:getfield        #376 <Field com.irobot.home.i.a y>
	//    9   21:aload_0         
	//   10   22:getstatic       #387 <Field EventType EventType.RobotBatteryLevelEvent>
	//   11   25:invokevirtual   #415 <Method void com.irobot.home.i.a.b(Object, EventType)>
			y.b(((Object) (this)), EventType.ResolvedMissionStatusEvent);
	//   12   28:aload_0         
	//   13   29:getfield        #376 <Field com.irobot.home.i.a y>
	//   14   32:aload_0         
	//   15   33:getstatic       #393 <Field EventType EventType.ResolvedMissionStatusEvent>
	//   16   36:invokevirtual   #415 <Method void com.irobot.home.i.a.b(Object, EventType)>
			y.b(((Object) (this)), EventType.RobotPadCategoryEvent);
	//   17   39:aload_0         
	//   18   40:getfield        #376 <Field com.irobot.home.i.a y>
	//   19   43:aload_0         
	//   20   44:getstatic       #396 <Field EventType EventType.RobotPadCategoryEvent>
	//   21   47:invokevirtual   #415 <Method void com.irobot.home.i.a.b(Object, EventType)>
			y.b(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//   22   50:aload_0         
	//   23   51:getfield        #376 <Field com.irobot.home.i.a y>
	//   24   54:aload_0         
	//   25   55:getstatic       #399 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//   26   58:invokevirtual   #415 <Method void com.irobot.home.i.a.b(Object, EventType)>
			B.unregisterSubscriber(C);
	//   27   61:aload_0         
	//   28   62:getfield        #405 <Field AssetNetworkUIService B>
	//   29   65:aload_0         
	//   30   66:getfield        #53  <Field AssetNetworkUIServiceDataCallback C>
	//   31   69:invokevirtual   #418 <Method boolean AssetNetworkUIService.unregisterSubscriber(AssetNetworkUIServiceDataCallback)>
	//   32   72:pop             
			return;
	//   33   73:return          
		}
	}

	protected void C()
	{
		AssetId assetid = j.k();
	//    0    0:invokestatic    #239 <Method AssetId j.k()>
	//    1    3:astore_1        
		if(assetid == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			o.e("BraavaCleanActivity", "queryAssetStatus: AssetId is null");
	//    4    8:ldc2            #258 <String "BraavaCleanActivity">
	//    5   11:ldc2            #420 <String "queryAssetStatus: AssetId is null">
	//    6   14:invokestatic    #381 <Method void o.e(String, String)>
			return;
	//    7   17:return          
		}
		Object obj = ((Object) (Assembler.getInstance()));
	//    8   18:invokestatic    #360 <Method Assembler Assembler.getInstance()>
	//    9   21:astore_2        
		MissionSubsystem missionsubsystem = ((Assembler) (obj)).getMissionSubsystem(assetid);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #424 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//   13   27:astore_3        
		if(missionsubsystem != null)
	//*  14   28:aload_3         
	//*  15   29:ifnull          39
			missionsubsystem.queryResolvedMissionStatus();
	//   16   32:aload_3         
	//   17   33:invokevirtual   #429 <Method void MissionSubsystem.queryResolvedMissionStatus()>
		else
	//*  18   36:goto            48
			o.e("BraavaCleanActivity", "queryAssetStatus: MissionSubsystem is null");
	//   19   39:ldc2            #258 <String "BraavaCleanActivity">
	//   20   42:ldc2            #431 <String "queryAssetStatus: MissionSubsystem is null">
	//   21   45:invokestatic    #381 <Method void o.e(String, String)>
		obj = ((Object) (((Assembler) (obj)).getAssetStatusSubsystem(assetid)));
	//   22   48:aload_2         
	//   23   49:aload_1         
	//   24   50:invokevirtual   #435 <Method AssetStatusSubsystem Assembler.getAssetStatusSubsystem(AssetId)>
	//   25   53:astore_2        
		if(obj != null)
	//*  26   54:aload_2         
	//*  27   55:ifnull          75
		{
			((AssetStatusSubsystem) (obj)).queryAssetStatus(AssetStatusType.BatteryLevel);
	//   28   58:aload_2         
	//   29   59:getstatic       #441 <Field AssetStatusType AssetStatusType.BatteryLevel>
	//   30   62:invokevirtual   #447 <Method void AssetStatusSubsystem.queryAssetStatus(AssetStatusType)>
			((AssetStatusSubsystem) (obj)).queryAssetStatus(AssetStatusType.PadCategory);
	//   31   65:aload_2         
	//   32   66:getstatic       #450 <Field AssetStatusType AssetStatusType.PadCategory>
	//   33   69:invokevirtual   #447 <Method void AssetStatusSubsystem.queryAssetStatus(AssetStatusType)>
		} else
	//*  34   72:goto            84
		{
			o.e("BraavaCleanActivity", "queryAssetStatus: AssetStatusSubsystem is null");
	//   35   75:ldc2            #258 <String "BraavaCleanActivity">
	//   36   78:ldc2            #452 <String "queryAssetStatus: AssetStatusSubsystem is null">
	//   37   81:invokestatic    #381 <Method void o.e(String, String)>
		}
		a(assetid.getId());
	//   38   84:aload_0         
	//   39   85:aload_1         
	//   40   86:invokevirtual   #139 <Method String AssetId.getId()>
	//   41   89:invokevirtual   #453 <Method void a(String)>
	//   42   92:return          
	}

	public void D()
	{
	//    0    0:return          
	}

	public void E()
	{
		P();
	//    0    0:aload_0         
	//    1    1:invokespecial   #456 <Method void P()>
	//    2    4:return          
	}

	public void F()
	{
		o.c("BraavaCleanActivity", "Checking if software is up to date...");
	//    0    0:ldc2            #258 <String "BraavaCleanActivity">
	//    1    3:ldc2            #458 <String "Checking if software is up to date...">
	//    2    6:invokestatic    #266 <Method void o.c(String, String)>
		Object obj = ((Object) (j.k()));
	//    3    9:invokestatic    #239 <Method AssetId j.k()>
	//    4   12:astore_1        
		obj = ((Object) (Assembler.getInstance().getUpdateUIService(((AssetId) (obj)))));
	//    5   13:invokestatic    #360 <Method Assembler Assembler.getInstance()>
	//    6   16:aload_1         
	//    7   17:invokevirtual   #462 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//    8   20:astore_1        
		if(obj != null)
	//*   9   21:aload_1         
	//*  10   22:ifnull          34
		{
			((UpdateUIService) (obj)).querySoftwareVersion();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #467 <Method void UpdateUIService.querySoftwareVersion()>
			((UpdateUIService) (obj)).queryForSoftwareUpdate();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #470 <Method void UpdateUIService.queryForSoftwareUpdate()>
			return;
	//   15   33:return          
		} else
		{
			o.e("BraavaCleanActivity", "checkSoftwareVersion: UpdateUIService is null");
	//   16   34:ldc2            #258 <String "BraavaCleanActivity">
	//   17   37:ldc2            #472 <String "checkSoftwareVersion: UpdateUIService is null">
	//   18   40:invokestatic    #381 <Method void o.e(String, String)>
			return;
	//   19   43:return          
		}
	}

	public boolean G()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field boolean w>
	//    2    4:ireturn         
	}

	public void H()
	{
		M();
	//    0    0:aload_0         
	//    1    1:invokespecial   #343 <Method void M()>
		z();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #305 <Method void z()>
	//    4    8:return          
	}

	public void I()
	{
		A();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #477 <Method void A()>
		AssetId assetid = j.k();
	//    2    4:invokestatic    #239 <Method AssetId j.k()>
	//    3    7:astore_1        
		if(assetid != null && !r.a(assetid.getId()))
	//*   4    8:aload_1         
	//*   5    9:ifnull          65
	//*   6   12:aload_0         
	//*   7   13:getfield        #227 <Field b r>
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #139 <Method String AssetId.getId()>
	//*  10   20:invokevirtual   #480 <Method boolean b.a(String)>
	//*  11   23:ifne            65
		{
			if(A.isEnabled())
	//*  12   26:aload_0         
	//*  13   27:getfield        #310 <Field BluetoothAdapter A>
	//*  14   30:invokevirtual   #485 <Method boolean BluetoothAdapter.isEnabled()>
	//*  15   33:ifeq            58
			{
				u = assetid.getId();
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:invokevirtual   #139 <Method String AssetId.getId()>
	//   19   41:putfield        #234 <Field String u>
				r.c(u);
	//   20   44:aload_0         
	//   21   45:getfield        #227 <Field b r>
	//   22   48:aload_0         
	//   23   49:getfield        #234 <Field String u>
	//   24   52:invokevirtual   #307 <Method void b.c(String)>
			} else
	//*  25   55:goto            69
			{
				K();
	//   26   58:aload_0         
	//   27   59:invokespecial   #487 <Method void K()>
			}
		} else
	//*  28   62:goto            69
		{
			C();
	//   29   65:aload_0         
	//   30   66:invokevirtual   #323 <Method void C()>
		}
		t.m();
	//   31   69:aload_0         
	//   32   70:getfield        #157 <Field k t>
	//   33   73:invokevirtual   #490 <Method void k.m()>
	//   34   76:return          
	}

	public void J()
	{
		B();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #493 <Method void B()>
	//    2    4:return          
	}

	public void c(String s)
	{
		String s1 = j.k().getId();
	//    0    0:invokestatic    #239 <Method AssetId j.k()>
	//    1    3:invokevirtual   #139 <Method String AssetId.getId()>
	//    2    6:astore_2        
		if(!s1.equals(((Object) (s))) && (u == null || !u.equals(((Object) (s)))))
	//*   3    7:aload_2         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #354 <Method boolean String.equals(Object)>
	//*   6   12:ifne            81
	//*   7   15:aload_0         
	//*   8   16:getfield        #234 <Field String u>
	//*   9   19:ifnull          33
	//*  10   22:aload_0         
	//*  11   23:getfield        #234 <Field String u>
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #354 <Method boolean String.equals(Object)>
	//*  14   30:ifne            81
		{
			u = s;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #234 <Field String u>
			v = j.a(s).a();
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokestatic    #496 <Method a j.a(String)>
	//   21   43:invokevirtual   #499 <Method AssetInfo a.a()>
	//   22   46:putfield        #236 <Field AssetInfo v>
			if(r.a(s1) && x != CurrentConnectionState.Error)
	//*  23   49:aload_0         
	//*  24   50:getfield        #227 <Field b r>
	//*  25   53:aload_2         
	//*  26   54:invokevirtual   #480 <Method boolean b.a(String)>
	//*  27   57:ifeq            77
	//*  28   60:aload_0         
	//*  29   61:getfield        #48  <Field CurrentConnectionState x>
	//*  30   64:getstatic       #502 <Field CurrentConnectionState CurrentConnectionState.Error>
	//*  31   67:if_acmpeq       77
				O();
	//   32   70:aload_0         
	//   33   71:invokespecial   #504 <Method void O()>
			else
	//*  34   74:goto            81
				P();
	//   35   77:aload_0         
	//   36   78:invokespecial   #456 <Method void P()>
		}
		o();
	//   37   81:aload_0         
	//   38   82:invokevirtual   #506 <Method boolean o()>
	//   39   85:pop             
	//   40   86:return          
	}

	public void e()
	{
		super.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #508 <Method void BaseCleanActivity.e()>
		A = ((BluetoothManager)getSystemService("bluetooth")).getAdapter();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc2            #510 <String "bluetooth">
	//    5    9:invokevirtual   #514 <Method Object getSystemService(String)>
	//    6   12:checkcast       #516 <Class BluetoothManager>
	//    7   15:invokevirtual   #520 <Method BluetoothAdapter BluetoothManager.getAdapter()>
	//    8   18:putfield        #310 <Field BluetoothAdapter A>
		c.setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view, MotionEvent motionevent)
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			final BraavaCleanActivity a;

			
			{
				a = BraavaCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    9   21:aload_0         
	//   10   22:getfield        #523 <Field View c>
	//   11   25:new             #18  <Class BraavaCleanActivity$3>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokespecial   #524 <Method void BraavaCleanActivity$3(BraavaCleanActivity)>
	//   15   33:invokevirtual   #530 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
	//   16   36:return          
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #247 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #248 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Firmware ");
	//    4    8:aload_2         
	//    5    9:ldc2            #535 <String "Firmware ">
	//    6   12:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(assetupdateavailabilityevent.status().name());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #541 <Method UpdateStatus AssetUpdateAvailabilityEvent.status()>
	//   11   21:invokevirtual   #546 <Method String UpdateStatus.name()>
	//   12   24:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(": current version is ");
	//   14   28:aload_2         
	//   15   29:ldc2            #548 <String ": current version is ">
	//   16   32:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(assetupdateavailabilityevent.currentVersion());
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #551 <Method String AssetUpdateAvailabilityEvent.currentVersion()>
	//   21   41:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		stringbuilder.append(", available version is ");
	//   23   45:aload_2         
	//   24   46:ldc2            #553 <String ", available version is ">
	//   25   49:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
		stringbuilder.append(assetupdateavailabilityevent.updateInfo().getVersion());
	//   27   53:aload_2         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #557 <Method FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//   30   58:invokevirtual   #562 <Method String FirmwareUpdateItem.getVersion()>
	//   31   61:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
		o.c("BraavaCleanActivity", stringbuilder.toString());
	//   33   65:ldc2            #258 <String "BraavaCleanActivity">
	//   34   68:aload_2         
	//   35   69:invokevirtual   #261 <Method String StringBuilder.toString()>
	//   36   72:invokestatic    #266 <Method void o.c(String, String)>
		t.a(assetupdateavailabilityevent);
	//   37   75:aload_0         
	//   38   76:getfield        #157 <Field k t>
	//   39   79:aload_1         
	//   40   80:invokevirtual   #564 <Method void k.a(AssetUpdateAvailabilityEvent)>
	//   41   83:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #569 <Method void BaseCleanActivity.onCreate(Bundle)>
		y = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//    3    5:aload_0         
	//    4    6:invokestatic    #360 <Method Assembler Assembler.getInstance()>
	//    5    9:invokevirtual   #364 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    6   12:checkcast       #366 <Class com.irobot.home.i.a>
	//    7   15:putfield        #376 <Field com.irobot.home.i.a y>
		if(bundle == null)
	//*   8   18:aload_1         
	//*   9   19:ifnonnull       27
		{
			L();
	//   10   22:aload_0         
	//   11   23:invokespecial   #571 <Method void L()>
			return;
	//   12   26:return          
		} else
		{
			h = (ag)getFragmentManager().findFragmentById(0x7f090251);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #89  <Method FragmentManager getFragmentManager()>
	//   16   32:ldc1            #103 <Int 0x7f090251>
	//   17   34:invokevirtual   #575 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//   18   37:checkcast       #111 <Class ag>
	//   19   40:putfield        #102 <Field ag h>
			h.a(a.h());
	//   20   43:aload_0         
	//   21   44:getfield        #102 <Field ag h>
	//   22   47:aload_0         
	//   23   48:getfield        #275 <Field IRobotApplication a>
	//   24   51:invokevirtual   #280 <Method IRobotModel IRobotApplication.h()>
	//   25   54:invokevirtual   #578 <Method void ag.a(IRobotModel)>
			h.a(((com.irobot.home.fragments.ag.a) (this)));
	//   26   57:aload_0         
	//   27   58:getfield        #102 <Field ag h>
	//   28   61:aload_0         
	//   29   62:invokevirtual   #115 <Method void ag.a(com.irobot.home.fragments.ag$a)>
			t = (k)getFragmentManager().findFragmentById(0x7f0900e4);
	//   30   65:aload_0         
	//   31   66:aload_0         
	//   32   67:invokevirtual   #89  <Method FragmentManager getFragmentManager()>
	//   33   70:ldc1            #163 <Int 0x7f0900e4>
	//   34   72:invokevirtual   #575 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//   35   75:checkcast       #159 <Class k>
	//   36   78:putfield        #157 <Field k t>
			i = (ac)getFragmentManager().findFragmentById(0x7f0901c6);
	//   37   81:aload_0         
	//   38   82:aload_0         
	//   39   83:invokevirtual   #89  <Method FragmentManager getFragmentManager()>
	//   40   86:ldc1            #152 <Int 0x7f0901c6>
	//   41   88:invokevirtual   #575 <Method android.app.Fragment FragmentManager.findFragmentById(int)>
	//   42   91:checkcast       #580 <Class ac>
	//   43   94:putfield        #151 <Field ac i>
			return;
	//   44   97:return          
		}
	}

	protected void onDestroy()
	{
		if(y != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #376 <Field com.irobot.home.i.a y>
	//*   2    4:ifnull          15
			y.a(((Object) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #376 <Field com.irobot.home.i.a y>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #369 <Method void com.irobot.home.i.a.a(Object)>
		super.onDestroy();
	//    7   15:aload_0         
	//    8   16:invokespecial   #583 <Method void BaseCleanActivity.onDestroy()>
	//    9   19:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #588 <Method void BaseCleanActivity.onPause()>
		w = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #213 <Field boolean w>
		if(z != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #313 <Field BluetoothStateReceiver z>
	//*   7   13:ifnull          61
			try
			{
				unregisterReceiver(((android.content.BroadcastReceiver) (z)));
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #313 <Field BluetoothStateReceiver z>
	//   11   21:invokevirtual   #592 <Method void unregisterReceiver(android.content.BroadcastReceiver)>
				return;
	//   12   24:return          
			}
			catch(IllegalArgumentException illegalargumentexception)
	//*  13   25:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   14   26:new             #247 <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #248 <Method void StringBuilder()>
	//   17   33:astore_2        
				stringbuilder.append("Failed to unregister receiver: ");
	//   18   34:aload_2         
	//   19   35:ldc2            #594 <String "Failed to unregister receiver: ">
	//   20   38:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
				stringbuilder.append(illegalargumentexception.getMessage());
	//   22   42:aload_2         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #597 <Method String IllegalArgumentException.getMessage()>
	//   25   47:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
				o.e("BraavaCleanActivity", stringbuilder.toString());
	//   27   51:ldc2            #258 <String "BraavaCleanActivity">
	//   28   54:aload_2         
	//   29   55:invokevirtual   #261 <Method String StringBuilder.toString()>
	//   30   58:invokestatic    #381 <Method void o.e(String, String)>
			}
	//   31   61:return          
	}

	public void onResolvedMissionStatusEvent(ResolvedMissionStatusEvent resolvedmissionstatusevent)
	{
		t.a(resolvedmissionstatusevent);
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field k t>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #601 <Method void k.a(ResolvedMissionStatusEvent)>
	//    4    8:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #604 <Method void BaseCleanActivity.onResume()>
		w = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #213 <Field boolean w>
		h.a();
	//    5    9:aload_0         
	//    6   10:getfield        #102 <Field ag h>
	//    7   13:invokevirtual   #606 <Method void ag.a()>
		e.setVisibility(8);
	//    8   16:aload_0         
	//    9   17:getfield        #609 <Field RelativeLayout e>
	//   10   20:bipush          8
	//   11   22:invokevirtual   #615 <Method void RelativeLayout.setVisibility(int)>
		if(c instanceof DrawerLayout)
	//*  12   25:aload_0         
	//*  13   26:getfield        #523 <Field View c>
	//*  14   29:instanceof      #617 <Class DrawerLayout>
	//*  15   32:ifeq            49
			((DrawerLayout)c).a(1, 0x800005);
	//   16   35:aload_0         
	//   17   36:getfield        #523 <Field View c>
	//   18   39:checkcast       #617 <Class DrawerLayout>
	//   19   42:iconst_1        
	//   20   43:ldc2            #618 <Int 0x800005>
	//   21   46:invokevirtual   #621 <Method void DrawerLayout.a(int, int)>
	//   22   49:return          
	}

	public void onRobotBatteryLevelEvent(RobotBatteryLevelEvent robotbatterylevelevent)
	{
		int i;
		if(robotbatterylevelevent.currentBatteryLevel() > 1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #632 <Method short RobotBatteryLevelEvent.currentBatteryLevel()>
	//*   2    4:iconst_1        
	//*   3    5:icmple          21
			i = (robotbatterylevelevent.currentBatteryLevel() - 1) * 25;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #632 <Method short RobotBatteryLevelEvent.currentBatteryLevel()>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:bipush          25
	//    9   16:imul            
	//   10   17:istore_2        
		else
	//*  11   18:goto            23
			i = 0;
	//   12   21:iconst_0        
	//   13   22:istore_2        
		t.a(i, 25F, j);
	//   14   23:aload_0         
	//   15   24:getfield        #157 <Field k t>
	//   16   27:iload_2         
	//   17   28:ldc2            #633 <Float 25F>
	//   18   31:aload_0         
	//   19   32:getfield        #635 <Field String j>
	//   20   35:invokevirtual   #638 <Method void k.a(int, float, String)>
		b(j);
	//   21   38:aload_0         
	//   22   39:aload_0         
	//   23   40:getfield        #635 <Field String j>
	//   24   43:invokevirtual   #640 <Method void b(String)>
	//   25   46:return          
	}

	public void onRobotPadCategoryEvent(RobotPadCategoryEvent robotpadcategoryevent)
	{
		t.a(robotpadcategoryevent.padCategory());
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field k t>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #648 <Method RobotPadCategory RobotPadCategoryEvent.padCategory()>
	//    4    8:invokevirtual   #211 <Method void k.a(RobotPadCategory)>
	//    5   11:return          
	}

	public void x()
	{
		r.c(j.k().getId());
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field b r>
	//    2    4:invokestatic    #239 <Method AssetId j.k()>
	//    3    7:invokevirtual   #139 <Method String AssetId.getId()>
	//    4   10:invokevirtual   #307 <Method void b.c(String)>
	//    5   13:return          
	}

	public void y()
	{
		r.d(u);
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field b r>
	//    2    4:aload_0         
	//    3    5:getfield        #234 <Field String u>
	//    4    8:invokevirtual   #231 <Method void b.d(String)>
	//    5   11:return          
	}

	public void z()
	{
		AssetId assetid = j.j().b();
	//    0    0:invokestatic    #127 <Method a j.j()>
	//    1    3:invokevirtual   #133 <Method AssetId a.b()>
	//    2    6:astore_1        
		if(!Assembler.getInstance().isInitialized(assetid))
	//*   3    7:invokestatic    #360 <Method Assembler Assembler.getInstance()>
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #652 <Method boolean Assembler.isInitialized(AssetId)>
	//*   6   14:ifne            44
		{
			AssetInfo assetinfo = AssetInfo.create(assetid, "", "", "", "", "");
	//    7   17:aload_1         
	//    8   18:ldc2            #654 <String "">
	//    9   21:ldc2            #654 <String "">
	//   10   24:ldc2            #654 <String "">
	//   11   27:ldc2            #654 <String "">
	//   12   30:ldc2            #654 <String "">
	//   13   33:invokestatic    #660 <Method AssetInfo AssetInfo.create(AssetId, String, String, String, String, String)>
	//   14   36:astore_2        
			Assembler.getInstance().initializeAsset(assetinfo);
	//   15   37:invokestatic    #360 <Method Assembler Assembler.getInstance()>
	//   16   40:aload_2         
	//   17   41:invokevirtual   #664 <Method void Assembler.initializeAsset(AssetInfo)>
		}
		a(assetid.getId());
	//   18   44:aload_0         
	//   19   45:aload_1         
	//   20   46:invokevirtual   #139 <Method String AssetId.getId()>
	//   21   49:invokevirtual   #453 <Method void a(String)>
		A();
	//   22   52:aload_0         
	//   23   53:invokevirtual   #477 <Method void A()>
	//   24   56:return          
	}

	private BluetoothAdapter A;
	private AssetNetworkUIService B;
	private final AssetNetworkUIServiceDataCallback C = new AssetNetworkUIServiceDataCallback() {

		public void onAssetNetworkUIServiceDataChanged(AssetNetworkUIServiceData assetnetworkuiservicedata)
		{
			if(assetnetworkuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			Iterator iterator = assetnetworkuiservicedata.getViewStateChangelist().iterator();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #24  <Method ArrayList AssetNetworkUIServiceData.getViewStateChangelist()>
		//    5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
		//    6   12:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
		//    7   13:aload_2         
		//    8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
		//    9   19:ifeq            61
				AssetNetworkUIServiceViewState assetnetworkuiserviceviewstate = (AssetNetworkUIServiceViewState)iterator.next();
		//   10   22:aload_2         
		//   11   23:invokeinterface #40  <Method Object Iterator.next()>
		//   12   28:checkcast       #42  <Class AssetNetworkUIServiceViewState>
		//   13   31:astore_3        
				if(com.irobot.home._cls5.b[assetnetworkuiserviceviewstate.ordinal()] == 1)
		//*  14   32:getstatic       #48  <Field int[] com.irobot.home.BraavaCleanActivity$5.b>
		//*  15   35:aload_3         
		//*  16   36:invokevirtual   #52  <Method int AssetNetworkUIServiceViewState.ordinal()>
		//*  17   39:iaload          
		//*  18   40:iconst_1        
		//*  19   41:icmpeq          47
		//*  20   44:goto            13
					com.irobot.home.BraavaCleanActivity.a(a, assetnetworkuiservicedata.getCurrentConnectionEvent());
		//   21   47:aload_0         
		//   22   48:getfield        #12  <Field BraavaCleanActivity a>
		//   23   51:aload_1         
		//   24   52:invokevirtual   #56  <Method CurrentConnectionStateEvent AssetNetworkUIServiceData.getCurrentConnectionEvent()>
		//   25   55:invokestatic    #59  <Method void com.irobot.home.BraavaCleanActivity.a(BraavaCleanActivity, CurrentConnectionStateEvent)>
			} while(true);
		//   26   58:goto            13
		//   27   61:return          
		}

		final BraavaCleanActivity a;

			
			{
				a = BraavaCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BraavaCleanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetNetworkUIServiceDataCallback()>
			//    5    9:return          
			}
	}
;
	private k t;
	private String u;
	private AssetInfo v;
	private boolean w;
	private CurrentConnectionState x;
	private com.irobot.home.i.a y;
	private BluetoothStateReceiver z;
}
