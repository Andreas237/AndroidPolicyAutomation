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
	//    3    3:invokespecial   #52  <Method void Enum(String, int)>
		minVersion = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #54  <Field int minVersion>
	//    7   11:return          
	}

	public static MessageDialogFeature valueOf(String s)
	{
		return (MessageDialogFeature)Enum.valueOf(com/facebook/share/internal/MessageDialogFeature, s);
	//    0    0:ldc1            #2   <Class MessageDialogFeature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #61  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MessageDialogFeature>
	//    4    9:areturn         
	}

	public static MessageDialogFeature[] values()
	{
		return (MessageDialogFeature[])((MessageDialogFeature []) ($VALUES)).clone();
	//    0    0:getstatic       #48  <Field MessageDialogFeature[] $VALUES>
	//    1    3:invokevirtual   #68  <Method Object _5B_Lcom.facebook.share.internal.MessageDialogFeature_3B_.clone()>
	//    2    6:checkcast       #64  <Class MessageDialogFeature[]>
	//    3    9:areturn         
	}

	public String getAction()
	{
		return "com.facebook.platform.action.request.MESSAGE_DIALOG";
	//    0    0:ldc1            #72  <String "com.facebook.platform.action.request.MESSAGE_DIALOG">
	//    1    2:areturn         
	}

	public int getMinVersion()
	{
		return minVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int minVersion>
	//    2    4:ireturn         
	}

	private static final MessageDialogFeature $VALUES[];
	public static final MessageDialogFeature MESSAGE_DIALOG;
	public static final MessageDialogFeature MESSENGER_GENERIC_TEMPLATE;
	public static final MessageDialogFeature MESSENGER_MEDIA_TEMPLATE;
	public static final MessageDialogFeature MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
	public static final MessageDialogFeature PHOTOS;
	public static final MessageDialogFeature VIDEO;
	private int minVersion;

	static 
	{
		MESSAGE_DIALOG = new MessageDialogFeature("MESSAGE_DIALOG", 0, 0x13350ac);
	//    0    0:new             #2   <Class MessageDialogFeature>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "MESSAGE_DIALOG">
	//    3    6:iconst_0        
	//    4    7:ldc1            #22  <Int 0x13350ac>
	//    5    9:invokespecial   #26  <Method void MessageDialogFeature(String, int, int)>
	//    6   12:putstatic       #28  <Field MessageDialogFeature MESSAGE_DIALOG>
		PHOTOS = new MessageDialogFeature("PHOTOS", 1, 0x1335124);
	//    7   15:new             #2   <Class MessageDialogFeature>
	//    8   18:dup             
	//    9   19:ldc1            #29  <String "PHOTOS">
	//   10   21:iconst_1        
	//   11   22:ldc1            #30  <Int 0x1335124>
	//   12   24:invokespecial   #26  <Method void MessageDialogFeature(String, int, int)>
	//   13   27:putstatic       #32  <Field MessageDialogFeature PHOTOS>
		VIDEO = new MessageDialogFeature("VIDEO", 2, 0x13354a2);
	//   14   30:new             #2   <Class MessageDialogFeature>
	//   15   33:dup             
	//   16   34:ldc1            #33  <String "VIDEO">
	//   17   36:iconst_2        
	//   18   37:ldc1            #34  <Int 0x13354a2>
	//   19   39:invokespecial   #26  <Method void MessageDialogFeature(String, int, int)>
	//   20   42:putstatic       #36  <Field MessageDialogFeature VIDEO>
		MESSENGER_GENERIC_TEMPLATE = new MessageDialogFeature("MESSENGER_GENERIC_TEMPLATE", 3, 0x133c96b);
	//   21   45:new             #2   <Class MessageDialogFeature>
	//   22   48:dup             
	//   23   49:ldc1            #37  <String "MESSENGER_GENERIC_TEMPLATE">
	//   24   51:iconst_3        
	//   25   52:ldc1            #38  <Int 0x133c96b>
	//   26   54:invokespecial   #26  <Method void MessageDialogFeature(String, int, int)>
	//   27   57:putstatic       #40  <Field MessageDialogFeature MESSENGER_GENERIC_TEMPLATE>
		MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE = new MessageDialogFeature("MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE", 4, 0x133c96b);
	//   28   60:new             #2   <Class MessageDialogFeature>
	//   29   63:dup             
	//   30   64:ldc1            #41  <String "MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE">
	//   31   66:iconst_4        
	//   32   67:ldc1            #38  <Int 0x133c96b>
	//   33   69:invokespecial   #26  <Method void MessageDialogFeature(String, int, int)>
	//   34   72:putstatic       #43  <Field MessageDialogFeature MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE>
		MESSENGER_MEDIA_TEMPLATE = new MessageDialogFeature("MESSENGER_MEDIA_TEMPLATE", 5, 0x133c96b);
	//   35   75:new             #2   <Class MessageDialogFeature>
	//   36   78:dup             
	//   37   79:ldc1            #44  <String "MESSENGER_MEDIA_TEMPLATE">
	//   38   81:iconst_5        
	//   39   82:ldc1            #38  <Int 0x133c96b>
	//   40   84:invokespecial   #26  <Method void MessageDialogFeature(String, int, int)>
	//   41   87:putstatic       #46  <Field MessageDialogFeature MESSENGER_MEDIA_TEMPLATE>
		$VALUES = (new MessageDialogFeature[] {
			MESSAGE_DIALOG, PHOTOS, VIDEO, MESSENGER_GENERIC_TEMPLATE, MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE, MESSENGER_MEDIA_TEMPLATE
		});
	//   42   90:bipush          6
	//   43   92:anewarray       MessageDialogFeature[]
	//   44   95:dup             
	//   45   96:iconst_0        
	//   46   97:getstatic       #28  <Field MessageDialogFeature MESSAGE_DIALOG>
	//   47  100:aastore         
	//   48  101:dup             
	//   49  102:iconst_1        
	//   50  103:getstatic       #32  <Field MessageDialogFeature PHOTOS>
	//   51  106:aastore         
	//   52  107:dup             
	//   53  108:iconst_2        
	//   54  109:getstatic       #36  <Field MessageDialogFeature VIDEO>
	//   55  112:aastore         
	//   56  113:dup             
	//   57  114:iconst_3        
	//   58  115:getstatic       #40  <Field MessageDialogFeature MESSENGER_GENERIC_TEMPLATE>
	//   59  118:aastore         
	//   60  119:dup             
	//   61  120:iconst_4        
	//   62  121:getstatic       #43  <Field MessageDialogFeature MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE>
	//   63  124:aastore         
	//   64  125:dup             
	//   65  126:iconst_5        
	//   66  127:getstatic       #46  <Field MessageDialogFeature MESSENGER_MEDIA_TEMPLATE>
	//   67  130:aastore         
	//   68  131:putstatic       #48  <Field MessageDialogFeature[] $VALUES>
	//*  69  134:return          
	}
}
