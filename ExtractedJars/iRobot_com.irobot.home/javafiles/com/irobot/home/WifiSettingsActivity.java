// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, DetailedWifiSettingsActivity_, BroadcastSetupActivity_

public class WifiSettingsActivity extends BaseFragmentActivity
{

	public WifiSettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	void e()
	{
		b(0x7f0f097d);
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <Int 0x7f0f097d>
	//    2    3:invokevirtual   #23  <Method void b(int)>
		c.setText(((CharSequence) (getString(0x7f0f097f, new Object[] {
			e
		}))));
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field CustomTextView c>
	//    5   10:aload_0         
	//    6   11:ldc1            #26  <Int 0x7f0f097f>
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:aload_0         
	//   12   20:getfield        #30  <Field String e>
	//   13   23:aastore         
	//   14   24:invokevirtual   #34  <Method String getString(int, Object[])>
	//   15   27:invokevirtual   #40  <Method void CustomTextView.setText(CharSequence)>
		Object obj = ((Object) (Assembler.getInstance().getNetworkUIService(AssetId.assetIdForString(d)).getServiceData().getWifiConfiguration()));
	//   16   30:invokestatic    #46  <Method Assembler Assembler.getInstance()>
	//   17   33:aload_0         
	//   18   34:getfield        #48  <Field String d>
	//   19   37:invokestatic    #54  <Method AssetId AssetId.assetIdForString(String)>
	//   20   40:invokevirtual   #58  <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   21   43:invokevirtual   #64  <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   22   46:invokevirtual   #70  <Method WifiConfigEvent AssetNetworkUIServiceData.getWifiConfiguration()>
	//   23   49:astore_1        
		TextView textview = b;
	//   24   50:aload_0         
	//   25   51:getfield        #72  <Field TextView b>
	//   26   54:astore_2        
		if(obj == null)
	//*  27   55:aload_1         
	//*  28   56:ifnonnull       65
			obj = "";
	//   29   59:ldc1            #74  <String "">
	//   30   61:astore_1        
		else
	//*  31   62:goto            70
			obj = ((Object) (((WifiConfigEvent) (obj)).ssid()));
	//   32   65:aload_1         
	//   33   66:invokevirtual   #80  <Method String WifiConfigEvent.ssid()>
	//   34   69:astore_1        
		textview.setText(((CharSequence) (getString(0x7f0f094f, new Object[] {
			obj
		}))));
	//   35   70:aload_2         
	//   36   71:aload_0         
	//   37   72:ldc1            #81  <Int 0x7f0f094f>
	//   38   74:iconst_1        
	//   39   75:anewarray       Object[]
	//   40   78:dup             
	//   41   79:iconst_0        
	//   42   80:aload_1         
	//   43   81:aastore         
	//   44   82:invokevirtual   #34  <Method String getString(int, Object[])>
	//   45   85:invokevirtual   #84  <Method void TextView.setText(CharSequence)>
		obj = ((Object) (j.a(d).a()));
	//   46   88:aload_0         
	//   47   89:getfield        #48  <Field String d>
	//   48   92:invokestatic    #89  <Method a j.a(String)>
	//   49   95:invokevirtual   #94  <Method AssetInfo a.a()>
	//   50   98:astore_1        
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.WifiSettings, ((AssetInfo) (obj)));
	//   51   99:invokestatic    #99  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   52  102:getstatic       #105 <Field ViewId ViewId.WifiSettings>
	//   53  105:aload_1         
	//   54  106:invokevirtual   #109 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   55  109:return          
	}

	public void f()
	{
		AssetNetworkUIService assetnetworkuiservice = Assembler.getInstance().getNetworkUIService(j.k());
	//    0    0:invokestatic    #46  <Method Assembler Assembler.getInstance()>
	//    1    3:invokestatic    #114 <Method AssetId j.k()>
	//    2    6:invokevirtual   #58  <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//    3    9:astore_1        
		if(assetnetworkuiservice != null && assetnetworkuiservice.getServiceData().isConnectedLocally())
	//*   4   10:aload_1         
	//*   5   11:ifnull          47
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #64  <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*   8   18:invokevirtual   #118 <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//*   9   21:ifeq            47
		{
			com.irobot.home.DetailedWifiSettingsActivity_.a(((android.content.Context) (this))).b(e).a(d).a();
	//   10   24:aload_0         
	//   11   25:invokestatic    #123 <Method DetailedWifiSettingsActivity_$a com.irobot.home.DetailedWifiSettingsActivity_.a(android.content.Context)>
	//   12   28:aload_0         
	//   13   29:getfield        #30  <Field String e>
	//   14   32:invokevirtual   #128 <Method DetailedWifiSettingsActivity_$a com.irobot.home.DetailedWifiSettingsActivity_$a.b(String)>
	//   15   35:aload_0         
	//   16   36:getfield        #48  <Field String d>
	//   17   39:invokevirtual   #130 <Method DetailedWifiSettingsActivity_$a com.irobot.home.DetailedWifiSettingsActivity_$a.a(String)>
	//   18   42:invokevirtual   #133 <Method org.androidannotations.api.a.e com.irobot.home.DetailedWifiSettingsActivity_$a.a()>
	//   19   45:pop             
			return;
	//   20   46:return          
		} else
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f0972).setMessage(((CharSequence) (getString(0x7f0f0971, new Object[] {
				e
			})))).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//   21   47:new             #135 <Class android.app.AlertDialog$Builder>
	//   22   50:dup             
	//   23   51:aload_0         
	//   24   52:invokespecial   #138 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   25   55:ldc1            #139 <Int 0x7f0f0972>
	//   26   57:invokevirtual   #143 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   27   60:aload_0         
	//   28   61:ldc1            #144 <Int 0x7f0f0971>
	//   29   63:iconst_1        
	//   30   64:anewarray       Object[]
	//   31   67:dup             
	//   32   68:iconst_0        
	//   33   69:aload_0         
	//   34   70:getfield        #30  <Field String e>
	//   35   73:aastore         
	//   36   74:invokevirtual   #34  <Method String getString(int, Object[])>
	//   37   77:invokevirtual   #148 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   38   80:ldc1            #149 <Int 0x7f0f05bb>
	//   39   82:aconst_null     
	//   40   83:invokevirtual   #153 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   41   86:invokevirtual   #157 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   42   89:pop             
			return;
	//   43   90:return          
		}
	}

	public void g()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f0214).setMessage(0x7f0f0215).setPositiveButton(0x7f0f0196, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				dialoginterface = ((DialogInterface) (Assembler.getInstance().getAssetService().currentAssetInfo()));
			//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
			//    1    3:invokevirtual   #32  <Method AssetService Assembler.getAssetService()>
			//    2    6:invokevirtual   #38  <Method AssetInfo AssetService.currentAssetInfo()>
			//    3    9:astore_1        
				if(dialoginterface != null)
			//*   4   10:aload_1         
			//*   5   11:ifnull          53
				{
					AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
			//    6   14:invokestatic    #28  <Method Assembler Assembler.getInstance()>
			//    7   17:invokevirtual   #42  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
			//    8   20:astore_3        
					AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
			//    9   21:invokestatic    #48  <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
			//   10   24:astore          4
					assetsetupuiservicedata.setPlaceholderSkuType(SkuUtils.getSkuType(((AssetInfo) (dialoginterface)).getSku()));
			//   11   26:aload           4
			//   12   28:aload_1         
			//   13   29:invokevirtual   #54  <Method String AssetInfo.getSku()>
			//   14   32:invokestatic    #60  <Method com.irobot.core.SkuType SkuUtils.getSkuType(String)>
			//   15   35:invokevirtual   #64  <Method void AssetSetupUIServiceData.setPlaceholderSkuType(com.irobot.core.SkuType)>
					assetsetupuiservicedata.setAssetBeingReprovisioned(((AssetInfo) (dialoginterface)));
			//   16   38:aload           4
			//   17   40:aload_1         
			//   18   41:invokevirtual   #68  <Method void AssetSetupUIServiceData.setAssetBeingReprovisioned(AssetInfo)>
					assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.UpdateServiceData, assetsetupuiservicedata);
			//   19   44:aload_3         
			//   20   45:getstatic       #74  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.UpdateServiceData>
			//   21   48:aload           4
			//   22   50:invokevirtual   #80  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
				}
				com.irobot.home.BroadcastSetupActivity_.a(((android.content.Context) (a))).a(false).a(a.d).a(1);
			//   23   53:aload_0         
			//   24   54:getfield        #17  <Field WifiSettingsActivity a>
			//   25   57:invokestatic    #85  <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_.a(android.content.Context)>
			//   26   60:iconst_0        
			//   27   61:invokevirtual   #90  <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_$a.a(boolean)>
			//   28   64:aload_0         
			//   29   65:getfield        #17  <Field WifiSettingsActivity a>
			//   30   68:getfield        #94  <Field String WifiSettingsActivity.d>
			//   31   71:invokevirtual   #97  <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_$a.a(String)>
			//   32   74:iconst_1        
			//   33   75:invokevirtual   #100 <Method org.androidannotations.api.a.e com.irobot.home.BroadcastSetupActivity_$a.a(int)>
			//   34   78:pop             
			//   35   79:return          
			}

			final WifiSettingsActivity a;

			
			{
				a = WifiSettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WifiSettingsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #135 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #138 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc1            #159 <Int 0x7f0f0214>
	//    5   10:invokevirtual   #143 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   13:ldc1            #160 <Int 0x7f0f0215>
	//    7   15:invokevirtual   #162 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   18:ldc1            #163 <Int 0x7f0f0196>
	//    9   20:new             #6   <Class WifiSettingsActivity$1>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:invokespecial   #166 <Method void WifiSettingsActivity$1(WifiSettingsActivity)>
	//   13   28:invokevirtual   #153 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   14   31:ldc1            #167 <Int 0x7f0f017d>
	//   15   33:aconst_null     
	//   16   34:invokevirtual   #170 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   17   37:invokevirtual   #157 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   18   40:pop             
	//   19   41:return          
	}

	protected void onActivityResult(int i, int k, Intent intent)
	{
		if(i == 1 && k == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          25
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          25
		{
			r.c(d);
	//    6   10:aload_0         
	//    7   11:getfield        #176 <Field b r>
	//    8   14:aload_0         
	//    9   15:getfield        #48  <Field String d>
	//   10   18:invokevirtual   #181 <Method void b.c(String)>
			e();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #183 <Method void e()>
		}
	//   13   25:return          
	}

	CustomTextView a;
	TextView b;
	CustomTextView c;
	String d;
	String e;
}
