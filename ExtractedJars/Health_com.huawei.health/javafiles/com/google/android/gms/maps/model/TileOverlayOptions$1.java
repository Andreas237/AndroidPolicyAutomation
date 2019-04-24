// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps.model:
//			TileProvider, TileOverlayOptions, Tile

class TileOverlayOptions$1
	implements TileProvider
{

	public Tile getTile(int i, int j, int k)
	{
		RemoteException remoteexception;
		Tile tile;
		try
		{
			tile = zzbpZ.getTile(i, j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field zzi zzbpZ>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #36  <Method Tile zzi.getTile(int, int, int)>
	//    6   12:astore          4
		}
	//*   7   14:aload           4
	//*   8   16:areturn         
	//*   9   17:aconst_null     
	//*  10   18:areturn         
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			return null;
		}
		return tile;
	//*  11   19:astore          4
	//*  12   21:goto            17
	}

	private final zzi zzbpZ;
	final TileOverlayOptions zzbqa;

	TileOverlayOptions$1(TileOverlayOptions tileoverlayoptions)
	{
		zzbqa = tileoverlayoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field TileOverlayOptions zzbqa>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		zzbpZ = TileOverlayOptions.zza(zzbqa);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field TileOverlayOptions zzbqa>
	//    8   14:invokestatic    #25  <Method zzi TileOverlayOptions.zza(TileOverlayOptions)>
	//    9   17:putfield        #27  <Field zzi zzbpZ>
	//   10   20:return          
	}
}
