// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import java.io.*;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			QueueFileEventStorage

public class GZIPQueueFileEventStorage extends QueueFileEventStorage
{

	public GZIPQueueFileEventStorage(Context context, File file, String s, String s1)
		throws IOException
	{
		super(context, file, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #10  <Method void QueueFileEventStorage(Context, File, String, String)>
	//    6    9:return          
	}

	public OutputStream getMoveOutputStream(File file)
		throws IOException
	{
		return ((OutputStream) (new GZIPOutputStream(((OutputStream) (new FileOutputStream(file))))));
	//    0    0:new             #16  <Class GZIPOutputStream>
	//    1    3:dup             
	//    2    4:new             #18  <Class FileOutputStream>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #21  <Method void FileOutputStream(File)>
	//    6   12:invokespecial   #24  <Method void GZIPOutputStream(OutputStream)>
	//    7   15:areturn         
	}
}
