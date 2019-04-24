// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;

// Referenced classes of package android.support.v4.os:
//			ResultReceiver

class ResultReceiver$a extends a.a
{

	public void a(int i, Bundle bundle)
	{
		if(a.b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field ResultReceiver a>
	//*   2    4:getfield        #21  <Field Handler ResultReceiver.b>
	//*   3    7:ifnull          35
		{
			a.b.post(((Runnable) (new ResultReceiver$b(a, i, bundle))));
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field ResultReceiver a>
	//    6   14:getfield        #21  <Field Handler ResultReceiver.b>
	//    7   17:new             #23  <Class ResultReceiver$b>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:getfield        #12  <Field ResultReceiver a>
	//   11   25:iload_1         
	//   12   26:aload_2         
	//   13   27:invokespecial   #26  <Method void ResultReceiver$b(ResultReceiver, int, Bundle)>
	//   14   30:invokevirtual   #32  <Method boolean Handler.post(Runnable)>
	//   15   33:pop             
			return;
	//   16   34:return          
		} else
		{
			a.a(i, bundle);
	//   17   35:aload_0         
	//   18   36:getfield        #12  <Field ResultReceiver a>
	//   19   39:iload_1         
	//   20   40:aload_2         
	//   21   41:invokevirtual   #34  <Method void ResultReceiver.a(int, Bundle)>
			return;
	//   22   44:return          
		}
	}

	final ResultReceiver a;

	ResultReceiver$a(ResultReceiver resultreceiver)
	{
		a = resultreceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ResultReceiver a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void a$a()>
	//    5    9:return          
	}
}
