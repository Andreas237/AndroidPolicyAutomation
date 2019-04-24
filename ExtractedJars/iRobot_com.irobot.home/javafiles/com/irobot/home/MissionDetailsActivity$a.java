// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

private class MissionDetailsActivity$a extends MapsUIServiceDataCallback
{

	public void onMapsUIServiceDataChanged(MapsUIServiceData mapsuiservicedata)
	{
		if(mapsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(MissionDetailsActivity.q(), "null service data");
	//    2    4:invokestatic    #25  <Method String MissionDetailsActivity.q()>
	//    3    7:ldc1            #27  <String "null service data">
	//    4    9:invokestatic    #33  <Method void o.e(String, String)>
			return;
	//    5   12:return          
		}
		Object obj = ((Object) (mapsuiservicedata.getMapsDataStates()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #39  <Method ArrayList MapsUIServiceData.getMapsDataStates()>
	//    8   17:astore_2        
		String s = MissionDetailsActivity.q();
	//    9   18:invokestatic    #25  <Method String MissionDetailsActivity.q()>
	//   10   21:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   22:new             #41  <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #42  <Method void StringBuilder()>
	//   14   29:astore          4
		stringbuilder.append("Change list: ");
	//   15   31:aload           4
	//   16   33:ldc1            #44  <String "Change list: ">
	//   17   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		stringbuilder.append(((ArrayList) (obj)).toString());
	//   19   39:aload           4
	//   20   41:aload_2         
	//   21   42:invokevirtual   #53  <Method String ArrayList.toString()>
	//   22   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
		o.b(s, stringbuilder.toString());
	//   24   49:aload_3         
	//   25   50:aload           4
	//   26   52:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   27   55:invokestatic    #57  <Method void o.b(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   28   58:aload_2         
	//   29   59:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
	//   30   62:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   31   63:aload_2         
	//   32   64:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   33   69:ifeq            290
			MapsDataState mapsdatastate = (MapsDataState)((Iterator) (obj)).next();
	//   34   72:aload_2         
	//   35   73:invokeinterface #71  <Method Object Iterator.next()>
	//   36   78:checkcast       #73  <Class MapsDataState>
	//   37   81:astore_3        
			switch(MissionDetailsActivity$4.b[mapsdatastate.ordinal()])
	//*  38   82:getstatic       #78  <Field int[] MissionDetailsActivity$4.b>
	//*  39   85:aload_3         
	//*  40   86:invokevirtual   #82  <Method int MapsDataState.ordinal()>
	//*  41   89:iaload          
			{
	//*  42   90:tableswitch     1 9: default 140
	//	               1 276
	//	               2 241
	//	               3 227
	//	               4 213
	//	               5 199
	//	               6 185
	//	               7 171
	//	               8 157
	//	               9 143
	//*  43  140:goto            63
			case 9: // '\t'
				MissionDetailsActivity.a(a, mapsuiservicedata.getMissionMapZoomState());
	//   44  143:aload_0         
	//   45  144:getfield        #12  <Field MissionDetailsActivity a>
	//   46  147:aload_1         
	//   47  148:invokevirtual   #85  <Method boolean MapsUIServiceData.getMissionMapZoomState()>
	//   48  151:invokestatic    #88  <Method void MissionDetailsActivity.a(MissionDetailsActivity, boolean)>
				break;

	//*  49  154:goto            63
			case 8: // '\b'
				MissionDetailsActivity.a(a, mapsuiservicedata.getPlaybackProgress());
	//   50  157:aload_0         
	//   51  158:getfield        #12  <Field MissionDetailsActivity a>
	//   52  161:aload_1         
	//   53  162:invokevirtual   #92  <Method float MapsUIServiceData.getPlaybackProgress()>
	//   54  165:invokestatic    #95  <Method void MissionDetailsActivity.a(MissionDetailsActivity, float)>
				break;

	//*  55  168:goto            63
			case 7: // '\007'
				MissionDetailsActivity.a(a, mapsuiservicedata.getWifiColorLegend());
	//   56  171:aload_0         
	//   57  172:getfield        #12  <Field MissionDetailsActivity a>
	//   58  175:aload_1         
	//   59  176:invokevirtual   #98  <Method ArrayList MapsUIServiceData.getWifiColorLegend()>
	//   60  179:invokestatic    #101 <Method void MissionDetailsActivity.a(MissionDetailsActivity, ArrayList)>
				break;

	//*  61  182:goto            63
			case 6: // '\006'
				MissionDetailsActivity.a(a, mapsuiservicedata.getWifiBadRegions());
	//   62  185:aload_0         
	//   63  186:getfield        #12  <Field MissionDetailsActivity a>
	//   64  189:aload_1         
	//   65  190:invokevirtual   #104 <Method int MapsUIServiceData.getWifiBadRegions()>
	//   66  193:invokestatic    #107 <Method void MissionDetailsActivity.a(MissionDetailsActivity, int)>
				break;

	//*  67  196:goto            63
			case 5: // '\005'
				MissionDetailsActivity.a(a, mapsuiservicedata.getMissionHistoryDetails());
	//   68  199:aload_0         
	//   69  200:getfield        #12  <Field MissionDetailsActivity a>
	//   70  203:aload_1         
	//   71  204:invokevirtual   #111 <Method com.irobot.core.RobotMissionHistoryItem MapsUIServiceData.getMissionHistoryDetails()>
	//   72  207:invokestatic    #114 <Method void MissionDetailsActivity.a(MissionDetailsActivity, com.irobot.core.RobotMissionHistoryItem)>
				break;

	//*  73  210:goto            63
			case 4: // '\004'
				MissionDetailsActivity.a(a, mapsuiservicedata.getMissionRuntimeChart());
	//   74  213:aload_0         
	//   75  214:getfield        #12  <Field MissionDetailsActivity a>
	//   76  217:aload_1         
	//   77  218:invokevirtual   #118 <Method com.irobot.core.MissionRuntimeEChartEvent MapsUIServiceData.getMissionRuntimeChart()>
	//   78  221:invokestatic    #121 <Method void MissionDetailsActivity.a(MissionDetailsActivity, com.irobot.core.MissionRuntimeEChartEvent)>
				break;

	//*  79  224:goto            63
			case 3: // '\003'
				MissionDetailsActivity.a(a, mapsuiservicedata.getMissionErrorMessage());
	//   80  227:aload_0         
	//   81  228:getfield        #12  <Field MissionDetailsActivity a>
	//   82  231:aload_1         
	//   83  232:invokevirtual   #124 <Method String MapsUIServiceData.getMissionErrorMessage()>
	//   84  235:invokestatic    #127 <Method void MissionDetailsActivity.a(MissionDetailsActivity, String)>
				break;

	//*  85  238:goto            63
			case 2: // '\002'
				if(mapsuiservicedata.getIsMapCustomizationEnabled())
	//*  86  241:aload_1         
	//*  87  242:invokevirtual   #130 <Method boolean MapsUIServiceData.getIsMapCustomizationEnabled()>
	//*  88  245:ifeq            266
					MissionDetailsActivity.a(a, mapsuiservicedata.getPersistentMapName(), mapsuiservicedata.getPersistentMapId());
	//   89  248:aload_0         
	//   90  249:getfield        #12  <Field MissionDetailsActivity a>
	//   91  252:aload_1         
	//   92  253:invokevirtual   #133 <Method String MapsUIServiceData.getPersistentMapName()>
	//   93  256:aload_1         
	//   94  257:invokevirtual   #137 <Method com.irobot.core.PersistentMapIdentifier MapsUIServiceData.getPersistentMapId()>
	//   95  260:invokestatic    #140 <Method void MissionDetailsActivity.a(MissionDetailsActivity, String, com.irobot.core.PersistentMapIdentifier)>
				else
	//*  96  263:goto            63
					MissionDetailsActivity.b(a);
	//   97  266:aload_0         
	//   98  267:getfield        #12  <Field MissionDetailsActivity a>
	//   99  270:invokestatic    #142 <Method void MissionDetailsActivity.b(MissionDetailsActivity)>
				break;

	//* 100  273:goto            63
			case 1: // '\001'
				MissionDetailsActivity.a(a, mapsuiservicedata.getMissionDetailsViewState());
	//  101  276:aload_0         
	//  102  277:getfield        #12  <Field MissionDetailsActivity a>
	//  103  280:aload_1         
	//  104  281:invokevirtual   #146 <Method com.irobot.core.MissionDetailsViewState MapsUIServiceData.getMissionDetailsViewState()>
	//  105  284:invokestatic    #149 <Method void MissionDetailsActivity.a(MissionDetailsActivity, com.irobot.core.MissionDetailsViewState)>
				break;
			}
		} while(true);
	//* 106  287:goto            63
	//  107  290:return          
	}

	final MissionDetailsActivity a;

	private MissionDetailsActivity$a(MissionDetailsActivity missiondetailsactivity)
	{
		a = missiondetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MissionDetailsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void MapsUIServiceDataCallback()>
	//    5    9:return          
	}

	MissionDetailsActivity$a(MissionDetailsActivity missiondetailsactivity, MissionDetailsActivity$1 missiondetailsactivity$1)
	{
		this(missiondetailsactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void MissionDetailsActivity$a(MissionDetailsActivity)>
	//    3    5:return          
	}
}
