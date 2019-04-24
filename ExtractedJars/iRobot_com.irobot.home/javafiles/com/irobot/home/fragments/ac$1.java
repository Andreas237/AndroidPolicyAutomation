// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.NotificationCenterDataItem;
import com.irobot.core.NotificationCenterServiceCommand;
import com.irobot.home.NotificationDetailsActivity_;
import com.irobot.home.ScheduleTableViewActivity_;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home.fragments:
//			ac

class ac$1
	implements ac$b
{

	public void a(int i)
	{
		Object obj;
		String s;
		if(i >= ac.a(a).size())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #14  <Field ac a>
	//*   3    5:invokestatic    #22  <Method ArrayList ac.a(ac)>
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
			obj = ((Object) ((NotificationCenterDataItem)ac.a(a).get(i)));
	//   14   29:aload_0         
	//   15   30:getfield        #14  <Field ac a>
	//   16   33:invokestatic    #22  <Method ArrayList ac.a(ac)>
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
	//   29   59:invokevirtual   #60  <Method void ac.a(NotificationCenterDataItem)>
			if(flag)
	//*  30   62:iload_2         
	//*  31   63:ifeq            173
			{
				if(j.k() == null)
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
					if(ac.a(a) != null && ac.a(a).remove(obj) && ac.b(a) != null)
	//*  39   83:aload_0         
	//*  40   84:getfield        #14  <Field ac a>
	//*  41   87:invokestatic    #22  <Method ArrayList ac.a(ac)>
	//*  42   90:ifnull          148
	//*  43   93:aload_0         
	//*  44   94:getfield        #14  <Field ac a>
	//*  45   97:invokestatic    #22  <Method ArrayList ac.a(ac)>
	//*  46  100:aload_3         
	//*  47  101:invokevirtual   #71  <Method boolean ArrayList.remove(Object)>
	//*  48  104:ifeq            148
	//*  49  107:aload_0         
	//*  50  108:getfield        #14  <Field ac a>
	//*  51  111:invokestatic    #75  <Method ac$a ac.b(ac)>
	//*  52  114:ifnull          148
					{
						ac.b(a).d(i);
	//   53  117:aload_0         
	//   54  118:getfield        #14  <Field ac a>
	//   55  121:invokestatic    #75  <Method ac$a ac.b(ac)>
	//   56  124:iload_1         
	//   57  125:invokevirtual   #80  <Method void ac$a.d(int)>
						if(ac.a(a).size() == 0)
	//*  58  128:aload_0         
	//*  59  129:getfield        #14  <Field ac a>
	//*  60  132:invokestatic    #22  <Method ArrayList ac.a(ac)>
	//*  61  135:invokevirtual   #28  <Method int ArrayList.size()>
	//*  62  138:ifne            148
							a.b();
	//   63  141:aload_0         
	//   64  142:getfield        #14  <Field ac a>
	//   65  145:invokevirtual   #82  <Method void ac.b()>
					}
					ScheduleTableViewActivity_.a(((android.content.Context) (a.getActivity()))).a(a.a).a();
	//   66  148:aload_0         
	//   67  149:getfield        #14  <Field ac a>
	//   68  152:invokevirtual   #86  <Method android.app.Activity ac.getActivity()>
	//   69  155:invokestatic    #91  <Method com.irobot.home.ScheduleTableViewActivity_$a ScheduleTableViewActivity_.a(android.content.Context)>
	//   70  158:aload_0         
	//   71  159:getfield        #14  <Field ac a>
	//   72  162:getfield        #94  <Field String ac.a>
	//   73  165:invokevirtual   #99  <Method com.irobot.home.ScheduleTableViewActivity_$a com.irobot.home.ScheduleTableViewActivity_$a.a(String)>
	//   74  168:invokevirtual   #102 <Method org.androidannotations.api.a.e com.irobot.home.ScheduleTableViewActivity_$a.a()>
	//   75  171:pop             
					return;
	//   76  172:return          
				}
			} else
			{
				ac.a(a, ac.c(a), ((NotificationCenterDataItem) (obj)), NotificationCenterServiceCommand.MarkNotificationRead);
	//   77  173:aload_0         
	//   78  174:getfield        #14  <Field ac a>
	//   79  177:aload_0         
	//   80  178:getfield        #14  <Field ac a>
	//   81  181:invokestatic    #106 <Method com.irobot.core.NotificationCenterUIService ac.c(ac)>
	//   82  184:aload_3         
	//   83  185:getstatic       #112 <Field NotificationCenterServiceCommand NotificationCenterServiceCommand.MarkNotificationRead>
	//   84  188:invokestatic    #115 <Method void ac.a(ac, com.irobot.core.NotificationCenterUIService, NotificationCenterDataItem, NotificationCenterServiceCommand)>
				ac.a(a, i);
	//   85  191:aload_0         
	//   86  192:getfield        #14  <Field ac a>
	//   87  195:iload_1         
	//   88  196:invokestatic    #118 <Method void ac.a(ac, int)>
				NotificationDetailsActivity_.a(((android.content.Context) (a.getActivity()))).a(((NotificationCenterDataItem) (obj)).getCategoryTitleText()).b(((NotificationCenterDataItem) (obj)).getCategoryIconId()).c(((NotificationCenterDataItem) (obj)).getHeadlineText()).a(((NotificationCenterDataItem) (obj)).getTimestamp()).d(((NotificationCenterDataItem) (obj)).getEventId()).b(((NotificationCenterDataItem) (obj)).getDetailsContentId()).c(((NotificationCenterDataItem) (obj)).getDetailsContentVersion()).a(((NotificationCenterDataItem) (obj)).getActionPayload()).a();
	//   89  199:aload_0         
	//   90  200:getfield        #14  <Field ac a>
	//   91  203:invokevirtual   #86  <Method android.app.Activity ac.getActivity()>
	//   92  206:invokestatic    #123 <Method com.irobot.home.NotificationDetailsActivity_$a NotificationDetailsActivity_.a(android.content.Context)>
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

	ac$1(ac ac1)
	{
		a = ac1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ac a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
