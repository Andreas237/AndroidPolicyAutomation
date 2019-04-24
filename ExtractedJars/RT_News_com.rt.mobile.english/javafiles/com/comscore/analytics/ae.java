// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import com.comscore.utils.Date;

// Referenced classes of package com.comscore.analytics:
//			Core, SessionState

class ae
	implements Runnable
{

	ae(Core core)
	{
		a = core;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Core a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public void run()
	{
		if(a.z())
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field Core a>
	//*   2    4:invokevirtual   #23  <Method boolean Core.z()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		if(a.Q < 0)
	//*   5   11:aload_0         
	//*   6   12:getfield        #12  <Field Core a>
	//*   7   15:getfield        #27  <Field int Core.Q>
	//*   8   18:ifge            29
			a.Q = 0;
	//    9   21:aload_0         
	//   10   22:getfield        #12  <Field Core a>
	//   11   25:iconst_0        
	//   12   26:putfield        #27  <Field int Core.Q>
		if(a.R < 0)
	//*  13   29:aload_0         
	//*  14   30:getfield        #12  <Field Core a>
	//*  15   33:getfield        #30  <Field int Core.R>
	//*  16   36:ifge            47
			a.R = 0;
	//   17   39:aload_0         
	//   18   40:getfield        #12  <Field Core a>
	//   19   43:iconst_0        
	//   20   44:putfield        #30  <Field int Core.R>
		a.W = Date.unixTime();
	//   21   47:aload_0         
	//   22   48:getfield        #12  <Field Core a>
	//   23   51:invokestatic    #36  <Method long Date.unixTime()>
	//   24   54:putfield        #40  <Field long Core.W>
		Core core = a;
	//   25   57:aload_0         
	//   26   58:getfield        #12  <Field Core a>
	//   27   61:astore_1        
		core.V = core.V + 1;
	//   28   62:aload_1         
	//   29   63:aload_1         
	//   30   64:getfield        #43  <Field int Core.V>
	//   31   67:iconst_1        
	//   32   68:iadd            
	//   33   69:putfield        #43  <Field int Core.V>
		if(a.L != SessionState.ACTIVE_USER)
	//*  34   72:aload_0         
	//*  35   73:getfield        #12  <Field Core a>
	//*  36   76:getfield        #47  <Field SessionState Core.L>
	//*  37   79:getstatic       #52  <Field SessionState SessionState.ACTIVE_USER>
	//*  38   82:if_acmpeq       93
		{
			a.n();
	//   39   85:aload_0         
	//   40   86:getfield        #12  <Field Core a>
	//   41   89:invokevirtual   #55  <Method void Core.n()>
			return;
	//   42   92:return          
		} else
		{
			a.o();
	//   43   93:aload_0         
	//   44   94:getfield        #12  <Field Core a>
	//   45   97:invokevirtual   #58  <Method void Core.o()>
			return;
	//   46  100:return          
		}
	}

	final Core a;
}
