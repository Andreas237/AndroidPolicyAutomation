// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, GameRequestContent, ShareModel

public static class GameRequestContent$Builder
	implements ShareModelBuilder
{

	public GameRequestContent build()
	{
		return new GameRequestContent(this, ((GameRequestContent._cls1) (null)));
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

	GameRequestContent$Builder readFrom(Parcel parcel)
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

	public GameRequestContent$Builder readFrom(GameRequestContent gamerequestcontent)
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

	public GameRequestContent$Builder setActionType(pe pe)
	{
		actionType = pe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field GameRequestContent$ActionType actionType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GameRequestContent$Builder setData(String s)
	{
		data = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String data>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GameRequestContent$Builder setFilters(GameRequestContent$Filters gamerequestcontent$filters)
	{
		filters = gamerequestcontent$filters;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field GameRequestContent$Filters filters>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GameRequestContent$Builder setMessage(String s)
	{
		message = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String message>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GameRequestContent$Builder setObjectId(String s)
	{
		objectId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field String objectId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GameRequestContent$Builder setRecipients(List list)
	{
		recipients = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field List recipients>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GameRequestContent$Builder setSuggestions(List list)
	{
		suggestions = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field List suggestions>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GameRequestContent$Builder setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String title>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GameRequestContent$Builder setTo(String s)
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

	private pe actionType;
	private String data;
	private GameRequestContent$Filters filters;
	private String message;
	private String objectId;
	private List recipients;
	private List suggestions;
	private String title;


/*
	static String access$000(GameRequestContent$Builder gamerequestcontent$builder)
	{
		return gamerequestcontent$builder.message;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String message>
	//    2    4:areturn         
	}

*/


/*
	static List access$100(GameRequestContent$Builder gamerequestcontent$builder)
	{
		return gamerequestcontent$builder.recipients;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List recipients>
	//    2    4:areturn         
	}

*/


/*
	static String access$200(GameRequestContent$Builder gamerequestcontent$builder)
	{
		return gamerequestcontent$builder.title;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String title>
	//    2    4:areturn         
	}

*/


/*
	static String access$300(GameRequestContent$Builder gamerequestcontent$builder)
	{
		return gamerequestcontent$builder.data;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String data>
	//    2    4:areturn         
	}

*/


/*
	static pe access$400(GameRequestContent$Builder gamerequestcontent$builder)
	{
		return gamerequestcontent$builder.actionType;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field GameRequestContent$ActionType actionType>
	//    2    4:areturn         
	}

*/


/*
	static String access$500(GameRequestContent$Builder gamerequestcontent$builder)
	{
		return gamerequestcontent$builder.objectId;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String objectId>
	//    2    4:areturn         
	}

*/


/*
	static GameRequestContent$Filters access$600(GameRequestContent$Builder gamerequestcontent$builder)
	{
		return gamerequestcontent$builder.filters;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field GameRequestContent$Filters filters>
	//    2    4:areturn         
	}

*/


/*
	static List access$700(GameRequestContent$Builder gamerequestcontent$builder)
	{
		return gamerequestcontent$builder.suggestions;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List suggestions>
	//    2    4:areturn         
	}

*/

	public GameRequestContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}
}
