// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public final class MessageDialogFeature extends Enum
	implements DialogFeature
{

	private MessageDialogFeature(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #39  <Method void Enum(String, int)>
		minVersion = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #41  <Field int minVersion>
	//    7   11:return          
	}

	public static MessageDialogFeature valueOf(String s)
	{
		return (MessageDialogFeature)Enum.valueOf(com/facebook/share/internal/MessageDialogFeature, s);
	//    0    0:ldc1            #2   <Class MessageDialogFeature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MessageDialogFeature>
	//    4    9:areturn         
	}

	public static MessageDialogFeature[] values()
	{
		return (MessageDialogFeature[])((MessageDialogFeature []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field MessageDialogFeature[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.facebook.share.internal.MessageDialogFeature_3B_.clone()>
	//    2    6:checkcast       #51  <Class MessageDialogFeature[]>
	//    3    9:areturn         
	}

	public String getAction()
	{
		return "com.facebook.platform.action.request.MESSAGE_DIALOG";
	//    0    0:ldc1            #59  <String "com.facebook.platform.action.request.MESSAGE_DIALOG">
	//    1    2:areturn         
	}

	public int getMinVersion()
	{
		return minVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int minVersion>
	//    2    4:ireturn         
	}

	private static final MessageDialogFeature $VALUES[];
	public static final MessageDialogFeature MESSAGE_DIALOG;
	public static final MessageDialogFeature PHOTOS;
	public static final MessageDialogFeature VIDEO;
	private int minVersion;

	static 
	{
		MESSAGE_DIALOG = new MessageDialogFeature("MESSAGE_DIALOG", 0, 0x13350ac);
	//    0    0:new             #2   <Class MessageDialogFeature>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "MESSAGE_DIALOG">
	//    3    6:iconst_0        
	//    4    7:ldc1            #19  <Int 0x13350ac>
	//    5    9:invokespecial   #23  <Method void MessageDialogFeature(String, int, int)>
	//    6   12:putstatic       #25  <Field MessageDialogFeature MESSAGE_DIALOG>
		PHOTOS = new MessageDialogFeature("PHOTOS", 1, 0x1335124);
	//    7   15:new             #2   <Class MessageDialogFeature>
	//    8   18:dup             
	//    9   19:ldc1            #26  <String "PHOTOS">
	//   10   21:iconst_1        
	//   11   22:ldc1            #27  <Int 0x1335124>
	//   12   24:invokespecial   #23  <Method void MessageDialogFeature(String, int, int)>
	//   13   27:putstatic       #29  <Field MessageDialogFeature PHOTOS>
		VIDEO = new MessageDialogFeature("VIDEO", 2, 0x13354a2);
	//   14   30:new             #2   <Class MessageDialogFeature>
	//   15   33:dup             
	//   16   34:ldc1            #30  <String "VIDEO">
	//   17   36:iconst_2        
	//   18   37:ldc1            #31  <Int 0x13354a2>
	//   19   39:invokespecial   #23  <Method void MessageDialogFeature(String, int, int)>
	//   20   42:putstatic       #33  <Field MessageDialogFeature VIDEO>
		$VALUES = (new MessageDialogFeature[] {
			MESSAGE_DIALOG, PHOTOS, VIDEO
		});
	//   21   45:iconst_3        
	//   22   46:anewarray       MessageDialogFeature[]
	//   23   49:dup             
	//   24   50:iconst_0        
	//   25   51:getstatic       #25  <Field MessageDialogFeature MESSAGE_DIALOG>
	//   26   54:aastore         
	//   27   55:dup             
	//   28   56:iconst_1        
	//   29   57:getstatic       #29  <Field MessageDialogFeature PHOTOS>
	//   30   60:aastore         
	//   31   61:dup             
	//   32   62:iconst_2        
	//   33   63:getstatic       #33  <Field MessageDialogFeature VIDEO>
	//   34   66:aastore         
	//   35   67:putstatic       #35  <Field MessageDialogFeature[] $VALUES>
	//*  36   70:return          
	}
}
