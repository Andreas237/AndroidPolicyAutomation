// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzac;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzu

static final class zzu$zzb
	implements com.google.android.gms.wearable.GetOutputStreamResult
{

	public OutputStream getOutputStream()
	{
		return zzbUc;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field OutputStream zzbUc>
	//    2    4:areturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Status zzair>
	//    2    4:areturn         
	}

	public void release()
	{
		if(zzbUc == null)
			break MISSING_BLOCK_LABEL_14;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field OutputStream zzbUc>
	//    2    4:ifnull          14
		zzbUc.close();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field OutputStream zzbUc>
	//    5   11:invokevirtual   #43  <Method void OutputStream.close()>
		return;
	//    6   14:return          
		IOException ioexception;
		ioexception;
	//    7   15:astore_1        
	//    8   16:return          
	}

	private final Status zzair;
	private final OutputStream zzbUc;

	zzu$zzb(Status status, OutputStream outputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzair = (Status)zzac.zzw(((Object) (status)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #24  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #26  <Class Status>
	//    6   12:putfield        #28  <Field Status zzair>
		zzbUc = outputstream;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #30  <Field OutputStream zzbUc>
	//   10   20:return          
	}
}
