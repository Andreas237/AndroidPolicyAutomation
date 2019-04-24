// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.app.Fragment;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.irobot.core.AdvancedWifiSettings;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetSSID;
import com.irobot.core.AssetSetupUIService;
import com.irobot.core.AssetSetupUIServiceCommand;
import com.irobot.core.AssetSetupUIServiceData;
import com.irobot.core.AssetSetupUIServiceDataCallback;
import com.irobot.core.AssetSetupUIServiceViewState;
import com.irobot.core.DiscoveredAsset;
import com.irobot.core.DiscoveredWifiAsset;
import com.irobot.core.DiscoveryAttributeKey;
import com.irobot.core.DiscoveryType;
import com.irobot.core.Error;
import com.irobot.core.EventType;
import com.irobot.core.NetworkAddress;
import com.irobot.core.NetworkSSID;
import com.irobot.core.OnDemandOTAEntryType;
import com.irobot.core.OnDemandOTAPathType;
import com.irobot.core.ProvisioningStep;
import com.irobot.core.ProvisioningType;
import com.irobot.core.RobotPasswordEvent;
import com.irobot.core.SkuType;
import com.irobot.core.SkuUtils;
import com.irobot.core.SoftwareVersion;
import com.irobot.core.TypeDiscoveryAttribute;
import com.irobot.core.V1ProvisioningError;
import com.irobot.core.WifiProvisioningStatus;
import com.irobot.home.fragments.CheckRemoteConnectionFragment;
import com.irobot.home.fragments.CheckRemoteConnectionFragment_;
import com.irobot.home.fragments.aa;
import com.irobot.home.fragments.af;
import com.irobot.home.fragments.b;
import com.irobot.home.fragments.bd;
import com.irobot.home.fragments.bq;
import com.irobot.home.fragments.br;
import com.irobot.home.fragments.bu;
import com.irobot.home.fragments.bv;
import com.irobot.home.fragments.bw;
import com.irobot.home.fragments.bx;
import com.irobot.home.fragments.c;
import com.irobot.home.fragments.d;
import com.irobot.home.fragments.m;
import com.irobot.home.fragments.n;
import com.irobot.home.fragments.y;
import com.irobot.home.fragments.z;
import com.irobot.home.i.a;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.NetworkSettings;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotSystem;
import com.irobot.home.model.WifiConfig;
import com.irobot.home.model.w;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.BluetoothStateReceiver;
import com.irobot.home.util.ab;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.util.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.irobot.home:
//			WizardFragmentActivity, IRobotApplication, CustomerRegistrationActivity_, WebViewActivity_, 
//			OnDemandOtaActivity_

public class BroadcastSetupActivity extends WizardFragmentActivity
	implements com.irobot.home.fragments.CheckRemoteConnectionFragment.a, com.irobot.home.fragments.bc.a, com.irobot.home.util.BluetoothStateReceiver.a
{
	private class a extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			if(intent.getAction().equals("android.net.wifi.SCAN_RESULTS"))
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #27  <Method String Intent.getAction()>
		//*   2    4:ldc1            #29  <String "android.net.wifi.SCAN_RESULTS">
		//*   3    6:invokevirtual   #35  <Method boolean String.equals(Object)>
		//*   4    9:ifeq            89
			{
				com.irobot.home.BroadcastSetupActivity.a(a, a.C.getScanResults());
		//    5   12:aload_0         
		//    6   13:getfield        #12  <Field BroadcastSetupActivity a>
		//    7   16:aload_0         
		//    8   17:getfield        #12  <Field BroadcastSetupActivity a>
		//    9   20:getfield        #39  <Field WifiManager BroadcastSetupActivity.C>
		//   10   23:invokevirtual   #45  <Method List WifiManager.getScanResults()>
		//   11   26:invokestatic    #48  <Method List com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, List)>
		//   12   29:pop             
				if(!NetworkSSID.create(a.J.b()).isLikely5GhzNetwork() && (com.irobot.home.BroadcastSetupActivity.b(a) || com.irobot.home.BroadcastSetupActivity.c(a).isEmpty()))
		//*  13   30:aload_0         
		//*  14   31:getfield        #12  <Field BroadcastSetupActivity a>
		//*  15   34:getfield        #52  <Field WifiConfig BroadcastSetupActivity.J>
		//*  16   37:invokevirtual   #57  <Method String WifiConfig.b()>
		//*  17   40:invokestatic    #63  <Method NetworkSSID NetworkSSID.create(String)>
		//*  18   43:invokevirtual   #67  <Method boolean NetworkSSID.isLikely5GhzNetwork()>
		//*  19   46:ifne            82
		//*  20   49:aload_0         
		//*  21   50:getfield        #12  <Field BroadcastSetupActivity a>
		//*  22   53:invokestatic    #70  <Method boolean com.irobot.home.BroadcastSetupActivity.b(BroadcastSetupActivity)>
		//*  23   56:ifne            74
		//*  24   59:aload_0         
		//*  25   60:getfield        #12  <Field BroadcastSetupActivity a>
		//*  26   63:invokestatic    #74  <Method List com.irobot.home.BroadcastSetupActivity.c(BroadcastSetupActivity)>
		//*  27   66:invokeinterface #79  <Method boolean List.isEmpty()>
		//*  28   71:ifeq            82
				{
					com.irobot.home.BroadcastSetupActivity.d(a);
		//   29   74:aload_0         
		//   30   75:getfield        #12  <Field BroadcastSetupActivity a>
		//   31   78:invokestatic    #82  <Method void com.irobot.home.BroadcastSetupActivity.d(BroadcastSetupActivity)>
					return;
		//   32   81:return          
				}
				BroadcastSetupActivity.e(a);
		//   33   82:aload_0         
		//   34   83:getfield        #12  <Field BroadcastSetupActivity a>
		//   35   86:invokestatic    #85  <Method void BroadcastSetupActivity.e(BroadcastSetupActivity)>
			}
		//   36   89:return          
		}

		final BroadcastSetupActivity a;

		private a()
		{
			a = BroadcastSetupActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field BroadcastSetupActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
		//    5    9:return          
		}

	}


	public BroadcastSetupActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method void WizardFragmentActivity()>
		L = com.irobot.home.util.j.i(((Context) (this)));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #166 <Method CustomerCareRestClient j.i(Context)>
	//    5    9:putfield        #168 <Field CustomerCareRestClient L>
		Q = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #170 <Field boolean Q>
		W = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #172 <Field boolean W>
		X = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #174 <Field boolean X>
		aa = null;
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:putfield        #176 <Field AlertDialog aa>
		ab = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #178 <Field AlertDialog ab>
		ac = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #180 <Field BluetoothStateReceiver ac>
		ad = null;
	//   24   42:aload_0         
	//   25   43:aconst_null     
	//   26   44:putfield        #182 <Field BluetoothAdapter ad>
		ae = null;
	//   27   47:aload_0         
	//   28   48:aconst_null     
	//   29   49:putfield        #184 <Field AlertDialog ae>
		af = new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				if(a.K instanceof bu)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field BroadcastSetupActivity a>
			//*   2    4:getfield        #24  <Field Fragment BroadcastSetupActivity.K>
			//*   3    7:instanceof      #26  <Class bu>
			//*   4   10:ifeq            27
				{
					((bu)a.K).b();
			//    5   13:aload_0         
			//    6   14:getfield        #14  <Field BroadcastSetupActivity a>
			//    7   17:getfield        #24  <Field Fragment BroadcastSetupActivity.K>
			//    8   20:checkcast       #26  <Class bu>
			//    9   23:invokevirtual   #29  <Method void bu.b()>
					return;
			//   10   26:return          
				}
				com.irobot.home.util.j.a(4, "Current fragment not the expected SetupNetworkFragment type.");
			//   11   27:iconst_4        
			//   12   28:ldc1            #31  <String "Current fragment not the expected SetupNetworkFragment type.">
			//   13   30:invokestatic    #36  <Method void j.a(int, String)>
				com.irobot.home.util.o.c(a.w, "Current fragment not the expected SetupNetworkFragment type.");
			//   14   33:aload_0         
			//   15   34:getfield        #14  <Field BroadcastSetupActivity a>
			//   16   37:getfield        #40  <Field String com.irobot.home.BroadcastSetupActivity.w>
			//   17   40:ldc1            #31  <String "Current fragment not the expected SetupNetworkFragment type.">
			//   18   42:invokestatic    #46  <Method void o.c(String, String)>
				if(com.irobot.home.BroadcastSetupActivity.a(a) != null && com.irobot.home.BroadcastSetupActivity.a(a).isShowing())
			//*  19   45:aload_0         
			//*  20   46:getfield        #14  <Field BroadcastSetupActivity a>
			//*  21   49:invokestatic    #49  <Method AlertDialog com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity)>
			//*  22   52:ifnull          78
			//*  23   55:aload_0         
			//*  24   56:getfield        #14  <Field BroadcastSetupActivity a>
			//*  25   59:invokestatic    #49  <Method AlertDialog com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity)>
			//*  26   62:invokevirtual   #55  <Method boolean AlertDialog.isShowing()>
			//*  27   65:ifeq            78
					com.irobot.home.BroadcastSetupActivity.a(a).dismiss();
			//   28   68:aload_0         
			//   29   69:getfield        #14  <Field BroadcastSetupActivity a>
			//   30   72:invokestatic    #49  <Method AlertDialog com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity)>
			//   31   75:invokevirtual   #58  <Method void AlertDialog.dismiss()>
			//   32   78:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   30   52:aload_0         
	//   31   53:new             #12  <Class BroadcastSetupActivity$1>
	//   32   56:dup             
	//   33   57:aload_0         
	//   34   58:invokespecial   #187 <Method void BroadcastSetupActivity$1(BroadcastSetupActivity)>
	//   35   61:putfield        #189 <Field android.content.DialogInterface$OnClickListener af>
		ah = null;
	//   36   64:aload_0         
	//   37   65:aconst_null     
	//   38   66:putfield        #191 <Field Fragment ah>
		ai = -1;
	//   39   69:aload_0         
	//   40   70:iconst_m1       
	//   41   71:putfield        #193 <Field int ai>
		aj = new a();
	//   42   74:aload_0         
	//   43   75:new             #78  <Class BroadcastSetupActivity$a>
	//   44   78:dup             
	//   45   79:aload_0         
	//   46   80:aconst_null     
	//   47   81:invokespecial   #196 <Method void BroadcastSetupActivity$a(BroadcastSetupActivity, BroadcastSetupActivity$1)>
	//   48   84:putfield        #198 <Field BroadcastSetupActivity$a aj>
		ak = null;
	//   49   87:aload_0         
	//   50   88:aconst_null     
	//   51   89:putfield        #200 <Field List ak>
		am = ((Map) (new HashMap()));
	//   52   92:aload_0         
	//   53   93:new             #202 <Class HashMap>
	//   54   96:dup             
	//   55   97:invokespecial   #203 <Method void HashMap()>
	//   56  100:putfield        #205 <Field Map am>
		ap = null;
	//   57  103:aload_0         
	//   58  104:aconst_null     
	//   59  105:putfield        #207 <Field String ap>
		as = true;
	//   60  108:aload_0         
	//   61  109:iconst_1        
	//   62  110:putfield        #209 <Field boolean as>
		at = false;
	//   63  113:aload_0         
	//   64  114:iconst_0        
	//   65  115:putfield        #211 <Field boolean at>
		au = 0x7f0e01ff;
	//   66  118:aload_0         
	//   67  119:ldc1            #212 <Int 0x7f0e01ff>
	//   68  121:putfield        #214 <Field int au>
		av = 0x7f0e01f9;
	//   69  124:aload_0         
	//   70  125:ldc1            #215 <Int 0x7f0e01f9>
	//   71  127:putfield        #217 <Field int av>
		aw = 0x7f0e01fa;
	//   72  130:aload_0         
	//   73  131:ldc1            #218 <Int 0x7f0e01fa>
	//   74  133:putfield        #220 <Field int aw>
		ax = 0x7f0e0205;
	//   75  136:aload_0         
	//   76  137:ldc1            #221 <Int 0x7f0e0205>
	//   77  139:putfield        #223 <Field int ax>
		ay = 0x7f0e0203;
	//   78  142:aload_0         
	//   79  143:ldc1            #224 <Int 0x7f0e0203>
	//   80  145:putfield        #226 <Field int ay>
		az = 0x7f0e0202;
	//   81  148:aload_0         
	//   82  149:ldc1            #227 <Int 0x7f0e0202>
	//   83  151:putfield        #229 <Field int az>
		aA = 0x7f0f005a;
	//   84  154:aload_0         
	//   85  155:ldc1            #230 <Int 0x7f0f005a>
	//   86  157:putfield        #232 <Field int aA>
		aB = true;
	//   87  160:aload_0         
	//   88  161:iconst_1        
	//   89  162:putfield        #234 <Field boolean aB>
		aC = SkuType.Unknown;
	//   90  165:aload_0         
	//   91  166:getstatic       #239 <Field SkuType SkuType.Unknown>
	//   92  169:putfield        #241 <Field SkuType aC>
	//   93  172:aload_0         
	//   94  173:new             #62  <Class BroadcastSetupActivity$3>
	//   95  176:dup             
	//   96  177:aload_0         
	//   97  178:invokespecial   #242 <Method void BroadcastSetupActivity$3(BroadcastSetupActivity)>
	//   98  181:putfield        #244 <Field AssetSetupUIServiceDataCallback g>
	//   99  184:return          
	}

	private void O()
	{
		x = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #247 <Field int x>
		as = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #209 <Field boolean as>
		B = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #251 <Field ScanResult B>
		E = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #254 <Field boolean E>
		F = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #257 <Field boolean F>
		J = new WifiConfig();
	//   15   25:aload_0         
	//   16   26:new             #259 <Class WifiConfig>
	//   17   29:dup             
	//   18   30:invokespecial   #260 <Method void WifiConfig()>
	//   19   33:putfield        #264 <Field WifiConfig J>
		J.a(1);
	//   20   36:aload_0         
	//   21   37:getfield        #264 <Field WifiConfig J>
	//   22   40:iconst_1        
	//   23   41:invokevirtual   #267 <Method void WifiConfig.a(int)>
		Q();
	//   24   44:aload_0         
	//   25   45:invokespecial   #269 <Method void Q()>
		M = true;
	//   26   48:aload_0         
	//   27   49:iconst_1        
	//   28   50:putfield        #271 <Field boolean M>
		AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//   29   53:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//   30   56:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   31   59:astore_1        
		if(assetsetupuiservice != null)
	//*  32   60:aload_1         
	//*  33   61:ifnull          72
			assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.CancelProvisioning, ((AssetSetupUIServiceData) (null)));
	//   34   64:aload_1         
	//   35   65:getstatic       #287 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.CancelProvisioning>
	//   36   68:aconst_null     
	//   37   69:invokevirtual   #293 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
	//   38   72:return          
	}

	private void P()
	{
		String s1 = com.irobot.home.util.j.a(aC, getResources());
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field SkuType aC>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #297 <Method Resources getResources()>
	//    4    8:invokestatic    #300 <Method String j.a(SkuType, Resources)>
	//    5   11:astore_1        
		(new android.app.AlertDialog.Builder(((Context) (this)))).setTitle(0x7f0f02aa).setMessage(((CharSequence) (getString(0x7f0f07ad, new Object[] {
			s1
		})))).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				BroadcastSetupActivity.h(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:invokestatic    #25  <Method void BroadcastSetupActivity.h(BroadcastSetupActivity)>
				a.finish();
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field BroadcastSetupActivity a>
			//    5   11:invokevirtual   #28  <Method void BroadcastSetupActivity.finish()>
			//    6   14:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setNegativeButton(0x7f0f04d3, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    6   12:new             #302 <Class android.app.AlertDialog$Builder>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #305 <Method void android.app.AlertDialog$Builder(Context)>
	//   10   20:ldc2            #306 <Int 0x7f0f02aa>
	//   11   23:invokevirtual   #310 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   12   26:aload_0         
	//   13   27:ldc2            #311 <Int 0x7f0f07ad>
	//   14   30:iconst_1        
	//   15   31:anewarray       Object[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:aload_1         
	//   19   37:aastore         
	//   20   38:invokevirtual   #317 <Method String getString(int, Object[])>
	//   21   41:invokevirtual   #321 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   22   44:ldc2            #322 <Int 0x7f0f0986>
	//   23   47:new             #40  <Class BroadcastSetupActivity$20>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:invokespecial   #323 <Method void BroadcastSetupActivity$20(BroadcastSetupActivity)>
	//   27   55:invokevirtual   #327 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   28   58:ldc2            #328 <Int 0x7f0f04d3>
	//   29   61:aconst_null     
	//   30   62:invokevirtual   #331 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   31   65:invokevirtual   #335 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   32   68:pop             
	//   33   69:return          
	}

	private void Q()
	{
		I = com.irobot.home.util.j.m(((Context) (this)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #339 <Method WifiInfo j.m(Context)>
	//    3    5:putfield        #342 <Field WifiInfo I>
		if(I != null && !TextUtils.isEmpty(((CharSequence) (I.getSSID()))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #342 <Field WifiInfo I>
	//*   6   12:ifnull          71
	//*   7   15:aload_0         
	//*   8   16:getfield        #342 <Field WifiInfo I>
	//*   9   19:invokevirtual   #348 <Method String WifiInfo.getSSID()>
	//*  10   22:invokestatic    #354 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   25:ifne            71
		{
			String s1 = com.irobot.home.util.j.e(I.getSSID());
	//   12   28:aload_0         
	//   13   29:getfield        #342 <Field WifiInfo I>
	//   14   32:invokevirtual   #348 <Method String WifiInfo.getSSID()>
	//   15   35:invokestatic    #357 <Method String j.e(String)>
	//   16   38:astore_1        
			J.a(s1);
	//   17   39:aload_0         
	//   18   40:getfield        #264 <Field WifiConfig J>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #360 <Method void WifiConfig.a(String)>
			AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//   21   47:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//   22   50:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   23   53:astore_2        
			AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
	//   24   54:invokestatic    #366 <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//   25   57:astore_3        
			assetsetupuiservicedata.setHomeWifiSsid(s1);
	//   26   58:aload_3         
	//   27   59:aload_1         
	//   28   60:invokevirtual   #369 <Method void AssetSetupUIServiceData.setHomeWifiSsid(String)>
			assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.UpdateServiceData, assetsetupuiservicedata);
	//   29   63:aload_2         
	//   30   64:getstatic       #372 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.UpdateServiceData>
	//   31   67:aload_3         
	//   32   68:invokevirtual   #293 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
		}
	//   33   71:return          
	}

	private Fragment R()
	{
		c(0x7f0f0778);
	//    0    0:aload_0         
	//    1    1:ldc2            #374 <Int 0x7f0f0778>
	//    2    4:invokevirtual   #376 <Method void c(int)>
		j.setProgress(ay());
	//    3    7:aload_0         
	//    4    8:getfield        #380 <Field ProgressBar j>
	//    5   11:aload_0         
	//    6   12:invokespecial   #383 <Method int ay()>
	//    7   15:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		a(0, 8, 0x7f0f0235, 0x7f0800c8);
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:bipush          8
	//   11   22:ldc2            #389 <Int 0x7f0f0235>
	//   12   25:ldc2            #390 <Int 0x7f0800c8>
	//   13   28:invokevirtual   #393 <Method void a(int, int, int, int)>
		com.irobot.home.fragments.x x1 = com.irobot.home.fragments.y.b().a();
	//   14   31:invokestatic    #398 <Method com.irobot.home.fragments.y$a y.b()>
	//   15   34:invokevirtual   #403 <Method com.irobot.home.fragments.x com.irobot.home.fragments.y$a.a()>
	//   16   37:astore_1        
		ai = -1;
	//   17   38:aload_0         
	//   18   39:iconst_m1       
	//   19   40:putfield        #193 <Field int ai>
		if(a(2))
	//*  20   43:aload_0         
	//*  21   44:iconst_2        
	//*  22   45:invokespecial   #406 <Method boolean a(int)>
	//*  23   48:ifeq            69
			am.put(((Object) (Integer.valueOf(2))), ((Object) (Boolean.valueOf(true))));
	//   24   51:aload_0         
	//   25   52:getfield        #205 <Field Map am>
	//   26   55:iconst_2        
	//   27   56:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   28   59:iconst_1        
	//   29   60:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   30   63:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   31   68:pop             
		m.setEnabled(false);
	//   32   69:aload_0         
	//   33   70:getfield        #426 <Field Button m>
	//   34   73:iconst_0        
	//   35   74:invokevirtual   #432 <Method void Button.setEnabled(boolean)>
		return ((Fragment) (x1));
	//   36   77:aload_1         
	//   37   78:areturn         
	}

	private Fragment S()
	{
		j.setProgress(ay());
	//    0    0:aload_0         
	//    1    1:getfield        #380 <Field ProgressBar j>
	//    2    4:aload_0         
	//    3    5:invokespecial   #383 <Method int ay()>
	//    4    8:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		if(!V)
	//*   5   11:aload_0         
	//*   6   12:getfield        #434 <Field boolean V>
	//*   7   15:ifne            22
			Q();
	//    8   18:aload_0         
	//    9   19:invokespecial   #269 <Method void Q()>
		m m1 = com.irobot.home.fragments.n.b().a(J).a(V ^ true).a();
	//   10   22:invokestatic    #439 <Method com.irobot.home.fragments.n$a n.b()>
	//   11   25:aload_0         
	//   12   26:getfield        #264 <Field WifiConfig J>
	//   13   29:invokevirtual   #444 <Method com.irobot.home.fragments.n$a com.irobot.home.fragments.n$a.a(WifiConfig)>
	//   14   32:aload_0         
	//   15   33:getfield        #434 <Field boolean V>
	//   16   36:iconst_1        
	//   17   37:ixor            
	//   18   38:invokevirtual   #447 <Method com.irobot.home.fragments.n$a com.irobot.home.fragments.n$a.a(boolean)>
	//   19   41:invokevirtual   #450 <Method m com.irobot.home.fragments.n$a.a()>
	//   20   44:astore_1        
		ai = -1;
	//   21   45:aload_0         
	//   22   46:iconst_m1       
	//   23   47:putfield        #193 <Field int ai>
		m1.a(new com.irobot.home.fragments.m.a() {

			public void a(boolean flag, boolean flag1)
			{
				if(flag1)
			//*   0    0:iload_2         
			//*   1    1:ifeq            131
				{
					if(flag)
			//*   2    4:iload_1         
			//*   3    5:ifeq            91
					{
						AssetSetupUIServiceData assetsetupuiservicedata = Assembler.getInstance().getAssetSetupUIService().getServiceData();
			//    4    8:invokestatic    #40  <Method Assembler Assembler.getInstance()>
			//    5   11:invokevirtual   #44  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
			//    6   14:invokevirtual   #50  <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
			//    7   17:astore_3        
						b.a(b.getString(0x7f0f080f, new Object[] {
							assetsetupuiservicedata.getAssetName()
						}));
			//    8   18:aload_0         
			//    9   19:getfield        #27  <Field BroadcastSetupActivity b>
			//   10   22:aload_0         
			//   11   23:getfield        #27  <Field BroadcastSetupActivity b>
			//   12   26:ldc1            #51  <Int 0x7f0f080f>
			//   13   28:iconst_1        
			//   14   29:anewarray       Object[]
			//   15   32:dup             
			//   16   33:iconst_0        
			//   17   34:aload_3         
			//   18   35:invokevirtual   #57  <Method String AssetSetupUIServiceData.getAssetName()>
			//   19   38:aastore         
			//   20   39:invokevirtual   #61  <Method String BroadcastSetupActivity.getString(int, Object[])>
			//   21   42:invokevirtual   #64  <Method void com.irobot.home.BroadcastSetupActivity.a(String)>
						b.c.setVisibility(0);
			//   22   45:aload_0         
			//   23   46:getfield        #27  <Field BroadcastSetupActivity b>
			//   24   49:getfield        #68  <Field TextView com.irobot.home.BroadcastSetupActivity.c>
			//   25   52:iconst_0        
			//   26   53:invokevirtual   #74  <Method void TextView.setVisibility(int)>
						b.c.setOnClickListener(new android.view.View.OnClickListener(this) {

							public void onClick(View view)
							{
								a.a = true;
							//    0    0:aload_0         
							//    1    1:getfield        #16  <Field BroadcastSetupActivity$24 a>
							//    2    4:iconst_1        
							//    3    5:putfield        #25  <Field boolean com.irobot.home.BroadcastSetupActivity$24.a>
								a.b.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
							//    4    8:aload_0         
							//    5    9:getfield        #16  <Field BroadcastSetupActivity$24 a>
							//    6   12:getfield        #29  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$24.b>
							//    7   15:new             #31  <Class Intent>
							//    8   18:dup             
							//    9   19:ldc1            #33  <String "android.settings.WIFI_SETTINGS">
							//   10   21:invokespecial   #36  <Method void Intent(String)>
							//   11   24:invokevirtual   #42  <Method void BroadcastSetupActivity.startActivity(Intent)>
							//   12   27:return          
							}

							final _cls24 a;

			
			{
				a = _pcls24;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BroadcastSetupActivity$24 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
						}
);
			//   27   56:aload_0         
			//   28   57:getfield        #27  <Field BroadcastSetupActivity b>
			//   29   60:getfield        #68  <Field TextView com.irobot.home.BroadcastSetupActivity.c>
			//   30   63:new             #13  <Class BroadcastSetupActivity$24$1>
			//   31   66:dup             
			//   32   67:aload_0         
			//   33   68:invokespecial   #77  <Method void BroadcastSetupActivity$24$1(BroadcastSetupActivity$24)>
			//   34   71:invokevirtual   #81  <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
						b.a(0, 8, 0x7f0f0830, 0x7f0800c8);
			//   35   74:aload_0         
			//   36   75:getfield        #27  <Field BroadcastSetupActivity b>
			//   37   78:iconst_0        
			//   38   79:bipush          8
			//   39   81:ldc1            #82  <Int 0x7f0f0830>
			//   40   83:ldc1            #83  <Int 0x7f0800c8>
			//   41   85:invokevirtual   #86  <Method void com.irobot.home.BroadcastSetupActivity.a(int, int, int, int)>
					} else
			//*  42   88:goto            110
					if(!a)
			//*  43   91:aload_0         
			//*  44   92:getfield        #32  <Field boolean a>
			//*  45   95:ifne            110
						b.c.setVisibility(8);
			//   46   98:aload_0         
			//   47   99:getfield        #27  <Field BroadcastSetupActivity b>
			//   48  102:getfield        #68  <Field TextView com.irobot.home.BroadcastSetupActivity.c>
			//   49  105:bipush          8
			//   50  107:invokevirtual   #74  <Method void TextView.setVisibility(int)>
					b.m.setOnClickListener(new android.view.View.OnClickListener(this) {

						public void onClick(View view)
						{
							a.b.n();
						//    0    0:aload_0         
						//    1    1:getfield        #16  <Field BroadcastSetupActivity$24 a>
						//    2    4:getfield        #26  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$24.b>
						//    3    7:invokevirtual   #31  <Method void com.irobot.home.BroadcastSetupActivity.n()>
						//    4   10:return          
						}

						final _cls24 a;

			
			{
				a = _pcls24;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BroadcastSetupActivity$24 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//   51  110:aload_0         
			//   52  111:getfield        #27  <Field BroadcastSetupActivity b>
			//   53  114:getfield        #90  <Field Button com.irobot.home.BroadcastSetupActivity.m>
			//   54  117:new             #15  <Class BroadcastSetupActivity$24$2>
			//   55  120:dup             
			//   56  121:aload_0         
			//   57  122:invokespecial   #91  <Method void BroadcastSetupActivity$24$2(BroadcastSetupActivity$24)>
			//   58  125:invokevirtual   #94  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
				} else
			//*  59  128:goto            225
				{
					Button button;
					android.view.View.OnClickListener onclicklistener;
					if(flag)
			//*  60  131:iload_1         
			//*  61  132:ifeq            192
					{
						b.a(b.getString(0x7f0f081f));
			//   62  135:aload_0         
			//   63  136:getfield        #27  <Field BroadcastSetupActivity b>
			//   64  139:aload_0         
			//   65  140:getfield        #27  <Field BroadcastSetupActivity b>
			//   66  143:ldc1            #95  <Int 0x7f0f081f>
			//   67  145:invokevirtual   #98  <Method String BroadcastSetupActivity.getString(int)>
			//   68  148:invokevirtual   #64  <Method void com.irobot.home.BroadcastSetupActivity.a(String)>
						b.a(0, 8, 0x7f0f0818, 0x7f0800c8);
			//   69  151:aload_0         
			//   70  152:getfield        #27  <Field BroadcastSetupActivity b>
			//   71  155:iconst_0        
			//   72  156:bipush          8
			//   73  158:ldc1            #99  <Int 0x7f0f0818>
			//   74  160:ldc1            #83  <Int 0x7f0800c8>
			//   75  162:invokevirtual   #86  <Method void com.irobot.home.BroadcastSetupActivity.a(int, int, int, int)>
						button = b.m;
			//   76  165:aload_0         
			//   77  166:getfield        #27  <Field BroadcastSetupActivity b>
			//   78  169:getfield        #90  <Field Button com.irobot.home.BroadcastSetupActivity.m>
			//   79  172:astore_3        
						onclicklistener = new android.view.View.OnClickListener(this) {

							public void onClick(View view)
							{
								a.b.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
							//    0    0:aload_0         
							//    1    1:getfield        #16  <Field BroadcastSetupActivity$24 a>
							//    2    4:getfield        #26  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$24.b>
							//    3    7:new             #28  <Class Intent>
							//    4   10:dup             
							//    5   11:ldc1            #30  <String "android.settings.WIFI_SETTINGS">
							//    6   13:invokespecial   #33  <Method void Intent(String)>
							//    7   16:invokevirtual   #39  <Method void BroadcastSetupActivity.startActivity(Intent)>
							//    8   19:return          
							}

							final _cls24 a;

			
			{
				a = _pcls24;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BroadcastSetupActivity$24 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
						}
;
			//   80  173:new             #17  <Class BroadcastSetupActivity$24$3>
			//   81  176:dup             
			//   82  177:aload_0         
			//   83  178:invokespecial   #100 <Method void BroadcastSetupActivity$24$3(BroadcastSetupActivity$24)>
			//   84  181:astore          4
					} else
			//*  85  183:aload_3         
			//*  86  184:aload           4
			//*  87  186:invokevirtual   #94  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			//*  88  189:goto            213
					{
						button = b.m;
			//   89  192:aload_0         
			//   90  193:getfield        #27  <Field BroadcastSetupActivity b>
			//   91  196:getfield        #90  <Field Button com.irobot.home.BroadcastSetupActivity.m>
			//   92  199:astore_3        
						onclicklistener = new android.view.View.OnClickListener(this) {

							public void onClick(View view)
							{
								a.b.n();
							//    0    0:aload_0         
							//    1    1:getfield        #16  <Field BroadcastSetupActivity$24 a>
							//    2    4:getfield        #26  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$24.b>
							//    3    7:invokevirtual   #31  <Method void com.irobot.home.BroadcastSetupActivity.n()>
							//    4   10:return          
							}

							final _cls24 a;

			
			{
				a = _pcls24;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BroadcastSetupActivity$24 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
						}
;
			//   93  200:new             #19  <Class BroadcastSetupActivity$24$4>
			//   94  203:dup             
			//   95  204:aload_0         
			//   96  205:invokespecial   #101 <Method void BroadcastSetupActivity$24$4(BroadcastSetupActivity$24)>
			//   97  208:astore          4
					}
					button.setOnClickListener(onclicklistener);
			//*  98  210:goto            183
					b.c.setVisibility(8);
			//   99  213:aload_0         
			//  100  214:getfield        #27  <Field BroadcastSetupActivity b>
			//  101  217:getfield        #68  <Field TextView com.irobot.home.BroadcastSetupActivity.c>
			//  102  220:bipush          8
			//  103  222:invokevirtual   #74  <Method void TextView.setVisibility(int)>
				}
				a = false;
			//  104  225:aload_0         
			//  105  226:iconst_0        
			//  106  227:putfield        #32  <Field boolean a>
				b.m.setEnabled(true);
			//  107  230:aload_0         
			//  108  231:getfield        #27  <Field BroadcastSetupActivity b>
			//  109  234:getfield        #90  <Field Button com.irobot.home.BroadcastSetupActivity.m>
			//  110  237:iconst_1        
			//  111  238:invokevirtual   #105 <Method void Button.setEnabled(boolean)>
			//  112  241:return          
			}

			boolean a;
			final BroadcastSetupActivity b;

			
			{
				b = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field BroadcastSetupActivity b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #30  <Method void Object()>
				a = false;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #32  <Field boolean a>
			//    8   14:return          
			}
		}
);
	//   24   50:aload_1         
	//   25   51:new             #50  <Class BroadcastSetupActivity$24>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokespecial   #451 <Method void BroadcastSetupActivity$24(BroadcastSetupActivity)>
	//   29   59:invokevirtual   #456 <Method void m.a(com.irobot.home.fragments.m$a)>
		if(a(3))
	//*  30   62:aload_0         
	//*  31   63:iconst_3        
	//*  32   64:invokespecial   #406 <Method boolean a(int)>
	//*  33   67:ifeq            88
			am.put(((Object) (Integer.valueOf(3))), ((Object) (Boolean.valueOf(true))));
	//   34   70:aload_0         
	//   35   71:getfield        #205 <Field Map am>
	//   36   74:iconst_3        
	//   37   75:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   38   78:iconst_1        
	//   39   79:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   40   82:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   41   87:pop             
		return ((Fragment) (m1));
	//   42   88:aload_1         
	//   43   89:areturn         
	}

	private Fragment T()
	{
		O = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #458 <Field boolean O>
		j.setProgress(ay());
	//    3    5:aload_0         
	//    4    6:getfield        #380 <Field ProgressBar j>
	//    5    9:aload_0         
	//    6   10:invokespecial   #383 <Method int ay()>
	//    7   13:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		if(!V)
	//*   8   16:aload_0         
	//*   9   17:getfield        #434 <Field boolean V>
	//*  10   20:ifne            34
		{
			a(0, 8);
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:bipush          8
	//   14   27:invokevirtual   #461 <Method void a(int, int)>
			Q();
	//   15   30:aload_0         
	//   16   31:invokespecial   #269 <Method void Q()>
		}
		a(getString(0x7f0f0816, new Object[] {
			com.irobot.home.util.j.e(J.b())
		}));
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:ldc2            #462 <Int 0x7f0f0816>
	//   20   39:iconst_1        
	//   21   40:anewarray       Object[]
	//   22   43:dup             
	//   23   44:iconst_0        
	//   24   45:aload_0         
	//   25   46:getfield        #264 <Field WifiConfig J>
	//   26   49:invokevirtual   #464 <Method String WifiConfig.b()>
	//   27   52:invokestatic    #357 <Method String j.e(String)>
	//   28   55:aastore         
	//   29   56:invokevirtual   #317 <Method String getString(int, Object[])>
	//   30   59:invokevirtual   #465 <Method void a(String)>
		Object obj = ((Object) (com.irobot.home.fragments.aa.f().a(J).a(M).d(V ^ true)));
	//   31   62:invokestatic    #470 <Method com.irobot.home.fragments.aa$a aa.f()>
	//   32   65:aload_0         
	//   33   66:getfield        #264 <Field WifiConfig J>
	//   34   69:invokevirtual   #475 <Method com.irobot.home.fragments.aa$a com.irobot.home.fragments.aa$a.a(WifiConfig)>
	//   35   72:aload_0         
	//   36   73:getfield        #271 <Field boolean M>
	//   37   76:invokevirtual   #478 <Method com.irobot.home.fragments.aa$a com.irobot.home.fragments.aa$a.a(boolean)>
	//   38   79:aload_0         
	//   39   80:getfield        #434 <Field boolean V>
	//   40   83:iconst_1        
	//   41   84:ixor            
	//   42   85:invokevirtual   #480 <Method com.irobot.home.fragments.aa$a com.irobot.home.fragments.aa$a.d(boolean)>
	//   43   88:astore_2        
		boolean flag;
		if(ai == 3)
	//*  44   89:aload_0         
	//*  45   90:getfield        #193 <Field int ai>
	//*  46   93:iconst_3        
	//*  47   94:icmpne          102
			flag = true;
	//   48   97:iconst_1        
	//   49   98:istore_1        
		else
	//*  50   99:goto            104
			flag = false;
	//   51  102:iconst_0        
	//   52  103:istore_1        
		obj = ((Object) (((com.irobot.home.fragments.aa.a) (obj)).b(flag).c(X).a()));
	//   53  104:aload_2         
	//   54  105:iload_1         
	//   55  106:invokevirtual   #482 <Method com.irobot.home.fragments.aa$a com.irobot.home.fragments.aa$a.b(boolean)>
	//   56  109:aload_0         
	//   57  110:getfield        #174 <Field boolean X>
	//   58  113:invokevirtual   #484 <Method com.irobot.home.fragments.aa$a com.irobot.home.fragments.aa$a.c(boolean)>
	//   59  116:invokevirtual   #487 <Method z com.irobot.home.fragments.aa$a.a()>
	//   60  119:astore_2        
		ai = -1;
	//   61  120:aload_0         
	//   62  121:iconst_m1       
	//   63  122:putfield        #193 <Field int ai>
		((z) (obj)).a(new com.irobot.home.fragments.z.a() {

			public void a(WifiConfig wificonfig)
			{
				a.J = wificonfig;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:aload_1         
			//    3    5:putfield        #26  <Field WifiConfig BroadcastSetupActivity.J>
				BroadcastSetupActivity.f(a, true);
			//    4    8:aload_0         
			//    5    9:getfield        #17  <Field BroadcastSetupActivity a>
			//    6   12:iconst_1        
			//    7   13:invokestatic    #30  <Method boolean BroadcastSetupActivity.f(BroadcastSetupActivity, boolean)>
			//    8   16:pop             
				a.m();
			//    9   17:aload_0         
			//   10   18:getfield        #17  <Field BroadcastSetupActivity a>
			//   11   21:invokevirtual   #33  <Method void com.irobot.home.BroadcastSetupActivity.m()>
			//   12   24:return          
			}

			public void a(WifiConfig wificonfig, boolean flag1, boolean flag2)
			{
				com.irobot.home.BroadcastSetupActivity.b(a, true);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:iconst_1        
			//    3    5:invokestatic    #37  <Method boolean com.irobot.home.BroadcastSetupActivity.b(BroadcastSetupActivity, boolean)>
			//    4    8:pop             
				a.J = wificonfig;
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
			//    7   13:aload_1         
			//    8   14:putfield        #26  <Field WifiConfig BroadcastSetupActivity.J>
				com.irobot.home.BroadcastSetupActivity.c(a, flag2);
			//    9   17:aload_0         
			//   10   18:getfield        #17  <Field BroadcastSetupActivity a>
			//   11   21:iload_3         
			//   12   22:invokestatic    #40  <Method boolean com.irobot.home.BroadcastSetupActivity.c(BroadcastSetupActivity, boolean)>
			//   13   25:pop             
				if(BroadcastSetupActivity.k(a))
			//*  14   26:aload_0         
			//*  15   27:getfield        #17  <Field BroadcastSetupActivity a>
			//*  16   30:invokestatic    #44  <Method boolean BroadcastSetupActivity.k(BroadcastSetupActivity)>
			//*  17   33:ifeq            101
				{
					com.irobot.home.BroadcastSetupActivity.d(a, false);
			//   18   36:aload_0         
			//   19   37:getfield        #17  <Field BroadcastSetupActivity a>
			//   20   40:iconst_0        
			//   21   41:invokestatic    #47  <Method boolean com.irobot.home.BroadcastSetupActivity.d(BroadcastSetupActivity, boolean)>
			//   22   44:pop             
					int i1;
					if(ProvisioningType.Ble == Assembler.getInstance().getAssetSetupUIService().getServiceData().getProvisioningType())
			//*  23   45:getstatic       #53  <Field ProvisioningType ProvisioningType.Ble>
			//*  24   48:invokestatic    #59  <Method Assembler Assembler.getInstance()>
			//*  25   51:invokevirtual   #63  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
			//*  26   54:invokevirtual   #69  <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
			//*  27   57:invokevirtual   #75  <Method ProvisioningType AssetSetupUIServiceData.getProvisioningType()>
			//*  28   60:if_acmpne       81
					{
						wificonfig = ((WifiConfig) (a));
			//   29   63:aload_0         
			//   30   64:getfield        #17  <Field BroadcastSetupActivity a>
			//   31   67:astore_1        
						i1 = 7;
			//   32   68:bipush          7
			//   33   70:istore          4
					} else
			//*  34   72:aload_1         
			//*  35   73:iload           4
			//*  36   75:putfield        #79  <Field int BroadcastSetupActivity.x>
			//*  37   78:goto            93
					{
						wificonfig = ((WifiConfig) (a));
			//   38   81:aload_0         
			//   39   82:getfield        #17  <Field BroadcastSetupActivity a>
			//   40   85:astore_1        
						i1 = 8;
			//   41   86:bipush          8
			//   42   88:istore          4
					}
					wificonfig.x = i1;
			//*  43   90:goto            72
					a.m();
			//   44   93:aload_0         
			//   45   94:getfield        #17  <Field BroadcastSetupActivity a>
			//   46   97:invokevirtual   #33  <Method void com.irobot.home.BroadcastSetupActivity.m()>
					return;
			//   47  100:return          
				}
				if(a.I != null)
			//*  48  101:aload_0         
			//*  49  102:getfield        #17  <Field BroadcastSetupActivity a>
			//*  50  105:getfield        #82  <Field WifiInfo BroadcastSetupActivity.I>
			//*  51  108:ifnull          129
				{
					BroadcastSetupActivity.e(a, flag1 ^ true);
			//   52  111:aload_0         
			//   53  112:getfield        #17  <Field BroadcastSetupActivity a>
			//   54  115:iload_2         
			//   55  116:iconst_1        
			//   56  117:ixor            
			//   57  118:invokestatic    #85  <Method boolean BroadcastSetupActivity.e(BroadcastSetupActivity, boolean)>
			//   58  121:pop             
					a.i();
			//   59  122:aload_0         
			//   60  123:getfield        #17  <Field BroadcastSetupActivity a>
			//   61  126:invokevirtual   #88  <Method void com.irobot.home.BroadcastSetupActivity.i()>
				}
			//   62  129:return          
			}

			public void a(boolean flag1)
			{
				a.b(flag1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:iload_1         
			//    3    5:invokevirtual   #91  <Method void com.irobot.home.BroadcastSetupActivity.b(boolean)>
				BroadcastSetupActivity broadcastsetupactivity = a;
			//    4    8:aload_0         
			//    5    9:getfield        #17  <Field BroadcastSetupActivity a>
			//    6   12:astore_3        
				int i1;
				if(BroadcastSetupActivity.l(a))
			//*   7   13:aload_0         
			//*   8   14:getfield        #17  <Field BroadcastSetupActivity a>
			//*   9   17:invokestatic    #94  <Method boolean BroadcastSetupActivity.l(BroadcastSetupActivity)>
			//*  10   20:ifeq            29
					i1 = 0x7f0f0235;
			//   11   23:ldc1            #95  <Int 0x7f0f0235>
			//   12   25:istore_2        
				else
			//*  13   26:goto            32
					i1 = 0x7f0f0761;
			//   14   29:ldc1            #96  <Int 0x7f0f0761>
			//   15   31:istore_2        
				broadcastsetupactivity.a(0, 8, i1, 0x7f0800c8);
			//   16   32:aload_3         
			//   17   33:iconst_0        
			//   18   34:bipush          8
			//   19   36:iload_2         
			//   20   37:ldc1            #97  <Int 0x7f0800c8>
			//   21   39:invokevirtual   #100 <Method void com.irobot.home.BroadcastSetupActivity.a(int, int, int, int)>
			//   22   42:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   64  125:aload_2         
	//   65  126:new             #60  <Class BroadcastSetupActivity$25>
	//   66  129:dup             
	//   67  130:aload_0         
	//   68  131:invokespecial   #488 <Method void BroadcastSetupActivity$25(BroadcastSetupActivity)>
	//   69  134:invokevirtual   #493 <Method void z.a(com.irobot.home.fragments.z$a)>
		if(a(4))
	//*  70  137:aload_0         
	//*  71  138:iconst_4        
	//*  72  139:invokespecial   #406 <Method boolean a(int)>
	//*  73  142:ifeq            163
			am.put(((Object) (Integer.valueOf(4))), ((Object) (Boolean.valueOf(true))));
	//   74  145:aload_0         
	//   75  146:getfield        #205 <Field Map am>
	//   76  149:iconst_4        
	//   77  150:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   78  153:iconst_1        
	//   79  154:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   80  157:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   81  162:pop             
		m.setEnabled(false);
	//   82  163:aload_0         
	//   83  164:getfield        #426 <Field Button m>
	//   84  167:iconst_0        
	//   85  168:invokevirtual   #432 <Method void Button.setEnabled(boolean)>
		return ((Fragment) (obj));
	//   86  171:aload_2         
	//   87  172:areturn         
	}

	private Fragment U()
	{
		a(0, 8, 0x7f0f00c6, 0x7f0800c8);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:bipush          8
	//    3    4:ldc2            #494 <Int 0x7f0f00c6>
	//    4    7:ldc2            #390 <Int 0x7f0800c8>
	//    5   10:invokevirtual   #393 <Method void a(int, int, int, int)>
		M = true;
	//    6   13:aload_0         
	//    7   14:iconst_1        
	//    8   15:putfield        #271 <Field boolean M>
		b(true);
	//    9   18:aload_0         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #496 <Method void b(boolean)>
		j.setProgress(ay());
	//   12   23:aload_0         
	//   13   24:getfield        #380 <Field ProgressBar j>
	//   14   27:aload_0         
	//   15   28:invokespecial   #383 <Method int ay()>
	//   16   31:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		c(0x7f0f080a);
	//   17   34:aload_0         
	//   18   35:ldc2            #497 <Int 0x7f0f080a>
	//   19   38:invokevirtual   #376 <Method void c(int)>
		if(a(0))
	//*  20   41:aload_0         
	//*  21   42:iconst_0        
	//*  22   43:invokespecial   #406 <Method boolean a(int)>
	//*  23   46:ifeq            67
			am.put(((Object) (Integer.valueOf(0))), ((Object) (Boolean.valueOf(true))));
	//   24   49:aload_0         
	//   25   50:getfield        #205 <Field Map am>
	//   26   53:iconst_0        
	//   27   54:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   28   57:iconst_1        
	//   29   58:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   30   61:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   31   66:pop             
		return ((Fragment) (com.irobot.home.fragments.af.b().a(av).a(false).b(0x7f060078).a(getString(0x7f0f07fd)).a(com.irobot.home.util.j.b(0x7f03000f, getResources())).a()));
	//   32   67:invokestatic    #502 <Method com.irobot.home.fragments.af$a af.b()>
	//   33   70:aload_0         
	//   34   71:getfield        #217 <Field int av>
	//   35   74:invokevirtual   #507 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//   36   77:iconst_0        
	//   37   78:invokevirtual   #510 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//   38   81:ldc2            #511 <Int 0x7f060078>
	//   39   84:invokevirtual   #513 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(int)>
	//   40   87:aload_0         
	//   41   88:ldc2            #514 <Int 0x7f0f07fd>
	//   42   91:invokevirtual   #517 <Method String getString(int)>
	//   43   94:invokevirtual   #520 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(String)>
	//   44   97:ldc2            #521 <Int 0x7f03000f>
	//   45  100:aload_0         
	//   46  101:invokevirtual   #297 <Method Resources getResources()>
	//   47  104:invokestatic    #524 <Method ArrayList j.b(int, Resources)>
	//   48  107:invokevirtual   #527 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(ArrayList)>
	//   49  110:invokevirtual   #530 <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//   50  113:areturn         
	}

	private Fragment V()
	{
		a(0, 8, 0x7f0f0235, 0x7f0800c8);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:bipush          8
	//    3    4:ldc2            #389 <Int 0x7f0f0235>
	//    4    7:ldc2            #390 <Int 0x7f0800c8>
	//    5   10:invokevirtual   #393 <Method void a(int, int, int, int)>
		b(true);
	//    6   13:aload_0         
	//    7   14:iconst_1        
	//    8   15:invokevirtual   #496 <Method void b(boolean)>
		j.setProgress(ay());
	//    9   18:aload_0         
	//   10   19:getfield        #380 <Field ProgressBar j>
	//   11   22:aload_0         
	//   12   23:invokespecial   #383 <Method int ay()>
	//   13   26:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		c(0x7f0f027d);
	//   14   29:aload_0         
	//   15   30:ldc2            #531 <Int 0x7f0f027d>
	//   16   33:invokevirtual   #376 <Method void c(int)>
		if(a(1))
	//*  17   36:aload_0         
	//*  18   37:iconst_1        
	//*  19   38:invokespecial   #406 <Method boolean a(int)>
	//*  20   41:ifeq            62
			am.put(((Object) (Integer.valueOf(1))), ((Object) (Boolean.valueOf(true))));
	//   21   44:aload_0         
	//   22   45:getfield        #205 <Field Map am>
	//   23   48:iconst_1        
	//   24   49:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   25   52:iconst_1        
	//   26   53:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   27   56:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   28   61:pop             
		int i1 = 0x7f03000d;
	//   29   62:ldc2            #532 <Int 0x7f03000d>
	//   30   65:istore_1        
		static class _cls18
		{

			static final int a[];
			static final int b[];

			static 
			{
				b = new int[AssetSetupUIServiceViewState.values().length];
			//    0    0:invokestatic    #19  <Method AssetSetupUIServiceViewState[] AssetSetupUIServiceViewState.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] b>
				try
				{
					b[AssetSetupUIServiceViewState.CurrentProvisioningStatus.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] b>
			//    5   12:getstatic       #25  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.CurrentProvisioningStatus>
			//    6   15:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] b>
			//*  10   23:getstatic       #32  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ConnectToSoftAp>
			//*  11   26:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #21  <Field int[] b>
			//*  15   34:getstatic       #35  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ConnectToHomeAp>
			//*  16   37:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #21  <Field int[] b>
			//*  20   45:getstatic       #38  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ReconnectedToIncorrectHomeAccessPoint>
			//*  21   48:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #21  <Field int[] b>
			//*  25   56:getstatic       #41  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.WifiProvisioningError>
			//*  26   59:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #21  <Field int[] b>
			//*  30   67:getstatic       #44  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.AssetDiscoveredOnHomeNetworkUpdated>
			//*  31   70:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #21  <Field int[] b>
			//*  35   79:getstatic       #47  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.TransitionToProvisioningType>
			//*  36   82:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #21  <Field int[] b>
			//*  40   91:getstatic       #50  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.Invalid>
			//*  41   94:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:invokestatic    #55  <Method SkuType[] SkuType.values()>
			//*  45  103:arraylength     
			//*  46  104:newarray        int[]
			//*  47  106:putstatic       #57  <Field int[] a>
			//*  48  109:getstatic       #57  <Field int[] a>
			//*  49  112:getstatic       #61  <Field SkuType SkuType.SanMarino>
			//*  50  115:invokevirtual   #62  <Method int SkuType.ordinal()>
			//*  51  118:iconst_1        
			//*  52  119:iastore         
			//*  53  120:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   54  121:astore_0        
				try
				{
					b[AssetSetupUIServiceViewState.ConnectToSoftAp.ordinal()] = 2;
				}
			//*  55  122:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   56  125:astore_0        
				try
				{
					b[AssetSetupUIServiceViewState.ConnectToHomeAp.ordinal()] = 3;
				}
			//*  57  126:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   58  129:astore_0        
				try
				{
					b[AssetSetupUIServiceViewState.ReconnectedToIncorrectHomeAccessPoint.ordinal()] = 4;
				}
			//*  59  130:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   60  133:astore_0        
				try
				{
					b[AssetSetupUIServiceViewState.WifiProvisioningError.ordinal()] = 5;
				}
			//*  61  134:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   62  137:astore_0        
				try
				{
					b[AssetSetupUIServiceViewState.AssetDiscoveredOnHomeNetworkUpdated.ordinal()] = 6;
				}
			//*  63  138:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   64  141:astore_0        
				try
				{
					b[AssetSetupUIServiceViewState.TransitionToProvisioningType.ordinal()] = 7;
				}
			//*  65  142:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   66  145:astore_0        
				try
				{
					b[AssetSetupUIServiceViewState.Invalid.ordinal()] = 8;
				}
			//*  67  146:goto            88
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   68  149:astore_0        
				a = new int[SkuType.values().length];
				try
				{
					a[SkuType.SanMarino.ordinal()] = 1;
				}
			//*  69  150:goto            100
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   70  153:astore_0        
			//*  71  154:return          
			}
		}

		if(com.irobot.home._cls18.a[aC.ordinal()] == 1)
	//*  31   66:getstatic       #535 <Field int[] com.irobot.home.BroadcastSetupActivity$18.a>
	//*  32   69:aload_0         
	//*  33   70:getfield        #241 <Field SkuType aC>
	//*  34   73:invokevirtual   #538 <Method int SkuType.ordinal()>
	//*  35   76:iaload          
	//*  36   77:iconst_1        
	//*  37   78:icmpeq          84
	//*  38   81:goto            88
			i1 = 0x7f03000c;
	//   39   84:ldc2            #539 <Int 0x7f03000c>
	//   40   87:istore_1        
		return ((Fragment) (com.irobot.home.fragments.af.b().a(aw).a(false).b(0x7f060078).a(getString(0x7f0f027e)).a(com.irobot.home.util.j.b(i1, getResources())).a()));
	//   41   88:invokestatic    #502 <Method com.irobot.home.fragments.af$a af.b()>
	//   42   91:aload_0         
	//   43   92:getfield        #220 <Field int aw>
	//   44   95:invokevirtual   #507 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//   45   98:iconst_0        
	//   46   99:invokevirtual   #510 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//   47  102:ldc2            #511 <Int 0x7f060078>
	//   48  105:invokevirtual   #513 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(int)>
	//   49  108:aload_0         
	//   50  109:ldc2            #540 <Int 0x7f0f027e>
	//   51  112:invokevirtual   #517 <Method String getString(int)>
	//   52  115:invokevirtual   #520 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(String)>
	//   53  118:iload_1         
	//   54  119:aload_0         
	//   55  120:invokevirtual   #297 <Method Resources getResources()>
	//   56  123:invokestatic    #524 <Method ArrayList j.b(int, Resources)>
	//   57  126:invokevirtual   #527 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(ArrayList)>
	//   58  129:invokevirtual   #530 <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//   59  132:areturn         
	}

	private Fragment W()
	{
		a(0, 8, 0x7f0f0235, 0x7f0800c8, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:bipush          8
	//    3    4:ldc2            #389 <Int 0x7f0f0235>
	//    4    7:ldc2            #390 <Int 0x7f0800c8>
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #543 <Method void a(int, int, int, int, int)>
		n.setChecked(false);
	//    7   14:aload_0         
	//    8   15:getfield        #547 <Field CheckBox n>
	//    9   18:iconst_0        
	//   10   19:invokevirtual   #552 <Method void CheckBox.setChecked(boolean)>
		b(false);
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:invokevirtual   #496 <Method void b(boolean)>
		j.setProgress(ay());
	//   14   27:aload_0         
	//   15   28:getfield        #380 <Field ProgressBar j>
	//   16   31:aload_0         
	//   17   32:invokespecial   #383 <Method int ay()>
	//   18   35:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		c(aA);
	//   19   38:aload_0         
	//   20   39:aload_0         
	//   21   40:getfield        #232 <Field int aA>
	//   22   43:invokevirtual   #376 <Method void c(int)>
		if(a(5))
	//*  23   46:aload_0         
	//*  24   47:iconst_5        
	//*  25   48:invokespecial   #406 <Method boolean a(int)>
	//*  26   51:ifeq            72
			am.put(((Object) (Integer.valueOf(5))), ((Object) (Boolean.valueOf(true))));
	//   27   54:aload_0         
	//   28   55:getfield        #205 <Field Map am>
	//   29   58:iconst_5        
	//   30   59:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   31   62:iconst_1        
	//   32   63:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   33   66:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   34   71:pop             
		ArrayList arraylist = new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (new Integer[] {
			Integer.valueOf(getString(0x7f0f005e).length()), Integer.valueOf(getString(0x7f0f005f).length() + 1)
		}))))));
	//   35   72:new             #554 <Class ArrayList>
	//   36   75:dup             
	//   37   76:iconst_2        
	//   38   77:anewarray       Integer[]
	//   39   80:dup             
	//   40   81:iconst_0        
	//   41   82:aload_0         
	//   42   83:ldc2            #555 <Int 0x7f0f005e>
	//   43   86:invokevirtual   #517 <Method String getString(int)>
	//   44   89:invokevirtual   #560 <Method int String.length()>
	//   45   92:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   46   95:aastore         
	//   47   96:dup             
	//   48   97:iconst_1        
	//   49   98:aload_0         
	//   50   99:ldc2            #561 <Int 0x7f0f005f>
	//   51  102:invokevirtual   #517 <Method String getString(int)>
	//   52  105:invokevirtual   #560 <Method int String.length()>
	//   53  108:iconst_1        
	//   54  109:iadd            
	//   55  110:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   56  113:aastore         
	//   57  114:invokestatic    #567 <Method List Arrays.asList(Object[])>
	//   58  117:invokespecial   #570 <Method void ArrayList(java.util.Collection)>
	//   59  120:astore_1        
		ArrayList arraylist1 = new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (new Integer[] {
			Integer.valueOf(0x7f0801ef), Integer.valueOf(0x7f080120)
		}))))));
	//   60  121:new             #554 <Class ArrayList>
	//   61  124:dup             
	//   62  125:iconst_2        
	//   63  126:anewarray       Integer[]
	//   64  129:dup             
	//   65  130:iconst_0        
	//   66  131:ldc2            #571 <Int 0x7f0801ef>
	//   67  134:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   68  137:aastore         
	//   69  138:dup             
	//   70  139:iconst_1        
	//   71  140:ldc2            #572 <Int 0x7f080120>
	//   72  143:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   73  146:aastore         
	//   74  147:invokestatic    #567 <Method List Arrays.asList(Object[])>
	//   75  150:invokespecial   #570 <Method void ArrayList(java.util.Collection)>
	//   76  153:astore_2        
		return ((Fragment) (com.irobot.home.fragments.b.b().a(ax).a(false).b(0x7f060078).a(getString(0x7f0f005d)).a(arraylist).b(arraylist1).a()));
	//   77  154:invokestatic    #577 <Method com.irobot.home.fragments.b$a b.b()>
	//   78  157:aload_0         
	//   79  158:getfield        #223 <Field int ax>
	//   80  161:invokevirtual   #582 <Method com.irobot.home.fragments.b$a com.irobot.home.fragments.b$a.a(int)>
	//   81  164:iconst_0        
	//   82  165:invokevirtual   #585 <Method com.irobot.home.fragments.b$a com.irobot.home.fragments.b$a.a(boolean)>
	//   83  168:ldc2            #511 <Int 0x7f060078>
	//   84  171:invokevirtual   #587 <Method com.irobot.home.fragments.b$a com.irobot.home.fragments.b$a.b(int)>
	//   85  174:aload_0         
	//   86  175:ldc2            #588 <Int 0x7f0f005d>
	//   87  178:invokevirtual   #517 <Method String getString(int)>
	//   88  181:invokevirtual   #591 <Method com.irobot.home.fragments.b$a com.irobot.home.fragments.b$a.a(String)>
	//   89  184:aload_1         
	//   90  185:invokevirtual   #594 <Method com.irobot.home.fragments.b$a com.irobot.home.fragments.b$a.a(ArrayList)>
	//   91  188:aload_2         
	//   92  189:invokevirtual   #596 <Method com.irobot.home.fragments.b$a com.irobot.home.fragments.b$a.b(ArrayList)>
	//   93  192:invokevirtual   #599 <Method com.irobot.home.fragments.a com.irobot.home.fragments.b$a.a()>
	//   94  195:areturn         
	}

	private Fragment X()
	{
		int i1 = ai;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field int ai>
	//    2    4:istore_1        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(i1 == 3)
	//*   5    7:iload_1         
	//*   6    8:iconst_3        
	//*   7    9:icmpne          27
		{
			V = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #434 <Field boolean V>
			x = 4;
	//   11   17:aload_0         
	//   12   18:iconst_4        
	//   13   19:putfield        #247 <Field int x>
			return T();
	//   14   22:aload_0         
	//   15   23:invokespecial   #601 <Method Fragment T()>
	//   16   26:areturn         
		}
		A();
	//   17   27:aload_0         
	//   18   28:invokevirtual   #604 <Method void A()>
		Object obj = "";
	//   19   31:ldc2            #606 <String "">
	//   20   34:astore_3        
		if(Y != null)
	//*  21   35:aload_0         
	//*  22   36:getfield        #608 <Field AssetInfo Y>
	//*  23   39:ifnull          53
			obj = ((Object) (Y.getSku()));
	//   24   42:aload_0         
	//   25   43:getfield        #608 <Field AssetInfo Y>
	//   26   46:invokevirtual   #613 <Method String AssetInfo.getSku()>
	//   27   49:astore_3        
		else
	//*  28   50:goto            63
			com.irobot.home.util.o.d(w, "Error fragment called with unknown sku.");
	//   29   53:aload_0         
	//   30   54:getfield        #616 <Field String w>
	//   31   57:ldc2            #618 <String "Error fragment called with unknown sku.">
	//   32   60:invokestatic    #623 <Method void o.d(String, String)>
		String s1 = com.irobot.home.util.j.e(J.b());
	//   33   63:aload_0         
	//   34   64:getfield        #264 <Field WifiConfig J>
	//   35   67:invokevirtual   #464 <Method String WifiConfig.b()>
	//   36   70:invokestatic    #357 <Method String j.e(String)>
	//   37   73:astore          4
		obj = ((Object) (com.irobot.home.util.s.a(ai, ((String) (obj)), s1, getResources())));
	//   38   75:aload_0         
	//   39   76:getfield        #193 <Field int ai>
	//   40   79:aload_3         
	//   41   80:aload           4
	//   42   82:aload_0         
	//   43   83:invokevirtual   #297 <Method Resources getResources()>
	//   44   86:invokestatic    #628 <Method com.irobot.home.util.s$a s.a(int, String, String, Resources)>
	//   45   89:astore_3        
		if(obj == null)
	//*  46   90:aload_3         
	//*  47   91:ifnonnull       142
		{
			obj = ((Object) (w));
	//   48   94:aload_0         
	//   49   95:getfield        #616 <Field String w>
	//   50   98:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   51   99:new             #630 <Class StringBuilder>
	//   52  102:dup             
	//   53  103:invokespecial   #631 <Method void StringBuilder()>
	//   54  106:astore          4
			stringbuilder.append("Unknown error code: ");
	//   55  108:aload           4
	//   56  110:ldc2            #633 <String "Unknown error code: ">
	//   57  113:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   58  116:pop             
			stringbuilder.append(ai);
	//   59  117:aload           4
	//   60  119:aload_0         
	//   61  120:getfield        #193 <Field int ai>
	//   62  123:invokevirtual   #640 <Method StringBuilder StringBuilder.append(int)>
	//   63  126:pop             
			com.irobot.home.util.o.e(((String) (obj)), stringbuilder.toString());
	//   64  127:aload_3         
	//   65  128:aload           4
	//   66  130:invokevirtual   #643 <Method String StringBuilder.toString()>
	//   67  133:invokestatic    #645 <Method void o.e(String, String)>
			finish();
	//   68  136:aload_0         
	//   69  137:invokevirtual   #648 <Method void finish()>
			return null;
	//   70  140:aconst_null     
	//   71  141:areturn         
		}
		b(true);
	//   72  142:aload_0         
	//   73  143:iconst_1        
	//   74  144:invokevirtual   #496 <Method void b(boolean)>
		c(0x7f0f02cc);
	//   75  147:aload_0         
	//   76  148:ldc2            #649 <Int 0x7f0f02cc>
	//   77  151:invokevirtual   #376 <Method void c(int)>
		a(0, 8, ((com.irobot.home.util.s.a) (obj)).d, 0x7f0800c8);
	//   78  154:aload_0         
	//   79  155:iconst_0        
	//   80  156:bipush          8
	//   81  158:aload_3         
	//   82  159:getfield        #653 <Field int com.irobot.home.util.s$a.d>
	//   83  162:ldc2            #390 <Int 0x7f0800c8>
	//   84  165:invokevirtual   #393 <Method void a(int, int, int, int)>
		if(!((com.irobot.home.util.s.a) (obj)).e || !com.irobot.home.util.j.a() || com.irobot.home.util.j.j(az()))
	//*  85  168:aload_3         
	//*  86  169:getfield        #655 <Field boolean com.irobot.home.util.s$a.e>
	//*  87  172:ifeq            194
	//*  88  175:invokestatic    #658 <Method boolean j.a()>
	//*  89  178:ifeq            194
	//*  90  181:aload_0         
	//*  91  182:invokespecial   #660 <Method String az()>
	//*  92  185:invokestatic    #663 <Method boolean j.j(String)>
	//*  93  188:ifne            194
	//*  94  191:goto            196
			flag = false;
	//   95  194:iconst_0        
	//   96  195:istore_2        
		as = flag;
	//   97  196:aload_0         
	//   98  197:iload_2         
	//   99  198:putfield        #209 <Field boolean as>
		return ((Fragment) (com.irobot.home.fragments.af.b().c(as).a(((com.irobot.home.util.s.a) (obj)).b).a(false).b(0x7f060078).a(((com.irobot.home.util.s.a) (obj)).c).a()));
	//  100  201:invokestatic    #502 <Method com.irobot.home.fragments.af$a af.b()>
	//  101  204:aload_0         
	//  102  205:getfield        #209 <Field boolean as>
	//  103  208:invokevirtual   #665 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.c(boolean)>
	//  104  211:aload_3         
	//  105  212:getfield        #667 <Field int com.irobot.home.util.s$a.b>
	//  106  215:invokevirtual   #507 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//  107  218:iconst_0        
	//  108  219:invokevirtual   #510 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//  109  222:ldc2            #511 <Int 0x7f060078>
	//  110  225:invokevirtual   #513 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(int)>
	//  111  228:aload_3         
	//  112  229:getfield        #670 <Field ArrayList com.irobot.home.util.s$a.c>
	//  113  232:invokevirtual   #527 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(ArrayList)>
	//  114  235:invokevirtual   #530 <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//  115  238:areturn         
	}

	private Fragment Y()
	{
		c(0x7f0f02cc);
	//    0    0:aload_0         
	//    1    1:ldc2            #649 <Int 0x7f0f02cc>
	//    2    4:invokevirtual   #376 <Method void c(int)>
		a(0, 8, 0x7f0f0761, 0x7f0800c8);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:bipush          8
	//    6   11:ldc2            #671 <Int 0x7f0f0761>
	//    7   14:ldc2            #390 <Int 0x7f0800c8>
	//    8   17:invokevirtual   #393 <Method void a(int, int, int, int)>
		b(true);
	//    9   20:aload_0         
	//   10   21:iconst_1        
	//   11   22:invokevirtual   #496 <Method void b(boolean)>
		ArrayList arraylist = new ArrayList();
	//   12   25:new             #554 <Class ArrayList>
	//   13   28:dup             
	//   14   29:invokespecial   #672 <Method void ArrayList()>
	//   15   32:astore_1        
		arraylist.add(((Object) (String.format(getString(0x7f0f00eb), new Object[] {
			Z()
		}))));
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:ldc2            #673 <Int 0x7f0f00eb>
	//   19   38:invokevirtual   #517 <Method String getString(int)>
	//   20   41:iconst_1        
	//   21   42:anewarray       Object[]
	//   22   45:dup             
	//   23   46:iconst_0        
	//   24   47:aload_0         
	//   25   48:invokespecial   #675 <Method String Z()>
	//   26   51:aastore         
	//   27   52:invokestatic    #679 <Method String String.format(String, Object[])>
	//   28   55:invokevirtual   #683 <Method boolean ArrayList.add(Object)>
	//   29   58:pop             
		return ((Fragment) (com.irobot.home.fragments.af.b().a(ay).a(false).b(0x7f060078).a(arraylist).a()));
	//   30   59:invokestatic    #502 <Method com.irobot.home.fragments.af$a af.b()>
	//   31   62:aload_0         
	//   32   63:getfield        #226 <Field int ay>
	//   33   66:invokevirtual   #507 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//   34   69:iconst_0        
	//   35   70:invokevirtual   #510 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//   36   73:ldc2            #511 <Int 0x7f060078>
	//   37   76:invokevirtual   #513 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(int)>
	//   38   79:aload_1         
	//   39   80:invokevirtual   #527 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(ArrayList)>
	//   40   83:invokevirtual   #530 <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//   41   86:areturn         
	}

	private String Z()
	{
		String s1;
label0:
		{
			Object obj = ((Object) (Assembler.getInstance().getAssetSetupUIService().getServiceData()));
	//    0    0:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    2    6:invokevirtual   #686 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//    3    9:astore_1        
			if(obj != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          22
				obj = ((Object) (((AssetSetupUIServiceData) (obj)).getAssetName()));
	//    6   14:aload_1         
	//    7   15:invokevirtual   #689 <Method String AssetSetupUIServiceData.getAssetName()>
	//    8   18:astore_1        
			else
	//*   9   19:goto            24
				obj = null;
	//   10   22:aconst_null     
	//   11   23:astore_1        
			if(obj != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          37
			{
				s1 = ((String) (obj));
	//   14   28:aload_1         
	//   15   29:astore_2        
				if(!((String) (obj)).isEmpty())
					break label0;
	//   16   30:aload_1         
	//   17   31:invokevirtual   #691 <Method boolean String.isEmpty()>
	//   18   34:ifeq            45
			}
			s1 = Y.getName();
	//   19   37:aload_0         
	//   20   38:getfield        #608 <Field AssetInfo Y>
	//   21   41:invokevirtual   #694 <Method String AssetInfo.getName()>
	//   22   44:astore_2        
		}
		return s1;
	//   23   45:aload_2         
	//   24   46:areturn         
	}

	static int a(BroadcastSetupActivity broadcastsetupactivity, int i1)
	{
		broadcastsetupactivity.ai = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #193 <Field int ai>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static AlertDialog a(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.al;
	//    0    0:aload_0         
	//    1    1:getfield        #698 <Field AlertDialog al>
	//    2    4:areturn         
	}

	private Fragment a(String s1, boolean flag)
	{
		l();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #702 <Method void l()>
		d.setVisibility(8);
	//    2    4:aload_0         
	//    3    5:getfield        #704 <Field LinearLayout d>
	//    4    8:bipush          8
	//    5   10:invokevirtual   #709 <Method void LinearLayout.setVisibility(int)>
		return ((Fragment) (bd.e().a(s1).b(getString(0x7f0f073f)).a(flag).a()));
	//    6   13:invokestatic    #714 <Method com.irobot.home.fragments.bd$a bd.e()>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #719 <Method com.irobot.home.fragments.bd$a com.irobot.home.fragments.bd$a.a(String)>
	//    9   20:aload_0         
	//   10   21:ldc2            #720 <Int 0x7f0f073f>
	//   11   24:invokevirtual   #517 <Method String getString(int)>
	//   12   27:invokevirtual   #722 <Method com.irobot.home.fragments.bd$a com.irobot.home.fragments.bd$a.b(String)>
	//   13   30:iload_2         
	//   14   31:invokevirtual   #725 <Method com.irobot.home.fragments.bd$a com.irobot.home.fragments.bd$a.a(boolean)>
	//   15   34:invokevirtual   #728 <Method com.irobot.home.fragments.bc com.irobot.home.fragments.bd$a.a()>
	//   16   37:areturn         
	}

	static AssetInfo a(BroadcastSetupActivity broadcastsetupactivity, AssetInfo assetinfo)
	{
		broadcastsetupactivity.Y = assetinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #608 <Field AssetInfo Y>
		return assetinfo;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static BluetoothStateReceiver a(BroadcastSetupActivity broadcastsetupactivity, BluetoothStateReceiver bluetoothstatereceiver)
	{
		broadcastsetupactivity.ac = bluetoothstatereceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #180 <Field BluetoothStateReceiver ac>
		return bluetoothstatereceiver;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static List a(BroadcastSetupActivity broadcastsetupactivity, List list)
	{
		broadcastsetupactivity.ak = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #200 <Field List ak>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(DiscoveredWifiAsset discoveredwifiasset)
	{
		String s1 = Y.getAssetId().getId();
	//    0    0:aload_0         
	//    1    1:getfield        #608 <Field AssetInfo Y>
	//    2    4:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//    3    7:invokevirtual   #741 <Method String AssetId.getId()>
	//    4   10:astore_2        
		String s2 = discoveredwifiasset.assetInfo().getAssetId().getId();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #747 <Method AssetInfo DiscoveredWifiAsset.assetInfo()>
	//    7   15:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//    8   18:invokevirtual   #741 <Method String AssetId.getId()>
	//    9   21:astore_3        
		if(s1.length() != s2.length())
	//*  10   22:aload_2         
	//*  11   23:invokevirtual   #560 <Method int String.length()>
	//*  12   26:aload_3         
	//*  13   27:invokevirtual   #560 <Method int String.length()>
	//*  14   30:icmpeq          38
		{
			af();
	//   15   33:aload_0         
	//   16   34:invokespecial   #749 <Method void af()>
			return;
	//   17   37:return          
		}
		Y = discoveredwifiasset.assetInfo();
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokevirtual   #747 <Method AssetInfo DiscoveredWifiAsset.assetInfo()>
	//   21   43:putfield        #608 <Field AssetInfo Y>
		H.b(discoveredwifiasset.assetInfo().getName());
	//   22   46:aload_0         
	//   23   47:getfield        #753 <Field Robot H>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #747 <Method AssetInfo DiscoveredWifiAsset.assetInfo()>
	//   26   54:invokevirtual   #694 <Method String AssetInfo.getName()>
	//   27   57:invokevirtual   #757 <Method void Robot.b(String)>
		H.e(Y.getAssetId().getId());
	//   28   60:aload_0         
	//   29   61:getfield        #753 <Field Robot H>
	//   30   64:aload_0         
	//   31   65:getfield        #608 <Field AssetInfo Y>
	//   32   68:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//   33   71:invokevirtual   #741 <Method String AssetId.getId()>
	//   34   74:invokevirtual   #759 <Method void Robot.e(String)>
		H.d().a(discoveredwifiasset.networkAddress());
	//   35   77:aload_0         
	//   36   78:getfield        #753 <Field Robot H>
	//   37   81:invokevirtual   #762 <Method NetworkSettings Robot.d()>
	//   38   84:aload_1         
	//   39   85:invokevirtual   #766 <Method NetworkAddress DiscoveredWifiAsset.networkAddress()>
	//   40   88:invokevirtual   #771 <Method void NetworkSettings.a(NetworkAddress)>
		if(aE != null)
	//*  41   91:aload_0         
	//*  42   92:getfield        #773 <Field String aE>
	//*  43   95:ifnull          147
		{
			s1 = w;
	//   44   98:aload_0         
	//   45   99:getfield        #616 <Field String w>
	//   46  102:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   47  103:new             #630 <Class StringBuilder>
	//   48  106:dup             
	//   49  107:invokespecial   #631 <Method void StringBuilder()>
	//   50  110:astore_3        
			stringbuilder.append("mRobotPassword set password: ");
	//   51  111:aload_3         
	//   52  112:ldc2            #775 <String "mRobotPassword set password: ">
	//   53  115:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   54  118:pop             
			stringbuilder.append(aE);
	//   55  119:aload_3         
	//   56  120:aload_0         
	//   57  121:getfield        #773 <Field String aE>
	//   58  124:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   59  127:pop             
			com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   60  128:aload_2         
	//   61  129:aload_3         
	//   62  130:invokevirtual   #643 <Method String StringBuilder.toString()>
	//   63  133:invokestatic    #777 <Method void o.b(String, String)>
			H.a(aE);
	//   64  136:aload_0         
	//   65  137:getfield        #753 <Field Robot H>
	//   66  140:aload_0         
	//   67  141:getfield        #773 <Field String aE>
	//   68  144:invokevirtual   #778 <Method void Robot.a(String)>
		}
		s1 = discoveredwifiasset.sku();
	//   69  147:aload_1         
	//   70  148:invokevirtual   #781 <Method String DiscoveredWifiAsset.sku()>
	//   71  151:astore_2        
		if(com.irobot.home.util.j.i(s1))
	//*  72  152:aload_2         
	//*  73  153:invokestatic    #783 <Method boolean j.i(String)>
	//*  74  156:ifeq            167
			H.c(s1);
	//   75  159:aload_0         
	//   76  160:getfield        #753 <Field Robot H>
	//   77  163:aload_2         
	//   78  164:invokevirtual   #785 <Method void Robot.c(String)>
		s1 = discoveredwifiasset.softwareVersion();
	//   79  167:aload_1         
	//   80  168:invokevirtual   #788 <Method String DiscoveredWifiAsset.softwareVersion()>
	//   81  171:astore_2        
		if(com.irobot.home.util.j.i(s1))
	//*  82  172:aload_2         
	//*  83  173:invokestatic    #783 <Method boolean j.i(String)>
	//*  84  176:ifeq            193
			H.a.a(SoftwareVersion.create(s1));
	//   85  179:aload_0         
	//   86  180:getfield        #753 <Field Robot H>
	//   87  183:getfield        #791 <Field RobotSystem Robot.a>
	//   88  186:aload_2         
	//   89  187:invokestatic    #796 <Method SoftwareVersion SoftwareVersion.create(String)>
	//   90  190:invokevirtual   #801 <Method void RobotSystem.a(SoftwareVersion)>
		((IRobotApplication)com.irobot.home.util.j.g()).h().a(((com.irobot.home.model.a) (new w(discoveredwifiasset.assetInfo(), H))));
	//   91  193:invokestatic    #804 <Method android.app.Application j.g()>
	//   92  196:checkcast       #806 <Class IRobotApplication>
	//   93  199:invokevirtual   #809 <Method IRobotModel IRobotApplication.h()>
	//   94  202:new             #811 <Class w>
	//   95  205:dup             
	//   96  206:aload_1         
	//   97  207:invokevirtual   #747 <Method AssetInfo DiscoveredWifiAsset.assetInfo()>
	//   98  210:aload_0         
	//   99  211:getfield        #753 <Field Robot H>
	//  100  214:invokespecial   #814 <Method void w(AssetInfo, Robot)>
	//  101  217:invokevirtual   #819 <Method void IRobotModel.a(com.irobot.home.model.a)>
	//  102  220:return          
	}

	private void a(Error error)
	{
		String s1 = w;
	//    0    0:aload_0         
	//    1    1:getfield        #616 <Field String w>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #630 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #631 <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append("Received provisioning error: ");
	//    7   13:aload_3         
	//    8   14:ldc2            #822 <String "Received provisioning error: ">
	//    9   17:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(error.code());
	//   11   21:aload_3         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #827 <Method int Error.code()>
	//   14   26:invokevirtual   #640 <Method StringBuilder StringBuilder.append(int)>
	//   15   29:pop             
		stringbuilder.append(" ");
	//   16   30:aload_3         
	//   17   31:ldc2            #829 <String " ">
	//   18   34:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		stringbuilder.append(error.message());
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #832 <Method String Error.message()>
	//   23   43:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
		com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:invokevirtual   #643 <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #645 <Method void o.e(String, String)>
		ai = error.code();
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #827 <Method int Error.code()>
	//   32   60:putfield        #193 <Field int ai>
		x = 10;
	//   33   63:aload_0         
	//   34   64:bipush          10
	//   35   66:putfield        #247 <Field int x>
		an();
	//   36   69:aload_0         
	//   37   70:invokespecial   #834 <Method void an()>
	//   38   73:return          
	}

	private void a(ProvisioningType provisioningtype)
	{
		if(ProvisioningType.WifiV3 == provisioningtype)
	//*   0    0:getstatic       #841 <Field ProvisioningType ProvisioningType.WifiV3>
	//*   1    3:aload_1         
	//*   2    4:if_acmpne       27
		{
			at = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #211 <Field boolean at>
			Y = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #608 <Field AssetInfo Y>
			x = 12;
	//    9   17:aload_0         
	//   10   18:bipush          12
	//   11   20:putfield        #247 <Field int x>
			an();
	//   12   23:aload_0         
	//   13   24:invokespecial   #834 <Method void an()>
		}
	//   14   27:return          
	}

	private void a(WifiProvisioningStatus wifiprovisioningstatus)
	{
		AssetInfo assetinfo = Y;
	//    0    0:aload_0         
	//    1    1:getfield        #608 <Field AssetInfo Y>
	//    2    4:astore          4
		Object obj = ((Object) (H));
	//    3    6:aload_0         
	//    4    7:getfield        #753 <Field Robot H>
	//    5   10:astore_2        
		String s1 = aE;
	//    6   11:aload_0         
	//    7   12:getfield        #773 <Field String aE>
	//    8   15:astore          5
		if(wifiprovisioningstatus != WifiProvisioningStatus.Finished)
	//*   9   17:aload_1         
	//*  10   18:getstatic       #848 <Field WifiProvisioningStatus WifiProvisioningStatus.Finished>
	//*  11   21:if_acmpeq       25
			return;
	//   12   24:return          
		if(assetinfo == null)
	//*  13   25:aload           4
	//*  14   27:ifnonnull       41
		{
			com.irobot.home.util.o.e(w, "provisioningStatus() called with null == discoveredAsset.");
	//   15   30:aload_0         
	//   16   31:getfield        #616 <Field String w>
	//   17   34:ldc2            #850 <String "provisioningStatus() called with null == discoveredAsset.">
	//   18   37:invokestatic    #645 <Method void o.e(String, String)>
			return;
	//   19   40:return          
		}
		wifiprovisioningstatus = ((WifiProvisioningStatus) (obj));
	//   20   41:aload_2         
	//   21   42:astore_1        
		if(obj == null)
	//*  22   43:aload_2         
	//*  23   44:ifnonnull       56
			wifiprovisioningstatus = ((WifiProvisioningStatus) (com.irobot.home.util.j.c(assetinfo.getAssetId())));
	//   24   47:aload           4
	//   25   49:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//   26   52:invokestatic    #853 <Method Robot j.c(AssetId)>
	//   27   55:astore_1        
		obj = ((Object) (wifiprovisioningstatus));
	//   28   56:aload_1         
	//   29   57:astore_2        
		if(wifiprovisioningstatus == null)
	//*  30   58:aload_1         
	//*  31   59:ifnonnull       70
			obj = ((Object) (new Robot()));
	//   32   62:new             #755 <Class Robot>
	//   33   65:dup             
	//   34   66:invokespecial   #854 <Method void Robot()>
	//   35   69:astore_2        
		wifiprovisioningstatus = null;
	//   36   70:aconst_null     
	//   37   71:astore_1        
		Object obj1 = ((Object) (Assembler.getInstance().getAssetSetupUIService().getServiceData()));
	//   38   72:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//   39   75:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   40   78:invokevirtual   #686 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//   41   81:astore_3        
		if(obj1 != null)
	//*  42   82:aload_3         
	//*  43   83:ifnull          91
			wifiprovisioningstatus = ((WifiProvisioningStatus) (((AssetSetupUIServiceData) (obj1)).getAssetName()));
	//   44   86:aload_3         
	//   45   87:invokevirtual   #689 <Method String AssetSetupUIServiceData.getAssetName()>
	//   46   90:astore_1        
		obj1 = ((Object) (wifiprovisioningstatus));
	//   47   91:aload_1         
	//   48   92:astore_3        
		if(!com.irobot.home.util.j.i(((String) (wifiprovisioningstatus))))
	//*  49   93:aload_1         
	//*  50   94:invokestatic    #783 <Method boolean j.i(String)>
	//*  51   97:ifne            106
			obj1 = ((Object) (assetinfo.getName()));
	//   52  100:aload           4
	//   53  102:invokevirtual   #694 <Method String AssetInfo.getName()>
	//   54  105:astore_3        
		if(com.irobot.home.util.j.i(((String) (obj1))))
	//*  55  106:aload_3         
	//*  56  107:invokestatic    #783 <Method boolean j.i(String)>
	//*  57  110:ifeq            124
		{
			((Robot) (obj)).b(((String) (obj1)));
	//   58  113:aload_2         
	//   59  114:aload_3         
	//   60  115:invokevirtual   #757 <Method void Robot.b(String)>
			assetinfo.setName(((String) (obj1)));
	//   61  118:aload           4
	//   62  120:aload_3         
	//   63  121:invokevirtual   #857 <Method void AssetInfo.setName(String)>
		}
		wifiprovisioningstatus = ((WifiProvisioningStatus) (assetinfo.getAssetId().getId()));
	//   64  124:aload           4
	//   65  126:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//   66  129:invokevirtual   #741 <Method String AssetId.getId()>
	//   67  132:astore_1        
		if(com.irobot.home.util.j.i(((String) (wifiprovisioningstatus))))
	//*  68  133:aload_1         
	//*  69  134:invokestatic    #783 <Method boolean j.i(String)>
	//*  70  137:ifeq            145
			((Robot) (obj)).e(((String) (wifiprovisioningstatus)));
	//   71  140:aload_2         
	//   72  141:aload_1         
	//   73  142:invokevirtual   #759 <Method void Robot.e(String)>
		if(com.irobot.home.util.j.i(s1))
	//*  74  145:aload           5
	//*  75  147:invokestatic    #783 <Method boolean j.i(String)>
	//*  76  150:ifeq            159
			((Robot) (obj)).a(s1);
	//   77  153:aload_2         
	//   78  154:aload           5
	//   79  156:invokevirtual   #778 <Method void Robot.a(String)>
		wifiprovisioningstatus = ((WifiProvisioningStatus) (assetinfo.getSku()));
	//   80  159:aload           4
	//   81  161:invokevirtual   #613 <Method String AssetInfo.getSku()>
	//   82  164:astore_1        
		if(com.irobot.home.util.j.i(((String) (wifiprovisioningstatus))))
	//*  83  165:aload_1         
	//*  84  166:invokestatic    #783 <Method boolean j.i(String)>
	//*  85  169:ifeq            177
			((Robot) (obj)).c(((String) (wifiprovisioningstatus)));
	//   86  172:aload_2         
	//   87  173:aload_1         
	//   88  174:invokevirtual   #785 <Method void Robot.c(String)>
		wifiprovisioningstatus = ((WifiProvisioningStatus) (assetinfo.getSoftwareVersion()));
	//   89  177:aload           4
	//   90  179:invokevirtual   #860 <Method String AssetInfo.getSoftwareVersion()>
	//   91  182:astore_1        
		if(com.irobot.home.util.j.i(((String) (wifiprovisioningstatus))))
	//*  92  183:aload_1         
	//*  93  184:invokestatic    #783 <Method boolean j.i(String)>
	//*  94  187:ifeq            201
			((Robot) (obj)).a.a(SoftwareVersion.create(((String) (wifiprovisioningstatus))));
	//   95  190:aload_2         
	//   96  191:getfield        #791 <Field RobotSystem Robot.a>
	//   97  194:aload_1         
	//   98  195:invokestatic    #796 <Method SoftwareVersion SoftwareVersion.create(String)>
	//   99  198:invokevirtual   #801 <Method void RobotSystem.a(SoftwareVersion)>
		wifiprovisioningstatus = ((WifiProvisioningStatus) (((IRobotApplication)com.irobot.home.util.j.g()).h()));
	//  100  201:invokestatic    #804 <Method android.app.Application j.g()>
	//  101  204:checkcast       #806 <Class IRobotApplication>
	//  102  207:invokevirtual   #809 <Method IRobotModel IRobotApplication.h()>
	//  103  210:astore_1        
		if(com.irobot.home.util.j.a(assetinfo.getAssetId().getId()) == null)
	//* 104  211:aload           4
	//* 105  213:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//* 106  216:invokevirtual   #741 <Method String AssetId.getId()>
	//* 107  219:invokestatic    #863 <Method com.irobot.home.model.a j.a(String)>
	//* 108  222:ifnonnull       239
			((IRobotModel) (wifiprovisioningstatus)).a(((com.irobot.home.model.a) (new w(assetinfo, ((Robot) (obj))))));
	//  109  225:aload_1         
	//  110  226:new             #811 <Class w>
	//  111  229:dup             
	//  112  230:aload           4
	//  113  232:aload_2         
	//  114  233:invokespecial   #814 <Method void w(AssetInfo, Robot)>
	//  115  236:invokevirtual   #819 <Method void IRobotModel.a(com.irobot.home.model.a)>
		r.b(assetinfo.getAssetId().getId());
	//  116  239:aload_0         
	//  117  240:getfield        #867 <Field com.irobot.home.q.b r>
	//  118  243:aload           4
	//  119  245:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//  120  248:invokevirtual   #741 <Method String AssetId.getId()>
	//  121  251:invokevirtual   #870 <Method void com.irobot.home.q.b.b(String)>
		Assembler.getInstance().initializeAsset(assetinfo);
	//  122  254:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//  123  257:aload           4
	//  124  259:invokevirtual   #874 <Method void Assembler.initializeAsset(AssetInfo)>
		x = 9;
	//  125  262:aload_0         
	//  126  263:bipush          9
	//  127  265:putfield        #247 <Field int x>
		an();
	//  128  268:aload_0         
	//  129  269:invokespecial   #834 <Method void an()>
	//  130  272:return          
	}

	static void a(BroadcastSetupActivity broadcastsetupactivity, DiscoveredWifiAsset discoveredwifiasset)
	{
		broadcastsetupactivity.a(discoveredwifiasset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #877 <Method void a(DiscoveredWifiAsset)>
	//    3    5:return          
	}

	static void a(BroadcastSetupActivity broadcastsetupactivity, Error error)
	{
		broadcastsetupactivity.a(error);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #880 <Method void a(Error)>
	//    3    5:return          
	}

	static void a(BroadcastSetupActivity broadcastsetupactivity, ProvisioningType provisioningtype)
	{
		broadcastsetupactivity.a(provisioningtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #883 <Method void a(ProvisioningType)>
	//    3    5:return          
	}

	static void a(BroadcastSetupActivity broadcastsetupactivity, WifiProvisioningStatus wifiprovisioningstatus)
	{
		broadcastsetupactivity.a(wifiprovisioningstatus);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #886 <Method void a(WifiProvisioningStatus)>
	//    3    5:return          
	}

	static void a(BroadcastSetupActivity broadcastsetupactivity, String s1)
	{
		broadcastsetupactivity.b(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #888 <Method void b(String)>
	//    3    5:return          
	}

	private boolean a(int i1)
	{
		return am.containsKey(((Object) (Integer.valueOf(i1)))) && !((Boolean)am.get(((Object) (Integer.valueOf(i1))))).booleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field Map am>
	//    2    4:iload_1         
	//    3    5:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #891 <Method boolean Map.containsKey(Object)>
	//    5   13:ifeq            40
	//    6   16:aload_0         
	//    7   17:getfield        #205 <Field Map am>
	//    8   20:iload_1         
	//    9   21:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   10   24:invokeinterface #895 <Method Object Map.get(Object)>
	//   11   29:checkcast       #414 <Class Boolean>
	//   12   32:invokevirtual   #898 <Method boolean Boolean.booleanValue()>
	//   13   35:ifne            40
	//   14   38:iconst_1        
	//   15   39:ireturn         
	//   16   40:iconst_0        
	//   17   41:ireturn         
	}

	static boolean a(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.W = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #172 <Field boolean W>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void aA()
	{
		(new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(0x7f0f0180).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				dialoginterface = ((DialogInterface) (com.irobot.home.BroadcastSetupActivity.s(a)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:invokestatic    #26  <Method ProvisioningStep com.irobot.home.BroadcastSetupActivity.s(BroadcastSetupActivity)>
			//    3    7:astore_1        
				if(ProvisioningStep.Undefined != dialoginterface)
			//*   4    8:getstatic       #32  <Field ProvisioningStep ProvisioningStep.Undefined>
			//*   5   11:aload_1         
			//*   6   12:if_acmpeq       22
					AnalyticsSubsystem.getInstance().trackProvCancelButtonPressed(((ProvisioningStep) (dialoginterface)));
			//    7   15:invokestatic    #38  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//    8   18:aload_1         
			//    9   19:invokevirtual   #42  <Method void AnalyticsSubsystem.trackProvCancelButtonPressed(ProvisioningStep)>
				dialoginterface = ((DialogInterface) (Assembler.getInstance().getAssetSetupUIService()));
			//   10   22:invokestatic    #47  <Method Assembler Assembler.getInstance()>
			//   11   25:invokevirtual   #51  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
			//   12   28:astore_1        
				if(dialoginterface != null)
			//*  13   29:aload_1         
			//*  14   30:ifnull          41
					((AssetSetupUIService) (dialoginterface)).sendCommand(AssetSetupUIServiceCommand.CancelProvisioning, ((AssetSetupUIServiceData) (null)));
			//   15   33:aload_1         
			//   16   34:getstatic       #57  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.CancelProvisioning>
			//   17   37:aconst_null     
			//   18   38:invokevirtual   #63  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
				a.finish();
			//   19   41:aload_0         
			//   20   42:getfield        #17  <Field BroadcastSetupActivity a>
			//   21   45:invokevirtual   #66  <Method void BroadcastSetupActivity.finish()>
			//   22   48:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setNegativeButton(0x7f0f04d3, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #302 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #305 <Method void android.app.AlertDialog$Builder(Context)>
	//    4    8:ldc2            #900 <Int 0x7f0f0180>
	//    5   11:invokevirtual   #902 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    6   14:ldc2            #322 <Int 0x7f0f0986>
	//    7   17:new             #26  <Class BroadcastSetupActivity$16>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #903 <Method void BroadcastSetupActivity$16(BroadcastSetupActivity)>
	//   11   25:invokevirtual   #327 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   12   28:ldc2            #328 <Int 0x7f0f04d3>
	//   13   31:aconst_null     
	//   14   32:invokevirtual   #331 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   15   35:invokevirtual   #335 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   16   38:pop             
	//   17   39:return          
	}

	private Fragment aa()
	{
		at = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #211 <Field boolean at>
		boolean flag = com.irobot.home.util.j.j(C.getConnectionInfo().getSSID());
	//    3    5:aload_0         
	//    4    6:getfield        #907 <Field WifiManager C>
	//    5    9:invokevirtual   #913 <Method WifiInfo WifiManager.getConnectionInfo()>
	//    6   12:invokevirtual   #348 <Method String WifiInfo.getSSID()>
	//    7   15:invokestatic    #663 <Method boolean j.j(String)>
	//    8   18:istore_2        
		j.setProgress(ay());
	//    9   19:aload_0         
	//   10   20:getfield        #380 <Field ProgressBar j>
	//   11   23:aload_0         
	//   12   24:invokespecial   #383 <Method int ay()>
	//   13   27:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		l();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #702 <Method void l()>
		int i1;
		if(flag)
	//*  16   34:iload_2         
	//*  17   35:ifeq            45
			i1 = 0x7f0f07b0;
	//   18   38:ldc2            #914 <Int 0x7f0f07b0>
	//   19   41:istore_1        
		else
	//*  20   42:goto            49
			i1 = 0x7f0f07db;
	//   21   45:ldc2            #915 <Int 0x7f0f07db>
	//   22   48:istore_1        
		c(i1);
	//   23   49:aload_0         
	//   24   50:iload_1         
	//   25   51:invokevirtual   #376 <Method void c(int)>
		if(a(7))
	//*  26   54:aload_0         
	//*  27   55:bipush          7
	//*  28   57:invokespecial   #406 <Method boolean a(int)>
	//*  29   60:ifeq            82
			am.put(((Object) (Integer.valueOf(7))), ((Object) (Boolean.valueOf(true))));
	//   30   63:aload_0         
	//   31   64:getfield        #205 <Field Map am>
	//   32   67:bipush          7
	//   33   69:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   34   72:iconst_1        
	//   35   73:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   36   76:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   37   81:pop             
		if(!i.d && !ag)
	//*  38   82:getstatic       #919 <Field boolean i.d>
	//*  39   85:ifne            158
	//*  40   88:aload_0         
	//*  41   89:getfield        #921 <Field boolean ag>
	//*  42   92:ifeq            98
	//*  43   95:goto            158
		{
			if(!flag)
	//*  44   98:iload_2         
	//*  45   99:ifne            116
			{
				G();
	//   46  102:aload_0         
	//   47  103:invokevirtual   #924 <Method void G()>
				a(4, 8);
	//   48  106:aload_0         
	//   49  107:iconst_4        
	//   50  108:bipush          8
	//   51  110:invokevirtual   #461 <Method void a(int, int)>
			} else
	//*  52  113:goto            130
			{
				H();
	//   53  116:aload_0         
	//   54  117:invokevirtual   #926 <Method void H()>
				x = 8;
	//   55  120:aload_0         
	//   56  121:bipush          8
	//   57  123:putfield        #247 <Field int x>
				j();
	//   58  126:aload_0         
	//   59  127:invokevirtual   #928 <Method void j()>
			}
			return ((Fragment) (com.irobot.home.fragments.af.b().a(au).a(false).b(0x7f060078).b(true).a()));
	//   60  130:invokestatic    #502 <Method com.irobot.home.fragments.af$a af.b()>
	//   61  133:aload_0         
	//   62  134:getfield        #214 <Field int au>
	//   63  137:invokevirtual   #507 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//   64  140:iconst_0        
	//   65  141:invokevirtual   #510 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//   66  144:ldc2            #511 <Int 0x7f060078>
	//   67  147:invokevirtual   #513 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(int)>
	//   68  150:iconst_1        
	//   69  151:invokevirtual   #930 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(boolean)>
	//   70  154:invokevirtual   #530 <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//   71  157:areturn         
		} else
		{
			ag = false;
	//   72  158:aload_0         
	//   73  159:iconst_0        
	//   74  160:putfield        #921 <Field boolean ag>
			a(0, 8, 0x7f0f034b, 0x7f0800c8);
	//   75  163:aload_0         
	//   76  164:iconst_0        
	//   77  165:bipush          8
	//   78  167:ldc2            #931 <Int 0x7f0f034b>
	//   79  170:ldc2            #390 <Int 0x7f0800c8>
	//   80  173:invokevirtual   #393 <Method void a(int, int, int, int)>
			return ax();
	//   81  176:aload_0         
	//   82  177:invokespecial   #933 <Method Fragment ax()>
	//   83  180:areturn         
		}
	}

	private Fragment ab()
	{
		v.setNestedScrollingEnabled(true);
	//    0    0:aload_0         
	//    1    1:getfield        #937 <Field NestedScrollView v>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #942 <Method void NestedScrollView.setNestedScrollingEnabled(boolean)>
		a(4, 8, 0x7f0f0736, 0x7f0800c8);
	//    4    8:aload_0         
	//    5    9:iconst_4        
	//    6   10:bipush          8
	//    7   12:ldc2            #943 <Int 0x7f0f0736>
	//    8   15:ldc2            #390 <Int 0x7f0800c8>
	//    9   18:invokevirtual   #393 <Method void a(int, int, int, int)>
		b(true);
	//   10   21:aload_0         
	//   11   22:iconst_1        
	//   12   23:invokevirtual   #496 <Method void b(boolean)>
		j.setProgress(ay());
	//   13   26:aload_0         
	//   14   27:getfield        #380 <Field ProgressBar j>
	//   15   30:aload_0         
	//   16   31:invokespecial   #383 <Method int ay()>
	//   17   34:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		c(0x7f0f07dd);
	//   18   37:aload_0         
	//   19   38:ldc2            #944 <Int 0x7f0f07dd>
	//   20   41:invokevirtual   #376 <Method void c(int)>
		if(a(6))
	//*  21   44:aload_0         
	//*  22   45:bipush          6
	//*  23   47:invokespecial   #406 <Method boolean a(int)>
	//*  24   50:ifeq            72
			am.put(((Object) (Integer.valueOf(6))), ((Object) (Boolean.valueOf(true))));
	//   25   53:aload_0         
	//   26   54:getfield        #205 <Field Map am>
	//   27   57:bipush          6
	//   28   59:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   29   62:iconst_1        
	//   30   63:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   31   66:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   32   71:pop             
		bq bq1 = br.d().a();
	//   33   72:invokestatic    #949 <Method com.irobot.home.fragments.br$a br.d()>
	//   34   75:invokevirtual   #954 <Method bq com.irobot.home.fragments.br$a.a()>
	//   35   78:astore_1        
		bq1.a(new com.irobot.home.fragments.bq.a() {

			public void a(AssetInfo assetinfo)
			{
				if(assetinfo != null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       12
			//*   2    4:aload_0         
			//*   3    5:getfield        #17  <Field BroadcastSetupActivity a>
			//*   4    8:invokevirtual   #25  <Method void com.irobot.home.BroadcastSetupActivity.i()>
			//*   5   11:return          
					com.irobot.home.BroadcastSetupActivity.a(a, assetinfo);
			//    6   12:aload_0         
			//    7   13:getfield        #17  <Field BroadcastSetupActivity a>
			//    8   16:aload_1         
			//    9   17:invokestatic    #28  <Method AssetInfo com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, AssetInfo)>
			//   10   20:pop             
				a.i();
			//*  11   21:goto            4
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   36   79:aload_1         
	//   37   80:new             #38  <Class BroadcastSetupActivity$2>
	//   38   83:dup             
	//   39   84:aload_0         
	//   40   85:invokespecial   #955 <Method void BroadcastSetupActivity$2(BroadcastSetupActivity)>
	//   41   88:invokevirtual   #960 <Method void bq.a(com.irobot.home.fragments.bq$a)>
		return ((Fragment) (bq1));
	//   42   91:aload_1         
	//   43   92:areturn         
	}

	private Fragment ac()
	{
		aD = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//    0    0:aload_0         
	//    1    1:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//    2    4:invokevirtual   #964 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    3    7:checkcast       #966 <Class a>
	//    4   10:putfield        #968 <Field a aD>
		aD.a(((Object) (this)), EventType.RobotPasswordEvent);
	//    5   13:aload_0         
	//    6   14:getfield        #968 <Field a aD>
	//    7   17:aload_0         
	//    8   18:getstatic       #974 <Field EventType EventType.RobotPasswordEvent>
	//    9   21:invokevirtual   #977 <Method void a.a(Object, EventType)>
		a(8, 8, 0x7f0f00c6, 0x7f0800c8);
	//   10   24:aload_0         
	//   11   25:bipush          8
	//   12   27:bipush          8
	//   13   29:ldc2            #494 <Int 0x7f0f00c6>
	//   14   32:ldc2            #390 <Int 0x7f0800c8>
	//   15   35:invokevirtual   #393 <Method void a(int, int, int, int)>
		j.setProgress(ay());
	//   16   38:aload_0         
	//   17   39:getfield        #380 <Field ProgressBar j>
	//   18   42:aload_0         
	//   19   43:invokespecial   #383 <Method int ay()>
	//   20   46:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		c(0x7f0f04b1);
	//   21   49:aload_0         
	//   22   50:ldc2            #978 <Int 0x7f0f04b1>
	//   23   53:invokevirtual   #376 <Method void c(int)>
		if(a(7))
	//*  24   56:aload_0         
	//*  25   57:bipush          7
	//*  26   59:invokespecial   #406 <Method boolean a(int)>
	//*  27   62:ifeq            84
			am.put(((Object) (Integer.valueOf(7))), ((Object) (Boolean.valueOf(true))));
	//   28   65:aload_0         
	//   29   66:getfield        #205 <Field Map am>
	//   30   69:bipush          7
	//   31   71:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   32   74:iconst_1        
	//   33   75:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   34   78:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   35   83:pop             
		ad();
	//   36   84:aload_0         
	//   37   85:invokespecial   #980 <Method void ad()>
		ArrayList arraylist = new ArrayList();
	//   38   88:new             #554 <Class ArrayList>
	//   39   91:dup             
	//   40   92:invokespecial   #672 <Method void ArrayList()>
	//   41   95:astore_1        
		arraylist.add(((Object) (String.format(getString(0x7f0f04b2), new Object[] {
			Z()
		}))));
	//   42   96:aload_1         
	//   43   97:aload_0         
	//   44   98:ldc2            #981 <Int 0x7f0f04b2>
	//   45  101:invokevirtual   #517 <Method String getString(int)>
	//   46  104:iconst_1        
	//   47  105:anewarray       Object[]
	//   48  108:dup             
	//   49  109:iconst_0        
	//   50  110:aload_0         
	//   51  111:invokespecial   #675 <Method String Z()>
	//   52  114:aastore         
	//   53  115:invokestatic    #679 <Method String String.format(String, Object[])>
	//   54  118:invokevirtual   #683 <Method boolean ArrayList.add(Object)>
	//   55  121:pop             
		return ((Fragment) (com.irobot.home.fragments.af.b().a(au).a(false).b(0x7f060078).b(true).b(getString(0x7f0f095a)).a(arraylist).a()));
	//   56  122:invokestatic    #502 <Method com.irobot.home.fragments.af$a af.b()>
	//   57  125:aload_0         
	//   58  126:getfield        #214 <Field int au>
	//   59  129:invokevirtual   #507 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//   60  132:iconst_0        
	//   61  133:invokevirtual   #510 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//   62  136:ldc2            #511 <Int 0x7f060078>
	//   63  139:invokevirtual   #513 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(int)>
	//   64  142:iconst_1        
	//   65  143:invokevirtual   #930 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(boolean)>
	//   66  146:aload_0         
	//   67  147:ldc2            #982 <Int 0x7f0f095a>
	//   68  150:invokevirtual   #517 <Method String getString(int)>
	//   69  153:invokevirtual   #984 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(String)>
	//   70  156:aload_1         
	//   71  157:invokevirtual   #527 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(ArrayList)>
	//   72  160:invokevirtual   #530 <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//   73  163:areturn         
	}

	private void ad()
	{
		ae();
	//    0    0:aload_0         
	//    1    1:invokespecial   #986 <Method void ae()>
		Object obj = ((Object) (com.irobot.home.util.j.a(Y.getAssetId())));
	//    2    4:aload_0         
	//    3    5:getfield        #608 <Field AssetInfo Y>
	//    4    8:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//    5   11:invokestatic    #989 <Method com.irobot.core.AppInfoEvent j.a(AssetId)>
	//    6   14:astore_2        
		AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
	//    7   15:invokestatic    #366 <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//    8   18:astore_1        
		assetsetupuiservicedata.setDiscoveredAssetInfo(Y);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #608 <Field AssetInfo Y>
	//   12   24:invokevirtual   #992 <Method void AssetSetupUIServiceData.setDiscoveredAssetInfo(AssetInfo)>
		assetsetupuiservicedata.setAppInfo(((com.irobot.core.AppInfoEvent) (obj)));
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #996 <Method void AssetSetupUIServiceData.setAppInfo(com.irobot.core.AppInfoEvent)>
		obj = ((Object) (Assembler.getInstance().getAssetSetupUIService()));
	//   16   32:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//   17   35:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   18   38:astore_2        
		((AssetSetupUIService) (obj)).registerUISubscriber(g);
	//   19   39:aload_2         
	//   20   40:aload_0         
	//   21   41:getfield        #244 <Field AssetSetupUIServiceDataCallback g>
	//   22   44:invokevirtual   #1000 <Method boolean AssetSetupUIService.registerUISubscriber(AssetSetupUIServiceDataCallback)>
	//   23   47:pop             
		((AssetSetupUIService) (obj)).sendCommand(AssetSetupUIServiceCommand.StartProvisioning, assetsetupuiservicedata);
	//   24   48:aload_2         
	//   25   49:getstatic       #1003 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.StartProvisioning>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #293 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
	//   28   56:return          
	}

	private void ae()
	{
		String s1 = "0.0.0.0";
	//    0    0:ldc2            #1005 <String "0.0.0.0">
	//    1    3:astore_1        
		String s2 = "0.0.0.0";
	//    2    4:ldc2            #1005 <String "0.0.0.0">
	//    3    7:astore_2        
		String s3 = "0.0.0.0";
	//    4    8:ldc2            #1005 <String "0.0.0.0">
	//    5   11:astore_3        
		String s4 = "0.0.0.0";
	//    6   12:ldc2            #1005 <String "0.0.0.0">
	//    7   15:astore          4
		String s5 = "0.0.0.0";
	//    8   17:ldc2            #1005 <String "0.0.0.0">
	//    9   20:astore          5
		if(!J.a())
	//*  10   22:aload_0         
	//*  11   23:getfield        #264 <Field WifiConfig J>
	//*  12   26:invokevirtual   #1006 <Method boolean WifiConfig.a()>
	//*  13   29:ifne            89
		{
			s1 = NetworkAddress.IPv4NumericToDottedDecimal(J.f());
	//   14   32:aload_0         
	//   15   33:getfield        #264 <Field WifiConfig J>
	//   16   36:invokevirtual   #1009 <Method long WifiConfig.f()>
	//   17   39:invokestatic    #1015 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   18   42:astore_1        
			s2 = NetworkAddress.IPv4NumericToDottedDecimal(J.e());
	//   19   43:aload_0         
	//   20   44:getfield        #264 <Field WifiConfig J>
	//   21   47:invokevirtual   #1017 <Method long WifiConfig.e()>
	//   22   50:invokestatic    #1015 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   23   53:astore_2        
			s3 = NetworkAddress.IPv4NumericToDottedDecimal(J.g());
	//   24   54:aload_0         
	//   25   55:getfield        #264 <Field WifiConfig J>
	//   26   58:invokevirtual   #1019 <Method long WifiConfig.g()>
	//   27   61:invokestatic    #1015 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   28   64:astore_3        
			s4 = NetworkAddress.IPv4NumericToDottedDecimal(J.h());
	//   29   65:aload_0         
	//   30   66:getfield        #264 <Field WifiConfig J>
	//   31   69:invokevirtual   #1021 <Method long WifiConfig.h()>
	//   32   72:invokestatic    #1015 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   33   75:astore          4
			s5 = NetworkAddress.IPv4NumericToDottedDecimal(J.i());
	//   34   77:aload_0         
	//   35   78:getfield        #264 <Field WifiConfig J>
	//   36   81:invokevirtual   #1023 <Method long WifiConfig.i()>
	//   37   84:invokestatic    #1015 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   38   87:astore          5
		}
		if(J.b() == null)
	//*  39   89:aload_0         
	//*  40   90:getfield        #264 <Field WifiConfig J>
	//*  41   93:invokevirtual   #464 <Method String WifiConfig.b()>
	//*  42   96:ifnonnull       109
			com.irobot.home.util.o.e(w, "null string value for Ssid in setWifiInfo being sent to core");
	//   43   99:aload_0         
	//   44  100:getfield        #616 <Field String w>
	//   45  103:ldc2            #1025 <String "null string value for Ssid in setWifiInfo being sent to core">
	//   46  106:invokestatic    #645 <Method void o.e(String, String)>
		AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//   47  109:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//   48  112:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   49  115:astore          6
		AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
	//   50  117:invokestatic    #366 <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//   51  120:astore          7
		if(assetsetupuiservice != null)
	//*  52  122:aload           6
	//*  53  124:ifnull          229
		{
			if(J.b() != null)
	//*  54  127:aload_0         
	//*  55  128:getfield        #264 <Field WifiConfig J>
	//*  56  131:invokevirtual   #464 <Method String WifiConfig.b()>
	//*  57  134:ifnull          149
				assetsetupuiservicedata.setHomeWifiSsid(J.b());
	//   58  137:aload           7
	//   59  139:aload_0         
	//   60  140:getfield        #264 <Field WifiConfig J>
	//   61  143:invokevirtual   #464 <Method String WifiConfig.b()>
	//   62  146:invokevirtual   #369 <Method void AssetSetupUIServiceData.setHomeWifiSsid(String)>
			if(J.d() != null)
	//*  63  149:aload_0         
	//*  64  150:getfield        #264 <Field WifiConfig J>
	//*  65  153:invokevirtual   #1027 <Method String WifiConfig.d()>
	//*  66  156:ifnull          171
				assetsetupuiservicedata.setWifiPassword(J.d());
	//   67  159:aload           7
	//   68  161:aload_0         
	//   69  162:getfield        #264 <Field WifiConfig J>
	//   70  165:invokevirtual   #1027 <Method String WifiConfig.d()>
	//   71  168:invokevirtual   #1030 <Method void AssetSetupUIServiceData.setWifiPassword(String)>
			if(com.irobot.home.util.j.e() != null)
	//*  72  171:invokestatic    #1032 <Method String j.e()>
	//*  73  174:ifnull          185
				assetsetupuiservicedata.setHomeWifiBssid(com.irobot.home.util.j.e());
	//   74  177:aload           7
	//   75  179:invokestatic    #1032 <Method String j.e()>
	//   76  182:invokevirtual   #1035 <Method void AssetSetupUIServiceData.setHomeWifiBssid(String)>
			assetsetupuiservicedata.setWifiChannel(com.irobot.home.util.j.f());
	//   77  185:aload           7
	//   78  187:invokestatic    #1038 <Method byte j.f()>
	//   79  190:invokevirtual   #1042 <Method void AssetSetupUIServiceData.setWifiChannel(byte)>
			assetsetupuiservicedata.setAdvancedWifiSettings(AdvancedWifiSettings.create(S, J.a(), s2, s1, s3, s4, s5));
	//   80  193:aload           7
	//   81  195:aload_0         
	//   82  196:getfield        #1044 <Field boolean S>
	//   83  199:aload_0         
	//   84  200:getfield        #264 <Field WifiConfig J>
	//   85  203:invokevirtual   #1006 <Method boolean WifiConfig.a()>
	//   86  206:aload_2         
	//   87  207:aload_1         
	//   88  208:aload_3         
	//   89  209:aload           4
	//   90  211:aload           5
	//   91  213:invokestatic    #1049 <Method AdvancedWifiSettings AdvancedWifiSettings.create(boolean, boolean, String, String, String, String, String)>
	//   92  216:invokevirtual   #1053 <Method void AssetSetupUIServiceData.setAdvancedWifiSettings(AdvancedWifiSettings)>
			assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.UpdateServiceData, assetsetupuiservicedata);
	//   93  219:aload           6
	//   94  221:getstatic       #372 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.UpdateServiceData>
	//   95  224:aload           7
	//   96  226:invokevirtual   #293 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
		}
	//   97  229:return          
	}

	private void af()
	{
		(new Handler(getMainLooper())).post(new Runnable() {

			public void run()
			{
				(new android.app.AlertDialog.Builder(((Context) (a)))).setTitle("Update Required").setMessage("BLE provisioning requires the robot firmware to be updated.\n\nPlease upgrade your robot or select another robot to provision.").setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(this) {

					public void onClick(DialogInterface dialoginterface, int i1)
					{
						a.a.I();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field BroadcastSetupActivity$4 a>
					//    2    4:getfield        #25  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$4.a>
					//    3    7:invokevirtual   #30  <Method void BroadcastSetupActivity.I()>
					//    4   10:return          
					}

					final _cls4 a;

			
			{
				a = _pcls4;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity$4 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).show();
			//    0    0:new             #25  <Class android.app.AlertDialog$Builder>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field BroadcastSetupActivity a>
			//    4    8:invokespecial   #28  <Method void android.app.AlertDialog$Builder(Context)>
			//    5   11:ldc1            #30  <String "Update Required">
			//    6   13:invokevirtual   #34  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
			//    7   16:ldc1            #36  <String "BLE provisioning requires the robot firmware to be updated.\n\nPlease upgrade your robot or select another robot to provision.">
			//    8   18:invokevirtual   #39  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
			//    9   21:ldc1            #40  <Int 0x7f0f05bb>
			//   10   23:new             #13  <Class BroadcastSetupActivity$4$1>
			//   11   26:dup             
			//   12   27:aload_0         
			//   13   28:invokespecial   #43  <Method void BroadcastSetupActivity$4$1(BroadcastSetupActivity$4)>
			//   14   31:invokevirtual   #47  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
			//   15   34:invokevirtual   #51  <Method AlertDialog android.app.AlertDialog$Builder.show()>
			//   16   37:pop             
			//   17   38:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #1055 <Class Handler>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1059 <Method Looper getMainLooper()>
	//    4    8:invokespecial   #1062 <Method void Handler(Looper)>
	//    5   11:new             #64  <Class BroadcastSetupActivity$4>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1063 <Method void BroadcastSetupActivity$4(BroadcastSetupActivity)>
	//    9   19:invokevirtual   #1067 <Method boolean Handler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	private boolean ag()
	{
		com.irobot.home.util.o.e(w, "Checking connection before initing network fragment.");
	//    0    0:aload_0         
	//    1    1:getfield        #616 <Field String w>
	//    2    4:ldc2            #1071 <String "Checking connection before initing network fragment.">
	//    3    7:invokestatic    #645 <Method void o.e(String, String)>
		Object obj = ((Object) (H));
	//    4   10:aload_0         
	//    5   11:getfield        #753 <Field Robot H>
	//    6   14:astore          4
		boolean flag = false;
	//    7   16:iconst_0        
	//    8   17:istore_2        
		if(obj == null)
	//*   9   18:aload           4
	//*  10   20:ifnonnull       25
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		obj = ((Object) ((WifiManager)getApplicationContext().getSystemService("wifi")));
	//   13   25:aload_0         
	//   14   26:invokevirtual   #1075 <Method Context getApplicationContext()>
	//   15   29:ldc2            #1077 <String "wifi">
	//   16   32:invokevirtual   #1083 <Method Object Context.getSystemService(String)>
	//   17   35:checkcast       #909 <Class WifiManager>
	//   18   38:astore          4
		boolean flag1;
		for(int i1 = 0; !flag && i1 < 10; flag = flag1)
	//*  19   40:iconst_0        
	//*  20   41:istore_1        
	//*  21   42:iload_2         
	//*  22   43:ifne            218
	//*  23   46:iload_1         
	//*  24   47:bipush          10
	//*  25   49:icmpge          218
		{
label0:
			{
				Object obj1 = ((Object) (((WifiManager) (obj)).getDhcpInfo()));
	//   26   52:aload           4
	//   27   54:invokevirtual   #1087 <Method DhcpInfo WifiManager.getDhcpInfo()>
	//   28   57:astore          5
				flag1 = flag;
	//   29   59:iload_2         
	//   30   60:istore_3        
				if(obj1 == null)
					break label0;
	//   31   61:aload           5
	//   32   63:ifnull          209
				if(((DhcpInfo) (obj1)).gateway == 0)
	//*  33   66:aload           5
	//*  34   68:getfield        #1092 <Field int DhcpInfo.gateway>
	//*  35   71:ifne            137
				{
					try
					{
						Thread.sleep(3000L);
	//   36   74:ldc2w           #1093 <Long 3000L>
	//   37   77:invokestatic    #1100 <Method void Thread.sleep(long)>
					}
	//*  38   80:iload_2         
	//*  39   81:istore_3        
	//*  40   82:goto            209
					// Misplaced declaration of an exception variable
					catch(Object obj1)
	//*  41   85:astore          5
					{
						String s1 = w;
	//   42   87:aload_0         
	//   43   88:getfield        #616 <Field String w>
	//   44   91:astore          6
						StringBuilder stringbuilder = new StringBuilder();
	//   45   93:new             #630 <Class StringBuilder>
	//   46   96:dup             
	//   47   97:invokespecial   #631 <Method void StringBuilder()>
	//   48  100:astore          7
						stringbuilder.append("Sleep interrupted in checkConnection: ");
	//   49  102:aload           7
	//   50  104:ldc2            #1102 <String "Sleep interrupted in checkConnection: ">
	//   51  107:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   52  110:pop             
						stringbuilder.append(((InterruptedException) (obj1)).getMessage());
	//   53  111:aload           7
	//   54  113:aload           5
	//   55  115:invokevirtual   #1105 <Method String InterruptedException.getMessage()>
	//   56  118:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   57  121:pop             
						com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   58  122:aload           6
	//   59  124:aload           7
	//   60  126:invokevirtual   #643 <Method String StringBuilder.toString()>
	//   61  129:invokestatic    #645 <Method void o.e(String, String)>
						flag1 = flag;
	//   62  132:iload_2         
	//   63  133:istore_3        
						break label0;
	//   64  134:goto            209
					}
					flag1 = flag;
					break label0;
				}
				if(J.a())
	//*  65  137:aload_0         
	//*  66  138:getfield        #264 <Field WifiConfig J>
	//*  67  141:invokevirtual   #1006 <Method boolean WifiConfig.a()>
	//*  68  144:ifeq            207
				{
					J.b(((DhcpInfo) (obj1)).ipAddress);
	//   69  147:aload_0         
	//   70  148:getfield        #264 <Field WifiConfig J>
	//   71  151:aload           5
	//   72  153:getfield        #1108 <Field int DhcpInfo.ipAddress>
	//   73  156:invokevirtual   #1110 <Method void WifiConfig.b(int)>
					J.c(((DhcpInfo) (obj1)).netmask);
	//   74  159:aload_0         
	//   75  160:getfield        #264 <Field WifiConfig J>
	//   76  163:aload           5
	//   77  165:getfield        #1113 <Field int DhcpInfo.netmask>
	//   78  168:invokevirtual   #1114 <Method void WifiConfig.c(int)>
					J.d(((DhcpInfo) (obj1)).gateway);
	//   79  171:aload_0         
	//   80  172:getfield        #264 <Field WifiConfig J>
	//   81  175:aload           5
	//   82  177:getfield        #1092 <Field int DhcpInfo.gateway>
	//   83  180:invokevirtual   #1116 <Method void WifiConfig.d(int)>
					J.e(((DhcpInfo) (obj1)).dns1);
	//   84  183:aload_0         
	//   85  184:getfield        #264 <Field WifiConfig J>
	//   86  187:aload           5
	//   87  189:getfield        #1119 <Field int DhcpInfo.dns1>
	//   88  192:invokevirtual   #1121 <Method void WifiConfig.e(int)>
					J.f(((DhcpInfo) (obj1)).dns2);
	//   89  195:aload_0         
	//   90  196:getfield        #264 <Field WifiConfig J>
	//   91  199:aload           5
	//   92  201:getfield        #1124 <Field int DhcpInfo.dns2>
	//   93  204:invokevirtual   #1126 <Method void WifiConfig.f(int)>
				}
				flag1 = true;
	//   94  207:iconst_1        
	//   95  208:istore_3        
			}
			i1++;
	//   96  209:iload_1         
	//   97  210:iconst_1        
	//   98  211:iadd            
	//   99  212:istore_1        
		}

	//  100  213:iload_3         
	//  101  214:istore_2        
	//* 102  215:goto            42
		return flag;
	//  103  218:iload_2         
	//  104  219:ireturn         
	}

	private Fragment ah()
	{
		c(0x7f0f07b0);
	//    0    0:aload_0         
	//    1    1:ldc2            #914 <Int 0x7f0f07b0>
	//    2    4:invokevirtual   #376 <Method void c(int)>
		j.setProgress(ay() - 1);
	//    3    7:aload_0         
	//    4    8:getfield        #380 <Field ProgressBar j>
	//    5   11:aload_0         
	//    6   12:invokespecial   #383 <Method int ay()>
	//    7   15:iconst_1        
	//    8   16:isub            
	//    9   17:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		a(8, 8);
	//   10   20:aload_0         
	//   11   21:bipush          8
	//   12   23:bipush          8
	//   13   25:invokevirtual   #461 <Method void a(int, int)>
		if(Y == null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #608 <Field AssetInfo Y>
	//*  16   32:ifnonnull       76
		{
			j();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #928 <Method void j()>
			if(ah != null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #191 <Field Fragment ah>
	//*  21   43:ifnull          74
				return ((Fragment) (com.irobot.home.fragments.af.b().a(au).a(false).b(0x7f060078).b(true).a()));
	//   22   46:invokestatic    #502 <Method com.irobot.home.fragments.af$a af.b()>
	//   23   49:aload_0         
	//   24   50:getfield        #214 <Field int au>
	//   25   53:invokevirtual   #507 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//   26   56:iconst_0        
	//   27   57:invokevirtual   #510 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//   28   60:ldc2            #511 <Int 0x7f060078>
	//   29   63:invokevirtual   #513 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(int)>
	//   30   66:iconst_1        
	//   31   67:invokevirtual   #930 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(boolean)>
	//   32   70:invokevirtual   #530 <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//   33   73:areturn         
			else
				return null;
	//   34   74:aconst_null     
	//   35   75:areturn         
		}
		P = false;
	//   36   76:aload_0         
	//   37   77:iconst_0        
	//   38   78:putfield        #1128 <Field boolean P>
		if(a(8))
	//*  39   81:aload_0         
	//*  40   82:bipush          8
	//*  41   84:invokespecial   #406 <Method boolean a(int)>
	//*  42   87:ifeq            109
			am.put(((Object) (Integer.valueOf(8))), ((Object) (Boolean.valueOf(true))));
	//   43   90:aload_0         
	//   44   91:getfield        #205 <Field Map am>
	//   45   94:bipush          8
	//   46   96:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   47   99:iconst_1        
	//   48  100:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   49  103:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   50  108:pop             
		(new Handler(Looper.getMainLooper())).post(new Runnable() {

			public void run()
			{
				a.d(8);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:bipush          8
			//    3    6:invokevirtual   #26  <Method void com.irobot.home.BroadcastSetupActivity.d(int)>
			//    4    9:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   51  109:new             #1055 <Class Handler>
	//   52  112:dup             
	//   53  113:invokestatic    #1131 <Method Looper Looper.getMainLooper()>
	//   54  116:invokespecial   #1062 <Method void Handler(Looper)>
	//   55  119:new             #68  <Class BroadcastSetupActivity$5>
	//   56  122:dup             
	//   57  123:aload_0         
	//   58  124:invokespecial   #1132 <Method void BroadcastSetupActivity$5(BroadcastSetupActivity)>
	//   59  127:invokevirtual   #1067 <Method boolean Handler.post(Runnable)>
	//   60  130:pop             
		if(W)
	//*  61  131:aload_0         
	//*  62  132:getfield        #172 <Field boolean W>
	//*  63  135:ifeq            143
			return ai();
	//   64  138:aload_0         
	//   65  139:invokespecial   #1134 <Method Fragment ai()>
	//   66  142:areturn         
		else
			return aj();
	//   67  143:aload_0         
	//   68  144:invokespecial   #1136 <Method Fragment aj()>
	//   69  147:areturn         
	}

	private Fragment ai()
	{
		Object obj = ((Object) (((WifiManager)getApplicationContext().getSystemService("wifi")).getConnectionInfo()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1075 <Method Context getApplicationContext()>
	//    2    4:ldc2            #1077 <String "wifi">
	//    3    7:invokevirtual   #1083 <Method Object Context.getSystemService(String)>
	//    4   10:checkcast       #909 <Class WifiManager>
	//    5   13:invokevirtual   #913 <Method WifiInfo WifiManager.getConnectionInfo()>
	//    6   16:astore_1        
		a(8, 8);
	//    7   17:aload_0         
	//    8   18:bipush          8
	//    9   20:bipush          8
	//   10   22:invokevirtual   #461 <Method void a(int, int)>
		ae();
	//   11   25:aload_0         
	//   12   26:invokespecial   #986 <Method void ae()>
		obj = ((Object) (bx.c().a(Y.asJson()).a(J).a(I).b(((WifiInfo) (obj))).a()));
	//   13   29:invokestatic    #1141 <Method com.irobot.home.fragments.bx$a bx.c()>
	//   14   32:aload_0         
	//   15   33:getfield        #608 <Field AssetInfo Y>
	//   16   36:invokevirtual   #1144 <Method String AssetInfo.asJson()>
	//   17   39:invokevirtual   #1149 <Method com.irobot.home.fragments.bx$a com.irobot.home.fragments.bx$a.a(String)>
	//   18   42:aload_0         
	//   19   43:getfield        #264 <Field WifiConfig J>
	//   20   46:invokevirtual   #1152 <Method com.irobot.home.fragments.bx$a com.irobot.home.fragments.bx$a.a(WifiConfig)>
	//   21   49:aload_0         
	//   22   50:getfield        #342 <Field WifiInfo I>
	//   23   53:invokevirtual   #1155 <Method com.irobot.home.fragments.bx$a com.irobot.home.fragments.bx$a.a(WifiInfo)>
	//   24   56:aload_1         
	//   25   57:invokevirtual   #1157 <Method com.irobot.home.fragments.bx$a com.irobot.home.fragments.bx$a.b(WifiInfo)>
	//   26   60:invokevirtual   #1160 <Method bw com.irobot.home.fragments.bx$a.a()>
	//   27   63:astore_1        
		((bw) (obj)).a(new com.irobot.home.fragments.bw.a() {

			public void a(int i1)
			{
				com.irobot.home.BroadcastSetupActivity.a(a, i1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:iload_1         
			//    3    5:invokestatic    #25  <Method int com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, int)>
			//    4    8:pop             
				BroadcastSetupActivity.g(a, false);
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
			//    7   13:iconst_0        
			//    8   14:invokestatic    #29  <Method boolean BroadcastSetupActivity.g(BroadcastSetupActivity, boolean)>
			//    9   17:pop             
				a.x = 10;
			//   10   18:aload_0         
			//   11   19:getfield        #17  <Field BroadcastSetupActivity a>
			//   12   22:bipush          10
			//   13   24:putfield        #33  <Field int BroadcastSetupActivity.x>
				com.irobot.home.BroadcastSetupActivity.m(a);
			//   14   27:aload_0         
			//   15   28:getfield        #17  <Field BroadcastSetupActivity a>
			//   16   31:invokestatic    #36  <Method void com.irobot.home.BroadcastSetupActivity.m(BroadcastSetupActivity)>
			//   17   34:return          
			}

			public void a(String s1)
			{
				BroadcastSetupActivity.h(a, true);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:iconst_1        
			//    3    5:invokestatic    #40  <Method boolean BroadcastSetupActivity.h(BroadcastSetupActivity, boolean)>
			//    4    8:pop             
				com.irobot.home.BroadcastSetupActivity.d(a, s1);
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
			//    7   13:aload_1         
			//    8   14:invokestatic    #44  <Method String com.irobot.home.BroadcastSetupActivity.d(BroadcastSetupActivity, String)>
			//    9   17:pop             
				com.irobot.home.BroadcastSetupActivity.n(a);
			//   10   18:aload_0         
			//   11   19:getfield        #17  <Field BroadcastSetupActivity a>
			//   12   22:invokestatic    #47  <Method void com.irobot.home.BroadcastSetupActivity.n(BroadcastSetupActivity)>
			//   13   25:return          
			}

			public void b(String s1)
			{
			//    0    0:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   28   64:aload_1         
	//   29   65:new             #70  <Class BroadcastSetupActivity$6>
	//   30   68:dup             
	//   31   69:aload_0         
	//   32   70:invokespecial   #1161 <Method void BroadcastSetupActivity$6(BroadcastSetupActivity)>
	//   33   73:invokevirtual   #1166 <Method void bw.a(com.irobot.home.fragments.bw$a)>
		return ((Fragment) (obj));
	//   34   76:aload_1         
	//   35   77:areturn         
	}

	private Fragment aj()
	{
		bu bu1 = bv.i().a(I).a(J).a(H.r()).a(M).b(N).c(R).d(e).a();
	//    0    0:invokestatic    #1171 <Method com.irobot.home.fragments.bv$a bv.i()>
	//    1    3:aload_0         
	//    2    4:getfield        #342 <Field WifiInfo I>
	//    3    7:invokevirtual   #1176 <Method com.irobot.home.fragments.bv$a com.irobot.home.fragments.bv$a.a(WifiInfo)>
	//    4   10:aload_0         
	//    5   11:getfield        #264 <Field WifiConfig J>
	//    6   14:invokevirtual   #1179 <Method com.irobot.home.fragments.bv$a com.irobot.home.fragments.bv$a.a(WifiConfig)>
	//    7   17:aload_0         
	//    8   18:getfield        #753 <Field Robot H>
	//    9   21:invokevirtual   #1181 <Method String Robot.r()>
	//   10   24:invokevirtual   #1184 <Method com.irobot.home.fragments.bv$a com.irobot.home.fragments.bv$a.a(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #271 <Field boolean M>
	//   13   31:invokevirtual   #1187 <Method com.irobot.home.fragments.bv$a com.irobot.home.fragments.bv$a.a(boolean)>
	//   14   34:aload_0         
	//   15   35:getfield        #1189 <Field boolean N>
	//   16   38:invokevirtual   #1191 <Method com.irobot.home.fragments.bv$a com.irobot.home.fragments.bv$a.b(boolean)>
	//   17   41:aload_0         
	//   18   42:getfield        #1193 <Field boolean R>
	//   19   45:invokevirtual   #1195 <Method com.irobot.home.fragments.bv$a com.irobot.home.fragments.bv$a.c(boolean)>
	//   20   48:aload_0         
	//   21   49:getfield        #1196 <Field boolean e>
	//   22   52:invokevirtual   #1198 <Method com.irobot.home.fragments.bv$a com.irobot.home.fragments.bv$a.d(boolean)>
	//   23   55:invokevirtual   #1201 <Method bu com.irobot.home.fragments.bv$a.a()>
	//   24   58:astore_1        
		bu1.a(new com.irobot.home.fragments.bu.b() {

			private void c()
			{
				d();
			//    0    0:aload_0         
			//    1    1:invokespecial   #25  <Method void d()>
				a.x = 5;
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field BroadcastSetupActivity a>
			//    4    8:iconst_5        
			//    5    9:putfield        #29  <Field int BroadcastSetupActivity.x>
				a.B = null;
			//    6   12:aload_0         
			//    7   13:getfield        #17  <Field BroadcastSetupActivity a>
			//    8   16:aconst_null     
			//    9   17:putfield        #33  <Field ScanResult BroadcastSetupActivity.B>
				a.E = false;
			//   10   20:aload_0         
			//   11   21:getfield        #17  <Field BroadcastSetupActivity a>
			//   12   24:iconst_0        
			//   13   25:putfield        #37  <Field boolean BroadcastSetupActivity.E>
				a.F = false;
			//   14   28:aload_0         
			//   15   29:getfield        #17  <Field BroadcastSetupActivity a>
			//   16   32:iconst_0        
			//   17   33:putfield        #40  <Field boolean BroadcastSetupActivity.F>
				a.m();
			//   18   36:aload_0         
			//   19   37:getfield        #17  <Field BroadcastSetupActivity a>
			//   20   40:invokevirtual   #43  <Method void com.irobot.home.BroadcastSetupActivity.m()>
			//   21   43:return          
			}

			private void d()
			{
				if(com.irobot.home.util.j.j(com.irobot.home.BroadcastSetupActivity.o(a)) && a.C.disconnect())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//*   2    4:invokestatic    #47  <Method String com.irobot.home.BroadcastSetupActivity.o(BroadcastSetupActivity)>
			//*   3    7:invokestatic    #53  <Method boolean j.j(String)>
			//*   4   10:ifeq            43
			//*   5   13:aload_0         
			//*   6   14:getfield        #17  <Field BroadcastSetupActivity a>
			//*   7   17:getfield        #57  <Field WifiManager BroadcastSetupActivity.C>
			//*   8   20:invokevirtual   #63  <Method boolean WifiManager.disconnect()>
			//*   9   23:ifeq            43
					com.irobot.home.util.j.a(a.C, a.I);
			//   10   26:aload_0         
			//   11   27:getfield        #17  <Field BroadcastSetupActivity a>
			//   12   30:getfield        #57  <Field WifiManager BroadcastSetupActivity.C>
			//   13   33:aload_0         
			//   14   34:getfield        #17  <Field BroadcastSetupActivity a>
			//   15   37:getfield        #66  <Field WifiInfo BroadcastSetupActivity.I>
			//   16   40:invokestatic    #69  <Method void j.a(WifiManager, WifiInfo)>
			//   17   43:return          
			}

			public void a()
			{
				BroadcastSetupActivity.g(a, false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:iconst_0        
			//    3    5:invokestatic    #73  <Method boolean BroadcastSetupActivity.g(BroadcastSetupActivity, boolean)>
			//    4    8:pop             
				BroadcastSetupActivity.e(a, true);
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
			//    7   13:iconst_1        
			//    8   14:invokestatic    #76  <Method boolean BroadcastSetupActivity.e(BroadcastSetupActivity, boolean)>
			//    9   17:pop             
				c();
			//   10   18:aload_0         
			//   11   19:invokespecial   #78  <Method void c()>
			//   12   22:return          
			}

			public void a(int i1)
			{
				V1ProvisioningError v1provisioningerror;
				switch(i1)
			//*   0    0:iload_1         
				{
			//*   1    1:tableswitch     3 15: default 68
			//			               3 296
			//			               4 282
			//			               5 68
			//			               6 68
			//			               7 271
			//			               8 68
			//			               9 260
			//			               10 229
			//			               11 213
			//			               12 199
			//			               13 185
			//			               14 132
			//			               15 116
				case 5: // '\005'
				case 6: // '\006'
				case 8: // '\b'
				default:
					v1provisioningerror = V1ProvisioningError.Default;
			//    2   68:getstatic       #85  <Field V1ProvisioningError V1ProvisioningError.Default>
			//    3   71:astore_2        
					String s1 = a.w;
			//    4   72:aload_0         
			//    5   73:getfield        #17  <Field BroadcastSetupActivity a>
			//    6   76:getfield        #89  <Field String com.irobot.home.BroadcastSetupActivity.w>
			//    7   79:astore_3        
					StringBuilder stringbuilder = new StringBuilder();
			//    8   80:new             #91  <Class StringBuilder>
			//    9   83:dup             
			//   10   84:invokespecial   #92  <Method void StringBuilder()>
			//   11   87:astore          4
					stringbuilder.append("Unknown error code during provisioning: ");
			//   12   89:aload           4
			//   13   91:ldc1            #94  <String "Unknown error code during provisioning: ">
			//   14   93:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
			//   15   96:pop             
					stringbuilder.append(i1);
			//   16   97:aload           4
			//   17   99:iload_1         
			//   18  100:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
			//   19  103:pop             
					com.irobot.home.util.o.e(s1, stringbuilder.toString());
			//   20  104:aload_3         
			//   21  105:aload           4
			//   22  107:invokevirtual   #105 <Method String StringBuilder.toString()>
			//   23  110:invokestatic    #110 <Method void o.e(String, String)>
					break;

			//*  24  113:goto            309
				case 15: // '\017'
					BroadcastSetupActivity.g(a, false);
			//   25  116:aload_0         
			//   26  117:getfield        #17  <Field BroadcastSetupActivity a>
			//   27  120:iconst_0        
			//   28  121:invokestatic    #73  <Method boolean BroadcastSetupActivity.g(BroadcastSetupActivity, boolean)>
			//   29  124:pop             
					v1provisioningerror = V1ProvisioningError.Default;
			//   30  125:getstatic       #85  <Field V1ProvisioningError V1ProvisioningError.Default>
			//   31  128:astore_2        
					break;

			//*  32  129:goto            309
				case 14: // '\016'
					BroadcastSetupActivity.g(a, false);
			//   33  132:aload_0         
			//   34  133:getfield        #17  <Field BroadcastSetupActivity a>
			//   35  136:iconst_0        
			//   36  137:invokestatic    #73  <Method boolean BroadcastSetupActivity.g(BroadcastSetupActivity, boolean)>
			//   37  140:pop             
					BroadcastSetupActivity.e(a, true);
			//   38  141:aload_0         
			//   39  142:getfield        #17  <Field BroadcastSetupActivity a>
			//   40  145:iconst_1        
			//   41  146:invokestatic    #76  <Method boolean BroadcastSetupActivity.e(BroadcastSetupActivity, boolean)>
			//   42  149:pop             
					d();
			//   43  150:aload_0         
			//   44  151:invokespecial   #25  <Method void d()>
					a.B = null;
			//   45  154:aload_0         
			//   46  155:getfield        #17  <Field BroadcastSetupActivity a>
			//   47  158:aconst_null     
			//   48  159:putfield        #33  <Field ScanResult BroadcastSetupActivity.B>
					a.E = false;
			//   49  162:aload_0         
			//   50  163:getfield        #17  <Field BroadcastSetupActivity a>
			//   51  166:iconst_0        
			//   52  167:putfield        #37  <Field boolean BroadcastSetupActivity.E>
					a.F = false;
			//   53  170:aload_0         
			//   54  171:getfield        #17  <Field BroadcastSetupActivity a>
			//   55  174:iconst_0        
			//   56  175:putfield        #40  <Field boolean BroadcastSetupActivity.F>
					v1provisioningerror = V1ProvisioningError.RobotDiscovery;
			//   57  178:getstatic       #113 <Field V1ProvisioningError V1ProvisioningError.RobotDiscovery>
			//   58  181:astore_2        
					break;

			//*  59  182:goto            309
				case 13: // '\r'
					BroadcastSetupActivity.h(a);
			//   60  185:aload_0         
			//   61  186:getfield        #17  <Field BroadcastSetupActivity a>
			//   62  189:invokestatic    #116 <Method void BroadcastSetupActivity.h(BroadcastSetupActivity)>
					v1provisioningerror = V1ProvisioningError.Link;
			//   63  192:getstatic       #119 <Field V1ProvisioningError V1ProvisioningError.Link>
			//   64  195:astore_2        
					break;

			//*  65  196:goto            309
				case 12: // '\f'
					BroadcastSetupActivity.h(a);
			//   66  199:aload_0         
			//   67  200:getfield        #17  <Field BroadcastSetupActivity a>
			//   68  203:invokestatic    #116 <Method void BroadcastSetupActivity.h(BroadcastSetupActivity)>
					v1provisioningerror = V1ProvisioningError.Network;
			//   69  206:getstatic       #122 <Field V1ProvisioningError V1ProvisioningError.Network>
			//   70  209:astore_2        
					break;

			//*  71  210:goto            309
				case 11: // '\013'
					com.irobot.home.BroadcastSetupActivity.i(a, true);
			//   72  213:aload_0         
			//   73  214:getfield        #17  <Field BroadcastSetupActivity a>
			//   74  217:iconst_1        
			//   75  218:invokestatic    #125 <Method boolean com.irobot.home.BroadcastSetupActivity.i(BroadcastSetupActivity, boolean)>
			//   76  221:pop             
					v1provisioningerror = V1ProvisioningError.NetworkReconnect;
			//   77  222:getstatic       #128 <Field V1ProvisioningError V1ProvisioningError.NetworkReconnect>
			//   78  225:astore_2        
					break;

			//*  79  226:goto            309
				case 10: // '\n'
					a.B = null;
			//   80  229:aload_0         
			//   81  230:getfield        #17  <Field BroadcastSetupActivity a>
			//   82  233:aconst_null     
			//   83  234:putfield        #33  <Field ScanResult BroadcastSetupActivity.B>
					a.E = false;
			//   84  237:aload_0         
			//   85  238:getfield        #17  <Field BroadcastSetupActivity a>
			//   86  241:iconst_0        
			//   87  242:putfield        #37  <Field boolean BroadcastSetupActivity.E>
					a.F = false;
			//   88  245:aload_0         
			//   89  246:getfield        #17  <Field BroadcastSetupActivity a>
			//   90  249:iconst_0        
			//   91  250:putfield        #40  <Field boolean BroadcastSetupActivity.F>
					v1provisioningerror = V1ProvisioningError.RobotConnection;
			//   92  253:getstatic       #131 <Field V1ProvisioningError V1ProvisioningError.RobotConnection>
			//   93  256:astore_2        
					break;

			//*  94  257:goto            309
				case 9: // '\t'
					d();
			//   95  260:aload_0         
			//   96  261:invokespecial   #25  <Method void d()>
					v1provisioningerror = V1ProvisioningError.RobotComms;
			//   97  264:getstatic       #134 <Field V1ProvisioningError V1ProvisioningError.RobotComms>
			//   98  267:astore_2        
					break;

			//*  99  268:goto            309
				case 7: // '\007'
					d();
			//  100  271:aload_0         
			//  101  272:invokespecial   #25  <Method void d()>
					v1provisioningerror = V1ProvisioningError.Ssl;
			//  102  275:getstatic       #137 <Field V1ProvisioningError V1ProvisioningError.Ssl>
			//  103  278:astore_2        
					break;

			//* 104  279:goto            309
				case 4: // '\004'
					BroadcastSetupActivity.h(a);
			//  105  282:aload_0         
			//  106  283:getfield        #17  <Field BroadcastSetupActivity a>
			//  107  286:invokestatic    #116 <Method void BroadcastSetupActivity.h(BroadcastSetupActivity)>
					v1provisioningerror = V1ProvisioningError.Dhcp;
			//  108  289:getstatic       #140 <Field V1ProvisioningError V1ProvisioningError.Dhcp>
			//  109  292:astore_2        
					break;

			//* 110  293:goto            309
				case 3: // '\003'
					com.irobot.home.BroadcastSetupActivity.d(a, true);
			//  111  296:aload_0         
			//  112  297:getfield        #17  <Field BroadcastSetupActivity a>
			//  113  300:iconst_1        
			//  114  301:invokestatic    #142 <Method boolean com.irobot.home.BroadcastSetupActivity.d(BroadcastSetupActivity, boolean)>
			//  115  304:pop             
					v1provisioningerror = V1ProvisioningError.Password;
			//  116  305:getstatic       #145 <Field V1ProvisioningError V1ProvisioningError.Password>
			//  117  308:astore_2        
					break;
				}
				com.irobot.home.BroadcastSetupActivity.a(a, i1);
			//  118  309:aload_0         
			//  119  310:getfield        #17  <Field BroadcastSetupActivity a>
			//  120  313:iload_1         
			//  121  314:invokestatic    #148 <Method int com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, int)>
			//  122  317:pop             
				a.x = 10;
			//  123  318:aload_0         
			//  124  319:getfield        #17  <Field BroadcastSetupActivity a>
			//  125  322:bipush          10
			//  126  324:putfield        #29  <Field int BroadcastSetupActivity.x>
				AnalyticsSubsystem.getInstance().trackRoombaV1ProvisioningError(BroadcastSetupActivity.p(a), v1provisioningerror);
			//  127  327:invokestatic    #154 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//  128  330:aload_0         
			//  129  331:getfield        #17  <Field BroadcastSetupActivity a>
			//  130  334:invokestatic    #158 <Method AssetInfo BroadcastSetupActivity.p(BroadcastSetupActivity)>
			//  131  337:aload_2         
			//  132  338:invokevirtual   #162 <Method void AnalyticsSubsystem.trackRoombaV1ProvisioningError(AssetInfo, V1ProvisioningError)>
				com.irobot.home.BroadcastSetupActivity.m(a);
			//  133  341:aload_0         
			//  134  342:getfield        #17  <Field BroadcastSetupActivity a>
			//  135  345:invokestatic    #164 <Method void com.irobot.home.BroadcastSetupActivity.m(BroadcastSetupActivity)>
			//  136  348:return          
			}

			public void a(String s1)
			{
				BroadcastSetupActivity.h(a, true);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:iconst_1        
			//    3    5:invokestatic    #167 <Method boolean BroadcastSetupActivity.h(BroadcastSetupActivity, boolean)>
			//    4    8:pop             
				com.irobot.home.BroadcastSetupActivity.d(a, s1);
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
			//    7   13:aload_1         
			//    8   14:invokestatic    #170 <Method String com.irobot.home.BroadcastSetupActivity.d(BroadcastSetupActivity, String)>
			//    9   17:pop             
				com.irobot.home.BroadcastSetupActivity.n(a);
			//   10   18:aload_0         
			//   11   19:getfield        #17  <Field BroadcastSetupActivity a>
			//   12   22:invokestatic    #173 <Method void com.irobot.home.BroadcastSetupActivity.n(BroadcastSetupActivity)>
			//   13   25:return          
			}

			public void a(boolean flag)
			{
				a.b(flag);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:iload_1         
			//    3    5:invokevirtual   #177 <Method void com.irobot.home.BroadcastSetupActivity.b(boolean)>
			//    4    8:return          
			}

			public void b()
			{
				a.F();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:invokevirtual   #179 <Method void BroadcastSetupActivity.F()>
			//    3    7:return          
			}

			public void b(String s1)
			{
			//    0    0:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   25   59:aload_1         
	//   26   60:new             #72  <Class BroadcastSetupActivity$7>
	//   27   63:dup             
	//   28   64:aload_0         
	//   29   65:invokespecial   #1202 <Method void BroadcastSetupActivity$7(BroadcastSetupActivity)>
	//   30   68:invokevirtual   #1207 <Method void bu.a(com.irobot.home.fragments.bu$b)>
		N = false;
	//   31   71:aload_0         
	//   32   72:iconst_0        
	//   33   73:putfield        #1189 <Field boolean N>
		R = false;
	//   34   76:aload_0         
	//   35   77:iconst_0        
	//   36   78:putfield        #1193 <Field boolean R>
		return ((Fragment) (bu1));
	//   37   81:aload_1         
	//   38   82:areturn         
	}

	private void ak()
	{
		(new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

			public void run()
			{
				a.i();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:invokevirtual   #24  <Method void com.irobot.home.BroadcastSetupActivity.i()>
			//    3    7:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 1500L);
	//    0    0:new             #1055 <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #1131 <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #1062 <Method void Handler(Looper)>
	//    4   10:new             #74  <Class BroadcastSetupActivity$8>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #1208 <Method void BroadcastSetupActivity$8(BroadcastSetupActivity)>
	//    8   18:ldc2w           #1209 <Long 1500L>
	//    9   21:invokevirtual   #1214 <Method boolean Handler.postDelayed(Runnable, long)>
	//   10   24:pop             
	//   11   25:return          
	}

	private Fragment al()
	{
		l();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #702 <Method void l()>
		c(0x7f0f04af);
	//    2    4:aload_0         
	//    3    5:ldc2            #1215 <Int 0x7f0f04af>
	//    4    8:invokevirtual   #376 <Method void c(int)>
		CheckRemoteConnectionFragment checkremoteconnectionfragment = CheckRemoteConnectionFragment_.d().a(H.s().getId()).a(az).a();
	//    5   11:invokestatic    #1220 <Method com.irobot.home.fragments.CheckRemoteConnectionFragment_$a CheckRemoteConnectionFragment_.d()>
	//    6   14:aload_0         
	//    7   15:getfield        #753 <Field Robot H>
	//    8   18:invokevirtual   #1223 <Method AssetId Robot.s()>
	//    9   21:invokevirtual   #741 <Method String AssetId.getId()>
	//   10   24:invokevirtual   #1228 <Method com.irobot.home.fragments.CheckRemoteConnectionFragment_$a com.irobot.home.fragments.CheckRemoteConnectionFragment_$a.a(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #229 <Field int az>
	//   13   31:invokevirtual   #1231 <Method com.irobot.home.fragments.CheckRemoteConnectionFragment_$a com.irobot.home.fragments.CheckRemoteConnectionFragment_$a.a(int)>
	//   14   34:invokevirtual   #1234 <Method CheckRemoteConnectionFragment com.irobot.home.fragments.CheckRemoteConnectionFragment_$a.a()>
	//   15   37:astore_1        
		checkremoteconnectionfragment.a(((com.irobot.home.fragments.CheckRemoteConnectionFragment.a) (this)));
	//   16   38:aload_1         
	//   17   39:aload_0         
	//   18   40:invokevirtual   #1239 <Method void CheckRemoteConnectionFragment.a(com.irobot.home.fragments.CheckRemoteConnectionFragment$a)>
		return ((Fragment) (checkremoteconnectionfragment));
	//   19   43:aload_1         
	//   20   44:areturn         
	}

	private void am()
	{
		if(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1196 <Field boolean e>
	//*   2    4:ifeq            28
			com.irobot.home.CustomerRegistrationActivity_.a(((Context) (this))).a(H.r()).a();
	//    3    7:aload_0         
	//    4    8:invokestatic    #1244 <Method CustomerRegistrationActivity_$a com.irobot.home.CustomerRegistrationActivity_.a(Context)>
	//    5   11:aload_0         
	//    6   12:getfield        #753 <Field Robot H>
	//    7   15:invokevirtual   #1181 <Method String Robot.r()>
	//    8   18:invokevirtual   #1249 <Method CustomerRegistrationActivity_$a com.irobot.home.CustomerRegistrationActivity_$a.a(String)>
	//    9   21:invokevirtual   #1252 <Method org.androidannotations.api.a.e com.irobot.home.CustomerRegistrationActivity_$a.a()>
	//   10   24:pop             
		else
	//*  11   25:goto            33
			setResult(-1);
	//   12   28:aload_0         
	//   13   29:iconst_m1       
	//   14   30:invokevirtual   #1255 <Method void setResult(int)>
		com.irobot.home.util.s.a();
	//   15   33:invokestatic    #1257 <Method void s.a()>
		finish();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #648 <Method void finish()>
	//   18   40:return          
	}

	private void an()
	{
		(new Handler(getMainLooper())).post(new Runnable() {

			public void run()
			{
				a.m();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:invokevirtual   #24  <Method void com.irobot.home.BroadcastSetupActivity.m()>
			//    3    7:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #1055 <Class Handler>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1059 <Method Looper getMainLooper()>
	//    4    8:invokespecial   #1062 <Method void Handler(Looper)>
	//    5   11:new             #76  <Class BroadcastSetupActivity$9>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1258 <Method void BroadcastSetupActivity$9(BroadcastSetupActivity)>
	//    9   19:invokevirtual   #1067 <Method boolean Handler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	private ProvisioningStep ao()
	{
		ProvisioningStep provisioningstep = ProvisioningStep.Undefined;
	//    0    0:getstatic       #1265 <Field ProvisioningStep ProvisioningStep.Undefined>
	//    1    3:astore_1        
		switch(x)
	//*   2    4:aload_0         
	//*   3    5:getfield        #247 <Field int x>
		{
	//*   4    8:tableswitch     0 10: default 68
	//	               0 117
	//	               1 113
	//	               2 109
	//	               3 105
	//	               4 90
	//	               5 86
	//	               6 82
	//	               7 78
	//	               8 74
	//	               9 68
	//	               10 70
		case 9: // '\t'
		default:
			return provisioningstep;
	//    5   68:aload_1         
	//    6   69:areturn         

		case 10: // '\n'
			return ProvisioningStep.Error;
	//    7   70:getstatic       #1268 <Field ProvisioningStep ProvisioningStep.Error>
	//    8   73:areturn         

		case 8: // '\b'
			return ProvisioningStep.Provisioning;
	//    9   74:getstatic       #1271 <Field ProvisioningStep ProvisioningStep.Provisioning>
	//   10   77:areturn         

		case 7: // '\007'
			return ProvisioningStep.ConnectToRoomba;
	//   11   78:getstatic       #1274 <Field ProvisioningStep ProvisioningStep.ConnectToRoomba>
	//   12   81:areturn         

		case 6: // '\006'
			return ProvisioningStep.BleDiscovery;
	//   13   82:getstatic       #1277 <Field ProvisioningStep ProvisioningStep.BleDiscovery>
	//   14   85:areturn         

		case 5: // '\005'
			return ProvisioningStep.ActivateRoomba;
	//   15   86:getstatic       #1280 <Field ProvisioningStep ProvisioningStep.ActivateRoomba>
	//   16   89:areturn         

		case 4: // '\004'
			if(an)
	//*  17   90:aload_0         
	//*  18   91:getfield        #1282 <Field boolean an>
	//*  19   94:ifeq            101
				return ProvisioningStep.AdvancedWifiSettings;
	//   20   97:getstatic       #1285 <Field ProvisioningStep ProvisioningStep.AdvancedWifiSettings>
	//   21  100:areturn         
			else
				return ProvisioningStep.WifiPassword;
	//   22  101:getstatic       #1288 <Field ProvisioningStep ProvisioningStep.WifiPassword>
	//   23  104:areturn         

		case 3: // '\003'
			return ProvisioningStep.CurrentNetwork;
	//   24  105:getstatic       #1291 <Field ProvisioningStep ProvisioningStep.CurrentNetwork>
	//   25  108:areturn         

		case 2: // '\002'
			return ProvisioningStep.RobotName;
	//   26  109:getstatic       #1294 <Field ProvisioningStep ProvisioningStep.RobotName>
	//   27  112:areturn         

		case 1: // '\001'
			return ProvisioningStep.DockPlacement;
	//   28  113:getstatic       #1297 <Field ProvisioningStep ProvisioningStep.DockPlacement>
	//   29  116:areturn         

		case 0: // '\0'
			return ProvisioningStep.SetupChecklist;
	//   30  117:getstatic       #1300 <Field ProvisioningStep ProvisioningStep.SetupChecklist>
	//   31  120:areturn         
		}
	}

	private void ap()
	{
		ProvisioningStep provisioningstep = ao();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1302 <Method ProvisioningStep ao()>
	//    2    4:astore_1        
		if(ProvisioningStep.Undefined != provisioningstep)
	//*   3    5:getstatic       #1265 <Field ProvisioningStep ProvisioningStep.Undefined>
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       19
			AnalyticsSubsystem.getInstance().trackProvStepViewed(provisioningstep);
	//    6   12:invokestatic    #1307 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #1311 <Method void AnalyticsSubsystem.trackProvStepViewed(ProvisioningStep)>
	//    9   19:return          
	}

	private void aq()
	{
		if(x == 5)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field int x>
	//*   2    4:iconst_5        
	//*   3    5:icmpne          18
		{
			AnalyticsSubsystem.getInstance().trackProvStepViewed(ProvisioningStep.ActivateRoombaContinue);
	//    4    8:invokestatic    #1307 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    5   11:getstatic       #1314 <Field ProvisioningStep ProvisioningStep.ActivateRoombaContinue>
	//    6   14:invokevirtual   #1311 <Method void AnalyticsSubsystem.trackProvStepViewed(ProvisioningStep)>
			return;
	//    7   17:return          
		}
		int i1 = x;
	//    8   18:aload_0         
	//    9   19:getfield        #247 <Field int x>
	//   10   22:istore_1        
		boolean flag2 = false;
	//   11   23:iconst_0        
	//   12   24:istore_3        
		boolean flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_2        
		if(i1 == 2)
	//*  15   27:iload_1         
	//*  16   28:iconst_2        
	//*  17   29:icmpne          79
		{
			AssetSetupUIServiceData assetsetupuiservicedata = Assembler.getInstance().getAssetSetupUIService().getServiceData();
	//   18   32:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//   19   35:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   20   38:invokevirtual   #686 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//   21   41:astore          4
			if(assetsetupuiservicedata != null)
	//*  22   43:aload           4
	//*  23   45:ifnull          139
			{
				if(assetsetupuiservicedata.getAssetName().compareTo(getString(0x7f0f07ab)) != 0)
	//*  24   48:aload           4
	//*  25   50:invokevirtual   #689 <Method String AssetSetupUIServiceData.getAssetName()>
	//*  26   53:aload_0         
	//*  27   54:ldc2            #1315 <Int 0x7f0f07ab>
	//*  28   57:invokevirtual   #517 <Method String getString(int)>
	//*  29   60:invokevirtual   #1319 <Method int String.compareTo(String)>
	//*  30   63:ifne            69
	//*  31   66:goto            71
					flag = true;
	//   32   69:iconst_1        
	//   33   70:istore_2        
				AnalyticsSubsystem.getInstance().trackProvRobotNameDone(flag);
	//   34   71:invokestatic    #1307 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   35   74:iload_2         
	//   36   75:invokevirtual   #1322 <Method void AnalyticsSubsystem.trackProvRobotNameDone(boolean)>
				return;
	//   37   78:return          
			}
		} else
		if(x == 4)
	//*  38   79:aload_0         
	//*  39   80:getfield        #247 <Field int x>
	//*  40   83:iconst_4        
	//*  41   84:icmpne          139
		{
			Object obj = ((Object) (Assembler.getInstance().getAssetSetupUIService().getServiceData()));
	//   42   87:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//   43   90:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   44   93:invokevirtual   #686 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//   45   96:astore          4
			if(obj != null)
	//*  46   98:aload           4
	//*  47  100:ifnull          139
			{
				obj = ((Object) (((AssetSetupUIServiceData) (obj)).getWifiPassword()));
	//   48  103:aload           4
	//   49  105:invokevirtual   #1325 <Method String AssetSetupUIServiceData.getWifiPassword()>
	//   50  108:astore          4
				boolean flag1 = flag2;
	//   51  110:iload_3         
	//   52  111:istore_2        
				if(obj != null)
	//*  53  112:aload           4
	//*  54  114:ifnull          132
					if(((String) (obj)).isEmpty())
	//*  55  117:aload           4
	//*  56  119:invokevirtual   #691 <Method boolean String.isEmpty()>
	//*  57  122:ifeq            130
						flag1 = flag2;
	//   58  125:iload_3         
	//   59  126:istore_2        
					else
	//*  60  127:goto            132
						flag1 = true;
	//   61  130:iconst_1        
	//   62  131:istore_2        
				AnalyticsSubsystem.getInstance().trackProvWifiPasswordDone(flag1);
	//   63  132:invokestatic    #1307 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   64  135:iload_2         
	//   65  136:invokevirtual   #1328 <Method void AnalyticsSubsystem.trackProvWifiPasswordDone(boolean)>
			}
		}
	//   66  139:return          
	}

	private void ar()
	{
		int i1;
		int j1 = ai;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field int ai>
	//    2    4:istore_2        
		i1 = 7;
	//    3    5:bipush          7
	//    4    7:istore_1        
		if(j1 == 7)
	//*   5    8:iload_2         
	//*   6    9:bipush          7
	//*   7   11:icmpne          35
		{
			finish();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #648 <Method void finish()>
			com.irobot.home.WebViewActivity_.a(((Context) (this))).a("https://global.irobot.com").a();
	//   10   18:aload_0         
	//   11   19:invokestatic    #1333 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_.a(Context)>
	//   12   22:ldc2            #1335 <String "https://global.irobot.com">
	//   13   25:invokevirtual   #1340 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//   14   28:invokevirtual   #1341 <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   15   31:pop             
			break MISSING_BLOCK_LABEL_278;
	//   16   32:goto            278
		}
		if(ai == 11)
	//*  17   35:aload_0         
	//*  18   36:getfield        #193 <Field int ai>
	//*  19   39:bipush          11
	//*  20   41:icmpne          67
		{
			x = 8;
	//   21   44:aload_0         
	//   22   45:bipush          8
	//   23   47:putfield        #247 <Field int x>
			startActivity(new Intent("android.settings.WIFI_SETTINGS"));
	//   24   50:aload_0         
	//   25   51:new             #1343 <Class Intent>
	//   26   54:dup             
	//   27   55:ldc2            #1345 <String "android.settings.WIFI_SETTINGS">
	//   28   58:invokespecial   #1347 <Method void Intent(String)>
	//   29   61:invokevirtual   #1351 <Method void startActivity(Intent)>
			break MISSING_BLOCK_LABEL_278;
	//   30   64:goto            278
		}
		ai;
	//   31   67:aload_0         
	//   32   68:getfield        #193 <Field int ai>
		JVM INSTR tableswitch 0 16: default 152
	//	               0 209
	//	               1 209
	//	               2 170
	//	               3 152
	//	               4 170
	//	               5 170
	//	               6 209
	//	               7 152
	//	               8 170
	//	               9 170
	//	               10 162
	//	               11 152
	//	               12 209
	//	               13 209
	//	               14 157
	//	               15 157
	//	               16 170;
	//   33   71:tableswitch     0 16: default 152
	//	               0 209
	//	               1 209
	//	               2 170
	//	               3 152
	//	               4 170
	//	               5 170
	//	               6 209
	//	               7 152
	//	               8 170
	//	               9 170
	//	               10 162
	//	               11 152
	//	               12 209
	//	               13 209
	//	               14 157
	//	               15 157
	//	               16 170
		   goto _L1 _L2 _L2 _L3 _L1 _L3 _L3 _L2 _L1 _L3 _L3 _L4 _L1 _L2 _L2 _L5 _L5 _L3
_L1:
		i1 = 0;
	//   34  152:iconst_0        
	//   35  153:istore_1        
		break; /* Loop/switch isn't completed */
	//   36  154:goto            211
_L5:
		i1 = 5;
	//   37  157:iconst_5        
	//   38  158:istore_1        
		break; /* Loop/switch isn't completed */
	//   39  159:goto            211
_L4:
		ag = true;
	//   40  162:aload_0         
	//   41  163:iconst_1        
	//   42  164:putfield        #921 <Field boolean ag>
		break; /* Loop/switch isn't completed */
	//   43  167:goto            211
_L3:
		if(W)
	//*  44  170:aload_0         
	//*  45  171:getfield        #172 <Field boolean W>
	//*  46  174:ifeq            194
			r.d(Y.getAssetId().getId());
	//   47  177:aload_0         
	//   48  178:getfield        #867 <Field com.irobot.home.q.b r>
	//   49  181:aload_0         
	//   50  182:getfield        #608 <Field AssetInfo Y>
	//   51  185:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//   52  188:invokevirtual   #741 <Method String AssetId.getId()>
	//   53  191:invokevirtual   #1353 <Method void com.irobot.home.q.b.d(String)>
		if(ai != 4 || W) goto _L1; else goto _L2
	//   54  194:aload_0         
	//   55  195:getfield        #193 <Field int ai>
	//   56  198:iconst_4        
	//   57  199:icmpne          152
	//   58  202:aload_0         
	//   59  203:getfield        #172 <Field boolean W>
	//   60  206:ifne            152
_L2:
		i1 = 3;
	//   61  209:iconst_3        
	//   62  210:istore_1        
		String s1 = w;
	//   63  211:aload_0         
	//   64  212:getfield        #616 <Field String w>
	//   65  215:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   66  216:new             #630 <Class StringBuilder>
	//   67  219:dup             
	//   68  220:invokespecial   #631 <Method void StringBuilder()>
	//   69  223:astore          4
		stringbuilder.append("Error code: ");
	//   70  225:aload           4
	//   71  227:ldc2            #1355 <String "Error code: ">
	//   72  230:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   73  233:pop             
		stringbuilder.append(ai);
	//   74  234:aload           4
	//   75  236:aload_0         
	//   76  237:getfield        #193 <Field int ai>
	//   77  240:invokevirtual   #640 <Method StringBuilder StringBuilder.append(int)>
	//   78  243:pop             
		stringbuilder.append(" next state: ");
	//   79  244:aload           4
	//   80  246:ldc2            #1357 <String " next state: ">
	//   81  249:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   82  252:pop             
		stringbuilder.append(i1);
	//   83  253:aload           4
	//   84  255:iload_1         
	//   85  256:invokevirtual   #640 <Method StringBuilder StringBuilder.append(int)>
	//   86  259:pop             
		com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   87  260:aload_3         
	//   88  261:aload           4
	//   89  263:invokevirtual   #643 <Method String StringBuilder.toString()>
	//   90  266:invokestatic    #777 <Method void o.b(String, String)>
		x = i1;
	//   91  269:aload_0         
	//   92  270:iload_1         
	//   93  271:putfield        #247 <Field int x>
		m();
	//   94  274:aload_0         
	//   95  275:invokevirtual   #1359 <Method void m()>
		ai = -1;
	//   96  278:aload_0         
	//   97  279:iconst_m1       
	//   98  280:putfield        #193 <Field int ai>
		return;
	//   99  283:return          
	}

	private void as()
	{
		try
		{
			unregisterReceiver(((BroadcastReceiver) (aj)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #198 <Field BroadcastSetupActivity$a aj>
	//    3    5:invokevirtual   #1365 <Method void unregisterReceiver(BroadcastReceiver)>
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #1367 <Field ProgressBar i>
	//*   6   12:bipush          8
	//*   7   14:invokevirtual   #1368 <Method void ProgressBar.setVisibility(int)>
	//*   8   17:return          
		catch(IllegalArgumentException illegalargumentexception) { }
	//    9   18:astore_1        
		i.setVisibility(8);
	//*  10   19:goto            8
	}

	private void at()
	{
		as();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1370 <Method void as()>
		q(this);
	//    2    4:aload_0         
	//    3    5:invokestatic    #1373 <Method void q(BroadcastSetupActivity)>
	//    4    8:return          
	}

	private boolean au()
	{
		if(ak == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field List ak>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		String s1 = J.b();
	//    5    9:aload_0         
	//    6   10:getfield        #264 <Field WifiConfig J>
	//    7   13:invokevirtual   #464 <Method String WifiConfig.b()>
	//    8   16:astore_3        
		Iterator iterator = ak.iterator();
	//    9   17:aload_0         
	//   10   18:getfield        #200 <Field List ak>
	//   11   21:invokeinterface #1379 <Method Iterator List.iterator()>
	//   12   26:astore          4
		boolean flag1 = false;
	//   13   28:iconst_0        
	//   14   29:istore_2        
		boolean flag;
		do
		{
			flag = flag1;
	//   15   30:iload_2         
	//   16   31:istore_1        
			if(!iterator.hasNext())
				break;
	//   17   32:aload           4
	//   18   34:invokeinterface #1384 <Method boolean Iterator.hasNext()>
	//   19   39:ifeq            101
			ScanResult scanresult = (ScanResult)iterator.next();
	//   20   42:aload           4
	//   21   44:invokeinterface #1388 <Method Object Iterator.next()>
	//   22   49:checkcast       #1390 <Class ScanResult>
	//   23   52:astore          5
			if(scanresult.SSID.equals(((Object) (s1))) && scanresult.frequency > 2400 && scanresult.frequency < 2500)
	//*  24   54:aload           5
	//*  25   56:getfield        #1393 <Field String ScanResult.SSID>
	//*  26   59:aload_3         
	//*  27   60:invokevirtual   #1396 <Method boolean String.equals(Object)>
	//*  28   63:ifeq            93
	//*  29   66:aload           5
	//*  30   68:getfield        #1399 <Field int ScanResult.frequency>
	//*  31   71:sipush          2400
	//*  32   74:icmple          93
	//*  33   77:aload           5
	//*  34   79:getfield        #1399 <Field int ScanResult.frequency>
	//*  35   82:sipush          2500
	//*  36   85:icmpge          93
				flag = true;
	//   37   88:iconst_1        
	//   38   89:istore_1        
			else
	//*  39   90:goto            95
				flag = false;
	//   40   93:iconst_0        
	//   41   94:istore_1        
			flag1 = flag;
	//   42   95:iload_1         
	//   43   96:istore_2        
		} while(!flag);
	//   44   97:iload_1         
	//   45   98:ifeq            30
		return flag;
	//   46  101:iload_1         
	//   47  102:ireturn         
	}

	private void av()
	{
		if(ab == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field AlertDialog ab>
	//*   2    4:ifnonnull       67
			ab = (new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(0x7f0f06b4).setNeutralButton(0x7f0f034b, ((android.content.DialogInterface.OnClickListener) (new ab(((Context) (this)))))).setPositiveButton(0x7f0f0235, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					com.irobot.home.BroadcastSetupActivity.d(a);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
				//    2    4:invokestatic    #25  <Method void com.irobot.home.BroadcastSetupActivity.d(BroadcastSetupActivity)>
				//    3    7:return          
				}

				final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

				public void onDismiss(DialogInterface dialoginterface)
				{
					BroadcastSetupActivity.r(a);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
				//    2    4:invokestatic    #25  <Method void BroadcastSetupActivity.r(BroadcastSetupActivity)>
				//    3    7:return          
				}

				final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).create();
	//    3    7:aload_0         
	//    4    8:new             #302 <Class android.app.AlertDialog$Builder>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #305 <Method void android.app.AlertDialog$Builder(Context)>
	//    8   16:ldc2            #1400 <Int 0x7f0f06b4>
	//    9   19:invokevirtual   #902 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   10   22:ldc2            #931 <Int 0x7f0f034b>
	//   11   25:new             #1402 <Class ab>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokespecial   #1403 <Method void ab(Context)>
	//   15   33:invokevirtual   #1406 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(int, android.content.DialogInterface$OnClickListener)>
	//   16   36:ldc2            #389 <Int 0x7f0f0235>
	//   17   39:new             #16  <Class BroadcastSetupActivity$11>
	//   18   42:dup             
	//   19   43:aload_0         
	//   20   44:invokespecial   #1407 <Method void BroadcastSetupActivity$11(BroadcastSetupActivity)>
	//   21   47:invokevirtual   #327 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   22   50:new             #14  <Class BroadcastSetupActivity$10>
	//   23   53:dup             
	//   24   54:aload_0         
	//   25   55:invokespecial   #1408 <Method void BroadcastSetupActivity$10(BroadcastSetupActivity)>
	//   26   58:invokevirtual   #1412 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//   27   61:invokevirtual   #1414 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   28   64:putfield        #178 <Field AlertDialog ab>
		ab.show();
	//   29   67:aload_0         
	//   30   68:getfield        #178 <Field AlertDialog ab>
	//   31   71:invokevirtual   #1418 <Method void AlertDialog.show()>
	//   32   74:return          
	}

	private Fragment aw()
	{
		c c1 = com.irobot.home.fragments.d.e().a(J).a(S).a();
	//    0    0:invokestatic    #1423 <Method com.irobot.home.fragments.d$a d.e()>
	//    1    3:aload_0         
	//    2    4:getfield        #264 <Field WifiConfig J>
	//    3    7:invokevirtual   #1428 <Method com.irobot.home.fragments.d$a com.irobot.home.fragments.d$a.a(WifiConfig)>
	//    4   10:aload_0         
	//    5   11:getfield        #1044 <Field boolean S>
	//    6   14:invokevirtual   #1431 <Method com.irobot.home.fragments.d$a com.irobot.home.fragments.d$a.a(boolean)>
	//    7   17:invokevirtual   #1434 <Method c com.irobot.home.fragments.d$a.a()>
	//    8   20:astore_1        
		c1.a(new com.irobot.home.fragments.c.a() {

			public void a(WifiConfig wificonfig, boolean flag)
			{
				a.J = wificonfig;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:aload_1         
			//    3    5:putfield        #26  <Field WifiConfig BroadcastSetupActivity.J>
				BroadcastSetupActivity.k(a, flag);
			//    4    8:aload_0         
			//    5    9:getfield        #17  <Field BroadcastSetupActivity a>
			//    6   12:iload_2         
			//    7   13:invokestatic    #30  <Method boolean BroadcastSetupActivity.k(BroadcastSetupActivity, boolean)>
			//    8   16:pop             
				BroadcastSetupActivity.f(a, false);
			//    9   17:aload_0         
			//   10   18:getfield        #17  <Field BroadcastSetupActivity a>
			//   11   21:iconst_0        
			//   12   22:invokestatic    #33  <Method boolean BroadcastSetupActivity.f(BroadcastSetupActivity, boolean)>
			//   13   25:pop             
				a.x = 4;
			//   14   26:aload_0         
			//   15   27:getfield        #17  <Field BroadcastSetupActivity a>
			//   16   30:iconst_4        
			//   17   31:putfield        #37  <Field int BroadcastSetupActivity.x>
				a.m();
			//   18   34:aload_0         
			//   19   35:getfield        #17  <Field BroadcastSetupActivity a>
			//   20   38:invokevirtual   #40  <Method void com.irobot.home.BroadcastSetupActivity.m()>
			//   21   41:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    9   21:aload_1         
	//   10   22:new             #24  <Class BroadcastSetupActivity$15>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokespecial   #1435 <Method void BroadcastSetupActivity$15(BroadcastSetupActivity)>
	//   14   30:invokevirtual   #1440 <Method void c.a(com.irobot.home.fragments.c$a)>
		c(0x7f0f0078);
	//   15   33:aload_0         
	//   16   34:ldc2            #1441 <Int 0x7f0f0078>
	//   17   37:invokevirtual   #376 <Method void c(int)>
		a(8, 8);
	//   18   40:aload_0         
	//   19   41:bipush          8
	//   20   43:bipush          8
	//   21   45:invokevirtual   #461 <Method void a(int, int)>
		j.setProgress(ay());
	//   22   48:aload_0         
	//   23   49:getfield        #380 <Field ProgressBar j>
	//   24   52:aload_0         
	//   25   53:invokespecial   #383 <Method int ay()>
	//   26   56:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
		if(a(11))
	//*  27   59:aload_0         
	//*  28   60:bipush          11
	//*  29   62:invokespecial   #406 <Method boolean a(int)>
	//*  30   65:ifeq            87
			am.put(((Object) (Integer.valueOf(11))), ((Object) (Boolean.valueOf(true))));
	//   31   68:aload_0         
	//   32   69:getfield        #205 <Field Map am>
	//   33   72:bipush          11
	//   34   74:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   35   77:iconst_1        
	//   36   78:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//   37   81:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//   38   86:pop             
		return ((Fragment) (c1));
	//   39   87:aload_1         
	//   40   88:areturn         
	}

	private Fragment ax()
	{
		AssetSetupUIServiceData assetsetupuiservicedata = Assembler.getInstance().getAssetSetupUIService().getServiceData();
	//    0    0:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    2    6:invokevirtual   #686 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//    3    9:astore_3        
		boolean flag = false;
	//    4   10:iconst_0        
	//    5   11:istore_2        
		if(assetsetupuiservicedata != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          43
		{
			a(getString(0x7f0f06b3, new Object[] {
				assetsetupuiservicedata.getAssetName()
			}));
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:ldc2            #1442 <Int 0x7f0f06b3>
	//   11   21:iconst_1        
	//   12   22:anewarray       Object[]
	//   13   25:dup             
	//   14   26:iconst_0        
	//   15   27:aload_3         
	//   16   28:invokevirtual   #689 <Method String AssetSetupUIServiceData.getAssetName()>
	//   17   31:aastore         
	//   18   32:invokevirtual   #317 <Method String getString(int, Object[])>
	//   19   35:invokevirtual   #465 <Method void a(String)>
			flag = assetsetupuiservicedata.isTridentRobot();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #1445 <Method boolean AssetSetupUIServiceData.isTridentRobot()>
	//   22   42:istore_2        
		}
		int i1;
		if(flag)
	//*  23   43:iload_2         
	//*  24   44:ifeq            54
			i1 = 0x7f0801df;
	//   25   47:ldc2            #1446 <Int 0x7f0801df>
	//   26   50:istore_1        
		else
	//*  27   51:goto            58
			i1 = 0x7f0801de;
	//   28   54:ldc2            #1447 <Int 0x7f0801de>
	//   29   57:istore_1        
		if(ah == null)
	//*  30   58:aload_0         
	//*  31   59:getfield        #191 <Field Fragment ah>
	//*  32   62:ifnonnull       102
			ah = ((Fragment) (com.irobot.home.fragments.af.b().a(i1).a(true).b(0x7f060078).a(com.irobot.home.util.j.b(0x7f030007, getResources())).a()));
	//   33   65:aload_0         
	//   34   66:invokestatic    #502 <Method com.irobot.home.fragments.af$a af.b()>
	//   35   69:iload_1         
	//   36   70:invokevirtual   #507 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//   37   73:iconst_1        
	//   38   74:invokevirtual   #510 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//   39   77:ldc2            #511 <Int 0x7f060078>
	//   40   80:invokevirtual   #513 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(int)>
	//   41   83:ldc2            #1448 <Int 0x7f030007>
	//   42   86:aload_0         
	//   43   87:invokevirtual   #297 <Method Resources getResources()>
	//   44   90:invokestatic    #524 <Method ArrayList j.b(int, Resources)>
	//   45   93:invokevirtual   #527 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(ArrayList)>
	//   46   96:invokevirtual   #530 <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//   47   99:putfield        #191 <Field Fragment ah>
		return ah;
	//   48  102:aload_0         
	//   49  103:getfield        #191 <Field Fragment ah>
	//   50  106:areturn         
	}

	private int ay()
	{
		int i1 = x;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field int x>
	//    2    4:istore_1        
		return (j.getMax() / k) * (i1 + 1);
	//    3    5:aload_0         
	//    4    6:getfield        #380 <Field ProgressBar j>
	//    5    9:invokevirtual   #1451 <Method int ProgressBar.getMax()>
	//    6   12:aload_0         
	//    7   13:getfield        #1454 <Field int k>
	//    8   16:idiv            
	//    9   17:iload_1         
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:imul            
	//   13   21:ireturn         
	}

	private String az()
	{
		return ((WifiManager)getApplicationContext().getSystemService("wifi")).getConnectionInfo().getSSID();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1075 <Method Context getApplicationContext()>
	//    2    4:ldc2            #1077 <String "wifi">
	//    3    7:invokevirtual   #1083 <Method Object Context.getSystemService(String)>
	//    4   10:checkcast       #909 <Class WifiManager>
	//    5   13:invokevirtual   #913 <Method WifiInfo WifiManager.getConnectionInfo()>
	//    6   16:invokevirtual   #348 <Method String WifiInfo.getSSID()>
	//    7   19:areturn         
	}

	static void b(BroadcastSetupActivity broadcastsetupactivity, String s1)
	{
		broadcastsetupactivity.c(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1455 <Method void c(String)>
	//    3    5:return          
	}

	private void b(String s1)
	{
	//    0    0:return          
	}

	static boolean b(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.au();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1458 <Method boolean au()>
	//    2    4:ireturn         
	}

	static boolean b(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.O = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #458 <Field boolean O>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static List c(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.ak;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field List ak>
	//    2    4:areturn         
	}

	static void c(BroadcastSetupActivity broadcastsetupactivity, String s1)
	{
		broadcastsetupactivity.d(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1460 <Method void d(String)>
	//    3    5:return          
	}

	private void c(String s1)
	{
	//    0    0:return          
	}

	static boolean c(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.X = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #174 <Field boolean X>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String d(BroadcastSetupActivity broadcastsetupactivity, String s1)
	{
		broadcastsetupactivity.Z = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1463 <Field String Z>
		return s1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void d(BroadcastSetupActivity broadcastsetupactivity)
	{
		broadcastsetupactivity.at();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1465 <Method void at()>
	//    2    4:return          
	}

	private void d(String s1)
	{
	//    0    0:return          
	}

	static boolean d(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.V = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #434 <Field boolean V>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void e(BroadcastSetupActivity broadcastsetupactivity)
	{
		broadcastsetupactivity.av();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1467 <Method void av()>
	//    2    4:return          
	}

	static boolean e(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.N = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1189 <Field boolean N>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static BluetoothAdapter f(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.ad;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field BluetoothAdapter ad>
	//    2    4:areturn         
	}

	static boolean f(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.an = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1282 <Field boolean an>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static BluetoothStateReceiver g(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.ac;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field BluetoothStateReceiver ac>
	//    2    4:areturn         
	}

	static boolean g(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.M = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #271 <Field boolean M>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void h(BroadcastSetupActivity broadcastsetupactivity)
	{
		broadcastsetupactivity.O();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1471 <Method void O()>
	//    2    4:return          
	}

	static boolean h(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.P = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1128 <Field boolean P>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static boolean i(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.W;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field boolean W>
	//    2    4:ireturn         
	}

	static boolean i(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.R = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1193 <Field boolean R>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void j(BroadcastSetupActivity broadcastsetupactivity)
	{
		broadcastsetupactivity.ae();
	//    0    0:aload_0         
	//    1    1:invokespecial   #986 <Method void ae()>
	//    2    4:return          
	}

	static boolean j(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.T = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1473 <Field boolean T>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static boolean k(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.V;
	//    0    0:aload_0         
	//    1    1:getfield        #434 <Field boolean V>
	//    2    4:ireturn         
	}

	static boolean k(BroadcastSetupActivity broadcastsetupactivity, boolean flag)
	{
		broadcastsetupactivity.S = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1044 <Field boolean S>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static boolean l(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.M;
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field boolean M>
	//    2    4:ireturn         
	}

	static void m(BroadcastSetupActivity broadcastsetupactivity)
	{
		broadcastsetupactivity.an();
	//    0    0:aload_0         
	//    1    1:invokespecial   #834 <Method void an()>
	//    2    4:return          
	}

	static void n(BroadcastSetupActivity broadcastsetupactivity)
	{
		broadcastsetupactivity.ak();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1475 <Method void ak()>
	//    2    4:return          
	}

	static String o(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.az();
	//    0    0:aload_0         
	//    1    1:invokespecial   #660 <Method String az()>
	//    2    4:areturn         
	}

	static AssetInfo p(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.Y;
	//    0    0:aload_0         
	//    1    1:getfield        #608 <Field AssetInfo Y>
	//    2    4:areturn         
	}

	static void q(BroadcastSetupActivity broadcastsetupactivity)
	{
		((WizardFragmentActivity) (broadcastsetupactivity)).com.irobot.home.WizardFragmentActivity.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1481 <Method void com.irobot.home.WizardFragmentActivity.n()>
	//    2    4:return          
	}

	static void r(BroadcastSetupActivity broadcastsetupactivity)
	{
		broadcastsetupactivity.as();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1370 <Method void as()>
	//    2    4:return          
	}

	static ProvisioningStep s(BroadcastSetupActivity broadcastsetupactivity)
	{
		return broadcastsetupactivity.ao();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1302 <Method ProvisioningStep ao()>
	//    2    4:areturn         
	}

	protected void A()
	{
		if(Y == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #608 <Field AssetInfo Y>
	//*   2    4:ifnonnull       18
		{
			com.irobot.home.util.o.e(w, "Error reached but no discovered asset to provide FAQ.");
	//    3    7:aload_0         
	//    4    8:getfield        #616 <Field String w>
	//    5   11:ldc2            #1484 <String "Error reached but no discovered asset to provide FAQ.">
	//    6   14:invokestatic    #645 <Method void o.e(String, String)>
			return;
	//    7   17:return          
		}
		if(ap != null && ap.equals(((Object) (Y.getSku()))))
	//*   8   18:aload_0         
	//*   9   19:getfield        #207 <Field String ap>
	//*  10   22:ifnull          47
	//*  11   25:aload_0         
	//*  12   26:getfield        #207 <Field String ap>
	//*  13   29:aload_0         
	//*  14   30:getfield        #608 <Field AssetInfo Y>
	//*  15   33:invokevirtual   #613 <Method String AssetInfo.getSku()>
	//*  16   36:invokevirtual   #1396 <Method boolean String.equals(Object)>
	//*  17   39:ifeq            47
		{
			B();
	//   18   42:aload_0         
	//   19   43:invokevirtual   #1486 <Method void B()>
			return;
	//   20   46:return          
		} else
		{
			ap = Y.getSku();
	//   21   47:aload_0         
	//   22   48:aload_0         
	//   23   49:getfield        #608 <Field AssetInfo Y>
	//   24   52:invokevirtual   #613 <Method String AssetInfo.getSku()>
	//   25   55:putfield        #207 <Field String ap>
			String s1 = w;
	//   26   58:aload_0         
	//   27   59:getfield        #616 <Field String w>
	//   28   62:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   29   63:new             #630 <Class StringBuilder>
	//   30   66:dup             
	//   31   67:invokespecial   #631 <Method void StringBuilder()>
	//   32   70:astore_2        
			stringbuilder.append("requesting errors for: ");
	//   33   71:aload_2         
	//   34   72:ldc2            #1488 <String "requesting errors for: ">
	//   35   75:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   36   78:pop             
			stringbuilder.append(com.irobot.home.util.j.f(((Context) (this))));
	//   37   79:aload_2         
	//   38   80:aload_0         
	//   39   81:invokestatic    #1491 <Method String j.f(Context)>
	//   40   84:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   41   87:pop             
			stringbuilder.append("/");
	//   42   88:aload_2         
	//   43   89:ldc2            #1493 <String "/">
	//   44   92:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   45   95:pop             
			stringbuilder.append(com.irobot.home.util.j.h(((Context) (this))));
	//   46   96:aload_2         
	//   47   97:aload_0         
	//   48   98:invokestatic    #1495 <Method String j.h(Context)>
	//   49  101:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   50  104:pop             
			stringbuilder.append("/");
	//   51  105:aload_2         
	//   52  106:ldc2            #1493 <String "/">
	//   53  109:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   54  112:pop             
			stringbuilder.append(ap);
	//   55  113:aload_2         
	//   56  114:aload_0         
	//   57  115:getfield        #207 <Field String ap>
	//   58  118:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   59  121:pop             
			com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   60  122:aload_1         
	//   61  123:aload_2         
	//   62  124:invokevirtual   #643 <Method String StringBuilder.toString()>
	//   63  127:invokestatic    #777 <Method void o.b(String, String)>
			ar = com.irobot.home.util.s.b(L.getHelpInfo(com.irobot.home.util.j.f(((Context) (this))), com.irobot.home.util.j.h(((Context) (this))), ap));
	//   64  130:aload_0         
	//   65  131:aload_0         
	//   66  132:getfield        #168 <Field CustomerCareRestClient L>
	//   67  135:aload_0         
	//   68  136:invokestatic    #1491 <Method String j.f(Context)>
	//   69  139:aload_0         
	//   70  140:invokestatic    #1495 <Method String j.h(Context)>
	//   71  143:aload_0         
	//   72  144:getfield        #207 <Field String ap>
	//   73  147:invokeinterface #1501 <Method com.irobot.home.model.rest.HelpInfo CustomerCareRestClient.getHelpInfo(String, String, String)>
	//   74  152:invokestatic    #1504 <Method Map s.b(com.irobot.home.model.rest.HelpInfo)>
	//   75  155:putfield        #1506 <Field Map ar>
			B();
	//   76  158:aload_0         
	//   77  159:invokevirtual   #1486 <Method void B()>
			return;
	//   78  162:return          
		}
	}

	protected void B()
	{
		boolean flag;
		String s1;
		Object obj;
		int i1 = x;
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field int x>
	//    2    4:istore_1        
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		obj = null;
	//    5    7:aconst_null     
	//    6    8:astore          6
		s1 = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		if(i1 != 10)
			break MISSING_BLOCK_LABEL_173;
	//    9   13:iload_1         
	//   10   14:bipush          10
	//   11   16:icmpne          173
		if(ar != null) goto _L2; else goto _L1
	//   12   19:aload_0         
	//   13   20:getfield        #1506 <Field Map ar>
	//   14   23:ifnonnull       35
_L1:
		ao = s1;
	//   15   26:aload_0         
	//   16   27:aload           5
	//   17   29:putfield        #1508 <Field String ao>
		break; /* Loop/switch isn't completed */
	//   18   32:goto            119
_L2:
		if(ar.containsKey(((Object) (Integer.valueOf(ai)))))
	//*  19   35:aload_0         
	//*  20   36:getfield        #1506 <Field Map ar>
	//*  21   39:aload_0         
	//*  22   40:getfield        #193 <Field int ai>
	//*  23   43:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//*  24   46:invokeinterface #891 <Method boolean Map.containsKey(Object)>
	//*  25   51:ifeq            80
		{
			ao = (String)ar.get(((Object) (Integer.valueOf(ai))));
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:getfield        #1506 <Field Map ar>
	//   29   59:aload_0         
	//   30   60:getfield        #193 <Field int ai>
	//   31   63:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   32   66:invokeinterface #895 <Method Object Map.get(Object)>
	//   33   71:checkcast       #557 <Class String>
	//   34   74:putfield        #1508 <Field String ao>
			break; /* Loop/switch isn't completed */
	//   35   77:goto            119
		}
		if(ar.containsKey(((Object) (Integer.valueOf(15)))))
	//*  36   80:aload_0         
	//*  37   81:getfield        #1506 <Field Map ar>
	//*  38   84:bipush          15
	//*  39   86:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//*  40   89:invokeinterface #891 <Method boolean Map.containsKey(Object)>
	//*  41   94:ifeq            26
			s1 = (String)ar.get(((Object) (Integer.valueOf(15))));
	//   42   97:aload_0         
	//   43   98:getfield        #1506 <Field Map ar>
	//   44  101:bipush          15
	//   45  103:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//   46  106:invokeinterface #895 <Method Object Map.get(Object)>
	//   47  111:checkcast       #557 <Class String>
	//   48  114:astore          5
		if(true) goto _L1; else goto _L3
	//   49  116:goto            26
_L3:
		if(K instanceof af)
	//*  50  119:aload_0         
	//*  51  120:getfield        #1511 <Field Fragment K>
	//*  52  123:instanceof      #499 <Class af>
	//*  53  126:ifeq            300
			if(K.isVisible())
	//*  54  129:aload_0         
	//*  55  130:getfield        #1511 <Field Fragment K>
	//*  56  133:invokevirtual   #1516 <Method boolean Fragment.isVisible()>
	//*  57  136:ifeq            156
				((af)K).a(ao);
	//   58  139:aload_0         
	//   59  140:getfield        #1511 <Field Fragment K>
	//   60  143:checkcast       #499 <Class af>
	//   61  146:aload_0         
	//   62  147:getfield        #1508 <Field String ao>
	//   63  150:invokevirtual   #1517 <Method void af.a(String)>
			else
	//*  64  153:goto            300
				((af)K).b(ao);
	//   65  156:aload_0         
	//   66  157:getfield        #1511 <Field Fragment K>
	//   67  160:checkcast       #499 <Class af>
	//   68  163:aload_0         
	//   69  164:getfield        #1508 <Field String ao>
	//   70  167:invokevirtual   #1518 <Method void af.b(String)>
		break MISSING_BLOCK_LABEL_300;
	//   71  170:goto            300
		int j1 = x;
	//   72  173:aload_0         
	//   73  174:getfield        #247 <Field int x>
	//   74  177:istore_1        
		if(an)
	//*  75  178:aload_0         
	//*  76  179:getfield        #1282 <Field boolean an>
	//*  77  182:ifeq            188
			j1 = 11;
	//   78  185:bipush          11
	//   79  187:istore_1        
		int k1 = j1;
	//   80  188:iload_1         
	//   81  189:istore_2        
		if(x == 7)
	//*  82  190:aload_0         
	//*  83  191:getfield        #247 <Field int x>
	//*  84  194:bipush          7
	//*  85  196:icmpne          211
		{
			k1 = j1;
	//   86  199:iload_1         
	//   87  200:istore_2        
			if(ah != null)
	//*  88  201:aload_0         
	//*  89  202:getfield        #191 <Field Fragment ah>
	//*  90  205:ifnull          211
				k1 = 12;
	//   91  208:bipush          12
	//   92  210:istore_2        
		}
		String s2 = ((String) (obj));
	//   93  211:aload           6
	//   94  213:astore          5
		if(aq != null)
	//*  95  215:aload_0         
	//*  96  216:getfield        #1520 <Field Map aq>
	//*  97  219:ifnull          263
			if(!aq.containsKey(((Object) (Integer.valueOf(k1)))))
	//*  98  222:aload_0         
	//*  99  223:getfield        #1520 <Field Map aq>
	//* 100  226:iload_2         
	//* 101  227:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//* 102  230:invokeinterface #891 <Method boolean Map.containsKey(Object)>
	//* 103  235:ifne            245
				s2 = ((String) (obj));
	//  104  238:aload           6
	//  105  240:astore          5
			else
	//* 106  242:goto            263
				s2 = (String)aq.get(((Object) (Integer.valueOf(k1))));
	//  107  245:aload_0         
	//  108  246:getfield        #1520 <Field Map aq>
	//  109  249:iload_2         
	//  110  250:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//  111  253:invokeinterface #895 <Method Object Map.get(Object)>
	//  112  258:checkcast       #557 <Class String>
	//  113  261:astore          5
		ao = s2;
	//  114  263:aload_0         
	//  115  264:aload           5
	//  116  266:putfield        #1508 <Field String ao>
		boolean flag1;
		if(com.irobot.home.util.j.a() && !com.irobot.home.util.j.j(az()))
	//* 117  269:invokestatic    #658 <Method boolean j.a()>
	//* 118  272:ifeq            291
	//* 119  275:aload_0         
	//* 120  276:invokespecial   #660 <Method String az()>
	//* 121  279:invokestatic    #663 <Method boolean j.j(String)>
	//* 122  282:ifne            291
			flag1 = true;
	//  123  285:iconst_1        
	//  124  286:istore          4
		else
	//* 125  288:goto            294
			flag1 = false;
	//  126  291:iconst_0        
	//  127  292:istore          4
		as = flag1;
	//  128  294:aload_0         
	//  129  295:iload           4
	//  130  297:putfield        #209 <Field boolean as>
		ImageButton imagebutton = a;
	//  131  300:aload_0         
	//  132  301:getfield        #1522 <Field ImageButton a>
	//  133  304:astore          5
		byte byte0;
		if(ao != null && as)
	//* 134  306:aload_0         
	//* 135  307:getfield        #1508 <Field String ao>
	//* 136  310:ifnull          325
	//* 137  313:aload_0         
	//* 138  314:getfield        #209 <Field boolean as>
	//* 139  317:ifeq            325
			byte0 = ((byte) (flag));
	//  140  320:iload_3         
	//  141  321:istore_1        
		else
	//* 142  322:goto            327
			byte0 = 4;
	//  143  325:iconst_4        
	//  144  326:istore_1        
		imagebutton.setVisibility(((int) (byte0)));
	//  145  327:aload           5
	//  146  329:iload_1         
	//  147  330:invokevirtual   #1525 <Method void ImageButton.setVisibility(int)>
		return;
	//  148  333:return          
	}

	protected void C()
	{
		byte byte0;
		ImageButton imagebutton;
		if(3 != x && 4 != x)
	//*   0    0:iconst_3        
	//*   1    1:aload_0         
	//*   2    2:getfield        #247 <Field int x>
	//*   3    5:icmpeq          30
	//*   4    8:iconst_4        
	//*   5    9:aload_0         
	//*   6   10:getfield        #247 <Field int x>
	//*   7   13:icmpne          19
	//*   8   16:goto            30
		{
			imagebutton = b;
	//    9   19:aload_0         
	//   10   20:getfield        #1527 <Field ImageButton b>
	//   11   23:astore_2        
			byte0 = 8;
	//   12   24:bipush          8
	//   13   26:istore_1        
		} else
	//*  14   27:goto            37
		{
			imagebutton = b;
	//   15   30:aload_0         
	//   16   31:getfield        #1527 <Field ImageButton b>
	//   17   34:astore_2        
			byte0 = 0;
	//   18   35:iconst_0        
	//   19   36:istore_1        
		}
		imagebutton.setVisibility(((int) (byte0)));
	//   20   37:aload_2         
	//   21   38:iload_1         
	//   22   39:invokevirtual   #1525 <Method void ImageButton.setVisibility(int)>
	//   23   42:return          
	}

	protected void D()
	{
		if(6 == x)
	//*   0    0:bipush          6
	//*   1    2:aload_0         
	//*   2    3:getfield        #247 <Field int x>
	//*   3    6:icmpne          35
		{
			m.setTextColor(getResources().getColor(0x7f060078));
	//    4    9:aload_0         
	//    5   10:getfield        #426 <Field Button m>
	//    6   13:aload_0         
	//    7   14:invokevirtual   #297 <Method Resources getResources()>
	//    8   17:ldc2            #511 <Int 0x7f060078>
	//    9   20:invokevirtual   #1534 <Method int Resources.getColor(int)>
	//   10   23:invokevirtual   #1537 <Method void Button.setTextColor(int)>
			m.setBackgroundColor(0);
	//   11   26:aload_0         
	//   12   27:getfield        #426 <Field Button m>
	//   13   30:iconst_0        
	//   14   31:invokevirtual   #1540 <Method void Button.setBackgroundColor(int)>
			return;
	//   15   34:return          
		} else
		{
			m.setTextColor(getResources().getColor(0x7f060076));
	//   16   35:aload_0         
	//   17   36:getfield        #426 <Field Button m>
	//   18   39:aload_0         
	//   19   40:invokevirtual   #297 <Method Resources getResources()>
	//   20   43:ldc2            #1541 <Int 0x7f060076>
	//   21   46:invokevirtual   #1534 <Method int Resources.getColor(int)>
	//   22   49:invokevirtual   #1537 <Method void Button.setTextColor(int)>
			return;
	//   23   52:return          
		}
	}

	public void E()
	{
		IRobotModel irobotmodel = l.h();
	//    0    0:aload_0         
	//    1    1:getfield        #1544 <Field IRobotApplication l>
	//    2    4:invokevirtual   #809 <Method IRobotModel IRobotApplication.h()>
	//    3    7:astore_1        
		irobotmodel.b(irobotmodel.d(H.s().getId()));
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #753 <Field Robot H>
	//    8   14:invokevirtual   #1223 <Method AssetId Robot.s()>
	//    9   17:invokevirtual   #741 <Method String AssetId.getId()>
	//   10   20:invokevirtual   #1546 <Method com.irobot.home.model.a IRobotModel.d(String)>
	//   11   23:invokevirtual   #1548 <Method void IRobotModel.b(com.irobot.home.model.a)>
		com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//   12   26:aload_0         
	//   13   27:invokestatic    #1551 <Method void j.a(android.app.Activity)>
		finish();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #648 <Method void finish()>
	//   16   34:return          
	}

	public void a(com.irobot.home.fragments.CheckRemoteConnectionFragment.a.a a1, boolean flag)
	{
		if(a1 != com.irobot.home.fragments.CheckRemoteConnectionFragment.a.a.NoInternetConnectivity) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:getstatic       #1558 <Field com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a.NoInternetConnectivity>
	//    2    4:if_acmpne       28
_L1:
		a1 = ((com.irobot.home.fragments.CheckRemoteConnectionFragment.a.a) (a(getString(0x7f0f07b6), false)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:ldc2            #1559 <Int 0x7f0f07b6>
	//    6   12:invokevirtual   #517 <Method String getString(int)>
	//    7   15:iconst_0        
	//    8   16:invokespecial   #1561 <Method Fragment a(String, boolean)>
	//    9   19:astore_1        
_L4:
		K = ((Fragment) (a1));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #1511 <Field Fragment K>
		break MISSING_BLOCK_LABEL_123;
	//   13   25:goto            123
_L2:
		if(a1 != com.irobot.home.fragments.CheckRemoteConnectionFragment.a.a.BlockedMqttPort)
			break; /* Loop/switch isn't completed */
	//   14   28:aload_1         
	//   15   29:getstatic       #1564 <Field com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a.BlockedMqttPort>
	//   16   32:if_acmpne       51
		a1 = ((com.irobot.home.fragments.CheckRemoteConnectionFragment.a.a) (a(getString(0x7f0f0307), true)));
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:ldc2            #1565 <Int 0x7f0f0307>
	//   20   40:invokevirtual   #517 <Method String getString(int)>
	//   21   43:iconst_1        
	//   22   44:invokespecial   #1561 <Method Fragment a(String, boolean)>
	//   23   47:astore_1        
		if(true) goto _L4; else goto _L3
	//   24   48:goto            20
_L3:
		if(flag)
	//*  25   51:iload_2         
	//*  26   52:ifeq            119
		{
			c(0x7f0f088a);
	//   27   55:aload_0         
	//   28   56:ldc2            #1566 <Int 0x7f0f088a>
	//   29   59:invokevirtual   #376 <Method void c(int)>
			if(K instanceof CheckRemoteConnectionFragment)
	//*  30   62:aload_0         
	//*  31   63:getfield        #1511 <Field Fragment K>
	//*  32   66:instanceof      #1236 <Class CheckRemoteConnectionFragment>
	//*  33   69:ifeq            94
			{
				((CheckRemoteConnectionFragment)K).a(false);
	//   34   72:aload_0         
	//   35   73:getfield        #1511 <Field Fragment K>
	//   36   76:checkcast       #1236 <Class CheckRemoteConnectionFragment>
	//   37   79:iconst_0        
	//   38   80:invokevirtual   #1568 <Method void CheckRemoteConnectionFragment.a(boolean)>
				((CheckRemoteConnectionFragment)K).b(false);
	//   39   83:aload_0         
	//   40   84:getfield        #1511 <Field Fragment K>
	//   41   87:checkcast       #1236 <Class CheckRemoteConnectionFragment>
	//   42   90:iconst_0        
	//   43   91:invokevirtual   #1569 <Method void CheckRemoteConnectionFragment.b(boolean)>
			}
			(new Handler()).postDelayed(new Runnable() {

				public void run()
				{
					com.irobot.home.OnDemandOtaActivity_.a(((Context) (a))).a(a.H.s().getId()).a(OnDemandOTAEntryType.RequestOnDemandOTA).a(OnDemandOTAPathType.Provisioning).a(true).a();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field BroadcastSetupActivity a>
				//    2    4:invokestatic    #26  <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_.a(Context)>
				//    3    7:aload_0         
				//    4    8:getfield        #16  <Field BroadcastSetupActivity a>
				//    5   11:getfield        #30  <Field Robot BroadcastSetupActivity.H>
				//    6   14:invokevirtual   #36  <Method AssetId Robot.s()>
				//    7   17:invokevirtual   #42  <Method String AssetId.getId()>
				//    8   20:invokevirtual   #47  <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(String)>
				//    9   23:getstatic       #53  <Field OnDemandOTAEntryType OnDemandOTAEntryType.RequestOnDemandOTA>
				//   10   26:invokevirtual   #56  <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAEntryType)>
				//   11   29:getstatic       #62  <Field OnDemandOTAPathType OnDemandOTAPathType.Provisioning>
				//   12   32:invokevirtual   #65  <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAPathType)>
				//   13   35:iconst_1        
				//   14   36:invokevirtual   #68  <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(boolean)>
				//   15   39:invokevirtual   #71  <Method org.androidannotations.api.a.e com.irobot.home.OnDemandOtaActivity_$a.a()>
				//   16   42:pop             
					a.finish();
				//   17   43:aload_0         
				//   18   44:getfield        #16  <Field BroadcastSetupActivity a>
				//   19   47:invokevirtual   #74  <Method void BroadcastSetupActivity.finish()>
				//   20   50:return          
				}

				final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
, 1000L);
	//   44   94:new             #1055 <Class Handler>
	//   45   97:dup             
	//   46   98:invokespecial   #1570 <Method void Handler()>
	//   47  101:new             #28  <Class BroadcastSetupActivity$17>
	//   48  104:dup             
	//   49  105:aload_0         
	//   50  106:invokespecial   #1571 <Method void BroadcastSetupActivity$17(BroadcastSetupActivity)>
	//   51  109:ldc2w           #1572 <Long 1000L>
	//   52  112:invokevirtual   #1214 <Method boolean Handler.postDelayed(Runnable, long)>
	//   53  115:pop             
		} else
	//*  54  116:goto            123
		{
			am();
	//   55  119:aload_0         
	//   56  120:invokespecial   #1575 <Method void am()>
		}
		super.m();
	//   57  123:aload_0         
	//   58  124:invokespecial   #1576 <Method void com.irobot.home.WizardFragmentActivity.m()>
		return;
	//   59  127:return          
	}

	public void a(String s1)
	{
		q.setPadding(0, 0, 0, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #1578 <Field TextView q>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #1583 <Method void TextView.setPadding(int, int, int, int)>
		d(0);
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #1584 <Method void d(int)>
		q.setText(((CharSequence) (s1)));
	//   10   16:aload_0         
	//   11   17:getfield        #1578 <Field TextView q>
	//   12   20:aload_1         
	//   13   21:invokevirtual   #1588 <Method void TextView.setText(CharSequence)>
	//   14   24:return          
	}

	protected void a(String s1, String s2)
	{
		super.a(s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #1590 <Method void com.irobot.home.WizardFragmentActivity.a(String, String)>
		U = s1;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #1592 <Field String U>
		p();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #1594 <Method void p()>
	//    9   15:return          
	}

	protected void a(boolean flag)
	{
		if(x == 5)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field int x>
	//*   2    4:iconst_5        
	//*   3    5:icmpne          26
		{
			if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            21
				AnalyticsSubsystem.getInstance().trackProvStepViewed(ProvisioningStep.ActivateRoombaConfirmation);
	//    6   12:invokestatic    #1307 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    7   15:getstatic       #1597 <Field ProvisioningStep ProvisioningStep.ActivateRoombaConfirmation>
	//    8   18:invokevirtual   #1311 <Method void AnalyticsSubsystem.trackProvStepViewed(ProvisioningStep)>
			b(flag);
	//    9   21:aload_0         
	//   10   22:iload_1         
	//   11   23:invokevirtual   #496 <Method void b(boolean)>
		}
	//   12   26:return          
	}

	protected void e()
	{
		w = "BroadcastSetupActivity";
	//    0    0:aload_0         
	//    1    1:ldc2            #1599 <String "BroadcastSetupActivity">
	//    2    4:putfield        #616 <Field String w>
		Object obj = ((Object) (Assembler.getInstance().getAssetSetupUIService().getServiceData()));
	//    3    7:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//    4   10:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    5   13:invokevirtual   #686 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//    6   16:astore_1        
		if(obj != null)
	//*   7   17:aload_1         
	//*   8   18:ifnull          104
		{
			aB = ((AssetSetupUIServiceData) (obj)).shouldWarn5GHZ();
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokevirtual   #1602 <Method boolean AssetSetupUIServiceData.shouldWarn5GHZ()>
	//   12   26:putfield        #234 <Field boolean aB>
			aC = ((AssetSetupUIServiceData) (obj)).getPlaceholderSkuType();
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:invokevirtual   #1606 <Method SkuType AssetSetupUIServiceData.getPlaceholderSkuType()>
	//   16   34:putfield        #241 <Field SkuType aC>
			if(com.irobot.home._cls18.a[aC.ordinal()] == 1)
	//*  17   37:getstatic       #535 <Field int[] com.irobot.home.BroadcastSetupActivity$18.a>
	//*  18   40:aload_0         
	//*  19   41:getfield        #241 <Field SkuType aC>
	//*  20   44:invokevirtual   #538 <Method int SkuType.ordinal()>
	//*  21   47:iaload          
	//*  22   48:iconst_1        
	//*  23   49:icmpeq          55
	//*  24   52:goto            104
			{
				au = 0x7f0e020c;
	//   25   55:aload_0         
	//   26   56:ldc2            #1607 <Int 0x7f0e020c>
	//   27   59:putfield        #214 <Field int au>
				av = 0x7f0e0207;
	//   28   62:aload_0         
	//   29   63:ldc2            #1608 <Int 0x7f0e0207>
	//   30   66:putfield        #217 <Field int av>
				aw = 0x7f0e0208;
	//   31   69:aload_0         
	//   32   70:ldc2            #1609 <Int 0x7f0e0208>
	//   33   73:putfield        #220 <Field int aw>
				ax = 0x7f0e0210;
	//   34   76:aload_0         
	//   35   77:ldc2            #1610 <Int 0x7f0e0210>
	//   36   80:putfield        #223 <Field int ax>
				ay = 0x7f0e020f;
	//   37   83:aload_0         
	//   38   84:ldc2            #1611 <Int 0x7f0e020f>
	//   39   87:putfield        #226 <Field int ay>
				az = 0x7f0e020e;
	//   40   90:aload_0         
	//   41   91:ldc2            #1612 <Int 0x7f0e020e>
	//   42   94:putfield        #229 <Field int az>
				aA = 0x7f0f0059;
	//   43   97:aload_0         
	//   44   98:ldc2            #1613 <Int 0x7f0f0059>
	//   45  101:putfield        #232 <Field int aA>
			}
		}
		AnalyticsSubsystem.getInstance().trackProvStepViewed(ProvisioningStep.AddRobot);
	//   46  104:invokestatic    #1307 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   47  107:getstatic       #1616 <Field ProvisioningStep ProvisioningStep.AddRobot>
	//   48  110:invokevirtual   #1311 <Method void AnalyticsSubsystem.trackProvStepViewed(ProvisioningStep)>
		ad = ((BluetoothManager)getSystemService("bluetooth")).getAdapter();
	//   49  113:aload_0         
	//   50  114:aload_0         
	//   51  115:ldc2            #1618 <String "bluetooth">
	//   52  118:invokevirtual   #1619 <Method Object getSystemService(String)>
	//   53  121:checkcast       #1621 <Class BluetoothManager>
	//   54  124:invokevirtual   #1625 <Method BluetoothAdapter BluetoothManager.getAdapter()>
	//   55  127:putfield        #182 <Field BluetoothAdapter ad>
		L.setRestErrorHandler(new org.androidannotations.a.a.a.b() {

			public void onRestClientExceptionThrown(org.c.b.b b1)
			{
				String s1 = a.w;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
			//    2    4:getfield        #26  <Field String com.irobot.home.BroadcastSetupActivity.w>
			//    3    7:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
			//    4    8:new             #28  <Class StringBuilder>
			//    5   11:dup             
			//    6   12:invokespecial   #29  <Method void StringBuilder()>
			//    7   15:astore_3        
				stringbuilder.append("Exception fetching help content: ");
			//    8   16:aload_3         
			//    9   17:ldc1            #31  <String "Exception fetching help content: ">
			//   10   19:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
			//   11   22:pop             
				stringbuilder.append(b1.getMessage());
			//   12   23:aload_3         
			//   13   24:aload_1         
			//   14   25:invokevirtual   #41  <Method String org.c.b.b.getMessage()>
			//   15   28:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
			//   16   31:pop             
				com.irobot.home.util.o.e(s1, stringbuilder.toString());
			//   17   32:aload_2         
			//   18   33:aload_3         
			//   19   34:invokevirtual   #44  <Method String StringBuilder.toString()>
			//   20   37:invokestatic    #49  <Method void o.e(String, String)>
			//   21   40:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   56  130:aload_0         
	//   57  131:getfield        #168 <Field CustomerCareRestClient L>
	//   58  134:new             #18  <Class BroadcastSetupActivity$12>
	//   59  137:dup             
	//   60  138:aload_0         
	//   61  139:invokespecial   #1626 <Method void BroadcastSetupActivity$12(BroadcastSetupActivity)>
	//   62  142:invokeinterface #1630 <Method void CustomerCareRestClient.setRestErrorHandler(org.androidannotations.a.a.a.b)>
		z();
	//   63  147:aload_0         
	//   64  148:invokevirtual   #1633 <Method void z()>
		if(f != null && l.h().b(f))
	//*  65  151:aload_0         
	//*  66  152:getfield        #1635 <Field String f>
	//*  67  155:ifnull          186
	//*  68  158:aload_0         
	//*  69  159:getfield        #1544 <Field IRobotApplication l>
	//*  70  162:invokevirtual   #809 <Method IRobotModel IRobotApplication.h()>
	//*  71  165:aload_0         
	//*  72  166:getfield        #1635 <Field String f>
	//*  73  169:invokevirtual   #1637 <Method boolean IRobotModel.b(String)>
	//*  74  172:ifeq            186
			obj = ((Object) (com.irobot.home.util.j.o(f)));
	//   75  175:aload_0         
	//   76  176:getfield        #1635 <Field String f>
	//   77  179:invokestatic    #1640 <Method Robot j.o(String)>
	//   78  182:astore_1        
		else
	//*  79  183:goto            194
			obj = ((Object) (new Robot()));
	//   80  186:new             #755 <Class Robot>
	//   81  189:dup             
	//   82  190:invokespecial   #854 <Method void Robot()>
	//   83  193:astore_1        
		H = ((Robot) (obj));
	//   84  194:aload_0         
	//   85  195:aload_1         
	//   86  196:putfield        #753 <Field Robot H>
		Y = null;
	//   87  199:aload_0         
	//   88  200:aconst_null     
	//   89  201:putfield        #608 <Field AssetInfo Y>
		obj = ((Object) (Assembler.getInstance().getAssetSetupUIService().getServiceData().discoveredAssetBeingProvisioned()));
	//   90  204:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//   91  207:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   92  210:invokevirtual   #686 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//   93  213:invokevirtual   #1644 <Method DiscoveredAsset AssetSetupUIServiceData.discoveredAssetBeingProvisioned()>
	//   94  216:astore_1        
		if(obj != null)
	//*  95  217:aload_1         
	//*  96  218:ifnull          229
			Y = ((DiscoveredAsset) (obj)).assetInfo();
	//   97  221:aload_0         
	//   98  222:aload_1         
	//   99  223:invokevirtual   #1647 <Method AssetInfo DiscoveredAsset.assetInfo()>
	//  100  226:putfield        #608 <Field AssetInfo Y>
		M = true;
	//  101  229:aload_0         
	//  102  230:iconst_1        
	//  103  231:putfield        #271 <Field boolean M>
		x = 0;
	//  104  234:aload_0         
	//  105  235:iconst_0        
	//  106  236:putfield        #247 <Field int x>
		am.put(((Object) (Integer.valueOf(0))), ((Object) (Boolean.valueOf(false))));
	//  107  239:aload_0         
	//  108  240:getfield        #205 <Field Map am>
	//  109  243:iconst_0        
	//  110  244:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//  111  247:iconst_0        
	//  112  248:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//  113  251:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//  114  256:pop             
		am.put(((Object) (Integer.valueOf(2))), ((Object) (Boolean.valueOf(false))));
	//  115  257:aload_0         
	//  116  258:getfield        #205 <Field Map am>
	//  117  261:iconst_2        
	//  118  262:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//  119  265:iconst_0        
	//  120  266:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//  121  269:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//  122  274:pop             
		am.put(((Object) (Integer.valueOf(3))), ((Object) (Boolean.valueOf(false))));
	//  123  275:aload_0         
	//  124  276:getfield        #205 <Field Map am>
	//  125  279:iconst_3        
	//  126  280:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//  127  283:iconst_0        
	//  128  284:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//  129  287:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//  130  292:pop             
		am.put(((Object) (Integer.valueOf(5))), ((Object) (Boolean.valueOf(false))));
	//  131  293:aload_0         
	//  132  294:getfield        #205 <Field Map am>
	//  133  297:iconst_5        
	//  134  298:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//  135  301:iconst_0        
	//  136  302:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//  137  305:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//  138  310:pop             
		am.put(((Object) (Integer.valueOf(6))), ((Object) (Boolean.valueOf(false))));
	//  139  311:aload_0         
	//  140  312:getfield        #205 <Field Map am>
	//  141  315:bipush          6
	//  142  317:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//  143  320:iconst_0        
	//  144  321:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//  145  324:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//  146  329:pop             
		am.put(((Object) (Integer.valueOf(7))), ((Object) (Boolean.valueOf(false))));
	//  147  330:aload_0         
	//  148  331:getfield        #205 <Field Map am>
	//  149  334:bipush          7
	//  150  336:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//  151  339:iconst_0        
	//  152  340:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//  153  343:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//  154  348:pop             
		am.put(((Object) (Integer.valueOf(8))), ((Object) (Boolean.valueOf(false))));
	//  155  349:aload_0         
	//  156  350:getfield        #205 <Field Map am>
	//  157  353:bipush          8
	//  158  355:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//  159  358:iconst_0        
	//  160  359:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//  161  362:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//  162  367:pop             
		am.put(((Object) (Integer.valueOf(11))), ((Object) (Boolean.valueOf(false))));
	//  163  368:aload_0         
	//  164  369:getfield        #205 <Field Map am>
	//  165  372:bipush          11
	//  166  374:invokestatic    #412 <Method Integer Integer.valueOf(int)>
	//  167  377:iconst_0        
	//  168  378:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//  169  381:invokeinterface #423 <Method Object Map.put(Object, Object)>
	//  170  386:pop             
		j.setVisibility(8);
	//  171  387:aload_0         
	//  172  388:getfield        #380 <Field ProgressBar j>
	//  173  391:bipush          8
	//  174  393:invokevirtual   #1368 <Method void ProgressBar.setVisibility(int)>
		super.e();
	//  175  396:aload_0         
	//  176  397:invokespecial   #1649 <Method void WizardFragmentActivity.e()>
		Q();
	//  177  400:aload_0         
	//  178  401:invokespecial   #269 <Method void Q()>
	//  179  404:return          
	}

	public boolean f()
	{
		if(ad == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field BluetoothAdapter ad>
	//*   2    4:ifnonnull       23
		{
			com.irobot.home.util.o.e(w, "Bluetooth not supported on this device!");
	//    3    7:aload_0         
	//    4    8:getfield        #616 <Field String w>
	//    5   11:ldc2            #1651 <String "Bluetooth not supported on this device!">
	//    6   14:invokestatic    #645 <Method void o.e(String, String)>
			h();
	//    7   17:aload_0         
	//    8   18:invokevirtual   #1653 <Method void h()>
			return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
		}
		if(!ad.isEnabled())
	//*  11   23:aload_0         
	//*  12   24:getfield        #182 <Field BluetoothAdapter ad>
	//*  13   27:invokevirtual   #1658 <Method boolean BluetoothAdapter.isEnabled()>
	//*  14   30:ifne            39
		{
			g();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #1660 <Method void g()>
			return false;
	//   17   37:iconst_0        
	//   18   38:ireturn         
		} else
		{
			return true;
	//   19   39:iconst_1        
	//   20   40:ireturn         
		}
	}

	protected void g()
	{
		(new Handler(getMainLooper())).post(new Runnable() {

			public void run()
			{
				(new android.app.AlertDialog.Builder(((Context) (a)))).setMessage(0x7f0f07fc).setNegativeButton(0x7f0f04d3, new android.content.DialogInterface.OnClickListener(this) {

					public void onClick(DialogInterface dialoginterface, int i1)
					{
						com.irobot.home.util.o.c(a.a.w, "User has chosen not to enable Bluetooth.");
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field BroadcastSetupActivity$19 a>
					//    2    4:getfield        #25  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$19.a>
					//    3    7:getfield        #31  <Field String com.irobot.home.BroadcastSetupActivity.w>
					//    4   10:ldc1            #33  <String "User has chosen not to enable Bluetooth.">
					//    5   12:invokestatic    #39  <Method void o.c(String, String)>
						a.a.i();
					//    6   15:aload_0         
					//    7   16:getfield        #17  <Field BroadcastSetupActivity$19 a>
					//    8   19:getfield        #25  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$19.a>
					//    9   22:invokevirtual   #42  <Method void com.irobot.home.BroadcastSetupActivity.i()>
					//   10   25:return          
					}

					final _cls19 a;

			
			{
				a = _pcls19;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity$19 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener(this) {

					public void onClick(DialogInterface dialoginterface, int i1)
					{
						if(!BroadcastSetupActivity.f(a.a).enable())
					//*   0    0:aload_0         
					//*   1    1:getfield        #17  <Field BroadcastSetupActivity$19 a>
					//*   2    4:getfield        #25  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$19.a>
					//*   3    7:invokestatic    #31  <Method BluetoothAdapter BroadcastSetupActivity.f(BroadcastSetupActivity)>
					//*   4   10:invokevirtual   #37  <Method boolean BluetoothAdapter.enable()>
					//*   5   13:ifne            42
						{
							com.irobot.home.util.o.e(a.a.w, "Could not enable Bluetooth!");
					//    6   16:aload_0         
					//    7   17:getfield        #17  <Field BroadcastSetupActivity$19 a>
					//    8   20:getfield        #25  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$19.a>
					//    9   23:getfield        #41  <Field String com.irobot.home.BroadcastSetupActivity.w>
					//   10   26:ldc1            #43  <String "Could not enable Bluetooth!">
					//   11   28:invokestatic    #49  <Method void o.e(String, String)>
							a.a.h();
					//   12   31:aload_0         
					//   13   32:getfield        #17  <Field BroadcastSetupActivity$19 a>
					//   14   35:getfield        #25  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$19.a>
					//   15   38:invokevirtual   #52  <Method void BroadcastSetupActivity.h()>
							return;
					//   16   41:return          
						} else
						{
							com.irobot.home.BroadcastSetupActivity.a(a.a, new BluetoothStateReceiver(((com.irobot.home.util.BluetoothStateReceiver.a) (a.a))));
					//   17   42:aload_0         
					//   18   43:getfield        #17  <Field BroadcastSetupActivity$19 a>
					//   19   46:getfield        #25  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$19.a>
					//   20   49:new             #54  <Class BluetoothStateReceiver>
					//   21   52:dup             
					//   22   53:aload_0         
					//   23   54:getfield        #17  <Field BroadcastSetupActivity$19 a>
					//   24   57:getfield        #25  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$19.a>
					//   25   60:invokespecial   #57  <Method void BluetoothStateReceiver(com.irobot.home.util.BluetoothStateReceiver$a)>
					//   26   63:invokestatic    #60  <Method BluetoothStateReceiver com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, BluetoothStateReceiver)>
					//   27   66:pop             
							a.a.registerReceiver(((BroadcastReceiver) (BroadcastSetupActivity.g(a.a))), new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
					//   28   67:aload_0         
					//   29   68:getfield        #17  <Field BroadcastSetupActivity$19 a>
					//   30   71:getfield        #25  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$19.a>
					//   31   74:aload_0         
					//   32   75:getfield        #17  <Field BroadcastSetupActivity$19 a>
					//   33   78:getfield        #25  <Field BroadcastSetupActivity com.irobot.home.BroadcastSetupActivity$19.a>
					//   34   81:invokestatic    #64  <Method BluetoothStateReceiver BroadcastSetupActivity.g(BroadcastSetupActivity)>
					//   35   84:new             #66  <Class IntentFilter>
					//   36   87:dup             
					//   37   88:ldc1            #68  <String "android.bluetooth.adapter.action.STATE_CHANGED">
					//   38   90:invokespecial   #71  <Method void IntentFilter(String)>
					//   39   93:invokevirtual   #75  <Method Intent BroadcastSetupActivity.registerReceiver(BroadcastReceiver, IntentFilter)>
					//   40   96:pop             
							return;
					//   41   97:return          
						}
					}

					final _cls19 a;

			
			{
				a = _pcls19;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity$19 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).show();
			//    0    0:new             #27  <Class android.app.AlertDialog$Builder>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field BroadcastSetupActivity a>
			//    4    8:invokespecial   #30  <Method void android.app.AlertDialog$Builder(Context)>
			//    5   11:ldc1            #31  <Int 0x7f0f07fc>
			//    6   13:invokevirtual   #35  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
			//    7   16:ldc1            #36  <Int 0x7f0f04d3>
			//    8   18:new             #15  <Class BroadcastSetupActivity$19$2>
			//    9   21:dup             
			//   10   22:aload_0         
			//   11   23:invokespecial   #39  <Method void BroadcastSetupActivity$19$2(BroadcastSetupActivity$19)>
			//   12   26:invokevirtual   #43  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
			//   13   29:ldc1            #44  <Int 0x7f0f0986>
			//   14   31:new             #13  <Class BroadcastSetupActivity$19$1>
			//   15   34:dup             
			//   16   35:aload_0         
			//   17   36:invokespecial   #45  <Method void BroadcastSetupActivity$19$1(BroadcastSetupActivity$19)>
			//   18   39:invokevirtual   #48  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
			//   19   42:invokevirtual   #52  <Method AlertDialog android.app.AlertDialog$Builder.show()>
			//   20   45:pop             
			//   21   46:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #1055 <Class Handler>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1059 <Method Looper getMainLooper()>
	//    4    8:invokespecial   #1062 <Method void Handler(Looper)>
	//    5   11:new             #32  <Class BroadcastSetupActivity$19>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #1661 <Method void BroadcastSetupActivity$19(BroadcastSetupActivity)>
	//    9   19:invokevirtual   #1067 <Method boolean Handler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	protected void h()
	{
		(new android.app.AlertDialog.Builder(((Context) (this)))).setTitle(0x7f0f022b).setMessage(0x7f0f00f6).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #302 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #305 <Method void android.app.AlertDialog$Builder(Context)>
	//    4    8:ldc2            #1662 <Int 0x7f0f022b>
	//    5   11:invokevirtual   #310 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   14:ldc2            #1663 <Int 0x7f0f00f6>
	//    7   17:invokevirtual   #902 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   20:ldc2            #1664 <Int 0x7f0f05bb>
	//    9   23:aconst_null     
	//   10   24:invokevirtual   #327 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   27:invokevirtual   #335 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   12   30:pop             
	//   13   31:return          
	}

	protected void i()
	{
		if(x == 4 && !O)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field int x>
	//*   2    4:iconst_4        
	//*   3    5:icmpne          26
	//*   4    8:aload_0         
	//*   5    9:getfield        #458 <Field boolean O>
	//*   6   12:ifne            26
		{
			((z)K).c();
	//    7   15:aload_0         
	//    8   16:getfield        #1511 <Field Fragment K>
	//    9   19:checkcast       #490 <Class z>
	//   10   22:invokevirtual   #1666 <Method void z.c()>
			return;
	//   11   25:return          
		}
		if(x == 8 && !P)
	//*  12   26:aload_0         
	//*  13   27:getfield        #247 <Field int x>
	//*  14   30:bipush          8
	//*  15   32:icmpne          88
	//*  16   35:aload_0         
	//*  17   36:getfield        #1128 <Field boolean P>
	//*  18   39:ifne            88
		{
			al = (new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(0x7f0f0823).setPositiveButton(0x7f0f05bb, af).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).create();
	//   19   42:aload_0         
	//   20   43:new             #302 <Class android.app.AlertDialog$Builder>
	//   21   46:dup             
	//   22   47:aload_0         
	//   23   48:invokespecial   #305 <Method void android.app.AlertDialog$Builder(Context)>
	//   24   51:ldc2            #1667 <Int 0x7f0f0823>
	//   25   54:invokevirtual   #902 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   26   57:ldc2            #1664 <Int 0x7f0f05bb>
	//   27   60:aload_0         
	//   28   61:getfield        #189 <Field android.content.DialogInterface$OnClickListener af>
	//   29   64:invokevirtual   #327 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   30   67:ldc2            #1668 <Int 0x7f0f017d>
	//   31   70:aconst_null     
	//   32   71:invokevirtual   #331 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   33   74:invokevirtual   #1414 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   34   77:putfield        #698 <Field AlertDialog al>
			al.show();
	//   35   80:aload_0         
	//   36   81:getfield        #698 <Field AlertDialog al>
	//   37   84:invokevirtual   #1418 <Method void AlertDialog.show()>
			return;
	//   38   87:return          
		}
		if(x == 7 && S && !T)
	//*  39   88:aload_0         
	//*  40   89:getfield        #247 <Field int x>
	//*  41   92:bipush          7
	//*  42   94:icmpne          112
	//*  43   97:aload_0         
	//*  44   98:getfield        #1044 <Field boolean S>
	//*  45  101:ifeq            112
	//*  46  104:aload_0         
	//*  47  105:getfield        #1473 <Field boolean T>
	//*  48  108:ifne            112
			return;
	//   49  111:return          
		if(P && !Q)
	//*  50  112:aload_0         
	//*  51  113:getfield        #1128 <Field boolean P>
	//*  52  116:ifeq            131
	//*  53  119:aload_0         
	//*  54  120:getfield        #170 <Field boolean Q>
	//*  55  123:ifne            131
			Q = true;
	//   56  126:aload_0         
	//   57  127:iconst_1        
	//   58  128:putfield        #170 <Field boolean Q>
		super.i();
	//   59  131:aload_0         
	//   60  132:invokespecial   #1670 <Method void com.irobot.home.WizardFragmentActivity.i()>
	//   61  135:return          
	}

	protected void j()
	{
		boolean flag = ag();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1672 <Method boolean ag()>
	//    2    4:istore_2        
		if(flag)
	//*   3    5:iload_2         
	//*   4    6:ifeq            70
		{
			for(int i1 = 0; Y == null && i1 < 2; i1++)
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
	//*   7   11:aload_0         
	//*   8   12:getfield        #608 <Field AssetInfo Y>
	//*   9   15:ifnonnull       70
	//*  10   18:iload_1         
	//*  11   19:iconst_2        
	//*  12   20:icmpge          70
			{
				TypeDiscoveryAttribute typediscoveryattribute = TypeDiscoveryAttribute.create(DiscoveryType.Wifi);
	//   13   23:getstatic       #1678 <Field DiscoveryType DiscoveryType.Wifi>
	//   14   26:invokestatic    #1683 <Method TypeDiscoveryAttribute TypeDiscoveryAttribute.create(DiscoveryType)>
	//   15   29:astore_3        
				HashMap hashmap = new HashMap();
	//   16   30:new             #202 <Class HashMap>
	//   17   33:dup             
	//   18   34:invokespecial   #203 <Method void HashMap()>
	//   19   37:astore          4
				hashmap.put(((Object) (DiscoveryAttributeKey.Type)), ((Object) (typediscoveryattribute)));
	//   20   39:aload           4
	//   21   41:getstatic       #1689 <Field DiscoveryAttributeKey DiscoveryAttributeKey.Type>
	//   22   44:aload_3         
	//   23   45:invokevirtual   #1690 <Method Object HashMap.put(Object, Object)>
	//   24   48:pop             
				com.irobot.home.h.c.b(hashmap, new com.irobot.home.h.b() {

					public void a(DiscoveryType discoverytype)
					{
						com.irobot.home.util.o.e(a.w, "Finished doing discovery");
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field BroadcastSetupActivity a>
					//    2    4:getfield        #27  <Field String com.irobot.home.BroadcastSetupActivity.w>
					//    3    7:ldc1            #29  <String "Finished doing discovery">
					//    4    9:invokestatic    #35  <Method void o.e(String, String)>
					//    5   12:return          
					}

					public void a(DiscoveryType discoverytype, DiscoveredAsset discoveredasset)
					{
						discoverytype = ((DiscoveryType) (a.w));
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field BroadcastSetupActivity a>
					//    2    4:getfield        #27  <Field String com.irobot.home.BroadcastSetupActivity.w>
					//    3    7:astore_1        
						Object obj1 = ((Object) (new StringBuilder()));
					//    4    8:new             #38  <Class StringBuilder>
					//    5   11:dup             
					//    6   12:invokespecial   #39  <Method void StringBuilder()>
					//    7   15:astore_3        
						((StringBuilder) (obj1)).append("Discovered Asset ");
					//    8   16:aload_3         
					//    9   17:ldc1            #41  <String "Discovered Asset ">
					//   10   19:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
					//   11   22:pop             
						((StringBuilder) (obj1)).append(discoveredasset.assetInfo().getAssetId().getId());
					//   12   23:aload_3         
					//   13   24:aload_2         
					//   14   25:invokevirtual   #51  <Method AssetInfo DiscoveredAsset.assetInfo()>
					//   15   28:invokevirtual   #57  <Method AssetId AssetInfo.getAssetId()>
					//   16   31:invokevirtual   #63  <Method String AssetId.getId()>
					//   17   34:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
					//   18   37:pop             
						com.irobot.home.util.o.e(((String) (discoverytype)), ((StringBuilder) (obj1)).toString());
					//   19   38:aload_1         
					//   20   39:aload_3         
					//   21   40:invokevirtual   #66  <Method String StringBuilder.toString()>
					//   22   43:invokestatic    #35  <Method void o.e(String, String)>
						discoverytype = ((DiscoveryType) ((DiscoveredWifiAsset)discoveredasset));
					//   23   46:aload_2         
					//   24   47:checkcast       #68  <Class DiscoveredWifiAsset>
					//   25   50:astore_1        
						if(((DiscoveredWifiAsset) (discoverytype)).discoveryVersion() > 1)
					//*  26   51:aload_1         
					//*  27   52:invokevirtual   #72  <Method int DiscoveredWifiAsset.discoveryVersion()>
					//*  28   55:iconst_1        
					//*  29   56:icmple          74
							com.irobot.home.BroadcastSetupActivity.a(a, AssetCapabilityUtils.isAwsEnabledAsset(((DiscoveredWifiAsset) (discoverytype)).assetInfo()));
					//   30   59:aload_0         
					//   31   60:getfield        #19  <Field BroadcastSetupActivity a>
					//   32   63:aload_1         
					//   33   64:invokevirtual   #73  <Method AssetInfo DiscoveredWifiAsset.assetInfo()>
					//   34   67:invokestatic    #79  <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
					//   35   70:invokestatic    #82  <Method boolean com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, boolean)>
					//   36   73:pop             
						obj1 = ((Object) (Assembler.getInstance()));
					//   37   74:invokestatic    #88  <Method Assembler Assembler.getInstance()>
					//   38   77:astore_3        
						if(!com.irobot.home.BroadcastSetupActivity.i(a) && !((Assembler) (obj1)).isInitialized(((DiscoveredWifiAsset) (discoverytype)).assetInfo().getAssetId()))
					//*  39   78:aload_0         
					//*  40   79:getfield        #19  <Field BroadcastSetupActivity a>
					//*  41   82:invokestatic    #92  <Method boolean com.irobot.home.BroadcastSetupActivity.i(BroadcastSetupActivity)>
					//*  42   85:ifne            110
					//*  43   88:aload_3         
					//*  44   89:aload_1         
					//*  45   90:invokevirtual   #73  <Method AssetInfo DiscoveredWifiAsset.assetInfo()>
					//*  46   93:invokevirtual   #57  <Method AssetId AssetInfo.getAssetId()>
					//*  47   96:invokevirtual   #96  <Method boolean Assembler.isInitialized(AssetId)>
					//*  48   99:ifne            110
							((Assembler) (obj1)).initializeAsset(((DiscoveredWifiAsset) (discoverytype)).assetInfo());
					//   49  102:aload_3         
					//   50  103:aload_1         
					//   51  104:invokevirtual   #73  <Method AssetInfo DiscoveredWifiAsset.assetInfo()>
					//   52  107:invokevirtual   #100 <Method void Assembler.initializeAsset(AssetInfo)>
						com.irobot.home.BroadcastSetupActivity.a(a, discoveredasset.assetInfo());
					//   53  110:aload_0         
					//   54  111:getfield        #19  <Field BroadcastSetupActivity a>
					//   55  114:aload_2         
					//   56  115:invokevirtual   #51  <Method AssetInfo DiscoveredAsset.assetInfo()>
					//   57  118:invokestatic    #103 <Method AssetInfo com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, AssetInfo)>
					//   58  121:pop             
						com.irobot.home.BroadcastSetupActivity.j(a);
					//   59  122:aload_0         
					//   60  123:getfield        #19  <Field BroadcastSetupActivity a>
					//   61  126:invokestatic    #105 <Method void com.irobot.home.BroadcastSetupActivity.j(BroadcastSetupActivity)>
						(new Handler(Looper.getMainLooper())).post(new Runnable(this, ((DiscoveredWifiAsset) (discoverytype)), discoveredasset) {

							public void run()
							{
								AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
							//    0    0:invokestatic    #35  <Method Assembler Assembler.getInstance()>
							//    1    3:invokevirtual   #39  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
							//    2    6:astore_1        
								AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
							//    3    7:invokestatic    #45  <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
							//    4   10:astore_2        
								assetsetupuiservicedata.setProvisioningType(a.provisioningType());
							//    5   11:aload_2         
							//    6   12:aload_0         
							//    7   13:getfield        #22  <Field DiscoveredWifiAsset a>
							//    8   16:invokevirtual   #51  <Method ProvisioningType DiscoveredWifiAsset.provisioningType()>
							//    9   19:invokevirtual   #55  <Method void AssetSetupUIServiceData.setProvisioningType(ProvisioningType)>
								assetsetupuiservicedata.setDiscoveredAssetForProvisioning(b);
							//   10   22:aload_2         
							//   11   23:aload_0         
							//   12   24:getfield        #24  <Field DiscoveredAsset b>
							//   13   27:invokevirtual   #59  <Method void AssetSetupUIServiceData.setDiscoveredAssetForProvisioning(DiscoveredAsset)>
								assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.PrepareForProvisioning, assetsetupuiservicedata);
							//   14   30:aload_1         
							//   15   31:getstatic       #65  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.PrepareForProvisioning>
							//   16   34:aload_2         
							//   17   35:invokevirtual   #71  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
							//   18   38:return          
							}

							final DiscoveredWifiAsset a;
							final DiscoveredAsset b;
							final _cls21 c;

			
			{
				c = _pcls21;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field BroadcastSetupActivity$21 c>
				a = discoveredwifiasset;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field DiscoveredWifiAsset a>
				b = discoveredasset;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field DiscoveredAsset b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
						}
);
					//   62  129:new             #107 <Class Handler>
					//   63  132:dup             
					//   64  133:invokestatic    #113 <Method Looper Looper.getMainLooper()>
					//   65  136:invokespecial   #116 <Method void Handler(Looper)>
					//   66  139:new             #13  <Class BroadcastSetupActivity$21$1>
					//   67  142:dup             
					//   68  143:aload_0         
					//   69  144:aload_1         
					//   70  145:aload_2         
					//   71  146:invokespecial   #119 <Method void BroadcastSetupActivity$21$1(BroadcastSetupActivity$21, DiscoveredWifiAsset, DiscoveredAsset)>
					//   72  149:invokevirtual   #123 <Method boolean Handler.post(Runnable)>
					//   73  152:pop             
					//   74  153:return          
					}

					final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   25   49:aload           4
	//   26   51:new             #42  <Class BroadcastSetupActivity$21>
	//   27   54:dup             
	//   28   55:aload_0         
	//   29   56:invokespecial   #1691 <Method void BroadcastSetupActivity$21(BroadcastSetupActivity)>
	//   30   59:invokestatic    #1696 <Method boolean com.irobot.home.h.c.b(HashMap, com.irobot.home.h.b)>
	//   31   62:pop             
			}

	//   32   63:iload_1         
	//   33   64:iconst_1        
	//   34   65:iadd            
	//   35   66:istore_1        
		}
	//*  36   67:goto            11
		Object obj;
		if(Y == null)
	//*  37   70:aload_0         
	//*  38   71:getfield        #608 <Field AssetInfo Y>
	//*  39   74:ifnonnull       123
		{
			if(flag)
	//*  40   77:iload_2         
	//*  41   78:ifeq            88
				obj = "Did discovery while connected to the robot but did not get discovery information.";
	//   42   81:ldc2            #1698 <String "Did discovery while connected to the robot but did not get discovery information.">
	//   43   84:astore_3        
			else
	//*  44   85:goto            92
				obj = "Failed to connect to robot soft AP";
	//   45   88:ldc2            #1700 <String "Failed to connect to robot soft AP">
	//   46   91:astore_3        
			com.irobot.home.util.j.a(6, ((String) (obj)));
	//   47   92:bipush          6
	//   48   94:aload_3         
	//   49   95:invokestatic    #1703 <Method void j.a(int, String)>
			x = 10;
	//   50   98:aload_0         
	//   51   99:bipush          10
	//   52  101:putfield        #247 <Field int x>
			ai = 14;
	//   53  104:aload_0         
	//   54  105:bipush          14
	//   55  107:putfield        #193 <Field int ai>
			obj = ((Object) (new Runnable(((String) (obj))) {

				public void run()
				{
					com.irobot.home.util.o.e(b.w, a);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field BroadcastSetupActivity b>
				//    2    4:getfield        #28  <Field String com.irobot.home.BroadcastSetupActivity.w>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field String a>
				//    5   11:invokestatic    #34  <Method void o.e(String, String)>
					b.m();
				//    6   14:aload_0         
				//    7   15:getfield        #19  <Field BroadcastSetupActivity b>
				//    8   18:invokevirtual   #37  <Method void com.irobot.home.BroadcastSetupActivity.m()>
				//    9   21:return          
				}

				final String a;
				final BroadcastSetupActivity b;

			
			{
				b = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BroadcastSetupActivity b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   56  110:new             #46  <Class BroadcastSetupActivity$22>
	//   57  113:dup             
	//   58  114:aload_0         
	//   59  115:aload_3         
	//   60  116:invokespecial   #1705 <Method void BroadcastSetupActivity$22(BroadcastSetupActivity, String)>
	//   61  119:astore_3        
		} else
	//*  62  120:goto            261
		{
			if(!H.r().equals(((Object) (Y.getAssetId().getId()))))
	//*  63  123:aload_0         
	//*  64  124:getfield        #753 <Field Robot H>
	//*  65  127:invokevirtual   #1181 <Method String Robot.r()>
	//*  66  130:aload_0         
	//*  67  131:getfield        #608 <Field AssetInfo Y>
	//*  68  134:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//*  69  137:invokevirtual   #741 <Method String AssetId.getId()>
	//*  70  140:invokevirtual   #1396 <Method boolean String.equals(Object)>
	//*  71  143:ifne            163
				H.e(Y.getAssetId().getId());
	//   72  146:aload_0         
	//   73  147:getfield        #753 <Field Robot H>
	//   74  150:aload_0         
	//   75  151:getfield        #608 <Field AssetInfo Y>
	//   76  154:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//   77  157:invokevirtual   #741 <Method String AssetId.getId()>
	//   78  160:invokevirtual   #759 <Method void Robot.e(String)>
			if(!Assembler.getInstance().isInitialized(Y.getAssetId()))
	//*  79  163:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//*  80  166:aload_0         
	//*  81  167:getfield        #608 <Field AssetInfo Y>
	//*  82  170:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//*  83  173:invokevirtual   #1709 <Method boolean Assembler.isInitialized(AssetId)>
	//*  84  176:ifne            227
			{
				H.e(Y.getAssetId().getId());
	//   85  179:aload_0         
	//   86  180:getfield        #753 <Field Robot H>
	//   87  183:aload_0         
	//   88  184:getfield        #608 <Field AssetInfo Y>
	//   89  187:invokevirtual   #736 <Method AssetId AssetInfo.getAssetId()>
	//   90  190:invokevirtual   #741 <Method String AssetId.getId()>
	//   91  193:invokevirtual   #759 <Method void Robot.e(String)>
				H.d().b(U);
	//   92  196:aload_0         
	//   93  197:getfield        #753 <Field Robot H>
	//   94  200:invokevirtual   #762 <Method NetworkSettings Robot.d()>
	//   95  203:aload_0         
	//   96  204:getfield        #1592 <Field String U>
	//   97  207:invokevirtual   #1710 <Method void NetworkSettings.b(String)>
				H.d().a(J.b());
	//   98  210:aload_0         
	//   99  211:getfield        #753 <Field Robot H>
	//  100  214:invokevirtual   #762 <Method NetworkSettings Robot.d()>
	//  101  217:aload_0         
	//  102  218:getfield        #264 <Field WifiConfig J>
	//  103  221:invokevirtual   #464 <Method String WifiConfig.b()>
	//  104  224:invokevirtual   #1711 <Method void NetworkSettings.a(String)>
			}
			l.h().c(((com.irobot.home.model.a) (new w(Y, H))));
	//  105  227:aload_0         
	//  106  228:getfield        #1544 <Field IRobotApplication l>
	//  107  231:invokevirtual   #809 <Method IRobotModel IRobotApplication.h()>
	//  108  234:new             #811 <Class w>
	//  109  237:dup             
	//  110  238:aload_0         
	//  111  239:getfield        #608 <Field AssetInfo Y>
	//  112  242:aload_0         
	//  113  243:getfield        #753 <Field Robot H>
	//  114  246:invokespecial   #814 <Method void w(AssetInfo, Robot)>
	//  115  249:invokevirtual   #1713 <Method void IRobotModel.c(com.irobot.home.model.a)>
			obj = ((Object) (new Runnable() {

				public void run()
				{
					com.irobot.home.util.o.b(a.w, "showing current step on main thread.");
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
				//    2    4:getfield        #25  <Field String com.irobot.home.BroadcastSetupActivity.w>
				//    3    7:ldc1            #27  <String "showing current step on main thread.">
				//    4    9:invokestatic    #33  <Method void o.b(String, String)>
					a.m();
				//    5   12:aload_0         
				//    6   13:getfield        #17  <Field BroadcastSetupActivity a>
				//    7   16:invokevirtual   #36  <Method void com.irobot.home.BroadcastSetupActivity.m()>
				//    8   19:return          
				}

				final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
));
	//  116  252:new             #48  <Class BroadcastSetupActivity$23>
	//  117  255:dup             
	//  118  256:aload_0         
	//  119  257:invokespecial   #1714 <Method void BroadcastSetupActivity$23(BroadcastSetupActivity)>
	//  120  260:astore_3        
		}
		(new Handler(getBaseContext().getMainLooper())).post(((Runnable) (obj)));
	//  121  261:new             #1055 <Class Handler>
	//  122  264:dup             
	//  123  265:aload_0         
	//  124  266:invokevirtual   #1717 <Method Context getBaseContext()>
	//  125  269:invokevirtual   #1718 <Method Looper Context.getMainLooper()>
	//  126  272:invokespecial   #1062 <Method void Handler(Looper)>
	//  127  275:aload_3         
	//  128  276:invokevirtual   #1067 <Method boolean Handler.post(Runnable)>
	//  129  279:pop             
	//  130  280:return          
	}

	public void k()
	{
		u.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #1722 <Field View u>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #1725 <Method void View.setVisibility(int)>
	//    4    8:return          
	}

	public void l()
	{
		u.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #1722 <Field View u>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #1725 <Method void View.setVisibility(int)>
	//    4    9:return          
	}

	protected void m()
	{
label0:
		{
			K = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #1511 <Field Fragment K>
			ap();
	//    3    5:aload_0         
	//    4    6:invokespecial   #1727 <Method void ap()>
			D();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1729 <Method void D()>
			Fragment fragment;
			switch(x)
	//*   7   13:aload_0         
	//*   8   14:getfield        #247 <Field int x>
			{
	//*   9   17:tableswitch     0 12: default 84
	//	               0 363
	//	               1 355
	//	               2 347
	//	               3 339
	//	               4 316
	//	               5 308
	//	               6 278
	//	               7 237
	//	               8 229
	//	               9 144
	//	               10 136
	//	               11 84
	//	               12 128
			case 11: // '\013'
			default:
				String s1 = w;
	//   10   84:aload_0         
	//   11   85:getfield        #616 <Field String w>
	//   12   88:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//   13   89:new             #630 <Class StringBuilder>
	//   14   92:dup             
	//   15   93:invokespecial   #631 <Method void StringBuilder()>
	//   16   96:astore_2        
				stringbuilder.append("Unhandled provisioning step: ");
	//   17   97:aload_2         
	//   18   98:ldc2            #1731 <String "Unhandled provisioning step: ">
	//   19  101:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   20  104:pop             
				stringbuilder.append(String.valueOf(x));
	//   21  105:aload_2         
	//   22  106:aload_0         
	//   23  107:getfield        #247 <Field int x>
	//   24  110:invokestatic    #1733 <Method String String.valueOf(int)>
	//   25  113:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   26  116:pop             
				com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   27  117:aload_1         
	//   28  118:aload_2         
	//   29  119:invokevirtual   #643 <Method String StringBuilder.toString()>
	//   30  122:invokestatic    #645 <Method void o.e(String, String)>
				break label0;
	//   31  125:goto            373

			case 12: // '\f'
				fragment = Y();
	//   32  128:aload_0         
	//   33  129:invokespecial   #1735 <Method Fragment Y()>
	//   34  132:astore_1        
				break;
	//   35  133:goto            368

			case 10: // '\n'
				fragment = X();
	//   36  136:aload_0         
	//   37  137:invokespecial   #1737 <Method Fragment X()>
	//   38  140:astore_1        
				break;
	//   39  141:goto            368

			case 9: // '\t'
				Assembler.getInstance().getAssetSetupUIService().unregisterSubscriber(g);
	//   40  144:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//   41  147:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   42  150:aload_0         
	//   43  151:getfield        #244 <Field AssetSetupUIServiceDataCallback g>
	//   44  154:invokevirtual   #1740 <Method boolean AssetSetupUIService.unregisterSubscriber(AssetSetupUIServiceDataCallback)>
	//   45  157:pop             
				if(al != null && al.isShowing())
	//*  46  158:aload_0         
	//*  47  159:getfield        #698 <Field AlertDialog al>
	//*  48  162:ifnull          182
	//*  49  165:aload_0         
	//*  50  166:getfield        #698 <Field AlertDialog al>
	//*  51  169:invokevirtual   #1743 <Method boolean AlertDialog.isShowing()>
	//*  52  172:ifeq            182
					al.dismiss();
	//   53  175:aload_0         
	//   54  176:getfield        #698 <Field AlertDialog al>
	//   55  179:invokevirtual   #1746 <Method void AlertDialog.dismiss()>
				al = null;
	//   56  182:aload_0         
	//   57  183:aconst_null     
	//   58  184:putfield        #698 <Field AlertDialog al>
				if(SkuUtils.isSkuOfType(SkuType.Trident, Y.getSku()))
	//*  59  187:getstatic       #1749 <Field SkuType SkuType.Trident>
	//*  60  190:aload_0         
	//*  61  191:getfield        #608 <Field AssetInfo Y>
	//*  62  194:invokevirtual   #613 <Method String AssetInfo.getSku()>
	//*  63  197:invokestatic    #1755 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//*  64  200:ifeq            211
				{
					fragment = al();
	//   65  203:aload_0         
	//   66  204:invokespecial   #1757 <Method Fragment al()>
	//   67  207:astore_1        
					break;
	//   68  208:goto            368
				}
				am();
	//   69  211:aload_0         
	//   70  212:invokespecial   #1575 <Method void am()>
				j.setProgress(ay());
	//   71  215:aload_0         
	//   72  216:getfield        #380 <Field ProgressBar j>
	//   73  219:aload_0         
	//   74  220:invokespecial   #383 <Method int ay()>
	//   75  223:invokevirtual   #388 <Method void ProgressBar.setProgress(int)>
				break label0;
	//   76  226:goto            373

			case 8: // '\b'
				fragment = ah();
	//   77  229:aload_0         
	//   78  230:invokespecial   #1759 <Method Fragment ah()>
	//   79  233:astore_1        
				break;
	//   80  234:goto            368

			case 7: // '\007'
				if(!at && ProvisioningType.Ble == Assembler.getInstance().getAssetSetupUIService().getServiceData().getProvisioningType())
	//*  81  237:aload_0         
	//*  82  238:getfield        #211 <Field boolean at>
	//*  83  241:ifne            270
	//*  84  244:getstatic       #1762 <Field ProvisioningType ProvisioningType.Ble>
	//*  85  247:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//*  86  250:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//*  87  253:invokevirtual   #686 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//*  88  256:invokevirtual   #1766 <Method ProvisioningType AssetSetupUIServiceData.getProvisioningType()>
	//*  89  259:if_acmpne       270
					fragment = ac();
	//   90  262:aload_0         
	//   91  263:invokespecial   #1768 <Method Fragment ac()>
	//   92  266:astore_1        
				else
	//*  93  267:goto            368
					fragment = aa();
	//   94  270:aload_0         
	//   95  271:invokespecial   #1770 <Method Fragment aa()>
	//   96  274:astore_1        
				break;
	//   97  275:goto            368

			case 6: // '\006'
				if(Assembler.getInstance().getAssetSetupUIService().getServiceData().discoveredAssetBeingProvisioned() == null)
	//*  98  278:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//*  99  281:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//* 100  284:invokevirtual   #686 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//* 101  287:invokevirtual   #1644 <Method DiscoveredAsset AssetSetupUIServiceData.discoveredAssetBeingProvisioned()>
	//* 102  290:ifnonnull       301
				{
					fragment = ab();
	//  103  293:aload_0         
	//  104  294:invokespecial   #1772 <Method Fragment ab()>
	//  105  297:astore_1        
					break;
	//  106  298:goto            368
				}
				i();
	//  107  301:aload_0         
	//  108  302:invokevirtual   #1773 <Method void i()>
				break label0;
	//  109  305:goto            373

			case 5: // '\005'
				fragment = W();
	//  110  308:aload_0         
	//  111  309:invokespecial   #1775 <Method Fragment W()>
	//  112  312:astore_1        
				break;
	//  113  313:goto            368

			case 4: // '\004'
				if(an)
	//* 114  316:aload_0         
	//* 115  317:getfield        #1282 <Field boolean an>
	//* 116  320:ifeq            331
					fragment = aw();
	//  117  323:aload_0         
	//  118  324:invokespecial   #1777 <Method Fragment aw()>
	//  119  327:astore_1        
				else
	//* 120  328:goto            368
					fragment = T();
	//  121  331:aload_0         
	//  122  332:invokespecial   #601 <Method Fragment T()>
	//  123  335:astore_1        
				break;
	//  124  336:goto            368

			case 3: // '\003'
				fragment = S();
	//  125  339:aload_0         
	//  126  340:invokespecial   #1779 <Method Fragment S()>
	//  127  343:astore_1        
				break;
	//  128  344:goto            368

			case 2: // '\002'
				fragment = R();
	//  129  347:aload_0         
	//  130  348:invokespecial   #1781 <Method Fragment R()>
	//  131  351:astore_1        
				break;
	//  132  352:goto            368

			case 1: // '\001'
				fragment = V();
	//  133  355:aload_0         
	//  134  356:invokespecial   #1783 <Method Fragment V()>
	//  135  359:astore_1        
				break;
	//  136  360:goto            368

			case 0: // '\0'
				fragment = U();
	//  137  363:aload_0         
	//  138  364:invokespecial   #1785 <Method Fragment U()>
	//  139  367:astore_1        
				break;
			}
			K = fragment;
	//  140  368:aload_0         
	//  141  369:aload_1         
	//  142  370:putfield        #1511 <Field Fragment K>
		}
		super.m();
	//  143  373:aload_0         
	//  144  374:invokespecial   #1576 <Method void com.irobot.home.WizardFragmentActivity.m()>
		B();
	//  145  377:aload_0         
	//  146  378:invokevirtual   #1486 <Method void B()>
		C();
	//  147  381:aload_0         
	//  148  382:invokevirtual   #1787 <Method void C()>
		if(K != null)
	//* 149  385:aload_0         
	//* 150  386:getfield        #1511 <Field Fragment K>
	//* 151  389:ifnull          406
			com.irobot.home.util.j.a(q.getText(), ((Context) (this)), 16384);
	//  152  392:aload_0         
	//  153  393:getfield        #1578 <Field TextView q>
	//  154  396:invokevirtual   #1791 <Method CharSequence TextView.getText()>
	//  155  399:aload_0         
	//  156  400:sipush          16384
	//  157  403:invokestatic    #1794 <Method void j.a(CharSequence, Context, int)>
	//  158  406:return          
	}

	public void n()
	{
		aq();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1796 <Method void aq()>
		if(x == 12)
	//*   2    4:aload_0         
	//*   3    5:getfield        #247 <Field int x>
	//*   4    8:bipush          12
	//*   5   10:icmpne          23
		{
			x = 5;
	//    6   13:aload_0         
	//    7   14:iconst_5        
	//    8   15:putfield        #247 <Field int x>
			m();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #1359 <Method void m()>
			return;
	//   11   22:return          
		}
		if(x != 3) goto _L2; else goto _L1
	//   12   23:aload_0         
	//   13   24:getfield        #247 <Field int x>
	//   14   27:iconst_3        
	//   15   28:icmpne          253
_L1:
		if(J == null)
	//*  16   31:aload_0         
	//*  17   32:getfield        #264 <Field WifiConfig J>
	//*  18   35:ifnonnull       62
		{
			com.irobot.home.util.o.e(w, "Error, mWifiConfig is null.");
	//   19   38:aload_0         
	//   20   39:getfield        #616 <Field String w>
	//   21   42:ldc2            #1798 <String "Error, mWifiConfig is null.">
	//   22   45:invokestatic    #645 <Method void o.e(String, String)>
			if(!h)
	//*  23   48:getstatic       #1800 <Field boolean h>
	//*  24   51:ifne            62
				throw new AssertionError();
	//   25   54:new             #1802 <Class AssertionError>
	//   26   57:dup             
	//   27   58:invokespecial   #1803 <Method void AssertionError()>
	//   28   61:athrow          
		}
		if(J.b() != null && !J.b().isEmpty())
	//*  29   62:aload_0         
	//*  30   63:getfield        #264 <Field WifiConfig J>
	//*  31   66:invokevirtual   #464 <Method String WifiConfig.b()>
	//*  32   69:ifnull          238
	//*  33   72:aload_0         
	//*  34   73:getfield        #264 <Field WifiConfig J>
	//*  35   76:invokevirtual   #464 <Method String WifiConfig.b()>
	//*  36   79:invokevirtual   #691 <Method boolean String.isEmpty()>
	//*  37   82:ifeq            88
	//*  38   85:goto            238
		{
			boolean flag1 = AssetSSID.create(J.b()).isAssetSoftAPNetwork();
	//   39   88:aload_0         
	//   40   89:getfield        #264 <Field WifiConfig J>
	//   41   92:invokevirtual   #464 <Method String WifiConfig.b()>
	//   42   95:invokestatic    #1808 <Method AssetSSID AssetSSID.create(String)>
	//   43   98:invokevirtual   #1811 <Method boolean AssetSSID.isAssetSoftAPNetwork()>
	//   44  101:istore_2        
			boolean flag = false;
	//   45  102:iconst_0        
	//   46  103:istore_1        
			if(flag1 && !V)
	//*  47  104:iload_2         
	//*  48  105:ifeq            194
	//*  49  108:aload_0         
	//*  50  109:getfield        #434 <Field boolean V>
	//*  51  112:ifne            194
			{
				com.irobot.home.util.o.c("*** PROVISIONING ***", String.format(Locale.US, getString(0x7f0f0227), new Object[0]));
	//   52  115:ldc2            #1813 <String "*** PROVISIONING ***">
	//   53  118:getstatic       #1819 <Field Locale Locale.US>
	//   54  121:aload_0         
	//   55  122:ldc2            #1820 <Int 0x7f0f0227>
	//   56  125:invokevirtual   #517 <Method String getString(int)>
	//   57  128:iconst_0        
	//   58  129:anewarray       Object[]
	//   59  132:invokestatic    #1823 <Method String String.format(Locale, String, Object[])>
	//   60  135:invokestatic    #1825 <Method void o.c(String, String)>
				if(aa == null)
	//*  61  138:aload_0         
	//*  62  139:getfield        #176 <Field AlertDialog aa>
	//*  63  142:ifnonnull       186
					aa = (new android.app.AlertDialog.Builder(((Context) (this)))).setTitle(0x7f0f0982).setMessage(0x7f0f0227).setPositiveButton(0x7f0f034b, ((android.content.DialogInterface.OnClickListener) (new ab(((Context) (this)))))).create();
	//   64  145:aload_0         
	//   65  146:new             #302 <Class android.app.AlertDialog$Builder>
	//   66  149:dup             
	//   67  150:aload_0         
	//   68  151:invokespecial   #305 <Method void android.app.AlertDialog$Builder(Context)>
	//   69  154:ldc2            #1826 <Int 0x7f0f0982>
	//   70  157:invokevirtual   #310 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   71  160:ldc2            #1820 <Int 0x7f0f0227>
	//   72  163:invokevirtual   #902 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   73  166:ldc2            #931 <Int 0x7f0f034b>
	//   74  169:new             #1402 <Class ab>
	//   75  172:dup             
	//   76  173:aload_0         
	//   77  174:invokespecial   #1403 <Method void ab(Context)>
	//   78  177:invokevirtual   #327 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   79  180:invokevirtual   #1414 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   80  183:putfield        #176 <Field AlertDialog aa>
				aa.show();
	//   81  186:aload_0         
	//   82  187:getfield        #176 <Field AlertDialog aa>
	//   83  190:invokevirtual   #1418 <Method void AlertDialog.show()>
				return;
	//   84  193:return          
			}
			flag1 = NetworkSSID.create(J.b()).isLikely5GhzNetwork();
	//   85  194:aload_0         
	//   86  195:getfield        #264 <Field WifiConfig J>
	//   87  198:invokevirtual   #464 <Method String WifiConfig.b()>
	//   88  201:invokestatic    #1831 <Method NetworkSSID NetworkSSID.create(String)>
	//   89  204:invokevirtual   #1834 <Method boolean NetworkSSID.isLikely5GhzNetwork()>
	//   90  207:istore_2        
			if(aB && flag1)
	//*  91  208:aload_0         
	//*  92  209:getfield        #234 <Field boolean aB>
	//*  93  212:ifeq            229
	//*  94  215:iload_2         
	//*  95  216:ifne            222
	//*  96  219:goto            229
				av();
	//   97  222:aload_0         
	//   98  223:invokespecial   #1467 <Method void av()>
			else
	//*  99  226:goto            231
				flag = true;
	//  100  229:iconst_1        
	//  101  230:istore_1        
			if(!flag)
	//* 102  231:iload_1         
	//* 103  232:ifeq            326
				break MISSING_BLOCK_LABEL_326;
	//  104  235:goto            310
		} else
		{
			com.irobot.home.util.o.d(w, "SSID in mWifiConfig is null or empty, ignoring continue button press.");
	//  105  238:aload_0         
	//  106  239:getfield        #616 <Field String w>
	//  107  242:ldc2            #1836 <String "SSID in mWifiConfig is null or empty, ignoring continue button press.">
	//  108  245:invokestatic    #623 <Method void o.d(String, String)>
			m();
	//  109  248:aload_0         
	//  110  249:invokevirtual   #1359 <Method void m()>
			return;
	//  111  252:return          
		}
		  goto _L3
_L2:
		if(x == 7)
	//* 112  253:aload_0         
	//* 113  254:getfield        #247 <Field int x>
	//* 114  257:bipush          7
	//* 115  259:icmpne          277
		{
			startActivity(new Intent("android.settings.WIFI_SETTINGS"));
	//  116  262:aload_0         
	//  117  263:new             #1343 <Class Intent>
	//  118  266:dup             
	//  119  267:ldc2            #1345 <String "android.settings.WIFI_SETTINGS">
	//  120  270:invokespecial   #1347 <Method void Intent(String)>
	//  121  273:invokevirtual   #1351 <Method void startActivity(Intent)>
			return;
	//  122  276:return          
		}
		if(x != 6) goto _L5; else goto _L4
	//  123  277:aload_0         
	//  124  278:getfield        #247 <Field int x>
	//  125  281:bipush          6
	//  126  283:icmpne          296
_L4:
		Y = null;
	//  127  286:aload_0         
	//  128  287:aconst_null     
	//  129  288:putfield        #608 <Field AssetInfo Y>
_L3:
		super.n();
	//  130  291:aload_0         
	//  131  292:invokespecial   #1481 <Method void com.irobot.home.WizardFragmentActivity.n()>
		return;
	//  132  295:return          
_L5:
		if(x != 0)
			continue; /* Loop/switch isn't completed */
	//  133  296:aload_0         
	//  134  297:getfield        #247 <Field int x>
	//  135  300:ifne            313
		if(!f()) goto _L6; else goto _L3
	//  136  303:aload_0         
	//  137  304:invokevirtual   #1838 <Method boolean f()>
	//  138  307:ifeq            326
_L6:
		break MISSING_BLOCK_LABEL_326;
	//  139  310:goto            291
		if(x != 10) goto _L3; else goto _L7
	//  140  313:aload_0         
	//  141  314:getfield        #247 <Field int x>
	//  142  317:bipush          10
	//  143  319:icmpne          291
_L7:
		ar();
	//  144  322:aload_0         
	//  145  323:invokespecial   #1840 <Method void ar()>
	//  146  326:return          
	}

	public void o()
	{
		String s1 = getString(getResources().getIdentifier("@android:string/permgrouplab_location", ((String) (null)), ((String) (null))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #297 <Method Resources getResources()>
	//    3    5:ldc2            #1842 <String "@android:string/permgrouplab_location">
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #1846 <Method int Resources.getIdentifier(String, String, String)>
	//    7   13:invokevirtual   #517 <Method String getString(int)>
	//    8   16:astore_1        
		ae = (new android.app.AlertDialog.Builder(((Context) (this)))).setTitle(((CharSequence) (getString(0x7f0f01e8, new Object[] {
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
			//    6   11:getfield        #17  <Field BroadcastSetupActivity a>
			//    7   14:aload_1         
			//    8   15:iconst_0        
			//    9   16:invokevirtual   #33  <Method void BroadcastSetupActivity.startActivityForResult(Intent, int)>
			//   10   19:return          
			}

			final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).show();
	//    9   17:aload_0         
	//   10   18:new             #302 <Class android.app.AlertDialog$Builder>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #305 <Method void android.app.AlertDialog$Builder(Context)>
	//   14   26:aload_0         
	//   15   27:ldc2            #1847 <Int 0x7f0f01e8>
	//   16   30:iconst_1        
	//   17   31:anewarray       Object[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:aload_1         
	//   21   37:aastore         
	//   22   38:invokevirtual   #317 <Method String getString(int, Object[])>
	//   23   41:invokevirtual   #1849 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   24   44:aload_0         
	//   25   45:ldc2            #1850 <Int 0x7f0f01e7>
	//   26   48:iconst_1        
	//   27   49:anewarray       Object[]
	//   28   52:dup             
	//   29   53:iconst_0        
	//   30   54:aload_1         
	//   31   55:aastore         
	//   32   56:invokevirtual   #317 <Method String getString(int, Object[])>
	//   33   59:invokevirtual   #321 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   34   62:ldc2            #1851 <Int 0x7f0f0275>
	//   35   65:aconst_null     
	//   36   66:invokevirtual   #331 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   37   69:ldc2            #1852 <Int 0x7f0f034a>
	//   38   72:new             #20  <Class BroadcastSetupActivity$13>
	//   39   75:dup             
	//   40   76:aload_0         
	//   41   77:invokespecial   #1853 <Method void BroadcastSetupActivity$13(BroadcastSetupActivity)>
	//   42   80:invokevirtual   #327 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   43   83:invokevirtual   #335 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   44   86:putfield        #184 <Field AlertDialog ae>
	//   45   89:return          
	}

	public void onBackPressed()
	{
		int i1;
		com.irobot.home.util.o.c("*** PROVISIONING ***", "Button click: onBackPressed");
	//    0    0:ldc2            #1813 <String "*** PROVISIONING ***">
	//    1    3:ldc2            #1856 <String "Button click: onBackPressed">
	//    2    6:invokestatic    #1825 <Method void o.c(String, String)>
		i1 = x;
	//    3    9:aload_0         
	//    4   10:getfield        #247 <Field int x>
	//    5   13:istore_1        
		if(i1 == 0) goto _L2; else goto _L1
	//    6   14:iload_1         
	//    7   15:ifeq            107
_L1:
		if(i1 == 2) goto _L4; else goto _L3
	//    8   18:iload_1         
	//    9   19:iconst_2        
	//   10   20:icmpeq          56
_L3:
		if(i1 == 4) goto _L6; else goto _L5
	//   11   23:iload_1         
	//   12   24:iconst_4        
	//   13   25:icmpeq          66
_L5:
		if(i1 == 10) goto _L8; else goto _L7
	//   14   28:iload_1         
	//   15   29:bipush          10
	//   16   31:icmpeq          61
_L7:
		i1;
	//   17   34:iload_1         
		JVM INSTR tableswitch 7 8: default 56
	//	               7 61
	//	               8 61;
	//   18   35:tableswitch     7 8: default 56
	//	               7 61
	//	               8 61
		   goto _L4 _L8 _L8
_L4:
		I();
	//   19   56:aload_0         
	//   20   57:invokevirtual   #1858 <Method void I()>
		return;
	//   21   60:return          
_L8:
		P();
	//   22   61:aload_0         
	//   23   62:invokespecial   #1860 <Method void P()>
		return;
	//   24   65:return          
_L6:
		if(an)
	//*  25   66:aload_0         
	//*  26   67:getfield        #1282 <Field boolean an>
	//*  27   70:ifeq            83
		{
			an = false;
	//   28   73:aload_0         
	//   29   74:iconst_0        
	//   30   75:putfield        #1282 <Field boolean an>
			m();
	//   31   78:aload_0         
	//   32   79:invokevirtual   #1359 <Method void m()>
			return;
	//   33   82:return          
		}
		if(!M) goto _L8; else goto _L9
	//   34   83:aload_0         
	//   35   84:getfield        #271 <Field boolean M>
	//   36   87:ifeq            61
_L9:
		X = ((z)K).e();
	//   37   90:aload_0         
	//   38   91:aload_0         
	//   39   92:getfield        #1511 <Field Fragment K>
	//   40   95:checkcast       #490 <Class z>
	//   41   98:invokevirtual   #1862 <Method boolean z.e()>
	//   42  101:putfield        #174 <Field boolean X>
		if(true) goto _L4; else goto _L2
	//   43  104:goto            56
_L2:
		super.onBackPressed();
	//   44  107:aload_0         
	//   45  108:invokespecial   #1864 <Method void WizardFragmentActivity.onBackPressed()>
		return;
	//   46  111:return          
	}

	protected void onDestroy()
	{
		Assembler.getInstance().getAssetSetupUIService().unregisterSubscriber(g);
	//    0    0:invokestatic    #277 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #281 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    2    6:aload_0         
	//    3    7:getfield        #244 <Field AssetSetupUIServiceDataCallback g>
	//    4   10:invokevirtual   #1740 <Method boolean AssetSetupUIService.unregisterSubscriber(AssetSetupUIServiceDataCallback)>
	//    5   13:pop             
		AnalyticsSubsystem.getInstance().flushMessages();
	//    6   14:invokestatic    #1307 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    7   17:invokevirtual   #1868 <Method void AnalyticsSubsystem.flushMessages()>
		if(aa != null)
	//*   8   20:aload_0         
	//*   9   21:getfield        #176 <Field AlertDialog aa>
	//*  10   24:ifnull          39
		{
			aa.dismiss();
	//   11   27:aload_0         
	//   12   28:getfield        #176 <Field AlertDialog aa>
	//   13   31:invokevirtual   #1746 <Method void AlertDialog.dismiss()>
			aa = null;
	//   14   34:aload_0         
	//   15   35:aconst_null     
	//   16   36:putfield        #176 <Field AlertDialog aa>
		}
		if(ab != null)
	//*  17   39:aload_0         
	//*  18   40:getfield        #178 <Field AlertDialog ab>
	//*  19   43:ifnull          58
		{
			ab.dismiss();
	//   20   46:aload_0         
	//   21   47:getfield        #178 <Field AlertDialog ab>
	//   22   50:invokevirtual   #1746 <Method void AlertDialog.dismiss()>
			ab = null;
	//   23   53:aload_0         
	//   24   54:aconst_null     
	//   25   55:putfield        #178 <Field AlertDialog ab>
		}
		super.onDestroy();
	//   26   58:aload_0         
	//   27   59:invokespecial   #1870 <Method void WizardFragmentActivity.onDestroy()>
	//   28   62:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1873 <Method void WizardFragmentActivity.onPause()>
		if(ac != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #180 <Field BluetoothStateReceiver ac>
	//*   4    8:ifnull          59
			try
			{
				unregisterReceiver(((BroadcastReceiver) (ac)));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #180 <Field BluetoothStateReceiver ac>
	//    8   16:invokevirtual   #1365 <Method void unregisterReceiver(BroadcastReceiver)>
				return;
	//    9   19:return          
			}
			catch(IllegalArgumentException illegalargumentexception)
	//*  10   20:astore_1        
			{
				String s1 = w;
	//   11   21:aload_0         
	//   12   22:getfield        #616 <Field String w>
	//   13   25:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   14   26:new             #630 <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #631 <Method void StringBuilder()>
	//   17   33:astore_3        
				stringbuilder.append("Failed to unregister receiver: ");
	//   18   34:aload_3         
	//   19   35:ldc2            #1875 <String "Failed to unregister receiver: ">
	//   20   38:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
				stringbuilder.append(illegalargumentexception.getMessage());
	//   22   42:aload_3         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #1876 <Method String IllegalArgumentException.getMessage()>
	//   25   47:invokevirtual   #637 <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
				com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   27   51:aload_2         
	//   28   52:aload_3         
	//   29   53:invokevirtual   #643 <Method String StringBuilder.toString()>
	//   30   56:invokestatic    #645 <Method void o.e(String, String)>
			}
	//   31   59:return          
	}

	public void onRestoreInstanceState(Bundle bundle)
	{
		M = bundle.getBoolean("isProvisioningFirstPass");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #1880 <String "isProvisioningFirstPass">
	//    3    5:invokevirtual   #1885 <Method boolean Bundle.getBoolean(String)>
	//    4    8:putfield        #271 <Field boolean M>
		N = bundle.getBoolean("checkWifiStatus");
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:ldc2            #1887 <String "checkWifiStatus">
	//    8   16:invokevirtual   #1885 <Method boolean Bundle.getBoolean(String)>
	//    9   19:putfield        #1189 <Field boolean N>
		R = bundle.getBoolean("resumeNetworkSetup");
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:ldc2            #1889 <String "resumeNetworkSetup">
	//   13   27:invokevirtual   #1885 <Method boolean Bundle.getBoolean(String)>
	//   14   30:putfield        #1193 <Field boolean R>
		super.onRestoreInstanceState(bundle);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #1891 <Method void WizardFragmentActivity.onRestoreInstanceState(Bundle)>
	//   18   38:return          
	}

	protected void onResumeFragments()
	{
		super.onResumeFragments();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1894 <Method void WizardFragmentActivity.onResumeFragments()>
		if(x == 7)
	//*   2    4:aload_0         
	//*   3    5:getfield        #247 <Field int x>
	//*   4    8:bipush          7
	//*   5   10:icmpne          42
		{
			if(com.irobot.home.util.j.j(C.getConnectionInfo().getSSID()))
	//*   6   13:aload_0         
	//*   7   14:getfield        #907 <Field WifiManager C>
	//*   8   17:invokevirtual   #913 <Method WifiInfo WifiManager.getConnectionInfo()>
	//*   9   20:invokevirtual   #348 <Method String WifiInfo.getSSID()>
	//*  10   23:invokestatic    #663 <Method boolean j.j(String)>
	//*  11   26:ifeq            62
			{
				a(8, 8);
	//   12   29:aload_0         
	//   13   30:bipush          8
	//   14   32:bipush          8
	//   15   34:invokevirtual   #461 <Method void a(int, int)>
				G();
	//   16   37:aload_0         
	//   17   38:invokevirtual   #924 <Method void G()>
				return;
	//   18   41:return          
			}
		} else
		if(x == 8 && R)
	//*  19   42:aload_0         
	//*  20   43:getfield        #247 <Field int x>
	//*  21   46:bipush          8
	//*  22   48:icmpne          62
	//*  23   51:aload_0         
	//*  24   52:getfield        #1193 <Field boolean R>
	//*  25   55:ifeq            62
			m();
	//   26   58:aload_0         
	//   27   59:invokevirtual   #1359 <Method void m()>
	//   28   62:return          
	}

	public void onRobotPasswordEvent(RobotPasswordEvent robotpasswordevent)
	{
		aE = robotpasswordevent.password();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1902 <Method String RobotPasswordEvent.password()>
	//    3    5:putfield        #773 <Field String aE>
		if(aD != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #968 <Field a aD>
	//*   6   12:ifnull          26
			aD.b(((Object) (this)), EventType.RobotPasswordEvent);
	//    7   15:aload_0         
	//    8   16:getfield        #968 <Field a aD>
	//    9   19:aload_0         
	//   10   20:getstatic       #974 <Field EventType EventType.RobotPasswordEvent>
	//   11   23:invokevirtual   #1904 <Method void a.b(Object, EventType)>
	//   12   26:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		bundle.putBoolean("isProvisioningFirstPass", M);
	//    0    0:aload_1         
	//    1    1:ldc2            #1880 <String "isProvisioningFirstPass">
	//    2    4:aload_0         
	//    3    5:getfield        #271 <Field boolean M>
	//    4    8:invokevirtual   #1910 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("checkWifiStatus", N);
	//    5   11:aload_1         
	//    6   12:ldc2            #1887 <String "checkWifiStatus">
	//    7   15:aload_0         
	//    8   16:getfield        #1189 <Field boolean N>
	//    9   19:invokevirtual   #1910 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("resumeNetworkSetup", R);
	//   10   22:aload_1         
	//   11   23:ldc2            #1889 <String "resumeNetworkSetup">
	//   12   26:aload_0         
	//   13   27:getfield        #1193 <Field boolean R>
	//   14   30:invokevirtual   #1910 <Method void Bundle.putBoolean(String, boolean)>
		super.onSaveInstanceState(bundle);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #1912 <Method void WizardFragmentActivity.onSaveInstanceState(Bundle)>
	//   18   38:return          
	}

	public void p()
	{
		if(S)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1044 <Field boolean S>
	//*   2    4:ifeq            81
		{
			if(U == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #1592 <Field String U>
	//*   5   11:ifnonnull       34
			{
				com.irobot.home.util.o.e(w, "Cannot show robot MAC address because it is null");
	//    6   14:aload_0         
	//    7   15:getfield        #616 <Field String w>
	//    8   18:ldc2            #1914 <String "Cannot show robot MAC address because it is null">
	//    9   21:invokestatic    #645 <Method void o.e(String, String)>
				T = true;
	//   10   24:aload_0         
	//   11   25:iconst_1        
	//   12   26:putfield        #1473 <Field boolean T>
				i();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #1773 <Method void i()>
				return;
	//   15   33:return          
			}
			(new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(((CharSequence) (getString(0x7f0f07a6, new Object[] {
				U
			})))).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					com.irobot.home.BroadcastSetupActivity.j(a, true);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
				//    2    4:iconst_1        
				//    3    5:invokestatic    #26  <Method boolean com.irobot.home.BroadcastSetupActivity.j(BroadcastSetupActivity, boolean)>
				//    4    8:pop             
					a.i();
				//    5    9:aload_0         
				//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
				//    7   13:invokevirtual   #29  <Method void com.irobot.home.BroadcastSetupActivity.i()>
				//    8   16:return          
				}

				final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//   16   34:new             #302 <Class android.app.AlertDialog$Builder>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #305 <Method void android.app.AlertDialog$Builder(Context)>
	//   20   42:aload_0         
	//   21   43:ldc2            #1915 <Int 0x7f0f07a6>
	//   22   46:iconst_1        
	//   23   47:anewarray       Object[]
	//   24   50:dup             
	//   25   51:iconst_0        
	//   26   52:aload_0         
	//   27   53:getfield        #1592 <Field String U>
	//   28   56:aastore         
	//   29   57:invokevirtual   #317 <Method String getString(int, Object[])>
	//   30   60:invokevirtual   #321 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   31   63:ldc2            #1664 <Int 0x7f0f05bb>
	//   32   66:new             #22  <Class BroadcastSetupActivity$14>
	//   33   69:dup             
	//   34   70:aload_0         
	//   35   71:invokespecial   #1916 <Method void BroadcastSetupActivity$14(BroadcastSetupActivity)>
	//   36   74:invokevirtual   #327 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   37   77:invokevirtual   #335 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   38   80:pop             
		}
	//   39   81:return          
	}

	protected void q()
	{
		if(E)
	//*   0    0:aload_0         
	//*   1    1:getfield        #254 <Field boolean E>
	//*   2    4:ifeq            38
		{
			com.irobot.home.util.o.b(w, "CONNECTED");
	//    3    7:aload_0         
	//    4    8:getfield        #616 <Field String w>
	//    5   11:ldc2            #1918 <String "CONNECTED">
	//    6   14:invokestatic    #777 <Method void o.b(String, String)>
			if(B != null && x == 7)
	//*   7   17:aload_0         
	//*   8   18:getfield        #251 <Field ScanResult B>
	//*   9   21:ifnull          48
	//*  10   24:aload_0         
	//*  11   25:getfield        #247 <Field int x>
	//*  12   28:bipush          7
	//*  13   30:icmpne          48
			{
				super.q();
	//   14   33:aload_0         
	//   15   34:invokespecial   #1920 <Method void WizardFragmentActivity.q()>
				return;
	//   16   37:return          
			}
		} else
		{
			com.irobot.home.util.o.b(w, "CONNECTED (but ignored at this point)");
	//   17   38:aload_0         
	//   18   39:getfield        #616 <Field String w>
	//   19   42:ldc2            #1922 <String "CONNECTED (but ignored at this point)">
	//   20   45:invokestatic    #777 <Method void o.b(String, String)>
		}
	//   21   48:return          
	}

	void r()
	{
		x = 7;
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:putfield        #247 <Field int x>
	//    3    6:return          
	}

	void s()
	{
		if(x == 7)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field int x>
	//*   2    4:bipush          7
	//*   3    6:icmpne          46
		{
			c(0x7f0f07db);
	//    4    9:aload_0         
	//    5   10:ldc2            #915 <Int 0x7f0f07db>
	//    6   13:invokevirtual   #376 <Method void c(int)>
			b(true);
	//    7   16:aload_0         
	//    8   17:iconst_1        
	//    9   18:invokevirtual   #496 <Method void b(boolean)>
			a(0, 8, 0x7f0f034b, 0x7f0800c8);
	//   10   21:aload_0         
	//   11   22:iconst_0        
	//   12   23:bipush          8
	//   13   25:ldc2            #931 <Int 0x7f0f034b>
	//   14   28:ldc2            #390 <Int 0x7f0800c8>
	//   15   31:invokevirtual   #393 <Method void a(int, int, int, int)>
			K = ax();
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:invokespecial   #933 <Method Fragment ax()>
	//   19   39:putfield        #1511 <Field Fragment K>
			super.m();
	//   20   42:aload_0         
	//   21   43:invokespecial   #1576 <Method void com.irobot.home.WizardFragmentActivity.m()>
		}
	//   22   46:return          
	}

	public void t()
	{
		ProvisioningStep provisioningstep = ao();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1302 <Method ProvisioningStep ao()>
	//    2    4:astore_1        
		if(ProvisioningStep.Undefined != provisioningstep)
	//*   3    5:getstatic       #1265 <Field ProvisioningStep ProvisioningStep.Undefined>
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       19
			AnalyticsSubsystem.getInstance().trackProvInfoButtonPressed(provisioningstep);
	//    6   12:invokestatic    #1307 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #1926 <Method void AnalyticsSubsystem.trackProvInfoButtonPressed(ProvisioningStep)>
		if(ao != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #1508 <Field String ao>
	//*  11   23:ifnull          41
			com.irobot.home.WebViewActivity_.a(((Context) (this))).a(ao).a();
	//   12   26:aload_0         
	//   13   27:invokestatic    #1333 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_.a(Context)>
	//   14   30:aload_0         
	//   15   31:getfield        #1508 <Field String ao>
	//   16   34:invokevirtual   #1340 <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//   17   37:invokevirtual   #1341 <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   18   40:pop             
	//   19   41:return          
	}

	public void x()
	{
		com.irobot.home.util.o.c(w, "Bluetooth is now enabled.");
	//    0    0:aload_0         
	//    1    1:getfield        #616 <Field String w>
	//    2    4:ldc2            #1928 <String "Bluetooth is now enabled.">
	//    3    7:invokestatic    #1825 <Method void o.c(String, String)>
		AnalyticsSubsystem.getInstance().trackProvStepViewed(ProvisioningStep.EnableBluetooth);
	//    4   10:invokestatic    #1307 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    5   13:getstatic       #1931 <Field ProvisioningStep ProvisioningStep.EnableBluetooth>
	//    6   16:invokevirtual   #1311 <Method void AnalyticsSubsystem.trackProvStepViewed(ProvisioningStep)>
		an();
	//    7   19:aload_0         
	//    8   20:invokespecial   #834 <Method void an()>
	//    9   23:return          
	}

	public void y()
	{
		aA();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1934 <Method void aA()>
	//    2    4:return          
	}

	protected void z()
	{
		com.irobot.home.model.rest.HelpInfo helpinfo = L.getHelpInfo(com.irobot.home.util.j.f(((Context) (this))), com.irobot.home.util.j.h(((Context) (this))), "R980020");
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field CustomerCareRestClient L>
	//    2    4:aload_0         
	//    3    5:invokestatic    #1491 <Method String j.f(Context)>
	//    4    8:aload_0         
	//    5    9:invokestatic    #1495 <Method String j.h(Context)>
	//    6   12:ldc2            #1936 <String "R980020">
	//    7   15:invokeinterface #1501 <Method com.irobot.home.model.rest.HelpInfo CustomerCareRestClient.getHelpInfo(String, String, String)>
	//    8   20:astore_1        
		if(helpinfo != null)
	//*   9   21:aload_1         
	//*  10   22:ifnull          33
			aq = com.irobot.home.util.s.a(helpinfo);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokestatic    #1938 <Method Map s.a(com.irobot.home.model.rest.HelpInfo)>
	//   14   30:putfield        #1520 <Field Map aq>
		B();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #1486 <Method void B()>
	//   17   37:return          
	}

	static final boolean h = true;
	private CustomerCareRestClient L;
	private boolean M;
	private boolean N;
	private boolean O;
	private boolean P;
	private boolean Q;
	private boolean R;
	private boolean S;
	private boolean T;
	private String U;
	private boolean V;
	private boolean W;
	private boolean X;
	private AssetInfo Y;
	private String Z;
	ImageButton a;
	private int aA;
	private boolean aB;
	private SkuType aC;
	private com.irobot.home.i.a aD;
	private String aE;
	private AlertDialog aa;
	private AlertDialog ab;
	private BluetoothStateReceiver ac;
	private BluetoothAdapter ad;
	private AlertDialog ae;
	private android.content.DialogInterface.OnClickListener af;
	private boolean ag;
	private Fragment ah;
	private int ai;
	private a aj;
	private List ak;
	private AlertDialog al;
	private Map am;
	private boolean an;
	private String ao;
	private String ap;
	private Map aq;
	private Map ar;
	private boolean as;
	private boolean at;
	private int au;
	private int av;
	private int aw;
	private int ax;
	private int ay;
	private int az;
	ImageButton b;
	TextView c;
	LinearLayout d;
	boolean e;
	String f;
	final AssetSetupUIServiceDataCallback g = new AssetSetupUIServiceDataCallback() {

		public void onAssetSetupUIServiceDataChanged(AssetSetupUIServiceData assetsetupuiservicedata)
		{
			if(assetsetupuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			Iterator iterator = assetsetupuiservicedata.getViewStateChangelist().iterator();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #24  <Method ArrayList AssetSetupUIServiceData.getViewStateChangelist()>
		//    5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
		//    6   12:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
		//    7   13:aload_2         
		//    8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
		//    9   19:ifeq            238
				AssetSetupUIServiceViewState assetsetupuiserviceviewstate = (AssetSetupUIServiceViewState)iterator.next();
		//   10   22:aload_2         
		//   11   23:invokeinterface #40  <Method Object Iterator.next()>
		//   12   28:checkcast       #42  <Class AssetSetupUIServiceViewState>
		//   13   31:astore_3        
				switch(com.irobot.home._cls18.b[assetsetupuiserviceviewstate.ordinal()])
		//*  14   32:getstatic       #48  <Field int[] com.irobot.home.BroadcastSetupActivity$18.b>
		//*  15   35:aload_3         
		//*  16   36:invokevirtual   #52  <Method int AssetSetupUIServiceViewState.ordinal()>
		//*  17   39:iaload          
				{
		//*  18   40:tableswitch     1 8: default 88
		//		               1 224
		//		               2 210
		//		               3 196
		//		               4 182
		//		               5 168
		//		               6 154
		//		               7 140
		//		               8 91
		//*  19   88:goto            13
				case 8: // '\b'
					String s1 = a.w;
		//   20   91:aload_0         
		//   21   92:getfield        #12  <Field BroadcastSetupActivity a>
		//   22   95:getfield        #56  <Field String com.irobot.home.BroadcastSetupActivity.w>
		//   23   98:astore          4
					StringBuilder stringbuilder = new StringBuilder();
		//   24  100:new             #58  <Class StringBuilder>
		//   25  103:dup             
		//   26  104:invokespecial   #59  <Method void StringBuilder()>
		//   27  107:astore          5
					stringbuilder.append("Unknown state received from AssertSetupUIService ");
		//   28  109:aload           5
		//   29  111:ldc1            #61  <String "Unknown state received from AssertSetupUIService ">
		//   30  113:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   31  116:pop             
					stringbuilder.append(assetsetupuiserviceviewstate.name());
		//   32  117:aload           5
		//   33  119:aload_3         
		//   34  120:invokevirtual   #69  <Method String AssetSetupUIServiceViewState.name()>
		//   35  123:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   36  126:pop             
					com.irobot.home.util.o.e(s1, stringbuilder.toString());
		//   37  127:aload           4
		//   38  129:aload           5
		//   39  131:invokevirtual   #72  <Method String StringBuilder.toString()>
		//   40  134:invokestatic    #78  <Method void o.e(String, String)>
					break;

		//*  41  137:goto            13
				case 7: // '\007'
					com.irobot.home.BroadcastSetupActivity.a(a, assetsetupuiservicedata.getProvisioningTypeToTransitionTo());
		//   42  140:aload_0         
		//   43  141:getfield        #12  <Field BroadcastSetupActivity a>
		//   44  144:aload_1         
		//   45  145:invokevirtual   #82  <Method ProvisioningType AssetSetupUIServiceData.getProvisioningTypeToTransitionTo()>
		//   46  148:invokestatic    #85  <Method void com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, ProvisioningType)>
					break;

		//*  47  151:goto            13
				case 6: // '\006'
					com.irobot.home.BroadcastSetupActivity.a(a, assetsetupuiservicedata.getAssetDiscoveredOnHomeNetwork());
		//   48  154:aload_0         
		//   49  155:getfield        #12  <Field BroadcastSetupActivity a>
		//   50  158:aload_1         
		//   51  159:invokevirtual   #89  <Method DiscoveredWifiAsset AssetSetupUIServiceData.getAssetDiscoveredOnHomeNetwork()>
		//   52  162:invokestatic    #92  <Method void com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, DiscoveredWifiAsset)>
					break;

		//*  53  165:goto            13
				case 5: // '\005'
					com.irobot.home.BroadcastSetupActivity.a(a, assetsetupuiservicedata.getWifiProvisioningError());
		//   54  168:aload_0         
		//   55  169:getfield        #12  <Field BroadcastSetupActivity a>
		//   56  172:aload_1         
		//   57  173:invokevirtual   #96  <Method Error AssetSetupUIServiceData.getWifiProvisioningError()>
		//   58  176:invokestatic    #99  <Method void com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, Error)>
					break;

		//*  59  179:goto            13
				case 4: // '\004'
					com.irobot.home.BroadcastSetupActivity.c(a, assetsetupuiservicedata.getHomeWifiSsid());
		//   60  182:aload_0         
		//   61  183:getfield        #12  <Field BroadcastSetupActivity a>
		//   62  186:aload_1         
		//   63  187:invokevirtual   #102 <Method String AssetSetupUIServiceData.getHomeWifiSsid()>
		//   64  190:invokestatic    #106 <Method void com.irobot.home.BroadcastSetupActivity.c(BroadcastSetupActivity, String)>
					break;

		//*  65  193:goto            13
				case 3: // '\003'
					com.irobot.home.BroadcastSetupActivity.b(a, assetsetupuiservicedata.getHomeWifiSsid());
		//   66  196:aload_0         
		//   67  197:getfield        #12  <Field BroadcastSetupActivity a>
		//   68  200:aload_1         
		//   69  201:invokevirtual   #102 <Method String AssetSetupUIServiceData.getHomeWifiSsid()>
		//   70  204:invokestatic    #108 <Method void com.irobot.home.BroadcastSetupActivity.b(BroadcastSetupActivity, String)>
					break;

		//*  71  207:goto            13
				case 2: // '\002'
					com.irobot.home.BroadcastSetupActivity.a(a, assetsetupuiservicedata.getSoftApSsid());
		//   72  210:aload_0         
		//   73  211:getfield        #12  <Field BroadcastSetupActivity a>
		//   74  214:aload_1         
		//   75  215:invokevirtual   #111 <Method String AssetSetupUIServiceData.getSoftApSsid()>
		//   76  218:invokestatic    #113 <Method void com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, String)>
					break;

		//*  77  221:goto            13
				case 1: // '\001'
					com.irobot.home.BroadcastSetupActivity.a(a, assetsetupuiservicedata.getCurrentProvisioningStatus());
		//   78  224:aload_0         
		//   79  225:getfield        #12  <Field BroadcastSetupActivity a>
		//   80  228:aload_1         
		//   81  229:invokevirtual   #117 <Method WifiProvisioningStatus AssetSetupUIServiceData.getCurrentProvisioningStatus()>
		//   82  232:invokestatic    #120 <Method void com.irobot.home.BroadcastSetupActivity.a(BroadcastSetupActivity, WifiProvisioningStatus)>
					break;
				}
			} while(true);
		//*  83  235:goto            13
		//   84  238:return          
		}

		final BroadcastSetupActivity a;

			
			{
				a = BroadcastSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BroadcastSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetSetupUIServiceDataCallback()>
			//    5    9:return          
			}
	}
;

	static 
	{
	//    0    0:return          
	}
}
