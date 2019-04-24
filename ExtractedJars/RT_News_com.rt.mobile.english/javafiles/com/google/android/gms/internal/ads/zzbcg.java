// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbce, zzbcd, zzbcc, zzbek, 
//			zzbeh, zzbab, zzbcf

final class zzbcg extends zzbce
{

	private zzbcg()
	{
		super(((zzbcf) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #32  <Method void zzbce(zzbcf)>
	//    3    5:return          
	}

	zzbcg(zzbcf zzbcf)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zzbcg()>
	//    2    4:return          
	}

	private static List zza(Object obj, long l, int i)
	{
		List list = zzc(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #40  <Method List zzc(Object, long)>
	//    3    5:astore          5
		if(list.isEmpty())
	//*   4    7:aload           5
	//*   5    9:invokeinterface #46  <Method boolean List.isEmpty()>
	//*   6   14:ifeq            58
		{
			Object obj1;
			if(list instanceof zzbcd)
	//*   7   17:aload           5
	//*   8   19:instanceof      #48  <Class zzbcd>
	//*   9   22:ifeq            38
				obj1 = ((Object) (new zzbcc(i)));
	//   10   25:new             #50  <Class zzbcc>
	//   11   28:dup             
	//   12   29:iload_3         
	//   13   30:invokespecial   #53  <Method void zzbcc(int)>
	//   14   33:astore          4
			else
	//*  15   35:goto            48
				obj1 = ((Object) (new ArrayList(i)));
	//   16   38:new             #55  <Class ArrayList>
	//   17   41:dup             
	//   18   42:iload_3         
	//   19   43:invokespecial   #56  <Method void ArrayList(int)>
	//   20   46:astore          4
			zzbek.zza(obj, l, obj1);
	//   21   48:aload_0         
	//   22   49:lload_1         
	//   23   50:aload           4
	//   24   52:invokestatic    #61  <Method void zzbek.zza(Object, long, Object)>
			return ((List) (obj1));
	//   25   55:aload           4
	//   26   57:areturn         
		}
		Object obj2;
		if(zzdvs.isAssignableFrom(((Object) (list)).getClass()))
	//*  27   58:getstatic       #27  <Field Class zzdvs>
	//*  28   61:aload           5
	//*  29   63:invokevirtual   #25  <Method Class Object.getClass()>
	//*  30   66:invokevirtual   #67  <Method boolean Class.isAssignableFrom(Class)>
	//*  31   69:ifeq            108
		{
			obj2 = ((Object) (new ArrayList(list.size() + i)));
	//   32   72:new             #55  <Class ArrayList>
	//   33   75:dup             
	//   34   76:aload           5
	//   35   78:invokeinterface #71  <Method int List.size()>
	//   36   83:iload_3         
	//   37   84:iadd            
	//   38   85:invokespecial   #56  <Method void ArrayList(int)>
	//   39   88:astore          4
			((ArrayList) (obj2)).addAll(((java.util.Collection) (list)));
	//   40   90:aload           4
	//   41   92:aload           5
	//   42   94:invokevirtual   #75  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   43   97:pop             
		} else
	//*  44   98:aload_0         
	//*  45   99:lload_1         
	//*  46  100:aload           4
	//*  47  102:invokestatic    #61  <Method void zzbek.zza(Object, long, Object)>
	//*  48  105:aload           4
	//*  49  107:areturn         
		if(list instanceof zzbeh)
	//*  50  108:aload           5
	//*  51  110:instanceof      #77  <Class zzbeh>
	//*  52  113:ifeq            148
		{
			obj2 = ((Object) (new zzbcc(list.size() + i)));
	//   53  116:new             #50  <Class zzbcc>
	//   54  119:dup             
	//   55  120:aload           5
	//   56  122:invokeinterface #71  <Method int List.size()>
	//   57  127:iload_3         
	//   58  128:iadd            
	//   59  129:invokespecial   #53  <Method void zzbcc(int)>
	//   60  132:astore          4
			((zzbab) (obj2)).addAll(((java.util.Collection) ((zzbeh)list)));
	//   61  134:aload           4
	//   62  136:aload           5
	//   63  138:checkcast       #77  <Class zzbeh>
	//   64  141:invokevirtual   #80  <Method boolean zzbab.addAll(java.util.Collection)>
	//   65  144:pop             
		} else
	//*  66  145:goto            98
		{
			return list;
	//   67  148:aload           5
	//   68  150:areturn         
		}
		zzbek.zza(obj, l, obj2);
		return ((List) (obj2));
	}

	private static List zzc(Object obj, long l)
	{
		return (List)zzbek.zzp(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #86  <Method Object zzbek.zzp(Object, long)>
	//    3    5:checkcast       #42  <Class List>
	//    4    8:areturn         
	}

	final List zza(Object obj, long l)
	{
		return zza(obj, l, 10);
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:bipush          10
	//    3    4:invokestatic    #89  <Method List zza(Object, long, int)>
	//    4    7:areturn         
	}

	final void zza(Object obj, Object obj1, long l)
	{
		obj1 = ((Object) (zzc(obj1, l)));
	//    0    0:aload_2         
	//    1    1:lload_3         
	//    2    2:invokestatic    #40  <Method List zzc(Object, long)>
	//    3    5:astore_2        
		List list = zza(obj, l, ((List) (obj1)).size());
	//    4    6:aload_1         
	//    5    7:lload_3         
	//    6    8:aload_2         
	//    7    9:invokeinterface #71  <Method int List.size()>
	//    8   14:invokestatic    #89  <Method List zza(Object, long, int)>
	//    9   17:astore          7
		int i = list.size();
	//   10   19:aload           7
	//   11   21:invokeinterface #71  <Method int List.size()>
	//   12   26:istore          5
		int j = ((List) (obj1)).size();
	//   13   28:aload_2         
	//   14   29:invokeinterface #71  <Method int List.size()>
	//   15   34:istore          6
		if(i > 0 && j > 0)
	//*  16   36:iload           5
	//*  17   38:ifle            55
	//*  18   41:iload           6
	//*  19   43:ifle            55
			list.addAll(((java.util.Collection) (obj1)));
	//   20   46:aload           7
	//   21   48:aload_2         
	//   22   49:invokeinterface #92  <Method boolean List.addAll(java.util.Collection)>
	//   23   54:pop             
		if(i > 0)
	//*  24   55:iload           5
	//*  25   57:ifle            63
			obj1 = ((Object) (list));
	//   26   60:aload           7
	//   27   62:astore_2        
		zzbek.zza(obj, l, obj1);
	//   28   63:aload_1         
	//   29   64:lload_3         
	//   30   65:aload_2         
	//   31   66:invokestatic    #61  <Method void zzbek.zza(Object, long, Object)>
	//   32   69:return          
	}

	final void zzb(Object obj, long l)
	{
		Object obj1 = ((Object) ((List)zzbek.zzp(obj, l)));
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:invokestatic    #86  <Method Object zzbek.zzp(Object, long)>
	//    3    5:checkcast       #42  <Class List>
	//    4    8:astore          4
		if(obj1 instanceof zzbcd)
	//*   5   10:aload           4
	//*   6   12:instanceof      #48  <Class zzbcd>
	//*   7   15:ifeq            33
		{
			obj1 = ((Object) (((zzbcd)obj1).zzadx()));
	//    8   18:aload           4
	//    9   20:checkcast       #48  <Class zzbcd>
	//   10   23:invokeinterface #99  <Method zzbcd zzbcd.zzadx()>
	//   11   28:astore          4
		} else
	//*  12   30:goto            55
		{
			if(zzdvs.isAssignableFrom(obj1.getClass()))
	//*  13   33:getstatic       #27  <Field Class zzdvs>
	//*  14   36:aload           4
	//*  15   38:invokevirtual   #25  <Method Class Object.getClass()>
	//*  16   41:invokevirtual   #67  <Method boolean Class.isAssignableFrom(Class)>
	//*  17   44:ifeq            48
				return;
	//   18   47:return          
			obj1 = ((Object) (Collections.unmodifiableList(((List) (obj1)))));
	//   19   48:aload           4
	//   20   50:invokestatic    #19  <Method List Collections.unmodifiableList(List)>
	//   21   53:astore          4
		}
		zzbek.zza(obj, l, obj1);
	//   22   55:aload_1         
	//   23   56:lload_2         
	//   24   57:aload           4
	//   25   59:invokestatic    #61  <Method void zzbek.zza(Object, long, Object)>
	//   26   62:return          
	}

	private static final Class zzdvs = ((Object) (Collections.unmodifiableList(Collections.emptyList()))).getClass();

	static 
	{
	//    0    0:invokestatic    #15  <Method List Collections.emptyList()>
	//    1    3:invokestatic    #19  <Method List Collections.unmodifiableList(List)>
	//    2    6:invokevirtual   #25  <Method Class Object.getClass()>
	//    3    9:putstatic       #27  <Field Class zzdvs>
	//*   4   12:return          
	}
}
