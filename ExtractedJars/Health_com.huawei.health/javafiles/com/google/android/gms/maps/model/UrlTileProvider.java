// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import java.io.*;
import java.net.URL;

// Referenced classes of package com.google.android.gms.maps.model:
//			TileProvider, Tile

public abstract class UrlTileProvider
	implements TileProvider
{

	public UrlTileProvider(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzrC = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int zzrC>
		zzrD = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int zzrD>
	//    8   14:return          
	}

	private static long zzb(InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		byte abyte0[] = new byte[4096];
	//    0    0:sipush          4096
	//    1    3:newarray        byte[]
	//    2    5:astore          5
		long l = 0L;
	//    3    7:lconst_0        
	//    4    8:lstore_3        
		do
		{
			int i = inputstream.read(abyte0);
	//    5    9:aload_0         
	//    6   10:aload           5
	//    7   12:invokevirtual   #29  <Method int InputStream.read(byte[])>
	//    8   15:istore_2        
			if(i == -1)
	//*   9   16:iload_2         
	//*  10   17:iconst_m1       
	//*  11   18:icmpne          23
				return l;
	//   12   21:lload_3         
	//   13   22:lreturn         
			outputstream.write(abyte0, 0, i);
	//   14   23:aload_1         
	//   15   24:aload           5
	//   16   26:iconst_0        
	//   17   27:iload_2         
	//   18   28:invokevirtual   #35  <Method void OutputStream.write(byte[], int, int)>
			l += i;
	//   19   31:lload_3         
	//   20   32:iload_2         
	//   21   33:i2l             
	//   22   34:ladd            
	//   23   35:lstore_3        
		} while(true);
	//   24   36:goto            9
	}

	private static byte[] zzk(InputStream inputstream)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #40  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		zzb(inputstream, ((OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #43  <Method long zzb(InputStream, OutputStream)>
	//    7   13:pop2            
		return bytearrayoutputstream.toByteArray();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #47  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   10   18:areturn         
	}

	public final Tile getTile(int i, int j, int k)
	{
		IOException ioexception;
		Object obj = ((Object) (getTileUrl(i, j, k)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #53  <Method URL getTileUrl(int, int, int)>
	//    5    7:astore          4
		if(obj == null)
	//*   6    9:aload           4
	//*   7   11:ifnonnull       18
			return NO_TILE;
	//    8   14:getstatic       #57  <Field Tile NO_TILE>
	//    9   17:areturn         
		try
		{
			obj = ((Object) (new Tile(zzrC, zzrD, zzk(((URL) (obj)).openStream()))));
	//   10   18:new             #59  <Class Tile>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #16  <Field int zzrC>
	//   14   26:aload_0         
	//   15   27:getfield        #18  <Field int zzrD>
	//   16   30:aload           4
	//   17   32:invokevirtual   #65  <Method InputStream URL.openStream()>
	//   18   35:invokestatic    #67  <Method byte[] zzk(InputStream)>
	//   19   38:invokespecial   #70  <Method void Tile(int, int, byte[])>
	//   20   41:astore          4
		}
	//*  21   43:aload           4
	//*  22   45:areturn         
	//*  23   46:aconst_null     
	//*  24   47:areturn         
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			return null;
		}
		return ((Tile) (obj));
	//*  25   48:astore          4
	//*  26   50:goto            46
	}

	public abstract URL getTileUrl(int i, int j, int k);

	private final int zzrC;
	private final int zzrD;
}
