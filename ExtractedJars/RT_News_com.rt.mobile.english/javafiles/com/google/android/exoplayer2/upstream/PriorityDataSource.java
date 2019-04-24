// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, DataSpec

public final class PriorityDataSource
	implements DataSource
{

	public PriorityDataSource(DataSource datasource, PriorityTaskManager prioritytaskmanager, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		upstream = (DataSource)Assertions.checkNotNull(((Object) (datasource)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #6   <Class DataSource>
	//    6   12:putfield        #25  <Field DataSource upstream>
		priorityTaskManager = (PriorityTaskManager)Assertions.checkNotNull(((Object) (prioritytaskmanager)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #23  <Method Object Assertions.checkNotNull(Object)>
	//   10   20:checkcast       #27  <Class PriorityTaskManager>
	//   11   23:putfield        #29  <Field PriorityTaskManager priorityTaskManager>
		priority = i;
	//   12   26:aload_0         
	//   13   27:iload_3         
	//   14   28:putfield        #31  <Field int priority>
	//   15   31:return          
	}

	public void close()
		throws IOException
	{
		upstream.close();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DataSource upstream>
	//    2    4:invokeinterface #37  <Method void DataSource.close()>
	//    3    9:return          
	}

	public Uri getUri()
	{
		return upstream.getUri();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DataSource upstream>
	//    2    4:invokeinterface #43  <Method Uri DataSource.getUri()>
	//    3    9:areturn         
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		priorityTaskManager.proceedOrThrow(priority);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field PriorityTaskManager priorityTaskManager>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int priority>
	//    4    8:invokevirtual   #50  <Method void PriorityTaskManager.proceedOrThrow(int)>
		return upstream.open(dataspec);
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field DataSource upstream>
	//    7   15:aload_1         
	//    8   16:invokeinterface #52  <Method long DataSource.open(DataSpec)>
	//    9   21:lreturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		priorityTaskManager.proceedOrThrow(priority);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field PriorityTaskManager priorityTaskManager>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int priority>
	//    4    8:invokevirtual   #50  <Method void PriorityTaskManager.proceedOrThrow(int)>
		return upstream.read(abyte0, i, j);
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field DataSource upstream>
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:iload_3         
	//   10   18:invokeinterface #56  <Method int DataSource.read(byte[], int, int)>
	//   11   23:ireturn         
	}

	private final int priority;
	private final PriorityTaskManager priorityTaskManager;
	private final DataSource upstream;
}
