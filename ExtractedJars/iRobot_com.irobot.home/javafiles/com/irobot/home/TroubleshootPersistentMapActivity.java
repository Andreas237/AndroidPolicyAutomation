// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.support.v7.widget.*;
import android.view.View;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.b.ao;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			BaseToolbarFragmentActivity, TroubleshootMapDetailActivity_

public class TroubleshootPersistentMapActivity extends BaseToolbarFragmentActivity
{

	public TroubleshootPersistentMapActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void BaseToolbarFragmentActivity()>
		h = new android.view.View.OnClickListener() {

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

			
			{
				a = TroubleshootPersistentMapActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TroubleshootPersistentMapActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    2    4:aload_0         
	//    3    5:new             #6   <Class TroubleshootPersistentMapActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #39  <Method void TroubleshootPersistentMapActivity$1(TroubleshootPersistentMapActivity)>
	//    7   13:putfield        #41  <Field android.view.View$OnClickListener h>
	//    8   16:return          
	}

	private void a(int i, int k, int l)
	{
		com.irobot.home.TroubleshootMapDetailActivity_.a(((android.content.Context) (this))).b(k).c(i).d(l).e(b).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #47  <Method TroubleshootMapDetailActivity_$a com.irobot.home.TroubleshootMapDetailActivity_.a(android.content.Context)>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #52  <Method TroubleshootMapDetailActivity_$a TroubleshootMapDetailActivity_$a.b(int)>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #55  <Method TroubleshootMapDetailActivity_$a TroubleshootMapDetailActivity_$a.c(int)>
	//    6   12:iload_3         
	//    7   13:invokevirtual   #58  <Method TroubleshootMapDetailActivity_$a TroubleshootMapDetailActivity_$a.d(int)>
	//    8   16:aload_0         
	//    9   17:getfield        #60  <Field int b>
	//   10   20:invokevirtual   #63  <Method TroubleshootMapDetailActivity_$a TroubleshootMapDetailActivity_$a.e(int)>
	//   11   23:invokevirtual   #66  <Method org.androidannotations.api.a.e com.irobot.home.TroubleshootMapDetailActivity_$a.a()>
	//   12   26:pop             
	//   13   27:return          
	}

	static void a(TroubleshootPersistentMapActivity troubleshootpersistentmapactivity, int i, int k, int l)
	{
		troubleshootpersistentmapactivity.a(i, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #69  <Method void a(int, int, int)>
	//    5    7:return          
	}

	static String g()
	{
		return f;
	//    0    0:getstatic       #32  <Field String f>
	//    1    3:areturn         
	}

	protected void e()
	{
		Object obj = ((Object) (new LinearLayoutManager(((android.content.Context) (this)))));
	//    0    0:new             #71  <Class LinearLayoutManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #74  <Method void LinearLayoutManager(android.content.Context)>
	//    4    8:astore_1        
		a.setLayoutManager(((android.support.v7.widget.RecyclerView.h) (obj)));
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field RecyclerView a>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #82  <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
		a.a(((android.support.v7.widget.RecyclerView.g) (new x(((android.content.Context) (this)), ((LinearLayoutManager) (obj)).f()))));
	//    9   17:aload_0         
	//   10   18:getfield        #76  <Field RecyclerView a>
	//   11   21:new             #84  <Class x>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #87  <Method int LinearLayoutManager.f()>
	//   16   30:invokespecial   #90  <Method void x(android.content.Context, int)>
	//   17   33:invokevirtual   #93  <Method void RecyclerView.a(android.support.v7.widget.RecyclerView$g)>
		a.setHasFixedSize(true);
	//   18   36:aload_0         
	//   19   37:getfield        #76  <Field RecyclerView a>
	//   20   40:iconst_1        
	//   21   41:invokevirtual   #97  <Method void RecyclerView.setHasFixedSize(boolean)>
		obj = ((Object) (new ArrayList()));
	//   22   44:new             #99  <Class ArrayList>
	//   23   47:dup             
	//   24   48:invokespecial   #100 <Method void ArrayList()>
	//   25   51:astore_1        
		((ArrayList) (obj)).add(((Object) (Integer.valueOf(0x7f0f090c))));
	//   26   52:aload_1         
	//   27   53:ldc1            #101 <Int 0x7f0f090c>
	//   28   55:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   29   58:invokevirtual   #111 <Method boolean ArrayList.add(Object)>
	//   30   61:pop             
		((ArrayList) (obj)).add(((Object) (Integer.valueOf(0x7f0f0908))));
	//   31   62:aload_1         
	//   32   63:ldc1            #112 <Int 0x7f0f0908>
	//   33   65:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   34   68:invokevirtual   #111 <Method boolean ArrayList.add(Object)>
	//   35   71:pop             
		((ArrayList) (obj)).add(((Object) (Integer.valueOf(0x7f0f0905))));
	//   36   72:aload_1         
	//   37   73:ldc1            #113 <Int 0x7f0f0905>
	//   38   75:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   39   78:invokevirtual   #111 <Method boolean ArrayList.add(Object)>
	//   40   81:pop             
		g = new ao(((android.content.Context) (this)), ((java.util.List) (obj)), h);
	//   41   82:aload_0         
	//   42   83:new             #115 <Class ao>
	//   43   86:dup             
	//   44   87:aload_0         
	//   45   88:aload_1         
	//   46   89:aload_0         
	//   47   90:getfield        #41  <Field android.view.View$OnClickListener h>
	//   48   93:invokespecial   #118 <Method void ao(android.content.Context, java.util.List, android.view.View$OnClickListener)>
	//   49   96:putfield        #120 <Field ao g>
		a.setAdapter(((android.support.v7.widget.RecyclerView.a) (g)));
	//   50   99:aload_0         
	//   51  100:getfield        #76  <Field RecyclerView a>
	//   52  103:aload_0         
	//   53  104:getfield        #120 <Field ao g>
	//   54  107:invokevirtual   #124 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
	//   55  110:return          
	}

	protected void f()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method void finish()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method void BaseToolbarFragmentActivity.onCreate(Bundle)>
		a(0x7f0f090a, ((ArrayList) (null)));
	//    3    5:aload_0         
	//    4    6:ldc1            #132 <Int 0x7f0f090a>
	//    5    8:aconst_null     
	//    6    9:invokevirtual   #135 <Method void a(int, ArrayList)>
		a(true, 0);
	//    7   12:aload_0         
	//    8   13:iconst_1        
	//    9   14:iconst_0        
	//   10   15:invokevirtual   #138 <Method void a(boolean, int)>
		a(true);
	//   11   18:aload_0         
	//   12   19:iconst_1        
	//   13   20:invokevirtual   #140 <Method void a(boolean)>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsTroubleshootingList, j.j().a());
	//   14   23:invokestatic    #146 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   15   26:getstatic       #152 <Field ViewId ViewId.PMapsTroubleshootingList>
	//   16   29:invokestatic    #156 <Method a j.j()>
	//   17   32:invokevirtual   #161 <Method com.irobot.core.AssetInfo a.a()>
	//   18   35:invokevirtual   #165 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
	//   19   38:return          
	}

	private static final String f = j.r(((Class) (com/irobot/home/TroubleshootPersistentMapActivity)).getSimpleName());
	RecyclerView a;
	int b;
	private ao g;
	private android.view.View.OnClickListener h;

	static 
	{
	//    0    0:ldc1            #2   <Class TroubleshootPersistentMapActivity>
	//    1    2:invokevirtual   #24  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #30  <Method String j.r(String)>
	//    3    8:putstatic       #32  <Field String f>
	//*   4   11:return          
	}
}
