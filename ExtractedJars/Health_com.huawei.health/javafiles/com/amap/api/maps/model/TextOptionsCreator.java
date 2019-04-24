// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			TextOptions, LatLng

public class TextOptionsCreator
	implements android.os.Parcelable.Creator
{

	public TextOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public TextOptions createFromParcel(Parcel parcel)
	{
		TextOptions textoptions = new TextOptions();
	//    0    0:new             #18  <Class TextOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void TextOptions()>
	//    3    7:astore_3        
		textoptions.a = parcel.readString();
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #25  <Method String Parcel.readString()>
	//    7   13:putfield        #29  <Field String TextOptions.a>
		Bundle bundle = parcel.readBundle();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #33  <Method Bundle Parcel.readBundle()>
	//   10   20:astore          4
		textoptions.position(new LatLng(bundle.getDouble("lat"), bundle.getDouble("lng")));
	//   11   22:aload_3         
	//   12   23:new             #35  <Class LatLng>
	//   13   26:dup             
	//   14   27:aload           4
	//   15   29:ldc1            #37  <String "lat">
	//   16   31:invokevirtual   #43  <Method double Bundle.getDouble(String)>
	//   17   34:aload           4
	//   18   36:ldc1            #45  <String "lng">
	//   19   38:invokevirtual   #43  <Method double Bundle.getDouble(String)>
	//   20   41:invokespecial   #48  <Method void LatLng(double, double)>
	//   21   44:invokevirtual   #52  <Method TextOptions TextOptions.position(LatLng)>
	//   22   47:pop             
		textoptions.text(parcel.readString());
	//   23   48:aload_3         
	//   24   49:aload_1         
	//   25   50:invokevirtual   #25  <Method String Parcel.readString()>
	//   26   53:invokevirtual   #56  <Method TextOptions TextOptions.text(String)>
	//   27   56:pop             
		textoptions.typeface(Typeface.defaultFromStyle(parcel.readInt()));
	//   28   57:aload_3         
	//   29   58:aload_1         
	//   30   59:invokevirtual   #60  <Method int Parcel.readInt()>
	//   31   62:invokestatic    #66  <Method Typeface Typeface.defaultFromStyle(int)>
	//   32   65:invokevirtual   #70  <Method TextOptions TextOptions.typeface(Typeface)>
	//   33   68:pop             
		textoptions.rotate(parcel.readFloat());
	//   34   69:aload_3         
	//   35   70:aload_1         
	//   36   71:invokevirtual   #74  <Method float Parcel.readFloat()>
	//   37   74:invokevirtual   #78  <Method TextOptions TextOptions.rotate(float)>
	//   38   77:pop             
		textoptions.align(parcel.readInt(), parcel.readInt());
	//   39   78:aload_3         
	//   40   79:aload_1         
	//   41   80:invokevirtual   #60  <Method int Parcel.readInt()>
	//   42   83:aload_1         
	//   43   84:invokevirtual   #60  <Method int Parcel.readInt()>
	//   44   87:invokevirtual   #82  <Method TextOptions TextOptions.align(int, int)>
	//   45   90:pop             
		textoptions.backgroundColor(parcel.readInt());
	//   46   91:aload_3         
	//   47   92:aload_1         
	//   48   93:invokevirtual   #60  <Method int Parcel.readInt()>
	//   49   96:invokevirtual   #86  <Method TextOptions TextOptions.backgroundColor(int)>
	//   50   99:pop             
		textoptions.fontColor(parcel.readInt());
	//   51  100:aload_3         
	//   52  101:aload_1         
	//   53  102:invokevirtual   #60  <Method int Parcel.readInt()>
	//   54  105:invokevirtual   #89  <Method TextOptions TextOptions.fontColor(int)>
	//   55  108:pop             
		textoptions.fontSize(parcel.readInt());
	//   56  109:aload_3         
	//   57  110:aload_1         
	//   58  111:invokevirtual   #60  <Method int Parcel.readInt()>
	//   59  114:invokevirtual   #92  <Method TextOptions TextOptions.fontSize(int)>
	//   60  117:pop             
		textoptions.zIndex(parcel.readFloat());
	//   61  118:aload_3         
	//   62  119:aload_1         
	//   63  120:invokevirtual   #74  <Method float Parcel.readFloat()>
	//   64  123:invokevirtual   #95  <Method TextOptions TextOptions.zIndex(float)>
	//   65  126:pop             
		boolean flag;
		if(parcel.readByte() == 1)
	//*  66  127:aload_1         
	//*  67  128:invokevirtual   #99  <Method byte Parcel.readByte()>
	//*  68  131:iconst_1        
	//*  69  132:icmpne          140
			flag = true;
	//   70  135:iconst_1        
	//   71  136:istore_2        
		else
	//*  72  137:goto            142
			flag = false;
	//   73  140:iconst_0        
	//   74  141:istore_2        
		textoptions.visible(flag);
	//   75  142:aload_3         
	//   76  143:iload_2         
	//   77  144:invokevirtual   #103 <Method TextOptions TextOptions.visible(boolean)>
	//   78  147:pop             
		try
		{
			parcel = ((Parcel) (parcel.readBundle().getParcelable("obj")));
	//   79  148:aload_1         
	//   80  149:invokevirtual   #33  <Method Bundle Parcel.readBundle()>
	//   81  152:ldc1            #105 <String "obj">
	//   82  154:invokevirtual   #109 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   83  157:astore_1        
		}
	//*  84  158:aload_1         
	//*  85  159:ifnull          168
	//*  86  162:aload_3         
	//*  87  163:aload_1         
	//*  88  164:invokevirtual   #113 <Method TextOptions TextOptions.setObject(Object)>
	//*  89  167:pop             
	//*  90  168:aload_3         
	//*  91  169:areturn         
		// Misplaced declaration of an exception variable
		catch(Parcel parcel)
	//*  92  170:astore_1        
		{
			((Throwable) (parcel)).printStackTrace();
	//   93  171:aload_1         
	//   94  172:invokevirtual   #116 <Method void Throwable.printStackTrace()>
			return textoptions;
	//   95  175:aload_3         
	//   96  176:areturn         
		}
		if(parcel == null)
			break MISSING_BLOCK_LABEL_168;
		textoptions.setObject(((Object) (parcel)));
		return textoptions;
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #119 <Method TextOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public TextOptions[] newArray(int i)
	{
		return new TextOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       TextOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #124 <Method TextOptions[] newArray(int)>
	//    3    5:areturn         
	}
}
