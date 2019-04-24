// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.Context;
import android.support.v4.content.a;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.x;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.NotificationCenterDataItem;
import com.irobot.core.NotificationCenterServiceCommand;
import com.irobot.core.NotificationCenterUIService;
import com.irobot.core.NotificationCenterUIServiceData;
import com.irobot.home.NotificationDetailsActivity_;
import com.irobot.home.ScheduleTableViewActivity_;
import com.irobot.home.b.v;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class ac extends g
{
	private class a extends android.support.v7.widget.RecyclerView.a
	{

		public int a()
		{
			return com.irobot.home.fragments.ac.a(a).size();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ac a>
		//    2    4:invokestatic    #29  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
		//    3    7:invokevirtual   #34  <Method int ArrayList.size()>
		//    4   10:ireturn         
		}

		public com.irobot.home.s.a a(ViewGroup viewgroup, int k)
		{
			return new com.irobot.home.s.a(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0b00ef, viewgroup, false));
		//    0    0:new             #37  <Class com.irobot.home.s.a>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #43  <Method Context ViewGroup.getContext()>
		//    4    8:invokestatic    #49  <Method LayoutInflater LayoutInflater.from(Context)>
		//    5   11:ldc1            #50  <Int 0x7f0b00ef>
		//    6   13:aload_1         
		//    7   14:iconst_0        
		//    8   15:invokevirtual   #54  <Method android.view.View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    9   18:invokespecial   #57  <Method void com.irobot.home.s.a(android.view.View)>
		//   10   21:areturn         
		}

		public volatile void a(android.support.v7.widget.RecyclerView.u u, int k)
		{
			a((com.irobot.home.s.a)u, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #37  <Class com.irobot.home.s.a>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #61  <Method void a(com.irobot.home.s.a, int)>
		//    5    9:return          
		}

		public void a(com.irobot.home.s.a a1, int k)
		{
			a1.a(b, k, (NotificationCenterDataItem)com.irobot.home.fragments.ac.a(a).get(k), c);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #22  <Field Context b>
		//    3    5:iload_2         
		//    4    6:aload_0         
		//    5    7:getfield        #17  <Field ac a>
		//    6   10:invokestatic    #29  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
		//    7   13:iload_2         
		//    8   14:invokevirtual   #65  <Method Object ArrayList.get(int)>
		//    9   17:checkcast       #67  <Class NotificationCenterDataItem>
		//   10   20:aload_0         
		//   11   21:getfield        #24  <Field ac$b c>
		//   12   24:invokevirtual   #70  <Method void com.irobot.home.s.a.a(Context, int, NotificationCenterDataItem, ac$b)>
		//   13   27:return          
		}

		public android.support.v7.widget.RecyclerView.u b(ViewGroup viewgroup, int k)
		{
			return ((android.support.v7.widget.RecyclerView.u) (a(viewgroup, k)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokevirtual   #73  <Method com.irobot.home.s.a a(ViewGroup, int)>
		//    4    6:areturn         
		}

		final ac a;
		private Context b;
		private b c;

		a(Context context, b b1)
		{
			a = ac.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ac a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void android.support.v7.widget.RecyclerView$a()>
			b = context;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Context b>
			c = b1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field ac$b c>
		//   11   19:return          
		}
	}

	public static interface b
	{

		public abstract void a(int k);
	}


	public ac()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void g()>
		f = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #44  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void ArrayList()>
	//    6   12:putfield        #47  <Field ArrayList f>
		j = new b() {

			public void a(int k)
			{
				Object obj;
				String s;
				if(k >= com.irobot.home.fragments.ac.a(a).size())
			//*   0    0:iload_1         
			//*   1    1:aload_0         
			//*   2    2:getfield        #14  <Field ac a>
			//*   3    5:invokestatic    #22  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
			//*   4    8:invokevirtual   #28  <Method int ArrayList.size()>
			//*   5   11:icmplt          29
				{
					s = ac.f();
			//    6   14:invokestatic    #32  <Method String ac.f()>
			//    7   17:astore          4
					obj = "Message Center clicks index out of bound!";
			//    8   19:ldc1            #34  <String "Message Center clicks index out of bound!">
			//    9   21:astore_3        
				} else
			//*  10   22:aload           4
			//*  11   24:aload_3         
			//*  12   25:invokestatic    #40  <Method void o.e(String, String)>
			//*  13   28:return          
				{
					obj = ((Object) ((NotificationCenterDataItem)com.irobot.home.fragments.ac.a(a).get(k)));
			//   14   29:aload_0         
			//   15   30:getfield        #14  <Field ac a>
			//   16   33:invokestatic    #22  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
			//   17   36:iload_1         
			//   18   37:invokevirtual   #44  <Method Object ArrayList.get(int)>
			//   19   40:checkcast       #46  <Class NotificationCenterDataItem>
			//   20   43:astore_3        
					boolean flag = ((NotificationCenterDataItem) (obj)).getNotificationType().equals("SmartScheduleRecommendation");
			//   21   44:aload_3         
			//   22   45:invokevirtual   #49  <Method String NotificationCenterDataItem.getNotificationType()>
			//   23   48:ldc1            #51  <String "SmartScheduleRecommendation">
			//   24   50:invokevirtual   #57  <Method boolean String.equals(Object)>
			//   25   53:istore_2        
					a.a(((NotificationCenterDataItem) (obj)));
			//   26   54:aload_0         
			//   27   55:getfield        #14  <Field ac a>
			//   28   58:aload_3         
			//   29   59:invokevirtual   #60  <Method void com.irobot.home.fragments.ac.a(NotificationCenterDataItem)>
					if(flag)
			//*  30   62:iload_2         
			//*  31   63:ifeq            173
					{
						if(com.irobot.home.util.j.k() == null)
			//*  32   66:invokestatic    #66  <Method com.irobot.core.AssetId j.k()>
			//*  33   69:ifnonnull       83
						{
							s = ac.f();
			//   34   72:invokestatic    #32  <Method String ac.f()>
			//   35   75:astore          4
							obj = "Unexpected current asset Id! Need attention!";
			//   36   77:ldc1            #68  <String "Unexpected current asset Id! Need attention!">
			//   37   79:astore_3        
						} else
			//*  38   80:goto            22
						{
							if(com.irobot.home.fragments.ac.a(a) != null && com.irobot.home.fragments.ac.a(a).remove(obj) && ac.b(a) != null)
			//*  39   83:aload_0         
			//*  40   84:getfield        #14  <Field ac a>
			//*  41   87:invokestatic    #22  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
			//*  42   90:ifnull          148
			//*  43   93:aload_0         
			//*  44   94:getfield        #14  <Field ac a>
			//*  45   97:invokestatic    #22  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
			//*  46  100:aload_3         
			//*  47  101:invokevirtual   #71  <Method boolean ArrayList.remove(Object)>
			//*  48  104:ifeq            148
			//*  49  107:aload_0         
			//*  50  108:getfield        #14  <Field ac a>
			//*  51  111:invokestatic    #75  <Method ac$a ac.b(ac)>
			//*  52  114:ifnull          148
							{
								ac.b(a).d(k);
			//   53  117:aload_0         
			//   54  118:getfield        #14  <Field ac a>
			//   55  121:invokestatic    #75  <Method ac$a ac.b(ac)>
			//   56  124:iload_1         
			//   57  125:invokevirtual   #80  <Method void ac$a.d(int)>
								if(com.irobot.home.fragments.ac.a(a).size() == 0)
			//*  58  128:aload_0         
			//*  59  129:getfield        #14  <Field ac a>
			//*  60  132:invokestatic    #22  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
			//*  61  135:invokevirtual   #28  <Method int ArrayList.size()>
			//*  62  138:ifne            148
									a.b();
			//   63  141:aload_0         
			//   64  142:getfield        #14  <Field ac a>
			//   65  145:invokevirtual   #82  <Method void ac.b()>
							}
							ScheduleTableViewActivity_.a(((Context) (a.getActivity()))).a(a.a).a();
			//   66  148:aload_0         
			//   67  149:getfield        #14  <Field ac a>
			//   68  152:invokevirtual   #86  <Method android.app.Activity ac.getActivity()>
			//   69  155:invokestatic    #91  <Method com.irobot.home.ScheduleTableViewActivity_$a ScheduleTableViewActivity_.a(Context)>
			//   70  158:aload_0         
			//   71  159:getfield        #14  <Field ac a>
			//   72  162:getfield        #94  <Field String com.irobot.home.fragments.ac.a>
			//   73  165:invokevirtual   #99  <Method com.irobot.home.ScheduleTableViewActivity_$a com.irobot.home.ScheduleTableViewActivity_$a.a(String)>
			//   74  168:invokevirtual   #102 <Method org.androidannotations.api.a.e com.irobot.home.ScheduleTableViewActivity_$a.a()>
			//   75  171:pop             
							return;
			//   76  172:return          
						}
					} else
					{
						com.irobot.home.fragments.ac.a(a, ac.c(a), ((NotificationCenterDataItem) (obj)), NotificationCenterServiceCommand.MarkNotificationRead);
			//   77  173:aload_0         
			//   78  174:getfield        #14  <Field ac a>
			//   79  177:aload_0         
			//   80  178:getfield        #14  <Field ac a>
			//   81  181:invokestatic    #106 <Method NotificationCenterUIService ac.c(ac)>
			//   82  184:aload_3         
			//   83  185:getstatic       #112 <Field NotificationCenterServiceCommand NotificationCenterServiceCommand.MarkNotificationRead>
			//   84  188:invokestatic    #115 <Method void com.irobot.home.fragments.ac.a(ac, NotificationCenterUIService, NotificationCenterDataItem, NotificationCenterServiceCommand)>
						com.irobot.home.fragments.ac.a(a, k);
			//   85  191:aload_0         
			//   86  192:getfield        #14  <Field ac a>
			//   87  195:iload_1         
			//   88  196:invokestatic    #118 <Method void com.irobot.home.fragments.ac.a(ac, int)>
						NotificationDetailsActivity_.a(((Context) (a.getActivity()))).a(((NotificationCenterDataItem) (obj)).getCategoryTitleText()).b(((NotificationCenterDataItem) (obj)).getCategoryIconId()).c(((NotificationCenterDataItem) (obj)).getHeadlineText()).a(((NotificationCenterDataItem) (obj)).getTimestamp()).d(((NotificationCenterDataItem) (obj)).getEventId()).b(((NotificationCenterDataItem) (obj)).getDetailsContentId()).c(((NotificationCenterDataItem) (obj)).getDetailsContentVersion()).a(((NotificationCenterDataItem) (obj)).getActionPayload()).a();
			//   89  199:aload_0         
			//   90  200:getfield        #14  <Field ac a>
			//   91  203:invokevirtual   #86  <Method android.app.Activity ac.getActivity()>
			//   92  206:invokestatic    #123 <Method com.irobot.home.NotificationDetailsActivity_$a NotificationDetailsActivity_.a(Context)>
			//   93  209:aload_3         
			//   94  210:invokevirtual   #126 <Method String NotificationCenterDataItem.getCategoryTitleText()>
			//   95  213:invokevirtual   #131 <Method com.irobot.home.NotificationDetailsActivity_$a com.irobot.home.NotificationDetailsActivity_$a.a(String)>
			//   96  216:aload_3         
			//   97  217:invokevirtual   #134 <Method String NotificationCenterDataItem.getCategoryIconId()>
			//   98  220:invokevirtual   #136 <Method com.irobot.home.NotificationDetailsActivity_$a com.irobot.home.NotificationDetailsActivity_$a.b(String)>
			//   99  223:aload_3         
			//  100  224:invokevirtual   #139 <Method String NotificationCenterDataItem.getHeadlineText()>
			//  101  227:invokevirtual   #141 <Method com.irobot.home.NotificationDetailsActivity_$a com.irobot.home.NotificationDetailsActivity_$a.c(String)>
			//  102  230:aload_3         
			//  103  231:invokevirtual   #144 <Method int NotificationCenterDataItem.getTimestamp()>
			//  104  234:i2l             
			//  105  235:invokevirtual   #147 <Method com.irobot.home.NotificationDetailsActivity_$a com.irobot.home.NotificationDetailsActivity_$a.a(long)>
			//  106  238:aload_3         
			//  107  239:invokevirtual   #150 <Method String NotificationCenterDataItem.getEventId()>
			//  108  242:invokevirtual   #152 <Method com.irobot.home.NotificationDetailsActivity_$a com.irobot.home.NotificationDetailsActivity_$a.d(String)>
			//  109  245:aload_3         
			//  110  246:invokevirtual   #155 <Method int NotificationCenterDataItem.getDetailsContentId()>
			//  111  249:invokevirtual   #158 <Method com.irobot.home.NotificationDetailsActivity_$a com.irobot.home.NotificationDetailsActivity_$a.b(int)>
			//  112  252:aload_3         
			//  113  253:invokevirtual   #161 <Method int NotificationCenterDataItem.getDetailsContentVersion()>
			//  114  256:invokevirtual   #163 <Method com.irobot.home.NotificationDetailsActivity_$a com.irobot.home.NotificationDetailsActivity_$a.c(int)>
			//  115  259:aload_3         
			//  116  260:invokevirtual   #167 <Method ArrayList NotificationCenterDataItem.getActionPayload()>
			//  117  263:invokevirtual   #170 <Method com.irobot.home.NotificationDetailsActivity_$a com.irobot.home.NotificationDetailsActivity_$a.a(ArrayList)>
			//  118  266:invokevirtual   #171 <Method org.androidannotations.api.a.e com.irobot.home.NotificationDetailsActivity_$a.a()>
			//  119  269:pop             
						return;
			//  120  270:return          
					}
				}
				o.e(s, ((String) (obj)));
			}

			final ac a;

			
			{
				a = ac.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ac a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    7   15:aload_0         
	//    8   16:new             #6   <Class ac$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #50  <Method void ac$1(ac)>
	//   12   24:putfield        #52  <Field ac$b j>
	//   13   27:return          
	}

	static ArrayList a(ac ac1)
	{
		return ac1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList f>
	//    2    4:areturn         
	}

	private void a(int k)
	{
		if(f != null && k >= 0 && k < f.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field ArrayList f>
	//*   2    4:ifnull          44
	//*   3    7:iload_1         
	//*   4    8:iflt            44
	//*   5   11:iload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #47  <Field ArrayList f>
	//*   8   16:invokevirtual   #58  <Method int ArrayList.size()>
	//*   9   19:icmpge          44
		{
			((NotificationCenterDataItem)f.get(k)).setNotificationAsRead();
	//   10   22:aload_0         
	//   11   23:getfield        #47  <Field ArrayList f>
	//   12   26:iload_1         
	//   13   27:invokevirtual   #62  <Method Object ArrayList.get(int)>
	//   14   30:checkcast       #64  <Class NotificationCenterDataItem>
	//   15   33:invokevirtual   #67  <Method void NotificationCenterDataItem.setNotificationAsRead()>
			e.c(k);
	//   16   36:aload_0         
	//   17   37:getfield        #69  <Field ac$a e>
	//   18   40:iload_1         
	//   19   41:invokevirtual   #71  <Method void ac$a.c(int)>
		}
	//   20   44:return          
	}

	private void a(NotificationCenterUIService notificationcenteruiservice, NotificationCenterDataItem notificationcenterdataitem, NotificationCenterServiceCommand notificationcenterservicecommand)
	{
		NotificationCenterUIServiceData notificationcenteruiservicedata = NotificationCenterUIServiceData.create();
	//    0    0:invokestatic    #78  <Method NotificationCenterUIServiceData NotificationCenterUIServiceData.create()>
	//    1    3:astore          4
		notificationcenteruiservicedata.setNotificationToUpdate(notificationcenterdataitem);
	//    2    5:aload           4
	//    3    7:aload_2         
	//    4    8:invokevirtual   #82  <Method void NotificationCenterUIServiceData.setNotificationToUpdate(NotificationCenterDataItem)>
		notificationcenteruiservice.sendCommand(notificationcenterservicecommand, notificationcenteruiservicedata);
	//    5   11:aload_1         
	//    6   12:aload_3         
	//    7   13:aload           4
	//    8   15:invokevirtual   #88  <Method void NotificationCenterUIService.sendCommand(NotificationCenterServiceCommand, NotificationCenterUIServiceData)>
	//    9   18:return          
	}

	static void a(ac ac1, int k)
	{
		ac1.a(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #91  <Method void a(int)>
	//    3    5:return          
	}

	static void a(ac ac1, NotificationCenterUIService notificationcenteruiservice, NotificationCenterDataItem notificationcenterdataitem, NotificationCenterServiceCommand notificationcenterservicecommand)
	{
		ac1.a(notificationcenteruiservice, notificationcenterdataitem, notificationcenterservicecommand);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #94  <Method void a(NotificationCenterUIService, NotificationCenterDataItem, NotificationCenterServiceCommand)>
	//    5    7:return          
	}

	static a b(ac ac1)
	{
		return ac1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field ac$a e>
	//    2    4:areturn         
	}

	static NotificationCenterUIService c(ac ac1)
	{
		return ac1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field NotificationCenterUIService g>
	//    2    4:areturn         
	}

	static String f()
	{
		return d;
	//    0    0:getstatic       #101 <Field String d>
	//    1    3:areturn         
	}

	public void a()
	{
		e = new a(((Context) (getActivity())), j);
	//    0    0:aload_0         
	//    1    1:new             #12  <Class ac$a>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #105 <Method android.app.Activity getActivity()>
	//    6   10:aload_0         
	//    7   11:getfield        #52  <Field ac$b j>
	//    8   14:invokespecial   #108 <Method void ac$a(ac, Context, ac$b)>
	//    9   17:putfield        #69  <Field ac$a e>
		b.setLayoutManager(((android.support.v7.widget.RecyclerView.h) (new LinearLayoutManager(((Context) (getActivity())), 1, false))));
	//   10   20:aload_0         
	//   11   21:getfield        #110 <Field RecyclerView b>
	//   12   24:new             #112 <Class LinearLayoutManager>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokevirtual   #105 <Method android.app.Activity getActivity()>
	//   16   32:iconst_1        
	//   17   33:iconst_0        
	//   18   34:invokespecial   #115 <Method void LinearLayoutManager(Context, int, boolean)>
	//   19   37:invokevirtual   #121 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
		b.setNestedScrollingEnabled(false);
	//   20   40:aload_0         
	//   21   41:getfield        #110 <Field RecyclerView b>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #125 <Method void RecyclerView.setNestedScrollingEnabled(boolean)>
		b.setAdapter(((android.support.v7.widget.RecyclerView.a) (e)));
	//   24   48:aload_0         
	//   25   49:getfield        #110 <Field RecyclerView b>
	//   26   52:aload_0         
	//   27   53:getfield        #69  <Field ac$a e>
	//   28   56:invokevirtual   #129 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		x x1 = new x(b.getContext(), 1);
	//   29   59:new             #131 <Class x>
	//   30   62:dup             
	//   31   63:aload_0         
	//   32   64:getfield        #110 <Field RecyclerView b>
	//   33   67:invokevirtual   #135 <Method Context RecyclerView.getContext()>
	//   34   70:iconst_1        
	//   35   71:invokespecial   #138 <Method void x(Context, int)>
	//   36   74:astore_1        
		x1.a(android.support.v4.content.a.getDrawable(((Context) (getActivity())), 0x7f080113));
	//   37   75:aload_1         
	//   38   76:aload_0         
	//   39   77:invokevirtual   #105 <Method android.app.Activity getActivity()>
	//   40   80:ldc1            #139 <Int 0x7f080113>
	//   41   82:invokestatic    #145 <Method android.graphics.drawable.Drawable a.getDrawable(Context, int)>
	//   42   85:invokevirtual   #148 <Method void x.a(android.graphics.drawable.Drawable)>
		b.a(((android.support.v7.widget.RecyclerView.g) (x1)));
	//   43   88:aload_0         
	//   44   89:getfield        #110 <Field RecyclerView b>
	//   45   92:aload_1         
	//   46   93:invokevirtual   #151 <Method void RecyclerView.a(android.support.v7.widget.RecyclerView$g)>
		i = ((v) (new v(((Context) (getActivity())), b) {

			public void a(android.support.v7.widget.RecyclerView.u u, ArrayList arraylist)
			{
				arraylist.add(((Object) ((new com.irobot.home.view.RevealableView.a(((Context) (a.getActivity())))).a(0x7f0600a1).b(0x7f08012c).a(new com.irobot.home.view.RevealableView.b(this) {

					public void a(int k)
					{
						if(com.irobot.home.fragments.ac.a(a.a) != null && ac.b(a.a) != null && k >= 0 && k < com.irobot.home.fragments.ac.a(a.a).size())
					//*   0    0:aload_0         
					//*   1    1:getfield        #16  <Field ac$2 a>
					//*   2    4:getfield        #24  <Field ac com.irobot.home.fragments.ac$2.a>
					//*   3    7:invokestatic    #29  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
					//*   4   10:ifnull          146
					//*   5   13:aload_0         
					//*   6   14:getfield        #16  <Field ac$2 a>
					//*   7   17:getfield        #24  <Field ac com.irobot.home.fragments.ac$2.a>
					//*   8   20:invokestatic    #33  <Method ac$a ac.b(ac)>
					//*   9   23:ifnull          146
					//*  10   26:iload_1         
					//*  11   27:iflt            146
					//*  12   30:iload_1         
					//*  13   31:aload_0         
					//*  14   32:getfield        #16  <Field ac$2 a>
					//*  15   35:getfield        #24  <Field ac com.irobot.home.fragments.ac$2.a>
					//*  16   38:invokestatic    #29  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
					//*  17   41:invokevirtual   #39  <Method int ArrayList.size()>
					//*  18   44:icmpge          146
						{
							NotificationCenterDataItem notificationcenterdataitem = (NotificationCenterDataItem)com.irobot.home.fragments.ac.a(a.a).get(k);
					//   19   47:aload_0         
					//   20   48:getfield        #16  <Field ac$2 a>
					//   21   51:getfield        #24  <Field ac com.irobot.home.fragments.ac$2.a>
					//   22   54:invokestatic    #29  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
					//   23   57:iload_1         
					//   24   58:invokevirtual   #43  <Method Object ArrayList.get(int)>
					//   25   61:checkcast       #45  <Class NotificationCenterDataItem>
					//   26   64:astore_2        
							com.irobot.home.fragments.ac.a(a.a, ac.c(a.a), notificationcenterdataitem, NotificationCenterServiceCommand.DismissNotification);
					//   27   65:aload_0         
					//   28   66:getfield        #16  <Field ac$2 a>
					//   29   69:getfield        #24  <Field ac com.irobot.home.fragments.ac$2.a>
					//   30   72:aload_0         
					//   31   73:getfield        #16  <Field ac$2 a>
					//   32   76:getfield        #24  <Field ac com.irobot.home.fragments.ac$2.a>
					//   33   79:invokestatic    #49  <Method NotificationCenterUIService ac.c(ac)>
					//   34   82:aload_2         
					//   35   83:getstatic       #55  <Field NotificationCenterServiceCommand NotificationCenterServiceCommand.DismissNotification>
					//   36   86:invokestatic    #58  <Method void com.irobot.home.fragments.ac.a(ac, NotificationCenterUIService, NotificationCenterDataItem, NotificationCenterServiceCommand)>
							if(com.irobot.home.fragments.ac.a(a.a).remove(((Object) (notificationcenterdataitem))))
					//*  37   89:aload_0         
					//*  38   90:getfield        #16  <Field ac$2 a>
					//*  39   93:getfield        #24  <Field ac com.irobot.home.fragments.ac$2.a>
					//*  40   96:invokestatic    #29  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
					//*  41   99:aload_2         
					//*  42  100:invokevirtual   #62  <Method boolean ArrayList.remove(Object)>
					//*  43  103:ifeq            146
							{
								ac.b(a.a).d(k);
					//   44  106:aload_0         
					//   45  107:getfield        #16  <Field ac$2 a>
					//   46  110:getfield        #24  <Field ac com.irobot.home.fragments.ac$2.a>
					//   47  113:invokestatic    #33  <Method ac$a ac.b(ac)>
					//   48  116:iload_1         
					//   49  117:invokevirtual   #67  <Method void ac$a.d(int)>
								if(com.irobot.home.fragments.ac.a(a.a).size() == 0)
					//*  50  120:aload_0         
					//*  51  121:getfield        #16  <Field ac$2 a>
					//*  52  124:getfield        #24  <Field ac com.irobot.home.fragments.ac$2.a>
					//*  53  127:invokestatic    #29  <Method ArrayList com.irobot.home.fragments.ac.a(ac)>
					//*  54  130:invokevirtual   #39  <Method int ArrayList.size()>
					//*  55  133:ifne            146
									a.a.b();
					//   56  136:aload_0         
					//   57  137:getfield        #16  <Field ac$2 a>
					//   58  140:getfield        #24  <Field ac com.irobot.home.fragments.ac$2.a>
					//   59  143:invokevirtual   #69  <Method void ac.b()>
							}
						}
					//   60  146:return          
					}

					final _cls2 a;

			
			{
				a = _pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ac$2 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).a())));
			//    0    0:aload_2         
			//    1    1:new             #23  <Class com.irobot.home.view.RevealableView$a>
			//    2    4:dup             
			//    3    5:aload_0         
			//    4    6:getfield        #16  <Field ac a>
			//    5    9:invokevirtual   #27  <Method android.app.Activity ac.getActivity()>
			//    6   12:invokespecial   #30  <Method void com.irobot.home.view.RevealableView$a(Context)>
			//    7   15:ldc1            #31  <Int 0x7f0600a1>
			//    8   17:invokevirtual   #34  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(int)>
			//    9   20:ldc1            #35  <Int 0x7f08012c>
			//   10   22:invokevirtual   #38  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.b(int)>
			//   11   25:new             #11  <Class ac$2$1>
			//   12   28:dup             
			//   13   29:aload_0         
			//   14   30:invokespecial   #41  <Method void ac$2$1(ac$2)>
			//   15   33:invokevirtual   #44  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(com.irobot.home.view.RevealableView$b)>
			//   16   36:invokevirtual   #47  <Method com.irobot.home.view.RevealableView com.irobot.home.view.RevealableView$a.a()>
			//   17   39:invokevirtual   #53  <Method boolean ArrayList.add(Object)>
			//   18   42:pop             
			//   19   43:return          
			}

			final ac a;

			
			{
				a = ac.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ac a>
				super(context, recyclerview);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #19  <Method void v(Context, RecyclerView)>
			//    7   11:return          
			}
		}
));
	//   47   96:aload_0         
	//   48   97:new             #8   <Class ac$2>
	//   49  100:dup             
	//   50  101:aload_0         
	//   51  102:aload_0         
	//   52  103:invokevirtual   #105 <Method android.app.Activity getActivity()>
	//   53  106:aload_0         
	//   54  107:getfield        #110 <Field RecyclerView b>
	//   55  110:invokespecial   #154 <Method void ac$2(ac, Context, RecyclerView)>
	//   56  113:putfield        #156 <Field v i>
		h = new android.support.v7.widget.a.a(((android.support.v7.widget.a.a.a) (i)));
	//   57  116:aload_0         
	//   58  117:new             #158 <Class android.support.v7.widget.a.a>
	//   59  120:dup             
	//   60  121:aload_0         
	//   61  122:getfield        #156 <Field v i>
	//   62  125:invokespecial   #161 <Method void android.support.v7.widget.a.a(android.support.v7.widget.a.a$a)>
	//   63  128:putfield        #163 <Field android.support.v7.widget.a.a h>
		h.a(b);
	//   64  131:aload_0         
	//   65  132:getfield        #163 <Field android.support.v7.widget.a.a h>
	//   66  135:aload_0         
	//   67  136:getfield        #110 <Field RecyclerView b>
	//   68  139:invokevirtual   #166 <Method void android.support.v7.widget.a.a.a(RecyclerView)>
	//   69  142:return          
	}

	public void a(NotificationCenterDataItem notificationcenterdataitem)
	{
		if(com.irobot.home.util.j.a(a) != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field String a>
	//    2    4:invokestatic    #173 <Method com.irobot.home.model.a j.a(String)>
	//    3    7:ifnonnull       23
_L1:
		String s;
		s = d;
	//    4   10:getstatic       #101 <Field String d>
	//    5   13:astore_3        
		notificationcenterdataitem = "Unexpected NULL asset on notification selected!";
	//    6   14:ldc1            #175 <String "Unexpected NULL asset on notification selected!">
	//    7   16:astore_1        
_L4:
		o.e(s, ((String) (notificationcenterdataitem)));
	//    8   17:aload_3         
	//    9   18:aload_1         
	//   10   19:invokestatic    #180 <Method void o.e(String, String)>
		return;
	//   11   22:return          
_L2:
		if(notificationcenterdataitem != null)
			break; /* Loop/switch isn't completed */
	//   12   23:aload_1         
	//   13   24:ifnonnull       37
		s = d;
	//   14   27:getstatic       #101 <Field String d>
	//   15   30:astore_3        
		notificationcenterdataitem = "Unexpected NULL NotificationCenterDataItem on notification selected!";
	//   16   31:ldc1            #182 <String "Unexpected NULL NotificationCenterDataItem on notification selected!">
	//   17   33:astore_1        
		if(true) goto _L4; else goto _L3
	//   18   34:goto            17
_L3:
		boolean flag = notificationcenterdataitem.getNotificationType().equals("SmartScheduleRecommendation");
	//   19   37:aload_1         
	//   20   38:invokevirtual   #185 <Method String NotificationCenterDataItem.getNotificationType()>
	//   21   41:ldc1            #187 <String "SmartScheduleRecommendation">
	//   22   43:invokevirtual   #193 <Method boolean String.equals(Object)>
	//   23   46:istore_2        
		com.irobot.core.AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//   24   47:aload_0         
	//   25   48:getfield        #168 <Field String a>
	//   26   51:invokestatic    #173 <Method com.irobot.home.model.a j.a(String)>
	//   27   54:invokevirtual   #198 <Method com.irobot.core.AssetInfo com.irobot.home.model.a.a()>
	//   28   57:astore_3        
		if(flag)
	//*  29   58:iload_2         
	//*  30   59:ifeq            85
		{
			AnalyticsSubsystem.getInstance().trackNotificationSmartScheduleMessageSelected(assetinfo, notificationcenterdataitem.getEventId(), notificationcenterdataitem.getV1ScheduleDayMap().size(), notificationcenterdataitem.getSchedulingVersion());
	//   31   62:invokestatic    #204 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   32   65:aload_3         
	//   33   66:aload_1         
	//   34   67:invokevirtual   #207 <Method String NotificationCenterDataItem.getEventId()>
	//   35   70:aload_1         
	//   36   71:invokevirtual   #211 <Method HashMap NotificationCenterDataItem.getV1ScheduleDayMap()>
	//   37   74:invokevirtual   #214 <Method int HashMap.size()>
	//   38   77:aload_1         
	//   39   78:invokevirtual   #217 <Method String NotificationCenterDataItem.getSchedulingVersion()>
	//   40   81:invokevirtual   #221 <Method void AnalyticsSubsystem.trackNotificationSmartScheduleMessageSelected(com.irobot.core.AssetInfo, String, int, String)>
			return;
	//   41   84:return          
		} else
		{
			AnalyticsSubsystem.getInstance().trackNotificationSelected(assetinfo, notificationcenterdataitem.getEventId(), notificationcenterdataitem.getDetailsContentId(), notificationcenterdataitem.getDetailsContentVersion());
	//   42   85:invokestatic    #204 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   43   88:aload_3         
	//   44   89:aload_1         
	//   45   90:invokevirtual   #207 <Method String NotificationCenterDataItem.getEventId()>
	//   46   93:aload_1         
	//   47   94:invokevirtual   #224 <Method int NotificationCenterDataItem.getDetailsContentId()>
	//   48   97:aload_1         
	//   49   98:invokevirtual   #227 <Method int NotificationCenterDataItem.getDetailsContentVersion()>
	//   50  101:invokevirtual   #231 <Method void AnalyticsSubsystem.trackNotificationSelected(com.irobot.core.AssetInfo, String, int, int)>
			return;
	//   51  104:return          
		}
	}

	public void a(NotificationCenterUIService notificationcenteruiservice)
	{
		g = notificationcenteruiservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field NotificationCenterUIService g>
	//    3    5:return          
	}

	public void a(ArrayList arraylist)
	{
		if(arraylist == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.e(d, "[HKC] Received null list of notification!");
	//    2    4:getstatic       #101 <Field String d>
	//    3    7:ldc1            #235 <String "[HKC] Received null list of notification!">
	//    4    9:invokestatic    #180 <Method void o.e(String, String)>
			return;
	//    5   12:return          
		} else
		{
			f.clear();
	//    6   13:aload_0         
	//    7   14:getfield        #47  <Field ArrayList f>
	//    8   17:invokevirtual   #238 <Method void ArrayList.clear()>
			f.addAll(((java.util.Collection) (arraylist)));
	//    9   20:aload_0         
	//   10   21:getfield        #47  <Field ArrayList f>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #242 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   13   28:pop             
			c();
	//   14   29:aload_0         
	//   15   30:invokevirtual   #244 <Method void c()>
			return;
	//   16   33:return          
		}
	}

	public void b()
	{
		b.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field RecyclerView b>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #249 <Method void RecyclerView.setVisibility(int)>
		c.setVisibility(0);
	//    4    9:aload_0         
	//    5   10:getfield        #251 <Field RelativeLayout c>
	//    6   13:iconst_0        
	//    7   14:invokevirtual   #254 <Method void RelativeLayout.setVisibility(int)>
	//    8   17:return          
	}

	public void c()
	{
		if(f.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field ArrayList f>
	//*   2    4:invokevirtual   #58  <Method int ArrayList.size()>
	//*   3    7:ifne            15
		{
			b();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #256 <Method void b()>
			return;
	//    6   14:return          
		} else
		{
			c.setVisibility(8);
	//    7   15:aload_0         
	//    8   16:getfield        #251 <Field RelativeLayout c>
	//    9   19:bipush          8
	//   10   21:invokevirtual   #254 <Method void RelativeLayout.setVisibility(int)>
			b.setVisibility(0);
	//   11   24:aload_0         
	//   12   25:getfield        #110 <Field RecyclerView b>
	//   13   28:iconst_0        
	//   14   29:invokevirtual   #249 <Method void RecyclerView.setVisibility(int)>
			e.e();
	//   15   32:aload_0         
	//   16   33:getfield        #69  <Field ac$a e>
	//   17   36:invokevirtual   #258 <Method void ac$a.e()>
			return;
	//   18   39:return          
		}
	}

	public void d()
	{
		o.b(d, "Sent viewed analytics for notification center");
	//    0    0:getstatic       #101 <Field String d>
	//    1    3:ldc2            #260 <String "Sent viewed analytics for notification center">
	//    2    6:invokestatic    #262 <Method void o.b(String, String)>
		e();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #263 <Method void e()>
	//    5   13:return          
	}

	public void e()
	{
		if(com.irobot.home.util.j.j() == null)
	//*   0    0:invokestatic    #266 <Method com.irobot.home.model.a j.j()>
	//*   1    3:ifnonnull       16
		{
			o.e(d, "[HKC] Unexpected empty asset on notification feedback!");
	//    2    6:getstatic       #101 <Field String d>
	//    3    9:ldc2            #268 <String "[HKC] Unexpected empty asset on notification feedback!">
	//    4   12:invokestatic    #180 <Method void o.e(String, String)>
			return;
	//    5   15:return          
		} else
		{
			com.irobot.core.AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//    6   16:invokestatic    #266 <Method com.irobot.home.model.a j.j()>
	//    7   19:invokevirtual   #198 <Method com.irobot.core.AssetInfo com.irobot.home.model.a.a()>
	//    8   22:astore_1        
			AnalyticsSubsystem.getInstance().trackNotificationCenterViewed(assetinfo, f.size());
	//    9   23:invokestatic    #204 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   10   26:aload_1         
	//   11   27:aload_0         
	//   12   28:getfield        #47  <Field ArrayList f>
	//   13   31:invokevirtual   #58  <Method int ArrayList.size()>
	//   14   34:invokevirtual   #272 <Method void AnalyticsSubsystem.trackNotificationCenterViewed(com.irobot.core.AssetInfo, int)>
			return;
	//   15   37:return          
		}
	}

	private static final String d = "ac";
	String a;
	RecyclerView b;
	RelativeLayout c;
	private a e;
	private ArrayList f;
	private NotificationCenterUIService g;
	private android.support.v7.widget.a.a h;
	private v i;
	private b j;

	static 
	{
	//    0    0:return          
	}
}
