// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asi, atx, akj, akl, 
//			akp, amp

public final class akk extends asi
	implements atx
{

	private akk()
	{
		super(((ash) (akj.e())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method akj akj.e()>
	//    2    4:invokespecial   #17  <Method void asi(ash)>
	//    3    7:return          
	}

	akk(akl akl)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void akk()>
	//    2    4:return          
	}

	public final akk a(int i)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		akj.a((akj)a, i);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class akj>
	//    5   11:iload_1         
	//    6   12:invokestatic    #32  <Method void akj.a(akj, int)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final akk a(akp akp)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		akj.a((akj)a, akp);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class akj>
	//    5   11:aload_1         
	//    6   12:invokestatic    #36  <Method void akj.a(akj, akp)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final akk a(amp amp)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		akj.a((akj)a, amp);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class akj>
	//    5   11:aload_1         
	//    6   12:invokestatic    #40  <Method void akj.a(akj, amp)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
