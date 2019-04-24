// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzah

public static class zzah$zzc
	implements com.google.android.gms.wearable.etFdForAssetResult
{

	public ParcelFileDescriptor getFd()
	{
		if(mClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean mClosed>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Cannot access the file descriptor after release().");
	//    3    7:new             #33  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #35  <String "Cannot access the file descriptor after release().">
	//    6   13:invokespecial   #38  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return zzbUq;
	//    8   17:aload_0         
	//    9   18:getfield        #28  <Field ParcelFileDescriptor zzbUq>
	//   10   21:areturn         
	}

	public InputStream getInputStream()
	{
		if(mClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean mClosed>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Cannot access the input stream after release().");
	//    3    7:new             #33  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #42  <String "Cannot access the input stream after release().">
	//    6   13:invokespecial   #38  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(zzbUq == null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #28  <Field ParcelFileDescriptor zzbUq>
	//*  10   21:ifnonnull       26
			return null;
	//   11   24:aconst_null     
	//   12   25:areturn         
		if(zzbUb == null)
	//*  13   26:aload_0         
	//*  14   27:getfield        #44  <Field InputStream zzbUb>
	//*  15   30:ifnonnull       48
			zzbUb = ((InputStream) (new android.os.eDescriptor.AutoCloseInputStream(zzbUq)));
	//   16   33:aload_0         
	//   17   34:new             #46  <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:getfield        #28  <Field ParcelFileDescriptor zzbUq>
	//   21   42:invokespecial   #49  <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
	//   22   45:putfield        #44  <Field InputStream zzbUb>
		return zzbUb;
	//   23   48:aload_0         
	//   24   49:getfield        #44  <Field InputStream zzbUb>
	//   25   52:areturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Status zzair>
	//    2    4:areturn         
	}

	public void release()
	{
		if(zzbUq == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ParcelFileDescriptor zzbUq>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(mClosed)
	//*   4    8:aload_0         
	//*   5    9:getfield        #24  <Field boolean mClosed>
	//*   6   12:ifeq            25
			throw new IllegalStateException("releasing an already released result.");
	//    7   15:new             #33  <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc1            #56  <String "releasing an already released result.">
	//   10   21:invokespecial   #38  <Method void IllegalStateException(String)>
	//   11   24:athrow          
		try
		{
			if(zzbUb != null)
	//*  12   25:aload_0         
	//*  13   26:getfield        #44  <Field InputStream zzbUb>
	//*  14   29:ifnull          42
			{
				zzbUb.close();
	//   15   32:aload_0         
	//   16   33:getfield        #44  <Field InputStream zzbUb>
	//   17   36:invokevirtual   #61  <Method void InputStream.close()>
				break MISSING_BLOCK_LABEL_49;
	//   18   39:goto            49
			}
		}
	//*  19   42:aload_0         
	//*  20   43:getfield        #28  <Field ParcelFileDescriptor zzbUq>
	//*  21   46:invokevirtual   #64  <Method void ParcelFileDescriptor.close()>
	//*  22   49:aload_0         
	//*  23   50:iconst_1        
	//*  24   51:putfield        #24  <Field boolean mClosed>
	//*  25   54:aload_0         
	//*  26   55:aconst_null     
	//*  27   56:putfield        #28  <Field ParcelFileDescriptor zzbUq>
	//*  28   59:aload_0         
	//*  29   60:aconst_null     
	//*  30   61:putfield        #44  <Field InputStream zzbUb>
	//*  31   64:return          
		catch(IOException ioexception)
	//*  32   65:astore_1        
		{
			return;
	//   33   66:return          
		}
		zzbUq.close();
		mClosed = true;
		zzbUq = null;
		zzbUb = null;
		return;
	}

	private volatile boolean mClosed;
	private final Status zzair;
	private volatile InputStream zzbUb;
	private volatile ParcelFileDescriptor zzbUq;

	public zzah$zzc(Status status, ParcelFileDescriptor parcelfiledescriptor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mClosed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #24  <Field boolean mClosed>
		zzair = status;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #26  <Field Status zzair>
		zzbUq = parcelfiledescriptor;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #28  <Field ParcelFileDescriptor zzbUq>
	//   11   19:return          
	}
}
