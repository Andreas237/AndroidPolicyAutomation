// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aiz, amv, akf, amn, 
//			asu, amp, apy, aqq, 
//			apq, ajd, ams, amq, 
//			aps, asi, ash, amy, 
//			amz, aqh, ana, atv

final class ake
	implements aiz
{

	ake()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private static void a(amv amv1)
	{
		if(amv1.b() >= 10)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #19  <Method int amv.b()>
	//*   2    4:bipush          10
	//*   3    6:icmplt          118
		{
			switch(akf.a[amv1.a().ordinal()])
	//*   4    9:getstatic       #24  <Field int[] akf.a>
	//*   5   12:aload_0         
	//*   6   13:invokevirtual   #27  <Method amn amv.a()>
	//*   7   16:invokevirtual   #32  <Method int amn.ordinal()>
	//*   8   19:iaload          
			{
	//*   9   20:tableswitch     1 3: default 48
	//	               1 98
	//	               2 78
	//	               3 58
			default:
				throw new GeneralSecurityException("unknown hash type");
	//   10   48:new             #34  <Class GeneralSecurityException>
	//   11   51:dup             
	//   12   52:ldc1            #36  <String "unknown hash type">
	//   13   54:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//   14   57:athrow          

			case 3: // '\003'
				if(amv1.b() <= 64)
	//*  15   58:aload_0         
	//*  16   59:invokevirtual   #19  <Method int amv.b()>
	//*  17   62:bipush          64
	//*  18   64:icmpgt          68
					return;
	//   19   67:return          
				else
					throw new GeneralSecurityException("tag size too big");
	//   20   68:new             #34  <Class GeneralSecurityException>
	//   21   71:dup             
	//   22   72:ldc1            #41  <String "tag size too big">
	//   23   74:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//   24   77:athrow          

			case 2: // '\002'
				if(amv1.b() <= 32)
	//*  25   78:aload_0         
	//*  26   79:invokevirtual   #19  <Method int amv.b()>
	//*  27   82:bipush          32
	//*  28   84:icmpgt          88
					return;
	//   29   87:return          
				else
					throw new GeneralSecurityException("tag size too big");
	//   30   88:new             #34  <Class GeneralSecurityException>
	//   31   91:dup             
	//   32   92:ldc1            #41  <String "tag size too big">
	//   33   94:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//   34   97:athrow          

			case 1: // '\001'
				break;
			}
			if(amv1.b() <= 20)
	//*  35   98:aload_0         
	//*  36   99:invokevirtual   #19  <Method int amv.b()>
	//*  37  102:bipush          20
	//*  38  104:icmpgt          108
				return;
	//   39  107:return          
			else
				throw new GeneralSecurityException("tag size too big");
	//   40  108:new             #34  <Class GeneralSecurityException>
	//   41  111:dup             
	//   42  112:ldc1            #41  <String "tag size too big">
	//   43  114:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//   44  117:athrow          
		} else
		{
			throw new GeneralSecurityException("tag size too small");
	//   45  118:new             #34  <Class GeneralSecurityException>
	//   46  121:dup             
	//   47  122:ldc1            #43  <String "tag size too small">
	//   48  124:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//   49  127:athrow          
		}
	}

	private final ajd d(aqq aqq1)
	{
		int i;
		amn amn1;
		SecretKeySpec secretkeyspec;
		aqq1 = ((aqq) (amp.a(aqq1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #52  <Method amp amp.a(aqq)>
	//    2    4:astore_1        
		if(!(aqq1 instanceof amp))
			break MISSING_BLOCK_LABEL_185;
	//    3    5:aload_1         
	//    4    6:instanceof      #49  <Class amp>
	//    5    9:ifeq            185
		aqq1 = ((aqq) ((amp)aqq1));
	//    6   12:aload_1         
	//    7   13:checkcast       #49  <Class amp>
	//    8   16:astore_1        
		apy.a(((amp) (aqq1)).a(), 0);
	//    9   17:aload_1         
	//   10   18:invokevirtual   #54  <Method int amp.a()>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #59  <Method void apy.a(int, int)>
		if(((amp) (aqq1)).c().a() < 16)
			break MISSING_BLOCK_LABEL_175;
	//   13   25:aload_1         
	//   14   26:invokevirtual   #63  <Method aqq amp.c()>
	//   15   29:invokevirtual   #66  <Method int aqq.a()>
	//   16   32:bipush          16
	//   17   34:icmplt          175
		a(((amp) (aqq1)).b());
	//   18   37:aload_1         
	//   19   38:invokevirtual   #69  <Method amv amp.b()>
	//   20   41:invokestatic    #71  <Method void a(amv)>
		amn1 = ((amp) (aqq1)).b().a();
	//   21   44:aload_1         
	//   22   45:invokevirtual   #69  <Method amv amp.b()>
	//   23   48:invokevirtual   #27  <Method amn amv.a()>
	//   24   51:astore_3        
		secretkeyspec = new SecretKeySpec(((amp) (aqq1)).c().b(), "HMAC");
	//   25   52:new             #73  <Class SecretKeySpec>
	//   26   55:dup             
	//   27   56:aload_1         
	//   28   57:invokevirtual   #63  <Method aqq amp.c()>
	//   29   60:invokevirtual   #76  <Method byte[] aqq.b()>
	//   30   63:ldc1            #78  <String "HMAC">
	//   31   65:invokespecial   #81  <Method void SecretKeySpec(byte[], String)>
	//   32   68:astore          4
		i = ((amp) (aqq1)).b().b();
	//   33   70:aload_1         
	//   34   71:invokevirtual   #69  <Method amv amp.b()>
	//   35   74:invokevirtual   #19  <Method int amv.b()>
	//   36   77:istore_2        
		akf.a[amn1.ordinal()];
	//   37   78:getstatic       #24  <Field int[] akf.a>
	//   38   81:aload_3         
	//   39   82:invokevirtual   #32  <Method int amn.ordinal()>
	//   40   85:iaload          
		JVM INSTR tableswitch 1 3: default 207
	//	               1 147
	//	               2 131
	//	               3 115;
	//   41   86:tableswitch     1 3: default 207
	//	               1 147
	//	               2 131
	//	               3 115
		   goto _L1 _L2 _L3 _L4
_L1:
		break MISSING_BLOCK_LABEL_165;
	//   42  112:goto            165
_L4:
		try
		{
			aqq1 = ((aqq) (new apq("HMACSHA512", ((java.security.Key) (secretkeyspec)), i)));
	//   43  115:new             #83  <Class apq>
	//   44  118:dup             
	//   45  119:ldc1            #85  <String "HMACSHA512">
	//   46  121:aload           4
	//   47  123:iload_2         
	//   48  124:invokespecial   #88  <Method void apq(String, java.security.Key, int)>
	//   49  127:astore_1        
		}
	//*  50  128:goto            160
	//*  51  131:new             #83  <Class apq>
	//*  52  134:dup             
	//*  53  135:ldc1            #90  <String "HMACSHA256">
	//*  54  137:aload           4
	//*  55  139:iload_2         
	//*  56  140:invokespecial   #88  <Method void apq(String, java.security.Key, int)>
	//*  57  143:astore_1        
	//*  58  144:goto            160
	//*  59  147:new             #83  <Class apq>
	//*  60  150:dup             
	//*  61  151:ldc1            #92  <String "HMACSHA1">
	//*  62  153:aload           4
	//*  63  155:iload_2         
	//*  64  156:invokespecial   #88  <Method void apq(String, java.security.Key, int)>
	//*  65  159:astore_1        
	//*  66  160:aload_1         
	//*  67  161:checkcast       #94  <Class ajd>
	//*  68  164:areturn         
	//*  69  165:new             #34  <Class GeneralSecurityException>
	//*  70  168:dup             
	//*  71  169:ldc1            #96  <String "unknown hash">
	//*  72  171:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//*  73  174:athrow          
	//*  74  175:new             #34  <Class GeneralSecurityException>
	//*  75  178:dup             
	//*  76  179:ldc1            #98  <String "key too short">
	//*  77  181:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//*  78  184:athrow          
	//*  79  185:new             #34  <Class GeneralSecurityException>
	//*  80  188:dup             
	//*  81  189:ldc1            #100 <String "expected HmacKey proto">
	//*  82  191:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//*  83  194:athrow          
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*  84  195:astore_1        
		{
			throw new GeneralSecurityException("expected serialized HmacKey proto", ((Throwable) (aqq1)));
	//   85  196:new             #34  <Class GeneralSecurityException>
	//   86  199:dup             
	//   87  200:ldc1            #102 <String "expected serialized HmacKey proto">
	//   88  202:aload_1         
	//   89  203:invokespecial   #105 <Method void GeneralSecurityException(String, Throwable)>
	//   90  206:athrow          
		}
		break; /* Loop/switch isn't completed */
	//   91  207:goto            112
_L3:
		aqq1 = ((aqq) (new apq("HMACSHA256", ((java.security.Key) (secretkeyspec)), i)));
		break; /* Loop/switch isn't completed */
_L2:
		aqq1 = ((aqq) (new apq("HMACSHA1", ((java.security.Key) (secretkeyspec)), i)));
		return (ajd)aqq1;
		throw new GeneralSecurityException("unknown hash");
		throw new GeneralSecurityException("key too short");
		throw new GeneralSecurityException("expected HmacKey proto");
	}

	public final Object a(aqq aqq1)
	{
		return ((Object) (d(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #108 <Method ajd d(aqq)>
	//    3    5:areturn         
	}

	public final Object a(atv atv)
	{
		if(atv instanceof amp)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #49  <Class amp>
	//*   2    4:ifeq            167
		{
			atv = ((atv) ((amp)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #49  <Class amp>
	//    5   11:astore_1        
			apy.a(((amp) (atv)).a(), 0);
	//    6   12:aload_1         
	//    7   13:invokevirtual   #54  <Method int amp.a()>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #59  <Method void apy.a(int, int)>
			if(((amp) (atv)).c().a() >= 16)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #63  <Method aqq amp.c()>
	//*  12   24:invokevirtual   #66  <Method int aqq.a()>
	//*  13   27:bipush          16
	//*  14   29:icmplt          157
			{
				a(((amp) (atv)).b());
	//   15   32:aload_1         
	//   16   33:invokevirtual   #69  <Method amv amp.b()>
	//   17   36:invokestatic    #71  <Method void a(amv)>
				amn amn1 = ((amp) (atv)).b().a();
	//   18   39:aload_1         
	//   19   40:invokevirtual   #69  <Method amv amp.b()>
	//   20   43:invokevirtual   #27  <Method amn amv.a()>
	//   21   46:astore_3        
				SecretKeySpec secretkeyspec = new SecretKeySpec(((amp) (atv)).c().b(), "HMAC");
	//   22   47:new             #73  <Class SecretKeySpec>
	//   23   50:dup             
	//   24   51:aload_1         
	//   25   52:invokevirtual   #63  <Method aqq amp.c()>
	//   26   55:invokevirtual   #76  <Method byte[] aqq.b()>
	//   27   58:ldc1            #78  <String "HMAC">
	//   28   60:invokespecial   #81  <Method void SecretKeySpec(byte[], String)>
	//   29   63:astore          4
				int i = ((amp) (atv)).b().b();
	//   30   65:aload_1         
	//   31   66:invokevirtual   #69  <Method amv amp.b()>
	//   32   69:invokevirtual   #19  <Method int amv.b()>
	//   33   72:istore_2        
				switch(akf.a[amn1.ordinal()])
	//*  34   73:getstatic       #24  <Field int[] akf.a>
	//*  35   76:aload_3         
	//*  36   77:invokevirtual   #32  <Method int amn.ordinal()>
	//*  37   80:iaload          
				{
	//*  38   81:tableswitch     1 3: default 108
	//	               1 144
	//	               2 131
	//	               3 118
				default:
					throw new GeneralSecurityException("unknown hash");
	//   39  108:new             #34  <Class GeneralSecurityException>
	//   40  111:dup             
	//   41  112:ldc1            #96  <String "unknown hash">
	//   42  114:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//   43  117:athrow          

				case 3: // '\003'
					return ((Object) (new apq("HMACSHA512", ((java.security.Key) (secretkeyspec)), i)));
	//   44  118:new             #83  <Class apq>
	//   45  121:dup             
	//   46  122:ldc1            #85  <String "HMACSHA512">
	//   47  124:aload           4
	//   48  126:iload_2         
	//   49  127:invokespecial   #88  <Method void apq(String, java.security.Key, int)>
	//   50  130:areturn         

				case 2: // '\002'
					return ((Object) (new apq("HMACSHA256", ((java.security.Key) (secretkeyspec)), i)));
	//   51  131:new             #83  <Class apq>
	//   52  134:dup             
	//   53  135:ldc1            #90  <String "HMACSHA256">
	//   54  137:aload           4
	//   55  139:iload_2         
	//   56  140:invokespecial   #88  <Method void apq(String, java.security.Key, int)>
	//   57  143:areturn         

				case 1: // '\001'
					return ((Object) (new apq("HMACSHA1", ((java.security.Key) (secretkeyspec)), i)));
	//   58  144:new             #83  <Class apq>
	//   59  147:dup             
	//   60  148:ldc1            #92  <String "HMACSHA1">
	//   61  150:aload           4
	//   62  152:iload_2         
	//   63  153:invokespecial   #88  <Method void apq(String, java.security.Key, int)>
	//   64  156:areturn         
				}
			} else
			{
				throw new GeneralSecurityException("key too short");
	//   65  157:new             #34  <Class GeneralSecurityException>
	//   66  160:dup             
	//   67  161:ldc1            #98  <String "key too short">
	//   68  163:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//   69  166:athrow          
			}
		} else
		{
			throw new GeneralSecurityException("expected HmacKey proto");
	//   70  167:new             #34  <Class GeneralSecurityException>
	//   71  170:dup             
	//   72  171:ldc1            #100 <String "expected HmacKey proto">
	//   73  173:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//   74  176:athrow          
		}
	}

	public final String a()
	{
		return "type.googleapis.com/google.crypto.tink.HmacKey";
	//    0    0:ldc1            #112 <String "type.googleapis.com/google.crypto.tink.HmacKey">
	//    1    2:areturn         
	}

	public final int b()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final atv b(aqq aqq1)
	{
		try
		{
			aqq1 = ((aqq) (b(((atv) (ams.a(aqq1))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #118 <Method ams ams.a(aqq)>
	//    3    5:invokevirtual   #121 <Method atv b(atv)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(aqq aqq1)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", ((Throwable) (aqq1)));
	//    8   12:new             #34  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #123 <String "expected serialized HmacKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #105 <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((atv) (aqq1));
	}

	public final atv b(atv atv)
	{
		if(atv instanceof ams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #115 <Class ams>
	//*   2    4:ifeq            72
		{
			atv = ((atv) ((ams)atv));
	//    3    7:aload_1         
	//    4    8:checkcast       #115 <Class ams>
	//    5   11:astore_1        
			if(((ams) (atv)).b() >= 16)
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #124 <Method int ams.b()>
	//*   8   16:bipush          16
	//*   9   18:icmplt          62
			{
				a(((ams) (atv)).a());
	//   10   21:aload_1         
	//   11   22:invokevirtual   #126 <Method amv ams.a()>
	//   12   25:invokestatic    #71  <Method void a(amv)>
				return ((atv) ((ash)((asi) (amp.d().a(0).a(((ams) (atv)).a()).a(aqq.a(aps.a(((ams) (atv)).b()))))).f()));
	//   13   28:invokestatic    #129 <Method amq amp.d()>
	//   14   31:iconst_0        
	//   15   32:invokevirtual   #134 <Method amq amq.a(int)>
	//   16   35:aload_1         
	//   17   36:invokevirtual   #126 <Method amv ams.a()>
	//   18   39:invokevirtual   #137 <Method amq amq.a(amv)>
	//   19   42:aload_1         
	//   20   43:invokevirtual   #124 <Method int ams.b()>
	//   21   46:invokestatic    #142 <Method byte[] aps.a(int)>
	//   22   49:invokestatic    #145 <Method aqq aqq.a(byte[])>
	//   23   52:invokevirtual   #148 <Method amq amq.a(aqq)>
	//   24   55:invokevirtual   #154 <Method atv asi.f()>
	//   25   58:checkcast       #156 <Class ash>
	//   26   61:areturn         
			} else
			{
				throw new GeneralSecurityException("key too short");
	//   27   62:new             #34  <Class GeneralSecurityException>
	//   28   65:dup             
	//   29   66:ldc1            #98  <String "key too short">
	//   30   68:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//   31   71:athrow          
			}
		} else
		{
			throw new GeneralSecurityException("expected HmacKeyFormat proto");
	//   32   72:new             #34  <Class GeneralSecurityException>
	//   33   75:dup             
	//   34   76:ldc1            #158 <String "expected HmacKeyFormat proto">
	//   35   78:invokespecial   #39  <Method void GeneralSecurityException(String)>
	//   36   81:athrow          
		}
	}

	public final amy c(aqq aqq1)
	{
		aqq1 = ((aqq) ((amp)b(aqq1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #161 <Method atv b(aqq)>
	//    3    5:checkcast       #49  <Class amp>
	//    4    8:astore_1        
		return (amy)(ash)((asi) (amy.d().a("type.googleapis.com/google.crypto.tink.HmacKey").a(((aqh) (aqq1)).h()).a(ana.b))).f();
	//    5    9:invokestatic    #166 <Method amz amy.d()>
	//    6   12:ldc1            #112 <String "type.googleapis.com/google.crypto.tink.HmacKey">
	//    7   14:invokevirtual   #171 <Method amz amz.a(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #176 <Method aqq aqh.h()>
	//   10   21:invokevirtual   #179 <Method amz amz.a(aqq)>
	//   11   24:getstatic       #184 <Field ana ana.b>
	//   12   27:invokevirtual   #187 <Method amz amz.a(ana)>
	//   13   30:invokevirtual   #154 <Method atv asi.f()>
	//   14   33:checkcast       #156 <Class ash>
	//   15   36:checkcast       #163 <Class amy>
	//   16   39:areturn         
	}
}
