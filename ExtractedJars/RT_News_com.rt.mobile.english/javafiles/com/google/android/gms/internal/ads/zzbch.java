// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbce, zzbek, zzbbt, zzbcf

final class zzbch extends zzbce
{

	private zzbch()
	{
		super(((zzbcf) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #9   <Method void zzbce(zzbcf)>
	//    3    5:return          
	}

	zzbch(zzbcf zzbcf)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzbch()>
	//    2    4:return          
	}

	private static zzbbt zzd(Object obj, long l)
	{
		return (zzbbt)zzbek.zzp(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #20  <Method Object zzbek.zzp(Object, long)>
	//    3    5:checkcast       #22  <Class zzbbt>
	//    4    8:areturn         
	}

	final List zza(Object obj, long l)
	{
		zzbbt zzbbt2 = zzd(obj, l);
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:invokestatic    #28  <Method zzbbt zzd(Object, long)>
	//    3    5:astore          6
		zzbbt zzbbt1 = zzbbt2;
	//    4    7:aload           6
	//    5    9:astore          5
		if(!zzbbt2.zzaay())
	//*   6   11:aload           6
	//*   7   13:invokeinterface #32  <Method boolean zzbbt.zzaay()>
	//*   8   18:ifne            66
		{
			int i = zzbbt2.size();
	//    9   21:aload           6
	//   10   23:invokeinterface #36  <Method int zzbbt.size()>
	//   11   28:istore          4
			if(i == 0)
	//*  12   30:iload           4
	//*  13   32:ifne            42
				i = 10;
	//   14   35:bipush          10
	//   15   37:istore          4
			else
	//*  16   39:goto            48
				i <<= 1;
	//   17   42:iload           4
	//   18   44:iconst_1        
	//   19   45:ishl            
	//   20   46:istore          4
			zzbbt1 = zzbbt2.zzbm(i);
	//   21   48:aload           6
	//   22   50:iload           4
	//   23   52:invokeinterface #40  <Method zzbbt zzbbt.zzbm(int)>
	//   24   57:astore          5
			zzbek.zza(obj, l, ((Object) (zzbbt1)));
	//   25   59:aload_1         
	//   26   60:lload_2         
	//   27   61:aload           5
	//   28   63:invokestatic    #43  <Method void zzbek.zza(Object, long, Object)>
		}
		return ((List) (zzbbt1));
	//   29   66:aload           5
	//   30   68:areturn         
	}

	final void zza(Object obj, Object obj1, long l)
	{
		Object obj2 = ((Object) (zzd(obj, l)));
	//    0    0:aload_1         
	//    1    1:lload_3         
	//    2    2:invokestatic    #28  <Method zzbbt zzd(Object, long)>
	//    3    5:astore          7
		zzbbt zzbbt1 = zzd(obj1, l);
	//    4    7:aload_2         
	//    5    8:lload_3         
	//    6    9:invokestatic    #28  <Method zzbbt zzd(Object, long)>
	//    7   12:astore          8
		int i = ((zzbbt) (obj2)).size();
	//    8   14:aload           7
	//    9   16:invokeinterface #36  <Method int zzbbt.size()>
	//   10   21:istore          5
		int j = zzbbt1.size();
	//   11   23:aload           8
	//   12   25:invokeinterface #36  <Method int zzbbt.size()>
	//   13   30:istore          6
		obj1 = obj2;
	//   14   32:aload           7
	//   15   34:astore_2        
		if(i > 0)
	//*  16   35:iload           5
	//*  17   37:ifle            83
		{
			obj1 = obj2;
	//   18   40:aload           7
	//   19   42:astore_2        
			if(j > 0)
	//*  20   43:iload           6
	//*  21   45:ifle            83
			{
				obj1 = obj2;
	//   22   48:aload           7
	//   23   50:astore_2        
				if(!((zzbbt) (obj2)).zzaay())
	//*  24   51:aload           7
	//*  25   53:invokeinterface #32  <Method boolean zzbbt.zzaay()>
	//*  26   58:ifne            74
					obj1 = ((Object) (((zzbbt) (obj2)).zzbm(j + i)));
	//   27   61:aload           7
	//   28   63:iload           6
	//   29   65:iload           5
	//   30   67:iadd            
	//   31   68:invokeinterface #40  <Method zzbbt zzbbt.zzbm(int)>
	//   32   73:astore_2        
				((zzbbt) (obj1)).addAll(((java.util.Collection) (zzbbt1)));
	//   33   74:aload_2         
	//   34   75:aload           8
	//   35   77:invokeinterface #49  <Method boolean zzbbt.addAll(java.util.Collection)>
	//   36   82:pop             
			}
		}
		obj2 = ((Object) (zzbbt1));
	//   37   83:aload           8
	//   38   85:astore          7
		if(i > 0)
	//*  39   87:iload           5
	//*  40   89:ifle            95
			obj2 = obj1;
	//   41   92:aload_2         
	//   42   93:astore          7
		zzbek.zza(obj, l, obj2);
	//   43   95:aload_1         
	//   44   96:lload_3         
	//   45   97:aload           7
	//   46   99:invokestatic    #43  <Method void zzbek.zza(Object, long, Object)>
	//   47  102:return          
	}

	final void zzb(Object obj, long l)
	{
		zzd(obj, l).zzaaz();
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:invokestatic    #28  <Method zzbbt zzd(Object, long)>
	//    3    5:invokeinterface #55  <Method void zzbbt.zzaaz()>
	//    4   10:return          
	}
}
