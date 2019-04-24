// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//			Core, ApplicationState, SessionState

class af
	implements Runnable
{

	af(Core core, ApplicationState applicationstate, ApplicationState applicationstate1, SessionState sessionstate, SessionState sessionstate1)
	{
		e = core;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Core e>
		a = applicationstate;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field ApplicationState a>
		b = applicationstate1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field ApplicationState b>
		c = sessionstate;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #24  <Field SessionState c>
		d = sessionstate1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #26  <Field SessionState d>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #29  <Method void Object()>
	//   17   31:return          
	}

	public void run()
	{
		ApplicationState applicationstate = a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ApplicationState a>
	//    2    4:astore_3        
		ApplicationState applicationstate1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field ApplicationState b>
	//    5    9:astore          4
		boolean flag1 = true;
	//    6   11:iconst_1        
	//    7   12:istore_2        
		boolean flag;
		if(applicationstate != applicationstate1)
	//*   8   13:aload_3         
	//*   9   14:aload           4
	//*  10   16:if_acmpeq       67
		{
			e.a(e.y);
	//   11   19:aload_0         
	//   12   20:getfield        #18  <Field Core e>
	//   13   23:aload_0         
	//   14   24:getfield        #18  <Field Core e>
	//   15   27:getfield        #36  <Field ApplicationState Core.y>
	//   16   30:invokevirtual   #39  <Method void Core.a(ApplicationState)>
			e.b(b);
	//   17   33:aload_0         
	//   18   34:getfield        #18  <Field Core e>
	//   19   37:aload_0         
	//   20   38:getfield        #22  <Field ApplicationState b>
	//   21   41:invokevirtual   #41  <Method void Core.b(ApplicationState)>
			e.s();
	//   22   44:aload_0         
	//   23   45:getfield        #18  <Field Core e>
	//   24   48:invokevirtual   #44  <Method void Core.s()>
			e.y = b;
	//   25   51:aload_0         
	//   26   52:getfield        #18  <Field Core e>
	//   27   55:aload_0         
	//   28   56:getfield        #22  <Field ApplicationState b>
	//   29   59:putfield        #36  <Field ApplicationState Core.y>
			flag = true;
	//   30   62:iconst_1        
	//   31   63:istore_1        
		} else
	//*  32   64:goto            69
		{
			flag = false;
	//   33   67:iconst_0        
	//   34   68:istore_1        
		}
		if(c != d)
	//*  35   69:aload_0         
	//*  36   70:getfield        #24  <Field SessionState c>
	//*  37   73:aload_0         
	//*  38   74:getfield        #26  <Field SessionState d>
	//*  39   77:if_acmpeq       126
		{
			e.a(e.L);
	//   40   80:aload_0         
	//   41   81:getfield        #18  <Field Core e>
	//   42   84:aload_0         
	//   43   85:getfield        #18  <Field Core e>
	//   44   88:getfield        #47  <Field SessionState Core.L>
	//   45   91:invokevirtual   #50  <Method void Core.a(SessionState)>
			e.b(d);
	//   46   94:aload_0         
	//   47   95:getfield        #18  <Field Core e>
	//   48   98:aload_0         
	//   49   99:getfield        #26  <Field SessionState d>
	//   50  102:invokevirtual   #52  <Method void Core.b(SessionState)>
			e.t();
	//   51  105:aload_0         
	//   52  106:getfield        #18  <Field Core e>
	//   53  109:invokevirtual   #55  <Method void Core.t()>
			e.L = d;
	//   54  112:aload_0         
	//   55  113:getfield        #18  <Field Core e>
	//   56  116:aload_0         
	//   57  117:getfield        #26  <Field SessionState d>
	//   58  120:putfield        #47  <Field SessionState Core.L>
		} else
	//*  59  123:goto            128
		{
			flag1 = false;
	//   60  126:iconst_0        
	//   61  127:istore_2        
		}
		if(flag)
	//*  62  128:iload_1         
	//*  63  129:ifeq            150
			e.a(a, e.y);
	//   64  132:aload_0         
	//   65  133:getfield        #18  <Field Core e>
	//   66  136:aload_0         
	//   67  137:getfield        #20  <Field ApplicationState a>
	//   68  140:aload_0         
	//   69  141:getfield        #18  <Field Core e>
	//   70  144:getfield        #36  <Field ApplicationState Core.y>
	//   71  147:invokevirtual   #58  <Method void Core.a(ApplicationState, ApplicationState)>
		if(flag1)
	//*  72  150:iload_2         
	//*  73  151:ifeq            172
			e.a(c, e.L);
	//   74  154:aload_0         
	//   75  155:getfield        #18  <Field Core e>
	//   76  158:aload_0         
	//   77  159:getfield        #24  <Field SessionState c>
	//   78  162:aload_0         
	//   79  163:getfield        #18  <Field Core e>
	//   80  166:getfield        #47  <Field SessionState Core.L>
	//   81  169:invokevirtual   #61  <Method void Core.a(SessionState, SessionState)>
	//   82  172:return          
	}

	final ApplicationState a;
	final ApplicationState b;
	final SessionState c;
	final SessionState d;
	final Core e;
}
