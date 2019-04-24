// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v4.view.p;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomViewPager;

// Referenced classes of package com.irobot.home:
//			SmartMapTipsActivity

class SmartMapTipsActivity$1
	implements com.irobot.home.b.aj.a
{

	public void a()
	{
		int k = a.a.getCurrentItem() + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field SmartMapTipsActivity a>
	//    2    4:getfield        #21  <Field CustomViewPager com.irobot.home.SmartMapTipsActivity.a>
	//    3    7:invokevirtual   #27  <Method int CustomViewPager.getCurrentItem()>
	//    4   10:iconst_1        
	//    5   11:iadd            
	//    6   12:istore_2        
		int l = a.a.getAdapter().getCount();
	//    7   13:aload_0         
	//    8   14:getfield        #14  <Field SmartMapTipsActivity a>
	//    9   17:getfield        #21  <Field CustomViewPager com.irobot.home.SmartMapTipsActivity.a>
	//   10   20:invokevirtual   #31  <Method p CustomViewPager.getAdapter()>
	//   11   23:invokevirtual   #36  <Method int p.getCount()>
	//   12   26:istore_3        
		int i = k;
	//   13   27:iload_2         
	//   14   28:istore_1        
		if(k >= l)
	//*  15   29:iload_2         
	//*  16   30:iload_3         
	//*  17   31:icmplt          38
			i = l - 1;
	//   18   34:iload_3         
	//   19   35:iconst_1        
	//   20   36:isub            
	//   21   37:istore_1        
		a.a.setCurrentItem(i);
	//   22   38:aload_0         
	//   23   39:getfield        #14  <Field SmartMapTipsActivity a>
	//   24   42:getfield        #21  <Field CustomViewPager com.irobot.home.SmartMapTipsActivity.a>
	//   25   45:iload_1         
	//   26   46:invokevirtual   #40  <Method void CustomViewPager.setCurrentItem(int)>
		com.irobot.core.AssetInfo assetinfo = j.j().a();
	//   27   49:invokestatic    #46  <Method a j.j()>
	//   28   52:invokevirtual   #51  <Method com.irobot.core.AssetInfo a.a()>
	//   29   55:astore          6
		AnalyticsSubsystem analyticssubsystem;
		ViewId viewid;
		switch(a.a.getCurrentItem())
	//*  30   57:aload_0         
	//*  31   58:getfield        #14  <Field SmartMapTipsActivity a>
	//*  32   61:getfield        #21  <Field CustomViewPager com.irobot.home.SmartMapTipsActivity.a>
	//*  33   64:invokevirtual   #27  <Method int CustomViewPager.getCurrentItem()>
		{
	//*  34   67:tableswitch     0 2: default 92
	//	               0 143
	//	               1 118
	//	               2 93
		default:
			return;
	//   35   92:return          

		case 2: // '\002'
			AnalyticsSubsystem.getInstance().trackPMapsTip2NextButtonPressed(j.j().a());
	//   36   93:invokestatic    #57  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   37   96:invokestatic    #46  <Method a j.j()>
	//   38   99:invokevirtual   #51  <Method com.irobot.core.AssetInfo a.a()>
	//   39  102:invokevirtual   #61  <Method void AnalyticsSubsystem.trackPMapsTip2NextButtonPressed(com.irobot.core.AssetInfo)>
			analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   40  105:invokestatic    #57  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   41  108:astore          4
			viewid = ViewId.PMapsTip3;
	//   42  110:getstatic       #67  <Field ViewId ViewId.PMapsTip3>
	//   43  113:astore          5
			break;

	//*  44  115:goto            153
		case 1: // '\001'
			AnalyticsSubsystem.getInstance().trackPMapsTip1NextButtonPressed(j.j().a());
	//   45  118:invokestatic    #57  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   46  121:invokestatic    #46  <Method a j.j()>
	//   47  124:invokevirtual   #51  <Method com.irobot.core.AssetInfo a.a()>
	//   48  127:invokevirtual   #70  <Method void AnalyticsSubsystem.trackPMapsTip1NextButtonPressed(com.irobot.core.AssetInfo)>
			analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   49  130:invokestatic    #57  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   50  133:astore          4
			viewid = ViewId.PMapsTip2;
	//   51  135:getstatic       #73  <Field ViewId ViewId.PMapsTip2>
	//   52  138:astore          5
			break;

	//*  53  140:goto            153
		case 0: // '\0'
			analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   54  143:invokestatic    #57  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   55  146:astore          4
			viewid = ViewId.PMapsTip1;
	//   56  148:getstatic       #76  <Field ViewId ViewId.PMapsTip1>
	//   57  151:astore          5
			break;
		}
		analyticssubsystem.trackViewForAsset(viewid, assetinfo);
	//   58  153:aload           4
	//   59  155:aload           5
	//   60  157:aload           6
	//   61  159:invokevirtual   #80  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
	//   62  162:return          
	}

	public void b()
	{
		AnalyticsSubsystem.getInstance().trackPMapsTip3CompleteButtonPressed(j.j().a());
	//    0    0:invokestatic    #57  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:invokestatic    #46  <Method a j.j()>
	//    2    6:invokevirtual   #51  <Method com.irobot.core.AssetInfo a.a()>
	//    3    9:invokevirtual   #84  <Method void AnalyticsSubsystem.trackPMapsTip3CompleteButtonPressed(com.irobot.core.AssetInfo)>
		a.finish();
	//    4   12:aload_0         
	//    5   13:getfield        #14  <Field SmartMapTipsActivity a>
	//    6   16:invokevirtual   #87  <Method void SmartMapTipsActivity.finish()>
	//    7   19:return          
	}

	final SmartMapTipsActivity a;

	SmartMapTipsActivity$1(SmartMapTipsActivity smartmaptipsactivity)
	{
		a = smartmaptipsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SmartMapTipsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
