// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.File;
import java.util.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			iy, iv, iw, iu, 
//			ik

final class iy$4
	implements Runnable
{

	public final void run()
	{
		String s = iy.a(c, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field iy c>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field String a>
	//    4    8:invokestatic    #30  <Method String iy.a(iy, String)>
	//    5   11:astore_1        
		iy.a(c, iv.a(b));
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field iy c>
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field Context b>
	//   10   20:invokestatic    #35  <Method iw iv.a(Context)>
	//   11   23:invokestatic    #38  <Method iw iy.a(iy, iw)>
	//   12   26:pop             
		Object obj = ((Object) (iy.a(c).a(s)));
	//   13   27:aload_0         
	//   14   28:getfield        #18  <Field iy c>
	//   15   31:invokestatic    #41  <Method iw iy.a(iy)>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #46  <Method iu iw.a(String)>
	//   18   38:astore_2        
		if(obj == null || !((iu) (obj)).g())
	//*  19   39:aload_2         
	//*  20   40:ifnull          50
	//*  21   43:aload_2         
	//*  22   44:invokevirtual   #52  <Method boolean iu.g()>
	//*  23   47:ifne            51
			return;
	//   24   50:return          
		obj = ((Object) (((iu) (obj)).b()));
	//   25   51:aload_2         
	//   26   52:invokevirtual   #55  <Method String iu.b()>
	//   27   55:astore_2        
		ArrayList arraylist = new ArrayList();
	//   28   56:new             #57  <Class ArrayList>
	//   29   59:dup             
	//   30   60:invokespecial   #58  <Method void ArrayList()>
	//   31   63:astore_3        
		ArrayList arraylist1 = new ArrayList();
	//   32   64:new             #57  <Class ArrayList>
	//   33   67:dup             
	//   34   68:invokespecial   #58  <Method void ArrayList()>
	//   35   71:astore          4
		for(Iterator iterator1 = iy.a(c).d().iterator(); iterator1.hasNext();)
	//*  36   73:aload_0         
	//*  37   74:getfield        #18  <Field iy c>
	//*  38   77:invokestatic    #41  <Method iw iy.a(iy)>
	//*  39   80:invokevirtual   #62  <Method List iw.d()>
	//*  40   83:invokeinterface #68  <Method Iterator List.iterator()>
	//*  41   88:astore          5
	//*  42   90:aload           5
	//*  43   92:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//*  44   97:ifeq            182
		{
			iu iu2 = (iu)iterator1.next();
	//   45  100:aload           5
	//   46  102:invokeinterface #77  <Method Object Iterator.next()>
	//   47  107:checkcast       #48  <Class iu>
	//   48  110:astore          6
			if(iu2.b().equals(obj))
	//*  49  112:aload           6
	//*  50  114:invokevirtual   #55  <Method String iu.b()>
	//*  51  117:aload_2         
	//*  52  118:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  53  121:ifeq            170
				ik.f((new StringBuilder()).append(iy.c(c).a()).append(File.separator).append(ik.a(b, s)).toString());
	//   54  124:new             #85  <Class StringBuilder>
	//   55  127:dup             
	//   56  128:invokespecial   #86  <Method void StringBuilder()>
	//   57  131:aload_0         
	//   58  132:getfield        #18  <Field iy c>
	//   59  135:invokestatic    #89  <Method ik iy.c(iy)>
	//   60  138:invokevirtual   #93  <Method String ik.a()>
	//   61  141:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   62  144:getstatic       #102 <Field String File.separator>
	//   63  147:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   64  150:aload_0         
	//   65  151:getfield        #22  <Field Context b>
	//   66  154:aload_1         
	//   67  155:invokestatic    #105 <Method String ik.a(Context, String)>
	//   68  158:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   69  161:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   70  164:invokestatic    #112 <Method void ik.f(String)>
			else
	//*  71  167:goto            90
				((List) (arraylist)).add(((Object) (iu2)));
	//   72  170:aload_3         
	//   73  171:aload           6
	//   74  173:invokeinterface #115 <Method boolean List.add(Object)>
	//   75  178:pop             
		}

	//*  76  179:goto            90
		iy.a(c).g = ((List) (arraylist));
	//   77  182:aload_0         
	//   78  183:getfield        #18  <Field iy c>
	//   79  186:invokestatic    #41  <Method iw iy.a(iy)>
	//   80  189:aload_3         
	//   81  190:putfield        #118 <Field List iw.g>
		iv.a(b, iy.a(c));
	//   82  193:aload_0         
	//   83  194:getfield        #22  <Field Context b>
	//   84  197:aload_0         
	//   85  198:getfield        #18  <Field iy c>
	//   86  201:invokestatic    #41  <Method iw iy.a(iy)>
	//   87  204:invokestatic    #121 <Method void iv.a(Context, iw)>
		iu iu1;
		for(Iterator iterator = ((List) (arraylist1)).iterator(); iterator.hasNext(); iv.a(b, iu1))
	//*  88  207:aload           4
	//*  89  209:invokeinterface #68  <Method Iterator List.iterator()>
	//*  90  214:astore_1        
	//*  91  215:aload_1         
	//*  92  216:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//*  93  221:ifeq            245
			iu1 = (iu)iterator.next();
	//   94  224:aload_1         
	//   95  225:invokeinterface #77  <Method Object Iterator.next()>
	//   96  230:checkcast       #48  <Class iu>
	//   97  233:astore_2        

	//   98  234:aload_0         
	//   99  235:getfield        #22  <Field Context b>
	//  100  238:aload_2         
	//  101  239:invokestatic    #124 <Method void iv.a(Context, iu)>
	//* 102  242:goto            215
	//  103  245:return          
	}

	private String a;
	private Context b;
	private iy c;

	iy$4(iy iy1, String s, Context context)
	{
		c = iy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field iy c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String a>
		b = context;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field Context b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #25  <Method void Object()>
	//   11   19:return          
	}
}
