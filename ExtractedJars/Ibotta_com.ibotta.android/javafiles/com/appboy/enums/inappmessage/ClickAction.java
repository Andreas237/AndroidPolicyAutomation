// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums.inappmessage;


public final class ClickAction extends Enum
{

	private ClickAction(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ClickAction valueOf(String s)
	{
		return (ClickAction)Enum.valueOf(com/appboy/enums/inappmessage/ClickAction, s);
	//    0    0:ldc1            #2   <Class ClickAction>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ClickAction>
	//    4    9:areturn         
	}

	public static ClickAction[] values()
	{
		return (ClickAction[])((ClickAction []) (a)).clone();
	//    0    0:getstatic       #28  <Field ClickAction[] a>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.appboy.enums.inappmessage.ClickAction_3B_.clone()>
	//    2    6:checkcast       #39  <Class ClickAction[]>
	//    3    9:areturn         
	}

	public static final ClickAction NEWS_FEED;
	public static final ClickAction NONE;
	public static final ClickAction URI;
	private static final ClickAction a[];

	static 
	{
		NEWS_FEED = new ClickAction("NEWS_FEED", 0);
	//    0    0:new             #2   <Class ClickAction>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "NEWS_FEED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void ClickAction(String, int)>
	//    5   10:putstatic       #20  <Field ClickAction NEWS_FEED>
		URI = new ClickAction("URI", 1);
	//    6   13:new             #2   <Class ClickAction>
	//    7   16:dup             
	//    8   17:ldc1            #21  <String "URI">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void ClickAction(String, int)>
	//   11   23:putstatic       #23  <Field ClickAction URI>
		NONE = new ClickAction("NONE", 2);
	//   12   26:new             #2   <Class ClickAction>
	//   13   29:dup             
	//   14   30:ldc1            #24  <String "NONE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #18  <Method void ClickAction(String, int)>
	//   17   36:putstatic       #26  <Field ClickAction NONE>
		a = (new ClickAction[] {
			NEWS_FEED, URI, NONE
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       ClickAction[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #20  <Field ClickAction NEWS_FEED>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #23  <Field ClickAction URI>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #26  <Field ClickAction NONE>
	//   31   60:aastore         
	//   32   61:putstatic       #28  <Field ClickAction[] a>
	//*  33   64:return          
	}
}
