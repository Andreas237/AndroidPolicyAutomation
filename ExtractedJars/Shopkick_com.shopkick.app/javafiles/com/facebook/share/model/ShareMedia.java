// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

public abstract class ShareMedia
	implements ShareModel
{
	public static abstract class Builder
		implements ShareModelBuilder
	{

		static List readListFrom(Parcel parcel)
		{
			parcel = ((Parcel) (parcel.readParcelableArray(((Class) (com/facebook/share/model/ShareMedia)).getClassLoader())));
		//    0    0:aload_0         
		//    1    1:ldc1            #9   <Class ShareMedia>
		//    2    3:invokevirtual   #32  <Method ClassLoader Class.getClassLoader()>
		//    3    6:invokevirtual   #38  <Method android.os.Parcelable[] Parcel.readParcelableArray(ClassLoader)>
		//    4    9:astore_0        
			ArrayList arraylist = new ArrayList(parcel.length);
		//    5   10:new             #40  <Class ArrayList>
		//    6   13:dup             
		//    7   14:aload_0         
		//    8   15:arraylength     
		//    9   16:invokespecial   #43  <Method void ArrayList(int)>
		//   10   19:astore_3        
			int j = parcel.length;
		//   11   20:aload_0         
		//   12   21:arraylength     
		//   13   22:istore_2        
			for(int i = 0; i < j; i++)
		//*  14   23:iconst_0        
		//*  15   24:istore_1        
		//*  16   25:iload_1         
		//*  17   26:iload_2         
		//*  18   27:icmpge          50
				((List) (arraylist)).add(((Object) ((ShareMedia)parcel[i])));
		//   19   30:aload_3         
		//   20   31:aload_0         
		//   21   32:iload_1         
		//   22   33:aaload          
		//   23   34:checkcast       #9   <Class ShareMedia>
		//   24   37:invokeinterface #49  <Method boolean List.add(Object)>
		//   25   42:pop             

		//   26   43:iload_1         
		//   27   44:iconst_1        
		//   28   45:iadd            
		//   29   46:istore_1        
		//*  30   47:goto            25
			return ((List) (arraylist));
		//   31   50:aload_3         
		//   32   51:areturn         
		}

		static void writeListTo(Parcel parcel, int i, List list)
		{
			parcel.writeParcelableArray(((android.os.Parcelable []) ((ShareMedia[])list.toArray())), i);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokeinterface #57  <Method Object[] List.toArray()>
		//    3    7:checkcast       #59  <Class ShareMedia[]>
		//    4   10:iload_1         
		//    5   11:invokevirtual   #63  <Method void Parcel.writeParcelableArray(android.os.Parcelable[], int)>
		//    6   14:return          
		}

		public Builder readFrom(ShareMedia sharemedia)
		{
			if(sharemedia == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return setParameters(sharemedia.getParameters());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #70  <Method Bundle ShareMedia.getParameters()>
		//    7   11:invokevirtual   #74  <Method ShareMedia$Builder setParameters(Bundle)>
		//    8   14:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareMedia)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class ShareMedia>
		//    3    5:invokevirtual   #78  <Method ShareMedia$Builder readFrom(ShareMedia)>
		//    4    8:areturn         
		}

		public Builder setParameter(String s, String s1)
		{
			params.putString(s, s1);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle params>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #85  <Method void Bundle.putString(String, String)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setParameters(Bundle bundle)
		{
			params.putAll(bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle params>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #91  <Method void Bundle.putAll(Bundle)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private Bundle params;


/*
		static Bundle access$000(Builder builder)
		{
			return builder.params;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle params>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			params = new Bundle();
		//    2    4:aload_0         
		//    3    5:new             #18  <Class Bundle>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void Bundle()>
		//    6   12:putfield        #21  <Field Bundle params>
		//    7   15:return          
		}
	}

	public static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/facebook/share/model/ShareMedia$Type, s);
		//    0    0:ldc1            #2   <Class ShareMedia$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ShareMedia$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field ShareMedia$Type[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.share.model.ShareMedia$Type_3B_.clone()>
		//    2    6:checkcast       #38  <Class ShareMedia$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type PHOTO;
		public static final Type VIDEO;

		static 
		{
			PHOTO = new Type("PHOTO", 0);
		//    0    0:new             #2   <Class ShareMedia$Type>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "PHOTO">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void ShareMedia$Type(String, int)>
		//    5   10:putstatic       #22  <Field ShareMedia$Type PHOTO>
			VIDEO = new Type("VIDEO", 1);
		//    6   13:new             #2   <Class ShareMedia$Type>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "VIDEO">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void ShareMedia$Type(String, int)>
		//   11   23:putstatic       #25  <Field ShareMedia$Type VIDEO>
			$VALUES = (new Type[] {
				PHOTO, VIDEO
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Type[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field ShareMedia$Type PHOTO>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field ShareMedia$Type VIDEO>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field ShareMedia$Type[] $VALUES>
		//*  23   45:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	ShareMedia(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		params = parcel.readBundle();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #25  <Method Bundle Parcel.readBundle()>
	//    5    9:putfield        #27  <Field Bundle params>
	//    6   12:return          
	}

	protected ShareMedia(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		params = new Bundle(builder.params);
	//    2    4:aload_0         
	//    3    5:new             #31  <Class Bundle>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #35  <Method Bundle ShareMedia$Builder.access$000(ShareMedia$Builder)>
	//    7   13:invokespecial   #38  <Method void Bundle(Bundle)>
	//    8   16:putfield        #27  <Field Bundle params>
	//    9   19:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract Type getMediaType();

	public Bundle getParameters()
	{
		return new Bundle(params);
	//    0    0:new             #31  <Class Bundle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Bundle params>
	//    4    8:invokespecial   #38  <Method void Bundle(Bundle)>
	//    5   11:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(params);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field Bundle params>
	//    3    5:invokevirtual   #50  <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	private final Bundle params;
}
