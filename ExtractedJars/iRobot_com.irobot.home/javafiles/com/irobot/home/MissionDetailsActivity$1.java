// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import com.irobot.core.*;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

class MissionDetailsActivity$1
	implements android.support.v4.view.ViewPager.e
{

	public void a(int i)
	{
	//    0    0:return          
	}

	public void a(int i, float f, int j)
	{
	//    0    0:return          
	}

	public void b(int i)
	{
		MissionMapType missionmaptype = (MissionMapType)MissionDetailsActivity.a(a).getMissionMapTypes().get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field MissionDetailsActivity a>
	//    2    4:invokestatic    #24  <Method MapsUIService MissionDetailsActivity.a(MissionDetailsActivity)>
	//    3    7:invokevirtual   #30  <Method ArrayList MapsUIService.getMissionMapTypes()>
	//    4   10:iload_1         
	//    5   11:invokevirtual   #36  <Method Object ArrayList.get(int)>
	//    6   14:checkcast       #38  <Class MissionMapType>
	//    7   17:astore_2        
		Object obj = ((Object) (MapsUIServiceData.create()));
	//    8   18:invokestatic    #44  <Method MapsUIServiceData MapsUIServiceData.create()>
	//    9   21:astore_3        
		((MapsUIServiceData) (obj)).setMissionMapType(missionmaptype);
	//   10   22:aload_3         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #48  <Method void MapsUIServiceData.setMissionMapType(MissionMapType)>
		MissionDetailsActivity.a(a).sendCommand(MapsUIServiceCommand.SetCurrentMapType, ((MapsUIServiceData) (obj)));
	//   13   27:aload_0         
	//   14   28:getfield        #14  <Field MissionDetailsActivity a>
	//   15   31:invokestatic    #24  <Method MapsUIService MissionDetailsActivity.a(MissionDetailsActivity)>
	//   16   34:getstatic       #54  <Field MapsUIServiceCommand MapsUIServiceCommand.SetCurrentMapType>
	//   17   37:aload_3         
	//   18   38:invokevirtual   #58  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		obj = ((Object) (a.N));
	//   19   41:aload_0         
	//   20   42:getfield        #14  <Field MissionDetailsActivity a>
	//   21   45:getfield        #62  <Field FloatingActionButton MissionDetailsActivity.N>
	//   22   48:astore_3        
		if(MissionDetailsActivity.a(a).isMapAtDefaultZoom(missionmaptype))
	//*  23   49:aload_0         
	//*  24   50:getfield        #14  <Field MissionDetailsActivity a>
	//*  25   53:invokestatic    #24  <Method MapsUIService MissionDetailsActivity.a(MissionDetailsActivity)>
	//*  26   56:aload_2         
	//*  27   57:invokevirtual   #66  <Method boolean MapsUIService.isMapAtDefaultZoom(MissionMapType)>
	//*  28   60:ifeq            68
			i = 4;
	//   29   63:iconst_4        
	//   30   64:istore_1        
		else
	//*  31   65:goto            70
			i = 0;
	//   32   68:iconst_0        
	//   33   69:istore_1        
		((FloatingActionButton) (obj)).setVisibility(i);
	//   34   70:aload_3         
	//   35   71:iload_1         
	//   36   72:invokevirtual   #71  <Method void FloatingActionButton.setVisibility(int)>
		switch(MissionDetailsActivity$4.a[missionmaptype.ordinal()])
	//*  37   75:getstatic       #76  <Field int[] MissionDetailsActivity$4.a>
	//*  38   78:aload_2         
	//*  39   79:invokevirtual   #80  <Method int MissionMapType.ordinal()>
	//*  40   82:iaload          
		{
	//*  41   83:tableswitch     1 2: default 104
	//	               1 129
	//	               2 105
		default:
			return;
	//   42  104:return          

		case 2: // '\002'
			a.f.setVisibility(8);
	//   43  105:aload_0         
	//   44  106:getfield        #14  <Field MissionDetailsActivity a>
	//   45  109:getfield        #84  <Field NestedScrollView MissionDetailsActivity.f>
	//   46  112:bipush          8
	//   47  114:invokevirtual   #87  <Method void NestedScrollView.setVisibility(int)>
			a.g.setVisibility(0);
	//   48  117:aload_0         
	//   49  118:getfield        #14  <Field MissionDetailsActivity a>
	//   50  121:getfield        #90  <Field NestedScrollView MissionDetailsActivity.g>
	//   51  124:iconst_0        
	//   52  125:invokevirtual   #87  <Method void NestedScrollView.setVisibility(int)>
			return;
	//   53  128:return          

		case 1: // '\001'
			a.f.setVisibility(0);
	//   54  129:aload_0         
	//   55  130:getfield        #14  <Field MissionDetailsActivity a>
	//   56  133:getfield        #84  <Field NestedScrollView MissionDetailsActivity.f>
	//   57  136:iconst_0        
	//   58  137:invokevirtual   #87  <Method void NestedScrollView.setVisibility(int)>
			a.g.setVisibility(8);
	//   59  140:aload_0         
	//   60  141:getfield        #14  <Field MissionDetailsActivity a>
	//   61  144:getfield        #90  <Field NestedScrollView MissionDetailsActivity.g>
	//   62  147:bipush          8
	//   63  149:invokevirtual   #87  <Method void NestedScrollView.setVisibility(int)>
			return;
	//   64  152:return          
		}
	}

	final MissionDetailsActivity a;

	MissionDetailsActivity$1(MissionDetailsActivity missiondetailsactivity)
	{
		a = missiondetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MissionDetailsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
