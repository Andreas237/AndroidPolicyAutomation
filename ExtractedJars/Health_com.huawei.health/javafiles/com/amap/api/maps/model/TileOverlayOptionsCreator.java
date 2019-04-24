// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			TileProvider, TileOverlayOptions

public class TileOverlayOptionsCreator
	implements android.os.Parcelable.Creator
{

	public TileOverlayOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public TileOverlayOptions createFromParcel(Parcel parcel)
	{
		int i = parcel.readInt();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method int Parcel.readInt()>
	//    2    4:istore_3        
		TileProvider tileprovider = (TileProvider)parcel.readValue(((Class) (com/amap/api/maps/model/TileProvider)).getClassLoader());
	//    3    5:aload_1         
	//    4    6:ldc1            #25  <Class TileProvider>
	//    5    8:invokevirtual   #31  <Method ClassLoader Class.getClassLoader()>
	//    6   11:invokevirtual   #35  <Method Object Parcel.readValue(ClassLoader)>
	//    7   14:checkcast       #25  <Class TileProvider>
	//    8   17:astore          9
		boolean flag;
		if(parcel.readByte() != 0)
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #39  <Method byte Parcel.readByte()>
	//*  11   23:ifeq            32
			flag = true;
	//   12   26:iconst_1        
	//   13   27:istore          6
		else
	//*  14   29:goto            35
			flag = false;
	//   15   32:iconst_0        
	//   16   33:istore          6
		float f = parcel.readFloat();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #43  <Method float Parcel.readFloat()>
	//   19   39:fstore_2        
		int j = parcel.readInt();
	//   20   40:aload_1         
	//   21   41:invokevirtual   #23  <Method int Parcel.readInt()>
	//   22   44:istore          4
		int k = parcel.readInt();
	//   23   46:aload_1         
	//   24   47:invokevirtual   #23  <Method int Parcel.readInt()>
	//   25   50:istore          5
		String s = parcel.readString();
	//   26   52:aload_1         
	//   27   53:invokevirtual   #47  <Method String Parcel.readString()>
	//   28   56:astore          10
		boolean flag1;
		if(parcel.readByte() != 0)
	//*  29   58:aload_1         
	//*  30   59:invokevirtual   #39  <Method byte Parcel.readByte()>
	//*  31   62:ifeq            71
			flag1 = true;
	//   32   65:iconst_1        
	//   33   66:istore          7
		else
	//*  34   68:goto            74
			flag1 = false;
	//   35   71:iconst_0        
	//   36   72:istore          7
		boolean flag2;
		if(parcel.readByte() != 0)
	//*  37   74:aload_1         
	//*  38   75:invokevirtual   #39  <Method byte Parcel.readByte()>
	//*  39   78:ifeq            87
			flag2 = true;
	//   40   81:iconst_1        
	//   41   82:istore          8
		else
	//*  42   84:goto            90
			flag2 = false;
	//   43   87:iconst_0        
	//   44   88:istore          8
		parcel = ((Parcel) (new TileOverlayOptions(i, ((android.os.IBinder) (null)), flag, f)));
	//   45   90:new             #49  <Class TileOverlayOptions>
	//   46   93:dup             
	//   47   94:iload_3         
	//   48   95:aconst_null     
	//   49   96:iload           6
	//   50   98:fload_2         
	//   51   99:invokespecial   #52  <Method void TileOverlayOptions(int, android.os.IBinder, boolean, float)>
	//   52  102:astore_1        
		if(tileprovider != null)
	//*  53  103:aload           9
	//*  54  105:ifnull          115
			((TileOverlayOptions) (parcel)).tileProvider(tileprovider);
	//   55  108:aload_1         
	//   56  109:aload           9
	//   57  111:invokevirtual   #56  <Method TileOverlayOptions TileOverlayOptions.tileProvider(TileProvider)>
	//   58  114:pop             
		((TileOverlayOptions) (parcel)).memCacheSize(j);
	//   59  115:aload_1         
	//   60  116:iload           4
	//   61  118:invokevirtual   #60  <Method TileOverlayOptions TileOverlayOptions.memCacheSize(int)>
	//   62  121:pop             
		((TileOverlayOptions) (parcel)).diskCacheSize(k);
	//   63  122:aload_1         
	//   64  123:iload           5
	//   65  125:invokevirtual   #63  <Method TileOverlayOptions TileOverlayOptions.diskCacheSize(int)>
	//   66  128:pop             
		((TileOverlayOptions) (parcel)).diskCacheDir(s);
	//   67  129:aload_1         
	//   68  130:aload           10
	//   69  132:invokevirtual   #67  <Method TileOverlayOptions TileOverlayOptions.diskCacheDir(String)>
	//   70  135:pop             
		((TileOverlayOptions) (parcel)).memoryCacheEnabled(flag1);
	//   71  136:aload_1         
	//   72  137:iload           7
	//   73  139:invokevirtual   #71  <Method TileOverlayOptions TileOverlayOptions.memoryCacheEnabled(boolean)>
	//   74  142:pop             
		((TileOverlayOptions) (parcel)).diskCacheEnabled(flag2);
	//   75  143:aload_1         
	//   76  144:iload           8
	//   77  146:invokevirtual   #74  <Method TileOverlayOptions TileOverlayOptions.diskCacheEnabled(boolean)>
	//   78  149:pop             
		return ((TileOverlayOptions) (parcel));
	//   79  150:aload_1         
	//   80  151:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #77  <Method TileOverlayOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public TileOverlayOptions[] newArray(int i)
	{
		return new TileOverlayOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       TileOverlayOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #82  <Method TileOverlayOptions[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
