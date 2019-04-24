// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;


// Referenced classes of package cn.com.fmsh.communication.core:
//			LinkInfo

public static final class LinkInfo$LinkType extends Enum
{

	public static LinkInfo$LinkType valueOf(String s)
	{
		return (LinkInfo$LinkType)Enum.valueOf(cn/com/fmsh/communication/core/LinkInfo$LinkType, s);
	//    0    0:ldc1            #2   <Class LinkInfo$LinkType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #38  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LinkInfo$LinkType>
	//    4    9:areturn         
	}

	public static LinkInfo$LinkType[] values()
	{
		LinkInfo$LinkType alinkinfo$linktype[] = ENUM$VALUES;
	//    0    0:getstatic       #31  <Field LinkInfo$LinkType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = alinkinfo$linktype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		LinkInfo$LinkType alinkinfo$linktype1[] = new LinkInfo$LinkType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       LinkInfo$LinkType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (alinkinfo$linktype)), 0, ((Object) (alinkinfo$linktype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #46  <Method void System.arraycopy(Object, int, Object, int, int)>
		return alinkinfo$linktype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	private static final LinkInfo$LinkType ENUM$VALUES[];
	public static final LinkInfo$LinkType HTTP;
	public static final LinkInfo$LinkType TCP;
	public static final LinkInfo$LinkType UDP;

	static 
	{
		TCP = new LinkInfo$LinkType("TCP", 0);
	//    0    0:new             #2   <Class LinkInfo$LinkType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "TCP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void LinkInfo$LinkType(String, int)>
	//    5   10:putstatic       #23  <Field LinkInfo$LinkType TCP>
		UDP = new LinkInfo$LinkType("UDP", 1);
	//    6   13:new             #2   <Class LinkInfo$LinkType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "UDP">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void LinkInfo$LinkType(String, int)>
	//   11   23:putstatic       #26  <Field LinkInfo$LinkType UDP>
		HTTP = new LinkInfo$LinkType("HTTP", 2);
	//   12   26:new             #2   <Class LinkInfo$LinkType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "HTTP">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void LinkInfo$LinkType(String, int)>
	//   17   36:putstatic       #29  <Field LinkInfo$LinkType HTTP>
		ENUM$VALUES = (new LinkInfo$LinkType[] {
			TCP, UDP, HTTP
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       LinkInfo$LinkType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field LinkInfo$LinkType TCP>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field LinkInfo$LinkType UDP>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field LinkInfo$LinkType HTTP>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field LinkInfo$LinkType[] ENUM$VALUES>
	//*  33   64:return          
	}

	private LinkInfo$LinkType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
