// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

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

	public static class Builder
		implements ShareModelBuilder
	{

		public GameRequestContent build()
		{
			return new GameRequestContent(this);
		//    0    0:new             #9   <Class GameRequestContent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #61  <Method void GameRequestContent(GameRequestContent$Builder, GameRequestContent$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #64  <Method GameRequestContent build()>
		//    2    4:areturn         
		}

		Builder readFrom(Parcel parcel)
		{
			return readFrom((GameRequestContent)parcel.readParcelable(((Class) (com/facebook/share/model/GameRequestContent)).getClassLoader()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #9   <Class GameRequestContent>
		//    3    4:invokevirtual   #72  <Method ClassLoader Class.getClassLoader()>
		//    4    7:invokevirtual   #78  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
		//    5   10:checkcast       #9   <Class GameRequestContent>
		//    6   13:invokevirtual   #81  <Method GameRequestContent$Builder readFrom(GameRequestContent)>
		//    7   16:areturn         
		}

		public Builder readFrom(GameRequestContent gamerequestcontent)
		{
			if(gamerequestcontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return setMessage(gamerequestcontent.getMessage()).setRecipients(gamerequestcontent.getRecipients()).setTitle(gamerequestcontent.getTitle()).setData(gamerequestcontent.getData()).setActionType(gamerequestcontent.getActionType()).setObjectId(gamerequestcontent.getObjectId()).setFilters(gamerequestcontent.getFilters()).setSuggestions(gamerequestcontent.getSuggestions());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #85  <Method String GameRequestContent.getMessage()>
		//    7   11:invokevirtual   #89  <Method GameRequestContent$Builder setMessage(String)>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #93  <Method List GameRequestContent.getRecipients()>
		//   10   18:invokevirtual   #97  <Method GameRequestContent$Builder setRecipients(List)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #100 <Method String GameRequestContent.getTitle()>
		//   13   25:invokevirtual   #103 <Method GameRequestContent$Builder setTitle(String)>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #106 <Method String GameRequestContent.getData()>
		//   16   32:invokevirtual   #109 <Method GameRequestContent$Builder setData(String)>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #113 <Method GameRequestContent$ActionType GameRequestContent.getActionType()>
		//   19   39:invokevirtual   #117 <Method GameRequestContent$Builder setActionType(GameRequestContent$ActionType)>
		//   20   42:aload_1         
		//   21   43:invokevirtual   #120 <Method String GameRequestContent.getObjectId()>
		//   22   46:invokevirtual   #123 <Method GameRequestContent$Builder setObjectId(String)>
		//   23   49:aload_1         
		//   24   50:invokevirtual   #127 <Method GameRequestContent$Filters GameRequestContent.getFilters()>
		//   25   53:invokevirtual   #131 <Method GameRequestContent$Builder setFilters(GameRequestContent$Filters)>
		//   26   56:aload_1         
		//   27   57:invokevirtual   #134 <Method List GameRequestContent.getSuggestions()>
		//   28   60:invokevirtual   #137 <Method GameRequestContent$Builder setSuggestions(List)>
		//   29   63:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((GameRequestContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class GameRequestContent>
		//    3    5:invokevirtual   #81  <Method GameRequestContent$Builder readFrom(GameRequestContent)>
		//    4    8:areturn         
		}

		public Builder setActionType(ActionType actiontype)
		{
			actionType = actiontype;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field GameRequestContent$ActionType actionType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setData(String s)
		{
			data = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #42  <Field String data>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setFilters(Filters filters1)
		{
			filters = filters1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #53  <Field GameRequestContent$Filters filters>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setMessage(String s)
		{
			message = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #32  <Field String message>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setObjectId(String s)
		{
			objectId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field String objectId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRecipients(List list)
		{
			recipients = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field List recipients>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSuggestions(List list)
		{
			suggestions = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #56  <Field List suggestions>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTitle(String s)
		{
			title = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #39  <Field String title>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTo(String s)
		{
			if(s != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          17
				recipients = Arrays.asList(((Object []) (s.split(","))));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:ldc1            #143 <String ",">
		//    5    8:invokevirtual   #149 <Method String[] String.split(String)>
		//    6   11:invokestatic    #155 <Method List Arrays.asList(Object[])>
		//    7   14:putfield        #36  <Field List recipients>
			return this;
		//    8   17:aload_0         
		//    9   18:areturn         
		}

		private ActionType actionType;
		private String data;
		private Filters filters;
		private String message;
		private String objectId;
		private List recipients;
		private List suggestions;
		private String title;


/*
		static String access$000(Builder builder)
		{
			return builder.message;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field String message>
		//    2    4:areturn         
		}

*/


/*
		static List access$100(Builder builder)
		{
			return builder.recipients;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field List recipients>
		//    2    4:areturn         
		}

*/


/*
		static String access$200(Builder builder)
		{
			return builder.title;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field String title>
		//    2    4:areturn         
		}

*/


/*
		static String access$300(Builder builder)
		{
			return builder.data;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field String data>
		//    2    4:areturn         
		}

*/


/*
		static ActionType access$400(Builder builder)
		{
			return builder.actionType;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field GameRequestContent$ActionType actionType>
		//    2    4:areturn         
		}

*/


/*
		static String access$500(Builder builder)
		{
			return builder.objectId;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field String objectId>
		//    2    4:areturn         
		}

*/


/*
		static Filters access$600(Builder builder)
		{
			return builder.filters;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field GameRequestContent$Filters filters>
		//    2    4:areturn         
		}

*/


/*
		static List access$700(Builder builder)
		{
			return builder.suggestions;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field List suggestions>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
		//    2    4:return          
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
	//    1    1:invokespecial   #43  <Method void Object()>
		message = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #49  <Method String Parcel.readString()>
	//    5    9:putfield        #51  <Field String message>
		recipients = ((List) (parcel.createStringArrayList()));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #55  <Method java.util.ArrayList Parcel.createStringArrayList()>
	//    9   17:putfield        #57  <Field List recipients>
		title = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #49  <Method String Parcel.readString()>
	//   13   25:putfield        #59  <Field String title>
		data = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #49  <Method String Parcel.readString()>
	//   17   33:putfield        #61  <Field String data>
		actionType = (ActionType)parcel.readSerializable();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #65  <Method java.io.Serializable Parcel.readSerializable()>
	//   21   41:checkcast       #10  <Class GameRequestContent$ActionType>
	//   22   44:putfield        #67  <Field GameRequestContent$ActionType actionType>
		objectId = parcel.readString();
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #49  <Method String Parcel.readString()>
	//   26   52:putfield        #69  <Field String objectId>
		filters = (Filters)parcel.readSerializable();
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #65  <Method java.io.Serializable Parcel.readSerializable()>
	//   30   60:checkcast       #16  <Class GameRequestContent$Filters>
	//   31   63:putfield        #71  <Field GameRequestContent$Filters filters>
		suggestions = ((List) (parcel.createStringArrayList()));
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:invokevirtual   #55  <Method java.util.ArrayList Parcel.createStringArrayList()>
	//   35   71:putfield        #73  <Field List suggestions>
		parcel.readStringList(suggestions);
	//   36   74:aload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #73  <Field List suggestions>
	//   39   79:invokevirtual   #77  <Method void Parcel.readStringList(List)>
	//   40   82:return          
	}

	private GameRequestContent(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		message = builder.message;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #82  <Method String GameRequestContent$Builder.access$000(GameRequestContent$Builder)>
	//    5    9:putfield        #51  <Field String message>
		recipients = builder.recipients;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #86  <Method List GameRequestContent$Builder.access$100(GameRequestContent$Builder)>
	//    9   17:putfield        #57  <Field List recipients>
		title = builder.title;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #89  <Method String GameRequestContent$Builder.access$200(GameRequestContent$Builder)>
	//   13   25:putfield        #59  <Field String title>
		data = builder.data;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #92  <Method String GameRequestContent$Builder.access$300(GameRequestContent$Builder)>
	//   17   33:putfield        #61  <Field String data>
		actionType = builder.actionType;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #96  <Method GameRequestContent$ActionType GameRequestContent$Builder.access$400(GameRequestContent$Builder)>
	//   21   41:putfield        #67  <Field GameRequestContent$ActionType actionType>
		objectId = builder.objectId;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #99  <Method String GameRequestContent$Builder.access$500(GameRequestContent$Builder)>
	//   25   49:putfield        #69  <Field String objectId>
		filters = builder.filters;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokestatic    #103 <Method GameRequestContent$Filters GameRequestContent$Builder.access$600(GameRequestContent$Builder)>
	//   29   57:putfield        #71  <Field GameRequestContent$Filters filters>
		suggestions = builder.suggestions;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokestatic    #106 <Method List GameRequestContent$Builder.access$700(GameRequestContent$Builder)>
	//   33   65:putfield        #73  <Field List suggestions>
	//   34   68:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ActionType getActionType()
	{
		return actionType;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field GameRequestContent$ActionType actionType>
	//    2    4:areturn         
	}

	public String getData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String data>
	//    2    4:areturn         
	}

	public Filters getFilters()
	{
		return filters;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field GameRequestContent$Filters filters>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		return message;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String message>
	//    2    4:areturn         
	}

	public String getObjectId()
	{
		return objectId;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String objectId>
	//    2    4:areturn         
	}

	public List getRecipients()
	{
		return recipients;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List recipients>
	//    2    4:areturn         
	}

	public List getSuggestions()
	{
		return suggestions;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field List suggestions>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String title>
	//    2    4:areturn         
	}

	public String getTo()
	{
		if(getRecipients() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #127 <Method List getRecipients()>
	//*   2    4:ifnull          17
			return TextUtils.join(",", ((Iterable) (getRecipients())));
	//    3    7:ldc1            #129 <String ",">
	//    4    9:aload_0         
	//    5   10:invokevirtual   #127 <Method List getRecipients()>
	//    6   13:invokestatic    #135 <Method String TextUtils.join(CharSequence, Iterable)>
	//    7   16:areturn         
		else
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(message);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field String message>
	//    3    5:invokevirtual   #141 <Method void Parcel.writeString(String)>
		parcel.writeStringList(recipients);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field List recipients>
	//    7   13:invokevirtual   #144 <Method void Parcel.writeStringList(List)>
		parcel.writeString(title);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #59  <Field String title>
	//   11   21:invokevirtual   #141 <Method void Parcel.writeString(String)>
		parcel.writeString(data);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #61  <Field String data>
	//   15   29:invokevirtual   #141 <Method void Parcel.writeString(String)>
		parcel.writeSerializable(((java.io.Serializable) (actionType)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #67  <Field GameRequestContent$ActionType actionType>
	//   19   37:invokevirtual   #148 <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeString(objectId);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #69  <Field String objectId>
	//   23   45:invokevirtual   #141 <Method void Parcel.writeString(String)>
		parcel.writeSerializable(((java.io.Serializable) (filters)));
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #71  <Field GameRequestContent$Filters filters>
	//   27   53:invokevirtual   #148 <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeStringList(suggestions);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #73  <Field List suggestions>
	//   31   61:invokevirtual   #144 <Method void Parcel.writeStringList(List)>
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
	//    2    4:invokespecial   #38  <Method void GameRequestContent$1()>
	//    3    7:putstatic       #40  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
