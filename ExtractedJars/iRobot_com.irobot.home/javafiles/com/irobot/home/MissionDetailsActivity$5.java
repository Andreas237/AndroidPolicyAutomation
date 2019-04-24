// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

class MissionDetailsActivity$5 extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata != null && !a.isFinishing())
	//*   0    0:aload_1         
	//*   1    1:ifnull          94
	//*   2    4:aload_0         
	//*   3    5:getfield        #12  <Field MissionDetailsActivity a>
	//*   4    8:invokevirtual   #22  <Method boolean MissionDetailsActivity.isFinishing()>
	//*   5   11:ifne            94
		{
			if(a.isDestroyed())
	//*   6   14:aload_0         
	//*   7   15:getfield        #12  <Field MissionDetailsActivity a>
	//*   8   18:invokevirtual   #25  <Method boolean MissionDetailsActivity.isDestroyed()>
	//*   9   21:ifeq            25
				return;
	//   10   24:return          
			Iterator iterator = ((Set) (settingsuiservicedata.getSettingsChangeList())).iterator();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #31  <Method java.util.HashSet SettingsUIServiceData.getSettingsChangeList()>
	//   13   29:invokeinterface #37  <Method Iterator Set.iterator()>
	//   14   34:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   15   35:aload_2         
	//   16   36:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//   17   41:ifeq            94
				SettingType settingtype = (SettingType)iterator.next();
	//   18   44:aload_2         
	//   19   45:invokeinterface #46  <Method Object Iterator.next()>
	//   20   50:checkcast       #48  <Class SettingType>
	//   21   53:astore_3        
				if(MissionDetailsActivity$4.c[settingtype.ordinal()] == 1)
	//*  22   54:getstatic       #54  <Field int[] MissionDetailsActivity$4.c>
	//*  23   57:aload_3         
	//*  24   58:invokevirtual   #58  <Method int SettingType.ordinal()>
	//*  25   61:iaload          
	//*  26   62:iconst_1        
	//*  27   63:icmpeq          69
	//*  28   66:goto            35
				{
					MissionDetailsActivity.b(a, settingsuiservicedata.getStringSetting(SettingType.Name));
	//   29   69:aload_0         
	//   30   70:getfield        #12  <Field MissionDetailsActivity a>
	//   31   73:aload_1         
	//   32   74:getstatic       #62  <Field SettingType SettingType.Name>
	//   33   77:invokevirtual   #66  <Method String SettingsUIServiceData.getStringSetting(SettingType)>
	//   34   80:invokestatic    #70  <Method String MissionDetailsActivity.b(MissionDetailsActivity, String)>
	//   35   83:pop             
					MissionDetailsActivity.c(a);
	//   36   84:aload_0         
	//   37   85:getfield        #12  <Field MissionDetailsActivity a>
	//   38   88:invokestatic    #72  <Method void MissionDetailsActivity.c(MissionDetailsActivity)>
				}
			} while(true);
	//   39   91:goto            35
		}
	//   40   94:return          
	}

	final MissionDetailsActivity a;

	MissionDetailsActivity$5(MissionDetailsActivity missiondetailsactivity)
	{
		a = missiondetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MissionDetailsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}
}
