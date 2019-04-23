// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.internal.safeparcel.*;
import com.google.android.gms.common.util.k;
import java.io.DataInputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			rz, rx, wx, wi

public final class zzasy extends AbstractSafeParcelable
{

	public zzasy(ParcelFileDescriptor parcelfiledescriptor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = parcelfiledescriptor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field ParcelFileDescriptor a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #29  <Field Parcelable b>
		c = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #31  <Field boolean c>
	//   11   19:return          
	}

	public zzasy(SafeParcelable safeparcelable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field ParcelFileDescriptor a>
		b = ((Parcelable) (safeparcelable));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field Parcelable b>
		c = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #31  <Field boolean c>
	//   11   19:return          
	}

	private final ParcelFileDescriptor a()
	{
		Parcel parcel;
		if(a != null)
			break MISSING_BLOCK_LABEL_50;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ParcelFileDescriptor a>
	//    2    4:ifnonnull       50
		parcel = Parcel.obtain();
	//    3    7:invokestatic    #39  <Method Parcel Parcel.obtain()>
	//    4   10:astore_1        
		byte abyte0[];
		b.writeToParcel(parcel, 0);
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field Parcelable b>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokeinterface #45  <Method void Parcelable.writeToParcel(Parcel, int)>
		abyte0 = parcel.marshall();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #49  <Method byte[] Parcel.marshall()>
	//   12   26:astore_2        
		parcel.recycle();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #52  <Method void Parcel.recycle()>
		a = a(abyte0);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokespecial   #55  <Method ParcelFileDescriptor a(byte[])>
	//   19   37:putfield        #27  <Field ParcelFileDescriptor a>
		break MISSING_BLOCK_LABEL_50;
	//   20   40:goto            50
		Exception exception;
		exception;
	//   21   43:astore_2        
		parcel.recycle();
	//   22   44:aload_1         
	//   23   45:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   24   48:aload_2         
	//   25   49:athrow          
		return a;
	//   26   50:aload_0         
	//   27   51:getfield        #27  <Field ParcelFileDescriptor a>
	//   28   54:areturn         
	}

	private final ParcelFileDescriptor a(byte abyte0[])
	{
		android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
		ParcelFileDescriptor aparcelfiledescriptor[];
		aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
	//    0    0:invokestatic    #63  <Method ParcelFileDescriptor[] ParcelFileDescriptor.createPipe()>
	//    1    3:astore_3        
		autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(aparcelfiledescriptor[1]);
	//    2    4:new             #65  <Class android.os.ParcelFileDescriptor$AutoCloseOutputStream>
	//    3    7:dup             
	//    4    8:aload_3         
	//    5    9:iconst_1        
	//    6   10:aaload          
	//    7   11:invokespecial   #67  <Method void android.os.ParcelFileDescriptor$AutoCloseOutputStream(ParcelFileDescriptor)>
	//    8   14:astore_2        
		IOException ioexception;
		try
		{
			(new Thread(((Runnable) (new rx(this, ((java.io.OutputStream) (autocloseoutputstream)), abyte0))))).start();
	//    9   15:new             #69  <Class Thread>
	//   10   18:dup             
	//   11   19:new             #71  <Class rx>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokespecial   #74  <Method void rx(zzasy, java.io.OutputStream, byte[])>
	//   17   29:invokespecial   #77  <Method void Thread(Runnable)>
	//   18   32:invokevirtual   #80  <Method void Thread.start()>
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
		wx.b("Error transporting the ad response", ((Throwable) (ioexception)));
	//   34   52:ldc1            #82  <String "Error transporting the ad response">
	//   35   54:aload_2         
	//   36   55:invokestatic    #87  <Method void wx.b(String, Throwable)>
		aw.i().a(((Throwable) (ioexception)), "LargeParcelTeleporter.pipeData.2");
	//   37   58:invokestatic    #93  <Method wi aw.i()>
	//   38   61:aload_2         
	//   39   62:ldc1            #95  <String "LargeParcelTeleporter.pipeData.2">
	//   40   64:invokevirtual   #100 <Method void wi.a(Throwable, String)>
		k.a(((java.io.Closeable) (abyte0)));
	//   41   67:aload_1         
	//   42   68:invokestatic    #105 <Method void k.a(java.io.Closeable)>
		return null;
	//   43   71:aconst_null     
	//   44   72:areturn         
	}

	public final SafeParcelable a(android.os.Parcelable.Creator creator)
	{
		Object obj;
		if(!c)
			break MISSING_BLOCK_LABEL_131;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean c>
	//    2    4:ifeq            131
		obj = ((Object) (a));
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field ParcelFileDescriptor a>
	//    5   11:astore_2        
		if(obj == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       23
		{
			com.google.android.gms.internal.ads.wx.c("File descriptor is empty, returning null.");
	//    8   16:ldc1            #108 <String "File descriptor is empty, returning null.">
	//    9   18:invokestatic    #111 <Method void com.google.android.gms.internal.ads.wx.c(String)>
			return null;
	//   10   21:aconst_null     
	//   11   22:areturn         
		}
		obj = ((Object) (new DataInputStream(((java.io.InputStream) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(((ParcelFileDescriptor) (obj))))))));
	//   12   23:new             #113 <Class DataInputStream>
	//   13   26:dup             
	//   14   27:new             #115 <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
	//   15   30:dup             
	//   16   31:aload_2         
	//   17   32:invokespecial   #116 <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
	//   18   35:invokespecial   #119 <Method void DataInputStream(java.io.InputStream)>
	//   19   38:astore_2        
		byte abyte0[];
		abyte0 = new byte[((DataInputStream) (obj)).readInt()];
	//   20   39:aload_2         
	//   21   40:invokevirtual   #123 <Method int DataInputStream.readInt()>
	//   22   43:newarray        byte[]
	//   23   45:astore_3        
		((DataInputStream) (obj)).readFully(abyte0, 0, abyte0.length);
	//   24   46:aload_2         
	//   25   47:aload_3         
	//   26   48:iconst_0        
	//   27   49:aload_3         
	//   28   50:arraylength     
	//   29   51:invokevirtual   #127 <Method void DataInputStream.readFully(byte[], int, int)>
		k.a(((java.io.Closeable) (obj)));
	//   30   54:aload_2         
	//   31   55:invokestatic    #105 <Method void k.a(java.io.Closeable)>
		obj = ((Object) (Parcel.obtain()));
	//   32   58:invokestatic    #39  <Method Parcel Parcel.obtain()>
	//   33   61:astore_2        
		((Parcel) (obj)).unmarshall(abyte0, 0, abyte0.length);
	//   34   62:aload_2         
	//   35   63:aload_3         
	//   36   64:iconst_0        
	//   37   65:aload_3         
	//   38   66:arraylength     
	//   39   67:invokevirtual   #130 <Method void Parcel.unmarshall(byte[], int, int)>
		((Parcel) (obj)).setDataPosition(0);
	//   40   70:aload_2         
	//   41   71:iconst_0        
	//   42   72:invokevirtual   #134 <Method void Parcel.setDataPosition(int)>
		b = ((Parcelable) ((SafeParcelable)creator.createFromParcel(((Parcel) (obj)))));
	//   43   75:aload_0         
	//   44   76:aload_1         
	//   45   77:aload_2         
	//   46   78:invokeinterface #140 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   47   83:checkcast       #142 <Class SafeParcelable>
	//   48   86:putfield        #29  <Field Parcelable b>
		((Parcel) (obj)).recycle();
	//   49   89:aload_2         
	//   50   90:invokevirtual   #52  <Method void Parcel.recycle()>
		c = false;
	//   51   93:aload_0         
	//   52   94:iconst_0        
	//   53   95:putfield        #31  <Field boolean c>
		break MISSING_BLOCK_LABEL_131;
	//   54   98:goto            131
		creator;
	//   55  101:astore_1        
		((Parcel) (obj)).recycle();
	//   56  102:aload_2         
	//   57  103:invokevirtual   #52  <Method void Parcel.recycle()>
		throw creator;
	//   58  106:aload_1         
	//   59  107:athrow          
		creator;
	//   60  108:astore_1        
		break MISSING_BLOCK_LABEL_125;
	//   61  109:goto            125
		creator;
	//   62  112:astore_1        
		wx.b("Could not read from parcel file descriptor", ((Throwable) (creator)));
	//   63  113:ldc1            #144 <String "Could not read from parcel file descriptor">
	//   64  115:aload_1         
	//   65  116:invokestatic    #87  <Method void wx.b(String, Throwable)>
		k.a(((java.io.Closeable) (obj)));
	//   66  119:aload_2         
	//   67  120:invokestatic    #105 <Method void k.a(java.io.Closeable)>
		return null;
	//   68  123:aconst_null     
	//   69  124:areturn         
		k.a(((java.io.Closeable) (obj)));
	//   70  125:aload_2         
	//   71  126:invokestatic    #105 <Method void k.a(java.io.Closeable)>
		throw creator;
	//   72  129:aload_1         
	//   73  130:athrow          
		return (SafeParcelable)b;
	//   74  131:aload_0         
	//   75  132:getfield        #29  <Field Parcelable b>
	//   76  135:checkcast       #142 <Class SafeParcelable>
	//   77  138:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #146 <Method ParcelFileDescriptor a()>
	//    2    4:pop             
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    3    5:aload_1         
	//    4    6:invokestatic    #151 <Method int c.a(Parcel)>
	//    5    9:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((Parcelable) (a)), i, false);
	//    6   10:aload_1         
	//    7   11:iconst_2        
	//    8   12:aload_0         
	//    9   13:getfield        #27  <Field ParcelFileDescriptor a>
	//   10   16:iload_2         
	//   11   17:iconst_0        
	//   12   18:invokestatic    #154 <Method void c.a(Parcel, int, Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   13   21:aload_1         
	//   14   22:iload_3         
	//   15   23:invokestatic    #156 <Method void c.a(Parcel, int)>
	//   16   26:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new rz();
	private ParcelFileDescriptor a;
	private Parcelable b;
	private boolean c;

	static 
	{
	//    0    0:new             #17  <Class rz>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void rz()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
