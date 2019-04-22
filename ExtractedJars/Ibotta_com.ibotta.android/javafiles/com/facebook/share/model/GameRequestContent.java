// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//			ShareModel

public final class GameRequestContent
	implements ShareModel
{
	public static final class ActionType extends Enum
	{

		public static ActionType valueOf(String s)
		{
			return (ActionType)Enum.valueOf(com/facebook/share/model/GameRequestContent$ActionType, s);
		//    0    0:ldc1            #2   <Class GameRequestContent$ActionType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GameRequestContent$ActionType>
		//    4    9:areturn         
		}

		public static ActionType[] values()
		{
			return (ActionType[])((ActionType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field GameRequestContent$ActionType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.share.model.GameRequestContent$ActionType_3B_.clone()>
		//    2    6:checkcast       #42  <Class GameRequestContent$ActionType[]>
		//    3    9:areturn         
		}

		private static final ActionType $VALUES[];
		public static final ActionType ASKFOR;
		public static final ActionType SEND;
		public static final ActionType TURN;

		static 
		{
			SEND = new ActionType("SEND", 0);
		//    0    0:new             #2   <Class GameRequestContent$ActionType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "SEND">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void GameRequestContent$ActionType(String, int)>
		//    5   10:putstatic       #23  <Field GameRequestContent$ActionType SEND>
			ASKFOR = new ActionType("ASKFOR", 1);
		//    6   13:new             #2   <Class GameRequestContent$ActionType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "ASKFOR">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void GameRequestContent$ActionType(String, int)>
		//   11   23:putstatic       #26  <Field GameRequestContent$ActionType ASKFOR>
			TURN = new ActionType("TURN", 2);
		//   12   26:new             #2   <Class GameRequestContent$ActionType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "TURN">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void GameRequestContent$ActionType(String, int)>
		//   17   36:putstatic       #29  <Field GameRequestContent$ActionType TURN>
			$VALUES = (new ActionType[] {
				SEND, ASKFOR, TURN
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       ActionType[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field GameRequestContent$ActionType SEND>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field GameRequestContent$ActionType ASKFOR>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field GameRequestContent$ActionType TURN>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field GameRequestContent$ActionType[] $VALUES>
		//*  33   64:return          
		}

		private ActionType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class Filters extends Enum
	{

		public static Filters valueOf(String s)
		{
			return (Filters)Enum.valueOf(com/facebook/share/model/GameRequestContent$Filters, s);
		//    0    0:ldc1            #2   <Class GameRequestContent$Filters>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GameRequestContent$Filters>
		//    4    9:areturn         
		}

		public static Filters[] values()
		{
			return (Filters[])((Filters []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field GameRequestContent$Filters[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.share.model.GameRequestContent$Filters_3B_.clone()>
		//    2    6:checkcast       #38  <Class GameRequestContent$Filters[]>
		//    3    9:areturn         
		}

		private static final Filters $VALUES[];
		public static final Filters APP_NON_USERS;
		public static final Filters APP_USERS;

		static 
		{
			APP_USERS = new Filters("APP_USERS", 0);
		//    0    0:new             #2   <Class GameRequestContent$Filters>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "APP_USERS">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void GameRequestContent$Filters(String, int)>
		//    5   10:putstatic       #22  <Field GameRequestContent$Filters APP_USERS>
			APP_NON_USERS = new Filters("APP_NON_USERS", 1);
		//    6   13:new             #2   <Class GameRequestContent$Filters>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "APP_NON_USERS">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void GameRequestContent$Filters(String, int)>
		//   11   23:putstatic       #25  <Field GameRequestContent$Filters APP_NON_USERS>
			$VALUES = (new Filters[] {
				APP_USERS, APP_NON_USERS
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Filters[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field GameRequestContent$Filters APP_USERS>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field GameRequestContent$Filters APP_NON_USERS>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field GameRequestContent$Filters[] $VALUES>
		//*  23   45:return          
		}

		private Filters(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	GameRequestContent(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		message = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #46  <Method String Parcel.readString()>
	//    5    9:putfield        #48  <Field String message>
		recipients = ((List) (parcel.createStringArrayList()));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #52  <Method java.util.ArrayList Parcel.createStringArrayList()>
	//    9   17:putfield        #54  <Field List recipients>
		title = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #46  <Method String Parcel.readString()>
	//   13   25:putfield        #56  <Field String title>
		data = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #46  <Method String Parcel.readString()>
	//   17   33:putfield        #58  <Field String data>
		actionType = (ActionType)parcel.readSerializable();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #62  <Method java.io.Serializable Parcel.readSerializable()>
	//   21   41:checkcast       #10  <Class GameRequestContent$ActionType>
	//   22   44:putfield        #64  <Field GameRequestContent$ActionType actionType>
		objectId = parcel.readString();
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #46  <Method String Parcel.readString()>
	//   26   52:putfield        #66  <Field String objectId>
		filters = (Filters)parcel.readSerializable();
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #62  <Method java.io.Serializable Parcel.readSerializable()>
	//   30   60:checkcast       #13  <Class GameRequestContent$Filters>
	//   31   63:putfield        #68  <Field GameRequestContent$Filters filters>
		suggestions = ((List) (parcel.createStringArrayList()));
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:invokevirtual   #52  <Method java.util.ArrayList Parcel.createStringArrayList()>
	//   35   71:putfield        #70  <Field List suggestions>
		parcel.readStringList(suggestions);
	//   36   74:aload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #70  <Field List suggestions>
	//   39   79:invokevirtual   #74  <Method void Parcel.readStringList(List)>
	//   40   82:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(message);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field String message>
	//    3    5:invokevirtual   #82  <Method void Parcel.writeString(String)>
		parcel.writeStringList(recipients);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #54  <Field List recipients>
	//    7   13:invokevirtual   #85  <Method void Parcel.writeStringList(List)>
		parcel.writeString(title);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #56  <Field String title>
	//   11   21:invokevirtual   #82  <Method void Parcel.writeString(String)>
		parcel.writeString(data);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #58  <Field String data>
	//   15   29:invokevirtual   #82  <Method void Parcel.writeString(String)>
		parcel.writeSerializable(((java.io.Serializable) (actionType)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #64  <Field GameRequestContent$ActionType actionType>
	//   19   37:invokevirtual   #89  <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeString(objectId);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #66  <Field String objectId>
	//   23   45:invokevirtual   #82  <Method void Parcel.writeString(String)>
		parcel.writeSerializable(((java.io.Serializable) (filters)));
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #68  <Field GameRequestContent$Filters filters>
	//   27   53:invokevirtual   #89  <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeStringList(suggestions);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #70  <Field List suggestions>
	//   31   61:invokevirtual   #85  <Method void Parcel.writeStringList(List)>
	//   32   64:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public GameRequestContent createFromParcel(Parcel parcel)
		{
			return new GameRequestContent(parcel);
		//    0    0:new             #9   <Class GameRequestContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void GameRequestContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method GameRequestContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public GameRequestContent[] newArray(int i)
		{
			return new GameRequestContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       GameRequestContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method GameRequestContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final ActionType actionType;
	private final String data;
	private final Filters filters;
	private final String message;
	private final String objectId;
	private final List recipients;
	private final List suggestions;
	private final String title;

	static 
	{
	//    0    0:new             #8   <Class GameRequestContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void GameRequestContent$1()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
