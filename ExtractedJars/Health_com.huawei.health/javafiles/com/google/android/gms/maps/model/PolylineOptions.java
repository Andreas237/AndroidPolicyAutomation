// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzl, ButtCap, LatLng, Cap

public final class PolylineOptions extends zza
{

	public PolylineOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void zza()>
		zzbpp = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #39  <Float 10F>
	//    4    7:putfield        #41  <Field float zzbpp>
		mColor = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #42  <Int 0xff000000>
	//    7   13:putfield        #44  <Field int mColor>
		zzbpi = 0.0F;
	//    8   16:aload_0         
	//    9   17:fconst_0        
	//   10   18:putfield        #46  <Field float zzbpi>
		zzbpj = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #48  <Field boolean zzbpj>
		zzbpN = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #50  <Field boolean zzbpN>
		zzbpk = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #52  <Field boolean zzbpk>
		zzbpQ = ((Cap) (new ButtCap()));
	//   20   36:aload_0         
	//   21   37:new             #54  <Class ButtCap>
	//   22   40:dup             
	//   23   41:invokespecial   #55  <Method void ButtCap()>
	//   24   44:putfield        #57  <Field Cap zzbpQ>
		zzbpR = ((Cap) (new ButtCap()));
	//   25   47:aload_0         
	//   26   48:new             #54  <Class ButtCap>
	//   27   51:dup             
	//   28   52:invokespecial   #55  <Method void ButtCap()>
	//   29   55:putfield        #59  <Field Cap zzbpR>
		zzbpS = 0;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #61  <Field int zzbpS>
		zzbpT = null;
	//   33   63:aload_0         
	//   34   64:aconst_null     
	//   35   65:putfield        #63  <Field List zzbpT>
		zzbpL = ((List) (new ArrayList()));
	//   36   68:aload_0         
	//   37   69:new             #65  <Class ArrayList>
	//   38   72:dup             
	//   39   73:invokespecial   #66  <Method void ArrayList()>
	//   40   76:putfield        #68  <Field List zzbpL>
	//   41   79:return          
	}

	PolylineOptions(List list, float f, int i, float f1, boolean flag, boolean flag1, boolean flag2, 
			Cap cap, Cap cap1, int j, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void zza()>
		zzbpp = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #39  <Float 10F>
	//    4    7:putfield        #41  <Field float zzbpp>
		mColor = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #42  <Int 0xff000000>
	//    7   13:putfield        #44  <Field int mColor>
		zzbpi = 0.0F;
	//    8   16:aload_0         
	//    9   17:fconst_0        
	//   10   18:putfield        #46  <Field float zzbpi>
		zzbpj = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #48  <Field boolean zzbpj>
		zzbpN = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #50  <Field boolean zzbpN>
		zzbpk = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #52  <Field boolean zzbpk>
		zzbpQ = ((Cap) (new ButtCap()));
	//   20   36:aload_0         
	//   21   37:new             #54  <Class ButtCap>
	//   22   40:dup             
	//   23   41:invokespecial   #55  <Method void ButtCap()>
	//   24   44:putfield        #57  <Field Cap zzbpQ>
		zzbpR = ((Cap) (new ButtCap()));
	//   25   47:aload_0         
	//   26   48:new             #54  <Class ButtCap>
	//   27   51:dup             
	//   28   52:invokespecial   #55  <Method void ButtCap()>
	//   29   55:putfield        #59  <Field Cap zzbpR>
		zzbpS = 0;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #61  <Field int zzbpS>
		zzbpT = null;
	//   33   63:aload_0         
	//   34   64:aconst_null     
	//   35   65:putfield        #63  <Field List zzbpT>
		zzbpL = list;
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:putfield        #68  <Field List zzbpL>
		zzbpp = f;
	//   39   73:aload_0         
	//   40   74:fload_2         
	//   41   75:putfield        #41  <Field float zzbpp>
		mColor = i;
	//   42   78:aload_0         
	//   43   79:iload_3         
	//   44   80:putfield        #44  <Field int mColor>
		zzbpi = f1;
	//   45   83:aload_0         
	//   46   84:fload           4
	//   47   86:putfield        #46  <Field float zzbpi>
		zzbpj = flag;
	//   48   89:aload_0         
	//   49   90:iload           5
	//   50   92:putfield        #48  <Field boolean zzbpj>
		zzbpN = flag1;
	//   51   95:aload_0         
	//   52   96:iload           6
	//   53   98:putfield        #50  <Field boolean zzbpN>
		zzbpk = flag2;
	//   54  101:aload_0         
	//   55  102:iload           7
	//   56  104:putfield        #52  <Field boolean zzbpk>
		if(cap != null)
	//*  57  107:aload           8
	//*  58  109:ifnull          118
			zzbpQ = cap;
	//   59  112:aload_0         
	//   60  113:aload           8
	//   61  115:putfield        #57  <Field Cap zzbpQ>
		if(cap1 != null)
	//*  62  118:aload           9
	//*  63  120:ifnull          129
			zzbpR = cap1;
	//   64  123:aload_0         
	//   65  124:aload           9
	//   66  126:putfield        #59  <Field Cap zzbpR>
		zzbpS = j;
	//   67  129:aload_0         
	//   68  130:iload           10
	//   69  132:putfield        #61  <Field int zzbpS>
		zzbpT = list1;
	//   70  135:aload_0         
	//   71  136:aload           11
	//   72  138:putfield        #63  <Field List zzbpT>
	//   73  141:return          
	}

	public PolylineOptions add(LatLng latlng)
	{
		zzbpL.add(((Object) (latlng)));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field List zzbpL>
	//    2    4:aload_1         
	//    3    5:invokeinterface #79  <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public transient PolylineOptions add(LatLng alatlng[])
	{
		zzbpL.addAll(((java.util.Collection) (Arrays.asList(((Object []) (alatlng))))));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field List zzbpL>
	//    2    4:aload_1         
	//    3    5:invokestatic    #86  <Method List Arrays.asList(Object[])>
	//    4    8:invokeinterface #90  <Method boolean List.addAll(java.util.Collection)>
	//    5   13:pop             
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public PolylineOptions addAll(Iterable iterable)
	{
		LatLng latlng;
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); zzbpL.add(((Object) (latlng))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #97  <Method Iterator Iterable.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #103 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            40
			latlng = (LatLng)((Iterator) (iterable)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #107 <Method Object Iterator.next()>
	//    8   22:checkcast       #109 <Class LatLng>
	//    9   25:astore_2        

	//   10   26:aload_0         
	//   11   27:getfield        #68  <Field List zzbpL>
	//   12   30:aload_2         
	//   13   31:invokeinterface #79  <Method boolean List.add(Object)>
	//   14   36:pop             
	//*  15   37:goto            7
		return this;
	//   16   40:aload_0         
	//   17   41:areturn         
	}

	public PolylineOptions clickable(boolean flag)
	{
		zzbpk = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean zzbpk>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolylineOptions color(int i)
	{
		mColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field int mColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolylineOptions endCap(Cap cap)
	{
		zzbpR = (Cap)zzac.zzb(((Object) (cap)), "endCap must not be null");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #118 <String "endCap must not be null">
	//    3    4:invokestatic    #124 <Method Object zzac.zzb(Object, Object)>
	//    4    7:checkcast       #126 <Class Cap>
	//    5   10:putfield        #59  <Field Cap zzbpR>
		return this;
	//    6   13:aload_0         
	//    7   14:areturn         
	}

	public PolylineOptions geodesic(boolean flag)
	{
		zzbpN = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean zzbpN>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public int getColor()
	{
		return mColor;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mColor>
	//    2    4:ireturn         
	}

	public Cap getEndCap()
	{
		return zzbpR;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Cap zzbpR>
	//    2    4:areturn         
	}

	public int getJointType()
	{
		return zzbpS;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int zzbpS>
	//    2    4:ireturn         
	}

	public List getPattern()
	{
		return zzbpT;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field List zzbpT>
	//    2    4:areturn         
	}

	public List getPoints()
	{
		return zzbpL;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field List zzbpL>
	//    2    4:areturn         
	}

	public Cap getStartCap()
	{
		return zzbpQ;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Cap zzbpQ>
	//    2    4:areturn         
	}

	public float getWidth()
	{
		return zzbpp;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float zzbpp>
	//    2    4:freturn         
	}

	public float getZIndex()
	{
		return zzbpi;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field float zzbpi>
	//    2    4:freturn         
	}

	public boolean isClickable()
	{
		return zzbpk;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean zzbpk>
	//    2    4:ireturn         
	}

	public boolean isGeodesic()
	{
		return zzbpN;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean zzbpN>
	//    2    4:ireturn         
	}

	public boolean isVisible()
	{
		return zzbpj;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean zzbpj>
	//    2    4:ireturn         
	}

	public PolylineOptions jointType(int i)
	{
		zzbpS = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field int zzbpS>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolylineOptions pattern(List list)
	{
		zzbpT = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field List zzbpT>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolylineOptions startCap(Cap cap)
	{
		zzbpQ = (Cap)zzac.zzb(((Object) (cap)), "startCap must not be null");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #152 <String "startCap must not be null">
	//    3    4:invokestatic    #124 <Method Object zzac.zzb(Object, Object)>
	//    4    7:checkcast       #126 <Class Cap>
	//    5   10:putfield        #57  <Field Cap zzbpQ>
		return this;
	//    6   13:aload_0         
	//    7   14:areturn         
	}

	public PolylineOptions visible(boolean flag)
	{
		zzbpj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field boolean zzbpj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolylineOptions width(float f)
	{
		zzbpp = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #41  <Field float zzbpp>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzl.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #161 <Method void com.google.android.gms.maps.model.zzl.zza(PolylineOptions, Parcel, int)>
	//    4    6:return          
	}

	public PolylineOptions zIndex(float f)
	{
		zzbpi = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #46  <Field float zzbpi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzl();
	private int mColor;
	private final List zzbpL;
	private boolean zzbpN;
	private Cap zzbpQ;
	private Cap zzbpR;
	private int zzbpS;
	private List zzbpT;
	private float zzbpi;
	private boolean zzbpj;
	private boolean zzbpk;
	private float zzbpp;

	static 
	{
	//    0    0:new             #31  <Class zzl>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void zzl()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
