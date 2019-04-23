// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.o;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xg, ve

final class vr
{

	vr(Context context, List list, ve ve1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		b = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field Context b>
		c = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #53  <Field List c>
		d = ve1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #55  <Field ve d>
	//   11   19:return          
	}

	final List a(String as[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #58  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void ArrayList()>
	//    3    7:astore          8
		int j = as.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore          5
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_3        
	//*   9   15:iload_3         
	//*  10   16:iload           5
	//*  11   18:icmpge          243
		{
			boolean flag;
			boolean flag2;
			String s1;
label0:
			{
				s1 = as[i];
	//   12   21:aload_1         
	//   13   22:iload_3         
	//   14   23:aaload          
	//   15   24:astore          9
				Iterator iterator = c.iterator();
	//   16   26:aload_0         
	//   17   27:getfield        #53  <Field List c>
	//   18   30:invokeinterface #65  <Method Iterator List.iterator()>
	//   19   35:astore          10
				do
				{
					boolean flag3 = iterator.hasNext();
	//   20   37:aload           10
	//   21   39:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   22   44:istore          6
					flag2 = true;
	//   23   46:iconst_1        
	//   24   47:istore          4
					if(!flag3)
						break;
	//   25   49:iload           6
	//   26   51:ifeq            141
					String s2 = (String)iterator.next();
	//   27   54:aload           10
	//   28   56:invokeinterface #74  <Method Object Iterator.next()>
	//   29   61:checkcast       #76  <Class String>
	//   30   64:astore          11
					if(s2.equals(((Object) (s1))))
	//*  31   66:aload           11
	//*  32   68:aload           9
	//*  33   70:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  34   73:ifeq            81
					{
						flag = true;
	//   35   76:iconst_1        
	//   36   77:istore_2        
						break label0;
	//   37   78:goto            143
					}
					String s = String.valueOf("android.webkit.resource.");
	//   38   81:ldc1            #82  <String "android.webkit.resource.">
	//   39   83:invokestatic    #86  <Method String String.valueOf(Object)>
	//   40   86:astore          7
					s2 = String.valueOf(((Object) (s2)));
	//   41   88:aload           11
	//   42   90:invokestatic    #86  <Method String String.valueOf(Object)>
	//   43   93:astore          11
					if(s2.length() != 0)
	//*  44   95:aload           11
	//*  45   97:invokevirtual   #90  <Method int String.length()>
	//*  46  100:ifeq            115
						s = s.concat(s2);
	//   47  103:aload           7
	//   48  105:aload           11
	//   49  107:invokevirtual   #94  <Method String String.concat(String)>
	//   50  110:astore          7
					else
	//*  51  112:goto            126
						s = new String(s);
	//   52  115:new             #76  <Class String>
	//   53  118:dup             
	//   54  119:aload           7
	//   55  121:invokespecial   #97  <Method void String(String)>
	//   56  124:astore          7
					if(s.equals(((Object) (s1))))
	//*  57  126:aload           7
	//*  58  128:aload           9
	//*  59  130:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  60  133:ifeq            37
					{
						flag = true;
	//   61  136:iconst_1        
	//   62  137:istore_2        
						break label0;
	//   63  138:goto            143
					}
				} while(true);
				flag = false;
	//   64  141:iconst_0        
	//   65  142:istore_2        
			}
			if(flag)
	//*  66  143:iload_2         
	//*  67  144:ifeq            227
			{
				boolean flag1 = flag2;
	//   68  147:iload           4
	//   69  149:istore_2        
				if(a.containsKey(((Object) (s1))))
	//*  70  150:getstatic       #46  <Field Map a>
	//*  71  153:aload           9
	//*  72  155:invokeinterface #100 <Method boolean Map.containsKey(Object)>
	//*  73  160:ifeq            198
				{
					aw.e();
	//   74  163:invokestatic    #106 <Method xg aw.e()>
	//   75  166:pop             
					if(xg.a(b, (String)a.get(((Object) (s1)))))
	//*  76  167:aload_0         
	//*  77  168:getfield        #51  <Field Context b>
	//*  78  171:getstatic       #46  <Field Map a>
	//*  79  174:aload           9
	//*  80  176:invokeinterface #110 <Method Object Map.get(Object)>
	//*  81  181:checkcast       #76  <Class String>
	//*  82  184:invokestatic    #115 <Method boolean xg.a(Context, String)>
	//*  83  187:ifeq            196
						flag1 = flag2;
	//   84  190:iload           4
	//   85  192:istore_2        
					else
	//*  86  193:goto            198
						flag1 = false;
	//   87  196:iconst_0        
	//   88  197:istore_2        
				}
				if(flag1)
	//*  89  198:iload_2         
	//*  90  199:ifeq            215
					((List) (arraylist)).add(((Object) (s1)));
	//   91  202:aload           8
	//   92  204:aload           9
	//   93  206:invokeinterface #118 <Method boolean List.add(Object)>
	//   94  211:pop             
				else
	//*  95  212:goto            236
					d.c(s1);
	//   96  215:aload_0         
	//   97  216:getfield        #55  <Field ve d>
	//   98  219:aload           9
	//   99  221:invokevirtual   #122 <Method void ve.c(String)>
			} else
	//* 100  224:goto            236
			{
				d.b(s1);
	//  101  227:aload_0         
	//  102  228:getfield        #55  <Field ve d>
	//  103  231:aload           9
	//  104  233:invokevirtual   #124 <Method void ve.b(String)>
			}
		}

	//  105  236:iload_3         
	//  106  237:iconst_1        
	//  107  238:iadd            
	//  108  239:istore_3        
	//* 109  240:goto            15
		return ((List) (arraylist));
	//  110  243:aload           8
	//  111  245:areturn         
	}

	private static final Map a;
	private final Context b;
	private final List c;
	private final ve d;

	static 
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #21  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void HashMap()>
	//    3    7:astore_0        
		if(o.h())
	//*   4    8:invokestatic    #30  <Method boolean o.h()>
	//*   5   11:ifeq            36
		{
			((Map) (hashmap)).put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
	//    6   14:aload_0         
	//    7   15:ldc1            #32  <String "android.webkit.resource.AUDIO_CAPTURE">
	//    8   17:ldc1            #34  <String "android.permission.RECORD_AUDIO">
	//    9   19:invokeinterface #40  <Method Object Map.put(Object, Object)>
	//   10   24:pop             
			((Map) (hashmap)).put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
	//   11   25:aload_0         
	//   12   26:ldc1            #42  <String "android.webkit.resource.VIDEO_CAPTURE">
	//   13   28:ldc1            #44  <String "android.permission.CAMERA">
	//   14   30:invokeinterface #40  <Method Object Map.put(Object, Object)>
	//   15   35:pop             
		}
		a = ((Map) (hashmap));
	//   16   36:aload_0         
	//   17   37:putstatic       #46  <Field Map a>
	//*  18   40:return          
	}
}
