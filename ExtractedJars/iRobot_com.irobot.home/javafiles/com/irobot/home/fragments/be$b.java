// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import com.irobot.home.view.HideableView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			be

private class be$b extends MapsUIServiceDataCallback
{

	public void onMapsUIServiceDataChanged(MapsUIServiceData mapsuiservicedata)
	{
		if(mapsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			o.e("RobotCleanFragment", "maps service data is null");
	//    2    4:ldc1            #24  <String "RobotCleanFragment">
	//    3    6:ldc1            #26  <String "maps service data is null">
	//    4    8:invokestatic    #32  <Method void o.e(String, String)>
			return;
	//    5   11:return          
		}
		if(!a.isAdded())
	//*   6   12:aload_0         
	//*   7   13:getfield        #13  <Field be a>
	//*   8   16:invokevirtual   #36  <Method boolean be.isAdded()>
	//*   9   19:ifne            23
			return;
	//   10   22:return          
		Object obj = ((Object) (mapsuiservicedata.getMapsViewStates()));
	//   11   23:aload_1         
	//   12   24:invokevirtual   #42  <Method ArrayList MapsUIServiceData.getMapsViewStates()>
	//   13   27:astore_3        
		Object obj1 = ((Object) (new StringBuilder()));
	//   14   28:new             #44  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #45  <Method void StringBuilder()>
	//   17   35:astore          4
		((StringBuilder) (obj1)).append("View states: ");
	//   18   37:aload           4
	//   19   39:ldc1            #47  <String "View states: ">
	//   20   41:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		((StringBuilder) (obj1)).append(((ArrayList) (obj)).toString());
	//   22   45:aload           4
	//   23   47:aload_3         
	//   24   48:invokevirtual   #57  <Method String ArrayList.toString()>
	//   25   51:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
		o.a("RobotCleanFragment", ((StringBuilder) (obj1)).toString());
	//   27   55:ldc1            #24  <String "RobotCleanFragment">
	//   28   57:aload           4
	//   29   59:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   30   62:invokestatic    #60  <Method void o.a(String, String)>
		obj1 = ((Object) (((ArrayList) (obj)).iterator()));
	//   31   65:aload_3         
	//   32   66:invokevirtual   #64  <Method Iterator ArrayList.iterator()>
	//   33   69:astore          4
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   34   71:aload           4
	//   35   73:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   36   78:ifeq            246
			obj = ((Object) ((MapsViewState)((Iterator) (obj1)).next()));
	//   37   81:aload           4
	//   38   83:invokeinterface #73  <Method Object Iterator.next()>
	//   39   88:checkcast       #75  <Class MapsViewState>
	//   40   91:astore_3        
			switch(be$5.i[((MapsViewState) (obj)).ordinal()])
	//*  41   92:getstatic       #81  <Field int[] be$5.i>
	//*  42   95:aload_3         
	//*  43   96:invokevirtual   #85  <Method int MapsViewState.ordinal()>
	//*  44   99:iaload          
			{
			default:
				break;

	//*  45  100:tableswitch     1 3: default 128
	//	               1 216
	//	               2 141
	//	               3 131
	//*  46  128:goto            71
			case 3: // '\003'
				be.e(a);
	//   47  131:aload_0         
	//   48  132:getfield        #13  <Field be a>
	//   49  135:invokestatic    #87  <Method void be.e(be)>
				continue;
	//   50  138:goto            71

			case 2: // '\002'
				BooleanValueType booleanvaluetype = mapsuiservicedata.getFloorPlanBooleanValueType();
	//   51  141:aload_1         
	//   52  142:invokevirtual   #91  <Method BooleanValueType MapsUIServiceData.getFloorPlanBooleanValueType()>
	//   53  145:astore          5
				boolean flag = mapsuiservicedata.getFloorPlanBooleanValue();
	//   54  147:aload_1         
	//   55  148:invokevirtual   #94  <Method boolean MapsUIServiceData.getFloorPlanBooleanValue()>
	//   56  151:istore_2        
				if(booleanvaluetype == BooleanValueType.Loading)
	//*  57  152:aload           5
	//*  58  154:getstatic       #100 <Field BooleanValueType BooleanValueType.Loading>
	//*  59  157:if_acmpne       178
					obj = ((Object) (a.Z));
	//   60  160:aload_0         
	//   61  161:getfield        #13  <Field be a>
	//   62  164:getfield        #104 <Field HideableView be.Z>
	//   63  167:astore_3        
				else
	//*  64  168:aload_3         
	//*  65  169:iload_2         
	//*  66  170:aload           5
	//*  67  172:invokevirtual   #109 <Method void HideableView.a(boolean, BooleanValueType)>
	//*  68  175:goto            71
				if(booleanvaluetype == BooleanValueType.LearningPercentageRing)
	//*  69  178:aload           5
	//*  70  180:getstatic       #112 <Field BooleanValueType BooleanValueType.LearningPercentageRing>
	//*  71  183:if_acmpne       197
				{
					obj = ((Object) (a.W));
	//   72  186:aload_0         
	//   73  187:getfield        #13  <Field be a>
	//   74  190:getfield        #115 <Field HideableView be.W>
	//   75  193:astore_3        
				} else
	//*  76  194:goto            168
				{
					if(booleanvaluetype != BooleanValueType.ChooseRoomSelection)
						continue;
	//   77  197:aload           5
	//   78  199:getstatic       #118 <Field BooleanValueType BooleanValueType.ChooseRoomSelection>
	//   79  202:if_acmpne       71
					obj = ((Object) (a.X));
	//   80  205:aload_0         
	//   81  206:getfield        #13  <Field be a>
	//   82  209:getfield        #121 <Field HideableView be.X>
	//   83  212:astore_3        
				}
				((HideableView) (obj)).a(flag, booleanvaluetype);
				continue;

	//*  84  213:goto            168
			case 1: // '\001'
				be.a(a, mapsuiservicedata.getFloorPlanListItems(), mapsuiservicedata.getFloorPlanListItemIndex(), mapsuiservicedata.getHighestLearningPercentage(), mapsuiservicedata.getMapReadyForSetup(), mapsuiservicedata.getMapCompleted());
	//   85  216:aload_0         
	//   86  217:getfield        #13  <Field be a>
	//   87  220:aload_1         
	//   88  221:invokevirtual   #124 <Method ArrayList MapsUIServiceData.getFloorPlanListItems()>
	//   89  224:aload_1         
	//   90  225:invokevirtual   #127 <Method int MapsUIServiceData.getFloorPlanListItemIndex()>
	//   91  228:aload_1         
	//   92  229:invokevirtual   #130 <Method int MapsUIServiceData.getHighestLearningPercentage()>
	//   93  232:aload_1         
	//   94  233:invokevirtual   #133 <Method boolean MapsUIServiceData.getMapReadyForSetup()>
	//   95  236:aload_1         
	//   96  237:invokevirtual   #136 <Method boolean MapsUIServiceData.getMapCompleted()>
	//   97  240:invokestatic    #139 <Method void be.a(be, ArrayList, int, int, boolean, boolean)>
				break;
			}
		} while(true);
	//   98  243:goto            71
		obj = ((Object) (mapsuiservicedata.getMapsDataStates()));
	//   99  246:aload_1         
	//  100  247:invokevirtual   #142 <Method ArrayList MapsUIServiceData.getMapsDataStates()>
	//  101  250:astore_3        
		obj1 = ((Object) (new StringBuilder()));
	//  102  251:new             #44  <Class StringBuilder>
	//  103  254:dup             
	//  104  255:invokespecial   #45  <Method void StringBuilder()>
	//  105  258:astore          4
		((StringBuilder) (obj1)).append("Data states: ");
	//  106  260:aload           4
	//  107  262:ldc1            #144 <String "Data states: ">
	//  108  264:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  109  267:pop             
		((StringBuilder) (obj1)).append(((ArrayList) (obj)).toString());
	//  110  268:aload           4
	//  111  270:aload_3         
	//  112  271:invokevirtual   #57  <Method String ArrayList.toString()>
	//  113  274:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  114  277:pop             
		o.a("RobotCleanFragment", ((StringBuilder) (obj1)).toString());
	//  115  278:ldc1            #24  <String "RobotCleanFragment">
	//  116  280:aload           4
	//  117  282:invokevirtual   #58  <Method String StringBuilder.toString()>
	//  118  285:invokestatic    #60  <Method void o.a(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//  119  288:aload_3         
	//  120  289:invokevirtual   #64  <Method Iterator ArrayList.iterator()>
	//  121  292:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//  122  293:aload_3         
	//  123  294:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//  124  299:ifeq            345
			MapsDataState mapsdatastate = (MapsDataState)((Iterator) (obj)).next();
	//  125  302:aload_3         
	//  126  303:invokeinterface #73  <Method Object Iterator.next()>
	//  127  308:checkcast       #146 <Class MapsDataState>
	//  128  311:astore          4
			if(be$5.j[mapsdatastate.ordinal()] == 1)
	//* 129  313:getstatic       #149 <Field int[] be$5.j>
	//* 130  316:aload           4
	//* 131  318:invokevirtual   #150 <Method int MapsDataState.ordinal()>
	//* 132  321:iaload          
	//* 133  322:iconst_1        
	//* 134  323:icmpeq          329
	//* 135  326:goto            293
			{
				boolean flag1 = mapsuiservicedata.getMapReadyForSetup();
	//  136  329:aload_1         
	//  137  330:invokevirtual   #133 <Method boolean MapsUIServiceData.getMapReadyForSetup()>
	//  138  333:istore_2        
				a.g(flag1);
	//  139  334:aload_0         
	//  140  335:getfield        #13  <Field be a>
	//  141  338:iload_2         
	//  142  339:invokevirtual   #154 <Method void be.g(boolean)>
			}
		} while(true);
	//  143  342:goto            293
	//  144  345:return          
	}

	final be a;

	private be$b(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void MapsUIServiceDataCallback()>
	//    5    9:return          
	}

	be$b(be be1, be$1 be$1)
	{
		this(be1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void be$b(be)>
	//    3    5:return          
	}
}
