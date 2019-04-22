// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.os.Parcel;
import android.os.Parcelable;

public class ContactsUploadResult
	implements Parcelable
{

	ContactsUploadResult(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		successCount = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int successCount>
		totalCount = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #28  <Field int totalCount>
	//    8   14:return          
	}

	ContactsUploadResult(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		successCount = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #35  <Method int Parcel.readInt()>
	//    5    9:putfield        #26  <Field int successCount>
		totalCount = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #35  <Method int Parcel.readInt()>
	//    9   17:putfield        #28  <Field int totalCount>
	//   10   20:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(successCount);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field int successCount>
	//    3    5:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		parcel.writeInt(totalCount);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field int totalCount>
	//    7   13:invokevirtual   #42  <Method void Parcel.writeInt(int)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ContactsUploadResult createFromParcel(Parcel parcel)
		{
			return new ContactsUploadResult(parcel);
		//    0    0:new             #9   <Class ContactsUploadResult>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ContactsUploadResult(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ContactsUploadResult createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ContactsUploadResult[] newArray(int i)
		{
			return new ContactsUploadResult[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ContactsUploadResult[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ContactsUploadResult[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final int successCount;
	public final int totalCount;

	static 
	{
	//    0    0:new             #8   <Class ContactsUploadResult$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ContactsUploadResult$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
