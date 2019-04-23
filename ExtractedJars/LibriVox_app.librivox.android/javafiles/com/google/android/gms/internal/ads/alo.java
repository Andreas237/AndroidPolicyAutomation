// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asi, atx, aln, alp, 
//			aqq

public final class alo extends asi
	implements atx
{

	private alo()
	{
		super(((ash) (aln.d())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method aln aln.d()>
	//    2    4:invokespecial   #17  <Method void asi(ash)>
	//    3    7:return          
	}

	alo(alp alp)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void alo()>
	//    2    4:return          
	}

	public final alo a(int i)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		aln.a((aln)a, 0);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class aln>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #32  <Method void aln.a(aln, int)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final alo a(aqq aqq)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		aln.a((aln)a, aqq);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class aln>
	//    5   11:aload_1         
	//    6   12:invokestatic    #36  <Method void aln.a(aln, aqq)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
