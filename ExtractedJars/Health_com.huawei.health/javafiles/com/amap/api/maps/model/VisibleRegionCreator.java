// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.BadParcelableException;
import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			VisibleRegion, LatLng, LatLngBounds

public class VisibleRegionCreator
	implements android.os.Parcelable.Creator
{

	public VisibleRegionCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	static void a(VisibleRegion visibleregion, Parcel parcel, int i)
	{
		parcel.writeInt(visibleregion.a());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #22  <Method int VisibleRegion.a()>
	//    3    5:invokevirtual   #28  <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(((android.os.Parcelable) (visibleregion.nearLeft)), i);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field LatLng VisibleRegion.nearLeft>
	//    7   13:iload_2         
	//    8   14:invokevirtual   #36  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (visibleregion.nearRight)), i);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field LatLng VisibleRegion.nearRight>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #36  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (visibleregion.farLeft)), i);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #42  <Field LatLng VisibleRegion.farLeft>
	//   17   31:iload_2         
	//   18   32:invokevirtual   #36  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (visibleregion.farRight)), i);
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #45  <Field LatLng VisibleRegion.farRight>
	//   22   40:iload_2         
	//   23   41:invokevirtual   #36  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (visibleregion.latLngBounds)), i);
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:getfield        #49  <Field LatLngBounds VisibleRegion.latLngBounds>
	//   27   49:iload_2         
	//   28   50:invokevirtual   #36  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//   29   53:return          
	}

	public VisibleRegion createFromParcel(Parcel parcel)
	{
		int i;
		LatLng latlng;
		LatLng latlng1;
		LatLng latlng2;
		LatLng latlng3;
		LatLng latlng5;
		LatLng latlng6;
		LatLng latlng7;
		Object obj;
		latlng = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		latlng5 = null;
	//    2    2:aconst_null     
	//    3    3:astore          8
		latlng6 = null;
	//    4    5:aconst_null     
	//    5    6:astore          9
		latlng7 = null;
	//    6    8:aconst_null     
	//    7    9:astore          10
		obj = null;
	//    8   11:aconst_null     
	//    9   12:astore          11
		i = parcel.readInt();
	//   10   14:aload_1         
	//   11   15:invokevirtual   #56  <Method int Parcel.readInt()>
	//   12   18:istore_2        
		latlng1 = latlng5;
	//   13   19:aload           8
	//   14   21:astore          4
		latlng2 = latlng6;
	//   15   23:aload           9
	//   16   25:astore          5
		latlng3 = latlng7;
	//   17   27:aload           10
	//   18   29:astore          6
		LatLng latlng4 = (LatLng)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLng)).getClassLoader());
	//   19   31:aload_1         
	//   20   32:ldc1            #58  <Class LatLng>
	//   21   34:invokevirtual   #64  <Method ClassLoader Class.getClassLoader()>
	//   22   37:invokevirtual   #68  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   23   40:checkcast       #58  <Class LatLng>
	//   24   43:astore          7
		latlng = latlng4;
	//   25   45:aload           7
	//   26   47:astore_3        
		latlng1 = latlng5;
	//   27   48:aload           8
	//   28   50:astore          4
		latlng2 = latlng6;
	//   29   52:aload           9
	//   30   54:astore          5
		latlng3 = latlng7;
	//   31   56:aload           10
	//   32   58:astore          6
		latlng5 = (LatLng)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLng)).getClassLoader());
	//   33   60:aload_1         
	//   34   61:ldc1            #58  <Class LatLng>
	//   35   63:invokevirtual   #64  <Method ClassLoader Class.getClassLoader()>
	//   36   66:invokevirtual   #68  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   37   69:checkcast       #58  <Class LatLng>
	//   38   72:astore          8
		latlng = latlng4;
	//   39   74:aload           7
	//   40   76:astore_3        
		latlng1 = latlng5;
	//   41   77:aload           8
	//   42   79:astore          4
		latlng2 = latlng6;
	//   43   81:aload           9
	//   44   83:astore          5
		latlng3 = latlng7;
	//   45   85:aload           10
	//   46   87:astore          6
		latlng6 = (LatLng)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLng)).getClassLoader());
	//   47   89:aload_1         
	//   48   90:ldc1            #58  <Class LatLng>
	//   49   92:invokevirtual   #64  <Method ClassLoader Class.getClassLoader()>
	//   50   95:invokevirtual   #68  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   51   98:checkcast       #58  <Class LatLng>
	//   52  101:astore          9
		latlng = latlng4;
	//   53  103:aload           7
	//   54  105:astore_3        
		latlng1 = latlng5;
	//   55  106:aload           8
	//   56  108:astore          4
		latlng2 = latlng6;
	//   57  110:aload           9
	//   58  112:astore          5
		latlng3 = latlng7;
	//   59  114:aload           10
	//   60  116:astore          6
		latlng7 = (LatLng)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLng)).getClassLoader());
	//   61  118:aload_1         
	//   62  119:ldc1            #58  <Class LatLng>
	//   63  121:invokevirtual   #64  <Method ClassLoader Class.getClassLoader()>
	//   64  124:invokevirtual   #68  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   65  127:checkcast       #58  <Class LatLng>
	//   66  130:astore          10
		latlng = latlng4;
	//   67  132:aload           7
	//   68  134:astore_3        
		latlng1 = latlng5;
	//   69  135:aload           8
	//   70  137:astore          4
		latlng2 = latlng6;
	//   71  139:aload           9
	//   72  141:astore          5
		latlng3 = latlng7;
	//   73  143:aload           10
	//   74  145:astore          6
		parcel = ((Parcel) ((LatLngBounds)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLngBounds)).getClassLoader())));
	//   75  147:aload_1         
	//   76  148:ldc1            #70  <Class LatLngBounds>
	//   77  150:invokevirtual   #64  <Method ClassLoader Class.getClassLoader()>
	//   78  153:invokevirtual   #68  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   79  156:checkcast       #70  <Class LatLngBounds>
	//   80  159:astore_1        
		latlng = latlng4;
	//   81  160:aload           7
	//   82  162:astore_3        
		latlng1 = latlng5;
	//   83  163:aload           8
	//   84  165:astore          4
		latlng2 = latlng6;
	//   85  167:aload           9
	//   86  169:astore          5
		latlng3 = latlng7;
	//   87  171:aload           10
	//   88  173:astore          6
		break MISSING_BLOCK_LABEL_186;
	//   89  175:goto            186
		parcel;
	//   90  178:astore_1        
		((BadParcelableException) (parcel)).printStackTrace();
	//   91  179:aload_1         
	//   92  180:invokevirtual   #73  <Method void BadParcelableException.printStackTrace()>
		parcel = ((Parcel) (obj));
	//   93  183:aload           11
	//   94  185:astore_1        
		return new VisibleRegion(i, latlng, latlng1, latlng2, latlng3, ((LatLngBounds) (parcel)));
	//   95  186:new             #19  <Class VisibleRegion>
	//   96  189:dup             
	//   97  190:iload_2         
	//   98  191:aload_3         
	//   99  192:aload           4
	//  100  194:aload           5
	//  101  196:aload           6
	//  102  198:aload_1         
	//  103  199:invokespecial   #76  <Method void VisibleRegion(int, LatLng, LatLng, LatLng, LatLng, LatLngBounds)>
	//  104  202:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #79  <Method VisibleRegion createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public VisibleRegion[] newArray(int i)
	{
		return new VisibleRegion[i];
	//    0    0:iload_1         
	//    1    1:anewarray       VisibleRegion[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #84  <Method VisibleRegion[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
