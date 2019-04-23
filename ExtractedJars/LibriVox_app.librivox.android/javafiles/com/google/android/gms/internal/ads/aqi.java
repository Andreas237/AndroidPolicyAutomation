// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			atw, aqh, atv

public abstract class aqi
	implements atw
{

	public aqi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public abstract aqi a();

	protected abstract aqi a(aqh aqh1);

	public final atw a(atv atv)
	{
		if(((Object) (q())).getClass().isInstance(((Object) (atv))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #19  <Method atv q()>
	//*   2    4:invokevirtual   #23  <Method Class Object.getClass()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #29  <Method boolean Class.isInstance(Object)>
	//*   5   11:ifeq            23
			return ((atw) (a((aqh)atv)));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:checkcast       #31  <Class aqh>
	//    9   19:invokevirtual   #33  <Method aqi a(aqh)>
	//   10   22:areturn         
		else
			throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
	//   11   23:new             #35  <Class IllegalArgumentException>
	//   12   26:dup             
	//   13   27:ldc1            #37  <String "mergeFrom(MessageLite) can only merge messages of the same type.">
	//   14   29:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//   15   32:athrow          
	}

	public Object clone()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method aqi a()>
	//    2    4:areturn         
	}
}
