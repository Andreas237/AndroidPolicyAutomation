// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzhj

public final class zzhi extends AbstractSafeParcelable
{

	public zzhi()
	{
		this(((ParcelFileDescriptor) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #37  <Method void zzhi(ParcelFileDescriptor)>
	//    3    5:return          
	}

	public zzhi(ParcelFileDescriptor parcelfiledescriptor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		zzaju = parcelfiledescriptor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field ParcelFileDescriptor zzaju>
	//    5    9:return          
	}

	private final ParcelFileDescriptor zzhk()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ParcelFileDescriptor parcelfiledescriptor = zzaju;
	//    2    2:aload_0         
	//    3    3:getfield        #42  <Field ParcelFileDescriptor zzaju>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return parcelfiledescriptor;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #54  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (zzhk())), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokespecial   #56  <Method ParcelFileDescriptor zzhk()>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #60  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   10   16:aload_1         
	//   11   17:iload_3         
	//   12   18:invokestatic    #63  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   13   21:return          
	}

	public final boolean zzhi()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ParcelFileDescriptor parcelfiledescriptor = zzaju;
	//    2    2:aload_0         
	//    3    3:getfield        #42  <Field ParcelFileDescriptor zzaju>
	//    4    6:astore_2        
		boolean flag;
		if(parcelfiledescriptor != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          17
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore_1        
		else
	//*   9   13:aload_0         
	//*  10   14:monitorexit     
	//*  11   15:iload_1         
	//*  12   16:ireturn         
			flag = false;
	//   13   17:iconst_0        
	//   14   18:istore_1        
		this;
		JVM INSTR monitorexit ;
		return flag;
	//*  15   19:goto            13
		Exception exception;
		exception;
	//   16   22:astore_2        
	//*  17   23:aload_0         
		throw exception;
	//   18   24:monitorexit     
	//   19   25:aload_2         
	//   20   26:athrow          
	}

	public final InputStream zzhj()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj = ((Object) (zzaju));
	//    2    2:aload_0         
	//    3    3:getfield        #42  <Field ParcelFileDescriptor zzaju>
	//    4    6:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:aload_1         
	//    6    8:ifnonnull       15
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return null;
	//    9   13:aconst_null     
	//   10   14:areturn         
		obj = ((Object) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzaju)));
	//   11   15:new             #69  <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
	//   12   18:dup             
	//   13   19:aload_0         
	//   14   20:getfield        #42  <Field ParcelFileDescriptor zzaju>
	//   15   23:invokespecial   #70  <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
	//   16   26:astore_1        
		zzaju = null;
	//   17   27:aload_0         
	//   18   28:aconst_null     
	//   19   29:putfield        #42  <Field ParcelFileDescriptor zzaju>
		this;
	//   20   32:aload_0         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		return ((InputStream) (obj));
	//   22   34:aload_1         
	//   23   35:areturn         
		Exception exception;
		exception;
	//   24   36:astore_1        
	//*  25   37:aload_0         
		throw exception;
	//   26   38:monitorexit     
	//   27   39:aload_1         
	//   28   40:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzhj();
	private ParcelFileDescriptor zzaju;

	static 
	{
	//    0    0:new             #28  <Class zzhj>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zzhj()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
