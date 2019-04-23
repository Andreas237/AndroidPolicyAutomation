// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bmm, aeg, bmk, bml

final class aeb
	implements bmm
{

	aeb(bmm bmm1, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = bmm1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field bmm a>
		b = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field byte[] b>
	//    8   14:return          
	}

	public final bml a()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field bmm a>
	//    2    4:astore_2        
		byte abyte0[] = b;
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field byte[] b>
	//    5    9:astore_1        
		obj = ((Object) (((bmm) (obj)).a()));
	//    6   10:aload_2         
	//    7   11:invokeinterface #23  <Method bml bmm.a()>
	//    8   16:astore_2        
		return ((bml) (new aeg(((bml) (new bmk(abyte0))), abyte0.length, ((bml) (obj)))));
	//    9   17:new             #25  <Class aeg>
	//   10   20:dup             
	//   11   21:new             #27  <Class bmk>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #30  <Method void bmk(byte[])>
	//   15   29:aload_1         
	//   16   30:arraylength     
	//   17   31:aload_2         
	//   18   32:invokespecial   #33  <Method void aeg(bml, int, bml)>
	//   19   35:areturn         
	}

	private final bmm a;
	private final byte b[];
}
