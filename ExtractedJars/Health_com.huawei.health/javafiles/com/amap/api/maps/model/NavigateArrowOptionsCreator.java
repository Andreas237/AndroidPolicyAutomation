// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.amap.api.maps.model:
//			NavigateArrowOptions, LatLng

public class NavigateArrowOptionsCreator
	implements android.os.Parcelable.Creator
{

	public NavigateArrowOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public NavigateArrowOptions createFromParcel(Parcel parcel)
	{
		NavigateArrowOptions navigatearrowoptions = new NavigateArrowOptions();
	//    0    0:new             #16  <Class NavigateArrowOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void NavigateArrowOptions()>
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
	//   17   36:istore          4
		int j = parcel.readInt();
	//   18   38:aload_1         
	//   19   39:invokevirtual   #40  <Method int Parcel.readInt()>
	//   20   42:istore          5
		float f1 = parcel.readFloat();
	//   21   44:aload_1         
	//   22   45:invokevirtual   #36  <Method float Parcel.readFloat()>
	//   23   48:fstore_3        
		boolean flag;
		if(parcel.readByte() == 1)
	//*  24   49:aload_1         
	//*  25   50:invokevirtual   #44  <Method byte Parcel.readByte()>
	//*  26   53:iconst_1        
	//*  27   54:icmpne          63
			flag = true;
	//   28   57:iconst_1        
	//   29   58:istore          6
		else
	//*  30   60:goto            66
			flag = false;
	//   31   63:iconst_0        
	//   32   64:istore          6
		navigatearrowoptions.addAll(((Iterable) (arraylist)));
	//   33   66:aload           7
	//   34   68:aload           8
	//   35   70:invokevirtual   #48  <Method NavigateArrowOptions NavigateArrowOptions.addAll(Iterable)>
	//   36   73:pop             
		navigatearrowoptions.width(f);
	//   37   74:aload           7
	//   38   76:fload_2         
	//   39   77:invokevirtual   #52  <Method NavigateArrowOptions NavigateArrowOptions.width(float)>
	//   40   80:pop             
		navigatearrowoptions.topColor(i);
	//   41   81:aload           7
	//   42   83:iload           4
	//   43   85:invokevirtual   #56  <Method NavigateArrowOptions NavigateArrowOptions.topColor(int)>
	//   44   88:pop             
		navigatearrowoptions.sideColor(j);
	//   45   89:aload           7
	//   46   91:iload           5
	//   47   93:invokevirtual   #59  <Method NavigateArrowOptions NavigateArrowOptions.sideColor(int)>
	//   48   96:pop             
		navigatearrowoptions.zIndex(f1);
	//   49   97:aload           7
	//   50   99:fload_3         
	//   51  100:invokevirtual   #62  <Method NavigateArrowOptions NavigateArrowOptions.zIndex(float)>
	//   52  103:pop             
		navigatearrowoptions.visible(flag);
	//   53  104:aload           7
	//   54  106:iload           6
	//   55  108:invokevirtual   #66  <Method NavigateArrowOptions NavigateArrowOptions.visible(boolean)>
	//   56  111:pop             
		navigatearrowoptions.a = parcel.readString();
	//   57  112:aload           7
	//   58  114:aload_1         
	//   59  115:invokevirtual   #70  <Method String Parcel.readString()>
	//   60  118:putfield        #74  <Field String NavigateArrowOptions.a>
		return navigatearrowoptions;
	//   61  121:aload           7
	//   62  123:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #77  <Method NavigateArrowOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public NavigateArrowOptions[] newArray(int i)
	{
		return new NavigateArrowOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       NavigateArrowOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #82  <Method NavigateArrowOptions[] newArray(int)>
	//    3    5:areturn         
	}
}
