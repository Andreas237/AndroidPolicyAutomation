// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumIssueProcess extends Enum
{

	private EnumIssueProcess(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #72  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #74  <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #76  <Field String desc>
	//   10   17:return          
	}

	public static EnumIssueProcess instance(int i)
	{
		EnumIssueProcess aenumissueprocess[] = values();
	//    0    0:invokestatic    #82  <Method EnumIssueProcess[] values()>
	//    1    3:astore_3        
		int k = aenumissueprocess.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumIssueProcess enumissueprocess = aenumissueprocess[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumissueprocess.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #86  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumissueprocess;
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

	public static EnumIssueProcess valueOf(String s)
	{
		return (EnumIssueProcess)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumIssueProcess, s);
	//    0    0:ldc1            #2   <Class EnumIssueProcess>
	//    1    2:aload_0         
	//    2    3:invokestatic    #91  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumIssueProcess>
	//    4    9:areturn         
	}

	public static EnumIssueProcess[] values()
	{
		EnumIssueProcess aenumissueprocess[] = ENUM$VALUES;
	//    0    0:getstatic       #68  <Field EnumIssueProcess[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumissueprocess.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumIssueProcess aenumissueprocess1[] = new EnumIssueProcess[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumIssueProcess[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumissueprocess)), 0, ((Object) (aenumissueprocess1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #97  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumissueprocess1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int id>
	//    2    4:ireturn         
	}

	public static final EnumIssueProcess APPLIED;
	public static final EnumIssueProcess APP_ACTIVATION;
	public static final EnumIssueProcess APP_INSTALL;
	public static final EnumIssueProcess APP_LOAD;
	public static final EnumIssueProcess APP_LOCK;
	public static final EnumIssueProcess APP_PERSONAL;
	public static final EnumIssueProcess APP_REMOVE;
	private static final EnumIssueProcess ENUM$VALUES[];
	public static final EnumIssueProcess SSD_KEY_UPDATED;
	private String desc;
	private int id;

	static 
	{
		APPLIED = new EnumIssueProcess("APPLIED", 0, 0, "\u6570\u636E\u5DF2\u7533\u8BF7");
	//    0    0:new             #2   <Class EnumIssueProcess>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "APPLIED">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:ldc1            #25  <String "\u6570\u636E\u5DF2\u7533\u8BF7">
	//    6   10:invokespecial   #29  <Method void EnumIssueProcess(String, int, int, String)>
	//    7   13:putstatic       #31  <Field EnumIssueProcess APPLIED>
		SSD_KEY_UPDATED = new EnumIssueProcess("SSD_KEY_UPDATED", 1, 10, "SSD\u5BC6\u94A5\u5DF2\u66F4\u65B0");
	//    8   16:new             #2   <Class EnumIssueProcess>
	//    9   19:dup             
	//   10   20:ldc1            #32  <String "SSD_KEY_UPDATED">
	//   11   22:iconst_1        
	//   12   23:bipush          10
	//   13   25:ldc1            #34  <String "SSD\u5BC6\u94A5\u5DF2\u66F4\u65B0">
	//   14   27:invokespecial   #29  <Method void EnumIssueProcess(String, int, int, String)>
	//   15   30:putstatic       #36  <Field EnumIssueProcess SSD_KEY_UPDATED>
		APP_LOAD = new EnumIssueProcess("APP_LOAD", 2, 20, "\u5E94\u7528\u5DF2\u52A0\u8F7D");
	//   16   33:new             #2   <Class EnumIssueProcess>
	//   17   36:dup             
	//   18   37:ldc1            #37  <String "APP_LOAD">
	//   19   39:iconst_2        
	//   20   40:bipush          20
	//   21   42:ldc1            #39  <String "\u5E94\u7528\u5DF2\u52A0\u8F7D">
	//   22   44:invokespecial   #29  <Method void EnumIssueProcess(String, int, int, String)>
	//   23   47:putstatic       #41  <Field EnumIssueProcess APP_LOAD>
		APP_INSTALL = new EnumIssueProcess("APP_INSTALL", 3, 30, "\u5E94\u7528\u5DF2\u5B89\u88C5");
	//   24   50:new             #2   <Class EnumIssueProcess>
	//   25   53:dup             
	//   26   54:ldc1            #42  <String "APP_INSTALL">
	//   27   56:iconst_3        
	//   28   57:bipush          30
	//   29   59:ldc1            #44  <String "\u5E94\u7528\u5DF2\u5B89\u88C5">
	//   30   61:invokespecial   #29  <Method void EnumIssueProcess(String, int, int, String)>
	//   31   64:putstatic       #46  <Field EnumIssueProcess APP_INSTALL>
		APP_PERSONAL = new EnumIssueProcess("APP_PERSONAL", 4, 40, "\u5E94\u7528\u5DF2\u4E2A\u4EBA\u5316");
	//   32   67:new             #2   <Class EnumIssueProcess>
	//   33   70:dup             
	//   34   71:ldc1            #47  <String "APP_PERSONAL">
	//   35   73:iconst_4        
	//   36   74:bipush          40
	//   37   76:ldc1            #49  <String "\u5E94\u7528\u5DF2\u4E2A\u4EBA\u5316">
	//   38   78:invokespecial   #29  <Method void EnumIssueProcess(String, int, int, String)>
	//   39   81:putstatic       #51  <Field EnumIssueProcess APP_PERSONAL>
		APP_ACTIVATION = new EnumIssueProcess("APP_ACTIVATION", 5, 50, "\u5E94\u7528\u5DF2\u6FC0\u6D3B");
	//   40   84:new             #2   <Class EnumIssueProcess>
	//   41   87:dup             
	//   42   88:ldc1            #52  <String "APP_ACTIVATION">
	//   43   90:iconst_5        
	//   44   91:bipush          50
	//   45   93:ldc1            #54  <String "\u5E94\u7528\u5DF2\u6FC0\u6D3B">
	//   46   95:invokespecial   #29  <Method void EnumIssueProcess(String, int, int, String)>
	//   47   98:putstatic       #56  <Field EnumIssueProcess APP_ACTIVATION>
		APP_LOCK = new EnumIssueProcess("APP_LOCK", 6, 60, "\u5E94\u7528\u5DF2\u9501\u5B9A");
	//   48  101:new             #2   <Class EnumIssueProcess>
	//   49  104:dup             
	//   50  105:ldc1            #57  <String "APP_LOCK">
	//   51  107:bipush          6
	//   52  109:bipush          60
	//   53  111:ldc1            #59  <String "\u5E94\u7528\u5DF2\u9501\u5B9A">
	//   54  113:invokespecial   #29  <Method void EnumIssueProcess(String, int, int, String)>
	//   55  116:putstatic       #61  <Field EnumIssueProcess APP_LOCK>
		APP_REMOVE = new EnumIssueProcess("APP_REMOVE", 7, 70, "\u5E94\u7528\u5DF2\u5220\u9664");
	//   56  119:new             #2   <Class EnumIssueProcess>
	//   57  122:dup             
	//   58  123:ldc1            #62  <String "APP_REMOVE">
	//   59  125:bipush          7
	//   60  127:bipush          70
	//   61  129:ldc1            #64  <String "\u5E94\u7528\u5DF2\u5220\u9664">
	//   62  131:invokespecial   #29  <Method void EnumIssueProcess(String, int, int, String)>
	//   63  134:putstatic       #66  <Field EnumIssueProcess APP_REMOVE>
		ENUM$VALUES = (new EnumIssueProcess[] {
			APPLIED, SSD_KEY_UPDATED, APP_LOAD, APP_INSTALL, APP_PERSONAL, APP_ACTIVATION, APP_LOCK, APP_REMOVE
		});
	//   64  137:bipush          8
	//   65  139:anewarray       EnumIssueProcess[]
	//   66  142:dup             
	//   67  143:iconst_0        
	//   68  144:getstatic       #31  <Field EnumIssueProcess APPLIED>
	//   69  147:aastore         
	//   70  148:dup             
	//   71  149:iconst_1        
	//   72  150:getstatic       #36  <Field EnumIssueProcess SSD_KEY_UPDATED>
	//   73  153:aastore         
	//   74  154:dup             
	//   75  155:iconst_2        
	//   76  156:getstatic       #41  <Field EnumIssueProcess APP_LOAD>
	//   77  159:aastore         
	//   78  160:dup             
	//   79  161:iconst_3        
	//   80  162:getstatic       #46  <Field EnumIssueProcess APP_INSTALL>
	//   81  165:aastore         
	//   82  166:dup             
	//   83  167:iconst_4        
	//   84  168:getstatic       #51  <Field EnumIssueProcess APP_PERSONAL>
	//   85  171:aastore         
	//   86  172:dup             
	//   87  173:iconst_5        
	//   88  174:getstatic       #56  <Field EnumIssueProcess APP_ACTIVATION>
	//   89  177:aastore         
	//   90  178:dup             
	//   91  179:bipush          6
	//   92  181:getstatic       #61  <Field EnumIssueProcess APP_LOCK>
	//   93  184:aastore         
	//   94  185:dup             
	//   95  186:bipush          7
	//   96  188:getstatic       #66  <Field EnumIssueProcess APP_REMOVE>
	//   97  191:aastore         
	//   98  192:putstatic       #68  <Field EnumIssueProcess[] ENUM$VALUES>
	//*  99  195:return          
	}
}
