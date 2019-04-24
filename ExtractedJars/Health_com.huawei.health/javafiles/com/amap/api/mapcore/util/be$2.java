// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			be, bd, bk, hm

class be$2
	implements Runnable
{

	public void run()
	{
		try
		{
			if(((Object) (a.c())).equals(((Object) (a.a))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field bd a>
	//*   2    4:invokevirtual   #36  <Method ch bd.c()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #22  <Field bd a>
	//*   5   11:getfield        #39  <Field ch bd.a>
	//*   6   14:invokevirtual   #43  <Method boolean Object.equals(Object)>
	//*   7   17:ifeq            47
			{
				if(be.d(c) != null)
	//*   8   20:aload_0         
	//*   9   21:getfield        #20  <Field be c>
	//*  10   24:invokestatic    #47  <Method be$a be.d(be)>
	//*  11   27:ifnull          46
					be.d(c).c(a);
	//   12   30:aload_0         
	//   13   31:getfield        #20  <Field be c>
	//   14   34:invokestatic    #47  <Method be$a be.d(be)>
	//   15   37:aload_0         
	//   16   38:getfield        #22  <Field bd a>
	//   17   41:invokeinterface #52  <Method void be$a.c(bd)>
				return;
	//   18   46:return          
			}
		}
	//*  19   47:aload_0         
	//*  20   48:getfield        #22  <Field bd a>
	//*  21   51:invokevirtual   #56  <Method int bd.getState()>
	//*  22   54:bipush          7
	//*  23   56:icmpeq          70
	//*  24   59:aload_0         
	//*  25   60:getfield        #22  <Field bd a>
	//*  26   63:invokevirtual   #56  <Method int bd.getState()>
	//*  27   66:iconst_m1       
	//*  28   67:icmpne          120
	//*  29   70:aload_0         
	//*  30   71:getfield        #20  <Field be c>
	//*  31   74:getfield        #60  <Field bk be.g>
	//*  32   77:aload_0         
	//*  33   78:getfield        #22  <Field bd a>
	//*  34   81:invokevirtual   #64  <Method void bk.a(bd)>
	//*  35   84:aload_0         
	//*  36   85:getfield        #24  <Field boolean b>
	//*  37   88:ifeq            160
	//*  38   91:aload_0         
	//*  39   92:getfield        #20  <Field be c>
	//*  40   95:invokestatic    #47  <Method be$a be.d(be)>
	//*  41   98:ifnull          160
	//*  42  101:aload_0         
	//*  43  102:getfield        #20  <Field be c>
	//*  44  105:invokestatic    #47  <Method be$a be.d(be)>
	//*  45  108:aload_0         
	//*  46  109:getfield        #22  <Field bd a>
	//*  47  112:invokeinterface #52  <Method void be$a.c(bd)>
	//*  48  117:goto            160
	//*  49  120:aload_0         
	//*  50  121:getfield        #20  <Field be c>
	//*  51  124:getfield        #60  <Field bk be.g>
	//*  52  127:aload_0         
	//*  53  128:getfield        #22  <Field bd a>
	//*  54  131:invokevirtual   #64  <Method void bk.a(bd)>
	//*  55  134:aload_0         
	//*  56  135:getfield        #20  <Field be c>
	//*  57  138:invokestatic    #47  <Method be$a be.d(be)>
	//*  58  141:ifnull          160
	//*  59  144:aload_0         
	//*  60  145:getfield        #20  <Field be c>
	//*  61  148:invokestatic    #47  <Method be$a be.d(be)>
	//*  62  151:aload_0         
	//*  63  152:getfield        #22  <Field bd a>
	//*  64  155:invokeinterface #52  <Method void be$a.c(bd)>
	//*  65  160:return          
		catch(Throwable throwable)
	//*  66  161:astore_1        
		{
			hm.c(throwable, "requestDelete", "removeExcecRunnable");
	//   67  162:aload_1         
	//   68  163:ldc1            #66  <String "requestDelete">
	//   69  165:ldc1            #68  <String "removeExcecRunnable">
	//   70  167:invokestatic    #73  <Method void hm.c(Throwable, String, String)>
			return;
	//   71  170:return          
		}
		if(a.getState() == 7 || a.getState() == -1)
		{
			c.g.a(a);
			if(b && be.d(c) != null)
				be.d(c).c(a);
			break MISSING_BLOCK_LABEL_160;
		}
		c.g.a(a);
		if(be.d(c) != null)
			be.d(c).c(a);
	}

	final bd a;
	final boolean b;
	final be c;

	be$2(be be1, bd bd1, boolean flag)
	{
		c = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field be c>
		a = bd1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field bd a>
		b = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field boolean b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
