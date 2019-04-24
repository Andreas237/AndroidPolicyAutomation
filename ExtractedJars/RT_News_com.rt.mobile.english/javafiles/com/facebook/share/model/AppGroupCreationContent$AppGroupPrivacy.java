// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//			AppGroupCreationContent

public static final class AppGroupCreationContent$AppGroupPrivacy extends Enum
{

	public static AppGroupCreationContent$AppGroupPrivacy valueOf(String s)
	{
		return (AppGroupCreationContent$AppGroupPrivacy)Enum.valueOf(com/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy, s);
	//    0    0:ldc1            #2   <Class AppGroupCreationContent$AppGroupPrivacy>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppGroupCreationContent$AppGroupPrivacy>
	//    4    9:areturn         
	}

	public static AppGroupCreationContent$AppGroupPrivacy[] values()
	{
		return (AppGroupCreationContent$AppGroupPrivacy[])((AppGroupCreationContent$AppGroupPrivacy []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field AppGroupCreationContent$AppGroupPrivacy[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.share.model.AppGroupCreationContent$AppGroupPrivacy_3B_.clone()>
	//    2    6:checkcast       #38  <Class AppGroupCreationContent$AppGroupPrivacy[]>
	//    3    9:areturn         
	}

	private static final AppGroupCreationContent$AppGroupPrivacy $VALUES[];
	public static final AppGroupCreationContent$AppGroupPrivacy Closed;
	public static final AppGroupCreationContent$AppGroupPrivacy Open;

	static 
	{
		Open = new AppGroupCreationContent$AppGroupPrivacy("Open", 0);
	//    0    0:new             #2   <Class AppGroupCreationContent$AppGroupPrivacy>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "Open">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void AppGroupCreationContent$AppGroupPrivacy(String, int)>
	//    5   10:putstatic       #22  <Field AppGroupCreationContent$AppGroupPrivacy Open>
		Closed = new AppGroupCreationContent$AppGroupPrivacy("Closed", 1);
	//    6   13:new             #2   <Class AppGroupCreationContent$AppGroupPrivacy>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "Closed">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void AppGroupCreationContent$AppGroupPrivacy(String, int)>
	//   11   23:putstatic       #25  <Field AppGroupCreationContent$AppGroupPrivacy Closed>
		$VALUES = (new AppGroupCreationContent$AppGroupPrivacy[] {
			Open, Closed
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       AppGroupCreationContent$AppGroupPrivacy[]
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

	private AppGroupCreationContent$AppGroupPrivacy(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
