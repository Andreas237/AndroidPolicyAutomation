// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzbn

static final class zzbn$zzb extends zzbn$zza
{

	public final void flush()
	{
		zzga.position(zzgb + ((zzbn$zza)this).zzai());
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ByteBuffer zzga>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field int zzgb>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #42  <Method int zzbn$zza.zzai()>
	//    6   12:iadd            
	//    7   13:invokevirtual   #45  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    8   16:pop             
	//    9   17:return          
	}

	private final ByteBuffer zzga;
	private int zzgb;

	zzbn$zzb(ByteBuffer bytebuffer)
	{
		super(bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method byte[] ByteBuffer.array()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method int ByteBuffer.arrayOffset()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #26  <Method int ByteBuffer.position()>
	//    7   13:iadd            
	//    8   14:aload_1         
	//    9   15:invokevirtual   #29  <Method int ByteBuffer.remaining()>
	//   10   18:invokespecial   #32  <Method void zzbn$zza(byte[], int, int)>
		zzga = bytebuffer;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #34  <Field ByteBuffer zzga>
		zzgb = bytebuffer.position();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #26  <Method int ByteBuffer.position()>
	//   17   31:putfield        #36  <Field int zzgb>
	//   18   34:return          
	}
}
