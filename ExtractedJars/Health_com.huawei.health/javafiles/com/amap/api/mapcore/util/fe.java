// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileProvider;

// Referenced classes of package com.amap.api.mapcore.util:
//			ff

public class fe extends ff
{

	public fe(Context context, int i, int j)
	{
		super(context, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #10  <Method void ff(Context, int, int)>
		e = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #12  <Field TileProvider e>
		a(context);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokespecial   #16  <Method void a(Context)>
	//   11   17:return          
	}

	private void a(Context context)
	{
		b(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void b(Context)>
	//    3    5:return          
	}

	private void b(Context context)
	{
		context = ((Context) ((ConnectivityManager)context.getSystemService("connectivity")));
	//    0    0:aload_1         
	//    1    1:ldc1            #22  <String "connectivity">
	//    2    3:invokevirtual   #28  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #30  <Class ConnectivityManager>
	//    4    9:astore_1        
		if(context != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          28
		{
			context = ((Context) (((ConnectivityManager) (context)).getActiveNetworkInfo()));
	//    7   14:aload_1         
	//    8   15:invokevirtual   #34  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    9   18:astore_1        
			if(context != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          28
				((NetworkInfo) (context)).isConnectedOrConnecting();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #40  <Method boolean NetworkInfo.isConnectedOrConnecting()>
	//   14   27:pop             
		}
	//   15   28:return          
	}

	private Bitmap c(dq.a a1)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		Tile tile;
		try
		{
			tile = e.getTile(a1.a, a1.b, a1.c);
	//    2    2:aload_0         
	//    3    3:getfield        #12  <Field TileProvider e>
	//    4    6:aload_1         
	//    5    7:getfield        #49  <Field int dq$a.a>
	//    6   10:aload_1         
	//    7   11:getfield        #51  <Field int dq$a.b>
	//    8   14:aload_1         
	//    9   15:getfield        #53  <Field int dq$a.c>
	//   10   18:invokeinterface #59  <Method Tile TileProvider.getTile(int, int, int)>
	//   11   23:astore_3        
		}
	//*  12   24:aload_2         
	//*  13   25:astore_1        
	//*  14   26:aload_3         
	//*  15   27:ifnull          53
	//*  16   30:aload_2         
	//*  17   31:astore_1        
	//*  18   32:aload_3         
	//*  19   33:getstatic       #63  <Field Tile TileProvider.NO_TILE>
	//*  20   36:if_acmpeq       53
	//*  21   39:aload_3         
	//*  22   40:getfield        #69  <Field byte[] Tile.data>
	//*  23   43:iconst_0        
	//*  24   44:aload_3         
	//*  25   45:getfield        #69  <Field byte[] Tile.data>
	//*  26   48:arraylength     
	//*  27   49:invokestatic    #75  <Method Bitmap BitmapFactory.decodeByteArray(byte[], int, int)>
	//*  28   52:astore_1        
	//*  29   53:aload_1         
	//*  30   54:areturn         
		// Misplaced declaration of an exception variable
		catch(dq.a a1)
	//*  31   55:astore_1        
		{
			return null;
	//   32   56:aconst_null     
	//   33   57:areturn         
		}
		a1 = ((dq.a) (obj));
		if(tile == null)
			break MISSING_BLOCK_LABEL_53;
		a1 = ((dq.a) (obj));
		if(tile != TileProvider.NO_TILE)
			a1 = ((dq.a) (BitmapFactory.decodeByteArray(tile.data, 0, tile.data.length)));
		return ((Bitmap) (a1));
	}

	protected Bitmap a(Object obj)
	{
		return c((dq.a)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #46  <Class dq$a>
	//    3    5:invokespecial   #78  <Method Bitmap c(dq$a)>
	//    4    8:areturn         
	}

	public void a(TileProvider tileprovider)
	{
		e = tileprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field TileProvider e>
	//    3    5:return          
	}

	private TileProvider e;
}
