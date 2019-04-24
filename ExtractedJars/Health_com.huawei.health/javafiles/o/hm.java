// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;

// Referenced classes of package o:
//			ho

final class hm extends bq.a
{

	hm(ho ho1)
	{
		b = ho1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field ho b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void bq$a()>
	//    5    9:return          
	}

	public final void a(String s, String s1, int i, Bundle bundle)
		throws RemoteException
	{
		Intent intent = new Intent("android.intent.action.MAIN", ((android.net.Uri) (null)));
	//    0    0:new             #22  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "android.intent.action.MAIN">
	//    3    6:aconst_null     
	//    4    7:invokespecial   #27  <Method void Intent(String, android.net.Uri)>
	//    5   10:astore          6
		Bundle bundle1 = bundle;
	//    6   12:aload           4
	//    7   14:astore          5
		if(bundle == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       30
			bundle1 = new Bundle();
	//   10   21:new             #29  <Class Bundle>
	//   11   24:dup             
	//   12   25:invokespecial   #30  <Method void Bundle()>
	//   13   28:astore          5
		try
		{
			bundle1.putInt("CallingPid", i);
	//   14   30:aload           5
	//   15   32:ldc1            #32  <String "CallingPid">
	//   16   34:iload_3         
	//   17   35:invokevirtual   #36  <Method void Bundle.putInt(String, int)>
			intent.putExtras(bundle1);
	//   18   38:aload           6
	//   19   40:aload           5
	//   20   42:invokevirtual   #40  <Method Intent Intent.putExtras(Bundle)>
	//   21   45:pop             
		}
	//*  22   46:aload           6
	//*  23   48:aload_1         
	//*  24   49:aload_2         
	//*  25   50:invokevirtual   #44  <Method Intent Intent.setClassName(String, String)>
	//*  26   53:pop             
	//*  27   54:aload_0         
	//*  28   55:getfield        #10  <Field ho b>
	//*  29   58:invokestatic    #50  <Method Activity ho.d(ho)>
	//*  30   61:ifnull          76
	//*  31   64:aload_0         
	//*  32   65:getfield        #10  <Field ho b>
	//*  33   68:invokestatic    #50  <Method Activity ho.d(ho)>
	//*  34   71:aload           6
	//*  35   73:invokevirtual   #56  <Method void Activity.startActivity(Intent)>
	//*  36   76:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle) { }
	//   37   77:astore          4
		intent.setClassName(s, s1);
		if(ho.d(b) != null)
			ho.d(b).startActivity(intent);
	//*  38   79:goto            46
	}

	public final void a(boolean flag, String s)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final boolean a()
		throws RemoteException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final ho b;
}
