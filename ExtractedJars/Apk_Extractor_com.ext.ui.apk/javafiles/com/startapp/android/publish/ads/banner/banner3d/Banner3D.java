// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.startapp.android.publish.ads.banner.BannerBase;
import com.startapp.android.publish.ads.banner.BannerInterface;
import com.startapp.android.publish.ads.banner.BannerListener;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.ads.banner.c;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adinformation.b;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.startapp.android.publish.ads.banner.banner3d:
//			Banner3DFace, Banner3DSize, a

public class Banner3D extends BannerBase
	implements BannerInterface, AdEventListener
{
	private static class SavedState extends android.view.View.BaseSavedState
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
		//*  89  155:getfield        #106 <Field com.startapp.android.publish.adsCommon.adinformation.c overrides>
		//*  90  158:invokevirtual   #176 <Method void Parcel.writeSerializable(java.io.Serializable)>
		//*  91  161:aload_1         
		//*  92  162:aload_0         
		//*  93  163:getfield        #110 <Field BannerOptions options>
		//*  94  166:invokevirtual   #176 <Method void Parcel.writeSerializable(java.io.Serializable)>
		//*  95  169:aload_1         
		//*  96  170:aload_0         
		//*  97  171:getfield        #114 <Field com.startapp.android.publish.adsCommon.a.f adRulesResult>
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

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
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

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
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
		public com.startapp.android.publish.adsCommon.a.f adRulesResult;
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
		public com.startapp.android.publish.adsCommon.adinformation.c overrides;
		private float rotation;

		static 
		{
		//    0    0:new             #9   <Class Banner3D$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #38  <Method void Banner3D$SavedState$1()>
		//    3    7:putstatic       #40  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private SavedState(Parcel parcel)
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
				overrides = (com.startapp.android.publish.adsCommon.adinformation.c)parcel.readSerializable();
		//  110  199:aload_0         
		//  111  200:aload_1         
		//  112  201:invokevirtual   #102 <Method java.io.Serializable Parcel.readSerializable()>
		//  113  204:checkcast       #104 <Class com.startapp.android.publish.adsCommon.adinformation.c>
		//  114  207:putfield        #106 <Field com.startapp.android.publish.adsCommon.adinformation.c overrides>
				options = (BannerOptions)parcel.readSerializable();
		//  115  210:aload_0         
		//  116  211:aload_1         
		//  117  212:invokevirtual   #102 <Method java.io.Serializable Parcel.readSerializable()>
		//  118  215:checkcast       #108 <Class BannerOptions>
		//  119  218:putfield        #110 <Field BannerOptions options>
				adRulesResult = (com.startapp.android.publish.adsCommon.a.f)parcel.readSerializable();
		//  120  221:aload_0         
		//  121  222:aload_1         
		//  122  223:invokevirtual   #102 <Method java.io.Serializable Parcel.readSerializable()>
		//  123  226:checkcast       #112 <Class com.startapp.android.publish.adsCommon.a.f>
		//  124  229:putfield        #114 <Field com.startapp.android.publish.adsCommon.a.f adRulesResult>
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


		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #119 <Method void android.view.View$BaseSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	public Banner3D(Activity activity)
	{
		this(((Context) (activity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void Banner3D(Context)>
	//    3    5:return          
	}

	public Banner3D(Activity activity, AttributeSet attributeset)
	{
		this(((Context) (activity)), attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #78  <Method void Banner3D(Context, AttributeSet)>
	//    4    6:return          
	}

	public Banner3D(Activity activity, AttributeSet attributeset, int i)
	{
		this(((Context) (activity)), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #82  <Method void Banner3D(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public Banner3D(Activity activity, BannerListener bannerlistener)
	{
		this(((Context) (activity)), bannerlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #86  <Method void Banner3D(Context, BannerListener)>
	//    4    6:return          
	}

	public Banner3D(Activity activity, AdPreferences adpreferences)
	{
		this(((Context) (activity)), adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #90  <Method void Banner3D(Context, AdPreferences)>
	//    4    6:return          
	}

	public Banner3D(Activity activity, AdPreferences adpreferences, BannerListener bannerlistener)
	{
		this(((Context) (activity)), adpreferences, bannerlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #94  <Method void Banner3D(Context, AdPreferences, BannerListener)>
	//    5    7:return          
	}

	public Banner3D(Activity activity, boolean flag)
	{
		this(((Context) (activity)), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #98  <Method void Banner3D(Context, boolean)>
	//    4    6:return          
	}

	public Banner3D(Activity activity, boolean flag, AdPreferences adpreferences)
	{
		this(((Context) (activity)), flag, adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #102 <Method void Banner3D(Context, boolean, AdPreferences)>
	//    5    7:return          
	}

	public Banner3D(Context context)
	{
		this(context, true, ((AdPreferences) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aconst_null     
	//    4    4:invokespecial   #102 <Method void Banner3D(Context, boolean, AdPreferences)>
	//    5    7:return          
	}

	public Banner3D(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #82  <Method void Banner3D(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public Banner3D(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #107 <Method void BannerBase(Context, AttributeSet, int)>
		camera = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #109 <Field Camera camera>
		matrix = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #111 <Field Matrix matrix>
		paint = null;
	//   11   17:aload_0         
	//   12   18:aconst_null     
	//   13   19:putfield        #113 <Field Paint paint>
		rotation = 45F;
	//   14   22:aload_0         
	//   15   23:ldc1            #114 <Float 45F>
	//   16   25:putfield        #116 <Field float rotation>
		startY = 0.0F;
	//   17   28:aload_0         
	//   18   29:fconst_0        
	//   19   30:putfield        #118 <Field float startY>
		rotationEnabled = true;
	//   20   33:aload_0         
	//   21   34:iconst_1        
	//   22   35:putfield        #120 <Field boolean rotationEnabled>
		rotating = false;
	//   23   38:aload_0         
	//   24   39:iconst_0        
	//   25   40:putfield        #122 <Field boolean rotating>
		firstRotation = true;
	//   26   43:aload_0         
	//   27   44:iconst_1        
	//   28   45:putfield        #124 <Field boolean firstRotation>
		firstRotationFinished = false;
	//   29   48:aload_0         
	//   30   49:iconst_0        
	//   31   50:putfield        #126 <Field boolean firstRotationFinished>
		addedDisplayEvent = false;
	//   32   53:aload_0         
	//   33   54:iconst_0        
	//   34   55:putfield        #128 <Field boolean addedDisplayEvent>
		touchDown = false;
	//   35   58:aload_0         
	//   36   59:iconst_0        
	//   37   60:putfield        #130 <Field boolean touchDown>
		animation = false;
	//   38   63:aload_0         
	//   39   64:iconst_0        
	//   40   65:putfield        #132 <Field boolean animation>
		visible = true;
	//   41   68:aload_0         
	//   42   69:iconst_1        
	//   43   70:putfield        #134 <Field boolean visible>
		defaultLoad = true;
	//   44   73:aload_0         
	//   45   74:iconst_1        
	//   46   75:putfield        #136 <Field boolean defaultLoad>
		loaded = false;
	//   47   78:aload_0         
	//   48   79:iconst_0        
	//   49   80:putfield        #138 <Field boolean loaded>
		loading = false;
	//   50   83:aload_0         
	//   51   84:iconst_0        
	//   52   85:putfield        #140 <Field boolean loading>
		attachedToWindow = false;
	//   53   88:aload_0         
	//   54   89:iconst_0        
	//   55   90:putfield        #142 <Field boolean attachedToWindow>
		faces = ((List) (new ArrayList()));
	//   56   93:aload_0         
	//   57   94:new             #144 <Class ArrayList>
	//   58   97:dup             
	//   59   98:invokespecial   #147 <Method void ArrayList()>
	//   60  101:putfield        #149 <Field List faces>
		currentBannerIndex = 0;
	//   61  104:aload_0         
	//   62  105:iconst_0        
	//   63  106:putfield        #151 <Field int currentBannerIndex>
	//   64  109:aload_0         
	//   65  110:new             #10  <Class Banner3D$1>
	//   66  113:dup             
	//   67  114:aload_0         
	//   68  115:invokespecial   #154 <Method void Banner3D$1(Banner3D)>
	//   69  118:putfield        #156 <Field Runnable mAutoRotation>
		try
		{
			init();
	//   70  121:aload_0         
	//   71  122:invokevirtual   #159 <Method void init()>
			return;
	//   72  125:return          
		}
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset)
	//*  73  126:astore_2        
		{
			f.a(context, d.b, "Banner.init - unexpected error occurd", ((Exception) (attributeset)).getMessage(), "");
	//   74  127:aload_1         
	//   75  128:getstatic       #165 <Field d d.b>
	//   76  131:ldc1            #167 <String "Banner.init - unexpected error occurd">
	//   77  133:aload_2         
	//   78  134:invokevirtual   #171 <Method String Exception.getMessage()>
	//   79  137:ldc1            #173 <String "">
	//   80  139:invokestatic    #179 <Method void f.a(Context, d, String, String, String)>
		}
	//   81  142:return          
	}

	public Banner3D(Context context, BannerListener bannerlistener)
	{
		this(context, true, ((AdPreferences) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aconst_null     
	//    4    4:invokespecial   #102 <Method void Banner3D(Context, boolean, AdPreferences)>
		setBannerListener(bannerlistener);
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #183 <Method void setBannerListener(BannerListener)>
	//    8   12:return          
	}

	public Banner3D(Context context, AdPreferences adpreferences)
	{
		this(context, true, adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aload_2         
	//    4    4:invokespecial   #102 <Method void Banner3D(Context, boolean, AdPreferences)>
	//    5    7:return          
	}

	public Banner3D(Context context, AdPreferences adpreferences, BannerListener bannerlistener)
	{
		this(context, true, adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aload_2         
	//    4    4:invokespecial   #102 <Method void Banner3D(Context, boolean, AdPreferences)>
		setBannerListener(bannerlistener);
	//    5    7:aload_0         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #183 <Method void setBannerListener(BannerListener)>
	//    8   12:return          
	}

	public Banner3D(Context context, boolean flag)
	{
		this(context, flag, ((AdPreferences) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #102 <Method void Banner3D(Context, boolean, AdPreferences)>
	//    5    7:return          
	}

	public Banner3D(Context context, boolean flag, AdPreferences adpreferences)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #184 <Method void BannerBase(Context)>
		camera = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #109 <Field Camera camera>
		matrix = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #111 <Field Matrix matrix>
		paint = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #113 <Field Paint paint>
		rotation = 45F;
	//   12   20:aload_0         
	//   13   21:ldc1            #114 <Float 45F>
	//   14   23:putfield        #116 <Field float rotation>
		startY = 0.0F;
	//   15   26:aload_0         
	//   16   27:fconst_0        
	//   17   28:putfield        #118 <Field float startY>
		rotationEnabled = true;
	//   18   31:aload_0         
	//   19   32:iconst_1        
	//   20   33:putfield        #120 <Field boolean rotationEnabled>
		rotating = false;
	//   21   36:aload_0         
	//   22   37:iconst_0        
	//   23   38:putfield        #122 <Field boolean rotating>
		firstRotation = true;
	//   24   41:aload_0         
	//   25   42:iconst_1        
	//   26   43:putfield        #124 <Field boolean firstRotation>
		firstRotationFinished = false;
	//   27   46:aload_0         
	//   28   47:iconst_0        
	//   29   48:putfield        #126 <Field boolean firstRotationFinished>
		addedDisplayEvent = false;
	//   30   51:aload_0         
	//   31   52:iconst_0        
	//   32   53:putfield        #128 <Field boolean addedDisplayEvent>
		touchDown = false;
	//   33   56:aload_0         
	//   34   57:iconst_0        
	//   35   58:putfield        #130 <Field boolean touchDown>
		animation = false;
	//   36   61:aload_0         
	//   37   62:iconst_0        
	//   38   63:putfield        #132 <Field boolean animation>
		visible = true;
	//   39   66:aload_0         
	//   40   67:iconst_1        
	//   41   68:putfield        #134 <Field boolean visible>
		defaultLoad = true;
	//   42   71:aload_0         
	//   43   72:iconst_1        
	//   44   73:putfield        #136 <Field boolean defaultLoad>
		loaded = false;
	//   45   76:aload_0         
	//   46   77:iconst_0        
	//   47   78:putfield        #138 <Field boolean loaded>
		loading = false;
	//   48   81:aload_0         
	//   49   82:iconst_0        
	//   50   83:putfield        #140 <Field boolean loading>
		attachedToWindow = false;
	//   51   86:aload_0         
	//   52   87:iconst_0        
	//   53   88:putfield        #142 <Field boolean attachedToWindow>
		faces = ((List) (new ArrayList()));
	//   54   91:aload_0         
	//   55   92:new             #144 <Class ArrayList>
	//   56   95:dup             
	//   57   96:invokespecial   #147 <Method void ArrayList()>
	//   58   99:putfield        #149 <Field List faces>
		currentBannerIndex = 0;
	//   59  102:aload_0         
	//   60  103:iconst_0        
	//   61  104:putfield        #151 <Field int currentBannerIndex>
		mAutoRotation = new _cls1();
	//   62  107:aload_0         
	//   63  108:new             #10  <Class Banner3D$1>
	//   64  111:dup             
	//   65  112:aload_0         
	//   66  113:invokespecial   #154 <Method void Banner3D$1(Banner3D)>
	//   67  116:putfield        #156 <Field Runnable mAutoRotation>
		try
		{
			defaultLoad = flag;
	//   68  119:aload_0         
	//   69  120:iload_2         
	//   70  121:putfield        #136 <Field boolean defaultLoad>
		}
	//*  71  124:aload_3         
	//*  72  125:ifnonnull       144
	//*  73  128:aload_0         
	//*  74  129:new             #186 <Class AdPreferences>
	//*  75  132:dup             
	//*  76  133:invokespecial   #187 <Method void AdPreferences()>
	//*  77  136:putfield        #189 <Field AdPreferences adPreferences>
	//*  78  139:aload_0         
	//*  79  140:invokevirtual   #159 <Method void init()>
	//*  80  143:return          
	//*  81  144:aload_0         
	//*  82  145:aload_3         
	//*  83  146:putfield        #189 <Field AdPreferences adPreferences>
	//*  84  149:goto            139
		// Misplaced declaration of an exception variable
		catch(AdPreferences adpreferences)
	//*  85  152:astore_3        
		{
			f.a(context, d.b, "Banner.init - unexpected error occurd", ((Exception) (adpreferences)).getMessage(), "");
	//   86  153:aload_1         
	//   87  154:getstatic       #165 <Field d d.b>
	//   88  157:ldc1            #167 <String "Banner.init - unexpected error occurd">
	//   89  159:aload_3         
	//   90  160:invokevirtual   #171 <Method String Exception.getMessage()>
	//   91  163:ldc1            #173 <String "">
	//   92  165:invokestatic    #179 <Method void f.a(Context, d, String, String, String)>
			return;
	//   93  168:return          
		}
		if(adpreferences != null)
			break MISSING_BLOCK_LABEL_144;
		adPreferences = new AdPreferences();
_L2:
		init();
		return;
		adPreferences = adpreferences;
		if(true) goto _L2; else goto _L1
_L1:
	}

	private void addAdInformationLayout()
	{
		RelativeLayout relativelayout = new RelativeLayout(getContext());
	//    0    0:new             #217 <Class RelativeLayout>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #221 <Method Context getContext()>
	//    4    8:invokespecial   #222 <Method void RelativeLayout(Context)>
	//    5   11:astore_2        
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(getFaceWidth(), getFaceHeight());
	//    6   12:new             #224 <Class android.widget.RelativeLayout$LayoutParams>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #228 <Method int getFaceWidth()>
	//   10   20:aload_0         
	//   11   21:invokespecial   #231 <Method int getFaceHeight()>
	//   12   24:invokespecial   #234 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   13   27:astore_3        
		layoutparams.addRule(13);
	//   14   28:aload_3         
	//   15   29:bipush          13
	//   16   31:invokevirtual   #238 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		int i = getFaceStartLeft();
	//   17   34:aload_0         
	//   18   35:invokespecial   #241 <Method int getFaceStartLeft()>
	//   19   38:istore_1        
		layoutparams.rightMargin = i;
	//   20   39:aload_3         
	//   21   40:iload_1         
	//   22   41:putfield        #244 <Field int android.widget.RelativeLayout$LayoutParams.rightMargin>
		layoutparams.leftMargin = i;
	//   23   44:aload_3         
	//   24   45:iload_1         
	//   25   46:putfield        #247 <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
		i = getFaceStartTop();
	//   26   49:aload_0         
	//   27   50:invokespecial   #250 <Method int getFaceStartTop()>
	//   28   53:istore_1        
		layoutparams.topMargin = i;
	//   29   54:aload_3         
	//   30   55:iload_1         
	//   31   56:putfield        #253 <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
		layoutparams.bottomMargin = i;
	//   32   59:aload_3         
	//   33   60:iload_1         
	//   34   61:putfield        #256 <Field int android.widget.RelativeLayout$LayoutParams.bottomMargin>
		addView(((android.view.View) (relativelayout)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   35   64:aload_0         
	//   36   65:aload_2         
	//   37   66:aload_3         
	//   38   67:invokevirtual   #260 <Method void addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		(new b(getContext(), com.startapp.android.publish.adsCommon.adinformation.b.b.a, com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_BANNER, overrides)).a(relativelayout);
	//   39   70:new             #262 <Class b>
	//   40   73:dup             
	//   41   74:aload_0         
	//   42   75:invokevirtual   #221 <Method Context getContext()>
	//   43   78:getstatic       #267 <Field com.startapp.android.publish.adsCommon.adinformation.b$b com.startapp.android.publish.adsCommon.adinformation.b$b.a>
	//   44   81:getstatic       #273 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_BANNER>
	//   45   84:aload_0         
	//   46   85:getfield        #275 <Field com.startapp.android.publish.adsCommon.adinformation.c overrides>
	//   47   88:invokespecial   #278 <Method void b(Context, com.startapp.android.publish.adsCommon.adinformation.b$b, com.startapp.android.publish.common.model.AdPreferences$Placement, com.startapp.android.publish.adsCommon.adinformation.c)>
	//   48   91:aload_2         
	//   49   92:invokevirtual   #281 <Method void b.a(RelativeLayout)>
	//   50   95:return          
	}

	private void cleanFaces()
	{
		if(faces != null && !faces.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field List faces>
	//*   2    4:ifnull          59
	//*   3    7:aload_0         
	//*   4    8:getfield        #149 <Field List faces>
	//*   5   11:invokeinterface #288 <Method boolean List.isEmpty()>
	//*   6   16:ifne            59
		{
			Iterator iterator = faces.iterator();
	//    7   19:aload_0         
	//    8   20:getfield        #149 <Field List faces>
	//    9   23:invokeinterface #292 <Method Iterator List.iterator()>
	//   10   28:astore_1        
			do
			{
				if(!iterator.hasNext())
					break;
	//   11   29:aload_1         
	//   12   30:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//   13   35:ifeq            59
				Banner3DFace banner3dface = (Banner3DFace)iterator.next();
	//   14   38:aload_1         
	//   15   39:invokeinterface #301 <Method Object Iterator.next()>
	//   16   44:checkcast       #303 <Class Banner3DFace>
	//   17   47:astore_2        
				if(banner3dface != null)
	//*  18   48:aload_2         
	//*  19   49:ifnull          29
					banner3dface.e();
	//   20   52:aload_2         
	//   21   53:invokevirtual   #306 <Method void Banner3DFace.e()>
			} while(true);
	//   22   56:goto            29
		}
	//   23   59:return          
	}

	private void createFaces(List list)
	{
		cleanFaces();
	//    0    0:aload_0         
	//    1    1:invokespecial   #310 <Method void cleanFaces()>
		removeAllViews();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #313 <Method void removeAllViews()>
		faces = ((List) (new ArrayList()));
	//    4    8:aload_0         
	//    5    9:new             #144 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #147 <Method void ArrayList()>
	//    8   16:putfield        #149 <Field List faces>
		AdDetails addetails;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); faces.add(((Object) (new Banner3DFace(getContext(), ((android.view.ViewGroup) (this)), addetails, getBannerOptions(), new com.startapp.android.publish.adsCommon.d.b(getAdTag()))))))
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #292 <Method Iterator List.iterator()>
	//*  11   25:astore_1        
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            86
			addetails = (AdDetails)((Iterator) (list)).next();
	//   15   35:aload_1         
	//   16   36:invokeinterface #301 <Method Object Iterator.next()>
	//   17   41:checkcast       #315 <Class AdDetails>
	//   18   44:astore_2        

	//   19   45:aload_0         
	//   20   46:getfield        #149 <Field List faces>
	//   21   49:new             #303 <Class Banner3DFace>
	//   22   52:dup             
	//   23   53:aload_0         
	//   24   54:invokevirtual   #221 <Method Context getContext()>
	//   25   57:aload_0         
	//   26   58:aload_2         
	//   27   59:aload_0         
	//   28   60:invokevirtual   #319 <Method BannerOptions getBannerOptions()>
	//   29   63:new             #321 <Class com.startapp.android.publish.adsCommon.d.b>
	//   30   66:dup             
	//   31   67:aload_0         
	//   32   68:invokevirtual   #324 <Method String getAdTag()>
	//   33   71:invokespecial   #327 <Method void com.startapp.android.publish.adsCommon.d.b(String)>
	//   34   74:invokespecial   #330 <Method void Banner3DFace(Context, android.view.ViewGroup, AdDetails, BannerOptions, com.startapp.android.publish.adsCommon.d.b)>
	//   35   77:invokeinterface #334 <Method boolean List.add(Object)>
	//   36   82:pop             
	//*  37   83:goto            26
		currentBannerIndex = 0;
	//   38   86:aload_0         
	//   39   87:iconst_0        
	//   40   88:putfield        #151 <Field int currentBannerIndex>
	//   41   91:return          
	}

	private void dispatchOnDetatchedFromWindow()
	{
		if(faces != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field List faces>
	//*   2    4:ifnull          41
		{
			for(Iterator iterator = faces.iterator(); iterator.hasNext(); ((Banner3DFace)iterator.next()).c());
	//    3    7:aload_0         
	//    4    8:getfield        #149 <Field List faces>
	//    5   11:invokeinterface #292 <Method Iterator List.iterator()>
	//    6   16:astore_1        
	//    7   17:aload_1         
	//    8   18:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            41
	//   10   26:aload_1         
	//   11   27:invokeinterface #301 <Method Object Iterator.next()>
	//   12   32:checkcast       #303 <Class Banner3DFace>
	//   13   35:invokevirtual   #340 <Method void com.startapp.android.publish.ads.banner.banner3d.Banner3DFace.c()>
		}
	//*  14   38:goto            17
	//   15   41:return          
	}

	private void drawFace(Canvas canvas, Bitmap bitmap, int i, int j, int k, int l, float f1, 
			float f2)
	{
		if(camera == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field Camera camera>
	//*   2    4:ifnonnull       18
			camera = new Camera();
	//    3    7:aload_0         
	//    4    8:new             #344 <Class Camera>
	//    5   11:dup             
	//    6   12:invokespecial   #345 <Method void Camera()>
	//    7   15:putfield        #109 <Field Camera camera>
		camera.save();
	//    8   18:aload_0         
	//    9   19:getfield        #109 <Field Camera camera>
	//   10   22:invokevirtual   #348 <Method void Camera.save()>
		camera.translate(0.0F, 0.0F, l);
	//   11   25:aload_0         
	//   12   26:getfield        #109 <Field Camera camera>
	//   13   29:fconst_0        
	//   14   30:fconst_0        
	//   15   31:iload           6
	//   16   33:i2f             
	//   17   34:invokevirtual   #352 <Method void Camera.translate(float, float, float)>
		camera.rotateX(f2);
	//   18   37:aload_0         
	//   19   38:getfield        #109 <Field Camera camera>
	//   20   41:fload           8
	//   21   43:invokevirtual   #356 <Method void Camera.rotateX(float)>
		camera.translate(0.0F, 0.0F, -l);
	//   22   46:aload_0         
	//   23   47:getfield        #109 <Field Camera camera>
	//   24   50:fconst_0        
	//   25   51:fconst_0        
	//   26   52:iload           6
	//   27   54:ineg            
	//   28   55:i2f             
	//   29   56:invokevirtual   #352 <Method void Camera.translate(float, float, float)>
		if(matrix == null)
	//*  30   59:aload_0         
	//*  31   60:getfield        #111 <Field Matrix matrix>
	//*  32   63:ifnonnull       77
			matrix = new Matrix();
	//   33   66:aload_0         
	//   34   67:new             #358 <Class Matrix>
	//   35   70:dup             
	//   36   71:invokespecial   #359 <Method void Matrix()>
	//   37   74:putfield        #111 <Field Matrix matrix>
		camera.getMatrix(matrix);
	//   38   77:aload_0         
	//   39   78:getfield        #109 <Field Camera camera>
	//   40   81:aload_0         
	//   41   82:getfield        #111 <Field Matrix matrix>
	//   42   85:invokevirtual   #363 <Method void Camera.getMatrix(Matrix)>
		camera.restore();
	//   43   88:aload_0         
	//   44   89:getfield        #109 <Field Camera camera>
	//   45   92:invokevirtual   #366 <Method void Camera.restore()>
		matrix.preTranslate(-k, -l);
	//   46   95:aload_0         
	//   47   96:getfield        #111 <Field Matrix matrix>
	//   48   99:iload           5
	//   49  101:ineg            
	//   50  102:i2f             
	//   51  103:iload           6
	//   52  105:ineg            
	//   53  106:i2f             
	//   54  107:invokevirtual   #370 <Method boolean Matrix.preTranslate(float, float)>
	//   55  110:pop             
		matrix.postScale(f1, f1);
	//   56  111:aload_0         
	//   57  112:getfield        #111 <Field Matrix matrix>
	//   58  115:fload           7
	//   59  117:fload           7
	//   60  119:invokevirtual   #373 <Method boolean Matrix.postScale(float, float)>
	//   61  122:pop             
		matrix.postTranslate(j + k, i + l);
	//   62  123:aload_0         
	//   63  124:getfield        #111 <Field Matrix matrix>
	//   64  127:iload           4
	//   65  129:iload           5
	//   66  131:iadd            
	//   67  132:i2f             
	//   68  133:iload_3         
	//   69  134:iload           6
	//   70  136:iadd            
	//   71  137:i2f             
	//   72  138:invokevirtual   #376 <Method boolean Matrix.postTranslate(float, float)>
	//   73  141:pop             
		canvas.drawBitmap(bitmap, matrix, paint);
	//   74  142:aload_1         
	//   75  143:aload_2         
	//   76  144:aload_0         
	//   77  145:getfield        #111 <Field Matrix matrix>
	//   78  148:aload_0         
	//   79  149:getfield        #113 <Field Paint paint>
	//   80  152:invokevirtual   #382 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
	//   81  155:return          
	}

	private void drawFrame(Canvas canvas)
	{
		float f1;
		int i;
		int j;
		int k;
		int l;
		Bitmap bitmap;
		Bitmap bitmap1;
		i = getFaceWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #228 <Method int getFaceWidth()>
	//    2    4:istore_3        
		j = getFaceHeight();
	//    3    5:aload_0         
	//    4    6:invokespecial   #231 <Method int getFaceHeight()>
	//    5    9:istore          4
		k = getFaceStartLeft();
	//    6   11:aload_0         
	//    7   12:invokespecial   #241 <Method int getFaceStartLeft()>
	//    8   15:istore          5
		l = getFaceStartTop();
	//    9   17:aload_0         
	//   10   18:invokespecial   #250 <Method int getFaceStartTop()>
	//   11   21:istore          6
		f1 = options.l() + (float)Math.pow(Math.abs(rotation - 45F) / 45F, options.m()) * (1.0F - options.l());
	//   12   23:aload_0         
	//   13   24:getfield        #386 <Field BannerOptions options>
	//   14   27:invokevirtual   #392 <Method float BannerOptions.l()>
	//   15   30:aload_0         
	//   16   31:getfield        #116 <Field float rotation>
	//   17   34:ldc1            #114 <Float 45F>
	//   18   36:fsub            
	//   19   37:invokestatic    #398 <Method float Math.abs(float)>
	//   20   40:ldc1            #114 <Float 45F>
	//   21   42:fdiv            
	//   22   43:f2d             
	//   23   44:aload_0         
	//   24   45:getfield        #386 <Field BannerOptions options>
	//   25   48:invokevirtual   #401 <Method int BannerOptions.m()>
	//   26   51:i2d             
	//   27   52:invokestatic    #405 <Method double Math.pow(double, double)>
	//   28   55:d2f             
	//   29   56:fconst_1        
	//   30   57:aload_0         
	//   31   58:getfield        #386 <Field BannerOptions options>
	//   32   61:invokevirtual   #392 <Method float BannerOptions.l()>
	//   33   64:fsub            
	//   34   65:fmul            
	//   35   66:fadd            
	//   36   67:fstore_2        
		if(!firstRotationFinished)
	//*  37   68:aload_0         
	//*  38   69:getfield        #126 <Field boolean firstRotationFinished>
	//*  39   72:ifne            83
			f1 = options.l();
	//   40   75:aload_0         
	//   41   76:getfield        #386 <Field BannerOptions options>
	//   42   79:invokevirtual   #392 <Method float BannerOptions.l()>
	//   43   82:fstore_2        
		bitmap = getPreviousBitmap();
	//   44   83:aload_0         
	//   45   84:invokespecial   #409 <Method Bitmap getPreviousBitmap()>
	//   46   87:astore          7
		bitmap1 = getCurrentBitmap();
	//   47   89:aload_0         
	//   48   90:invokespecial   #412 <Method Bitmap getCurrentBitmap()>
	//   49   93:astore          8
		if(bitmap1 == null || bitmap == null)
			break MISSING_BLOCK_LABEL_310;
	//   50   95:aload           8
	//   51   97:ifnull          310
	//   52  100:aload           7
	//   53  102:ifnull          310
		if(rotation < 45F)
	//*  54  105:aload_0         
	//*  55  106:getfield        #116 <Field float rotation>
	//*  56  109:ldc1            #114 <Float 45F>
	//*  57  111:fcmpg           
	//*  58  112:ifge            201
		{
			if(rotation > 3F)
	//*  59  115:aload_0         
	//*  60  116:getfield        #116 <Field float rotation>
	//*  61  119:ldc2            #413 <Float 3F>
	//*  62  122:fcmpl           
	//*  63  123:ifle            165
				drawFace(canvas, bitmap1, l, k, i / 2, j / 2, f1, (rotation - 90F) * (float)options.n().getRotationMultiplier());
	//   64  126:aload_0         
	//   65  127:aload_1         
	//   66  128:aload           8
	//   67  130:iload           6
	//   68  132:iload           5
	//   69  134:iload_3         
	//   70  135:iconst_2        
	//   71  136:idiv            
	//   72  137:iload           4
	//   73  139:iconst_2        
	//   74  140:idiv            
	//   75  141:fload_2         
	//   76  142:aload_0         
	//   77  143:getfield        #116 <Field float rotation>
	//   78  146:ldc2            #414 <Float 90F>
	//   79  149:fsub            
	//   80  150:aload_0         
	//   81  151:getfield        #386 <Field BannerOptions options>
	//   82  154:invokevirtual   #418 <Method com.startapp.android.publish.ads.banner.BannerOptions$Effect BannerOptions.n()>
	//   83  157:invokevirtual   #423 <Method int com.startapp.android.publish.ads.banner.BannerOptions$Effect.getRotationMultiplier()>
	//   84  160:i2f             
	//   85  161:fmul            
	//   86  162:invokespecial   #425 <Method void drawFace(Canvas, Bitmap, int, int, int, int, float, float)>
			drawFace(canvas, bitmap, l, k, i / 2, j / 2, f1, rotation * (float)options.n().getRotationMultiplier());
	//   87  165:aload_0         
	//   88  166:aload_1         
	//   89  167:aload           7
	//   90  169:iload           6
	//   91  171:iload           5
	//   92  173:iload_3         
	//   93  174:iconst_2        
	//   94  175:idiv            
	//   95  176:iload           4
	//   96  178:iconst_2        
	//   97  179:idiv            
	//   98  180:fload_2         
	//   99  181:aload_0         
	//  100  182:getfield        #116 <Field float rotation>
	//  101  185:aload_0         
	//  102  186:getfield        #386 <Field BannerOptions options>
	//  103  189:invokevirtual   #418 <Method com.startapp.android.publish.ads.banner.BannerOptions$Effect BannerOptions.n()>
	//  104  192:invokevirtual   #423 <Method int com.startapp.android.publish.ads.banner.BannerOptions$Effect.getRotationMultiplier()>
	//  105  195:i2f             
	//  106  196:fmul            
	//  107  197:invokespecial   #425 <Method void drawFace(Canvas, Bitmap, int, int, int, int, float, float)>
			return;
	//  108  200:return          
		}
		try
		{
			if(rotation < 87F)
	//* 109  201:aload_0         
	//* 110  202:getfield        #116 <Field float rotation>
	//* 111  205:ldc2            #426 <Float 87F>
	//* 112  208:fcmpg           
	//* 113  209:ifge            247
				drawFace(canvas, bitmap, l, k, i / 2, j / 2, f1, rotation * (float)options.n().getRotationMultiplier());
	//  114  212:aload_0         
	//  115  213:aload_1         
	//  116  214:aload           7
	//  117  216:iload           6
	//  118  218:iload           5
	//  119  220:iload_3         
	//  120  221:iconst_2        
	//  121  222:idiv            
	//  122  223:iload           4
	//  123  225:iconst_2        
	//  124  226:idiv            
	//  125  227:fload_2         
	//  126  228:aload_0         
	//  127  229:getfield        #116 <Field float rotation>
	//  128  232:aload_0         
	//  129  233:getfield        #386 <Field BannerOptions options>
	//  130  236:invokevirtual   #418 <Method com.startapp.android.publish.ads.banner.BannerOptions$Effect BannerOptions.n()>
	//  131  239:invokevirtual   #423 <Method int com.startapp.android.publish.ads.banner.BannerOptions$Effect.getRotationMultiplier()>
	//  132  242:i2f             
	//  133  243:fmul            
	//  134  244:invokespecial   #425 <Method void drawFace(Canvas, Bitmap, int, int, int, int, float, float)>
			drawFace(canvas, bitmap1, l, k, i / 2, j / 2, f1, (rotation - 90F) * (float)options.n().getRotationMultiplier());
	//  135  247:aload_0         
	//  136  248:aload_1         
	//  137  249:aload           8
	//  138  251:iload           6
	//  139  253:iload           5
	//  140  255:iload_3         
	//  141  256:iconst_2        
	//  142  257:idiv            
	//  143  258:iload           4
	//  144  260:iconst_2        
	//  145  261:idiv            
	//  146  262:fload_2         
	//  147  263:aload_0         
	//  148  264:getfield        #116 <Field float rotation>
	//  149  267:ldc2            #414 <Float 90F>
	//  150  270:fsub            
	//  151  271:aload_0         
	//  152  272:getfield        #386 <Field BannerOptions options>
	//  153  275:invokevirtual   #418 <Method com.startapp.android.publish.ads.banner.BannerOptions$Effect BannerOptions.n()>
	//  154  278:invokevirtual   #423 <Method int com.startapp.android.publish.ads.banner.BannerOptions$Effect.getRotationMultiplier()>
	//  155  281:i2f             
	//  156  282:fmul            
	//  157  283:invokespecial   #425 <Method void drawFace(Canvas, Bitmap, int, int, int, int, float, float)>
			if(!firstRotation)
	//* 158  286:aload_0         
	//* 159  287:getfield        #124 <Field boolean firstRotation>
	//* 160  290:ifne            310
			{
				firstRotationFinished = true;
	//  161  293:aload_0         
	//  162  294:iconst_1        
	//  163  295:putfield        #126 <Field boolean firstRotationFinished>
				return;
	//  164  298:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(Canvas canvas)
	//* 165  299:astore_1        
		{
			g.a("Banner3D", 6, "Exception onDraw Banner3D");
	//  166  300:ldc1            #25  <String "Banner3D">
	//  167  302:bipush          6
	//  168  304:ldc2            #428 <String "Exception onDraw Banner3D">
	//  169  307:invokestatic    #433 <Method void g.a(String, int, String)>
		}
	//  170  310:return          
	}

	private Bitmap getCurrentBitmap()
	{
		return ((Banner3DFace)faces.get(getCurrentBannerIndex())).b();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field List faces>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #436 <Method int getCurrentBannerIndex()>
	//    4    8:invokeinterface #440 <Method Object List.get(int)>
	//    5   13:checkcast       #303 <Class Banner3DFace>
	//    6   16:invokevirtual   #442 <Method Bitmap com.startapp.android.publish.ads.banner.banner3d.Banner3DFace.b()>
	//    7   19:areturn         
	}

	private int getFaceHeight()
	{
		return (int)((float)h.a(getContext(), options.e()) * options.k());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #221 <Method Context getContext()>
	//    2    4:aload_0         
	//    3    5:getfield        #386 <Field BannerOptions options>
	//    4    8:invokevirtual   #444 <Method int BannerOptions.e()>
	//    5   11:invokestatic    #449 <Method int h.a(Context, int)>
	//    6   14:i2f             
	//    7   15:aload_0         
	//    8   16:getfield        #386 <Field BannerOptions options>
	//    9   19:invokevirtual   #452 <Method float BannerOptions.k()>
	//   10   22:fmul            
	//   11   23:f2i             
	//   12   24:ireturn         
	}

	private int getFaceStartLeft()
	{
		return (getWidth() - getFaceWidth()) / 2;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #455 <Method int getWidth()>
	//    2    4:aload_0         
	//    3    5:invokespecial   #228 <Method int getFaceWidth()>
	//    4    8:isub            
	//    5    9:iconst_2        
	//    6   10:idiv            
	//    7   11:ireturn         
	}

	private int getFaceStartTop()
	{
		return (getHeight() - getFaceHeight()) / 2;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #458 <Method int getHeight()>
	//    2    4:aload_0         
	//    3    5:invokespecial   #231 <Method int getFaceHeight()>
	//    4    8:isub            
	//    5    9:iconst_2        
	//    6   10:idiv            
	//    7   11:ireturn         
	}

	private int getFaceWidth()
	{
		return (int)((float)h.a(getContext(), options.d()) * options.j());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #221 <Method Context getContext()>
	//    2    4:aload_0         
	//    3    5:getfield        #386 <Field BannerOptions options>
	//    4    8:invokevirtual   #461 <Method int BannerOptions.d()>
	//    5   11:invokestatic    #449 <Method int h.a(Context, int)>
	//    6   14:i2f             
	//    7   15:aload_0         
	//    8   16:getfield        #386 <Field BannerOptions options>
	//    9   19:invokevirtual   #464 <Method float BannerOptions.j()>
	//   10   22:fmul            
	//   11   23:f2i             
	//   12   24:ireturn         
	}

	private Bitmap getPreviousBitmap()
	{
		int i = getCurrentBannerIndex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #436 <Method int getCurrentBannerIndex()>
	//    2    4:istore_1        
		int j = faces.size();
	//    3    5:aload_0         
	//    4    6:getfield        #149 <Field List faces>
	//    5    9:invokeinterface #467 <Method int List.size()>
	//    6   14:istore_2        
		int k = faces.size();
	//    7   15:aload_0         
	//    8   16:getfield        #149 <Field List faces>
	//    9   19:invokeinterface #467 <Method int List.size()>
	//   10   24:istore_3        
		return ((Banner3DFace)faces.get(((i - 1) + j) % k)).b();
	//   11   25:aload_0         
	//   12   26:getfield        #149 <Field List faces>
	//   13   29:iload_1         
	//   14   30:iconst_1        
	//   15   31:isub            
	//   16   32:iload_2         
	//   17   33:iadd            
	//   18   34:iload_3         
	//   19   35:irem            
	//   20   36:invokeinterface #440 <Method Object List.get(int)>
	//   21   41:checkcast       #303 <Class Banner3DFace>
	//   22   44:invokevirtual   #442 <Method Bitmap com.startapp.android.publish.ads.banner.banner3d.Banner3DFace.b()>
	//   23   47:areturn         
	}

	private int getTotalBaners()
	{
		return faces.size();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field List faces>
	//    2    4:invokeinterface #467 <Method int List.size()>
	//    3    9:ireturn         
	}

	private void initFaces(List list)
	{
		if(shouldCreateFaces())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #472 <Method boolean shouldCreateFaces()>
	//*   2    4:ifeq            13
		{
			createFaces(list);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #474 <Method void createFaces(List)>
			return;
	//    6   12:return          
		} else
		{
			initFacesViews();
	//    7   13:aload_0         
	//    8   14:invokespecial   #477 <Method void initFacesViews()>
			return;
	//    9   17:return          
		}
	}

	private void initFacesViews()
	{
		for(Iterator iterator = faces.iterator(); iterator.hasNext(); ((Banner3DFace)iterator.next()).a(getContext(), getBannerOptions(), ((android.view.ViewGroup) (this))));
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field List faces>
	//    2    4:invokeinterface #292 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            43
	//    7   19:aload_1         
	//    8   20:invokeinterface #301 <Method Object Iterator.next()>
	//    9   25:checkcast       #303 <Class Banner3DFace>
	//   10   28:aload_0         
	//   11   29:invokevirtual   #221 <Method Context getContext()>
	//   12   32:aload_0         
	//   13   33:invokevirtual   #319 <Method BannerOptions getBannerOptions()>
	//   14   36:aload_0         
	//   15   37:invokevirtual   #480 <Method void Banner3DFace.a(Context, BannerOptions, android.view.ViewGroup)>
	//*  16   40:goto            10
	//   17   43:return          
	}

	private boolean isEventInsideBanner(MotionEvent motionevent)
	{
		int i = getFaceWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #228 <Method int getFaceWidth()>
	//    2    4:istore_2        
		int j = getFaceHeight();
	//    3    5:aload_0         
	//    4    6:invokespecial   #231 <Method int getFaceHeight()>
	//    5    9:istore_3        
		int k = getFaceStartLeft();
	//    6   10:aload_0         
	//    7   11:invokespecial   #241 <Method int getFaceStartLeft()>
	//    8   14:istore          4
		int l = getFaceStartTop();
	//    9   16:aload_0         
	//   10   17:invokespecial   #250 <Method int getFaceStartTop()>
	//   11   20:istore          5
		return motionevent.getX() >= (float)k && motionevent.getY() >= (float)l && motionevent.getX() <= (float)(i + k) && motionevent.getY() <= (float)(j + l);
	//   12   22:aload_1         
	//   13   23:invokevirtual   #487 <Method float MotionEvent.getX()>
	//   14   26:iload           4
	//   15   28:i2f             
	//   16   29:fcmpl           
	//   17   30:iflt            72
	//   18   33:aload_1         
	//   19   34:invokevirtual   #490 <Method float MotionEvent.getY()>
	//   20   37:iload           5
	//   21   39:i2f             
	//   22   40:fcmpl           
	//   23   41:iflt            72
	//   24   44:aload_1         
	//   25   45:invokevirtual   #487 <Method float MotionEvent.getX()>
	//   26   48:iload_2         
	//   27   49:iload           4
	//   28   51:iadd            
	//   29   52:i2f             
	//   30   53:fcmpg           
	//   31   54:ifgt            72
	//   32   57:aload_1         
	//   33   58:invokevirtual   #490 <Method float MotionEvent.getY()>
	//   34   61:iload_3         
	//   35   62:iload           5
	//   36   64:iadd            
	//   37   65:i2f             
	//   38   66:fcmpg           
	//   39   67:ifgt            72
	//   40   70:iconst_1        
	//   41   71:ireturn         
	//   42   72:iconst_0        
	//   43   73:ireturn         
	}

	private void makeImpression(Banner3DFace banner3dface)
	{
		banner3dface = ((Banner3DFace) (banner3dface.a(getContext())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #221 <Method Context getContext()>
	//    3    5:invokevirtual   #493 <Method com.startapp.android.publish.adsCommon.i Banner3DFace.a(Context)>
	//    4    8:astore_1        
		if(banner3dface != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          27
		{
			g.a("Banner3D", 3, "Banner3D Scheduling visibility check");
	//    7   13:ldc1            #25  <String "Banner3D">
	//    8   15:iconst_3        
	//    9   16:ldc2            #495 <String "Banner3D Scheduling visibility check">
	//   10   19:invokestatic    #433 <Method void g.a(String, int, String)>
			startVisibilityRunnable(((com.startapp.android.publish.adsCommon.i) (banner3dface)));
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #499 <Method void startVisibilityRunnable(com.startapp.android.publish.adsCommon.i)>
		}
	//   14   27:return          
	}

	private void nextBanner()
	{
		currentBannerIndex = (currentBannerIndex + 1) % getTotalBaners();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #151 <Field int currentBannerIndex>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:aload_0         
	//    6    8:invokespecial   #502 <Method int getTotalBaners()>
	//    7   11:irem            
	//    8   12:putfield        #151 <Field int currentBannerIndex>
	//    9   15:return          
	}

	private void prevBanner()
	{
		currentBannerIndex = ((currentBannerIndex - 1) + getTotalBaners()) % getTotalBaners();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #151 <Field int currentBannerIndex>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:aload_0         
	//    6    8:invokespecial   #502 <Method int getTotalBaners()>
	//    7   11:iadd            
	//    8   12:aload_0         
	//    9   13:invokespecial   #502 <Method int getTotalBaners()>
	//   10   16:irem            
	//   11   17:putfield        #151 <Field int currentBannerIndex>
	//   12   20:return          
	}

	private boolean setBannerSize(com.startapp.android.publish.ads.banner.d d1)
	{
		return Banner3DSize.a(getContext(), getParent(), getBannerOptions(), this, d1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #221 <Method Context getContext()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #509 <Method android.view.ViewParent getParent()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #319 <Method BannerOptions getBannerOptions()>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #514 <Method boolean Banner3DSize.a(Context, android.view.ViewParent, BannerOptions, Banner3D, com.startapp.android.publish.ads.banner.d)>
	//    9   17:ireturn         
	}

	private boolean shouldCreateFaces()
	{
		return faces == null || faces.size() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field List faces>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #149 <Field List faces>
	//    5   11:invokeinterface #467 <Method int List.size()>
	//    6   16:ifne            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	private void startRotation()
	{
		if(attachedToWindow && drawn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #142 <Field boolean attachedToWindow>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:getfield        #194 <Field boolean drawn>
	//*   5   11:ifeq            32
		{
			removeCallbacks(mAutoRotation);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #156 <Field Runnable mAutoRotation>
	//    9   19:invokevirtual   #519 <Method boolean removeCallbacks(Runnable)>
	//   10   22:pop             
			post(mAutoRotation);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #156 <Field Runnable mAutoRotation>
	//   14   28:invokevirtual   #522 <Method boolean post(Runnable)>
	//   15   31:pop             
		}
	//   16   32:return          
	}

	protected int getBannerId()
	{
		return innerBanner3dId;
	//    0    0:aload_0         
	//    1    1:getfield        #526 <Field int innerBanner3dId>
	//    2    4:ireturn         
	}

	protected String getBannerName()
	{
		return "StartApp Banner3D";
	//    0    0:ldc2            #529 <String "StartApp Banner3D">
	//    1    3:areturn         
	}

	protected BannerOptions getBannerOptions()
	{
		return options;
	//    0    0:aload_0         
	//    1    1:getfield        #386 <Field BannerOptions options>
	//    2    4:areturn         
	}

	protected int getCurrentBannerIndex()
	{
		return currentBannerIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field int currentBannerIndex>
	//    2    4:ireturn         
	}

	protected int getHeightInDp()
	{
		return 50;
	//    0    0:bipush          50
	//    1    2:ireturn         
	}

	protected int getNextBannerIndex()
	{
		return (currentBannerIndex + 1) % getTotalBaners();
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field int currentBannerIndex>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:aload_0         
	//    5    7:invokespecial   #502 <Method int getTotalBaners()>
	//    6   10:irem            
	//    7   11:ireturn         
	}

	protected int getOffset()
	{
		if(ads == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #534 <Field a ads>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ads.a();
	//    5    9:aload_0         
	//    6   10:getfield        #534 <Field a ads>
	//    7   13:invokevirtual   #538 <Method int a.a()>
	//    8   16:ireturn         
	}

	protected int getRefreshRate()
	{
		return c.a().b().h();
	//    0    0:invokestatic    #544 <Method c c.a()>
	//    1    3:invokevirtual   #546 <Method BannerOptions c.b()>
	//    2    6:invokevirtual   #549 <Method int BannerOptions.h()>
	//    3    9:ireturn         
	}

	protected int getWidthInDp()
	{
		return 300;
	//    0    0:sipush          300
	//    1    3:ireturn         
	}

	public void hideBanner()
	{
		visible = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #134 <Field boolean visible>
		setVisibility(8);
	//    3    5:aload_0         
	//    4    6:bipush          8
	//    5    8:invokevirtual   #554 <Method void setVisibility(int)>
	//    6   11:return          
	}

	protected void initRuntime()
	{
		if(!loading)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field boolean loading>
	//*   2    4:ifne            116
		{
			options = c.a().c();
	//    3    7:aload_0         
	//    4    8:invokestatic    #544 <Method c c.a()>
	//    5   11:invokevirtual   #557 <Method BannerOptions c.c()>
	//    6   14:putfield        #386 <Field BannerOptions options>
			adsItems = ((List) (new ArrayList()));
	//    7   17:aload_0         
	//    8   18:new             #144 <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #147 <Method void ArrayList()>
	//   11   25:putfield        #559 <Field List adsItems>
			if(adPreferences == null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #189 <Field AdPreferences adPreferences>
	//*  14   32:ifnonnull       46
				adPreferences = new AdPreferences();
	//   15   35:aload_0         
	//   16   36:new             #186 <Class AdPreferences>
	//   17   39:dup             
	//   18   40:invokespecial   #187 <Method void AdPreferences()>
	//   19   43:putfield        #189 <Field AdPreferences adPreferences>
			overrides = com.startapp.android.publish.adsCommon.adinformation.c.a();
	//   20   46:aload_0         
	//   21   47:invokestatic    #564 <Method com.startapp.android.publish.adsCommon.adinformation.c com.startapp.android.publish.adsCommon.adinformation.c.a()>
	//   22   50:putfield        #275 <Field com.startapp.android.publish.adsCommon.adinformation.c overrides>
			cleanFaces();
	//   23   53:aload_0         
	//   24   54:invokespecial   #310 <Method void cleanFaces()>
			faces = ((List) (new ArrayList()));
	//   25   57:aload_0         
	//   26   58:new             #144 <Class ArrayList>
	//   27   61:dup             
	//   28   62:invokespecial   #147 <Method void ArrayList()>
	//   29   65:putfield        #149 <Field List faces>
			loading = true;
	//   30   68:aload_0         
	//   31   69:iconst_1        
	//   32   70:putfield        #140 <Field boolean loading>
			setBackgroundColor(0);
	//   33   73:aload_0         
	//   34   74:iconst_0        
	//   35   75:invokevirtual   #567 <Method void setBackgroundColor(int)>
			if(getId() == -1)
	//*  36   78:aload_0         
	//*  37   79:invokevirtual   #570 <Method int getId()>
	//*  38   82:iconst_m1       
	//*  39   83:icmpne          94
				setId(getBannerId());
	//   40   86:aload_0         
	//   41   87:aload_0         
	//   42   88:invokevirtual   #572 <Method int getBannerId()>
	//   43   91:invokevirtual   #575 <Method void setId(int)>
			(new Handler()).postDelayed(new Runnable() {

				public void run()
				{
					if(defaultLoad)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field Banner3D this$0>
				//*   2    4:getfield        #25  <Field boolean Banner3D.defaultLoad>
				//*   3    7:ifeq            31
					{
						setHardwareAcceleration(adPreferences);
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field Banner3D this$0>
				//    6   14:aload_0         
				//    7   15:getfield        #17  <Field Banner3D this$0>
				//    8   18:getfield        #29  <Field AdPreferences Banner3D.adPreferences>
				//    9   21:invokestatic    #33  <Method void Banner3D.access$300(Banner3D, AdPreferences)>
						loadBanner();
				//   10   24:aload_0         
				//   11   25:getfield        #17  <Field Banner3D this$0>
				//   12   28:invokestatic    #36  <Method void Banner3D.access$400(Banner3D)>
					}
				//   13   31:return          
				}

				final Banner3D this$0;

			
			{
				this$0 = Banner3D.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Banner3D this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
, 200L);
	//   44   94:new             #577 <Class Handler>
	//   45   97:dup             
	//   46   98:invokespecial   #578 <Method void Handler()>
	//   47  101:new             #12  <Class Banner3D$2>
	//   48  104:dup             
	//   49  105:aload_0         
	//   50  106:invokespecial   #579 <Method void Banner3D$2(Banner3D)>
	//   51  109:ldc2w           #580 <Long 200L>
	//   52  112:invokevirtual   #585 <Method boolean Handler.postDelayed(Runnable, long)>
	//   53  115:pop             
		}
	//   54  116:return          
	}

	protected void loadBanners(List list, boolean flag)
	{
		adsItems = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #559 <Field List adsItems>
		if(list == null) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:ifnull          342
_L1:
		com.startapp.android.publish.ads.banner.d d1 = new com.startapp.android.publish.ads.banner.d();
	//    5    9:new             #589 <Class com.startapp.android.publish.ads.banner.d>
	//    6   12:dup             
	//    7   13:invokespecial   #590 <Method void com.startapp.android.publish.ads.banner.d()>
	//    8   16:astore_3        
		if(!setBannerSize(d1)) goto _L4; else goto _L3
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokespecial   #592 <Method boolean setBannerSize(com.startapp.android.publish.ads.banner.d)>
	//   12   22:ifeq            297
_L3:
		setMinimumWidth(h.a(getContext(), options.d()));
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #221 <Method Context getContext()>
	//   16   30:aload_0         
	//   17   31:getfield        #386 <Field BannerOptions options>
	//   18   34:invokevirtual   #461 <Method int BannerOptions.d()>
	//   19   37:invokestatic    #449 <Method int h.a(Context, int)>
	//   20   40:invokevirtual   #595 <Method void setMinimumWidth(int)>
		setMinimumHeight(h.a(getContext(), options.e()));
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:invokevirtual   #221 <Method Context getContext()>
	//   24   48:aload_0         
	//   25   49:getfield        #386 <Field BannerOptions options>
	//   26   52:invokevirtual   #444 <Method int BannerOptions.e()>
	//   27   55:invokestatic    #449 <Method int h.a(Context, int)>
	//   28   58:invokevirtual   #598 <Method void setMinimumHeight(int)>
		if(getLayoutParams() != null && getLayoutParams().width == -1)
	//*  29   61:aload_0         
	//*  30   62:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  31   65:ifnull          94
	//*  32   68:aload_0         
	//*  33   69:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  34   72:getfield        #607 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  35   75:iconst_m1       
	//*  36   76:icmpne          94
			setMinimumWidth(h.a(getContext(), d1.a()));
	//   37   79:aload_0         
	//   38   80:aload_0         
	//   39   81:invokevirtual   #221 <Method Context getContext()>
	//   40   84:aload_3         
	//   41   85:invokevirtual   #608 <Method int com.startapp.android.publish.ads.banner.d.a()>
	//   42   88:invokestatic    #449 <Method int h.a(Context, int)>
	//   43   91:invokevirtual   #595 <Method void setMinimumWidth(int)>
		if(getLayoutParams() != null && getLayoutParams().height == -1)
	//*  44   94:aload_0         
	//*  45   95:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  46   98:ifnull          127
	//*  47  101:aload_0         
	//*  48  102:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  49  105:getfield        #611 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  50  108:iconst_m1       
	//*  51  109:icmpne          127
			setMinimumHeight(h.a(getContext(), d1.b()));
	//   52  112:aload_0         
	//   53  113:aload_0         
	//   54  114:invokevirtual   #221 <Method Context getContext()>
	//   55  117:aload_3         
	//   56  118:invokevirtual   #613 <Method int com.startapp.android.publish.ads.banner.d.b()>
	//   57  121:invokestatic    #449 <Method int h.a(Context, int)>
	//   58  124:invokevirtual   #598 <Method void setMinimumHeight(int)>
		if(getLayoutParams() != null)
	//*  59  127:aload_0         
	//*  60  128:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  61  131:ifnull          204
		{
			if(getLayoutParams().width > 0)
	//*  62  134:aload_0         
	//*  63  135:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  64  138:getfield        #607 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  65  141:ifle            155
				setMinimumWidth(getLayoutParams().width);
	//   66  144:aload_0         
	//   67  145:aload_0         
	//   68  146:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   69  149:getfield        #607 <Field int android.view.ViewGroup$LayoutParams.width>
	//   70  152:invokevirtual   #595 <Method void setMinimumWidth(int)>
			if(getLayoutParams().height > 0)
	//*  71  155:aload_0         
	//*  72  156:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  73  159:getfield        #611 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  74  162:ifle            176
				setMinimumHeight(getLayoutParams().height);
	//   75  165:aload_0         
	//   76  166:aload_0         
	//   77  167:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   78  170:getfield        #611 <Field int android.view.ViewGroup$LayoutParams.height>
	//   79  173:invokevirtual   #598 <Method void setMinimumHeight(int)>
			if(getLayoutParams().width > 0 && getLayoutParams().height > 0)
	//*  80  176:aload_0         
	//*  81  177:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  82  180:getfield        #607 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  83  183:ifle            204
	//*  84  186:aload_0         
	//*  85  187:invokevirtual   #602 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  86  190:getfield        #611 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  87  193:ifle            204
				ads.a(true);
	//   88  196:aload_0         
	//   89  197:getfield        #534 <Field a ads>
	//   90  200:iconst_1        
	//   91  201:invokevirtual   #616 <Method void a.a(boolean)>
		}
		initFaces(list);
	//   92  204:aload_0         
	//   93  205:aload_1         
	//   94  206:invokespecial   #618 <Method void initFaces(List)>
		addAdInformationLayout();
	//   95  209:aload_0         
	//   96  210:invokespecial   #620 <Method void addAdInformationLayout()>
		if(paint == null)
	//*  97  213:aload_0         
	//*  98  214:getfield        #113 <Field Paint paint>
	//*  99  217:ifnonnull       247
		{
			paint = new Paint();
	//  100  220:aload_0         
	//  101  221:new             #622 <Class Paint>
	//  102  224:dup             
	//  103  225:invokespecial   #623 <Method void Paint()>
	//  104  228:putfield        #113 <Field Paint paint>
			paint.setAntiAlias(true);
	//  105  231:aload_0         
	//  106  232:getfield        #113 <Field Paint paint>
	//  107  235:iconst_1        
	//  108  236:invokevirtual   #626 <Method void Paint.setAntiAlias(boolean)>
			paint.setFilterBitmap(true);
	//  109  239:aload_0         
	//  110  240:getfield        #113 <Field Paint paint>
	//  111  243:iconst_1        
	//  112  244:invokevirtual   #629 <Method void Paint.setFilterBitmap(boolean)>
		}
		if(!animation)
	//* 113  247:aload_0         
	//* 114  248:getfield        #132 <Field boolean animation>
	//* 115  251:ifne            263
		{
			animation = true;
	//  116  254:aload_0         
	//  117  255:iconst_1        
	//  118  256:putfield        #132 <Field boolean animation>
			startRotation();
	//  119  259:aload_0         
	//  120  260:invokespecial   #631 <Method void startRotation()>
		}
		if(visible)
	//* 121  263:aload_0         
	//* 122  264:getfield        #134 <Field boolean visible>
	//* 123  267:ifeq            275
			setVisibility(0);
	//  124  270:aload_0         
	//  125  271:iconst_0        
	//  126  272:invokevirtual   #554 <Method void setVisibility(int)>
		if(listener != null && flag)
	//* 127  275:aload_0         
	//* 128  276:getfield        #633 <Field BannerListener listener>
	//* 129  279:ifnull          296
	//* 130  282:iload_2         
	//* 131  283:ifeq            296
			listener.onReceiveAd(((android.view.View) (this)));
	//  132  286:aload_0         
	//  133  287:getfield        #633 <Field BannerListener listener>
	//  134  290:aload_0         
	//  135  291:invokeinterface #639 <Method void BannerListener.onReceiveAd(android.view.View)>
_L6:
		return;
	//  136  296:return          
_L4:
		g.a("Banner3D", 6, "Banner3DError in banner screen size");
	//  137  297:ldc1            #25  <String "Banner3D">
	//  138  299:bipush          6
	//  139  301:ldc2            #641 <String "Banner3DError in banner screen size">
	//  140  304:invokestatic    #433 <Method void g.a(String, int, String)>
		setErrorMessage("Error in banner screen size");
	//  141  307:aload_0         
	//  142  308:ldc2            #643 <String "Error in banner screen size">
	//  143  311:invokevirtual   #646 <Method void setErrorMessage(String)>
		setVisibility(8);
	//  144  314:aload_0         
	//  145  315:bipush          8
	//  146  317:invokevirtual   #554 <Method void setVisibility(int)>
		if(listener != null && flag)
	//* 147  320:aload_0         
	//* 148  321:getfield        #633 <Field BannerListener listener>
	//* 149  324:ifnull          296
	//* 150  327:iload_2         
	//* 151  328:ifeq            296
		{
			listener.onFailedToReceiveAd(((android.view.View) (this)));
	//  152  331:aload_0         
	//  153  332:getfield        #633 <Field BannerListener listener>
	//  154  335:aload_0         
	//  155  336:invokeinterface #649 <Method void BannerListener.onFailedToReceiveAd(android.view.View)>
			return;
	//  156  341:return          
		}
		continue; /* Loop/switch isn't completed */
_L2:
		setErrorMessage("No ads to load");
	//  157  342:aload_0         
	//  158  343:ldc2            #651 <String "No ads to load">
	//  159  346:invokevirtual   #646 <Method void setErrorMessage(String)>
		if(listener != null && flag)
	//* 160  349:aload_0         
	//* 161  350:getfield        #633 <Field BannerListener listener>
	//* 162  353:ifnull          296
	//* 163  356:iload_2         
	//* 164  357:ifeq            296
		{
			listener.onFailedToReceiveAd(((android.view.View) (this)));
	//  165  360:aload_0         
	//  166  361:getfield        #633 <Field BannerListener listener>
	//  167  364:aload_0         
	//  168  365:invokeinterface #649 <Method void BannerListener.onFailedToReceiveAd(android.view.View)>
			return;
	//  169  370:return          
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #655 <Method void BannerBase.onAttachedToWindow()>
		attachedToWindow = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #142 <Field boolean attachedToWindow>
		if(options == null || !options.o())
	//*   5    9:aload_0         
	//*   6   10:getfield        #386 <Field BannerOptions options>
	//*   7   13:ifnull          26
	//*   8   16:aload_0         
	//*   9   17:getfield        #386 <Field BannerOptions options>
	//*  10   20:invokevirtual   #658 <Method boolean BannerOptions.o()>
	//*  11   23:ifne            36
		{
			firstRotation = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #124 <Field boolean firstRotation>
			firstRotationFinished = true;
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:putfield        #126 <Field boolean firstRotationFinished>
		}
		startRotation();
	//   18   36:aload_0         
	//   19   37:invokespecial   #631 <Method void startRotation()>
	//   20   40:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #661 <Method void BannerBase.onDetachedFromWindow()>
		attachedToWindow = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #142 <Field boolean attachedToWindow>
		removeCallbacks(mAutoRotation);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #156 <Field Runnable mAutoRotation>
	//    8   14:invokevirtual   #519 <Method boolean removeCallbacks(Runnable)>
	//    9   17:pop             
		dispatchOnDetatchedFromWindow();
	//   10   18:aload_0         
	//   11   19:invokespecial   #663 <Method void dispatchOnDetatchedFromWindow()>
	//   12   22:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #666 <Method void BannerBase.onDraw(Canvas)>
		if(!drawn && !loading)
	//*   3    5:aload_0         
	//*   4    6:getfield        #194 <Field boolean drawn>
	//*   5    9:ifne            28
	//*   6   12:aload_0         
	//*   7   13:getfield        #140 <Field boolean loading>
	//*   8   16:ifne            28
		{
			drawn = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #194 <Field boolean drawn>
			startRotation();
	//   12   24:aload_0         
	//   13   25:invokespecial   #631 <Method void startRotation()>
		}
		if(!isInEditMode() && visible && !shouldCreateFaces())
	//*  14   28:aload_0         
	//*  15   29:invokevirtual   #669 <Method boolean isInEditMode()>
	//*  16   32:ifne            54
	//*  17   35:aload_0         
	//*  18   36:getfield        #134 <Field boolean visible>
	//*  19   39:ifeq            54
	//*  20   42:aload_0         
	//*  21   43:invokespecial   #472 <Method boolean shouldCreateFaces()>
	//*  22   46:ifne            54
			drawFrame(canvas);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokespecial   #671 <Method void drawFrame(Canvas)>
	//   26   54:return          
	}

	public void onFailedToReceiveAd(Ad ad)
	{
		setErrorMessage(ad.getErrorMessage());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #677 <Method String Ad.getErrorMessage()>
	//    3    5:invokevirtual   #646 <Method void setErrorMessage(String)>
		if(listener != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #633 <Field BannerListener listener>
	//*   6   12:ifnull          25
			listener.onFailedToReceiveAd(((android.view.View) (this)));
	//    7   15:aload_0         
	//    8   16:getfield        #633 <Field BannerListener listener>
	//    9   19:aload_0         
	//   10   20:invokeinterface #649 <Method void BannerListener.onFailedToReceiveAd(android.view.View)>
	//   11   25:return          
	}

	public void onReceiveAd(Ad ad)
	{
		loaded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #138 <Field boolean loaded>
		loading = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #140 <Field boolean loading>
		overrides = ads.getAdInfoOverride();
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #534 <Field a ads>
	//    9   15:invokevirtual   #680 <Method com.startapp.android.publish.adsCommon.adinformation.c a.getAdInfoOverride()>
	//   10   18:putfield        #275 <Field com.startapp.android.publish.adsCommon.adinformation.c overrides>
		loadBanners(((com.startapp.android.publish.adsCommon.h)ad).d(), true);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:checkcast       #682 <Class com.startapp.android.publish.adsCommon.h>
	//   14   26:invokevirtual   #685 <Method List com.startapp.android.publish.adsCommon.h.d()>
	//   15   29:iconst_1        
	//   16   30:invokevirtual   #687 <Method void loadBanners(List, boolean)>
	//   17   33:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class Banner3D$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #691 <Method void BannerBase.onRestoreInstanceState(Parcelable)>
		} else
	//*   6   12:return          
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #18  <Class Banner3D$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #695 <Method Parcelable Banner3D$SavedState.getSuperState()>
	//   13   23:invokespecial   #691 <Method void BannerBase.onRestoreInstanceState(Parcelable)>
			visible = ((SavedState) (parcelable)).bIsVisible;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #698 <Field boolean Banner3D$SavedState.bIsVisible>
	//   17   31:putfield        #134 <Field boolean visible>
			if(visible)
	//*  18   34:aload_0         
	//*  19   35:getfield        #134 <Field boolean visible>
	//*  20   38:ifeq            12
			{
				adsItems = ((SavedState) (parcelable)).getDetails();
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #701 <Method List Banner3D$SavedState.getDetails()>
	//   24   46:putfield        #559 <Field List adsItems>
				rotation = ((SavedState) (parcelable)).getRotation();
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #704 <Method float Banner3D$SavedState.getRotation()>
	//   28   54:putfield        #116 <Field float rotation>
				firstRotation = ((SavedState) (parcelable)).isFirstRotation();
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:invokevirtual   #707 <Method boolean Banner3D$SavedState.isFirstRotation()>
	//   32   62:putfield        #124 <Field boolean firstRotation>
				firstRotationFinished = ((SavedState) (parcelable)).isFirstRotationFinished();
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:invokevirtual   #710 <Method boolean Banner3D$SavedState.isFirstRotationFinished()>
	//   36   70:putfield        #126 <Field boolean firstRotationFinished>
				currentBannerIndex = ((SavedState) (parcelable)).getCurrentImage();
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:invokevirtual   #713 <Method int Banner3D$SavedState.getCurrentImage()>
	//   40   78:putfield        #151 <Field int currentBannerIndex>
				Banner3DFace abanner3dface[] = ((SavedState) (parcelable)).faces;
	//   41   81:aload_1         
	//   42   82:getfield        #716 <Field Banner3DFace[] Banner3D$SavedState.faces>
	//   43   85:astore_3        
				cleanFaces();
	//   44   86:aload_0         
	//   45   87:invokespecial   #310 <Method void cleanFaces()>
				faces = ((List) (new ArrayList()));
	//   46   90:aload_0         
	//   47   91:new             #144 <Class ArrayList>
	//   48   94:dup             
	//   49   95:invokespecial   #147 <Method void ArrayList()>
	//   50   98:putfield        #149 <Field List faces>
				if(abanner3dface != null)
	//*  51  101:aload_3         
	//*  52  102:ifnull          133
				{
					for(int i = 0; i < abanner3dface.length; i++)
	//*  53  105:iconst_0        
	//*  54  106:istore_2        
	//*  55  107:iload_2         
	//*  56  108:aload_3         
	//*  57  109:arraylength     
	//*  58  110:icmpge          133
						faces.add(((Object) (abanner3dface[i])));
	//   59  113:aload_0         
	//   60  114:getfield        #149 <Field List faces>
	//   61  117:aload_3         
	//   62  118:iload_2         
	//   63  119:aaload          
	//   64  120:invokeinterface #334 <Method boolean List.add(Object)>
	//   65  125:pop             

	//   66  126:iload_2         
	//   67  127:iconst_1        
	//   68  128:iadd            
	//   69  129:istore_2        
				}
	//*  70  130:goto            107
				loaded = ((SavedState) (parcelable)).loaded;
	//   71  133:aload_0         
	//   72  134:aload_1         
	//   73  135:getfield        #717 <Field boolean Banner3D$SavedState.loaded>
	//   74  138:putfield        #138 <Field boolean loaded>
				loading = ((SavedState) (parcelable)).loading;
	//   75  141:aload_0         
	//   76  142:aload_1         
	//   77  143:getfield        #718 <Field boolean Banner3D$SavedState.loading>
	//   78  146:putfield        #140 <Field boolean loading>
				defaultLoad = ((SavedState) (parcelable)).bDefaultLoad;
	//   79  149:aload_0         
	//   80  150:aload_1         
	//   81  151:getfield        #721 <Field boolean Banner3D$SavedState.bDefaultLoad>
	//   82  154:putfield        #136 <Field boolean defaultLoad>
				overrides = ((SavedState) (parcelable)).overrides;
	//   83  157:aload_0         
	//   84  158:aload_1         
	//   85  159:getfield        #722 <Field com.startapp.android.publish.adsCommon.adinformation.c Banner3D$SavedState.overrides>
	//   86  162:putfield        #275 <Field com.startapp.android.publish.adsCommon.adinformation.c overrides>
				options = ((SavedState) (parcelable)).options;
	//   87  165:aload_0         
	//   88  166:aload_1         
	//   89  167:getfield        #723 <Field BannerOptions Banner3D$SavedState.options>
	//   90  170:putfield        #386 <Field BannerOptions options>
				if(adsItems.size() == 0)
	//*  91  173:aload_0         
	//*  92  174:getfield        #559 <Field List adsItems>
	//*  93  177:invokeinterface #467 <Method int List.size()>
	//*  94  182:ifne            195
				{
					defaultLoad = true;
	//   95  185:aload_0         
	//   96  186:iconst_1        
	//   97  187:putfield        #136 <Field boolean defaultLoad>
					init();
	//   98  190:aload_0         
	//   99  191:invokevirtual   #159 <Method void init()>
					return;
	//  100  194:return          
				} else
				{
					post(new Runnable() {

						public void run()
						{
							loadBanners(adsItems, false);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field Banner3D this$0>
						//    2    4:aload_0         
						//    3    5:getfield        #17  <Field Banner3D this$0>
						//    4    8:getfield        #26  <Field List Banner3D.adsItems>
						//    5   11:iconst_0        
						//    6   12:invokevirtual   #30  <Method void Banner3D.loadBanners(List, boolean)>
						//    7   15:return          
						}

						final Banner3D this$0;

			
			{
				this$0 = Banner3D.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Banner3D this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
	//  101  195:aload_0         
	//  102  196:new             #16  <Class Banner3D$4>
	//  103  199:dup             
	//  104  200:aload_0         
	//  105  201:invokespecial   #724 <Method void Banner3D$4(Banner3D)>
	//  106  204:invokevirtual   #522 <Method boolean post(Runnable)>
	//  107  207:pop             
					return;
	//  108  208:return          
				}
			}
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #18  <Class Banner3D$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #727 <Method Parcelable BannerBase.onSaveInstanceState()>
	//    4    8:invokespecial   #729 <Method void Banner3D$SavedState(Parcelable)>
	//    5   11:astore_2        
		savedstate.bIsVisible = visible;
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #134 <Field boolean visible>
	//    9   17:putfield        #698 <Field boolean Banner3D$SavedState.bIsVisible>
		savedstate.setDetails(adsItems);
	//   10   20:aload_2         
	//   11   21:aload_0         
	//   12   22:getfield        #559 <Field List adsItems>
	//   13   25:invokevirtual   #732 <Method void Banner3D$SavedState.setDetails(List)>
		savedstate.setRotation(rotation);
	//   14   28:aload_2         
	//   15   29:aload_0         
	//   16   30:getfield        #116 <Field float rotation>
	//   17   33:invokevirtual   #735 <Method void Banner3D$SavedState.setRotation(float)>
		savedstate.setFirstRotation(firstRotation);
	//   18   36:aload_2         
	//   19   37:aload_0         
	//   20   38:getfield        #124 <Field boolean firstRotation>
	//   21   41:invokevirtual   #738 <Method void Banner3D$SavedState.setFirstRotation(boolean)>
		savedstate.setFirstRotationFinished(firstRotationFinished);
	//   22   44:aload_2         
	//   23   45:aload_0         
	//   24   46:getfield        #126 <Field boolean firstRotationFinished>
	//   25   49:invokevirtual   #741 <Method void Banner3D$SavedState.setFirstRotationFinished(boolean)>
		savedstate.setCurrentImage(currentBannerIndex);
	//   26   52:aload_2         
	//   27   53:aload_0         
	//   28   54:getfield        #151 <Field int currentBannerIndex>
	//   29   57:invokevirtual   #744 <Method void Banner3D$SavedState.setCurrentImage(int)>
		savedstate.options = options;
	//   30   60:aload_2         
	//   31   61:aload_0         
	//   32   62:getfield        #386 <Field BannerOptions options>
	//   33   65:putfield        #723 <Field BannerOptions Banner3D$SavedState.options>
		savedstate.faces = new Banner3DFace[faces.size()];
	//   34   68:aload_2         
	//   35   69:aload_0         
	//   36   70:getfield        #149 <Field List faces>
	//   37   73:invokeinterface #467 <Method int List.size()>
	//   38   78:anewarray       Banner3DFace[]
	//   39   81:putfield        #716 <Field Banner3DFace[] Banner3D$SavedState.faces>
		savedstate.loaded = loaded;
	//   40   84:aload_2         
	//   41   85:aload_0         
	//   42   86:getfield        #138 <Field boolean loaded>
	//   43   89:putfield        #717 <Field boolean Banner3D$SavedState.loaded>
		savedstate.loading = loading;
	//   44   92:aload_2         
	//   45   93:aload_0         
	//   46   94:getfield        #140 <Field boolean loading>
	//   47   97:putfield        #718 <Field boolean Banner3D$SavedState.loading>
		savedstate.overrides = overrides;
	//   48  100:aload_2         
	//   49  101:aload_0         
	//   50  102:getfield        #275 <Field com.startapp.android.publish.adsCommon.adinformation.c overrides>
	//   51  105:putfield        #722 <Field com.startapp.android.publish.adsCommon.adinformation.c Banner3D$SavedState.overrides>
		for(int i = 0; i < faces.size(); i++)
	//*  52  108:iconst_0        
	//*  53  109:istore_1        
	//*  54  110:iload_1         
	//*  55  111:aload_0         
	//*  56  112:getfield        #149 <Field List faces>
	//*  57  115:invokeinterface #467 <Method int List.size()>
	//*  58  120:icmpge          149
			savedstate.faces[i] = (Banner3DFace)faces.get(i);
	//   59  123:aload_2         
	//   60  124:getfield        #716 <Field Banner3DFace[] Banner3D$SavedState.faces>
	//   61  127:iload_1         
	//   62  128:aload_0         
	//   63  129:getfield        #149 <Field List faces>
	//   64  132:iload_1         
	//   65  133:invokeinterface #440 <Method Object List.get(int)>
	//   66  138:checkcast       #303 <Class Banner3DFace>
	//   67  141:aastore         

	//   68  142:iload_1         
	//   69  143:iconst_1        
	//   70  144:iadd            
	//   71  145:istore_1        
	//*  72  146:goto            110
		return ((Parcelable) (savedstate));
	//   73  149:aload_2         
	//   74  150:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(!isEventInsideBanner(motionevent) || faces == null || faces.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #747 <Method boolean isEventInsideBanner(MotionEvent)>
	//*   3    5:ifeq            27
	//*   4    8:aload_0         
	//*   5    9:getfield        #149 <Field List faces>
	//*   6   12:ifnull          27
	//*   7   15:aload_0         
	//*   8   16:getfield        #149 <Field List faces>
	//*   9   19:invokeinterface #467 <Method int List.size()>
	//*  10   24:ifne            29
			return false;
	//   11   27:iconst_0        
	//   12   28:ireturn         
		motionevent.getAction();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #750 <Method int MotionEvent.getAction()>
		JVM INSTR tableswitch 0 2: default 60
	//	               0 62
	//	               1 110
	//	               2 78;
	//   15   33:tableswitch     0 2: default 60
	//	               0 62
	//	               1 110
	//	               2 78
		   goto _L1 _L2 _L3 _L4
_L1:
		return true;
	//   16   60:iconst_1        
	//   17   61:ireturn         
_L2:
		touchDown = true;
	//   18   62:aload_0         
	//   19   63:iconst_1        
	//   20   64:putfield        #130 <Field boolean touchDown>
		startY = motionevent.getY();
	//   21   67:aload_0         
	//   22   68:aload_1         
	//   23   69:invokevirtual   #490 <Method float MotionEvent.getY()>
	//   24   72:putfield        #118 <Field float startY>
		continue; /* Loop/switch isn't completed */
	//   25   75:goto            60
_L4:
		if(startY - motionevent.getY() >= 10F)
	//*  26   78:aload_0         
	//*  27   79:getfield        #118 <Field float startY>
	//*  28   82:aload_1         
	//*  29   83:invokevirtual   #490 <Method float MotionEvent.getY()>
	//*  30   86:fsub            
	//*  31   87:ldc2            #751 <Float 10F>
	//*  32   90:fcmpg           
	//*  33   91:iflt            60
		{
			touchDown = false;
	//   34   94:aload_0         
	//   35   95:iconst_0        
	//   36   96:putfield        #130 <Field boolean touchDown>
			startY = motionevent.getY();
	//   37   99:aload_0         
	//   38  100:aload_1         
	//   39  101:invokevirtual   #490 <Method float MotionEvent.getY()>
	//   40  104:putfield        #118 <Field float startY>
		}
		continue; /* Loop/switch isn't completed */
	//   41  107:goto            60
_L3:
		if(touchDown)
	//*  42  110:aload_0         
	//*  43  111:getfield        #130 <Field boolean touchDown>
	//*  44  114:ifeq            60
		{
			if(rotation < 45F)
	//*  45  117:aload_0         
	//*  46  118:getfield        #116 <Field float rotation>
	//*  47  121:ldc1            #114 <Float 45F>
	//*  48  123:fcmpg           
	//*  49  124:ifge            131
				prevBanner();
	//   50  127:aload_0         
	//   51  128:invokespecial   #753 <Method void prevBanner()>
			touchDown = false;
	//   52  131:aload_0         
	//   53  132:iconst_0        
	//   54  133:putfield        #130 <Field boolean touchDown>
			rotationEnabled = false;
	//   55  136:aload_0         
	//   56  137:iconst_0        
	//   57  138:putfield        #120 <Field boolean rotationEnabled>
			setClicked(true);
	//   58  141:aload_0         
	//   59  142:iconst_1        
	//   60  143:invokevirtual   #756 <Method void setClicked(boolean)>
			postDelayed(new Runnable() {

				public void run()
				{
					rotationEnabled = true;
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Banner3D this$0>
				//    2    4:iconst_1        
				//    3    5:putfield        #26  <Field boolean Banner3D.rotationEnabled>
				//    4    8:return          
				}

				final Banner3D this$0;

			
			{
				this$0 = Banner3D.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Banner3D this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
, com.startapp.android.publish.adsCommon.b.a().A());
	//   61  146:aload_0         
	//   62  147:new             #14  <Class Banner3D$3>
	//   63  150:dup             
	//   64  151:aload_0         
	//   65  152:invokespecial   #757 <Method void Banner3D$3(Banner3D)>
	//   66  155:invokestatic    #762 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//   67  158:invokevirtual   #766 <Method long com.startapp.android.publish.adsCommon.b.A()>
	//   68  161:invokevirtual   #767 <Method boolean postDelayed(Runnable, long)>
	//   69  164:pop             
			((Banner3DFace)faces.get(getCurrentBannerIndex())).b(getContext());
	//   70  165:aload_0         
	//   71  166:getfield        #149 <Field List faces>
	//   72  169:aload_0         
	//   73  170:invokevirtual   #436 <Method int getCurrentBannerIndex()>
	//   74  173:invokeinterface #440 <Method Object List.get(int)>
	//   75  178:checkcast       #303 <Class Banner3DFace>
	//   76  181:aload_0         
	//   77  182:invokevirtual   #221 <Method Context getContext()>
	//   78  185:invokevirtual   #769 <Method void com.startapp.android.publish.ads.banner.banner3d.Banner3DFace.b(Context)>
			if(listener != null)
	//*  79  188:aload_0         
	//*  80  189:getfield        #633 <Field BannerListener listener>
	//*  81  192:ifnull          60
				listener.onClick(((android.view.View) (this)));
	//   82  195:aload_0         
	//   83  196:getfield        #633 <Field BannerListener listener>
	//   84  199:aload_0         
	//   85  200:invokeinterface #772 <Method void BannerListener.onClick(android.view.View)>
		}
		if(true) goto _L1; else goto _L5
	//   86  205:goto            60
_L5:
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #775 <Method void BannerBase.onWindowFocusChanged(boolean)>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            46
		{
			attachedToWindow = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #142 <Field boolean attachedToWindow>
			if(options == null || !options.o())
	//*   8   14:aload_0         
	//*   9   15:getfield        #386 <Field BannerOptions options>
	//*  10   18:ifnull          31
	//*  11   21:aload_0         
	//*  12   22:getfield        #386 <Field BannerOptions options>
	//*  13   25:invokevirtual   #658 <Method boolean BannerOptions.o()>
	//*  14   28:ifne            41
			{
				firstRotation = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #124 <Field boolean firstRotation>
				firstRotationFinished = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #126 <Field boolean firstRotationFinished>
			}
			startRotation();
	//   21   41:aload_0         
	//   22   42:invokespecial   #631 <Method void startRotation()>
		} else
	//*  23   45:return          
		{
			attachedToWindow = false;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #142 <Field boolean attachedToWindow>
			if(!rotating)
	//*  27   51:aload_0         
	//*  28   52:getfield        #122 <Field boolean rotating>
	//*  29   55:ifne            45
			{
				removeCallbacks(mAutoRotation);
	//   30   58:aload_0         
	//   31   59:aload_0         
	//   32   60:getfield        #156 <Field Runnable mAutoRotation>
	//   33   63:invokevirtual   #519 <Method boolean removeCallbacks(Runnable)>
	//   34   66:pop             
				return;
	//   35   67:return          
			}
		}
	}

	protected void reload()
	{
		loaded = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #138 <Field boolean loaded>
		loading = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #140 <Field boolean loading>
		animation = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #132 <Field boolean animation>
		rotationEnabled = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #120 <Field boolean rotationEnabled>
		firstRotation = true;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #124 <Field boolean firstRotation>
		firstRotationFinished = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #126 <Field boolean firstRotationFinished>
		addedDisplayEvent = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #128 <Field boolean addedDisplayEvent>
		drawn = false;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #194 <Field boolean drawn>
		adRulesResult = null;
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:putfield        #780 <Field com.startapp.android.publish.adsCommon.a.f adRulesResult>
		cleanFaces();
	//   27   45:aload_0         
	//   28   46:invokespecial   #310 <Method void cleanFaces()>
		faces = ((List) (new ArrayList()));
	//   29   49:aload_0         
	//   30   50:new             #144 <Class ArrayList>
	//   31   53:dup             
	//   32   54:invokespecial   #147 <Method void ArrayList()>
	//   33   57:putfield        #149 <Field List faces>
		ads = new a(getContext(), getOffset());
	//   34   60:aload_0         
	//   35   61:new             #536 <Class a>
	//   36   64:dup             
	//   37   65:aload_0         
	//   38   66:invokevirtual   #221 <Method Context getContext()>
	//   39   69:aload_0         
	//   40   70:invokevirtual   #782 <Method int getOffset()>
	//   41   73:invokespecial   #785 <Method void a(Context, int)>
	//   42   76:putfield        #534 <Field a ads>
		if(adPreferences == null)
	//*  43   79:aload_0         
	//*  44   80:getfield        #189 <Field AdPreferences adPreferences>
	//*  45   83:ifnonnull       97
			adPreferences = new AdPreferences();
	//   46   86:aload_0         
	//   47   87:new             #186 <Class AdPreferences>
	//   48   90:dup             
	//   49   91:invokespecial   #187 <Method void AdPreferences()>
	//   50   94:putfield        #189 <Field AdPreferences adPreferences>
		ads.load(adPreferences, ((AdEventListener) (this)));
	//   51   97:aload_0         
	//   52   98:getfield        #534 <Field a ads>
	//   53  101:aload_0         
	//   54  102:getfield        #189 <Field AdPreferences adPreferences>
	//   55  105:aload_0         
	//   56  106:invokevirtual   #789 <Method boolean a.load(AdPreferences, AdEventListener)>
	//   57  109:pop             
	//   58  110:return          
	}

	protected void rotate(float f1)
	{
		rotation = rotation + f1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #116 <Field float rotation>
	//    3    5:fload_1         
	//    4    6:fadd            
	//    5    7:putfield        #116 <Field float rotation>
		if(rotation >= 90F)
	//*   6   10:aload_0         
	//*   7   11:getfield        #116 <Field float rotation>
	//*   8   14:ldc2            #414 <Float 90F>
	//*   9   17:fcmpl           
	//*  10   18:iflt            37
		{
			nextBanner();
	//   11   21:aload_0         
	//   12   22:invokespecial   #792 <Method void nextBanner()>
			rotation = rotation - 90F;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #116 <Field float rotation>
	//   16   30:ldc2            #414 <Float 90F>
	//   17   33:fsub            
	//   18   34:putfield        #116 <Field float rotation>
		}
		if(rotation <= 0.0F)
	//*  19   37:aload_0         
	//*  20   38:getfield        #116 <Field float rotation>
	//*  21   41:fconst_0        
	//*  22   42:fcmpg           
	//*  23   43:ifgt            62
		{
			prevBanner();
	//   24   46:aload_0         
	//   25   47:invokespecial   #753 <Method void prevBanner()>
			rotation = rotation + 90F;
	//   26   50:aload_0         
	//   27   51:aload_0         
	//   28   52:getfield        #116 <Field float rotation>
	//   29   55:ldc2            #414 <Float 90F>
	//   30   58:fadd            
	//   31   59:putfield        #116 <Field float rotation>
		}
		invalidate();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #795 <Method void invalidate()>
	//   34   66:return          
	}

	public void setAdTag(String s)
	{
		adTag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #799 <Field String adTag>
	//    3    5:return          
	}

	protected void setBannerId(int i)
	{
		innerBanner3dId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #526 <Field int innerBanner3dId>
	//    3    5:return          
	}

	public void setBannerListener(BannerListener bannerlistener)
	{
		listener = bannerlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #633 <Field BannerListener listener>
	//    3    5:return          
	}

	public void showBanner()
	{
		visible = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #134 <Field boolean visible>
		setVisibility(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #554 <Method void setVisibility(int)>
	//    6   10:return          
	}

	private static final String TAG = "Banner3D";
	private static final int TIMEOUT_RESTORE = 200;
	protected AdPreferences adPreferences;
	protected boolean addedDisplayEvent;
	protected a ads;
	protected List adsItems;
	protected boolean animation;
	protected boolean attachedToWindow;
	protected Camera camera;
	protected int currentBannerIndex;
	protected boolean defaultLoad;
	protected List faces;
	protected boolean firstRotation;
	protected boolean firstRotationFinished;
	protected BannerListener listener;
	protected boolean loaded;
	protected boolean loading;
	private Runnable mAutoRotation = new Runnable() ;
	protected Matrix matrix;
	protected BannerOptions options;
	protected com.startapp.android.publish.adsCommon.adinformation.c overrides;
	protected Paint paint;
	protected boolean rotating;
	protected float rotation;
	protected boolean rotationEnabled;
	protected float startY;
	protected boolean touchDown;
	protected boolean visible;


/*
	static boolean access$000(Banner3D banner3d)
	{
		return banner3d.drawn;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field boolean drawn>
	//    2    4:ireturn         
	}

*/


/*
	static void access$100(Banner3D banner3d, Banner3DFace banner3dface)
	{
		banner3d.makeImpression(banner3dface);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #200 <Method void makeImpression(Banner3DFace)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$200(Banner3D banner3d)
	{
		banner3d.addDisplayEventOnLoad();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method void addDisplayEventOnLoad()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$300(Banner3D banner3d, AdPreferences adpreferences)
	{
		banner3d.setHardwareAcceleration(adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #210 <Method void setHardwareAcceleration(AdPreferences)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$400(Banner3D banner3d)
	{
		banner3d.loadBanner();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #214 <Method void loadBanner()>
		return;
	//    2    4:return          
	}

*/
}
