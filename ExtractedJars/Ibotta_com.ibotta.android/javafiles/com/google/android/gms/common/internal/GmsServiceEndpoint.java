// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;


public class GmsServiceEndpoint
{

	public GmsServiceEndpoint(String s, String s1, boolean flag, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mPackageName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String mPackageName>
		zzue = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String zzue>
		zzuf = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field boolean zzuf>
		zztq = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #25  <Field int zztq>
	//   14   25:return          
	}

	final int getBindFlags()
	{
		return zztq;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int zztq>
	//    2    4:ireturn         
	}

	final String getPackageName()
	{
		return mPackageName;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String mPackageName>
	//    2    4:areturn         
	}

	final String zzcw()
	{
		return zzue;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String zzue>
	//    2    4:areturn         
	}

	private final String mPackageName;
	private final int zztq;
	private final String zzue;
	private final boolean zzuf;
}
