// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzvf, zzve, zzvd, zzwg, 
//			zzuu, zzxj, zzxg, zzta, 
//			zzvg

final class zzvh extends zzvf
{

	private zzvh()
	{
		super(((zzvg) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #32  <Method void zzvf(zzvg)>
	//    3    5:return          
	}

	zzvh(zzvg zzvg)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zzvh()>
	//    2    4:return          
	}

	private static List zza(Object obj, long l, int i)
	{
		List list = zzc(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #40  <Method List zzc(Object, long)>
	//    3    5:astore          5
		if(!list.isEmpty()) goto _L2; else goto _L1
	//    4    7:aload           5
	//    5    9:invokeinterface #46  <Method boolean List.isEmpty()>
	//    6   14:ifeq            90
_L1:
		Object obj1;
		if(list instanceof zzve)
	//*   7   17:aload           5
	//*   8   19:instanceof      #48  <Class zzve>
	//*   9   22:ifeq            38
			obj1 = ((Object) (new zzvd(i)));
	//   10   25:new             #50  <Class zzvd>
	//   11   28:dup             
	//   12   29:iload_3         
	//   13   30:invokespecial   #53  <Method void zzvd(int)>
	//   14   33:astore          4
		else
	//*  15   35:goto            80
		if((list instanceof zzwg) && (list instanceof zzuu))
	//*  16   38:aload           5
	//*  17   40:instanceof      #55  <Class zzwg>
	//*  18   43:ifeq            70
	//*  19   46:aload           5
	//*  20   48:instanceof      #57  <Class zzuu>
	//*  21   51:ifeq            70
			obj1 = ((Object) (((zzuu)list).zzal(i)));
	//   22   54:aload           5
	//   23   56:checkcast       #57  <Class zzuu>
	//   24   59:iload_3         
	//   25   60:invokeinterface #61  <Method zzuu zzuu.zzal(int)>
	//   26   65:astore          4
		else
	//*  27   67:goto            80
			obj1 = ((Object) (new ArrayList(i)));
	//   28   70:new             #63  <Class ArrayList>
	//   29   73:dup             
	//   30   74:iload_3         
	//   31   75:invokespecial   #64  <Method void ArrayList(int)>
	//   32   78:astore          4
_L8:
		zzxj.zza(obj, l, obj1);
	//   33   80:aload_0         
	//   34   81:lload_1         
	//   35   82:aload           4
	//   36   84:invokestatic    #69  <Method void zzxj.zza(Object, long, Object)>
		return ((List) (obj1));
	//   37   87:aload           4
	//   38   89:areturn         
_L2:
		if(!zzcae.isAssignableFrom(((Object) (list)).getClass())) goto _L4; else goto _L3
	//   39   90:getstatic       #27  <Field Class zzcae>
	//   40   93:aload           5
	//   41   95:invokevirtual   #25  <Method Class Object.getClass()>
	//   42   98:invokevirtual   #75  <Method boolean Class.isAssignableFrom(Class)>
	//   43  101:ifeq            140
_L3:
		obj1 = ((Object) (new ArrayList(list.size() + i)));
	//   44  104:new             #63  <Class ArrayList>
	//   45  107:dup             
	//   46  108:aload           5
	//   47  110:invokeinterface #79  <Method int List.size()>
	//   48  115:iload_3         
	//   49  116:iadd            
	//   50  117:invokespecial   #64  <Method void ArrayList(int)>
	//   51  120:astore          4
		((ArrayList) (obj1)).addAll(((java.util.Collection) (list)));
	//   52  122:aload           4
	//   53  124:aload           5
	//   54  126:invokevirtual   #83  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   55  129:pop             
_L6:
		zzxj.zza(obj, l, obj1);
	//   56  130:aload_0         
	//   57  131:lload_1         
	//   58  132:aload           4
	//   59  134:invokestatic    #69  <Method void zzxj.zza(Object, long, Object)>
		return ((List) (obj1));
	//   60  137:aload           4
	//   61  139:areturn         
_L4:
		if(!(list instanceof zzxg))
			break; /* Loop/switch isn't completed */
	//   62  140:aload           5
	//   63  142:instanceof      #85  <Class zzxg>
	//   64  145:ifeq            180
		obj1 = ((Object) (new zzvd(list.size() + i)));
	//   65  148:new             #50  <Class zzvd>
	//   66  151:dup             
	//   67  152:aload           5
	//   68  154:invokeinterface #79  <Method int List.size()>
	//   69  159:iload_3         
	//   70  160:iadd            
	//   71  161:invokespecial   #53  <Method void zzvd(int)>
	//   72  164:astore          4
		((zzta) (obj1)).addAll(((java.util.Collection) ((zzxg)list)));
	//   73  166:aload           4
	//   74  168:aload           5
	//   75  170:checkcast       #85  <Class zzxg>
	//   76  173:invokevirtual   #88  <Method boolean zzta.addAll(java.util.Collection)>
	//   77  176:pop             
		if(true) goto _L6; else goto _L5
	//   78  177:goto            130
_L5:
		if(!(list instanceof zzwg) || !(list instanceof zzuu))
			break; /* Loop/switch isn't completed */
	//   79  180:aload           5
	//   80  182:instanceof      #55  <Class zzwg>
	//   81  185:ifeq            234
	//   82  188:aload           5
	//   83  190:instanceof      #57  <Class zzuu>
	//   84  193:ifeq            234
		obj1 = ((Object) ((zzuu)list));
	//   85  196:aload           5
	//   86  198:checkcast       #57  <Class zzuu>
	//   87  201:astore          4
		if(((zzuu) (obj1)).zztz())
			break; /* Loop/switch isn't completed */
	//   88  203:aload           4
	//   89  205:invokeinterface #91  <Method boolean zzuu.zztz()>
	//   90  210:ifne            234
		obj1 = ((Object) (((zzuu) (obj1)).zzal(list.size() + i)));
	//   91  213:aload           4
	//   92  215:aload           5
	//   93  217:invokeinterface #79  <Method int List.size()>
	//   94  222:iload_3         
	//   95  223:iadd            
	//   96  224:invokeinterface #61  <Method zzuu zzuu.zzal(int)>
	//   97  229:astore          4
		if(true) goto _L8; else goto _L7
	//   98  231:goto            80
_L7:
		return list;
	//   99  234:aload           5
	//  100  236:areturn         
	}

	private static List zzc(Object obj, long l)
	{
		return (List)zzxj.zzp(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #97  <Method Object zzxj.zzp(Object, long)>
	//    3    5:checkcast       #42  <Class List>
	//    4    8:areturn         
	}

	final List zza(Object obj, long l)
	{
		return zza(obj, l, 10);
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:bipush          10
	//    3    4:invokestatic    #100 <Method List zza(Object, long, int)>
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
	//    7    9:invokeinterface #79  <Method int List.size()>
	//    8   14:invokestatic    #100 <Method List zza(Object, long, int)>
	//    9   17:astore          7
		int i = list.size();
	//   10   19:aload           7
	//   11   21:invokeinterface #79  <Method int List.size()>
	//   12   26:istore          5
		int j = ((List) (obj1)).size();
	//   13   28:aload_2         
	//   14   29:invokeinterface #79  <Method int List.size()>
	//   15   34:istore          6
		if(i > 0 && j > 0)
	//*  16   36:iload           5
	//*  17   38:ifle            55
	//*  18   41:iload           6
	//*  19   43:ifle            55
			list.addAll(((java.util.Collection) (obj1)));
	//   20   46:aload           7
	//   21   48:aload_2         
	//   22   49:invokeinterface #103 <Method boolean List.addAll(java.util.Collection)>
	//   23   54:pop             
		if(i > 0)
	//*  24   55:iload           5
	//*  25   57:ifle            63
			obj1 = ((Object) (list));
	//   26   60:aload           7
	//   27   62:astore_2        
		zzxj.zza(obj, l, obj1);
	//   28   63:aload_1         
	//   29   64:lload_3         
	//   30   65:aload_2         
	//   31   66:invokestatic    #69  <Method void zzxj.zza(Object, long, Object)>
	//   32   69:return          
	}

	final void zzb(Object obj, long l)
	{
		Object obj1 = ((Object) ((List)zzxj.zzp(obj, l)));
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:invokestatic    #97  <Method Object zzxj.zzp(Object, long)>
	//    3    5:checkcast       #42  <Class List>
	//    4    8:astore          4
		if(obj1 instanceof zzve)
	//*   5   10:aload           4
	//*   6   12:instanceof      #48  <Class zzve>
	//*   7   15:ifeq            33
		{
			obj1 = ((Object) (((zzve)obj1).zzxc()));
	//    8   18:aload           4
	//    9   20:checkcast       #48  <Class zzve>
	//   10   23:invokeinterface #110 <Method zzve zzve.zzxc()>
	//   11   28:astore          4
		} else
	//*  12   30:goto            93
		{
			if(zzcae.isAssignableFrom(obj1.getClass()))
	//*  13   33:getstatic       #27  <Field Class zzcae>
	//*  14   36:aload           4
	//*  15   38:invokevirtual   #25  <Method Class Object.getClass()>
	//*  16   41:invokevirtual   #75  <Method boolean Class.isAssignableFrom(Class)>
	//*  17   44:ifeq            48
				return;
	//   18   47:return          
			if((obj1 instanceof zzwg) && (obj1 instanceof zzuu))
	//*  19   48:aload           4
	//*  20   50:instanceof      #55  <Class zzwg>
	//*  21   53:ifeq            86
	//*  22   56:aload           4
	//*  23   58:instanceof      #57  <Class zzuu>
	//*  24   61:ifeq            86
			{
				obj = ((Object) ((zzuu)obj1));
	//   25   64:aload           4
	//   26   66:checkcast       #57  <Class zzuu>
	//   27   69:astore_1        
				if(((zzuu) (obj)).zztz())
	//*  28   70:aload_1         
	//*  29   71:invokeinterface #91  <Method boolean zzuu.zztz()>
	//*  30   76:ifeq            85
					((zzuu) (obj)).zzsw();
	//   31   79:aload_1         
	//   32   80:invokeinterface #113 <Method void zzuu.zzsw()>
				return;
	//   33   85:return          
			}
			obj1 = ((Object) (Collections.unmodifiableList(((List) (obj1)))));
	//   34   86:aload           4
	//   35   88:invokestatic    #19  <Method List Collections.unmodifiableList(List)>
	//   36   91:astore          4
		}
		zzxj.zza(obj, l, obj1);
	//   37   93:aload_1         
	//   38   94:lload_2         
	//   39   95:aload           4
	//   40   97:invokestatic    #69  <Method void zzxj.zza(Object, long, Object)>
	//   41  100:return          
	}

	private static final Class zzcae = ((Object) (Collections.unmodifiableList(Collections.emptyList()))).getClass();

	static 
	{
	//    0    0:invokestatic    #15  <Method List Collections.emptyList()>
	//    1    3:invokestatic    #19  <Method List Collections.unmodifiableList(List)>
	//    2    6:invokevirtual   #25  <Method Class Object.getClass()>
	//    3    9:putstatic       #27  <Field Class zzcae>
	//*   4   12:return          
	}
}
