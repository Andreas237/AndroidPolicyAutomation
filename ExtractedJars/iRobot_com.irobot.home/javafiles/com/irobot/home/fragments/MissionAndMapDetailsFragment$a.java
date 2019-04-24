// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			MissionAndMapDetailsFragment

private class MissionAndMapDetailsFragment$a extends SettingsUIServiceDataCallback
{

	public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
	{
		if(settingsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.d(MissionAndMapDetailsFragment.h(), "Service data was null.");
	//    2    4:invokestatic    #25  <Method String MissionAndMapDetailsFragment.h()>
	//    3    7:ldc1            #27  <String "Service data was null.">
	//    4    9:invokestatic    #33  <Method void o.d(String, String)>
			return;
	//    5   12:return          
		}
		MissionAndMapDetailsFragment.b(a).unregisterSubscriber(((SettingsUIServiceDataCallback) (this)));
	//    6   13:aload_0         
	//    7   14:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//    8   17:invokestatic    #37  <Method SettingsSubsystem MissionAndMapDetailsFragment.b(MissionAndMapDetailsFragment)>
	//    9   20:aload_0         
	//   10   21:invokevirtual   #43  <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//   11   24:pop             
		Object obj = ((Object) (settingsuiservicedata.getAvailableSettings()));
	//   12   25:aload_1         
	//   13   26:invokevirtual   #49  <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//   14   29:astore_2        
		com.irobot.home.fragments.MissionAndMapDetailsFragment.a(a, ((HashSet) (obj)).contains(((Object) (SettingType.StaticMaps))));
	//   15   30:aload_0         
	//   16   31:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   17   34:aload_2         
	//   18   35:getstatic       #55  <Field SettingType SettingType.StaticMaps>
	//   19   38:invokevirtual   #61  <Method boolean HashSet.contains(Object)>
	//   20   41:invokestatic    #64  <Method boolean com.irobot.home.fragments.MissionAndMapDetailsFragment.a(MissionAndMapDetailsFragment, boolean)>
	//   21   44:pop             
		if(!MissionAndMapDetailsFragment.c(a))
	//*  22   45:aload_0         
	//*  23   46:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//*  24   49:invokestatic    #68  <Method boolean MissionAndMapDetailsFragment.c(MissionAndMapDetailsFragment)>
	//*  25   52:ifne            62
			a.c();
	//   26   55:aload_0         
	//   27   56:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   28   59:invokevirtual   #70  <Method void MissionAndMapDetailsFragment.c()>
		MissionAndMapDetailsFragment.b(a, ((HashSet) (obj)).contains(((Object) (SettingType.WifiMaps))));
	//   29   62:aload_0         
	//   30   63:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   31   66:aload_2         
	//   32   67:getstatic       #73  <Field SettingType SettingType.WifiMaps>
	//   33   70:invokevirtual   #61  <Method boolean HashSet.contains(Object)>
	//   34   73:invokestatic    #75  <Method boolean MissionAndMapDetailsFragment.b(MissionAndMapDetailsFragment, boolean)>
	//   35   76:pop             
		if(MissionAndMapDetailsFragment.d(a))
	//*  36   77:aload_0         
	//*  37   78:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//*  38   81:invokestatic    #77  <Method boolean MissionAndMapDetailsFragment.d(MissionAndMapDetailsFragment)>
	//*  39   84:ifeq            96
			a.b(0x7f0f0978);
	//   40   87:aload_0         
	//   41   88:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   42   91:ldc1            #78  <Int 0x7f0f0978>
	//   43   93:invokevirtual   #81  <Method void MissionAndMapDetailsFragment.b(int)>
		obj = ((Object) (settingsuiservicedata.getSettingsChangeList().iterator()));
	//   44   96:aload_1         
	//   45   97:invokevirtual   #84  <Method HashSet SettingsUIServiceData.getSettingsChangeList()>
	//   46  100:invokevirtual   #88  <Method Iterator HashSet.iterator()>
	//   47  103:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   48  104:aload_2         
	//   49  105:invokeinterface #94  <Method boolean Iterator.hasNext()>
	//   50  110:ifeq            156
			SettingType settingtype = (SettingType)((Iterator) (obj)).next();
	//   51  113:aload_2         
	//   52  114:invokeinterface #98  <Method Object Iterator.next()>
	//   53  119:checkcast       #51  <Class SettingType>
	//   54  122:astore_3        
			if(MissionAndMapDetailsFragment$7.c[settingtype.ordinal()] == 1)
	//*  55  123:getstatic       #103 <Field int[] MissionAndMapDetailsFragment$7.c>
	//*  56  126:aload_3         
	//*  57  127:invokevirtual   #107 <Method int SettingType.ordinal()>
	//*  58  130:iaload          
	//*  59  131:iconst_1        
	//*  60  132:icmpeq          138
	//*  61  135:goto            104
				com.irobot.home.fragments.MissionAndMapDetailsFragment.a(a, settingsuiservicedata.getStringSetting(SettingType.Name));
	//   62  138:aload_0         
	//   63  139:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   64  142:aload_1         
	//   65  143:getstatic       #110 <Field SettingType SettingType.Name>
	//   66  146:invokevirtual   #114 <Method String SettingsUIServiceData.getStringSetting(SettingType)>
	//   67  149:invokestatic    #117 <Method String com.irobot.home.fragments.MissionAndMapDetailsFragment.a(MissionAndMapDetailsFragment, String)>
	//   68  152:pop             
		} while(true);
	//   69  153:goto            104
		settingsuiservicedata = ((SettingsUIServiceData) (j.a(a.B).b()));
	//   70  156:aload_0         
	//   71  157:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   72  160:getfield        #121 <Field String MissionAndMapDetailsFragment.B>
	//   73  163:invokestatic    #126 <Method a j.a(String)>
	//   74  166:invokevirtual   #131 <Method com.irobot.core.AssetId a.b()>
	//   75  169:astore_1        
		Assembler.getInstance().getNetworkUIService(((com.irobot.core.AssetId) (settingsuiservicedata))).registerSubscriber(MissionAndMapDetailsFragment.e(a));
	//   76  170:invokestatic    #137 <Method Assembler Assembler.getInstance()>
	//   77  173:aload_1         
	//   78  174:invokevirtual   #141 <Method AssetNetworkUIService Assembler.getNetworkUIService(com.irobot.core.AssetId)>
	//   79  177:aload_0         
	//   80  178:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   81  181:invokestatic    #145 <Method com.irobot.core.AssetNetworkUIServiceDataCallback MissionAndMapDetailsFragment.e(MissionAndMapDetailsFragment)>
	//   82  184:invokevirtual   #151 <Method boolean AssetNetworkUIService.registerSubscriber(com.irobot.core.AssetNetworkUIServiceDataCallback)>
	//   83  187:pop             
	//   84  188:return          
	}

	final MissionAndMapDetailsFragment a;

	private MissionAndMapDetailsFragment$a(MissionAndMapDetailsFragment missionandmapdetailsfragment)
	{
		a = missionandmapdetailsfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MissionAndMapDetailsFragment a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
	//    5    9:return          
	}

	MissionAndMapDetailsFragment$a(MissionAndMapDetailsFragment missionandmapdetailsfragment, MissionAndMapDetailsFragment$1 missionandmapdetailsfragment$1)
	{
		this(missionandmapdetailsfragment);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void MissionAndMapDetailsFragment$a(MissionAndMapDetailsFragment)>
	//    3    5:return          
	}
}
