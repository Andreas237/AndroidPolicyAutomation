// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.amap.api.maps.model:
//			PolylineOptions, LatLng, BitmapDescriptor

public class PolylineOptionsCreator
	implements android.os.Parcelable.Creator
{

	public PolylineOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public PolylineOptions createFromParcel(Parcel parcel)
	{
		PolylineOptions polylineoptions = new PolylineOptions();
	//    0    0:new             #16  <Class PolylineOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void PolylineOptions()>
	//    3    7:astore          7
		ArrayList arraylist = new ArrayList();
	//    4    9:new             #19  <Class ArrayList>
	//    5   12:dup             
	//    6   13:invokespecial   #20  <Method void ArrayList()>
	//    7   16:astore          8
		parcel.readTypedList(((java.util.List) (arraylist)), ((android.os.Parcelable.Creator) (LatLng.CREATOR)));
	//    8   18:aload_1         
	//    9   19:aload           8
	//   10   21:getstatic       #26  <Field LatLngCreator LatLng.CREATOR>
	//   11   24:invokevirtual   #32  <Method void Parcel.readTypedList(java.util.List, android.os.Parcelable$Creator)>
		float f = parcel.readFloat();
	//   12   27:aload_1         
	//   13   28:invokevirtual   #36  <Method float Parcel.readFloat()>
	//   14   31:fstore_2        
		int i = parcel.readInt();
	//   15   32:aload_1         
	//   16   33:invokevirtual   #40  <Method int Parcel.readInt()>
	//   17   36:istore          5
		int j = parcel.readInt();
	//   18   38:aload_1         
	//   19   39:invokevirtual   #40  <Method int Parcel.readInt()>
	//   20   42:istore          6
		float f1 = parcel.readFloat();
	//   21   44:aload_1         
	//   22   45:invokevirtual   #36  <Method float Parcel.readFloat()>
	//   23   48:fstore_3        
		float f2 = parcel.readFloat();
	//   24   49:aload_1         
	//   25   50:invokevirtual   #36  <Method float Parcel.readFloat()>
	//   26   53:fstore          4
		polylineoptions.a = parcel.readString();
	//   27   55:aload           7
	//   28   57:aload_1         
	//   29   58:invokevirtual   #44  <Method String Parcel.readString()>
	//   30   61:putfield        #48  <Field String PolylineOptions.a>
		polylineoptions.lineCapType(PolylineOptions.LineCapType.valueOf(parcel.readInt()));
	//   31   64:aload           7
	//   32   66:aload_1         
	//   33   67:invokevirtual   #40  <Method int Parcel.readInt()>
	//   34   70:invokestatic    #54  <Method PolylineOptions$LineCapType PolylineOptions$LineCapType.valueOf(int)>
	//   35   73:invokevirtual   #58  <Method PolylineOptions PolylineOptions.lineCapType(PolylineOptions$LineCapType)>
	//   36   76:pop             
		polylineoptions.lineJoinType(PolylineOptions.LineJoinType.valueOf(parcel.readInt()));
	//   37   77:aload           7
	//   38   79:aload_1         
	//   39   80:invokevirtual   #40  <Method int Parcel.readInt()>
	//   40   83:invokestatic    #63  <Method PolylineOptions$LineJoinType PolylineOptions$LineJoinType.valueOf(int)>
	//   41   86:invokevirtual   #67  <Method PolylineOptions PolylineOptions.lineJoinType(PolylineOptions$LineJoinType)>
	//   42   89:pop             
		boolean aflag[] = new boolean[5];
	//   43   90:iconst_5        
	//   44   91:newarray        boolean[]
	//   45   93:astore          9
		parcel.readBooleanArray(aflag);
	//   46   95:aload_1         
	//   47   96:aload           9
	//   48   98:invokevirtual   #71  <Method void Parcel.readBooleanArray(boolean[])>
		BitmapDescriptor bitmapdescriptor = (BitmapDescriptor)parcel.readParcelable(((Class) (com/amap/api/maps/model/BitmapDescriptor)).getClassLoader());
	//   49  101:aload_1         
	//   50  102:ldc1            #73  <Class BitmapDescriptor>
	//   51  104:invokevirtual   #79  <Method ClassLoader Class.getClassLoader()>
	//   52  107:invokevirtual   #83  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   53  110:checkcast       #73  <Class BitmapDescriptor>
	//   54  113:astore          10
		polylineoptions.addAll(((Iterable) (arraylist)));
	//   55  115:aload           7
	//   56  117:aload           8
	//   57  119:invokevirtual   #87  <Method PolylineOptions PolylineOptions.addAll(Iterable)>
	//   58  122:pop             
		polylineoptions.width(f);
	//   59  123:aload           7
	//   60  125:fload_2         
	//   61  126:invokevirtual   #91  <Method PolylineOptions PolylineOptions.width(float)>
	//   62  129:pop             
		polylineoptions.color(i);
	//   63  130:aload           7
	//   64  132:iload           5
	//   65  134:invokevirtual   #95  <Method PolylineOptions PolylineOptions.color(int)>
	//   66  137:pop             
		polylineoptions.setDottedLineType(j);
	//   67  138:aload           7
	//   68  140:iload           6
	//   69  142:invokevirtual   #98  <Method PolylineOptions PolylineOptions.setDottedLineType(int)>
	//   70  145:pop             
		polylineoptions.zIndex(f1);
	//   71  146:aload           7
	//   72  148:fload_3         
	//   73  149:invokevirtual   #101 <Method PolylineOptions PolylineOptions.zIndex(float)>
	//   74  152:pop             
		polylineoptions.transparency(f2);
	//   75  153:aload           7
	//   76  155:fload           4
	//   77  157:invokevirtual   #104 <Method PolylineOptions PolylineOptions.transparency(float)>
	//   78  160:pop             
		polylineoptions.visible(aflag[0]);
	//   79  161:aload           7
	//   80  163:aload           9
	//   81  165:iconst_0        
	//   82  166:baload          
	//   83  167:invokevirtual   #108 <Method PolylineOptions PolylineOptions.visible(boolean)>
	//   84  170:pop             
		polylineoptions.setDottedLine(aflag[1]);
	//   85  171:aload           7
	//   86  173:aload           9
	//   87  175:iconst_1        
	//   88  176:baload          
	//   89  177:invokevirtual   #111 <Method PolylineOptions PolylineOptions.setDottedLine(boolean)>
	//   90  180:pop             
		polylineoptions.geodesic(aflag[2]);
	//   91  181:aload           7
	//   92  183:aload           9
	//   93  185:iconst_2        
	//   94  186:baload          
	//   95  187:invokevirtual   #114 <Method PolylineOptions PolylineOptions.geodesic(boolean)>
	//   96  190:pop             
		polylineoptions.useGradient(aflag[3]);
	//   97  191:aload           7
	//   98  193:aload           9
	//   99  195:iconst_3        
	//  100  196:baload          
	//  101  197:invokevirtual   #117 <Method PolylineOptions PolylineOptions.useGradient(boolean)>
	//  102  200:pop             
		polylineoptions.aboveMaskLayer(aflag[4]);
	//  103  201:aload           7
	//  104  203:aload           9
	//  105  205:iconst_4        
	//  106  206:baload          
	//  107  207:invokevirtual   #120 <Method PolylineOptions PolylineOptions.aboveMaskLayer(boolean)>
	//  108  210:pop             
		polylineoptions.setCustomTexture(bitmapdescriptor);
	//  109  211:aload           7
	//  110  213:aload           10
	//  111  215:invokevirtual   #124 <Method PolylineOptions PolylineOptions.setCustomTexture(BitmapDescriptor)>
	//  112  218:pop             
		polylineoptions.setCustomTextureList(((java.util.List) (parcel.readArrayList(((Class) (com/amap/api/maps/model/BitmapDescriptor)).getClassLoader()))));
	//  113  219:aload           7
	//  114  221:aload_1         
	//  115  222:ldc1            #73  <Class BitmapDescriptor>
	//  116  224:invokevirtual   #79  <Method ClassLoader Class.getClassLoader()>
	//  117  227:invokevirtual   #128 <Method ArrayList Parcel.readArrayList(ClassLoader)>
	//  118  230:invokevirtual   #132 <Method PolylineOptions PolylineOptions.setCustomTextureList(java.util.List)>
	//  119  233:pop             
		polylineoptions.setCustomTextureIndex(((java.util.List) (parcel.readArrayList(((Class) (java/lang/Integer)).getClassLoader()))));
	//  120  234:aload           7
	//  121  236:aload_1         
	//  122  237:ldc1            #134 <Class Integer>
	//  123  239:invokevirtual   #79  <Method ClassLoader Class.getClassLoader()>
	//  124  242:invokevirtual   #128 <Method ArrayList Parcel.readArrayList(ClassLoader)>
	//  125  245:invokevirtual   #137 <Method PolylineOptions PolylineOptions.setCustomTextureIndex(java.util.List)>
	//  126  248:pop             
		polylineoptions.colorValues(((java.util.List) (parcel.readArrayList(((Class) (java/lang/Integer)).getClassLoader()))));
	//  127  249:aload           7
	//  128  251:aload_1         
	//  129  252:ldc1            #134 <Class Integer>
	//  130  254:invokevirtual   #79  <Method ClassLoader Class.getClassLoader()>
	//  131  257:invokevirtual   #128 <Method ArrayList Parcel.readArrayList(ClassLoader)>
	//  132  260:invokevirtual   #140 <Method PolylineOptions PolylineOptions.colorValues(java.util.List)>
	//  133  263:pop             
		return polylineoptions;
	//  134  264:aload           7
	//  135  266:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #143 <Method PolylineOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public PolylineOptions[] newArray(int i)
	{
		return new PolylineOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PolylineOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #148 <Method PolylineOptions[] newArray(int)>
	//    3    5:areturn         
	}
}
