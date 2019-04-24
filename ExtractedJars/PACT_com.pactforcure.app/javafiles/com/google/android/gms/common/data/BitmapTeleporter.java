// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.*;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.common.data:
//			zza

public class BitmapTeleporter extends zza
	implements ReflectedParcelable
{

	BitmapTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #34  <Field int mVersionCode>
		zzSn = parcelfiledescriptor;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field ParcelFileDescriptor zzSn>
		zzanR = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #38  <Field int zzanR>
		zzaCg = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #40  <Field Bitmap zzaCg>
		zzaCh = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #42  <Field boolean zzaCh>
	//   17   29:return          
	}

	public BitmapTeleporter(Bitmap bitmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zza()>
		mVersionCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #34  <Field int mVersionCode>
		zzSn = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #36  <Field ParcelFileDescriptor zzSn>
		zzanR = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #38  <Field int zzanR>
		zzaCg = bitmap;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #40  <Field Bitmap zzaCg>
		zzaCh = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #42  <Field boolean zzaCh>
	//   17   29:return          
	}

	private void zza(Closeable closeable)
	{
		try
		{
			closeable.close();
	//    0    0:aload_1         
	//    1    1:invokeinterface #52  <Method void Closeable.close()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   3    7:astore_1        
		{
			Log.w("BitmapTeleporter", "Could not close stream", ((Throwable) (closeable)));
	//    4    8:ldc1            #54  <String "BitmapTeleporter">
	//    5   10:ldc1            #56  <String "Could not close stream">
	//    6   12:aload_1         
	//    7   13:invokestatic    #62  <Method int Log.w(String, String, Throwable)>
	//    8   16:pop             
		}
	//    9   17:return          
	}

	private FileOutputStream zzwA()
	{
		if(zzaCi == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field File zzaCi>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
	//    3    7:new             #70  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #72  <String "setTempDir() must be called before writing this object to a parcel">
	//    6   13:invokespecial   #75  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		File file;
		FileOutputStream fileoutputstream;
		try
		{
			file = File.createTempFile("teleporter", ".tmp", zzaCi);
	//    8   17:ldc1            #77  <String "teleporter">
	//    9   19:ldc1            #79  <String ".tmp">
	//   10   21:aload_0         
	//   11   22:getfield        #68  <Field File zzaCi>
	//   12   25:invokestatic    #85  <Method File File.createTempFile(String, String, File)>
	//   13   28:astore_1        
		}
	//*  14   29:new             #87  <Class FileOutputStream>
	//*  15   32:dup             
	//*  16   33:aload_1         
	//*  17   34:invokespecial   #90  <Method void FileOutputStream(File)>
	//*  18   37:astore_2        
	//*  19   38:aload_0         
	//*  20   39:aload_1         
	//*  21   40:ldc1            #91  <Int 0x10000000>
	//*  22   42:invokestatic    #97  <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//*  23   45:putfield        #36  <Field ParcelFileDescriptor zzSn>
	//*  24   48:aload_1         
	//*  25   49:invokevirtual   #101 <Method boolean File.delete()>
	//*  26   52:pop             
	//*  27   53:aload_2         
	//*  28   54:areturn         
		catch(IOException ioexception)
	//*  29   55:astore_1        
		{
			throw new IllegalStateException("Could not create temporary file", ((Throwable) (ioexception)));
	//   30   56:new             #70  <Class IllegalStateException>
	//   31   59:dup             
	//   32   60:ldc1            #103 <String "Could not create temporary file">
	//   33   62:aload_1         
	//   34   63:invokespecial   #106 <Method void IllegalStateException(String, Throwable)>
	//   35   66:athrow          
		}
		try
		{
			fileoutputstream = new FileOutputStream(file);
			zzSn = ParcelFileDescriptor.open(file, 0x10000000);
		}
		catch(FileNotFoundException filenotfoundexception)
	//*  36   67:astore_1        
		{
			throw new IllegalStateException("Temporary file is somehow already deleted");
	//   37   68:new             #70  <Class IllegalStateException>
	//   38   71:dup             
	//   39   72:ldc1            #108 <String "Temporary file is somehow already deleted">
	//   40   74:invokespecial   #75  <Method void IllegalStateException(String)>
	//   41   77:athrow          
		}
		file.delete();
		return fileoutputstream;
	}

	public void release()
	{
		if(zzaCh)
			break MISSING_BLOCK_LABEL_14;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean zzaCh>
	//    2    4:ifne            14
		zzSn.close();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field ParcelFileDescriptor zzSn>
	//    5   11:invokevirtual   #110 <Method void ParcelFileDescriptor.close()>
		return;
	//    6   14:return          
		IOException ioexception;
		ioexception;
	//    7   15:astore_1        
		Log.w("BitmapTeleporter", "Could not close PFD", ((Throwable) (ioexception)));
	//    8   16:ldc1            #54  <String "BitmapTeleporter">
	//    9   18:ldc1            #112 <String "Could not close PFD">
	//   10   20:aload_1         
	//   11   21:invokestatic    #62  <Method int Log.w(String, String, Throwable)>
	//   12   24:pop             
		return;
	//   13   25:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Object obj;
		Bitmap bitmap;
		byte abyte0[];
		if(zzSn != null)
			break MISSING_BLOCK_LABEL_100;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ParcelFileDescriptor zzSn>
	//    2    4:ifnonnull       100
		bitmap = zzaCg;
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field Bitmap zzaCg>
	//    5   11:astore          4
		obj = ((Object) (ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight())));
	//    6   13:aload           4
	//    7   15:invokevirtual   #120 <Method int Bitmap.getRowBytes()>
	//    8   18:aload           4
	//    9   20:invokevirtual   #123 <Method int Bitmap.getHeight()>
	//   10   23:imul            
	//   11   24:invokestatic    #129 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   12   27:astore_3        
		bitmap.copyPixelsToBuffer(((java.nio.Buffer) (obj)));
	//   13   28:aload           4
	//   14   30:aload_3         
	//   15   31:invokevirtual   #133 <Method void Bitmap.copyPixelsToBuffer(java.nio.Buffer)>
		abyte0 = ((ByteBuffer) (obj)).array();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #137 <Method byte[] ByteBuffer.array()>
	//   18   38:astore          5
		obj = ((Object) (new DataOutputStream(((java.io.OutputStream) (zzwA())))));
	//   19   40:new             #139 <Class DataOutputStream>
	//   20   43:dup             
	//   21   44:aload_0         
	//   22   45:invokespecial   #141 <Method FileOutputStream zzwA()>
	//   23   48:invokespecial   #144 <Method void DataOutputStream(java.io.OutputStream)>
	//   24   51:astore_3        
		((DataOutputStream) (obj)).writeInt(abyte0.length);
	//   25   52:aload_3         
	//   26   53:aload           5
	//   27   55:arraylength     
	//   28   56:invokevirtual   #148 <Method void DataOutputStream.writeInt(int)>
		((DataOutputStream) (obj)).writeInt(bitmap.getWidth());
	//   29   59:aload_3         
	//   30   60:aload           4
	//   31   62:invokevirtual   #151 <Method int Bitmap.getWidth()>
	//   32   65:invokevirtual   #148 <Method void DataOutputStream.writeInt(int)>
		((DataOutputStream) (obj)).writeInt(bitmap.getHeight());
	//   33   68:aload_3         
	//   34   69:aload           4
	//   35   71:invokevirtual   #123 <Method int Bitmap.getHeight()>
	//   36   74:invokevirtual   #148 <Method void DataOutputStream.writeInt(int)>
		((DataOutputStream) (obj)).writeUTF(bitmap.getConfig().toString());
	//   37   77:aload_3         
	//   38   78:aload           4
	//   39   80:invokevirtual   #155 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   40   83:invokevirtual   #161 <Method String android.graphics.Bitmap$Config.toString()>
	//   41   86:invokevirtual   #164 <Method void DataOutputStream.writeUTF(String)>
		((DataOutputStream) (obj)).write(abyte0);
	//   42   89:aload_3         
	//   43   90:aload           5
	//   44   92:invokevirtual   #168 <Method void DataOutputStream.write(byte[])>
		zza(((Closeable) (obj)));
	//   45   95:aload_0         
	//   46   96:aload_3         
	//   47   97:invokespecial   #170 <Method void zza(Closeable)>
		com.google.android.gms.common.data.zza.zza(this, parcel, i | 1);
	//   48  100:aload_0         
	//   49  101:aload_1         
	//   50  102:iload_2         
	//   51  103:iconst_1        
	//   52  104:ior             
	//   53  105:invokestatic    #173 <Method void com.google.android.gms.common.data.zza.zza(BitmapTeleporter, Parcel, int)>
		zzSn = null;
	//   54  108:aload_0         
	//   55  109:aconst_null     
	//   56  110:putfield        #36  <Field ParcelFileDescriptor zzSn>
		return;
	//   57  113:return          
		parcel;
	//   58  114:astore_1        
		throw new IllegalStateException("Could not write into unlinked file", ((Throwable) (parcel)));
	//   59  115:new             #70  <Class IllegalStateException>
	//   60  118:dup             
	//   61  119:ldc1            #175 <String "Could not write into unlinked file">
	//   62  121:aload_1         
	//   63  122:invokespecial   #106 <Method void IllegalStateException(String, Throwable)>
	//   64  125:athrow          
		parcel;
	//   65  126:astore_1        
		zza(((Closeable) (obj)));
	//   66  127:aload_0         
	//   67  128:aload_3         
	//   68  129:invokespecial   #170 <Method void zza(Closeable)>
		throw parcel;
	//   69  132:aload_1         
	//   70  133:athrow          
	}

	public void zzd(File file)
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
			zzaCi = file;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #68  <Field File zzaCi>
			return;
	//   10   19:return          
		}
	}

	public Bitmap zzwz()
	{
		Object obj;
		if(zzaCh)
			break MISSING_BLOCK_LABEL_97;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean zzaCh>
	//    2    4:ifne            97
		obj = ((Object) (new DataInputStream(((java.io.InputStream) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzSn))))));
	//    3    7:new             #185 <Class DataInputStream>
	//    4   10:dup             
	//    5   11:new             #187 <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field ParcelFileDescriptor zzSn>
	//    9   19:invokespecial   #190 <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
	//   10   22:invokespecial   #193 <Method void DataInputStream(java.io.InputStream)>
	//   11   25:astore_3        
		int i;
		int j;
		Object obj1;
		byte abyte0[];
		abyte0 = new byte[((DataInputStream) (obj)).readInt()];
	//   12   26:aload_3         
	//   13   27:invokevirtual   #196 <Method int DataInputStream.readInt()>
	//   14   30:newarray        byte[]
	//   15   32:astore          5
		i = ((DataInputStream) (obj)).readInt();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #196 <Method int DataInputStream.readInt()>
	//   18   38:istore_1        
		j = ((DataInputStream) (obj)).readInt();
	//   19   39:aload_3         
	//   20   40:invokevirtual   #196 <Method int DataInputStream.readInt()>
	//   21   43:istore_2        
		obj1 = ((Object) (android.graphics.Bitmap.Config.valueOf(((DataInputStream) (obj)).readUTF())));
	//   22   44:aload_3         
	//   23   45:invokevirtual   #199 <Method String DataInputStream.readUTF()>
	//   24   48:invokestatic    #203 <Method android.graphics.Bitmap$Config android.graphics.Bitmap$Config.valueOf(String)>
	//   25   51:astore          4
		((DataInputStream) (obj)).read(abyte0);
	//   26   53:aload_3         
	//   27   54:aload           5
	//   28   56:invokevirtual   #207 <Method int DataInputStream.read(byte[])>
	//   29   59:pop             
		zza(((Closeable) (obj)));
	//   30   60:aload_0         
	//   31   61:aload_3         
	//   32   62:invokespecial   #170 <Method void zza(Closeable)>
		obj = ((Object) (ByteBuffer.wrap(abyte0)));
	//   33   65:aload           5
	//   34   67:invokestatic    #211 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   35   70:astore_3        
		obj1 = ((Object) (Bitmap.createBitmap(i, j, ((android.graphics.Bitmap.Config) (obj1)))));
	//   36   71:iload_1         
	//   37   72:iload_2         
	//   38   73:aload           4
	//   39   75:invokestatic    #215 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   40   78:astore          4
		((Bitmap) (obj1)).copyPixelsFromBuffer(((java.nio.Buffer) (obj)));
	//   41   80:aload           4
	//   42   82:aload_3         
	//   43   83:invokevirtual   #218 <Method void Bitmap.copyPixelsFromBuffer(java.nio.Buffer)>
		zzaCg = ((Bitmap) (obj1));
	//   44   86:aload_0         
	//   45   87:aload           4
	//   46   89:putfield        #40  <Field Bitmap zzaCg>
		zzaCh = true;
	//   47   92:aload_0         
	//   48   93:iconst_1        
	//   49   94:putfield        #42  <Field boolean zzaCh>
		return zzaCg;
	//   50   97:aload_0         
	//   51   98:getfield        #40  <Field Bitmap zzaCg>
	//   52  101:areturn         
		Object obj2;
		obj2;
	//   53  102:astore          4
		throw new IllegalStateException("Could not read from parcel file descriptor", ((Throwable) (obj2)));
	//   54  104:new             #70  <Class IllegalStateException>
	//   55  107:dup             
	//   56  108:ldc1            #220 <String "Could not read from parcel file descriptor">
	//   57  110:aload           4
	//   58  112:invokespecial   #106 <Method void IllegalStateException(String, Throwable)>
	//   59  115:athrow          
		obj2;
	//   60  116:astore          4
		zza(((Closeable) (obj)));
	//   61  118:aload_0         
	//   62  119:aload_3         
	//   63  120:invokespecial   #170 <Method void zza(Closeable)>
		throw obj2;
	//   64  123:aload           4
	//   65  125:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.common.data.zza();
	final int mVersionCode;
	ParcelFileDescriptor zzSn;
	private Bitmap zzaCg;
	private boolean zzaCh;
	private File zzaCi;
	final int zzanR;

	static 
	{
	//    0    0:new             #24  <Class com.google.android.gms.common.data.zza>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void com.google.android.gms.common.data.zza()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
