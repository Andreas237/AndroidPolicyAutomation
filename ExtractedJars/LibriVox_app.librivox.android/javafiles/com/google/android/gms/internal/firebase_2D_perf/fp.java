// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			fn, hs, fm, gp, 
//			fb, fl, hp, df, 
//			fo

final class fp extends fn
{

	private fp()
	{
		super(((fo) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #31  <Method void fn(fo)>
	//    3    5:return          
	}

	fp(fo fo)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void fp()>
	//    2    4:return          
	}

	private static List b(Object obj, long l)
	{
		return (List)hs.f(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #41  <Method Object hs.f(Object, long)>
	//    3    5:checkcast       #43  <Class List>
	//    4    8:areturn         
	}

	final void a(Object obj, long l)
	{
		Object obj1 = ((Object) ((List)hs.f(obj, l)));
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:invokestatic    #41  <Method Object hs.f(Object, long)>
	//    3    5:checkcast       #43  <Class List>
	//    4    8:astore          4
		if(obj1 instanceof fm)
	//*   5   10:aload           4
	//*   6   12:instanceof      #46  <Class fm>
	//*   7   15:ifeq            33
		{
			obj1 = ((Object) (((fm)obj1).e()));
	//    8   18:aload           4
	//    9   20:checkcast       #46  <Class fm>
	//   10   23:invokeinterface #50  <Method fm fm.e()>
	//   11   28:astore          4
		} else
	//*  12   30:goto            93
		{
			if(a.isAssignableFrom(obj1.getClass()))
	//*  13   33:getstatic       #26  <Field Class a>
	//*  14   36:aload           4
	//*  15   38:invokevirtual   #24  <Method Class Object.getClass()>
	//*  16   41:invokevirtual   #56  <Method boolean Class.isAssignableFrom(Class)>
	//*  17   44:ifeq            48
				return;
	//   18   47:return          
			if((obj1 instanceof gp) && (obj1 instanceof fb))
	//*  19   48:aload           4
	//*  20   50:instanceof      #58  <Class gp>
	//*  21   53:ifeq            86
	//*  22   56:aload           4
	//*  23   58:instanceof      #60  <Class fb>
	//*  24   61:ifeq            86
			{
				obj = ((Object) ((fb)obj1));
	//   25   64:aload           4
	//   26   66:checkcast       #60  <Class fb>
	//   27   69:astore_1        
				if(((fb) (obj)).a())
	//*  28   70:aload_1         
	//*  29   71:invokeinterface #63  <Method boolean fb.a()>
	//*  30   76:ifeq            85
					((fb) (obj)).b();
	//   31   79:aload_1         
	//   32   80:invokeinterface #65  <Method void fb.b()>
				return;
	//   33   85:return          
			}
			obj1 = ((Object) (Collections.unmodifiableList(((List) (obj1)))));
	//   34   86:aload           4
	//   35   88:invokestatic    #18  <Method List Collections.unmodifiableList(List)>
	//   36   91:astore          4
		}
		hs.a(obj, l, obj1);
	//   37   93:aload_1         
	//   38   94:lload_2         
	//   39   95:aload           4
	//   40   97:invokestatic    #68  <Method void hs.a(Object, long, Object)>
	//   41  100:return          
	}

	final void a(Object obj, Object obj1, long l)
	{
		Object obj2 = ((Object) (b(obj1, l)));
	//    0    0:aload_2         
	//    1    1:lload_3         
	//    2    2:invokestatic    #71  <Method List b(Object, long)>
	//    3    5:astore          7
		int i = ((List) (obj2)).size();
	//    4    7:aload           7
	//    5    9:invokeinterface #75  <Method int List.size()>
	//    6   14:istore          5
		List list = b(obj, l);
	//    7   16:aload_1         
	//    8   17:lload_3         
	//    9   18:invokestatic    #71  <Method List b(Object, long)>
	//   10   21:astore          8
		if(list.isEmpty())
	//*  11   23:aload           8
	//*  12   25:invokeinterface #78  <Method boolean List.isEmpty()>
	//*  13   30:ifeq            105
		{
			if(list instanceof fm)
	//*  14   33:aload           8
	//*  15   35:instanceof      #46  <Class fm>
	//*  16   38:ifeq            54
				obj1 = ((Object) (new fl(i)));
	//   17   41:new             #80  <Class fl>
	//   18   44:dup             
	//   19   45:iload           5
	//   20   47:invokespecial   #83  <Method void fl(int)>
	//   21   50:astore_2        
			else
	//*  22   51:goto            96
			if((list instanceof gp) && (list instanceof fb))
	//*  23   54:aload           8
	//*  24   56:instanceof      #58  <Class gp>
	//*  25   59:ifeq            86
	//*  26   62:aload           8
	//*  27   64:instanceof      #60  <Class fb>
	//*  28   67:ifeq            86
				obj1 = ((Object) (((fb)list).d(i)));
	//   29   70:aload           8
	//   30   72:checkcast       #60  <Class fb>
	//   31   75:iload           5
	//   32   77:invokeinterface #87  <Method fb fb.d(int)>
	//   33   82:astore_2        
			else
	//*  34   83:goto            96
				obj1 = ((Object) (new ArrayList(i)));
	//   35   86:new             #89  <Class ArrayList>
	//   36   89:dup             
	//   37   90:iload           5
	//   38   92:invokespecial   #90  <Method void ArrayList(int)>
	//   39   95:astore_2        
			hs.a(obj, l, obj1);
	//   40   96:aload_1         
	//   41   97:lload_3         
	//   42   98:aload_2         
	//   43   99:invokestatic    #68  <Method void hs.a(Object, long, Object)>
		} else
	//*  44  102:goto            264
		if(a.isAssignableFrom(((Object) (list)).getClass()))
	//*  45  105:getstatic       #26  <Field Class a>
	//*  46  108:aload           8
	//*  47  110:invokevirtual   #24  <Method Class Object.getClass()>
	//*  48  113:invokevirtual   #56  <Method boolean Class.isAssignableFrom(Class)>
	//*  49  116:ifeq            153
		{
			obj1 = ((Object) (new ArrayList(list.size() + i)));
	//   50  119:new             #89  <Class ArrayList>
	//   51  122:dup             
	//   52  123:aload           8
	//   53  125:invokeinterface #75  <Method int List.size()>
	//   54  130:iload           5
	//   55  132:iadd            
	//   56  133:invokespecial   #90  <Method void ArrayList(int)>
	//   57  136:astore_2        
			((ArrayList) (obj1)).addAll(((java.util.Collection) (list)));
	//   58  137:aload_2         
	//   59  138:aload           8
	//   60  140:invokevirtual   #94  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   61  143:pop             
			hs.a(obj, l, obj1);
	//   62  144:aload_1         
	//   63  145:lload_3         
	//   64  146:aload_2         
	//   65  147:invokestatic    #68  <Method void hs.a(Object, long, Object)>
		} else
	//*  66  150:goto            264
		if(list instanceof hp)
	//*  67  153:aload           8
	//*  68  155:instanceof      #96  <Class hp>
	//*  69  158:ifeq            198
		{
			obj1 = ((Object) (new fl(list.size() + i)));
	//   70  161:new             #80  <Class fl>
	//   71  164:dup             
	//   72  165:aload           8
	//   73  167:invokeinterface #75  <Method int List.size()>
	//   74  172:iload           5
	//   75  174:iadd            
	//   76  175:invokespecial   #83  <Method void fl(int)>
	//   77  178:astore_2        
			((df) (obj1)).addAll(((java.util.Collection) ((hp)list)));
	//   78  179:aload_2         
	//   79  180:aload           8
	//   80  182:checkcast       #96  <Class hp>
	//   81  185:invokevirtual   #99  <Method boolean df.addAll(java.util.Collection)>
	//   82  188:pop             
			hs.a(obj, l, obj1);
	//   83  189:aload_1         
	//   84  190:lload_3         
	//   85  191:aload_2         
	//   86  192:invokestatic    #68  <Method void hs.a(Object, long, Object)>
		} else
	//*  87  195:goto            264
		{
			obj1 = ((Object) (list));
	//   88  198:aload           8
	//   89  200:astore_2        
			if(list instanceof gp)
	//*  90  201:aload           8
	//*  91  203:instanceof      #58  <Class gp>
	//*  92  206:ifeq            264
			{
				obj1 = ((Object) (list));
	//   93  209:aload           8
	//   94  211:astore_2        
				if(list instanceof fb)
	//*  95  212:aload           8
	//*  96  214:instanceof      #60  <Class fb>
	//*  97  217:ifeq            264
				{
					fb fb1 = (fb)list;
	//   98  220:aload           8
	//   99  222:checkcast       #60  <Class fb>
	//  100  225:astore          9
					obj1 = ((Object) (list));
	//  101  227:aload           8
	//  102  229:astore_2        
					if(!fb1.a())
	//* 103  230:aload           9
	//* 104  232:invokeinterface #63  <Method boolean fb.a()>
	//* 105  237:ifne            264
					{
						obj1 = ((Object) (fb1.d(list.size() + i)));
	//  106  240:aload           9
	//  107  242:aload           8
	//  108  244:invokeinterface #75  <Method int List.size()>
	//  109  249:iload           5
	//  110  251:iadd            
	//  111  252:invokeinterface #87  <Method fb fb.d(int)>
	//  112  257:astore_2        
						hs.a(obj, l, obj1);
	//  113  258:aload_1         
	//  114  259:lload_3         
	//  115  260:aload_2         
	//  116  261:invokestatic    #68  <Method void hs.a(Object, long, Object)>
					}
				}
			}
		}
		i = ((List) (obj1)).size();
	//  117  264:aload_2         
	//  118  265:invokeinterface #75  <Method int List.size()>
	//  119  270:istore          5
		int j = ((List) (obj2)).size();
	//  120  272:aload           7
	//  121  274:invokeinterface #75  <Method int List.size()>
	//  122  279:istore          6
		if(i > 0 && j > 0)
	//* 123  281:iload           5
	//* 124  283:ifle            300
	//* 125  286:iload           6
	//* 126  288:ifle            300
			((List) (obj1)).addAll(((java.util.Collection) (obj2)));
	//  127  291:aload_2         
	//  128  292:aload           7
	//  129  294:invokeinterface #100 <Method boolean List.addAll(java.util.Collection)>
	//  130  299:pop             
		if(i > 0)
	//* 131  300:iload           5
	//* 132  302:ifle            308
			obj2 = obj1;
	//  133  305:aload_2         
	//  134  306:astore          7
		hs.a(obj, l, obj2);
	//  135  308:aload_1         
	//  136  309:lload_3         
	//  137  310:aload           7
	//  138  312:invokestatic    #68  <Method void hs.a(Object, long, Object)>
	//  139  315:return          
	}

	private static final Class a = ((Object) (Collections.unmodifiableList(Collections.emptyList()))).getClass();

	static 
	{
	//    0    0:invokestatic    #14  <Method List Collections.emptyList()>
	//    1    3:invokestatic    #18  <Method List Collections.unmodifiableList(List)>
	//    2    6:invokevirtual   #24  <Method Class Object.getClass()>
	//    3    9:putstatic       #26  <Field Class a>
	//*   4   12:return          
	}
}
