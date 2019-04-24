// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.amap.api.maps.model:
//			PolygonOptions, LatLng, BaseHoleOptions

public class PolygonOptionsCreator
	implements android.os.Parcelable.Creator
{

	public PolygonOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public PolygonOptions createFromParcel(Parcel parcel)
	{
		PolygonOptions polygonoptions = new PolygonOptions();
	//    0    0:new             #19  <Class PolygonOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void PolygonOptions()>
	//    3    7:astore          8
		ArrayList arraylist = new ArrayList();
	//    4    9:new             #22  <Class ArrayList>
	//    5   12:dup             
	//    6   13:invokespecial   #23  <Method void ArrayList()>
	//    7   16:astore          9
		parcel.readTypedList(((List) (arraylist)), ((android.os.Parcelable.Creator) (LatLng.CREATOR)));
	//    8   18:aload_1         
	//    9   19:aload           9
	//   10   21:getstatic       #29  <Field LatLngCreator LatLng.CREATOR>
	//   11   24:invokevirtual   #35  <Method void Parcel.readTypedList(List, android.os.Parcelable$Creator)>
		float f = parcel.readFloat();
	//   12   27:aload_1         
	//   13   28:invokevirtual   #39  <Method float Parcel.readFloat()>
	//   14   31:fstore_2        
		int j = parcel.readInt();
	//   15   32:aload_1         
	//   16   33:invokevirtual   #43  <Method int Parcel.readInt()>
	//   17   36:istore          5
		int k = parcel.readInt();
	//   18   38:aload_1         
	//   19   39:invokevirtual   #43  <Method int Parcel.readInt()>
	//   20   42:istore          6
		float f1 = parcel.readFloat();
	//   21   44:aload_1         
	//   22   45:invokevirtual   #39  <Method float Parcel.readFloat()>
	//   23   48:fstore_3        
		boolean flag;
		if(parcel.readByte() == 1)
	//*  24   49:aload_1         
	//*  25   50:invokevirtual   #47  <Method byte Parcel.readByte()>
	//*  26   53:iconst_1        
	//*  27   54:icmpne          63
			flag = true;
	//   28   57:iconst_1        
	//   29   58:istore          7
		else
	//*  30   60:goto            66
			flag = false;
	//   31   63:iconst_0        
	//   32   64:istore          7
		LatLng alatlng[] = new LatLng[((List) (arraylist)).size()];
	//   33   66:aload           9
	//   34   68:invokeinterface #52  <Method int List.size()>
	//   35   73:anewarray       LatLng[]
	//   36   76:astore          10
		for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//*  37   78:iconst_0        
	//*  38   79:istore          4
	//*  39   81:iload           4
	//*  40   83:aload           9
	//*  41   85:invokeinterface #52  <Method int List.size()>
	//*  42   90:icmpge          119
			alatlng[i] = (LatLng)((List) (arraylist)).get(i);
	//   43   93:aload           10
	//   44   95:iload           4
	//   45   97:aload           9
	//   46   99:iload           4
	//   47  101:invokeinterface #56  <Method Object List.get(int)>
	//   48  106:checkcast       #25  <Class LatLng>
	//   49  109:aastore         

	//   50  110:iload           4
	//   51  112:iconst_1        
	//   52  113:iadd            
	//   53  114:istore          4
	//*  54  116:goto            81
		polygonoptions.add(alatlng);
	//   55  119:aload           8
	//   56  121:aload           10
	//   57  123:invokevirtual   #60  <Method PolygonOptions PolygonOptions.add(LatLng[])>
	//   58  126:pop             
		polygonoptions.strokeWidth(f);
	//   59  127:aload           8
	//   60  129:fload_2         
	//   61  130:invokevirtual   #64  <Method PolygonOptions PolygonOptions.strokeWidth(float)>
	//   62  133:pop             
		polygonoptions.strokeColor(j);
	//   63  134:aload           8
	//   64  136:iload           5
	//   65  138:invokevirtual   #68  <Method PolygonOptions PolygonOptions.strokeColor(int)>
	//   66  141:pop             
		polygonoptions.fillColor(k);
	//   67  142:aload           8
	//   68  144:iload           6
	//   69  146:invokevirtual   #71  <Method PolygonOptions PolygonOptions.fillColor(int)>
	//   70  149:pop             
		polygonoptions.zIndex(f1);
	//   71  150:aload           8
	//   72  152:fload_3         
	//   73  153:invokevirtual   #74  <Method PolygonOptions PolygonOptions.zIndex(float)>
	//   74  156:pop             
		polygonoptions.visible(flag);
	//   75  157:aload           8
	//   76  159:iload           7
	//   77  161:invokevirtual   #78  <Method PolygonOptions PolygonOptions.visible(boolean)>
	//   78  164:pop             
		polygonoptions.a = parcel.readString();
	//   79  165:aload           8
	//   80  167:aload_1         
	//   81  168:invokevirtual   #82  <Method String Parcel.readString()>
	//   82  171:putfield        #86  <Field String PolygonOptions.a>
		arraylist = new ArrayList();
	//   83  174:new             #22  <Class ArrayList>
	//   84  177:dup             
	//   85  178:invokespecial   #23  <Method void ArrayList()>
	//   86  181:astore          9
		parcel.readList(((List) (arraylist)), ((Class) (com/amap/api/maps/model/BaseHoleOptions)).getClassLoader());
	//   87  183:aload_1         
	//   88  184:aload           9
	//   89  186:ldc1            #88  <Class BaseHoleOptions>
	//   90  188:invokevirtual   #94  <Method ClassLoader Class.getClassLoader()>
	//   91  191:invokevirtual   #98  <Method void Parcel.readList(List, ClassLoader)>
		polygonoptions.addHoles(((Iterable) (arraylist)));
	//   92  194:aload           8
	//   93  196:aload           9
	//   94  198:invokevirtual   #102 <Method PolygonOptions PolygonOptions.addHoles(Iterable)>
	//   95  201:pop             
		return polygonoptions;
	//   96  202:aload           8
	//   97  204:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method PolygonOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public PolygonOptions[] newArray(int i)
	{
		return new PolygonOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PolygonOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #110 <Method PolygonOptions[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
