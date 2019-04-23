// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ait, ajt, ajr, ajq, 
//			ajp, ajo, ajm, aiz

final class ajk
	implements ait
{

	public ajk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final aiz a(String s, String s1, int i)
	{
		String s2 = s1.toLowerCase();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #19  <Method String String.toLowerCase()>
	//    2    4:astore          6
		int j = s2.hashCode();
	//    3    6:aload           6
	//    4    8:invokevirtual   #23  <Method int String.hashCode()>
	//    5   11:istore          4
		byte byte1 = -1;
	//    6   13:iconst_m1       
	//    7   14:istore          5
		if(j == 0x2d9f47 && s2.equals("aead"))
	//*   8   16:iload           4
	//*   9   18:ldc1            #24  <Int 0x2d9f47>
	//*  10   20:icmpeq          26
	//*  11   23:goto            42
	//*  12   26:aload           6
	//*  13   28:ldc1            #26  <String "aead">
	//*  14   30:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  15   33:ifeq            42
			j = 0;
	//   16   36:iconst_0        
	//   17   37:istore          4
		else
	//*  18   39:goto            45
			j = -1;
	//   19   42:iconst_m1       
	//   20   43:istore          4
		if(j == 0)
	//*  21   45:iload           4
	//*  22   47:ifne            396
		{
			byte byte0;
			switch(s.hashCode())
	//*  23   50:aload_1         
	//*  24   51:invokevirtual   #23  <Method int String.hashCode()>
			{
	//*  25   54:lookupswitch    6: default 112
	//	               360753376: 214
	//	               1215885937: 195
	//	               1469984853: 176
	//	               1797113348: 157
	//	               1855890991: 138
	//	               2079211877: 119
			default:
				byte0 = byte1;
	//   26  112:iload           5
	//   27  114:istore          4
				break;

	//*  28  116:goto            230
			case 2079211877: 
				byte0 = byte1;
	//   29  119:iload           5
	//   30  121:istore          4
				if(s.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"))
	//*  31  123:aload_1         
	//*  32  124:ldc1            #32  <String "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey">
	//*  33  126:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  34  129:ifeq            230
					byte0 = 5;
	//   35  132:iconst_5        
	//   36  133:istore          4
				break;

	//*  37  135:goto            230
			case 1855890991: 
				byte0 = byte1;
	//   38  138:iload           5
	//   39  140:istore          4
				if(s.equals("type.googleapis.com/google.crypto.tink.AesGcmKey"))
	//*  40  142:aload_1         
	//*  41  143:ldc1            #34  <String "type.googleapis.com/google.crypto.tink.AesGcmKey">
	//*  42  145:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  43  148:ifeq            230
					byte0 = 2;
	//   44  151:iconst_2        
	//   45  152:istore          4
				break;

	//*  46  154:goto            230
			case 1797113348: 
				byte0 = byte1;
	//   47  157:iload           5
	//   48  159:istore          4
				if(s.equals("type.googleapis.com/google.crypto.tink.AesEaxKey"))
	//*  49  161:aload_1         
	//*  50  162:ldc1            #36  <String "type.googleapis.com/google.crypto.tink.AesEaxKey">
	//*  51  164:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  52  167:ifeq            230
					byte0 = 1;
	//   53  170:iconst_1        
	//   54  171:istore          4
				break;

	//*  55  173:goto            230
			case 1469984853: 
				byte0 = byte1;
	//   56  176:iload           5
	//   57  178:istore          4
				if(s.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey"))
	//*  58  180:aload_1         
	//*  59  181:ldc1            #38  <String "type.googleapis.com/google.crypto.tink.KmsAeadKey">
	//*  60  183:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  61  186:ifeq            230
					byte0 = 4;
	//   62  189:iconst_4        
	//   63  190:istore          4
				break;

	//*  64  192:goto            230
			case 1215885937: 
				byte0 = byte1;
	//   65  195:iload           5
	//   66  197:istore          4
				if(s.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"))
	//*  67  199:aload_1         
	//*  68  200:ldc1            #40  <String "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey">
	//*  69  202:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  70  205:ifeq            230
					byte0 = 0;
	//   71  208:iconst_0        
	//   72  209:istore          4
				break;

	//*  73  211:goto            230
			case 360753376: 
				byte0 = byte1;
	//   74  214:iload           5
	//   75  216:istore          4
				if(s.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"))
	//*  76  218:aload_1         
	//*  77  219:ldc1            #42  <String "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key">
	//*  78  221:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  79  224:ifeq            230
					byte0 = 3;
	//   80  227:iconst_3        
	//   81  228:istore          4
				break;
			}
			switch(byte0)
	//*  82  230:iload           4
			{
	//*  83  232:tableswitch     0 5: default 272
	//	               0 348
	//	               1 337
	//	               2 326
	//	               3 315
	//	               4 304
	//	               5 293
			default:
				throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[] {
					s
				}));
	//   84  272:new             #44  <Class GeneralSecurityException>
	//   85  275:dup             
	//   86  276:ldc1            #46  <String "No support for primitive 'Aead' with key type '%s'.">
	//   87  278:iconst_1        
	//   88  279:anewarray       Object[]
	//   89  282:dup             
	//   90  283:iconst_0        
	//   91  284:aload_1         
	//   92  285:aastore         
	//   93  286:invokestatic    #50  <Method String String.format(String, Object[])>
	//   94  289:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//   95  292:athrow          

			case 5: // '\005'
				s1 = ((String) (new ajt()));
	//   96  293:new             #55  <Class ajt>
	//   97  296:dup             
	//   98  297:invokespecial   #56  <Method void ajt()>
	//   99  300:astore_2        
				break;

	//* 100  301:goto            356
			case 4: // '\004'
				s1 = ((String) (new ajr()));
	//  101  304:new             #58  <Class ajr>
	//  102  307:dup             
	//  103  308:invokespecial   #59  <Method void ajr()>
	//  104  311:astore_2        
				break;

	//* 105  312:goto            356
			case 3: // '\003'
				s1 = ((String) (new ajq()));
	//  106  315:new             #61  <Class ajq>
	//  107  318:dup             
	//  108  319:invokespecial   #62  <Method void ajq()>
	//  109  322:astore_2        
				break;

	//* 110  323:goto            356
			case 2: // '\002'
				s1 = ((String) (new ajp()));
	//  111  326:new             #64  <Class ajp>
	//  112  329:dup             
	//  113  330:invokespecial   #65  <Method void ajp()>
	//  114  333:astore_2        
				break;

	//* 115  334:goto            356
			case 1: // '\001'
				s1 = ((String) (new ajo()));
	//  116  337:new             #67  <Class ajo>
	//  117  340:dup             
	//  118  341:invokespecial   #68  <Method void ajo()>
	//  119  344:astore_2        
				break;

	//* 120  345:goto            356
			case 0: // '\0'
				s1 = ((String) (new ajm()));
	//  121  348:new             #70  <Class ajm>
	//  122  351:dup             
	//  123  352:invokespecial   #71  <Method void ajm()>
	//  124  355:astore_2        
				break;
			}
			if(((aiz) (s1)).b() >= i)
	//* 125  356:aload_2         
	//* 126  357:invokeinterface #76  <Method int aiz.b()>
	//* 127  362:iload_3         
	//* 128  363:icmplt          368
				return ((aiz) (s1));
	//  129  366:aload_2         
	//  130  367:areturn         
			else
				throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[] {
					s, Integer.valueOf(i)
				}));
	//  131  368:new             #44  <Class GeneralSecurityException>
	//  132  371:dup             
	//  133  372:ldc1            #78  <String "No key manager for key type '%s' with version at least %d.">
	//  134  374:iconst_2        
	//  135  375:anewarray       Object[]
	//  136  378:dup             
	//  137  379:iconst_0        
	//  138  380:aload_1         
	//  139  381:aastore         
	//  140  382:dup             
	//  141  383:iconst_1        
	//  142  384:iload_3         
	//  143  385:invokestatic    #84  <Method Integer Integer.valueOf(int)>
	//  144  388:aastore         
	//  145  389:invokestatic    #50  <Method String String.format(String, Object[])>
	//  146  392:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//  147  395:athrow          
		} else
		{
			throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[] {
				s1
			}));
	//  148  396:new             #44  <Class GeneralSecurityException>
	//  149  399:dup             
	//  150  400:ldc1            #86  <String "No support for primitive '%s'.">
	//  151  402:iconst_1        
	//  152  403:anewarray       Object[]
	//  153  406:dup             
	//  154  407:iconst_0        
	//  155  408:aload_2         
	//  156  409:aastore         
	//  157  410:invokestatic    #50  <Method String String.format(String, Object[])>
	//  158  413:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//  159  416:athrow          
		}
	}
}
