// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//			ShareMedia

public static final class ShareMedia$Type extends Enum
{

	public static ShareMedia$Type valueOf(String s)
	{
		return (ShareMedia$Type)Enum.valueOf(com/facebook/share/model/ShareMedia$Type, s);
	//    0    0:ldc1            #2   <Class ShareMedia$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ShareMedia$Type>
	//    4    9:areturn         
	}

	public static ShareMedia$Type[] values()
	{
		return (ShareMedia$Type[])((ShareMedia$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field ShareMedia$Type[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.share.model.ShareMedia$Type_3B_.clone()>
	//    2    6:checkcast       #38  <Class ShareMedia$Type[]>
	//    3    9:areturn         
	}

	private static final ShareMedia$Type $VALUES[];
	public static final ShareMedia$Type PHOTO;
	public static final ShareMedia$Type VIDEO;

	static 
	{
		PHOTO = new ShareMedia$Type("PHOTO", 0);
	//    0    0:new             #2   <Class ShareMedia$Type>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "PHOTO">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void ShareMedia$Type(String, int)>
	//    5   10:putstatic       #22  <Field ShareMedia$Type PHOTO>
		VIDEO = new ShareMedia$Type("VIDEO", 1);
	//    6   13:new             #2   <Class ShareMedia$Type>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "VIDEO">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void ShareMedia$Type(String, int)>
	//   11   23:putstatic       #25  <Field ShareMedia$Type VIDEO>
		$VALUES = (new ShareMedia$Type[] {
			PHOTO, VIDEO
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ShareMedia$Type[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field ShareMedia$Type PHOTO>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field ShareMedia$Type VIDEO>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field ShareMedia$Type[] $VALUES>
	//*  23   45:return          
	}

	private ShareMedia$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
