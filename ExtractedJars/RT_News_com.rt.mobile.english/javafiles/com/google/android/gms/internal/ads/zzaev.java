// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.*;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaex, zzaew, zzakb, zzajm

public final class zzaev extends AbstractSafeParcelable
{

	public zzaev(ParcelFileDescriptor parcelfiledescriptor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		zzcft = parcelfiledescriptor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field ParcelFileDescriptor zzcft>
		zzcfu = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #41  <Field Parcelable zzcfu>
		zzcfv = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #43  <Field boolean zzcfv>
	//   11   19:return          
	}

	public zzaev(SafeParcelable safeparcelable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		zzcft = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #39  <Field ParcelFileDescriptor zzcft>
		zzcfu = ((Parcelable) (safeparcelable));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #41  <Field Parcelable zzcfu>
		zzcfv = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #43  <Field boolean zzcfv>
	//   11   19:return          
	}

	private final ParcelFileDescriptor zze(byte abyte0[])
	{
		android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
		ParcelFileDescriptor aparcelfiledescriptor[];
		aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
	//    0    0:invokestatic    #56  <Method ParcelFileDescriptor[] ParcelFileDescriptor.createPipe()>
	//    1    3:astore_3        
		autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(aparcelfiledescriptor[1]);
	//    2    4:new             #58  <Class android.os.ParcelFileDescriptor$AutoCloseOutputStream>
	//    3    7:dup             
	//    4    8:aload_3         
	//    5    9:iconst_1        
	//    6   10:aaload          
	//    7   11:invokespecial   #60  <Method void android.os.ParcelFileDescriptor$AutoCloseOutputStream(ParcelFileDescriptor)>
	//    8   14:astore_2        
		IOException ioexception;
		try
		{
			(new Thread(((Runnable) (new zzaew(this, ((java.io.OutputStream) (autocloseoutputstream)), abyte0))))).start();
	//    9   15:new             #62  <Class Thread>
	//   10   18:dup             
	//   11   19:new             #64  <Class zzaew>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokespecial   #67  <Method void zzaew(zzaev, java.io.OutputStream, byte[])>
	//   17   29:invokespecial   #70  <Method void Thread(Runnable)>
	//   18   32:invokevirtual   #73  <Method void Thread.start()>
		}
	//*  19   35:aload_3         
	//*  20   36:iconst_0        
	//*  21   37:aaload          
	//*  22   38:astore_1        
	//*  23   39:aload_1         
	//*  24   40:areturn         
		catch(IOException ioexception1)
	//*  25   41:astore_3        
		{
			abyte0 = ((byte []) (autocloseoutputstream));
	//   26   42:aload_2         
	//   27   43:astore_1        
			ioexception = ioexception1;
	//   28   44:aload_3         
	//   29   45:astore_2        
			break MISSING_BLOCK_LABEL_52;
	//   30   46:goto            52
		}
		abyte0 = ((byte []) (aparcelfiledescriptor[0]));
		return ((ParcelFileDescriptor) (abyte0));
		ioexception;
	//   31   49:astore_2        
		abyte0 = null;
	//   32   50:aconst_null     
	//   33   51:astore_1        
		zzakb.zzb("Error transporting the ad response", ((Throwable) (ioexception)));
	//   34   52:ldc1            #75  <String "Error transporting the ad response">
	//   35   54:aload_2         
	//   36   55:invokestatic    #81  <Method void zzakb.zzb(String, Throwable)>
		zzbv.zzeo().zza(((Throwable) (ioexception)), "LargeParcelTeleporter.pipeData.2");
	//   37   58:invokestatic    #87  <Method zzajm zzbv.zzeo()>
	//   38   61:aload_2         
	//   39   62:ldc1            #89  <String "LargeParcelTeleporter.pipeData.2">
	//   40   64:invokevirtual   #95  <Method void zzajm.zza(Throwable, String)>
		IOUtils.closeQuietly(((java.io.Closeable) (abyte0)));
	//   41   67:aload_1         
	//   42   68:invokestatic    #101 <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return null;
	//   43   71:aconst_null     
	//   44   72:areturn         
	}

	private final ParcelFileDescriptor zzoc()
	{
		Parcel parcel;
		if(zzcft != null)
			break MISSING_BLOCK_LABEL_50;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ParcelFileDescriptor zzcft>
	//    2    4:ifnonnull       50
		parcel = Parcel.obtain();
	//    3    7:invokestatic    #111 <Method Parcel Parcel.obtain()>
	//    4   10:astore_1        
		byte abyte0[];
		zzcfu.writeToParcel(parcel, 0);
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field Parcelable zzcfu>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokeinterface #117 <Method void Parcelable.writeToParcel(Parcel, int)>
		abyte0 = parcel.marshall();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #121 <Method byte[] Parcel.marshall()>
	//   12   26:astore_2        
		parcel.recycle();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #124 <Method void Parcel.recycle()>
		zzcft = zze(abyte0);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokespecial   #126 <Method ParcelFileDescriptor zze(byte[])>
	//   19   37:putfield        #39  <Field ParcelFileDescriptor zzcft>
		break MISSING_BLOCK_LABEL_50;
	//   20   40:goto            50
		Exception exception;
		exception;
	//   21   43:astore_2        
		parcel.recycle();
	//   22   44:aload_1         
	//   23   45:invokevirtual   #124 <Method void Parcel.recycle()>
		throw exception;
	//   24   48:aload_2         
	//   25   49:athrow          
		return zzcft;
	//   26   50:aload_0         
	//   27   51:getfield        #39  <Field ParcelFileDescriptor zzcft>
	//   28   54:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		zzoc();
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method ParcelFileDescriptor zzoc()>
	//    2    4:pop             
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    3    5:aload_1         
	//    4    6:invokestatic    #134 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    5    9:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((Parcelable) (zzcft)), i, false);
	//    6   10:aload_1         
	//    7   11:iconst_2        
	//    8   12:aload_0         
	//    9   13:getfield        #39  <Field ParcelFileDescriptor zzcft>
	//   10   16:iload_2         
	//   11   17:iconst_0        
	//   12   18:invokestatic    #138 <Method void SafeParcelWriter.writeParcelable(Parcel, int, Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   13   21:aload_1         
	//   14   22:iload_3         
	//   15   23:invokestatic    #141 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   16   26:return          
	}

	public final SafeParcelable zza(android.os.Parcelable.Creator creator)
	{
		Object obj;
		if(!zzcfv)
			break MISSING_BLOCK_LABEL_132;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean zzcfv>
	//    2    4:ifeq            132
		if(zzcft == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #39  <Field ParcelFileDescriptor zzcft>
	//*   5   11:ifnonnull       21
		{
			zzakb.e("File descriptor is empty, returning null.");
	//    6   14:ldc1            #144 <String "File descriptor is empty, returning null.">
	//    7   16:invokestatic    #148 <Method void zzakb.e(String)>
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
		}
		obj = ((Object) (new DataInputStream(((java.io.InputStream) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzcft))))));
	//   10   21:new             #150 <Class DataInputStream>
	//   11   24:dup             
	//   12   25:new             #152 <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:getfield        #39  <Field ParcelFileDescriptor zzcft>
	//   16   33:invokespecial   #153 <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
	//   17   36:invokespecial   #156 <Method void DataInputStream(java.io.InputStream)>
	//   18   39:astore_2        
		byte abyte0[];
		abyte0 = new byte[((DataInputStream) (obj)).readInt()];
	//   19   40:aload_2         
	//   20   41:invokevirtual   #160 <Method int DataInputStream.readInt()>
	//   21   44:newarray        byte[]
	//   22   46:astore_3        
		((DataInputStream) (obj)).readFully(abyte0, 0, abyte0.length);
	//   23   47:aload_2         
	//   24   48:aload_3         
	//   25   49:iconst_0        
	//   26   50:aload_3         
	//   27   51:arraylength     
	//   28   52:invokevirtual   #164 <Method void DataInputStream.readFully(byte[], int, int)>
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   29   55:aload_2         
	//   30   56:invokestatic    #101 <Method void IOUtils.closeQuietly(java.io.Closeable)>
		obj = ((Object) (Parcel.obtain()));
	//   31   59:invokestatic    #111 <Method Parcel Parcel.obtain()>
	//   32   62:astore_2        
		((Parcel) (obj)).unmarshall(abyte0, 0, abyte0.length);
	//   33   63:aload_2         
	//   34   64:aload_3         
	//   35   65:iconst_0        
	//   36   66:aload_3         
	//   37   67:arraylength     
	//   38   68:invokevirtual   #167 <Method void Parcel.unmarshall(byte[], int, int)>
		((Parcel) (obj)).setDataPosition(0);
	//   39   71:aload_2         
	//   40   72:iconst_0        
	//   41   73:invokevirtual   #171 <Method void Parcel.setDataPosition(int)>
		zzcfu = ((Parcelable) ((SafeParcelable)creator.createFromParcel(((Parcel) (obj)))));
	//   42   76:aload_0         
	//   43   77:aload_1         
	//   44   78:aload_2         
	//   45   79:invokeinterface #177 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   46   84:checkcast       #179 <Class SafeParcelable>
	//   47   87:putfield        #41  <Field Parcelable zzcfu>
		((Parcel) (obj)).recycle();
	//   48   90:aload_2         
	//   49   91:invokevirtual   #124 <Method void Parcel.recycle()>
		zzcfv = false;
	//   50   94:aload_0         
	//   51   95:iconst_0        
	//   52   96:putfield        #43  <Field boolean zzcfv>
		break MISSING_BLOCK_LABEL_132;
	//   53   99:goto            132
		creator;
	//   54  102:astore_1        
		((Parcel) (obj)).recycle();
	//   55  103:aload_2         
	//   56  104:invokevirtual   #124 <Method void Parcel.recycle()>
		throw creator;
	//   57  107:aload_1         
	//   58  108:athrow          
		creator;
	//   59  109:astore_1        
		break MISSING_BLOCK_LABEL_126;
	//   60  110:goto            126
		creator;
	//   61  113:astore_1        
		zzakb.zzb("Could not read from parcel file descriptor", ((Throwable) (creator)));
	//   62  114:ldc1            #181 <String "Could not read from parcel file descriptor">
	//   63  116:aload_1         
	//   64  117:invokestatic    #81  <Method void zzakb.zzb(String, Throwable)>
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   65  120:aload_2         
	//   66  121:invokestatic    #101 <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return null;
	//   67  124:aconst_null     
	//   68  125:areturn         
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   69  126:aload_2         
	//   70  127:invokestatic    #101 <Method void IOUtils.closeQuietly(java.io.Closeable)>
		throw creator;
	//   71  130:aload_1         
	//   72  131:athrow          
		return (SafeParcelable)zzcfu;
	//   73  132:aload_0         
	//   74  133:getfield        #41  <Field Parcelable zzcfu>
	//   75  136:checkcast       #179 <Class SafeParcelable>
	//   76  139:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaex();
	private ParcelFileDescriptor zzcft;
	private Parcelable zzcfu;
	private boolean zzcfv;

	static 
	{
	//    0    0:new             #27  <Class zzaex>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzaex()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
