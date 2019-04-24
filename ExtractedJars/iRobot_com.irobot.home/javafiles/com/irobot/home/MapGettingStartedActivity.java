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
//			BaseToolbarFragmentActivity, MapFirstCleaningActivity_

public class MapGettingStartedActivity extends BaseToolbarFragmentActivity
{

	public MapGettingStartedActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void BaseToolbarFragmentActivity()>
		f = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #33  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void ArrayList()>
	//    6   12:putfield        #36  <Field ArrayList f>
	//    7   15:return          
	}

	protected void e()
	{
		Object obj1 = ((Object) (j.j().a()));
	//    0    0:invokestatic    #41  <Method a j.j()>
	//    1    3:invokevirtual   #46  <Method AssetInfo a.a()>
	//    2    6:astore_3        
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.CleanButtonIntro1, ((AssetInfo) (obj1)));
	//    3    7:invokestatic    #52  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    4   10:getstatic       #58  <Field ViewId ViewId.CleanButtonIntro1>
	//    5   13:aload_3         
	//    6   14:invokevirtual   #62  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
		boolean flag;
		if(AssetCapabilityUtils.isCloudCapable(((AssetInfo) (obj1))) && AssetCapabilityUtils.isMoppingRobot(((AssetInfo) (obj1))))
	//*   7   17:aload_3         
	//*   8   18:invokestatic    #68  <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*   9   21:ifeq            36
	//*  10   24:aload_3         
	//*  11   25:invokestatic    #71  <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  12   28:ifeq            36
			flag = true;
	//   13   31:iconst_1        
	//   14   32:istore_1        
		else
	//*  15   33:goto            38
			flag = false;
	//   16   36:iconst_0        
	//   17   37:istore_1        
		Object obj = ((Object) (new ArrayList()));
	//   18   38:new             #33  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #34  <Method void ArrayList()>
	//   21   45:astore_2        
		((ArrayList) (obj)).add(((Object) (getString(0x7f0f0610, new Object[] {
			((AssetInfo) (obj1)).getName()
		}))));
	//   22   46:aload_2         
	//   23   47:aload_0         
	//   24   48:ldc1            #72  <Int 0x7f0f0610>
	//   25   50:iconst_1        
	//   26   51:anewarray       Object[]
	//   27   54:dup             
	//   28   55:iconst_0        
	//   29   56:aload_3         
	//   30   57:invokevirtual   #79  <Method String AssetInfo.getName()>
	//   31   60:aastore         
	//   32   61:invokevirtual   #83  <Method String getString(int, Object[])>
	//   33   64:invokevirtual   #87  <Method boolean ArrayList.add(Object)>
	//   34   67:pop             
		obj1 = ((Object) (af.b()));
	//   35   68:invokestatic    #92  <Method com.irobot.home.fragments.af$a af.b()>
	//   36   71:astore_3        
		int i;
		if(flag)
	//*  37   72:iload_1         
	//*  38   73:ifeq            82
			i = 0x7f0e020a;
	//   39   76:ldc1            #93  <Int 0x7f0e020a>
	//   40   78:istore_1        
		else
	//*  41   79:goto            85
			i = 0x7f0e01f5;
	//   42   82:ldc1            #94  <Int 0x7f0e01f5>
	//   43   84:istore_1        
		obj = ((Object) (((com.irobot.home.fragments.af.a) (obj1)).a(i).a(((ArrayList) (obj))).a(false).b(false).a()));
	//   44   85:aload_3         
	//   45   86:iload_1         
	//   46   87:invokevirtual   #99  <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(int)>
	//   47   90:aload_2         
	//   48   91:invokevirtual   #102 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(ArrayList)>
	//   49   94:iconst_0        
	//   50   95:invokevirtual   #105 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.a(boolean)>
	//   51   98:iconst_0        
	//   52   99:invokevirtual   #107 <Method com.irobot.home.fragments.af$a com.irobot.home.fragments.af$a.b(boolean)>
	//   53  102:invokevirtual   #110 <Method com.irobot.home.fragments.ae com.irobot.home.fragments.af$a.a()>
	//   54  105:astore_2        
		getFragmentManager().beginTransaction().replace(0x7f0901de, ((android.app.Fragment) (obj))).commit();
	//   55  106:aload_0         
	//   56  107:invokevirtual   #114 <Method FragmentManager getFragmentManager()>
	//   57  110:invokevirtual   #120 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   58  113:ldc1            #121 <Int 0x7f0901de>
	//   59  115:aload_2         
	//   60  116:invokevirtual   #127 <Method FragmentTransaction FragmentTransaction.replace(int, android.app.Fragment)>
	//   61  119:invokevirtual   #131 <Method int FragmentTransaction.commit()>
	//   62  122:pop             
		getFragmentManager().executePendingTransactions();
	//   63  123:aload_0         
	//   64  124:invokevirtual   #114 <Method FragmentManager getFragmentManager()>
	//   65  127:invokevirtual   #135 <Method boolean FragmentManager.executePendingTransactions()>
	//   66  130:pop             
		a.setVisibility(0);
	//   67  131:aload_0         
	//   68  132:getfield        #137 <Field Button a>
	//   69  135:iconst_0        
	//   70  136:invokevirtual   #143 <Method void Button.setVisibility(int)>
	//   71  139:return          
	}

	protected void f()
	{
		AnalyticsSubsystem.getInstance().trackCleanButtonIntro1CancelButtonPressed(j.j().a());
	//    0    0:invokestatic    #52  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:invokestatic    #41  <Method a j.j()>
	//    2    6:invokevirtual   #46  <Method AssetInfo a.a()>
	//    3    9:invokevirtual   #147 <Method void AnalyticsSubsystem.trackCleanButtonIntro1CancelButtonPressed(AssetInfo)>
		finish();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #150 <Method void finish()>
	//    6   16:return          
	}

	protected void g()
	{
		AnalyticsSubsystem.getInstance().trackCleanButtonIntro1NextButtonPressed(j.j().a());
	//    0    0:invokestatic    #52  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:invokestatic    #41  <Method a j.j()>
	//    2    6:invokevirtual   #46  <Method AssetInfo a.a()>
	//    3    9:invokevirtual   #154 <Method void AnalyticsSubsystem.trackCleanButtonIntro1NextButtonPressed(AssetInfo)>
		com.irobot.home.MapFirstCleaningActivity_.a(((android.content.Context) (this))).a();
	//    4   12:aload_0         
	//    5   13:invokestatic    #159 <Method MapFirstCleaningActivity_$a com.irobot.home.MapFirstCleaningActivity_.a(android.content.Context)>
	//    6   16:invokevirtual   #164 <Method org.androidannotations.api.a.e com.irobot.home.MapFirstCleaningActivity_$a.a()>
	//    7   19:pop             
	//    8   20:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #168 <Method void BaseToolbarFragmentActivity.onCreate(Bundle)>
		a(0x7f0f0611, ((ArrayList) (null)));
	//    3    5:aload_0         
	//    4    6:ldc1            #169 <Int 0x7f0f0611>
	//    5    8:aconst_null     
	//    6    9:invokevirtual   #172 <Method void a(int, ArrayList)>
		a(true, 0);
	//    7   12:aload_0         
	//    8   13:iconst_1        
	//    9   14:iconst_0        
	//   10   15:invokevirtual   #175 <Method void a(boolean, int)>
	//   11   18:return          
	}

	private static final String b = j.r(((Class) (com/irobot/home/MapGettingStartedActivity)).getSimpleName());
	Button a;
	private ArrayList f;

	static 
	{
	//    0    0:ldc1            #2   <Class MapGettingStartedActivity>
	//    1    2:invokevirtual   #19  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #25  <Method String j.r(String)>
	//    3    8:putstatic       #27  <Field String b>
	//*   4   11:return          
	}
}
