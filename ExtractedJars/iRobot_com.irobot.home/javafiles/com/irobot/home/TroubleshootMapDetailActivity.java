// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomVideoView;

// Referenced classes of package com.irobot.home:
//			BaseToolbarFragmentActivity, IRobotApplication, TrainRobotActivity_, FloorPlanActivity_

public class TroubleshootMapDetailActivity extends BaseToolbarFragmentActivity
{

	public TroubleshootMapDetailActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void BaseToolbarFragmentActivity()>
		j = 0x7f0f090a;
	//    2    4:aload_0         
	//    3    5:ldc1            #52  <Int 0x7f0f090a>
	//    4    7:putfield        #54  <Field int j>
	//    5   10:return          
	}

	static MapsUIService a(TroubleshootMapDetailActivity troubleshootmapdetailactivity)
	{
		return troubleshootmapdetailactivity.p;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field MapsUIService p>
	//    2    4:areturn         
	}

	static MissionSubsystem b(TroubleshootMapDetailActivity troubleshootmapdetailactivity)
	{
		return troubleshootmapdetailactivity.o;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field MissionSubsystem o>
	//    2    4:areturn         
	}

	static String h()
	{
		return n;
	//    0    0:getstatic       #47  <Field String n>
	//    1    3:areturn         
	}

	protected void e()
	{
		a(j, ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field int j>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #64  <Method void a(int, java.util.ArrayList)>
		a(true, 0);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #67  <Method void a(boolean, int)>
		a(true);
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:invokevirtual   #70  <Method void a(boolean)>
	//   12   20:return          
	}

	protected void f()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method void finish()>
	//    2    4:return          
	}

	public void g()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//    0    0:invokestatic    #76  <Method a j.j()>
	//    1    3:invokevirtual   #81  <Method AssetInfo a.a()>
	//    2    6:astore_3        
		boolean flag;
		if(AssetCapabilityUtils.isCloudCapable(assetinfo) && AssetCapabilityUtils.isMoppingRobot(assetinfo))
	//*   3    7:aload_3         
	//*   4    8:invokestatic    #87  <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*   5   11:ifeq            26
	//*   6   14:aload_3         
	//*   7   15:invokestatic    #90  <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*   8   18:ifeq            26
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_2        
		else
	//*  11   23:goto            28
			flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_2        
		p = Assembler.getInstance().getMapsUIService(assetinfo.getAssetId());
	//   14   28:aload_0         
	//   15   29:invokestatic    #96  <Method Assembler Assembler.getInstance()>
	//   16   32:aload_3         
	//   17   33:invokevirtual   #102 <Method AssetId AssetInfo.getAssetId()>
	//   18   36:invokevirtual   #106 <Method MapsUIService Assembler.getMapsUIService(AssetId)>
	//   19   39:putfield        #57  <Field MapsUIService p>
		o = Assembler.getInstance().getMissionSubsystem(assetinfo.getAssetId());
	//   20   42:aload_0         
	//   21   43:invokestatic    #96  <Method Assembler Assembler.getInstance()>
	//   22   46:aload_3         
	//   23   47:invokevirtual   #102 <Method AssetId AssetInfo.getAssetId()>
	//   24   50:invokevirtual   #110 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//   25   53:putfield        #60  <Field MissionSubsystem o>
		Button button = g;
	//   26   56:aload_0         
	//   27   57:getfield        #112 <Field Button g>
	//   28   60:astore          4
		int i1;
		if(flag)
	//*  29   62:iload_2         
	//*  30   63:ifeq            72
			i1 = 0x7f0f0062;
	//   31   66:ldc1            #113 <Int 0x7f0f0062>
	//   32   68:istore_1        
		else
	//*  33   69:goto            75
			i1 = 0x7f0f0868;
	//   34   72:ldc1            #114 <Int 0x7f0f0868>
	//   35   74:istore_1        
		button.setText(i1);
	//   36   75:aload           4
	//   37   77:iload_1         
	//   38   78:invokevirtual   #120 <Method void Button.setText(int)>
		switch(k)
	//*  39   81:aload_0         
	//*  40   82:getfield        #122 <Field int k>
		{
	//*  41   85:tableswitch     0 2: default 112
	//	               0 262
	//	               1 172
	//	               2 121
		default:
			com.irobot.home.util.o.d(n, "Unexpected help type. Showing empty screen.");
	//   42  112:getstatic       #47  <Field String n>
	//   43  115:ldc1            #124 <String "Unexpected help type. Showing empty screen.">
	//   44  117:invokestatic    #130 <Method void o.d(String, String)>
			return;
	//   45  120:return          

		case 2: // '\002'
			b.setText(((CharSequence) (getString(l, new Object[] {
				assetinfo.getName()
			}))));
	//   46  121:aload_0         
	//   47  122:getfield        #132 <Field TextView b>
	//   48  125:aload_0         
	//   49  126:aload_0         
	//   50  127:getfield        #134 <Field int l>
	//   51  130:iconst_1        
	//   52  131:anewarray       Object[]
	//   53  134:dup             
	//   54  135:iconst_0        
	//   55  136:aload_3         
	//   56  137:invokevirtual   #139 <Method String AssetInfo.getName()>
	//   57  140:aastore         
	//   58  141:invokevirtual   #143 <Method String getString(int, Object[])>
	//   59  144:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
			h.setVisibility(0);
	//   60  147:aload_0         
	//   61  148:getfield        #150 <Field Button h>
	//   62  151:iconst_0        
	//   63  152:invokevirtual   #153 <Method void Button.setVisibility(int)>
			h.setOnClickListener(new android.view.View.OnClickListener(assetinfo) {

				public void onClick(View view)
				{
					com.irobot.home.util.o.b(TroubleshootMapDetailActivity.h(), "Attempt to archive map.");
				//    0    0:invokestatic    #30  <Method String TroubleshootMapDetailActivity.h()>
				//    1    3:ldc1            #32  <String "Attempt to archive map.">
				//    2    5:invokestatic    #37  <Method void o.b(String, String)>
					b.i.a(((com.irobot.core.PersistentMapIdentifier) (null)));
				//    3    8:aload_0         
				//    4    9:getfield        #19  <Field TroubleshootMapDetailActivity b>
				//    5   12:getfield        #41  <Field IRobotApplication TroubleshootMapDetailActivity.i>
				//    6   15:aconst_null     
				//    7   16:invokevirtual   #46  <Method void com.irobot.home.IRobotApplication.a(com.irobot.core.PersistentMapIdentifier)>
					com.irobot.home.TroubleshootMapDetailActivity.a(b).sendCommand(MapsUIServiceCommand.ArchiveMap, ((MapsUIServiceData) (null)));
				//    8   19:aload_0         
				//    9   20:getfield        #19  <Field TroubleshootMapDetailActivity b>
				//   10   23:invokestatic    #49  <Method MapsUIService com.irobot.home.TroubleshootMapDetailActivity.a(TroubleshootMapDetailActivity)>
				//   11   26:getstatic       #55  <Field MapsUIServiceCommand MapsUIServiceCommand.ArchiveMap>
				//   12   29:aconst_null     
				//   13   30:invokevirtual   #61  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
					AnalyticsSubsystem.getInstance().trackPMapTroubleshootWrongDeleteButtonPressed(com.irobot.home.util.j.j().a());
				//   14   33:invokestatic    #67  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
				//   15   36:invokestatic    #73  <Method a j.j()>
				//   16   39:invokevirtual   #78  <Method AssetInfo a.a()>
				//   17   42:invokevirtual   #82  <Method void AnalyticsSubsystem.trackPMapTroubleshootWrongDeleteButtonPressed(AssetInfo)>
					((FloorPlanActivity_.a)com.irobot.home.FloorPlanActivity_.a(((android.content.Context) (b))).a(a.getAssetId().getId()).g(0x4000000)).a();
				//   18   45:aload_0         
				//   19   46:getfield        #19  <Field TroubleshootMapDetailActivity b>
				//   20   49:invokestatic    #87  <Method FloorPlanActivity_$a com.irobot.home.FloorPlanActivity_.a(android.content.Context)>
				//   21   52:aload_0         
				//   22   53:getfield        #21  <Field AssetInfo a>
				//   23   56:invokevirtual   #93  <Method AssetId AssetInfo.getAssetId()>
				//   24   59:invokevirtual   #98  <Method String AssetId.getId()>
				//   25   62:invokevirtual   #103 <Method FloorPlanActivity_$a com.irobot.home.FloorPlanActivity_$a.a(String)>
				//   26   65:ldc1            #104 <Int 0x4000000>
				//   27   67:invokevirtual   #107 <Method org.androidannotations.api.a.d FloorPlanActivity_$a.g(int)>
				//   28   70:checkcast       #100 <Class FloorPlanActivity_$a>
				//   29   73:invokevirtual   #110 <Method org.androidannotations.api.a.e com.irobot.home.FloorPlanActivity_$a.a()>
				//   30   76:pop             
				//   31   77:return          
				}

				final AssetInfo a;
				final TroubleshootMapDetailActivity b;

			
			{
				b = TroubleshootMapDetailActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TroubleshootMapDetailActivity b>
				a = assetinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AssetInfo a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   64  155:aload_0         
	//   65  156:getfield        #150 <Field Button h>
	//   66  159:new             #10  <Class TroubleshootMapDetailActivity$3>
	//   67  162:dup             
	//   68  163:aload_0         
	//   69  164:aload_3         
	//   70  165:invokespecial   #156 <Method void TroubleshootMapDetailActivity$3(TroubleshootMapDetailActivity, AssetInfo)>
	//   71  168:invokevirtual   #160 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   72  171:return          

		case 1: // '\001'
			b.setText(((CharSequence) (getString(l, new Object[] {
				assetinfo.getName()
			}))));
	//   73  172:aload_0         
	//   74  173:getfield        #132 <Field TextView b>
	//   75  176:aload_0         
	//   76  177:aload_0         
	//   77  178:getfield        #134 <Field int l>
	//   78  181:iconst_1        
	//   79  182:anewarray       Object[]
	//   80  185:dup             
	//   81  186:iconst_0        
	//   82  187:aload_3         
	//   83  188:invokevirtual   #139 <Method String AssetInfo.getName()>
	//   84  191:aastore         
	//   85  192:invokevirtual   #143 <Method String getString(int, Object[])>
	//   86  195:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
			if(flag)
	//*  87  198:iload_2         
	//*  88  199:ifeq            214
			{
				f.setVisibility(8);
	//   89  202:aload_0         
	//   90  203:getfield        #162 <Field Button f>
	//   91  206:bipush          8
	//   92  208:invokevirtual   #153 <Method void Button.setVisibility(int)>
			} else
	//*  93  211:goto            237
			{
				f.setVisibility(0);
	//   94  214:aload_0         
	//   95  215:getfield        #162 <Field Button f>
	//   96  218:iconst_0        
	//   97  219:invokevirtual   #153 <Method void Button.setVisibility(int)>
				f.setOnClickListener(new android.view.View.OnClickListener() {

					public void onClick(View view)
					{
						com.irobot.home.util.o.b(TroubleshootMapDetailActivity.h(), "Attempt to start a new cleaning mission.");
					//    0    0:invokestatic    #26  <Method String TroubleshootMapDetailActivity.h()>
					//    1    3:ldc1            #28  <String "Attempt to start a new cleaning mission.">
					//    2    5:invokestatic    #34  <Method void o.b(String, String)>
						if(a.m == 100)
					//*   3    8:aload_0         
					//*   4    9:getfield        #17  <Field TroubleshootMapDetailActivity a>
					//*   5   12:getfield        #38  <Field int TroubleshootMapDetailActivity.m>
					//*   6   15:bipush          100
					//*   7   17:icmpne          74
						{
							AnalyticsSubsystem.getInstance().trackPMapTroubleshootIncompleteCleanButtonPressed(com.irobot.home.util.j.j().a());
					//    8   20:invokestatic    #44  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
					//    9   23:invokestatic    #50  <Method a j.j()>
					//   10   26:invokevirtual   #55  <Method AssetInfo a.a()>
					//   11   29:invokevirtual   #59  <Method void AnalyticsSubsystem.trackPMapTroubleshootIncompleteCleanButtonPressed(AssetInfo)>
							view = ((View) (MapsUIServiceData.create()));
					//   12   32:invokestatic    #65  <Method MapsUIServiceData MapsUIServiceData.create()>
					//   13   35:astore_1        
							((MapsUIServiceData) (view)).setRunActionCommandType(CommandType.START);
					//   14   36:aload_1         
					//   15   37:getstatic       #71  <Field CommandType CommandType.START>
					//   16   40:invokevirtual   #75  <Method void MapsUIServiceData.setRunActionCommandType(CommandType)>
							((MapsUIServiceData) (view)).setRunActionMapId(a.i.f());
					//   17   43:aload_1         
					//   18   44:aload_0         
					//   19   45:getfield        #17  <Field TroubleshootMapDetailActivity a>
					//   20   48:getfield        #79  <Field IRobotApplication TroubleshootMapDetailActivity.i>
					//   21   51:invokevirtual   #85  <Method com.irobot.core.PersistentMapIdentifier IRobotApplication.f()>
					//   22   54:invokevirtual   #89  <Method void MapsUIServiceData.setRunActionMapId(com.irobot.core.PersistentMapIdentifier)>
							com.irobot.home.TroubleshootMapDetailActivity.a(a).sendCommand(MapsUIServiceCommand.StartOneMoreRunAction, ((MapsUIServiceData) (view)));
					//   23   57:aload_0         
					//   24   58:getfield        #17  <Field TroubleshootMapDetailActivity a>
					//   25   61:invokestatic    #92  <Method MapsUIService com.irobot.home.TroubleshootMapDetailActivity.a(TroubleshootMapDetailActivity)>
					//   26   64:getstatic       #98  <Field MapsUIServiceCommand MapsUIServiceCommand.StartOneMoreRunAction>
					//   27   67:aload_1         
					//   28   68:invokevirtual   #104 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
						} else
					//*  29   71:goto            99
						{
							AnalyticsSubsystem.getInstance().trackPMapTroubleshootIncompleteCleanButtonPressed(com.irobot.home.util.j.j().a());
					//   30   74:invokestatic    #44  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
					//   31   77:invokestatic    #50  <Method a j.j()>
					//   32   80:invokevirtual   #55  <Method AssetInfo a.a()>
					//   33   83:invokevirtual   #59  <Method void AnalyticsSubsystem.trackPMapTroubleshootIncompleteCleanButtonPressed(AssetInfo)>
							TroubleshootMapDetailActivity.b(a).sendCommand(CommandType.START);
					//   34   86:aload_0         
					//   35   87:getfield        #17  <Field TroubleshootMapDetailActivity a>
					//   36   90:invokestatic    #107 <Method MissionSubsystem TroubleshootMapDetailActivity.b(TroubleshootMapDetailActivity)>
					//   37   93:getstatic       #71  <Field CommandType CommandType.START>
					//   38   96:invokevirtual   #111 <Method void MissionSubsystem.sendCommand(CommandType)>
						}
						com.irobot.home.util.j.a(((android.app.Activity) (a)));
					//   39   99:aload_0         
					//   40  100:getfield        #17  <Field TroubleshootMapDetailActivity a>
					//   41  103:invokestatic    #114 <Method void j.a(android.app.Activity)>
					//   42  106:return          
					}

					final TroubleshootMapDetailActivity a;

			
			{
				a = TroubleshootMapDetailActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TroubleshootMapDetailActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   98  222:aload_0         
	//   99  223:getfield        #162 <Field Button f>
	//  100  226:new             #6   <Class TroubleshootMapDetailActivity$1>
	//  101  229:dup             
	//  102  230:aload_0         
	//  103  231:invokespecial   #165 <Method void TroubleshootMapDetailActivity$1(TroubleshootMapDetailActivity)>
	//  104  234:invokevirtual   #160 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			}
			g.setVisibility(0);
	//  105  237:aload_0         
	//  106  238:getfield        #112 <Field Button g>
	//  107  241:iconst_0        
	//  108  242:invokevirtual   #153 <Method void Button.setVisibility(int)>
			g.setOnClickListener(new android.view.View.OnClickListener(flag) {

				public void onClick(View view)
				{
					com.irobot.home.util.o.b(TroubleshootMapDetailActivity.h(), "Attempt to start a new training mission.");
				//    0    0:invokestatic    #30  <Method String TroubleshootMapDetailActivity.h()>
				//    1    3:ldc1            #32  <String "Attempt to start a new training mission.">
				//    2    5:invokestatic    #37  <Method void o.b(String, String)>
					if(!a)
				//*   3    8:aload_0         
				//*   4    9:getfield        #21  <Field boolean a>
				//*   5   12:ifne            114
					{
						if(b.m == 100)
				//*   6   15:aload_0         
				//*   7   16:getfield        #19  <Field TroubleshootMapDetailActivity b>
				//*   8   19:getfield        #41  <Field int TroubleshootMapDetailActivity.m>
				//*   9   22:bipush          100
				//*  10   24:icmpne          81
						{
							AnalyticsSubsystem.getInstance().trackPMapTroubleshootIncompleteTrainButtonPressed(com.irobot.home.util.j.j().a());
				//   11   27:invokestatic    #47  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
				//   12   30:invokestatic    #53  <Method a j.j()>
				//   13   33:invokevirtual   #58  <Method AssetInfo a.a()>
				//   14   36:invokevirtual   #62  <Method void AnalyticsSubsystem.trackPMapTroubleshootIncompleteTrainButtonPressed(AssetInfo)>
							view = ((View) (MapsUIServiceData.create()));
				//   15   39:invokestatic    #68  <Method MapsUIServiceData MapsUIServiceData.create()>
				//   16   42:astore_1        
							((MapsUIServiceData) (view)).setRunActionCommandType(CommandType.TRAIN);
				//   17   43:aload_1         
				//   18   44:getstatic       #74  <Field CommandType CommandType.TRAIN>
				//   19   47:invokevirtual   #78  <Method void MapsUIServiceData.setRunActionCommandType(CommandType)>
							((MapsUIServiceData) (view)).setRunActionMapId(b.i.f());
				//   20   50:aload_1         
				//   21   51:aload_0         
				//   22   52:getfield        #19  <Field TroubleshootMapDetailActivity b>
				//   23   55:getfield        #82  <Field IRobotApplication TroubleshootMapDetailActivity.i>
				//   24   58:invokevirtual   #88  <Method com.irobot.core.PersistentMapIdentifier IRobotApplication.f()>
				//   25   61:invokevirtual   #92  <Method void MapsUIServiceData.setRunActionMapId(com.irobot.core.PersistentMapIdentifier)>
							com.irobot.home.TroubleshootMapDetailActivity.a(b).sendCommand(MapsUIServiceCommand.StartOneMoreRunAction, ((MapsUIServiceData) (view)));
				//   26   64:aload_0         
				//   27   65:getfield        #19  <Field TroubleshootMapDetailActivity b>
				//   28   68:invokestatic    #95  <Method MapsUIService com.irobot.home.TroubleshootMapDetailActivity.a(TroubleshootMapDetailActivity)>
				//   29   71:getstatic       #101 <Field MapsUIServiceCommand MapsUIServiceCommand.StartOneMoreRunAction>
				//   30   74:aload_1         
				//   31   75:invokevirtual   #107 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
						} else
				//*  32   78:goto            106
						{
							AnalyticsSubsystem.getInstance().trackPMapTroubleshootIncompleteTrainButtonPressed(com.irobot.home.util.j.j().a());
				//   33   81:invokestatic    #47  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
				//   34   84:invokestatic    #53  <Method a j.j()>
				//   35   87:invokevirtual   #58  <Method AssetInfo a.a()>
				//   36   90:invokevirtual   #62  <Method void AnalyticsSubsystem.trackPMapTroubleshootIncompleteTrainButtonPressed(AssetInfo)>
							TroubleshootMapDetailActivity.b(b).sendCommand(CommandType.TRAIN);
				//   37   93:aload_0         
				//   38   94:getfield        #19  <Field TroubleshootMapDetailActivity b>
				//   39   97:invokestatic    #110 <Method MissionSubsystem TroubleshootMapDetailActivity.b(TroubleshootMapDetailActivity)>
				//   40  100:getstatic       #74  <Field CommandType CommandType.TRAIN>
				//   41  103:invokevirtual   #114 <Method void MissionSubsystem.sendCommand(CommandType)>
						}
						com.irobot.home.util.j.a(((android.app.Activity) (b)));
				//   42  106:aload_0         
				//   43  107:getfield        #19  <Field TroubleshootMapDetailActivity b>
				//   44  110:invokestatic    #117 <Method void j.a(android.app.Activity)>
						return;
				//   45  113:return          
					} else
					{
						com.irobot.home.TrainRobotActivity_.a(((android.content.Context) (b))).a(true).a();
				//   46  114:aload_0         
				//   47  115:getfield        #19  <Field TroubleshootMapDetailActivity b>
				//   48  118:invokestatic    #122 <Method TrainRobotActivity_$a com.irobot.home.TrainRobotActivity_.a(android.content.Context)>
				//   49  121:iconst_1        
				//   50  122:invokevirtual   #127 <Method TrainRobotActivity_$a com.irobot.home.TrainRobotActivity_$a.a(boolean)>
				//   51  125:invokevirtual   #130 <Method org.androidannotations.api.a.e com.irobot.home.TrainRobotActivity_$a.a()>
				//   52  128:pop             
						return;
				//   53  129:return          
					}
				}

				final boolean a;
				final TroubleshootMapDetailActivity b;

			
			{
				b = TroubleshootMapDetailActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TroubleshootMapDetailActivity b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//  109  245:aload_0         
	//  110  246:getfield        #112 <Field Button g>
	//  111  249:new             #8   <Class TroubleshootMapDetailActivity$2>
	//  112  252:dup             
	//  113  253:aload_0         
	//  114  254:iload_2         
	//  115  255:invokespecial   #168 <Method void TroubleshootMapDetailActivity$2(TroubleshootMapDetailActivity, boolean)>
	//  116  258:invokevirtual   #160 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//  117  261:return          

		case 0: // '\0'
			android.net.Uri uri = com.irobot.home.util.j.a(((android.content.Context) (this)), 0x7f0e0215);
	//  118  262:aload_0         
	//  119  263:ldc1            #169 <Int 0x7f0e0215>
	//  120  265:invokestatic    #172 <Method android.net.Uri j.a(android.content.Context, int)>
	//  121  268:astore          4
			a.setSource(uri);
	//  122  270:aload_0         
	//  123  271:getfield        #174 <Field CustomVideoView a>
	//  124  274:aload           4
	//  125  276:invokevirtual   #180 <Method void CustomVideoView.setSource(android.net.Uri)>
			a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, com.irobot.home.util.j.a(((android.app.Activity) (this)), uri)))));
	//  126  279:aload_0         
	//  127  280:getfield        #174 <Field CustomVideoView a>
	//  128  283:new             #182 <Class android.widget.LinearLayout$LayoutParams>
	//  129  286:dup             
	//  130  287:iconst_m1       
	//  131  288:aload_0         
	//  132  289:aload           4
	//  133  291:invokestatic    #185 <Method int j.a(android.app.Activity, android.net.Uri)>
	//  134  294:invokespecial   #188 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//  135  297:invokevirtual   #192 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			a.setLooping(true);
	//  136  300:aload_0         
	//  137  301:getfield        #174 <Field CustomVideoView a>
	//  138  304:iconst_1        
	//  139  305:invokevirtual   #195 <Method void CustomVideoView.setLooping(boolean)>
			a.a();
	//  140  308:aload_0         
	//  141  309:getfield        #174 <Field CustomVideoView a>
	//  142  312:invokevirtual   #197 <Method void CustomVideoView.a()>
			b.setText(((CharSequence) (getString(l, new Object[] {
				assetinfo.getName()
			}))));
	//  143  315:aload_0         
	//  144  316:getfield        #132 <Field TextView b>
	//  145  319:aload_0         
	//  146  320:aload_0         
	//  147  321:getfield        #134 <Field int l>
	//  148  324:iconst_1        
	//  149  325:anewarray       Object[]
	//  150  328:dup             
	//  151  329:iconst_0        
	//  152  330:aload_3         
	//  153  331:invokevirtual   #139 <Method String AssetInfo.getName()>
	//  154  334:aastore         
	//  155  335:invokevirtual   #143 <Method String getString(int, Object[])>
	//  156  338:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
			return;
	//  157  341:return          
		}
	}

	private static final String n = com.irobot.home.util.j.r(((Class) (com/irobot/home/TroubleshootMapDetailActivity)).getSimpleName());
	CustomVideoView a;
	TextView b;
	Button f;
	Button g;
	Button h;
	IRobotApplication i;
	int j;
	int k;
	int l;
	int m;
	private MissionSubsystem o;
	private MapsUIService p;

	static 
	{
	//    0    0:ldc1            #2   <Class TroubleshootMapDetailActivity>
	//    1    2:invokevirtual   #39  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #45  <Method String j.r(String)>
	//    3    8:putstatic       #47  <Field String n>
	//*   4   11:return          
	}
}
