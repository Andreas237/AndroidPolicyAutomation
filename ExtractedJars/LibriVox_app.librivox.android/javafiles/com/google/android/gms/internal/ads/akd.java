// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aou, asu, ang, alk, 
//			aji, alh, akm, akj, 
//			aks, ams, asi, ali, 
//			aqq, ash, ais, akp, 
//			akq, amp, amq, akk

final class akd
	implements aou
{

	akd(ang ang1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = ang1.a();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #27  <Method String ang.a()>
	//    5    9:putfield        #29  <Field String a>
		if(a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey"))
	//*   6   12:aload_0         
	//*   7   13:getfield        #29  <Field String a>
	//*   8   16:ldc1            #31  <String "type.googleapis.com/google.crypto.tink.AesGcmKey">
	//*   9   18:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  10   21:ifeq            64
			try
			{
				alk alk1 = alk.a(ang1.b());
	//   11   24:aload_1         
	//   12   25:invokevirtual   #40  <Method aqq ang.b()>
	//   13   28:invokestatic    #45  <Method alk alk.a(aqq)>
	//   14   31:astore_3        
				c = (alh)aji.b(ang1);
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:invokestatic    #50  <Method atv aji.b(ang)>
	//   18   37:checkcast       #52  <Class alh>
	//   19   40:putfield        #54  <Field alh c>
				b = alk1.a();
	//   20   43:aload_0         
	//   21   44:aload_3         
	//   22   45:invokevirtual   #57  <Method int alk.a()>
	//   23   48:putfield        #59  <Field int b>
				return;
	//   24   51:return          
			}
			// Misplaced declaration of an exception variable
			catch(ang ang1)
	//*  25   52:astore_1        
			{
				throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", ((Throwable) (ang1)));
	//   26   53:new             #61  <Class GeneralSecurityException>
	//   27   56:dup             
	//   28   57:ldc1            #63  <String "invalid KeyFormat protobuf, expected AesGcmKeyFormat">
	//   29   59:aload_1         
	//   30   60:invokespecial   #66  <Method void GeneralSecurityException(String, Throwable)>
	//   31   63:athrow          
			}
		if(a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"))
	//*  32   64:aload_0         
	//*  33   65:getfield        #29  <Field String a>
	//*  34   68:ldc1            #68  <String "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey">
	//*  35   70:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  36   73:ifeq            137
			try
			{
				akm akm1 = akm.a(ang1.b());
	//   37   76:aload_1         
	//   38   77:invokevirtual   #40  <Method aqq ang.b()>
	//   39   80:invokestatic    #73  <Method akm akm.a(aqq)>
	//   40   83:astore_3        
				d = (akj)aji.b(ang1);
	//   41   84:aload_0         
	//   42   85:aload_1         
	//   43   86:invokestatic    #50  <Method atv aji.b(ang)>
	//   44   89:checkcast       #75  <Class akj>
	//   45   92:putfield        #77  <Field akj d>
				e = akm1.a().b();
	//   46   95:aload_0         
	//   47   96:aload_3         
	//   48   97:invokevirtual   #80  <Method aks akm.a()>
	//   49  100:invokevirtual   #84  <Method int aks.b()>
	//   50  103:putfield        #86  <Field int e>
				int i = akm1.b().b();
	//   51  106:aload_3         
	//   52  107:invokevirtual   #89  <Method ams akm.b()>
	//   53  110:invokevirtual   #92  <Method int ams.b()>
	//   54  113:istore_2        
				b = e + i;
	//   55  114:aload_0         
	//   56  115:aload_0         
	//   57  116:getfield        #86  <Field int e>
	//   58  119:iload_2         
	//   59  120:iadd            
	//   60  121:putfield        #59  <Field int b>
				return;
	//   61  124:return          
			}
			// Misplaced declaration of an exception variable
			catch(ang ang1)
	//*  62  125:astore_1        
			{
				throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", ((Throwable) (ang1)));
	//   63  126:new             #61  <Class GeneralSecurityException>
	//   64  129:dup             
	//   65  130:ldc1            #63  <String "invalid KeyFormat protobuf, expected AesGcmKeyFormat">
	//   66  132:aload_1         
	//   67  133:invokespecial   #66  <Method void GeneralSecurityException(String, Throwable)>
	//   68  136:athrow          
			}
		ang1 = ((ang) (String.valueOf(((Object) (a)))));
	//   69  137:aload_0         
	//   70  138:getfield        #29  <Field String a>
	//   71  141:invokestatic    #96  <Method String String.valueOf(Object)>
	//   72  144:astore_1        
		if(((String) (ang1)).length() != 0)
	//*  73  145:aload_1         
	//*  74  146:invokevirtual   #99  <Method int String.length()>
	//*  75  149:ifeq            162
			ang1 = ((ang) ("unsupported AEAD DEM key type: ".concat(((String) (ang1)))));
	//   76  152:ldc1            #101 <String "unsupported AEAD DEM key type: ">
	//   77  154:aload_1         
	//   78  155:invokevirtual   #105 <Method String String.concat(String)>
	//   79  158:astore_1        
		else
	//*  80  159:goto            172
			ang1 = ((ang) (new String("unsupported AEAD DEM key type: ")));
	//   81  162:new             #33  <Class String>
	//   82  165:dup             
	//   83  166:ldc1            #101 <String "unsupported AEAD DEM key type: ">
	//   84  168:invokespecial   #108 <Method void String(String)>
	//   85  171:astore_1        
		throw new GeneralSecurityException(((String) (ang1)));
	//   86  172:new             #61  <Class GeneralSecurityException>
	//   87  175:dup             
	//   88  176:aload_1         
	//   89  177:invokespecial   #109 <Method void GeneralSecurityException(String)>
	//   90  180:athrow          
	}

	public final int a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int b>
	//    2    4:ireturn         
	}

	public final ais a(byte abyte0[])
	{
		if(abyte0.length == b)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #59  <Field int b>
	//*   4    6:icmpne          222
		{
			if(a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey"))
	//*   5    9:aload_0         
	//*   6   10:getfield        #29  <Field String a>
	//*   7   13:ldc1            #31  <String "type.googleapis.com/google.crypto.tink.AesGcmKey">
	//*   8   15:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*   9   18:ifeq            68
			{
				abyte0 = ((byte []) ((alh)(ash)((asi) (((ali)((asi) (alh.c())).a(((ash) (c)))).a(aqq.a(abyte0, 0, b)))).f()));
	//   10   21:invokestatic    #114 <Method ali alh.c()>
	//   11   24:aload_0         
	//   12   25:getfield        #54  <Field alh c>
	//   13   28:invokevirtual   #119 <Method asi asi.a(ash)>
	//   14   31:checkcast       #121 <Class ali>
	//   15   34:aload_1         
	//   16   35:iconst_0        
	//   17   36:aload_0         
	//   18   37:getfield        #59  <Field int b>
	//   19   40:invokestatic    #126 <Method aqq aqq.a(byte[], int, int)>
	//   20   43:invokevirtual   #129 <Method ali ali.a(aqq)>
	//   21   46:invokevirtual   #133 <Method atv asi.f()>
	//   22   49:checkcast       #135 <Class ash>
	//   23   52:checkcast       #52  <Class alh>
	//   24   55:astore_1        
				return (ais)aji.b(a, ((atv) (abyte0)));
	//   25   56:aload_0         
	//   26   57:getfield        #29  <Field String a>
	//   27   60:aload_1         
	//   28   61:invokestatic    #138 <Method Object aji.b(String, atv)>
	//   29   64:checkcast       #140 <Class ais>
	//   30   67:areturn         
			}
			if(a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"))
	//*  31   68:aload_0         
	//*  32   69:getfield        #29  <Field String a>
	//*  33   72:ldc1            #68  <String "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey">
	//*  34   74:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  35   77:ifeq            212
			{
				byte abyte1[] = Arrays.copyOfRange(abyte0, 0, e);
	//   36   80:aload_1         
	//   37   81:iconst_0        
	//   38   82:aload_0         
	//   39   83:getfield        #86  <Field int e>
	//   40   86:invokestatic    #146 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   41   89:astore_2        
				abyte0 = Arrays.copyOfRange(abyte0, e, b);
	//   42   90:aload_1         
	//   43   91:aload_0         
	//   44   92:getfield        #86  <Field int e>
	//   45   95:aload_0         
	//   46   96:getfield        #59  <Field int b>
	//   47   99:invokestatic    #146 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   48  102:astore_1        
				akp akp1 = (akp)(ash)((asi) (((akq)((asi) (akp.d())).a(((ash) (d.b())))).a(aqq.a(abyte1)))).f();
	//   49  103:invokestatic    #151 <Method akq akp.d()>
	//   50  106:aload_0         
	//   51  107:getfield        #77  <Field akj d>
	//   52  110:invokevirtual   #154 <Method akp akj.b()>
	//   53  113:invokevirtual   #119 <Method asi asi.a(ash)>
	//   54  116:checkcast       #156 <Class akq>
	//   55  119:aload_2         
	//   56  120:invokestatic    #159 <Method aqq aqq.a(byte[])>
	//   57  123:invokevirtual   #162 <Method akq akq.a(aqq)>
	//   58  126:invokevirtual   #133 <Method atv asi.f()>
	//   59  129:checkcast       #135 <Class ash>
	//   60  132:checkcast       #148 <Class akp>
	//   61  135:astore_2        
				abyte0 = ((byte []) ((amp)(ash)((asi) (((amq)((asi) (amp.d())).a(((ash) (d.c())))).a(aqq.a(abyte0)))).f()));
	//   62  136:invokestatic    #167 <Method amq amp.d()>
	//   63  139:aload_0         
	//   64  140:getfield        #77  <Field akj d>
	//   65  143:invokevirtual   #170 <Method amp akj.c()>
	//   66  146:invokevirtual   #119 <Method asi asi.a(ash)>
	//   67  149:checkcast       #172 <Class amq>
	//   68  152:aload_1         
	//   69  153:invokestatic    #159 <Method aqq aqq.a(byte[])>
	//   70  156:invokevirtual   #175 <Method amq amq.a(aqq)>
	//   71  159:invokevirtual   #133 <Method atv asi.f()>
	//   72  162:checkcast       #135 <Class ash>
	//   73  165:checkcast       #164 <Class amp>
	//   74  168:astore_1        
				abyte0 = ((byte []) ((akj)(ash)((asi) (akj.d().a(d.a()).a(akp1).a(((amp) (abyte0))))).f()));
	//   75  169:invokestatic    #178 <Method akk akj.d()>
	//   76  172:aload_0         
	//   77  173:getfield        #77  <Field akj d>
	//   78  176:invokevirtual   #179 <Method int akj.a()>
	//   79  179:invokevirtual   #184 <Method akk akk.a(int)>
	//   80  182:aload_2         
	//   81  183:invokevirtual   #187 <Method akk akk.a(akp)>
	//   82  186:aload_1         
	//   83  187:invokevirtual   #190 <Method akk akk.a(amp)>
	//   84  190:invokevirtual   #133 <Method atv asi.f()>
	//   85  193:checkcast       #135 <Class ash>
	//   86  196:checkcast       #75  <Class akj>
	//   87  199:astore_1        
				return (ais)aji.b(a, ((atv) (abyte0)));
	//   88  200:aload_0         
	//   89  201:getfield        #29  <Field String a>
	//   90  204:aload_1         
	//   91  205:invokestatic    #138 <Method Object aji.b(String, atv)>
	//   92  208:checkcast       #140 <Class ais>
	//   93  211:areturn         
			} else
			{
				throw new GeneralSecurityException("unknown DEM key type");
	//   94  212:new             #61  <Class GeneralSecurityException>
	//   95  215:dup             
	//   96  216:ldc1            #192 <String "unknown DEM key type">
	//   97  218:invokespecial   #109 <Method void GeneralSecurityException(String)>
	//   98  221:athrow          
			}
		} else
		{
			throw new GeneralSecurityException("Symmetric key has incorrect length");
	//   99  222:new             #61  <Class GeneralSecurityException>
	//  100  225:dup             
	//  101  226:ldc1            #194 <String "Symmetric key has incorrect length">
	//  102  228:invokespecial   #109 <Method void GeneralSecurityException(String)>
	//  103  231:athrow          
		}
	}

	private final String a;
	private final int b;
	private alh c;
	private akj d;
	private int e;
}
