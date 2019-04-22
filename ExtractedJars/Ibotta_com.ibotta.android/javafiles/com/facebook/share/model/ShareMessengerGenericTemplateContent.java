// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareMessengerGenericTemplateElement

public final class ShareMessengerGenericTemplateContent extends ShareContent
{
	public static final class ImageAspectRatio extends Enum
	{

		public static ImageAspectRatio valueOf(String s)
		{
			return (ImageAspectRatio)Enum.valueOf(com/facebook/share/model/ShareMessengerGenericTemplateContent$ImageAspectRatio, s);
		//    0    0:ldc1            #2   <Class ShareMessengerGenericTemplateContent$ImageAspectRatio>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ShareMessengerGenericTemplateContent$ImageAspectRatio>
		//    4    9:areturn         
		}

		public static ImageAspectRatio[] values()
		{
			return (ImageAspectRatio[])((ImageAspectRatio []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio_3B_.clone()>
		//    2    6:checkcast       #38  <Class ShareMessengerGenericTemplateContent$ImageAspectRatio[]>
		//    3    9:areturn         
		}

		private static final ImageAspectRatio $VALUES[];
		public static final ImageAspectRatio HORIZONTAL;
		public static final ImageAspectRatio SQUARE;

		static 
		{
			HORIZONTAL = new ImageAspectRatio("HORIZONTAL", 0);
		//    0    0:new             #2   <Class ShareMessengerGenericTemplateContent$ImageAspectRatio>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "HORIZONTAL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void ShareMessengerGenericTemplateContent$ImageAspectRatio(String, int)>
		//    5   10:putstatic       #22  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio HORIZONTAL>
			SQUARE = new ImageAspectRatio("SQUARE", 1);
		//    6   13:new             #2   <Class ShareMessengerGenericTemplateContent$ImageAspectRatio>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "SQUARE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void ShareMessengerGenericTemplateContent$ImageAspectRatio(String, int)>
		//   11   23:putstatic       #25  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio SQUARE>
			$VALUES = (new ImageAspectRatio[] {
				HORIZONTAL, SQUARE
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       ImageAspectRatio[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio HORIZONTAL>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio SQUARE>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio[] $VALUES>
		//*  23   45:return          
		}

		private ImageAspectRatio(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	ShareMessengerGenericTemplateContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void ShareContent(Parcel)>
		boolean flag;
		if(parcel.readByte() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #36  <Method byte Parcel.readByte()>
	//*   5    9:ifeq            17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		isSharable = flag;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #38  <Field boolean isSharable>
		imageAspectRatio = (ImageAspectRatio)parcel.readSerializable();
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #42  <Method java.io.Serializable Parcel.readSerializable()>
	//   17   29:checkcast       #9   <Class ShareMessengerGenericTemplateContent$ImageAspectRatio>
	//   18   32:putfield        #44  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio imageAspectRatio>
		genericTemplateElement = (ShareMessengerGenericTemplateElement)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMessengerGenericTemplateElement)).getClassLoader());
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:ldc1            #46  <Class ShareMessengerGenericTemplateElement>
	//   22   39:invokevirtual   #52  <Method ClassLoader Class.getClassLoader()>
	//   23   42:invokevirtual   #56  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   24   45:checkcast       #46  <Class ShareMessengerGenericTemplateElement>
	//   25   48:putfield        #58  <Field ShareMessengerGenericTemplateElement genericTemplateElement>
	//   26   51:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ShareMessengerGenericTemplateElement getGenericTemplateElement()
	{
		return genericTemplateElement;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field ShareMessengerGenericTemplateElement genericTemplateElement>
	//    2    4:areturn         
	}

	public ImageAspectRatio getImageAspectRatio()
	{
		return imageAspectRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio imageAspectRatio>
	//    2    4:areturn         
	}

	public boolean getIsSharable()
	{
		return isSharable;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean isSharable>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #70  <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeByte((byte)isSharable);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field boolean isSharable>
	//    7   11:int2byte        
	//    8   12:invokevirtual   #74  <Method void Parcel.writeByte(byte)>
		parcel.writeSerializable(((java.io.Serializable) (imageAspectRatio)));
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #44  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio imageAspectRatio>
	//   12   20:invokevirtual   #78  <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeParcelable(((android.os.Parcelable) (genericTemplateElement)), i);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #58  <Field ShareMessengerGenericTemplateElement genericTemplateElement>
	//   16   28:iload_2         
	//   17   29:invokevirtual   #82  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//   18   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel)
		{
			return new ShareMessengerGenericTemplateContent(parcel);
		//    0    0:new             #9   <Class ShareMessengerGenericTemplateContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareMessengerGenericTemplateContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareMessengerGenericTemplateContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareMessengerGenericTemplateContent[] newArray(int i)
		{
			return new ShareMessengerGenericTemplateContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareMessengerGenericTemplateContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareMessengerGenericTemplateContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final ShareMessengerGenericTemplateElement genericTemplateElement;
	private final ImageAspectRatio imageAspectRatio;
	private final boolean isSharable;

	static 
	{
	//    0    0:new             #7   <Class ShareMessengerGenericTemplateContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ShareMessengerGenericTemplateContent$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
