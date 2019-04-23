// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//			AppInviteContent

public static final class AppInviteContent$Builder$Destination extends Enum
{

	public static AppInviteContent$Builder$Destination valueOf(String s)
	{
		return (AppInviteContent$Builder$Destination)Enum.valueOf(com/facebook/share/model/AppInviteContent$Builder$Destination, s);
	//    0    0:ldc1            #2   <Class AppInviteContent$Builder$Destination>
	//    1    2:aload_0         
	//    2    3:invokestatic    #50  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppInviteContent$Builder$Destination>
	//    4    9:areturn         
	}

	public static AppInviteContent$Builder$Destination[] values()
	{
		return (AppInviteContent$Builder$Destination[])((AppInviteContent$Builder$Destination []) ($VALUES)).clone();
	//    0    0:getstatic       #37  <Field AppInviteContent$Builder$Destination[] $VALUES>
	//    1    3:invokevirtual   #57  <Method Object _5B_Lcom.facebook.share.model.AppInviteContent$Builder$Destination_3B_.clone()>
	//    2    6:checkcast       #53  <Class AppInviteContent$Builder$Destination[]>
	//    3    9:areturn         
	}

	public boolean equalsName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return name.equals(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #43  <Field String name>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #65  <Method boolean String.equals(Object)>
	//    8   14:ireturn         
	}

	public String toString()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String name>
	//    2    4:areturn         
	}

	private static final AppInviteContent$Builder$Destination $VALUES[];
	public static final AppInviteContent$Builder$Destination FACEBOOK;
	public static final AppInviteContent$Builder$Destination MESSENGER;
	private final String name;

	static 
	{
		FACEBOOK = new AppInviteContent$Builder$Destination("FACEBOOK", 0, "facebook");
	//    0    0:new             #2   <Class AppInviteContent$Builder$Destination>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "FACEBOOK">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <String "facebook">
	//    5    9:invokespecial   #28  <Method void AppInviteContent$Builder$Destination(String, int, String)>
	//    6   12:putstatic       #30  <Field AppInviteContent$Builder$Destination FACEBOOK>
		MESSENGER = new AppInviteContent$Builder$Destination("MESSENGER", 1, "messenger");
	//    7   15:new             #2   <Class AppInviteContent$Builder$Destination>
	//    8   18:dup             
	//    9   19:ldc1            #31  <String "MESSENGER">
	//   10   21:iconst_1        
	//   11   22:ldc1            #33  <String "messenger">
	//   12   24:invokespecial   #28  <Method void AppInviteContent$Builder$Destination(String, int, String)>
	//   13   27:putstatic       #35  <Field AppInviteContent$Builder$Destination MESSENGER>
		$VALUES = (new AppInviteContent$Builder$Destination[] {
			FACEBOOK, MESSENGER
		});
	//   14   30:iconst_2        
	//   15   31:anewarray       AppInviteContent$Builder$Destination[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:getstatic       #30  <Field AppInviteContent$Builder$Destination FACEBOOK>
	//   19   39:aastore         
	//   20   40:dup             
	//   21   41:iconst_1        
	//   22   42:getstatic       #35  <Field AppInviteContent$Builder$Destination MESSENGER>
	//   23   45:aastore         
	//   24   46:putstatic       #37  <Field AppInviteContent$Builder$Destination[] $VALUES>
	//*  25   49:return          
	}

	private AppInviteContent$Builder$Destination(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		name = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #43  <Field String name>
	//    7   11:return          
	}
}
