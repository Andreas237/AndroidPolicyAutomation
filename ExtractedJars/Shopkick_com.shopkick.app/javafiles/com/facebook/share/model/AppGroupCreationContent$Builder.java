// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, AppGroupCreationContent, ShareModel

public static class AppGroupCreationContent$Builder
	implements ShareModelBuilder
{

	public AppGroupCreationContent build()
	{
		return new AppGroupCreationContent(this, ((AppGroupCreationContent._cls1) (null)));
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

	public AppGroupCreationContent$Builder readFrom(AppGroupCreationContent appgroupcreationcontent)
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

	public AppGroupCreationContent$Builder setAppGroupPrivacy(Privacy privacy1)
	{
		privacy = privacy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field AppGroupCreationContent$AppGroupPrivacy privacy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AppGroupCreationContent$Builder setDescription(String s)
	{
		description = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String description>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AppGroupCreationContent$Builder setName(String s)
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
	private Privacy privacy;


/*
	static String access$000(AppGroupCreationContent$Builder appgroupcreationcontent$builder)
	{
		return appgroupcreationcontent$builder.name;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String name>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(AppGroupCreationContent$Builder appgroupcreationcontent$builder)
	{
		return appgroupcreationcontent$builder.description;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String description>
	//    2    4:areturn         
	}

*/


/*
	static Privacy access$200(AppGroupCreationContent$Builder appgroupcreationcontent$builder)
	{
		return appgroupcreationcontent$builder.privacy;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AppGroupCreationContent$AppGroupPrivacy privacy>
	//    2    4:areturn         
	}

*/

	public AppGroupCreationContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
