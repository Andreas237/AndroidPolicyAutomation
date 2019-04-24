// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.res.Resources;
import com.irobot.core.Assembler;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import com.irobot.core.CurrentConnectionState;
import com.irobot.core.CurrentConnectionStateEvent;
import com.irobot.core.EventType;
import com.irobot.core.UpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.home.model.a;
import com.irobot.home.util.AssetSoftwareUpdateUtils;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class BraavaSoftwareUpdateActivity extends BaseFragmentActivity
{

	public BraavaSoftwareUpdateActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	public void e()
	{
		b(0x7f0f08d5);
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <Int 0x7f0f08d5>
	//    2    3:invokevirtual   #28  <Method void b(int)>
		String s = j.j().a().getName();
	//    3    6:invokestatic    #34  <Method a j.j()>
	//    4    9:invokevirtual   #39  <Method AssetInfo a.a()>
	//    5   12:invokevirtual   #45  <Method String AssetInfo.getName()>
	//    6   15:astore_1        
		b.setText(((CharSequence) (getString(0x7f0f0946, new Object[] {
			s
		}))));
	//    7   16:aload_0         
	//    8   17:getfield        #47  <Field CustomButton b>
	//    9   20:aload_0         
	//   10   21:ldc1            #48  <Int 0x7f0f0946>
	//   11   23:iconst_1        
	//   12   24:anewarray       Object[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:aload_1         
	//   16   30:aastore         
	//   17   31:invokevirtual   #54  <Method String getString(int, Object[])>
	//   18   34:invokevirtual   #60  <Method void CustomButton.setText(CharSequence)>
		b.setEnabled(false);
	//   19   37:aload_0         
	//   20   38:getfield        #47  <Field CustomButton b>
	//   21   41:iconst_0        
	//   22   42:invokevirtual   #64  <Method void CustomButton.setEnabled(boolean)>
		b.setBackground(getResources().getDrawable(0x7f0800c7));
	//   23   45:aload_0         
	//   24   46:getfield        #47  <Field CustomButton b>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #68  <Method Resources getResources()>
	//   27   53:ldc1            #69  <Int 0x7f0800c7>
	//   28   55:invokevirtual   #75  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   29   58:invokevirtual   #79  <Method void CustomButton.setBackground(android.graphics.drawable.Drawable)>
		d = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//   30   61:aload_0         
	//   31   62:invokestatic    #85  <Method Assembler Assembler.getInstance()>
	//   32   65:invokevirtual   #89  <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   33   68:checkcast       #91  <Class com.irobot.home.i.a>
	//   34   71:putfield        #93  <Field com.irobot.home.i.a d>
	//   35   74:return          
	}

	void f()
	{
		c.a(new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				a.finish();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BraavaSoftwareUpdateActivity a>
			//    2    4:invokevirtual   #25  <Method void BraavaSoftwareUpdateActivity.finish()>
			//    3    7:return          
			}

			final BraavaSoftwareUpdateActivity a;

			
			{
				a = BraavaSoftwareUpdateActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaSoftwareUpdateActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field AssetSoftwareUpdateUtils c>
	//    2    4:new             #6   <Class BraavaSoftwareUpdateActivity$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #99  <Method void BraavaSoftwareUpdateActivity$1(BraavaSoftwareUpdateActivity)>
	//    6   12:invokevirtual   #104 <Method void AssetSoftwareUpdateUtils.a(android.content.DialogInterface$OnClickListener)>
	//    7   15:return          
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		if(assetupdateavailabilityevent.updateInfo() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #113 <Method com.irobot.core.FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//*   2    4:ifnull          62
		{
			a.setText(0x7f0f05df);
	//    3    7:aload_0         
	//    4    8:getfield        #115 <Field CustomTextView a>
	//    5   11:ldc1            #116 <Int 0x7f0f05df>
	//    6   13:invokevirtual   #120 <Method void CustomTextView.setText(int)>
			c.a(assetupdateavailabilityevent);
	//    7   16:aload_0         
	//    8   17:getfield        #96  <Field AssetSoftwareUpdateUtils c>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #122 <Method void AssetSoftwareUpdateUtils.a(AssetUpdateAvailabilityEvent)>
			CustomButton custombutton = b;
	//   11   24:aload_0         
	//   12   25:getfield        #47  <Field CustomButton b>
	//   13   28:astore_3        
			boolean flag;
			if(assetupdateavailabilityevent.status() == UpdateStatus.UpdateAvailable)
	//*  14   29:aload_1         
	//*  15   30:invokevirtual   #126 <Method UpdateStatus AssetUpdateAvailabilityEvent.status()>
	//*  16   33:getstatic       #132 <Field UpdateStatus UpdateStatus.UpdateAvailable>
	//*  17   36:if_acmpne       44
				flag = true;
	//   18   39:iconst_1        
	//   19   40:istore_2        
			else
	//*  20   41:goto            46
				flag = false;
	//   21   44:iconst_0        
	//   22   45:istore_2        
			custombutton.setEnabled(flag);
	//   23   46:aload_3         
	//   24   47:iload_2         
	//   25   48:invokevirtual   #64  <Method void CustomButton.setEnabled(boolean)>
			d.b(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//   26   51:aload_0         
	//   27   52:getfield        #93  <Field com.irobot.home.i.a d>
	//   28   55:aload_0         
	//   29   56:getstatic       #138 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//   30   59:invokevirtual   #141 <Method void com.irobot.home.i.a.b(Object, EventType)>
		}
	//   31   62:return          
	}

	public void onCurrentConnectionStateEvent(CurrentConnectionStateEvent currentconnectionstateevent)
	{
		b.setEnabled(currentconnectionstateevent.currentConnection().equals(((Object) (CurrentConnectionState.ConnectedLocally))));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field CustomButton b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #150 <Method CurrentConnectionState CurrentConnectionStateEvent.currentConnection()>
	//    4    8:getstatic       #156 <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
	//    5   11:invokevirtual   #160 <Method boolean CurrentConnectionState.equals(Object)>
	//    6   14:invokevirtual   #64  <Method void CustomButton.setEnabled(boolean)>
	//    7   17:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method void BaseFragmentActivity.onPause()>
		d.b(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field com.irobot.home.i.a d>
	//    4    8:aload_0         
	//    5    9:getstatic       #138 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//    6   12:invokevirtual   #141 <Method void com.irobot.home.i.a.b(Object, EventType)>
		d.b(((Object) (this)), EventType.CurrentConnectionStateEvent);
	//    7   15:aload_0         
	//    8   16:getfield        #93  <Field com.irobot.home.i.a d>
	//    9   19:aload_0         
	//   10   20:getstatic       #166 <Field EventType EventType.CurrentConnectionStateEvent>
	//   11   23:invokevirtual   #141 <Method void com.irobot.home.i.a.b(Object, EventType)>
	//   12   26:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #169 <Method void BaseFragmentActivity.onResume()>
		Assembler.getInstance().getUpdateUIService(j.j().b()).queryForSoftwareUpdate();
	//    2    4:invokestatic    #85  <Method Assembler Assembler.getInstance()>
	//    3    7:invokestatic    #34  <Method a j.j()>
	//    4   10:invokevirtual   #172 <Method com.irobot.core.AssetId a.b()>
	//    5   13:invokevirtual   #176 <Method UpdateUIService Assembler.getUpdateUIService(com.irobot.core.AssetId)>
	//    6   16:invokevirtual   #181 <Method void UpdateUIService.queryForSoftwareUpdate()>
		d.a(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//    7   19:aload_0         
	//    8   20:getfield        #93  <Field com.irobot.home.i.a d>
	//    9   23:aload_0         
	//   10   24:getstatic       #138 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//   11   27:invokevirtual   #183 <Method void com.irobot.home.i.a.a(Object, EventType)>
		d.a(((Object) (this)), EventType.CurrentConnectionStateEvent);
	//   12   30:aload_0         
	//   13   31:getfield        #93  <Field com.irobot.home.i.a d>
	//   14   34:aload_0         
	//   15   35:getstatic       #166 <Field EventType EventType.CurrentConnectionStateEvent>
	//   16   38:invokevirtual   #183 <Method void com.irobot.home.i.a.a(Object, EventType)>
	//   17   41:return          
	}

	private static final String e = "com.irobot.home.BraavaSoftwareUpdateActivity";
	CustomTextView a;
	CustomButton b;
	AssetSoftwareUpdateUtils c;
	com.irobot.home.i.a d;

	static 
	{
	//    0    0:return          
	}
}
