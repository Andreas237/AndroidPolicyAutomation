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
		width = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int width>
		height = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int height>
	//    8   14:return          
	}

	public final Tile getTile(int i, int j, int k)
	{
		Object obj;
		obj = ((Object) (getTileUrl(i, j, k)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #27  <Method URL getTileUrl(int, int, int)>
	//    5    7:astore          4
		if(obj == null)
	//*   6    9:aload           4
	//*   7   11:ifnonnull       18
			return NO_TILE;
	//    8   14:getstatic       #31  <Field Tile NO_TILE>
	//    9   17:areturn         
		ByteArrayOutputStream bytearrayoutputstream;
		byte abyte0[];
		i = width;
	//   10   18:aload_0         
	//   11   19:getfield        #16  <Field int width>
	//   12   22:istore_1        
		j = height;
	//   13   23:aload_0         
	//   14   24:getfield        #18  <Field int height>
	//   15   27:istore_2        
		obj = ((Object) (((URL) (obj)).openStream()));
	//   16   28:aload           4
	//   17   30:invokevirtual   #37  <Method InputStream URL.openStream()>
	//   18   33:astore          4
		bytearrayoutputstream = new ByteArrayOutputStream();
	//   19   35:new             #39  <Class ByteArrayOutputStream>
	//   20   38:dup             
	//   21   39:invokespecial   #40  <Method void ByteArrayOutputStream()>
	//   22   42:astore          5
		abyte0 = new byte[4096];
	//   23   44:sipush          4096
	//   24   47:newarray        byte[]
	//   25   49:astore          6
_L1:
		k = ((InputStream) (obj)).read(abyte0);
	//   26   51:aload           4
	//   27   53:aload           6
	//   28   55:invokevirtual   #46  <Method int InputStream.read(byte[])>
	//   29   58:istore_3        
label0:
		{
			if(k == -1)
				break label0;
	//   30   59:iload_3         
	//   31   60:iconst_m1       
	//   32   61:icmpeq          76
			Tile tile;
			try
			{
				((OutputStream) (bytearrayoutputstream)).write(abyte0, 0, k);
	//   33   64:aload           5
	//   34   66:aload           6
	//   35   68:iconst_0        
	//   36   69:iload_3         
	//   37   70:invokevirtual   #52  <Method void OutputStream.write(byte[], int, int)>
			}
	//*  38   73:goto            51
	//*  39   76:new             #54  <Class Tile>
	//*  40   79:dup             
	//*  41   80:iload_1         
	//*  42   81:iload_2         
	//*  43   82:aload           5
	//*  44   84:invokevirtual   #58  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  45   87:invokespecial   #61  <Method void Tile(int, int, byte[])>
	//*  46   90:astore          4
	//*  47   92:aload           4
	//*  48   94:areturn         
	//*  49   95:aconst_null     
	//*  50   96:areturn         
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				return null;
			}
		}
		  goto _L1
		tile = new Tile(i, j, bytearrayoutputstream.toByteArray());
		IOException ioexception;
		return tile;
	//*  51   97:astore          4
	//*  52   99:goto            95
	}

	public abstract URL getTileUrl(int i, int j, int k);

	private final int height;
	private final int width;
}
