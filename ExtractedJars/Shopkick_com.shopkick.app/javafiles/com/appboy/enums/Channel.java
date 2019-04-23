// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;


public final class Channel extends Enum
{

	private Channel(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static Channel valueOf(String s)
	{
		return (Channel)Enum.valueOf(com/appboy/enums/Channel, s);
	//    0    0:ldc1            #2   <Class Channel>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Channel>
	//    4    9:areturn         
	}

	public static Channel[] values()
	{
		return (Channel[])((Channel []) (a)).clone();
	//    0    0:getstatic       #32  <Field Channel[] a>
	//    1    3:invokevirtual   #47  <Method Object _5B_Lcom.appboy.enums.Channel_3B_.clone()>
	//    2    6:checkcast       #43  <Class Channel[]>
	//    3    9:areturn         
	}

	public static final Channel INAPP_MESSAGE;
	public static final Channel NEWS_FEED;
	public static final Channel PUSH;
	public static final Channel UNKNOWN;
	private static final Channel a[];

	static 
	{
		PUSH = new Channel("PUSH", 0);
	//    0    0:new             #2   <Class Channel>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "PUSH">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #19  <Method void Channel(String, int)>
	//    5   10:putstatic       #21  <Field Channel PUSH>
		INAPP_MESSAGE = new Channel("INAPP_MESSAGE", 1);
	//    6   13:new             #2   <Class Channel>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "INAPP_MESSAGE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #19  <Method void Channel(String, int)>
	//   11   23:putstatic       #24  <Field Channel INAPP_MESSAGE>
		NEWS_FEED = new Channel("NEWS_FEED", 2);
	//   12   26:new             #2   <Class Channel>
	//   13   29:dup             
	//   14   30:ldc1            #25  <String "NEWS_FEED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #19  <Method void Channel(String, int)>
	//   17   36:putstatic       #27  <Field Channel NEWS_FEED>
		UNKNOWN = new Channel("UNKNOWN", 3);
	//   18   39:new             #2   <Class Channel>
	//   19   42:dup             
	//   20   43:ldc1            #28  <String "UNKNOWN">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #19  <Method void Channel(String, int)>
	//   23   49:putstatic       #30  <Field Channel UNKNOWN>
		a = (new Channel[] {
			PUSH, INAPP_MESSAGE, NEWS_FEED, UNKNOWN
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       Channel[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #21  <Field Channel PUSH>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #24  <Field Channel INAPP_MESSAGE>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #27  <Field Channel NEWS_FEED>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #30  <Field Channel UNKNOWN>
	//   41   79:aastore         
	//   42   80:putstatic       #32  <Field Channel[] a>
	//*  43   83:return          
	}
}
