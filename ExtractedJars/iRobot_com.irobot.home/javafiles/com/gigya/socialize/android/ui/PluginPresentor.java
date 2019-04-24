// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.GSPluginFragment;
import com.gigya.socialize.android.event.GSDialogListener;
import com.gigya.socialize.android.event.GSPluginListener;

// Referenced classes of package com.gigya.socialize.android.ui:
//			HostActivity

public class PluginPresentor
{

	public PluginPresentor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public void show(final String plugin, final GSObject params, final GSPluginListener pluginListener, final GSDialogListener dialogListener)
	{
		HostActivity.create(GSAPI.getInstance().getContext(), new HostActivity.HostActivityHandler() {

			public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
			{
			//    0    0:return          
			}

			public void onCancel(FragmentActivity fragmentactivity)
			{
			//    0    0:return          
			}

			public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
			{
				GSPluginFragment gspluginfragment = (GSPluginFragment)fragmentactivity.getSupportFragmentManager().findFragmentByTag("PluginDialog");
			//    0    0:aload_1         
			//    1    1:invokevirtual   #51  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
			//    2    4:ldc1            #53  <String "PluginDialog">
			//    3    6:invokevirtual   #59  <Method android.support.v4.app.Fragment FragmentManager.findFragmentByTag(String)>
			//    4    9:checkcast       #61  <Class GSPluginFragment>
			//    5   12:astore_3        
				bundle = ((Bundle) (gspluginfragment));
			//    6   13:aload_3         
			//    7   14:astore_2        
				if(gspluginfragment == null)
			//*   8   15:aload_3         
			//*   9   16:ifnonnull       42
				{
					bundle = ((Bundle) (GSPluginFragment.newInstance(plugin, params, true)));
			//   10   19:aload_0         
			//   11   20:getfield        #29  <Field String val$plugin>
			//   12   23:aload_0         
			//   13   24:getfield        #31  <Field GSObject val$params>
			//   14   27:iconst_1        
			//   15   28:invokestatic    #65  <Method GSPluginFragment GSPluginFragment.newInstance(String, GSObject, boolean)>
			//   16   31:astore_2        
					((GSPluginFragment) (bundle)).show(fragmentactivity.getSupportFragmentManager(), "PluginDialog");
			//   17   32:aload_2         
			//   18   33:aload_1         
			//   19   34:invokevirtual   #51  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
			//   20   37:ldc1            #53  <String "PluginDialog">
			//   21   39:invokevirtual   #68  <Method void GSPluginFragment.show(FragmentManager, String)>
				}
				((GSPluginFragment) (bundle)).setRetainInstance(true);
			//   22   42:aload_2         
			//   23   43:iconst_1        
			//   24   44:invokevirtual   #72  <Method void GSPluginFragment.setRetainInstance(boolean)>
				((GSPluginFragment) (bundle)).setPluginListener(pluginListener);
			//   25   47:aload_2         
			//   26   48:aload_0         
			//   27   49:getfield        #33  <Field GSPluginListener val$pluginListener>
			//   28   52:invokevirtual   #76  <Method void GSPluginFragment.setPluginListener(GSPluginListener)>
				((GSPluginFragment) (bundle)).setOnDismissListener(((_cls1) (fragmentactivity)). new GSDialogListener() {

					public void onDismiss(boolean flag, GSObject gsobject)
					{
						activity.finish();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field FragmentActivity val$activity>
					//    2    4:invokevirtual   #32  <Method void FragmentActivity.finish()>
						if(dialogListener != null)
					//*   3    7:aload_0         
					//*   4    8:getfield        #19  <Field PluginPresentor$1 this$1>
					//*   5   11:getfield        #36  <Field GSDialogListener PluginPresentor$1.val$dialogListener>
					//*   6   14:ifnull          31
							dialogListener.onDismiss(flag, gsobject);
					//    7   17:aload_0         
					//    8   18:getfield        #19  <Field PluginPresentor$1 this$1>
					//    9   21:getfield        #36  <Field GSDialogListener PluginPresentor$1.val$dialogListener>
					//   10   24:iload_1         
					//   11   25:aload_2         
					//   12   26:invokeinterface #38  <Method void GSDialogListener.onDismiss(boolean, GSObject)>
					//   13   31:return          
					}

					final _cls1 this$1;
					final FragmentActivity val$activity;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PluginPresentor$1 this$1>
				activity = FragmentActivity.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FragmentActivity val$activity>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
			//   29   55:aload_2         
			//   30   56:new             #13  <Class PluginPresentor$1$1>
			//   31   59:dup             
			//   32   60:aload_0         
			//   33   61:aload_1         
			//   34   62:invokespecial   #79  <Method void PluginPresentor$1$1(PluginPresentor$1, FragmentActivity)>
			//   35   65:invokevirtual   #83  <Method void GSPluginFragment.setOnDismissListener(GSDialogListener)>
			//   36   68:return          
			}

			public void onResume(FragmentActivity fragmentactivity)
			{
			//    0    0:return          
			}

			public void onStart(FragmentActivity fragmentactivity)
			{
			//    0    0:return          
			}

			final PluginPresentor this$0;
			final GSDialogListener val$dialogListener;
			final GSObject val$params;
			final String val$plugin;
			final GSPluginListener val$pluginListener;

			
			{
				this$0 = PluginPresentor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field PluginPresentor this$0>
				plugin = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field String val$plugin>
				params = gsobject;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field GSObject val$params>
				pluginListener = gspluginlistener;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #33  <Field GSPluginListener val$pluginListener>
				dialogListener = gsdialoglistener;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #35  <Field GSDialogListener val$dialogListener>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #38  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    0    0:invokestatic    #21  <Method GSAPI GSAPI.getInstance()>
	//    1    3:invokevirtual   #25  <Method android.content.Context GSAPI.getContext()>
	//    2    6:new             #6   <Class PluginPresentor$1>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:invokespecial   #28  <Method void PluginPresentor$1(PluginPresentor, String, GSObject, GSPluginListener, GSDialogListener)>
	//   10   19:invokestatic    #34  <Method Integer HostActivity.create(android.content.Context, HostActivity$HostActivityHandler)>
	//   11   22:pop             
	//   12   23:return          
	}
}
