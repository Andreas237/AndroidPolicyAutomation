// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

private class MapCustomizationActivity$a extends MapsUIServiceDataCallback
{

	public void onMapsUIServiceDataChanged(MapsUIServiceData mapsuiservicedata)
	{
		if(mapsuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(MapCustomizationActivity.t(), "null service data");
	//    2    4:invokestatic    #25  <Method String MapCustomizationActivity.t()>
	//    3    7:ldc1            #27  <String "null service data">
	//    4    9:invokestatic    #33  <Method void o.e(String, String)>
			return;
	//    5   12:return          
		}
		if(!a.isFinishing())
	//*   6   13:aload_0         
	//*   7   14:getfield        #12  <Field MapCustomizationActivity a>
	//*   8   17:invokevirtual   #37  <Method boolean MapCustomizationActivity.isFinishing()>
	//*   9   20:ifne            369
		{
			if(a.isDestroyed())
	//*  10   23:aload_0         
	//*  11   24:getfield        #12  <Field MapCustomizationActivity a>
	//*  12   27:invokevirtual   #40  <Method boolean MapCustomizationActivity.isDestroyed()>
	//*  13   30:ifeq            34
				return;
	//   14   33:return          
			Object obj = ((Object) (mapsuiservicedata.getMapsViewStates()));
	//   15   34:aload_1         
	//   16   35:invokevirtual   #46  <Method ArrayList MapsUIServiceData.getMapsViewStates()>
	//   17   38:astore_2        
			String s = MapCustomizationActivity.t();
	//   18   39:invokestatic    #25  <Method String MapCustomizationActivity.t()>
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
	//   42   90:ifeq            369
				MapsViewState mapsviewstate = (MapsViewState)((Iterator) (obj)).next();
	//   43   93:aload_2         
	//   44   94:invokeinterface #76  <Method Object Iterator.next()>
	//   45   99:checkcast       #78  <Class MapsViewState>
	//   46  102:astore_3        
				switch(.a[mapsviewstate.ordinal()])
	//*  47  103:getstatic       #83  <Field int[] MapCustomizationActivity$28.a>
	//*  48  106:aload_3         
	//*  49  107:invokevirtual   #87  <Method int MapsViewState.ordinal()>
	//*  50  110:iaload          
				{
	//*  51  111:tableswitch     1 13: default 176
	//	               1 351
	//	               2 341
	//	               3 327
	//	               4 313
	//	               5 299
	//	               6 285
	//	               7 275
	//	               8 257
	//	               9 243
	//	               10 225
	//	               11 207
	//	               12 193
	//	               13 179
	//*  52  176:goto            84
				case 13: // '\r'
					MapCustomizationActivity.b(a, mapsuiservicedata.getMapZoomResetButtonState());
	//   53  179:aload_0         
	//   54  180:getfield        #12  <Field MapCustomizationActivity a>
	//   55  183:aload_1         
	//   56  184:invokevirtual   #90  <Method boolean MapsUIServiceData.getMapZoomResetButtonState()>
	//   57  187:invokestatic    #94  <Method void MapCustomizationActivity.b(MapCustomizationActivity, boolean)>
					break;

	//*  58  190:goto            84
				case 12: // '\f'
					MapCustomizationActivity.a(a, mapsuiservicedata.getViewTitle());
	//   59  193:aload_0         
	//   60  194:getfield        #12  <Field MapCustomizationActivity a>
	//   61  197:aload_1         
	//   62  198:invokevirtual   #98  <Method com.irobot.core.TitleSpecifier MapsUIServiceData.getViewTitle()>
	//   63  201:invokestatic    #101 <Method void MapCustomizationActivity.a(MapCustomizationActivity, com.irobot.core.TitleSpecifier)>
					break;

	//*  64  204:goto            84
				case 11: // '\013'
					MapCustomizationActivity.b(a, mapsuiservicedata.getDebugInfoMapId(), mapsuiservicedata.getDebugInfoVersion());
	//   65  207:aload_0         
	//   66  208:getfield        #12  <Field MapCustomizationActivity a>
	//   67  211:aload_1         
	//   68  212:invokevirtual   #104 <Method String MapsUIServiceData.getDebugInfoMapId()>
	//   69  215:aload_1         
	//   70  216:invokevirtual   #107 <Method String MapsUIServiceData.getDebugInfoVersion()>
	//   71  219:invokestatic    #110 <Method void MapCustomizationActivity.b(MapCustomizationActivity, String, String)>
					break;

	//*  72  222:goto            84
				case 10: // '\n'
					MapCustomizationActivity.a(a, mapsuiservicedata.getUsedRegionName(), mapsuiservicedata.getUsedRegionId());
	//   73  225:aload_0         
	//   74  226:getfield        #12  <Field MapCustomizationActivity a>
	//   75  229:aload_1         
	//   76  230:invokevirtual   #113 <Method String MapsUIServiceData.getUsedRegionName()>
	//   77  233:aload_1         
	//   78  234:invokevirtual   #116 <Method String MapsUIServiceData.getUsedRegionId()>
	//   79  237:invokestatic    #118 <Method void MapCustomizationActivity.a(MapCustomizationActivity, String, String)>
					break;

	//*  80  240:goto            84
				case 9: // '\t'
					MapCustomizationActivity.a(a, mapsuiservicedata.getIsMapDirty());
	//   81  243:aload_0         
	//   82  244:getfield        #12  <Field MapCustomizationActivity a>
	//   83  247:aload_1         
	//   84  248:invokevirtual   #121 <Method boolean MapsUIServiceData.getIsMapDirty()>
	//   85  251:invokestatic    #123 <Method void MapCustomizationActivity.a(MapCustomizationActivity, boolean)>
					break;

	//*  86  254:goto            84
				case 8: // '\b'
					MapCustomizationActivity.a(a, mapsuiservicedata.getUnlabeledRegionCount(), mapsuiservicedata.getTotalRegionCount());
	//   87  257:aload_0         
	//   88  258:getfield        #12  <Field MapCustomizationActivity a>
	//   89  261:aload_1         
	//   90  262:invokevirtual   #126 <Method int MapsUIServiceData.getUnlabeledRegionCount()>
	//   91  265:aload_1         
	//   92  266:invokevirtual   #129 <Method int MapsUIServiceData.getTotalRegionCount()>
	//   93  269:invokestatic    #132 <Method void MapCustomizationActivity.a(MapCustomizationActivity, int, int)>
					break;

	//*  94  272:goto            84
				case 7: // '\007'
					MapCustomizationActivity.b(a);
	//   95  275:aload_0         
	//   96  276:getfield        #12  <Field MapCustomizationActivity a>
	//   97  279:invokestatic    #134 <Method void MapCustomizationActivity.b(MapCustomizationActivity)>
					break;

	//*  98  282:goto            84
				case 6: // '\006'
					MapCustomizationActivity.a(a, mapsuiservicedata.getCustomizedMapName());
	//   99  285:aload_0         
	//  100  286:getfield        #12  <Field MapCustomizationActivity a>
	//  101  289:aload_1         
	//  102  290:invokevirtual   #137 <Method String MapsUIServiceData.getCustomizedMapName()>
	//  103  293:invokestatic    #140 <Method void MapCustomizationActivity.a(MapCustomizationActivity, String)>
					break;

	//* 104  296:goto            84
				case 5: // '\005'
					MapCustomizationActivity.a(a, mapsuiservicedata.getCustomizationErrorMessage());
	//  105  299:aload_0         
	//  106  300:getfield        #12  <Field MapCustomizationActivity a>
	//  107  303:aload_1         
	//  108  304:invokevirtual   #144 <Method com.irobot.core.MapCustomizationErrors MapsUIServiceData.getCustomizationErrorMessage()>
	//  109  307:invokestatic    #147 <Method void MapCustomizationActivity.a(MapCustomizationActivity, com.irobot.core.MapCustomizationErrors)>
					break;

	//* 110  310:goto            84
				case 4: // '\004'
					MapCustomizationActivity.a(a, mapsuiservicedata.getCustomizationOptionsMenu());
	//  111  313:aload_0         
	//  112  314:getfield        #12  <Field MapCustomizationActivity a>
	//  113  317:aload_1         
	//  114  318:invokevirtual   #150 <Method ArrayList MapsUIServiceData.getCustomizationOptionsMenu()>
	//  115  321:invokestatic    #153 <Method void MapCustomizationActivity.a(MapCustomizationActivity, ArrayList)>
					break;

	//* 116  324:goto            84
				case 3: // '\003'
					MapCustomizationActivity.a(a, mapsuiservicedata.getMapCustomizationViewState());
	//  117  327:aload_0         
	//  118  328:getfield        #12  <Field MapCustomizationActivity a>
	//  119  331:aload_1         
	//  120  332:invokevirtual   #157 <Method com.irobot.core.MapCustomizationViewState MapsUIServiceData.getMapCustomizationViewState()>
	//  121  335:invokestatic    #160 <Method void MapCustomizationActivity.a(MapCustomizationActivity, com.irobot.core.MapCustomizationViewState)>
					break;

	//* 122  338:goto            84
				case 2: // '\002'
					MapCustomizationActivity.a(a);
	//  123  341:aload_0         
	//  124  342:getfield        #12  <Field MapCustomizationActivity a>
	//  125  345:invokestatic    #162 <Method void MapCustomizationActivity.a(MapCustomizationActivity)>
					break;

	//* 126  348:goto            84
				case 1: // '\001'
					MapCustomizationActivity.a(a, mapsuiservicedata.getSelectedRegionLabelName(), mapsuiservicedata.getSelectedRegionLabelCount());
	//  127  351:aload_0         
	//  128  352:getfield        #12  <Field MapCustomizationActivity a>
	//  129  355:aload_1         
	//  130  356:invokevirtual   #165 <Method String MapsUIServiceData.getSelectedRegionLabelName()>
	//  131  359:aload_1         
	//  132  360:invokevirtual   #168 <Method int MapsUIServiceData.getSelectedRegionLabelCount()>
	//  133  363:invokestatic    #171 <Method void MapCustomizationActivity.a(MapCustomizationActivity, String, int)>
					break;
				}
			} while(true);
	//  134  366:goto            84
		}
	//  135  369:return          
	}

	final MapCustomizationActivity a;

	private MapCustomizationActivity$a(MapCustomizationActivity mapcustomizationactivity)
	{
		a = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MapCustomizationActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void MapsUIServiceDataCallback()>
	//    5    9:return          
	}

	MapCustomizationActivity$a(MapCustomizationActivity mapcustomizationactivity, MapCustomizationActivity$1 mapcustomizationactivity$1)
	{
		this(mapcustomizationactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void MapCustomizationActivity$a(MapCustomizationActivity)>
	//    3    5:return          
	}
}
