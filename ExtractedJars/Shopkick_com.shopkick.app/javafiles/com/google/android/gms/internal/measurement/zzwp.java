// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwo, zzuh

final class zzwp extends zzwo
{

	zzwp(int i)
	{
		super(i, ((zzwp) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #10  <Method void zzwo(int, zzwp)>
	//    4    6:return          
	}

	public final void zzsw()
	{
		if(!((zzwo)this).isImmutable())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #17  <Method boolean zzwo.isImmutable()>
	//*   2    4:ifne            134
		{
			for(int i = 0; i < ((zzwo)this).zzyc(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #21  <Method int zzwo.zzyc()>
	//*   8   14:icmpge          66
			{
				java.util.Map.Entry entry = ((zzwo)this).zzbx(i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #25  <Method java.util.Map$Entry zzwo.zzbx(int)>
	//   12   22:astore_2        
				if(((zzuh)entry.getKey()).zzwb())
	//*  13   23:aload_2         
	//*  14   24:invokeinterface #31  <Method Object java.util.Map$Entry.getKey()>
	//*  15   29:checkcast       #33  <Class zzuh>
	//*  16   32:invokeinterface #36  <Method boolean zzuh.zzwb()>
	//*  17   37:ifeq            59
					entry.setValue(((Object) (Collections.unmodifiableList((List)entry.getValue()))));
	//   18   40:aload_2         
	//   19   41:aload_2         
	//   20   42:invokeinterface #39  <Method Object java.util.Map$Entry.getValue()>
	//   21   47:checkcast       #41  <Class List>
	//   22   50:invokestatic    #47  <Method List Collections.unmodifiableList(List)>
	//   23   53:invokeinterface #51  <Method Object java.util.Map$Entry.setValue(Object)>
	//   24   58:pop             
			}

	//   25   59:iload_1         
	//   26   60:iconst_1        
	//   27   61:iadd            
	//   28   62:istore_1        
	//*  29   63:goto            9
			Iterator iterator = ((zzwo)this).zzyd().iterator();
	//   30   66:aload_0         
	//   31   67:invokevirtual   #55  <Method Iterable zzwo.zzyd()>
	//   32   70:invokeinterface #61  <Method Iterator Iterable.iterator()>
	//   33   75:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   34   76:aload_2         
	//   35   77:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   36   82:ifeq            134
				java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
	//   37   85:aload_2         
	//   38   86:invokeinterface #69  <Method Object Iterator.next()>
	//   39   91:checkcast       #27  <Class java.util.Map$Entry>
	//   40   94:astore_3        
				if(((zzuh)entry1.getKey()).zzwb())
	//*  41   95:aload_3         
	//*  42   96:invokeinterface #31  <Method Object java.util.Map$Entry.getKey()>
	//*  43  101:checkcast       #33  <Class zzuh>
	//*  44  104:invokeinterface #36  <Method boolean zzuh.zzwb()>
	//*  45  109:ifeq            76
					entry1.setValue(((Object) (Collections.unmodifiableList((List)entry1.getValue()))));
	//   46  112:aload_3         
	//   47  113:aload_3         
	//   48  114:invokeinterface #39  <Method Object java.util.Map$Entry.getValue()>
	//   49  119:checkcast       #41  <Class List>
	//   50  122:invokestatic    #47  <Method List Collections.unmodifiableList(List)>
	//   51  125:invokeinterface #51  <Method Object java.util.Map$Entry.setValue(Object)>
	//   52  130:pop             
			} while(true);
	//   53  131:goto            76
		}
		super.zzsw();
	//   54  134:aload_0         
	//   55  135:invokespecial   #71  <Method void zzwo.zzsw()>
	//   56  138:return          
	}
}
