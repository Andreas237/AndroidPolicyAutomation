// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook:
//			GraphRequest, FacebookSdk

public static class GraphRequest$ParcelableResourceWithMimeType
	implements Parcelable
{

	public int describeContents()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String getMimeType()
	{
		return mimeType;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String mimeType>
	//    2    4:areturn         
	}

	public Parcelable getResource()
	{
		return resource;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcelable resource>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mimeType);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field String mimeType>
	//    3    5:invokevirtual   #74  <Method void Parcel.writeString(String)>
		parcel.writeParcelable(resource, i);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #56  <Field Parcelable resource>
	//    7   13:iload_2         
	//    8   14:invokevirtual   #78  <Method void Parcel.writeParcelable(Parcelable, int)>
	//    9   17:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public GraphRequest.ParcelableResourceWithMimeType createFromParcel(Parcel parcel)
		{
			return new GraphRequest.ParcelableResourceWithMimeType(parcel, ((GraphRequest._cls1) (null)));
		//    0    0:new             #9   <Class GraphRequest$ParcelableResourceWithMimeType>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void GraphRequest$ParcelableResourceWithMimeType(Parcel, GraphRequest$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method GraphRequest$ParcelableResourceWithMimeType createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public GraphRequest.ParcelableResourceWithMimeType[] newArray(int i)
		{
			return new GraphRequest.ParcelableResourceWithMimeType[i];
		//    0    0:iload_1         
		//    1    1:anewarray       GraphRequest.ParcelableResourceWithMimeType[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method GraphRequest$ParcelableResourceWithMimeType[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String mimeType;
	private final Parcelable resource;

	static 
	{
	//    0    0:new             #12  <Class GraphRequest$ParcelableResourceWithMimeType$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void GraphRequest$ParcelableResourceWithMimeType$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private GraphRequest$ParcelableResourceWithMimeType(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mimeType = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method String Parcel.readString()>
	//    5    9:putfield        #38  <Field String mimeType>
		resource = parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #44  <Method Context FacebookSdk.getApplicationContext()>
	//    9   17:invokevirtual   #50  <Method ClassLoader Context.getClassLoader()>
	//   10   20:invokevirtual   #54  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   11   23:putfield        #56  <Field Parcelable resource>
	//   12   26:return          
	}

	GraphRequest$ParcelableResourceWithMimeType(Parcel parcel, GraphRequest._cls1 _pcls1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method void GraphRequest$ParcelableResourceWithMimeType(Parcel)>
	//    3    5:return          
	}

	public GraphRequest$ParcelableResourceWithMimeType(Parcelable parcelable, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mimeType = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #38  <Field String mimeType>
		resource = parcelable;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #56  <Field Parcelable resource>
	//    8   14:return          
	}
}
