// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			DataSource, NetworkLock, DataSpec

public final class PriorityDataSource
	implements DataSource
{

	public PriorityDataSource(int i, DataSource datasource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		priority = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int priority>
		upstream = (DataSource)Assertions.checkNotNull(((Object) (datasource)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #23  <Method Object Assertions.checkNotNull(Object)>
	//    8   14:checkcast       #6   <Class DataSource>
	//    9   17:putfield        #25  <Field DataSource upstream>
	//   10   20:return          
	}

	public void close()
		throws IOException
	{
		upstream.close();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DataSource upstream>
	//    2    4:invokeinterface #31  <Method void DataSource.close()>
	//    3    9:return          
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		NetworkLock.instance.proceedOrThrow(priority);
	//    0    0:getstatic       #40  <Field NetworkLock NetworkLock.instance>
	//    1    3:aload_0         
	//    2    4:getfield        #17  <Field int priority>
	//    3    7:invokevirtual   #44  <Method void NetworkLock.proceedOrThrow(int)>
		return upstream.open(dataspec);
	//    4   10:aload_0         
	//    5   11:getfield        #25  <Field DataSource upstream>
	//    6   14:aload_1         
	//    7   15:invokeinterface #46  <Method long DataSource.open(DataSpec)>
	//    8   20:lreturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		NetworkLock.instance.proceedOrThrow(priority);
	//    0    0:getstatic       #40  <Field NetworkLock NetworkLock.instance>
	//    1    3:aload_0         
	//    2    4:getfield        #17  <Field int priority>
	//    3    7:invokevirtual   #44  <Method void NetworkLock.proceedOrThrow(int)>
		return upstream.read(abyte0, i, j);
	//    4   10:aload_0         
	//    5   11:getfield        #25  <Field DataSource upstream>
	//    6   14:aload_1         
	//    7   15:iload_2         
	//    8   16:iload_3         
	//    9   17:invokeinterface #50  <Method int DataSource.read(byte[], int, int)>
	//   10   22:ireturn         
	}

	private final int priority;
	private final DataSource upstream;
}
