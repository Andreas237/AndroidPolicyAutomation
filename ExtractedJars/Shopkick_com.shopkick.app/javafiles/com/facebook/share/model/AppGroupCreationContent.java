// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

public final class AppGroupCreationContent
	implements ShareModel
{
	public static final class AppGroupPrivacy extends Enum
	{

		public static AppGroupPrivacy valueOf(String s)
		{
			return (AppGroupPrivacy)Enum.valueOf(com/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy, s);
		//    0    0:ldc1            #2   <Class AppGroupCreationContent$AppGroupPrivacy>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppGroupCreationContent$AppGroupPrivacy>
		//    4    9:areturn         
		}

		public static AppGroupPrivacy[] values()
		{
			return (AppGroupPrivacy[])((AppGroupPrivacy []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field AppGroupCreationContent$AppGroupPrivacy[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.share.model.AppGroupCreationContent$AppGroupPrivacy_3B_.clone()>
		//    2    6:checkcast       #38  <Class AppGroupCreationContent$AppGroupPrivacy[]>
		//    3    9:areturn         
		}

		private static final AppGroupPrivacy $VALUES[];
		public static final AppGroupPrivacy Closed;
		public static final AppGroupPrivacy Open;

		static 
		{
			Open = new AppGroupPrivacy("Open", 0);
		//    0    0:new             #2   <Class AppGroupCreationContent$AppGroupPrivacy>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "Open">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void AppGroupCreationContent$AppGroupPrivacy(String, int)>
		//    5   10:putstatic       #22  <Field AppGroupCreationContent$AppGroupPrivacy Open>
			Closed = new AppGroupPrivacy("Closed", 1);
		//    6   13:new             #2   <Class AppGroupCreationContent$AppGroupPrivacy>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "Closed">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void AppGroupCreationContent$AppGroupPrivacy(String, int)>
		//   11   23:putstatic       #25  <Field AppGroupCreationContent$AppGroupPrivacy Closed>
			$VALUES = (new AppGroupPrivacy[] {
				Open, Closed
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       AppGroupPrivacy[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field AppGroupCreationContent$AppGroupPrivacy Open>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field AppGroupCreationContent$AppGroupPrivacy Closed>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field AppGroupCreationContent$AppGroupPrivacy[] $VALUES>
		//*  23   45:return          
		}

		private AppGroupPrivacy(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static class Builder
		implements ShareModelBuilder
	{

		public AppGroupCreationContent build()
		{
			return new AppGroupCreationContent(this);
		//    0    0:new             #9   <Class AppGroupCreationContent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #36  <Method void AppGroupCreationContent(AppGroupCreationContent$Builder, AppGroupCreationContent$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #39  <Method AppGroupCreationContent build()>
		//    2    4:areturn         
		}

		public Builder readFrom(AppGroupCreationContent appgroupcreationcontent)
		{
			if(appgroupcreationcontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return setName(appgroupcreationcontent.getName()).setDescription(appgroupcreationcontent.getDescription()).setAppGroupPrivacy(appgroupcreationcontent.getAppGroupPrivacy());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #45  <Method String AppGroupCreationContent.getName()>
		//    7   11:invokevirtual   #49  <Method AppGroupCreationContent$Builder setName(String)>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #52  <Method String AppGroupCreationContent.getDescription()>
		//   10   18:invokevirtual   #55  <Method AppGroupCreationContent$Builder setDescription(String)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #59  <Method AppGroupCreationContent$AppGroupPrivacy AppGroupCreationContent.getAppGroupPrivacy()>
		//   13   25:invokevirtual   #63  <Method AppGroupCreationContent$Builder setAppGroupPrivacy(AppGroupCreationContent$AppGroupPrivacy)>
		//   14   28:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((AppGroupCreationContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class AppGroupCreationContent>
		//    3    5:invokevirtual   #66  <Method AppGroupCreationContent$Builder readFrom(AppGroupCreationContent)>
		//    4    8:areturn         
		}

		public Builder setAppGroupPrivacy(AppGroupPrivacy appgroupprivacy)
		{
			privacy = appgroupprivacy;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field AppGroupCreationContent$AppGroupPrivacy privacy>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDescription(String s)
		{
			description = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field String description>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setName(String s)
		{
			name = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field String name>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String description;
		private String name;
		private AppGroupPrivacy privacy;


/*
		static String access$000(Builder builder)
		{
			return builder.name;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field String name>
		//    2    4:areturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.description;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field String description>
		//    2    4:areturn         
		}

*/


/*
		static AppGroupPrivacy access$200(Builder builder)
		{
			return builder.privacy;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field AppGroupCreationContent$AppGroupPrivacy privacy>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}


	AppGroupCreationContent(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		name = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #38  <Method String Parcel.readString()>
	//    5    9:putfield        #40  <Field String name>
		description = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method String Parcel.readString()>
	//    9   17:putfield        #42  <Field String description>
		privacy = (AppGroupPrivacy)parcel.readSerializable();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #46  <Method java.io.Serializable Parcel.readSerializable()>
	//   13   25:checkcast       #10  <Class AppGroupCreationContent$AppGroupPrivacy>
	//   14   28:putfield        #48  <Field AppGroupCreationContent$AppGroupPrivacy privacy>
	//   15   31:return          
	}

	private AppGroupCreationContent(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		name = builder.name;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #53  <Method String AppGroupCreationContent$Builder.access$000(AppGroupCreationContent$Builder)>
	//    5    9:putfield        #40  <Field String name>
		description = builder.description;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #56  <Method String AppGroupCreationContent$Builder.access$100(AppGroupCreationContent$Builder)>
	//    9   17:putfield        #42  <Field String description>
		privacy = builder.privacy;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #60  <Method AppGroupCreationContent$AppGroupPrivacy AppGroupCreationContent$Builder.access$200(AppGroupCreationContent$Builder)>
	//   13   25:putfield        #48  <Field AppGroupCreationContent$AppGroupPrivacy privacy>
	//   14   28:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public AppGroupPrivacy getAppGroupPrivacy()
	{
		return privacy;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field AppGroupCreationContent$AppGroupPrivacy privacy>
	//    2    4:areturn         
	}

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String description>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String name>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(name);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field String name>
	//    3    5:invokevirtual   #75  <Method void Parcel.writeString(String)>
		parcel.writeString(description);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field String description>
	//    7   13:invokevirtual   #75  <Method void Parcel.writeString(String)>
		parcel.writeSerializable(((java.io.Serializable) (privacy)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field AppGroupCreationContent$AppGroupPrivacy privacy>
	//   11   21:invokevirtual   #79  <Method void Parcel.writeSerializable(java.io.Serializable)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public AppGroupCreationContent createFromParcel(Parcel parcel)
		{
			return new AppGroupCreationContent(parcel);
		//    0    0:new             #9   <Class AppGroupCreationContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void AppGroupCreationContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method AppGroupCreationContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public AppGroupCreationContent[] newArray(int i)
		{
			return new AppGroupCreationContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AppGroupCreationContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method AppGroupCreationContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String description;
	private final String name;
	private AppGroupPrivacy privacy;

	static 
	{
	//    0    0:new             #8   <Class AppGroupCreationContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void AppGroupCreationContent$1()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
