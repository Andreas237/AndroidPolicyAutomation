// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.view.View;
import android.view.animation.Animation;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.view:
//			ExpandablePanel

private class ExpandablePanel$d
	implements android.view.er
{

	public void onClick(View view)
	{
		if(ExpandablePanel.a(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ExpandablePanel a>
	//*   2    4:invokestatic    #27  <Method boolean ExpandablePanel.a(ExpandablePanel)>
	//*   3    7:ifeq            120
		{
			view = ((View) (new StringBuilder()));
	//    4   10:new             #29  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #30  <Method void StringBuilder()>
	//    7   17:astore_1        
			((StringBuilder) (view)).append("Collapsefrom ");
	//    8   18:aload_1         
	//    9   19:ldc1            #32  <String "Collapsefrom ">
	//   10   21:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			((StringBuilder) (view)).append(ExpandablePanel.b(a));
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:getfield        #15  <Field ExpandablePanel a>
	//   15   30:invokestatic    #40  <Method int ExpandablePanel.b(ExpandablePanel)>
	//   16   33:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   17   36:pop             
			((StringBuilder) (view)).append(" to ");
	//   18   37:aload_1         
	//   19   38:ldc1            #45  <String " to ">
	//   20   40:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			((StringBuilder) (view)).append(ExpandablePanel.c(a));
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #15  <Field ExpandablePanel a>
	//   25   49:invokestatic    #48  <Method int ExpandablePanel.c(ExpandablePanel)>
	//   26   52:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   27   55:pop             
			o.b("ExpandablePanel", ((StringBuilder) (view)).toString());
	//   28   56:ldc1            #50  <String "ExpandablePanel">
	//   29   58:aload_1         
	//   30   59:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   31   62:invokestatic    #59  <Method void o.b(String, String)>
			view = ((View) (new ExpandablePanel$b(a, ExpandablePanel.b(a), ExpandablePanel.c(a))));
	//   32   65:new             #61  <Class ExpandablePanel$b>
	//   33   68:dup             
	//   34   69:aload_0         
	//   35   70:getfield        #15  <Field ExpandablePanel a>
	//   36   73:aload_0         
	//   37   74:getfield        #15  <Field ExpandablePanel a>
	//   38   77:invokestatic    #40  <Method int ExpandablePanel.b(ExpandablePanel)>
	//   39   80:aload_0         
	//   40   81:getfield        #15  <Field ExpandablePanel a>
	//   41   84:invokestatic    #48  <Method int ExpandablePanel.c(ExpandablePanel)>
	//   42   87:invokespecial   #64  <Method void ExpandablePanel$b(ExpandablePanel, int, int)>
	//   43   90:astore_1        
			ExpandablePanel.f(a).a(ExpandablePanel.d(a), ExpandablePanel.e(a));
	//   44   91:aload_0         
	//   45   92:getfield        #15  <Field ExpandablePanel a>
	//   46   95:invokestatic    #68  <Method ExpandablePanel$c ExpandablePanel.f(ExpandablePanel)>
	//   47   98:aload_0         
	//   48   99:getfield        #15  <Field ExpandablePanel a>
	//   49  102:invokestatic    #71  <Method View ExpandablePanel.d(ExpandablePanel)>
	//   50  105:aload_0         
	//   51  106:getfield        #15  <Field ExpandablePanel a>
	//   52  109:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
	//   53  112:invokeinterface #79  <Method void ExpandablePanel$c.a(View, View)>
		} else
	//*  54  117:goto            227
		{
			view = ((View) (new StringBuilder()));
	//   55  120:new             #29  <Class StringBuilder>
	//   56  123:dup             
	//   57  124:invokespecial   #30  <Method void StringBuilder()>
	//   58  127:astore_1        
			((StringBuilder) (view)).append("Expand from ");
	//   59  128:aload_1         
	//   60  129:ldc1            #81  <String "Expand from ">
	//   61  131:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   62  134:pop             
			((StringBuilder) (view)).append(ExpandablePanel.c(a));
	//   63  135:aload_1         
	//   64  136:aload_0         
	//   65  137:getfield        #15  <Field ExpandablePanel a>
	//   66  140:invokestatic    #48  <Method int ExpandablePanel.c(ExpandablePanel)>
	//   67  143:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   68  146:pop             
			((StringBuilder) (view)).append(" to ");
	//   69  147:aload_1         
	//   70  148:ldc1            #45  <String " to ">
	//   71  150:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   72  153:pop             
			((StringBuilder) (view)).append(ExpandablePanel.b(a));
	//   73  154:aload_1         
	//   74  155:aload_0         
	//   75  156:getfield        #15  <Field ExpandablePanel a>
	//   76  159:invokestatic    #40  <Method int ExpandablePanel.b(ExpandablePanel)>
	//   77  162:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   78  165:pop             
			o.b("ExpandablePanel", ((StringBuilder) (view)).toString());
	//   79  166:ldc1            #50  <String "ExpandablePanel">
	//   80  168:aload_1         
	//   81  169:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   82  172:invokestatic    #59  <Method void o.b(String, String)>
			view = ((View) (new ExpandablePanel$b(a, ExpandablePanel.c(a), ExpandablePanel.b(a))));
	//   83  175:new             #61  <Class ExpandablePanel$b>
	//   84  178:dup             
	//   85  179:aload_0         
	//   86  180:getfield        #15  <Field ExpandablePanel a>
	//   87  183:aload_0         
	//   88  184:getfield        #15  <Field ExpandablePanel a>
	//   89  187:invokestatic    #48  <Method int ExpandablePanel.c(ExpandablePanel)>
	//   90  190:aload_0         
	//   91  191:getfield        #15  <Field ExpandablePanel a>
	//   92  194:invokestatic    #40  <Method int ExpandablePanel.b(ExpandablePanel)>
	//   93  197:invokespecial   #64  <Method void ExpandablePanel$b(ExpandablePanel, int, int)>
	//   94  200:astore_1        
			ExpandablePanel.f(a).b(ExpandablePanel.d(a), ExpandablePanel.e(a));
	//   95  201:aload_0         
	//   96  202:getfield        #15  <Field ExpandablePanel a>
	//   97  205:invokestatic    #68  <Method ExpandablePanel$c ExpandablePanel.f(ExpandablePanel)>
	//   98  208:aload_0         
	//   99  209:getfield        #15  <Field ExpandablePanel a>
	//  100  212:invokestatic    #71  <Method View ExpandablePanel.d(ExpandablePanel)>
	//  101  215:aload_0         
	//  102  216:getfield        #15  <Field ExpandablePanel a>
	//  103  219:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
	//  104  222:invokeinterface #83  <Method void ExpandablePanel$c.b(View, View)>
		}
		StringBuilder stringbuilder = new StringBuilder();
	//  105  227:new             #29  <Class StringBuilder>
	//  106  230:dup             
	//  107  231:invokespecial   #30  <Method void StringBuilder()>
	//  108  234:astore_2        
		stringbuilder.append("Anim duration = ");
	//  109  235:aload_2         
	//  110  236:ldc1            #85  <String "Anim duration = ">
	//  111  238:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  112  241:pop             
		stringbuilder.append(ExpandablePanel.g(a));
	//  113  242:aload_2         
	//  114  243:aload_0         
	//  115  244:getfield        #15  <Field ExpandablePanel a>
	//  116  247:invokestatic    #88  <Method int ExpandablePanel.g(ExpandablePanel)>
	//  117  250:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//  118  253:pop             
		o.b("ExpandablePanel", stringbuilder.toString());
	//  119  254:ldc1            #50  <String "ExpandablePanel">
	//  120  256:aload_2         
	//  121  257:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  122  260:invokestatic    #59  <Method void o.b(String, String)>
		((Animation) (view)).setDuration(ExpandablePanel.g(a));
	//  123  263:aload_1         
	//  124  264:aload_0         
	//  125  265:getfield        #15  <Field ExpandablePanel a>
	//  126  268:invokestatic    #88  <Method int ExpandablePanel.g(ExpandablePanel)>
	//  127  271:i2l             
	//  128  272:invokevirtual   #94  <Method void Animation.setDuration(long)>
		ExpandablePanel.e(a).startAnimation(((Animation) (view)));
	//  129  275:aload_0         
	//  130  276:getfield        #15  <Field ExpandablePanel a>
	//  131  279:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
	//  132  282:aload_1         
	//  133  283:invokevirtual   #100 <Method void View.startAnimation(Animation)>
		ExpandablePanel.e(a).getAnimation().reset();
	//  134  286:aload_0         
	//  135  287:getfield        #15  <Field ExpandablePanel a>
	//  136  290:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
	//  137  293:invokevirtual   #104 <Method Animation View.getAnimation()>
	//  138  296:invokevirtual   #107 <Method void Animation.reset()>
		ExpandablePanel.e(a).getAnimation().start();
	//  139  299:aload_0         
	//  140  300:getfield        #15  <Field ExpandablePanel a>
	//  141  303:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
	//  142  306:invokevirtual   #104 <Method Animation View.getAnimation()>
	//  143  309:invokevirtual   #110 <Method void Animation.start()>
		ExpandablePanel.e(a).requestLayout();
	//  144  312:aload_0         
	//  145  313:getfield        #15  <Field ExpandablePanel a>
	//  146  316:invokestatic    #74  <Method View ExpandablePanel.e(ExpandablePanel)>
	//  147  319:invokevirtual   #113 <Method void View.requestLayout()>
		ExpandablePanel.a(a, ExpandablePanel.a(a) ^ true);
	//  148  322:aload_0         
	//  149  323:getfield        #15  <Field ExpandablePanel a>
	//  150  326:aload_0         
	//  151  327:getfield        #15  <Field ExpandablePanel a>
	//  152  330:invokestatic    #27  <Method boolean ExpandablePanel.a(ExpandablePanel)>
	//  153  333:iconst_1        
	//  154  334:ixor            
	//  155  335:invokestatic    #116 <Method boolean ExpandablePanel.a(ExpandablePanel, boolean)>
	//  156  338:pop             
	//  157  339:return          
	}

	final ExpandablePanel a;

	private ExpandablePanel$d(ExpandablePanel expandablepanel)
	{
		a = expandablepanel;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ExpandablePanel a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	ExpandablePanel$d(ExpandablePanel expandablepanel, ExpandablePanel$1 expandablepanel$1)
	{
		this(expandablepanel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void ExpandablePanel$d(ExpandablePanel)>
	//    3    5:return          
	}
}
