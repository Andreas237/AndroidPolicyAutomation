// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.content.*;
import android.os.IBinder;
import android.os.RemoteException;

// Referenced classes of package android.support.v7:
//			bz, bu, ca

class bz$1
	implements ServiceConnection
{

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		if(!b.d) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field bz b>
	//    2    4:getfield        #32  <Field boolean bz.d>
	//    3    7:ifeq            11
_L1:
		return;
	//    4   10:return          
_L2:
		b.b("Billing service connected.");
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field bz b>
	//    7   15:ldc1            #34  <String "Billing service connected.">
	//    8   17:invokevirtual   #37  <Method void bz.b(String)>
		b.i = bu$a.a(ibinder);
	//    9   20:aload_0         
	//   10   21:getfield        #18  <Field bz b>
	//   11   24:aload_2         
	//   12   25:invokestatic    #42  <Method bu bu$a.a(IBinder)>
	//   13   28:putfield        #46  <Field bu bz.i>
		componentname = ((ComponentName) (b.h.getPackageName()));
	//   14   31:aload_0         
	//   15   32:getfield        #18  <Field bz b>
	//   16   35:getfield        #50  <Field Context bz.h>
	//   17   38:invokevirtual   #56  <Method String Context.getPackageName()>
	//   18   41:astore_1        
		int i;
		b.b("Checking for in-app billing 3 support.");
	//   19   42:aload_0         
	//   20   43:getfield        #18  <Field bz b>
	//   21   46:ldc1            #58  <String "Checking for in-app billing 3 support.">
	//   22   48:invokevirtual   #37  <Method void bz.b(String)>
		i = b.i.a(3, ((String) (componentname)), "inapp");
	//   23   51:aload_0         
	//   24   52:getfield        #18  <Field bz b>
	//   25   55:getfield        #46  <Field bu bz.i>
	//   26   58:iconst_3        
	//   27   59:aload_1         
	//   28   60:ldc1            #60  <String "inapp">
	//   29   62:invokeinterface #65  <Method int bu.a(int, String, String)>
	//   30   67:istore_3        
		if(i != 0)
	//*  31   68:iload_3         
	//*  32   69:ifeq            141
		{
			try
			{
				if(a != null)
	//*  33   72:aload_0         
	//*  34   73:getfield        #20  <Field bz$b a>
	//*  35   76:ifnull          98
					a.a(new ca(i, "Error checking for billing v3 support."));
	//   36   79:aload_0         
	//   37   80:getfield        #20  <Field bz$b a>
	//   38   83:new             #67  <Class ca>
	//   39   86:dup             
	//   40   87:iload_3         
	//   41   88:ldc1            #69  <String "Error checking for billing v3 support.">
	//   42   90:invokespecial   #72  <Method void ca(int, String)>
	//   43   93:invokeinterface #77  <Method void bz$b.a(ca)>
				b.e = false;
	//   44   98:aload_0         
	//   45   99:getfield        #18  <Field bz b>
	//   46  102:iconst_0        
	//   47  103:putfield        #80  <Field boolean bz.e>
				return;
	//   48  106:return          
			}
			// Misplaced declaration of an exception variable
			catch(ComponentName componentname) { }
	//   49  107:astore_1        
			if(a != null)
	//*  50  108:aload_0         
	//*  51  109:getfield        #20  <Field bz$b a>
	//*  52  112:ifnull          136
				a.a(new ca(-1001, "RemoteException while setting up in-app billing."));
	//   53  115:aload_0         
	//   54  116:getfield        #20  <Field bz$b a>
	//   55  119:new             #67  <Class ca>
	//   56  122:dup             
	//   57  123:sipush          -1001
	//   58  126:ldc1            #82  <String "RemoteException while setting up in-app billing.">
	//   59  128:invokespecial   #72  <Method void ca(int, String)>
	//   60  131:invokeinterface #77  <Method void bz$b.a(ca)>
			((RemoteException) (componentname)).printStackTrace();
	//   61  136:aload_1         
	//   62  137:invokevirtual   #85  <Method void RemoteException.printStackTrace()>
			return;
	//   63  140:return          
		}
		b.b((new StringBuilder()).append("In-app billing version 3 supported for ").append(((String) (componentname))).toString());
	//   64  141:aload_0         
	//   65  142:getfield        #18  <Field bz b>
	//   66  145:new             #87  <Class StringBuilder>
	//   67  148:dup             
	//   68  149:invokespecial   #88  <Method void StringBuilder()>
	//   69  152:ldc1            #90  <String "In-app billing version 3 supported for ">
	//   70  154:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   71  157:aload_1         
	//   72  158:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   73  161:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   74  164:invokevirtual   #37  <Method void bz.b(String)>
		i = b.i.a(3, ((String) (componentname)), "subs");
	//   75  167:aload_0         
	//   76  168:getfield        #18  <Field bz b>
	//   77  171:getfield        #46  <Field bu bz.i>
	//   78  174:iconst_3        
	//   79  175:aload_1         
	//   80  176:ldc1            #99  <String "subs">
	//   81  178:invokeinterface #65  <Method int bu.a(int, String, String)>
	//   82  183:istore_3        
		if(i != 0)
			break MISSING_BLOCK_LABEL_240;
	//   83  184:iload_3         
	//   84  185:ifne            240
		b.b("Subscriptions AVAILABLE.");
	//   85  188:aload_0         
	//   86  189:getfield        #18  <Field bz b>
	//   87  192:ldc1            #101 <String "Subscriptions AVAILABLE.">
	//   88  194:invokevirtual   #37  <Method void bz.b(String)>
		b.e = true;
	//   89  197:aload_0         
	//   90  198:getfield        #18  <Field bz b>
	//   91  201:iconst_1        
	//   92  202:putfield        #80  <Field boolean bz.e>
_L4:
		b.c = true;
	//   93  205:aload_0         
	//   94  206:getfield        #18  <Field bz b>
	//   95  209:iconst_1        
	//   96  210:putfield        #104 <Field boolean bz.c>
		if(a == null) goto _L1; else goto _L3
	//   97  213:aload_0         
	//   98  214:getfield        #20  <Field bz$b a>
	//   99  217:ifnull          10
_L3:
		a.a(new ca(0, "Setup successful."));
	//  100  220:aload_0         
	//  101  221:getfield        #20  <Field bz$b a>
	//  102  224:new             #67  <Class ca>
	//  103  227:dup             
	//  104  228:iconst_0        
	//  105  229:ldc1            #106 <String "Setup successful.">
	//  106  231:invokespecial   #72  <Method void ca(int, String)>
	//  107  234:invokeinterface #77  <Method void bz$b.a(ca)>
		return;
	//  108  239:return          
		b.b((new StringBuilder()).append("Subscriptions NOT AVAILABLE. Response: ").append(i).toString());
	//  109  240:aload_0         
	//  110  241:getfield        #18  <Field bz b>
	//  111  244:new             #87  <Class StringBuilder>
	//  112  247:dup             
	//  113  248:invokespecial   #88  <Method void StringBuilder()>
	//  114  251:ldc1            #108 <String "Subscriptions NOT AVAILABLE. Response: ">
	//  115  253:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//  116  256:iload_3         
	//  117  257:invokevirtual   #111 <Method StringBuilder StringBuilder.append(int)>
	//  118  260:invokevirtual   #97  <Method String StringBuilder.toString()>
	//  119  263:invokevirtual   #37  <Method void bz.b(String)>
		  goto _L4
	//* 120  266:goto            205
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		b.b("Billing service disconnected.");
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field bz b>
	//    2    4:ldc1            #115 <String "Billing service disconnected.">
	//    3    6:invokevirtual   #37  <Method void bz.b(String)>
		b.i = null;
	//    4    9:aload_0         
	//    5   10:getfield        #18  <Field bz b>
	//    6   13:aconst_null     
	//    7   14:putfield        #46  <Field bu bz.i>
	//    8   17:return          
	}

	final bz$b a;
	final bz b;

	bz$1(bz bz1, bz$b bz$b1)
	{
		b = bz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field bz b>
		a = bz$b1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field bz$b a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
