// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface bdv
{

	public abstract void a(ByteBuffer bytebuffer);

	public abstract boolean a();

	public abstract boolean a(int i, int j, int k);

	public abstract int b();

	public abstract int c();

	public abstract void d();

	public abstract ByteBuffer e();

	public abstract boolean f();

	public abstract void g();

	public abstract void h();

	public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

	/* static  */
	/* { */
	//    0    0:iconst_0        
	//    1    1:invokestatic    #14  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//    2    4:invokestatic    #20  <Method ByteOrder ByteOrder.nativeOrder()>
	//    3    7:invokevirtual   #24  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    4   10:putstatic       #26  <Field ByteBuffer a>
	//*   5   13:return          
	/* } */
}
