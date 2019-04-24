// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			MarkerOptions, LatLng, BitmapDescriptor

public class MarkerOptionsCreator
	implements android.os.Parcelable.Creator
{

	public MarkerOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public MarkerOptions createFromParcel(Parcel parcel)
	{
		MarkerOptions markeroptions = new MarkerOptions();
	//    0    0:new             #16  <Class MarkerOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void MarkerOptions()>
	//    3    7:astore_2        
		markeroptions.position((LatLng)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLng)).getClassLoader()));
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:ldc1            #19  <Class LatLng>
	//    7   12:invokevirtual   #25  <Method ClassLoader Class.getClassLoader()>
	//    8   15:invokevirtual   #31  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    9   18:checkcast       #19  <Class LatLng>
	//   10   21:invokevirtual   #35  <Method MarkerOptions MarkerOptions.position(LatLng)>
	//   11   24:pop             
		markeroptions.title(parcel.readString());
	//   12   25:aload_2         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #39  <Method String Parcel.readString()>
	//   15   30:invokevirtual   #43  <Method MarkerOptions MarkerOptions.title(String)>
	//   16   33:pop             
		markeroptions.snippet(parcel.readString());
	//   17   34:aload_2         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #39  <Method String Parcel.readString()>
	//   20   39:invokevirtual   #46  <Method MarkerOptions MarkerOptions.snippet(String)>
	//   21   42:pop             
		markeroptions.anchor(parcel.readFloat(), parcel.readFloat());
	//   22   43:aload_2         
	//   23   44:aload_1         
	//   24   45:invokevirtual   #50  <Method float Parcel.readFloat()>
	//   25   48:aload_1         
	//   26   49:invokevirtual   #50  <Method float Parcel.readFloat()>
	//   27   52:invokevirtual   #54  <Method MarkerOptions MarkerOptions.anchor(float, float)>
	//   28   55:pop             
		markeroptions.setInfoWindowOffset(parcel.readInt(), parcel.readInt());
	//   29   56:aload_2         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #58  <Method int Parcel.readInt()>
	//   32   61:aload_1         
	//   33   62:invokevirtual   #58  <Method int Parcel.readInt()>
	//   34   65:invokevirtual   #62  <Method MarkerOptions MarkerOptions.setInfoWindowOffset(int, int)>
	//   35   68:pop             
		boolean aflag[] = new boolean[7];
	//   36   69:bipush          7
	//   37   71:newarray        boolean[]
	//   38   73:astore_3        
		parcel.readBooleanArray(aflag);
	//   39   74:aload_1         
	//   40   75:aload_3         
	//   41   76:invokevirtual   #66  <Method void Parcel.readBooleanArray(boolean[])>
		markeroptions.visible(aflag[0]);
	//   42   79:aload_2         
	//   43   80:aload_3         
	//   44   81:iconst_0        
	//   45   82:baload          
	//   46   83:invokevirtual   #70  <Method MarkerOptions MarkerOptions.visible(boolean)>
	//   47   86:pop             
		markeroptions.draggable(aflag[1]);
	//   48   87:aload_2         
	//   49   88:aload_3         
	//   50   89:iconst_1        
	//   51   90:baload          
	//   52   91:invokevirtual   #73  <Method MarkerOptions MarkerOptions.draggable(boolean)>
	//   53   94:pop             
		markeroptions.setGps(aflag[2]);
	//   54   95:aload_2         
	//   55   96:aload_3         
	//   56   97:iconst_2        
	//   57   98:baload          
	//   58   99:invokevirtual   #76  <Method MarkerOptions MarkerOptions.setGps(boolean)>
	//   59  102:pop             
		markeroptions.setFlat(aflag[3]);
	//   60  103:aload_2         
	//   61  104:aload_3         
	//   62  105:iconst_3        
	//   63  106:baload          
	//   64  107:invokevirtual   #79  <Method MarkerOptions MarkerOptions.setFlat(boolean)>
	//   65  110:pop             
		markeroptions.autoOverturnInfoWindow(aflag[4]);
	//   66  111:aload_2         
	//   67  112:aload_3         
	//   68  113:iconst_4        
	//   69  114:baload          
	//   70  115:invokevirtual   #82  <Method MarkerOptions MarkerOptions.autoOverturnInfoWindow(boolean)>
	//   71  118:pop             
		markeroptions.infoWindowEnable(aflag[5]);
	//   72  119:aload_2         
	//   73  120:aload_3         
	//   74  121:iconst_5        
	//   75  122:baload          
	//   76  123:invokevirtual   #85  <Method MarkerOptions MarkerOptions.infoWindowEnable(boolean)>
	//   77  126:pop             
		markeroptions.belowMaskLayer(aflag[6]);
	//   78  127:aload_2         
	//   79  128:aload_3         
	//   80  129:bipush          6
	//   81  131:baload          
	//   82  132:invokevirtual   #88  <Method MarkerOptions MarkerOptions.belowMaskLayer(boolean)>
	//   83  135:pop             
		markeroptions.a = parcel.readString();
	//   84  136:aload_2         
	//   85  137:aload_1         
	//   86  138:invokevirtual   #39  <Method String Parcel.readString()>
	//   87  141:putfield        #92  <Field String MarkerOptions.a>
		markeroptions.period(parcel.readInt());
	//   88  144:aload_2         
	//   89  145:aload_1         
	//   90  146:invokevirtual   #58  <Method int Parcel.readInt()>
	//   91  149:invokevirtual   #96  <Method MarkerOptions MarkerOptions.period(int)>
	//   92  152:pop             
		markeroptions.icons(parcel.readArrayList(((Class) (com/amap/api/maps/model/BitmapDescriptor)).getClassLoader()));
	//   93  153:aload_2         
	//   94  154:aload_1         
	//   95  155:ldc1            #98  <Class BitmapDescriptor>
	//   96  157:invokevirtual   #25  <Method ClassLoader Class.getClassLoader()>
	//   97  160:invokevirtual   #102 <Method java.util.ArrayList Parcel.readArrayList(ClassLoader)>
	//   98  163:invokevirtual   #106 <Method MarkerOptions MarkerOptions.icons(java.util.ArrayList)>
	//   99  166:pop             
		markeroptions.zIndex(parcel.readFloat());
	//  100  167:aload_2         
	//  101  168:aload_1         
	//  102  169:invokevirtual   #50  <Method float Parcel.readFloat()>
	//  103  172:invokevirtual   #110 <Method MarkerOptions MarkerOptions.zIndex(float)>
	//  104  175:pop             
		markeroptions.alpha(parcel.readFloat());
	//  105  176:aload_2         
	//  106  177:aload_1         
	//  107  178:invokevirtual   #50  <Method float Parcel.readFloat()>
	//  108  181:invokevirtual   #113 <Method MarkerOptions MarkerOptions.alpha(float)>
	//  109  184:pop             
		markeroptions.displayLevel(parcel.readInt());
	//  110  185:aload_2         
	//  111  186:aload_1         
	//  112  187:invokevirtual   #58  <Method int Parcel.readInt()>
	//  113  190:invokevirtual   #116 <Method MarkerOptions MarkerOptions.displayLevel(int)>
	//  114  193:pop             
		markeroptions.rotateAngle(parcel.readFloat());
	//  115  194:aload_2         
	//  116  195:aload_1         
	//  117  196:invokevirtual   #50  <Method float Parcel.readFloat()>
	//  118  199:invokevirtual   #119 <Method MarkerOptions MarkerOptions.rotateAngle(float)>
	//  119  202:pop             
		parcel = ((Parcel) ((BitmapDescriptor)parcel.readParcelable(((Class) (com/amap/api/maps/model/BitmapDescriptor)).getClassLoader())));
	//  120  203:aload_1         
	//  121  204:ldc1            #98  <Class BitmapDescriptor>
	//  122  206:invokevirtual   #25  <Method ClassLoader Class.getClassLoader()>
	//  123  209:invokevirtual   #31  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//  124  212:checkcast       #98  <Class BitmapDescriptor>
	//  125  215:astore_1        
		if(parcel != null)
	//* 126  216:aload_1         
	//* 127  217:ifnull          226
			markeroptions.icon(((BitmapDescriptor) (parcel)));
	//  128  220:aload_2         
	//  129  221:aload_1         
	//  130  222:invokevirtual   #123 <Method MarkerOptions MarkerOptions.icon(BitmapDescriptor)>
	//  131  225:pop             
		return markeroptions;
	//  132  226:aload_2         
	//  133  227:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #126 <Method MarkerOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public MarkerOptions[] newArray(int i)
	{
		return new MarkerOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       MarkerOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #131 <Method MarkerOptions[] newArray(int)>
	//    3    5:areturn         
	}
}
