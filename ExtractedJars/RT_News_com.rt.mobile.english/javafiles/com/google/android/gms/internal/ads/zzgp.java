// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class zzgp
{

	public zzgp(float f, float f1, float f2, float f3, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzais = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #21  <Field float zzais>
		zzait = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #23  <Field float zzait>
		zzaiu = f + f2;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:fload_3         
	//   11   17:fadd            
	//   12   18:putfield        #25  <Field float zzaiu>
		zzaiv = f1 + f3;
	//   13   21:aload_0         
	//   14   22:fload_2         
	//   15   23:fload           4
	//   16   25:fadd            
	//   17   26:putfield        #27  <Field float zzaiv>
		zzaiw = i;
	//   18   29:aload_0         
	//   19   30:iload           5
	//   20   32:putfield        #29  <Field int zzaiw>
	//   21   35:return          
	}

	final float zzhb()
	{
		return zzais;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field float zzais>
	//    2    4:freturn         
	}

	final float zzhc()
	{
		return zzait;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field float zzait>
	//    2    4:freturn         
	}

	final float zzhd()
	{
		return zzaiu;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float zzaiu>
	//    2    4:freturn         
	}

	final float zzhe()
	{
		return zzaiv;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float zzaiv>
	//    2    4:freturn         
	}

	final int zzhf()
	{
		return zzaiw;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int zzaiw>
	//    2    4:ireturn         
	}

	private final float zzais;
	private final float zzait;
	private final float zzaiu;
	private final float zzaiv;
	private final int zzaiw;
}
