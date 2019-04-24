// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;
import com.irobot.core.*;
import com.irobot.home.fragments.af;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			BaseToolbarFragmentActivity

public class MapFirstCleaningActivity extends BaseToolbarFragmentActivity
{

	public MapFirstCleaningActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void BaseToolbarFragmentActivity()>
		f = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void ArrayList()>
	//    6   12:putfield        #40  <Field ArrayList f>
	//    7   15:return          
	}

	protected void e()
	{
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.CleanButtonIntro2, g);
	//    0    0:invokestatic    #47  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:getstatic       #53  <Field ViewId ViewId.CleanButtonIntro2>
	//    2    6:aload_0         
	//    3    7:getfield        #55  <Field AssetInfo g>
	//    4   10:invokevirtual   #59  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
		boolean flag;
		if(AssetCapabilityUtils.isCloudCapable(g) && AssetCapabilityUtils.isMoppingRobot(g))
	//*   5   13:aload_0         
	//*   6   14:getfield        #55  <Field AssetInfo g>
	//*   7   17:invokestatic    #65  <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*   8   20:ifeq            38
	//*   9   23:aload_0         
	//*  10   24:getfield        #55  <Field AssetInfo g>
	//*  11   27:invokestatic    #68  <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  12   30:ifeq            38
			flag = true;
	//   13   33:iconst_1        
	//   14   34:istore_1        
		else
	//*  15   35:goto            40
			flag = false;
	//   16   38:iconst_0        
	//   17   39:istore_1        
		Object obj = ((Object) (new ArrayList()));
	//   18   40:new             #37  <Class ArrayList>
	//   19   43:dup             
	//   20   44:invokespecial   #38  <Method void ArrayList()>
	//   21   47:astore_2        
		((ArrayList) (obj)).add(((Object) (getString(0x7f0f060e, new Object[] {
			g.getName()
		}))));
	//   22   48:aload_2         
	//   23   49:aload_0         
	//   24   50:ldc1            #69  <Int 0x7f0f060e>
	//   25   52:iconst_1        
	//   26   53:anewarray       Object[]
	//   27   56:dup             
	//   28   57:iconst_0        
	//   29   58:aload_0         
	//   30   59:getfield        #55  <Field AssetInfo g>
	//   31   62:invokevirtual   #76  <Method String AssetInfo.getName()>
	//   32   65:aastore         
	//   33   66:invokevirtual   #80  <Method String getString(int, Object[])>
	//   34   69:invokevirtual   #84  <Method boolean ArrayList.add(Object)>
	//   35   72:pop             
		com.irobot.home.fragments.af.a a1 = af.b();
	//   36   73:invokestatic    #89  <Method com.irobot.home.fragments.af$a af.b()>
	//   37   76:astore_3        
		int i;
		if(flag)
	//*  38   77:iload_1         
	//*  39   78:ifeq            87
			i = 0x7f0e0209;
	//   40   81:ldc1            #90  <Int 0x7f0e0209>
	//   41   83:istore_1        
		else
	//*  42   84:goto            90
			i = 0x7f0e01f4;
	//   43   87:ldc1            #91  <Int 0x7f0e01f4>
	//   44   89:istore_1        
		obj = ((Object) (a1.a(i).a(((ArrayList) (obj))).a(false).b(false).a()));
	//   45   90:aload_3         
	//   46   91:iload_1         
	//   47   92:invokevirtual   #96  <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//   48   95:aload_2         
	//   49   96:invokevirtual   #99  <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(ArrayList)>
	//   50   99:iconst_0        
	//   51  100:invokevirtual   #102 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//   52  103:iconst_0        
	//   53  104:invokevirtual   #104 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(boolean)>
	//   54  107:invokevirtual   #107 <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//   55  110:astore_2        
		getFragmentManager().beginTransaction().replace(0x7f0901de, ((android.app.Fragment) (obj))).commit();
	//   56  111:aload_0         
	//   57  112:invokevirtual   #111 <Method FragmentManager getFragmentManager()>
	//   58  115:invokevirtual   #117 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   59  118:ldc1            #118 <Int 0x7f0901de>
	//   60  120:aload_2         
	//   61  121:invokevirtual   #124 <Method FragmentTransaction FragmentTransaction.replace(int, android.app.Fragment)>
	//   62  124:invokevirtual   #128 <Method int FragmentTransaction.commit()>
	//   63  127:pop             
		a.setVisibility(0);
	//   64  128:aload_0         
	//   65  129:getfield        #130 <Field Button a>
	//   66  132:iconst_0        
	//   67  133:invokevirtual   #136 <Method void Button.setVisibility(int)>
		h = Assembler.getInstance().getMissionSubsystem(g.getAssetId());
	//   68  136:aload_0         
	//   69  137:invokestatic    #141 <Method Assembler Assembler.getInstance()>
	//   70  140:aload_0         
	//   71  141:getfield        #55  <Field AssetInfo g>
	//   72  144:invokevirtual   #145 <Method AssetId AssetInfo.getAssetId()>
	//   73  147:invokevirtual   #149 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//   74  150:putfield        #151 <Field MissionSubsystem h>
	//   75  153:return          
	}

	protected void f()
	{
		String s = g.getAssetId().getId();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field AssetInfo g>
	//    2    4:invokevirtual   #145 <Method AssetId AssetInfo.getAssetId()>
	//    3    7:invokevirtual   #156 <Method String AssetId.getId()>
	//    4   10:astore_1        
		Assembler.getInstance().getPersistenceHandler().writeBoolToGroup("MapGettingStartedTour", s, true);
	//    5   11:invokestatic    #141 <Method Assembler Assembler.getInstance()>
	//    6   14:invokevirtual   #160 <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//    7   17:ldc1            #162 <String "MapGettingStartedTour">
	//    8   19:aload_1         
	//    9   20:iconst_1        
	//   10   21:invokevirtual   #168 <Method void PersistenceHandler.writeBoolToGroup(String, String, boolean)>
		AnalyticsSubsystem.getInstance().trackCleanButtonIntro2CompleteButtonPressed(j.j().a());
	//   11   24:invokestatic    #47  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   12   27:invokestatic    #172 <Method a j.j()>
	//   13   30:invokevirtual   #177 <Method AssetInfo a.a()>
	//   14   33:invokevirtual   #181 <Method void AnalyticsSubsystem.trackCleanButtonIntro2CompleteButtonPressed(AssetInfo)>
		h.sendCommand(CommandType.START);
	//   15   36:aload_0         
	//   16   37:getfield        #151 <Field MissionSubsystem h>
	//   17   40:getstatic       #187 <Field CommandType CommandType.START>
	//   18   43:invokevirtual   #193 <Method void MissionSubsystem.sendCommand(CommandType)>
		j.a(((android.app.Activity) (this)));
	//   19   46:aload_0         
	//   20   47:invokestatic    #196 <Method void j.a(android.app.Activity)>
	//   21   50:return          
	}

	protected void g()
	{
		AnalyticsSubsystem.getInstance().trackCleanButtonIntro2CancelButtonPressed(j.j().a());
	//    0    0:invokestatic    #47  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:invokestatic    #172 <Method a j.j()>
	//    2    6:invokevirtual   #177 <Method AssetInfo a.a()>
	//    3    9:invokevirtual   #199 <Method void AnalyticsSubsystem.trackCleanButtonIntro2CancelButtonPressed(AssetInfo)>
		j.a(((android.app.Activity) (this)));
	//    4   12:aload_0         
	//    5   13:invokestatic    #196 <Method void j.a(android.app.Activity)>
	//    6   16:return          
	}

	protected void h()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method void finish()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #206 <Method void BaseToolbarFragmentActivity.onCreate(Bundle)>
		g = j.j().a();
	//    3    5:aload_0         
	//    4    6:invokestatic    #172 <Method a j.j()>
	//    5    9:invokevirtual   #177 <Method AssetInfo a.a()>
	//    6   12:putfield        #55  <Field AssetInfo g>
		bundle = ((Bundle) (new ArrayList()));
	//    7   15:new             #37  <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #38  <Method void ArrayList()>
	//   10   22:astore_1        
		((ArrayList) (bundle)).add(((Object) (g.getName())));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #55  <Field AssetInfo g>
	//   14   28:invokevirtual   #76  <Method String AssetInfo.getName()>
	//   15   31:invokevirtual   #84  <Method boolean ArrayList.add(Object)>
	//   16   34:pop             
		a(0x7f0f060f, ((ArrayList) (bundle)));
	//   17   35:aload_0         
	//   18   36:ldc1            #207 <Int 0x7f0f060f>
	//   19   38:aload_1         
	//   20   39:invokevirtual   #210 <Method void a(int, ArrayList)>
		a(true, 0);
	//   21   42:aload_0         
	//   22   43:iconst_1        
	//   23   44:iconst_0        
	//   24   45:invokevirtual   #213 <Method void a(boolean, int)>
		a(true);
	//   25   48:aload_0         
	//   26   49:iconst_1        
	//   27   50:invokevirtual   #216 <Method void a(boolean)>
	//   28   53:return          
	}

	private static final String b = j.r(((Class) (com/irobot/home/MapFirstCleaningActivity)).getSimpleName());
	Button a;
	private ArrayList f;
	private AssetInfo g;
	private MissionSubsystem h;

	static 
	{
	//    0    0:ldc1            #2   <Class MapFirstCleaningActivity>
	//    1    2:invokevirtual   #23  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #29  <Method String j.r(String)>
	//    3    8:putstatic       #31  <Field String b>
	//*   4   11:return          
	}
}
