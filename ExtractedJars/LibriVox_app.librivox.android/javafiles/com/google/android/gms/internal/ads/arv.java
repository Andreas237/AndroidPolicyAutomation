// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aru, ask, ars, arx, 
//			atv, aum, avf, aqq, 
//			awf

final class arv extends aru
{

	arv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void aru()>
	//    2    4:return          
	}

	final int a(java.util.Map.Entry entry)
	{
		entry.getKey();
	//    0    0:aload_1         
	//    1    1:invokeinterface #17  <Method Object java.util.Map$Entry.getKey()>
	//    2    6:pop             
		throw new NoSuchMethodError();
	//    3    7:new             #19  <Class NoSuchMethodError>
	//    4   10:dup             
	//    5   11:invokespecial   #20  <Method void NoSuchMethodError()>
	//    6   14:athrow          
	}

	final arx a(Object obj)
	{
		return ((ask)obj).zzfqa;
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class ask>
	//    2    4:getfield        #27  <Field arx ask.zzfqa>
	//    3    7:areturn         
	}

	final Object a(ars ars1, atv atv, int i)
	{
		return ((Object) (ars1.a(atv, i)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #33  <Method asl ars.a(atv, int)>
	//    4    6:areturn         
	}

	final Object a(aum aum, Object obj, ars ars1, arx arx1, Object obj1, avf avf)
	{
		throw new NoSuchMethodError();
	//    0    0:new             #19  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	final void a(aqq aqq, Object obj, ars ars1, arx arx1)
	{
		throw new NoSuchMethodError();
	//    0    0:new             #19  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	final void a(aum aum, Object obj, ars ars1, arx arx1)
	{
		throw new NoSuchMethodError();
	//    0    0:new             #19  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	final void a(awf awf, java.util.Map.Entry entry)
	{
		entry.getKey();
	//    0    0:aload_2         
	//    1    1:invokeinterface #17  <Method Object java.util.Map$Entry.getKey()>
	//    2    6:pop             
		throw new NoSuchMethodError();
	//    3    7:new             #19  <Class NoSuchMethodError>
	//    4   10:dup             
	//    5   11:invokespecial   #20  <Method void NoSuchMethodError()>
	//    6   14:athrow          
	}

	final void a(Object obj, arx arx1)
	{
		((ask)obj).zzfqa = arx1;
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class ask>
	//    2    4:aload_2         
	//    3    5:putfield        #27  <Field arx ask.zzfqa>
	//    4    8:return          
	}

	final boolean a(atv atv)
	{
		return atv instanceof ask;
	//    0    0:aload_1         
	//    1    1:instanceof      #23  <Class ask>
	//    2    4:ireturn         
	}

	final arx b(Object obj)
	{
		arx arx2 = ((aru)this).a(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method arx aru.a(Object)>
	//    3    5:astore_3        
		arx arx1 = arx2;
	//    4    6:aload_3         
	//    5    7:astore_2        
		if(arx2.d())
	//*   6    8:aload_3         
	//*   7    9:invokevirtual   #48  <Method boolean arx.d()>
	//*   8   12:ifeq            29
		{
			arx1 = (arx)arx2.clone();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #51  <Method Object arx.clone()>
	//   11   19:checkcast       #44  <Class arx>
	//   12   22:astore_2        
			((aru)this).a(obj, arx1);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #53  <Method void aru.a(Object, arx)>
		}
		return arx1;
	//   17   29:aload_2         
	//   18   30:areturn         
	}

	final void c(Object obj)
	{
		((aru)this).a(obj).c();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method arx aru.a(Object)>
	//    3    5:invokevirtual   #57  <Method void arx.c()>
	//    4    8:return          
	}
}
