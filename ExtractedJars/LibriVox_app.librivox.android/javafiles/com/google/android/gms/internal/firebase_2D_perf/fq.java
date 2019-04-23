// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			fn, hs, fb, fo

final class fq extends fn
{

	private fq()
	{
		super(((fo) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #9   <Method void fn(fo)>
	//    3    5:return          
	}

	fq(fo fo)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void fq()>
	//    2    4:return          
	}

	private static fb b(Object obj, long l)
	{
		return (fb)hs.f(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #20  <Method Object hs.f(Object, long)>
	//    3    5:checkcast       #22  <Class fb>
	//    4    8:areturn         
	}

	final void a(Object obj, long l)
	{
		b(obj, l).b();
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:invokestatic    #26  <Method fb b(Object, long)>
	//    3    5:invokeinterface #28  <Method void fb.b()>
	//    4   10:return          
	}

	final void a(Object obj, Object obj1, long l)
	{
		Object obj2 = ((Object) (b(obj, l)));
	//    0    0:aload_1         
	//    1    1:lload_3         
	//    2    2:invokestatic    #26  <Method fb b(Object, long)>
	//    3    5:astore          7
		fb fb1 = b(obj1, l);
	//    4    7:aload_2         
	//    5    8:lload_3         
	//    6    9:invokestatic    #26  <Method fb b(Object, long)>
	//    7   12:astore          8
		int i = ((fb) (obj2)).size();
	//    8   14:aload           7
	//    9   16:invokeinterface #33  <Method int fb.size()>
	//   10   21:istore          5
		int j = fb1.size();
	//   11   23:aload           8
	//   12   25:invokeinterface #33  <Method int fb.size()>
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
				if(!((fb) (obj2)).a())
	//*  24   51:aload           7
	//*  25   53:invokeinterface #36  <Method boolean fb.a()>
	//*  26   58:ifne            74
					obj1 = ((Object) (((fb) (obj2)).d(j + i)));
	//   27   61:aload           7
	//   28   63:iload           6
	//   29   65:iload           5
	//   30   67:iadd            
	//   31   68:invokeinterface #40  <Method fb fb.d(int)>
	//   32   73:astore_2        
				((fb) (obj1)).addAll(((java.util.Collection) (fb1)));
	//   33   74:aload_2         
	//   34   75:aload           8
	//   35   77:invokeinterface #44  <Method boolean fb.addAll(java.util.Collection)>
	//   36   82:pop             
			}
		}
		obj2 = ((Object) (fb1));
	//   37   83:aload           8
	//   38   85:astore          7
		if(i > 0)
	//*  39   87:iload           5
	//*  40   89:ifle            95
			obj2 = obj1;
	//   41   92:aload_2         
	//   42   93:astore          7
		hs.a(obj, l, obj2);
	//   43   95:aload_1         
	//   44   96:lload_3         
	//   45   97:aload           7
	//   46   99:invokestatic    #47  <Method void hs.a(Object, long, Object)>
	//   47  102:return          
	}
}
