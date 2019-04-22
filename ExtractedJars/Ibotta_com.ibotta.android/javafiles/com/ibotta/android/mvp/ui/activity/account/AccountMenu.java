// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;


public final class AccountMenu extends Enum
{

	private AccountMenu(String s, int i, int j, int k)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #77  <Method void Enum(String, int)>
		iconResId = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #79  <Field int iconResId>
		nameResId = k;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #81  <Field int nameResId>
	//   10   17:return          
	}

	public static AccountMenu valueOf(String s)
	{
		return (AccountMenu)Enum.valueOf(com/ibotta/android/mvp/ui/activity/account/AccountMenu, s);
	//    0    0:ldc1            #2   <Class AccountMenu>
	//    1    2:aload_0         
	//    2    3:invokestatic    #88  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AccountMenu>
	//    4    9:areturn         
	}

	public static AccountMenu[] values()
	{
		return (AccountMenu[])((AccountMenu []) ($VALUES)).clone();
	//    0    0:getstatic       #73  <Field AccountMenu[] $VALUES>
	//    1    3:invokevirtual   #95  <Method Object _5B_Lcom.ibotta.android.mvp.ui.activity.account.AccountMenu_3B_.clone()>
	//    2    6:checkcast       #91  <Class AccountMenu[]>
	//    3    9:areturn         
	}

	public int getIconResId()
	{
		return iconResId;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int iconResId>
	//    2    4:ireturn         
	}

	public int getNameResId()
	{
		return nameResId;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int nameResId>
	//    2    4:ireturn         
	}

	private static final AccountMenu $VALUES[];
	public static final AccountMenu BONUSES;
	public static final AccountMenu HELP;
	public static final AccountMenu HOW_TO;
	public static final AccountMenu INVITE_FRIENDS;
	public static final AccountMenu MY_EARNINGS;
	public static final AccountMenu MY_FAVORITES;
	public static final AccountMenu PAYMENT_HISTORY;
	public static final AccountMenu SETTINGS;
	public static final AccountMenu TEAMWORK;
	private final int iconResId;
	private final int nameResId;

	static 
	{
		PAYMENT_HISTORY = new AccountMenu("PAYMENT_HISTORY", 0, 0x7f080220, 0x7f110535);
	//    0    0:new             #2   <Class AccountMenu>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "PAYMENT_HISTORY">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <Int 0x7f080220>
	//    5    9:ldc1            #25  <Int 0x7f110535>
	//    6   11:invokespecial   #29  <Method void AccountMenu(String, int, int, int)>
	//    7   14:putstatic       #31  <Field AccountMenu PAYMENT_HISTORY>
		MY_EARNINGS = new AccountMenu("MY_EARNINGS", 1, 0x7f080278, 0x7f110030);
	//    8   17:new             #2   <Class AccountMenu>
	//    9   20:dup             
	//   10   21:ldc1            #32  <String "MY_EARNINGS">
	//   11   23:iconst_1        
	//   12   24:ldc1            #33  <Int 0x7f080278>
	//   13   26:ldc1            #34  <Int 0x7f110030>
	//   14   28:invokespecial   #29  <Method void AccountMenu(String, int, int, int)>
	//   15   31:putstatic       #36  <Field AccountMenu MY_EARNINGS>
		BONUSES = new AccountMenu("BONUSES", 2, 0x7f08021e, 0x7f11002c);
	//   16   34:new             #2   <Class AccountMenu>
	//   17   37:dup             
	//   18   38:ldc1            #37  <String "BONUSES">
	//   19   40:iconst_2        
	//   20   41:ldc1            #38  <Int 0x7f08021e>
	//   21   43:ldc1            #39  <Int 0x7f11002c>
	//   22   45:invokespecial   #29  <Method void AccountMenu(String, int, int, int)>
	//   23   48:putstatic       #41  <Field AccountMenu BONUSES>
		INVITE_FRIENDS = new AccountMenu("INVITE_FRIENDS", 3, 0x7f08024a, 0x7f11002f);
	//   24   51:new             #2   <Class AccountMenu>
	//   25   54:dup             
	//   26   55:ldc1            #42  <String "INVITE_FRIENDS">
	//   27   57:iconst_3        
	//   28   58:ldc1            #43  <Int 0x7f08024a>
	//   29   60:ldc1            #44  <Int 0x7f11002f>
	//   30   62:invokespecial   #29  <Method void AccountMenu(String, int, int, int)>
	//   31   65:putstatic       #46  <Field AccountMenu INVITE_FRIENDS>
		TEAMWORK = new AccountMenu("TEAMWORK", 4, 0x7f080245, 0x7f110032);
	//   32   68:new             #2   <Class AccountMenu>
	//   33   71:dup             
	//   34   72:ldc1            #47  <String "TEAMWORK">
	//   35   74:iconst_4        
	//   36   75:ldc1            #48  <Int 0x7f080245>
	//   37   77:ldc1            #49  <Int 0x7f110032>
	//   38   79:invokespecial   #29  <Method void AccountMenu(String, int, int, int)>
	//   39   82:putstatic       #51  <Field AccountMenu TEAMWORK>
		MY_FAVORITES = new AccountMenu("MY_FAVORITES", 5, 0x7f080244, 0x7f110422);
	//   40   85:new             #2   <Class AccountMenu>
	//   41   88:dup             
	//   42   89:ldc1            #52  <String "MY_FAVORITES">
	//   43   91:iconst_5        
	//   44   92:ldc1            #53  <Int 0x7f080244>
	//   45   94:ldc1            #54  <Int 0x7f110422>
	//   46   96:invokespecial   #29  <Method void AccountMenu(String, int, int, int)>
	//   47   99:putstatic       #56  <Field AccountMenu MY_FAVORITES>
		SETTINGS = new AccountMenu("SETTINGS", 6, 0x7f08027e, 0x7f110031);
	//   48  102:new             #2   <Class AccountMenu>
	//   49  105:dup             
	//   50  106:ldc1            #57  <String "SETTINGS">
	//   51  108:bipush          6
	//   52  110:ldc1            #58  <Int 0x7f08027e>
	//   53  112:ldc1            #59  <Int 0x7f110031>
	//   54  114:invokespecial   #29  <Method void AccountMenu(String, int, int, int)>
	//   55  117:putstatic       #61  <Field AccountMenu SETTINGS>
		HELP = new AccountMenu("HELP", 7, 0x7f080264, 0x7f11002d);
	//   56  120:new             #2   <Class AccountMenu>
	//   57  123:dup             
	//   58  124:ldc1            #62  <String "HELP">
	//   59  126:bipush          7
	//   60  128:ldc1            #63  <Int 0x7f080264>
	//   61  130:ldc1            #64  <Int 0x7f11002d>
	//   62  132:invokespecial   #29  <Method void AccountMenu(String, int, int, int)>
	//   63  135:putstatic       #66  <Field AccountMenu HELP>
		HOW_TO = new AccountMenu("HOW_TO", 8, 0x7f08022b, 0x7f11002e);
	//   64  138:new             #2   <Class AccountMenu>
	//   65  141:dup             
	//   66  142:ldc1            #67  <String "HOW_TO">
	//   67  144:bipush          8
	//   68  146:ldc1            #68  <Int 0x7f08022b>
	//   69  148:ldc1            #69  <Int 0x7f11002e>
	//   70  150:invokespecial   #29  <Method void AccountMenu(String, int, int, int)>
	//   71  153:putstatic       #71  <Field AccountMenu HOW_TO>
		$VALUES = (new AccountMenu[] {
			PAYMENT_HISTORY, MY_EARNINGS, BONUSES, INVITE_FRIENDS, TEAMWORK, MY_FAVORITES, SETTINGS, HELP, HOW_TO
		});
	//   72  156:bipush          9
	//   73  158:anewarray       AccountMenu[]
	//   74  161:dup             
	//   75  162:iconst_0        
	//   76  163:getstatic       #31  <Field AccountMenu PAYMENT_HISTORY>
	//   77  166:aastore         
	//   78  167:dup             
	//   79  168:iconst_1        
	//   80  169:getstatic       #36  <Field AccountMenu MY_EARNINGS>
	//   81  172:aastore         
	//   82  173:dup             
	//   83  174:iconst_2        
	//   84  175:getstatic       #41  <Field AccountMenu BONUSES>
	//   85  178:aastore         
	//   86  179:dup             
	//   87  180:iconst_3        
	//   88  181:getstatic       #46  <Field AccountMenu INVITE_FRIENDS>
	//   89  184:aastore         
	//   90  185:dup             
	//   91  186:iconst_4        
	//   92  187:getstatic       #51  <Field AccountMenu TEAMWORK>
	//   93  190:aastore         
	//   94  191:dup             
	//   95  192:iconst_5        
	//   96  193:getstatic       #56  <Field AccountMenu MY_FAVORITES>
	//   97  196:aastore         
	//   98  197:dup             
	//   99  198:bipush          6
	//  100  200:getstatic       #61  <Field AccountMenu SETTINGS>
	//  101  203:aastore         
	//  102  204:dup             
	//  103  205:bipush          7
	//  104  207:getstatic       #66  <Field AccountMenu HELP>
	//  105  210:aastore         
	//  106  211:dup             
	//  107  212:bipush          8
	//  108  214:getstatic       #71  <Field AccountMenu HOW_TO>
	//  109  217:aastore         
	//  110  218:putstatic       #73  <Field AccountMenu[] $VALUES>
	//* 111  221:return          
	}
}
