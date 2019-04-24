// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.banner3d;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.adsCommon.a.f;
import com.startapp.android.publish.adsCommon.adinformation.c;
import com.startapp.android.publish.common.model.AdDetails;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.startapp.android.publish.ads.banner.banner3d:
//			Banner3D, Banner3DFace

private static class Banner3D$SavedState extends android.view.View$BaseSavedState
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getCurrentImage()
	{
		return currentImage;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int currentImage>
	//    2    4:ireturn         
	}

	public List getDetails()
	{
		return Arrays.asList(((Object []) (details)));
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field AdDetails[] details>
	//    2    4:invokestatic    #129 <Method List Arrays.asList(Object[])>
	//    3    7:areturn         
	}

	public float getRotation()
	{
		return rotation;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field float rotation>
	//    2    4:freturn         
	}

	public boolean isFirstRotation()
	{
		return firstRotation == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int firstRotation>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isFirstRotationFinished()
	{
		return firstRotationFinished == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int firstRotationFinished>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void setCurrentImage(int i)
	{
		currentImage = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #54  <Field int currentImage>
	//    3    5:return          
	}

	public void setDetails(List list)
	{
		details = new AdDetails[list.size()];
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #144 <Method int List.size()>
	//    3    7:anewarray       AdDetails[]
	//    4   10:putfield        #78  <Field AdDetails[] details>
		for(int i = 0; i < list.size(); i++)
	//*   5   13:iconst_0        
	//*   6   14:istore_2        
	//*   7   15:iload_2         
	//*   8   16:aload_1         
	//*   9   17:invokeinterface #144 <Method int List.size()>
	//*  10   22:icmpge          48
			details[i] = (AdDetails)list.get(i);
	//   11   25:aload_0         
	//   12   26:getfield        #78  <Field AdDetails[] details>
	//   13   29:iload_2         
	//   14   30:aload_1         
	//   15   31:iload_2         
	//   16   32:invokeinterface #148 <Method Object List.get(int)>
	//   17   37:checkcast       #66  <Class AdDetails>
	//   18   40:aastore         

	//   19   41:iload_2         
	//   20   42:iconst_1        
	//   21   43:iadd            
	//   22   44:istore_2        
	//*  23   45:goto            15
	//   24   48:return          
	}

	public void setFirstRotation(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:putfield        #62  <Field int firstRotation>
	//*   7   11:return          
			i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
		firstRotation = i;
	//*  10   14:goto            6
	}

	public void setFirstRotationFinished(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:putfield        #64  <Field int firstRotationFinished>
	//*   7   11:return          
			i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
		firstRotationFinished = i;
	//*  10   14:goto            6
	}

	public void setRotation(float f1)
	{
		rotation = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #60  <Field float rotation>
	//    3    5:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          4
		super.writeToParcel(parcel, i);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:invokespecial   #158 <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
		if(!bIsVisible)
	//*   8   12:aload_0         
	//*   9   13:getfield        #52  <Field boolean bIsVisible>
	//*  10   16:ifne            25
		{
			parcel.writeInt(0);
	//   11   19:aload_1         
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #161 <Method void Parcel.writeInt(int)>
			return;
	//   14   24:return          
		}
		parcel.writeInt(1);
	//   15   25:aload_1         
	//   16   26:iconst_1        
	//   17   27:invokevirtual   #161 <Method void Parcel.writeInt(int)>
		parcel.writeInt(currentImage);
	//   18   30:aload_1         
	//   19   31:aload_0         
	//   20   32:getfield        #54  <Field int currentImage>
	//   21   35:invokevirtual   #161 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(rotation);
	//   22   38:aload_1         
	//   23   39:aload_0         
	//   24   40:getfield        #60  <Field float rotation>
	//   25   43:invokevirtual   #164 <Method void Parcel.writeFloat(float)>
		parcel.writeInt(firstRotation);
	//   26   46:aload_1         
	//   27   47:aload_0         
	//   28   48:getfield        #62  <Field int firstRotation>
	//   29   51:invokevirtual   #161 <Method void Parcel.writeInt(int)>
		parcel.writeInt(firstRotationFinished);
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #64  <Field int firstRotationFinished>
	//   33   59:invokevirtual   #161 <Method void Parcel.writeInt(int)>
		parcel.writeParcelableArray(((Parcelable []) (details)), i);
	//   34   62:aload_1         
	//   35   63:aload_0         
	//   36   64:getfield        #78  <Field AdDetails[] details>
	//   37   67:iload_2         
	//   38   68:invokevirtual   #168 <Method void Parcel.writeParcelableArray(Parcelable[], int)>
		int j;
		if(loaded)
	//*  39   71:aload_0         
	//*  40   72:getfield        #86  <Field boolean loaded>
	//*  41   75:ifeq            188
			j = 1;
	//   42   78:iconst_1        
	//   43   79:istore_3        
		else
	//*  44   80:aload_1         
	//*  45   81:iload_3         
	//*  46   82:invokevirtual   #161 <Method void Parcel.writeInt(int)>
	//*  47   85:aload_0         
	//*  48   86:getfield        #88  <Field boolean loading>
	//*  49   89:ifeq            183
	//*  50   92:iconst_1        
	//*  51   93:istore_3        
	//*  52   94:aload_1         
	//*  53   95:iload_3         
	//*  54   96:invokevirtual   #161 <Method void Parcel.writeInt(int)>
	//*  55   99:aload_0         
	//*  56  100:getfield        #90  <Field boolean bDefaultLoad>
	//*  57  103:ifeq            178
	//*  58  106:iload           5
	//*  59  108:istore_3        
	//*  60  109:aload_1         
	//*  61  110:iload_3         
	//*  62  111:invokevirtual   #161 <Method void Parcel.writeInt(int)>
	//*  63  114:aload_1         
	//*  64  115:aload_0         
	//*  65  116:getfield        #94  <Field Banner3DFace[] faces>
	//*  66  119:arraylength     
	//*  67  120:invokevirtual   #161 <Method void Parcel.writeInt(int)>
	//*  68  123:iload           4
	//*  69  125:istore_3        
	//*  70  126:iload_3         
	//*  71  127:aload_0         
	//*  72  128:getfield        #94  <Field Banner3DFace[] faces>
	//*  73  131:arraylength     
	//*  74  132:icmpge          153
	//*  75  135:aload_1         
	//*  76  136:aload_0         
	//*  77  137:getfield        #94  <Field Banner3DFace[] faces>
	//*  78  140:iload_3         
	//*  79  141:aaload          
	//*  80  142:iload_2         
	//*  81  143:invokevirtual   #172 <Method void Parcel.writeParcelable(Parcelable, int)>
	//*  82  146:iload_3         
	//*  83  147:iconst_1        
	//*  84  148:iadd            
	//*  85  149:istore_3        
	//*  86  150:goto            126
	//*  87  153:aload_1         
	//*  88  154:aload_0         
	//*  89  155:getfield        #106 <Field c overrides>
	//*  90  158:invokevirtual   #176 <Method void Parcel.writeSerializable(java.io.Serializable)>
	//*  91  161:aload_1         
	//*  92  162:aload_0         
	//*  93  163:getfield        #110 <Field BannerOptions options>
	//*  94  166:invokevirtual   #176 <Method void Parcel.writeSerializable(java.io.Serializable)>
	//*  95  169:aload_1         
	//*  96  170:aload_0         
	//*  97  171:getfield        #114 <Field f adRulesResult>
	//*  98  174:invokevirtual   #176 <Method void Parcel.writeSerializable(java.io.Serializable)>
	//*  99  177:return          
	//* 100  178:iconst_0        
	//* 101  179:istore_3        
	//* 102  180:goto            109
	//* 103  183:iconst_0        
	//* 104  184:istore_3        
	//* 105  185:goto            94
			j = 0;
	//  106  188:iconst_0        
	//  107  189:istore_3        
		parcel.writeInt(j);
		if(loading)
			j = 1;
		else
			j = 0;
		parcel.writeInt(j);
		if(bDefaultLoad)
			j = ((int) (flag1));
		else
			j = 0;
		parcel.writeInt(j);
		parcel.writeInt(faces.length);
		for(j = ((int) (flag)); j < faces.length; j++)
			parcel.writeParcelable(((Parcelable) (faces[j])), i);

		parcel.writeSerializable(((java.io.Serializable) (overrides)));
		parcel.writeSerializable(((java.io.Serializable) (options)));
		parcel.writeSerializable(((java.io.Serializable) (adRulesResult)));
	//* 108  190:goto            80
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Banner3D.SavedState createFromParcel(Parcel parcel)
		{
			return new Banner3D.SavedState(parcel, ((Banner3D._cls1) (null)));
		//    0    0:new             #9   <Class Banner3D$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void Banner3D$SavedState(Parcel, Banner3D$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method Banner3D$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public Banner3D.SavedState[] newArray(int i)
		{
			return new Banner3D.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Banner3D.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method Banner3D$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public f adRulesResult;
	public boolean bDefaultLoad;
	public boolean bIsVisible;
	private int currentImage;
	private AdDetails details[];
	public Banner3DFace faces[];
	private int firstRotation;
	private int firstRotationFinished;
	public boolean loaded;
	public boolean loading;
	public BannerOptions options;
	public c overrides;
	private float rotation;

	static 
	{
	//    0    0:new             #9   <Class Banner3D$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void Banner3D$SavedState$1()>
	//    3    7:putstatic       #40  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private Banner3D$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void android.view.View$BaseSavedState(Parcel)>
		if(parcel.readInt() == 1)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #50  <Method int Parcel.readInt()>
	//*   5    9:iconst_1        
	//*   6   10:icmpne          233
		{
			bIsVisible = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #52  <Field boolean bIsVisible>
			currentImage = parcel.readInt();
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #50  <Method int Parcel.readInt()>
	//   13   23:putfield        #54  <Field int currentImage>
			rotation = parcel.readFloat();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #58  <Method float Parcel.readFloat()>
	//   17   31:putfield        #60  <Field float rotation>
			firstRotation = parcel.readInt();
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #50  <Method int Parcel.readInt()>
	//   21   39:putfield        #62  <Field int firstRotation>
			firstRotationFinished = parcel.readInt();
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #50  <Method int Parcel.readInt()>
	//   25   47:putfield        #64  <Field int firstRotationFinished>
			Parcelable aparcelable[] = parcel.readParcelableArray(((Class) (com/startapp/android/publish/common/model/AdDetails)).getClassLoader());
	//   26   50:aload_1         
	//   27   51:ldc1            #66  <Class AdDetails>
	//   28   53:invokevirtual   #72  <Method ClassLoader Class.getClassLoader()>
	//   29   56:invokevirtual   #76  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
	//   30   59:astore          4
			if(aparcelable != null)
	//*  31   61:aload           4
	//*  32   63:ifnull          90
			{
				details = new AdDetails[aparcelable.length];
	//   33   66:aload_0         
	//   34   67:aload           4
	//   35   69:arraylength     
	//   36   70:anewarray       AdDetails[]
	//   37   73:putfield        #78  <Field AdDetails[] details>
				System.arraycopy(((Object) (aparcelable)), 0, ((Object) (details)), 0, aparcelable.length);
	//   38   76:aload           4
	//   39   78:iconst_0        
	//   40   79:aload_0         
	//   41   80:getfield        #78  <Field AdDetails[] details>
	//   42   83:iconst_0        
	//   43   84:aload           4
	//   44   86:arraylength     
	//   45   87:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			int i = parcel.readInt();
	//   46   90:aload_1         
	//   47   91:invokevirtual   #50  <Method int Parcel.readInt()>
	//   48   94:istore_2        
			loaded = false;
	//   49   95:aload_0         
	//   50   96:iconst_0        
	//   51   97:putfield        #86  <Field boolean loaded>
			if(i == 1)
	//*  52  100:iload_2         
	//*  53  101:iconst_1        
	//*  54  102:icmpne          110
				loaded = true;
	//   55  105:aload_0         
	//   56  106:iconst_1        
	//   57  107:putfield        #86  <Field boolean loaded>
			i = parcel.readInt();
	//   58  110:aload_1         
	//   59  111:invokevirtual   #50  <Method int Parcel.readInt()>
	//   60  114:istore_2        
			loading = false;
	//   61  115:aload_0         
	//   62  116:iconst_0        
	//   63  117:putfield        #88  <Field boolean loading>
			if(i == 1)
	//*  64  120:iload_2         
	//*  65  121:iconst_1        
	//*  66  122:icmpne          130
				loading = true;
	//   67  125:aload_0         
	//   68  126:iconst_1        
	//   69  127:putfield        #88  <Field boolean loading>
			i = parcel.readInt();
	//   70  130:aload_1         
	//   71  131:invokevirtual   #50  <Method int Parcel.readInt()>
	//   72  134:istore_2        
			bDefaultLoad = false;
	//   73  135:aload_0         
	//   74  136:iconst_0        
	//   75  137:putfield        #90  <Field boolean bDefaultLoad>
			if(i == 1)
	//*  76  140:iload_2         
	//*  77  141:iconst_1        
	//*  78  142:icmpne          150
				bDefaultLoad = true;
	//   79  145:aload_0         
	//   80  146:iconst_1        
	//   81  147:putfield        #90  <Field boolean bDefaultLoad>
			int k = parcel.readInt();
	//   82  150:aload_1         
	//   83  151:invokevirtual   #50  <Method int Parcel.readInt()>
	//   84  154:istore_3        
			if(k > 0)
	//*  85  155:iload_3         
	//*  86  156:ifle            199
			{
				faces = new Banner3DFace[k];
	//   87  159:aload_0         
	//   88  160:iload_3         
	//   89  161:anewarray       Banner3DFace[]
	//   90  164:putfield        #94  <Field Banner3DFace[] faces>
				for(int j = 0; j < k; j++)
	//*  91  167:iconst_0        
	//*  92  168:istore_2        
	//*  93  169:iload_2         
	//*  94  170:iload_3         
	//*  95  171:icmpge          199
					faces[j] = (Banner3DFace)parcel.readParcelable(((Class) (com/startapp/android/publish/ads/banner/banner3d/Banner3DFace)).getClassLoader());
	//   96  174:aload_0         
	//   97  175:getfield        #94  <Field Banner3DFace[] faces>
	//   98  178:iload_2         
	//   99  179:aload_1         
	//  100  180:ldc1            #92  <Class Banner3DFace>
	//  101  182:invokevirtual   #72  <Method ClassLoader Class.getClassLoader()>
	//  102  185:invokevirtual   #98  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//  103  188:checkcast       #92  <Class Banner3DFace>
	//  104  191:aastore         

	//  105  192:iload_2         
	//  106  193:iconst_1        
	//  107  194:iadd            
	//  108  195:istore_2        
			}
	//* 109  196:goto            169
			overrides = (c)parcel.readSerializable();
	//  110  199:aload_0         
	//  111  200:aload_1         
	//  112  201:invokevirtual   #102 <Method java.io.Serializable Parcel.readSerializable()>
	//  113  204:checkcast       #104 <Class c>
	//  114  207:putfield        #106 <Field c overrides>
			options = (BannerOptions)parcel.readSerializable();
	//  115  210:aload_0         
	//  116  211:aload_1         
	//  117  212:invokevirtual   #102 <Method java.io.Serializable Parcel.readSerializable()>
	//  118  215:checkcast       #108 <Class BannerOptions>
	//  119  218:putfield        #110 <Field BannerOptions options>
			adRulesResult = (f)parcel.readSerializable();
	//  120  221:aload_0         
	//  121  222:aload_1         
	//  122  223:invokevirtual   #102 <Method java.io.Serializable Parcel.readSerializable()>
	//  123  226:checkcast       #112 <Class f>
	//  124  229:putfield        #114 <Field f adRulesResult>
			return;
	//  125  232:return          
		} else
		{
			bIsVisible = false;
	//  126  233:aload_0         
	//  127  234:iconst_0        
	//  128  235:putfield        #52  <Field boolean bIsVisible>
			return;
	//  129  238:return          
		}
	}

	Banner3D$SavedState(Parcel parcel, Banner3D._cls1 _pcls1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #116 <Method void Banner3D$SavedState(Parcel)>
	//    3    5:return          
	}

	Banner3D$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #119 <Method void android.view.View$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
