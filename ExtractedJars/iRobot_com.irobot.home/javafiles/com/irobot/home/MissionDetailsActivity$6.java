// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.SeekBar;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

class MissionDetailsActivity$6
	implements android.widget.stener
{

	private float a(SeekBar seekbar)
	{
		return (float)seekbar.getProgress() / (float)seekbar.getMax();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method int SeekBar.getProgress()>
	//    2    4:i2f             
	//    3    5:aload_1         
	//    4    6:invokevirtual   #30  <Method int SeekBar.getMax()>
	//    5    9:i2f             
	//    6   10:fdiv            
	//    7   11:freturn         
	}

	public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            34
		{
			MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    2    4:invokestatic    #38  <Method MapsUIServiceData MapsUIServiceData.create()>
	//    3    7:astore          4
			mapsuiservicedata.setPlaybackProgress(a(seekbar));
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #40  <Method float a(SeekBar)>
	//    8   16:invokevirtual   #44  <Method void MapsUIServiceData.setPlaybackProgress(float)>
			MissionDetailsActivity.a(a).sendCommand(MapsUIServiceCommand.SeekPlayback, mapsuiservicedata);
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field MissionDetailsActivity a>
	//   11   23:invokestatic    #47  <Method MapsUIService MissionDetailsActivity.a(MissionDetailsActivity)>
	//   12   26:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.SeekPlayback>
	//   13   29:aload           4
	//   14   31:invokevirtual   #59  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		}
	//   15   34:return          
	}

	public void onStartTrackingTouch(SeekBar seekbar)
	{
		MissionDetailsActivity.a(a).sendCommand(MapsUIServiceCommand.PausePlayback, ((MapsUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MissionDetailsActivity a>
	//    2    4:invokestatic    #47  <Method MapsUIService MissionDetailsActivity.a(MissionDetailsActivity)>
	//    3    7:getstatic       #64  <Field MapsUIServiceCommand MapsUIServiceCommand.PausePlayback>
	//    4   10:aconst_null     
	//    5   11:invokevirtual   #59  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    6   14:invokestatic    #38  <Method MapsUIServiceData MapsUIServiceData.create()>
	//    7   17:astore_2        
		mapsuiservicedata.setPlaybackProgress(a(seekbar));
	//    8   18:aload_2         
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #40  <Method float a(SeekBar)>
	//   12   24:invokevirtual   #44  <Method void MapsUIServiceData.setPlaybackProgress(float)>
		MissionDetailsActivity.a(a).sendCommand(MapsUIServiceCommand.SeekPlayback, mapsuiservicedata);
	//   13   27:aload_0         
	//   14   28:getfield        #17  <Field MissionDetailsActivity a>
	//   15   31:invokestatic    #47  <Method MapsUIService MissionDetailsActivity.a(MissionDetailsActivity)>
	//   16   34:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.SeekPlayback>
	//   17   37:aload_2         
	//   18   38:invokevirtual   #59  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   19   41:return          
	}

	public void onStopTrackingTouch(SeekBar seekbar)
	{
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    0    0:invokestatic    #38  <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:astore_2        
		mapsuiservicedata.setPlaybackProgress(a(seekbar));
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #40  <Method float a(SeekBar)>
	//    6   10:invokevirtual   #44  <Method void MapsUIServiceData.setPlaybackProgress(float)>
		MissionDetailsActivity.a(a).sendCommand(MapsUIServiceCommand.SeekPlayback, mapsuiservicedata);
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field MissionDetailsActivity a>
	//    9   17:invokestatic    #47  <Method MapsUIService MissionDetailsActivity.a(MissionDetailsActivity)>
	//   10   20:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.SeekPlayback>
	//   11   23:aload_2         
	//   12   24:invokevirtual   #59  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   13   27:return          
	}

	final MissionDetailsActivity a;

	MissionDetailsActivity$6(MissionDetailsActivity missiondetailsactivity)
	{
		a = missiondetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MissionDetailsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
