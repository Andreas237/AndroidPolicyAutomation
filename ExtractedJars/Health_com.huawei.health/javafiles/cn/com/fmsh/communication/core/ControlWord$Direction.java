// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;


// Referenced classes of package cn.com.fmsh.communication.core:
//			ControlWord

public static final class ControlWord$Direction extends Enum
{

	public static ControlWord$Direction valueOf(String s)
	{
		return (ControlWord$Direction)Enum.valueOf(cn/com/fmsh/communication/core/ControlWord$Direction, s);
	//    0    0:ldc1            #2   <Class ControlWord$Direction>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ControlWord$Direction>
	//    4    9:areturn         
	}

	public static ControlWord$Direction[] values()
	{
		ControlWord$Direction acontrolword$direction[] = ENUM$VALUES;
	//    0    0:getstatic       #29  <Field ControlWord$Direction[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = acontrolword$direction.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		ControlWord$Direction acontrolword$direction1[] = new ControlWord$Direction[i];
	//    5    7:iload_0         
	//    6    8:anewarray       ControlWord$Direction[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (acontrolword$direction)), 0, ((Object) (acontrolword$direction1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #48  <Method void System.arraycopy(Object, int, Object, int, int)>
		return acontrolword$direction1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	private static final ControlWord$Direction ENUM$VALUES[];
	public static final ControlWord$Direction REQUEST;
	public static final ControlWord$Direction RESPONSE;
	private int value;

	static 
	{
		REQUEST = new ControlWord$Direction("REQUEST", 0, 0);
	//    0    0:new             #2   <Class ControlWord$Direction>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "REQUEST">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #22  <Method void ControlWord$Direction(String, int, int)>
	//    6   11:putstatic       #24  <Field ControlWord$Direction REQUEST>
		RESPONSE = new ControlWord$Direction("RESPONSE", 1, 1);
	//    7   14:new             #2   <Class ControlWord$Direction>
	//    8   17:dup             
	//    9   18:ldc1            #25  <String "RESPONSE">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #22  <Method void ControlWord$Direction(String, int, int)>
	//   13   25:putstatic       #27  <Field ControlWord$Direction RESPONSE>
		ENUM$VALUES = (new ControlWord$Direction[] {
			REQUEST, RESPONSE
		});
	//   14   28:iconst_2        
	//   15   29:anewarray       ControlWord$Direction[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:getstatic       #24  <Field ControlWord$Direction REQUEST>
	//   19   37:aastore         
	//   20   38:dup             
	//   21   39:iconst_1        
	//   22   40:getstatic       #27  <Field ControlWord$Direction RESPONSE>
	//   23   43:aastore         
	//   24   44:putstatic       #29  <Field ControlWord$Direction[] ENUM$VALUES>
	//*  25   47:return          
	}

	private ControlWord$Direction(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #35  <Field int value>
	//    7   11:return          
	}
}
