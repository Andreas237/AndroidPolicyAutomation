// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztv

static final class zztv$zzb extends zztv$zza
{

	public final void flush()
	{
		zzbuq.position(zzbur + ((zztv$zza)this).zzvl());
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ByteBuffer zzbuq>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field int zzbur>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #42  <Method int zztv$zza.zzvl()>
	//    6   12:iadd            
	//    7   13:invokevirtual   #45  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    8   16:pop             
	//    9   17:return          
	}

	private final ByteBuffer zzbuq;
	private int zzbur;

	zztv$zzb(ByteBuffer bytebuffer)
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
	//   10   18:invokespecial   #32  <Method void zztv$zza(byte[], int, int)>
		zzbuq = bytebuffer;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #34  <Field ByteBuffer zzbuq>
		zzbur = bytebuffer.position();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #26  <Method int ByteBuffer.position()>
	//   17   31:putfield        #36  <Field int zzbur>
	//   18   34:return          
	}
}
