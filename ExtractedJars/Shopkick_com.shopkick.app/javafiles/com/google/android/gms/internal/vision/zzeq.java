// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzeo, zzeu

final class zzeq
	implements Comparator
{

	zzeq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final int compare(Object obj, Object obj1)
	{
		obj = ((Object) ((zzeo)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #16  <Class zzeo>
	//    2    4:astore_1        
		obj1 = ((Object) ((zzeo)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #16  <Class zzeo>
	//    5    9:astore_2        
		zzeu zzeu1 = (zzeu)((zzeo) (obj)).iterator();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #20  <Method java.util.Iterator zzeo.iterator()>
	//    8   14:checkcast       #22  <Class zzeu>
	//    9   17:astore          4
		for(zzeu zzeu2 = (zzeu)((zzeo) (obj1)).iterator(); zzeu1.hasNext() && zzeu2.hasNext();)
	//*  10   19:aload_2         
	//*  11   20:invokevirtual   #20  <Method java.util.Iterator zzeo.iterator()>
	//*  12   23:checkcast       #22  <Class zzeu>
	//*  13   26:astore          5
	//*  14   28:aload           4
	//*  15   30:invokeinterface #26  <Method boolean zzeu.hasNext()>
	//*  16   35:ifeq            78
	//*  17   38:aload           5
	//*  18   40:invokeinterface #26  <Method boolean zzeu.hasNext()>
	//*  19   45:ifeq            78
		{
			int i = Integer.compare(zzeo.zzb(zzeu1.nextByte()), zzeo.zzb(zzeu2.nextByte()));
	//   20   48:aload           4
	//   21   50:invokeinterface #30  <Method byte zzeu.nextByte()>
	//   22   55:invokestatic    #34  <Method int zzeo.zzb(byte)>
	//   23   58:aload           5
	//   24   60:invokeinterface #30  <Method byte zzeu.nextByte()>
	//   25   65:invokestatic    #34  <Method int zzeo.zzb(byte)>
	//   26   68:invokestatic    #39  <Method int Integer.compare(int, int)>
	//   27   71:istore_3        
			if(i != 0)
	//*  28   72:iload_3         
	//*  29   73:ifeq            28
				return i;
	//   30   76:iload_3         
	//   31   77:ireturn         
		}

		return Integer.compare(((zzeo) (obj)).size(), ((zzeo) (obj1)).size());
	//   32   78:aload_1         
	//   33   79:invokevirtual   #43  <Method int zzeo.size()>
	//   34   82:aload_2         
	//   35   83:invokevirtual   #43  <Method int zzeo.size()>
	//   36   86:invokestatic    #39  <Method int Integer.compare(int, int)>
	//   37   89:ireturn         
	}
}
