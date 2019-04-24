// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.*;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.common.data:
//			BitmapTeleporterCreator

public class BitmapTeleporter extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	BitmapTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AbstractSafeParcelable()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #45  <Field int zzal>
		zznb = parcelfiledescriptor;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #47  <Field ParcelFileDescriptor zznb>
		zzac = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #49  <Field int zzac>
		zznc = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #51  <Field Bitmap zznc>
		zznd = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #53  <Field boolean zznd>
	//   17   29:return          
	}

	public BitmapTeleporter(Bitmap bitmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AbstractSafeParcelable()>
		zzal = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #45  <Field int zzal>
		zznb = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #47  <Field ParcelFileDescriptor zznb>
		zzac = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #49  <Field int zzac>
		zznc = bitmap;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #51  <Field Bitmap zznc>
		zznd = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #53  <Field boolean zznd>
	//   17   29:return          
	}

	private static void zza(Closeable closeable)
	{
		try
		{
			closeable.close();
	//    0    0:aload_0         
	//    1    1:invokeinterface #65  <Method void Closeable.close()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   3    7:astore_0        
		{
			Log.w("BitmapTeleporter", "Could not close stream", ((Throwable) (closeable)));
	//    4    8:ldc1            #67  <String "BitmapTeleporter">
	//    5   10:ldc1            #69  <String "Could not close stream">
	//    6   12:aload_0         
	//    7   13:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
	//    8   16:pop             
		}
	//    9   17:return          
	}

	private final FileOutputStream zzcj()
	{
		FileNotFoundException filenotfoundexception;
		if(zzne == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field File zzne>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
	//    3    7:new             #83  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #85  <String "setTempDir() must be called before writing this object to a parcel">
	//    6   13:invokespecial   #88  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		File file;
		FileOutputStream fileoutputstream;
		try
		{
			file = File.createTempFile("teleporter", ".tmp", zzne);
	//    8   17:ldc1            #90  <String "teleporter">
	//    9   19:ldc1            #92  <String ".tmp">
	//   10   21:aload_0         
	//   11   22:getfield        #81  <Field File zzne>
	//   12   25:invokestatic    #98  <Method File File.createTempFile(String, String, File)>
	//   13   28:astore_1        
		}
	//*  14   29:new             #100 <Class FileOutputStream>
	//*  15   32:dup             
	//*  16   33:aload_1         
	//*  17   34:invokespecial   #103 <Method void FileOutputStream(File)>
	//*  18   37:astore_2        
	//*  19   38:aload_0         
	//*  20   39:aload_1         
	//*  21   40:ldc1            #104 <Int 0x10000000>
	//*  22   42:invokestatic    #110 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//*  23   45:putfield        #47  <Field ParcelFileDescriptor zznb>
	//*  24   48:aload_1         
	//*  25   49:invokevirtual   #114 <Method boolean File.delete()>
	//*  26   52:pop             
	//*  27   53:aload_2         
	//*  28   54:areturn         
	//*  29   55:new             #83  <Class IllegalStateException>
	//*  30   58:dup             
	//*  31   59:ldc1            #116 <String "Temporary file is somehow already deleted">
	//*  32   61:invokespecial   #88  <Method void IllegalStateException(String)>
	//*  33   64:athrow          
		catch(IOException ioexception)
	//*  34   65:astore_1        
		{
			throw new IllegalStateException("Could not create temporary file", ((Throwable) (ioexception)));
	//   35   66:new             #83  <Class IllegalStateException>
	//   36   69:dup             
	//   37   70:ldc1            #118 <String "Could not create temporary file">
	//   38   72:aload_1         
	//   39   73:invokespecial   #121 <Method void IllegalStateException(String, Throwable)>
	//   40   76:athrow          
		}
		try
		{
			fileoutputstream = new FileOutputStream(file);
			zznb = ParcelFileDescriptor.open(file, 0x10000000);
		}
		// Misplaced declaration of an exception variable
		catch(FileNotFoundException filenotfoundexception)
		{
			throw new IllegalStateException("Temporary file is somehow already deleted");
		}
		file.delete();
		return fileoutputstream;
	//*  41   77:astore_1        
	//*  42   78:goto            55
	}

	public Bitmap get()
	{
		Object obj;
		if(zznd)
			break MISSING_BLOCK_LABEL_125;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean zznd>
	//    2    4:ifne            125
		obj = ((Object) (new DataInputStream(((java.io.InputStream) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(zznb))))));
	//    3    7:new             #125 <Class DataInputStream>
	//    4   10:dup             
	//    5   11:new             #127 <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #47  <Field ParcelFileDescriptor zznb>
	//    9   19:invokespecial   #130 <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
	//   10   22:invokespecial   #133 <Method void DataInputStream(java.io.InputStream)>
	//   11   25:astore_3        
		int i;
		int j;
		Object obj1;
		byte abyte0[];
		abyte0 = new byte[((DataInputStream) (obj)).readInt()];
	//   12   26:aload_3         
	//   13   27:invokevirtual   #137 <Method int DataInputStream.readInt()>
	//   14   30:newarray        byte[]
	//   15   32:astore          5
		i = ((DataInputStream) (obj)).readInt();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #137 <Method int DataInputStream.readInt()>
	//   18   38:istore_1        
		j = ((DataInputStream) (obj)).readInt();
	//   19   39:aload_3         
	//   20   40:invokevirtual   #137 <Method int DataInputStream.readInt()>
	//   21   43:istore_2        
		obj1 = ((Object) (android.graphics.Bitmap.Config.valueOf(((DataInputStream) (obj)).readUTF())));
	//   22   44:aload_3         
	//   23   45:invokevirtual   #141 <Method String DataInputStream.readUTF()>
	//   24   48:invokestatic    #147 <Method android.graphics.Bitmap$Config android.graphics.Bitmap$Config.valueOf(String)>
	//   25   51:astore          4
		((DataInputStream) (obj)).read(abyte0);
	//   26   53:aload_3         
	//   27   54:aload           5
	//   28   56:invokevirtual   #151 <Method int DataInputStream.read(byte[])>
	//   29   59:pop             
		zza(((Closeable) (obj)));
	//   30   60:aload_3         
	//   31   61:invokestatic    #153 <Method void zza(Closeable)>
		obj = ((Object) (ByteBuffer.wrap(abyte0)));
	//   32   64:aload           5
	//   33   66:invokestatic    #159 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   34   69:astore_3        
		obj1 = ((Object) (Bitmap.createBitmap(i, j, ((android.graphics.Bitmap.Config) (obj1)))));
	//   35   70:iload_1         
	//   36   71:iload_2         
	//   37   72:aload           4
	//   38   74:invokestatic    #165 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   39   77:astore          4
		((Bitmap) (obj1)).copyPixelsFromBuffer(((java.nio.Buffer) (obj)));
	//   40   79:aload           4
	//   41   81:aload_3         
	//   42   82:invokevirtual   #169 <Method void Bitmap.copyPixelsFromBuffer(java.nio.Buffer)>
		zznc = ((Bitmap) (obj1));
	//   43   85:aload_0         
	//   44   86:aload           4
	//   45   88:putfield        #51  <Field Bitmap zznc>
		zznd = true;
	//   46   91:aload_0         
	//   47   92:iconst_1        
	//   48   93:putfield        #53  <Field boolean zznd>
		break MISSING_BLOCK_LABEL_125;
	//   49   96:goto            125
		Object obj2;
		obj2;
	//   50   99:astore          4
		break MISSING_BLOCK_LABEL_118;
	//   51  101:goto            118
		obj2;
	//   52  104:astore          4
		throw new IllegalStateException("Could not read from parcel file descriptor", ((Throwable) (obj2)));
	//   53  106:new             #83  <Class IllegalStateException>
	//   54  109:dup             
	//   55  110:ldc1            #171 <String "Could not read from parcel file descriptor">
	//   56  112:aload           4
	//   57  114:invokespecial   #121 <Method void IllegalStateException(String, Throwable)>
	//   58  117:athrow          
		zza(((Closeable) (obj)));
	//   59  118:aload_3         
	//   60  119:invokestatic    #153 <Method void zza(Closeable)>
		throw obj2;
	//   61  122:aload           4
	//   62  124:athrow          
		return zznc;
	//   63  125:aload_0         
	//   64  126:getfield        #51  <Field Bitmap zznc>
	//   65  129:areturn         
	}

	public void release()
	{
		if(!zznd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean zznd>
	//*   2    4:ifne            25
			try
			{
				zznb.close();
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field ParcelFileDescriptor zznb>
	//    5   11:invokevirtual   #173 <Method void ParcelFileDescriptor.close()>
				return;
	//    6   14:return          
			}
			catch(IOException ioexception)
	//*   7   15:astore_1        
			{
				Log.w("BitmapTeleporter", "Could not close PFD", ((Throwable) (ioexception)));
	//    8   16:ldc1            #67  <String "BitmapTeleporter">
	//    9   18:ldc1            #175 <String "Could not close PFD">
	//   10   20:aload_1         
	//   11   21:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
	//   12   24:pop             
			}
	//   13   25:return          
	}

	public void setTempDir(File file)
	{
		if(file == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new NullPointerException("Cannot set null temp directory");
	//    2    4:new             #178 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #180 <String "Cannot set null temp directory">
	//    5   10:invokespecial   #181 <Method void NullPointerException(String)>
	//    6   13:athrow          
		} else
		{
			zzne = file;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #81  <Field File zzne>
			return;
	//   10   19:return          
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Object obj;
		Bitmap bitmap;
		byte abyte0[];
		if(zznb != null)
			break MISSING_BLOCK_LABEL_142;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ParcelFileDescriptor zznb>
	//    2    4:ifnonnull       142
		bitmap = zznc;
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field Bitmap zznc>
	//    5   11:astore          5
		obj = ((Object) (ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight())));
	//    6   13:aload           5
	//    7   15:invokevirtual   #186 <Method int Bitmap.getRowBytes()>
	//    8   18:aload           5
	//    9   20:invokevirtual   #189 <Method int Bitmap.getHeight()>
	//   10   23:imul            
	//   11   24:invokestatic    #193 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   12   27:astore          4
		bitmap.copyPixelsToBuffer(((java.nio.Buffer) (obj)));
	//   13   29:aload           5
	//   14   31:aload           4
	//   15   33:invokevirtual   #196 <Method void Bitmap.copyPixelsToBuffer(java.nio.Buffer)>
		abyte0 = ((ByteBuffer) (obj)).array();
	//   16   36:aload           4
	//   17   38:invokevirtual   #200 <Method byte[] ByteBuffer.array()>
	//   18   41:astore          6
		obj = ((Object) (new DataOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (zzcj()))))))));
	//   19   43:new             #202 <Class DataOutputStream>
	//   20   46:dup             
	//   21   47:new             #204 <Class BufferedOutputStream>
	//   22   50:dup             
	//   23   51:aload_0         
	//   24   52:invokespecial   #206 <Method FileOutputStream zzcj()>
	//   25   55:invokespecial   #209 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   26   58:invokespecial   #210 <Method void DataOutputStream(java.io.OutputStream)>
	//   27   61:astore          4
		((DataOutputStream) (obj)).writeInt(abyte0.length);
	//   28   63:aload           4
	//   29   65:aload           6
	//   30   67:arraylength     
	//   31   68:invokevirtual   #214 <Method void DataOutputStream.writeInt(int)>
		((DataOutputStream) (obj)).writeInt(bitmap.getWidth());
	//   32   71:aload           4
	//   33   73:aload           5
	//   34   75:invokevirtual   #217 <Method int Bitmap.getWidth()>
	//   35   78:invokevirtual   #214 <Method void DataOutputStream.writeInt(int)>
		((DataOutputStream) (obj)).writeInt(bitmap.getHeight());
	//   36   81:aload           4
	//   37   83:aload           5
	//   38   85:invokevirtual   #189 <Method int Bitmap.getHeight()>
	//   39   88:invokevirtual   #214 <Method void DataOutputStream.writeInt(int)>
		((DataOutputStream) (obj)).writeUTF(bitmap.getConfig().toString());
	//   40   91:aload           4
	//   41   93:aload           5
	//   42   95:invokevirtual   #221 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   43   98:invokevirtual   #224 <Method String android.graphics.Bitmap$Config.toString()>
	//   44  101:invokevirtual   #227 <Method void DataOutputStream.writeUTF(String)>
		((DataOutputStream) (obj)).write(abyte0);
	//   45  104:aload           4
	//   46  106:aload           6
	//   47  108:invokevirtual   #231 <Method void DataOutputStream.write(byte[])>
		zza(((Closeable) (obj)));
	//   48  111:aload           4
	//   49  113:invokestatic    #153 <Method void zza(Closeable)>
		break MISSING_BLOCK_LABEL_142;
	//   50  116:goto            142
		parcel;
	//   51  119:astore_1        
		break MISSING_BLOCK_LABEL_135;
	//   52  120:goto            135
		parcel;
	//   53  123:astore_1        
		throw new IllegalStateException("Could not write into unlinked file", ((Throwable) (parcel)));
	//   54  124:new             #83  <Class IllegalStateException>
	//   55  127:dup             
	//   56  128:ldc1            #233 <String "Could not write into unlinked file">
	//   57  130:aload_1         
	//   58  131:invokespecial   #121 <Method void IllegalStateException(String, Throwable)>
	//   59  134:athrow          
		zza(((Closeable) (obj)));
	//   60  135:aload           4
	//   61  137:invokestatic    #153 <Method void zza(Closeable)>
		throw parcel;
	//   62  140:aload_1         
	//   63  141:athrow          
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//   64  142:aload_1         
	//   65  143:invokestatic    #239 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//   66  146:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zzal);
	//   67  147:aload_1         
	//   68  148:iconst_1        
	//   69  149:aload_0         
	//   70  150:getfield        #45  <Field int zzal>
	//   71  153:invokestatic    #242 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (zznb)), i | 1, false);
	//   72  156:aload_1         
	//   73  157:iconst_2        
	//   74  158:aload_0         
	//   75  159:getfield        #47  <Field ParcelFileDescriptor zznb>
	//   76  162:iload_2         
	//   77  163:iconst_1        
	//   78  164:ior             
	//   79  165:iconst_0        
	//   80  166:invokestatic    #246 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, zzac);
	//   81  169:aload_1         
	//   82  170:iconst_3        
	//   83  171:aload_0         
	//   84  172:getfield        #49  <Field int zzac>
	//   85  175:invokestatic    #242 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   86  178:aload_1         
	//   87  179:iload_3         
	//   88  180:invokestatic    #249 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
		zznb = null;
	//   89  183:aload_0         
	//   90  184:aconst_null     
	//   91  185:putfield        #47  <Field ParcelFileDescriptor zznb>
		return;
	//   92  188:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new BitmapTeleporterCreator();
	private final int zzac;
	private final int zzal;
	private ParcelFileDescriptor zznb;
	private Bitmap zznc;
	private boolean zznd;
	private File zzne;

	static 
	{
	//    0    0:new             #33  <Class BitmapTeleporterCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void BitmapTeleporterCreator()>
	//    3    7:putstatic       #38  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
