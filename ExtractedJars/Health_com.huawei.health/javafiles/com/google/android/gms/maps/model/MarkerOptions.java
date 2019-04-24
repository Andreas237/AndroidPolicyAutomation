// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzh, BitmapDescriptor, LatLng

public final class MarkerOptions extends zza
{

	public MarkerOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void zza()>
		zzbps = 0.5F;
	//    2    4:aload_0         
	//    3    5:ldc1            #38  <Float 0.5F>
	//    4    7:putfield        #40  <Field float zzbps>
		zzbpt = 1.0F;
	//    5   10:aload_0         
	//    6   11:fconst_1        
	//    7   12:putfield        #42  <Field float zzbpt>
		zzbpj = true;
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:putfield        #44  <Field boolean zzbpj>
		zzbpF = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #46  <Field boolean zzbpF>
		zzbpG = 0.0F;
	//   14   25:aload_0         
	//   15   26:fconst_0        
	//   16   27:putfield        #48  <Field float zzbpG>
		zzbpH = 0.5F;
	//   17   30:aload_0         
	//   18   31:ldc1            #38  <Float 0.5F>
	//   19   33:putfield        #50  <Field float zzbpH>
		zzbpI = 0.0F;
	//   20   36:aload_0         
	//   21   37:fconst_0        
	//   22   38:putfield        #52  <Field float zzbpI>
		mAlpha = 1.0F;
	//   23   41:aload_0         
	//   24   42:fconst_1        
	//   25   43:putfield        #54  <Field float mAlpha>
	//   26   46:return          
	}

	MarkerOptions(LatLng latlng, String s, String s1, IBinder ibinder, float f, float f1, boolean flag, 
			boolean flag1, boolean flag2, float f2, float f3, float f4, float f5, float f6)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void zza()>
		zzbps = 0.5F;
	//    2    4:aload_0         
	//    3    5:ldc1            #38  <Float 0.5F>
	//    4    7:putfield        #40  <Field float zzbps>
		zzbpt = 1.0F;
	//    5   10:aload_0         
	//    6   11:fconst_1        
	//    7   12:putfield        #42  <Field float zzbpt>
		zzbpj = true;
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:putfield        #44  <Field boolean zzbpj>
		zzbpF = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #46  <Field boolean zzbpF>
		zzbpG = 0.0F;
	//   14   25:aload_0         
	//   15   26:fconst_0        
	//   16   27:putfield        #48  <Field float zzbpG>
		zzbpH = 0.5F;
	//   17   30:aload_0         
	//   18   31:ldc1            #38  <Float 0.5F>
	//   19   33:putfield        #50  <Field float zzbpH>
		zzbpI = 0.0F;
	//   20   36:aload_0         
	//   21   37:fconst_0        
	//   22   38:putfield        #52  <Field float zzbpI>
		mAlpha = 1.0F;
	//   23   41:aload_0         
	//   24   42:fconst_1        
	//   25   43:putfield        #54  <Field float mAlpha>
		zzboL = latlng;
	//   26   46:aload_0         
	//   27   47:aload_1         
	//   28   48:putfield        #57  <Field LatLng zzboL>
		zzamJ = s;
	//   29   51:aload_0         
	//   30   52:aload_2         
	//   31   53:putfield        #59  <Field String zzamJ>
		zzbpC = s1;
	//   32   56:aload_0         
	//   33   57:aload_3         
	//   34   58:putfield        #61  <Field String zzbpC>
		if(ibinder == null)
	//*  35   61:aload           4
	//*  36   63:ifnonnull       74
			zzbpD = null;
	//   37   66:aload_0         
	//   38   67:aconst_null     
	//   39   68:putfield        #63  <Field BitmapDescriptor zzbpD>
		else
	//*  40   71:goto            90
			zzbpD = new BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(ibinder));
	//   41   74:aload_0         
	//   42   75:new             #65  <Class BitmapDescriptor>
	//   43   78:dup             
	//   44   79:aload           4
	//   45   81:invokestatic    #71  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   46   84:invokespecial   #74  <Method void BitmapDescriptor(IObjectWrapper)>
	//   47   87:putfield        #63  <Field BitmapDescriptor zzbpD>
		zzbps = f;
	//   48   90:aload_0         
	//   49   91:fload           5
	//   50   93:putfield        #40  <Field float zzbps>
		zzbpt = f1;
	//   51   96:aload_0         
	//   52   97:fload           6
	//   53   99:putfield        #42  <Field float zzbpt>
		zzbpE = flag;
	//   54  102:aload_0         
	//   55  103:iload           7
	//   56  105:putfield        #76  <Field boolean zzbpE>
		zzbpj = flag1;
	//   57  108:aload_0         
	//   58  109:iload           8
	//   59  111:putfield        #44  <Field boolean zzbpj>
		zzbpF = flag2;
	//   60  114:aload_0         
	//   61  115:iload           9
	//   62  117:putfield        #46  <Field boolean zzbpF>
		zzbpG = f2;
	//   63  120:aload_0         
	//   64  121:fload           10
	//   65  123:putfield        #48  <Field float zzbpG>
		zzbpH = f3;
	//   66  126:aload_0         
	//   67  127:fload           11
	//   68  129:putfield        #50  <Field float zzbpH>
		zzbpI = f4;
	//   69  132:aload_0         
	//   70  133:fload           12
	//   71  135:putfield        #52  <Field float zzbpI>
		mAlpha = f5;
	//   72  138:aload_0         
	//   73  139:fload           13
	//   74  141:putfield        #54  <Field float mAlpha>
		zzbpi = f6;
	//   75  144:aload_0         
	//   76  145:fload           14
	//   77  147:putfield        #78  <Field float zzbpi>
	//   78  150:return          
	}

	public MarkerOptions alpha(float f)
	{
		mAlpha = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #54  <Field float mAlpha>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MarkerOptions anchor(float f, float f1)
	{
		zzbps = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #40  <Field float zzbps>
		zzbpt = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #42  <Field float zzbpt>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public MarkerOptions draggable(boolean flag)
	{
		zzbpE = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #76  <Field boolean zzbpE>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MarkerOptions flat(boolean flag)
	{
		zzbpF = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field boolean zzbpF>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public float getAlpha()
	{
		return mAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float mAlpha>
	//    2    4:freturn         
	}

	public float getAnchorU()
	{
		return zzbps;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float zzbps>
	//    2    4:freturn         
	}

	public float getAnchorV()
	{
		return zzbpt;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float zzbpt>
	//    2    4:freturn         
	}

	public BitmapDescriptor getIcon()
	{
		return zzbpD;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field BitmapDescriptor zzbpD>
	//    2    4:areturn         
	}

	public float getInfoWindowAnchorU()
	{
		return zzbpH;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field float zzbpH>
	//    2    4:freturn         
	}

	public float getInfoWindowAnchorV()
	{
		return zzbpI;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field float zzbpI>
	//    2    4:freturn         
	}

	public LatLng getPosition()
	{
		return zzboL;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LatLng zzboL>
	//    2    4:areturn         
	}

	public float getRotation()
	{
		return zzbpG;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field float zzbpG>
	//    2    4:freturn         
	}

	public String getSnippet()
	{
		return zzbpC;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String zzbpC>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return zzamJ;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String zzamJ>
	//    2    4:areturn         
	}

	public float getZIndex()
	{
		return zzbpi;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field float zzbpi>
	//    2    4:freturn         
	}

	public MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
	{
		zzbpD = bitmapdescriptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field BitmapDescriptor zzbpD>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MarkerOptions infoWindowAnchor(float f, float f1)
	{
		zzbpH = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #50  <Field float zzbpH>
		zzbpI = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #52  <Field float zzbpI>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public boolean isDraggable()
	{
		return zzbpE;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field boolean zzbpE>
	//    2    4:ireturn         
	}

	public boolean isFlat()
	{
		return zzbpF;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean zzbpF>
	//    2    4:ireturn         
	}

	public boolean isVisible()
	{
		return zzbpj;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean zzbpj>
	//    2    4:ireturn         
	}

	public MarkerOptions position(LatLng latlng)
	{
		if(latlng == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("latlng cannot be null - a position is required.");
	//    2    4:new             #114 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #116 <String "latlng cannot be null - a position is required.">
	//    5   10:invokespecial   #119 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			zzboL = latlng;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #57  <Field LatLng zzboL>
			return this;
	//   10   19:aload_0         
	//   11   20:areturn         
		}
	}

	public MarkerOptions rotation(float f)
	{
		zzbpG = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #48  <Field float zzbpG>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MarkerOptions snippet(String s)
	{
		zzbpC = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field String zzbpC>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MarkerOptions title(String s)
	{
		zzamJ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field String zzamJ>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MarkerOptions visible(boolean flag)
	{
		zzbpj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field boolean zzbpj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzh.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #130 <Method void com.google.android.gms.maps.model.zzh.zza(MarkerOptions, Parcel, int)>
	//    4    6:return          
	}

	public MarkerOptions zIndex(float f)
	{
		zzbpi = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #78  <Field float zzbpi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	IBinder zzJM()
	{
		if(zzbpD == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field BitmapDescriptor zzbpD>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzbpD.zzJm().asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field BitmapDescriptor zzbpD>
	//    7   13:invokevirtual   #137 <Method IObjectWrapper BitmapDescriptor.zzJm()>
	//    8   16:invokeinterface #142 <Method IBinder IObjectWrapper.asBinder()>
	//    9   21:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzh();
	private float mAlpha;
	private String zzamJ;
	private LatLng zzboL;
	private String zzbpC;
	private BitmapDescriptor zzbpD;
	private boolean zzbpE;
	private boolean zzbpF;
	private float zzbpG;
	private float zzbpH;
	private float zzbpI;
	private float zzbpi;
	private boolean zzbpj;
	private float zzbps;
	private float zzbpt;

	static 
	{
	//    0    0:new             #30  <Class zzh>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zzh()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
