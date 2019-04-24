// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumCardAppStatus extends Enum
{

	private EnumCardAppStatus(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #60  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #62  <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #64  <Field String desc>
	//   10   17:return          
	}

	public static EnumCardAppStatus instance(int i)
	{
		EnumCardAppStatus aenumcardappstatus[] = values();
	//    0    0:invokestatic    #70  <Method EnumCardAppStatus[] values()>
	//    1    3:astore_3        
		int k = aenumcardappstatus.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumCardAppStatus enumcardappstatus = aenumcardappstatus[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumcardappstatus.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #74  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumcardappstatus;
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

	public static EnumCardAppStatus valueOf(String s)
	{
		return (EnumCardAppStatus)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumCardAppStatus, s);
	//    0    0:ldc1            #2   <Class EnumCardAppStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #79  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumCardAppStatus>
	//    4    9:areturn         
	}

	public static EnumCardAppStatus[] values()
	{
		EnumCardAppStatus aenumcardappstatus[] = ENUM$VALUES;
	//    0    0:getstatic       #56  <Field EnumCardAppStatus[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumcardappstatus.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumCardAppStatus aenumcardappstatus1[] = new EnumCardAppStatus[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumCardAppStatus[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumcardappstatus)), 0, ((Object) (aenumcardappstatus1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #85  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumcardappstatus1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int id>
	//    2    4:ireturn         
	}

	private static final EnumCardAppStatus ENUM$VALUES[];
	public static final EnumCardAppStatus STATUS_ACTIVATE;
	public static final EnumCardAppStatus STATUS_INSTALL;
	public static final EnumCardAppStatus STATUS_LOADED;
	public static final EnumCardAppStatus STATUS_NO_APP;
	public static final EnumCardAppStatus STATUS_PERSONALIZED;
	public static final EnumCardAppStatus STATUS_UNKNOW;
	private String desc;
	private int id;

	static 
	{
		STATUS_NO_APP = new EnumCardAppStatus("STATUS_NO_APP", 0, 1, "\u5E94\u7528\u672A\u5B89\u88C5");
	//    0    0:new             #2   <Class EnumCardAppStatus>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "STATUS_NO_APP">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:ldc1            #23  <String "\u5E94\u7528\u672A\u5B89\u88C5">
	//    6   10:invokespecial   #27  <Method void EnumCardAppStatus(String, int, int, String)>
	//    7   13:putstatic       #29  <Field EnumCardAppStatus STATUS_NO_APP>
		STATUS_LOADED = new EnumCardAppStatus("STATUS_LOADED", 1, 2, "\u53EF\u6267\u884C\u88C5\u8F7D\u6587\u4EF6LOADED");
	//    8   16:new             #2   <Class EnumCardAppStatus>
	//    9   19:dup             
	//   10   20:ldc1            #30  <String "STATUS_LOADED">
	//   11   22:iconst_1        
	//   12   23:iconst_2        
	//   13   24:ldc1            #32  <String "\u53EF\u6267\u884C\u88C5\u8F7D\u6587\u4EF6LOADED">
	//   14   26:invokespecial   #27  <Method void EnumCardAppStatus(String, int, int, String)>
	//   15   29:putstatic       #34  <Field EnumCardAppStatus STATUS_LOADED>
		STATUS_INSTALL = new EnumCardAppStatus("STATUS_INSTALL", 2, 3, "\u4E0A\u6D77\u4EA4\u901A\u5361\u5E94\u7528\u5B89\u88C5");
	//   16   32:new             #2   <Class EnumCardAppStatus>
	//   17   35:dup             
	//   18   36:ldc1            #35  <String "STATUS_INSTALL">
	//   19   38:iconst_2        
	//   20   39:iconst_3        
	//   21   40:ldc1            #37  <String "\u4E0A\u6D77\u4EA4\u901A\u5361\u5E94\u7528\u5B89\u88C5">
	//   22   42:invokespecial   #27  <Method void EnumCardAppStatus(String, int, int, String)>
	//   23   45:putstatic       #39  <Field EnumCardAppStatus STATUS_INSTALL>
		STATUS_PERSONALIZED = new EnumCardAppStatus("STATUS_PERSONALIZED", 3, 4, "\u4E0A\u6D77\u4EA4\u901A\u5361\u4E2A\u4EBA\u5316");
	//   24   48:new             #2   <Class EnumCardAppStatus>
	//   25   51:dup             
	//   26   52:ldc1            #40  <String "STATUS_PERSONALIZED">
	//   27   54:iconst_3        
	//   28   55:iconst_4        
	//   29   56:ldc1            #42  <String "\u4E0A\u6D77\u4EA4\u901A\u5361\u4E2A\u4EBA\u5316">
	//   30   58:invokespecial   #27  <Method void EnumCardAppStatus(String, int, int, String)>
	//   31   61:putstatic       #44  <Field EnumCardAppStatus STATUS_PERSONALIZED>
		STATUS_ACTIVATE = new EnumCardAppStatus("STATUS_ACTIVATE", 4, 5, "\u4E0A\u6D77\u4EA4\u901A\u5361\u5F00\u901A");
	//   32   64:new             #2   <Class EnumCardAppStatus>
	//   33   67:dup             
	//   34   68:ldc1            #45  <String "STATUS_ACTIVATE">
	//   35   70:iconst_4        
	//   36   71:iconst_5        
	//   37   72:ldc1            #47  <String "\u4E0A\u6D77\u4EA4\u901A\u5361\u5F00\u901A">
	//   38   74:invokespecial   #27  <Method void EnumCardAppStatus(String, int, int, String)>
	//   39   77:putstatic       #49  <Field EnumCardAppStatus STATUS_ACTIVATE>
		STATUS_UNKNOW = new EnumCardAppStatus("STATUS_UNKNOW", 5, 10, "\u672A\u77E5\u72B6\u6001");
	//   40   80:new             #2   <Class EnumCardAppStatus>
	//   41   83:dup             
	//   42   84:ldc1            #50  <String "STATUS_UNKNOW">
	//   43   86:iconst_5        
	//   44   87:bipush          10
	//   45   89:ldc1            #52  <String "\u672A\u77E5\u72B6\u6001">
	//   46   91:invokespecial   #27  <Method void EnumCardAppStatus(String, int, int, String)>
	//   47   94:putstatic       #54  <Field EnumCardAppStatus STATUS_UNKNOW>
		ENUM$VALUES = (new EnumCardAppStatus[] {
			STATUS_NO_APP, STATUS_LOADED, STATUS_INSTALL, STATUS_PERSONALIZED, STATUS_ACTIVATE, STATUS_UNKNOW
		});
	//   48   97:bipush          6
	//   49   99:anewarray       EnumCardAppStatus[]
	//   50  102:dup             
	//   51  103:iconst_0        
	//   52  104:getstatic       #29  <Field EnumCardAppStatus STATUS_NO_APP>
	//   53  107:aastore         
	//   54  108:dup             
	//   55  109:iconst_1        
	//   56  110:getstatic       #34  <Field EnumCardAppStatus STATUS_LOADED>
	//   57  113:aastore         
	//   58  114:dup             
	//   59  115:iconst_2        
	//   60  116:getstatic       #39  <Field EnumCardAppStatus STATUS_INSTALL>
	//   61  119:aastore         
	//   62  120:dup             
	//   63  121:iconst_3        
	//   64  122:getstatic       #44  <Field EnumCardAppStatus STATUS_PERSONALIZED>
	//   65  125:aastore         
	//   66  126:dup             
	//   67  127:iconst_4        
	//   68  128:getstatic       #49  <Field EnumCardAppStatus STATUS_ACTIVATE>
	//   69  131:aastore         
	//   70  132:dup             
	//   71  133:iconst_5        
	//   72  134:getstatic       #54  <Field EnumCardAppStatus STATUS_UNKNOW>
	//   73  137:aastore         
	//   74  138:putstatic       #56  <Field EnumCardAppStatus[] ENUM$VALUES>
	//*  75  141:return          
	}
}
