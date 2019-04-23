// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			auo, atl, atm, atu, 
//			asg, aso, att, asm, 
//			aup, ash, arw, aub, 
//			auf, ate, ats, atz, 
//			aun

final class atk
	implements auo
{

	public atk()
	{
		this(((atu) (new atm(new atu[] {
			asg.a(), a()
		}))));
	//    0    0:aload_0         
	//    1    1:new             #21  <Class atm>
	//    2    4:dup             
	//    3    5:iconst_2        
	//    4    6:anewarray       atu[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:invokestatic    #28  <Method asg asg.a()>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:invokestatic    #31  <Method atu a()>
	//   12   20:aastore         
	//   13   21:invokespecial   #34  <Method void atm(atu[])>
	//   14   24:invokespecial   #37  <Method void atk(atu)>
	//   15   27:return          
	}

	private atk(atu atu1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		a = (atu)aso.a(((Object) (atu1)), "messageInfoFactory");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #40  <String "messageInfoFactory">
	//    5    8:invokestatic    #45  <Method Object aso.a(Object, String)>
	//    6   11:checkcast       #23  <Class atu>
	//    7   14:putfield        #47  <Field atu a>
	//    8   17:return          
	}

	private static atu a()
	{
		Exception exception;
		atu atu1;
		try
		{
			atu1 = (atu)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(((Object) (null)), new Object[0]);
	//    0    0:ldc1            #51  <String "com.google.protobuf.DescriptorMessageInfoFactory">
	//    1    2:invokestatic    #57  <Method Class Class.forName(String)>
	//    2    5:ldc1            #59  <String "getInstance">
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #63  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    6   14:aconst_null     
	//    7   15:iconst_0        
	//    8   16:anewarray       Object[]
	//    9   19:invokevirtual   #69  <Method Object Method.invoke(Object, Object[])>
	//   10   22:checkcast       #23  <Class atu>
	//   11   25:astore_0        
		}
	//*  12   26:aload_0         
	//*  13   27:areturn         
	//*  14   28:getstatic       #18  <Field atu b>
	//*  15   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return b;
		}
		return atu1;
	//*  16   32:astore_0        
	//*  17   33:goto            28
	}

	private static boolean a(att att1)
	{
		return att1.a() == asm.h;
	//    0    0:aload_0         
	//    1    1:invokeinterface #75  <Method int att.a()>
	//    2    6:getstatic       #81  <Field int asm.h>
	//    3    9:icmpne          14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public final aun a(Class class1)
	{
		aup.a(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method void aup.a(Class)>
		att att1 = a.b(class1);
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field atu a>
	//    4    8:aload_1         
	//    5    9:invokeinterface #90  <Method att atu.b(Class)>
	//    6   14:astore_2        
		if(att1.b())
	//*   7   15:aload_2         
	//*   8   16:invokeinterface #93  <Method boolean att.b()>
	//*   9   21:ifeq            65
			if(((Class) (com/google/android/gms/internal/ads/ash)).isAssignableFrom(class1))
	//*  10   24:ldc1            #95  <Class ash>
	//*  11   26:aload_1         
	//*  12   27:invokevirtual   #99  <Method boolean Class.isAssignableFrom(Class)>
	//*  13   30:ifeq            49
				return ((aun) (aub.a(aup.c(), arw.a(), att1.c())));
	//   14   33:invokestatic    #103 <Method avf aup.c()>
	//   15   36:invokestatic    #108 <Method aru arw.a()>
	//   16   39:aload_2         
	//   17   40:invokeinterface #111 <Method atv att.c()>
	//   18   45:invokestatic    #116 <Method aub aub.a(avf, aru, atv)>
	//   19   48:areturn         
			else
				return ((aun) (aub.a(aup.a(), arw.b(), att1.c())));
	//   20   49:invokestatic    #118 <Method avf aup.a()>
	//   21   52:invokestatic    #120 <Method aru arw.b()>
	//   22   55:aload_2         
	//   23   56:invokeinterface #111 <Method atv att.c()>
	//   24   61:invokestatic    #116 <Method aub aub.a(avf, aru, atv)>
	//   25   64:areturn         
		if(((Class) (com/google/android/gms/internal/ads/ash)).isAssignableFrom(class1))
	//*  26   65:ldc1            #95  <Class ash>
	//*  27   67:aload_1         
	//*  28   68:invokevirtual   #99  <Method boolean Class.isAssignableFrom(Class)>
	//*  29   71:ifeq            121
			if(a(att1))
	//*  30   74:aload_2         
	//*  31   75:invokestatic    #122 <Method boolean a(att)>
	//*  32   78:ifeq            102
				return ((aun) (atz.a(class1, att1, auf.b(), ate.b(), aup.c(), arw.a(), ats.b())));
	//   33   81:aload_1         
	//   34   82:aload_2         
	//   35   83:invokestatic    #127 <Method aud auf.b()>
	//   36   86:invokestatic    #132 <Method ate ate.b()>
	//   37   89:invokestatic    #103 <Method avf aup.c()>
	//   38   92:invokestatic    #108 <Method aru arw.a()>
	//   39   95:invokestatic    #137 <Method atq ats.b()>
	//   40   98:invokestatic    #142 <Method atz atz.a(Class, att, aud, ate, avf, aru, atq)>
	//   41  101:areturn         
			else
				return ((aun) (atz.a(class1, att1, auf.b(), ate.b(), aup.c(), ((aru) (null)), ats.b())));
	//   42  102:aload_1         
	//   43  103:aload_2         
	//   44  104:invokestatic    #127 <Method aud auf.b()>
	//   45  107:invokestatic    #132 <Method ate ate.b()>
	//   46  110:invokestatic    #103 <Method avf aup.c()>
	//   47  113:aconst_null     
	//   48  114:invokestatic    #137 <Method atq ats.b()>
	//   49  117:invokestatic    #142 <Method atz atz.a(Class, att, aud, ate, avf, aru, atq)>
	//   50  120:areturn         
		if(a(att1))
	//*  51  121:aload_2         
	//*  52  122:invokestatic    #122 <Method boolean a(att)>
	//*  53  125:ifeq            149
			return ((aun) (atz.a(class1, att1, auf.a(), ate.a(), aup.a(), arw.b(), ats.a())));
	//   54  128:aload_1         
	//   55  129:aload_2         
	//   56  130:invokestatic    #144 <Method aud auf.a()>
	//   57  133:invokestatic    #146 <Method ate ate.a()>
	//   58  136:invokestatic    #118 <Method avf aup.a()>
	//   59  139:invokestatic    #120 <Method aru arw.b()>
	//   60  142:invokestatic    #148 <Method atq ats.a()>
	//   61  145:invokestatic    #142 <Method atz atz.a(Class, att, aud, ate, avf, aru, atq)>
	//   62  148:areturn         
		else
			return ((aun) (atz.a(class1, att1, auf.a(), ate.a(), aup.b(), ((aru) (null)), ats.a())));
	//   63  149:aload_1         
	//   64  150:aload_2         
	//   65  151:invokestatic    #144 <Method aud auf.a()>
	//   66  154:invokestatic    #146 <Method ate ate.a()>
	//   67  157:invokestatic    #150 <Method avf aup.b()>
	//   68  160:aconst_null     
	//   69  161:invokestatic    #148 <Method atq ats.a()>
	//   70  164:invokestatic    #142 <Method atz atz.a(Class, att, aud, ate, avf, aru, atq)>
	//   71  167:areturn         
	}

	private static final atu b = new atl();
	private final atu a;

	static 
	{
	//    0    0:new             #13  <Class atl>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void atl()>
	//    3    7:putstatic       #18  <Field atu b>
	//*   4   10:return          
	}
}
