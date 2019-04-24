// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.Intent;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.content:
//			LocalBroadcastManager

static class LocalBroadcastManager$BroadcastRecord
{

	final Intent intent;
	final ArrayList receivers;

	LocalBroadcastManager$BroadcastRecord(Intent intent1, ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		intent = intent1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Intent intent>
		receivers = arraylist;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field ArrayList receivers>
	//    8   14:return          
	}
}
