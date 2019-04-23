// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzl, ButtCap, LatLng, Cap

public final class PolylineOptions extends AbstractSafeParcelable
{

	public PolylineOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void AbstractSafeParcelable()>
		width = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #70  <Float 10F>
	//    4    7:putfield        #72  <Field float width>
		color = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #73  <Int 0xff000000>
	//    7   13:putfield        #75  <Field int color>
		zzcr = 0.0F;
	//    8   16:aload_0         
	//    9   17:fconst_0        
	//   10   18:putfield        #77  <Field float zzcr>
		zzcs = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #79  <Field boolean zzcs>
		zzdy = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #81  <Field boolean zzdy>
		zzct = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #83  <Field boolean zzct>
		zzeb = ((Cap) (new ButtCap()));
	//   20   36:aload_0         
	//   21   37:new             #85  <Class ButtCap>
	//   22   40:dup             
	//   23   41:invokespecial   #86  <Method void ButtCap()>
	//   24   44:putfield        #88  <Field Cap zzeb>
		zzec = ((Cap) (new ButtCap()));
	//   25   47:aload_0         
	//   26   48:new             #85  <Class ButtCap>
	//   27   51:dup             
	//   28   52:invokespecial   #86  <Method void ButtCap()>
	//   29   55:putfield        #90  <Field Cap zzec>
		zzed = 0;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #92  <Field int zzed>
		zzee = null;
	//   33   63:aload_0         
	//   34   64:aconst_null     
	//   35   65:putfield        #94  <Field List zzee>
		zzdw = ((List) (new ArrayList()));
	//   36   68:aload_0         
	//   37   69:new             #96  <Class ArrayList>
	//   38   72:dup             
	//   39   73:invokespecial   #97  <Method void ArrayList()>
	//   40   76:putfield        #99  <Field List zzdw>
	//   41   79:return          
	}

	PolylineOptions(List list, float f, int i, float f1, boolean flag, boolean flag1, boolean flag2, 
			Cap cap, Cap cap1, int j, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void AbstractSafeParcelable()>
		width = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #70  <Float 10F>
	//    4    7:putfield        #72  <Field float width>
		color = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #73  <Int 0xff000000>
	//    7   13:putfield        #75  <Field int color>
		zzcr = 0.0F;
	//    8   16:aload_0         
	//    9   17:fconst_0        
	//   10   18:putfield        #77  <Field float zzcr>
		zzcs = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #79  <Field boolean zzcs>
		zzdy = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #81  <Field boolean zzdy>
		zzct = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #83  <Field boolean zzct>
		zzeb = ((Cap) (new ButtCap()));
	//   20   36:aload_0         
	//   21   37:new             #85  <Class ButtCap>
	//   22   40:dup             
	//   23   41:invokespecial   #86  <Method void ButtCap()>
	//   24   44:putfield        #88  <Field Cap zzeb>
		zzec = ((Cap) (new ButtCap()));
	//   25   47:aload_0         
	//   26   48:new             #85  <Class ButtCap>
	//   27   51:dup             
	//   28   52:invokespecial   #86  <Method void ButtCap()>
	//   29   55:putfield        #90  <Field Cap zzec>
		zzed = 0;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #92  <Field int zzed>
		zzee = null;
	//   33   63:aload_0         
	//   34   64:aconst_null     
	//   35   65:putfield        #94  <Field List zzee>
		zzdw = list;
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:putfield        #99  <Field List zzdw>
		width = f;
	//   39   73:aload_0         
	//   40   74:fload_2         
	//   41   75:putfield        #72  <Field float width>
		color = i;
	//   42   78:aload_0         
	//   43   79:iload_3         
	//   44   80:putfield        #75  <Field int color>
		zzcr = f1;
	//   45   83:aload_0         
	//   46   84:fload           4
	//   47   86:putfield        #77  <Field float zzcr>
		zzcs = flag;
	//   48   89:aload_0         
	//   49   90:iload           5
	//   50   92:putfield        #79  <Field boolean zzcs>
		zzdy = flag1;
	//   51   95:aload_0         
	//   52   96:iload           6
	//   53   98:putfield        #81  <Field boolean zzdy>
		zzct = flag2;
	//   54  101:aload_0         
	//   55  102:iload           7
	//   56  104:putfield        #83  <Field boolean zzct>
		if(cap != null)
	//*  57  107:aload           8
	//*  58  109:ifnull          118
			zzeb = cap;
	//   59  112:aload_0         
	//   60  113:aload           8
	//   61  115:putfield        #88  <Field Cap zzeb>
		if(cap1 != null)
	//*  62  118:aload           9
	//*  63  120:ifnull          129
			zzec = cap1;
	//   64  123:aload_0         
	//   65  124:aload           9
	//   66  126:putfield        #90  <Field Cap zzec>
		zzed = j;
	//   67  129:aload_0         
	//   68  130:iload           10
	//   69  132:putfield        #92  <Field int zzed>
		zzee = list1;
	//   70  135:aload_0         
	//   71  136:aload           11
	//   72  138:putfield        #94  <Field List zzee>
	//   73  141:return          
	}

	public final PolylineOptions add(LatLng latlng)
	{
		zzdw.add(((Object) (latlng)));
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field List zzdw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #113 <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public final transient PolylineOptions add(LatLng alatlng[])
	{
		zzdw.addAll(((java.util.Collection) (Arrays.asList(((Object []) (alatlng))))));
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field List zzdw>
	//    2    4:aload_1         
	//    3    5:invokestatic    #120 <Method List Arrays.asList(Object[])>
	//    4    8:invokeinterface #124 <Method boolean List.addAll(java.util.Collection)>
	//    5   13:pop             
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public final PolylineOptions addAll(Iterable iterable)
	{
		LatLng latlng;
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); zzdw.add(((Object) (latlng))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #131 <Method Iterator Iterable.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            40
			latlng = (LatLng)((Iterator) (iterable)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #141 <Method Object Iterator.next()>
	//    8   22:checkcast       #143 <Class LatLng>
	//    9   25:astore_2        

	//   10   26:aload_0         
	//   11   27:getfield        #99  <Field List zzdw>
	//   12   30:aload_2         
	//   13   31:invokeinterface #113 <Method boolean List.add(Object)>
	//   14   36:pop             
	//*  15   37:goto            7
		return this;
	//   16   40:aload_0         
	//   17   41:areturn         
	}

	public final PolylineOptions clickable(boolean flag)
	{
		zzct = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #83  <Field boolean zzct>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolylineOptions color(int i)
	{
		color = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field int color>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolylineOptions endCap(Cap cap)
	{
		zzec = (Cap)Preconditions.checkNotNull(((Object) (cap)), "endCap must not be null");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #151 <String "endCap must not be null">
	//    3    4:invokestatic    #157 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    7:checkcast       #159 <Class Cap>
	//    5   10:putfield        #90  <Field Cap zzec>
		return this;
	//    6   13:aload_0         
	//    7   14:areturn         
	}

	public final PolylineOptions geodesic(boolean flag)
	{
		zzdy = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field boolean zzdy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final int getColor()
	{
		return color;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int color>
	//    2    4:ireturn         
	}

	public final Cap getEndCap()
	{
		return zzec;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Cap zzec>
	//    2    4:areturn         
	}

	public final int getJointType()
	{
		return zzed;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field int zzed>
	//    2    4:ireturn         
	}

	public final List getPattern()
	{
		return zzee;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field List zzee>
	//    2    4:areturn         
	}

	public final List getPoints()
	{
		return zzdw;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field List zzdw>
	//    2    4:areturn         
	}

	public final Cap getStartCap()
	{
		return zzeb;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Cap zzeb>
	//    2    4:areturn         
	}

	public final float getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field float width>
	//    2    4:freturn         
	}

	public final float getZIndex()
	{
		return zzcr;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field float zzcr>
	//    2    4:freturn         
	}

	public final boolean isClickable()
	{
		return zzct;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean zzct>
	//    2    4:ireturn         
	}

	public final boolean isGeodesic()
	{
		return zzdy;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field boolean zzdy>
	//    2    4:ireturn         
	}

	public final boolean isVisible()
	{
		return zzcs;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field boolean zzcs>
	//    2    4:ireturn         
	}

	public final PolylineOptions jointType(int i)
	{
		zzed = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #92  <Field int zzed>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolylineOptions pattern(List list)
	{
		zzee = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field List zzee>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolylineOptions startCap(Cap cap)
	{
		zzeb = (Cap)Preconditions.checkNotNull(((Object) (cap)), "startCap must not be null");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #173 <String "startCap must not be null">
	//    3    4:invokestatic    #157 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    7:checkcast       #159 <Class Cap>
	//    5   10:putfield        #88  <Field Cap zzeb>
		return this;
	//    6   13:aload_0         
	//    7   14:areturn         
	}

	public final PolylineOptions visible(boolean flag)
	{
		zzcs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field boolean zzcs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolylineOptions width(float f)
	{
		width = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #72  <Field float width>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #183 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #185 <Method List getPoints()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #189 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeFloat(parcel, 3, getWidth());
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #191 <Method float getWidth()>
	//   13   21:invokestatic    #195 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeInt(parcel, 4, getColor());
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #197 <Method int getColor()>
	//   18   30:invokestatic    #201 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:invokevirtual   #203 <Method float getZIndex()>
	//   23   39:invokestatic    #195 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:invokevirtual   #205 <Method boolean isVisible()>
	//   28   49:invokestatic    #209 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
	//   29   52:aload_1         
	//   30   53:bipush          7
	//   31   55:aload_0         
	//   32   56:invokevirtual   #211 <Method boolean isGeodesic()>
	//   33   59:invokestatic    #209 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
	//   34   62:aload_1         
	//   35   63:bipush          8
	//   36   65:aload_0         
	//   37   66:invokevirtual   #213 <Method boolean isClickable()>
	//   38   69:invokestatic    #209 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 9, ((android.os.Parcelable) (getStartCap())), i, false);
	//   39   72:aload_1         
	//   40   73:bipush          9
	//   41   75:aload_0         
	//   42   76:invokevirtual   #215 <Method Cap getStartCap()>
	//   43   79:iload_2         
	//   44   80:iconst_0        
	//   45   81:invokestatic    #219 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 10, ((android.os.Parcelable) (getEndCap())), i, false);
	//   46   84:aload_1         
	//   47   85:bipush          10
	//   48   87:aload_0         
	//   49   88:invokevirtual   #221 <Method Cap getEndCap()>
	//   50   91:iload_2         
	//   51   92:iconst_0        
	//   52   93:invokestatic    #219 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 11, getJointType());
	//   53   96:aload_1         
	//   54   97:bipush          11
	//   55   99:aload_0         
	//   56  100:invokevirtual   #223 <Method int getJointType()>
	//   57  103:invokestatic    #201 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
	//   58  106:aload_1         
	//   59  107:bipush          12
	//   60  109:aload_0         
	//   61  110:invokevirtual   #225 <Method List getPattern()>
	//   62  113:iconst_0        
	//   63  114:invokestatic    #189 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   64  117:aload_1         
	//   65  118:iload_3         
	//   66  119:invokestatic    #228 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   67  122:return          
	}

	public final PolylineOptions zIndex(float f)
	{
		zzcr = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #77  <Field float zzcr>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzl();
	private int color;
	private float width;
	private float zzcr;
	private boolean zzcs;
	private boolean zzct;
	private final List zzdw;
	private boolean zzdy;
	private Cap zzeb;
	private Cap zzec;
	private int zzed;
	private List zzee;

	static 
	{
	//    0    0:new             #62  <Class zzl>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void zzl()>
	//    3    7:putstatic       #67  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
