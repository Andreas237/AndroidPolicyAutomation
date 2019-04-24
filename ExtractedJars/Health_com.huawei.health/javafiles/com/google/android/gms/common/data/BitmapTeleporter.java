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
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #34  <Field int zzaiI>
		zzSQ = parcelfiledescriptor;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field ParcelFileDescriptor zzSQ>
		zzakD = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #38  <Field int zzakD>
		zzaDF = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #40  <Field Bitmap zzaDF>
		zzaDG = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #42  <Field boolean zzaDG>
	//   17   29:return          
	}

	public BitmapTeleporter(Bitmap bitmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zza()>
		zzaiI = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #34  <Field int zzaiI>
		zzSQ = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #36  <Field ParcelFileDescriptor zzSQ>
		zzakD = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #38  <Field int zzakD>
		zzaDF = bitmap;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #40  <Field Bitmap zzaDF>
		zzaDG = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #42  <Field boolean zzaDG>
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

	private FileOutputStream zzxh()
	{
		FileNotFoundException filenotfoundexception;
		if(zzaDH == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field File zzaDH>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
	//    3    7:new             #70  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #72  <String "setTempDir() must be called before writing this object to a parcel">
	//    6   13:invokespecial   #75  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		Object obj;
		try
		{
			obj = ((Object) (File.createTempFile("teleporter", ".tmp", zzaDH)));
	//    8   17:ldc1            #77  <String "teleporter">
	//    9   19:ldc1            #79  <String ".tmp">
	//   10   21:aload_0         
	//   11   22:getfield        #68  <Field File zzaDH>
	//   12   25:invokestatic    #85  <Method File File.createTempFile(String, String, File)>
	//   13   28:astore_1        
		}
	//*  14   29:goto            44
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  15   32:astore_1        
		{
			throw new IllegalStateException("Could not create temporary file", ((Throwable) (obj)));
	//   16   33:new             #70  <Class IllegalStateException>
	//   17   36:dup             
	//   18   37:ldc1            #87  <String "Could not create temporary file">
	//   19   39:aload_1         
	//   20   40:invokespecial   #90  <Method void IllegalStateException(String, Throwable)>
	//   21   43:athrow          
		}
		FileOutputStream fileoutputstream;
		try
		{
			fileoutputstream = new FileOutputStream(((File) (obj)));
	//   22   44:new             #92  <Class FileOutputStream>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:invokespecial   #95  <Method void FileOutputStream(File)>
	//   26   52:astore_2        
			zzSQ = ParcelFileDescriptor.open(((File) (obj)), 0x10000000);
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:ldc1            #96  <Int 0x10000000>
	//   30   57:invokestatic    #102 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//   31   60:putfield        #36  <Field ParcelFileDescriptor zzSQ>
		}
	//*  32   63:goto            76
	//*  33   66:new             #70  <Class IllegalStateException>
	//*  34   69:dup             
	//*  35   70:ldc1            #104 <String "Temporary file is somehow already deleted">
	//*  36   72:invokespecial   #75  <Method void IllegalStateException(String)>
	//*  37   75:athrow          
	//*  38   76:aload_1         
	//*  39   77:invokevirtual   #108 <Method boolean File.delete()>
	//*  40   80:pop             
	//*  41   81:aload_2         
	//*  42   82:areturn         
		// Misplaced declaration of an exception variable
		catch(FileNotFoundException filenotfoundexception)
		{
			throw new IllegalStateException("Temporary file is somehow already deleted");
		}
		((File) (obj)).delete();
		return fileoutputstream;
	//*  43   83:astore_1        
	//*  44   84:goto            66
	}

	public void release()
	{
		if(!zzaDG)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field boolean zzaDG>
	//*   2    4:ifne            25
			try
			{
				zzSQ.close();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field ParcelFileDescriptor zzSQ>
	//    5   11:invokevirtual   #110 <Method void ParcelFileDescriptor.close()>
				return;
	//    6   14:return          
			}
			catch(IOException ioexception)
	//*   7   15:astore_1        
			{
				Log.w("BitmapTeleporter", "Could not close PFD", ((Throwable) (ioexception)));
	//    8   16:ldc1            #54  <String "BitmapTeleporter">
	//    9   18:ldc1            #112 <String "Could not close PFD">
	//   10   20:aload_1         
	//   11   21:invokestatic    #62  <Method int Log.w(String, String, Throwable)>
	//   12   24:pop             
			}
	//   13   25:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Object obj;
		Bitmap bitmap;
		byte abyte0[];
		if(zzSQ != null)
			break MISSING_BLOCK_LABEL_123;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ParcelFileDescriptor zzSQ>
	//    2    4:ifnonnull       123
		bitmap = zzaDF;
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field Bitmap zzaDF>
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
		obj = ((Object) (new DataOutputStream(((java.io.OutputStream) (zzxh())))));
	//   19   40:new             #139 <Class DataOutputStream>
	//   20   43:dup             
	//   21   44:aload_0         
	//   22   45:invokespecial   #141 <Method FileOutputStream zzxh()>
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
		break MISSING_BLOCK_LABEL_123;
	//   48  100:goto            123
		parcel;
	//   49  103:astore_1        
		throw new IllegalStateException("Could not write into unlinked file", ((Throwable) (parcel)));
	//   50  104:new             #70  <Class IllegalStateException>
	//   51  107:dup             
	//   52  108:ldc1            #172 <String "Could not write into unlinked file">
	//   53  110:aload_1         
	//   54  111:invokespecial   #90  <Method void IllegalStateException(String, Throwable)>
	//   55  114:athrow          
		parcel;
	//   56  115:astore_1        
		zza(((Closeable) (obj)));
	//   57  116:aload_0         
	//   58  117:aload_3         
	//   59  118:invokespecial   #170 <Method void zza(Closeable)>
		throw parcel;
	//   60  121:aload_1         
	//   61  122:athrow          
		com.google.android.gms.common.data.zza.zza(this, parcel, i | 1);
	//   62  123:aload_0         
	//   63  124:aload_1         
	//   64  125:iload_2         
	//   65  126:iconst_1        
	//   66  127:ior             
	//   67  128:invokestatic    #175 <Method void com.google.android.gms.common.data.zza.zza(BitmapTeleporter, Parcel, int)>
		zzSQ = null;
	//   68  131:aload_0         
	//   69  132:aconst_null     
	//   70  133:putfield        #36  <Field ParcelFileDescriptor zzSQ>
		return;
	//   71  136:return          
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
			zzaDH = file;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #68  <Field File zzaDH>
			return;
	//   10   19:return          
		}
	}

	public Bitmap zzxg()
	{
		DataInputStream datainputstream;
		if(zzaDG)
			break MISSING_BLOCK_LABEL_124;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean zzaDG>
	//    2    4:ifne            124
		datainputstream = new DataInputStream(((java.io.InputStream) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzSQ))));
	//    3    7:new             #185 <Class DataInputStream>
	//    4   10:dup             
	//    5   11:new             #187 <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field ParcelFileDescriptor zzSQ>
	//    9   19:invokespecial   #190 <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
	//   10   22:invokespecial   #193 <Method void DataInputStream(java.io.InputStream)>
	//   11   25:astore_3        
		int i;
		int j;
		Object obj;
		byte abyte0[];
		abyte0 = new byte[datainputstream.readInt()];
	//   12   26:aload_3         
	//   13   27:invokevirtual   #196 <Method int DataInputStream.readInt()>
	//   14   30:newarray        byte[]
	//   15   32:astore          5
		i = datainputstream.readInt();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #196 <Method int DataInputStream.readInt()>
	//   18   38:istore_1        
		j = datainputstream.readInt();
	//   19   39:aload_3         
	//   20   40:invokevirtual   #196 <Method int DataInputStream.readInt()>
	//   21   43:istore_2        
		obj = ((Object) (android.graphics.Bitmap.Config.valueOf(datainputstream.readUTF())));
	//   22   44:aload_3         
	//   23   45:invokevirtual   #199 <Method String DataInputStream.readUTF()>
	//   24   48:invokestatic    #203 <Method android.graphics.Bitmap$Config android.graphics.Bitmap$Config.valueOf(String)>
	//   25   51:astore          4
		datainputstream.read(abyte0);
	//   26   53:aload_3         
	//   27   54:aload           5
	//   28   56:invokevirtual   #207 <Method int DataInputStream.read(byte[])>
	//   29   59:pop             
		zza(((Closeable) (datainputstream)));
	//   30   60:aload_0         
	//   31   61:aload_3         
	//   32   62:invokespecial   #170 <Method void zza(Closeable)>
		break MISSING_BLOCK_LABEL_92;
	//   33   65:goto            92
		obj;
	//   34   68:astore          4
		throw new IllegalStateException("Could not read from parcel file descriptor", ((Throwable) (obj)));
	//   35   70:new             #70  <Class IllegalStateException>
	//   36   73:dup             
	//   37   74:ldc1            #209 <String "Could not read from parcel file descriptor">
	//   38   76:aload           4
	//   39   78:invokespecial   #90  <Method void IllegalStateException(String, Throwable)>
	//   40   81:athrow          
		obj;
	//   41   82:astore          4
		zza(((Closeable) (datainputstream)));
	//   42   84:aload_0         
	//   43   85:aload_3         
	//   44   86:invokespecial   #170 <Method void zza(Closeable)>
		throw obj;
	//   45   89:aload           4
	//   46   91:athrow          
		ByteBuffer bytebuffer = ByteBuffer.wrap(abyte0);
	//   47   92:aload           5
	//   48   94:invokestatic    #213 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   49   97:astore_3        
		obj = ((Object) (Bitmap.createBitmap(i, j, ((android.graphics.Bitmap.Config) (obj)))));
	//   50   98:iload_1         
	//   51   99:iload_2         
	//   52  100:aload           4
	//   53  102:invokestatic    #217 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   54  105:astore          4
		((Bitmap) (obj)).copyPixelsFromBuffer(((java.nio.Buffer) (bytebuffer)));
	//   55  107:aload           4
	//   56  109:aload_3         
	//   57  110:invokevirtual   #220 <Method void Bitmap.copyPixelsFromBuffer(java.nio.Buffer)>
		zzaDF = ((Bitmap) (obj));
	//   58  113:aload_0         
	//   59  114:aload           4
	//   60  116:putfield        #40  <Field Bitmap zzaDF>
		zzaDG = true;
	//   61  119:aload_0         
	//   62  120:iconst_1        
	//   63  121:putfield        #42  <Field boolean zzaDG>
		return zzaDF;
	//   64  124:aload_0         
	//   65  125:getfield        #40  <Field Bitmap zzaDF>
	//   66  128:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.common.data.zza();
	ParcelFileDescriptor zzSQ;
	private Bitmap zzaDF;
	private boolean zzaDG;
	private File zzaDH;
	final int zzaiI;
	final int zzakD;

	static 
	{
	//    0    0:new             #24  <Class com.google.android.gms.common.data.zza>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void com.google.android.gms.common.data.zza()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
