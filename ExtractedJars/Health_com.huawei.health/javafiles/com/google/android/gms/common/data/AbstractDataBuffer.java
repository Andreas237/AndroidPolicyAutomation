// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//			DataBuffer, DataHolder, zzb, zzg

public abstract class AbstractDataBuffer
	implements DataBuffer
{

	protected AbstractDataBuffer(DataHolder dataholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzaBi = dataholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field DataHolder zzaBi>
	//    5    9:return          
	}

	public final void close()
	{
		release();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method void release()>
	//    2    4:return          
	}

	public abstract Object get(int i);

	public int getCount()
	{
		if(zzaBi == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field DataHolder zzaBi>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return zzaBi.getCount();
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field DataHolder zzaBi>
	//    7   13:invokevirtual   #31  <Method int DataHolder.getCount()>
	//    8   16:ireturn         
	}

	public boolean isClosed()
	{
		return zzaBi == null || zzaBi.isClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DataHolder zzaBi>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field DataHolder zzaBi>
	//    5   11:invokevirtual   #35  <Method boolean DataHolder.isClosed()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new zzb(((DataBuffer) (this)))));
	//    0    0:new             #39  <Class zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #42  <Method void zzb(DataBuffer)>
	//    4    8:areturn         
	}

	public void release()
	{
		if(zzaBi != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field DataHolder zzaBi>
	//*   2    4:ifnull          14
			zzaBi.close();
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field DataHolder zzaBi>
	//    5   11:invokevirtual   #46  <Method void DataHolder.close()>
	//    6   14:return          
	}

	public Iterator singleRefIterator()
	{
		return ((Iterator) (new zzg(((DataBuffer) (this)))));
	//    0    0:new             #49  <Class zzg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #50  <Method void zzg(DataBuffer)>
	//    4    8:areturn         
	}

	public Bundle zzxf()
	{
		return zzaBi.zzxf();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DataHolder zzaBi>
	//    2    4:invokevirtual   #54  <Method Bundle DataHolder.zzxf()>
	//    3    7:areturn         
	}

	protected final DataHolder zzaBi;
}
