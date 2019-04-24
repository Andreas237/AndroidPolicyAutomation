// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakk, zzaii

final class zzaiw
{

	zzaiw(Context context, List list, zzaii zzaii1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		zzrt = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #53  <Field Context zzrt>
		zzcnm = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #55  <Field List zzcnm>
		zzcnn = zzaii1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #57  <Field zzaii zzcnn>
	//   11   19:return          
	}

	final List zzc(String as[])
	{
		int i;
		int j;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #63  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void ArrayList()>
	//    3    7:astore          8
		j = as.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore          5
		i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
_L8:
		if(i >= j) goto _L2; else goto _L1
	//    9   15:iload_2         
	//   10   16:iload           5
	//   11   18:icmpge          241
_L1:
		String s1;
		Iterator iterator;
		s1 = as[i];
	//   12   21:aload_1         
	//   13   22:iload_2         
	//   14   23:aaload          
	//   15   24:astore          9
		iterator = zzcnm.iterator();
	//   16   26:aload_0         
	//   17   27:getfield        #55  <Field List zzcnm>
	//   18   30:invokeinterface #70  <Method Iterator List.iterator()>
	//   19   35:astore          10
_L7:
		boolean flag2;
		boolean flag3;
		flag3 = iterator.hasNext();
	//   20   37:aload           10
	//   21   39:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//   22   44:istore          6
		flag2 = true;
	//   23   46:iconst_1        
	//   24   47:istore          4
		if(!flag3) goto _L4; else goto _L3
	//   25   49:iload           6
	//   26   51:ifeq            139
_L3:
		String s2 = (String)iterator.next();
	//   27   54:aload           10
	//   28   56:invokeinterface #79  <Method Object Iterator.next()>
	//   29   61:checkcast       #81  <Class String>
	//   30   64:astore          11
		if(!s2.equals(((Object) (s1)))) goto _L6; else goto _L5
	//   31   66:aload           11
	//   32   68:aload           9
	//   33   70:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   34   73:ifeq            81
_L5:
		boolean flag;
		flag = true;
	//   35   76:iconst_1        
	//   36   77:istore_3        
		break MISSING_BLOCK_LABEL_141;
	//   37   78:goto            141
_L6:
		String s;
		s = String.valueOf("android.webkit.resource.");
	//   38   81:ldc1            #87  <String "android.webkit.resource.">
	//   39   83:invokestatic    #91  <Method String String.valueOf(Object)>
	//   40   86:astore          7
		s2 = String.valueOf(((Object) (s2)));
	//   41   88:aload           11
	//   42   90:invokestatic    #91  <Method String String.valueOf(Object)>
	//   43   93:astore          11
		if(s2.length() != 0)
	//*  44   95:aload           11
	//*  45   97:invokevirtual   #95  <Method int String.length()>
	//*  46  100:ifeq            115
			s = s.concat(s2);
	//   47  103:aload           7
	//   48  105:aload           11
	//   49  107:invokevirtual   #99  <Method String String.concat(String)>
	//   50  110:astore          7
		else
	//*  51  112:goto            126
			s = new String(s);
	//   52  115:new             #81  <Class String>
	//   53  118:dup             
	//   54  119:aload           7
	//   55  121:invokespecial   #102 <Method void String(String)>
	//   56  124:astore          7
		if(!s.equals(((Object) (s1)))) goto _L7; else goto _L5
	//   57  126:aload           7
	//   58  128:aload           9
	//   59  130:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   60  133:ifeq            37
	//*  61  136:goto            76
_L4:
		flag = false;
	//   62  139:iconst_0        
	//   63  140:istore_3        
		if(flag)
	//*  64  141:iload_3         
	//*  65  142:ifeq            225
		{
			boolean flag1 = flag2;
	//   66  145:iload           4
	//   67  147:istore_3        
			if(zzcnl.containsKey(((Object) (s1))))
	//*  68  148:getstatic       #48  <Field Map zzcnl>
	//*  69  151:aload           9
	//*  70  153:invokeinterface #105 <Method boolean Map.containsKey(Object)>
	//*  71  158:ifeq            196
			{
				zzbv.zzek();
	//   72  161:invokestatic    #111 <Method zzakk zzbv.zzek()>
	//   73  164:pop             
				if(zzakk.zzl(zzrt, (String)zzcnl.get(((Object) (s1)))))
	//*  74  165:aload_0         
	//*  75  166:getfield        #53  <Field Context zzrt>
	//*  76  169:getstatic       #48  <Field Map zzcnl>
	//*  77  172:aload           9
	//*  78  174:invokeinterface #115 <Method Object Map.get(Object)>
	//*  79  179:checkcast       #81  <Class String>
	//*  80  182:invokestatic    #121 <Method boolean zzakk.zzl(Context, String)>
	//*  81  185:ifeq            194
					flag1 = flag2;
	//   82  188:iload           4
	//   83  190:istore_3        
				else
	//*  84  191:goto            196
					flag1 = false;
	//   85  194:iconst_0        
	//   86  195:istore_3        
			}
			if(flag1)
	//*  87  196:iload_3         
	//*  88  197:ifeq            213
				((List) (arraylist)).add(((Object) (s1)));
	//   89  200:aload           8
	//   90  202:aload           9
	//   91  204:invokeinterface #124 <Method boolean List.add(Object)>
	//   92  209:pop             
			else
	//*  93  210:goto            234
				zzcnn.zzch(s1);
	//   94  213:aload_0         
	//   95  214:getfield        #57  <Field zzaii zzcnn>
	//   96  217:aload           9
	//   97  219:invokevirtual   #129 <Method void zzaii.zzch(String)>
		} else
	//*  98  222:goto            234
		{
			zzcnn.zzcg(s1);
	//   99  225:aload_0         
	//  100  226:getfield        #57  <Field zzaii zzcnn>
	//  101  229:aload           9
	//  102  231:invokevirtual   #132 <Method void zzaii.zzcg(String)>
		}
		i++;
	//  103  234:iload_2         
	//  104  235:iconst_1        
	//  105  236:iadd            
	//  106  237:istore_2        
		  goto _L8
	//* 107  238:goto            15
_L2:
		return ((List) (arraylist));
	//  108  241:aload           8
	//  109  243:areturn         
	}

	private static final Map zzcnl;
	private final List zzcnm;
	private final zzaii zzcnn;
	private final Context zzrt;

	static 
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #23  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void HashMap()>
	//    3    7:astore_0        
		if(PlatformVersion.isAtLeastLollipop())
	//*   4    8:invokestatic    #32  <Method boolean PlatformVersion.isAtLeastLollipop()>
	//*   5   11:ifeq            36
		{
			((Map) (hashmap)).put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
	//    6   14:aload_0         
	//    7   15:ldc1            #34  <String "android.webkit.resource.AUDIO_CAPTURE">
	//    8   17:ldc1            #36  <String "android.permission.RECORD_AUDIO">
	//    9   19:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   10   24:pop             
			((Map) (hashmap)).put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
	//   11   25:aload_0         
	//   12   26:ldc1            #44  <String "android.webkit.resource.VIDEO_CAPTURE">
	//   13   28:ldc1            #46  <String "android.permission.CAMERA">
	//   14   30:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   15   35:pop             
		}
		zzcnl = ((Map) (hashmap));
	//   16   36:aload_0         
	//   17   37:putstatic       #48  <Field Map zzcnl>
	//*  18   40:return          
	}
}
