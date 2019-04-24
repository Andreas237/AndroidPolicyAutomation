// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//			TileOverlayOptions, TileProvider, Tile

class TileOverlayOptions$2 extends com.google.android.gms.maps.model.internal.zzi.zza
{

	public Tile getTile(int i, int j, int k)
	{
		return zzbqb.getTile(i, j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TileProvider zzbqb>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #25  <Method Tile TileProvider.getTile(int, int, int)>
	//    6   12:areturn         
	}

	final TileProvider zzbqb;

	TileOverlayOptions$2(TileOverlayOptions tileoverlayoptions, TileProvider tileprovider)
	{
		zzbqb = tileprovider;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field TileProvider zzbqb>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.model.internal.zzi$zza()>
	//    5    9:return          
	}
}
