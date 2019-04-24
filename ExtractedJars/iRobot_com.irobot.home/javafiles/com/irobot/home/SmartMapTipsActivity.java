// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v4.view.p;
import android.widget.ImageButton;
import com.irobot.core.*;
import com.irobot.home.b.aj;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomViewPager;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class SmartMapTipsActivity extends BaseFragmentActivity
{

	public SmartMapTipsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BaseFragmentActivity()>
		e = new com.irobot.home.b.aj.a() {

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
				AssetInfo assetinfo = j.j().a();
			//   27   49:invokestatic    #46  <Method a j.j()>
			//   28   52:invokevirtual   #51  <Method AssetInfo a.a()>
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
			//			               0 143
			//			               1 118
			//			               2 93
				default:
					return;
			//   35   92:return          

				case 2: // '\002'
					AnalyticsSubsystem.getInstance().trackPMapsTip2NextButtonPressed(j.j().a());
			//   36   93:invokestatic    #57  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//   37   96:invokestatic    #46  <Method a j.j()>
			//   38   99:invokevirtual   #51  <Method AssetInfo a.a()>
			//   39  102:invokevirtual   #61  <Method void AnalyticsSubsystem.trackPMapsTip2NextButtonPressed(AssetInfo)>
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
			//   47  124:invokevirtual   #51  <Method AssetInfo a.a()>
			//   48  127:invokevirtual   #70  <Method void AnalyticsSubsystem.trackPMapsTip1NextButtonPressed(AssetInfo)>
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
			//   61  159:invokevirtual   #80  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
			//   62  162:return          
			}

			public void b()
			{
				AnalyticsSubsystem.getInstance().trackPMapsTip3CompleteButtonPressed(j.j().a());
			//    0    0:invokestatic    #57  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//    1    3:invokestatic    #46  <Method a j.j()>
			//    2    6:invokevirtual   #51  <Method AssetInfo a.a()>
			//    3    9:invokevirtual   #84  <Method void AnalyticsSubsystem.trackPMapsTip3CompleteButtonPressed(AssetInfo)>
				a.finish();
			//    4   12:aload_0         
			//    5   13:getfield        #14  <Field SmartMapTipsActivity a>
			//    6   16:invokevirtual   #87  <Method void SmartMapTipsActivity.finish()>
			//    7   19:return          
			}

			final SmartMapTipsActivity a;

			
			{
				a = SmartMapTipsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SmartMapTipsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    2    4:aload_0         
	//    3    5:new             #6   <Class SmartMapTipsActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #27  <Method void SmartMapTipsActivity$1(SmartMapTipsActivity)>
	//    7   13:putfield        #29  <Field com.irobot.home.b.aj$a e>
	//    8   16:return          
	}

	void e()
	{
		d = new aj(((android.content.Context) (this)), e, j.j().a().getName());
	//    0    0:aload_0         
	//    1    1:new             #31  <Class aj>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field com.irobot.home.b.aj$a e>
	//    6   10:invokestatic    #37  <Method a j.j()>
	//    7   13:invokevirtual   #42  <Method AssetInfo a.a()>
	//    8   16:invokevirtual   #48  <Method String AssetInfo.getName()>
	//    9   19:invokespecial   #51  <Method void aj(android.content.Context, com.irobot.home.b.aj$a, String)>
	//   10   22:putfield        #53  <Field aj d>
		a.setPagingEnabled(false);
	//   11   25:aload_0         
	//   12   26:getfield        #55  <Field CustomViewPager a>
	//   13   29:iconst_0        
	//   14   30:invokevirtual   #61  <Method void CustomViewPager.setPagingEnabled(boolean)>
		a.setAdapter(((p) (d)));
	//   15   33:aload_0         
	//   16   34:getfield        #55  <Field CustomViewPager a>
	//   17   37:aload_0         
	//   18   38:getfield        #53  <Field aj d>
	//   19   41:invokevirtual   #65  <Method void CustomViewPager.setAdapter(p)>
		b.setVisibility(0);
	//   20   44:aload_0         
	//   21   45:getfield        #67  <Field ImageButton b>
	//   22   48:iconst_0        
	//   23   49:invokevirtual   #73  <Method void ImageButton.setVisibility(int)>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsTip1, j.j().a());
	//   24   52:invokestatic    #79  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   25   55:getstatic       #85  <Field ViewId ViewId.PMapsTip1>
	//   26   58:invokestatic    #37  <Method a j.j()>
	//   27   61:invokevirtual   #42  <Method AssetInfo a.a()>
	//   28   64:invokevirtual   #89  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   29   67:return          
	}

	void f()
	{
		switch(a.getCurrentItem())
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field CustomViewPager a>
	//*   2    4:invokevirtual   #94  <Method int CustomViewPager.getCurrentItem()>
		{
	//*   3    7:tableswitch     0 2: default 32
	//	               0 65
	//	               1 50
	//	               2 35
	//*   4   32:goto            77
		case 2: // '\002'
			AnalyticsSubsystem.getInstance().trackPMapsTip3CancelButtonPressed(j.j().a());
	//    5   35:invokestatic    #79  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   38:invokestatic    #37  <Method a j.j()>
	//    7   41:invokevirtual   #42  <Method AssetInfo a.a()>
	//    8   44:invokevirtual   #98  <Method void AnalyticsSubsystem.trackPMapsTip3CancelButtonPressed(AssetInfo)>
			break;

	//*   9   47:goto            77
		case 1: // '\001'
			AnalyticsSubsystem.getInstance().trackPMapsTip2CancelButtonPressed(j.j().a());
	//   10   50:invokestatic    #79  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   11   53:invokestatic    #37  <Method a j.j()>
	//   12   56:invokevirtual   #42  <Method AssetInfo a.a()>
	//   13   59:invokevirtual   #101 <Method void AnalyticsSubsystem.trackPMapsTip2CancelButtonPressed(AssetInfo)>
			break;

	//*  14   62:goto            77
		case 0: // '\0'
			AnalyticsSubsystem.getInstance().trackPMapsTip1CancelButtonPressed(j.j().a());
	//   15   65:invokestatic    #79  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   16   68:invokestatic    #37  <Method a j.j()>
	//   17   71:invokevirtual   #42  <Method AssetInfo a.a()>
	//   18   74:invokevirtual   #104 <Method void AnalyticsSubsystem.trackPMapsTip1CancelButtonPressed(AssetInfo)>
			break;
		}
		finish();
	//   19   77:aload_0         
	//   20   78:invokevirtual   #107 <Method void finish()>
	//   21   81:return          
	}

	public void onBackPressed()
	{
		if(a.getCurrentItem() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field CustomViewPager a>
	//*   2    4:invokevirtual   #94  <Method int CustomViewPager.getCurrentItem()>
	//*   3    7:ifne            15
		{
			super.onBackPressed();
	//    4   10:aload_0         
	//    5   11:invokespecial   #110 <Method void BaseFragmentActivity.onBackPressed()>
			return;
	//    6   14:return          
		}
		int k = a.getCurrentItem() - 1;
	//    7   15:aload_0         
	//    8   16:getfield        #55  <Field CustomViewPager a>
	//    9   19:invokevirtual   #94  <Method int CustomViewPager.getCurrentItem()>
	//   10   22:iconst_1        
	//   11   23:isub            
	//   12   24:istore_2        
		int i = k;
	//   13   25:iload_2         
	//   14   26:istore_1        
		if(k < 0)
	//*  15   27:iload_2         
	//*  16   28:ifge            33
			i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
		a.setCurrentItem(i);
	//   19   33:aload_0         
	//   20   34:getfield        #55  <Field CustomViewPager a>
	//   21   37:iload_1         
	//   22   38:invokevirtual   #113 <Method void CustomViewPager.setCurrentItem(int)>
	//   23   41:return          
	}

	private static final String c = "SmartMapTipsActivity";
	CustomViewPager a;
	ImageButton b;
	private aj d;
	private com.irobot.home.b.aj.a e;

	static 
	{
	//    0    0:return          
	}
}
