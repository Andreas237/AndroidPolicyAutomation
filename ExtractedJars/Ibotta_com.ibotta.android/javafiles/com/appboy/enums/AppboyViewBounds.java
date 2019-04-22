// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;


public final class AppboyViewBounds extends Enum
{

	private AppboyViewBounds(String s, int i, int j, int k)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #51  <Method void Enum(String, int)>
		a = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #53  <Field int a>
		b = k;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #55  <Field int b>
	//   10   17:return          
	}

	public static AppboyViewBounds valueOf(String s)
	{
		return (AppboyViewBounds)Enum.valueOf(com/appboy/enums/AppboyViewBounds, s);
	//    0    0:ldc1            #2   <Class AppboyViewBounds>
	//    1    2:aload_0         
	//    2    3:invokestatic    #62  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppboyViewBounds>
	//    4    9:areturn         
	}

	public static AppboyViewBounds[] values()
	{
		return (AppboyViewBounds[])((AppboyViewBounds []) (c)).clone();
	//    0    0:getstatic       #47  <Field AppboyViewBounds[] c>
	//    1    3:invokevirtual   #69  <Method Object _5B_Lcom.appboy.enums.AppboyViewBounds_3B_.clone()>
	//    2    6:checkcast       #65  <Class AppboyViewBounds[]>
	//    3    9:areturn         
	}

	public int getHeightDp()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int b>
	//    2    4:ireturn         
	}

	public int getWidthDp()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int a>
	//    2    4:ireturn         
	}

	public static final AppboyViewBounds BASE_CARD_VIEW;
	public static final AppboyViewBounds IN_APP_MESSAGE_MODAL;
	public static final AppboyViewBounds IN_APP_MESSAGE_SLIDEUP;
	public static final AppboyViewBounds NOTIFICATION_EXPANDED_IMAGE;
	public static final AppboyViewBounds NOTIFICATION_LARGE_ICON;
	public static final AppboyViewBounds NOTIFICATION_ONE_IMAGE_STORY;
	public static final AppboyViewBounds NO_BOUNDS;
	private static final AppboyViewBounds c[];
	final int a;
	final int b;

	static 
	{
		NOTIFICATION_EXPANDED_IMAGE = new AppboyViewBounds("NOTIFICATION_EXPANDED_IMAGE", 0, 478, 256);
	//    0    0:new             #2   <Class AppboyViewBounds>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "NOTIFICATION_EXPANDED_IMAGE">
	//    3    6:iconst_0        
	//    4    7:sipush          478
	//    5   10:sipush          256
	//    6   13:invokespecial   #25  <Method void AppboyViewBounds(String, int, int, int)>
	//    7   16:putstatic       #27  <Field AppboyViewBounds NOTIFICATION_EXPANDED_IMAGE>
		NOTIFICATION_LARGE_ICON = new AppboyViewBounds("NOTIFICATION_LARGE_ICON", 1, 64, 64);
	//    8   19:new             #2   <Class AppboyViewBounds>
	//    9   22:dup             
	//   10   23:ldc1            #28  <String "NOTIFICATION_LARGE_ICON">
	//   11   25:iconst_1        
	//   12   26:bipush          64
	//   13   28:bipush          64
	//   14   30:invokespecial   #25  <Method void AppboyViewBounds(String, int, int, int)>
	//   15   33:putstatic       #30  <Field AppboyViewBounds NOTIFICATION_LARGE_ICON>
		NOTIFICATION_ONE_IMAGE_STORY = new AppboyViewBounds("NOTIFICATION_ONE_IMAGE_STORY", 2, 256, 128);
	//   16   36:new             #2   <Class AppboyViewBounds>
	//   17   39:dup             
	//   18   40:ldc1            #31  <String "NOTIFICATION_ONE_IMAGE_STORY">
	//   19   42:iconst_2        
	//   20   43:sipush          256
	//   21   46:sipush          128
	//   22   49:invokespecial   #25  <Method void AppboyViewBounds(String, int, int, int)>
	//   23   52:putstatic       #33  <Field AppboyViewBounds NOTIFICATION_ONE_IMAGE_STORY>
		BASE_CARD_VIEW = new AppboyViewBounds("BASE_CARD_VIEW", 3, 512, 512);
	//   24   55:new             #2   <Class AppboyViewBounds>
	//   25   58:dup             
	//   26   59:ldc1            #34  <String "BASE_CARD_VIEW">
	//   27   61:iconst_3        
	//   28   62:sipush          512
	//   29   65:sipush          512
	//   30   68:invokespecial   #25  <Method void AppboyViewBounds(String, int, int, int)>
	//   31   71:putstatic       #36  <Field AppboyViewBounds BASE_CARD_VIEW>
		IN_APP_MESSAGE_MODAL = new AppboyViewBounds("IN_APP_MESSAGE_MODAL", 4, 580, 580);
	//   32   74:new             #2   <Class AppboyViewBounds>
	//   33   77:dup             
	//   34   78:ldc1            #37  <String "IN_APP_MESSAGE_MODAL">
	//   35   80:iconst_4        
	//   36   81:sipush          580
	//   37   84:sipush          580
	//   38   87:invokespecial   #25  <Method void AppboyViewBounds(String, int, int, int)>
	//   39   90:putstatic       #39  <Field AppboyViewBounds IN_APP_MESSAGE_MODAL>
		IN_APP_MESSAGE_SLIDEUP = new AppboyViewBounds("IN_APP_MESSAGE_SLIDEUP", 5, 100, 100);
	//   40   93:new             #2   <Class AppboyViewBounds>
	//   41   96:dup             
	//   42   97:ldc1            #40  <String "IN_APP_MESSAGE_SLIDEUP">
	//   43   99:iconst_5        
	//   44  100:bipush          100
	//   45  102:bipush          100
	//   46  104:invokespecial   #25  <Method void AppboyViewBounds(String, int, int, int)>
	//   47  107:putstatic       #42  <Field AppboyViewBounds IN_APP_MESSAGE_SLIDEUP>
		NO_BOUNDS = new AppboyViewBounds("NO_BOUNDS", 6, 0, 0);
	//   48  110:new             #2   <Class AppboyViewBounds>
	//   49  113:dup             
	//   50  114:ldc1            #43  <String "NO_BOUNDS">
	//   51  116:bipush          6
	//   52  118:iconst_0        
	//   53  119:iconst_0        
	//   54  120:invokespecial   #25  <Method void AppboyViewBounds(String, int, int, int)>
	//   55  123:putstatic       #45  <Field AppboyViewBounds NO_BOUNDS>
		c = (new AppboyViewBounds[] {
			NOTIFICATION_EXPANDED_IMAGE, NOTIFICATION_LARGE_ICON, NOTIFICATION_ONE_IMAGE_STORY, BASE_CARD_VIEW, IN_APP_MESSAGE_MODAL, IN_APP_MESSAGE_SLIDEUP, NO_BOUNDS
		});
	//   56  126:bipush          7
	//   57  128:anewarray       AppboyViewBounds[]
	//   58  131:dup             
	//   59  132:iconst_0        
	//   60  133:getstatic       #27  <Field AppboyViewBounds NOTIFICATION_EXPANDED_IMAGE>
	//   61  136:aastore         
	//   62  137:dup             
	//   63  138:iconst_1        
	//   64  139:getstatic       #30  <Field AppboyViewBounds NOTIFICATION_LARGE_ICON>
	//   65  142:aastore         
	//   66  143:dup             
	//   67  144:iconst_2        
	//   68  145:getstatic       #33  <Field AppboyViewBounds NOTIFICATION_ONE_IMAGE_STORY>
	//   69  148:aastore         
	//   70  149:dup             
	//   71  150:iconst_3        
	//   72  151:getstatic       #36  <Field AppboyViewBounds BASE_CARD_VIEW>
	//   73  154:aastore         
	//   74  155:dup             
	//   75  156:iconst_4        
	//   76  157:getstatic       #39  <Field AppboyViewBounds IN_APP_MESSAGE_MODAL>
	//   77  160:aastore         
	//   78  161:dup             
	//   79  162:iconst_5        
	//   80  163:getstatic       #42  <Field AppboyViewBounds IN_APP_MESSAGE_SLIDEUP>
	//   81  166:aastore         
	//   82  167:dup             
	//   83  168:bipush          6
	//   84  170:getstatic       #45  <Field AppboyViewBounds NO_BOUNDS>
	//   85  173:aastore         
	//   86  174:putstatic       #47  <Field AppboyViewBounds[] c>
	//*  87  177:return          
	}
}
