// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//			Tile

public interface TileProvider
{

	public abstract Tile getTile(int i, int j, int k);

	public static final Tile NO_TILE = new Tile(-1, -1, ((byte []) (null)));

	/* static  */
	/* { */
	//    0    0:new             #10  <Class Tile>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:aconst_null     
	//    5    7:invokespecial   #14  <Method void Tile(int, int, byte[])>
	//    6   10:putstatic       #16  <Field Tile NO_TILE>
	//*   7   13:return          
	/* } */
}
