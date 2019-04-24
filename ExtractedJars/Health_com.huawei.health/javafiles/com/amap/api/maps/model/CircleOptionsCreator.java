// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.amap.api.maps.model:
//			CircleOptions, LatLng, BaseHoleOptions

public class CircleOptionsCreator
	implements android.os.Parcelable.Creator
{

	public CircleOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public CircleOptions createFromParcel(Parcel parcel)
	{
		CircleOptions circleoptions = new CircleOptions();
	//    0    0:new             #16  <Class CircleOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void CircleOptions()>
	//    3    7:astore_3        
		Object obj = ((Object) (parcel.readBundle()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #23  <Method Bundle Parcel.readBundle()>
	//    6   12:astore          4
		circleoptions.center(new LatLng(((Bundle) (obj)).getDouble("lat"), ((Bundle) (obj)).getDouble("lng")));
	//    7   14:aload_3         
	//    8   15:new             #25  <Class LatLng>
	//    9   18:dup             
	//   10   19:aload           4
	//   11   21:ldc1            #27  <String "lat">
	//   12   23:invokevirtual   #33  <Method double Bundle.getDouble(String)>
	//   13   26:aload           4
	//   14   28:ldc1            #35  <String "lng">
	//   15   30:invokevirtual   #33  <Method double Bundle.getDouble(String)>
	//   16   33:invokespecial   #38  <Method void LatLng(double, double)>
	//   17   36:invokevirtual   #42  <Method CircleOptions CircleOptions.center(LatLng)>
	//   18   39:pop             
		circleoptions.radius(parcel.readDouble());
	//   19   40:aload_3         
	//   20   41:aload_1         
	//   21   42:invokevirtual   #46  <Method double Parcel.readDouble()>
	//   22   45:invokevirtual   #50  <Method CircleOptions CircleOptions.radius(double)>
	//   23   48:pop             
		circleoptions.strokeWidth(parcel.readFloat());
	//   24   49:aload_3         
	//   25   50:aload_1         
	//   26   51:invokevirtual   #54  <Method float Parcel.readFloat()>
	//   27   54:invokevirtual   #58  <Method CircleOptions CircleOptions.strokeWidth(float)>
	//   28   57:pop             
		circleoptions.strokeColor(parcel.readInt());
	//   29   58:aload_3         
	//   30   59:aload_1         
	//   31   60:invokevirtual   #62  <Method int Parcel.readInt()>
	//   32   63:invokevirtual   #66  <Method CircleOptions CircleOptions.strokeColor(int)>
	//   33   66:pop             
		circleoptions.fillColor(parcel.readInt());
	//   34   67:aload_3         
	//   35   68:aload_1         
	//   36   69:invokevirtual   #62  <Method int Parcel.readInt()>
	//   37   72:invokevirtual   #69  <Method CircleOptions CircleOptions.fillColor(int)>
	//   38   75:pop             
		circleoptions.zIndex(parcel.readFloat());
	//   39   76:aload_3         
	//   40   77:aload_1         
	//   41   78:invokevirtual   #54  <Method float Parcel.readFloat()>
	//   42   81:invokevirtual   #72  <Method CircleOptions CircleOptions.zIndex(float)>
	//   43   84:pop             
		boolean flag;
		if(parcel.readByte() == 1)
	//*  44   85:aload_1         
	//*  45   86:invokevirtual   #76  <Method byte Parcel.readByte()>
	//*  46   89:iconst_1        
	//*  47   90:icmpne          98
			flag = true;
	//   48   93:iconst_1        
	//   49   94:istore_2        
		else
	//*  50   95:goto            100
			flag = false;
	//   51   98:iconst_0        
	//   52   99:istore_2        
		circleoptions.visible(flag);
	//   53  100:aload_3         
	//   54  101:iload_2         
	//   55  102:invokevirtual   #80  <Method CircleOptions CircleOptions.visible(boolean)>
	//   56  105:pop             
		circleoptions.a = parcel.readString();
	//   57  106:aload_3         
	//   58  107:aload_1         
	//   59  108:invokevirtual   #84  <Method String Parcel.readString()>
	//   60  111:putfield        #88  <Field String CircleOptions.a>
		obj = ((Object) (new ArrayList()));
	//   61  114:new             #90  <Class ArrayList>
	//   62  117:dup             
	//   63  118:invokespecial   #91  <Method void ArrayList()>
	//   64  121:astore          4
		parcel.readList(((java.util.List) (obj)), ((Class) (com/amap/api/maps/model/BaseHoleOptions)).getClassLoader());
	//   65  123:aload_1         
	//   66  124:aload           4
	//   67  126:ldc1            #93  <Class BaseHoleOptions>
	//   68  128:invokevirtual   #99  <Method ClassLoader Class.getClassLoader()>
	//   69  131:invokevirtual   #103 <Method void Parcel.readList(java.util.List, ClassLoader)>
		circleoptions.addHoles(((Iterable) (obj)));
	//   70  134:aload_3         
	//   71  135:aload           4
	//   72  137:invokevirtual   #107 <Method CircleOptions CircleOptions.addHoles(Iterable)>
	//   73  140:pop             
		circleoptions.setStrokeDottedLineType(parcel.readInt());
	//   74  141:aload_3         
	//   75  142:aload_1         
	//   76  143:invokevirtual   #62  <Method int Parcel.readInt()>
	//   77  146:invokevirtual   #110 <Method CircleOptions CircleOptions.setStrokeDottedLineType(int)>
	//   78  149:pop             
		return circleoptions;
	//   79  150:aload_3         
	//   80  151:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method CircleOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public CircleOptions[] newArray(int i)
	{
		return new CircleOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       CircleOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #118 <Method CircleOptions[] newArray(int)>
	//    3    5:areturn         
	}
}
