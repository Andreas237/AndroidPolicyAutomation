// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			v, s, hm

class ag
	implements v
{

	ag(s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		c = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #35  <Field boolean c>
		d = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #37  <Field boolean d>
		e = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #39  <Field boolean e>
		f = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #41  <Field boolean f>
		g = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #43  <Field boolean g>
		h = true;
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:putfield        #45  <Field boolean h>
		i = true;
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:putfield        #47  <Field boolean i>
		j = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #49  <Field boolean j>
		k = true;
	//   26   44:aload_0         
	//   27   45:iconst_1        
	//   28   46:putfield        #51  <Field boolean k>
		l = 0;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #53  <Field int l>
		m = 1;
	//   32   54:aload_0         
	//   33   55:iconst_1        
	//   34   56:putfield        #55  <Field int m>
		n = true;
	//   35   59:aload_0         
	//   36   60:iconst_1        
	//   37   61:putfield        #57  <Field boolean n>
		o = false;
	//   38   64:aload_0         
	//   39   65:iconst_0        
	//   40   66:putfield        #59  <Field boolean o>
		p = false;
	//   41   69:aload_0         
	//   42   70:iconst_0        
	//   43   71:putfield        #61  <Field boolean p>
	//   44   74:aload_0         
	//   45   75:new             #8   <Class ag$1>
	//   46   78:dup             
	//   47   79:aload_0         
	//   48   80:invokestatic    #67  <Method Looper Looper.getMainLooper()>
	//   49   83:invokespecial   #70  <Method void ag$1(ag, Looper)>
	//   50   86:putfield        #72  <Field Handler a>
		b = s1;
	//   51   89:aload_0         
	//   52   90:aload_1         
	//   53   91:putfield        #74  <Field s b>
	//   54   94:return          
	}

	static s a(ag ag1)
	{
		return ag1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field s b>
	//    2    4:areturn         
	}

	static boolean b(ag ag1)
	{
		return ag1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean h>
	//    2    4:ireturn         
	}

	static boolean c(ag ag1)
	{
		return ag1.j;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean j>
	//    2    4:ireturn         
	}

	static boolean d(ag ag1)
	{
		return ag1.i;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean i>
	//    2    4:ireturn         
	}

	static boolean e(ag ag1)
	{
		return ag1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean f>
	//    2    4:ireturn         
	}

	static boolean f(ag ag1)
	{
		return ag1.n;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean n>
	//    2    4:ireturn         
	}

	static boolean g(ag ag1)
	{
		return ag1.k;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean k>
	//    2    4:ireturn         
	}

	public float getLogoMarginRate(int i1)
	{
		return b.l(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field s b>
	//    2    4:iload_1         
	//    3    5:invokeinterface #83  <Method float s.l(int)>
	//    4   10:freturn         
	}

	public int getLogoPosition()
		throws RemoteException
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int l>
	//    2    4:ireturn         
	}

	public int getZoomPosition()
		throws RemoteException
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int m>
	//    2    4:ireturn         
	}

	public boolean isCompassEnabled()
		throws RemoteException
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean i>
	//    2    4:ireturn         
	}

	public boolean isGestureScaleByMapCenter()
		throws RemoteException
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean p>
	//    2    4:ireturn         
	}

	public boolean isIndoorSwitchEnabled()
		throws RemoteException
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean n>
	//    2    4:ireturn         
	}

	public boolean isLogoEnable()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean k>
	//    2    4:ireturn         
	}

	public boolean isMyLocationButtonEnabled()
		throws RemoteException
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean f>
	//    2    4:ireturn         
	}

	public boolean isRotateGesturesEnabled()
		throws RemoteException
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean c>
	//    2    4:ireturn         
	}

	public boolean isScaleControlsEnabled()
		throws RemoteException
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean j>
	//    2    4:ireturn         
	}

	public boolean isScrollGesturesEnabled()
		throws RemoteException
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean d>
	//    2    4:ireturn         
	}

	public boolean isTiltGesturesEnabled()
		throws RemoteException
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean e>
	//    2    4:ireturn         
	}

	public boolean isZoomControlsEnabled()
		throws RemoteException
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean h>
	//    2    4:ireturn         
	}

	public boolean isZoomGesturesEnabled()
		throws RemoteException
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean g>
	//    2    4:ireturn         
	}

	public boolean isZoomInByScreenCenter()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean o>
	//    2    4:ireturn         
	}

	public void setAllGesturesEnabled(boolean flag)
		throws RemoteException
	{
		setRotateGesturesEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #107 <Method void setRotateGesturesEnabled(boolean)>
		setTiltGesturesEnabled(flag);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #110 <Method void setTiltGesturesEnabled(boolean)>
		setZoomGesturesEnabled(flag);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #113 <Method void setZoomGesturesEnabled(boolean)>
		setScrollGesturesEnabled(flag);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokevirtual   #116 <Method void setScrollGesturesEnabled(boolean)>
	//   12   20:return          
	}

	public void setCompassEnabled(boolean flag)
		throws RemoteException
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field boolean i>
		a.obtainMessage(2).sendToTarget();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field Handler a>
	//    5    9:iconst_2        
	//    6   10:invokevirtual   #123 <Method Message Handler.obtainMessage(int)>
	//    7   13:invokevirtual   #128 <Method void Message.sendToTarget()>
	//    8   16:return          
	}

	public void setGestureScaleByMapCenter(boolean flag)
		throws RemoteException
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field boolean p>
	//    3    5:return          
	}

	public void setIndoorSwitchEnabled(boolean flag)
		throws RemoteException
	{
		n = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean n>
		a.obtainMessage(4).sendToTarget();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field Handler a>
	//    5    9:iconst_4        
	//    6   10:invokevirtual   #123 <Method Message Handler.obtainMessage(int)>
	//    7   13:invokevirtual   #128 <Method void Message.sendToTarget()>
	//    8   16:return          
	}

	public void setLogoBottomMargin(int i1)
	{
		b.j(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field s b>
	//    2    4:iload_1         
	//    3    5:invokeinterface #134 <Method void s.j(int)>
	//    4   10:return          
	}

	public void setLogoEnable(boolean flag)
	{
		k = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field boolean k>
		a.obtainMessage(5).sendToTarget();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field Handler a>
	//    5    9:iconst_5        
	//    6   10:invokevirtual   #123 <Method Message Handler.obtainMessage(int)>
	//    7   13:invokevirtual   #128 <Method void Message.sendToTarget()>
	//    8   16:return          
	}

	public void setLogoLeftMargin(int i1)
	{
		b.k(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field s b>
	//    2    4:iload_1         
	//    3    5:invokeinterface #138 <Method void s.k(int)>
	//    4   10:return          
	}

	public void setLogoMarginRate(int i1, float f1)
	{
		b.a(i1, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field s b>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokeinterface #142 <Method void s.a(int, float)>
	//    5   11:return          
	}

	public void setLogoPosition(int i1)
		throws RemoteException
	{
		l = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int l>
		b.i(i1);
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field s b>
	//    5    9:iload_1         
	//    6   10:invokeinterface #145 <Method void s.i(int)>
	//    7   15:return          
	}

	public void setMyLocationButtonEnabled(boolean flag)
		throws RemoteException
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field boolean f>
		a.obtainMessage(3).sendToTarget();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field Handler a>
	//    5    9:iconst_3        
	//    6   10:invokevirtual   #123 <Method Message Handler.obtainMessage(int)>
	//    7   13:invokevirtual   #128 <Method void Message.sendToTarget()>
	//    8   16:return          
	}

	public void setRotateGesturesEnabled(boolean flag)
		throws RemoteException
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean c>
	//    3    5:return          
	}

	public void setScaleControlsEnabled(boolean flag)
		throws RemoteException
	{
		j = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean j>
		a.obtainMessage(1).sendToTarget();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field Handler a>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #123 <Method Message Handler.obtainMessage(int)>
	//    7   13:invokevirtual   #128 <Method void Message.sendToTarget()>
	//    8   16:return          
	}

	public void setScrollGesturesEnabled(boolean flag)
		throws RemoteException
	{
		d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field boolean d>
	//    3    5:return          
	}

	public void setTiltGesturesEnabled(boolean flag)
		throws RemoteException
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean e>
	//    3    5:return          
	}

	public void setZoomControlsEnabled(boolean flag)
		throws RemoteException
	{
		h = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field boolean h>
		a.obtainMessage(0).sendToTarget();
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field Handler a>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #123 <Method Message Handler.obtainMessage(int)>
	//    7   13:invokevirtual   #128 <Method void Message.sendToTarget()>
	//    8   16:return          
	}

	public void setZoomGesturesEnabled(boolean flag)
		throws RemoteException
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean g>
	//    3    5:return          
	}

	public void setZoomInByScreenCenter(boolean flag)
	{
		o = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field boolean o>
	//    3    5:return          
	}

	public void setZoomPosition(int i1)
		throws RemoteException
	{
		m = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int m>
		b.g(i1);
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field s b>
	//    5    9:iload_1         
	//    6   10:invokeinterface #152 <Method void s.g(int)>
	//    7   15:return          
	}

	final Handler a = new Handler(Looper.getMainLooper()) {

		public void handleMessage(Message message)
		{
			if(message == null || ag.a(a) == null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          14
		//*   2    4:aload_0         
		//*   3    5:getfield        #12  <Field ag a>
		//*   4    8:invokestatic    #23  <Method s ag.a(ag)>
		//*   5   11:ifnonnull       15
				return;
		//    6   14:return          
			message.what;
		//    7   15:aload_1         
		//    8   16:getfield        #29  <Field int Message.what>
			JVM INSTR tableswitch 0 5: default 196
		//		               0 56
		//		               1 78
		//		               2 100
		//		               3 122
		//		               4 144
		//		               5 166;
		//    9   19:tableswitch     0 5: default 196
		//		               0 56
		//		               1 78
		//		               2 100
		//		               3 122
		//		               4 144
		//		               5 166
			   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
			break MISSING_BLOCK_LABEL_196;
_L2:
			ag.a(a).a(ag.b(a));
		//   10   56:aload_0         
		//   11   57:getfield        #12  <Field ag a>
		//   12   60:invokestatic    #23  <Method s ag.a(ag)>
		//   13   63:aload_0         
		//   14   64:getfield        #12  <Field ag a>
		//   15   67:invokestatic    #33  <Method boolean ag.b(ag)>
		//   16   70:invokeinterface #38  <Method void s.a(boolean)>
			break; /* Loop/switch isn't completed */
		//   17   75:goto            185
_L3:
			try
			{
				ag.a(a).e(ag.c(a));
		//   18   78:aload_0         
		//   19   79:getfield        #12  <Field ag a>
		//   20   82:invokestatic    #23  <Method s ag.a(ag)>
		//   21   85:aload_0         
		//   22   86:getfield        #12  <Field ag a>
		//   23   89:invokestatic    #41  <Method boolean ag.c(ag)>
		//   24   92:invokeinterface #44  <Method void s.e(boolean)>
				break; /* Loop/switch isn't completed */
		//   25   97:goto            185
			}
		//*  26  100:aload_0         
		//*  27  101:getfield        #12  <Field ag a>
		//*  28  104:invokestatic    #23  <Method s ag.a(ag)>
		//*  29  107:aload_0         
		//*  30  108:getfield        #12  <Field ag a>
		//*  31  111:invokestatic    #47  <Method boolean ag.d(ag)>
		//*  32  114:invokeinterface #49  <Method void s.d(boolean)>
		//*  33  119:goto            185
		//*  34  122:aload_0         
		//*  35  123:getfield        #12  <Field ag a>
		//*  36  126:invokestatic    #23  <Method s ag.a(ag)>
		//*  37  129:aload_0         
		//*  38  130:getfield        #12  <Field ag a>
		//*  39  133:invokestatic    #51  <Method boolean ag.e(ag)>
		//*  40  136:invokeinterface #53  <Method void s.c(boolean)>
		//*  41  141:goto            185
		//*  42  144:aload_0         
		//*  43  145:getfield        #12  <Field ag a>
		//*  44  148:invokestatic    #23  <Method s ag.a(ag)>
		//*  45  151:aload_0         
		//*  46  152:getfield        #12  <Field ag a>
		//*  47  155:invokestatic    #56  <Method boolean ag.f(ag)>
		//*  48  158:invokeinterface #58  <Method void s.b(boolean)>
		//*  49  163:goto            185
		//*  50  166:aload_0         
		//*  51  167:getfield        #12  <Field ag a>
		//*  52  170:invokestatic    #23  <Method s ag.a(ag)>
		//*  53  173:aload_0         
		//*  54  174:getfield        #12  <Field ag a>
		//*  55  177:invokestatic    #61  <Method boolean ag.g(ag)>
		//*  56  180:invokeinterface #64  <Method void s.h(boolean)>
		//*  57  185:return          
			// Misplaced declaration of an exception variable
			catch(Message message)
		//*  58  186:astore_1        
			{
				hm.c(((Throwable) (message)), "UiSettingsDelegateImp", "handleMessage");
		//   59  187:aload_1         
		//   60  188:ldc1            #66  <String "UiSettingsDelegateImp">
		//   61  190:ldc1            #67  <String "handleMessage">
		//   62  192:invokestatic    #72  <Method void hm.c(Throwable, String, String)>
			}
			break MISSING_BLOCK_LABEL_195;
_L4:
			ag.a(a).d(ag.d(a));
			break; /* Loop/switch isn't completed */
_L5:
			ag.a(a).c(ag.e(a));
			break; /* Loop/switch isn't completed */
_L6:
			ag.a(a).b(ag.f(a));
			break; /* Loop/switch isn't completed */
_L7:
			ag.a(a).h(ag.g(a));
			return;
			return;
		//   63  195:return          
		//   64  196:return          
		}

		final ag a;

			
			{
				a = ag.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ag a>
				super(looper);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void Handler(Looper)>
			//    6   10:return          
			}
	}
;
	private s b;
	private boolean c;
	private boolean d;
	private boolean e;
	private boolean f;
	private boolean g;
	private boolean h;
	private boolean i;
	private boolean j;
	private boolean k;
	private int l;
	private int m;
	private boolean n;
	private boolean o;
	private boolean p;
}
