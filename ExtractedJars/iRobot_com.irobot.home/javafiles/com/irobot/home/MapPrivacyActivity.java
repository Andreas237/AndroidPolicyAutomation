// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.AlertToggle;
import com.irobot.home.view.CheckableLinearLayout;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, PrivacySettingsActivity_

public class MapPrivacyActivity extends BaseFragmentActivity
	implements com.irobot.home.view.AlertToggle.a
{

	public MapPrivacyActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void BaseFragmentActivity()>
		f = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field boolean f>
		k = ((AssetNetworkUIServiceDataCallback) (new AssetNetworkUIServiceDataCallback() {

			public void onAssetNetworkUIServiceDataChanged(AssetNetworkUIServiceData assetnetworkuiservicedata)
			{
				Iterator iterator = assetnetworkuiservicedata.getDataStateChangelist().iterator();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #24  <Method ArrayList AssetNetworkUIServiceData.getDataStateChangelist()>
			//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//    3    7:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
			//    4    8:aload_2         
			//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//    6   14:ifeq            70
					AssetNetworkUIServiceDataState assetnetworkuiservicedatastate = (AssetNetworkUIServiceDataState)iterator.next();
			//    7   17:aload_2         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class AssetNetworkUIServiceDataState>
			//   10   26:astore_3        
					static class _cls3
					{

						static final int a[];

						static 
						{
							a = new int[AssetNetworkUIServiceDataState.values().length];
						//    0    0:invokestatic    #18  <Method AssetNetworkUIServiceDataState[] AssetNetworkUIServiceDataState.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] a>
							try
							{
								a[AssetNetworkUIServiceDataState.LocalConnectionState.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.LocalConnectionState>
						//    6   15:invokevirtual   #28  <Method int AssetNetworkUIServiceDataState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] a>
						//*  10   23:getstatic       #31  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.RemoteConnectionState>
						//*  11   26:invokevirtual   #28  <Method int AssetNetworkUIServiceDataState.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   15   32:astore_0        
							try
							{
								a[AssetNetworkUIServiceDataState.RemoteConnectionState.ordinal()] = 2;
							}
						//*  16   33:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   17   36:astore_0        
						//*  18   37:return          
						}
					}

					switch(com.irobot.home._cls3.a[assetnetworkuiservicedatastate.ordinal()])
			//*  11   27:getstatic       #47  <Field int[] com.irobot.home.MapPrivacyActivity$3.a>
			//*  12   30:aload_3         
			//*  13   31:invokevirtual   #51  <Method int AssetNetworkUIServiceDataState.ordinal()>
			//*  14   34:iaload          
					{
			//*  15   35:tableswitch     1 2: default 56
			//			               1 59
			//			               2 59
			//*  16   56:goto            8
					case 1: // '\001'
					case 2: // '\002'
						a.a(assetnetworkuiservicedata);
			//   17   59:aload_0         
			//   18   60:getfield        #12  <Field MapPrivacyActivity a>
			//   19   63:aload_1         
			//   20   64:invokevirtual   #53  <Method void com.irobot.home.MapPrivacyActivity.a(AssetNetworkUIServiceData)>
						break;
					}
				} while(true);
			//*  21   67:goto            8
			//   22   70:return          
			}

			final MapPrivacyActivity a;

			
			{
				a = MapPrivacyActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MapPrivacyActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetNetworkUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//    5    9:aload_0         
	//    6   10:new             #8   <Class MapPrivacyActivity$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #40  <Method void MapPrivacyActivity$1(MapPrivacyActivity)>
	//   10   18:putfield        #42  <Field AssetNetworkUIServiceDataCallback k>
	//   11   21:return          
	}

	private void b(boolean flag)
	{
		int l;
		CustomTextView customtextview;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            27
		{
			b.setText(0x7f0f047c);
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field CustomTextView b>
	//    4    8:ldc1            #47  <Int 0x7f0f047c>
	//    5   10:invokevirtual   #53  <Method void CustomTextView.setText(int)>
			customtextview = c;
	//    6   13:aload_0         
	//    7   14:getfield        #55  <Field CustomTextView c>
	//    8   17:astore_3        
			l = 0x7f0f0479;
	//    9   18:ldc1            #56  <Int 0x7f0f0479>
	//   10   20:istore_2        
		} else
	//*  11   21:aload_3         
	//*  12   22:iload_2         
	//*  13   23:invokevirtual   #53  <Method void CustomTextView.setText(int)>
	//*  14   26:return          
		{
			b.setText(0x7f0f047d);
	//   15   27:aload_0         
	//   16   28:getfield        #46  <Field CustomTextView b>
	//   17   31:ldc1            #57  <Int 0x7f0f047d>
	//   18   33:invokevirtual   #53  <Method void CustomTextView.setText(int)>
			customtextview = c;
	//   19   36:aload_0         
	//   20   37:getfield        #55  <Field CustomTextView c>
	//   21   40:astore_3        
			l = 0x7f0f047a;
	//   22   41:ldc1            #58  <Int 0x7f0f047a>
	//   23   43:istore_2        
		}
		customtextview.setText(l);
	//*  24   44:goto            21
	}

	void a(AssetNetworkUIServiceData assetnetworkuiservicedata)
	{
		boolean flag;
		if(assetnetworkuiservicedata.getCurrentConnectionState() != CurrentConnectionState.ConnectedLocally && assetnetworkuiservicedata.getCurrentConnectionState() != CurrentConnectionState.ConnectedRemotely)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #65  <Method CurrentConnectionState AssetNetworkUIServiceData.getCurrentConnectionState()>
	//*   2    4:getstatic       #71  <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
	//*   3    7:if_acmpeq       28
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #65  <Method CurrentConnectionState AssetNetworkUIServiceData.getCurrentConnectionState()>
	//*   6   14:getstatic       #74  <Field CurrentConnectionState CurrentConnectionState.ConnectedRemotely>
	//*   7   17:if_acmpne       23
	//*   8   20:goto            28
			flag = false;
	//    9   23:iconst_0        
	//   10   24:istore_2        
		else
	//*  11   25:goto            30
			flag = true;
	//   12   28:iconst_1        
	//   13   29:istore_2        
		a.setEnabled(flag);
	//   14   30:aload_0         
	//   15   31:getfield        #76  <Field AlertToggle a>
	//   16   34:iload_2         
	//   17   35:invokevirtual   #81  <Method void AlertToggle.setEnabled(boolean)>
		AlertToggle alerttoggle = a;
	//   18   38:aload_0         
	//   19   39:getfield        #76  <Field AlertToggle a>
	//   20   42:astore_3        
		if(flag)
	//*  21   43:iload_2         
	//*  22   44:ifeq            52
			assetnetworkuiservicedata = ((AssetNetworkUIServiceData) (this));
	//   23   47:aload_0         
	//   24   48:astore_1        
		else
	//*  25   49:goto            54
			assetnetworkuiservicedata = null;
	//   26   52:aconst_null     
	//   27   53:astore_1        
		alerttoggle.setOnBeforeCheckedChangeListener(((com.irobot.home.view.AlertToggle.a) (assetnetworkuiservicedata)));
	//   28   54:aload_3         
	//   29   55:aload_1         
	//   30   56:invokevirtual   #85  <Method void AlertToggle.setOnBeforeCheckedChangeListener(com.irobot.home.view.AlertToggle$a)>
	//   31   59:return          
	}

	public void a(CheckableLinearLayout checkablelinearlayout, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            57
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(((CharSequence) (getString(0x7f0f047b, new Object[] {
				j
			})))).setPositiveButton(0x7f0f0481, new android.content.DialogInterface.OnClickListener(flag) {

				public void onClick(DialogInterface dialoginterface, int l)
				{
					b.a(a ^ true);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field MapPrivacyActivity b>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field boolean a>
				//    4    8:iconst_1        
				//    5    9:ixor            
				//    6   10:invokevirtual   #29  <Method void com.irobot.home.MapPrivacyActivity.a(boolean)>
				//    7   13:return          
				}

				final boolean a;
				final MapPrivacyActivity b;

			
			{
				b = MapPrivacyActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MapPrivacyActivity b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    2    4:new             #88  <Class android.app.AlertDialog$Builder>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #91  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    6   12:aload_0         
	//    7   13:ldc1            #92  <Int 0x7f0f047b>
	//    8   15:iconst_1        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:aload_0         
	//   13   22:getfield        #96  <Field String j>
	//   14   25:aastore         
	//   15   26:invokevirtual   #100 <Method String getString(int, Object[])>
	//   16   29:invokevirtual   #104 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   17   32:ldc1            #105 <Int 0x7f0f0481>
	//   18   34:new             #10  <Class MapPrivacyActivity$2>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:iload_2         
	//   22   40:invokespecial   #108 <Method void MapPrivacyActivity$2(MapPrivacyActivity, boolean)>
	//   23   43:invokevirtual   #112 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   24   46:ldc1            #113 <Int 0x7f0f017d>
	//   25   48:aconst_null     
	//   26   49:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   27   52:invokevirtual   #120 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   28   55:pop             
			return;
	//   29   56:return          
		} else
		{
			a(true ^ flag);
	//   30   57:aload_0         
	//   31   58:iconst_1        
	//   32   59:iload_2         
	//   33   60:ixor            
	//   34   61:invokevirtual   #122 <Method void a(boolean)>
			return;
	//   35   64:return          
		}
	}

	public void a(boolean flag)
	{
		a.setCheckedSilently(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field AlertToggle a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #125 <Method void AlertToggle.setCheckedSilently(boolean)>
		SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//    4    8:invokestatic    #131 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//    5   11:astore_2        
		settingsuiservicedata.setBooleanSetting(SettingType.MapUploadAllowed, flag);
	//    6   12:aload_2         
	//    7   13:getstatic       #137 <Field SettingType SettingType.MapUploadAllowed>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #141 <Method void SettingsUIServiceData.setBooleanSetting(SettingType, boolean)>
		g.sendCommand(SettingsUIServiceCommand.UpdateSetting, settingsuiservicedata);
	//   10   20:aload_0         
	//   11   21:getfield        #143 <Field SettingsSubsystem g>
	//   12   24:getstatic       #149 <Field SettingsUIServiceCommand SettingsUIServiceCommand.UpdateSetting>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #155 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
		b(flag);
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:invokespecial   #157 <Method void b(boolean)>
		if(!flag)
	//*  18   36:iload_1         
	//*  19   37:ifne            51
			h.sendCommand(ScheduleUIServiceCommand.DeleteAllSchedulesWithMaps, ((com.irobot.core.ScheduleUIServiceData) (null)));
	//   20   40:aload_0         
	//   21   41:getfield        #159 <Field ScheduleUIService h>
	//   22   44:getstatic       #165 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.DeleteAllSchedulesWithMaps>
	//   23   47:aconst_null     
	//   24   48:invokevirtual   #170 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, com.irobot.core.ScheduleUIServiceData)>
	//   25   51:return          
	}

	public void e()
	{
		b(0x7f0f0478);
	//    0    0:aload_0         
	//    1    1:ldc1            #171 <Int 0x7f0f0478>
	//    2    3:invokevirtual   #173 <Method void b(int)>
		AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//    3    6:invokestatic    #178 <Method a j.j()>
	//    4    9:invokevirtual   #183 <Method AssetInfo a.a()>
	//    5   12:astore_1        
		g = Assembler.getInstance().getSettingsSubsystem(assetinfo.getAssetId());
	//    6   13:aload_0         
	//    7   14:invokestatic    #189 <Method Assembler Assembler.getInstance()>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #195 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   10   21:invokevirtual   #199 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//   11   24:putfield        #143 <Field SettingsSubsystem g>
		h = Assembler.getInstance().getScheduleUIService(assetinfo.getAssetId());
	//   12   27:aload_0         
	//   13   28:invokestatic    #189 <Method Assembler Assembler.getInstance()>
	//   14   31:aload_1         
	//   15   32:invokevirtual   #195 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   16   35:invokevirtual   #203 <Method ScheduleUIService Assembler.getScheduleUIService(com.irobot.core.AssetId)>
	//   17   38:putfield        #159 <Field ScheduleUIService h>
		i = Assembler.getInstance().getNetworkUIService(assetinfo.getAssetId());
	//   18   41:aload_0         
	//   19   42:invokestatic    #189 <Method Assembler Assembler.getInstance()>
	//   20   45:aload_1         
	//   21   46:invokevirtual   #195 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   22   49:invokevirtual   #207 <Method AssetNetworkUIService Assembler.getNetworkUIService(com.irobot.core.AssetId)>
	//   23   52:putfield        #209 <Field AssetNetworkUIService i>
		j = assetinfo.getName();
	//   24   55:aload_0         
	//   25   56:aload_1         
	//   26   57:invokevirtual   #213 <Method String AssetInfo.getName()>
	//   27   60:putfield        #96  <Field String j>
		a.setOnBeforeCheckedChangeListener(((com.irobot.home.view.AlertToggle.a) (null)));
	//   28   63:aload_0         
	//   29   64:getfield        #76  <Field AlertToggle a>
	//   30   67:aconst_null     
	//   31   68:invokevirtual   #85  <Method void AlertToggle.setOnBeforeCheckedChangeListener(com.irobot.home.view.AlertToggle$a)>
		a.setCheckedSilently(e);
	//   32   71:aload_0         
	//   33   72:getfield        #76  <Field AlertToggle a>
	//   34   75:aload_0         
	//   35   76:getfield        #215 <Field boolean e>
	//   36   79:invokevirtual   #125 <Method void AlertToggle.setCheckedSilently(boolean)>
		a.setOnBeforeCheckedChangeListener(((com.irobot.home.view.AlertToggle.a) (this)));
	//   37   82:aload_0         
	//   38   83:getfield        #76  <Field AlertToggle a>
	//   39   86:aload_0         
	//   40   87:invokevirtual   #85  <Method void AlertToggle.setOnBeforeCheckedChangeListener(com.irobot.home.view.AlertToggle$a)>
		d.setPaintFlags(8);
	//   41   90:aload_0         
	//   42   91:getfield        #217 <Field CustomTextView d>
	//   43   94:bipush          8
	//   44   96:invokevirtual   #220 <Method void CustomTextView.setPaintFlags(int)>
		b(e);
	//   45   99:aload_0         
	//   46  100:aload_0         
	//   47  101:getfield        #215 <Field boolean e>
	//   48  104:invokespecial   #157 <Method void b(boolean)>
	//   49  107:return          
	}

	public void f()
	{
		com.irobot.home.PrivacySettingsActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #225 <Method PrivacySettingsActivity_$a com.irobot.home.PrivacySettingsActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #230 <Method org.androidannotations.api.a.e com.irobot.home.PrivacySettingsActivity_$a.a()>
	//    3    7:pop             
	//    4    8:return          
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #233 <Method void BaseFragmentActivity.onBackPressed()>
		if(!f)
	//*   2    4:aload_0         
	//*   3    5:getfield        #37  <Field boolean f>
	//*   4    8:ifne            15
			com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//    5   11:aload_0         
	//    6   12:invokestatic    #236 <Method void j.a(android.app.Activity)>
		finish();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #239 <Method void finish()>
	//    9   19:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #242 <Method void BaseFragmentActivity.onResume()>
		a(i.getServiceData());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #209 <Field AssetNetworkUIService i>
	//    5    9:invokevirtual   #248 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//    6   12:invokevirtual   #250 <Method void a(AssetNetworkUIServiceData)>
	//    7   15:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #253 <Method void BaseFragmentActivity.onStart()>
		i.registerSubscriber(k);
	//    2    4:aload_0         
	//    3    5:getfield        #209 <Field AssetNetworkUIService i>
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field AssetNetworkUIServiceDataCallback k>
	//    6   12:invokevirtual   #257 <Method boolean AssetNetworkUIService.registerSubscriber(AssetNetworkUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method void BaseFragmentActivity.onStop()>
		i.unregisterSubscriber(k);
	//    2    4:aload_0         
	//    3    5:getfield        #209 <Field AssetNetworkUIService i>
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field AssetNetworkUIServiceDataCallback k>
	//    6   12:invokevirtual   #263 <Method boolean AssetNetworkUIService.unregisterSubscriber(AssetNetworkUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	AlertToggle a;
	CustomTextView b;
	CustomTextView c;
	CustomTextView d;
	boolean e;
	boolean f;
	private SettingsSubsystem g;
	private ScheduleUIService h;
	private AssetNetworkUIService i;
	private String j;
	private AssetNetworkUIServiceDataCallback k;
}
