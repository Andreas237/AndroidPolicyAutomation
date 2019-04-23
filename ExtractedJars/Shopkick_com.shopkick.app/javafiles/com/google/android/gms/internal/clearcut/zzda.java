// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcy, zzfd, zzcx, zzcw, 
//			zzfa, zzav, zzcz

final class zzda extends zzcy
{

	private zzda()
	{
		super(((zzcz) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #32  <Method void zzcy(zzcz)>
	//    3    5:return          
	}

	zzda(zzcz zzcz)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zzda()>
	//    2    4:return          
	}

	private static List zzb(Object obj, long l)
	{
		return (List)zzfd.zzo(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #42  <Method Object zzfd.zzo(Object, long)>
	//    3    5:checkcast       #44  <Class List>
	//    4    8:areturn         
	}

	final void zza(Object obj, long l)
	{
		Object obj1 = ((Object) ((List)zzfd.zzo(obj, l)));
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:invokestatic    #42  <Method Object zzfd.zzo(Object, long)>
	//    3    5:checkcast       #44  <Class List>
	//    4    8:astore          4
		if(obj1 instanceof zzcx)
	//*   5   10:aload           4
	//*   6   12:instanceof      #50  <Class zzcx>
	//*   7   15:ifeq            33
		{
			obj1 = ((Object) (((zzcx)obj1).zzbu()));
	//    8   18:aload           4
	//    9   20:checkcast       #50  <Class zzcx>
	//   10   23:invokeinterface #54  <Method zzcx zzcx.zzbu()>
	//   11   28:astore          4
		} else
	//*  12   30:goto            55
		{
			if(zzlv.isAssignableFrom(obj1.getClass()))
	//*  13   33:getstatic       #27  <Field Class zzlv>
	//*  14   36:aload           4
	//*  15   38:invokevirtual   #25  <Method Class Object.getClass()>
	//*  16   41:invokevirtual   #60  <Method boolean Class.isAssignableFrom(Class)>
	//*  17   44:ifeq            48
				return;
	//   18   47:return          
			obj1 = ((Object) (Collections.unmodifiableList(((List) (obj1)))));
	//   19   48:aload           4
	//   20   50:invokestatic    #19  <Method List Collections.unmodifiableList(List)>
	//   21   53:astore          4
		}
		zzfd.zza(obj, l, obj1);
	//   22   55:aload_1         
	//   23   56:lload_2         
	//   24   57:aload           4
	//   25   59:invokestatic    #63  <Method void zzfd.zza(Object, long, Object)>
	//   26   62:return          
	}

	final void zza(Object obj, Object obj1, long l)
	{
		int i;
		Object obj2;
		List list;
		obj2 = ((Object) (zzb(obj1, l)));
	//    0    0:aload_2         
	//    1    1:lload_3         
	//    2    2:invokestatic    #66  <Method List zzb(Object, long)>
	//    3    5:astore          7
		i = ((List) (obj2)).size();
	//    4    7:aload           7
	//    5    9:invokeinterface #70  <Method int List.size()>
	//    6   14:istore          5
		list = zzb(obj, l);
	//    7   16:aload_1         
	//    8   17:lload_3         
	//    9   18:invokestatic    #66  <Method List zzb(Object, long)>
	//   10   21:astore          8
		if(!list.isEmpty()) goto _L2; else goto _L1
	//   11   23:aload           8
	//   12   25:invokeinterface #74  <Method boolean List.isEmpty()>
	//   13   30:ifeq            73
_L1:
		if(list instanceof zzcx)
	//*  14   33:aload           8
	//*  15   35:instanceof      #50  <Class zzcx>
	//*  16   38:ifeq            54
			obj1 = ((Object) (new zzcw(i)));
	//   17   41:new             #76  <Class zzcw>
	//   18   44:dup             
	//   19   45:iload           5
	//   20   47:invokespecial   #79  <Method void zzcw(int)>
	//   21   50:astore_2        
		else
	//*  22   51:goto            64
			obj1 = ((Object) (new ArrayList(i)));
	//   23   54:new             #81  <Class ArrayList>
	//   24   57:dup             
	//   25   58:iload           5
	//   26   60:invokespecial   #82  <Method void ArrayList(int)>
	//   27   63:astore_2        
		zzfd.zza(obj, l, obj1);
	//   28   64:aload_1         
	//   29   65:lload_3         
	//   30   66:aload_2         
	//   31   67:invokestatic    #63  <Method void zzfd.zza(Object, long, Object)>
		  goto _L3
	//*  32   70:goto            163
_L2:
		if(!zzlv.isAssignableFrom(((Object) (list)).getClass())) goto _L5; else goto _L4
	//   33   73:getstatic       #27  <Field Class zzlv>
	//   34   76:aload           8
	//   35   78:invokevirtual   #25  <Method Class Object.getClass()>
	//   36   81:invokevirtual   #60  <Method boolean Class.isAssignableFrom(Class)>
	//   37   84:ifeq            121
_L4:
		obj1 = ((Object) (new ArrayList(list.size() + i)));
	//   38   87:new             #81  <Class ArrayList>
	//   39   90:dup             
	//   40   91:aload           8
	//   41   93:invokeinterface #70  <Method int List.size()>
	//   42   98:iload           5
	//   43  100:iadd            
	//   44  101:invokespecial   #82  <Method void ArrayList(int)>
	//   45  104:astore_2        
		((ArrayList) (obj1)).addAll(((java.util.Collection) (list)));
	//   46  105:aload_2         
	//   47  106:aload           8
	//   48  108:invokevirtual   #86  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   49  111:pop             
_L6:
		zzfd.zza(obj, l, obj1);
	//   50  112:aload_1         
	//   51  113:lload_3         
	//   52  114:aload_2         
	//   53  115:invokestatic    #63  <Method void zzfd.zza(Object, long, Object)>
		break; /* Loop/switch isn't completed */
	//   54  118:goto            163
_L5:
		obj1 = ((Object) (list));
	//   55  121:aload           8
	//   56  123:astore_2        
		if(!(list instanceof zzfa))
			break; /* Loop/switch isn't completed */
	//   57  124:aload           8
	//   58  126:instanceof      #88  <Class zzfa>
	//   59  129:ifeq            163
		obj1 = ((Object) (new zzcw(list.size() + i)));
	//   60  132:new             #76  <Class zzcw>
	//   61  135:dup             
	//   62  136:aload           8
	//   63  138:invokeinterface #70  <Method int List.size()>
	//   64  143:iload           5
	//   65  145:iadd            
	//   66  146:invokespecial   #79  <Method void zzcw(int)>
	//   67  149:astore_2        
		((zzav) (obj1)).addAll(((java.util.Collection) ((zzfa)list)));
	//   68  150:aload_2         
	//   69  151:aload           8
	//   70  153:checkcast       #88  <Class zzfa>
	//   71  156:invokevirtual   #91  <Method boolean zzav.addAll(java.util.Collection)>
	//   72  159:pop             
		if(true) goto _L6; else goto _L3
	//   73  160:goto            112
_L3:
		int j = ((List) (obj1)).size();
	//   74  163:aload_2         
	//   75  164:invokeinterface #70  <Method int List.size()>
	//   76  169:istore          5
		int k = ((List) (obj2)).size();
	//   77  171:aload           7
	//   78  173:invokeinterface #70  <Method int List.size()>
	//   79  178:istore          6
		if(j > 0 && k > 0)
	//*  80  180:iload           5
	//*  81  182:ifle            199
	//*  82  185:iload           6
	//*  83  187:ifle            199
			((List) (obj1)).addAll(((java.util.Collection) (obj2)));
	//   84  190:aload_2         
	//   85  191:aload           7
	//   86  193:invokeinterface #92  <Method boolean List.addAll(java.util.Collection)>
	//   87  198:pop             
		if(j > 0)
	//*  88  199:iload           5
	//*  89  201:ifle            207
			obj2 = obj1;
	//   90  204:aload_2         
	//   91  205:astore          7
		zzfd.zza(obj, l, obj2);
	//   92  207:aload_1         
	//   93  208:lload_3         
	//   94  209:aload           7
	//   95  211:invokestatic    #63  <Method void zzfd.zza(Object, long, Object)>
		return;
	//   96  214:return          
	}

	private static final Class zzlv = ((Object) (Collections.unmodifiableList(Collections.emptyList()))).getClass();

	static 
	{
	//    0    0:invokestatic    #15  <Method List Collections.emptyList()>
	//    1    3:invokestatic    #19  <Method List Collections.unmodifiableList(List)>
	//    2    6:invokevirtual   #25  <Method Class Object.getClass()>
	//    3    9:putstatic       #27  <Field Class zzlv>
	//*   4   12:return          
	}
}
