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
import com.google.android.gms.common.internal.safeparcel.c;
import java.io.*;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.common.data:
//			g

public class BitmapTeleporter extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	BitmapTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int a>
		b = parcelfiledescriptor;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field ParcelFileDescriptor b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #37  <Field int c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #39  <Field Bitmap d>
		e = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #41  <Field boolean e>
	//   17   29:return          
	}

	private final FileOutputStream a()
	{
		FileNotFoundException filenotfoundexception;
		File file = f;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field File f>
	//    2    4:astore_1        
		if(file != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          66
		{
			FileOutputStream fileoutputstream;
			try
			{
				file = File.createTempFile("teleporter", ".tmp", file);
	//    5    9:ldc1            #50  <String "teleporter">
	//    6   11:ldc1            #52  <String ".tmp">
	//    7   13:aload_1         
	//    8   14:invokestatic    #58  <Method File File.createTempFile(String, String, File)>
	//    9   17:astore_1        
			}
	//*  10   18:new             #60  <Class FileOutputStream>
	//*  11   21:dup             
	//*  12   22:aload_1         
	//*  13   23:invokespecial   #63  <Method void FileOutputStream(File)>
	//*  14   26:astore_2        
	//*  15   27:aload_0         
	//*  16   28:aload_1         
	//*  17   29:ldc1            #64  <Int 0x10000000>
	//*  18   31:invokestatic    #70  <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//*  19   34:putfield        #35  <Field ParcelFileDescriptor b>
	//*  20   37:aload_1         
	//*  21   38:invokevirtual   #74  <Method boolean File.delete()>
	//*  22   41:pop             
	//*  23   42:aload_2         
	//*  24   43:areturn         
	//*  25   44:new             #76  <Class IllegalStateException>
	//*  26   47:dup             
	//*  27   48:ldc1            #78  <String "Temporary file is somehow already deleted">
	//*  28   50:invokespecial   #81  <Method void IllegalStateException(String)>
	//*  29   53:athrow          
			catch(IOException ioexception)
	//*  30   54:astore_1        
			{
				throw new IllegalStateException("Could not create temporary file", ((Throwable) (ioexception)));
	//   31   55:new             #76  <Class IllegalStateException>
	//   32   58:dup             
	//   33   59:ldc1            #83  <String "Could not create temporary file">
	//   34   61:aload_1         
	//   35   62:invokespecial   #86  <Method void IllegalStateException(String, Throwable)>
	//   36   65:athrow          
			}
			try
			{
				fileoutputstream = new FileOutputStream(file);
				b = ParcelFileDescriptor.open(file, 0x10000000);
			}
	//*  37   66:new             #76  <Class IllegalStateException>
	//*  38   69:dup             
	//*  39   70:ldc1            #88  <String "setTempDir() must be called before writing this object to a parcel">
	//*  40   72:invokespecial   #81  <Method void IllegalStateException(String)>
	//*  41   75:athrow          
			// Misplaced declaration of an exception variable
			catch(FileNotFoundException filenotfoundexception)
			{
				throw new IllegalStateException("Temporary file is somehow already deleted");
			}
			file.delete();
			return fileoutputstream;
		} else
		{
			throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
		}
	//*  42   76:astore_1        
	//*  43   77:goto            44
	}

	private static void a(Closeable closeable)
	{
		try
		{
			closeable.close();
	//    0    0:aload_0         
	//    1    1:invokeinterface #94  <Method void Closeable.close()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   3    7:astore_0        
		{
			Log.w("BitmapTeleporter", "Could not close stream", ((Throwable) (closeable)));
	//    4    8:ldc1            #96  <String "BitmapTeleporter">
	//    5   10:ldc1            #98  <String "Could not close stream">
	//    6   12:aload_0         
	//    7   13:invokestatic    #104 <Method int Log.w(String, String, Throwable)>
	//    8   16:pop             
		}
	//    9   17:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Object obj;
		Bitmap bitmap;
		byte abyte0[];
		if(b != null)
			break MISSING_BLOCK_LABEL_142;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ParcelFileDescriptor b>
	//    2    4:ifnonnull       142
		bitmap = d;
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field Bitmap d>
	//    5   11:astore          5
		obj = ((Object) (ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight())));
	//    6   13:aload           5
	//    7   15:invokevirtual   #112 <Method int Bitmap.getRowBytes()>
	//    8   18:aload           5
	//    9   20:invokevirtual   #115 <Method int Bitmap.getHeight()>
	//   10   23:imul            
	//   11   24:invokestatic    #121 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   12   27:astore          4
		bitmap.copyPixelsToBuffer(((java.nio.Buffer) (obj)));
	//   13   29:aload           5
	//   14   31:aload           4
	//   15   33:invokevirtual   #125 <Method void Bitmap.copyPixelsToBuffer(java.nio.Buffer)>
		abyte0 = ((ByteBuffer) (obj)).array();
	//   16   36:aload           4
	//   17   38:invokevirtual   #129 <Method byte[] ByteBuffer.array()>
	//   18   41:astore          6
		obj = ((Object) (new DataOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (a()))))))));
	//   19   43:new             #131 <Class DataOutputStream>
	//   20   46:dup             
	//   21   47:new             #133 <Class BufferedOutputStream>
	//   22   50:dup             
	//   23   51:aload_0         
	//   24   52:invokespecial   #135 <Method FileOutputStream a()>
	//   25   55:invokespecial   #138 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   26   58:invokespecial   #139 <Method void DataOutputStream(java.io.OutputStream)>
	//   27   61:astore          4
		((DataOutputStream) (obj)).writeInt(abyte0.length);
	//   28   63:aload           4
	//   29   65:aload           6
	//   30   67:arraylength     
	//   31   68:invokevirtual   #143 <Method void DataOutputStream.writeInt(int)>
		((DataOutputStream) (obj)).writeInt(bitmap.getWidth());
	//   32   71:aload           4
	//   33   73:aload           5
	//   34   75:invokevirtual   #146 <Method int Bitmap.getWidth()>
	//   35   78:invokevirtual   #143 <Method void DataOutputStream.writeInt(int)>
		((DataOutputStream) (obj)).writeInt(bitmap.getHeight());
	//   36   81:aload           4
	//   37   83:aload           5
	//   38   85:invokevirtual   #115 <Method int Bitmap.getHeight()>
	//   39   88:invokevirtual   #143 <Method void DataOutputStream.writeInt(int)>
		((DataOutputStream) (obj)).writeUTF(bitmap.getConfig().toString());
	//   40   91:aload           4
	//   41   93:aload           5
	//   42   95:invokevirtual   #150 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   43   98:invokevirtual   #156 <Method String android.graphics.Bitmap$Config.toString()>
	//   44  101:invokevirtual   #159 <Method void DataOutputStream.writeUTF(String)>
		((DataOutputStream) (obj)).write(abyte0);
	//   45  104:aload           4
	//   46  106:aload           6
	//   47  108:invokevirtual   #163 <Method void DataOutputStream.write(byte[])>
		a(((Closeable) (obj)));
	//   48  111:aload           4
	//   49  113:invokestatic    #165 <Method void a(Closeable)>
		break MISSING_BLOCK_LABEL_142;
	//   50  116:goto            142
		parcel;
	//   51  119:astore_1        
		break MISSING_BLOCK_LABEL_135;
	//   52  120:goto            135
		parcel;
	//   53  123:astore_1        
		throw new IllegalStateException("Could not write into unlinked file", ((Throwable) (parcel)));
	//   54  124:new             #76  <Class IllegalStateException>
	//   55  127:dup             
	//   56  128:ldc1            #167 <String "Could not write into unlinked file">
	//   57  130:aload_1         
	//   58  131:invokespecial   #86  <Method void IllegalStateException(String, Throwable)>
	//   59  134:athrow          
		a(((Closeable) (obj)));
	//   60  135:aload           4
	//   61  137:invokestatic    #165 <Method void a(Closeable)>
		throw parcel;
	//   62  140:aload_1         
	//   63  141:athrow          
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//   64  142:aload_1         
	//   65  143:invokestatic    #172 <Method int c.a(Parcel)>
	//   66  146:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//   67  147:aload_1         
	//   68  148:iconst_1        
	//   69  149:aload_0         
	//   70  150:getfield        #33  <Field int a>
	//   71  153:invokestatic    #175 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (b)), i | 1, false);
	//   72  156:aload_1         
	//   73  157:iconst_2        
	//   74  158:aload_0         
	//   75  159:getfield        #35  <Field ParcelFileDescriptor b>
	//   76  162:iload_2         
	//   77  163:iconst_1        
	//   78  164:ior             
	//   79  165:iconst_0        
	//   80  166:invokestatic    #178 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
	//   81  169:aload_1         
	//   82  170:iconst_3        
	//   83  171:aload_0         
	//   84  172:getfield        #37  <Field int c>
	//   85  175:invokestatic    #175 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   86  178:aload_1         
	//   87  179:iload_3         
	//   88  180:invokestatic    #180 <Method void c.a(Parcel, int)>
		b = null;
	//   89  183:aload_0         
	//   90  184:aconst_null     
	//   91  185:putfield        #35  <Field ParcelFileDescriptor b>
		return;
	//   92  188:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new g();
	private final int a;
	private ParcelFileDescriptor b;
	private final int c;
	private Bitmap d;
	private boolean e;
	private File f;

	static 
	{
	//    0    0:new             #23  <Class g>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void g()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
