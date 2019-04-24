// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import com.irobot.core.ConnectionStateEvent;
import com.irobot.core.DiscoveredAsset;
import com.irobot.core.DiscoveryAttributeKey;
import com.irobot.core.DiscoveryType;
import com.irobot.core.EventType;
import com.irobot.core.FirmwareUpdateItem;
import com.irobot.core.NetworkState;
import com.irobot.core.NetworkType;
import com.irobot.core.SettingType;
import com.irobot.core.SettingsSubsystem;
import com.irobot.core.SettingsUIServiceData;
import com.irobot.core.SettingsUIServiceDataCallback;
import com.irobot.core.TypeDiscoveryAttribute;
import com.irobot.core.UpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.home.b.ab;
import com.irobot.home.g.k;
import com.irobot.home.h.b;
import com.irobot.home.h.c;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.RegisterRobotListItem;
import com.irobot.home.model.a;
import com.irobot.home.model.d;
import com.irobot.home.util.AssetSoftwareUpdateUtils;
import com.irobot.home.util.BluetoothStateReceiver;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			BaseListActivity, IRobotApplication, TroubleshootingSetup1Activity_, CustomerRegistrationActivity_, 
//			BraavaCleanActivity_

public class PickABraavaActivity extends BaseListActivity
	implements android.widget.AdapterView.OnItemClickListener, b, com.irobot.home.util.BluetoothStateReceiver.a
{

	public PickABraavaActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void BaseListActivity()>
		h = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #70  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #71  <Method void ArrayList()>
	//    6   12:putfield        #73  <Field List h>
		r = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #75  <Field boolean r>
		s = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #77  <Field AlertDialog s>
	//   13   25:return          
	}

	static BluetoothAdapter a(PickABraavaActivity pickabraavaactivity)
	{
		return pickabraavaactivity.t;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field BluetoothAdapter t>
	//    2    4:areturn         
	}

	static BluetoothStateReceiver a(PickABraavaActivity pickabraavaactivity, BluetoothStateReceiver bluetoothstatereceiver)
	{
		pickabraavaactivity.p = bluetoothstatereceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field BluetoothStateReceiver p>
		return bluetoothstatereceiver;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(DialogFragment dialogfragment, String s1)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #90  <Method boolean isFinishing()>
	//*   2    4:ifne            35
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #93  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #97  <Method FragmentManager getFragmentManager()>
	//    9   19:invokevirtual   #103 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   10   22:astore_3        
			fragmenttransaction.add(((android.app.Fragment) (dialogfragment)), s1);
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #109 <Method FragmentTransaction FragmentTransaction.add(android.app.Fragment, String)>
	//   15   29:pop             
			fragmenttransaction.commitAllowingStateLoss();
	//   16   30:aload_3         
	//   17   31:invokevirtual   #113 <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   18   34:pop             
		}
	//   19   35:return          
	}

	static void a(PickABraavaActivity pickabraavaactivity, a a1)
	{
		pickabraavaactivity.a(a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #117 <Method void a(a)>
	//    3    5:return          
	}

	static void a(PickABraavaActivity pickabraavaactivity, String s1)
	{
		pickabraavaactivity.g(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #121 <Method void g(String)>
	//    3    5:return          
	}

	private void a(a a1)
	{
		c.h().b(a1);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field IRobotApplication c>
	//    2    4:invokevirtual   #128 <Method IRobotModel IRobotApplication.h()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #133 <Method void IRobotModel.b(a)>
		l = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #135 <Field boolean l>
		m = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #137 <Field boolean m>
		f("adding_robot");
	//   11   21:aload_0         
	//   12   22:ldc1            #139 <String "adding_robot">
	//   13   24:invokespecial   #141 <Method void f(String)>
		a(0x7f08009e, getString(0x7f0f0766, new Object[] {
			a1.a().getName()
		}), false, true, new com.irobot.home.g.a.a(a1) {

			public void a()
			{
				Intent intent;
				if(!com.irobot.home.PickABraavaActivity.d(b))
			//*   0    0:aload_0         
			//*   1    1:getfield        #18  <Field PickABraavaActivity b>
			//*   2    4:invokestatic    #28  <Method boolean com.irobot.home.PickABraavaActivity.d(PickABraavaActivity)>
			//*   3    7:ifne            44
				{
					intent = new Intent(((android.content.Context) (b)), com/irobot/home/CustomerRegistrationActivity_);
			//    4   10:new             #30  <Class Intent>
			//    5   13:dup             
			//    6   14:aload_0         
			//    7   15:getfield        #18  <Field PickABraavaActivity b>
			//    8   18:ldc1            #32  <Class CustomerRegistrationActivity_>
			//    9   20:invokespecial   #35  <Method void Intent(android.content.Context, Class)>
			//   10   23:astore_1        
					intent.putExtra("assetId", a.b().getId());
			//   11   24:aload_1         
			//   12   25:ldc1            #37  <String "assetId">
			//   13   27:aload_0         
			//   14   28:getfield        #20  <Field a a>
			//   15   31:invokevirtual   #42  <Method AssetId a.b()>
			//   16   34:invokevirtual   #48  <Method String AssetId.getId()>
			//   17   37:invokevirtual   #52  <Method Intent Intent.putExtra(String, String)>
			//   18   40:pop             
				} else
			//*  19   41:goto            58
				{
					intent = new Intent(((android.content.Context) (b)), com/irobot/home/BraavaCleanActivity_);
			//   20   44:new             #30  <Class Intent>
			//   21   47:dup             
			//   22   48:aload_0         
			//   23   49:getfield        #18  <Field PickABraavaActivity b>
			//   24   52:ldc1            #54  <Class BraavaCleanActivity_>
			//   25   54:invokespecial   #35  <Method void Intent(android.content.Context, Class)>
			//   26   57:astore_1        
				}
				com.irobot.home.util.j.a(((android.app.Activity) (b)), intent);
			//   27   58:aload_0         
			//   28   59:getfield        #18  <Field PickABraavaActivity b>
			//   29   62:aload_1         
			//   30   63:invokestatic    #59  <Method void j.a(android.app.Activity, Intent)>
			//   31   66:return          
			}

			final a a;
			final PickABraavaActivity b;

			
			{
				b = PickABraavaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PickABraavaActivity b>
				a = a1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field a a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, "robot_added");
	//   14   27:aload_0         
	//   15   28:ldc1            #142 <Int 0x7f08009e>
	//   16   30:aload_0         
	//   17   31:ldc1            #143 <Int 0x7f0f0766>
	//   18   33:iconst_1        
	//   19   34:anewarray       Object[]
	//   20   37:dup             
	//   21   38:iconst_0        
	//   22   39:aload_1         
	//   23   40:invokevirtual   #150 <Method AssetInfo a.a()>
	//   24   43:invokevirtual   #156 <Method String AssetInfo.getName()>
	//   25   46:aastore         
	//   26   47:invokevirtual   #160 <Method String getString(int, Object[])>
	//   27   50:iconst_0        
	//   28   51:iconst_1        
	//   29   52:new             #14  <Class PickABraavaActivity$10>
	//   30   55:dup             
	//   31   56:aload_0         
	//   32   57:aload_1         
	//   33   58:invokespecial   #162 <Method void PickABraavaActivity$10(PickABraavaActivity, a)>
	//   34   61:ldc1            #164 <String "robot_added">
	//   35   63:invokevirtual   #167 <Method void a(int, String, boolean, boolean, com.irobot.home.g.a$a, String)>
	//   36   66:return          
	}

	static boolean a(PickABraavaActivity pickabraavaactivity, boolean flag)
	{
		pickabraavaactivity.r = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field boolean r>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static BluetoothStateReceiver b(PickABraavaActivity pickabraavaactivity)
	{
		return pickabraavaactivity.p;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field BluetoothStateReceiver p>
	//    2    4:areturn         
	}

	static void b(PickABraavaActivity pickabraavaactivity, String s1)
	{
		pickabraavaactivity.c(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #171 <Method void c(String)>
	//    3    5:return          
	}

	static boolean b(PickABraavaActivity pickabraavaactivity, boolean flag)
	{
		pickabraavaactivity.q = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #173 <Field boolean q>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void c(PickABraavaActivity pickabraavaactivity)
	{
		pickabraavaactivity.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #176 <Method void k()>
	//    2    4:return          
	}

	private void c(String s1)
	{
		o = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #178 <Field String o>
		d(s1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #180 <Method void d(String)>
		l = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #135 <Field boolean l>
		a.c(s1);
	//    9   15:aload_0         
	//   10   16:getfield        #183 <Field com.irobot.home.q.b a>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #186 <Method void com.irobot.home.q.b.c(String)>
	//   13   23:return          
	}

	private void d(String s1)
	{
		e(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #188 <Method void e(String)>
		j.a(((Object) (this)), EventType.ConnectionStateEvent);
	//    3    5:aload_0         
	//    4    6:getfield        #190 <Field com.irobot.home.i.a j>
	//    5    9:aload_0         
	//    6   10:getstatic       #196 <Field EventType EventType.ConnectionStateEvent>
	//    7   13:invokevirtual   #201 <Method void com.irobot.home.i.a.a(Object, EventType)>
	//    8   16:return          
	}

	static boolean d(PickABraavaActivity pickabraavaactivity)
	{
		return pickabraavaactivity.r;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean r>
	//    2    4:ireturn         
	}

	private void e(String s1)
	{
		AssetId assetid = AssetId.assetIdForString(s1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #208 <Method AssetId AssetId.assetIdForString(String)>
	//    2    4:astore_2        
		s1 = ((String) (c.h().d(s1)));
	//    3    5:aload_0         
	//    4    6:getfield        #123 <Field IRobotApplication c>
	//    5    9:invokevirtual   #128 <Method IRobotModel IRobotApplication.h()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #211 <Method a IRobotModel.d(String)>
	//    8   16:astore_1        
		if(!Assembler.getInstance().isInitialized(assetid))
	//*   9   17:invokestatic    #217 <Method Assembler Assembler.getInstance()>
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #221 <Method boolean Assembler.isInitialized(AssetId)>
	//*  12   24:ifne            37
			Assembler.getInstance().initializeAsset(((a) (s1)).a());
	//   13   27:invokestatic    #217 <Method Assembler Assembler.getInstance()>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #150 <Method AssetInfo a.a()>
	//   16   34:invokevirtual   #225 <Method void Assembler.initializeAsset(AssetInfo)>
		j = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//   17   37:aload_0         
	//   18   38:invokestatic    #217 <Method Assembler Assembler.getInstance()>
	//   19   41:invokevirtual   #229 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   20   44:checkcast       #198 <Class com.irobot.home.i.a>
	//   21   47:putfield        #190 <Field com.irobot.home.i.a j>
	//   22   50:return          
	}

	private void f(String s1)
	{
		s1 = ((String) (getFragmentManager().findFragmentByTag(s1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #97  <Method FragmentManager getFragmentManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #233 <Method android.app.Fragment FragmentManager.findFragmentByTag(String)>
	//    4    8:astore_1        
		if(s1 != null && (s1 instanceof DialogFragment))
	//*   5    9:aload_1         
	//*   6   10:ifnull          27
	//*   7   13:aload_1         
	//*   8   14:instanceof      #235 <Class DialogFragment>
	//*   9   17:ifeq            27
			((DialogFragment)s1).dismissAllowingStateLoss();
	//   10   20:aload_1         
	//   11   21:checkcast       #235 <Class DialogFragment>
	//   12   24:invokevirtual   #238 <Method void DialogFragment.dismissAllowingStateLoss()>
	//   13   27:return          
	}

	private void g(String s1)
	{
		n = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #240 <Field String n>
		a.d(s1);
	//    3    5:aload_0         
	//    4    6:getfield        #183 <Field com.irobot.home.q.b a>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #241 <Method void com.irobot.home.q.b.d(String)>
		g.setVisibility(0);
	//    7   13:aload_0         
	//    8   14:getfield        #243 <Field FrameLayout g>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #249 <Method void FrameLayout.setVisibility(int)>
	//   11   21:return          
	}

	private void h()
	{
		i = new ab(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #251 <Class ab>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #254 <Method void ab(android.content.Context)>
	//    5    9:putfield        #256 <Field ab i>
		setListAdapter(((android.widget.ListAdapter) (i)));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #256 <Field ab i>
	//    9   17:invokevirtual   #260 <Method void setListAdapter(android.widget.ListAdapter)>
		getListView().setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   10   20:aload_0         
	//   11   21:invokevirtual   #264 <Method ListView getListView()>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #270 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//   14   28:return          
	}

	private boolean i()
	{
		return s != null && s.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field AlertDialog s>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #77  <Field AlertDialog s>
	//    5   11:invokevirtual   #275 <Method boolean AlertDialog.isShowing()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private boolean j()
	{
		if(t == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field BluetoothAdapter t>
	//*   2    4:ifnonnull       22
		{
			com.irobot.home.util.o.e("PickABraava", "Bluetooth not supported on this device!");
	//    3    7:ldc2            #277 <String "PickABraava">
	//    4   10:ldc2            #279 <String "Bluetooth not supported on this device!">
	//    5   13:invokestatic    #284 <Method void o.e(String, String)>
			c();
	//    6   16:aload_0         
	//    7   17:invokevirtual   #286 <Method void c()>
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		}
		if(!t.isEnabled())
	//*  10   22:aload_0         
	//*  11   23:getfield        #82  <Field BluetoothAdapter t>
	//*  12   26:invokevirtual   #291 <Method boolean BluetoothAdapter.isEnabled()>
	//*  13   29:ifne            38
		{
			b();
	//   14   32:aload_0         
	//   15   33:invokevirtual   #293 <Method void b()>
			return false;
	//   16   36:iconst_0        
	//   17   37:ireturn         
		} else
		{
			return true;
	//   18   38:iconst_1        
	//   19   39:ireturn         
		}
	}

	private void k()
	{
		if(k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #295 <Field boolean k>
	//*   2    4:ifeq            20
		{
			com.irobot.home.h.c.a(DiscoveryType.Altadena);
	//    3    7:getstatic       #301 <Field DiscoveryType DiscoveryType.Altadena>
	//    4   10:invokestatic    #306 <Method void c.a(DiscoveryType)>
			f("searching");
	//    5   13:aload_0         
	//    6   14:ldc2            #308 <String "searching">
	//    7   17:invokespecial   #141 <Method void f(String)>
		}
	//    8   20:return          
	}

	private void l()
	{
		if(j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #190 <Field com.irobot.home.i.a j>
	//*   2    4:ifnull          18
			j.b(((Object) (this)), EventType.ConnectionStateEvent);
	//    3    7:aload_0         
	//    4    8:getfield        #190 <Field com.irobot.home.i.a j>
	//    5   11:aload_0         
	//    6   12:getstatic       #196 <Field EventType EventType.ConnectionStateEvent>
	//    7   15:invokevirtual   #310 <Method void com.irobot.home.i.a.b(Object, EventType)>
	//    8   18:return          
	}

	void a()
	{
		b(0x7f0f07ed);
	//    0    0:aload_0         
	//    1    1:ldc2            #311 <Int 0x7f0f07ed>
	//    2    4:invokevirtual   #313 <Method void b(int)>
		t = ((BluetoothManager)getSystemService("bluetooth")).getAdapter();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:ldc2            #315 <String "bluetooth">
	//    6   12:invokevirtual   #319 <Method Object getSystemService(String)>
	//    7   15:checkcast       #321 <Class BluetoothManager>
	//    8   18:invokevirtual   #325 <Method BluetoothAdapter BluetoothManager.getAdapter()>
	//    9   21:putfield        #82  <Field BluetoothAdapter t>
		b.a(new String[] {
			"android.permission.ACCESS_COARSE_LOCATION"
		});
	//   10   24:aload_0         
	//   11   25:getfield        #328 <Field com.irobot.home.p.a b>
	//   12   28:iconst_1        
	//   13   29:anewarray       String[]
	//   14   32:dup             
	//   15   33:iconst_0        
	//   16   34:ldc2            #332 <String "android.permission.ACCESS_COARSE_LOCATION">
	//   17   37:aastore         
	//   18   38:invokevirtual   #337 <Method void com.irobot.home.p.a.a(String[])>
		((TextView)e.findViewById(0x7f09019d)).setText(0x7f0f08f5);
	//   19   41:aload_0         
	//   20   42:getfield        #339 <Field View e>
	//   21   45:ldc2            #340 <Int 0x7f09019d>
	//   22   48:invokevirtual   #346 <Method View View.findViewById(int)>
	//   23   51:checkcast       #348 <Class TextView>
	//   24   54:ldc2            #349 <Int 0x7f0f08f5>
	//   25   57:invokevirtual   #352 <Method void TextView.setText(int)>
		h();
	//   26   60:aload_0         
	//   27   61:invokespecial   #354 <Method void h()>
	//   28   64:return          
	}

	public void a(int i1, String s1, boolean flag, boolean flag1, com.irobot.home.g.a.a a1, String s2)
	{
		s1 = ((String) (com.irobot.home.g.c.b().a(i1).a(s1).a(flag).b(flag1).a()));
	//    0    0:invokestatic    #359 <Method com.irobot.home.g.c$a com.irobot.home.g.c.b()>
	//    1    3:iload_1         
	//    2    4:invokevirtual   #364 <Method com.irobot.home.g.c$a com.irobot.home.g.c$a.a(int)>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #367 <Method com.irobot.home.g.c$a com.irobot.home.g.c$a.a(String)>
	//    5   11:iload_3         
	//    6   12:invokevirtual   #370 <Method com.irobot.home.g.c$a com.irobot.home.g.c$a.a(boolean)>
	//    7   15:iload           4
	//    8   17:invokevirtual   #372 <Method com.irobot.home.g.c$a com.irobot.home.g.c$a.b(boolean)>
	//    9   20:invokevirtual   #375 <Method com.irobot.home.g.b com.irobot.home.g.c$a.a()>
	//   10   23:astore_2        
		((com.irobot.home.g.b) (s1)).a(a1);
	//   11   24:aload_2         
	//   12   25:aload           5
	//   13   27:invokevirtual   #380 <Method void com.irobot.home.g.b.a(com.irobot.home.g.a$a)>
		a(((DialogFragment) (s1)), s2);
	//   14   30:aload_0         
	//   15   31:aload_2         
	//   16   32:aload           6
	//   17   34:invokespecial   #382 <Method void a(DialogFragment, String)>
	//   18   37:return          
	}

	protected void a(AssetInfo assetinfo)
	{
		if(q)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field boolean q>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			l = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #135 <Field boolean l>
			m = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #137 <Field boolean m>
			o = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #178 <Field String o>
			f("adding_robot");
	//   13   23:aload_0         
	//   14   24:ldc1            #139 <String "adding_robot">
	//   15   26:invokespecial   #141 <Method void f(String)>
			a.d(assetinfo.getAssetId().getId());
	//   16   29:aload_0         
	//   17   30:getfield        #183 <Field com.irobot.home.q.b a>
	//   18   33:aload_1         
	//   19   34:invokevirtual   #386 <Method AssetId AssetInfo.getAssetId()>
	//   20   37:invokevirtual   #389 <Method String AssetId.getId()>
	//   21   40:invokevirtual   #241 <Method void com.irobot.home.q.b.d(String)>
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f02e7).setMessage(((CharSequence) (getString(0x7f0f0764, new Object[] {
				assetinfo.getName()
			})))).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).setPositiveButton(0x7f0f0761, new android.content.DialogInterface.OnClickListener(assetinfo) {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					b.b(a.getName());
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field PickABraavaActivity b>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field AssetInfo a>
				//    4    8:invokevirtual   #32  <Method String AssetInfo.getName()>
				//    5   11:invokevirtual   #35  <Method void com.irobot.home.PickABraavaActivity.b(String)>
					com.irobot.home.PickABraavaActivity.b(b, a.getAssetId().getId());
				//    6   14:aload_0         
				//    7   15:getfield        #18  <Field PickABraavaActivity b>
				//    8   18:aload_0         
				//    9   19:getfield        #20  <Field AssetInfo a>
				//   10   22:invokevirtual   #39  <Method AssetId AssetInfo.getAssetId()>
				//   11   25:invokevirtual   #44  <Method String AssetId.getId()>
				//   12   28:invokestatic    #47  <Method void com.irobot.home.PickABraavaActivity.b(PickABraavaActivity, String)>
				//   13   31:return          
				}

				final AssetInfo a;
				final PickABraavaActivity b;

			
			{
				b = PickABraavaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PickABraavaActivity b>
				a = assetinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field AssetInfo a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

				public void onDismiss(DialogInterface dialoginterface)
				{
					com.irobot.home.PickABraavaActivity.b(a, false);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PickABraavaActivity a>
				//    2    4:iconst_0        
				//    3    5:invokestatic    #26  <Method boolean com.irobot.home.PickABraavaActivity.b(PickABraavaActivity, boolean)>
				//    4    8:pop             
				//    5    9:return          
				}

				final PickABraavaActivity a;

			
			{
				a = PickABraavaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PickABraavaActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//   22   43:new             #391 <Class android.app.AlertDialog$Builder>
	//   23   46:dup             
	//   24   47:aload_0         
	//   25   48:invokespecial   #392 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   26   51:ldc2            #393 <Int 0x7f0f02e7>
	//   27   54:invokevirtual   #397 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   28   57:aload_0         
	//   29   58:ldc2            #398 <Int 0x7f0f0764>
	//   30   61:iconst_1        
	//   31   62:anewarray       Object[]
	//   32   65:dup             
	//   33   66:iconst_0        
	//   34   67:aload_1         
	//   35   68:invokevirtual   #156 <Method String AssetInfo.getName()>
	//   36   71:aastore         
	//   37   72:invokevirtual   #160 <Method String getString(int, Object[])>
	//   38   75:invokevirtual   #402 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   39   78:ldc2            #403 <Int 0x7f0f017d>
	//   40   81:aconst_null     
	//   41   82:invokevirtual   #407 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   42   85:ldc2            #408 <Int 0x7f0f0761>
	//   43   88:new             #18  <Class PickABraavaActivity$2>
	//   44   91:dup             
	//   45   92:aload_0         
	//   46   93:aload_1         
	//   47   94:invokespecial   #411 <Method void PickABraavaActivity$2(PickABraavaActivity, AssetInfo)>
	//   48   97:invokevirtual   #414 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   49  100:new             #16  <Class PickABraavaActivity$11>
	//   50  103:dup             
	//   51  104:aload_0         
	//   52  105:invokespecial   #416 <Method void PickABraavaActivity$11(PickABraavaActivity)>
	//   53  108:invokevirtual   #420 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//   54  111:invokevirtual   #424 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   55  114:pop             
			q = true;
	//   56  115:aload_0         
	//   57  116:iconst_1        
	//   58  117:putfield        #173 <Field boolean q>
			return;
	//   59  120:return          
		}
	}

	public void a(DiscoveryType discoverytype)
	{
		k = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #295 <Field boolean k>
		f("searching");
	//    3    5:aload_0         
	//    4    6:ldc2            #308 <String "searching">
	//    5    9:invokespecial   #141 <Method void f(String)>
		if(!t.isEnabled())
	//*   6   12:aload_0         
	//*   7   13:getfield        #82  <Field BluetoothAdapter t>
	//*   8   16:invokevirtual   #291 <Method boolean BluetoothAdapter.isEnabled()>
	//*   9   19:ifne            23
			return;
	//   10   22:return          
		if(h.size() == 0 && android.os.Build.VERSION.SDK_INT == 23 && !com.irobot.home.util.j.j(((android.content.Context) (this))))
	//*  11   23:aload_0         
	//*  12   24:getfield        #73  <Field List h>
	//*  13   27:invokeinterface #429 <Method int List.size()>
	//*  14   32:ifne            55
	//*  15   35:getstatic       #435 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   38:bipush          23
	//*  17   40:icmpne          55
	//*  18   43:aload_0         
	//*  19   44:invokestatic    #440 <Method boolean j.j(android.content.Context)>
	//*  20   47:ifne            55
		{
			g();
	//   21   50:aload_0         
	//   22   51:invokevirtual   #442 <Method void g()>
			return;
	//   23   54:return          
		}
		h.size();
	//   24   55:aload_0         
	//   25   56:getfield        #73  <Field List h>
	//   26   59:invokeinterface #429 <Method int List.size()>
		JVM INSTR tableswitch 0 1: default 88
	//	               0 108
	//	               1 101;
	//   27   64:tableswitch     0 1: default 88
	//	               0 108
	//	               1 101
		   goto _L1 _L2 _L3
_L1:
		int i1 = 0x7f0f07a5;
	//   28   88:ldc2            #443 <Int 0x7f0f07a5>
	//   29   91:istore_2        
_L5:
		discoverytype = ((DiscoveryType) (getString(i1)));
	//   30   92:aload_0         
	//   31   93:iload_2         
	//   32   94:invokevirtual   #446 <Method String getString(int)>
	//   33   97:astore_1        
		break; /* Loop/switch isn't completed */
	//   34   98:goto            115
_L3:
		i1 = 0x7f0f076e;
	//   35  101:ldc2            #447 <Int 0x7f0f076e>
	//   36  104:istore_2        
		continue; /* Loop/switch isn't completed */
	//   37  105:goto            92
_L2:
		i1 = 0x7f0f04e3;
	//   38  108:ldc2            #448 <Int 0x7f0f04e3>
	//   39  111:istore_2        
		if(true) goto _L5; else goto _L4
	//   40  112:goto            92
_L4:
		a(h.size(), ((String) (discoverytype)), true, true, ((com.irobot.home.g.a.a) (null)), "search_results");
	//   41  115:aload_0         
	//   42  116:aload_0         
	//   43  117:getfield        #73  <Field List h>
	//   44  120:invokeinterface #429 <Method int List.size()>
	//   45  125:aload_1         
	//   46  126:iconst_1        
	//   47  127:iconst_1        
	//   48  128:aconst_null     
	//   49  129:ldc2            #450 <String "search_results">
	//   50  132:invokevirtual   #167 <Method void a(int, String, boolean, boolean, com.irobot.home.g.a$a, String)>
		return;
	//   51  135:return          
	}

	public void a(DiscoveryType discoverytype, DiscoveredAsset discoveredasset)
	{
		discoverytype = ((DiscoveryType) (discoveredasset.assetInfo().getAssetId().getId()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #456 <Method AssetInfo DiscoveredAsset.assetInfo()>
	//    2    4:invokevirtual   #386 <Method AssetId AssetInfo.getAssetId()>
	//    3    7:invokevirtual   #389 <Method String AssetId.getId()>
	//    4   10:astore_1        
		if(!c.h().b(((String) (discoverytype))))
	//*   5   11:aload_0         
	//*   6   12:getfield        #123 <Field IRobotApplication c>
	//*   7   15:invokevirtual   #128 <Method IRobotModel IRobotApplication.h()>
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #459 <Method boolean IRobotModel.b(String)>
	//*  10   22:ifne            77
		{
			if(h.contains(((Object) (discoverytype))))
	//*  11   25:aload_0         
	//*  12   26:getfield        #73  <Field List h>
	//*  13   29:aload_1         
	//*  14   30:invokeinterface #463 <Method boolean List.contains(Object)>
	//*  15   35:ifeq            39
				return;
	//   16   38:return          
			h.add(((Object) (discoverytype)));
	//   17   39:aload_0         
	//   18   40:getfield        #73  <Field List h>
	//   19   43:aload_1         
	//   20   44:invokeinterface #465 <Method boolean List.add(Object)>
	//   21   49:pop             
			discoverytype = ((DiscoveryType) (new RegisterRobotListItem(discoveredasset.assetInfo().getName(), ((String) (discoverytype)), 0x7f08006f)));
	//   22   50:new             #467 <Class RegisterRobotListItem>
	//   23   53:dup             
	//   24   54:aload_2         
	//   25   55:invokevirtual   #456 <Method AssetInfo DiscoveredAsset.assetInfo()>
	//   26   58:invokevirtual   #156 <Method String AssetInfo.getName()>
	//   27   61:aload_1         
	//   28   62:ldc2            #468 <Int 0x7f08006f>
	//   29   65:invokespecial   #471 <Method void RegisterRobotListItem(String, String, int)>
	//   30   68:astore_1        
			i.add(((Object) (discoverytype)));
	//   31   69:aload_0         
	//   32   70:getfield        #256 <Field ab i>
	//   33   73:aload_1         
	//   34   74:invokevirtual   #474 <Method void ab.add(Object)>
		}
	//   35   77:return          
	}

	public void a(String s1)
	{
		boolean flag;
		a a1;
label0:
		{
			a1 = c.h().d(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field IRobotApplication c>
	//    2    4:invokevirtual   #128 <Method IRobotModel IRobotApplication.h()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #211 <Method a IRobotModel.d(String)>
	//    5   11:astore_3        
			AssetInfo assetinfo = a1.a();
	//    6   12:aload_3         
	//    7   13:invokevirtual   #150 <Method AssetInfo a.a()>
	//    8   16:astore          4
			if(!r)
	//*   9   18:aload_0         
	//*  10   19:getfield        #75  <Field boolean r>
	//*  11   22:ifne            183
			{
				e(s1);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #188 <Method void e(String)>
				UpdateUIService updateuiservice = Assembler.getInstance().getUpdateUIService(a1.b());
	//   15   30:invokestatic    #217 <Method Assembler Assembler.getInstance()>
	//   16   33:aload_3         
	//   17   34:invokevirtual   #476 <Method AssetId a.b()>
	//   18   37:invokevirtual   #480 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//   19   40:astore          5
				if(updateuiservice == null)
	//*  20   42:aload           5
	//*  21   44:ifnonnull       59
				{
					com.irobot.home.util.o.e("PickABraava", "checkSoftwareVersion: UpdateUIService is null");
	//   22   47:ldc2            #277 <String "PickABraava">
	//   23   50:ldc2            #482 <String "checkSoftwareVersion: UpdateUIService is null">
	//   24   53:invokestatic    #284 <Method void o.e(String, String)>
				} else
	//*  25   56:goto            183
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   26   59:new             #484 <Class StringBuilder>
	//   27   62:dup             
	//   28   63:invokespecial   #485 <Method void StringBuilder()>
	//   29   66:astore          6
					stringbuilder.append("Checking if software is up to date for asset ");
	//   30   68:aload           6
	//   31   70:ldc2            #487 <String "Checking if software is up to date for asset ">
	//   32   73:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   33   76:pop             
					stringbuilder.append(a1.a().getName());
	//   34   77:aload           6
	//   35   79:aload_3         
	//   36   80:invokevirtual   #150 <Method AssetInfo a.a()>
	//   37   83:invokevirtual   #156 <Method String AssetInfo.getName()>
	//   38   86:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   39   89:pop             
					stringbuilder.append(" with id ");
	//   40   90:aload           6
	//   41   92:ldc2            #493 <String " with id ">
	//   42   95:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   43   98:pop             
					stringbuilder.append(s1);
	//   44   99:aload           6
	//   45  101:aload_1         
	//   46  102:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   47  105:pop             
					stringbuilder.append(" with software version ");
	//   48  106:aload           6
	//   49  108:ldc2            #495 <String " with software version ">
	//   50  111:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   51  114:pop             
					stringbuilder.append(assetinfo.getSoftwareVersion());
	//   52  115:aload           6
	//   53  117:aload           4
	//   54  119:invokevirtual   #498 <Method String AssetInfo.getSoftwareVersion()>
	//   55  122:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   56  125:pop             
					stringbuilder.append(" and SKU ");
	//   57  126:aload           6
	//   58  128:ldc2            #500 <String " and SKU ">
	//   59  131:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   60  134:pop             
					stringbuilder.append(assetinfo.getSku());
	//   61  135:aload           6
	//   62  137:aload           4
	//   63  139:invokevirtual   #503 <Method String AssetInfo.getSku()>
	//   64  142:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   65  145:pop             
					com.irobot.home.util.o.b("PickABraava", stringbuilder.toString());
	//   66  146:ldc2            #277 <String "PickABraava">
	//   67  149:aload           6
	//   68  151:invokevirtual   #506 <Method String StringBuilder.toString()>
	//   69  154:invokestatic    #508 <Method void o.b(String, String)>
					flag = true;
	//   70  157:iconst_1        
	//   71  158:istore_2        
					j.a(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//   72  159:aload_0         
	//   73  160:getfield        #190 <Field com.irobot.home.i.a j>
	//   74  163:aload_0         
	//   75  164:getstatic       #511 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//   76  167:invokevirtual   #201 <Method void com.irobot.home.i.a.a(Object, EventType)>
					updateuiservice.querySoftwareVersion();
	//   77  170:aload           5
	//   78  172:invokevirtual   #516 <Method void UpdateUIService.querySoftwareVersion()>
					updateuiservice.queryForSoftwareUpdate();
	//   79  175:aload           5
	//   80  177:invokevirtual   #519 <Method void UpdateUIService.queryForSoftwareUpdate()>
					break label0;
	//   81  180:goto            185
				}
			}
			flag = false;
	//   82  183:iconst_0        
	//   83  184:istore_2        
		}
		if(!flag)
	//*  84  185:iload_2         
	//*  85  186:ifne            194
			a(a1);
	//   86  189:aload_0         
	//   87  190:aload_3         
	//   88  191:invokespecial   #117 <Method void a(a)>
	//   89  194:return          
	}

	protected void b()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f0814).setMessage(0x7f0f0145).setNegativeButton(0x7f0f04d3, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				a.c();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PickABraavaActivity a>
			//    2    4:invokevirtual   #25  <Method void com.irobot.home.PickABraavaActivity.c()>
			//    3    7:return          
			}

			final PickABraavaActivity a;

			
			{
				a = PickABraavaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PickABraavaActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				if(!com.irobot.home.PickABraavaActivity.a(a).enable())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field PickABraavaActivity a>
			//*   2    4:invokestatic    #25  <Method BluetoothAdapter com.irobot.home.PickABraavaActivity.a(PickABraavaActivity)>
			//*   3    7:invokevirtual   #31  <Method boolean BluetoothAdapter.enable()>
			//*   4   10:ifne            28
				{
					com.irobot.home.util.o.e("PickABraava", "Could not enable Bluetooth!");
			//    5   13:ldc1            #33  <String "PickABraava">
			//    6   15:ldc1            #35  <String "Could not enable Bluetooth!">
			//    7   17:invokestatic    #41  <Method void o.e(String, String)>
					a.c();
			//    8   20:aload_0         
			//    9   21:getfield        #17  <Field PickABraavaActivity a>
			//   10   24:invokevirtual   #44  <Method void com.irobot.home.PickABraavaActivity.c()>
					return;
			//   11   27:return          
				} else
				{
					com.irobot.home.PickABraavaActivity.a(a, new BluetoothStateReceiver(((com.irobot.home.util.BluetoothStateReceiver.a) (a))));
			//   12   28:aload_0         
			//   13   29:getfield        #17  <Field PickABraavaActivity a>
			//   14   32:new             #46  <Class BluetoothStateReceiver>
			//   15   35:dup             
			//   16   36:aload_0         
			//   17   37:getfield        #17  <Field PickABraavaActivity a>
			//   18   40:invokespecial   #49  <Method void BluetoothStateReceiver(com.irobot.home.util.BluetoothStateReceiver$a)>
			//   19   43:invokestatic    #52  <Method BluetoothStateReceiver com.irobot.home.PickABraavaActivity.a(PickABraavaActivity, BluetoothStateReceiver)>
			//   20   46:pop             
					a.registerReceiver(((android.content.BroadcastReceiver) (com.irobot.home.PickABraavaActivity.b(a))), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
			//   21   47:aload_0         
			//   22   48:getfield        #17  <Field PickABraavaActivity a>
			//   23   51:aload_0         
			//   24   52:getfield        #17  <Field PickABraavaActivity a>
			//   25   55:invokestatic    #55  <Method BluetoothStateReceiver com.irobot.home.PickABraavaActivity.b(PickABraavaActivity)>
			//   26   58:new             #57  <Class IntentFilter>
			//   27   61:dup             
			//   28   62:ldc1            #59  <String "android.bluetooth.adapter.action.STATE_CHANGED">
			//   29   64:invokespecial   #62  <Method void IntentFilter(String)>
			//   30   67:invokevirtual   #66  <Method Intent PickABraavaActivity.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
			//   31   70:pop             
					return;
			//   32   71:return          
				}
			}

			final PickABraavaActivity a;

			
			{
				a = PickABraavaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PickABraavaActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).show();
	//    0    0:new             #391 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #392 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #520 <Int 0x7f0f0814>
	//    5   11:invokevirtual   #397 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   14:ldc2            #521 <Int 0x7f0f0145>
	//    7   17:invokevirtual   #523 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   20:ldc2            #524 <Int 0x7f0f04d3>
	//    9   23:new             #22  <Class PickABraavaActivity$4>
	//   10   26:dup             
	//   11   27:aload_0         
	//   12   28:invokespecial   #525 <Method void PickABraavaActivity$4(PickABraavaActivity)>
	//   13   31:invokevirtual   #407 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   14   34:ldc2            #526 <Int 0x7f0f0986>
	//   15   37:new             #12  <Class PickABraavaActivity$1>
	//   16   40:dup             
	//   17   41:aload_0         
	//   18   42:invokespecial   #527 <Method void PickABraavaActivity$1(PickABraavaActivity)>
	//   19   45:invokevirtual   #414 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   20   48:invokevirtual   #424 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   21   51:pop             
	//   22   52:return          
	}

	protected void b(String s1)
	{
		a(0x7f080185, getString(0x7f0f0073, new Object[] {
			s1
		}), false, false, ((com.irobot.home.g.a.a) (null)), "adding_robot");
	//    0    0:aload_0         
	//    1    1:ldc2            #528 <Int 0x7f080185>
	//    2    4:aload_0         
	//    3    5:ldc2            #529 <Int 0x7f0f0073>
	//    4    8:iconst_1        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:invokevirtual   #160 <Method String getString(int, Object[])>
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:aconst_null     
	//   14   22:ldc1            #139 <String "adding_robot">
	//   15   24:invokevirtual   #167 <Method void a(int, String, boolean, boolean, com.irobot.home.g.a$a, String)>
	//   16   27:return          
	}

	protected void c()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f022b).setMessage(0x7f0f00f6).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #391 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #392 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #530 <Int 0x7f0f022b>
	//    5   11:invokevirtual   #397 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   14:ldc2            #531 <Int 0x7f0f00f6>
	//    7   17:invokevirtual   #523 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   20:ldc2            #532 <Int 0x7f0f05bb>
	//    9   23:aconst_null     
	//   10   24:invokevirtual   #414 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   27:invokevirtual   #424 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   12   30:pop             
	//   13   31:return          
	}

	public void d()
	{
		h.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field List h>
	//    2    4:invokeinterface #535 <Method void List.clear()>
		i.clear();
	//    3    9:aload_0         
	//    4   10:getfield        #256 <Field ab i>
	//    5   13:invokevirtual   #536 <Method void ab.clear()>
		TypeDiscoveryAttribute typediscoveryattribute = TypeDiscoveryAttribute.create(DiscoveryType.Altadena);
	//    6   16:getstatic       #301 <Field DiscoveryType DiscoveryType.Altadena>
	//    7   19:invokestatic    #542 <Method TypeDiscoveryAttribute TypeDiscoveryAttribute.create(DiscoveryType)>
	//    8   22:astore_1        
		HashMap hashmap = new HashMap();
	//    9   23:new             #544 <Class HashMap>
	//   10   26:dup             
	//   11   27:invokespecial   #545 <Method void HashMap()>
	//   12   30:astore_2        
		hashmap.put(((Object) (DiscoveryAttributeKey.Type)), ((Object) (typediscoveryattribute)));
	//   13   31:aload_2         
	//   14   32:getstatic       #551 <Field DiscoveryAttributeKey DiscoveryAttributeKey.Type>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #555 <Method Object HashMap.put(Object, Object)>
	//   17   39:pop             
		k = com.irobot.home.h.c.a(hashmap, ((b) (this)));
	//   18   40:aload_0         
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:invokestatic    #558 <Method boolean c.a(HashMap, b)>
	//   22   46:putfield        #295 <Field boolean k>
		if(!k)
	//*  23   49:aload_0         
	//*  24   50:getfield        #295 <Field boolean k>
	//*  25   53:ifne            57
		{
			return;
	//   26   56:return          
		} else
		{
			com.irobot.home.g.j j1 = com.irobot.home.g.k.b().a();
	//   27   57:invokestatic    #563 <Method com.irobot.home.g.k$a k.b()>
	//   28   60:invokevirtual   #568 <Method com.irobot.home.g.j com.irobot.home.g.k$a.a()>
	//   29   63:astore_1        
			j1.a(new com.irobot.home.g.a.a() {

				public void a()
				{
					com.irobot.home.PickABraavaActivity.c(a);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field PickABraavaActivity a>
				//    2    4:invokestatic    #23  <Method void com.irobot.home.PickABraavaActivity.c(PickABraavaActivity)>
				//    3    7:return          
				}

				final PickABraavaActivity a;

			
			{
				a = PickABraavaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PickABraavaActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   30   64:aload_1         
	//   31   65:new             #24  <Class PickABraavaActivity$5>
	//   32   68:dup             
	//   33   69:aload_0         
	//   34   70:invokespecial   #569 <Method void PickABraavaActivity$5(PickABraavaActivity)>
	//   35   73:invokevirtual   #572 <Method void com.irobot.home.g.j.a(com.irobot.home.g.a$a)>
			a(((DialogFragment) (j1)), "searching");
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:ldc2            #308 <String "searching">
	//   39   81:invokespecial   #382 <Method void a(DialogFragment, String)>
			return;
	//   40   84:return          
		}
	}

	public void e()
	{
		if(j())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #574 <Method boolean j()>
	//*   2    4:ifeq            11
			d();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #576 <Method void d()>
	//    5   11:return          
	}

	public void f()
	{
		com.irobot.home.TroubleshootingSetup1Activity_.a(((android.content.Context) (this))).a("R980020").b(0x7f030011).c(0x7f030010).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #581 <Method TroubleshootingSetup1Activity_$a com.irobot.home.TroubleshootingSetup1Activity_.a(android.content.Context)>
	//    2    4:ldc2            #583 <String "R980020">
	//    3    7:invokevirtual   #588 <Method TroubleshootingSetup1Activity_$a com.irobot.home.TroubleshootingSetup1Activity_$a.a(String)>
	//    4   10:ldc2            #589 <Int 0x7f030011>
	//    5   13:invokevirtual   #592 <Method TroubleshootingSetup1Activity_$a com.irobot.home.TroubleshootingSetup1Activity_$a.b(int)>
	//    6   16:ldc2            #593 <Int 0x7f030010>
	//    7   19:invokevirtual   #595 <Method TroubleshootingSetup1Activity_$a com.irobot.home.TroubleshootingSetup1Activity_$a.c(int)>
	//    8   22:invokevirtual   #598 <Method org.androidannotations.api.a.e com.irobot.home.TroubleshootingSetup1Activity_$a.a()>
	//    9   25:pop             
	//   10   26:return          
	}

	protected void g()
	{
		String s1 = getString(getResources().getIdentifier("@android:string/permgrouplab_location", ((String) (null)), ((String) (null))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #602 <Method Resources getResources()>
	//    3    5:ldc2            #604 <String "@android:string/permgrouplab_location">
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #610 <Method int Resources.getIdentifier(String, String, String)>
	//    7   13:invokevirtual   #446 <Method String getString(int)>
	//    8   16:astore_1        
		s = (new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(((CharSequence) (getString(0x7f0f01e8, new Object[] {
			s1
		})))).setMessage(((CharSequence) (getString(0x7f0f01e7, new Object[] {
			s1
		})))).setNegativeButton(0x7f0f0275, ((android.content.DialogInterface.OnClickListener) (null))).setPositiveButton(0x7f0f034a, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				dialoginterface = ((DialogInterface) (new Intent("android.settings.LOCATION_SOURCE_SETTINGS")));
			//    0    0:new             #24  <Class Intent>
			//    1    3:dup             
			//    2    4:ldc1            #26  <String "android.settings.LOCATION_SOURCE_SETTINGS">
			//    3    6:invokespecial   #29  <Method void Intent(String)>
			//    4    9:astore_1        
				a.startActivityForResult(((Intent) (dialoginterface)), 0);
			//    5   10:aload_0         
			//    6   11:getfield        #17  <Field PickABraavaActivity a>
			//    7   14:aload_1         
			//    8   15:iconst_0        
			//    9   16:invokevirtual   #33  <Method void PickABraavaActivity.startActivityForResult(Intent, int)>
			//   10   19:return          
			}

			final PickABraavaActivity a;

			
			{
				a = PickABraavaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PickABraavaActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).show();
	//    9   17:aload_0         
	//   10   18:new             #391 <Class android.app.AlertDialog$Builder>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #392 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   14   26:aload_0         
	//   15   27:ldc2            #611 <Int 0x7f0f01e8>
	//   16   30:iconst_1        
	//   17   31:anewarray       Object[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:aload_1         
	//   21   37:aastore         
	//   22   38:invokevirtual   #160 <Method String getString(int, Object[])>
	//   23   41:invokevirtual   #613 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   24   44:aload_0         
	//   25   45:ldc2            #614 <Int 0x7f0f01e7>
	//   26   48:iconst_1        
	//   27   49:anewarray       Object[]
	//   28   52:dup             
	//   29   53:iconst_0        
	//   30   54:aload_1         
	//   31   55:aastore         
	//   32   56:invokevirtual   #160 <Method String getString(int, Object[])>
	//   33   59:invokevirtual   #402 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   34   62:ldc2            #615 <Int 0x7f0f0275>
	//   35   65:aconst_null     
	//   36   66:invokevirtual   #407 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   37   69:ldc2            #616 <Int 0x7f0f034a>
	//   38   72:new             #26  <Class PickABraavaActivity$6>
	//   39   75:dup             
	//   40   76:aload_0         
	//   41   77:invokespecial   #617 <Method void PickABraavaActivity$6(PickABraavaActivity)>
	//   42   80:invokevirtual   #414 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   43   83:invokevirtual   #424 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   44   86:putfield        #77  <Field AlertDialog s>
	//   45   89:return          
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		j.b(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field com.irobot.home.i.a j>
	//    2    4:aload_0         
	//    3    5:getstatic       #511 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//    4    8:invokevirtual   #310 <Method void com.irobot.home.i.a.b(Object, EventType)>
		StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #484 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #485 <Method void StringBuilder()>
	//    8   18:astore_3        
		stringbuilder.append("Firmware ");
	//    9   19:aload_3         
	//   10   20:ldc2            #622 <String "Firmware ">
	//   11   23:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		Object obj;
		if(assetupdateavailabilityevent.status() == UpdateStatus.UpdateAvailable)
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #628 <Method UpdateStatus AssetUpdateAvailabilityEvent.status()>
	//*  15   31:getstatic       #634 <Field UpdateStatus UpdateStatus.UpdateAvailable>
	//*  16   34:if_acmpne       44
			obj = "update found";
	//   17   37:ldc2            #636 <String "update found">
	//   18   40:astore_2        
		else
	//*  19   41:goto            48
			obj = "is up-to-date";
	//   20   44:ldc2            #638 <String "is up-to-date">
	//   21   47:astore_2        
		stringbuilder.append(((String) (obj)));
	//   22   48:aload_3         
	//   23   49:aload_2         
	//   24   50:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
		stringbuilder.append(": current version is ");
	//   26   54:aload_3         
	//   27   55:ldc2            #640 <String ": current version is ">
	//   28   58:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
		stringbuilder.append(assetupdateavailabilityevent.currentVersion());
	//   30   62:aload_3         
	//   31   63:aload_1         
	//   32   64:invokevirtual   #643 <Method String AssetUpdateAvailabilityEvent.currentVersion()>
	//   33   67:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
		stringbuilder.append(", available version is ");
	//   35   71:aload_3         
	//   36   72:ldc2            #645 <String ", available version is ">
	//   37   75:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
		stringbuilder.append(assetupdateavailabilityevent.updateInfo().getVersion());
	//   39   79:aload_3         
	//   40   80:aload_1         
	//   41   81:invokevirtual   #649 <Method FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//   42   84:invokevirtual   #654 <Method String FirmwareUpdateItem.getVersion()>
	//   43   87:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
		com.irobot.home.util.o.c("PickABraava", stringbuilder.toString());
	//   45   91:ldc2            #277 <String "PickABraava">
	//   46   94:aload_3         
	//   47   95:invokevirtual   #506 <Method String StringBuilder.toString()>
	//   48   98:invokestatic    #656 <Method void o.c(String, String)>
		obj = ((Object) (c.h().d(assetupdateavailabilityevent.assetId().getId())));
	//   49  101:aload_0         
	//   50  102:getfield        #123 <Field IRobotApplication c>
	//   51  105:invokevirtual   #128 <Method IRobotModel IRobotApplication.h()>
	//   52  108:aload_1         
	//   53  109:invokevirtual   #659 <Method AssetId AssetUpdateAvailabilityEvent.assetId()>
	//   54  112:invokevirtual   #389 <Method String AssetId.getId()>
	//   55  115:invokevirtual   #211 <Method a IRobotModel.d(String)>
	//   56  118:astore_2        
		((a) (obj)).a();
	//   57  119:aload_2         
	//   58  120:invokevirtual   #150 <Method AssetInfo a.a()>
	//   59  123:pop             
		if(assetupdateavailabilityevent.status() == UpdateStatus.UpdateAvailable)
	//*  60  124:aload_1         
	//*  61  125:invokevirtual   #628 <Method UpdateStatus AssetUpdateAvailabilityEvent.status()>
	//*  62  128:getstatic       #634 <Field UpdateStatus UpdateStatus.UpdateAvailable>
	//*  63  131:if_acmpne       188
		{
			f("adding_robot");
	//   64  134:aload_0         
	//   65  135:ldc1            #139 <String "adding_robot">
	//   66  137:invokespecial   #141 <Method void f(String)>
			a.c(assetupdateavailabilityevent.assetId().getId());
	//   67  140:aload_0         
	//   68  141:getfield        #183 <Field com.irobot.home.q.b a>
	//   69  144:aload_1         
	//   70  145:invokevirtual   #659 <Method AssetId AssetUpdateAvailabilityEvent.assetId()>
	//   71  148:invokevirtual   #389 <Method String AssetId.getId()>
	//   72  151:invokevirtual   #186 <Method void com.irobot.home.q.b.c(String)>
			d.a(assetupdateavailabilityevent);
	//   73  154:aload_0         
	//   74  155:getfield        #661 <Field AssetSoftwareUpdateUtils d>
	//   75  158:aload_1         
	//   76  159:invokevirtual   #665 <Method void AssetSoftwareUpdateUtils.a(AssetUpdateAvailabilityEvent)>
			d.a(new android.content.DialogInterface.OnClickListener(assetupdateavailabilityevent) {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					com.irobot.home.PickABraavaActivity.a(b, a.assetId().getId());
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field PickABraavaActivity b>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field AssetUpdateAvailabilityEvent a>
				//    4    8:invokevirtual   #33  <Method AssetId AssetUpdateAvailabilityEvent.assetId()>
				//    5   11:invokevirtual   #39  <Method String AssetId.getId()>
				//    6   14:invokestatic    #42  <Method void com.irobot.home.PickABraavaActivity.a(PickABraavaActivity, String)>
				//    7   17:return          
				}

				final AssetUpdateAvailabilityEvent a;
				final PickABraavaActivity b;

			
			{
				b = PickABraavaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PickABraavaActivity b>
				a = assetupdateavailabilityevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AssetUpdateAvailabilityEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
, new android.content.DialogInterface.OnClickListener(((a) (obj))) {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					com.irobot.home.PickABraavaActivity.a(b, a);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field PickABraavaActivity b>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field a a>
				//    4    8:invokestatic    #29  <Method void com.irobot.home.PickABraavaActivity.a(PickABraavaActivity, a)>
				//    5   11:return          
				}

				final a a;
				final PickABraavaActivity b;

			
			{
				b = PickABraavaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PickABraavaActivity b>
				a = a1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field a a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   77  162:aload_0         
	//   78  163:getfield        #661 <Field AssetSoftwareUpdateUtils d>
	//   79  166:new             #28  <Class PickABraavaActivity$7>
	//   80  169:dup             
	//   81  170:aload_0         
	//   82  171:aload_1         
	//   83  172:invokespecial   #668 <Method void PickABraavaActivity$7(PickABraavaActivity, AssetUpdateAvailabilityEvent)>
	//   84  175:new             #30  <Class PickABraavaActivity$8>
	//   85  178:dup             
	//   86  179:aload_0         
	//   87  180:aload_2         
	//   88  181:invokespecial   #669 <Method void PickABraavaActivity$8(PickABraavaActivity, a)>
	//   89  184:invokevirtual   #672 <Method void AssetSoftwareUpdateUtils.a(android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener)>
			return;
	//   90  187:return          
		}
		if(assetupdateavailabilityevent.status() == UpdateStatus.UpToDate)
	//*  91  188:aload_1         
	//*  92  189:invokevirtual   #628 <Method UpdateStatus AssetUpdateAvailabilityEvent.status()>
	//*  93  192:getstatic       #675 <Field UpdateStatus UpdateStatus.UpToDate>
	//*  94  195:if_acmpne       204
		{
			a(((a) (obj)));
	//   95  198:aload_0         
	//   96  199:aload_2         
	//   97  200:invokespecial   #117 <Method void a(a)>
			return;
	//   98  203:return          
		} else
		{
			com.irobot.home.util.o.d("PickABraava", "Got UpdateStatus.UpdateUnavailable while adding a robot.");
	//   99  204:ldc2            #277 <String "PickABraava">
	//  100  207:ldc2            #677 <String "Got UpdateStatus.UpdateUnavailable while adding a robot.">
	//  101  210:invokestatic    #679 <Method void o.d(String, String)>
			g(assetupdateavailabilityevent.assetId().getId());
	//  102  213:aload_0         
	//  103  214:aload_1         
	//  104  215:invokevirtual   #659 <Method AssetId AssetUpdateAvailabilityEvent.assetId()>
	//  105  218:invokevirtual   #389 <Method String AssetId.getId()>
	//  106  221:invokespecial   #121 <Method void g(String)>
			return;
	//  107  224:return          
		}
	}

	public void onConnectionStateEvent(ConnectionStateEvent connectionstateevent)
	{
		Object obj;
		NetworkState networkstate;
		a a1;
		networkstate = (NetworkState)connectionstateevent.networkState().get(((Object) (NetworkType.Local)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #688 <Method HashMap ConnectionStateEvent.networkState()>
	//    2    4:getstatic       #694 <Field NetworkType NetworkType.Local>
	//    3    7:invokevirtual   #698 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #700 <Class NetworkState>
	//    5   13:astore_3        
		obj = ((Object) (new StringBuilder()));
	//    6   14:new             #484 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #485 <Method void StringBuilder()>
	//    9   21:astore_2        
		((StringBuilder) (obj)).append("onConnectionStateEvent: ");
	//   10   22:aload_2         
	//   11   23:ldc2            #702 <String "onConnectionStateEvent: ">
	//   12   26:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		((StringBuilder) (obj)).append(networkstate.name());
	//   14   30:aload_2         
	//   15   31:aload_3         
	//   16   32:invokevirtual   #705 <Method String NetworkState.name()>
	//   17   35:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		com.irobot.home.util.o.b("PickABraava", ((StringBuilder) (obj)).toString());
	//   19   39:ldc2            #277 <String "PickABraava">
	//   20   42:aload_2         
	//   21   43:invokevirtual   #506 <Method String StringBuilder.toString()>
	//   22   46:invokestatic    #508 <Method void o.b(String, String)>
		obj = ((Object) (connectionstateevent.assetId().getId()));
	//   23   49:aload_1         
	//   24   50:invokevirtual   #706 <Method AssetId ConnectionStateEvent.assetId()>
	//   25   53:invokevirtual   #389 <Method String AssetId.getId()>
	//   26   56:astore_2        
		if(!((String) (obj)).equals(((Object) (o))))
	//*  27   57:aload_2         
	//*  28   58:aload_0         
	//*  29   59:getfield        #178 <Field String o>
	//*  30   62:invokevirtual   #709 <Method boolean String.equals(Object)>
	//*  31   65:ifne            118
		{
			connectionstateevent = ((ConnectionStateEvent) (new StringBuilder()));
	//   32   68:new             #484 <Class StringBuilder>
	//   33   71:dup             
	//   34   72:invokespecial   #485 <Method void StringBuilder()>
	//   35   75:astore_1        
			((StringBuilder) (connectionstateevent)).append("Discarding connection state event. Expected: ");
	//   36   76:aload_1         
	//   37   77:ldc2            #711 <String "Discarding connection state event. Expected: ">
	//   38   80:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   39   83:pop             
			((StringBuilder) (connectionstateevent)).append(o);
	//   40   84:aload_1         
	//   41   85:aload_0         
	//   42   86:getfield        #178 <Field String o>
	//   43   89:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   44   92:pop             
			((StringBuilder) (connectionstateevent)).append(" actual: ");
	//   45   93:aload_1         
	//   46   94:ldc2            #713 <String " actual: ">
	//   47   97:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
			((StringBuilder) (connectionstateevent)).append(((String) (obj)));
	//   49  101:aload_1         
	//   50  102:aload_2         
	//   51  103:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
			com.irobot.home.util.o.b("PickABraava", ((StringBuilder) (connectionstateevent)).toString());
	//   53  107:ldc2            #277 <String "PickABraava">
	//   54  110:aload_1         
	//   55  111:invokevirtual   #506 <Method String StringBuilder.toString()>
	//   56  114:invokestatic    #508 <Method void o.b(String, String)>
			return;
	//   57  117:return          
		}
		a1 = c.h().d(connectionstateevent.assetId().getId());
	//   58  118:aload_0         
	//   59  119:getfield        #123 <Field IRobotApplication c>
	//   60  122:invokevirtual   #128 <Method IRobotModel IRobotApplication.h()>
	//   61  125:aload_1         
	//   62  126:invokevirtual   #706 <Method AssetId ConnectionStateEvent.assetId()>
	//   63  129:invokevirtual   #389 <Method String AssetId.getId()>
	//   64  132:invokevirtual   #211 <Method a IRobotModel.d(String)>
	//   65  135:astore          4
		static class _cls3
		{

			static final int a[];
			static final int b[];

			static 
			{
				b = new int[NetworkState.values().length];
			//    0    0:invokestatic    #19  <Method NetworkState[] NetworkState.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] b>
				try
				{
					b[NetworkState.Connected.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] b>
			//    5   12:getstatic       #25  <Field NetworkState NetworkState.Connected>
			//    6   15:invokevirtual   #29  <Method int NetworkState.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] b>
			//*  10   23:getstatic       #32  <Field NetworkState NetworkState.Connecting>
			//*  11   26:invokevirtual   #29  <Method int NetworkState.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #21  <Field int[] b>
			//*  15   34:getstatic       #35  <Field NetworkState NetworkState.Disconnected>
			//*  16   37:invokevirtual   #29  <Method int NetworkState.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #21  <Field int[] b>
			//*  20   45:getstatic       #38  <Field NetworkState NetworkState.Error>
			//*  21   48:invokevirtual   #29  <Method int NetworkState.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:invokestatic    #43  <Method SettingType[] SettingType.values()>
			//*  25   56:arraylength     
			//*  26   57:newarray        int[]
			//*  27   59:putstatic       #45  <Field int[] a>
			//*  28   62:getstatic       #45  <Field int[] a>
			//*  29   65:getstatic       #49  <Field SettingType SettingType.Registered>
			//*  30   68:invokevirtual   #50  <Method int SettingType.ordinal()>
			//*  31   71:iconst_1        
			//*  32   72:iastore         
			//*  33   73:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   34   74:astore_0        
				try
				{
					b[NetworkState.Connecting.ordinal()] = 2;
				}
			//*  35   75:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   36   78:astore_0        
				try
				{
					b[NetworkState.Disconnected.ordinal()] = 3;
				}
			//*  37   79:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   38   82:astore_0        
				try
				{
					b[NetworkState.Error.ordinal()] = 4;
				}
			//*  39   83:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   40   86:astore_0        
				a = new int[SettingType.values().length];
				try
				{
					a[SettingType.Registered.ordinal()] = 1;
				}
			//*  41   87:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   42   90:astore_0        
			//*  43   91:return          
			}
		}

		com.irobot.home._cls3.b[networkstate.ordinal()];
	//   66  137:getstatic       #716 <Field int[] com.irobot.home.PickABraavaActivity$3.b>
	//   67  140:aload_3         
	//   68  141:invokevirtual   #719 <Method int NetworkState.ordinal()>
	//   69  144:iaload          
		JVM INSTR tableswitch 1 4: default 176
	//	               1 264
	//	               2 295
	//	               3 207
	//	               4 186;
	//   70  145:tableswitch     1 4: default 176
	//	               1 264
	//	               2 295
	//	               3 207
	//	               4 186
		   goto _L1 _L2 _L3 _L4 _L5
_L3:
		break MISSING_BLOCK_LABEL_295;
_L1:
		com.irobot.home.util.o.e("PickABraava", "Got an invalid current connection.");
	//   71  176:ldc2            #277 <String "PickABraava">
	//   72  179:ldc2            #721 <String "Got an invalid current connection.">
	//   73  182:invokestatic    #284 <Method void o.e(String, String)>
		return;
	//   74  185:return          
_L5:
		g.setVisibility(4);
	//   75  186:aload_0         
	//   76  187:getfield        #243 <Field FrameLayout g>
	//   77  190:iconst_4        
	//   78  191:invokevirtual   #249 <Method void FrameLayout.setVisibility(int)>
		if(d.b())
	//*  79  194:aload_0         
	//*  80  195:getfield        #661 <Field AssetSoftwareUpdateUtils d>
	//*  81  198:invokevirtual   #723 <Method boolean AssetSoftwareUpdateUtils.b()>
	//*  82  201:ifne            295
			break MISSING_BLOCK_LABEL_295;
	//   83  204:goto            222
		  goto _L6
_L4:
		g.setVisibility(4);
	//   84  207:aload_0         
	//   85  208:getfield        #243 <Field FrameLayout g>
	//   86  211:iconst_4        
	//   87  212:invokevirtual   #249 <Method void FrameLayout.setVisibility(int)>
		if(!l) goto _L7; else goto _L6
	//   88  215:aload_0         
	//   89  216:getfield        #135 <Field boolean l>
	//   90  219:ifeq            232
_L6:
		a(a1.a());
	//   91  222:aload_0         
	//   92  223:aload           4
	//   93  225:invokevirtual   #150 <Method AssetInfo a.a()>
	//   94  228:invokevirtual   #725 <Method void a(AssetInfo)>
		return;
	//   95  231:return          
_L7:
		if(n == null)
			break MISSING_BLOCK_LABEL_295;
	//   96  232:aload_0         
	//   97  233:getfield        #240 <Field String n>
	//   98  236:ifnull          295
		l();
	//   99  239:aload_0         
	//  100  240:invokespecial   #727 <Method void l()>
		n = null;
	//  101  243:aload_0         
	//  102  244:aconst_null     
	//  103  245:putfield        #240 <Field String n>
		if(o == null) goto _L6; else goto _L8
	//  104  248:aload_0         
	//  105  249:getfield        #178 <Field String o>
	//  106  252:ifnull          222
_L8:
		c(o);
	//  107  255:aload_0         
	//  108  256:aload_0         
	//  109  257:getfield        #178 <Field String o>
	//  110  260:invokespecial   #171 <Method void c(String)>
		return;
	//  111  263:return          
_L2:
		connectionstateevent = ((ConnectionStateEvent) (Assembler.getInstance().getSettingsSubsystem(connectionstateevent.assetId())));
	//  112  264:invokestatic    #217 <Method Assembler Assembler.getInstance()>
	//  113  267:aload_1         
	//  114  268:invokevirtual   #706 <Method AssetId ConnectionStateEvent.assetId()>
	//  115  271:invokevirtual   #731 <Method SettingsSubsystem Assembler.getSettingsSubsystem(AssetId)>
	//  116  274:astore_1        
		((SettingsSubsystem) (connectionstateevent)).registerSubscriber(((SettingsUIServiceDataCallback) (new SettingsUIServiceDataCallback(((SettingsSubsystem) (connectionstateevent)), ((String) (obj))) {

			public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
			{
				if(settingsuiservicedata == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       12
				{
					com.irobot.home.util.o.e("PickABraava", "Service data was null.");
			//    2    4:ldc1            #31  <String "PickABraava">
			//    3    6:ldc1            #33  <String "Service data was null.">
			//    4    8:invokestatic    #39  <Method void o.e(String, String)>
					return;
			//    5   11:return          
				}
				Iterator iterator = settingsuiservicedata.getSettingsChangeList().iterator();
			//    6   12:aload_1         
			//    7   13:invokevirtual   #45  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
			//    8   16:invokevirtual   #51  <Method Iterator HashSet.iterator()>
			//    9   19:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
			//   10   20:aload_2         
			//   11   21:invokeinterface #57  <Method boolean Iterator.hasNext()>
			//   12   26:ifeq            92
					SettingType settingtype = (SettingType)iterator.next();
			//   13   29:aload_2         
			//   14   30:invokeinterface #61  <Method Object Iterator.next()>
			//   15   35:checkcast       #63  <Class SettingType>
			//   16   38:astore_3        
					if(com.irobot.home._cls3.a[settingtype.ordinal()] == 1)
			//*  17   39:getstatic       #68  <Field int[] com.irobot.home.PickABraavaActivity$3.a>
			//*  18   42:aload_3         
			//*  19   43:invokevirtual   #72  <Method int SettingType.ordinal()>
			//*  20   46:iaload          
			//*  21   47:iconst_1        
			//*  22   48:icmpeq          54
			//*  23   51:goto            20
					{
						a.unregisterSubscriber(((SettingsUIServiceDataCallback) (this)));
			//   24   54:aload_0         
			//   25   55:getfield        #21  <Field SettingsSubsystem a>
			//   26   58:aload_0         
			//   27   59:invokevirtual   #78  <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
			//   28   62:pop             
						com.irobot.home.PickABraavaActivity.a(c, settingsuiservicedata.getBooleanSetting(SettingType.Registered));
			//   29   63:aload_0         
			//   30   64:getfield        #19  <Field PickABraavaActivity c>
			//   31   67:aload_1         
			//   32   68:getstatic       #82  <Field SettingType SettingType.Registered>
			//   33   71:invokevirtual   #86  <Method boolean SettingsUIServiceData.getBooleanSetting(SettingType)>
			//   34   74:invokestatic    #89  <Method boolean com.irobot.home.PickABraavaActivity.a(PickABraavaActivity, boolean)>
			//   35   77:pop             
						c.a(b);
			//   36   78:aload_0         
			//   37   79:getfield        #19  <Field PickABraavaActivity c>
			//   38   82:aload_0         
			//   39   83:getfield        #23  <Field String b>
			//   40   86:invokevirtual   #92  <Method void com.irobot.home.PickABraavaActivity.a(String)>
					}
				} while(true);
			//   41   89:goto            20
			//   42   92:return          
			}

			final SettingsSubsystem a;
			final String b;
			final PickABraavaActivity c;

			
			{
				c = PickABraavaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PickABraavaActivity c>
				a = settingssubsystem;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SettingsSubsystem a>
				b = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void SettingsUIServiceDataCallback()>
			//   11   19:return          
			}
		}
)));
	//  117  275:aload_1         
	//  118  276:new             #32  <Class PickABraavaActivity$9>
	//  119  279:dup             
	//  120  280:aload_0         
	//  121  281:aload_1         
	//  122  282:aload_2         
	//  123  283:invokespecial   #734 <Method void PickABraavaActivity$9(PickABraavaActivity, SettingsSubsystem, String)>
	//  124  286:invokevirtual   #740 <Method boolean SettingsSubsystem.registerSubscriber(SettingsUIServiceDataCallback)>
	//  125  289:pop             
		o = null;
	//  126  290:aload_0         
	//  127  291:aconst_null     
	//  128  292:putfield        #178 <Field String o>
	//  129  295:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
	{
		if(i1 < h.size())
	//*   0    0:iload_3         
	//*   1    1:aload_0         
	//*   2    2:getfield        #73  <Field List h>
	//*   3    5:invokeinterface #429 <Method int List.size()>
	//*   4   10:icmpge          134
		{
			adapterview = ((AdapterView) ((String)h.get(i1)));
	//    5   13:aload_0         
	//    6   14:getfield        #73  <Field List h>
	//    7   17:iload_3         
	//    8   18:invokeinterface #745 <Method Object List.get(int)>
	//    9   23:checkcast       #330 <Class String>
	//   10   26:astore_1        
			view = ((View) (c.h().d(((String) (adapterview)))));
	//   11   27:aload_0         
	//   12   28:getfield        #123 <Field IRobotApplication c>
	//   13   31:invokevirtual   #128 <Method IRobotModel IRobotApplication.h()>
	//   14   34:aload_1         
	//   15   35:invokevirtual   #211 <Method a IRobotModel.d(String)>
	//   16   38:astore_2        
			junit.b.a.a("Model asset must be of type Braava.", AssetCapabilityUtils.isNonCloudCapableMoppingRobot(((a) (view)).a()));
	//   17   39:ldc2            #747 <String "Model asset must be of type Braava.">
	//   18   42:aload_2         
	//   19   43:invokevirtual   #150 <Method AssetInfo a.a()>
	//   20   46:invokestatic    #753 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//   21   49:invokestatic    #758 <Method void junit.b.a.a(String, boolean)>
			b(((d)view).a().getName());
	//   22   52:aload_0         
	//   23   53:aload_2         
	//   24   54:checkcast       #760 <Class d>
	//   25   57:invokevirtual   #761 <Method AssetInfo d.a()>
	//   26   60:invokevirtual   #156 <Method String AssetInfo.getName()>
	//   27   63:invokevirtual   #763 <Method void b(String)>
			view = ((View) (com.irobot.home.util.j.j()));
	//   28   66:invokestatic    #766 <Method a j.j()>
	//   29   69:astore_2        
			if(view != null && AssetCapabilityUtils.isNonCloudCapableMoppingRobot(((a) (view)).a()) && a.a(((a) (view)).b().getId()))
	//*  30   70:aload_2         
	//*  31   71:ifnull          129
	//*  32   74:aload_2         
	//*  33   75:invokevirtual   #150 <Method AssetInfo a.a()>
	//*  34   78:invokestatic    #753 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*  35   81:ifeq            129
	//*  36   84:aload_0         
	//*  37   85:getfield        #183 <Field com.irobot.home.q.b a>
	//*  38   88:aload_2         
	//*  39   89:invokevirtual   #476 <Method AssetId a.b()>
	//*  40   92:invokevirtual   #389 <Method String AssetId.getId()>
	//*  41   95:invokevirtual   #768 <Method boolean com.irobot.home.q.b.a(String)>
	//*  42   98:ifeq            129
			{
				o = ((String) (adapterview));
	//   43  101:aload_0         
	//   44  102:aload_1         
	//   45  103:putfield        #178 <Field String o>
				d(((a) (view)).b().getId());
	//   46  106:aload_0         
	//   47  107:aload_2         
	//   48  108:invokevirtual   #476 <Method AssetId a.b()>
	//   49  111:invokevirtual   #389 <Method String AssetId.getId()>
	//   50  114:invokespecial   #180 <Method void d(String)>
				g(((a) (view)).b().getId());
	//   51  117:aload_0         
	//   52  118:aload_2         
	//   53  119:invokevirtual   #476 <Method AssetId a.b()>
	//   54  122:invokevirtual   #389 <Method String AssetId.getId()>
	//   55  125:invokespecial   #121 <Method void g(String)>
				return;
	//   56  128:return          
			}
			c(((String) (adapterview)));
	//   57  129:aload_0         
	//   58  130:aload_1         
	//   59  131:invokespecial   #171 <Method void c(String)>
		}
	//   60  134:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #775 <Method void BaseListActivity.onPause()>
		if(p != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #85  <Field BluetoothStateReceiver p>
	//*   4    8:ifnull          58
			try
			{
				unregisterReceiver(((android.content.BroadcastReceiver) (p)));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #85  <Field BluetoothStateReceiver p>
	//    8   16:invokevirtual   #779 <Method void unregisterReceiver(android.content.BroadcastReceiver)>
			}
	//*   9   19:goto            58
			catch(IllegalArgumentException illegalargumentexception)
	//*  10   22:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #484 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #485 <Method void StringBuilder()>
	//   14   30:astore_2        
				stringbuilder.append("Failed to unregister receiver: ");
	//   15   31:aload_2         
	//   16   32:ldc2            #781 <String "Failed to unregister receiver: ">
	//   17   35:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
				stringbuilder.append(illegalargumentexception.getMessage());
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #784 <Method String IllegalArgumentException.getMessage()>
	//   22   44:invokevirtual   #491 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				com.irobot.home.util.o.e("PickABraava", stringbuilder.toString());
	//   24   48:ldc2            #277 <String "PickABraava">
	//   25   51:aload_2         
	//   26   52:invokevirtual   #506 <Method String StringBuilder.toString()>
	//   27   55:invokestatic    #284 <Method void o.e(String, String)>
			}
		l();
	//   28   58:aload_0         
	//   29   59:invokespecial   #727 <Method void l()>
		k();
	//   30   62:aload_0         
	//   31   63:invokespecial   #176 <Method void k()>
	//   32   66:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #787 <Method void BaseListActivity.onResume()>
		if(i() && com.irobot.home.util.j.j(((android.content.Context) (this))))
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #789 <Method boolean i()>
	//*   4    8:ifeq            25
	//*   5   11:aload_0         
	//*   6   12:invokestatic    #440 <Method boolean j.j(android.content.Context)>
	//*   7   15:ifeq            25
			s.dismiss();
	//    8   18:aload_0         
	//    9   19:getfield        #77  <Field AlertDialog s>
	//   10   22:invokevirtual   #792 <Method void AlertDialog.dismiss()>
		if(j() && !l && !m && !q && !i())
	//*  11   25:aload_0         
	//*  12   26:invokespecial   #574 <Method boolean j()>
	//*  13   29:ifeq            64
	//*  14   32:aload_0         
	//*  15   33:getfield        #135 <Field boolean l>
	//*  16   36:ifne            64
	//*  17   39:aload_0         
	//*  18   40:getfield        #137 <Field boolean m>
	//*  19   43:ifne            64
	//*  20   46:aload_0         
	//*  21   47:getfield        #173 <Field boolean q>
	//*  22   50:ifne            64
	//*  23   53:aload_0         
	//*  24   54:invokespecial   #789 <Method boolean i()>
	//*  25   57:ifne            64
			d();
	//   26   60:aload_0         
	//   27   61:invokevirtual   #576 <Method void d()>
	//   28   64:return          
	}

	public void x()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #576 <Method void d()>
	//    2    4:return          
	}

	IRobotApplication c;
	AssetSoftwareUpdateUtils d;
	View e;
	Button f;
	FrameLayout g;
	List h;
	private ab i;
	private com.irobot.home.i.a j;
	private boolean k;
	private boolean l;
	private boolean m;
	private String n;
	private String o;
	private BluetoothStateReceiver p;
	private boolean q;
	private boolean r;
	private AlertDialog s;
	private BluetoothAdapter t;
}
