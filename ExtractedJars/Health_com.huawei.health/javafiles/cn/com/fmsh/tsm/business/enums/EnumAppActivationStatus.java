// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.enums;


public final class EnumAppActivationStatus extends Enum
{

	private EnumAppActivationStatus(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #66  <Method void Enum(String, int)>
		id = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #68  <Field int id>
		desc = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #70  <Field String desc>
	//   10   17:return          
	}

	public static EnumAppActivationStatus getActivationStatus4ID(int i)
	{
		EnumAppActivationStatus aenumappactivationstatus[] = values();
	//    0    0:invokestatic    #76  <Method EnumAppActivationStatus[] values()>
	//    1    3:astore_3        
		int k = aenumappactivationstatus.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			EnumAppActivationStatus enumappactivationstatus = aenumappactivationstatus[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(enumappactivationstatus.getId() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #80  <Method int getId()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return enumappactivationstatus;
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

	public static EnumAppActivationStatus valueOf(String s)
	{
		return (EnumAppActivationStatus)Enum.valueOf(cn/com/fmsh/tsm/business/enums/EnumAppActivationStatus, s);
	//    0    0:ldc1            #2   <Class EnumAppActivationStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #85  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EnumAppActivationStatus>
	//    4    9:areturn         
	}

	public static EnumAppActivationStatus[] values()
	{
		EnumAppActivationStatus aenumappactivationstatus[] = ENUM$VALUES;
	//    0    0:getstatic       #62  <Field EnumAppActivationStatus[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aenumappactivationstatus.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		EnumAppActivationStatus aenumappactivationstatus1[] = new EnumAppActivationStatus[i];
	//    5    7:iload_0         
	//    6    8:anewarray       EnumAppActivationStatus[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aenumappactivationstatus)), 0, ((Object) (aenumappactivationstatus1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aenumappactivationstatus1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field String desc>
	//    2    4:areturn         
	}

	public int getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int id>
	//    2    4:ireturn         
	}

	private static final EnumAppActivationStatus ENUM$VALUES[];
	public static final EnumAppActivationStatus activiting;
	public static final EnumAppActivationStatus activityFail;
	public static final EnumAppActivationStatus activitySucess;
	public static final EnumAppActivationStatus closeFail;
	public static final EnumAppActivationStatus closeSucess;
	public static final EnumAppActivationStatus closeing;
	public static final EnumAppActivationStatus noActivity;
	private String desc;
	private int id;

	static 
	{
		noActivity = new EnumAppActivationStatus("noActivity", 0, 0, "\u672A\u5F00\u901A");
	//    0    0:new             #2   <Class EnumAppActivationStatus>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "noActivity">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:ldc1            #24  <String "\u672A\u5F00\u901A">
	//    6   10:invokespecial   #28  <Method void EnumAppActivationStatus(String, int, int, String)>
	//    7   13:putstatic       #30  <Field EnumAppActivationStatus noActivity>
		activiting = new EnumAppActivationStatus("activiting", 1, 1, "\u5F00\u901A\u4E2D");
	//    8   16:new             #2   <Class EnumAppActivationStatus>
	//    9   19:dup             
	//   10   20:ldc1            #31  <String "activiting">
	//   11   22:iconst_1        
	//   12   23:iconst_1        
	//   13   24:ldc1            #33  <String "\u5F00\u901A\u4E2D">
	//   14   26:invokespecial   #28  <Method void EnumAppActivationStatus(String, int, int, String)>
	//   15   29:putstatic       #35  <Field EnumAppActivationStatus activiting>
		activitySucess = new EnumAppActivationStatus("activitySucess", 2, 2, "\u5F00\u901A\u6210\u529F");
	//   16   32:new             #2   <Class EnumAppActivationStatus>
	//   17   35:dup             
	//   18   36:ldc1            #36  <String "activitySucess">
	//   19   38:iconst_2        
	//   20   39:iconst_2        
	//   21   40:ldc1            #38  <String "\u5F00\u901A\u6210\u529F">
	//   22   42:invokespecial   #28  <Method void EnumAppActivationStatus(String, int, int, String)>
	//   23   45:putstatic       #40  <Field EnumAppActivationStatus activitySucess>
		activityFail = new EnumAppActivationStatus("activityFail", 3, 3, "\u5F00\u901A\u5931\u8D25");
	//   24   48:new             #2   <Class EnumAppActivationStatus>
	//   25   51:dup             
	//   26   52:ldc1            #41  <String "activityFail">
	//   27   54:iconst_3        
	//   28   55:iconst_3        
	//   29   56:ldc1            #43  <String "\u5F00\u901A\u5931\u8D25">
	//   30   58:invokespecial   #28  <Method void EnumAppActivationStatus(String, int, int, String)>
	//   31   61:putstatic       #45  <Field EnumAppActivationStatus activityFail>
		closeing = new EnumAppActivationStatus("closeing", 4, 4, "\u5173\u95ED\u4E2D");
	//   32   64:new             #2   <Class EnumAppActivationStatus>
	//   33   67:dup             
	//   34   68:ldc1            #46  <String "closeing">
	//   35   70:iconst_4        
	//   36   71:iconst_4        
	//   37   72:ldc1            #48  <String "\u5173\u95ED\u4E2D">
	//   38   74:invokespecial   #28  <Method void EnumAppActivationStatus(String, int, int, String)>
	//   39   77:putstatic       #50  <Field EnumAppActivationStatus closeing>
		closeSucess = new EnumAppActivationStatus("closeSucess", 5, 5, "\u5173\u95ED\u6210\u529F");
	//   40   80:new             #2   <Class EnumAppActivationStatus>
	//   41   83:dup             
	//   42   84:ldc1            #51  <String "closeSucess">
	//   43   86:iconst_5        
	//   44   87:iconst_5        
	//   45   88:ldc1            #53  <String "\u5173\u95ED\u6210\u529F">
	//   46   90:invokespecial   #28  <Method void EnumAppActivationStatus(String, int, int, String)>
	//   47   93:putstatic       #55  <Field EnumAppActivationStatus closeSucess>
		closeFail = new EnumAppActivationStatus("closeFail", 6, 6, "\u5173\u95ED\u5931\u8D25");
	//   48   96:new             #2   <Class EnumAppActivationStatus>
	//   49   99:dup             
	//   50  100:ldc1            #56  <String "closeFail">
	//   51  102:bipush          6
	//   52  104:bipush          6
	//   53  106:ldc1            #58  <String "\u5173\u95ED\u5931\u8D25">
	//   54  108:invokespecial   #28  <Method void EnumAppActivationStatus(String, int, int, String)>
	//   55  111:putstatic       #60  <Field EnumAppActivationStatus closeFail>
		ENUM$VALUES = (new EnumAppActivationStatus[] {
			noActivity, activiting, activitySucess, activityFail, closeing, closeSucess, closeFail
		});
	//   56  114:bipush          7
	//   57  116:anewarray       EnumAppActivationStatus[]
	//   58  119:dup             
	//   59  120:iconst_0        
	//   60  121:getstatic       #30  <Field EnumAppActivationStatus noActivity>
	//   61  124:aastore         
	//   62  125:dup             
	//   63  126:iconst_1        
	//   64  127:getstatic       #35  <Field EnumAppActivationStatus activiting>
	//   65  130:aastore         
	//   66  131:dup             
	//   67  132:iconst_2        
	//   68  133:getstatic       #40  <Field EnumAppActivationStatus activitySucess>
	//   69  136:aastore         
	//   70  137:dup             
	//   71  138:iconst_3        
	//   72  139:getstatic       #45  <Field EnumAppActivationStatus activityFail>
	//   73  142:aastore         
	//   74  143:dup             
	//   75  144:iconst_4        
	//   76  145:getstatic       #50  <Field EnumAppActivationStatus closeing>
	//   77  148:aastore         
	//   78  149:dup             
	//   79  150:iconst_5        
	//   80  151:getstatic       #55  <Field EnumAppActivationStatus closeSucess>
	//   81  154:aastore         
	//   82  155:dup             
	//   83  156:bipush          6
	//   84  158:getstatic       #60  <Field EnumAppActivationStatus closeFail>
	//   85  161:aastore         
	//   86  162:putstatic       #62  <Field EnumAppActivationStatus[] ENUM$VALUES>
	//*  87  165:return          
	}
}
