// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			ag, s, hm

class ag$1 extends Handler
{

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
	//	               0 56
	//	               1 78
	//	               2 100
	//	               3 122
	//	               4 144
	//	               5 166;
	//    9   19:tableswitch     0 5: default 196
	//	               0 56
	//	               1 78
	//	               2 100
	//	               3 122
	//	               4 144
	//	               5 166
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

	ag$1(ag ag1, Looper looper)
	{
		a = ag1;
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
