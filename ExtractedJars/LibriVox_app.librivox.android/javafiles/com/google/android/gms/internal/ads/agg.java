// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			agi, agj, agk, afn

public final class agg
{

	private agg(agk agk, agj agj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = agj;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #19  <Field agj a>
		b = agk;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #21  <Field agk b>
	//    8   14:return          
	}

	public static agg a(afn afn)
	{
		return new agg(((agk) (afn)), ((agj) (new agi(afn))));
	//    0    0:new             #2   <Class agg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #25  <Class agi>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #28  <Method void agi(afn)>
	//    7   13:invokespecial   #30  <Method void agg(agk, agj)>
	//    8   16:areturn         
	}

	private final agj a;
	private final agk b;
}
