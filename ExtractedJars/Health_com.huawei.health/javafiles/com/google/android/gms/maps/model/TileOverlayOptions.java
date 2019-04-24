// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzr, TileProvider, Tile

public final class TileOverlayOptions extends zza
{

	public TileOverlayOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zza()>
		zzbpj = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #34  <Field boolean zzbpj>
		zzbpY = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #36  <Field boolean zzbpY>
		zzbpr = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #38  <Field float zzbpr>
	//   11   19:return          
	}

	TileOverlayOptions(IBinder ibinder, boolean flag, float f, boolean flag1, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zza()>
		zzbpj = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #34  <Field boolean zzbpj>
		zzbpY = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #36  <Field boolean zzbpY>
		zzbpr = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #38  <Field float zzbpr>
		zzbpW = com.google.android.gms.maps.model.internal.zzi.zza.zzer(ibinder);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokestatic    #45  <Method zzi com.google.android.gms.maps.model.internal.zzi$zza.zzer(IBinder)>
	//   14   24:putfield        #47  <Field zzi zzbpW>
		if(zzbpW == null)
	//*  15   27:aload_0         
	//*  16   28:getfield        #47  <Field zzi zzbpW>
	//*  17   31:ifnonnull       39
			ibinder = null;
	//   18   34:aconst_null     
	//   19   35:astore_1        
		else
	//*  20   36:goto            48
			ibinder = ((IBinder) (new TileProvider() {

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

			
			{
				zzbqa = TileOverlayOptions.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TileOverlayOptions zzbqa>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
				zzbpZ = com.google.android.gms.maps.model.TileOverlayOptions.zza(zzbqa);
			//    5    9:aload_0         
			//    6   10:aload_0         
			//    7   11:getfield        #18  <Field TileOverlayOptions zzbqa>
			//    8   14:invokestatic    #25  <Method zzi com.google.android.gms.maps.model.TileOverlayOptions.zza(TileOverlayOptions)>
			//    9   17:putfield        #27  <Field zzi zzbpZ>
			//   10   20:return          
			}
			}
));
	//   21   39:new             #6   <Class TileOverlayOptions$1>
	//   22   42:dup             
	//   23   43:aload_0         
	//   24   44:invokespecial   #50  <Method void TileOverlayOptions$1(TileOverlayOptions)>
	//   25   47:astore_1        
		zzbpX = ((TileProvider) (ibinder));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:putfield        #52  <Field TileProvider zzbpX>
		zzbpj = flag;
	//   29   53:aload_0         
	//   30   54:iload_2         
	//   31   55:putfield        #34  <Field boolean zzbpj>
		zzbpi = f;
	//   32   58:aload_0         
	//   33   59:fload_3         
	//   34   60:putfield        #54  <Field float zzbpi>
		zzbpY = flag1;
	//   35   63:aload_0         
	//   36   64:iload           4
	//   37   66:putfield        #36  <Field boolean zzbpY>
		zzbpr = f1;
	//   38   69:aload_0         
	//   39   70:fload           5
	//   40   72:putfield        #38  <Field float zzbpr>
	//   41   75:return          
	}

	static zzi zza(TileOverlayOptions tileoverlayoptions)
	{
		return tileoverlayoptions.zzbpW;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field zzi zzbpW>
	//    2    4:areturn         
	}

	public TileOverlayOptions fadeIn(boolean flag)
	{
		zzbpY = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean zzbpY>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public boolean getFadeIn()
	{
		return zzbpY;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean zzbpY>
	//    2    4:ireturn         
	}

	public TileProvider getTileProvider()
	{
		return zzbpX;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field TileProvider zzbpX>
	//    2    4:areturn         
	}

	public float getTransparency()
	{
		return zzbpr;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field float zzbpr>
	//    2    4:freturn         
	}

	public float getZIndex()
	{
		return zzbpi;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float zzbpi>
	//    2    4:freturn         
	}

	public boolean isVisible()
	{
		return zzbpj;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean zzbpj>
	//    2    4:ireturn         
	}

	public TileOverlayOptions tileProvider(TileProvider tileprovider)
	{
		zzbpX = tileprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field TileProvider zzbpX>
		if(zzbpX == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #52  <Field TileProvider zzbpX>
	//*   5    9:ifnonnull       17
			tileprovider = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		else
	//*   8   14:goto            27
			tileprovider = ((TileProvider) (new com.google.android.gms.maps.model.internal.zzi.zza(tileprovider) {

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
));
	//    9   17:new             #8   <Class TileOverlayOptions$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #71  <Method void TileOverlayOptions$2(TileOverlayOptions, TileProvider)>
	//   14   26:astore_1        
		zzbpW = ((zzi) (tileprovider));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #47  <Field zzi zzbpW>
		return this;
	//   18   32:aload_0         
	//   19   33:areturn         
	}

	public TileOverlayOptions transparency(float f)
	{
		boolean flag;
		if(f >= 0.0F && f <= 1.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:iflt            17
	//*   4    6:fload_1         
	//*   5    7:fconst_1        
	//*   6    8:fcmpg           
	//*   7    9:ifgt            17
			flag = true;
	//    8   12:iconst_1        
	//    9   13:istore_2        
		else
	//*  10   14:goto            19
			flag = false;
	//   11   17:iconst_0        
	//   12   18:istore_2        
		zzac.zzb(flag, "Transparency must be in the range [0..1]");
	//   13   19:iload_2         
	//   14   20:ldc1            #75  <String "Transparency must be in the range [0..1]">
	//   15   22:invokestatic    #81  <Method void zzac.zzb(boolean, Object)>
		zzbpr = f;
	//   16   25:aload_0         
	//   17   26:fload_1         
	//   18   27:putfield        #38  <Field float zzbpr>
		return this;
	//   19   30:aload_0         
	//   20   31:areturn         
	}

	public TileOverlayOptions visible(boolean flag)
	{
		zzbpj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field boolean zzbpj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzr.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #87  <Method void com.google.android.gms.maps.model.zzr.zza(TileOverlayOptions, Parcel, int)>
	//    4    6:return          
	}

	public TileOverlayOptions zIndex(float f)
	{
		zzbpi = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #54  <Field float zzbpi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	IBinder zzJQ()
	{
		return zzbpW.asBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field zzi zzbpW>
	//    2    4:invokeinterface #95  <Method IBinder zzi.asBinder()>
	//    3    9:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzr();
	private zzi zzbpW;
	private TileProvider zzbpX;
	private boolean zzbpY;
	private float zzbpi;
	private boolean zzbpj;
	private float zzbpr;

	static 
	{
	//    0    0:new             #25  <Class zzr>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzr()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
