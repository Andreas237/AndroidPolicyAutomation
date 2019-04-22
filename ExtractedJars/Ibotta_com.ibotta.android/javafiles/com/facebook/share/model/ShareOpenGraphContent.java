// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareOpenGraphAction

public final class ShareOpenGraphContent extends ShareContent
{

	ShareOpenGraphContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void ShareContent(Parcel)>
		action = (new ShareOpenGraphAction.Builder()).readFrom(parcel).build();
	//    3    5:aload_0         
	//    4    6:new             #27  <Class ShareOpenGraphAction$Builder>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void ShareOpenGraphAction$Builder()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #32  <Method ShareOpenGraphAction$Builder ShareOpenGraphAction$Builder.readFrom(Parcel)>
	//    9   17:invokevirtual   #36  <Method ShareOpenGraphAction ShareOpenGraphAction$Builder.build()>
	//   10   20:putfield        #38  <Field ShareOpenGraphAction action>
		previewPropertyName = parcel.readString();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #44  <Method String Parcel.readString()>
	//   14   28:putfield        #46  <Field String previewPropertyName>
	//   15   31:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ShareOpenGraphAction getAction()
	{
		return action;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ShareOpenGraphAction action>
	//    2    4:areturn         
	}

	public String getPreviewPropertyName()
	{
		return previewPropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String previewPropertyName>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #56  <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeParcelable(((android.os.Parcelable) (action)), 0);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field ShareOpenGraphAction action>
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #60  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeString(previewPropertyName);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #46  <Field String previewPropertyName>
	//   12   20:invokevirtual   #64  <Method void Parcel.writeString(String)>
	//   13   23:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareOpenGraphContent createFromParcel(Parcel parcel)
		{
			return new ShareOpenGraphContent(parcel);
		//    0    0:new             #9   <Class ShareOpenGraphContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareOpenGraphContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareOpenGraphContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareOpenGraphContent[] newArray(int i)
		{
			return new ShareOpenGraphContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareOpenGraphContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareOpenGraphContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final ShareOpenGraphAction action;
	private final String previewPropertyName;

	static 
	{
	//    0    0:new             #7   <Class ShareOpenGraphContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ShareOpenGraphContent$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
