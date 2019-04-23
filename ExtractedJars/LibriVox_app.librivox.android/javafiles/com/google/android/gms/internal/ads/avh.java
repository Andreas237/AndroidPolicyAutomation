// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			avf, ash, avg, aqq, 
//			awf, aum

final class avh extends avf
{

	avh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void avf()>
	//    2    4:return          
	}

	private static void a(Object obj, avg avg1)
	{
		((ash)obj).zzfpu = avg1;
	//    0    0:aload_0         
	//    1    1:checkcast       #13  <Class ash>
	//    2    4:aload_1         
	//    3    5:putfield        #17  <Field avg ash.zzfpu>
	//    4    8:return          
	}

	final Object a()
	{
		return ((Object) (avg.b()));
	//    0    0:invokestatic    #24  <Method avg avg.b()>
	//    1    3:areturn         
	}

	final Object a(Object obj)
	{
		obj = ((Object) ((avg)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:astore_1        
		((avg) (obj)).c();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #28  <Method void avg.c()>
		return obj;
	//    5    9:aload_1         
	//    6   10:areturn         
	}

	final void a(Object obj, int i, int j)
	{
		((avg)obj).a(i << 3 | 5, ((Object) (Integer.valueOf(j))));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_5        
	//    6    8:ior             
	//    7    9:iload_3         
	//    8   10:invokestatic    #35  <Method Integer Integer.valueOf(int)>
	//    9   13:invokevirtual   #38  <Method void avg.a(int, Object)>
	//   10   16:return          
	}

	final void a(Object obj, int i, long l)
	{
		((avg)obj).a(i << 3, ((Object) (Long.valueOf(l))));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:lload_3         
	//    6    8:invokestatic    #44  <Method Long Long.valueOf(long)>
	//    7   11:invokevirtual   #38  <Method void avg.a(int, Object)>
	//    8   14:return          
	}

	final void a(Object obj, int i, aqq aqq)
	{
		((avg)obj).a(i << 3 | 2, ((Object) (aqq)));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_2        
	//    6    8:ior             
	//    7    9:aload_3         
	//    8   10:invokevirtual   #38  <Method void avg.a(int, Object)>
	//    9   13:return          
	}

	final void a(Object obj, int i, Object obj1)
	{
		((avg)obj).a(i << 3 | 3, ((Object) ((avg)obj1)));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_3        
	//    6    8:ior             
	//    7    9:aload_3         
	//    8   10:checkcast       #20  <Class avg>
	//    9   13:invokevirtual   #38  <Method void avg.a(int, Object)>
	//   10   16:return          
	}

	final void a(Object obj, awf awf)
	{
		((avg)obj).b(awf);
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #50  <Method void avg.b(awf)>
	//    4    8:return          
	}

	final void a(Object obj, Object obj1)
	{
		a(obj, (avg)obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #20  <Class avg>
	//    3    5:invokestatic    #53  <Method void a(Object, avg)>
	//    4    8:return          
	}

	final boolean a(aum aum)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final Object b(Object obj)
	{
		return ((Object) (((ash)obj).zzfpu));
	//    0    0:aload_1         
	//    1    1:checkcast       #13  <Class ash>
	//    2    4:getfield        #17  <Field avg ash.zzfpu>
	//    3    7:areturn         
	}

	final void b(Object obj, int i, long l)
	{
		((avg)obj).a(i << 3 | 1, ((Object) (Long.valueOf(l))));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:iload_2         
	//    3    5:iconst_3        
	//    4    6:ishl            
	//    5    7:iconst_1        
	//    6    8:ior             
	//    7    9:lload_3         
	//    8   10:invokestatic    #44  <Method Long Long.valueOf(long)>
	//    9   13:invokevirtual   #38  <Method void avg.a(int, Object)>
	//   10   16:return          
	}

	final void b(Object obj, awf awf)
	{
		((avg)obj).a(awf);
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #56  <Method void avg.a(awf)>
	//    4    8:return          
	}

	final void b(Object obj, Object obj1)
	{
		a(obj, (avg)obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #20  <Class avg>
	//    3    5:invokestatic    #53  <Method void a(Object, avg)>
	//    4    8:return          
	}

	final Object c(Object obj)
	{
		avg avg2 = ((ash)obj).zzfpu;
	//    0    0:aload_1         
	//    1    1:checkcast       #13  <Class ash>
	//    2    4:getfield        #17  <Field avg ash.zzfpu>
	//    3    7:astore_3        
		avg avg1 = avg2;
	//    4    8:aload_3         
	//    5    9:astore_2        
		if(avg2 == avg.a())
	//*   6   10:aload_3         
	//*   7   11:invokestatic    #58  <Method avg avg.a()>
	//*   8   14:if_acmpne       26
		{
			avg1 = avg.b();
	//    9   17:invokestatic    #24  <Method avg avg.b()>
	//   10   20:astore_2        
			a(obj, avg1);
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokestatic    #53  <Method void a(Object, avg)>
		}
		return ((Object) (avg1));
	//   14   26:aload_2         
	//   15   27:areturn         
	}

	final Object c(Object obj, Object obj1)
	{
		obj = ((Object) ((avg)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:astore_1        
		obj1 = ((Object) ((avg)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #20  <Class avg>
	//    5    9:astore_2        
		if(((avg) (obj1)).equals(((Object) (avg.a()))))
	//*   6   10:aload_2         
	//*   7   11:invokestatic    #58  <Method avg avg.a()>
	//*   8   14:invokevirtual   #63  <Method boolean avg.equals(Object)>
	//*   9   17:ifeq            22
			return obj;
	//   10   20:aload_1         
	//   11   21:areturn         
		else
			return ((Object) (avg.a(((avg) (obj)), ((avg) (obj1)))));
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokestatic    #66  <Method avg avg.a(avg, avg)>
	//   15   27:areturn         
	}

	final void d(Object obj)
	{
		((ash)obj).zzfpu.c();
	//    0    0:aload_1         
	//    1    1:checkcast       #13  <Class ash>
	//    2    4:getfield        #17  <Field avg ash.zzfpu>
	//    3    7:invokevirtual   #28  <Method void avg.c()>
	//    4   10:return          
	}

	final int e(Object obj)
	{
		return ((avg)obj).d();
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:invokevirtual   #73  <Method int avg.d()>
	//    3    7:ireturn         
	}

	final int f(Object obj)
	{
		return ((avg)obj).e();
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class avg>
	//    2    4:invokevirtual   #76  <Method int avg.e()>
	//    3    7:ireturn         
	}
}
