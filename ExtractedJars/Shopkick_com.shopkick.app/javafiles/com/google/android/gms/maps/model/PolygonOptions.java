// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzk, LatLng

public final class PolygonOptions extends AbstractSafeParcelable
{

	public PolygonOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void AbstractSafeParcelable()>
		zzcq = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #71  <Float 10F>
	//    4    7:putfield        #73  <Field float zzcq>
		strokeColor = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #74  <Int 0xff000000>
	//    7   13:putfield        #76  <Field int strokeColor>
		fillColor = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #78  <Field int fillColor>
		zzcr = 0.0F;
	//   11   21:aload_0         
	//   12   22:fconst_0        
	//   13   23:putfield        #80  <Field float zzcr>
		zzcs = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #82  <Field boolean zzcs>
		zzdy = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #84  <Field boolean zzdy>
		zzct = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #86  <Field boolean zzct>
		zzdz = 0;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #88  <Field int zzdz>
		zzcu = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #90  <Field List zzcu>
		zzdw = ((List) (new ArrayList()));
	//   29   51:aload_0         
	//   30   52:new             #92  <Class ArrayList>
	//   31   55:dup             
	//   32   56:invokespecial   #93  <Method void ArrayList()>
	//   33   59:putfield        #95  <Field List zzdw>
		zzdx = ((List) (new ArrayList()));
	//   34   62:aload_0         
	//   35   63:new             #92  <Class ArrayList>
	//   36   66:dup             
	//   37   67:invokespecial   #93  <Method void ArrayList()>
	//   38   70:putfield        #97  <Field List zzdx>
	//   39   73:return          
	}

	PolygonOptions(List list, List list1, float f, int i, int j, float f1, boolean flag, 
			boolean flag1, boolean flag2, int k, List list2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void AbstractSafeParcelable()>
		zzcq = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #71  <Float 10F>
	//    4    7:putfield        #73  <Field float zzcq>
		strokeColor = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #74  <Int 0xff000000>
	//    7   13:putfield        #76  <Field int strokeColor>
		fillColor = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #78  <Field int fillColor>
		zzcr = 0.0F;
	//   11   21:aload_0         
	//   12   22:fconst_0        
	//   13   23:putfield        #80  <Field float zzcr>
		zzcs = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #82  <Field boolean zzcs>
		zzdy = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #84  <Field boolean zzdy>
		zzct = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #86  <Field boolean zzct>
		zzdz = 0;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #88  <Field int zzdz>
		zzcu = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #90  <Field List zzcu>
		zzdw = list;
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:putfield        #95  <Field List zzdw>
		zzdx = list1;
	//   32   56:aload_0         
	//   33   57:aload_2         
	//   34   58:putfield        #97  <Field List zzdx>
		zzcq = f;
	//   35   61:aload_0         
	//   36   62:fload_3         
	//   37   63:putfield        #73  <Field float zzcq>
		strokeColor = i;
	//   38   66:aload_0         
	//   39   67:iload           4
	//   40   69:putfield        #76  <Field int strokeColor>
		fillColor = j;
	//   41   72:aload_0         
	//   42   73:iload           5
	//   43   75:putfield        #78  <Field int fillColor>
		zzcr = f1;
	//   44   78:aload_0         
	//   45   79:fload           6
	//   46   81:putfield        #80  <Field float zzcr>
		zzcs = flag;
	//   47   84:aload_0         
	//   48   85:iload           7
	//   49   87:putfield        #82  <Field boolean zzcs>
		zzdy = flag1;
	//   50   90:aload_0         
	//   51   91:iload           8
	//   52   93:putfield        #84  <Field boolean zzdy>
		zzct = flag2;
	//   53   96:aload_0         
	//   54   97:iload           9
	//   55   99:putfield        #86  <Field boolean zzct>
		zzdz = k;
	//   56  102:aload_0         
	//   57  103:iload           10
	//   58  105:putfield        #88  <Field int zzdz>
		zzcu = list2;
	//   59  108:aload_0         
	//   60  109:aload           11
	//   61  111:putfield        #90  <Field List zzcu>
	//   62  114:return          
	}

	public final PolygonOptions add(LatLng latlng)
	{
		zzdw.add(((Object) (latlng)));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field List zzdw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #111 <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public final transient PolygonOptions add(LatLng alatlng[])
	{
		zzdw.addAll(((java.util.Collection) (Arrays.asList(((Object []) (alatlng))))));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field List zzdw>
	//    2    4:aload_1         
	//    3    5:invokestatic    #118 <Method List Arrays.asList(Object[])>
	//    4    8:invokeinterface #122 <Method boolean List.addAll(java.util.Collection)>
	//    5   13:pop             
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public final PolygonOptions addAll(Iterable iterable)
	{
		LatLng latlng;
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); zzdw.add(((Object) (latlng))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #129 <Method Iterator Iterable.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            40
			latlng = (LatLng)((Iterator) (iterable)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #139 <Method Object Iterator.next()>
	//    8   22:checkcast       #141 <Class LatLng>
	//    9   25:astore_2        

	//   10   26:aload_0         
	//   11   27:getfield        #95  <Field List zzdw>
	//   12   30:aload_2         
	//   13   31:invokeinterface #111 <Method boolean List.add(Object)>
	//   14   36:pop             
	//*  15   37:goto            7
		return this;
	//   16   40:aload_0         
	//   17   41:areturn         
	}

	public final PolygonOptions addHole(Iterable iterable)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #92  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void ArrayList()>
	//    3    7:astore_2        
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); arraylist.add(((Object) ((LatLng)((Iterator) (iterable)).next()))));
	//    4    8:aload_1         
	//    5    9:invokeinterface #129 <Method Iterator Iterable.iterator()>
	//    6   14:astore_1        
	//    7   15:aload_1         
	//    8   16:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            41
	//   10   24:aload_2         
	//   11   25:aload_1         
	//   12   26:invokeinterface #139 <Method Object Iterator.next()>
	//   13   31:checkcast       #141 <Class LatLng>
	//   14   34:invokevirtual   #144 <Method boolean ArrayList.add(Object)>
	//   15   37:pop             
	//*  16   38:goto            15
		zzdx.add(((Object) (arraylist)));
	//   17   41:aload_0         
	//   18   42:getfield        #97  <Field List zzdx>
	//   19   45:aload_2         
	//   20   46:invokeinterface #111 <Method boolean List.add(Object)>
	//   21   51:pop             
		return this;
	//   22   52:aload_0         
	//   23   53:areturn         
	}

	public final PolygonOptions clickable(boolean flag)
	{
		zzct = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field boolean zzct>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolygonOptions fillColor(int i)
	{
		fillColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field int fillColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolygonOptions geodesic(boolean flag)
	{
		zzdy = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field boolean zzdy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final int getFillColor()
	{
		return fillColor;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int fillColor>
	//    2    4:ireturn         
	}

	public final List getHoles()
	{
		return zzdx;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field List zzdx>
	//    2    4:areturn         
	}

	public final List getPoints()
	{
		return zzdw;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field List zzdw>
	//    2    4:areturn         
	}

	public final int getStrokeColor()
	{
		return strokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int strokeColor>
	//    2    4:ireturn         
	}

	public final int getStrokeJointType()
	{
		return zzdz;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int zzdz>
	//    2    4:ireturn         
	}

	public final List getStrokePattern()
	{
		return zzcu;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field List zzcu>
	//    2    4:areturn         
	}

	public final float getStrokeWidth()
	{
		return zzcq;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field float zzcq>
	//    2    4:freturn         
	}

	public final float getZIndex()
	{
		return zzcr;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field float zzcr>
	//    2    4:freturn         
	}

	public final boolean isClickable()
	{
		return zzct;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean zzct>
	//    2    4:ireturn         
	}

	public final boolean isGeodesic()
	{
		return zzdy;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean zzdy>
	//    2    4:ireturn         
	}

	public final boolean isVisible()
	{
		return zzcs;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field boolean zzcs>
	//    2    4:ireturn         
	}

	public final PolygonOptions strokeColor(int i)
	{
		strokeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #76  <Field int strokeColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolygonOptions strokeJointType(int i)
	{
		zzdz = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field int zzdz>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolygonOptions strokePattern(List list)
	{
		zzcu = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field List zzcu>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolygonOptions strokeWidth(float f)
	{
		zzcq = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #73  <Field float zzcq>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PolygonOptions visible(boolean flag)
	{
		zzcs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field boolean zzcs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #170 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #172 <Method List getPoints()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #176 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeList(parcel, 3, zzdx, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #97  <Field List zzdx>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #179 <Method void SafeParcelWriter.writeList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #181 <Method float getStrokeWidth()>
	//   19   31:invokestatic    #185 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #187 <Method int getStrokeColor()>
	//   24   40:invokestatic    #191 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 6, getFillColor());
	//   25   43:aload_1         
	//   26   44:bipush          6
	//   27   46:aload_0         
	//   28   47:invokevirtual   #193 <Method int getFillColor()>
	//   29   50:invokestatic    #191 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
	//   30   53:aload_1         
	//   31   54:bipush          7
	//   32   56:aload_0         
	//   33   57:invokevirtual   #195 <Method float getZIndex()>
	//   34   60:invokestatic    #185 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
	//   35   63:aload_1         
	//   36   64:bipush          8
	//   37   66:aload_0         
	//   38   67:invokevirtual   #197 <Method boolean isVisible()>
	//   39   70:invokestatic    #201 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 9, isGeodesic());
	//   40   73:aload_1         
	//   41   74:bipush          9
	//   42   76:aload_0         
	//   43   77:invokevirtual   #203 <Method boolean isGeodesic()>
	//   44   80:invokestatic    #201 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 10, isClickable());
	//   45   83:aload_1         
	//   46   84:bipush          10
	//   47   86:aload_0         
	//   48   87:invokevirtual   #205 <Method boolean isClickable()>
	//   49   90:invokestatic    #201 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 11, getStrokeJointType());
	//   50   93:aload_1         
	//   51   94:bipush          11
	//   52   96:aload_0         
	//   53   97:invokevirtual   #207 <Method int getStrokeJointType()>
	//   54  100:invokestatic    #191 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeTypedList(parcel, 12, getStrokePattern(), false);
	//   55  103:aload_1         
	//   56  104:bipush          12
	//   57  106:aload_0         
	//   58  107:invokevirtual   #209 <Method List getStrokePattern()>
	//   59  110:iconst_0        
	//   60  111:invokestatic    #176 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   61  114:aload_1         
	//   62  115:iload_2         
	//   63  116:invokestatic    #212 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   64  119:return          
	}

	public final PolygonOptions zIndex(float f)
	{
		zzcr = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #80  <Field float zzcr>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzk();
	private int fillColor;
	private int strokeColor;
	private float zzcq;
	private float zzcr;
	private boolean zzcs;
	private boolean zzct;
	private List zzcu;
	private final List zzdw;
	private final List zzdx;
	private boolean zzdy;
	private int zzdz;

	static 
	{
	//    0    0:new             #63  <Class zzk>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void zzk()>
	//    3    7:putstatic       #68  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
