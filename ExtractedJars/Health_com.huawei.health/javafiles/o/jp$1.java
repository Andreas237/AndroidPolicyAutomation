// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package o:
//			jp

class jp$1
	implements ServiceConnection
{

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		jp.b(d, ii$b.c(ibinder));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field jp d>
	//    2    4:aload_2         
	//    3    5:invokestatic    #33  <Method ii ii$b.c(IBinder)>
	//    4    8:invokestatic    #36  <Method ii jp.b(jp, ii)>
	//    5   11:pop             
		b.c(0);
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field jp$b b>
	//    8   16:iconst_0        
	//    9   17:invokeinterface #41  <Method void jp$b.c(int)>
	//   10   22:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		jp.b(d, ((ii) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field jp d>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #36  <Method ii jp.b(jp, ii)>
	//    4    8:pop             
	//    5    9:return          
	}

	final jp$b b;
	final jp d;

	jp$1(jp jp1, jp$b jp$b1)
	{
		d = jp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field jp d>
		b = jp$b1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field jp$b b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
