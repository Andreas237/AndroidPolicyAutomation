// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.exception;


// Referenced classes of package cn.com.fmsh.communication.exception:
//			CommunicationException

public static final class CommunicationException$CommandDirection extends Enum
{

	public static CommunicationException$CommandDirection valueOf(String s)
	{
		return (CommunicationException$CommandDirection)Enum.valueOf(cn/com/fmsh/communication/exception/CommunicationException$CommandDirection, s);
	//    0    0:ldc1            #2   <Class CommunicationException$CommandDirection>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CommunicationException$CommandDirection>
	//    4    9:areturn         
	}

	public static CommunicationException$CommandDirection[] values()
	{
		CommunicationException$CommandDirection acommunicationexception$commanddirection[] = ENUM$VALUES;
	//    0    0:getstatic       #35  <Field CommunicationException$CommandDirection[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = acommunicationexception$commanddirection.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		CommunicationException$CommandDirection acommunicationexception$commanddirection1[] = new CommunicationException$CommandDirection[i];
	//    5    7:iload_0         
	//    6    8:anewarray       CommunicationException$CommandDirection[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (acommunicationexception$commanddirection)), 0, ((Object) (acommunicationexception$commanddirection1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
		return acommunicationexception$commanddirection1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String description>
	//    2    4:areturn         
	}

	public int getValue()
	{
		return ((int) (value));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field byte value>
	//    2    4:ireturn         
	}

	private static final CommunicationException$CommandDirection ENUM$VALUES[];
	public static final CommunicationException$CommandDirection REQUESR;
	public static final CommunicationException$CommandDirection RESPONSE;
	private String description;
	private byte value;

	static 
	{
		REQUESR = new CommunicationException$CommandDirection("REQUESR", 0, (byte)0, "\u7EC8\u7AEF\u8BF7\u6C42");
	//    0    0:new             #2   <Class CommunicationException$CommandDirection>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "REQUESR">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:ldc1            #22  <String "\u7EC8\u7AEF\u8BF7\u6C42">
	//    6   10:invokespecial   #26  <Method void CommunicationException$CommandDirection(String, int, byte, String)>
	//    7   13:putstatic       #28  <Field CommunicationException$CommandDirection REQUESR>
		RESPONSE = new CommunicationException$CommandDirection("RESPONSE", 1, (byte)1, "\u5E73\u53F0\u54CD\u5E94");
	//    8   16:new             #2   <Class CommunicationException$CommandDirection>
	//    9   19:dup             
	//   10   20:ldc1            #29  <String "RESPONSE">
	//   11   22:iconst_1        
	//   12   23:iconst_1        
	//   13   24:ldc1            #31  <String "\u5E73\u53F0\u54CD\u5E94">
	//   14   26:invokespecial   #26  <Method void CommunicationException$CommandDirection(String, int, byte, String)>
	//   15   29:putstatic       #33  <Field CommunicationException$CommandDirection RESPONSE>
		ENUM$VALUES = (new CommunicationException$CommandDirection[] {
			REQUESR, RESPONSE
		});
	//   16   32:iconst_2        
	//   17   33:anewarray       CommunicationException$CommandDirection[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:getstatic       #28  <Field CommunicationException$CommandDirection REQUESR>
	//   21   41:aastore         
	//   22   42:dup             
	//   23   43:iconst_1        
	//   24   44:getstatic       #33  <Field CommunicationException$CommandDirection RESPONSE>
	//   25   47:aastore         
	//   26   48:putstatic       #35  <Field CommunicationException$CommandDirection[] ENUM$VALUES>
	//*  27   51:return          
	}

	private CommunicationException$CommandDirection(String s, int i, byte byte0, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #39  <Method void Enum(String, int)>
		value = byte0;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #41  <Field byte value>
		description = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #43  <Field String description>
	//   10   17:return          
	}
}
