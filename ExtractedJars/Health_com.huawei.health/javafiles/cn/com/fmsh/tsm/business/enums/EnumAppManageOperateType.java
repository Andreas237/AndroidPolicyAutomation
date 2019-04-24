// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumAppManageOperateType extends Enum
{

	private EnumAppManageOperateType(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #58  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #60  <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #62  <Field String desc>
	//   10   17:return          
	}

	public static EnumAppManageOperateType instance(int i)
	{
		EnumAppManageOperateType aenumappmanageoperatetype[] = values();
	//    0    0:invokestatic    #68  <Method EnumAppManageOperateType[] values()>
	//    1    3:astore_3        
		int k = aenumappmanageoperatetype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumAppManageOperateType enumappmanageoperatetype = aenumappmanageoperatetype[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumappmanageoperatetype.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #72  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumappmanageoperatetype;
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

	public static EnumAppManageOperateType valueOf(String s)
	{
		return (EnumAppManageOperateType)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumAppManageOperateType, s);
	//    0    0:ldc1            #2   <Class EnumAppManageOperateType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #77  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumAppManageOperateType>
	//    4    9:areturn         
	}

	public static EnumAppManageOperateType[] values()
	{
		EnumAppManageOperateType aenumappmanageoperatetype[] = ENUM$VALUES;
	//    0    0:getstatic       #54  <Field EnumAppManageOperateType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumappmanageoperatetype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumAppManageOperateType aenumappmanageoperatetype1[] = new EnumAppManageOperateType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumAppManageOperateType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumappmanageoperatetype)), 0, ((Object) (aenumappmanageoperatetype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #83  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumappmanageoperatetype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int id>
	//    2    4:ireturn         
	}

	public static final EnumAppManageOperateType APP_DELETE;
	public static final EnumAppManageOperateType APP_DOWNLOAD;
	public static final EnumAppManageOperateType APP_LOCK;
	public static final EnumAppManageOperateType APP_MOVE;
	public static final EnumAppManageOperateType APP_STATUS_QUERY;
	public static final EnumAppManageOperateType APP_UNLOCK;
	private static final EnumAppManageOperateType ENUM$VALUES[];
	private String desc;
	private int id;

	static 
	{
		APP_LOCK = new EnumAppManageOperateType("APP_LOCK", 0, 1, "\u5361\u4E0A\u5E94\u7528\u5173\u95ED");
	//    0    0:new             #2   <Class EnumAppManageOperateType>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "APP_LOCK">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:ldc1            #23  <String "\u5361\u4E0A\u5E94\u7528\u5173\u95ED">
	//    6   10:invokespecial   #27  <Method void EnumAppManageOperateType(String, int, int, String)>
	//    7   13:putstatic       #29  <Field EnumAppManageOperateType APP_LOCK>
		APP_UNLOCK = new EnumAppManageOperateType("APP_UNLOCK", 1, 2, "\u5361\u4E0A\u5E94\u7528\u5F00\u542F");
	//    8   16:new             #2   <Class EnumAppManageOperateType>
	//    9   19:dup             
	//   10   20:ldc1            #30  <String "APP_UNLOCK">
	//   11   22:iconst_1        
	//   12   23:iconst_2        
	//   13   24:ldc1            #32  <String "\u5361\u4E0A\u5E94\u7528\u5F00\u542F">
	//   14   26:invokespecial   #27  <Method void EnumAppManageOperateType(String, int, int, String)>
	//   15   29:putstatic       #34  <Field EnumAppManageOperateType APP_UNLOCK>
		APP_STATUS_QUERY = new EnumAppManageOperateType("APP_STATUS_QUERY", 2, 3, "\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u67E5\u8BE2");
	//   16   32:new             #2   <Class EnumAppManageOperateType>
	//   17   35:dup             
	//   18   36:ldc1            #35  <String "APP_STATUS_QUERY">
	//   19   38:iconst_2        
	//   20   39:iconst_3        
	//   21   40:ldc1            #37  <String "\u5361\u4E0A\u5E94\u7528\u5F53\u524D\u72B6\u6001\u67E5\u8BE2">
	//   22   42:invokespecial   #27  <Method void EnumAppManageOperateType(String, int, int, String)>
	//   23   45:putstatic       #39  <Field EnumAppManageOperateType APP_STATUS_QUERY>
		APP_DELETE = new EnumAppManageOperateType("APP_DELETE", 3, 4, "\u5361\u4E0A\u5E94\u7528\u5220\u9664");
	//   24   48:new             #2   <Class EnumAppManageOperateType>
	//   25   51:dup             
	//   26   52:ldc1            #40  <String "APP_DELETE">
	//   27   54:iconst_3        
	//   28   55:iconst_4        
	//   29   56:ldc1            #42  <String "\u5361\u4E0A\u5E94\u7528\u5220\u9664">
	//   30   58:invokespecial   #27  <Method void EnumAppManageOperateType(String, int, int, String)>
	//   31   61:putstatic       #44  <Field EnumAppManageOperateType APP_DELETE>
		APP_MOVE = new EnumAppManageOperateType("APP_MOVE", 4, 5, "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA");
	//   32   64:new             #2   <Class EnumAppManageOperateType>
	//   33   67:dup             
	//   34   68:ldc1            #45  <String "APP_MOVE">
	//   35   70:iconst_4        
	//   36   71:iconst_5        
	//   37   72:ldc1            #47  <String "\u5361\u4E0A\u5E94\u7528\u8FC1\u51FA">
	//   38   74:invokespecial   #27  <Method void EnumAppManageOperateType(String, int, int, String)>
	//   39   77:putstatic       #49  <Field EnumAppManageOperateType APP_MOVE>
		APP_DOWNLOAD = new EnumAppManageOperateType("APP_DOWNLOAD", 5, 6, "\u5361\u4E0A\u5E94\u7528\u5220\u9664");
	//   40   80:new             #2   <Class EnumAppManageOperateType>
	//   41   83:dup             
	//   42   84:ldc1            #50  <String "APP_DOWNLOAD">
	//   43   86:iconst_5        
	//   44   87:bipush          6
	//   45   89:ldc1            #42  <String "\u5361\u4E0A\u5E94\u7528\u5220\u9664">
	//   46   91:invokespecial   #27  <Method void EnumAppManageOperateType(String, int, int, String)>
	//   47   94:putstatic       #52  <Field EnumAppManageOperateType APP_DOWNLOAD>
		ENUM$VALUES = (new EnumAppManageOperateType[] {
			APP_LOCK, APP_UNLOCK, APP_STATUS_QUERY, APP_DELETE, APP_MOVE, APP_DOWNLOAD
		});
	//   48   97:bipush          6
	//   49   99:anewarray       EnumAppManageOperateType[]
	//   50  102:dup             
	//   51  103:iconst_0        
	//   52  104:getstatic       #29  <Field EnumAppManageOperateType APP_LOCK>
	//   53  107:aastore         
	//   54  108:dup             
	//   55  109:iconst_1        
	//   56  110:getstatic       #34  <Field EnumAppManageOperateType APP_UNLOCK>
	//   57  113:aastore         
	//   58  114:dup             
	//   59  115:iconst_2        
	//   60  116:getstatic       #39  <Field EnumAppManageOperateType APP_STATUS_QUERY>
	//   61  119:aastore         
	//   62  120:dup             
	//   63  121:iconst_3        
	//   64  122:getstatic       #44  <Field EnumAppManageOperateType APP_DELETE>
	//   65  125:aastore         
	//   66  126:dup             
	//   67  127:iconst_4        
	//   68  128:getstatic       #49  <Field EnumAppManageOperateType APP_MOVE>
	//   69  131:aastore         
	//   70  132:dup             
	//   71  133:iconst_5        
	//   72  134:getstatic       #52  <Field EnumAppManageOperateType APP_DOWNLOAD>
	//   73  137:aastore         
	//   74  138:putstatic       #54  <Field EnumAppManageOperateType[] ENUM$VALUES>
	//*  75  141:return          
	}
}
