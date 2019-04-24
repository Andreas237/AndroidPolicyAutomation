// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.irobot.core.*;
import com.irobot.home.b.l;
import com.irobot.home.b.m;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			a

class a$2$1
	implements com.irobot.home.view.ableView.b
{

	public void a(int i)
	{
		FloorPlanListItem floorplanlistitem = com.irobot.home.a.a(a.a).e(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field a$2 a>
	//    2    4:getfield        #24  <Field a a$2.a>
	//    3    7:invokestatic    #29  <Method l a.a(a)>
	//    4   10:iload_1         
	//    5   11:invokevirtual   #35  <Method FloorPlanListItem l.e(int)>
	//    6   14:astore_2        
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    7   15:invokestatic    #41  <Method MapsUIServiceData MapsUIServiceData.create()>
	//    8   18:astore_3        
		mapsuiservicedata.setFloorPlanListMapId(floorplanlistitem.getMapIdString());
	//    9   19:aload_3         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #47  <Method String FloorPlanListItem.getMapIdString()>
	//   12   24:invokevirtual   #51  <Method void MapsUIServiceData.setFloorPlanListMapId(String)>
		mapsuiservicedata.setFloorPlanListMapVersionId(floorplanlistitem.getMapVersion());
	//   13   27:aload_3         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #54  <Method String FloorPlanListItem.getMapVersion()>
	//   16   32:invokevirtual   #57  <Method void MapsUIServiceData.setFloorPlanListMapVersionId(String)>
		com.irobot.home.a.b(a.a).sendCommand(MapsUIServiceCommand.DeleteFloorPlanListItem, mapsuiservicedata);
	//   17   35:aload_0         
	//   18   36:getfield        #16  <Field a$2 a>
	//   19   39:getfield        #24  <Field a a$2.a>
	//   20   42:invokestatic    #61  <Method MapsUIService a.b(a)>
	//   21   45:getstatic       #67  <Field MapsUIServiceCommand MapsUIServiceCommand.DeleteFloorPlanListItem>
	//   22   48:aload_3         
	//   23   49:invokevirtual   #73  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		com.irobot.home.a.c(a.a).remove(((Object) (floorplanlistitem)));
	//   24   52:aload_0         
	//   25   53:getfield        #16  <Field a$2 a>
	//   26   56:getfield        #24  <Field a a$2.a>
	//   27   59:invokestatic    #77  <Method ArrayList a.c(a)>
	//   28   62:aload_2         
	//   29   63:invokevirtual   #83  <Method boolean ArrayList.remove(Object)>
	//   30   66:pop             
		com.irobot.home.a.a(a.a).a(com.irobot.home.a.c(a.a));
	//   31   67:aload_0         
	//   32   68:getfield        #16  <Field a$2 a>
	//   33   71:getfield        #24  <Field a a$2.a>
	//   34   74:invokestatic    #29  <Method l a.a(a)>
	//   35   77:aload_0         
	//   36   78:getfield        #16  <Field a$2 a>
	//   37   81:getfield        #24  <Field a a$2.a>
	//   38   84:invokestatic    #77  <Method ArrayList a.c(a)>
	//   39   87:invokevirtual   #86  <Method void l.a(ArrayList)>
		com.irobot.home.a.a(a.a).d(i);
	//   40   90:aload_0         
	//   41   91:getfield        #16  <Field a$2 a>
	//   42   94:getfield        #24  <Field a a$2.a>
	//   43   97:invokestatic    #29  <Method l a.a(a)>
	//   44  100:iload_1         
	//   45  101:invokevirtual   #89  <Method void l.d(int)>
	//   46  104:return          
	}

	final a._cls2 a;

	a$2$1(a._cls2 _pcls2)
	{
		a = _pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field a$2 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/irobot/home/a$2

/* anonymous class */
	class a._cls2 extends m
	{

		public void a(android.support.v7.widget.RecyclerView.u u, ArrayList arraylist)
		{
			arraylist.add(((Object) ((new com.irobot.home.view.RevealableView.a(((Context) (a.getActivity())))).a(0x7f0600a1).b(0x7f08012c).a(((com.irobot.home.view.RevealableView.b) (new a._cls2._cls1(this)))).a())));
		//    0    0:aload_2         
		//    1    1:new             #23  <Class com.irobot.home.view.RevealableView$a>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:getfield        #16  <Field a a>
		//    5    9:invokevirtual   #27  <Method android.support.v4.app.FragmentActivity a.getActivity()>
		//    6   12:invokespecial   #30  <Method void com.irobot.home.view.RevealableView$a(Context)>
		//    7   15:ldc1            #31  <Int 0x7f0600a1>
		//    8   17:invokevirtual   #34  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(int)>
		//    9   20:ldc1            #35  <Int 0x7f08012c>
		//   10   22:invokevirtual   #38  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.b(int)>
		//   11   25:new             #11  <Class a$2$1>
		//   12   28:dup             
		//   13   29:aload_0         
		//   14   30:invokespecial   #41  <Method void a$2$1(a$2)>
		//   15   33:invokevirtual   #44  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(com.irobot.home.view.RevealableView$b)>
		//   16   36:invokevirtual   #47  <Method com.irobot.home.view.RevealableView com.irobot.home.view.RevealableView$a.a()>
		//   17   39:invokevirtual   #53  <Method boolean ArrayList.add(Object)>
		//   18   42:pop             
		//   19   43:return          
		}

		final a a;

			
			{
				a = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field a a>
				super(context, recyclerview);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #19  <Method void m(Context, RecyclerView)>
			//    7   11:return          
			}
	}

}
