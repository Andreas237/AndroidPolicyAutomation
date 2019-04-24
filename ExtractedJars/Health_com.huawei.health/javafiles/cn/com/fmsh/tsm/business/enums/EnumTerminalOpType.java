// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumTerminalOpType extends Enum
{

	private EnumTerminalOpType(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #42  <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #44  <Field String desc>
	//   10   17:return          
	}

	public static EnumTerminalOpType getEnumTerminalOpType4ID(int i)
	{
		EnumTerminalOpType aenumterminaloptype[] = values();
	//    0    0:invokestatic    #50  <Method EnumTerminalOpType[] values()>
	//    1    3:astore_3        
		int k = aenumterminaloptype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumTerminalOpType enumterminaloptype = aenumterminaloptype[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumterminaloptype.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #54  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumterminaloptype;
	//   16   26:aload           4
	//   17   28:areturn         
		}

	//   18   29:iload_1         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_1        
	//   22   33:iload_1         
	//   23   34:iload_2         
	//   24   35:icmplt          12
		return null;
	//   25   38:aconst_null     
	//   26   39:areturn         
	}

	public static EnumTerminalOpType valueOf(String s)
	{
		return (EnumTerminalOpType)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumTerminalOpType, s);
	//    0    0:ldc1            #2   <Class EnumTerminalOpType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumTerminalOpType>
	//    4    9:areturn         
	}

	public static EnumTerminalOpType[] values()
	{
		EnumTerminalOpType aenumterminaloptype[] = ENUM$VALUES;
	//    0    0:getstatic       #36  <Field EnumTerminalOpType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumterminaloptype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumTerminalOpType aenumterminaloptype1[] = new EnumTerminalOpType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumTerminalOpType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumterminaloptype)), 0, ((Object) (aenumterminaloptype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #65  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumterminaloptype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int id>
	//    2    4:ireturn         
	}

	public static final EnumTerminalOpType ANDROID;
	private static final EnumTerminalOpType ENUM$VALUES[];
	public static final EnumTerminalOpType IOS;
	public static final EnumTerminalOpType WINDOWS;
	private String desc;
	private int id;

	static 
	{
		ANDROID = new EnumTerminalOpType("ANDROID", 0, 1, "ANDROID");
	//    0    0:new             #2   <Class EnumTerminalOpType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "ANDROID">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:ldc1            #18  <String "ANDROID">
	//    6   10:invokespecial   #22  <Method void EnumTerminalOpType(String, int, int, String)>
	//    7   13:putstatic       #24  <Field EnumTerminalOpType ANDROID>
		IOS = new EnumTerminalOpType("IOS", 1, 2, "iOS");
	//    8   16:new             #2   <Class EnumTerminalOpType>
	//    9   19:dup             
	//   10   20:ldc1            #25  <String "IOS">
	//   11   22:iconst_1        
	//   12   23:iconst_2        
	//   13   24:ldc1            #27  <String "iOS">
	//   14   26:invokespecial   #22  <Method void EnumTerminalOpType(String, int, int, String)>
	//   15   29:putstatic       #29  <Field EnumTerminalOpType IOS>
		WINDOWS = new EnumTerminalOpType("WINDOWS", 2, 3, "windows");
	//   16   32:new             #2   <Class EnumTerminalOpType>
	//   17   35:dup             
	//   18   36:ldc1            #30  <String "WINDOWS">
	//   19   38:iconst_2        
	//   20   39:iconst_3        
	//   21   40:ldc1            #32  <String "windows">
	//   22   42:invokespecial   #22  <Method void EnumTerminalOpType(String, int, int, String)>
	//   23   45:putstatic       #34  <Field EnumTerminalOpType WINDOWS>
		ENUM$VALUES = (new EnumTerminalOpType[] {
			ANDROID, IOS, WINDOWS
		});
	//   24   48:iconst_3        
	//   25   49:anewarray       EnumTerminalOpType[]
	//   26   52:dup             
	//   27   53:iconst_0        
	//   28   54:getstatic       #24  <Field EnumTerminalOpType ANDROID>
	//   29   57:aastore         
	//   30   58:dup             
	//   31   59:iconst_1        
	//   32   60:getstatic       #29  <Field EnumTerminalOpType IOS>
	//   33   63:aastore         
	//   34   64:dup             
	//   35   65:iconst_2        
	//   36   66:getstatic       #34  <Field EnumTerminalOpType WINDOWS>
	//   37   69:aastore         
	//   38   70:putstatic       #36  <Field EnumTerminalOpType[] ENUM$VALUES>
	//*  39   73:return          
	}
}
