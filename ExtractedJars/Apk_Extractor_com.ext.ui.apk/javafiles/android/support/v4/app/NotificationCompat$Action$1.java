// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat

static final class NotificationCompat$Action$1
	implements n.Factory
{

	public n build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, Input ainput[], Input ainput1[], boolean flag)
	{
		return ((n) (new NotificationCompat.Action(i, charsequence, pendingintent, bundle, (RemoteInput[])(RemoteInput[])ainput, (RemoteInput[])(RemoteInput[])ainput1, flag)));
	//    0    0:new             #8   <Class NotificationCompat$Action>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:checkcast       #20  <Class RemoteInput[]>
	//    8   14:checkcast       #20  <Class RemoteInput[]>
	//    9   17:aload           6
	//   10   19:checkcast       #20  <Class RemoteInput[]>
	//   11   22:checkcast       #20  <Class RemoteInput[]>
	//   12   25:iload           7
	//   13   27:invokespecial   #23  <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean)>
	//   14   30:areturn         
	}

	public NotificationCompat.Action[] newArray(int i)
	{
		return new NotificationCompat.Action[i];
	//    0    0:iload_1         
	//    1    1:anewarray       NotificationCompat.Action[]
	//    2    4:areturn         
	}

	public volatile n[] newArray(int i)
	{
		return ((n []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method NotificationCompat$Action[] newArray(int)>
	//    3    5:areturn         
	}

	NotificationCompat$Action$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
