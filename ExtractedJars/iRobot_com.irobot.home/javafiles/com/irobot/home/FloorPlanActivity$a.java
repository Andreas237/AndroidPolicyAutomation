// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			FloorPlanActivity

private class FloorPlanActivity$a extends MapsUIServiceDataCallback
{

	public void onMapsUIServiceDataChanged(MapsUIServiceData mapsuiservicedata)
	{
		if(mapsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(FloorPlanActivity.g(), "maps service data is null");
	//    2    4:invokestatic    #25  <Method String FloorPlanActivity.g()>
	//    3    7:ldc1            #27  <String "maps service data is null">
	//    4    9:invokestatic    #33  <Method void o.e(String, String)>
			return;
	//    5   12:return          
		}
		if(!a.isFinishing())
	//*   6   13:aload_0         
	//*   7   14:getfield        #12  <Field FloorPlanActivity a>
	//*   8   17:invokevirtual   #37  <Method boolean FloorPlanActivity.isFinishing()>
	//*   9   20:ifne            183
		{
			if(a.isDestroyed())
	//*  10   23:aload_0         
	//*  11   24:getfield        #12  <Field FloorPlanActivity a>
	//*  12   27:invokevirtual   #40  <Method boolean FloorPlanActivity.isDestroyed()>
	//*  13   30:ifeq            34
				return;
	//   14   33:return          
			Object obj = ((Object) (mapsuiservicedata.getMapsViewStates()));
	//   15   34:aload_1         
	//   16   35:invokevirtual   #46  <Method ArrayList MapsUIServiceData.getMapsViewStates()>
	//   17   38:astore_2        
			String s = FloorPlanActivity.g();
	//   18   39:invokestatic    #25  <Method String FloorPlanActivity.g()>
	//   19   42:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   20   43:new             #48  <Class StringBuilder>
	//   21   46:dup             
	//   22   47:invokespecial   #49  <Method void StringBuilder()>
	//   23   50:astore          4
			stringbuilder.append("View states: ");
	//   24   52:aload           4
	//   25   54:ldc1            #51  <String "View states: ">
	//   26   56:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
	//   28   60:aload           4
	//   29   62:aload_2         
	//   30   63:invokevirtual   #60  <Method String ArrayList.toString()>
	//   31   66:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   32   69:pop             
			o.a(s, stringbuilder.toString());
	//   33   70:aload_3         
	//   34   71:aload           4
	//   35   73:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   36   76:invokestatic    #63  <Method void o.a(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   37   79:aload_2         
	//   38   80:invokevirtual   #67  <Method Iterator ArrayList.iterator()>
	//   39   83:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   40   84:aload_2         
	//   41   85:invokeinterface #72  <Method boolean Iterator.hasNext()>
	//   42   90:ifeq            183
				MapsViewState mapsviewstate = (MapsViewState)((Iterator) (obj)).next();
	//   43   93:aload_2         
	//   44   94:invokeinterface #76  <Method Object Iterator.next()>
	//   45   99:checkcast       #78  <Class MapsViewState>
	//   46  102:astore_3        
				switch(FloorPlanActivity$5.b[mapsviewstate.ordinal()])
	//*  47  103:getstatic       #84  <Field int[] FloorPlanActivity$5.b>
	//*  48  106:aload_3         
	//*  49  107:invokevirtual   #88  <Method int MapsViewState.ordinal()>
	//*  50  110:iaload          
				{
	//*  51  111:tableswitch     1 2: default 132
	//	               1 161
	//	               2 135
	//*  52  132:goto            84
				case 2: // '\002'
					FloorPlanActivity.a(a, mapsuiservicedata.getErrorReason(), mapsuiservicedata.getErrorSource(), mapsuiservicedata.getLocalizedErrorMessageKey(), mapsuiservicedata.getNonLocalizedErrorMessage());
	//   53  135:aload_0         
	//   54  136:getfield        #12  <Field FloorPlanActivity a>
	//   55  139:aload_1         
	//   56  140:invokevirtual   #92  <Method com.irobot.core.ErrorReason MapsUIServiceData.getErrorReason()>
	//   57  143:aload_1         
	//   58  144:invokevirtual   #96  <Method com.irobot.core.ErrorSource MapsUIServiceData.getErrorSource()>
	//   59  147:aload_1         
	//   60  148:invokevirtual   #99  <Method String MapsUIServiceData.getLocalizedErrorMessageKey()>
	//   61  151:aload_1         
	//   62  152:invokevirtual   #102 <Method String MapsUIServiceData.getNonLocalizedErrorMessage()>
	//   63  155:invokestatic    #105 <Method void FloorPlanActivity.a(FloorPlanActivity, com.irobot.core.ErrorReason, com.irobot.core.ErrorSource, String, String)>
					break;

	//*  64  158:goto            84
				case 1: // '\001'
					FloorPlanActivity.a(a, mapsuiservicedata.getFloorPlanMapsDestination(), mapsuiservicedata.getFloorPlanMapsId(), mapsuiservicedata.getFloorPlanItem());
	//   65  161:aload_0         
	//   66  162:getfield        #12  <Field FloorPlanActivity a>
	//   67  165:aload_1         
	//   68  166:invokevirtual   #109 <Method com.irobot.core.PersistentMapsDestination MapsUIServiceData.getFloorPlanMapsDestination()>
	//   69  169:aload_1         
	//   70  170:invokevirtual   #113 <Method com.irobot.core.PersistentMapIdentifier MapsUIServiceData.getFloorPlanMapsId()>
	//   71  173:aload_1         
	//   72  174:invokevirtual   #117 <Method com.irobot.core.FloorPlanListItem MapsUIServiceData.getFloorPlanItem()>
	//   73  177:invokestatic    #120 <Method void FloorPlanActivity.a(FloorPlanActivity, com.irobot.core.PersistentMapsDestination, com.irobot.core.PersistentMapIdentifier, com.irobot.core.FloorPlanListItem)>
					break;
				}
			} while(true);
	//   74  180:goto            84
		}
	//   75  183:return          
	}

	final FloorPlanActivity a;

	private FloorPlanActivity$a(FloorPlanActivity floorplanactivity)
	{
		a = floorplanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field FloorPlanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void MapsUIServiceDataCallback()>
	//    5    9:return          
	}

	FloorPlanActivity$a(FloorPlanActivity floorplanactivity, FloorPlanActivity$1 floorplanactivity$1)
	{
		this(floorplanactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void FloorPlanActivity$a(FloorPlanActivity)>
	//    3    5:return          
	}
}
