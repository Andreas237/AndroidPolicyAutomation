// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			ArcOptions, LatLng

public class ArcOptionsCreator
	implements android.os.Parcelable.Creator
{

	public ArcOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public ArcOptions createFromParcel(Parcel parcel)
	{
		ArcOptions arcoptions = new ArcOptions();
	//    0    0:new             #16  <Class ArcOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ArcOptions()>
	//    3    7:astore_3        
		Bundle bundle = parcel.readBundle();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #23  <Method Bundle Parcel.readBundle()>
	//    6   12:astore          4
		arcoptions.point(new LatLng(bundle.getDouble("startlat"), bundle.getDouble("startlng")), new LatLng(bundle.getDouble("passedlat"), bundle.getDouble("passedlng")), new LatLng(bundle.getDouble("endlat"), bundle.getDouble("endlng")));
	//    7   14:aload_3         
	//    8   15:new             #25  <Class LatLng>
	//    9   18:dup             
	//   10   19:aload           4
	//   11   21:ldc1            #27  <String "startlat">
	//   12   23:invokevirtual   #33  <Method double Bundle.getDouble(String)>
	//   13   26:aload           4
	//   14   28:ldc1            #35  <String "startlng">
	//   15   30:invokevirtual   #33  <Method double Bundle.getDouble(String)>
	//   16   33:invokespecial   #38  <Method void LatLng(double, double)>
	//   17   36:new             #25  <Class LatLng>
	//   18   39:dup             
	//   19   40:aload           4
	//   20   42:ldc1            #40  <String "passedlat">
	//   21   44:invokevirtual   #33  <Method double Bundle.getDouble(String)>
	//   22   47:aload           4
	//   23   49:ldc1            #42  <String "passedlng">
	//   24   51:invokevirtual   #33  <Method double Bundle.getDouble(String)>
	//   25   54:invokespecial   #38  <Method void LatLng(double, double)>
	//   26   57:new             #25  <Class LatLng>
	//   27   60:dup             
	//   28   61:aload           4
	//   29   63:ldc1            #44  <String "endlat">
	//   30   65:invokevirtual   #33  <Method double Bundle.getDouble(String)>
	//   31   68:aload           4
	//   32   70:ldc1            #46  <String "endlng">
	//   33   72:invokevirtual   #33  <Method double Bundle.getDouble(String)>
	//   34   75:invokespecial   #38  <Method void LatLng(double, double)>
	//   35   78:invokevirtual   #50  <Method ArcOptions ArcOptions.point(LatLng, LatLng, LatLng)>
	//   36   81:pop             
		arcoptions.strokeWidth(parcel.readFloat());
	//   37   82:aload_3         
	//   38   83:aload_1         
	//   39   84:invokevirtual   #54  <Method float Parcel.readFloat()>
	//   40   87:invokevirtual   #58  <Method ArcOptions ArcOptions.strokeWidth(float)>
	//   41   90:pop             
		arcoptions.strokeColor(parcel.readInt());
	//   42   91:aload_3         
	//   43   92:aload_1         
	//   44   93:invokevirtual   #62  <Method int Parcel.readInt()>
	//   45   96:invokevirtual   #66  <Method ArcOptions ArcOptions.strokeColor(int)>
	//   46   99:pop             
		arcoptions.zIndex(parcel.readFloat());
	//   47  100:aload_3         
	//   48  101:aload_1         
	//   49  102:invokevirtual   #54  <Method float Parcel.readFloat()>
	//   50  105:invokevirtual   #69  <Method ArcOptions ArcOptions.zIndex(float)>
	//   51  108:pop             
		boolean flag;
		if(parcel.readByte() == 1)
	//*  52  109:aload_1         
	//*  53  110:invokevirtual   #73  <Method byte Parcel.readByte()>
	//*  54  113:iconst_1        
	//*  55  114:icmpne          122
			flag = true;
	//   56  117:iconst_1        
	//   57  118:istore_2        
		else
	//*  58  119:goto            124
			flag = false;
	//   59  122:iconst_0        
	//   60  123:istore_2        
		arcoptions.visible(flag);
	//   61  124:aload_3         
	//   62  125:iload_2         
	//   63  126:invokevirtual   #77  <Method ArcOptions ArcOptions.visible(boolean)>
	//   64  129:pop             
		arcoptions.a = parcel.readString();
	//   65  130:aload_3         
	//   66  131:aload_1         
	//   67  132:invokevirtual   #81  <Method String Parcel.readString()>
	//   68  135:putfield        #85  <Field String ArcOptions.a>
		return arcoptions;
	//   69  138:aload_3         
	//   70  139:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #88  <Method ArcOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ArcOptions[] newArray(int i)
	{
		return new ArcOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ArcOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #93  <Method ArcOptions[] newArray(int)>
	//    3    5:areturn         
	}
}
