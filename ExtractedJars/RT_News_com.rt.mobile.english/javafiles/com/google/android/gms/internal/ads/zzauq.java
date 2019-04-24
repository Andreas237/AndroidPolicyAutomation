// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaua, zzauz, zzaux, zzauw, 
//			zzauv, zzauu, zzaus, zzaug

final class zzauq
	implements zzaua
{

	public zzauq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final zzaug zzb(String s, String s1, int i)
		throws GeneralSecurityException
	{
		String s2 = s1.toLowerCase();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #22  <Method String String.toLowerCase()>
	//    2    4:astore          6
		int j = s2.hashCode();
	//    3    6:aload           6
	//    4    8:invokevirtual   #26  <Method int String.hashCode()>
	//    5   11:istore          4
		byte byte0 = -1;
	//    6   13:iconst_m1       
	//    7   14:istore          5
		if(j == 0x2d9f47 && s2.equals("aead"))
	//*   8   16:iload           4
	//*   9   18:ldc1            #27  <Int 0x2d9f47>
	//*  10   20:icmpeq          26
	//*  11   23:goto            42
	//*  12   26:aload           6
	//*  13   28:ldc1            #29  <String "aead">
	//*  14   30:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  15   33:ifeq            42
			j = 0;
	//   16   36:iconst_0        
	//   17   37:istore          4
		else
	//*  18   39:goto            45
			j = -1;
	//   19   42:iconst_m1       
	//   20   43:istore          4
		if(j != 0)
	//*  21   45:iload           4
	//*  22   47:ifeq            71
			throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[] {
				s1
			}));
	//   23   50:new             #16  <Class GeneralSecurityException>
	//   24   53:dup             
	//   25   54:ldc1            #35  <String "No support for primitive '%s'.">
	//   26   56:iconst_1        
	//   27   57:anewarray       Object[]
	//   28   60:dup             
	//   29   61:iconst_0        
	//   30   62:aload_2         
	//   31   63:aastore         
	//   32   64:invokestatic    #39  <Method String String.format(String, Object[])>
	//   33   67:invokespecial   #42  <Method void GeneralSecurityException(String)>
	//   34   70:athrow          
		switch(s.hashCode())
	//*  35   71:aload_1         
	//*  36   72:invokevirtual   #26  <Method int String.hashCode()>
		{
	//*  37   75:lookupswitch    6: default 132
	//	               360753376: 234
	//	               1215885937: 215
	//	               1469984853: 196
	//	               1797113348: 177
	//	               1855890991: 158
	//	               2079211877: 139
		default:
			j = ((int) (byte0));
	//   38  132:iload           5
	//   39  134:istore          4
			break;

	//*  40  136:goto            250
		case 2079211877: 
			j = ((int) (byte0));
	//   41  139:iload           5
	//   42  141:istore          4
			if(s.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"))
	//*  43  143:aload_1         
	//*  44  144:ldc1            #44  <String "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey">
	//*  45  146:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  46  149:ifeq            250
				j = 5;
	//   47  152:iconst_5        
	//   48  153:istore          4
			break;

	//*  49  155:goto            250
		case 1855890991: 
			j = ((int) (byte0));
	//   50  158:iload           5
	//   51  160:istore          4
			if(s.equals("type.googleapis.com/google.crypto.tink.AesGcmKey"))
	//*  52  162:aload_1         
	//*  53  163:ldc1            #46  <String "type.googleapis.com/google.crypto.tink.AesGcmKey">
	//*  54  165:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  55  168:ifeq            250
				j = 2;
	//   56  171:iconst_2        
	//   57  172:istore          4
			break;

	//*  58  174:goto            250
		case 1797113348: 
			j = ((int) (byte0));
	//   59  177:iload           5
	//   60  179:istore          4
			if(s.equals("type.googleapis.com/google.crypto.tink.AesEaxKey"))
	//*  61  181:aload_1         
	//*  62  182:ldc1            #48  <String "type.googleapis.com/google.crypto.tink.AesEaxKey">
	//*  63  184:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  64  187:ifeq            250
				j = 1;
	//   65  190:iconst_1        
	//   66  191:istore          4
			break;

	//*  67  193:goto            250
		case 1469984853: 
			j = ((int) (byte0));
	//   68  196:iload           5
	//   69  198:istore          4
			if(s.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey"))
	//*  70  200:aload_1         
	//*  71  201:ldc1            #50  <String "type.googleapis.com/google.crypto.tink.KmsAeadKey">
	//*  72  203:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  73  206:ifeq            250
				j = 4;
	//   74  209:iconst_4        
	//   75  210:istore          4
			break;

	//*  76  212:goto            250
		case 1215885937: 
			j = ((int) (byte0));
	//   77  215:iload           5
	//   78  217:istore          4
			if(s.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"))
	//*  79  219:aload_1         
	//*  80  220:ldc1            #52  <String "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey">
	//*  81  222:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  82  225:ifeq            250
				j = 0;
	//   83  228:iconst_0        
	//   84  229:istore          4
			break;

	//*  85  231:goto            250
		case 360753376: 
			j = ((int) (byte0));
	//   86  234:iload           5
	//   87  236:istore          4
			if(s.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"))
	//*  88  238:aload_1         
	//*  89  239:ldc1            #54  <String "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key">
	//*  90  241:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  91  244:ifeq            250
				j = 3;
	//   92  247:iconst_3        
	//   93  248:istore          4
			break;
		}
		switch(j)
	//*  94  250:iload           4
		{
	//*  95  252:tableswitch     0 5: default 292
	//	               0 368
	//	               1 357
	//	               2 346
	//	               3 335
	//	               4 324
	//	               5 313
		default:
			throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[] {
				s
			}));
	//   96  292:new             #16  <Class GeneralSecurityException>
	//   97  295:dup             
	//   98  296:ldc1            #56  <String "No support for primitive 'Aead' with key type '%s'.">
	//   99  298:iconst_1        
	//  100  299:anewarray       Object[]
	//  101  302:dup             
	//  102  303:iconst_0        
	//  103  304:aload_1         
	//  104  305:aastore         
	//  105  306:invokestatic    #39  <Method String String.format(String, Object[])>
	//  106  309:invokespecial   #42  <Method void GeneralSecurityException(String)>
	//  107  312:athrow          

		case 5: // '\005'
			s1 = ((String) (new zzauz()));
	//  108  313:new             #58  <Class zzauz>
	//  109  316:dup             
	//  110  317:invokespecial   #59  <Method void zzauz()>
	//  111  320:astore_2        
			break;

	//* 112  321:goto            376
		case 4: // '\004'
			s1 = ((String) (new zzaux()));
	//  113  324:new             #61  <Class zzaux>
	//  114  327:dup             
	//  115  328:invokespecial   #62  <Method void zzaux()>
	//  116  331:astore_2        
			break;

	//* 117  332:goto            376
		case 3: // '\003'
			s1 = ((String) (new zzauw()));
	//  118  335:new             #64  <Class zzauw>
	//  119  338:dup             
	//  120  339:invokespecial   #65  <Method void zzauw()>
	//  121  342:astore_2        
			break;

	//* 122  343:goto            376
		case 2: // '\002'
			s1 = ((String) (new zzauv()));
	//  123  346:new             #67  <Class zzauv>
	//  124  349:dup             
	//  125  350:invokespecial   #68  <Method void zzauv()>
	//  126  353:astore_2        
			break;

	//* 127  354:goto            376
		case 1: // '\001'
			s1 = ((String) (new zzauu()));
	//  128  357:new             #70  <Class zzauu>
	//  129  360:dup             
	//  130  361:invokespecial   #71  <Method void zzauu()>
	//  131  364:astore_2        
			break;

	//* 132  365:goto            376
		case 0: // '\0'
			s1 = ((String) (new zzaus()));
	//  133  368:new             #73  <Class zzaus>
	//  134  371:dup             
	//  135  372:invokespecial   #74  <Method void zzaus()>
	//  136  375:astore_2        
			break;
		}
		if(((zzaug) (s1)).getVersion() < i)
	//* 137  376:aload_2         
	//* 138  377:invokeinterface #79  <Method int zzaug.getVersion()>
	//* 139  382:iload_3         
	//* 140  383:icmpge          414
			throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[] {
				s, Integer.valueOf(i)
			}));
	//  141  386:new             #16  <Class GeneralSecurityException>
	//  142  389:dup             
	//  143  390:ldc1            #81  <String "No key manager for key type '%s' with version at least %d.">
	//  144  392:iconst_2        
	//  145  393:anewarray       Object[]
	//  146  396:dup             
	//  147  397:iconst_0        
	//  148  398:aload_1         
	//  149  399:aastore         
	//  150  400:dup             
	//  151  401:iconst_1        
	//  152  402:iload_3         
	//  153  403:invokestatic    #87  <Method Integer Integer.valueOf(int)>
	//  154  406:aastore         
	//  155  407:invokestatic    #39  <Method String String.format(String, Object[])>
	//  156  410:invokespecial   #42  <Method void GeneralSecurityException(String)>
	//  157  413:athrow          
		else
			return ((zzaug) (s1));
	//  158  414:aload_2         
	//  159  415:areturn         
	}
}
