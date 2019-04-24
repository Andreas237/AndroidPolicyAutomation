// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import java.io.File;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsFilesManager

static class EventsFilesManager$FileWithTimestamp
{

	final File file;
	final long timestamp;

	public EventsFilesManager$FileWithTimestamp(File file1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		file = file1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field File file>
		timestamp = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #20  <Field long timestamp>
	//    8   14:return          
	}
}
