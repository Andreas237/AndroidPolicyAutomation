// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


public final class s extends Enum
{

	private s(String s1, int j, String s2)
	{
		super(s1, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #71  <Method void Enum(String, int)>
		h = s2;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #73  <Field String h>
	//    7   11:return          
	}

	public static s valueOf(String s1)
	{
		return (s)Enum.valueOf(bo/app/s, s1);
	//    0    0:ldc1            #2   <Class s>
	//    1    2:aload_0         
	//    2    3:invokestatic    #80  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class s>
	//    4    9:areturn         
	}

	public static s[] values()
	{
		return (s[])((s []) (i)).clone();
	//    0    0:getstatic       #67  <Field s[] i>
	//    1    3:invokevirtual   #87  <Method Object _5B_Lbo.app.s_3B_.clone()>
	//    2    6:checkcast       #83  <Class s[]>
	//    3    9:areturn         
	}

	public String a()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String h>
	//    2    4:areturn         
	}

	public static final s a;
	public static final s b;
	public static final s c;
	public static final s d;
	public static final s e;
	public static final s f;
	public static final s g;
	private static final s i[];
	private String h;

	static 
	{
		a = new s("ANDROID_VERSION", 0, "os_version");
	//    0    0:new             #2   <Class s>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "ANDROID_VERSION">
	//    3    6:iconst_0        
	//    4    7:ldc1            #23  <String "os_version">
	//    5    9:invokespecial   #27  <Method void s(String, int, String)>
	//    6   12:putstatic       #29  <Field s a>
		b = new s("CARRIER", 1, "carrier");
	//    7   15:new             #2   <Class s>
	//    8   18:dup             
	//    9   19:ldc1            #31  <String "CARRIER">
	//   10   21:iconst_1        
	//   11   22:ldc1            #33  <String "carrier">
	//   12   24:invokespecial   #27  <Method void s(String, int, String)>
	//   13   27:putstatic       #35  <Field s b>
		c = new s("MODEL", 2, "model");
	//   14   30:new             #2   <Class s>
	//   15   33:dup             
	//   16   34:ldc1            #37  <String "MODEL">
	//   17   36:iconst_2        
	//   18   37:ldc1            #39  <String "model">
	//   19   39:invokespecial   #27  <Method void s(String, int, String)>
	//   20   42:putstatic       #41  <Field s c>
		d = new s("RESOLUTION", 3, "resolution");
	//   21   45:new             #2   <Class s>
	//   22   48:dup             
	//   23   49:ldc1            #43  <String "RESOLUTION">
	//   24   51:iconst_3        
	//   25   52:ldc1            #45  <String "resolution">
	//   26   54:invokespecial   #27  <Method void s(String, int, String)>
	//   27   57:putstatic       #47  <Field s d>
		e = new s("LOCALE", 4, "locale");
	//   28   60:new             #2   <Class s>
	//   29   63:dup             
	//   30   64:ldc1            #49  <String "LOCALE">
	//   31   66:iconst_4        
	//   32   67:ldc1            #51  <String "locale">
	//   33   69:invokespecial   #27  <Method void s(String, int, String)>
	//   34   72:putstatic       #53  <Field s e>
		f = new s("TIMEZONE", 5, "time_zone");
	//   35   75:new             #2   <Class s>
	//   36   78:dup             
	//   37   79:ldc1            #55  <String "TIMEZONE">
	//   38   81:iconst_5        
	//   39   82:ldc1            #57  <String "time_zone">
	//   40   84:invokespecial   #27  <Method void s(String, int, String)>
	//   41   87:putstatic       #59  <Field s f>
		g = new s("NOTIFICATIONS_ENABLED", 6, "remote_notification_enabled");
	//   42   90:new             #2   <Class s>
	//   43   93:dup             
	//   44   94:ldc1            #61  <String "NOTIFICATIONS_ENABLED">
	//   45   96:bipush          6
	//   46   98:ldc1            #63  <String "remote_notification_enabled">
	//   47  100:invokespecial   #27  <Method void s(String, int, String)>
	//   48  103:putstatic       #65  <Field s g>
		i = (new s[] {
			a, b, c, d, e, f, g
		});
	//   49  106:bipush          7
	//   50  108:anewarray       s[]
	//   51  111:dup             
	//   52  112:iconst_0        
	//   53  113:getstatic       #29  <Field s a>
	//   54  116:aastore         
	//   55  117:dup             
	//   56  118:iconst_1        
	//   57  119:getstatic       #35  <Field s b>
	//   58  122:aastore         
	//   59  123:dup             
	//   60  124:iconst_2        
	//   61  125:getstatic       #41  <Field s c>
	//   62  128:aastore         
	//   63  129:dup             
	//   64  130:iconst_3        
	//   65  131:getstatic       #47  <Field s d>
	//   66  134:aastore         
	//   67  135:dup             
	//   68  136:iconst_4        
	//   69  137:getstatic       #53  <Field s e>
	//   70  140:aastore         
	//   71  141:dup             
	//   72  142:iconst_5        
	//   73  143:getstatic       #59  <Field s f>
	//   74  146:aastore         
	//   75  147:dup             
	//   76  148:bipush          6
	//   77  150:getstatic       #65  <Field s g>
	//   78  153:aastore         
	//   79  154:putstatic       #67  <Field s[] i>
	//*  80  157:return          
	}
}
