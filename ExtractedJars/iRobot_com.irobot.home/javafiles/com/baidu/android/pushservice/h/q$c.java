// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.h;


// Referenced classes of package com.baidu.android.pushservice.h:
//			q

static final class q$c extends Enum
{

	public static q$c valueOf(String s)
	{
		return (q$c)Enum.valueOf(com/baidu/android/pushservice/h/q$c, s);
	//    0    0:ldc1            #2   <Class q$c>
	//    1    2:aload_0         
	//    2    3:invokestatic    #76  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class q$c>
	//    4    9:areturn         
	}

	public static q$c[] values()
	{
		return (q$c[])((q$c []) (k)).clone();
	//    0    0:getstatic       #68  <Field q$c[] k>
	//    1    3:invokevirtual   #83  <Method Object _5B_Lcom.baidu.android.pushservice.h.q$c_3B_.clone()>
	//    2    6:checkcast       #79  <Class q$c[]>
	//    3    9:areturn         
	}

	public static final q$c a;
	public static final q$c b;
	public static final q$c c;
	public static final q$c d;
	public static final q$c e;
	public static final q$c f;
	public static final q$c g;
	public static final q$c h;
	public static final q$c i;
	public static final q$c j;
	private static final q$c k[];

	static 
	{
		a = new q$c("PushInfoId", 0);
	//    0    0:new             #2   <Class q$c>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "PushInfoId">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #28  <Method void q$c(String, int)>
	//    5   10:putstatic       #30  <Field q$c a>
		b = new q$c("PushPriority", 1);
	//    6   13:new             #2   <Class q$c>
	//    7   16:dup             
	//    8   17:ldc1            #32  <String "PushPriority">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #28  <Method void q$c(String, int)>
	//   11   23:putstatic       #34  <Field q$c b>
		c = new q$c("PushVersion", 2);
	//   12   26:new             #2   <Class q$c>
	//   13   29:dup             
	//   14   30:ldc1            #36  <String "PushVersion">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #28  <Method void q$c(String, int)>
	//   17   36:putstatic       #38  <Field q$c c>
		d = new q$c("PushChannelID", 3);
	//   18   39:new             #2   <Class q$c>
	//   19   42:dup             
	//   20   43:ldc1            #40  <String "PushChannelID">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #28  <Method void q$c(String, int)>
	//   23   49:putstatic       #42  <Field q$c d>
		e = new q$c("PushCurPkgName", 4);
	//   24   52:new             #2   <Class q$c>
	//   25   55:dup             
	//   26   56:ldc1            #44  <String "PushCurPkgName">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #28  <Method void q$c(String, int)>
	//   29   62:putstatic       #46  <Field q$c e>
		f = new q$c("PushWebAppBindInfo", 5);
	//   30   65:new             #2   <Class q$c>
	//   31   68:dup             
	//   32   69:ldc1            #48  <String "PushWebAppBindInfo">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #28  <Method void q$c(String, int)>
	//   35   75:putstatic       #50  <Field q$c f>
		g = new q$c("PushLightAppBindInfo", 6);
	//   36   78:new             #2   <Class q$c>
	//   37   81:dup             
	//   38   82:ldc1            #52  <String "PushLightAppBindInfo">
	//   39   84:bipush          6
	//   40   86:invokespecial   #28  <Method void q$c(String, int)>
	//   41   89:putstatic       #54  <Field q$c g>
		h = new q$c("PushSDKClientBindInfo", 7);
	//   42   92:new             #2   <Class q$c>
	//   43   95:dup             
	//   44   96:ldc1            #56  <String "PushSDKClientBindInfo">
	//   45   98:bipush          7
	//   46  100:invokespecial   #28  <Method void q$c(String, int)>
	//   47  103:putstatic       #58  <Field q$c h>
		i = new q$c("PushClientsBindInfo", 8);
	//   48  106:new             #2   <Class q$c>
	//   49  109:dup             
	//   50  110:ldc1            #60  <String "PushClientsBindInfo">
	//   51  112:bipush          8
	//   52  114:invokespecial   #28  <Method void q$c(String, int)>
	//   53  117:putstatic       #62  <Field q$c i>
		j = new q$c("PushSelfBindInfo", 9);
	//   54  120:new             #2   <Class q$c>
	//   55  123:dup             
	//   56  124:ldc1            #64  <String "PushSelfBindInfo">
	//   57  126:bipush          9
	//   58  128:invokespecial   #28  <Method void q$c(String, int)>
	//   59  131:putstatic       #66  <Field q$c j>
		k = (new q$c[] {
			a, b, c, d, e, f, g, h, i, j
		});
	//   60  134:bipush          10
	//   61  136:anewarray       q$c[]
	//   62  139:dup             
	//   63  140:iconst_0        
	//   64  141:getstatic       #30  <Field q$c a>
	//   65  144:aastore         
	//   66  145:dup             
	//   67  146:iconst_1        
	//   68  147:getstatic       #34  <Field q$c b>
	//   69  150:aastore         
	//   70  151:dup             
	//   71  152:iconst_2        
	//   72  153:getstatic       #38  <Field q$c c>
	//   73  156:aastore         
	//   74  157:dup             
	//   75  158:iconst_3        
	//   76  159:getstatic       #42  <Field q$c d>
	//   77  162:aastore         
	//   78  163:dup             
	//   79  164:iconst_4        
	//   80  165:getstatic       #46  <Field q$c e>
	//   81  168:aastore         
	//   82  169:dup             
	//   83  170:iconst_5        
	//   84  171:getstatic       #50  <Field q$c f>
	//   85  174:aastore         
	//   86  175:dup             
	//   87  176:bipush          6
	//   88  178:getstatic       #54  <Field q$c g>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:bipush          7
	//   92  185:getstatic       #58  <Field q$c h>
	//   93  188:aastore         
	//   94  189:dup             
	//   95  190:bipush          8
	//   96  192:getstatic       #62  <Field q$c i>
	//   97  195:aastore         
	//   98  196:dup             
	//   99  197:bipush          9
	//  100  199:getstatic       #66  <Field q$c j>
	//  101  202:aastore         
	//  102  203:putstatic       #68  <Field q$c[] k>
	//* 103  206:return          
	}

	private q$c(String s, int l)
	{
		super(s, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #70  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
