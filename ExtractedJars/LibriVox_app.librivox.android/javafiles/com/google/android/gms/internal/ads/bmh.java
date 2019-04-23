// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bme, bnw, bjo, bdo

public final class bmh
{

	public bmh(bjo bjo, bme bme1, Object obj, bdo abdo[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = bjo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field bjo a>
		b = bme1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field bme b>
		c = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field Object c>
		d = abdo;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #25  <Field bdo[] d>
	//   14   25:return          
	}

	public final boolean a(bmh bmh1, int i)
	{
		if(bmh1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		return bnw.a(((Object) (b.a(i))), ((Object) (bmh1.b.a(i)))) && bnw.a(((Object) (d[i])), ((Object) (bmh1.d[i])));
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field bme b>
	//    6   10:iload_2         
	//    7   11:invokevirtual   #32  <Method bmc bme.a(int)>
	//    8   14:aload_1         
	//    9   15:getfield        #21  <Field bme b>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #32  <Method bmc bme.a(int)>
	//   12   22:invokestatic    #37  <Method boolean bnw.a(Object, Object)>
	//   13   25:ifeq            48
	//   14   28:aload_0         
	//   15   29:getfield        #25  <Field bdo[] d>
	//   16   32:iload_2         
	//   17   33:aaload          
	//   18   34:aload_1         
	//   19   35:getfield        #25  <Field bdo[] d>
	//   20   38:iload_2         
	//   21   39:aaload          
	//   22   40:invokestatic    #37  <Method boolean bnw.a(Object, Object)>
	//   23   43:ifeq            48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public final bjo a;
	public final bme b;
	public final Object c;
	public final bdo d[];
}
