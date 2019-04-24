// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.os.Parcel;
import com.amap.api.maps.model.CameraPosition;

// Referenced classes of package com.amap.api.maps:
//			AMapOptions

public class AMapOptionsCreator
	implements android.os.Parcelable.Creator
{

	public AMapOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public AMapOptions createFromParcel(Parcel parcel)
	{
		AMapOptions amapoptions = new AMapOptions();
	//    0    0:new             #16  <Class AMapOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void AMapOptions()>
	//    3    7:astore_2        
		CameraPosition cameraposition = (CameraPosition)parcel.readParcelable(((Class) (com/amap/api/maps/model/CameraPosition)).getClassLoader());
	//    4    8:aload_1         
	//    5    9:ldc1            #19  <Class CameraPosition>
	//    6   11:invokevirtual   #25  <Method ClassLoader Class.getClassLoader()>
	//    7   14:invokevirtual   #31  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    8   17:checkcast       #19  <Class CameraPosition>
	//    9   20:astore_3        
		amapoptions.mapType(parcel.readInt());
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #35  <Method int Parcel.readInt()>
	//   13   26:invokevirtual   #39  <Method AMapOptions AMapOptions.mapType(int)>
	//   14   29:pop             
		amapoptions.camera(cameraposition);
	//   15   30:aload_2         
	//   16   31:aload_3         
	//   17   32:invokevirtual   #43  <Method AMapOptions AMapOptions.camera(CameraPosition)>
	//   18   35:pop             
		parcel = ((Parcel) (parcel.createBooleanArray()));
	//   19   36:aload_1         
	//   20   37:invokevirtual   #47  <Method boolean[] Parcel.createBooleanArray()>
	//   21   40:astore_1        
		if(parcel != null && parcel.length >= 6)
	//*  22   41:aload_1         
	//*  23   42:ifnull          118
	//*  24   45:aload_1         
	//*  25   46:arraylength     
	//*  26   47:bipush          6
	//*  27   49:icmplt          118
		{
			amapoptions.rotateGesturesEnabled(((boolean) (parcel[0])));
	//   28   52:aload_2         
	//   29   53:aload_1         
	//   30   54:iconst_0        
	//   31   55:baload          
	//   32   56:invokevirtual   #51  <Method AMapOptions AMapOptions.rotateGesturesEnabled(boolean)>
	//   33   59:pop             
			amapoptions.scrollGesturesEnabled(((boolean) (parcel[1])));
	//   34   60:aload_2         
	//   35   61:aload_1         
	//   36   62:iconst_1        
	//   37   63:baload          
	//   38   64:invokevirtual   #54  <Method AMapOptions AMapOptions.scrollGesturesEnabled(boolean)>
	//   39   67:pop             
			amapoptions.tiltGesturesEnabled(((boolean) (parcel[2])));
	//   40   68:aload_2         
	//   41   69:aload_1         
	//   42   70:iconst_2        
	//   43   71:baload          
	//   44   72:invokevirtual   #57  <Method AMapOptions AMapOptions.tiltGesturesEnabled(boolean)>
	//   45   75:pop             
			amapoptions.zoomGesturesEnabled(((boolean) (parcel[3])));
	//   46   76:aload_2         
	//   47   77:aload_1         
	//   48   78:iconst_3        
	//   49   79:baload          
	//   50   80:invokevirtual   #60  <Method AMapOptions AMapOptions.zoomGesturesEnabled(boolean)>
	//   51   83:pop             
			amapoptions.zoomControlsEnabled(((boolean) (parcel[4])));
	//   52   84:aload_2         
	//   53   85:aload_1         
	//   54   86:iconst_4        
	//   55   87:baload          
	//   56   88:invokevirtual   #63  <Method AMapOptions AMapOptions.zoomControlsEnabled(boolean)>
	//   57   91:pop             
			amapoptions.zOrderOnTop(((boolean) (parcel[5])));
	//   58   92:aload_2         
	//   59   93:aload_1         
	//   60   94:iconst_5        
	//   61   95:baload          
	//   62   96:invokevirtual   #66  <Method AMapOptions AMapOptions.zOrderOnTop(boolean)>
	//   63   99:pop             
			amapoptions.compassEnabled(((boolean) (parcel[6])));
	//   64  100:aload_2         
	//   65  101:aload_1         
	//   66  102:bipush          6
	//   67  104:baload          
	//   68  105:invokevirtual   #69  <Method AMapOptions AMapOptions.compassEnabled(boolean)>
	//   69  108:pop             
			amapoptions.scaleControlsEnabled(((boolean) (parcel[7])));
	//   70  109:aload_2         
	//   71  110:aload_1         
	//   72  111:bipush          7
	//   73  113:baload          
	//   74  114:invokevirtual   #72  <Method AMapOptions AMapOptions.scaleControlsEnabled(boolean)>
	//   75  117:pop             
		}
		return amapoptions;
	//   76  118:aload_2         
	//   77  119:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #75  <Method AMapOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public AMapOptions[] newArray(int i)
	{
		return new AMapOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       AMapOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #80  <Method AMapOptions[] newArray(int)>
	//    3    5:areturn         
	}
}
