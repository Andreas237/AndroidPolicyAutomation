// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

static final class MediaSessionCompat$MediaSessionImplBase$Command
{

	public final String command;
	public final Bundle extras;
	public final ResultReceiver stub;

	public MediaSessionCompat$MediaSessionImplBase$Command(String s, Bundle bundle, ResultReceiver resultreceiver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		command = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String command>
		extras = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Bundle extras>
		stub = resultreceiver;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field ResultReceiver stub>
	//   11   19:return          
	}
}
