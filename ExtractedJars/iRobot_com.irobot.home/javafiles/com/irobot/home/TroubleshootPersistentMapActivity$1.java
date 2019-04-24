// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			TroubleshootPersistentMapActivity

class TroubleshootPersistentMapActivity$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		view = ((View) ((Integer)view.getTag()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method Object View.getTag()>
	//    2    4:checkcast       #28  <Class Integer>
	//    3    7:astore_1        
		if(view == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       21
		{
			o.d(TroubleshootPersistentMapActivity.g(), "There is no resource found!");
	//    6   12:invokestatic    #32  <Method String TroubleshootPersistentMapActivity.g()>
	//    7   15:ldc1            #34  <String "There is no resource found!">
	//    8   17:invokestatic    #40  <Method void o.d(String, String)>
			return;
	//    9   20:return          
		}
		int i = ((Integer) (view)).intValue();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #44  <Method int Integer.intValue()>
	//   12   25:istore_2        
		int k;
		int l;
		if(i != 0x7f0f0905)
	//*  13   26:iload_2         
	//*  14   27:ldc1            #45  <Int 0x7f0f0905>
	//*  15   29:icmpeq          117
		{
			if(i != 0x7f0f0908)
	//*  16   32:iload_2         
	//*  17   33:ldc1            #46  <Int 0x7f0f0908>
	//*  18   35:icmpeq          85
			{
				if(i != 0x7f0f090c)
	//*  19   38:iload_2         
	//*  20   39:ldc1            #47  <Int 0x7f0f090c>
	//*  21   41:icmpeq          53
				{
					o.e(TroubleshootPersistentMapActivity.g(), "Found unknown resource id.");
	//   22   44:invokestatic    #32  <Method String TroubleshootPersistentMapActivity.g()>
	//   23   47:ldc1            #49  <String "Found unknown resource id.">
	//   24   49:invokestatic    #52  <Method void o.e(String, String)>
					return;
	//   25   52:return          
				}
				AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsTroubleshootingUnderstanding, j.j().a());
	//   26   53:invokestatic    #58  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   27   56:getstatic       #64  <Field ViewId ViewId.PMapsTroubleshootingUnderstanding>
	//   28   59:invokestatic    #70  <Method a j.j()>
	//   29   62:invokevirtual   #75  <Method com.irobot.core.AssetInfo a.a()>
	//   30   65:invokevirtual   #79  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
				view = ((View) (a));
	//   31   68:aload_0         
	//   32   69:getfield        #14  <Field TroubleshootPersistentMapActivity a>
	//   33   72:astore_1        
				i = 0;
	//   34   73:iconst_0        
	//   35   74:istore_2        
				k = 0x7f0f090d;
	//   36   75:ldc1            #80  <Int 0x7f0f090d>
	//   37   77:istore_3        
				l = 0x7f0f0938;
	//   38   78:ldc1            #81  <Int 0x7f0f0938>
	//   39   80:istore          4
			} else
	//*  40   82:goto            146
			{
				AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsTroubleshootingIncomplete, j.j().a());
	//   41   85:invokestatic    #58  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   42   88:getstatic       #84  <Field ViewId ViewId.PMapsTroubleshootingIncomplete>
	//   43   91:invokestatic    #70  <Method a j.j()>
	//   44   94:invokevirtual   #75  <Method com.irobot.core.AssetInfo a.a()>
	//   45   97:invokevirtual   #79  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
				view = ((View) (a));
	//   46  100:aload_0         
	//   47  101:getfield        #14  <Field TroubleshootPersistentMapActivity a>
	//   48  104:astore_1        
				i = 1;
	//   49  105:iconst_1        
	//   50  106:istore_2        
				k = 0x7f0f0909;
	//   51  107:ldc1            #85  <Int 0x7f0f0909>
	//   52  109:istore_3        
				l = 0x7f0f0907;
	//   53  110:ldc1            #86  <Int 0x7f0f0907>
	//   54  112:istore          4
			}
		} else
	//*  55  114:goto            146
		{
			AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsTroubleshootingWrong, j.j().a());
	//   56  117:invokestatic    #58  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   57  120:getstatic       #89  <Field ViewId ViewId.PMapsTroubleshootingWrong>
	//   58  123:invokestatic    #70  <Method a j.j()>
	//   59  126:invokevirtual   #75  <Method com.irobot.core.AssetInfo a.a()>
	//   60  129:invokevirtual   #79  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
			view = ((View) (a));
	//   61  132:aload_0         
	//   62  133:getfield        #14  <Field TroubleshootPersistentMapActivity a>
	//   63  136:astore_1        
			i = 2;
	//   64  137:iconst_2        
	//   65  138:istore_2        
			k = 0x7f0f0906;
	//   66  139:ldc1            #90  <Int 0x7f0f0906>
	//   67  141:istore_3        
			l = 0x7f0f0904;
	//   68  142:ldc1            #91  <Int 0x7f0f0904>
	//   69  144:istore          4
		}
		com.irobot.home.TroubleshootPersistentMapActivity.a(((TroubleshootPersistentMapActivity) (view)), i, k, l);
	//   70  146:aload_1         
	//   71  147:iload_2         
	//   72  148:iload_3         
	//   73  149:iload           4
	//   74  151:invokestatic    #94  <Method void com.irobot.home.TroubleshootPersistentMapActivity.a(TroubleshootPersistentMapActivity, int, int, int)>
	//   75  154:return          
	}

	final TroubleshootPersistentMapActivity a;

	TroubleshootPersistentMapActivity$1(TroubleshootPersistentMapActivity troubleshootpersistentmapactivity)
	{
		a = troubleshootpersistentmapactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field TroubleshootPersistentMapActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
